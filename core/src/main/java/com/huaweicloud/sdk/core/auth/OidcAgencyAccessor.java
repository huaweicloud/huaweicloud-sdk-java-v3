/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2026-2026. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
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
import com.huaweicloud.sdk.core.internal.model.Credential;
import com.huaweicloud.sdk.core.utils.StringUtils;

public class OidcAgencyAccessor extends AbstractStsAccessor {

    private static final int DEFAULT_DURATION_SECONDS = 3600;

    @Override
    public Credential getCredential(AccessorOptions options) {
        int effectiveDuration = options.getDurationSeconds() != null
                ? options.getDurationSeconds()
                : DEFAULT_DURATION_SECONDS;

        String idToken;
        if (StringUtils.isNotEmpty(options.getIdToken())) {
            idToken = options.getIdToken();
        } else if (StringUtils.isNotEmpty(options.getOidcIdTokenFile())) {
            idToken = getContent(options.getOidcIdTokenFile());
        } else {
            throw new SdkException("idToken is required for OIDC agency authentication,"
                    + " set it via withIdToken or environment variable HUAWEICLOUD_SDK_ID_TOKEN_FILE");
        }

        return IamHelper.assumeAgencyWithOidc(
                options.getHttpClient(),
                options.getProviderUrn(), options.getAgencyUrn(),
                options.getAgencySessionName(), idToken,
                effectiveDuration, options.getPolicy(), options.getPolicyIds(),
                options.getRegionId());
    }
}
