/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
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
import com.huaweicloud.sdk.core.exception.HostUnreachableException;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.exception.ServerResponseException;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.core.exchange.ApiReference;
import com.huaweicloud.sdk.core.exchange.SdkExchange;
import com.huaweicloud.sdk.core.exchange.SdkExchangeCache;
import com.huaweicloud.sdk.core.http.Field;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;
import com.huaweicloud.sdk.core.impl.DefaultHttpClient;
import com.huaweicloud.sdk.core.utils.ExceptionUtils;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import com.huaweicloud.sdk.core.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Stack;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static com.huaweicloud.sdk.core.Constants.SDK_EXCHANGE;

/**
 * @author HuaweiCloud_SDK
 */
public class HcClient implements CustomizationConfigure {
    private static final Logger logger = LoggerFactory.getLogger(HcClient.class);

    public static class AccessLog {
        private static final Logger logger = LoggerFactory.getLogger("HuaweiCloud-SDK-Access");

        public static Logger get() {
            return logger;
        }
    }

    private final HttpClient httpClient;

    private final AtomicInteger endpointIndex = new AtomicInteger(0);

    private List<String> endpoints;

    private ICredential credential;

    private final HttpConfig httpConfig;

    private Map<String, String> extraHeader;

    private HcClient(HttpConfig httpConfig, HttpClient httpClient, ICredential credential, List<String> endpoints) {
        this.httpConfig = httpConfig;
        this.httpClient = httpClient;
        this.credential = credential;
        this.endpoints = endpoints;
    }

    HcClient(HttpConfig httpConfig, HttpClient httpClient) {
        this.httpConfig = httpConfig;
        this.httpClient = httpClient;
    }

    public HcClient(HttpConfig httpConfig) {
        this.httpConfig = httpConfig;
        httpClient = new DefaultHttpClient(this.httpConfig);
    }

