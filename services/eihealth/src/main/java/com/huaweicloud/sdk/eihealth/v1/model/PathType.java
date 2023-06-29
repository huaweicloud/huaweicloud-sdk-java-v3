package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets PathType
 */
public class PathType {

    /**
     * Enum FILE for value: "FILE"
     */
    public static final PathType FILE = new PathType("FILE");

    /**
     * Enum FOLDER for value: "FOLDER"
     */
    public static final PathType FOLDER = new PathType("FOLDER");

    private static final Map<String, PathType> STATIC_FIELDS = createStaticFields();

    private static Map<String, PathType> createStaticFields() {
        Map<String, PathType> map = new HashMap<>();
        map.put("FILE", FILE);
        map.put("FOLDER", FOLDER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PathType(String value) {
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
    public static PathType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PathType(value));
    }

    public static PathType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PathType) {
            return this.value.equals(((PathType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
