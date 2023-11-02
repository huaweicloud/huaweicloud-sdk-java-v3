package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 模型数据文件来源
 */
public class ModelFileSource {

    /**
     * Enum PUBLIC for value: "public"
     */
    public static final ModelFileSource PUBLIC = new ModelFileSource("public");

    /**
     * Enum PRIVATE for value: "private"
     */
    public static final ModelFileSource PRIVATE = new ModelFileSource("private");

    private static final Map<String, ModelFileSource> STATIC_FIELDS = createStaticFields();

    private static Map<String, ModelFileSource> createStaticFields() {
        Map<String, ModelFileSource> map = new HashMap<>();
        map.put("public", PUBLIC);
        map.put("private", PRIVATE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ModelFileSource(String value) {
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
    public static ModelFileSource fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModelFileSource(value));
    }

    public static ModelFileSource valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ModelFileSource) {
            return this.value.equals(((ModelFileSource) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