    public HcClient withEndpoints(List<String> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public HcClient withCredential(ICredential credential) {
        this.credential = credential;
        return this;
    }

    public ICredential getCredential() {
        return this.credential;
    }

    public HttpConfig getHttpConfig() {
        return httpConfig;
    }

    public HcClient overrideEndpoints(List<String> endpoints) {
        return new HcClient(this.httpConfig, this.httpClient, this.credential, endpoints);
    }

    public HcClient overrideCredential(ICredential credential) {

        return new HcClient(this.httpConfig, this.httpClient, credential, this.endpoints);
    }

    public HcClient preInvoke(Map<String, String> extraHeader) {
        HcClient client = new HcClient(this.httpConfig, this.httpClient, this.credential, this.endpoints);
        client.extraHeader = extraHeader;
        return client;
    }

    public <ReqT, ResT> ResT syncInvokeHttp(ReqT request, HttpRequestDef<ReqT, ResT> reqDef)
            throws ServiceResponseException {
        return syncInvokeHttp(request, reqDef, new SdkExchange());
    }

    public <ReqT, ResT> ResT syncInvokeHttp(ReqT request, HttpRequestDef<ReqT, ResT> reqDef, SdkExchange exchange)
            throws ServiceResponseException {

        if (Objects.isNull(exchange)) {
            throw new IllegalArgumentException("SdkExchange is null");
        }

        exchange.setApiReference(new ApiReference().withName(reqDef.getName())
                .withMethod(reqDef.getMethod().toString())
                .withUri(reqDef.getUri()));

        String exchangeId = SdkExchangeCache.putExchange(exchange);
        try {
            HttpRequest httpRequest;
            HttpResponse httpResponse;
            while (true) {
                try {
                    httpRequest = buildRequest(request, reqDef);
                    if (StringUtils.isEmpty(httpRequest.getHeader(Constants.AUTHORIZATION))
                            && Objects.nonNull(credential)) {
                        // 鉴权，处理project_id，domain_id信息
                        httpRequest = credential.syncProcessAuthRequest(httpRequest, httpClient);
                    }
                    httpRequest = httpRequest.builder().addHeader(SDK_EXCHANGE, exchangeId).build();

                    httpResponse = httpClient.syncInvokeHttp(httpRequest);
                    break;
                } catch (HostUnreachableException unreachableException) {
                    if (endpointIndex.intValue() < endpoints.size() - 1) {
                        endpointIndex.incrementAndGet();
                    } else {
                        endpointIndex.set(0);
                        throw unreachableException;
                    }
                }
            }
            printAccessLog(httpRequest, httpResponse, exchange);
            handleException(httpRequest, httpResponse);
            return extractResponse(httpResponse, reqDef);
        } finally {
            SdkExchangeCache.removeExchange(exchangeId);
        }
    }

    public <ReqT, ResT> CompletableFuture<ResT> asyncInvokeHttp(ReqT request, HttpRequestDef<ReqT, ResT> reqDef) {
        return asyncInvokeHttp(request, reqDef, new SdkExchange());
    }

    public <ReqT, ResT> CompletableFuture<ResT> asyncInvokeHttp(ReqT request, HttpRequestDef<ReqT, ResT> reqDef,
                                                                SdkExchange exchange) {

        if (Objects.isNull(exchange)) {
            return CompletableFuture.supplyAsync(() -> {
                throw new IllegalArgumentException("SdkExchange is null");
            }, httpConfig.getExecutorService());
        }
        exchange.setApiReference(new ApiReference().withName(reqDef.getName())
                .withMethod(reqDef.getMethod().toString())
                .withUri(reqDef.getUri()));
        AtomicReference<String> exchangeIdRef = new AtomicReference<>();
        // SdkException could be thrown if the value of NON_NULL_NON_EMPTY field is null
        HttpRequest httpRequest;
        try {
            httpRequest = buildRequest(request, reqDef);
        } catch (SdkException e) {
            CompletableFuture<ResT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }

        HttpRequest finalHttpRequest = httpRequest;
        CompletableFuture<HttpRequest> validHttpRequestStage = CompletableFuture.supplyAsync(
                () -> finalHttpRequest, httpConfig.getExecutorService());
        if (StringUtils.isEmpty(httpRequest.getHeader(Constants.AUTHORIZATION)) && Objects.nonNull(credential)) {
            validHttpRequestStage = credential.processAuthRequest(httpRequest, this.httpClient);
        }
        return validHttpRequestStage.thenComposeAsync(validHttpRequest -> {
            String id = SdkExchangeCache.putExchange(exchange);
            exchangeIdRef.set(id);
            validHttpRequest = validHttpRequest.builder().addHeader(SDK_EXCHANGE, id).build();

            HttpRequest finalValidHttpRequest = validHttpRequest;

            return httpClient.asyncInvokeHttp(validHttpRequest).thenApplyAsync(httpResponse -> {
                printAccessLog(finalValidHttpRequest, httpResponse, exchange);
                handleException(finalValidHttpRequest, httpResponse);
                return extractResponse(httpResponse, reqDef);
            }, httpConfig.getExecutorService()).whenCompleteAsync((r, e) ->
                    SdkExchangeCache.removeExchange(exchangeIdRef.get()), httpConfig.getExecutorService());
        }, httpConfig.getExecutorService());
    }

    protected <ReqT, ResT> HttpRequest buildRequest(ReqT request, HttpRequestDef<ReqT, ResT> reqDef) {
        String endpoint = this.endpoints.get(endpointIndex.intValue());
        HttpRequest.HttpRequestBuilder httpRequestBuilder = HttpRequest.newBuilder();
        httpRequestBuilder.withMethod(reqDef.getMethod())
                .withContentType(reqDef.getContentType())
                .withEndpoint(endpoint)
                .withPath(reqDef.getUri());

        for (Field<ReqT, ?> field : reqDef.getRequestFields()) {
            Optional<?> reqValueOption;
            if (httpConfig.isIgnoreRequiredValidation()) {
                reqValueOption = field.readValueNoValidation(request);
            } else {
                reqValueOption = field.readValue(request);
            }
            if (reqValueOption.isPresent()) {
                Object reqValue = reqValueOption.get();
                if (field.getLocation() == LocationType.Header) {
                    httpRequestBuilder.addHeader(field.getName(), convertToStringParams(reqValue));
                } else if (field.getLocation() == LocationType.Query) {
                    buildQueryParams(httpRequestBuilder, field.getName(), reqValue);
                } else if (field.getLocation() == LocationType.Path) {
                    httpRequestBuilder.addPathParam(field.getName(), convertToStringParams(reqValue));
                } else if (field.getLocation() == LocationType.Body) {
                    buildRequestBody(httpRequestBuilder, reqValue);
                } else if (field.getLocation() == LocationType.Cname) {
                    try {
                        URL url = new URL(
                                endpoint.replace("\r", "").replace("\n", ""));
                        StringBuilder endpointBuilder = new StringBuilder();
                        endpointBuilder.append(url.getProtocol())
                                .append("://")
                                .append(reqValue)
                                .append(".")
                                .append(url.getHost());
                        if (!StringUtils.isEmpty(url.getPath())) {
                            endpointBuilder.append("/").append(url.getPath());
                        }
                        httpRequestBuilder.withEndpoint(endpointBuilder.toString());
                    } catch (MalformedURLException e) {
                        throw new SdkException("Failed to parse endpoint");
                    }
                }
            }
        }

        // upload
        if (request instanceof SdkStreamRequest) {
            httpRequestBuilder.withBody(((SdkStreamRequest) request).extractBody());
        }

        httpRequestBuilder.addHeader(Constants.USER_AGENT, "huaweicloud-usdk-java/3.0");

        // extraHeader
        if (Objects.nonNull(extraHeader) && extraHeader.size() > 0) {
            extraHeader.forEach(httpRequestBuilder::addHeader);
        }

        // sign algorithm
        if (Objects.nonNull(httpConfig) && Objects.nonNull(httpConfig.getSigningAlgorithm())) {
            httpRequestBuilder.withSigningAlgorithm(httpConfig.getSigningAlgorithm());
        }

        return httpRequestBuilder.build();
    }

    private void buildRequestBody(HttpRequest.HttpRequestBuilder httpRequestBuilder, Object reqValue) {
        if (reqValue instanceof SdkFormDataBody) {
            httpRequestBuilder.withFormDataPart(((SdkFormDataBody) reqValue).buildFormData());
        } else if (reqValue instanceof SdkSerializable) {
            httpRequestBuilder.withBodyAsString(((SdkSerializable<?>) reqValue).serialize());
        } else {
            httpRequestBuilder.withBodyAsString(JsonUtils.toJSON(reqValue));
        }
    }

    private void buildQueryParams(HttpRequest.HttpRequestBuilder httpRequestBuilder, String fieldName,
        Object reqValue) {
        if (reqValue instanceof Collection) {
            httpRequestBuilder.addQueryParam(fieldName, buildCollectionQueryParams(reqValue));
        } else if (reqValue instanceof Map) {
            Map<String, List<String>> params = buildMapQueryParamsLoop(fieldName, (Map<?, ?>) reqValue);
            for (Map.Entry<String, List<String>> entry : params.entrySet()) {
                httpRequestBuilder.addQueryParam(entry.getKey(), entry.getValue());
            }
        } else {
            httpRequestBuilder.addQueryParam(fieldName, Collections.singletonList(convertToStringParams(reqValue)));
        }
    }

    private String convertToStringParams(Object reqValue) {
        String value;
        if (reqValue instanceof OffsetDateTime) {
            value = ((OffsetDateTime) reqValue).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        } else {
            value = reqValue.toString();
        }
        return value;
    }

    private List<String> buildCollectionQueryParams(Object reqValue) {
        return ((List<?>) reqValue).stream().map(this::convertToStringParams).collect(Collectors.toList());
    }

    private Map<String, List<String>> buildMapQueryParamsLoop(String key, Map<?, ?> reqValue) {
        Map<String, List<String>> result = new HashMap<>();
        Stack<Map<String, List<String>>> stack = new Stack<>();

        reqValue.forEach((k, v) -> stack.push(buildMapQueryParams(key, k.toString(), v)));

        while (!stack.isEmpty()) {
            Map<String, List<String>> temp = stack.pop();
            result.putAll(temp);
        }

        return result;
    }

    private Map<String, List<String>> buildMapQueryParams(String key, String entryKey, Object entryValue) {
        Map<String, List<String>> res = new HashMap<>();
        if (entryValue instanceof Map) {
            ((Map<?, ?>) entryValue).forEach(
                    (k, v) -> res.putAll(buildMapQueryParams(key + "[" + entryKey + "]", k.toString(), v)));
        } else if (entryValue instanceof Collection) {
            res.put(key + "[" + entryKey + "]", buildCollectionQueryParams(entryValue));
        } else {
            res.put(key + "[" + entryKey + "]", Collections.singletonList(convertToStringParams(entryValue)));
        }
        return res;
    }

    private void handleException(HttpRequest httpRequest, HttpResponse httpResponse) {
        if (httpResponse.getStatusCode() >= Constants.StatusCode.CLIENT_ERROR) {
            ServiceResponseException currException = ServiceResponseException.mapException(httpResponse.getStatusCode(),
                    ExceptionUtils.extractErrorMessage(httpResponse));
            logger.error("ServiceResponseException occurred. Host: {} Uri: {} ServiceResponseException: {}",
                    httpRequest.getUrl().getHost(), httpRequest.getUrl(), currException.toString());
            throw currException;
        }
    }

    private <ReqT, ResT> ResT extractResponse(HttpResponse httpResponse, HttpRequestDef<ReqT, ResT> reqDef) {
        int code = httpResponse.getStatusCode();

        try {
            ResT resT;
            String stringResult = httpResponse.getBodyAsString();
            String respContentType = httpResponse.getContentType();

            if (Objects.nonNull(respContentType)
                    && (respContentType.startsWith(Constants.MEDIATYPE.APPLICATION_OCTET_STREAM)
                    || respContentType.startsWith(Constants.MEDIATYPE.IMAGE)
                    || respContentType.startsWith(Constants.MEDIATYPE.APPLICATION_BSON))) {
                resT = reqDef.getResponseType().newInstance();
                ((SdkStreamResponse) resT).parseBody(httpResponse.getBody());
            } else {
                if (SdkSerializable.class.isAssignableFrom(reqDef.getResponseType())) {
                    resT = deserializeSerializableResponse(reqDef.getResponseType(), stringResult);
                } else if (!reqDef.hasResponseField(Constants.BODY)) {
                    resT = JsonUtils.toObjectIgnoreUnknown(stringResult, reqDef.getResponseType());
                    if (Objects.isNull(resT)) {
                        resT = reqDef.getResponseType().newInstance();
                    }

                    if (reqDef.hasResponseField(String.valueOf(code))) {
                        Field<ResT, ?> resTField = reqDef.getResponseField(String.valueOf(code));
                        resTField.writeValueSafe(resT,
                                JsonUtils.toObjectIgnoreUnknown(stringResult, resTField.getFieldType()),
                                resTField.getFieldType());
                    }

                } else {
                    resT = reqDef.getResponseType().newInstance();
                    Field<ResT, ?> responseField = reqDef.getResponseField(Constants.BODY);
                    Object obj = responseToObject(stringResult, responseField);
                    responseField.writeValueSafe(resT, obj, responseField.getFieldType());

                    if (reqDef.hasResponseField(String.valueOf(code))) {
                        Field<ResT, ?> resTField = reqDef.getResponseField(String.valueOf(code));
                        resTField.writeValueSafe(resT, obj, resTField.getFieldType());
                    }
                }
            }

            ResT finalResT = resT;
            reqDef.getResponseFields().forEach(resTField -> {
                if (resTField.getLocation() == LocationType.Header) {
                    fillHeaderField(httpResponse, finalResT, resTField);
                }
            });

            if (finalResT instanceof SdkResponse) {
                ((SdkResponse) finalResT).setHttpStatusCode(httpResponse.getStatusCode());
            }
            return finalResT;
        } catch (InstantiationException | IllegalAccessException e) {
            logger.error("Can not create response instance", e);
            return null;
        } catch (SdkException e) {
            logger.error("can not parse json result to response object", e);
            throw new ServerResponseException(httpResponse.getStatusCode(), null, "json parse error",
                    httpResponse.getHeader("X-Request-Id"));
        }
    }

    @SuppressWarnings("unchecked")
    private <ResT> ResT deserializeSerializableResponse(Class<ResT> clazz, String string)
            throws InstantiationException, IllegalAccessException {
        ResT instance = clazz.newInstance();
        return ((SdkSerializable<ResT>) instance).deserialize(string);
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
                            String.join(",", infos));
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

    /**
     * print access log
     *
     * @param httpRequest  original http request
     * @param httpResponse original http response
     * @param exchange     sdk exchange
     */
    public void printAccessLog(HttpRequest httpRequest, HttpResponse httpResponse, SdkExchange exchange) {
        String requestId = Objects.isNull(httpResponse.getHeader(Constants.X_REQUEST_ID))
                ? "null"
                : httpResponse.getHeader(Constants.X_REQUEST_ID);
        AccessLog.get()
                .info("\"{} {}\" {} {} {} {}", httpRequest.getMethod(), httpRequest.getUrl(), httpResponse.getStatusCode(),
                        httpResponse.getContentLength(), requestId,
                        Objects.nonNull(exchange) && Objects.nonNull(exchange.getApiTimer()) ? exchange.getApiTimer()
                                .getDurationMs() : "");
    }
}
