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

package com.huaweicloud.sdk.functiongraph.v2.region;

import com.huaweicloud.sdk.core.region.Region;

import org.junit.Assert;
import org.junit.Test;

public class FunctionGraphTenantRegionTest {
    @Test
    public void testValueOf() {
        Region region = FunctionGraphTenantRegion.valueOf("cn-north-4");
        Assert.assertNotNull(region);
    }

    @Test
    public void testValueOfEmpty() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            FunctionGraphTenantRegion.valueOf("");
        });
    }

    @Test
    public void testValueOfNotFound() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            FunctionGraphTenantRegion.valueOf("abc");
        });
    }
}
