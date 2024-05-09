/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
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

import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.stubbing.Scenario;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.exception.ServerResponseException;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

public class TestRetry {
    private static final String PATH = "/invoker/retry";

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(
            WireMockConfiguration.options().dynamicPort().dynamicHttpsPort());

    public static HttpRequestDef<Object, SdkResponse> requestDef = HttpRequestDef.builder(
                    HttpMethod.GET, Object.class, SdkResponse.class)
            .withName("TestRetry")
            .withUri(PATH)
            .withContentType("application/json").build();

    public static HcClient mockClient(int port) {
        return new HcClient(HttpConfig.getDefaultHttpConfig().withIgnoreSSLVerification(true))
                .withCredential(new BasicCredentials().withAk("ak").withSk("sk"))
                .withEndpoints(Arrays.asList(
                        String.format(Locale.ROOT, "https://127.0.0.1:%d", port)));
    }

    @Before
    public void setUp() {
        wireMockRule.start();
    }

    @After
    public void tearDown() {
        wireMockRule.stop();
    }

    // 当发生ServerResponseException(status_code>=500)时进行重试,最大重试次数设置为3
    // 预期状态码为502,调用次数为4(正常调用1次+请求重试3次)
    @Test(expected = ServerResponseException.class)
    public void testSyncRetry() {
        wireMockRule.stubFor(WireMock.get(PATH).willReturn(
                        WireMock.aResponse()
                                .withStatus(502)
                                .withHeader("Content-Type", "application/json")
                )
        );

        HcClient hcClient = mockClient(wireMockRule.httpsPort());
        SyncInvoker<Object, SdkResponse> syncInvoker = new SyncInvoker<>(new Object(), requestDef, hcClient)
                .withRetry(3, (sdkResponse, e) -> e instanceof ServerResponseException);
        try {
            syncInvoker.invoke();
        } finally {
            WireMock.verify(4, WireMock.getRequestedFor(WireMock.urlEqualTo(PATH)));
        }
    }

    // 当发生ServerResponseException(status_code>=500)时进行重试,最大重试次数设置为10,第一次重试成功
    // 预期状态码为200,调用次数为2(正常调用1次+请求重试1次)
    @Test
    public void testSyncRetry2() {
        wireMockRule.stubFor(WireMock.get(PATH)
                .inScenario("Retry Scenario")
                .whenScenarioStateIs(Scenario.STARTED)
                .willSetStateTo("Retry")
                .willReturn(
                        WireMock.aResponse()
                                .withStatus(500)
                                .withHeader("Content-Type", "application/json")
                )
        );
        wireMockRule.stubFor(WireMock.get(PATH)
                .inScenario("Retry Scenario")
                .whenScenarioStateIs("Retry")
                .willReturn(
                        WireMock.aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                )
        );

        HcClient hcClient = mockClient(wireMockRule.httpsPort());
        SyncInvoker<Object, SdkResponse> syncInvoker = new SyncInvoker<>(new Object(), requestDef, hcClient)
                .withRetry(10, (sdkResponse, e) -> e instanceof ServerResponseException);

        SdkResponse response = syncInvoker.invoke();
        Assert.assertEquals(200, response.getHttpStatusCode());
        WireMock.verify(2, WireMock.getRequestedFor(WireMock.urlEqualTo(PATH)));

    }

    // 在刚好达到最大重试次数时请求成功
    // 预期状态码为200,调用次数为3(正常调用1次+请求重试2次)
    @Test
    public void testSyncRetry3() {
        wireMockRule.stubFor(WireMock.get(PATH)
                .inScenario("Retry Scenario")
                .whenScenarioStateIs(Scenario.STARTED)
                .willSetStateTo("First Retry")
                .willReturn(
                        WireMock.aResponse()
                                .withStatus(500)
                                .withHeader("Content-Type", "application/json")
                )
        );
        wireMockRule.stubFor(WireMock.get(PATH)
                .inScenario("Retry Scenario")
                .whenScenarioStateIs("First Retry")
                .willSetStateTo("Second Retry")
                .willReturn(
                        WireMock.aResponse()
                                .withStatus(500)
                                .withHeader("Content-Type", "application/json")
                )
        );
        wireMockRule.stubFor(WireMock.get(PATH)
                .inScenario("Retry Scenario")
                .whenScenarioStateIs("Second Retry")
                .willReturn(
                        WireMock.aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                )
        );

        HcClient hcClient = mockClient(wireMockRule.httpsPort());
        SyncInvoker<Object, SdkResponse> syncInvoker = new SyncInvoker<>(new Object(), requestDef, hcClient)
                .withRetry(2, (sdkResponse, e) -> e instanceof ServerResponseException);

        SdkResponse response = syncInvoker.invoke();
        Assert.assertEquals(200, response.getHttpStatusCode());
        WireMock.verify(3, WireMock.getRequestedFor(WireMock.urlEqualTo(PATH)));

    }

