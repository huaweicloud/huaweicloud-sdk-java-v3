/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2025-2025. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
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

import com.huaweicloud.sdk.core.auth.IamHelper;
import com.huaweicloud.sdk.core.auth.StsHelper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StsHelperTest {

    @Rule
    public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

    @Before
    public void setUp() {
        System.clearProperty(Constants.STS_ENDPOINT_PROPERTY_NAME);
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, null);
    }

    @After
    public void tearDown() {
        System.clearProperty(Constants.STS_ENDPOINT_PROPERTY_NAME);
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, null);
    }

    private String invokeGetEndpoint() throws Exception {
        Method method = StsHelper.class.getDeclaredMethod("getEndpoint");
        method.setAccessible(true);
        return (String) method.invoke(null);
    }

    private String invokeGetEndpoint(String id) throws Exception {
        Method method = StsHelper.class.getDeclaredMethod("getEndpoint", String.class);
        method.setAccessible(true);
        return (String) method.invoke(null, id);
    }

    @Test
    public void testGetEndpointBySystemProperty() throws Exception {
        String expected = "https://sts.custom.example.com";
        System.setProperty(Constants.STS_ENDPOINT_PROPERTY_NAME, expected);
        Assert.assertEquals(expected, invokeGetEndpoint());
    }

    @Test
    public void testGetEndpointByEnvVar() throws Exception {
        String expected = "https://sts.env.example.com";
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, expected);
        Assert.assertEquals(expected, invokeGetEndpoint());
    }

    @Test
    public void testGetEndpointReturnsNullWhenNotConfigured() throws Exception {
        Assert.assertNull(invokeGetEndpoint());
    }

    @Test
    public void testGetEndpointSystemPropertyTakesPrecedenceOverEnvVar() throws Exception {
        String propertyValue = "https://sts.property.example.com";
        String envValue = "https://sts.env.example.com";
        System.setProperty(Constants.STS_ENDPOINT_PROPERTY_NAME, propertyValue);
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, envValue);
        Assert.assertEquals(propertyValue, invokeGetEndpoint());
    }

    @Test
    public void testGetEndpointWithIdFallsBackToRegionalConfig() throws Exception {
        String result = invokeGetEndpoint("cn-north-4");
        Assert.assertEquals("https://sts.cn-north-4.myhuaweicloud.com", result);
    }

    @Test
    public void testGetEndpointWithIdReturnsNullWhenRegionNotFound() throws Exception {
        Assert.assertNull(invokeGetEndpoint("unknown-region"));
    }

    @Test
    public void testGetEndpointWithIdReturnsNullWhenIdIsNull() throws Exception {
        Assert.assertNull(invokeGetEndpoint(null));
    }

    @Test
    public void testGetEndpointWithIdReturnsNullWhenIdIsEmpty() throws Exception {
        Assert.assertNull(invokeGetEndpoint(""));
    }

    @Test
    public void testGetEndpointWithIdSystemPropertyTakesPrecedence() throws Exception {
        String expected = "https://sts.custom.example.com";
        System.setProperty(Constants.STS_ENDPOINT_PROPERTY_NAME, expected);
        Assert.assertEquals(expected, invokeGetEndpoint("cn-north-4"));
    }

    @Test
    public void testGetEndpointWithIdEnvVarTakesPrecedenceOverRegionalConfig() throws Exception {
        String expected = "https://sts.env.example.com";
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, expected);
        Assert.assertEquals(expected, invokeGetEndpoint("cn-north-4"));
    }

    @Test
    public void testIamHelperGetStsEndpointDelegatesToStsHelper() {
        Assert.assertEquals("https://sts.cn-north-4.myhuaweicloud.com",
                IamHelper.getStsEndpoint("cn-north-4"));
    }

    @Test
    public void testIamHelperGetStsEndpointReturnsDefaultForUnknownRegion() {
        Assert.assertEquals(Constants.DEFAULT_STS_ENDPOINT,
                IamHelper.getStsEndpoint("unknown-region"));
    }

    @Test
    public void testIamHelperGetStsEndpointReturnsDefaultForNullRegion() {
        Assert.assertEquals(Constants.DEFAULT_STS_ENDPOINT,
                IamHelper.getStsEndpoint(null));
    }

    @Test
    public void testIamHelperGetStsEndpointEnvVarTakesPrecedence() {
        String expected = "https://sts.env.example.com";
        environmentVariables.set(Constants.STS_ENDPOINT_ENV_NAME, expected);
        Assert.assertEquals(expected, IamHelper.getStsEndpoint("cn-north-4"));
    }

    @Test
    public void testIamHelperGetStsEndpointIgnoresSystemProperty() {
        System.setProperty(Constants.STS_ENDPOINT_PROPERTY_NAME, "https://sts.sysprop.example.com");
        Assert.assertEquals(Constants.DEFAULT_STS_ENDPOINT,
                IamHelper.getStsEndpoint("unknown-region"));
    }

    private Object createResponse() throws Exception {
        Class<?> responseClass = Class.forName(
                "com.huaweicloud.sdk.core.auth.StsHelper$GetCallerIdentityResponse");
        Constructor<?> constructor = responseClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }

    private Method getDeclaredMethod(Object obj, String name, Class<?>... paramTypes) throws Exception {
        Method method = obj.getClass().getDeclaredMethod(name, paramTypes);
        method.setAccessible(true);
        return method;
    }

    @Test
    public void testGetCallerIdentityResponseGetterSetter() throws Exception {
        Object response = createResponse();

        getDeclaredMethod(response, "setAccountId", String.class).invoke(response, "test-account-id");
        Assert.assertEquals("test-account-id",
                getDeclaredMethod(response, "getAccountId").invoke(response));

        getDeclaredMethod(response, "setPrincipalUrn", String.class).invoke(response, "test-principal-urn");
        Assert.assertEquals("test-principal-urn",
                getDeclaredMethod(response, "getPrincipalUrn").invoke(response));

        getDeclaredMethod(response, "setPrincipalId", String.class).invoke(response, "test-principal-id");
        Assert.assertEquals("test-principal-id",
                getDeclaredMethod(response, "getPrincipalId").invoke(response));
    }

    @Test
    public void testGetCallerIdentityResponseWithMethods() throws Exception {
        Object response = createResponse();

        Object result = getDeclaredMethod(response, "withAccountId", String.class)
                .invoke(response, "with-account-id");
        Assert.assertSame(response, result);
        Assert.assertEquals("with-account-id",
                getDeclaredMethod(response, "getAccountId").invoke(response));

        result = getDeclaredMethod(response, "withPrincipalUrn", String.class)
                .invoke(response, "with-principal-urn");
        Assert.assertSame(response, result);
        Assert.assertEquals("with-principal-urn",
                getDeclaredMethod(response, "getPrincipalUrn").invoke(response));

        result = getDeclaredMethod(response, "withPrincipalId", String.class)
                .invoke(response, "with-principal-id");
        Assert.assertSame(response, result);
        Assert.assertEquals("with-principal-id",
                getDeclaredMethod(response, "getPrincipalId").invoke(response));
    }
}
