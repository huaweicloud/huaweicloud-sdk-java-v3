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
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.huaweicloud.sdk.core.auth.AbstractCredentials;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.GlobalCredentials;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.impl.DefaultHttpClient;
import junit.framework.AssertionFailedError;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Paths;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

public class TestCredentials {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestCredentials.class);

    @Rule
    public WireMockRule wireMockRule;

    @Before
    public void init() {
        System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
        System.setProperty("org.eclipse.jetty.LEVEL", "OFF");

        wireMockRule = TestUtils.createWireMockRule();
    }

    @After
    public void stop() {
        wireMockRule.stop();
    }


    @Test(expected = IllegalArgumentException.class)
    public void testWithNullAk() {
        new BasicCredentials().withAk(null).withSk("sk");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithNullSk() {
        new GlobalCredentials().withAk("ak").withSk(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithNullAkSk() {
        new GlobalCredentials().withAk(null).withSk(null);
    }

    @Test
    public void testWithValidAkSk() {
        BasicCredentials credentials = new BasicCredentials().withAk("ak").withSk("sk");
        Assert.assertEquals("ak", credentials.getAk());
        Assert.assertEquals("sk", credentials.getSk());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullAk() {
        BasicCredentials credentials = new BasicCredentials();
        credentials.setAk(null);
        credentials.setSk("sk");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullSk() {
        BasicCredentials credentials = new BasicCredentials();
        credentials.setAk("ak");
        credentials.setSk(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullAkSk() {
        BasicCredentials credentials = new BasicCredentials();
        credentials.setAk(null);
        credentials.setSk(null);
    }

    @Test
    public void testSetValidAkSk() {
        BasicCredentials credentials = new BasicCredentials();
        credentials.setAk("ak");
        credentials.setSk("sk");
        Assert.assertEquals("ak", credentials.getAk());
        Assert.assertEquals("sk", credentials.getSk());
    }

    @Test
    public void testAutoGetProjectId() throws ExecutionException, InterruptedException {
        wireMockRule.stubFor(WireMock.get("/v3/projects?name=region-id-1")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withHeader("X-IAM-Trace-Id", "trace-id")
                        .withBody("{\"projects\":[{\"id\":\"project_id\"}]}")
                        .withStatus(200)));
        wireMockRule.start();

        String iamEndpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        BasicCredentials credentials = new BasicCredentials().withAk("ak").withSk("sk").withIamEndpoint(iamEndpoint);
        HcClient hcClient = TestUtils.createHcClient(LOGGER, iamEndpoint, credentials);
        credentials.processAuthParams(hcClient, "region-id-1").get();
        Assert.assertEquals("project_id", credentials.getProjectId());
    }

    @Test
    public void testEmptyProjectId() throws InterruptedException {
        wireMockRule.stubFor(WireMock.get("/v3/projects?name=region-id-2")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withHeader("X-IAM-Trace-Id", "trace-id")
                        .withBody("{\"projects\":[]}")
                        .withStatus(200)));
        wireMockRule.start();

        String iamEndpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        BasicCredentials credentials = new BasicCredentials().withAk("ak").withSk("sk").withIamEndpoint(iamEndpoint);
        HcClient hcClient = TestUtils.createHcClient(LOGGER, iamEndpoint, credentials);
        try {
            credentials.processAuthParams(hcClient, "region-id-2").get();
            throw new AssertionFailedError("expected exception: Failed to get project id");
        } catch (ExecutionException exception) {
            Assert.assertEquals("failed to get project id of region 'region-id-2' automatically," +
                            " X-IAM-Trace-Id=trace-id." +
                            " Confirm that the project exists in your account, or set project id manually:" +
                            " new BasicCredentials().withAk(ak).withSk(sk).withProjectId(projectId);",
                    exception.getCause().getMessage());
        }
    }

    @Test
    public void testMultiProjectIds() throws InterruptedException {
        wireMockRule.stubFor(WireMock.get("/v3/projects?name=region-id-3")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withHeader("X-IAM-Trace-Id", "trace-id")
                        .withBody("{\"projects\":[{\"id\":\"project_id1\"},{\"id\":\"project_id2\"}]}")
                        .withStatus(200)));
        wireMockRule.start();

        String iamEndpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        BasicCredentials credentials = new BasicCredentials().withAk("ak").withSk("sk").withIamEndpoint(iamEndpoint);
        HcClient hcClient = TestUtils.createHcClient(LOGGER, iamEndpoint, credentials);
        try {
            credentials.processAuthParams(hcClient, "region-id-3").get();
            throw new AssertionFailedError("expected exception: Failed to get project id");
        } catch (ExecutionException exception) {
            Assert.assertEquals("multiple project ids found: [project_id1,project_id2]," +
                            " X-IAM-Trace-Id=trace-id." +
                            " Please select one when initializing the credentials:" +
                            " new BasicCredentials().withAk(ak).withSk(sk).withProjectId(projectId);",
                    exception.getCause().getMessage());
        }
    }

    @Test
    public void testV3AutoGetDomainId() throws ExecutionException, InterruptedException {
        wireMockRule.stubFor(WireMock.get("/v3/auth/domains")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withHeader("X-IAM-Trace-Id", "trace-id")
                        .withBody("{\"domains\":[{\"id\":\"domain_id\"}]}")
                        .withStatus(200)));
        wireMockRule.start();

        String iamEndpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        GlobalCredentials credentials = new GlobalCredentials().withAk("ak1").withSk("sk1").withIamEndpoint(iamEndpoint);
        HcClient hcClient = TestUtils.createHcClient(LOGGER, iamEndpoint, credentials);
        credentials.processAuthParams(hcClient, "region-id").get();
        Assert.assertEquals("domain_id", credentials.getDomainId());
    }

    @Test
    public void testEmptyDomainId() throws Throwable {
        wireMockRule.stubFor(WireMock.get("/v3/auth/domains")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withHeader("X-IAM-Trace-Id", "trace-id")
                        .withBody("{\"domains\":[]}")
                        .withStatus(200)));
        wireMockRule.start();

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        GlobalCredentials credentials = new GlobalCredentials().withAk("ak2").withSk("sk2").withIamEndpoint(endpoint);
        HcClient hcClient = TestUtils.createHcClient(LOGGER, endpoint, credentials);
        try {
            credentials.processAuthParams(hcClient, "region-id").get();
            Assert.fail("should throw SdkException");
        } catch (ExecutionException e) {
            Assert.assertTrue(e.getCause().getMessage().contains("Failed to get domain id"));
        }
    }

    @Test
    public void testV5AutoGetDomainId() throws ExecutionException, InterruptedException {
        wireMockRule.stubFor(WireMock.get("/v3/auth/domains")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withHeader("X-IAM-Trace-Id", "trace-id")
                        .withBody("{\"domains\":[]}")
                        .withStatus(200)));
        wireMockRule.stubFor(WireMock.get("/v5/caller-identity")
                .willReturn(WireMock.aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"account_id\":\"domain_id\",\"principal_urn\":\"xxx\",\"principal_id\": \"xxx\"}")
                ));
        wireMockRule.start();

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        System.setProperty(Constants.STS_ENDPOINT_PROPERTY_NAME, endpoint);
        GlobalCredentials credentials = new GlobalCredentials().withAk("ak1124").withSk("sk1124")
                .withIamEndpoint(endpoint);
        HcClient hcClient = TestUtils.createHcClient(LOGGER, endpoint, credentials);
        try {
            credentials.processAuthParams(hcClient, "region-id").get();
        } finally {
            System.clearProperty(Constants.STS_ENDPOINT_PROPERTY_NAME);
        }
        Assert.assertEquals("domain_id", credentials.getDomainId());
    }

    @Test
    public void testV5AutoGetDomainIdWithStatus404() throws InterruptedException {
        wireMockRule.stubFor(WireMock.get("/v3/auth/domains")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withHeader("X-IAM-Trace-Id", "trace-id")
                        .withBody("{\"domains\":[]}")
                        .withStatus(200)));
        wireMockRule.stubFor(WireMock.get("/v5/caller-identity")
                .willReturn(WireMock.aResponse()
                        .withStatus(404)
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withHeader("x-request-id", "request-id")
                        .withBody("{\"error_code\":\"XXX.001\",\"error_msg\":\"api not exist\"}")
                ));
        wireMockRule.start();

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        System.setProperty(Constants.STS_ENDPOINT_PROPERTY_NAME, endpoint);
        GlobalCredentials credentials = new GlobalCredentials().withAk("ak404").withSk("sk404")
                .withIamEndpoint(endpoint);
        HcClient hcClient = TestUtils.createHcClient(LOGGER, endpoint, credentials);
        try {
            credentials.processAuthParams(hcClient, "region-id").get();
            Assert.fail("should throw SdkException");
        } catch (ExecutionException e) {
            Assert.assertEquals("failed to get domain id automatically, 404, requestId: request-id",
                    e.getCause().getMessage());
        } finally {
            System.clearProperty(Constants.STS_ENDPOINT_PROPERTY_NAME);
        }
    }

    @Test
    public void testFederalCredential() {
        wireMockRule.stubFor(WireMock.post("/v3.0/OS-AUTH/id-token/tokens")
                .withHeader("X-Idp-Id", WireMock.equalTo("idp_id"))
                .withRequestBody(WireMock.equalToJson("{\"auth\":{\"id_token\":{\"id\":\"id_token\"}}}"))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withHeader("X-IAM-Trace-Id", "trace-id")
                        .withHeader("X-Subject-Token", "auth-token")
                        .withBody("{\"token\":" +
                                "{\"expires_at\":\"2018-03-13T03:00:01.168000Z\",\"methods\":[\"mapped\"]}}")
                        .withStatus(200)));
        wireMockRule.stubFor(WireMock.post("/v3.0/OS-CREDENTIAL/securitytokens")
                .withRequestBody(WireMock.equalToJson("{\"auth\":{\"identity\":" +
                        "{\"methods\":[\"token\"],\"token\":" +
                        "{\"id\":\"auth-token\",\"duration_seconds\":21600}}}}"))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withHeader("X-IAM-Trace-Id", "trace-id")
                        .withBody("{\"credential\":{\"access\":\"ak\"," +
                                "\"expires_at\":\"2020-01-08T03:50:07.574000Z\"," +
                                "\"secret\":\"sk\"," +
                                "\"securitytoken\":\"sec-token\"}}")
                        .withStatus(200)));
        wireMockRule.start();

        String iamEndpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        String filePath = Paths.get("src", "test", "resources", "TestIdTokenFile")
                .toAbsolutePath().toString();
        AbstractCredentials<?> credentials = new BasicCredentials()
                .withIdpId("idp_id")
                .withIdTokenFile(filePath)
                .withIamEndpoint(iamEndpoint);
        HttpRequest request = HttpRequest.newBuilder()
                .withMethod(HttpMethod.GET)
                .withPath("/test")
                .withEndpoint(iamEndpoint)
                .build();
        DefaultHttpClient client = new DefaultHttpClient(
                HttpConfig.getDefaultHttpConfig().withIgnoreSSLVerification(true));
        request = credentials.syncProcessAuthRequest(request, client);
        Assert.assertEquals("sec-token", request.getHeader("X-Security-Token"));
        Assert.assertEquals("ak", credentials.getAk());
        Assert.assertEquals("sk", credentials.getSk());
        Assert.assertEquals("sec-token", credentials.getSecurityToken());
    }
}
