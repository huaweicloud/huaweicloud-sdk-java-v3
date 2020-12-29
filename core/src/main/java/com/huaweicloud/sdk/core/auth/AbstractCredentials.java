/*
 * Copyright 2020 Huawei Technologies Co.,Ltd.
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

import java.lang.reflect.Field;
import java.util.Objects;

import org.apache.commons.lang3.ArrayUtils;

import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.utils.StringUtils;

public abstract class AbstractCredentials implements ICredential {

    private String ak;

    private String sk;

    private String securityToken;

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public static <T> AbstractCredentials getCredentialFromEnvironment(T clientType, String defaultCredentials) {
        String credentialsTypeDef = System.getenv("HUAWEICLOUD_SDK_TYPE");
        if (StringUtils.isEmpty(credentialsTypeDef)) {
            credentialsTypeDef = defaultCredentials;
        }
        // reflect to specified credentials
        Class credentialsType = getCredentialsClass(credentialsTypeDef, clientType);
        if (Objects.isNull(credentialsType)) {
            return null;
        }
        AbstractCredentials credentials;
        Object credentialClass = null;
        try {
            credentialClass = credentialsType.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new SdkException(e);
        }
        credentials = initializeCredentials(credentialsType, credentialClass);
        credentials = loadOptionalParams(credentials);

        return credentials;
    }

    private static <T> String getPackageName(T t) {
        return t.getClass().getPackage().getName();
    }

    /**
     * Returns reflected class of actual credential
     *
     * @param credentialType name of credential type
     * @param clientType     actual builder of client
     * @param <T>            generic T type, type of ClientBuilder
     * @return reflected class of actual credential
     */
    private static <T> Class getCredentialsClass(String credentialType, T clientType) {
        // default credential path is: com.huaweicloud.sdk.core.auth
        String credentialPath = "com.huaweicloud.sdk.core.auth." + credentialType;
        try {
            return Class.forName(credentialPath);
        } catch (ClassNotFoundException e) {
            // if you couldn't reflect from default path, reflect from client path
            credentialPath = getPackageName(clientType) + "." + credentialType;
            try {
                return Class.forName(credentialPath);
            } catch (ClassNotFoundException classNotFoundException) {
                throw new SdkException(classNotFoundException);
            }
        }
    }

    private static AbstractCredentials initializeCredentials(Class credentialsType, Object credentialClass) {
        Field[] fields = credentialsType.getDeclaredFields();
        try {
            for (Field field : fields) {
                field.setAccessible(true);
                field.set(credentialClass, System.getenv("HUAWEICLOUD_SDK_"
                    + StringUtils.camelToUnderscore(field.getName()).toUpperCase()));
            }
        } catch (IllegalAccessException e) {
            throw new SdkException(e);
        }
        return (AbstractCredentials) credentialClass;
    }

    private static AbstractCredentials loadOptionalParams(AbstractCredentials credentials) {
        Field[] fields1 = AbstractCredentials.class.getDeclaredFields();
        Field[] fields2 = credentials.getClass().getDeclaredFields();
        Field[] fields = ArrayUtils.addAll(fields1, fields2);

        try {
            for (Field field : fields) {
                field.setAccessible(true);
                field.set(credentials, System.getenv("HUAWEICLOUD_SDK_"
                    + StringUtils.camelToUnderscore(field.getName()).toUpperCase()));
            }
        } catch (IllegalAccessException e) {
            throw new SdkException(e);
        }
        return credentials;
    }
}
