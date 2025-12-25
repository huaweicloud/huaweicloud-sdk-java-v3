package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 处理错误 - NONE 无  **约束限制** 不涉及 **取值范围**: - NONE  **默认值** 不涉及      
 */
public class ProcessError {

    /**
     * Enum NONE for value: "NONE"
     */
    public static final ProcessError NONE = new ProcessError("NONE");

    private static final Map<String, ProcessError> STATIC_FIELDS = createStaticFields();

    private static Map<String, ProcessError> createStaticFields() {
        Map<String, ProcessError> map = new HashMap<>();
        map.put("NONE", NONE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ProcessError(String value) {
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
    public static ProcessError fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProcessError(value));
    }

    public static ProcessError valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ProcessError) {
            return this.value.equals(((ProcessError) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
