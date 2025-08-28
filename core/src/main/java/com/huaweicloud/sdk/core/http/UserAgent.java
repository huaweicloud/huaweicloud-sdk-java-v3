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

package com.huaweicloud.sdk.core.http;

import java.util.regex.Pattern;

/**
 * @author HuaweiCloud_SDK
 */
public interface UserAgent {

    String OS_META = "os";
    String JAVA_META = "java";
    String VM_META = "vm";
    String METADATA = "meta";
    String APPID_META = "app";

    String SLASH = "/";
    String HASH = "#";
    String SEMICOLON = "; ";
    String UNDERLINE = "_";
    String SPACE = " ";

    Pattern USER_AGENT_VALUE_PATTERN = Pattern.compile("[^\\u0021-\\u007e]");

    /**
     * generate user agent
     *
     * @return additional user-agent value
     */
    String userAgent();
}
