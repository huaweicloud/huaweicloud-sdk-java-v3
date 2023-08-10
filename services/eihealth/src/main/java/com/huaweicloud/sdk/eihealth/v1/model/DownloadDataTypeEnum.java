package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets DownloadDataTypeEnum
 */
public class DownloadDataTypeEnum {

    /**
     * Enum PRIVATE for value: "PRIVATE"
     */
    public static final DownloadDataTypeEnum PRIVATE = new DownloadDataTypeEnum("PRIVATE");

    /**
     * Enum PUBLIC for value: "PUBLIC"
     */
    public static final DownloadDataTypeEnum PUBLIC = new DownloadDataTypeEnum("PUBLIC");

    private static final Map<String, DownloadDataTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, DownloadDataTypeEnum> createStaticFields() {
        Map<String, DownloadDataTypeEnum> map = new HashMap<>();
        map.put("PRIVATE", PRIVATE);
        map.put("PUBLIC", PUBLIC);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DownloadDataTypeEnum(String value) {
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
    public static DownloadDataTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DownloadDataTypeEnum(value));
    }

    public static DownloadDataTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DownloadDataTypeEnum) {
            return this.value.equals(((DownloadDataTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
