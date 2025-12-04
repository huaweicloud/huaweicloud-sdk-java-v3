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

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public class TestClientBuilder {
    @SuppressWarnings("unchecked")
    @Test
    public void testBuildClient() throws NoSuchFieldException, IllegalAccessException {
        BasicCredentials credentials = new BasicCredentials().withAk("ak").withSk("sk").withProjectId("projectId");
        List<String> endpoints = Collections.singletonList("endpoint");
        HcClient client = new ClientBuilder<>(hcClient -> hcClient)
                .withCredential(credentials)
                .withEndpoints(endpoints)
                .build();
        Field endpintsField = client.getClass().getDeclaredField("endpoints");
        endpintsField.setAccessible(true);
        Assert.assertEquals("https://endpoint", ((List<String>)endpintsField.get(client)).get(0));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testBuildClient2() throws NoSuchFieldException, IllegalAccessException {
        BasicCredentials credentials = new BasicCredentials().withAk("ak").withSk("sk").withProjectId("projectId");
        HcClient client = new ClientBuilder<>(hcClient -> hcClient)
                .withCredential(credentials)
                .withEndpoint("endpoint")
                .build();
        Field endpintsField = client.getClass().getDeclaredField("endpoints");
        endpintsField.setAccessible(true);
        Assert.assertEquals("https://endpoint", ((List<String>)endpintsField.get(client)).get(0));
    }
}
