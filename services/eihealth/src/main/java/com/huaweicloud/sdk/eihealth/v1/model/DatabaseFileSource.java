package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据库文件来源
 */
public class DatabaseFileSource {

    /**
     * Enum PUBLIC for value: "public"
     */
    public static final DatabaseFileSource PUBLIC = new DatabaseFileSource("public");

    /**
     * Enum PRIVATE for value: "private"
     */
    public static final DatabaseFileSource PRIVATE = new DatabaseFileSource("private");

    private static final Map<String, DatabaseFileSource> STATIC_FIELDS = createStaticFields();

    private static Map<String, DatabaseFileSource> createStaticFields() {
        Map<String, DatabaseFileSource> map = new HashMap<>();
        map.put("public", PUBLIC);
        map.put("private", PRIVATE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DatabaseFileSource(String value) {
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
    public static DatabaseFileSource fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DatabaseFileSource(value));
    }

    public static DatabaseFileSource valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DatabaseFileSource) {
            return this.value.equals(((DatabaseFileSource) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
