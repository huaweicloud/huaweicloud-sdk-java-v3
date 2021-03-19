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

/**
 * @author HuaweiCloud_SDK
 */
public class EnvCredentials {
    public static final String AK_ENV_NAME = "HUAWEICLOUD_SDK_AK";

    public static final String SK_ENV_NAME = "HUAWEICLOUD_SDK_SK";

    public static final String PROJECT_ID_ENV_NAME = "HUAWEICLOUD_SDK_PROJECT_ID";

    public static final String DOMAIN_ID_ENV_NAME = "HUAWEICLOUD_SDK_DOMAIN_ID";

    public static final String BASIC_CREDENTIAL_TYPE = "BasicCredentials";

    public static final String GLOBAL_CREDENTIAL_TYPE = "GlobalCredentials";

    /**
     * Notice: Function `LoadCredentialFromEnv` is only able to load BasicCredentials and GlobalCredentials.
     *
     * @param defaultType default credential type from ClientBuilder
     * @return instance of ICredential
     */
    public static ICredential loadCredentialFromEnv(String defaultType) {
        String ak = System.getenv(AK_ENV_NAME);
        String sk = System.getenv(SK_ENV_NAME);

        if (BASIC_CREDENTIAL_TYPE.equals(defaultType)) {
            String projectId = System.getenv(PROJECT_ID_ENV_NAME);
            return new BasicCredentials().withAk(ak).withSk(sk).withProjectId(projectId);
        } else if (GLOBAL_CREDENTIAL_TYPE.equals(defaultType)) {
            String domainId = System.getenv(DOMAIN_ID_ENV_NAME);
            return new GlobalCredentials().withAk(ak).withSk(sk).withDomainId(domainId);
        } else {
            return null;
        }
    }

}
