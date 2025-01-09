package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 定时任务类型： * &#x60;RESTART_SERVER&#x60; - 定时重启服务器 * &#x60;START_SERVER&#x60; - 定时开机 * &#x60;STOP_SERVER&#x60; - 定时关机 * &#x60;REINSTALL_OS&#x60; - 定时重装操作系统
 */
public class ScheduleTaskTypeEnum {

    /**
     * Enum RESTART_SERVER for value: "RESTART_SERVER"
     */
    public static final ScheduleTaskTypeEnum RESTART_SERVER = new ScheduleTaskTypeEnum("RESTART_SERVER");

    /**
     * Enum START_SERVER for value: "START_SERVER"
     */
    public static final ScheduleTaskTypeEnum START_SERVER = new ScheduleTaskTypeEnum("START_SERVER");

    /**
     * Enum STOP_SERVER for value: "STOP_SERVER"
     */
    public static final ScheduleTaskTypeEnum STOP_SERVER = new ScheduleTaskTypeEnum("STOP_SERVER");

    /**
     * Enum REINSTALL_OS for value: "REINSTALL_OS"
     */
    public static final ScheduleTaskTypeEnum REINSTALL_OS = new ScheduleTaskTypeEnum("REINSTALL_OS");

    private static final Map<String, ScheduleTaskTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ScheduleTaskTypeEnum> createStaticFields() {
        Map<String, ScheduleTaskTypeEnum> map = new HashMap<>();
        map.put("RESTART_SERVER", RESTART_SERVER);
        map.put("START_SERVER", START_SERVER);
        map.put("STOP_SERVER", STOP_SERVER);
        map.put("REINSTALL_OS", REINSTALL_OS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ScheduleTaskTypeEnum(String value) {
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
    public static ScheduleTaskTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScheduleTaskTypeEnum(value));
    }

    public static ScheduleTaskTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ScheduleTaskTypeEnum) {
            return this.value.equals(((ScheduleTaskTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
