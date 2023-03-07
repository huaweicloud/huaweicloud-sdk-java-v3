/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import org.bson.BsonDecimal128;

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
    private BsonDecimal128 decimal128;
    private String stringValue;

    public BasicRequestBody(byte b, boolean bool, int n, long l, double d, BsonDecimal128 dec, String s) {
        this.byteValue = b;
        this.boolValue = bool;
        this.intValue = n;
        this.longValue = l;
        this.doubleValue = d;
        this.decimal128 = dec;
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

    public BsonDecimal128 getDecimal128() {
        return decimal128;
    }

    public void setDecimal128(BsonDecimal128 decimal128) {
        this.decimal128 = decimal128;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
}
