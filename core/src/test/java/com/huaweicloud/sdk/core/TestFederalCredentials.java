/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
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

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.GlobalCredentials;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpConfig;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;

public class TestFederalCredentials {
    private static final HcClient HC_CLIENT = new HcClient(HttpConfig.getDefaultHttpConfig());

    private static final String MOCK_IDP_ID = "MockIdpId";

    private static final String MOCK_ID_TOKEN_FILE = "MockIdTokenFile";

    private static final String MOCK_PROJECT_ID = "MockProjectId";

    private static final String MOCK_DOMAIN_ID = "MockDomainId";

    private static final String MOCK_REGION_ID = "MockRegionId";

    @Test
    public void testBasicCredentialWithoutIdpId() {
        BasicCredentials credentials = new BasicCredentials().withIdTokenFile(MOCK_ID_TOKEN_FILE);
        try {
            credentials.processAuthParams(HC_CLIENT, MOCK_REGION_ID);
        } catch (SdkException e) {
            Assert.assertEquals("idpId is required when using idpId&idTokenFile", e.getMessage());
        }
    }

    @Test
    public void testBasicCredentialWithoutIdTokenFile() {
        BasicCredentials credentials = new BasicCredentials().withIdpId(MOCK_IDP_ID);
        try {
            credentials.processAuthParams(HC_CLIENT, MOCK_REGION_ID);
        } catch (SdkException e) {
            Assert.assertEquals("idTokenFile is required when using idpId&idTokenFile", e.getMessage());
        }
    }

    @Test
    public void testBasicCredentialWithoutProjectId() {
        BasicCredentials credentials =
                new BasicCredentials().withIdpId(MOCK_IDP_ID).withIdTokenFile(MOCK_ID_TOKEN_FILE);
        try {
            credentials.processAuthParams(HC_CLIENT, MOCK_REGION_ID);
        } catch (SdkException e) {
            Assert.assertEquals("projectId is required when using idpId&idTokenFile", e.getMessage());
        }
    }

    @Test
    public void testBasicCredential() {
        BasicCredentials credentials =
                new BasicCredentials()
                        .withIdpId(MOCK_IDP_ID)
                        .withIdTokenFile(MOCK_ID_TOKEN_FILE)
                        .withProjectId(MOCK_PROJECT_ID);
        CompletableFuture<ICredential> future = credentials.processAuthParams(HC_CLIENT, MOCK_REGION_ID);
        Assert.assertNotNull(future);
    }

    @Test
    public void testGlobalCredentialWithoutIdpId() {
        GlobalCredentials credentials = new GlobalCredentials().withIdTokenFile(MOCK_ID_TOKEN_FILE);
        try {
            credentials.processAuthParams(HC_CLIENT, MOCK_REGION_ID);
        } catch (SdkException e) {
            Assert.assertEquals("idpId is required when using idpId&idTokenFile", e.getMessage());
        }
    }

    @Test
    public void testGlobalCredentialWithoutIdTokenFile() {
        GlobalCredentials credentials = new GlobalCredentials().withIdpId(MOCK_IDP_ID);
        try {
            credentials.processAuthParams(HC_CLIENT, MOCK_REGION_ID);
        } catch (SdkException e) {
            Assert.assertEquals("idTokenFile is required when using idpId&idTokenFile", e.getMessage());
        }
    }

    @Test
    public void testGlobalCredentialWithoutDomainId() {
        GlobalCredentials credentials =
                new GlobalCredentials().withIdpId(MOCK_IDP_ID).withIdTokenFile(MOCK_ID_TOKEN_FILE);
        try {
            credentials.processAuthParams(HC_CLIENT, MOCK_REGION_ID);
        } catch (SdkException e) {
            Assert.assertEquals("domainId is required when using idpId&idTokenFile", e.getMessage());
        }
    }

    @Test
    public void testGlobalCredential() {
        GlobalCredentials credentials =
                new GlobalCredentials()
                        .withIdpId(MOCK_IDP_ID)
                        .withIdTokenFile(MOCK_ID_TOKEN_FILE)
                        .withDomainId(MOCK_DOMAIN_ID);
        CompletableFuture<ICredential> future = credentials.processAuthParams(HC_CLIENT, MOCK_REGION_ID);
        Assert.assertNotNull(future);
    }
}
