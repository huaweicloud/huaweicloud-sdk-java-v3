/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
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

package com.huaweicloud.sdk.functiongraph.v2;

import java.util.Objects;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.functiongraph.v2.region.FunctionGraphTenantRegion;

public class CustomClientBuilder<T> extends ClientBuilder<T> {
    private static final Logger logger = LoggerFactory.getLogger(CustomClientBuilder.class);

    public CustomClientBuilder(Function<HcClient, T> creator) {
        super(creator);
    }

    public CustomClientBuilder(Function<HcClient, T> creator, String credentialType) {
        super(creator, credentialType);
    }

    @Override
    public T build() {
        processRegion();

        return super.build();
    }

    private void processRegion() {
        Region region = getRegion();
        if (Objects.nonNull(region) && region != FunctionGraphTenantRegion.valueOf(region.getId())) {
            FunctionGraphTenantRegion.processRegion(region);
        }
    }

}
