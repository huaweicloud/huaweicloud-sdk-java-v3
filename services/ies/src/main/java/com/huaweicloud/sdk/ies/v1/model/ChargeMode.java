package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 计费模式。 - prepaid：包年/包月
 */
public class ChargeMode {

    /**
     * Enum PREPAID for value: "prepaid"
     */
    public static final ChargeMode PREPAID = new ChargeMode("prepaid");

    private static final Map<String, ChargeMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, ChargeMode> createStaticFields() {
        Map<String, ChargeMode> map = new HashMap<>();
        map.put("prepaid", PREPAID);
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
