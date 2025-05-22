/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2025-2025. All rights reserved.
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

import com.huaweicloud.sdk.core.exception.ClientRequestException;
import com.huaweicloud.sdk.core.exception.SdkErrorMessage;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.exception.ServerResponseException;
import com.huaweicloud.sdk.core.internal.model.CreateTemporaryAccessKeyInEcsResponse;
import com.huaweicloud.sdk.core.internal.model.Credential;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class MetadataAccessor {
    private static final String METADATA_ENDPOINT = "http://169.254.169.254";
    private static final String GET_TOKEN_PATH = "/meta-data/latest/api/token";
    private static final String GET_SECURITY_KEY_PATH = "/openstack/latest/securitykey";
    private static final String X_METADATA_TOKEN = "X-Metadata-Token";
    private static final String X_METADATA_TOKEN_TTL_SECONDS = "X-Metadata-Token-Ttl-Seconds";
    private static final String CONFIG_AGENCY_ERROR = "Please configure Cloud Service Agency first";

    private static final long DEFAULT_TOKEN_TTL_SECONDS = 6 * 60 * 60; // 6h
    private static final long DEFAULT_CHECK_TOKEN_DURATION_SECONDS = 24 * 60 * 60; // 24h

    private Long lastCallMillis;
    private String token;

    private SimpleResponse getToken() {
        Request request = new Request.Builder()
                .url(METADATA_ENDPOINT + GET_TOKEN_PATH)
                .addHeader(X_METADATA_TOKEN_TTL_SECONDS, String.valueOf(DEFAULT_TOKEN_TTL_SECONDS))
                .put(RequestBody.create(new byte[0]))
                .build();
        return execute(request);
    }

    private void tryUpdateToken(boolean throwOnFailure) {
        lastCallMillis = System.currentTimeMillis();
        SimpleResponse response = getToken();
        if (response.code == 200) {
            token = response.body;
        } else if (response.code == 404 || response.code == 405) {
            if (throwOnFailure) {
                throw new ClientRequestException(
                        response.code, new SdkErrorMessage(String.valueOf(response.code), response.body));
            } else {
                token = null;
            }
        } else {
            throw new ServerResponseException(
                    response.code, new SdkErrorMessage(String.valueOf(response.code), response.body));
        }

    }

    protected Credential getCredentials() {
        if (token == null && (lastCallMillis == null ||
                System.currentTimeMillis() - lastCallMillis > DEFAULT_CHECK_TOKEN_DURATION_SECONDS * 1000)) {
            tryUpdateToken(false);
        }

        Request.Builder builder = new Request.Builder().url(METADATA_ENDPOINT + GET_SECURITY_KEY_PATH).get();
        if (token != null) {
            builder.addHeader(X_METADATA_TOKEN, token);
        }

        SimpleResponse response = execute(builder.build());
        if (response.code == 401 && !response.body.contains(CONFIG_AGENCY_ERROR)) {
            tryUpdateToken(true);
            Request request = new Request.Builder()
                    .url(METADATA_ENDPOINT + GET_SECURITY_KEY_PATH)
                    .addHeader(X_METADATA_TOKEN, token)
                    .get()
                    .build();
            response = execute(request);
        }

        if (response.code >= 400) {
            throw new ClientRequestException(response.code,
                    new SdkErrorMessage(String.valueOf(response.code), response.body));
        }
        CreateTemporaryAccessKeyInEcsResponse resp =
                JsonUtils.toObject(response.body, CreateTemporaryAccessKeyInEcsResponse.class);

        if (Objects.isNull(resp) || Objects.isNull(resp.getCredential())) {
            throw new SdkException("failed to get credentials in metadata");
        }

        return resp.getCredential();
    }

    private static SimpleResponse execute(Request request) {
        try {
            Response response = getClient().newCall(request).execute();
            SimpleResponse simpleResponse = new SimpleResponse();
            simpleResponse.code = response.code();
            simpleResponse.body = response.body() == null ? null : response.body().string();
            return simpleResponse;
        } catch (IOException e) {
            throw new SdkException(e);
        }
    }

    private static class SimpleResponse {
        String body;
        int code;
    }

    private static class ClientHolder {
        static final OkHttpClient INSTANCE = new OkHttpClient.Builder()
                .connectTimeout(3, TimeUnit.SECONDS)
                .readTimeout(3, TimeUnit.SECONDS)
                .build();
    }

    private static OkHttpClient getClient() {
        return ClientHolder.INSTANCE;
    }
}
