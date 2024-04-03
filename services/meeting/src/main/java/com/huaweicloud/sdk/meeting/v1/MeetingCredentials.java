/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2020-2022. All rights reserved.
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

package com.huaweicloud.sdk.meeting.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.exception.SdkErrorMessage;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpRequest.HttpRequestBuilder;
import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import com.huaweicloud.sdk.core.utils.StringUtils;
import com.huaweicloud.sdk.meeting.v1.model.AppAuthInfoV2;
import com.huaweicloud.sdk.meeting.v1.model.AuthReqDTOV1;
import com.huaweicloud.sdk.meeting.v1.model.AuthTypeEnum;
import com.huaweicloud.sdk.meeting.v1.model.CreatTokenMeta;
import com.huaweicloud.sdk.meeting.v1.model.CreateTokenResponse;
import com.huaweicloud.sdk.meeting.v1.model.TenantSceneEnum;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Base64;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class MeetingCredentials implements ICredential {
    private String token;

    private String userName;

    private String userPassword;

    private long lastTokenDate;

    private final static int EXPIRE_HOUR = 24;

    private final static int EXPIRE_HOUR_HALF = EXPIRE_HOUR / 2;

    private String appId;

    private String appKey;

    private String corpId;

    private String userId;

    private String deptCode;

    /**
     * 租户场景
     * 1、单租户场景下必须填写appId和appKey，选填userId。如果userId不填默认以企业管理员身份调用
     * 2、单租户场景下不能填写corpId
     * 3、多租户场景下必须填写appId和appKey，选填corpId和userId。如果corpId和userId都不填默认以SP管理员身份调用；如果corpId填写，userId不填，以企业管理员身份调用
     */
    private TenantSceneEnum tenantSceneEnum;

    /**
     * 鉴权类型
     */
    private AuthTypeEnum authTypeEnum;

    /**
     * 客户端类型：API调用类型
     */
    private final static int CLIENT_TYPE_API = 72;

    @Override
    public CompletableFuture<ICredential> processAuthParams(HcClient hcClient, String regionId) {
        return CompletableFuture.completedFuture(this);
    }

    @Override
    public CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {

        if (httpRequest.getPath().startsWith("/v1/mmc/control/conferences")
            || httpRequest.getPath().startsWith("/v1/usg/acs/auth/slideverifycode")
            || httpRequest.getPath().startsWith("/v1/usg/acs/verifycode")) {
            return CompletableFuture.supplyAsync(() -> httpRequest);
        }

        // 用户忘记密码重置接口需要上送X-Access-Token头域，但不是用户登陆的token，是校验验证码接口返回的token
        if (httpRequest.getPath().startsWith("/v1/usg/acs/password/reset")) {
            return CompletableFuture.supplyAsync(
                () -> httpRequest.builder().addHeader("X-Access-Token", this.token).build());
        }

        // 新增获取页面免登陆跳转nonce信息接口也需上送X-Access-Token头域，但不是用户登陆的token，需用户自己上送
        // 如果用户自己上送了，则设置用户自带的token， 否则则设置通过用户名密码获取的token
        if (httpRequest.getPath().startsWith("/v1/usg/acs/auth/portal-ref-nonce") && !StringUtils.isEmpty(token)) {
            return CompletableFuture.supplyAsync(
                () -> httpRequest.builder().addHeader("X-Access-Token", this.token).build());
        }

        if ((authTypeEnum == null || authTypeEnum == AuthTypeEnum.ACCOUNT) && (Objects.isNull(userName)
            || Objects.isNull(userPassword))) {
            throw new SdkException("Input your user name and password");
        }

        if (authTypeEnum == AuthTypeEnum.APP_ID && (Objects.isNull(appId) || Objects.isNull(appKey))) {
            throw new SdkException("Input your appId and appKey");
        }

        long exp = Instant.now().getEpochSecond() - this.lastTokenDate;

        CompletableFuture<String> validToken = CompletableFuture.completedFuture(this.token);

        if (Objects.isNull(token) || exp > EXPIRE_HOUR_HALF * 60 * 60) {
            validToken = createToken(httpRequest, httpClient);
        }

        return validToken.thenApply(tokenStr -> {
            HttpRequestBuilder builder = httpRequest.builder();
            if (!StringUtils.isEmpty(tokenStr)) {
                builder.addHeader("X-Access-Token", tokenStr);
            }
            return builder.build();
        });
    }

    @Override
    public MeetingCredentials deepClone() {
        return new MeetingCredentials()
            .withToken(this.token)
            .withUserName(this.userName)
            .withUserPassword(this.userPassword);
    }

    private CompletableFuture<String> createToken(HttpRequest httpRequest, HttpClient httpClient) {
        String requestBody;
        String authorization;
        String url;
        if (authTypeEnum == null || authTypeEnum == AuthTypeEnum.ACCOUNT) {
            url = CreatTokenMeta.URI;
            byte[] bytes = (userName + ":" + userPassword).getBytes(StandardCharsets.UTF_8);
            authorization = "Basic " + Base64.getEncoder().encodeToString(bytes);
            requestBody = JsonUtils.toJSON(new AuthReqDTOV1().withAccount(userName).withClientType(CLIENT_TYPE_API));
        } else {
            url = CreatTokenMeta.APP_ID_AUTH_URL;
            String nonce = UUID.randomUUID().toString().replace("-", "");
            // token有效期为10分钟
            long expireTime = System.currentTimeMillis() / 1000 + 60 * 10;
            AppAuthInfoV2 appAuthInfoV2 = new AppAuthInfoV2()
                .withAppId(appId)
                .withKey(appKey)
                .withNonce(nonce)
                .withCorpId(corpId)
                .withUserId(userId)
                .withExpireTime(expireTime)
                .withDeptCode(deptCode)
                .withClientType(CLIENT_TYPE_API)
                .withTenantScene(tenantSceneEnum);
            authorization = "HMAC-SHA256 signature=" + appAuthInfoV2.build();
            requestBody = JsonUtils.toJSON(appAuthInfoV2);
        }

        HttpRequest createTokenRequest = HttpRequest.newBuilder()
            .withEndpoint(httpRequest.getEndpoint())
            .withMethod(HttpMethod.POST)
            .withPath(url)
            .withContentType(CreatTokenMeta.CONTENT_TYPE)
            .addHeader("Authorization", authorization)
            .withBodyAsString(requestBody).build();
        return httpClient.asyncInvokeHttp(createTokenRequest).handle((createTokenHttpResponse, e) -> {
            if (Objects.nonNull(e)) {
                throw new SdkException(e);
            }
            if (createTokenHttpResponse.getStatusCode() != 200) {
                throw ServiceResponseException
                    .mapException(createTokenHttpResponse.getStatusCode(),
                        extractErrorMessage(createTokenHttpResponse));
            }
            CreateTokenResponse createTokenResponse
                = JsonUtils.toObject(createTokenHttpResponse.getBodyAsString(), CreateTokenResponse.class);
            this.token = createTokenResponse.getAccessToken();
            this.lastTokenDate = Instant.now().getEpochSecond();
            return this.token;
        });
    }

    private SdkErrorMessage extractErrorMessage(HttpResponse httpResponse) {
        String strBody = httpResponse.getBodyAsString();
        SdkErrorMessage sdkErrorMessage = new SdkErrorMessage(httpResponse.getStatusCode());
        if (Objects.isNull(strBody)) {
            return sdkErrorMessage;
        }
        try {
            Map<?, ?> errResult = JsonUtils.toObject(strBody, Map.class);
            sdkErrorMessage.setErrorCode(errResult.get("error_code").toString());
            sdkErrorMessage.setErrorMsg(errResult.get("error_msg").toString());
            sdkErrorMessage.setRequestId(errResult.get("request_id").toString());
        } catch (SdkException e) {
            sdkErrorMessage.setErrorMsg(httpResponse.getBodyAsString());
        }
        return sdkErrorMessage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public MeetingCredentials withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public MeetingCredentials withUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    public MeetingCredentials withToken(String token) {
        this.token = token;
        return this;
    }

    public MeetingCredentials withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public MeetingCredentials withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    public MeetingCredentials withAuthType(AuthTypeEnum authTypeEnum) {
        this.authTypeEnum = authTypeEnum;
        return this;
    }

    public MeetingCredentials withTenantScene(TenantSceneEnum tenantSceneEnum) {
        this.tenantSceneEnum = tenantSceneEnum;
        return this;
    }

    public MeetingCredentials withCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    public MeetingCredentials withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public MeetingCredentials withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }
}


