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

import com.huaweicloud.sdk.core.HttpListener;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.exchange.ApiTimer;
import com.huaweicloud.sdk.core.exchange.SdkExchange;
import com.huaweicloud.sdk.core.exchange.SdkExchangeCache;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.utils.HttpUtils;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import static com.huaweicloud.sdk.core.Constants.SDK_EXCHANGE;

/**
 * @author HuaweiCloud_SDK
 */
public class DefaultHttpListener implements Interceptor {
    private final List<HttpListener> httpListeners;

    public DefaultHttpListener(HttpConfig httpConfig) {
        this.httpListeners = httpConfig.getHttpListeners();
    }

    @NotNull
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        SdkExchange exchange = SdkExchangeCache.getExchange(request.header(SDK_EXCHANGE));
        exchange = Objects.isNull(exchange) ? new SdkExchange() : exchange;
        request = request.newBuilder().removeHeader(SDK_EXCHANGE).build();

        exchange.withApiTimer(ApiTimer::start);

        if (Objects.nonNull(httpListeners)) {
            preRequest(request, exchange);
        }
        Response response = chain.proceed(request.newBuilder().removeHeader(SDK_EXCHANGE).build());

        exchange.withApiTimer(ApiTimer::end);

        if (Objects.nonNull(httpListeners)) {
            return postResponse(response, exchange);
        }

        return response;
    }

    public void preRequest(Request request, SdkExchange sdkExchange) throws IOException {
        String reqBody = null;
        RequestBody body = request.body();
        if (Objects.nonNull(body)) {
            String contentType = Optional.of(body)
                    .map(RequestBody::contentType)
                    .map(MediaType::toString)
                    .orElse("");
            if (HttpUtils.isTextBasedContentType(contentType)) {
                Buffer buffer = new Buffer();
                body.writeTo(buffer);
                reqBody = buffer.readUtf8();
            } else if (HttpUtils.isOctetStreamContentType(contentType)) {
                reqBody = body.contentLength() > 0 || body.contentLength() == -1 ? "******" : null;
            }
        }

        String finalReqBody = reqBody;
        HttpListener.RequestListener requestListener = new HttpListener.RequestListener() {

            @Override
            public String httpMethod() {
                return request.method();
            }

            @Override
            public String uri() {
                return request.url().toString();
            }

            @Override
            public Map<String, List<String>> headers() {
                return DefaultHttpUtils.headersToMap(request.headers());
            }

            @Override
            public Optional<String> body() {
                return Optional.ofNullable(finalReqBody);
            }

            @Override
            public SdkExchange exchange() {
                return sdkExchange;
            }
        };
        this.httpListeners.forEach(httpListener -> httpListener.preRequest(requestListener));

    }

    public Response postResponse(Response response, SdkExchange sdkExchange) throws IOException {
        Request request = response.request();
        Response.Builder responseBuilder = response.newBuilder();
        String respBody = null;
        ResponseBody body = response.body();
        if (Objects.nonNull(body)) {
            if (body.contentLength() == 0) {
                respBody = body.string();
                responseBuilder.body(createResponseBody(respBody, body.contentType()));
            } else {
                String contentType = Optional.of(body)
                        .map(ResponseBody::contentType)
                        .map(MediaType::toString)
                        .orElseThrow(() -> new SdkException("Failed to parse the Content-Type of ResponseBody"));
                if (HttpUtils.isTextBasedContentType(contentType)) {
                    respBody = body.string();
                    responseBuilder.body(createResponseBody(respBody, body.contentType()));
                } else if (HttpUtils.isOctetStreamContentType(contentType)) {
                    respBody = body.contentLength() > 0 || body.contentLength() == -1 ? "******" : null;
                }
            }
        }

        String finalRespBody = respBody;
        HttpListener.ResponseListener responseListener = new HttpListener.ResponseListener() {
            @Override
            public String httpMethod() {
                return request.method();
            }

            @Override
            public String uri() {
                return request.url().toString();
            }

            @Override
            public Map<String, List<String>> headers() {
                return DefaultHttpUtils.headersToMap(response.headers());
            }

            @Override
            public Optional<String> body() {
                return Optional.ofNullable(finalRespBody);
            }

            @Override
            public int statusCode() {
                return response.code();
            }

            @Override
            public SdkExchange exchange() {
                return sdkExchange;
            }
        };
        this.httpListeners.forEach(httpListener -> httpListener.postResponse(responseListener));
        return responseBuilder.build();
    }

    private ResponseBody createResponseBody(String content, MediaType contentType) {
        try {
            return ResponseBody.create(content, contentType);
        } catch (NoSuchMethodError e) {
            return ResponseBody.create(contentType, content);
        }
    }
}
