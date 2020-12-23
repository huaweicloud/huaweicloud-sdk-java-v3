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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Stack;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.exception.SdkErrorMessage;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.exception.ServerResponseException;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.core.http.Field;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.impl.DefaultHttpClient;
import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.core.utils.JsonUtils;

public class HcClient implements CustomizationConfigure {
    private static final Logger logger = LoggerFactory.getLogger(HcClient.class);

    public static class AccessLog {
        private static final Logger logger = LoggerFactory.getLogger("HuaweiCloud-SDK-Access");

        public static Logger get() {
            return logger;
        }
    }

    private static final int STATUS_CODE_WITH_RESPONSE_ERROR = 400;

    private HttpClient httpClient;
    private Region region;
    private String endpoint;
    private ICredential credential;
    private HttpConfig httpConfig;

    HcClient withRegion(Region region) {
        this.region = region;
        return this;
    }

    HcClient withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    HcClient withCredential(ICredential credential) {
        this.credential = credential;
        return this;
    }

    HcClient(HttpConfig httpConfig) {
        this.httpConfig = httpConfig;
        httpClient = new DefaultHttpClient(this.httpConfig);
    }

    public HttpConfig getHttpConfig() {
        return httpConfig;
    }

    public <ReqT, ResT> ResT syncInvokeHttp(ReqT request, HttpRequestDef<ReqT, ResT> reqDef)
        throws ServiceResponseException {

        HttpRequest httpRequest = buildRequest(request, reqDef);

        if (Objects.nonNull(region)) {
            try {
                credential = credential.processAuthParams(this.httpClient, region.getId()).get();
            } catch (InterruptedException | ExecutionException e) {
                throw new SdkException(e);
            }
        }

        // 鉴权，处理project_id，domain_id信息
        if (Objects.nonNull(credential)) {
            try {
                httpRequest = credential.processAuthRequest(httpRequest, this.httpClient).get();
            } catch (InterruptedException | ExecutionException e) {
                throw new SdkException(e);
            }
        }

        HttpResponse httpResponse = httpClient.syncInvokeHttp(httpRequest);
        printAccessLog(httpRequest, httpResponse);

        if (httpResponse.getStatusCode() >= STATUS_CODE_WITH_RESPONSE_ERROR) {
            logger.error("ServiceResponseException occurred. Host: {} Uri: {} ServiceResponseException: {}",
                httpRequest.getUrl().getHost(), httpRequest.getUrl(), extractErrorMessage(httpResponse));

            throw ServiceResponseException.mapException(httpResponse.getStatusCode(),
                extractErrorMessage(httpResponse));
        }

        return extractResponse(httpResponse, reqDef);
    }

