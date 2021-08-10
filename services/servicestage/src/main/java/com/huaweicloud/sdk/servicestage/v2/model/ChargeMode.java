package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/** 收费模式，支持provided、on_demanded、monthly三种模式。 默认provided，表示使用用户提供的已有资源，无需收费。 */
public class ChargeMode {

    /** Enum PROVIDED for value: "provided" */
    public static final ChargeMode PROVIDED = new ChargeMode("provided");

    /** Enum ON_DEMANDED for value: "on_demanded" */
    public static final ChargeMode ON_DEMANDED = new ChargeMode("on_demanded");

    /** Enum MONTHLY for value: "monthly" */
    public static final ChargeMode MONTHLY = new ChargeMode("monthly");

    private static final Map<String, ChargeMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, ChargeMode> createStaticFields() {
        Map<String, ChargeMode> map = new HashMap<>();
        map.put("provided", PROVIDED);
        map.put("on_demanded", ON_DEMANDED);
        map.put("monthly", MONTHLY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ChargeMode(String value) {
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
    public static ChargeMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        ChargeMode result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new ChargeMode(value);
        }
        return result;
    }

    public static ChargeMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        ChargeMode result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ChargeMode) {
            return this.value.equals(((ChargeMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
