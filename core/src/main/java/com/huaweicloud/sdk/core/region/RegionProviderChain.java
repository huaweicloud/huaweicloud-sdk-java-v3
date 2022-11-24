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

import java.util.Objects;

public class RegionProviderChain implements IRegionProvider {

    private final IRegionProvider[] providers;

    public RegionProviderChain(IRegionProvider[] providers) {
        this.providers = providers;
    }

    public static RegionProviderChain getDefaultRegionProviderChain(String serviceName) {
        IRegionProvider[] providers = {new EnvRegionProvider(serviceName), new ProfileRegionProvider(serviceName)};
        return new RegionProviderChain(providers);
    }

    @Override
    public Region getRegion(String regionId) {
        for (IRegionProvider provider : providers) {
            Region region = provider.getRegion(regionId);
            if (Objects.nonNull(region)) {
                return region;
            }
        }
        return null;
    }
}
