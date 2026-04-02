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
import com.huaweicloud.sdk.core.internal.model.Credential;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class AbstractStsAccessor implements StsAccessor {
    @Override
    public abstract Credential getCredential(AccessorOptions options);

    protected String getContent(String file) {
        String idToken;
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(file));
            idToken = new String(bytes, StandardCharsets.UTF_8).trim();
        } catch (IOException e) {
            throw new SdkException(e);
        }

        if (StringUtils.isEmpty(idToken)) {
            throw new SdkException(String.format("The content is empty in file '%s'", file));
        }
        return idToken;
    }
}
