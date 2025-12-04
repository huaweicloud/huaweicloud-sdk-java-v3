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
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.matching.MatchResult;
import com.huaweicloud.sdk.core.Constants.MEDIATYPE;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.exchange.SdkExchange;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.progress.ProgressListener;
import com.huaweicloud.sdk.core.progress.ProgressStatus;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;

public class TestHcClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestHcClient.class);

    private static final int FILE_SIZE = 1024 * 1024 * 5;

    HcClient hcClient;

    HttpRequestDef<TestHttpRequestDef.TestRequest, TestHttpRequestDef.TestResponse> requestDef
            = TestHttpRequestDef.buildHttpRequestDef();

    HttpRequestDef<TestHttpRequestDef.TestNoBodyRequest, TestHttpRequestDef.TestResponse> requestNoRequestBodyDef
            = TestHttpRequestDef.buildHttpRequestNoRequestBodyDef();

    HttpRequestDef<TestHttpRequestDef.TestUploadDownloadRequest, TestHttpRequestDef.TestUploadDownloadResponse>
            testUploadDownloadDef = TestHttpRequestDef.buildTestUploadDownloadRequestDef();

    HttpRequestDef<TestHttpRequestDef.TestUploadDownloadRequest, SdkResponse>
            testUploadDef = TestHttpRequestDef.buildTestUploadRequestDef();

    HttpRequestDef<TestHttpRequestDef.TestProgressRequest, TestHttpRequestDef.TestUploadDownloadResponse>
            testDownloadDef = TestHttpRequestDef.buildTestDownloadRequestDef();

    HttpRequestDef<TestHttpRequestDef.TestCustomAuthorizationRequest,
            TestHttpRequestDef.TestCustomAuthorizationResponse> testCustomizeAuthorizationDef =
            TestHttpRequestDef.buildTestCustomizedAuthorizationRequestDef();

    @Rule
    public WireMockRule wireMockRule;

    @Before
    public void init() {
        System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
        System.setProperty("org.eclipse.jetty.LEVEL", "OFF");

        wireMockRule = TestUtils.createWireMockRule();

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
                        .withHeader(Constants.CONTENT_TYPE, MEDIATYPE.APPLICATION_OCTET_STREAM)
                        .withBody(new byte[FILE_SIZE])
                        .withStatus(200)));
        wireMockRule.stubFor(WireMock.post("/upload")
                .andMatching(request -> MatchResult.of(request.getBody().length == FILE_SIZE))
                .willReturn(WireMock.aResponse()
                        .withHeader(Constants.CONTENT_TYPE, MEDIATYPE.APPLICATION_JSON)
                        .withStatus(204)));
        wireMockRule.stubFor(WireMock.post("/download")
                .willReturn(WireMock.aResponse()
                        .withHeader(Constants.CONTENT_TYPE, MEDIATYPE.APPLICATION_OCTET_STREAM)
                        .withBody(new byte[FILE_SIZE])
                        .withStatus(200)));

        wireMockRule.stubFor(WireMock.post("/v3/oidc/authorization")
                .withHeader("Authorization", equalTo("test"))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", MEDIATYPE.APPLICATION_JSON)
                        .withHeader("token", "success")
                        .withBody("")
                        .withStatus(200)));

        wireMockRule.stubFor(WireMock.get("/user-agent")
                .withHeader("User-Agent", equalTo("huaweicloud-usdk-java/3.0"))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", MEDIATYPE.APPLICATION_JSON)
                        .withBody("")
                        .withStatus(200)));

        wireMockRule.stubFor(WireMock.get("/host")
                .withHeader("Host", equalTo("www.example.com"))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", MEDIATYPE.APPLICATION_JSON)
                        .withBody("")
                        .withStatus(200)));

        wireMockRule.stubFor(WireMock.get("/test-extra-headers")
                .withHeader("User-Agent", equalTo("huaweicloud-usdk-java/3.0; test-user-agent"))
                .withHeader("Test-Client-Header", equalTo("Test-Client-Header-Value"))
                .withHeader("Test-Request-Override-Client-Header", equalTo("Test-Request-Header-Value"))
                .withHeader("Test-Request-Header", equalTo("Test-Request-Header-Value"))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", MEDIATYPE.APPLICATION_JSON)
                        .withBody("")
                        .withStatus(200)));

        wireMockRule.stubFor(WireMock.get("/")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", MEDIATYPE.APPLICATION_JSON)
                        .withBody("")
                        .withStatus(200)));

        wireMockRule.stubFor(WireMock.get("/custom-user-agent")
                .withHeader("User-Agent", equalTo("huaweicloud-usdk-java/3.0; Custom user agent"))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", MEDIATYPE.APPLICATION_JSON)
                        .withBody("")
                        .withStatus(200)));

        wireMockRule.start();

        hcClient = TestUtils.createHcClient(
                LOGGER, String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort()));
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
        TestHttpRequestDef.InnerResponse[] result = new TestHttpRequestDef.InnerResponse[]{
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
        TestHttpRequestDef.InnerResponse[] result = new TestHttpRequestDef.InnerResponse[]{
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

        response.consumeDownloadStream(TestUtils.getDownloadConsumer(LOGGER));
    }

    @Test
    public void testUploadProgressRequest() {
        TestHttpRequestDef.TestUploadDownloadRequest testUploadDownloadRequest
                = new TestHttpRequestDef.TestUploadDownloadRequest();
        TestProgressListener testProgressListener = new TestProgressListener();
        testUploadDownloadRequest.setProgressListener(testProgressListener);
        testUploadDownloadRequest.setProgressInterval(1024 * 1024L);

        SdkResponse response = null;
        try (InputStream inputStream = new ByteArrayInputStream(new byte[FILE_SIZE])) {
            testUploadDownloadRequest.setUploadStream(inputStream);
            response = hcClient.syncInvokeHttp(testUploadDownloadRequest, testUploadDef);
        } catch (IOException e) {
            LOGGER.error(String.valueOf(e));
        }

        Assert.assertNotNull(response);
        Assert.assertEquals(204, response.getHttpStatusCode());
        Assert.assertEquals(FILE_SIZE, testProgressListener.transferredBytes);
        Assert.assertEquals(100, testProgressListener.transferPercentage);
    }

    @Test
    public void testDownloadProgressRequest() {
        TestHttpRequestDef.TestProgressRequest testProgressRequest = new TestHttpRequestDef.TestProgressRequest();
        TestProgressListener testProgressListener = new TestProgressListener();
        testProgressRequest.setProgressListener(testProgressListener);
        testProgressRequest.setProgressInterval(1024 * 1024L);

        TestHttpRequestDef.TestUploadDownloadResponse response = hcClient.syncInvokeHttp(
                testProgressRequest, testDownloadDef);

        response.consumeDownloadStream(TestUtils.getDownloadConsumer(LOGGER));
        Assert.assertEquals(FILE_SIZE, testProgressListener.transferredBytes);
        Assert.assertEquals(100, testProgressListener.transferPercentage);
    }

    @Test
    public void testCustomizedHeaderRequest() throws ExecutionException, InterruptedException {
        CompletableFuture<TestHttpRequestDef.TestCustomAuthorizationResponse> future = callCustomAuthorizationAsync(
                new TestHttpRequestDef.TestCustomAuthorizationRequest().withAuthorization("test"));
        TestHttpRequestDef.TestCustomAuthorizationResponse response = future.get();
        Assert.assertEquals("success", response.getToken());
    }

    @SuppressWarnings("rawtypes,unchecked")
    @Test
    public void testUserAgentHeader() {
        HttpRequestDef reqDef = new HttpRequestDef.Builder(HttpMethod.GET, Object.class, SdkResponse.class)
                .withName("TestUserAgent")
                .withUri("/user-agent")
                .withContentType("application/json").build();
        SdkResponse response = (SdkResponse) hcClient.syncInvokeHttp(new Object(), reqDef);
        Assert.assertEquals(200, response.getHttpStatusCode());
    }

    @SuppressWarnings("rawtypes,unchecked")
    @Test
    public void testCustomeUserAgentHeader() {
        HttpRequestDef reqDef = new HttpRequestDef.Builder(HttpMethod.GET, Object.class, SdkResponse.class)
                .withName("TestCustomUserAgent")
                .withUri("/custom-user-agent")
                .withContentType("application/json").build();
        HcClient client = TestUtils.createHcClientWithUaConfig(
                String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort()));
        SdkResponse response = (SdkResponse) client.syncInvokeHttp(new Object(), reqDef);
        Assert.assertEquals(200, response.getHttpStatusCode());
    }

    @SuppressWarnings("rawtypes,unchecked")
    @Test
    public void testHostHeader() {
        HttpRequestDef reqDef = new HttpRequestDef.Builder(HttpMethod.GET, Object.class, SdkResponse.class)
                .withName("TestHost")
                .withUri("/host")
                .withContentType("application/json").build();
        Map<String, String> map = new HashMap<>();
        map.put("Host", "www.example.com");
        SdkResponse response = (SdkResponse) hcClient.withExtraHeaders(map).syncInvokeHttp(new Object(), reqDef);
        Assert.assertEquals(200, response.getHttpStatusCode());
    }

    @SuppressWarnings("rawtypes,unchecked")
    @Test
    public void testExtraHeaders() {
        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        HcClient client = new HcClient(HttpConfig.getDefaultHttpConfig().withIgnoreSSLVerification(true))
                .withCredential(new BasicCredentials().withAk("test").withSk("test"))
                .withEndpoints(Collections.singletonList(endpoint))
                .withExtraHeaders(new HashMap<String, String>() {
                    private static final long serialVersionUID = 1073936404033112671L;

                    {
                        put("User-Agent", "test-user-agent");
                        put("Test-Client-Header", "Test-Client-Header-Value");
                        put("Test-Request-Override-Client-Header", "Test-Client-Header-Value");
                    }
                });
        HttpRequestDef reqDef = new HttpRequestDef.Builder(HttpMethod.GET, Object.class, SdkResponse.class)
                .withName("TestExtraHeaders")
                .withUri("/test-extra-headers")
                .withContentType("application/json").build();
        SdkResponse response = (SdkResponse) client.syncInvokeHttp(new Object(), reqDef, new SdkExchange(),
                new HashMap<String, String>() {
                    private static final long serialVersionUID = -2523946305257291275L;

                    {
                        put("Test-Request-Override-Client-Header", "Test-Request-Header-Value");
                        put("Test-Request-Header", "Test-Request-Header-Value");
                    }
                });
        Assert.assertEquals(200, response.getHttpStatusCode());
    }

    @SuppressWarnings("rawtypes,unchecked")
    @Test
    public void testMultipleClients() {
        for (int i = 0; i < 100; i++) {
            HttpRequestDef reqDef = new HttpRequestDef.Builder(HttpMethod.GET, Object.class, SdkResponse.class)
                    .withName("testMultipleClients").withContentType("application/json").build();
            SdkResponse response = (SdkResponse) hcClient.syncInvokeHttp(new Object(), reqDef);
            Assert.assertEquals(200, response.getHttpStatusCode());
        }
    }

    public CompletableFuture<TestHttpRequestDef.TestCustomAuthorizationResponse> callCustomAuthorizationAsync(
            TestHttpRequestDef.TestCustomAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, testCustomizeAuthorizationDef);
    }

    static class TestProgressListener implements ProgressListener {

        private long transferredBytes;

        private int transferPercentage;

        @Override
        public void progressChanged(ProgressStatus status) {
            LOGGER.info("AverageSpeed: {}, TransferPercentage: {}%",
                    status.getAverageSpeed(), status.getTransferPercentage());

            transferredBytes = status.getTransferredBytes();
            transferPercentage = status.getTransferPercentage();
        }
    }
}
