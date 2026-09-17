/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2026-2026. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */

package com.huaweicloud.sdk.core;

import com.huaweicloud.sdk.core.auth.AccessorOptions;
import com.huaweicloud.sdk.core.auth.IamHelper;
import com.huaweicloud.sdk.core.auth.OidcAgencyAccessor;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.internal.model.Credential;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.Silent.class)
public class OidcAgencyAccessorTest {

    private static final String MOCK_PROVIDER_URN = "iam::account:identityProvider:oidc-provider/test";

    private static final String MOCK_AGENCY_URN = "iam::account:agency:test";

    private static final String MOCK_AGENCY_SESSION_NAME = "oidc-session";

    private static final String MOCK_ID_TOKEN = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.test";

    private static final String MOCK_REGION = "cn-north-7";

    private static final List<String> MOCK_POLICY_IDS = Arrays.asList("pid-1", "pid-2");

    private static final String TOKEN_FILE = Paths.get("src", "test", "resources", "TestTokenFile")
            .toAbsolutePath().toString();

    @Test
    public void testGetCredentialWithIdToken() {
        Credential expected = new Credential();
        expected.setAccess("test-ak");
        expected.setSecret("test-sk");
        expected.setSecurityToken("test-token");
        expected.setExpiresAt(System.currentTimeMillis() + 3600000L);

        AccessorOptions options = new AccessorOptions.Builder()
                .providerUrn(MOCK_PROVIDER_URN)
                .agencyUrn(MOCK_AGENCY_URN)
                .agencySessionName(MOCK_AGENCY_SESSION_NAME)
                .idToken(MOCK_ID_TOKEN)
                .regionId(MOCK_REGION)
                .build();

        OidcAgencyAccessor accessor = new OidcAgencyAccessor();

        try (MockedStatic<IamHelper> mocked = Mockito.mockStatic(IamHelper.class)) {
            mocked.when(() -> IamHelper.getStsEndpoint(Mockito.any())).thenReturn("https://sts.myhuaweicloud.com");
            mocked.when(() -> IamHelper.assumeAgencyWithOidc(
                    Mockito.any(),
                    Mockito.eq(MOCK_PROVIDER_URN),
                    Mockito.eq(MOCK_AGENCY_URN),
                    Mockito.eq(MOCK_AGENCY_SESSION_NAME),
                    Mockito.eq(MOCK_ID_TOKEN),
                    Mockito.eq(3600),
                    Mockito.isNull(),
                    Mockito.isNull(),
                    Mockito.eq(MOCK_REGION))).thenReturn(expected);

            Credential actual = accessor.getCredential(options);
            Assert.assertEquals("test-ak", actual.getAccess());
            Assert.assertEquals("test-sk", actual.getSecret());
            Assert.assertEquals("test-token", actual.getSecurityToken());
        }
    }

    @Test
    public void testGetCredentialWithCustomDurationAndPolicy() {
        Credential expected = new Credential();
        expected.setAccess("policy-ak");

        AccessorOptions options = new AccessorOptions.Builder()
                .providerUrn(MOCK_PROVIDER_URN)
                .agencyUrn(MOCK_AGENCY_URN)
                .agencySessionName(MOCK_AGENCY_SESSION_NAME)
                .idToken(MOCK_ID_TOKEN)
                .durationSeconds(7200)
                .policy("{\"Version\":\"5.0\"}")
                .policyIds(MOCK_POLICY_IDS)
                .regionId(MOCK_REGION)
                .build();

        OidcAgencyAccessor accessor = new OidcAgencyAccessor();

        try (MockedStatic<IamHelper> mocked = Mockito.mockStatic(IamHelper.class)) {
            mocked.when(() -> IamHelper.getStsEndpoint(Mockito.any())).thenReturn("https://sts.myhuaweicloud.com");
            mocked.when(() -> IamHelper.assumeAgencyWithOidc(
                    Mockito.any(),
                    Mockito.eq(MOCK_PROVIDER_URN),
                    Mockito.eq(MOCK_AGENCY_URN),
                    Mockito.eq(MOCK_AGENCY_SESSION_NAME),
                    Mockito.eq(MOCK_ID_TOKEN),
                    Mockito.eq(7200),
                    Mockito.eq("{\"Version\":\"5.0\"}"),
                    Mockito.eq(MOCK_POLICY_IDS),
                    Mockito.eq(MOCK_REGION))).thenReturn(expected);

            Credential actual = accessor.getCredential(options);
            Assert.assertEquals("policy-ak", actual.getAccess());
        }
    }

