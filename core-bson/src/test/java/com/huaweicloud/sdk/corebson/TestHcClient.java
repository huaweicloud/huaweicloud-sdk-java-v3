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

package com.huaweicloud.sdk.corebson;

import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.HttpListener;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import org.bson.BsonRegularExpression;
import org.bson.BsonSerializationException;
import org.bson.BsonTimestamp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class TestHcClient {
    private static final Logger logger = LoggerFactory.getLogger(TestHcClient.class);
    HcClient hcClient;
    private TestHttpRequestDef.TestBsonDocRequest testBsonDocRequest = null;
    private byte[] bodyBytes = null;
    HttpRequestDef<TestHttpRequestDef.TestBsonDocRequest,
            TestHttpRequestDef.TestBsonDocResponse> testBsonDocDef = TestHttpRequestDef.buildTestBsonDocRequestDef();
    @Rule
    public WireMockRule wireMockRule;

    @Before
    public void init() {

        System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
        System.setProperty("org.eclipse.jetty.LEVEL", "OFF");

        WireMockConfiguration configuration = WireMockConfiguration.options()
                .dynamicPort()
                .dynamicHttpsPort()
                .disableRequestJournal();
        wireMockRule = new WireMockRule(configuration);
        testBsonDocRequestInit();
        wireMockRule.stubFor(
                WireMock.post("/test-bson")
                        .withHeader("Content-Type", WireMock.containing(Constants.MEDIATYPE.APPLICATION_BSON))
                        .willReturn(WireMock.aResponse()
                                .withHeader("Content-Length", String.valueOf(bodyBytes.length))
                                .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_BSON)
                                .withBody(bodyBytes)
                                .withStatus(200)));

        wireMockRule.start();

        List<String> endpoints = new ArrayList<String>() {
            private static final long serialVersionUID = -1692043459070495869L;

            {
                add(String.format(Locale.ROOT, "https://127.0.0.1:%d", wireMockRule.httpsPort()));
            }
        };

        hcClient = new HcClient(new HttpConfig().withIgnoreSSLVerification(true)
                .withTimeout(600)
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
                .withEndpoints(endpoints);
    }

    @Test
    public void testBsonDocRequest() {
        TestHttpRequestDef.TestBsonDocResponse response = hcClient.syncInvokeHttp(testBsonDocRequest, testBsonDocDef);
        Assert.assertEquals(testBsonDocRequest.getBody(), response);
    }

    private void testBsonDocRequestInit() {
        // bson规范date-time精度为ms
        long time = new Date().getTime();
        BsonTimestamp bsonTimestamp = new BsonTimestamp(time);
        TestHttpRequestDef.TestBsonDocBody body = new TestHttpRequestDef.TestBsonDocBody();
        body.setId("abc123");
        body.setTimestamp(bsonTimestamp);
        body.setReg(new BsonRegularExpression("[a-z0-9_]", "-g"));

        testBsonDocRequest = new TestHttpRequestDef.TestBsonDocRequest();
        testBsonDocRequest.setBody(body);
        try (InputStream input = testBsonDocRequest.extractBody()) {
            bodyBytes = new byte[input.available()];
            testBsonDocRequest.extractBody().read(bodyBytes);
        } catch (IOException e) {
            throw new BsonSerializationException("Serialization failed");
        }
    }
}
