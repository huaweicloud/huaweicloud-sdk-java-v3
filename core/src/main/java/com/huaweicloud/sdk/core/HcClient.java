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
import com.huaweicloud.sdk.core.exception.DefaultExceptionHandler;
import com.huaweicloud.sdk.core.exception.ExceptionHandler;
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
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;
import com.huaweicloud.sdk.core.impl.DefaultHttpClient;
import com.huaweicloud.sdk.core.progress.ProgressInputStream;
import com.huaweicloud.sdk.core.progress.ProgressRequest;
import com.huaweicloud.sdk.core.progress.SimpleProgressManager;
import com.huaweicloud.sdk.core.utils.CastUtils;
import com.huaweicloud.sdk.core.utils.ExceptionUtils;
import com.huaweicloud.sdk.core.utils.HttpUtils;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import com.huaweicloud.sdk.core.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
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

    private ExceptionHandler exceptionHandler = new DefaultExceptionHandler();

    private List<String> endpoints;

    private ICredential credential;

    private final HttpConfig httpConfig;

    private Map<String, String> extraHeaders;

    private HcClient(HcClient hcClient) {
        this.extraHeaders = hcClient.extraHeaders;
        this.httpClient = hcClient.httpClient;
        this.endpoints = hcClient.endpoints;
        this.credential = hcClient.credential;
        this.httpConfig = hcClient.httpConfig;
        this.exceptionHandler = hcClient.exceptionHandler;
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

    public HcClient withExtraHeaders(Map<String, String> extraHeaders) {
        this.extraHeaders = extraHeaders;
        return this;
    }

    protected HcClient withExceptionHandler(ExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
        return this;
    }

    public ICredential getCredential() {
        return this.credential;
    }

    public HttpConfig getHttpConfig() {
        return httpConfig;
    }

    public HcClient overrideEndpoints(List<String> endpoints) {
        return new HcClient(this).withEndpoints(endpoints);
    }

    public HcClient overrideCredential(ICredential credential) {
        return new HcClient(this).withCredential(credential);
    }

    /**
     * preInvoke
     *
     * @param extraHeaders extraHeaders
     * @deprecated this method will be removed in the future version
     * use {@link #withExtraHeaders(Map)} ()} instead
     */
    @Deprecated
    public HcClient preInvoke(Map<String, String> extraHeaders) {
        HcClient client = new HcClient(this);
        client.extraHeaders = extraHeaders;
        return client;
    }

    public <R, S> S syncInvokeHttp(R request, HttpRequestDef<R, S> reqDef)
            throws ServiceResponseException {
        return syncInvokeHttp(request, reqDef, new SdkExchange());
    }

    public <R, S> S syncInvokeHttp(R request, HttpRequestDef<R, S> reqDef, SdkExchange exchange)
            throws ServiceResponseException {
        return syncInvokeHttp(request, reqDef, exchange, this.extraHeaders);
    }

    public <R, S> S syncInvokeHttp(R request, HttpRequestDef<R, S> reqDef, SdkExchange exchange,
                                   Map<String, String> extraHeaders) throws ServiceResponseException {
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
                    httpRequest = buildRequest(request, reqDef, extraHeaders);
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
            exceptionHandler.handleException(httpRequest, httpResponse);
            return extractResponse(httpRequest, httpResponse, reqDef);
        } finally {
            SdkExchangeCache.removeExchange(exchangeId);
        }
    }

    public <R, S> CompletableFuture<S> asyncInvokeHttp(R request, HttpRequestDef<R, S> reqDef) {
        return asyncInvokeHttp(request, reqDef, new SdkExchange());
    }

    public <R, S> CompletableFuture<S> asyncInvokeHttp(R request, HttpRequestDef<R, S> reqDef,
                                                       SdkExchange exchange) {
        return asyncInvokeHttp(request, reqDef, exchange, extraHeaders);
    }

    public <R, S> CompletableFuture<S> asyncInvokeHttp(R request, HttpRequestDef<R, S> reqDef,
                                                       SdkExchange exchange, Map<String, String> extraHeaders) {
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
            httpRequest = buildRequest(request, reqDef, extraHeaders);
        } catch (SdkException e) {
            CompletableFuture<S> future = new CompletableFuture<>();
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
                exceptionHandler.handleException(finalValidHttpRequest, httpResponse);
                return extractResponse(finalValidHttpRequest, httpResponse, reqDef);
            }, httpConfig.getExecutorService()).whenCompleteAsync((r, e) ->
                    SdkExchangeCache.removeExchange(exchangeIdRef.get()), httpConfig.getExecutorService());
        }, httpConfig.getExecutorService());
    }

    protected <R, S> HttpRequest buildRequest(R request, HttpRequestDef<R, S> reqDef) {
        return buildRequest(request, reqDef, null);
    }

    protected <R, S> HttpRequest buildRequest(R request, HttpRequestDef<R, S> reqDef,
                                              Map<String, String> extraHeaders) {
        String endpoint = this.endpoints.get(endpointIndex.intValue());
        HttpRequest.HttpRequestBuilder httpRequestBuilder = HttpRequest.newBuilder();
        httpRequestBuilder.withMethod(reqDef.getMethod())
                .withEndpoint(endpoint)
                .withPath(reqDef.getUri());

        boolean hasBody = false;
        for (Field<R, ?> field : reqDef.getRequestFields()) {
            Optional<?> reqValueOption = httpConfig.isIgnoreRequiredValidation() ?
                    field.readValueNoValidation(request) : field.readValue(request);

            if (!reqValueOption.isPresent()) {
                continue;
            }
            Object reqValue = reqValueOption.get();
            switch (field.getLocation()) {
                case Header:
                    httpRequestBuilder.addHeader(field.getName(), convertToStringParams(reqValue));
                    break;
                case Query:
                    buildQueryParams(httpRequestBuilder, field.getName(), reqValue);
                    break;
                case Path:
                    httpRequestBuilder.addPathParam(field.getName(), convertToStringParams(reqValue));
                    break;
                case Body:
                    buildRequestBody(httpRequestBuilder, reqValue);
                    hasBody = true;
                    break;
                case Cname:
                    buildCname(httpRequestBuilder, endpoint, reqValue);
                    break;
                default:
                    break;
            }
        }

        if (!(this.httpConfig.isIgnoreContentTypeForGetRequest() && reqDef.getMethod() == HttpMethod.GET && !hasBody)) {
            httpRequestBuilder.withContentType(reqDef.getContentType());
        }

        processStreamRequest(httpRequestBuilder, request);
        processExtraHeaders(httpRequestBuilder, extraHeaders);

        // sign algorithm
        if (Objects.nonNull(httpConfig.getSigningAlgorithm())) {
            httpRequestBuilder.withSigningAlgorithm(httpConfig.getSigningAlgorithm());
        }

        return httpRequestBuilder.build();
    }

    private <R> void processStreamRequest(HttpRequest.HttpRequestBuilder builder, R request) {
        if (request instanceof SdkStreamRequest) {
            builder.withBody(((SdkStreamRequest) request).extractBody());
        }

        if (!(request instanceof ProgressRequest)) {
            return;
        }
        ProgressRequest progressRequest = (ProgressRequest) request;
        long progressInterval = progressRequest.getProgressInterval() > 0 ?
                progressRequest.getProgressInterval() : Constants.DEFAULT_PROGRESS_INTERVAL;
        builder.withProgressListener(progressRequest.getProgressListener()).withProgressInterval(progressInterval);
    }

    private void processExtraHeaders(HttpRequest.HttpRequestBuilder builder, Map<String, String> extraHeaders) {
        Map<String, String> headers = new HashMap<>();
        // client-level extra headers
        if (Objects.nonNull(this.extraHeaders)) {
            headers.putAll(this.extraHeaders);
        }
        // request-level extra headers
        if (Objects.nonNull(extraHeaders)) {
            headers.putAll(extraHeaders);
        }
        // user-agent
        String userAgent = headers.containsKey(Constants.USER_AGENT) ?
                Constants.USER_AGENT_VALUE + ";" + headers.get(Constants.USER_AGENT) : Constants.USER_AGENT_VALUE;
        headers.put(Constants.USER_AGENT, userAgent);

        builder.addHeaders(headers);
    }

    private void buildCname(HttpRequest.HttpRequestBuilder httpRequestBuilder, String endpoint, Object reqValue) {
        try {
            URL url = new URL(
                    endpoint.replace("\r", "").replace("\n", ""));
            StringBuilder endpointBuilder = new StringBuilder();
            endpointBuilder.append(url.getProtocol())
                    .append("://")
                    .append(reqValue)
                    .append(".")
                    .append(url.getAuthority());
            if (!StringUtils.isEmpty(url.getPath())) {
                endpointBuilder.append("/").append(url.getPath());
            }
            httpRequestBuilder.withEndpoint(endpointBuilder.toString());
        } catch (MalformedURLException e) {
            throw new SdkException("Failed to parse endpoint");
        }
    }

    private void buildRequestBody(HttpRequest.HttpRequestBuilder httpRequestBuilder, Object reqValue) {
        if (reqValue instanceof SdkFormDataBody) {
            httpRequestBuilder.withFormDataPart(((SdkFormDataBody) reqValue).buildFormData());
        } else if (reqValue instanceof SdkSerializable) {
            httpRequestBuilder.withBodyAsString(((SdkSerializable<?>) reqValue).serialize());
        } else {
            String bodyString = reqValue instanceof String ? (String) reqValue : JsonUtils.toJSON(reqValue);
            httpRequestBuilder.withBodyAsString(bodyString);
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
        if (reqValue instanceof OffsetDateTime) {
            return ((OffsetDateTime) reqValue).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }
        return reqValue.toString();
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
                    httpRequest.getUrl().getAuthority(), httpRequest.getUrl(), currException.toString());
            throw currException;
        }
    }

    private <S> S processTextBasedType(HttpResponse httpResponse, HttpRequestDef<?, S> reqDef)
            throws InstantiationException, IllegalAccessException {

        S response;
        String stringResult = httpResponse.getBodyAsString();
        int statusCode = httpResponse.getStatusCode();
        if (SdkSerializable.class.isAssignableFrom(reqDef.getResponseType())) {
            // Processes the response that implements the SdkSerializable interface
            response = deserializeSerializableResponse(reqDef.getResponseType(), stringResult);
        } else if (!reqDef.hasResponseField(Constants.BODY)) {
            // process response without body
            response = JsonUtils.toObjectIgnoreUnknown(stringResult, reqDef.getResponseType());
            if (Objects.isNull(response)) {
                response = reqDef.getResponseType().newInstance();
            }

            if (reqDef.hasResponseField(String.valueOf(statusCode))) {
                Field<S, ?> resTField = reqDef.getResponseField(String.valueOf(statusCode));
                resTField.writeValueSafe(response,
                        JsonUtils.toObjectIgnoreUnknown(stringResult, resTField.getFieldType()),
                        resTField.getFieldType());
            }

        } else {
            // process response with body[object, map, list, string...]
            response = reqDef.getResponseType().newInstance();
            Field<S, ?> responseField = reqDef.getResponseField(Constants.BODY);
            Object obj = responseToObject(stringResult, responseField);
            responseField.writeValueSafe(response, obj, responseField.getFieldType());

            if (reqDef.hasResponseField(String.valueOf(statusCode))) {
                Field<S, ?> resTField = reqDef.getResponseField(String.valueOf(statusCode));
                resTField.writeValueSafe(response, obj, resTField.getFieldType());
            }
        }

        return response;
    }

    private <S> S processStreamType(HttpRequest httpRequest, HttpResponse httpResponse, HttpRequestDef<?, S> reqDef)
            throws InstantiationException, IllegalAccessException {

        S response = reqDef.getResponseType().newInstance();
        if (response instanceof SdkStreamResponse) {
            if (Objects.nonNull(httpRequest.getProgressListener())) {
                SimpleProgressManager progressManager = new SimpleProgressManager(
                        httpResponse.getContentLength(), 0,
                        httpRequest.getProgressListener(), httpRequest.getProgressInterval());
                ((SdkStreamResponse) response).parseBody(new BufferedInputStream(
                        new ProgressInputStream(httpResponse.getBody(), progressManager),
                        Constants.DEFAULT_READ_BUFFER_STREAM));
            } else if (Objects.nonNull(httpResponse.getContentType())
                    && HttpUtils.isBsonContentType(httpResponse.getContentType())) {
                response = CastUtils.cast(((SdkStreamResponse) response).parseBody(httpResponse.getBodyAsBytes()));
            } else {
                response = CastUtils.cast(((SdkStreamResponse) response).parseBody(httpResponse.getBody()));
            }
        }

        return response;
    }

    private <R, S> S extractResponse(
            HttpRequest httpRequest, HttpResponse httpResponse, HttpRequestDef<R, S> reqDef) {

        try {
            S finalResT = HttpUtils.isTextBasedContentType(httpResponse.getContentType()) ?
                    processTextBasedType(httpResponse, reqDef) : processStreamType(httpRequest, httpResponse, reqDef);

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
    private <S> S deserializeSerializableResponse(Class<S> clazz, String string)
            throws InstantiationException, IllegalAccessException {
        S instance = clazz.newInstance();
        return ((SdkSerializable<S>) instance).deserialize(string);
    }

    public <S> Object responseToObject(String respBody, Field<S, ?> responseField) {
        Class<?> fieldType = responseField.getFieldType();
        if (String.class.isAssignableFrom(fieldType)) {
            return respBody;
        } else if (List.class.isAssignableFrom(fieldType)) {
            return JsonUtils.toListObject(respBody, responseField.getInnerContainerType());
        } else if (Map.class.isAssignableFrom(fieldType)) {
            return JsonUtils.toMapObject(respBody, responseField.getInnerContainerType());
        } else {
            return JsonUtils.toObject(respBody, fieldType);
        }
    }

    private <S> void fillHeaderField(HttpResponse httpResponse, S wrapperResponse, Field<S, ?> field) {
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
