package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 服务器组应用类型 * &#x60;SESSION_DESKTOP_APP&#x60; - 会话桌面app * &#x60;COMMON_APP&#x60; - 普通app
 */
public class AppTypeEnum {

    /**
     * Enum SESSION_DESKTOP_APP for value: "SESSION_DESKTOP_APP"
     */
    public static final AppTypeEnum SESSION_DESKTOP_APP = new AppTypeEnum("SESSION_DESKTOP_APP");

    /**
     * Enum COMMON_APP for value: "COMMON_APP"
     */
    public static final AppTypeEnum COMMON_APP = new AppTypeEnum("COMMON_APP");

    private static final Map<String, AppTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AppTypeEnum> createStaticFields() {
        Map<String, AppTypeEnum> map = new HashMap<>();
        map.put("SESSION_DESKTOP_APP", SESSION_DESKTOP_APP);
        map.put("COMMON_APP", COMMON_APP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AppTypeEnum(String value) {
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
    public static AppTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AppTypeEnum(value));
    }

    public static AppTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AppTypeEnum) {
            return this.value.equals(((AppTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
