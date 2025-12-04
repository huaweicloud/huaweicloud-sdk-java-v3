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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TestEnumClass {
    public static final class VolumetypeEnum {
        public static final VolumetypeEnum SATA = new VolumetypeEnum("SATA");

        public static final VolumetypeEnum SAS = new VolumetypeEnum("SAS");

        public static final VolumetypeEnum SSD = new VolumetypeEnum("SSD");

        private final String value;

        private static final Map<String, VolumetypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VolumetypeEnum> createStaticFields() {
            Map<String, VolumetypeEnum> map = new HashMap<>();
            map.put("SATA", SATA);
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            return Collections.unmodifiableMap(map);
        }

        VolumetypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VolumetypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VolumetypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VolumetypeEnum(value);
            }
            return result;
        }

        public static VolumetypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VolumetypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }

            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VolumetypeEnum) {
                return this.value.equals(((VolumetypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    public static class EnumClass {
        private VolumetypeEnum volumetypeEnum;

        public VolumetypeEnum getVolumetypeEnum() {
            return volumetypeEnum;
        }

        public void setVolumetypeEnum(VolumetypeEnum volumetypeEnum) {
            this.volumetypeEnum = volumetypeEnum;
        }
    }

    @Test
    public void testEnumType() {
        VolumetypeEnum atype = VolumetypeEnum.fromValue("SATA");
        VolumetypeEnum btype = VolumetypeEnum.fromValue("SASC");
        String strJsonA = "{ \"volumetypeEnum\": \"SATA\"}";
        String strJsonB = "{ \"volumetypeEnum\": \"SASC\"}";
        String strJsonC = "{ }";
        EnumClass enumClassA = Objects.requireNonNull(JsonUtils.toObject(strJsonA, EnumClass.class));
        EnumClass enumClassB = Objects.requireNonNull(JsonUtils.toObject(strJsonB, EnumClass.class));
        EnumClass enumClassC = Objects.requireNonNull(JsonUtils.toObject(strJsonC, EnumClass.class));
        Assert.assertEquals(atype, enumClassA.getVolumetypeEnum());
        Assert.assertEquals(btype, enumClassB.getVolumetypeEnum());
        Assert.assertEquals(atype.hashCode(), "SATA".hashCode());
    }
}
