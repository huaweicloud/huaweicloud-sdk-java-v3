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

package com.huaweicloud.sdk.corexml;

import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.HttpListener;
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

import java.util.Arrays;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalToXml;

public class TestHcClient {
    private static final Logger logger = LoggerFactory.getLogger(TestHcClient.class);

    HcClient hcClient;

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

        ResponseDefinitionBuilder resp = aResponse().withHeader("Content-Type", "application/xml")
                .withBody("<Response><id>100</id><name>test</name><success>true</success>" +
                        "<list>aaa</list><list>bbb</list><list>ccc</list></Response>")
                .withStatus(200);

        MappingBuilder aReturn = WireMock.post("/test-xml")
                .withHeader("Content-Type", WireMock.containing("application/xml"))
                .withRequestBody(equalToXml("<Body><obj><str>value</str></obj></Body>"))
                .willReturn(resp);

        wireMockRule.stubFor(aReturn);

        wireMockRule.start();

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
                .withEndpoints(Arrays.asList("https://127.0.0.1:" + wireMockRule.httpsPort()));

    }

    @After
    public void reset() {
        wireMockRule.stop();
    }

    @Test
    public void testXmlRequest() {
        HttpRequestDef<TestHttpRequestDef.TestXmlRequest, TestHttpRequestDef.TestXmlResponse>
                def = TestHttpRequestDef.buildTestXmlRequestDef();

        TestHttpRequestDef.Obj obj = new TestHttpRequestDef.Obj();
        obj.setStr("value");

        TestHttpRequestDef.TestXmlRequestBody body = new TestHttpRequestDef.TestXmlRequestBody();
        body.setObj(obj);

        TestHttpRequestDef.TestXmlRequest request = new TestHttpRequestDef.TestXmlRequest();
        request.setBody(body);

        TestHttpRequestDef.TestXmlResponse response = hcClient.syncInvokeHttp(request, def);

        Assert.assertEquals("test", response.getName());
        Assert.assertEquals(100, response.getId().intValue());
        Assert.assertEquals(true, response.getSuccess());
        Assert.assertEquals(3, response.getList().size());
    }
}
