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
package com.huaweicloud.sdk.core;

import com.huaweicloud.sdk.core.http.HttpRequest;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestRequestBuilder {
    @Test
    public void testAddHeader() {
        HttpRequest request = HttpRequest.newBuilder()
                .withEndpoint("https://example.com")
                .withPath("/")
                .addHeader("key1", "value1")
                .addHeader("key2", "value2")
                .build();

        Assert.assertEquals(2, request.getHeaders().size());
        Assert.assertEquals("value1", request.getHeaders().get("key1").get(0));
        Assert.assertEquals("value2", request.getHeaders().get("key2").get(0));
    }

    @Test
    public void testAddHeader2() {
        HttpRequest request = HttpRequest.newBuilder()
                .withEndpoint("https://example.com")
                .withPath("/")
                .addHeader("key", "value1")
                .addHeader("key", "value1")
                .addHeader("key", "value2")
                .build();

        Assert.assertEquals(1, request.getHeaders().size());
        List<String> values = request.getHeaders().get("key");
        Assert.assertEquals(2, values.size());
        Assert.assertEquals("value1", values.get(0));
        Assert.assertEquals("value2", values.get(1));
    }
}
