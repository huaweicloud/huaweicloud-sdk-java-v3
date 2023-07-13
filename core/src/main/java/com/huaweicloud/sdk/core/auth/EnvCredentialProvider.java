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
import java.util.Objects;

public class EnvCredentialProvider implements ICredentialProvider {

    private static final String AK_ENV_NAME = "HUAWEICLOUD_SDK_AK";
    private static final String SK_ENV_NAME = "HUAWEICLOUD_SDK_SK";
    private static final String PROJECT_ID_ENV_NAME = "HUAWEICLOUD_SDK_PROJECT_ID";
    private static final String DOMAIN_ID_ENV_NAME = "HUAWEICLOUD_SDK_DOMAIN_ID";
    private static final String SECURITY_TOKEN_ENV_NAME = "HUAWEICLOUD_SDK_SECURITY_TOKEN";
    private static final String IDP_ID_ENV_NAME = "HUAWEICLOUD_SDK_IDP_ID";
    private static final String ID_TOKEN_FILE_ENV_NAME = "HUAWEICLOUD_SDK_ID_TOKEN_FILE";

    private final String credentialType;

    public EnvCredentialProvider(String credentialType) {
        this.credentialType = credentialType.toLowerCase(Locale.ROOT);
    }

    public static EnvCredentialProvider getBasicCredentialEnvProvider() {
        return new EnvCredentialProvider(Constants.Credentials.BASIC);
    }

    public static EnvCredentialProvider getGlobalCredentialEnvProvider() {
        return new EnvCredentialProvider(Constants.Credentials.GLOBAL);
    }

    @Override
    public ICredential getCredentials() {
        if (StringUtils.isEmpty(credentialType)) {
            throw new SdkException("credential type is empty");
        }

        AbstractCredentials<?> credentials = null;
        if (credentialType.startsWith(Constants.Credentials.BASIC)) {
            credentials = new BasicCredentials().withProjectId(System.getenv(PROJECT_ID_ENV_NAME));
        } else if (credentialType.startsWith(Constants.Credentials.GLOBAL)) {
            credentials = new GlobalCredentials().withDomainId(System.getenv(DOMAIN_ID_ENV_NAME));
        }
        if (Objects.isNull(credentials)) {
            throw new SdkException("unsupported credential type: " + credentialType);
        }

        String ak = System.getenv(AK_ENV_NAME);
        String sk = System.getenv(SK_ENV_NAME);
        String securityToken = System.getenv(SECURITY_TOKEN_ENV_NAME);
        String idpId = System.getenv(IDP_ID_ENV_NAME);
        String idTokenFile = System.getenv(ID_TOKEN_FILE_ENV_NAME);

        if (!StringUtils.isEmpty(idpId) && !StringUtils.isEmpty(idTokenFile)) {
            credentials.withIdpId(idpId).withIdTokenFile(idTokenFile);
        } else if (!StringUtils.isEmpty(ak) && !StringUtils.isEmpty(sk)) {
            credentials.withAk(ak).withSk(sk).withSecurityToken(securityToken);
        } else {
            throw new SdkException("ak&sk or idpId&idTokenFile does not exist in environmental variables");
        }
        return credentials;
    }
}
