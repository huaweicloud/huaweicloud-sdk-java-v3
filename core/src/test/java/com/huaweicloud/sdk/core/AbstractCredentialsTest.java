/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2025-2025. All rights reserved.
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

import com.huaweicloud.sdk.core.auth.AbstractCredentials;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.utils.TimeUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.concurrent.CompletableFuture;

@RunWith(MockitoJUnitRunner.Silent.class)
public class AbstractCredentialsTest {
    private static class TestAbstractCredentials extends AbstractCredentials<TestAbstractCredentials> {

        @Override
        public void processDerivedAuthParams(String derivedAuthServiceName, String regionId) {

        }

        @Override
        public CompletableFuture<ICredential> processAuthParams(HcClient hcClient, String regionId) {
            return null;
        }

        @Override
        public CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
            return null;
        }

        @Override
        public ICredential deepClone() {
            return null;
        }

        public void setExpiredAt(Long expiredAt) {
            this.expiredAt = expiredAt;
        }

        public boolean needUpdateFederalAuthToken() {
            return super.needUpdateFederalAuthToken();
        }

        public boolean needUpdateSecurityTokenFromMetadata() {
            return super.needUpdateSecurityTokenFromMetadata();
        }

        public long getExpirationThresholdMillis() {
            return super.getExpirationThresholdMillis();
        }

    }

    @Test
    public void testNeedUpdateSecurityTokenFromMetadataAkAndSKNonNull() {
        TestAbstractCredentials credentials = new TestAbstractCredentials();
        credentials.setAk("xxx");
        credentials.setSk("xxx");
        Assert.assertFalse(credentials.needUpdateSecurityTokenFromMetadata());
    }

    @Test
    public void testNeedUpdateSecurityTokenFromMetadataExpire() {
        TestAbstractCredentials credentials = new TestAbstractCredentials();
        credentials.setAk("xxx");
        credentials.setSk("xxx");
        credentials.setSecurityToken("xxx");
        credentials.setExpirationThresholdSeconds(60L);
        credentials.setExpiredAt(100000L);

        try (MockedStatic<TimeUtils> timeUtilsMock = Mockito.mockStatic(TimeUtils.class)) {
            timeUtilsMock.when(TimeUtils::getTimeInMillis).thenReturn(40000L).thenReturn(40001L);
            Assert.assertFalse(credentials.needUpdateSecurityTokenFromMetadata());
            Assert.assertTrue(credentials.needUpdateSecurityTokenFromMetadata());        }
    }

    @Test
    public void testNeedUpdateFederalAuthTokenIdpIdOrIdTokenFileIsNull() {
        TestAbstractCredentials credentials = new TestAbstractCredentials();
        credentials.setIdTokenFile("file");
        Assert.assertFalse(credentials.needUpdateFederalAuthToken());
    }

    @Test
    public void testNeedUpdateFederalAuthTokenAuthTokenOrExpiredAtIsNull() {
        TestAbstractCredentials credentials = new TestAbstractCredentials();
        credentials.setIdpId("id");
        credentials.setIdTokenFile("file");

        Assert.assertTrue(credentials.needUpdateFederalAuthToken());
    }

    @Test
    public void testNeedUpdateFederalAuthTokenExpire() {
        TestAbstractCredentials credentials = new TestAbstractCredentials();
        credentials.setIdpId("id");
        credentials.setIdTokenFile("file");
        credentials.setAk("ak");
        credentials.setSk("sk");
        credentials.setSecurityToken("xxx");
        credentials.setExpirationThresholdSeconds(60L);
        credentials.setExpiredAt(100000L);

        try (MockedStatic<TimeUtils> timeUtilsMock = Mockito.mockStatic(TimeUtils.class)) {
            timeUtilsMock.when(TimeUtils::getTimeInMillis).thenReturn(40000L).thenReturn(40001L);
            Assert.assertFalse(credentials.needUpdateFederalAuthToken());
            Assert.assertTrue(credentials.needUpdateFederalAuthToken());
        }
    }
}
