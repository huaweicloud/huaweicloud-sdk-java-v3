/*
 * Copyright 2020 Huawei Technologies Co.,Ltd.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huaweicloud.sdk.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.exception.SdkErrorMessage;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.exception.ServerResponseException;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.core.http.Field;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

public class HcClient implements CustomizationConfigure {
    private static final Logger logger = LoggerFactory.getLogger(HcClient.class);

    private HttpClient httpClient;
    private String endpoint;
    private ICredential credential;

    HcClient withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    HcClient withCredential(ICredential credential) {
        this.credential = credential;
        return this;
    }

    HcClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public <ReqT, ResT> ResT syncInvokeHttp(ReqT request, HttpRequestDef<ReqT, ResT> reqDef)
        throws ServiceResponseException {

        HttpRequest httpRequest = buildRequest(request, reqDef);

        //鉴权，处理project_id，domain_id信息
        if (Objects.nonNull(credential)) {
            credential.processAuthRequest(httpRequest);
        }

        HttpResponse httpResponse = httpClient.syncInvokeHttp(httpRequest);


        if (httpResponse.getStatusCode() >= 300) {
            throw ServiceResponseException
                .mapException(httpResponse.getStatusCode(), extractErrorMessage(httpResponse));
        }


        return extractResponse(httpResponse, reqDef);
    }

    private SdkErrorMessage extractErrorMessage(HttpResponse httpResponse) {
        String strBody = httpResponse.getBodyAsString();
        SdkErrorMessage sdkErrorMessage = new SdkErrorMessage(httpResponse.getStatusCode());
        if (Objects.isNull(strBody)) {
            return sdkErrorMessage;
        }
        try {
            Map errResult = JsonUtils.toObject(strBody, Map.class);
            if (Objects.nonNull(errResult)) {
                sdkErrorMessage
                    .withErrorCode(errResult.containsKey("error_code") ? errResult.get("error_code").toString()
                        : errResult.containsKey("code") ? errResult.get("code").toString() : null)
                    .withErrorMsg(errResult.containsKey("error_msg") ? errResult.get("error_msg").toString()
                        : errResult.containsKey("message") ? errResult.get("message").toString() : null)
                    .withRequestId(errResult.containsKey("request_id") ? errResult.get("request_id").toString() : null);
                if (Objects.isNull(sdkErrorMessage.getErrorCode()) || Objects.isNull(sdkErrorMessage.getErrorMsg())) {
                    errResult.forEach((key, value) -> {
                        if (value instanceof Map) {
                            Map valueMap = ((Map) value);
                            if (Objects.isNull(sdkErrorMessage.getErrorCode()) && valueMap.containsKey("code")) {
                                sdkErrorMessage.setErrorCode(valueMap.get("code").toString());
                            }
                            if (Objects.isNull(sdkErrorMessage.getErrorMsg()) && valueMap.containsKey("message")) {
                                sdkErrorMessage.setErrorMsg(valueMap.get("message").toString());
                            }
                        }
                    });
                }
                if (Objects.isNull(sdkErrorMessage.getErrorMsg())) {
                    sdkErrorMessage.setErrorMsg(strBody);
                }
            }
            if (Objects.isNull(sdkErrorMessage.getRequestId())
                && Objects.nonNull(httpResponse.getHeader("X-Request-Id"))) {
                sdkErrorMessage.setRequestId(httpResponse.getHeader("X-Request-Id"));
            }
        } catch (SdkException e) {
            sdkErrorMessage.setErrorMsg(httpResponse.getBodyAsString());
        }
        // todo 自定义
        return sdkErrorMessage;
    }

    private <ReqT, ResT> HttpRequest buildRequest(ReqT request, HttpRequestDef<ReqT, ResT> reqDef) {
        HttpRequest.HttpRequestBuilder httpRequestBuilder = HttpRequest.newBuilder();
        httpRequestBuilder.withMethod(reqDef.getMethod())
            .withContentType(reqDef.getContentType())
            .withEndpoint(this.endpoint)
            .withPath(reqDef.getUri());

        for (Field<ReqT, ?> field : reqDef.getRequestFields()) {
            Optional<?> reqValueOption = field.readValue(request);
            if (reqValueOption.isPresent()) {
                Object reqValue = reqValueOption.get();
                if (field.getLocation() == LocationType.Header) {
                    httpRequestBuilder.addHeader(field.getName(), reqValue);
                } else if (field.getLocation() == LocationType.Query) {
                    if (reqValue instanceof Collection) {
                        httpRequestBuilder.addQueryParam(field.getName(), (List<Object>) reqValue);
                    } else {
                        httpRequestBuilder.addQueryParam(field.getName(), Arrays.asList(reqValue.toString()));
                    }
                } else if (field.getLocation() == LocationType.Path) {
                    httpRequestBuilder.addPathParam(field.getName(), reqValue.toString());
                } else if (field.getLocation() == LocationType.Body) {
                    httpRequestBuilder.withBodyAsString(JsonUtils.toJSON(reqValue));
                }
            }
        }
        httpRequestBuilder.addHeader("User-Agent", "huaweicloud-sdk-java/3.0");

        return httpRequestBuilder.build();
    }

    private <ReqT, ResT> ResT extractResponse(HttpResponse httpResponse, HttpRequestDef<ReqT, ResT> reqDef) {

        try {
            String stringResult = httpResponse.getBodyAsString();
            ResT resT = null;
            if (!reqDef.hasResponseField("body")) {
                resT = JsonUtils.toObjectIgnoreUnknown(stringResult, reqDef.getResponseType());
            } else {
                resT = reqDef.getResponseType().newInstance();
                Field<ResT, ?> responseField = reqDef.getResponseField("body");
                Object obj;
                if (responseField.getFieldType().isAssignableFrom(List.class)) {
                    obj = JsonUtils.toListObject(stringResult, responseField.getInnerContainerType());
                } else if (responseField.getFieldType().isAssignableFrom(Map.class)) {
                    obj = JsonUtils.toMapObject(stringResult, responseField.getInnerContainerType());
                } else {
                    obj = stringResult;
                }
                responseField.writeValueSafe(resT, obj, responseField.getFieldType());
            }
            if (Objects.nonNull(resT) && resT instanceof SdkResponse) {
                SdkResponse sdkResponse = (SdkResponse) resT;
                sdkResponse.setHttpStatusCode(httpResponse.getStatusCode());
            }
            return resT;
        } catch (InstantiationException e) {
            logger.error("Can not create response instance", e);
            return null;
        } catch (IllegalAccessException e) {
            logger.error("Can not create response instance", e);
            return null;
        } catch (SdkException e) {
            logger.error("can not parse json result to response object", e);
            throw new ServerResponseException(httpResponse.getStatusCode(), null, httpResponse.getBodyAsString(),
                httpResponse.getHeader("X-Request-Id"));
        }
    }

    @Override
    public void configJson(Consumer<ObjectMapper> func) {
        func.accept(JsonUtils.getDefaultMapper());
    }
}
