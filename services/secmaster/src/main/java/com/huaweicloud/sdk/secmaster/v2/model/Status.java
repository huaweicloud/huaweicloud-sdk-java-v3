package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 状态 - ENABLED 启用 - DISABLED 禁用  **约束限制** 不涉及 **取值范围**: - ENABLED - DISABLED  **默认值** 不涉及    
 */
public class Status {

    /**
     * Enum ENABLED for value: "ENABLED"
     */
    public static final Status ENABLED = new Status("ENABLED");

    /**
     * Enum DISABLED for value: "DISABLED"
     */
    public static final Status DISABLED = new Status("DISABLED");

    private static final Map<String, Status> STATIC_FIELDS = createStaticFields();

    private static Map<String, Status> createStaticFields() {
        Map<String, Status> map = new HashMap<>();
        map.put("ENABLED", ENABLED);
        map.put("DISABLED", DISABLED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Status(String value) {
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
    public static Status fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Status(value));
    }

    public static Status valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            return this.value.equals(((Status) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
