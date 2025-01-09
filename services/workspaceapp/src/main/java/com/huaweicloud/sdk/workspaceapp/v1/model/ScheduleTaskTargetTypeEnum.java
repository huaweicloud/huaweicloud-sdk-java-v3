package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 定时任务对象类型： * &#x60;SERVER&#x60; - 服务器 * &#x60;SERVER_GROUP&#x60; - 服务器组
 */
public class ScheduleTaskTargetTypeEnum {

    /**
     * Enum SERVER for value: "SERVER"
     */
    public static final ScheduleTaskTargetTypeEnum SERVER = new ScheduleTaskTargetTypeEnum("SERVER");

    /**
     * Enum SERVER_GROUP for value: "SERVER_GROUP"
     */
    public static final ScheduleTaskTargetTypeEnum SERVER_GROUP = new ScheduleTaskTargetTypeEnum("SERVER_GROUP");

    private static final Map<String, ScheduleTaskTargetTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ScheduleTaskTargetTypeEnum> createStaticFields() {
        Map<String, ScheduleTaskTargetTypeEnum> map = new HashMap<>();
        map.put("SERVER", SERVER);
        map.put("SERVER_GROUP", SERVER_GROUP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ScheduleTaskTargetTypeEnum(String value) {
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
    public static ScheduleTaskTargetTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScheduleTaskTargetTypeEnum(value));
    }

    public static ScheduleTaskTargetTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ScheduleTaskTargetTypeEnum) {
            return this.value.equals(((ScheduleTaskTargetTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
