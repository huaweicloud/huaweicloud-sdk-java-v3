package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 模式 - COUNT 计数  **约束限制** 不涉及 **取值范围**: - COUNT  **默认值** 不涉及
 */
public class Mode {

    /**
     * Enum COUNT for value: "COUNT"
     */
    public static final Mode COUNT = new Mode("COUNT");

    private static final Map<String, Mode> STATIC_FIELDS = createStaticFields();

    private static Map<String, Mode> createStaticFields() {
        Map<String, Mode> map = new HashMap<>();
        map.put("COUNT", COUNT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Mode(String value) {
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
    public static Mode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Mode(value));
    }

    public static Mode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Mode) {
            return this.value.equals(((Mode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
