package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 付费会话类型， * &#x60;GPU&#x60; - GPU规格会话 * &#x60;CPU&#x60; - 普通CPU规格会话
 */
public class ExtraSessionTypeEnum {

    /**
     * Enum GPU for value: "GPU"
     */
    public static final ExtraSessionTypeEnum GPU = new ExtraSessionTypeEnum("GPU");

    /**
     * Enum CPU for value: "CPU"
     */
    public static final ExtraSessionTypeEnum CPU = new ExtraSessionTypeEnum("CPU");

    private static final Map<String, ExtraSessionTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ExtraSessionTypeEnum> createStaticFields() {
        Map<String, ExtraSessionTypeEnum> map = new HashMap<>();
        map.put("GPU", GPU);
        map.put("CPU", CPU);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ExtraSessionTypeEnum(String value) {
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
    public static ExtraSessionTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ExtraSessionTypeEnum(value));
    }

    public static ExtraSessionTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ExtraSessionTypeEnum) {
            return this.value.equals(((ExtraSessionTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
