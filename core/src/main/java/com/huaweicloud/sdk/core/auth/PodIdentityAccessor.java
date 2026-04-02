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

import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.internal.model.AssumeAgencyForPodIdentityResponse;
import com.huaweicloud.sdk.core.internal.model.Credential;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class PodIdentityAccessor extends AbstractStsAccessor {
    private static final MediaType APPLICATION_JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String EMPTY_JSON = "{}";
    private static final String AUTHORIZATION = "Authorization";
    private final String uri;
    private final String file;

    PodIdentityAccessor(String uri, String file) {
        this.uri = uri;
        this.file = file;
    }

    @Override
    public Credential getCredential(AccessorOptions options) {
        Request request = new Request.Builder()
                .url(uri)
                .post(RequestBody.create(EMPTY_JSON, APPLICATION_JSON))
                .addHeader(AUTHORIZATION, getContent(file))
                .build();
        try {
            Response response = getClient().newCall(request).execute();
            String content = response.body() == null ? "" : response.body().string();
            if (!response.isSuccessful()) {
                String message = String.format(Locale.ENGLISH,
                        "Failed to get credential from pod identity, status: %d, content: %s",
                        response.code(), content);
                throw new SdkException(message);
            }
            return Objects.requireNonNull(JsonUtils.toObject(content, AssumeAgencyForPodIdentityResponse.class))
                    .getCredentials();
        } catch (IOException e) {
            throw new SdkException("Failed to get credential from pod identity", e);
        }
    }

    private static class ClientHolder {

        static final OkHttpClient INSTANCE = new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .build();
    }

    private static OkHttpClient getClient() {
        return ClientHolder.INSTANCE;
    }
}
