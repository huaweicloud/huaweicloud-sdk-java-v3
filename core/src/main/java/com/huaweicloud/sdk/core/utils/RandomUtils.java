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

package com.huaweicloud.sdk.core.utils;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;

public class RandomUtils {
    public static SecureRandom getDefaultSecureRandom() {
        String os = System.getProperty("os.name");
        try {
            if (os != null && os.toLowerCase(Locale.US).startsWith("win")) {
                return SecureRandom.getInstanceStrong();
            } else {
                return SecureRandom.getInstance("NativePRNGNonBlocking");
            }
        } catch (NoSuchAlgorithmException ignore) {
            return new SecureRandom();
        }
    }
}
