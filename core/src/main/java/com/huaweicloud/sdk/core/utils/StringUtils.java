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

/**
 * The type String utils
 *
 * @author HuaweiCloud_SDK
 */
public final class StringUtils {
    /**
     * The utility class should hide the public constructor
     */
    private StringUtils() {

    }

    /**
     * Check if a char sequence is empty
     *
     * @param cs CharSequence
     * @return true of false
     */
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    /**
     * Convert camel string to underscore
     *
     * @param camelString camel string
     * @return underscore string
     */
    public static String camelToUnderscore(String camelString) {
        final String underscore = "_";
        StringBuilder sb = new StringBuilder(camelString);
        int temp = 0;
        if (!camelString.contains(underscore)) {
            for (int i = 0; i < camelString.length(); i++) {
                if (Character.isUpperCase(camelString.charAt(i))) {
                    sb.insert(i + temp, "_");
                    temp += 1;
                }
            }
        }
        return sb.toString();
    }
}
