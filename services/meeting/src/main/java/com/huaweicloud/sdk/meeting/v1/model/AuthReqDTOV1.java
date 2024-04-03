/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2020-2020. All rights reserved.
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

package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Objects;

public class AuthReqDTOV1 {
    @JsonInclude(Include.NON_NULL)
    @JsonProperty("account")
    private String account;
    @JsonInclude(Include.NON_NULL)
    @JsonProperty("clientType")
    private Integer clientType;
    @JsonInclude(Include.NON_NULL)
    @JsonProperty("createTokenType")
    private Integer createTokenType;
    @JsonInclude(Include.NON_NULL)
    @JsonProperty("HA2")
    private String ha2;


    public AuthReqDTOV1 withAccount(String account) {
        this.account = account;
        return this;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public AuthReqDTOV1 withClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }

    public Integer getClientType() {
        return this.clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public AuthReqDTOV1 withCreateTokenType(Integer createTokenType) {
        this.createTokenType = createTokenType;
        return this;
    }

    public Integer getCreateTokenType() {
        return this.createTokenType;
    }

    public void setCreateTokenType(Integer createTokenType) {
        this.createTokenType = createTokenType;
    }

    public AuthReqDTOV1 withHa2(String ha2) {
        this.ha2 = ha2;
        return this;
    }

    public String getHa2() {
        return this.ha2;
    }

    public void setHa2(String ha2) {
        this.ha2 = ha2;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            AuthReqDTOV1 authReqDTOV1 = (AuthReqDTOV1)o;
            return Objects.equals(this.account, authReqDTOV1.account)
                && Objects.equals(this.clientType, authReqDTOV1.clientType)
                && Objects.equals(this.createTokenType, authReqDTOV1.createTokenType)
                && Objects.equals(this.ha2, authReqDTOV1.ha2);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.account, this.clientType, this.createTokenType, this.ha2});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthReqDTOV1 {\n");
        sb.append("    account: ").append(this.toIndentedString(this.account)).append("\n");
        sb.append("    clientType: ").append(this.toIndentedString(this.clientType)).append("\n");
        sb.append("    createTokenType: ").append(this.toIndentedString(this.createTokenType)).append("\n");
        sb.append("    ha2: ").append(this.toIndentedString(this.ha2)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
