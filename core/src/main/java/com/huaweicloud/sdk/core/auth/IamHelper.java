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

import com.fasterxml.jackson.core.type.TypeReference;
import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.internal.model.CreateTemporaryAccessKeyByTokenRequestBody;
import com.huaweicloud.sdk.core.internal.model.CreateTemporaryAccessKeyByTokenResponse;
import com.huaweicloud.sdk.core.internal.model.CreateTokenWithIdTokenResponse;
import com.huaweicloud.sdk.core.internal.model.GetIdTokenAuthParams;
import com.huaweicloud.sdk.core.internal.model.GetIdTokenIdScopeBody;
import com.huaweicloud.sdk.core.internal.model.GetIdTokenIdTokenBody;
import com.huaweicloud.sdk.core.internal.model.GetIdTokenRequestBody;
import com.huaweicloud.sdk.core.internal.model.GetIdTokenScopeDomainOrProjectBody;
import com.huaweicloud.sdk.core.internal.model.IdentityToken;
import com.huaweicloud.sdk.core.internal.model.TokenAuth;
import com.huaweicloud.sdk.core.internal.model.TokenAuthIdentity;
import com.huaweicloud.sdk.core.utils.ExceptionUtils;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import com.huaweicloud.sdk.core.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class IamHelper {
    public static final String EXPIRED_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    private static final String CREATE_TOKEN_WITH_ID_TOKEN_URI = "/v3.0/OS-AUTH/id-token/tokens";

    private static final String CREATE_TEMPORARY_ACCESS_KEY_BY_TOKEN_URI = "/v3.0/OS-CREDENTIAL/securitytokens";

    private static final Logger LOGGER = LoggerFactory.getLogger(IamHelper.class);

    private static final Map<String, String> ENDPOINTS = processEndpoints();

    private static Map<String, String> processEndpoints() {
        try (InputStream inputStream = IamHelper.class.getClassLoader()
                .getResourceAsStream("iam_endpoints.json")) {
            if (inputStream == null) {
                LOGGER.warn("cannot find iam endpoints config file, use default");
                return new HashMap<>();
            }
            return JsonUtils.fromStream(inputStream, new TypeReference<Map<String, String>>() {
            });
        } catch (Exception e) {
            LOGGER.warn("load iam endpoints error, %s", e);
            return new HashMap<>();
        }
    }

    public static String getEndpoint() {
        String env = System.getenv(Constants.IAM_ENDPOINT_ENV_NAME);
        return StringUtils.isEmpty(env) ? Constants.DEFAULT_IAM_ENDPOINT : env;
    }

    public static String getEndpoint(String regionId) {
        String env = System.getenv(Constants.IAM_ENDPOINT_ENV_NAME);
        if (StringUtils.isNotEmpty(env)) {
            return env;
        }

        if (ENDPOINTS.containsKey(regionId)) {
            return ENDPOINTS.get(regionId);
        }
        return Constants.DEFAULT_IAM_ENDPOINT;
    }

    private static GetIdTokenRequestBody getCreateTokenWithIdTokenRequestBody(
            String idToken, GetIdTokenIdScopeBody scope) {
        GetIdTokenIdTokenBody idTokenBody = new GetIdTokenIdTokenBody().withId(idToken);
        GetIdTokenAuthParams idTokenAuthParams = new GetIdTokenAuthParams().withIdToken(idTokenBody).withScope(scope);
        return new GetIdTokenRequestBody().withAuth(idTokenAuthParams);
    }

    private static HttpRequest getCreateTokenWithIdTokenRequest(
            String iamEndpoint, String idpId, GetIdTokenRequestBody body) {
        HttpRequest.HttpRequestBuilder builder =
                HttpRequest.newBuilder()
                        .withEndpoint(iamEndpoint)
                        .withContentType(Constants.MEDIATYPE.APPLICATION_JSON_UTF8)
                        .withMethod(HttpMethod.POST)
                        .withPath(CREATE_TOKEN_WITH_ID_TOKEN_URI)
                        .withBodyAsString(JsonUtils.toJSON(body));
        builder.addHeader(Constants.X_IDP_ID, idpId);

        return builder.build();
    }

    private static HttpRequest getCreateTemporaryAccessKeyByTokenRequest(
            String iamEndpoint, CreateTemporaryAccessKeyByTokenRequestBody body) {
        return HttpRequest.newBuilder()
                .withEndpoint(iamEndpoint)
                .withContentType(Constants.MEDIATYPE.APPLICATION_JSON_UTF8)
                .withMethod(HttpMethod.POST)
                .withPath(CREATE_TEMPORARY_ACCESS_KEY_BY_TOKEN_URI)
                .withBodyAsString(JsonUtils.toJSON(body))
                .build();
    }

    public static HttpRequest getProjectTokenWithIdTokenRequest(
            String iamEndpoint, String idpId, String idToken, String projectId) {
        GetIdTokenScopeDomainOrProjectBody project = new GetIdTokenScopeDomainOrProjectBody().withId(projectId);
        GetIdTokenIdScopeBody scopeBody = new GetIdTokenIdScopeBody().withProject(project);
        GetIdTokenRequestBody body = getCreateTokenWithIdTokenRequestBody(idToken, scopeBody);
        return getCreateTokenWithIdTokenRequest(iamEndpoint, idpId, body);
    }

    public static HttpRequest getDomainTokenWithIdTokenRequest(
            String iamEndpoint, String idpId, String idToken, String domainId) {
        GetIdTokenScopeDomainOrProjectBody domain = new GetIdTokenScopeDomainOrProjectBody().withId(domainId);
        GetIdTokenIdScopeBody scopeBody = new GetIdTokenIdScopeBody().withDomain(domain);
        GetIdTokenRequestBody body = getCreateTokenWithIdTokenRequestBody(idToken, scopeBody);
        return getCreateTokenWithIdTokenRequest(iamEndpoint, idpId, body);
    }

    public static HttpRequest getUnscopedTokenWithIdTokenRequest(String iamEndpoint, String idpId, String idToken) {
        GetIdTokenIdTokenBody idTokenBody = new GetIdTokenIdTokenBody().withId(idToken);
        GetIdTokenAuthParams auth = new GetIdTokenAuthParams().withIdToken(idTokenBody);
        GetIdTokenRequestBody body = new GetIdTokenRequestBody().withAuth(auth);
        return getCreateTokenWithIdTokenRequest(iamEndpoint, idpId, body);
    }

    public static HttpRequest getCreateTemporaryAccessKeyByTokenRequest(
            String iamEndpoint, String authToken, long durationSeconds) {
        CreateTemporaryAccessKeyByTokenRequestBody body = new CreateTemporaryAccessKeyByTokenRequestBody();
        IdentityToken tokenIdentity = new IdentityToken();
        tokenIdentity.withId(authToken)
                .withDurationSeconds((int) durationSeconds);
        List<TokenAuthIdentity.MethodsEnum> listIdentityMethods = new ArrayList<>();
        listIdentityMethods.add(TokenAuthIdentity.MethodsEnum.fromValue("token"));
        TokenAuthIdentity identityAuth = new TokenAuthIdentity();
        identityAuth.withMethods(listIdentityMethods)
                .withToken(tokenIdentity);
        TokenAuth authBody = new TokenAuth();
        authBody.withIdentity(identityAuth);
        body.withAuth(authBody);
        return getCreateTemporaryAccessKeyByTokenRequest(iamEndpoint, body);
    }

    public static CreateTokenWithIdTokenResponse createTokenWithIdToken(HttpClient client, HttpRequest request) {
        HttpResponse httpResponse = client.syncInvokeHttp(request);
        if (httpResponse.getStatusCode() >= 400) {
            throw ServiceResponseException.mapException(
                    httpResponse.getStatusCode(), ExceptionUtils.extractErrorMessage(httpResponse));
        }

        CreateTokenWithIdTokenResponse response =
                JsonUtils.toObject(httpResponse.getBodyAsString(), CreateTokenWithIdTokenResponse.class);
        if (response == null) {
            throw new SdkException("failed to get token with idpId and idToken");
        }
        response.setHttpStatusCode(httpResponse.getStatusCode());

        String token = httpResponse.getHeader(Constants.X_SUBJECT_TOKEN);
        if (token == null) {
            throw new SdkException("failed to get X-Subject-Token");
        }
        response.setSubjectToken(token);

        if (response.getToken() == null || response.getToken().getExpiresAt() == null) {
            throw new SdkException("failed to get expired time");
        }

        return response;
    }

    public static CreateTemporaryAccessKeyByTokenResponse createTemporaryAccessKeyByToken(HttpClient client, HttpRequest request) {
        HttpResponse httpResponse = client.syncInvokeHttp(request);
        if (httpResponse.getStatusCode() >= 400) {
            throw ServiceResponseException.mapException(
                    httpResponse.getStatusCode(), ExceptionUtils.extractErrorMessage(httpResponse));
        }

        CreateTemporaryAccessKeyByTokenResponse response = Objects.requireNonNull(JsonUtils.toObject(
                httpResponse.getBodyAsString(), CreateTemporaryAccessKeyByTokenResponse.class));
        response.setHttpStatusCode(httpResponse.getStatusCode());
        return response;
    }
}
