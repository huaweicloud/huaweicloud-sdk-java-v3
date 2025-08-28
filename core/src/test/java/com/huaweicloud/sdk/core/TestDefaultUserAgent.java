/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2025-2025. All rights reserved.
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

import com.huaweicloud.sdk.core.impl.DefaultUserAgent;
import com.huaweicloud.sdk.core.utils.PathUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockedStatic;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import static org.mockito.ArgumentMatchers.any;

public class TestDefaultUserAgent {

    @Test
    public void test_generate_user_agent_when_file_exist() throws IOException {
        String uuid = "0e2250f9-8d6c-443c-be2d-1f1202fa32ca";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(uuid.getBytes(StandardCharsets.UTF_8))))) {

            try (MockedStatic<Files> mockedStatic = org.mockito.Mockito.mockStatic(Files.class);
                 MockedStatic<PathUtils> pathUtils = org.mockito.Mockito.mockStatic(PathUtils.class);) {
                pathUtils.when(() -> PathUtils.getUserHomePath()).thenReturn(System.getProperty("user.home"));
                pathUtils.when(() -> PathUtils.isValidFile(any(File.class))).thenReturn(true);
                mockedStatic.when(() -> Files.newBufferedReader(any(), any())).thenReturn(reader);

                String userAgent = DefaultUserAgent.userAgentString();
                System.out.println(userAgent);
                Assert.assertTrue(userAgent.endsWith(uuid));

            }
        }
    }

    @Test
    public void test_generate_user_agent_when_file_exist_and_value_illegal() throws IOException {
        String uuid = "0e2250f9-8d6c-443c-be2d-1f1202fa32ca00000000000";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(uuid.getBytes(StandardCharsets.UTF_8))))) {

            try (MockedStatic<Files> mockedStatic = org.mockito.Mockito.mockStatic(Files.class);) {
                mockedStatic.when(() -> Files.newBufferedReader(any(), any())).thenReturn(reader);

                String userAgent = DefaultUserAgent.userAgentString();
                System.out.println(userAgent);
                Assert.assertFalse(userAgent.endsWith(uuid));

            }
        }
    }


    @Test
    public void test_generate_user_agent_when_file_not_exist() {
        try (MockedStatic<Files> mockedStatic = org.mockito.Mockito.mockStatic(Files.class);) {
            mockedStatic.when(() -> Files.newBufferedReader(any(), any())).thenThrow(new IOException("File not exist."));
            String userAgent = DefaultUserAgent.userAgentString();
            System.out.println(userAgent);
            Assert.assertTrue(StringUtils.isNotBlank(userAgent));
        }
    }

    @Test
    public void test_generate_user_agent_when_file_not_exist_and_no_permission() {
        try (MockedStatic<Files> mockedStatic = org.mockito.Mockito.mockStatic(Files.class);) {
            mockedStatic.when(() -> Files.newBufferedReader(any(), any())).thenThrow(new IOException("File not exist."));
            mockedStatic.when(() -> Files.write(any(), (byte[]) any())).thenThrow(new IOException("No permission."));
            String userAgent = DefaultUserAgent.userAgentString();
            System.out.println(userAgent);
            Assert.assertTrue(StringUtils.isNotBlank(userAgent));
        }
    }

    @Before
    public void resetInstance() {
        try {
            Field field = DefaultUserAgent.class.getDeclaredField("instance");
            field.setAccessible(true);
            field.set(null, null);
        } catch (NoSuchFieldException | IllegalAccessException ignored) {
        }
    }
}
