package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 来源类型。支持源码code和artifact软件包。
 */
public class SourceKind {

    /**
     * Enum CODE for value: "code"
     */
    public static final SourceKind CODE = new SourceKind("code");

    /**
     * Enum ARTIFACT for value: "artifact"
     */
    public static final SourceKind ARTIFACT = new SourceKind("artifact");

    private static final Map<String, SourceKind> STATIC_FIELDS = createStaticFields();

    private static Map<String, SourceKind> createStaticFields() {
        Map<String, SourceKind> map = new HashMap<>();
        map.put("code", CODE);
        map.put("artifact", ARTIFACT);
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
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceKind(value));
    }

    public static SourceKind valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
