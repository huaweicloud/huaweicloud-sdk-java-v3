/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
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

package com.huaweicloud.sdk.corexml;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TestXmlUtils {
    public static class TestObject {
        private String string;

        private Boolean aBoolean;
        private Integer aInt;

        private Long aLong;

        private Float aFloat;

        private Double aDouble;

        private BigDecimal decimal;

        public TestObject() {

        }

        public TestObject(String s, Boolean b, Integer i, Long l, Float f, Double d, BigDecimal dec) {
            this.string = s;
            this.aBoolean = b;
            this.aInt = i;
            this.aLong = l;
            this.aFloat = f;
            this.aDouble = d;
            this.decimal = dec;
        }

        public Integer getaInt() {
            return aInt;
        }

        public void setaInt(Integer aInt) {
            this.aInt = aInt;
        }

        public Long getaLong() {
            return aLong;
        }

        public void setaLong(Long aLong) {
            this.aLong = aLong;
        }

        public Float getaFloat() {
            return aFloat;
        }

        public void setaFloat(Float aFloat) {
            this.aFloat = aFloat;
        }

        public Double getaDouble() {
            return aDouble;
        }

        public void setaDouble(Double aDouble) {
            this.aDouble = aDouble;
        }

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }

        public Boolean getaBoolean() {
            return aBoolean;
        }

        public void setaBoolean(Boolean aBoolean) {
            this.aBoolean = aBoolean;
        }

        public BigDecimal getDecimal() {
            return decimal;
        }

        public void setDecimal(BigDecimal decimal) {
            this.decimal = decimal;
        }
    }

    @Test
    public void testBasicType() {
        String s = "test";
        Boolean b = true;
        Integer i = 100;
        Long l = 10000000L;
        Float f = 1.23f;
        Double d = 5.789;
        BigDecimal decimal = new BigDecimal("123456789.11");
        String expectedXml = "<TestObject><string>test</string><aBoolean>true</aBoolean><aInt>100</aInt><aLong>10000" +
                "000</aLong><aFloat>1.23</aFloat><aDouble>5.789</aDouble><decimal>123456789.11</decimal></TestObject>";

        TestObject obj = new TestObject(s, b, i, l, f, d, decimal);
        String xml = XmlUtils.toXML(obj);
        Assert.assertEquals(expectedXml, xml);

        TestObject obj1 = XmlUtils.toObject(expectedXml, TestObject.class);
        Assert.assertNotNull(obj1);
        Assert.assertEquals(s, obj1.getString());
        Assert.assertEquals(b, obj1.getaBoolean());
        Assert.assertEquals(i, obj1.getaInt());
        Assert.assertEquals(l, obj1.getaLong());
        Assert.assertEquals(f, obj1.getaFloat());
        Assert.assertEquals(d, obj1.getaDouble());
        Assert.assertEquals(decimal, obj1.getDecimal());
    }
}
