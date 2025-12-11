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

import java.util.ArrayList;
import java.util.List;

public class CredentialProviderChain implements ICredentialProvider {

    private final ICredentialProvider[] providers;

    public CredentialProviderChain(ICredentialProvider[] providers) {
        this.providers = providers;
    }

    public static CredentialProviderChain getDefaultCredentialProviderChain(String credentialType) {
        ICredentialProvider[] credentialProviders = new ICredentialProvider[]{
            new EnvCredentialProvider(credentialType),
            new ProfileCredentialProvider(credentialType),
            new MetadataCredentialProvider(credentialType)
        };
        return new CredentialProviderChain(credentialProviders);
    }

    public static CredentialProviderChain getBasicCredentialProviderChain() {
        return getDefaultCredentialProviderChain(Constants.Credentials.BASIC);
    }

    public static CredentialProviderChain getGlobalCredentialProviderChain() {
        return getDefaultCredentialProviderChain(Constants.Credentials.GLOBAL);
    }

    @Override
    public ICredential getCredentials() {
        List<String> exceptions = new ArrayList<>();
        for (ICredentialProvider provider : providers) {
            try {
                ICredential credentials = provider.getCredentials();
                if (credentials != null) {
                    return credentials;
                }
            } catch (SdkException e) {
                exceptions.add(e.getMessage());
            }
        }
        throw new SdkException("failed to get credentials in providers\n" + String.join("\n", exceptions));
    }
}
