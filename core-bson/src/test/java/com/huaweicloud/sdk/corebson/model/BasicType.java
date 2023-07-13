/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import org.bson.BsonDecimal128;

import java.util.Objects;

/**
 * BasicType
 *
 * @since 2022-11-18
 */
public class BasicType {
    private byte byteValue;
    private boolean boolValue;
    private int intValue;
    private long longValue;
    private double doubleValue;
    private BsonDecimal128 decimal128;
    private String stringValue;

    public BasicType(byte byteValue, boolean bool, int intValue, long longValue,
        double doubleValue, BsonDecimal128 decimal, String str) {
        this.byteValue = byteValue;
        this.boolValue = bool;
        this.intValue = intValue;
        this.longValue = longValue;
        this.doubleValue = doubleValue;
        this.decimal128 = decimal;
        this.stringValue = str;
    }

    /**
     * BasicType
     */
    public BasicType() {
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(byte byteValue) {
        this.byteValue = byteValue;
    }

    public BsonDecimal128 getDecimal128() {
        return decimal128;
    }

    public void setDecimal128(BsonDecimal128 decimal128) {
        this.decimal128 = decimal128;
    }

    public boolean getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(boolean boolValue) {
        this.boolValue = boolValue;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof BasicType) {
            BasicType basicType = (BasicType) object;
            if ((basicType.boolValue == this.boolValue) && (basicType.byteValue == this.byteValue)
                    && (basicType.doubleValue == this.doubleValue)) {
                if ((basicType.intValue == this.intValue)
                        && basicType.decimal128.equals(this.decimal128) && (basicType.longValue == this.longValue)) {
                    if (basicType.stringValue.equals(this.stringValue)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects
                .hash(byteValue, boolValue, intValue, longValue, doubleValue, decimal128, stringValue);
    }
}
