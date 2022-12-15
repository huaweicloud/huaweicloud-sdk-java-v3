/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import java.math.BigDecimal;

/**
 * BasicRequestBody
 *
 * @since 2022-11-18
 */
public class BasicRequestBody {
    private byte byteValue;
    private boolean boolValue;
    private int intValue;
    private long longValue;
    private double doubleValue;
    private BigDecimal bigDecimalValue;
    private String stringValue;

    public BasicRequestBody(byte b, boolean bool, int n, long l, double d, BigDecimal big, String s) {
        this.byteValue = b;
        this.boolValue = bool;
        this.intValue = n;
        this.longValue = l;
        this.doubleValue = d;
        this.bigDecimalValue = big;
        this.stringValue = s;
    }

    public byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(byte byteValue) {
        this.byteValue = byteValue;
    }

    public boolean isBoolValue() {
        return boolValue;
    }

    public void setBoolValue(boolean boolValue) {
        this.boolValue = boolValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public BigDecimal getBigDecimalValue() {
        return bigDecimalValue;
    }

    public void setBigDecimalValue(BigDecimal bigDecimalValue) {
        this.bigDecimalValue = bigDecimalValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
}
