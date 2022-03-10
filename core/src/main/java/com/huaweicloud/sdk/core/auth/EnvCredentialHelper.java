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

import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.utils.StringUtils;
import com.huaweicloud.sdk.core.Constants.Credentials;

import java.util.Objects;
import java.util.function.Function;

/**
 * @author HuaweiCloud_SDK
 */
public final class EnvCredentialHelper {
    /**
     * AK & SK are common in initializing credentials.
     */
    public static final String AK_ENV_NAME = "HUAWEICLOUD_SDK_AK";

    public static final String SK_ENV_NAME = "HUAWEICLOUD_SDK_SK";

    /**
     * Project id is needed in BasicCredentials.
     */
    public static final String PROJECT_ID_ENV_NAME = "HUAWEICLOUD_SDK_PROJECT_ID";

    /**
     * Domain id is needed in GlobalCredentials.
     */
    public static final String DOMAIN_ID_ENV_NAME = "HUAWEICLOUD_SDK_DOMAIN_ID";

    /**
     * If iam endpoint has been set, the project id or domain id would be obtained
     * from this host.
     */
    public static final String IAM_ENDPOINT_ENV_NAME = "HUAWEICLOUD_SDK_IAM_ENDPOINT";

    public static final String REGION_ID_ENV_NAME = "HUAWEICLOUD_SDK_REGION_ID";

    public static final String DERIVED_AUTH_SERVICE_NAME_ENV_NAME = "HUAWEICLOUD_SDK_DERIVED_AUTH_SERVICE_NAME";

    public static final String DERIVED_PREDICATE_ENV_NAME = "HUAWEICLOUD_SDK_DERIVED_PREDICATE";

    public static final String DEFAULT_DERIVED_PREDICATE = "DEFAULT_DERIVED_PREDICATE";

    private EnvCredentialHelper() {

    }

    /**
     * Notice: Function `LoadCredentialFromEnv` is only able to load
     * BasicCredentials and GlobalCredentials.
     *
     * @param defaultType default credential type from ClientBuilder
     * @return instance of ICredential
     */
    public static ICredential loadCredentialFromEnv(String defaultType) {
        String ak = System.getenv(AK_ENV_NAME);
        String sk = System.getenv(SK_ENV_NAME);
        if (StringUtils.isEmpty(ak) || StringUtils.isEmpty(sk)) {
            return null;
        }

        String regionId = System.getenv(REGION_ID_ENV_NAME);
        String derivedAuthServiceName = System.getenv(DERIVED_AUTH_SERVICE_NAME_ENV_NAME);
        Function<HttpRequest, Boolean> derivedPredicate = DEFAULT_DERIVED_PREDICATE
                .equals(System.getenv(DERIVED_PREDICATE_ENV_NAME))
                ? AbstractCredentials.DEFAULT_DERIVED_PREDICATE : null;

        if (Credentials.BASIC_CREDENTIAL.equals(defaultType)) {
            BasicCredentials credentials = new BasicCredentials().withAk(ak).withSk(sk)
                    .withDerivedPredicate(derivedPredicate);
            credentials.processDerivedAuthParams(derivedAuthServiceName, regionId);
            String projectId = System.getenv(PROJECT_ID_ENV_NAME);
            if (!StringUtils.isEmpty(projectId)) {
                credentials.setProjectId(projectId);
            }
            credentials.setIamEndpoint(getIamEndpointEnvName());
            return credentials;
        } else if (Credentials.GLOBAL_CREDENTIAL.equals(defaultType)) {
            GlobalCredentials credentials = new GlobalCredentials().withAk(ak).withSk(sk)
                    .withDerivedPredicate(derivedPredicate);
            credentials.processDerivedAuthParams(derivedAuthServiceName, regionId);
            String domainId = System.getenv(DOMAIN_ID_ENV_NAME);
            if (!StringUtils.isEmpty(domainId)) {
                return credentials.withDomainId(domainId);
            }
            credentials.setIamEndpoint(getIamEndpointEnvName());
            return credentials;
        }

        return null;
    }

    /**
     * Get the IAM endpoint from the environment variables.
     *
     * @return the endpoint string
     */
    public static String getIamEndpointEnvName() {
        String iamEndpoint = System.getenv(IAM_ENDPOINT_ENV_NAME);
        if (Objects.isNull(iamEndpoint) || StringUtils.isEmpty(iamEndpoint)) {
            return null;
        }
        return iamEndpoint;
    }
}
