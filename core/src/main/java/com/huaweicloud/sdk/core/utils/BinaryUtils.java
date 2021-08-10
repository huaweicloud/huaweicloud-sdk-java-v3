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

package com.huaweicloud.sdk.core.utils;

import java.util.Locale;

/** Utilities for encoding and decoding binary data to and from different forms.
 *
 * @author HuaweiCloud_SDK */
public final class BinaryUtils {

    /** The utility class should hide the public constructor */
    private BinaryUtils() {

    }

    /** Converts byte data to a Hex-encoded string.
     *
     * @param data data to hex encode.
     * @return hex-encoded string. */
    public static String toHex(byte[] data) {
        final int capacityTimes = 2;
        final int hexLength = 8;
        final int subLength = 6;
        StringBuilder sb = new StringBuilder(data.length * capacityTimes);
        for (byte datum : data) {
            String hex = Integer.toHexString(datum);
            if (hex.length() == 1) {
                // Append leading zero.
                sb.append("0");
            } else if (hex.length() == hexLength) {
                // Remove ff prefix from negative numbers.
                hex = hex.substring(subLength);
            }
            sb.append(hex);
        }
        return sb.toString().toLowerCase(Locale.getDefault());
    }

}
