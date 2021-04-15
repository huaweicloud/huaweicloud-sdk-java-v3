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
import com.huaweicloud.sdk.core.exception.SslHandShakeException;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.ssl.IgnoreSSLVerificationFactory;
import com.huaweicloud.sdk.core.utils.StringUtils;

import okhttp3.Authenticator;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.ConnectionPool;
import okhttp3.Credentials;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLHandshakeException;

/**
 * @author HuaweiCloud_SDK
 */
public class DefaultHttpClient implements HttpClient {

    private static final String OKHTTP_PREEMPTIVE = "OkHttp-Preemptive";

    private static final String PROXY_AUTHENTICATE = "Proxy-Authenticate";

    private static final String PROXY_AUTHORIZATION = "Proxy-Authorization";

    private static final int PROXY_AUTHENTICATION_REQUIRED = 407;

    private static final int MAXIMUM_POOL_SIZE = 16;

    private static final long KEEP_ALIVE_TIME = 60L;

    private static final int DEFAULT_READ_TIMEOUT = 120;

    /**
     * Set unique connection pool for synchronous and asynchronous requests
     */
    private static final ConnectionPool CONNECTION_POOL = new ConnectionPool(5, 5L, TimeUnit.MINUTES);

    /**
     * Set number of maximum threads for asynchronous requests.
     * If threads number hasn't been limited, each client will occupy one thread which may leads to out of memory.
     */
    private static ExecutorService executorService = new ThreadPoolExecutor(0, MAXIMUM_POOL_SIZE, KEEP_ALIVE_TIME,
        TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));

    private static final Dispatcher DISPATCHER = new Dispatcher(executorService);

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
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        clientBuilder.connectionPool(CONNECTION_POOL);
        clientBuilder.dispatcher(DISPATCHER);
        clientBuilder.connectTimeout(httpConfig.getTimeout(), TimeUnit.SECONDS)
            .readTimeout(DEFAULT_READ_TIMEOUT, TimeUnit.SECONDS);
        if (httpConfig.isIgnoreSSLVerification()) {
            clientBuilder.hostnameVerifier(IgnoreSSLVerificationFactory.getHostnameVerifier())
                .sslSocketFactory(IgnoreSSLVerificationFactory.getSSLContext().getSocketFactory(),
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
        HttpUrl.Builder urlBuilder = HttpUrl.parse(httpRequest.getEndpoint() + httpRequest.getPathParamsString())
            .newBuilder();

        httpRequest.getQueryParams().forEach((key, values) -> {
            if (values.size() == 0) {
                urlBuilder.addQueryParameter(key, null);
            } else {
                values.forEach(value -> {
                    urlBuilder.addQueryParameter(key, value);
                });
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
        bodyBuilder.setType(MediaType.parse(httpRequest.getContentType()));
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
                    public void writeTo(BufferedSink bufferedSink) throws IOException {
                        try (Source source = Okio.source(((FormDataFilePart) part).getInputStream())) {
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
            public void writeTo(BufferedSink bufferedSink) throws IOException {
                bufferedSink.writeUtf8(httpRequest.getBodyAsString());
            }
        });
        return requestBuilder.build();
    }

    private Request buildOkHttpRequestWithoutTextBody(HttpRequest httpRequest, Request.Builder requestBuilder) {
        if (Objects.isNull(httpRequest.getBody())) {
            if (HttpMethod.requiresRequestBody(httpRequest.getMethod().toString())) {
                requestBuilder.method(httpRequest.getMethod().toString(), RequestBody.create(null, new byte[0]));
            } else {
                requestBuilder.method(httpRequest.getMethod().toString(), null);
            }
        } else {
            requestBuilder.method(httpRequest.getMethod().toString(), new RequestBody() {

                @Override
                public MediaType contentType() {
                    return MediaType.parse(httpRequest.getContentType());
                }

                @Override
                public void writeTo(BufferedSink bufferedSink) throws IOException {
                    try (Source source = Okio.source(httpRequest.getBody())) {
                        bufferedSink.writeAll(source);
                    }
                }
            });
        }
        return requestBuilder.build();
    }

    public Callback toCallback(CompletableFuture<Response> future) {
        return new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                future.completeExceptionally(e);
            }

            @Override
            public void onResponse(Call call, Response response) {
                future.complete(response);
            }
        };
    }

    @Override
    public CompletableFuture<HttpResponse> asyncInvokeHttp(HttpRequest httpRequest) {
        Request request = buildOkHttpRequest(httpRequest);
        CompletableFuture<Response> asyncHttpResponse = new CompletableFuture<>();
        client.newCall(request).enqueue(toCallback(asyncHttpResponse));
        return asyncHttpResponse.handle((response, throwable) -> {
            if (throwable != null) {
                if (throwable instanceof SSLHandshakeException) {
                    throw new SslHandShakeException("DefaultHttpClient SslHandShakeException", throwable);
                } else if (throwable instanceof SocketTimeoutException) {
                    throw new HostUnreachableException("DefaultHttpClient HostUnreachableException", throwable);
                } else {
                    throw new ConnectionException("DefaultHttpClient ConnectionException", throwable);
                }
            }
            return DefaultHttpResponse.wrap(response);
        });
    }

    @Override
    public HttpResponse syncInvokeHttp(HttpRequest httpRequest) throws ConnectionException {
        Request request = buildOkHttpRequest(httpRequest);
        Response response;
        try {
            response = client.newCall(request).execute();
        } catch (SSLHandshakeException e) {
            throw new SslHandShakeException("DefaultHttpClient SslHandShakeException", e);
        } catch (SocketTimeoutException e) {
            throw new HostUnreachableException("DefaultHttpClient HostUnreachableException", e);
        } catch (IOException e) {
            throw new ConnectionException("DefaultHttpClient ConnectionException", e);
        }
        return DefaultHttpResponse.wrap(response);
    }

}