    // 重试一次,预期调用次数为2 (1次正常调用+1次重试)
    @Test(expected = ServerResponseException.class)
    public void testSyncRetry4() {
        wireMockRule.stubFor(WireMock.get(PATH).willReturn(
                        WireMock.aResponse()
                                .withStatus(502)
                                .withHeader("Content-Type", "application/json")
                )
        );

        HcClient hcClient = mockClient(wireMockRule.httpsPort());
        SyncInvoker<Object, SdkResponse> syncInvoker = new SyncInvoker<>(new Object(), requestDef, hcClient)
                .withRetry(1, (sdkResponse, e) -> e instanceof ServerResponseException);
        try {
            syncInvoker.invoke();
        } finally {
            WireMock.verify(2, WireMock.getRequestedFor(WireMock.urlEqualTo(PATH)));
        }
    }

    // 不满足重试条件不重试,预期调用次数为1 (1次正常调用+0次重试)
    @Test(expected = ServerResponseException.class)
    public void testSyncRetry5() {
        wireMockRule.stubFor(WireMock.get(PATH).willReturn(
                        WireMock.aResponse()
                                .withStatus(502)
                                .withHeader("Content-Type", "application/json")
                )
        );

        HcClient hcClient = mockClient(wireMockRule.httpsPort());
        SyncInvoker<Object, SdkResponse> syncInvoker = new SyncInvoker<>(new Object(), requestDef, hcClient)
                .withRetry(10, (sdkResponse, e) -> false);
        try {
            syncInvoker.invoke();
        } finally {
            WireMock.verify(1, WireMock.getRequestedFor(WireMock.urlEqualTo(PATH)));
        }
    }

    // 当发生ServerResponseException(status_code>=500)时进行重试,最大重试次数设置为3
    // 预期状态码为502,调用次数为4(正常调用1次+请求重试3次)
    @Test(expected = ServerResponseException.class)
    public void testAsyncRetry() throws Throwable {
        wireMockRule.stubFor(WireMock.get(PATH).willReturn(
                        WireMock.aResponse()
                                .withStatus(502)
                                .withHeader("Content-Type", "application/json")
                )
        );

        HcClient hcClient = mockClient(wireMockRule.httpsPort());
        AsyncInvoker<Object, SdkResponse> asyncInvoker = new AsyncInvoker<>(new Object(), requestDef, hcClient)
                .withRetry(3, (sdkResponse, e) -> e instanceof ServerResponseException);
        try {
            asyncInvoker.invoke().get();
        } catch (ExecutionException e) {
            throw e.getCause();
        } finally {
            WireMock.verify(4, WireMock.getRequestedFor(WireMock.urlEqualTo(PATH)));
        }
    }

    // 当发生ServerResponseException(status_code>=500)时进行重试,最大重试次数设置为10,第一次重试成功
    // 预期状态码为200,调用次数为2(正常调用1次+请求重试1次)
    @Test
    public void testAsyncRetry2() throws ExecutionException, InterruptedException {
        wireMockRule.stubFor(WireMock.get(PATH)
                .inScenario("Retry Scenario")
                .whenScenarioStateIs(Scenario.STARTED)
                .willSetStateTo("Retry")
                .willReturn(
                        WireMock.aResponse()
                                .withStatus(500)
                                .withHeader("Content-Type", "application/json")
                )
        );
        wireMockRule.stubFor(WireMock.get(PATH)
                .inScenario("Retry Scenario")
                .whenScenarioStateIs("Retry")
                .willReturn(
                        WireMock.aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                )
        );

        HcClient hcClient = mockClient(wireMockRule.httpsPort());
        AsyncInvoker<Object, SdkResponse> asyncInvoker = new AsyncInvoker<>(new Object(), requestDef, hcClient)
                .withRetry(3, (sdkResponse, e) -> e instanceof ServerResponseException);

        SdkResponse response = asyncInvoker.invoke().get();
        Assert.assertEquals(200, response.getHttpStatusCode());
        WireMock.verify(2, WireMock.getRequestedFor(WireMock.urlEqualTo(PATH)));
    }