    @Test
    public void testGetCredentialWithIdTokenFile() {
        Credential expected = new Credential();
        expected.setAccess("file-ak");

        AccessorOptions options = new AccessorOptions.Builder()
                .providerUrn(MOCK_PROVIDER_URN)
                .agencyUrn(MOCK_AGENCY_URN)
                .agencySessionName(MOCK_AGENCY_SESSION_NAME)
                .oidcIdTokenFile(TOKEN_FILE)
                .regionId(MOCK_REGION)
                .build();

        OidcAgencyAccessor accessor = new OidcAgencyAccessor();

        try (MockedStatic<IamHelper> mocked = Mockito.mockStatic(IamHelper.class)) {
            mocked.when(() -> IamHelper.getStsEndpoint(Mockito.any())).thenReturn("https://sts.myhuaweicloud.com");
            mocked.when(() -> IamHelper.assumeAgencyWithOidc(
                    Mockito.any(),
                    Mockito.eq(MOCK_PROVIDER_URN),
                    Mockito.eq(MOCK_AGENCY_URN),
                    Mockito.eq(MOCK_AGENCY_SESSION_NAME),
                    Mockito.anyString(),
                    Mockito.eq(3600),
                    Mockito.isNull(),
                    Mockito.isNull(),
                    Mockito.eq(MOCK_REGION))).thenReturn(expected);

            Credential actual = accessor.getCredential(options);
            Assert.assertEquals("file-ak", actual.getAccess());
        }
    }

    @Test
    public void testGetCredentialWithoutIdTokenThrowsException() {
        AccessorOptions options = new AccessorOptions.Builder()
                .providerUrn(MOCK_PROVIDER_URN)
                .agencyUrn(MOCK_AGENCY_URN)
                .agencySessionName(MOCK_AGENCY_SESSION_NAME)
                .regionId(MOCK_REGION)
                .build();

        OidcAgencyAccessor accessor = new OidcAgencyAccessor();

        try {
            accessor.getCredential(options);
            Assert.fail("should throw SdkException");
        } catch (SdkException e) {
            Assert.assertTrue(e.getMessage().contains("idToken is required"));
        }
    }

    @Test
    public void testGetCredentialWithDefaultDuration() {
        Credential expected = new Credential();
        expected.setAccess("default-duration-ak");

        AccessorOptions options = new AccessorOptions.Builder()
                .providerUrn(MOCK_PROVIDER_URN)
                .agencyUrn(MOCK_AGENCY_URN)
                .agencySessionName(MOCK_AGENCY_SESSION_NAME)
                .idToken(MOCK_ID_TOKEN)
                .regionId(MOCK_REGION)
                .build();

        OidcAgencyAccessor accessor = new OidcAgencyAccessor();

        try (MockedStatic<IamHelper> mocked = Mockito.mockStatic(IamHelper.class)) {
            mocked.when(() -> IamHelper.getStsEndpoint(Mockito.any())).thenReturn("https://sts.myhuaweicloud.com");
            mocked.when(() -> IamHelper.assumeAgencyWithOidc(
                    Mockito.any(),
                    Mockito.eq(MOCK_PROVIDER_URN),
                    Mockito.eq(MOCK_AGENCY_URN),
                    Mockito.eq(MOCK_AGENCY_SESSION_NAME),
                    Mockito.eq(MOCK_ID_TOKEN),
                    Mockito.eq(3600),
                    Mockito.isNull(),
                    Mockito.isNull(),
                    Mockito.eq(MOCK_REGION))).thenReturn(expected);

            Credential actual = accessor.getCredential(options);
            Assert.assertEquals("default-duration-ak", actual.getAccess());
        }
    }

    @Test
    public void testGetCredentialWithIdTokenPriorityOverFile() {
        Credential expected = new Credential();
        expected.setAccess("priority-ak");

        AccessorOptions options = new AccessorOptions.Builder()
                .providerUrn(MOCK_PROVIDER_URN)
                .agencyUrn(MOCK_AGENCY_URN)
                .agencySessionName(MOCK_AGENCY_SESSION_NAME)
                .idToken(MOCK_ID_TOKEN)
                .oidcIdTokenFile(TOKEN_FILE)
                .regionId(MOCK_REGION)
                .build();

        OidcAgencyAccessor accessor = new OidcAgencyAccessor();

        try (MockedStatic<IamHelper> mocked = Mockito.mockStatic(IamHelper.class)) {
            mocked.when(() -> IamHelper.getStsEndpoint(Mockito.any())).thenReturn("https://sts.myhuaweicloud.com");
            mocked.when(() -> IamHelper.assumeAgencyWithOidc(
                    Mockito.any(),
                    Mockito.eq(MOCK_PROVIDER_URN),
                    Mockito.eq(MOCK_AGENCY_URN),
                    Mockito.eq(MOCK_AGENCY_SESSION_NAME),
                    Mockito.eq(MOCK_ID_TOKEN),
                    Mockito.eq(3600),
                    Mockito.isNull(),
                    Mockito.isNull(),
                    Mockito.eq(MOCK_REGION))).thenReturn(expected);

            Credential actual = accessor.getCredential(options);
            Assert.assertEquals("priority-ak", actual.getAccess());
        }
    }

