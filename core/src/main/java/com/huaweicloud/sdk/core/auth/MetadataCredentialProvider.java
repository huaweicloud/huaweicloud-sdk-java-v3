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

package com.huaweicloud.sdk.core.auth;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.util.Locale;

public class MetadataCredentialProvider implements ICredentialProvider {

    private final String credentialType;
    private Long expirationThresholdSeconds;

    public MetadataCredentialProvider(String credentialType) {
        this.credentialType = credentialType.toLowerCase(Locale.US);
    }

    public static MetadataBasicCredentialProvider getBasicCredentialMetadataProvider() {
        return new MetadataBasicCredentialProvider();
    }

    public static MetadataGlobalCredentialProvider getGlobalCredentialMetadataProvider() {
        return new MetadataGlobalCredentialProvider();
    }

    /**
     * @deprecated This method will be removed in future.
     */
    public Long getExpirationThresholdSeconds() {
        return expirationThresholdSeconds;
    }

    /**
     * @deprecated This method will be removed in future, do not set this option if no problems occur.
     * If this option needs to be set, the recommended value range is 1200~2400.
     */
    public void setExpirationThresholdSeconds(Long expirationThresholdSeconds) {
        this.expirationThresholdSeconds = expirationThresholdSeconds;
    }

    @Override
    public ICredential getCredentials() {
        if (StringUtils.isEmpty(credentialType)) {
            throw new SdkException("credential type is empty");
        }

        ICredential credential = null;
        if (credentialType.startsWith(Constants.Credentials.BASIC)) {
            credential = getBasicCredentialMetadataProvider().getCredentials();
        } else if (credentialType.startsWith(Constants.Credentials.GLOBAL)) {
            credential = getGlobalCredentialMetadataProvider().getCredentials();
        }

        if (credential == null) {
            throw new SdkException("unsupported credential type: " + credentialType);
        }

        return credential instanceof AbstractCredentials ? process((AbstractCredentials<?>) credential) : credential;
    }

    protected ICredential process(AbstractCredentials<?> credentials) {
        credentials.metadataAccessor = new MetadataAccessor();
        if (getExpirationThresholdSeconds() != null) {
            credentials.setExpirationThresholdSeconds(getExpirationThresholdSeconds());
        }
        credentials.updateSecurityTokenFromMetadata();
        return credentials;
    }
}
