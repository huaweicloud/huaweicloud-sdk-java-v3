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
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;

public class TestRegionCreateProject {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestRegionCreateProject.class);

    private static final String EXPECTED_PROJECT_ID = "123456789";
    private static final BasicCredentials CREDENTIALS = new BasicCredentials().withAk("ak").withSk("sk");
    private final HttpConfig config = HttpConfig.getDefaultHttpConfig().withIgnoreSSLVerification(true);

    @Rule
    public WireMockRule wireMockRule;

    @Before
    public void init() {
        System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
        System.setProperty("org.eclipse.jetty.LEVEL", "OFF");

        wireMockRule = TestUtils.createWireMockRule();

        // mock request: GET /v3/projects
        wireMockRule.stubFor(WireMock.get("/v3/projects?name=cn-north-201")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"projects\": []}")
                        .withStatus(200)
                )
        );
        // mock request: GET /v3/regions
        wireMockRule.stubFor(WireMock.get("/v3/regions")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"regions\": [{\"id\": \"cn-north-201\", \"type\": \"public\"}]}")
                        .withStatus(200)
                )
        );
        // mock request: GET /v3/auth/domains
        wireMockRule.stubFor(WireMock.get("/v3/auth/domains")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"domains\": [{\"id\": \"987654321\"}]}")
                        .withStatus(200)
                )
        );
        // mock request: POST /v3/projects
        Map<String, String> map = new HashMap<String, String>(2) {
            private static final long serialVersionUID = -2035197336051896678L;

            {
                put("name", "cn-north-201");
                put("domain_id", "987654321");
            }
        };
        Map<String, Map<String, String>> body = new HashMap<String, Map<String, String>>(1) {
            private static final long serialVersionUID = -1512744733365625026L;

            {
                put("project", map);
            }
        };
        String bodyStr = JsonUtils.toJSON(body);
        wireMockRule.stubFor(WireMock.post(WireMock.urlEqualTo("/v3/projects"))
                .withRequestBody(equalTo(bodyStr))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"project\": {\"id\": \"123456789\"}}")
                        .withStatus(201)
                )
        );
        wireMockRule.start();

        CREDENTIALS.withIamEndpoint(String.format(Locale.ROOT, "http://127.0.0.1:%d", wireMockRule.port()));
    }

    @After
    public void stop() {
        wireMockRule.stop();
    }

    @Test
    public void testCreateProject() {
        TestServiceClient.newBuilder()
                .withCredential(CREDENTIALS)
                .withHttpConfig(config)
                .withRegion(TestRegion.CN_NORTH_201)
                .build();

        try {
            Field projectId = BasicCredentials.class.getDeclaredField("projectId");
            projectId.setAccessible(true);
            Assert.assertEquals(EXPECTED_PROJECT_ID, projectId.get(CREDENTIALS));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOGGER.error(e.getMessage());
        }
    }
}