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

package com.huaweicloud.sdk.core.impl;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.core.exception.HostUnreachableException;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.exception.SslHandShakeException;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.progress.ProgressInputStream;
import com.huaweicloud.sdk.core.progress.ProgressManager;
import com.huaweicloud.sdk.core.progress.RepeatableRequestEntity;
import com.huaweicloud.sdk.core.progress.SimpleProgressManager;
import com.huaweicloud.sdk.core.ssl.IgnoreSSLVerificationFactory;
import com.huaweicloud.sdk.core.utils.ExceptionUtils;
import com.huaweicloud.sdk.core.utils.StringUtils;
import okhttp3.Authenticator;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Credentials;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.HttpMethod;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLHandshakeException;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author HuaweiCloud_SDK
 */
public class DefaultHttpClient implements HttpClient {

    private static final Logger logger = LoggerFactory.getLogger(DefaultHttpClient.class);

    private static final String OKHTTP_PREEMPTIVE = "OkHttp-Preemptive";

    private static final String PROXY_AUTHENTICATE = "Proxy-Authenticate";

    private static final String PROXY_AUTHORIZATION = "Proxy-Authorization";

    private static final int PROXY_AUTHENTICATION_REQUIRED = 407;

    private static final int DEFAULT_READ_TIMEOUT = 120;

    private OkHttpClient client;

    private HttpConfig httpConfig;

    public DefaultHttpClient(HttpConfig httpConfig) {
        withHttpConfig(httpConfig);
    }

    public HttpConfig getHttpConfig() {
        return httpConfig;
    }

    public DefaultHttpClient withHttpConfig(HttpConfig httpConfig) {
        this.httpConfig = httpConfig;
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder().followRedirects(httpConfig.isAllowRedirects());
        clientBuilder.connectionPool(httpConfig.getConnectionPool());
        if (Objects.nonNull(httpConfig.getDispatcher())) {
            clientBuilder.dispatcher(httpConfig.getDispatcher());
        }
        clientBuilder.connectTimeout(httpConfig.getTimeout(), TimeUnit.SECONDS).readTimeout(DEFAULT_READ_TIMEOUT,
                TimeUnit.SECONDS);

        if (Objects.nonNull(httpConfig.getSSLSocketFactory()) && Objects.nonNull(httpConfig.getX509TrustManager())) {
            clientBuilder.sslSocketFactory(httpConfig.getSSLSocketFactory(), httpConfig.getX509TrustManager());
        }
        if (httpConfig.isIgnoreSSLVerification()) {
            clientBuilder.hostnameVerifier(IgnoreSSLVerificationFactory.getHostnameVerifier())
                    .sslSocketFactory(
                            IgnoreSSLVerificationFactory.getSSLContext(httpConfig.getSecureRandom()).getSocketFactory(),
                            IgnoreSSLVerificationFactory.getTrustAllManager());
        }

        clientBuilder.protocols(Collections.singletonList(Protocol.HTTP_1_1));
        // set proxy
        if (!StringUtils.isEmpty(httpConfig.getProxyHost())) {
            Proxy proxy = new Proxy(Proxy.Type.HTTP,
                    new InetSocketAddress(httpConfig.getProxyHost(), httpConfig.getProxyPort()));
            clientBuilder.proxy(proxy);
        }
        if (!StringUtils.isEmpty(httpConfig.getProxyUsername())) {
            Authenticator proxyAuthenticator = (route, response) -> {
                if (!OKHTTP_PREEMPTIVE.equals(response.header(PROXY_AUTHENTICATE))
                        && response.code() == PROXY_AUTHENTICATION_REQUIRED) {
                    return null;
                }

                String credential = Credentials.basic(httpConfig.getProxyUsername(), httpConfig.getProxyPassword());

                return response.request().newBuilder().header(PROXY_AUTHORIZATION, credential).build();
            };
            clientBuilder.proxyAuthenticator(proxyAuthenticator);
        }

        client = clientBuilder.addInterceptor(new DefaultHttpListener(httpConfig)).build();

        return this;
    }

