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

import static com.github.tomakehurst.wiremock.client.WireMock.aMultipart;
import static com.github.tomakehurst.wiremock.client.WireMock.binaryEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.containing;

public class TestFormDataClient {

    private static final Logger logger = LoggerFactory.getLogger(TestFormDataClient.class);

    private static final int FILE_SIZE = 1024 * 1024 * 5;

    HcClient hcClient;

    HttpRequestDef<TestHttpRequestDef.TestFormDataRequest, TestHttpRequestDef.TestFormDataResponse> testFormDataDef
            = TestHttpRequestDef.buildTestFormDataRequestDef();

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

        wireMockRule.stubFor(WireMock.post("/upload-formdata")
                .withHeader("Content-Type", containing("multipart/form-data"))
                .withMultipartRequestBody(aMultipart().withName("uuid").withBody(containing("hello")))
                .withMultipartRequestBody(aMultipart().withName("uploadFile")
                        .withBody(binaryEqualTo(new byte[FILE_SIZE]))
                        .withHeader("Content-Type", containing("application/octet-stream")))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", MEDIATYPE.APPLICATION_OCTET_STREAM)
                        .withBody(new byte[FILE_SIZE])
                        .withStatus(200)));
        wireMockRule.start();
    }

    @After
    public void stop() {
        wireMockRule.stop();
    }

    @Test
    public void testUploadDownloadRequest() {

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[FILE_SIZE]);
        TestHttpRequestDef.TestFormDataRequest request = new TestHttpRequestDef.TestFormDataRequest();
        request.withBody(body -> {
            body.setUuid("hello");
            body.withUploadFile(byteArrayInputStream, "text.txt", "application/octet-stream");
        });

        TestHttpRequestDef.TestFormDataResponse response = hcClient.syncInvokeHttp(request, testFormDataDef);

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

}
