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

import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.internal.model.CreateTemporaryAccessKeyByTokenResponse;
import com.huaweicloud.sdk.core.internal.model.CreateTokenWithIdTokenResponse;
import com.huaweicloud.sdk.core.internal.model.Credential;

public class FederalAccessor extends AbstractStsAccessor {
    private static final long DEFAULT_DURATION_SECONDS = 6 * 60 * 60; // 6h

    @Override
    public Credential getCredential(AccessorOptions options) {
        HttpRequest httpRequest = IamHelper.getUnscopedTokenWithIdTokenRequest(
                options.getIamEndpoint(), options.getIdpId(), getContent(options.getIdTokenFile()));
        CreateTokenWithIdTokenResponse response = IamHelper.createTokenWithIdToken(
                options.getHttpClient(), httpRequest);

        HttpRequest request = IamHelper.getCreateTemporaryAccessKeyByTokenRequest(
                options.getIamEndpoint(), response.getSubjectToken(), DEFAULT_DURATION_SECONDS);
        CreateTemporaryAccessKeyByTokenResponse credResp = IamHelper.createTemporaryAccessKeyByToken(
                options.getHttpClient(), request);
        return credResp.getCredential();
    }
}
