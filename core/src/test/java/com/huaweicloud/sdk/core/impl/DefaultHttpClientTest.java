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

package com.huaweicloud.sdk.core.impl;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Unit tests for {@link DefaultHttpClient}.
 */
public class DefaultHttpClientTest {

    /**
     * Uses reflection to invoke the private static method requiresRequestBody(String).
     *
     * @param method the HTTP method string to test
     * @return the result of requiresRequestBody(method)
     * @throws Exception if reflection fails
     */
    private boolean invokeRequiresRequestBody(String method) throws Exception {
        Method requiresRequestBody = DefaultHttpClient.class.getDeclaredMethod("requiresRequestBody", String.class);
        requiresRequestBody.setAccessible(true);
        return (boolean) requiresRequestBody.invoke(null, method);
    }

    /**
     * 用例描述：验证 POST 方法需要创建请求体
     * 预制条件：无
     * 输入参数：method = "POST"
     * 预期结果：返回 true，表示需要为空 body 的 POST 请求创建空 RequestBody
     *
     * @throws Exception 反射调用可能抛出的异常
     */
    @Test
    public void testRequiresRequestBodyShouldReturnTrueForPost() throws Exception {
        // Test scenario: POST method should require a request body
        Assert.assertTrue("POST should require request body", invokeRequiresRequestBody("POST"));
    }

    /**
     * 用例描述：验证 PUT 方法需要创建请求体
     * 预制条件：无
     * 输入参数：method = "PUT"
     * 预期结果：返回 true，表示需要为空 body 的 PUT 请求创建空 RequestBody
     *
     * @throws Exception 反射调用可能抛出的异常
     */
    @Test
    public void testRequiresRequestBodyShouldReturnTrueForPut() throws Exception {
        // Test scenario: PUT method should require a request body
        Assert.assertTrue("PUT should require request body", invokeRequiresRequestBody("PUT"));
    }

    /**
     * 用例描述：验证 PATCH 方法需要创建请求体
     * 预制条件：无
     * 输入参数：method = "PATCH"
     * 预期结果：返回 true，表示需要为空 body 的 PATCH 请求创建空 RequestBody
     *
     * @throws Exception 反射调用可能抛出的异常
     */
    @Test
    public void testRequiresRequestBodyShouldReturnTrueForPatch() throws Exception {
        // Test scenario: PATCH method should require a request body
        Assert.assertTrue("PATCH should require request body", invokeRequiresRequestBody("PATCH"));
    }

    /**
     * 用例描述：验证 PROPPATCH 方法需要创建请求体
     * 预制条件：无
     * 输入参数：method = "PROPPATCH"
     * 预期结果：返回 true，表示需要为空 body 的 PROPPATCH 请求创建空 RequestBody
     *
     * @throws Exception 反射调用可能抛出的异常
     */
    @Test
    public void testRequiresRequestBodyShouldReturnTrueForProppatch() throws Exception {
        // Test scenario: PROPPATCH method should require a request body
        Assert.assertTrue("PROPPATCH should require request body", invokeRequiresRequestBody("PROPPATCH"));
    }

    /**
     * 用例描述：验证 REPORT 方法需要创建请求体
     * 预制条件：无
     * 输入参数：method = "REPORT"
     * 预期结果：返回 true，表示需要为空 body 的 REPORT 请求创建空 RequestBody
     *
     * @throws Exception 反射调用可能抛出的异常
     */
    @Test
    public void testRequiresRequestBodyShouldReturnTrueForReport() throws Exception {
        // Test scenario: REPORT method should require a request body
        Assert.assertTrue("REPORT should require request body", invokeRequiresRequestBody("REPORT"));
    }

    /**
     * 用例描述：验证 GET 方法不需要创建请求体
     * 预制条件：无
     * 输入参数：method = "GET"
     * 预期结果：返回 false，表示 GET 请求不需要创建空 RequestBody
     *
     * @throws Exception 反射调用可能抛出的异常
     */
    @Test
    public void testRequiresRequestBodyShouldReturnFalseForGet() throws Exception {
        // Test scenario: GET method should not require a request body
        Assert.assertFalse("GET should not require request body", invokeRequiresRequestBody("GET"));
    }

