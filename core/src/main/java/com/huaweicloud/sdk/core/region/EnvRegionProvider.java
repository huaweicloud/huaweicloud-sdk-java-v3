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

package com.huaweicloud.sdk.core.region;

import com.huaweicloud.sdk.core.utils.StringUtils;

import java.util.Locale;
import java.util.Objects;

public class EnvRegionProvider implements IRegionProvider {

    private static final String ENV_REGION_PREFIX = "HUAWEICLOUD_SDK_REGION";

    private final String serviceName;

    public EnvRegionProvider(String serviceName) {
        this.serviceName = serviceName.toUpperCase(Locale.ROOT);
    }

    @Override
    public Region getRegion(String regionId) {
        Region region = EnvRegionCache.getInstance().value.get(serviceName + regionId);
        if (Objects.nonNull(region)) {
            return region;
        }
        String envName = String.format("%s_%s_%s", ENV_REGION_PREFIX, serviceName,
                regionId.replaceAll("-", "_").toUpperCase(Locale.ROOT));
        String endpoint = System.getenv(envName);
        if (StringUtils.isEmpty(endpoint)) {
            return null;
        }

        String[] endpoints = endpoint.split(",");
        region = new Region(regionId, endpoints);
        EnvRegionCache.getInstance().value.put(serviceName + regionId, region);
        return region;
    }
}