    @Test
    public void testGetCredentialWithEmptyTokenFileThrowsException() throws Exception {
        Path emptyFile = Files.createTempFile("empty-token", ".txt");
        try {
            AccessorOptions options = new AccessorOptions.Builder()
                    .providerUrn(MOCK_PROVIDER_URN)
                    .agencyUrn(MOCK_AGENCY_URN)
                    .agencySessionName(MOCK_AGENCY_SESSION_NAME)
                    .oidcIdTokenFile(emptyFile.toString())
                    .regionId(MOCK_REGION)
                    .build();

            OidcAgencyAccessor accessor = new OidcAgencyAccessor();

            try {
                accessor.getCredential(options);
                Assert.fail("should throw SdkException for empty token file");
            } catch (SdkException e) {
                Assert.assertTrue("error message should mention empty content in file",
                        e.getMessage().contains("The content is empty in file"));
            }
        } finally {
            Files.deleteIfExists(emptyFile);
        }
    }

    @Test
    public void testGetCredentialWithNonExistentTokenFileThrowsException() {
        String nonExistentPath = Paths.get("src", "test", "resources", "NonExistentTokenFile")
                .toAbsolutePath().toString();

        AccessorOptions options = new AccessorOptions.Builder()
                .providerUrn(MOCK_PROVIDER_URN)
                .agencyUrn(MOCK_AGENCY_URN)
                .agencySessionName(MOCK_AGENCY_SESSION_NAME)
                .oidcIdTokenFile(nonExistentPath)
                .regionId(MOCK_REGION)
                .build();

        OidcAgencyAccessor accessor = new OidcAgencyAccessor();

            try {
                accessor.getCredential(options);
                Assert.fail("should throw SdkException for non-existent token file");
            } catch (SdkException e) {
                Assert.assertTrue("error message should contain the file path",
                        e.getMessage().contains("NonExistentTokenFile"));
            }
    }

    /**
     * 用例描述：通过 oidcIdTokenFile 指定 ID Token 文件，同时设置自定义 durationSeconds、policy 和 policyIds，
     *           验证文件内容被正确读取并透传给 IamHelper.assumeAgencyWithOidc，且自定义参数均生效。
     * 预制条件：TestTokenFile 文件存在且内容为 "token_value"。
     * 输入参数：oidcIdTokenFile(TOKEN_FILE)、durationSeconds(7200)、policy、policyIds、regionId。
     * 预期结果：返回的 Credential 与 mock 一致；mock 匹配条件使用精确的文件内容 "token_value" 而非 anyString。
     */
    @Test
    public void testGetCredentialWithIdTokenFileAndCustomOptions() {
        Credential expected = new Credential();
        expected.setAccess("file-custom-ak");
        expected.setSecret("file-custom-sk");
        expected.setSecurityToken("file-custom-token");

        AccessorOptions options = new AccessorOptions.Builder()
                .providerUrn(MOCK_PROVIDER_URN)
                .agencyUrn(MOCK_AGENCY_URN)
                .agencySessionName(MOCK_AGENCY_SESSION_NAME)
                .oidcIdTokenFile(TOKEN_FILE)
                .durationSeconds(7200)
                .policy("{\"Version\":\"5.0\"}")
                .policyIds(MOCK_POLICY_IDS)
                .regionId(MOCK_REGION)
                .build();

        OidcAgencyAccessor accessor = new OidcAgencyAccessor();

        try (MockedStatic<IamHelper> mocked = Mockito.mockStatic(IamHelper.class)) {
            mocked.when(() -> IamHelper.getStsEndpoint(Mockito.any())).thenReturn("https://sts.myhuaweicloud.com");
            mocked.when(() -> IamHelper.assumeAgencyWithOidc(
                    Mockito.any(),
                    Mockito.eq(MOCK_PROVIDER_URN),
                    Mockito.eq(MOCK_AGENCY_URN),
                    Mockito.eq(MOCK_AGENCY_SESSION_NAME),
                    Mockito.eq("token_value"),
                    Mockito.eq(7200),
                    Mockito.eq("{\"Version\":\"5.0\"}"),
                    Mockito.eq(MOCK_POLICY_IDS),
                    Mockito.eq(MOCK_REGION))).thenReturn(expected);

            Credential actual = accessor.getCredential(options);
            Assert.assertEquals("file-custom-ak", actual.getAccess());
            Assert.assertEquals("file-custom-sk", actual.getSecret());
            Assert.assertEquals("file-custom-token", actual.getSecurityToken());
        }
    }
}
