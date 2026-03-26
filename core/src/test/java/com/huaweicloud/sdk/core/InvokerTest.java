/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2026-2026. All rights reserved.
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
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.core.retry.backoff.SdkBackoffStrategy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;
import java.util.concurrent.ExecutionException;

public class InvokerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(InvokerTest.class);
    @ClassRule
    public static WireMockRule wireMockRule = TestUtils.createWireMockRule();
    public static HcClient hcClient;

    @BeforeClass
    public static void setupClass() {
        System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
        System.setProperty("org.eclipse.jetty.LEVEL", "OFF");

        wireMockRule.stubFor(WireMock.get("/v2.1/pp/servers")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("[{\"ires\":\"1\",\"jres\":\"2\"}]")
                        .withStatus(200)));

        hcClient = TestUtils.createHcClient(
                LOGGER, String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort()));
    }

    @Test
    public void testSyncInvoker() {
        SyncInvoker<TestHttpRequestDef.TestRequest, TestHttpRequestDef.TestResponse> syncInvoker = new SyncInvoker<>(
                new TestHttpRequestDef.TestRequest(), TestHttpRequestDef.buildHttpRequestDef(), hcClient);
        TestHttpRequestDef.TestResponse testResponse = syncInvoker.invoke();
        Assert.assertEquals(1, testResponse.getBody().size());
    }

    @Test
    public void testSyncInvokerWithoutBackoffStrategy() {
        SyncInvoker<TestHttpRequestDef.TestRequest, TestHttpRequestDef.TestResponse> syncInvoker = new SyncInvoker<>(
                new TestHttpRequestDef.TestRequest(), TestHttpRequestDef.buildHttpRequestDef(), hcClient);
        TestHttpRequestDef.TestResponse testResponse = syncInvoker.retryTimes(1).retryCondition(
                (r, s) -> true).invoke();
        Assert.assertEquals(1, testResponse.getBody().size());
    }

    @Test
    public void testSyncInvokerWithRetry() {
        SyncInvoker<TestHttpRequestDef.TestRequest, TestHttpRequestDef.TestResponse> syncInvoker = new SyncInvoker<>(
                new TestHttpRequestDef.TestRequest(), TestHttpRequestDef.buildHttpRequestDef(), hcClient);
        TestHttpRequestDef.TestResponse testResponse = syncInvoker.withRetry(
                1, (r, s) -> true).invoke();
        Assert.assertEquals(1, testResponse.getBody().size());
    }

    @Test
    public void testSyncInvokerWithRetry2() {
        SyncInvoker<TestHttpRequestDef.TestRequest, TestHttpRequestDef.TestResponse> syncInvoker = new SyncInvoker<>(
                new TestHttpRequestDef.TestRequest(), TestHttpRequestDef.buildHttpRequestDef(), hcClient);
        TestHttpRequestDef.TestResponse testResponse = syncInvoker.withRetry(
                1, (r, s) -> true, SdkBackoffStrategy.NO_BACKOFF).invoke();
        Assert.assertEquals(1, testResponse.getBody().size());
    }

    @Test
    public void testAsyncInvoker() throws ExecutionException, InterruptedException {
        AsyncInvoker<TestHttpRequestDef.TestRequest, TestHttpRequestDef.TestResponse> asyncInvoker = new AsyncInvoker<>(
                new TestHttpRequestDef.TestRequest(), TestHttpRequestDef.buildHttpRequestDef(), hcClient);

        TestHttpRequestDef.TestResponse testResponse = asyncInvoker.invoke().get();
        Assert.assertEquals(1, testResponse.getBody().size());
    }

    @Test
    public void testAsyncInvokerWithoutBackoffStrategy() throws ExecutionException, InterruptedException {
        AsyncInvoker<TestHttpRequestDef.TestRequest, TestHttpRequestDef.TestResponse> asyncInvoker = new AsyncInvoker<>(
                new TestHttpRequestDef.TestRequest(), TestHttpRequestDef.buildHttpRequestDef(), hcClient);
        TestHttpRequestDef.TestResponse testResponse = asyncInvoker.retryTimes(1).retryCondition(
                (r, s) -> true).invoke().get();
        Assert.assertEquals(1, testResponse.getBody().size());
    }

    @Test
    public void testAsyncInvokerWithRetry() throws ExecutionException, InterruptedException {
        AsyncInvoker<TestHttpRequestDef.TestRequest, TestHttpRequestDef.TestResponse> asyncInvoker = new AsyncInvoker<>(
                new TestHttpRequestDef.TestRequest(), TestHttpRequestDef.buildHttpRequestDef(), hcClient);
        TestHttpRequestDef.TestResponse testResponse = asyncInvoker.withRetry(
                1, (r, s) -> true).invoke().get();
        Assert.assertEquals(1, testResponse.getBody().size());
    }

    @Test
    public void testAsyncInvokerWithRetry2() throws ExecutionException, InterruptedException {
        AsyncInvoker<TestHttpRequestDef.TestRequest, TestHttpRequestDef.TestResponse> asyncInvoker = new AsyncInvoker<>(
                new TestHttpRequestDef.TestRequest(), TestHttpRequestDef.buildHttpRequestDef(), hcClient);
        TestHttpRequestDef.TestResponse testResponse = asyncInvoker.withRetry(
                1, (r, s) -> true, SdkBackoffStrategy.NO_BACKOFF).invoke().get();
        Assert.assertEquals(1, testResponse.getBody().size());
    }
}
