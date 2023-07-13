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

package com.huaweicloud.sdk.core.exchange;

import com.huaweicloud.sdk.core.utils.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author HuaweiCloud_SDK
 */
public class SdkExchangeCache {

    private static final Map<String, SdkExchange> exchangeMap = new ConcurrentHashMap<>();

    /**
     * The utility class should hide the public constructor
     */
    private SdkExchangeCache() {
    }

    public static SdkExchange getExchange(String id) {
        return StringUtils.isEmpty(id) ? null : exchangeMap.get(id);
    }

    public static String putExchange(SdkExchange exchange) {
        String id = String.valueOf(System.identityHashCode(exchange));
        exchangeMap.put(id, exchange);
        return id;
    }

    public static void removeExchange(String id) {
        exchangeMap.remove(id);
    }
}
