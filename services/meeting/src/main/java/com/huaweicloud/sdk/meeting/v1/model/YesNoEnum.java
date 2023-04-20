package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 是、否 通用枚举
 */
public class YesNoEnum {

    /**
     * Enum Y for value: "Y"
     */
    public static final YesNoEnum Y = new YesNoEnum("Y");

    /**
     * Enum N for value: "N"
     */
    public static final YesNoEnum N = new YesNoEnum("N");

    private static final Map<String, YesNoEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, YesNoEnum> createStaticFields() {
        Map<String, YesNoEnum> map = new HashMap<>();
        map.put("Y", Y);
        map.put("N", N);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    YesNoEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static YesNoEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        YesNoEnum result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new YesNoEnum(value);
        }
        return result;
    }

    public static YesNoEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        YesNoEnum result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof YesNoEnum) {
            return this.value.equals(((YesNoEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
