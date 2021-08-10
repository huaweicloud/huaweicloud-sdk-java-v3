/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
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

import com.huaweicloud.sdk.core.utils.StringUtils;

import java.util.Objects;

/** @author HuaweiCloud_SDK */
public final class EnvCredentials {

    /** AK & SK are common in initializing credentials. */
    public static final String AK_ENV_NAME = "HUAWEICLOUD_SDK_AK";

    public static final String SK_ENV_NAME = "HUAWEICLOUD_SDK_SK";

    /** Project id is needed in BasicCredentials. */
    public static final String PROJECT_ID_ENV_NAME = "HUAWEICLOUD_SDK_PROJECT_ID";

    /** Domain id is needed in GlobalCredentials. */
    public static final String DOMAIN_ID_ENV_NAME = "HUAWEICLOUD_SDK_DOMAIN_ID";

    /** If iam endpoint has been set, the project id or domain id would be obtained from this host. */
    public static final String IAM_ENDPOINT_ENV_NAME = "HUAWEICLOUD_SDK_IAM_ENDPOINT";

    public static final String BASIC_CREDENTIAL_TYPE = "BasicCredentials";

    public static final String GLOBAL_CREDENTIAL_TYPE = "GlobalCredentials";

    private EnvCredentials() {

    }

    /** Notice: Function `LoadCredentialFromEnv` is only able to load BasicCredentials and GlobalCredentials.
     *
     * @param defaultType default credential type from ClientBuilder
     * @return instance of ICredential */
    public static ICredential loadCredentialFromEnv(String defaultType) {
        String ak = System.getenv(AK_ENV_NAME);
        String sk = System.getenv(SK_ENV_NAME);

        if (BASIC_CREDENTIAL_TYPE.equals(defaultType)) {
            BasicCredentials credentials = new BasicCredentials().withAk(ak).withSk(sk);
            String projectId = System.getenv(PROJECT_ID_ENV_NAME);
            if (Objects.nonNull(projectId) && !StringUtils.isEmpty(projectId)) {
                credentials.setProjectId(projectId);
            }
            credentials.setIamEndpoint(getIamEndpointEnvName());
            return credentials;
        } else if (GLOBAL_CREDENTIAL_TYPE.equals(defaultType)) {
            GlobalCredentials credentials = new GlobalCredentials().withAk(ak).withSk(sk);
            String domainId = System.getenv(DOMAIN_ID_ENV_NAME);
            if (Objects.nonNull(domainId) && !StringUtils.isEmpty(domainId)) {
                return credentials.withDomainId(domainId);
            }
            credentials.setIamEndpoint(getIamEndpointEnvName());
            return credentials;
        } else {
            return null;
        }
    }

    /** Get the IAM endpoint from the environment variables.
     *
     * @return the endpoint string */
    public static String getIamEndpointEnvName() {
        String iamEndpoint = System.getenv(IAM_ENDPOINT_ENV_NAME);
        if (Objects.isNull(iamEndpoint) || StringUtils.isEmpty(iamEndpoint)) {
            return null;
        }
        return iamEndpoint;
    }
}
