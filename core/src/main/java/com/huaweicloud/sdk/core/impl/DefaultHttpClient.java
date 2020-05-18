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

import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.core.exception.HostUnreachableException;
import com.huaweicloud.sdk.core.exception.SslHandShakeException;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.ssl.IgnoreSSLVerificationFactory;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import org.apache.commons.lang3.StringUtils;

import javax.net.ssl.SSLHandshakeException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


public class DefaultHttpClient implements HttpClient {

    private OkHttpClient client = new OkHttpClient();

    private HttpConfig httpConfig;

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
            Authenticator proxyAuthenticator = (route, response) -> {
                String credential = Credentials.basic(httpConfig.getProxyUsername(), httpConfig.getProxyPassword());
                return response.request().newBuilder()
                    .header("Proxy-Authorization", credential)
                    .build();
            };
            clientBuilder.proxyAuthenticator(proxyAuthenticator);
        }
        client = clientBuilder.build();
        return this;
    }

    @Override
    public HttpResponse syncInvokeHttp(HttpRequest httpRequest) throws ConnectionException {
        Request.Builder requestBuilder = new Request.Builder();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(httpRequest.getEndpoint()
            + httpRequest.getPathParamsString()).newBuilder();

        httpRequest.getQueryParams().forEach((key, values) -> values.forEach(value -> {
            urlBuilder.addQueryParameter(key, value.toString());
        }));

        requestBuilder.url(urlBuilder.build());

        httpRequest.getHeaders().forEach((key, value) ->
            requestBuilder.header(key, value.toString()));

        if (Objects.isNull(httpRequest.getBodyAsString())) {
            requestBuilder.method(httpRequest.getMethod().toString(), null);
        } else {
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
        }

        Request request = requestBuilder.build();

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