    private Request buildOkHttpRequest(HttpRequest httpRequest) {
        Request.Builder requestBuilder = new Request.Builder();
        String url = httpRequest.getEndpoint() + httpRequest.getPathParamsString();
        HttpUrl httpUrl = Optional.ofNullable(HttpUrl.parse(url))
                .orElseThrow(() -> new SdkException("failed to parse url from " + url));
        HttpUrl.Builder urlBuilder = httpUrl.newBuilder();

        httpRequest.getQueryParams().forEach((key, values) -> {
            if (values.size() == 0) {
                urlBuilder.addQueryParameter(key, null);
            } else {
                values.forEach(value -> urlBuilder.addQueryParameter(key, value));
            }
        });

        requestBuilder.url(urlBuilder.build());

        httpRequest.getHeaders().forEach((key, values) -> values.forEach(value -> requestBuilder.header(key, value)));

        if (Objects.isNull(httpRequest.getBodyAsString())) {
            return httpRequest.getContentType().startsWith(Constants.MEDIATYPE.MULTIPART_FORM_DATA)
                    ? buildOkHttpRequestWithFormData(httpRequest, requestBuilder)
                    : buildOkHttpRequestWithoutTextBody(httpRequest, requestBuilder);
        } else {
            return buildOkHttpRequestWithTextBody(httpRequest, requestBuilder);
        }

    }

    private Request buildOkHttpRequestWithFormData(HttpRequest httpRequest, Request.Builder requestBuilder) {
        MultipartBody.Builder bodyBuilder = new MultipartBody.Builder();
        MediaType mediaType = Optional.ofNullable(MediaType.parse(httpRequest.getContentType())).orElseThrow(
                () -> new SdkException("failed to parse request Content-Type from " + httpRequest.getContentType()));

        bodyBuilder.setType(mediaType);
        httpRequest.getFormData().forEach((name, part) -> {
            if (part instanceof FormDataFilePart) {
                FormDataFilePart filePart = (FormDataFilePart) part;
                bodyBuilder.addFormDataPart(name, filePart.getFilename(), new RequestBody() {

                    @Override
                    public MediaType contentType() {
                        return Objects.isNull(filePart.getContentType())
                                ? null
                                : MediaType.parse(filePart.getContentType());
                    }

                    @Override
                    public void writeTo(@NotNull BufferedSink bufferedSink) throws IOException {
                        try (Source source = Okio.source(filePart.getInputStream())) {
                            bufferedSink.writeAll(source);
                        }
                    }
                });
            } else {
                bodyBuilder.addFormDataPart(name, part.toString());
            }
        });

        requestBuilder.method(httpRequest.getMethod().toString(), bodyBuilder.build());
        return requestBuilder.build();
    }

    private Request buildOkHttpRequestWithTextBody(HttpRequest httpRequest, Request.Builder requestBuilder) {
        requestBuilder.method(httpRequest.getMethod().toString(), new RequestBody() {

            @Override
            public MediaType contentType() {
                return MediaType.parse(httpRequest.getContentType());
            }

            @Override
            public void writeTo(@NotNull BufferedSink bufferedSink) throws IOException {
                bufferedSink.writeUtf8(httpRequest.getBodyAsString());
            }

            @Override
            public long contentLength() {
                if (httpRequest.haveHeader(Constants.CONTENT_LENGTH)) {
                    return Long.parseLong(httpRequest.getHeader(Constants.CONTENT_LENGTH));
                }
                return httpRequest.getBodyAsString().length();
            }
        });
        return requestBuilder.build();
    }

    private Request buildOkHttpRequestWithoutTextBody(HttpRequest httpRequest, Request.Builder requestBuilder) {
        if (Objects.isNull(httpRequest.getBody())) {
            if (HttpMethod.requiresRequestBody(httpRequest.getMethod().toString())) {
                requestBuilder.method(
                        httpRequest.getMethod().toString(), createRequestBody(new byte[0], null));
            } else {
                requestBuilder.method(httpRequest.getMethod().toString(), null);
            }
        } else {
            buildStreamRequestBody(httpRequest, requestBuilder);
        }
        return requestBuilder.build();
    }

    private RequestBody createRequestBody(byte[] content, MediaType contentType) {
        try {
            return RequestBody.create(content, contentType);
        } catch (NoSuchMethodError e) {
            return RequestBody.create(contentType, content);
        }
    }

