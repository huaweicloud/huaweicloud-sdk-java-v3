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

import com.huaweicloud.sdk.core.auth.EnvCredentialProvider;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.auth.ProfileCredentialProvider;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.utils.PathUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class TestCredentialProvider {

    @Test
    public void testEnvProviderWithBasicType() {
        EnvCredentialProvider provider = EnvCredentialProvider.getBasicCredentialEnvProvider();
        try {
            ICredential credentials = provider.getCredentials();
            Assert.assertNotNull(credentials);
        } catch (SdkException e) {
            Assert.assertEquals("ak&sk or idpId&idTokenFile does not exist in environmental variables",
                    e.getMessage());
        }
    }

    @Test
    public void testEnvProviderWithGlobalType() {
        EnvCredentialProvider provider = EnvCredentialProvider.getGlobalCredentialEnvProvider();
        try {
            ICredential credentials = provider.getCredentials();
            Assert.assertNotNull(credentials);
        } catch (SdkException e) {
            Assert.assertEquals("ak&sk or idpId&idTokenFile does not exist in environmental variables",
                    e.getMessage());
        }
    }

    @Test
    public void testProfileProviderWithBasicType() {
        ProfileCredentialProvider provider = ProfileCredentialProvider.getBasicCredentialProfileProvider();
        try {
            ICredential credentials = provider.getCredentials();
            Assert.assertNotNull(credentials);
        } catch (SdkException e) {
            Assert.assertEquals(String.format("java.io.IOException: credentials file '%s' does not exist",
                    PathUtils.getUserHomePath() + File.separator + ".huaweicloud" + File.separator + "credentials"),
                    e.getMessage());
        }
    }

    @Test
    public void testProfileProviderWithGlobalType() {
        ProfileCredentialProvider provider = ProfileCredentialProvider.getGlobalCredentialProfileProvider();
        try {
            ICredential credentials = provider.getCredentials();
            Assert.assertNotNull(credentials);
        } catch (SdkException e) {
            Assert.assertEquals(String.format("java.io.IOException: credentials file '%s' does not exist",
                    PathUtils.getUserHomePath() + File.separator + ".huaweicloud" + File.separator + "credentials"),
                    e.getMessage());
        }
    }
}
