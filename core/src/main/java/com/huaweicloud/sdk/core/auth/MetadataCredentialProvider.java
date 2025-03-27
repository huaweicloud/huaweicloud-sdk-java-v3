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

    public MetadataCredentialProvider(String credentialType) {
        this.credentialType = credentialType.toLowerCase(Locale.US);
    }

    public static MetadataCredentialProvider getBasicCredentialMetadataProvider() {
        return new MetadataCredentialProvider(Constants.Credentials.BASIC);
    }

    public static MetadataCredentialProvider getGlobalCredentialMetadataProvider() {
        return new MetadataCredentialProvider(Constants.Credentials.GLOBAL);
    }

    @Override
    public ICredential getCredentials() {
        if (StringUtils.isEmpty(credentialType)) {
            throw new SdkException("credential type is empty");
        }

        if (credentialType.startsWith(Constants.Credentials.BASIC)) {
            BasicCredentials credentials = new BasicCredentials();
            credentials.updateSecurityTokenFromMetadata();
            return credentials;
        } else if (credentialType.startsWith(Constants.Credentials.GLOBAL)) {
            GlobalCredentials credentials = new GlobalCredentials();
            credentials.updateSecurityTokenFromMetadata();
            return credentials;
        }

        throw new SdkException("unsupported credential type: " + credentialType);
    }
}
