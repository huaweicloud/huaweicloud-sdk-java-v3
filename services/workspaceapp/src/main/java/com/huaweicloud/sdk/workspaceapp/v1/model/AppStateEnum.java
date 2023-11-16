package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 应用状态(正常、禁用) * &#x60;NORMAL&#x60; - 正常 * &#x60;FORBIDDEN&#x60; - 禁用状态
 */
public class AppStateEnum {

    /**
     * Enum NORMAL for value: "NORMAL"
     */
    public static final AppStateEnum NORMAL = new AppStateEnum("NORMAL");

    /**
     * Enum FORBIDDEN for value: "FORBIDDEN"
     */
    public static final AppStateEnum FORBIDDEN = new AppStateEnum("FORBIDDEN");

    private static final Map<String, AppStateEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AppStateEnum> createStaticFields() {
        Map<String, AppStateEnum> map = new HashMap<>();
        map.put("NORMAL", NORMAL);
        map.put("FORBIDDEN", FORBIDDEN);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AppStateEnum(String value) {
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
    public static AppStateEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AppStateEnum(value));
    }

    public static AppStateEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AppStateEnum) {
            return this.value.equals(((AppStateEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