    public <ReqT, ResT> CompletableFuture<ResT> asyncInvokeHttp(ReqT request, HttpRequestDef<ReqT, ResT> reqDef) {

        HttpRequest httpRequest = buildRequest(request, reqDef);
        CompletableFuture<HttpRequest> validHttpRequestStage = CompletableFuture.supplyAsync(() -> httpRequest);
        if (Objects.nonNull(credential)) {
            validHttpRequestStage = credential.processAuthRequest(httpRequest, this.httpClient);
        }
        return validHttpRequestStage
            .thenCompose(validHttpRequest -> httpClient.asyncInvokeHttp(validHttpRequest).thenApply(httpResponse -> {
                printAccessLog(validHttpRequest, httpResponse);
                if (httpResponse.getStatusCode() >= STATUS_CODE_WITH_RESPONSE_ERROR) {
                    logger.error("ServiceResponseException occurred. Host: {} Uri: {} ServiceResponseException: {}",
                        validHttpRequest.getUrl().getHost(), validHttpRequest.getUrl(),
                        extractErrorMessage(httpResponse));
                    throw ServiceResponseException.mapException(httpResponse.getStatusCode(),
                        extractErrorMessage(httpResponse));
                }
                ResT response = extractResponse(httpResponse, reqDef);
                return response;
            }));
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
                    .withErrorCode(
                        errResult.containsKey(Constants.ERROR_CODE) ? errResult.get(Constants.ERROR_CODE).toString()
                            : errResult.containsKey(Constants.CODE) ? errResult.get(Constants.CODE).toString() : null)
                    .withErrorMsg(
                        errResult.containsKey(Constants.ERROR_MSG) ? errResult.get(Constants.ERROR_MSG).toString()
                            : errResult.containsKey(Constants.MESSAGE) ? errResult.get(Constants.MESSAGE).toString()
                            : null)
                    .withRequestId(
                        errResult.containsKey(Constants.REQUEST_ID) ? errResult.get(Constants.REQUEST_ID).toString()
                            : null);
                if (Objects.isNull(sdkErrorMessage.getErrorCode()) || Objects.isNull(sdkErrorMessage.getErrorMsg())) {
                    errResult.forEach((key, value) -> {
                        if (value instanceof Map) {
                            Map valueMap = ((Map) value);
                            if (Objects.isNull(sdkErrorMessage.getErrorCode())
                                && valueMap.containsKey(Constants.CODE)) {
                                sdkErrorMessage.setErrorCode(valueMap.get(Constants.CODE).toString());
                            }
                            if (Objects.isNull(sdkErrorMessage.getErrorMsg())
                                && valueMap.containsKey(Constants.MESSAGE)) {
                                sdkErrorMessage.setErrorMsg(valueMap.get(Constants.MESSAGE).toString());
                            }
                        }
                    });
                }
                if (Objects.isNull(sdkErrorMessage.getErrorMsg())) {
                    sdkErrorMessage.setErrorMsg(strBody);
                }
            }
            if (Objects.isNull(sdkErrorMessage.getRequestId())
                && Objects.nonNull(httpResponse.getHeader(Constants.X_REQUEST_ID))) {
                sdkErrorMessage.setRequestId(httpResponse.getHeader(Constants.X_REQUEST_ID));
            }
        } catch (SdkException e) {
            sdkErrorMessage.setErrorMsg(httpResponse.getBodyAsString());
        }
        // todo 自定义
        return sdkErrorMessage;
    }

    private <ReqT, ResT> HttpRequest buildRequest(ReqT request, HttpRequestDef<ReqT, ResT> reqDef) {
        if (Objects.nonNull(region)) {
            this.endpoint = region.getEndpoint();
        }

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
                    httpRequestBuilder.addHeader(field.getName(), reqValue.toString());
                } else if (field.getLocation() == LocationType.Query) {
                    buildQueryParams(httpRequestBuilder, field.getName(), reqValue);
                } else if (field.getLocation() == LocationType.Path) {
                    httpRequestBuilder.addPathParam(field.getName(), reqValue.toString());
                } else if (field.getLocation() == LocationType.Body) {
                    httpRequestBuilder.withBodyAsString(JsonUtils.toJSON(reqValue));
                }
            }
        }
        //upload
        if (request instanceof SdkStreamRequest) {
            httpRequestBuilder.withBody(((SdkStreamRequest) request).getBody());
        }

        httpRequestBuilder.addHeader(Constants.USER_AGENT, "huaweicloud-usdk-java/3.0");

        HttpRequest httpRequest = httpRequestBuilder.build();

        return httpRequest;
    }

    private void buildQueryParams(HttpRequest.HttpRequestBuilder httpRequestBuilder, String fieldName,
                                  Object reqValue) {
        if (reqValue instanceof Collection) {
            httpRequestBuilder.addQueryParam(fieldName, buildCollectionQueryParams(reqValue));
        } else if (reqValue instanceof Map) {
            Map<String, List<String>> params = buildMapQueryParamsLoop(fieldName, (Map) reqValue);
            for (Map.Entry entry : params.entrySet()) {
                httpRequestBuilder.addQueryParam((String) entry.getKey(), (List<String>) entry.getValue());
            }
        } else {
            httpRequestBuilder.addQueryParam(fieldName, buildStringQueryParams(reqValue));
        }
    }

    private List<String> buildStringQueryParams(Object reqValue) {
        return Arrays.asList(reqValue.toString());
    }

    private List<String> buildCollectionQueryParams(Object reqValue) {
        return ((List<Object>) reqValue).stream().map(Object::toString).collect(Collectors.toList());
    }

    private Map<String, List<String>> buildMapQueryParamsLoop(String key, Map reqValue) {
        Map<String, List<String>> result = new HashMap<>();
        Stack<Map<String, List<String>>> stack = new Stack<>();

        reqValue.forEach((k, v) -> stack.push(buildMapQueryParams(key, k.toString(), v)));

        while (!stack.isEmpty()) {
            Map<String, List<String>> temp = stack.pop();
            temp.forEach(result::put);
        }

        return result;
    }

    private Map<String, List<String>> buildMapQueryParams(String key, String entryKey, Object entryValue) {
        Map<String, List<String>> res = new HashMap<>();
        if (entryValue instanceof Map) {
            ((Map<?, ?>) entryValue).forEach((k, v) -> {
                res.putAll(buildMapQueryParams(key + "[" + entryKey + "]", k.toString(), v));
            });
        } else if (entryValue instanceof Collection) {
            res.put(key + "[" + entryKey + "]", buildCollectionQueryParams(entryValue));
        } else {
            res.put(key + "[" + entryKey + "]", buildStringQueryParams(entryValue));
        }
        return res;
    }

    private <ReqT, ResT> ResT extractResponse(HttpResponse httpResponse, HttpRequestDef<ReqT, ResT> reqDef) {

        try {
            String stringResult = httpResponse.getBodyAsString();
            ResT resT;
            if (Objects.nonNull(httpResponse.getContentType())
                && httpResponse.getContentType().equals(Constants.MEDIATYPE.APPLICATION_OCTET_STREAM)) {
                resT = reqDef.getResponseType().newInstance();
                if (resT instanceof SdkStreamResponse) {
                    ((SdkStreamResponse) resT).setBody(httpResponse.getBody());
                }
            } else {
                if (!reqDef.hasResponseField(Constants.BODY)) {
                    resT = JsonUtils.toObjectIgnoreUnknown(stringResult, reqDef.getResponseType());
                } else {
                    resT = reqDef.getResponseType().newInstance();
                    Field<ResT, ?> responseField = reqDef.getResponseField(Constants.BODY);
                    Object obj = responseToObject(stringResult, responseField);
                    responseField.writeValueSafe(resT, obj, responseField.getFieldType());
                }
            }
            if (Objects.isNull(resT)) {
                resT = reqDef.getResponseType().newInstance();
            }

            ResT finalResT = resT;
            reqDef.getResponseFields().forEach(resTField -> {
                if (resTField.getLocation() == LocationType.Header) {
                    fillHeaderField(httpResponse, finalResT, resTField);
                }
            });

            if (finalResT instanceof SdkResponse) {
                SdkResponse sdkResponse = (SdkResponse) finalResT;
                sdkResponse.setHttpStatusCode(httpResponse.getStatusCode());
            }

            return finalResT;
        } catch (InstantiationException | IllegalAccessException e) {
            logger.error("Can not create response instance", e);
            return null;
        } catch (SdkException e) {
            logger.error("can not parse json result to response object", e);
            throw new ServerResponseException(httpResponse.getStatusCode(), null, httpResponse.getBodyAsString(),
                httpResponse.getHeader("X-Request-Id"));
        }
    }

    public <ResT> Object responseToObject(String respBody, Field<ResT, ?> responseField) {
        Object obj;
        if (responseField.getFieldType().isAssignableFrom(List.class)) {
            obj = JsonUtils.toListObject(respBody, responseField.getInnerContainerType());
        } else if (responseField.getFieldType().isAssignableFrom(Map.class)) {
            obj = JsonUtils.toMapObject(respBody, responseField.getInnerContainerType());
        } else {
            obj = respBody;
        }
        return obj;
    }

    private <ResT> void fillHeaderField(HttpResponse httpResponse, ResT wrapperResponse, Field<ResT, ?> field) {
        List<String> infos = httpResponse.getHeaders().get(field.getName());
        if (Objects.nonNull(infos) && infos.size() > 0) {
            if (field.getFieldType().isAssignableFrom(List.class)) {
                field.writeValueSafe(wrapperResponse, infos, List.class);
            } else {
                field.writeValueSafe(wrapperResponse, infos.get(0), String.class);
                if (infos.size() > 1) {
                    logger.error("field {} passed list {}, but configured as single value", field.getName(),
                        infos.stream().collect(Collectors.joining(",")));
                }
            }
        } else {
            logger.warn("field {} in header read response value is empty", field.getName());
        }
    }

    @Override
    public void configJson(Consumer<ObjectMapper> func) {
        func.accept(JsonUtils.getDefaultMapper());
    }

    public void printAccessLog(HttpRequest httpRequest, HttpResponse httpResponse) {
        String requestId = Objects.isNull(httpResponse.getHeader(Constants.X_REQUEST_ID)) ? ""
            : httpResponse.getHeader(Constants.X_REQUEST_ID);
        AccessLog.get()
            .info("\"{} {}\" {} {} {}", httpRequest.getMethod(), httpRequest.getUrl(), httpResponse.getStatusCode(),
                httpResponse.getContentLength(), requestId);
    }

}
