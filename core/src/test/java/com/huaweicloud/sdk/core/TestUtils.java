/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
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

import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.http.HttpConfig;
import org.junit.Assert;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.function.Consumer;

public class TestUtils {
    public static WireMockRule createWireMockRule() {
        return new WireMockRule(
                WireMockConfiguration.options().dynamicPort().dynamicHttpsPort().disableRequestJournal());
    }

    public static HcClient createHcClient(Logger logger, String endpoint) {
        return new HcClient(new HttpConfig().withIgnoreSSLVerification(true)
                .withConnectionTimeout(600)
                .addHttpListener(HttpListener.forResponseListener(
                        responseListener -> logger.debug("RESPONSE: [{} {}] {} {} {} {} {}ms",
                                responseListener.exchange().getApiReference().getName(),
                                responseListener.exchange().getApiReference().getUri(), responseListener.httpMethod(),
                                responseListener.uri(), responseListener.statusCode(),
                                responseListener.body().orElse(""),
                                responseListener.exchange().getApiTimer().getDurationMs())))
                .addHttpListener(HttpListener.forRequestListener(
                        requestListener -> logger.debug("REQUEST: {} {} {}", requestListener.httpMethod(),
                                requestListener.uri(), requestListener.body().orElse("")))))
                .withCredential(new BasicCredentials().withAk("test").withSk("test").withProjectId("pp"))
                .withEndpoints(Collections.singletonList(endpoint));

    }

    public static Consumer<InputStream> getDownloadConsumer(Logger logger) {
        return inputStream -> {
            byte[] bytes = new byte[512];
            int len;
            int totalLen = 0;
            try {
                while ((len = inputStream.read(bytes)) != -1) {
                    totalLen += len;
                }
                Assert.assertEquals(totalLen, 1024 * 1024 * 5);
            } catch (IOException e) {
                logger.error("Download file error ", e);
            }
        };
    }
}
