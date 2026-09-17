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
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.auth.PodIdentityCredentialProvider;
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
import org.junit.contrib.java.lang.system.EnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Paths;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

public class CredentialsProcessTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(CredentialsProcessTest.class);
    private static final String TOKEN_FILE = Paths.get("src", "test", "resources", "TestTokenFile")
            .toAbsolutePath().toString();

    @Rule
    public WireMockRule wireMockRule = TestUtils.createWireMockRule();
    @Rule
    public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

    static {
        System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
        System.setProperty("org.eclipse.jetty.LEVEL", "OFF");
    }

    @Before
    public void start() {
        wireMockRule.start();
    }

    @After
    public void stop() {
        wireMockRule.stop();
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
    public void testV5AutoGetDomainIdWithStatus500() throws InterruptedException {
        wireMockRule.stubFor(WireMock.get("/v3/auth/domains")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"domains\":[]}")
                        .withStatus(200)));
        wireMockRule.stubFor(WireMock.get("/v5/caller-identity")
                .willReturn(WireMock.aResponse()
                        .withStatus(500)
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"error_code\":\"STS.001\",\"error_msg\":\"internal error\"}")
                ));
        wireMockRule.start();

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        System.setProperty(Constants.STS_ENDPOINT_PROPERTY_NAME, endpoint);
        GlobalCredentials credentials = new GlobalCredentials().withAk("ak500").withSk("sk500")
                .withIamEndpoint(endpoint);
        HcClient hcClient = TestUtils.createHcClient(LOGGER, endpoint, credentials);
        try {
            credentials.processAuthParams(hcClient, "region-id").get();
            Assert.fail("should throw SdkException");
        } catch (ExecutionException e) {
            Assert.assertTrue(e.getCause().getMessage().startsWith("failed to get domain id automatically"));
            Assert.assertFalse(e.getCause().getMessage().contains("404"));
        } finally {
            System.clearProperty(Constants.STS_ENDPOINT_PROPERTY_NAME);
        }
    }

    @Test
    public void testV5AutoGetDomainIdWithStatus403() throws InterruptedException {
        wireMockRule.stubFor(WireMock.get("/v3/auth/domains")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"domains\":[]}")
                        .withStatus(200)));
        wireMockRule.stubFor(WireMock.get("/v5/caller-identity")
                .willReturn(WireMock.aResponse()
                        .withStatus(403)
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"error_code\":\"STS.403\",\"error_msg\":\"forbidden\"}")
                ));
        wireMockRule.start();

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        System.setProperty(Constants.STS_ENDPOINT_PROPERTY_NAME, endpoint);
        GlobalCredentials credentials = new GlobalCredentials().withAk("ak403").withSk("sk403")
                .withIamEndpoint(endpoint);
        HcClient hcClient = TestUtils.createHcClient(LOGGER, endpoint, credentials);
        try {
            credentials.processAuthParams(hcClient, "region-id").get();
            Assert.fail("should throw SdkException");
        } catch (ExecutionException e) {
            Assert.assertTrue(e.getCause().getMessage().startsWith("failed to get domain id automatically"));
            Assert.assertFalse(e.getCause().getMessage().contains("404"));
        } finally {
            System.clearProperty(Constants.STS_ENDPOINT_PROPERTY_NAME);
        }
    }

    @Test
    public void testV5AutoGetDomainIdWithNullAccountId() throws InterruptedException {
        wireMockRule.stubFor(WireMock.get("/v3/auth/domains")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"domains\":[]}")
                        .withStatus(200)));
        wireMockRule.stubFor(WireMock.get("/v5/caller-identity")
                .willReturn(WireMock.aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"principal_urn\":\"xxx\",\"principal_id\":\"xxx\"}")
                ));
        wireMockRule.start();

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        System.setProperty(Constants.STS_ENDPOINT_PROPERTY_NAME, endpoint);
        GlobalCredentials credentials = new GlobalCredentials().withAk("aknull").withSk("sknull")
                .withIamEndpoint(endpoint);
        HcClient hcClient = TestUtils.createHcClient(LOGGER, endpoint, credentials);
        try {
            credentials.processAuthParams(hcClient, "region-id").get();
            Assert.fail("should throw SdkException");
        } catch (ExecutionException e) {
            Assert.assertTrue(e.getCause().getMessage().contains("Failed to get domain id"));
        } finally {
            System.clearProperty(Constants.STS_ENDPOINT_PROPERTY_NAME);
        }
    }

    @Test
    public void testFederalCredential() {
        wireMockRule.stubFor(WireMock.post("/v3.0/OS-AUTH/id-token/tokens")
                .withHeader("X-Idp-Id", WireMock.equalTo("idp_id"))
                .withRequestBody(WireMock.equalToJson("{\"auth\":{\"id_token\":{\"id\":\"token_value\"}}}"))
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
        AbstractCredentials<?> credentials = new BasicCredentials()
                .withIdpId("idp_id")
                .withIdTokenFile(TOKEN_FILE)
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

    @Test
    public void testPodIdentityCredential() {
        wireMockRule.stubFor(WireMock.post("/v1/credentials")
                .withRequestBody(WireMock.equalToJson("{}"))
                .withHeader("Authorization", WireMock.equalTo("token_value"))
                .willReturn(WireMock.aResponse()
                        .withBody("{\"assumedAgency\":{\"urn\":\"\",\"id\":\"\"}," +
                                "\"audience\":\"\",\"credentials\":" +
                                "{\"accessKeyId\":\"ak\",\"secretAccessKey\":\"sk\"," +
                                "\"securityToken\":\"st\",\"expiration\":\"2020-01-08T03:50:07.574000Z\"}," +
                                "\"podIdentityAssociationId\":\"\",\"subject\":" +
                                "{\"namespace\":\"\",\"serviceAccount\":\"\"}}")
                )
        );

        String uri = String.format(Locale.ENGLISH, "http://localhost:%d/v1/credentials", wireMockRule.port());
        environmentVariables.set("HC_CONTAINER_CREDENTIALS_FULL_URI", uri)
                .set("HC_CONTAINER_AUTHORIZATION_TOKEN_FILE", TOKEN_FILE);

        PodIdentityCredentialProvider basic = PodIdentityCredentialProvider.basic();
        BasicCredentials basicCredentials = (BasicCredentials) basic.getCredentials();

        Assert.assertEquals("ak", basicCredentials.getAk());
        Assert.assertEquals("sk", basicCredentials.getSk());
        Assert.assertEquals("st", basicCredentials.getSecurityToken());

        environmentVariables.clear("HC_CONTAINER_CREDENTIALS_FULL_URI",
                "HC_CONTAINER_AUTHORIZATION_TOKEN_FILE");
    }

    private void stubOidcAssumeAgency(String tempAk, String tempSk, String tempToken) {
        String body = String.format("{\"credentials\":{" +
                "\"access_key_id\":\"%s\",\"secret_access_key\":\"%s\"," +
                "\"security_token\":\"%s\"," +
                "\"expiration\":\"2099-01-01T00:00:00.123Z\"}}",
                tempAk, tempSk, tempToken);
        wireMockRule.stubFor(WireMock.post("/v5/agencies/assume-with-oidc")
                .willReturn(WireMock.aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody(body)));
    }

    private HcClient createPlainHcClient(String endpoint, ICredential credentials) {
        return new HcClient(new HttpConfig().withIgnoreSSLVerification(true)
                .withConnectionTimeout(600))
                .withCredential(credentials)
                .withEndpoints(Collections.singletonList(endpoint));
    }

    @Test
    public void testOidcAuthWithAutoGetProjectId() throws ExecutionException, InterruptedException {
        stubOidcAssumeAgency("temp-ak-1", "temp-sk-1", "temp-token-1");
        wireMockRule.stubFor(WireMock.get("/v3/projects?name=region-id-1")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"projects\":[{\"id\":\"project_id_1\"}]}")
                        .withStatus(200)));

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        BasicCredentials credentials = new BasicCredentials()
                .withIdToken("test-id-token")
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint);
        HcClient hcClient = createPlainHcClient(endpoint, credentials);
        credentials.processAuthParams(hcClient, "region-id-1").get();

        Assert.assertEquals("temp-ak-1", credentials.getAk());
        Assert.assertEquals("temp-sk-1", credentials.getSk());
        Assert.assertEquals("temp-token-1", credentials.getSecurityToken());
        Assert.assertEquals("project_id_1", credentials.getProjectId());
    }

    @Test
    public void testOidcAuthWithAutoGetDomainId() throws ExecutionException, InterruptedException {
        stubOidcAssumeAgency("temp-ak-2", "temp-sk-2", "temp-token-2");
        wireMockRule.stubFor(WireMock.get("/v3/auth/domains")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"domains\":[{\"id\":\"domain_id_2\"}]}")
                        .withStatus(200)));

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        GlobalCredentials credentials = new GlobalCredentials()
                .withIdToken("test-id-token")
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint);
        HcClient hcClient = createPlainHcClient(endpoint, credentials);
        credentials.processAuthParams(hcClient, "region-id").get();

        Assert.assertEquals("temp-ak-2", credentials.getAk());
        Assert.assertEquals("temp-sk-2", credentials.getSk());
        Assert.assertEquals("temp-token-2", credentials.getSecurityToken());
        Assert.assertEquals("domain_id_2", credentials.getDomainId());
    }

    @Test
    public void testOidcAuthWithProjectIdSkipsAutoGet() throws ExecutionException, InterruptedException {
        stubOidcAssumeAgency("temp-ak-3", "temp-sk-3", "temp-token-3");

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        BasicCredentials credentials = new BasicCredentials()
                .withIdToken("test-id-token")
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint)
                .withProjectId("preset-project-id");
        HcClient hcClient = createPlainHcClient(endpoint, credentials);
        credentials.processAuthParams(hcClient, "region-id-1").get();

        Assert.assertEquals("temp-ak-3", credentials.getAk());
        Assert.assertEquals("temp-sk-3", credentials.getSk());
        Assert.assertEquals("temp-token-3", credentials.getSecurityToken());
        Assert.assertEquals("preset-project-id", credentials.getProjectId());
    }

    @Test
    public void testOidcAuthWithDomainIdSkipsAutoGet() throws ExecutionException, InterruptedException {
        stubOidcAssumeAgency("temp-ak-4", "temp-sk-4", "temp-token-4");

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        GlobalCredentials credentials = new GlobalCredentials()
                .withIdToken("test-id-token")
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint)
                .withDomainId("preset-domain-id");
        HcClient hcClient = createPlainHcClient(endpoint, credentials);
        credentials.processAuthParams(hcClient, "region-id").get();

        Assert.assertEquals("temp-ak-4", credentials.getAk());
        Assert.assertEquals("temp-sk-4", credentials.getSk());
        Assert.assertEquals("temp-token-4", credentials.getSecurityToken());
        Assert.assertEquals("preset-domain-id", credentials.getDomainId());
    }

    // ===================== OIDC + null regionId scenarios =====================

    @Test
    public void testOidcBasicWithProjectIdNoRegionId() throws ExecutionException, InterruptedException {
        stubOidcAssumeAgency("temp-ak-5", "temp-sk-5", "temp-token-5");

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        BasicCredentials credentials = new BasicCredentials()
                .withIdToken("test-id-token")
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint)
                .withProjectId("preset-project-id");
        HcClient hcClient = createPlainHcClient(endpoint, credentials);
        credentials.processAuthParams(hcClient, null).get();

        Assert.assertEquals("temp-ak-5", credentials.getAk());
        Assert.assertEquals("temp-sk-5", credentials.getSk());
        Assert.assertEquals("temp-token-5", credentials.getSecurityToken());
        Assert.assertEquals("preset-project-id", credentials.getProjectId());
    }

    @Test
    public void testOidcGlobalWithDomainIdNoRegionId() throws ExecutionException, InterruptedException {
        stubOidcAssumeAgency("temp-ak-6", "temp-sk-6", "temp-token-6");

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        GlobalCredentials credentials = new GlobalCredentials()
                .withIdToken("test-id-token")
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint)
                .withDomainId("preset-domain-id");
        HcClient hcClient = createPlainHcClient(endpoint, credentials);
        credentials.processAuthParams(hcClient, null).get();

        Assert.assertEquals("temp-ak-6", credentials.getAk());
        Assert.assertEquals("temp-sk-6", credentials.getSk());
        Assert.assertEquals("temp-token-6", credentials.getSecurityToken());
        Assert.assertEquals("preset-domain-id", credentials.getDomainId());
    }

    @Test
    public void testOidcGlobalNoDomainIdNoRegionId() throws ExecutionException, InterruptedException {
        stubOidcAssumeAgency("temp-ak-7", "temp-sk-7", "temp-token-7");
        wireMockRule.stubFor(WireMock.get("/v3/auth/domains")
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"domains\":[{\"id\":\"domain_id_7\"}]}")
                        .withStatus(200)));

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        GlobalCredentials credentials = new GlobalCredentials()
                .withIdToken("test-id-token")
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint);
        HcClient hcClient = createPlainHcClient(endpoint, credentials);
        credentials.processAuthParams(hcClient, null).get();

        Assert.assertEquals("temp-ak-7", credentials.getAk());
        Assert.assertEquals("temp-sk-7", credentials.getSk());
        Assert.assertEquals("temp-token-7", credentials.getSecurityToken());
        Assert.assertEquals("domain_id_7", credentials.getDomainId());
    }

    @Test
    public void testOidcBasicNoProjectIdNoRegionId() throws ExecutionException, InterruptedException {
        stubOidcAssumeAgency("temp-ak-8", "temp-sk-8", "temp-token-8");
        wireMockRule.stubFor(WireMock.get(WireMock.urlEqualTo("/v3/projects"))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{\"projects\":[{\"id\":\"project_id_8\"}]}")
                        .withStatus(200)));

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        BasicCredentials credentials = new BasicCredentials()
                .withIdToken("test-id-token")
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint);
        HcClient hcClient = createPlainHcClient(endpoint, credentials);
        credentials.processAuthParams(hcClient, null).get();

        Assert.assertEquals("temp-ak-8", credentials.getAk());
        Assert.assertEquals("temp-sk-8", credentials.getSk());
        Assert.assertEquals("temp-token-8", credentials.getSecurityToken());
        Assert.assertEquals("project_id_8", credentials.getProjectId());
    }

    // ===================== OIDC delayed mode (no processAuthParams) =====================

    @Test
    public void testOidcBasicDelayedMode() {
        stubOidcAssumeAgency("temp-ak-9", "temp-sk-9", "temp-token-9");

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        BasicCredentials credentials = new BasicCredentials()
                .withIdToken("test-id-token")
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint)
                .withProjectId("preset-project-id");

        DefaultHttpClient client = new DefaultHttpClient(
                HttpConfig.getDefaultHttpConfig().withIgnoreSSLVerification(true));
        HttpRequest request = HttpRequest.newBuilder()
                .withMethod(HttpMethod.GET)
                .withPath("/test")
                .withEndpoint(endpoint)
                .build();
        request = credentials.syncProcessAuthRequest(request, client);

        Assert.assertEquals("temp-ak-9", credentials.getAk());
        Assert.assertEquals("temp-sk-9", credentials.getSk());
        Assert.assertEquals("temp-token-9", credentials.getSecurityToken());
        Assert.assertNotNull(request.getHeader(Constants.AUTHORIZATION));
    }

    @Test
    public void testOidcGlobalDelayedMode() {
        stubOidcAssumeAgency("temp-ak-10", "temp-sk-10", "temp-token-10");

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        GlobalCredentials credentials = new GlobalCredentials()
                .withIdToken("test-id-token")
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint)
                .withDomainId("preset-domain-id");

        DefaultHttpClient client = new DefaultHttpClient(
                HttpConfig.getDefaultHttpConfig().withIgnoreSSLVerification(true));
        HttpRequest request = HttpRequest.newBuilder()
                .withMethod(HttpMethod.GET)
                .withPath("/test")
                .withEndpoint(endpoint)
                .build();
        request = credentials.syncProcessAuthRequest(request, client);

        Assert.assertEquals("temp-ak-10", credentials.getAk());
        Assert.assertEquals("temp-sk-10", credentials.getSk());
        Assert.assertEquals("temp-token-10", credentials.getSecurityToken());
        Assert.assertNotNull(request.getHeader(Constants.AUTHORIZATION));
    }

    // ===================== OIDC with partial credential from STS =====================

    @Test
    public void testOidcBasicPartialCredentialNullAccess() throws InterruptedException {
        String body = "{\"credentials\":{\"expires_at\":\"2099-01-01T00:00:00.123Z\"}}";
        wireMockRule.stubFor(WireMock.post("/v5/agencies/assume-with-oidc")
                .willReturn(WireMock.aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody(body)));

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        BasicCredentials credentials = new BasicCredentials()
                .withIdToken("test-id-token")
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint)
                .withProjectId("preset-project-id");
        HcClient hcClient = createPlainHcClient(endpoint, credentials);

        try {
            credentials.processAuthParams(hcClient, "region-id-1").get();
            throw new AssertionFailedError("expected exception: access or secret is null");
        } catch (ExecutionException exception) {
            Assert.assertTrue(exception.getCause().getMessage().contains("access or secret is null"));
        }
    }

    @Test
    public void testOidcBasicPartialCredentialNullExpiresAt() throws InterruptedException {
        String body = "{\"credentials\":{\"access\":\"ak\",\"secret\":\"sk\",\"securitytoken\":\"token\"}}";
        wireMockRule.stubFor(WireMock.post("/v5/agencies/assume-with-oidc")
                .willReturn(WireMock.aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody(body)));

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        BasicCredentials credentials = new BasicCredentials()
                .withIdToken("test-id-token")
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint)
                .withProjectId("preset-project-id");
        HcClient hcClient = createPlainHcClient(endpoint, credentials);

        try {
            credentials.processAuthParams(hcClient, "region-id-1").get();
            throw new AssertionFailedError("expected exception: expiresAt is null");
        } catch (ExecutionException exception) {
            Assert.assertTrue(exception.getCause().getMessage().contains("expiresAt is null"));
        }
    }

    @Test
    public void testOidcBasicNullCredentialFromSts() throws InterruptedException {
        wireMockRule.stubFor(WireMock.post("/v5/agencies/assume-with-oidc")
                .willReturn(WireMock.aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody("{}")));

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        BasicCredentials credentials = new BasicCredentials()
                .withIdToken("test-id-token")
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint)
                .withProjectId("preset-project-id");
        HcClient hcClient = createPlainHcClient(endpoint, credentials);

        try {
            credentials.processAuthParams(hcClient, "region-id-1").get();
            throw new AssertionFailedError("expected exception: credential is null");
        } catch (ExecutionException exception) {
            Assert.assertTrue(exception.getCause().getMessage().contains("credential is null"));
        }
    }

    @Test
    public void testOidcBasicPartialCredentialNullSecret() throws InterruptedException {
        String body = "{\"credentials\":{\"access\":\"ak-only\",\"expires_at\":\"2099-01-01T00:00:00.123Z\"}}";
        wireMockRule.stubFor(WireMock.post("/v5/agencies/assume-with-oidc")
                .willReturn(WireMock.aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", Constants.MEDIATYPE.APPLICATION_JSON)
                        .withBody(body)));

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        BasicCredentials credentials = new BasicCredentials()
                .withIdToken("test-id-token")
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint)
                .withProjectId("preset-project-id");
        HcClient hcClient = createPlainHcClient(endpoint, credentials);

        try {
            credentials.processAuthParams(hcClient, "region-id-1").get();
            throw new AssertionFailedError("expected exception: access or secret is null");
        } catch (ExecutionException exception) {
            Assert.assertTrue(exception.getCause().getMessage().contains("access or secret is null"));
        }
    }

    @Test
    public void testOidcAuthWithIdTokenFile() {
        stubOidcAssumeAgency("temp-ak-file", "temp-sk-file", "temp-token-file");

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        BasicCredentials credentials = new BasicCredentials()
                .withOidcIdTokenFile(TOKEN_FILE)
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint)
                .withProjectId("preset-project-id");

        DefaultHttpClient client = new DefaultHttpClient(
                HttpConfig.getDefaultHttpConfig().withIgnoreSSLVerification(true));
        HttpRequest request = HttpRequest.newBuilder()
                .withMethod(HttpMethod.GET)
                .withPath("/test")
                .withEndpoint(endpoint)
                .build();
        request = credentials.syncProcessAuthRequest(request, client);

        Assert.assertEquals("temp-ak-file", credentials.getAk());
        Assert.assertEquals("temp-sk-file", credentials.getSk());
        Assert.assertEquals("temp-token-file", credentials.getSecurityToken());
        Assert.assertEquals("preset-project-id", credentials.getProjectId());
        Assert.assertNotNull(request.getHeader(Constants.AUTHORIZATION));
    }

    // ===================== OIDC withOidcIdTokenFile complement scenarios =====================

    /**
     * 用例描述：通过 withOidcIdTokenFile 指定 ID Token 文件，使用 withRegion（processAuthParams 路径）
     *           对 BasicCredentials 进行 OIDC 委托认证，projectId 已预设，验证临时凭证正确获取且跳过自动获取 projectId。
     * 预制条件：STS 端点通过环境变量指向 WireMock；TestTokenFile 文件存在且包含有效 token。
     * 输入参数：withOidcIdTokenFile(TOKEN_FILE)、providerUrn、agencyUrn、agencySessionName、preset projectId、regionId。
     * 预期结果：ak/sk/securityToken 更新为 STS 返回的临时凭证；projectId 保持预设值不变。
     *
     * @throws ExecutionException 异步执行异常
     * @throws InterruptedException 线程中断异常
     */
    @Test
    public void testOidcAuthWithIdTokenFileProcessAuthParams() throws ExecutionException, InterruptedException {
        stubOidcAssumeAgency("temp-ak-file-pp", "temp-sk-file-pp", "temp-token-file-pp");

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        BasicCredentials credentials = new BasicCredentials()
                .withOidcIdTokenFile(TOKEN_FILE)
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint)
                .withProjectId("preset-project-id");
        HcClient hcClient = createPlainHcClient(endpoint, credentials);
        credentials.processAuthParams(hcClient, "region-id-1").get();

        Assert.assertEquals("temp-ak-file-pp", credentials.getAk());
        Assert.assertEquals("temp-sk-file-pp", credentials.getSk());
        Assert.assertEquals("temp-token-file-pp", credentials.getSecurityToken());
        Assert.assertEquals("preset-project-id", credentials.getProjectId());
    }

    /**
     * 用例描述：通过 withOidcIdTokenFile 指定 ID Token 文件，使用延迟模式（syncProcessAuthRequest 路径）
     *           对 GlobalCredentials 进行 OIDC 委托认证，domainId 已预设，验证临时凭证正确获取且请求头包含签名。
     * 预制条件：STS 端点通过环境变量指向 WireMock；TestTokenFile 文件存在且包含有效 token。
     * 输入参数：withOidcIdTokenFile(TOKEN_FILE)、providerUrn、agencyUrn、agencySessionName、preset domainId。
     * 预期结果：ak/sk/securityToken 更新为 STS 返回的临时凭证；domainId 保持预设值不变；请求头包含 Authorization。
     */
    @Test
    public void testOidcGlobalDelayedModeWithIdTokenFile() {
        stubOidcAssumeAgency("temp-ak-file-g", "temp-sk-file-g", "temp-token-file-g");

        String endpoint = String.format(Locale.US, "https://127.0.0.1:%d", wireMockRule.httpsPort());
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, endpoint);

        GlobalCredentials credentials = new GlobalCredentials()
                .withOidcIdTokenFile(TOKEN_FILE)
                .withProviderUrn("test-provider-urn")
                .withAgencyUrn("test-agency-urn")
                .withAgencySessionName("test-session")
                .withIamEndpoint(endpoint)
                .withDomainId("preset-domain-id");

        DefaultHttpClient client = new DefaultHttpClient(
                HttpConfig.getDefaultHttpConfig().withIgnoreSSLVerification(true));
        HttpRequest request = HttpRequest.newBuilder()
                .withMethod(HttpMethod.GET)
                .withPath("/test")
                .withEndpoint(endpoint)
                .build();
        request = credentials.syncProcessAuthRequest(request, client);

        Assert.assertEquals("temp-ak-file-g", credentials.getAk());
        Assert.assertEquals("temp-sk-file-g", credentials.getSk());
        Assert.assertEquals("temp-token-file-g", credentials.getSecurityToken());
        Assert.assertEquals("preset-domain-id", credentials.getDomainId());
        Assert.assertNotNull(request.getHeader(Constants.AUTHORIZATION));
    }
}