    private void buildStreamRequestBody(HttpRequest httpRequest, Request.Builder requestBuilder) {
        RequestBody requestBody;
        if (Objects.isNull(httpRequest.getProgressListener())) {
            requestBody = new RequestBody() {
                @Override
                public MediaType contentType() {
                    return MediaType.parse(httpRequest.getContentType());
                }

                @Override
                public void writeTo(@NotNull BufferedSink bufferedSink) throws IOException {
                    try (Source source = Okio.source(httpRequest.getBody())) {
                        bufferedSink.writeAll(source);
                    }
                }
            };

        } else {
            long contentLength;
            try {
                contentLength = httpRequest.haveHeader(Constants.CONTENT_LENGTH)
                        ? Long.parseLong(httpRequest.getHeader(Constants.CONTENT_LENGTH))
                        : httpRequest.getBody().available();
            } catch (IOException | NumberFormatException ignore) {
                contentLength = -1L;
            }

            ProgressManager progressManager = new SimpleProgressManager(contentLength, 0,
                    httpRequest.getProgressListener(), httpRequest.getProgressInterval());
            ProgressInputStream inputStream = new ProgressInputStream(httpRequest.getBody(), progressManager);
            requestBody = new RepeatableRequestEntity(
                    inputStream, httpRequest.getHeader(Constants.CONTENT_TYPE), contentLength);
        }

        requestBuilder.method(httpRequest.getMethod().toString(), requestBody);
    }

    public Callback toCallback(CompletableFuture<Response> future) {
        return new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(e);
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) {
                future.complete(response);
            }
        };
    }

    @Override
    public CompletableFuture<HttpResponse> asyncInvokeHttp(HttpRequest httpRequest) {
        Request request = buildOkHttpRequest(httpRequest);
        CompletableFuture<Response> asyncHttpResponse = new CompletableFuture<>();
        client.newCall(request).enqueue(toCallback(asyncHttpResponse));
        return asyncHttpResponse.handleAsync((response, throwable) -> {
            if (Objects.nonNull(request.body()) && request.body() instanceof Closeable) {
                closeStream((Closeable) request.body());
            }

            if (throwable != null) {
                if (throwable instanceof SSLHandshakeException) {
                    logger.error("DefaultHttpClient SslHandShakeException", throwable);
                    throw new SslHandShakeException("DefaultHttpClient SslHandShakeException", throwable);
                } else if (throwable instanceof UnknownHostException) {
                    logger.error("DefaultHttpClient HostUnreachableException", throwable);
                    throw new HostUnreachableException("DefaultHttpClient HostUnreachableException", throwable);
                } else if (throwable instanceof SocketTimeoutException) {
                    logger.error("DefaultHttpClient RequestTimeoutException", throwable);
                    ExceptionUtils.mapSocketTimeoutException("DefaultHttpClient RequestTimeoutException", throwable);
                } else {
                    logger.error("DefaultHttpClient ConnectionException", throwable);
                    throw new ConnectionException("DefaultHttpClient ConnectionException", throwable);
                }
            }
            return DefaultHttpResponse.wrap(response);
        }, httpConfig.getExecutorService());
    }

    @Override
    public HttpResponse syncInvokeHttp(HttpRequest httpRequest) throws ConnectionException {
        Request request = buildOkHttpRequest(httpRequest);
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (SSLHandshakeException e) {
            logger.error("DefaultHttpClient SslHandShakeException", e);
            throw new SslHandShakeException("DefaultHttpClient SslHandShakeException", e);
        } catch (UnknownHostException e) {
            logger.error("DefaultHttpClient HostUnreachableException", e);
            throw new HostUnreachableException("DefaultHttpClient HostUnreachableException", e);
        } catch (SocketTimeoutException e) {
            logger.error("DefaultHttpClient RequestTimeout", e);
            ExceptionUtils.mapSocketTimeoutException("DefaultHttpClient RequestTimeout", e);
        } catch (IOException e) {
            logger.error("DefaultHttpClient ConnectionException", e);
            throw new ConnectionException("DefaultHttpClient ConnectionException", e);
        } finally {
            if (Objects.nonNull(request.body()) && request.body() instanceof Closeable) {
                closeStream((Closeable) request.body());
            }
        }
        return DefaultHttpResponse.wrap(response);
    }

    private void closeStream(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            logger.warn("close failed.", e);
        }
    }
}