    /**
     * 用例描述：验证 DELETE 方法不需要创建请求体
     * 预制条件：无
     * 输入参数：method = "DELETE"
     * 预期结果：返回 false，表示 DELETE 请求不需要创建空 RequestBody
     *
     * @throws Exception 反射调用可能抛出的异常
     */
    @Test
    public void testRequiresRequestBodyShouldReturnFalseForDelete() throws Exception {
        // Test scenario: DELETE method should not require a request body
        Assert.assertFalse("DELETE should not require request body", invokeRequiresRequestBody("DELETE"));
    }

    /**
     * 用例描述：验证 HEAD 方法不需要创建请求体
     * 预制条件：无
     * 输入参数：method = "HEAD"
     * 预期结果：返回 false，表示 HEAD 请求不需要创建空 RequestBody
     *
     * @throws Exception 反射调用可能抛出的异常
     */
    @Test
    public void testRequiresRequestBodyShouldReturnFalseForHead() throws Exception {
        // Test scenario: HEAD method should not require a request body
        Assert.assertFalse("HEAD should not require request body", invokeRequiresRequestBody("HEAD"));
    }

    /**
     * 用例描述：验证 OPTIONS 方法不需要创建请求体
     * 预制条件：无
     * 输入参数：method = "OPTIONS"
     * 预期结果：返回 false，表示 OPTIONS 请求不需要创建空 RequestBody
     *
     * @throws Exception 反射调用可能抛出的异常
     */
    @Test
    public void testRequiresRequestBodyShouldReturnFalseForOptions() throws Exception {
        // Test scenario: OPTIONS method should not require a request body
        Assert.assertFalse("OPTIONS should not require request body", invokeRequiresRequestBody("OPTIONS"));
    }

    /**
     * 用例描述：验证小写方法名不被识别为需要请求体的方法（该方法严格匹配大写）
     * 预制条件：无
     * 输入参数：method = "post"（小写）
     * 预期结果：返回 false，因为 requiresRequestBody 严格匹配大写字符串
     *
     * @throws Exception 反射调用可能抛出的异常
     */
    @Test
    public void testRequiresRequestBodyShouldReturnFalseForLowercasePost() throws Exception {
        // Test scenario: lowercase "post" should not match, method is case-sensitive
        Assert.assertFalse("lowercase 'post' should not require request body", invokeRequiresRequestBody("post"));
    }

    /**
     * 用例描述：验证混合大小写方法名不被识别为需要请求体的方法
     * 预制条件：无
     * 输入参数：method = "Put"（混合大小写）
     * 预期结果：返回 false，因为 requiresRequestBody 严格匹配全大写字符串
     *
     * @throws Exception 反射调用可能抛出的异常
     */
    @Test
    public void testRequiresRequestBodyShouldReturnFalseForMixedCasePut() throws Exception {
        // Test scenario: mixed-case "Put" should not match, method is case-sensitive
        Assert.assertFalse("mixed-case 'Put' should not require request body", invokeRequiresRequestBody("Put"));
    }

    /**
     * 用例描述：验证空字符串不被识别为需要请求体的方法
     * 预制条件：无
     * 输入参数：method = ""（空字符串）
     * 预期结果：返回 false，空字符串不匹配任何已知方法
     *
     * @throws Exception 反射调用可能抛出的异常
     */
    @Test
    public void testRequiresRequestBodyShouldReturnFalseForEmptyString() throws Exception {
        // Test scenario: empty string should not require a request body
        Assert.assertFalse("empty string should not require request body", invokeRequiresRequestBody(""));
    }

    /**
     * 用例描述：验证未知方法名不被识别为需要请求体的方法
     * 预制条件：无
     * 输入参数：method = "UNKNOWN"
     * 预期结果：返回 false，未知方法不匹配任何已知需要 body 的方法
     *
     * @throws Exception 反射调用可能抛出的异常
     */
    @Test
    public void testRequiresRequestBodyShouldReturnFalseForUnknownMethod() throws Exception {
        // Test scenario: unknown method should not require a request body
        Assert.assertFalse("unknown method should not require request body", invokeRequiresRequestBody("UNKNOWN"));
    }
}
