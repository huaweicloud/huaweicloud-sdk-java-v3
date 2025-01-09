package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 系统类型： * &#x60;Linux&#x60; - * &#x60;Windows&#x60; - * &#x60;Other&#x60; -
 */
public class OsTypeEnum {

    /**
     * Enum LINUX for value: "Linux"
     */
    public static final OsTypeEnum LINUX = new OsTypeEnum("Linux");

    /**
     * Enum WINDOWS for value: "Windows"
     */
    public static final OsTypeEnum WINDOWS = new OsTypeEnum("Windows");

    /**
     * Enum OTHER for value: "Other"
     */
    public static final OsTypeEnum OTHER = new OsTypeEnum("Other");

    private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, OsTypeEnum> createStaticFields() {
        Map<String, OsTypeEnum> map = new HashMap<>();
        map.put("Linux", LINUX);
        map.put("Windows", WINDOWS);
        map.put("Other", OTHER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    OsTypeEnum(String value) {
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
    public static OsTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsTypeEnum(value));
    }

    public static OsTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OsTypeEnum) {
            return this.value.equals(((OsTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
