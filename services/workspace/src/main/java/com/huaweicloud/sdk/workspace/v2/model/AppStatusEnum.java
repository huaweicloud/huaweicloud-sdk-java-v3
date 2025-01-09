package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 应用状态(正常、禁用) * &#39;NORMAL&#39; - 正常 * &#39;FORBIDDEN&#39; - 禁用状态
 */
public class AppStatusEnum {

    /**
     * Enum NORMAL for value: "NORMAL"
     */
    public static final AppStatusEnum NORMAL = new AppStatusEnum("NORMAL");

    /**
     * Enum FORBIDDEN for value: "FORBIDDEN"
     */
    public static final AppStatusEnum FORBIDDEN = new AppStatusEnum("FORBIDDEN");

    private static final Map<String, AppStatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AppStatusEnum> createStaticFields() {
        Map<String, AppStatusEnum> map = new HashMap<>();
        map.put("NORMAL", NORMAL);
        map.put("FORBIDDEN", FORBIDDEN);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AppStatusEnum(String value) {
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
    public static AppStatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AppStatusEnum(value));
    }

    public static AppStatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AppStatusEnum) {
            return this.value.equals(((AppStatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
