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

package com.huaweicloud.sdk.core.auth;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.internal.model.Credential;

import java.util.Locale;

public class PodIdentityCredentialProvider implements ICredentialProvider {
    private static final String HC_CONTAINER_CREDENTIALS_FULL_URI = "HC_CONTAINER_CREDENTIALS_FULL_URI";
    private static final String HC_CONTAINER_AUTHORIZATION_TOKEN_FILE = "HC_CONTAINER_AUTHORIZATION_TOKEN_FILE";
    private final String credentialType;

    public PodIdentityCredentialProvider(String credentialType) {
        this.credentialType = credentialType.toLowerCase(Locale.US);
    }

    public static PodIdentityCredentialProvider basic() {
        return new PodIdentityCredentialProvider(Constants.Credentials.BASIC);
    }

    public static PodIdentityCredentialProvider global() {
        return new PodIdentityCredentialProvider(Constants.Credentials.GLOBAL);
    }

    @Override
    public ICredential getCredentials() {
        String uri = System.getenv(HC_CONTAINER_CREDENTIALS_FULL_URI);
        String file = System.getenv(HC_CONTAINER_AUTHORIZATION_TOKEN_FILE);
        if (uri == null || file == null) {
            throw new SdkException("The environment variable HC_CONTAINER_CREDENTIALS_FULL_URI" +
                    " and HC_CONTAINER_AUTHORIZATION_TOKEN_FILE must be set when using pod identity credential");
        }

        AbstractCredentials<?> credentials;
        if (credentialType.startsWith(Constants.Credentials.BASIC)) {
            credentials = new BasicCredentials();
        } else if (credentialType.startsWith(Constants.Credentials.GLOBAL)) {
            credentials = new GlobalCredentials();
        } else {
            throw new SdkException("Unsupported credential type: " + credentialType);
        }

        credentials.stsAccessor = new PodIdentityAccessor(uri, file);
        Credential credential = credentials.stsAccessor.getCredential();
        credentials.updateSts(credential);
        return credentials;
    }
}
