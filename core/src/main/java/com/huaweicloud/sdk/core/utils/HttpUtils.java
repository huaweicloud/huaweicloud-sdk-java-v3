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

package com.huaweicloud.sdk.core.utils;

import com.huaweicloud.sdk.core.Constants;

import java.util.Arrays;
import java.util.List;

public final class HttpUtils {

    private static final List<String> TEXT_BASED_CONTENT_TYPES = Arrays.asList(
            Constants.MEDIATYPE.APPLICATION_JSON,
            Constants.MEDIATYPE.APPLICATION_XML,
            Constants.MEDIATYPE.TEXT
    );

    private static final List<String> OCTET_STREAM_CONTENT_TYPES = Arrays.asList(
            Constants.MEDIATYPE.APPLICATION_OCTET_STREAM,
            Constants.MEDIATYPE.BINARY_OCTET_STREAM
    );

    private HttpUtils() {

    }

    public static boolean isTextBasedContentType(String contentType) {
        if (!StringUtils.isEmpty(contentType)) {
            for (String textBasedContentType : TEXT_BASED_CONTENT_TYPES) {
                if (contentType.startsWith(textBasedContentType)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isOctetStreamContentType(String contentType) {
        if (!StringUtils.isEmpty(contentType)) {
            for (String octetStreamContentType : OCTET_STREAM_CONTENT_TYPES) {
                if (contentType.startsWith(octetStreamContentType)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isBsonContentType(String contentType) {
        return Constants.MEDIATYPE.APPLICATION_BSON.equals(contentType);
    }

}
