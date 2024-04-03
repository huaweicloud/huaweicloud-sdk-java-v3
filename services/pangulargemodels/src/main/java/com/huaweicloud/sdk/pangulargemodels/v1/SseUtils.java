/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
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

package com.huaweicloud.sdk.pangulargemodels.v1;

import com.huaweicloud.sdk.core.exception.SdkException;

import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import reactor.netty.http.client.HttpClient;

import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.client.WebClient;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLException;

public class SseUtils {
    public static WebClient getWebClient(String endpoint) throws NoSuchAlgorithmException, KeyManagementException {
        if (StringUtils.isEmpty(endpoint)) {
            return WebClient.create();
        }
        if (endpoint.contains("https")) {
            HttpClient secure = HttpClient.create().secure(t -> {
                try {
                    t.sslContext(
                        SslContextBuilder.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build());
                } catch (SSLException e) {
                    throw new SdkException("Create webclient failed.", e);
                }
            });
            return WebClient.builder()
                .baseUrl(endpoint)
                .clientConnector(new ReactorClientHttpConnector(secure))
                .build();
        }
        return WebClient.create(endpoint);
    }
}