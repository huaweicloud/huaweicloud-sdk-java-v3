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
import com.huaweicloud.sdk.core.Constants.MEDIATYPE;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.util.Locale;

import static com.github.tomakehurst.wiremock.client.WireMock.aMultipart;
import static com.github.tomakehurst.wiremock.client.WireMock.binaryEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.containing;

public class TestFormDataClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestFormDataClient.class);

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

        wireMockRule = TestUtils.createWireMockRule();

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

        hcClient = TestUtils.createHcClient(
                LOGGER, String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort()));
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

        response.consumeDownloadStream(TestUtils.getDownloadConsumer(LOGGER));
    }

}