    // 在刚好达到最大重试次数时请求成功
    // 预期状态码为200,调用次数为3(正常调用1次+请求重试2次)
    @Test
    public void testAsyncRetry3() throws ExecutionException, InterruptedException {
        wireMockRule.stubFor(WireMock.get(PATH)
                .inScenario("Retry Scenario")
                .whenScenarioStateIs(Scenario.STARTED)
                .willSetStateTo("First Retry")
                .willReturn(
                        WireMock.aResponse()
                                .withStatus(500)
                                .withHeader("Content-Type", "application/json")
                )
        );
        wireMockRule.stubFor(WireMock.get(PATH)
                .inScenario("Retry Scenario")
                .whenScenarioStateIs("First Retry")
                .willSetStateTo("Second Retry")
                .willReturn(
                        WireMock.aResponse()
                                .withStatus(500)
                                .withHeader("Content-Type", "application/json")
                )
        );
        wireMockRule.stubFor(WireMock.get(PATH)
                .inScenario("Retry Scenario")
                .whenScenarioStateIs("Second Retry")
                .willReturn(
                        WireMock.aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                )
        );

        HcClient hcClient = mockClient(wireMockRule.httpsPort());
        AsyncInvoker<Object, SdkResponse> asyncInvoker = new AsyncInvoker<>(new Object(), requestDef, hcClient)
                .withRetry(2, (sdkResponse, e) -> e instanceof ServerResponseException);

        SdkResponse response = asyncInvoker.invoke().get();
        Assert.assertEquals(200, response.getHttpStatusCode());
        WireMock.verify(3, WireMock.getRequestedFor(WireMock.urlEqualTo(PATH)));

    }

    // 重试一次,预期调用次数为2 (1次正常调用+1次重试)
    @Test(expected = ServerResponseException.class)
    public void testAsyncRetry4() throws Throwable {
        wireMockRule.stubFor(WireMock.get(PATH).willReturn(
                        WireMock.aResponse()
                                .withStatus(502)
                                .withHeader("Content-Type", "application/json")
                )
        );

        HcClient hcClient = mockClient(wireMockRule.httpsPort());
        AsyncInvoker<Object, SdkResponse> asyncInvoker = new AsyncInvoker<>(new Object(), requestDef, hcClient)
                .withRetry(1, (sdkResponse, e) -> e instanceof ServerResponseException);
        try {
            asyncInvoker.invoke().get();
        } catch (ExecutionException e) {
            throw e.getCause();
        } finally {
            WireMock.verify(2, WireMock.getRequestedFor(WireMock.urlEqualTo(PATH)));
        }
    }

    // 不满足重试条件不重试,预期调用次数为1 (1次正常调用+0次重试)
    @Test(expected = ServerResponseException.class)
    public void testAsyncRetry5() throws Throwable {
        wireMockRule.stubFor(WireMock.get(PATH).willReturn(
                        WireMock.aResponse()
                                .withStatus(502)
                                .withHeader("Content-Type", "application/json")
                )
        );

        HcClient hcClient = mockClient(wireMockRule.httpsPort());
        AsyncInvoker<Object, SdkResponse> asyncInvoker = new AsyncInvoker<>(new Object(), requestDef, hcClient)
                .withRetry(10, (sdkResponse, e) -> false);
        try {
            asyncInvoker.invoke().get();
        } catch (ExecutionException e) {
            throw e.getCause();
        } finally {
            WireMock.verify(1, WireMock.getRequestedFor(WireMock.urlEqualTo(PATH)));
        }
    }
}
