package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * desc(降序), asc(升序).
 */
public class SortDir {

    /**
     * Enum DESC for value: "desc"
     */
    public static final SortDir DESC = new SortDir("desc");

    /**
     * Enum ASC for value: "asc"
     */
    public static final SortDir ASC = new SortDir("asc");

    private static final Map<String, SortDir> STATIC_FIELDS = createStaticFields();

    private static Map<String, SortDir> createStaticFields() {
        Map<String, SortDir> map = new HashMap<>();
        map.put("desc", DESC);
        map.put("asc", ASC);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SortDir(String value) {
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
    public static SortDir fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortDir(value));
    }

    public static SortDir valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SortDir) {
            return this.value.equals(((SortDir) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
