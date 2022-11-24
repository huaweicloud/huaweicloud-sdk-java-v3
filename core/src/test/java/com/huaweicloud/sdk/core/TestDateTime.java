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

package com.huaweicloud.sdk.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.utils.JsonUtils;

import org.junit.Assert;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class TestDateTime {
    public static class DataBean {
        @JsonProperty("created_at")
        OffsetDateTime createdAt;

        public OffsetDateTime getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
        }
    }

    @Test
    public void testDateTime() {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2020-07-27T07:15:45Z");
        String json1 = "{\"created_at\":\"2020-07-27T07:15:45Z\"}";
        DataBean dataBean1 = JsonUtils.toObject(json1, DataBean.class);
        System.out.println(dataBean1.getCreatedAt().toString());
        Assert.assertEquals(dataBean1.getCreatedAt(), offsetDateTime);

        String json2 = "{\"created_at\":\"2020-07-27T07:15:45\"}";
        DataBean dataBean2 = JsonUtils.toObject(json2, DataBean.class);
        System.out.println(dataBean2.getCreatedAt().toString());
        Assert.assertEquals(dataBean2.getCreatedAt(), offsetDateTime);

        String json3 = "{\"created_at\":\"2020-07-27 07:15:45\"}";
        DataBean dataBean3 = JsonUtils.toObject(json3, DataBean.class);
        System.out.println(dataBean3.getCreatedAt().toString());
        Assert.assertEquals(dataBean3.getCreatedAt(), offsetDateTime);

        String json4 = "{\"created_at\":\"2020-07-27T15:15:45+08:00\"}";
        DataBean dataBean4 = JsonUtils.toObject(json4, DataBean.class);
        System.out.println(dataBean4.getCreatedAt().toString());
        Assert.assertEquals(dataBean4.getCreatedAt().withOffsetSameInstant(ZoneOffset.UTC), offsetDateTime);
    }
}
