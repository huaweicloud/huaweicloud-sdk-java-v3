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

package com.huaweicloud.sdk.core.impl;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLHandshakeException;

import okhttp3.internal.http.HttpMethod;
import org.apache.commons.lang3.StringUtils;

import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.core.exception.HostUnreachableException;
import com.huaweicloud.sdk.core.exception.SslHandShakeException;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.ssl.IgnoreSSLVerificationFactory;

import okhttp3.Authenticator;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Credentials;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class DefaultHttpClient implements HttpClient {

    private OkHttpClient client = new OkHttpClient();

    private HttpConfig httpConfig;

    private static final String OKHTTP_PREEMPTIVE = "OkHttp-Preemptive";
    private static final String PROXY_AUTHENTICATE = "Proxy-Authenticate";
    private static final String PROXY_AUTHORIZATION = "Proxy-Authorization";

    public DefaultHttpClient(HttpConfig httpConfig) {

        withHttpConfig(httpConfig);

    }

    public HttpConfig getHttpConfig() {
        return httpConfig;
    }

    public DefaultHttpClient withHttpConfig(HttpConfig httpConfig) {
        this.httpConfig = httpConfig;
        OkHttpClient.Builder clientBuilder = client.newBuilder();
        clientBuilder.connectTimeout(httpConfig.getTimeout(), TimeUnit.SECONDS);
        if (httpConfig.isIgnoreSSLVerification()) {
            clientBuilder
                    .hostnameVerifier(IgnoreSSLVerificationFactory.getHostnameVerifier())
                    .sslSocketFactory(IgnoreSSLVerificationFactory.getSSLContext().getSocketFactory(),
                            IgnoreSSLVerificationFactory.getTrustAllManager());
        }

        //set proxy
        if (!StringUtils.isEmpty(httpConfig.getProxyHost())) {
            Proxy proxy = new Proxy(Proxy.Type.HTTP,
                    new InetSocketAddress(httpConfig.getProxyHost(), httpConfig.getProxyPort()));
            clientBuilder.proxy(proxy);
        }
        if (!StringUtils.isEmpty(httpConfig.getProxyUsername())) {
            Authenticator proxyAuthenticator =
                (route, response) -> {
                    if (!OKHTTP_PREEMPTIVE.equals(response.header(PROXY_AUTHENTICATE)) && response.code() == 407) {
                        return null;
                    }

                    String credential = Credentials.basic(httpConfig.getProxyUsername(),
                            httpConfig.getProxyPassword());

                    return response.request().newBuilder()
                            .header(PROXY_AUTHORIZATION, credential)
                            .build();
                };
            clientBuilder.proxyAuthenticator(proxyAuthenticator);
        }

        client = clientBuilder.addInterceptor(new DefaultHttpListener(httpConfig)).build();

        return this;
    }

    private Request buildOkHttpRequest(HttpRequest httpRequest) {
        Request.Builder requestBuilder = new Request.Builder();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(httpRequest.getEndpoint()
                + httpRequest.getPathParamsString()).newBuilder();

        httpRequest.getQueryParams().forEach((key, values) -> values.forEach(value -> {
            urlBuilder.addQueryParameter(key, value);
        }));

        requestBuilder.url(urlBuilder.build());

        httpRequest.getHeaders().forEach((key, values) ->
                values.forEach(value -> requestBuilder.header(key, value)));

        if (Objects.isNull(httpRequest.getBodyAsString())) {
            if (HttpMethod.requiresRequestBody(httpRequest.getMethod().toString())) {
                requestBuilder.method(httpRequest.getMethod().toString(),
                        RequestBody.create(null, new byte[0]));
            } else {
                requestBuilder.method(httpRequest.getMethod().toString(), null);
            }
        } else {
            requestBuilder.method(httpRequest.getMethod().toString(),
                    RequestBody.create(MediaType.parse(httpRequest.getContentType()),
                            httpRequest.getBodyAsString()));
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
        Response response = null;
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
