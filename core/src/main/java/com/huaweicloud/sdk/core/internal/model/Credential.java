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

package com.huaweicloud.sdk.core.internal.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Credential {
    @JsonDeserialize(using = ExpireDeserializer.class)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JsonAlias({"expires_at", "expiration"})
    private Long expiresAt;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JsonAlias({"access", "accessKeyId"})
    private String access;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JsonAlias({"secret", "secretAccessKey"})
    private String secret;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JsonAlias({"securitytoken", "securityToken"})
    private String securityToken;

    public Long getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public static class ExpireDeserializer extends JsonDeserializer<Long> {
        private static final String EXPIRED_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

        @Override
        public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String expireStr = jsonParser.getText();
            if (StringUtils.isEmpty(expireStr)) {
                return null;
            }

            expireStr = expireStr.replace("000Z", "Z");
            try {
                return new SimpleDateFormat(EXPIRED_DATE_FORMAT, Locale.US).parse(expireStr).getTime();
            } catch (ParseException e) {
                throw new SdkException("failed to parse expired time:" + expireStr, e);
            }
        }
    }
}
