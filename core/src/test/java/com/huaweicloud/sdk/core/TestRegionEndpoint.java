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

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.region.Region;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.List;

/**
 * TestRegionWitProjectId类：测试配置了withRegion方法时，endpoint的自动回填情况，由于有override场景，需要按照字典序执行用例
 */
@FixMethodOrder(value = MethodSorters.NAME_ASCENDING)
public class TestRegionEndpoint {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestRegionEndpoint.class);

    private static final BasicCredentials CREDENTIALS =
            new BasicCredentials().withAk("ak").withSk("sk").withProjectId("project_id");

    @Test
    public void testEndpointWithRegion1() {
        TestServiceClient client =
                TestServiceClient.newBuilder()
                        .withCredential(CREDENTIALS)
                        .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                        .withRegion(TestRegion.CN_NORTH_7)
                        .build();

        try {
            Field endpoints = HcClient.class.getDeclaredField("endpoints");
            endpoints.setAccessible(true);
            Object endpointsObj = endpoints.get(client.hcClient);
            Assert.assertTrue(endpointsObj instanceof List);
            Assert.assertEquals(TestRegion.SERVICE_ENDPOINT, ((List<?>) endpointsObj).get(0));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOGGER.error(e.getMessage());
        }
    }

    @Test
    public void testEndpointWithRegion2() {
        TestServiceClient client =
                TestServiceClient.newBuilder()
                        .withCredential(CREDENTIALS)
                        .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                        .withRegion(TestRegion.valueOf("cn-north-7"))
                        .build();

        try {
            Field endpoints = HcClient.class.getDeclaredField("endpoints");
            endpoints.setAccessible(true);
            Object endpointsObj = endpoints.get(client.hcClient);
            Assert.assertTrue(endpointsObj instanceof List);
            Assert.assertEquals(TestRegion.SERVICE_ENDPOINT, ((List<?>) endpointsObj).get(0));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOGGER.error(e.getMessage());
        }
    }

    @Test
    public void testEndpointWithRegion3() {
        TestServiceClient client =
                TestServiceClient.newBuilder()
                        .withCredential(CREDENTIALS)
                        .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                        .withRegion(new Region("cn-north-7", TestRegion.TEST_ENDPOINT))
                        .build();
        try {
            Field endpoints = HcClient.class.getDeclaredField("endpoints");
            endpoints.setAccessible(true);
            Object endpointsObj = endpoints.get(client.hcClient);
            Assert.assertTrue(endpointsObj instanceof List);
            Assert.assertEquals(TestRegion.TEST_ENDPOINTS, endpointsObj);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOGGER.error(e.getMessage());
        }
    }

    @Test
    public void testEndpointWithRegionWithoutScheme() {
        TestServiceClient client =
                TestServiceClient.newBuilder()
                        .withCredential(CREDENTIALS)
                        .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                        .withRegion(new Region("cn-north-7", TestRegion.TEST_ENDPOINT_WITHOUT_SCHEME))
                        .build();
        try {
            Field endpoints = HcClient.class.getDeclaredField("endpoints");
            endpoints.setAccessible(true);
            Object endpointsObj = endpoints.get(client.hcClient);
            Assert.assertTrue(endpointsObj instanceof List);
            Assert.assertEquals(TestRegion.TEST_ENDPOINTS, endpointsObj);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOGGER.error(e.getMessage());
        }
    }

    @Test
    public void testEndpointWithRegionOverride1() {
        TestServiceClient client =
                TestServiceClient.newBuilder()
                        .withCredential(CREDENTIALS)
                        .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                        .withRegion(TestRegion.CN_NORTH_7.withEndpointsOverride(TestRegion.TEST_ENDPOINTS))
                        .build();
        try {
            Field endpoints = HcClient.class.getDeclaredField("endpoints");
            endpoints.setAccessible(true);
            Object endpointsObj = endpoints.get(client.hcClient);
            Assert.assertTrue(endpointsObj instanceof List);
            Assert.assertEquals(TestRegion.TEST_ENDPOINTS, endpointsObj);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOGGER.error(e.getMessage());
        }
    }

    @Test
    public void testEndpointWithRegionOverride2() {
        TestServiceClient client =
                TestServiceClient.newBuilder()
                        .withCredential(CREDENTIALS)
                        .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                        .withRegion(TestRegion.valueOf("cn-north-7")
                                .withEndpointsOverride(TestRegion.TEST_ENDPOINTS))
                        .build();
        try {
            Field endpoints = HcClient.class.getDeclaredField("endpoints");
            endpoints.setAccessible(true);
            Object endpointsObj = endpoints.get(client.hcClient);
            Assert.assertTrue(endpointsObj instanceof List);
            Assert.assertEquals(TestRegion.TEST_ENDPOINTS, endpointsObj);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOGGER.error(e.getMessage());
        }
    }

    @Test
    public void testEmptyRegionValueOf() {
        try {
            TestServiceClient.newBuilder()
                    .withCredential(CREDENTIALS)
                    .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                    .withRegion(TestRegion.valueOf(""))
                    .build();
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Unexpected empty parameter: regionId.");
        }
    }

    @Test
    public void testWrongRegionValueOf() {
        try {
            TestServiceClient.newBuilder()
                    .withCredential(CREDENTIALS)
                    .withHttpConfig(HttpConfig.getDefaultHttpConfig())
                    .withRegion(TestRegion.valueOf("cn-north-6"))
                    .build();
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Unexpected regionId: cn-north-6");
        }
    }
}
