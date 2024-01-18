package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 平台类型： * &#x60;AD&#x60; - AD域 * &#x60;LOCAL&#x60; - LiteAs * &#x60;SYSTEM&#x60; - 系统内置
 */
public class PlatformTypeEnum {

    /**
     * Enum AD for value: "AD"
     */
    public static final PlatformTypeEnum AD = new PlatformTypeEnum("AD");

    /**
     * Enum LOCAL for value: "LOCAL"
     */
    public static final PlatformTypeEnum LOCAL = new PlatformTypeEnum("LOCAL");

    /**
     * Enum SYSTEM for value: "SYSTEM"
     */
    public static final PlatformTypeEnum SYSTEM = new PlatformTypeEnum("SYSTEM");

    private static final Map<String, PlatformTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, PlatformTypeEnum> createStaticFields() {
        Map<String, PlatformTypeEnum> map = new HashMap<>();
        map.put("AD", AD);
        map.put("LOCAL", LOCAL);
        map.put("SYSTEM", SYSTEM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PlatformTypeEnum(String value) {
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
    public static PlatformTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PlatformTypeEnum(value));
    }

    public static PlatformTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PlatformTypeEnum) {
            return this.value.equals(((PlatformTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
