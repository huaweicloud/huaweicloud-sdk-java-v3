package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets SourceKind
 */
public class SourceKind {

    /**
     * Enum CODE for value: "code"
     */
    public static final SourceKind CODE = new SourceKind("code");

    /**
     * Enum PACKAGE for value: "package"
     */
    public static final SourceKind PACKAGE = new SourceKind("package");

    /**
     * Enum IMAGE for value: "image"
     */
    public static final SourceKind IMAGE = new SourceKind("image");

    private static final Map<String, SourceKind> STATIC_FIELDS = createStaticFields();

    private static Map<String, SourceKind> createStaticFields() {
        Map<String, SourceKind> map = new HashMap<>();
        map.put("code", CODE);
        map.put("package", PACKAGE);
        map.put("image", IMAGE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SourceKind(String value) {
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
    public static SourceKind fromValue(String value) {
        if (value == null) {
            return null;
        }
        SourceKind result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new SourceKind(value);
        }
        return result;
    }

    public static SourceKind valueOf(String value) {
        if (value == null) {
            return null;
        }
        SourceKind result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SourceKind) {
            return this.value.equals(((SourceKind) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
