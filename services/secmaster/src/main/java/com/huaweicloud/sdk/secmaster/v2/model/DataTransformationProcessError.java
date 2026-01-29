package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 数据加工处理错误 - NONE 无  **约束限制** 不涉及 **取值范围**: - NONE  **默认值** 不涉及
 */
public class DataTransformationProcessError {

    /**
     * Enum NONE for value: "NONE"
     */
    public static final DataTransformationProcessError NONE = new DataTransformationProcessError("NONE");

    private static final Map<String, DataTransformationProcessError> STATIC_FIELDS = createStaticFields();

    private static Map<String, DataTransformationProcessError> createStaticFields() {
        Map<String, DataTransformationProcessError> map = new HashMap<>();
        map.put("NONE", NONE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DataTransformationProcessError(String value) {
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
    public static DataTransformationProcessError fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElse(new DataTransformationProcessError(value));
    }

    public static DataTransformationProcessError valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DataTransformationProcessError) {
            return this.value.equals(((DataTransformationProcessError) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
