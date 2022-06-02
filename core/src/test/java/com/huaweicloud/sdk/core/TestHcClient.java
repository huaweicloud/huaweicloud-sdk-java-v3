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

package com.huaweicloud.sdk.core;

import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.matching.MatchResult;
import com.github.tomakehurst.wiremock.matching.StringValuePattern;
import com.huaweicloud.sdk.core.Constants.MEDIATYPE;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;

public class TestHcClient {

    private static final Logger logger = LoggerFactory.getLogger(TestHcClient.class);

    private static final int FILE_SIZE = 1024 * 1024 * 5;

    HcClient hcClient;

    HttpRequestDef<TestHttpRequestDef.TestRequest, TestHttpRequestDef.TestResponse> requestDef
            = TestHttpRequestDef.buildHttpRequestDef();

    HttpRequestDef<TestHttpRequestDef.TestNoBodyRequest, TestHttpRequestDef.TestResponse> requestNoRequestBodyDef
            = TestHttpRequestDef.buildHttpRequestNoRequestBodyDef();

    HttpRequestDef<TestHttpRequestDef.TestUploadDownloadRequest, TestHttpRequestDef.TestUploadDownloadResponse>
            testUploadDownloadDef = TestHttpRequestDef.buildTestUploadDownloadRequestDef();

    HttpRequestDef<TestHttpRequestDef.TestCustomAuthorizationRequest,
            TestHttpRequestDef.TestCustomAuthorizationResponse> testCustomizeAuthorizationDef =
            TestHttpRequestDef.buildTestCustomizedAuthorizationRequestDef();

    @Rule
    public WireMockRule wireMockRule;

    @Before
    public void init() {

        System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
        System.setProperty("org.eclipse.jetty.LEVEL", "OFF");

        wireMockRule = new WireMockRule(
                WireMockConfiguration.options().httpsPort(8999).port(8998).disableRequestJournal());

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
                .withEndpoint("https://127.0.0.1:8999");

        wireMockRule.stubFor(WireMock.get("/v2.1/pp/servers")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", MEDIATYPE.APPLICATION_JSON)
                        .withBody("[{\"ires\":\"1\",\"jres\":\"2\"},{\"ires\":\"2\",\"jres\":\"3\"}]")
                        .withStatus(200)));
        wireMockRule.stubFor(WireMock.put("/v2.1/pp/servers")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", MEDIATYPE.APPLICATION_JSON)
                        .withBody("[{\"ires\":\"1\",\"jres\":\"2\"},{\"ires\":\"2\",\"jres\":\"3\"}]")
                        .withStatus(200)));
        wireMockRule.stubFor(WireMock.post("/uploaddownload")
                .andMatching(request -> MatchResult.of(request.getBody().length == FILE_SIZE))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", MEDIATYPE.APPLICATION_OCTET_STREAM)
                        .withBody(new byte[FILE_SIZE])
                        .withStatus(200)));

        StringValuePattern expectedHeader = equalTo("test");
        wireMockRule.stubFor(WireMock.post("/v3/oidc/authorization")
                .withHeader("Authorization", expectedHeader)
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", MEDIATYPE.APPLICATION_JSON)
                        .withHeader("token", "success")
                        .withBody("")
                        .withStatus(200)));
        wireMockRule.start();
    }

    @After
    public void stop() {
        wireMockRule.stop();
    }

    @Test
    public void testAsyncClient() throws ExecutionException, InterruptedException {
        CompletableFuture<TestHttpRequestDef.TestResponse> future = callAsync(new TestHttpRequestDef.TestRequest());
        TestHttpRequestDef.TestResponse response = future.get();
        Assert.assertNotNull(response.getBody());
        TestHttpRequestDef.InnerResponse[] result = new TestHttpRequestDef.InnerResponse[] {
                new TestHttpRequestDef.InnerResponse().withIres("1").withJres("2"),
                new TestHttpRequestDef.InnerResponse().withIres("2").withJres("3")
        };
        Assert.assertArrayEquals(response.getBody().toArray(), result);
    }

    @Test
    public void testAsyncClientNoRequestBody() throws ExecutionException, InterruptedException {
        CompletableFuture<TestHttpRequestDef.TestResponse> future = callNoRequestBodyAsync(
                new TestHttpRequestDef.TestNoBodyRequest());
        TestHttpRequestDef.TestResponse response = future.get();
        Assert.assertNotNull(response.getBody());
        TestHttpRequestDef.InnerResponse[] result = new TestHttpRequestDef.InnerResponse[] {
                new TestHttpRequestDef.InnerResponse().withIres("1").withJres("2"),
                new TestHttpRequestDef.InnerResponse().withIres("2").withJres("3")
        };
        Assert.assertArrayEquals(response.getBody().toArray(), result);
    }

    public CompletableFuture<TestHttpRequestDef.TestResponse> callAsync(TestHttpRequestDef.TestRequest request) {
        return hcClient.asyncInvokeHttp(request, requestDef);
    }

    public CompletableFuture<TestHttpRequestDef.TestResponse> callNoRequestBodyAsync(
            TestHttpRequestDef.TestNoBodyRequest request) {
        return hcClient.asyncInvokeHttp(request, requestNoRequestBodyDef);
    }

    @Test
    public void testUploadDownloadRequest() {

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[FILE_SIZE]);
        TestHttpRequestDef.TestUploadDownloadRequest testUploadDownloadRequest
                = new TestHttpRequestDef.TestUploadDownloadRequest();
        testUploadDownloadRequest.setUploadStream(byteArrayInputStream);
        TestHttpRequestDef.TestUploadDownloadResponse response = hcClient.syncInvokeHttp(testUploadDownloadRequest,
                testUploadDownloadDef);

        response.consumeDownloadStream(inputStream -> {
            byte[] bytes = new byte[512];
            int len;
            int totalLen = 0;
            try {
                while ((len = inputStream.read(bytes)) != -1) {
                    totalLen = totalLen + len;
                }
                Assert.assertEquals(totalLen, FILE_SIZE);
            } catch (IOException e) {
                logger.error("Download file error ", e);
            }
        });
    }

    @Test
    public void testCustomizedHeaderRequest() throws ExecutionException, InterruptedException {
        CompletableFuture<TestHttpRequestDef.TestCustomAuthorizationResponse> future = callCustomAuthorizationAsync(
                new TestHttpRequestDef.TestCustomAuthorizationRequest().withAuthorization("test"));
        TestHttpRequestDef.TestCustomAuthorizationResponse response = future.get();
        Assert.assertEquals(response.getToken(), "success");
    }

    public CompletableFuture<TestHttpRequestDef.TestCustomAuthorizationResponse> callCustomAuthorizationAsync(
            TestHttpRequestDef.TestCustomAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, testCustomizeAuthorizationDef);
    }

}
