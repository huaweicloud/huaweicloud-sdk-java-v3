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
 * @param <DerivedT> derived class such as BasicCredentials and GlobalCredentials
 * @author HuaweiCloud_SDK
 */
public abstract class AbstractCredentials<DerivedT extends AbstractCredentials<DerivedT>> implements ICredential {

    private String ak;

    private String sk;

    private String securityToken;

    private String iamEndpoint;

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

    public String getIamEndpoint() {
        return iamEndpoint;
    }

    public void setIamEndpoint(String iamEndpoint) {
        this.iamEndpoint = iamEndpoint;
    }

    /**
     * @param ak access key
     * @return DerivedT with ak set
     */
    public DerivedT withAk(String ak) {
        this.ak = ak;
        return (DerivedT) this;
    }

    /**
     * @param sk access secret key
     * @return DerivedT with sk set
     */
    public DerivedT withSk(String sk) {
        this.sk = sk;
        return (DerivedT) this;
    }

    /**
     * @param securityToken temporary token from temporary ak and sk
     * @return DerivedT with securityToken set
     */
    public DerivedT withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return (DerivedT) this;
    }

    /**
     * @param iamEndpoint optional property
     * @return DerivedT with iamEndpoint set
     */
    public DerivedT withIamEndpoint(String iamEndpoint) {
        this.iamEndpoint = iamEndpoint;
        return (DerivedT) this;
    }

}
