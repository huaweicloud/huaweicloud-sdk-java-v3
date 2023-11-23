package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * LTS日志类型，不能为空，具有以下日志类型。 - audit_log
 */
public class LtsLogType {

    /**
     * Enum AUDIT_LOG for value: "audit_log"
     */
    public static final LtsLogType AUDIT_LOG = new LtsLogType("audit_log");

    private static final Map<String, LtsLogType> STATIC_FIELDS = createStaticFields();

    private static Map<String, LtsLogType> createStaticFields() {
        Map<String, LtsLogType> map = new HashMap<>();
        map.put("audit_log", AUDIT_LOG);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    LtsLogType(String value) {
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
    public static LtsLogType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LtsLogType(value));
    }

    public static LtsLogType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LtsLogType) {
            return this.value.equals(((LtsLogType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
