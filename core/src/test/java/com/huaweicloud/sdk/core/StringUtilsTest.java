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

import com.huaweicloud.sdk.core.utils.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(JUnit4.class)
public class StringUtilsTest {
    @Test
    public void testIsEmpty() {
        Assert.assertTrue(StringUtils.isEmpty(null));
        Assert.assertTrue(StringUtils.isEmpty(""));
        Assert.assertFalse(StringUtils.isEmpty(" "));
        Assert.assertFalse(StringUtils.isEmpty("a"));
    }

    @RunWith(Parameterized.class)
    public static class MaskTest {
        private final String input;
        private final double maskRatio;
        private final char maskChar;
        private final String expected;

        public MaskTest(String input, double maskRatio, char maskChar, String expected) {
            this.input = input;
            this.maskRatio = maskRatio;
            this.maskChar = maskChar;
            this.expected = expected;
        }

        @Parameterized.Parameters(name = "{0},{1},{2} -> {3}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {"abcdefghijklmnopqrstuvwxyz123456", 0.7, '*', "abcde**********************23456"},
                    {"123456", 0.8, '*', "1****6"},
                    {"12345", 0.8, '*', "****5"},
                    {"12345", 1, '*', "*****"},
                    {"12345", 1.5, '*', "*****"},
                    {"12345", 0, '*', "12345"},
                    {"12345", -1, '*', "12345"}
            });
        }

        @Test
        public void testMask() {
            Assert.assertEquals(expected, StringUtils.mask(input, maskRatio, maskChar));
        }
    }
}
