package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 任务创建方式。 * PACKAGE: 使用一个zip包包含所有数据 * SEGMENT: 逐句上传数据
 */
public class CreateType {

    /**
     * Enum PACKAGE for value: "PACKAGE"
     */
    public static final CreateType PACKAGE = new CreateType("PACKAGE");

    /**
     * Enum SEGMENT for value: "SEGMENT"
     */
    public static final CreateType SEGMENT = new CreateType("SEGMENT");

    private static final Map<String, CreateType> STATIC_FIELDS = createStaticFields();

    private static Map<String, CreateType> createStaticFields() {
        Map<String, CreateType> map = new HashMap<>();
        map.put("PACKAGE", PACKAGE);
        map.put("SEGMENT", SEGMENT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    CreateType(String value) {
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
    public static CreateType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CreateType(value));
    }

    public static CreateType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CreateType) {
            return this.value.equals(((CreateType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
