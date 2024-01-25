/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
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
import org.bouncycastle.crypto.digests.SM3Digest;
import org.openeuler.BGMProvider;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

class SM3Hasher extends AbstractHasher {

    private static final String HMAC_SM3 = "HmacSM3";

    private static final BGMProvider BGM_PROVIDER = new BGMProvider();

    @Override
    protected byte[] hash(byte[] data) {
        SM3Digest digest = new SM3Digest();
        digest.update(data, 0, data.length);
        byte[] hash = new byte[digest.getDigestSize()];
        digest.doFinal(hash, 0);
        return hash;
    }

    @Override
    protected byte[] hmac(byte[] data, byte[] key) {
        try {
            Mac mac = Mac.getInstance(HMAC_SM3, BGM_PROVIDER);
            mac.init(new SecretKeySpec(key, HMAC_SM3));
            return mac.doFinal(data);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new SdkException("Unable to calculate a request signature", e);
        }
    }
}
