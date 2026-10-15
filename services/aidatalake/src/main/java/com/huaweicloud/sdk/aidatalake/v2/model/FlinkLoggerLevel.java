package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：Flink作业可控制的日志等级枚举。 **约束限制**：不涉及。 **取值范围**：   - TRACE：跟踪。   - DEBUG：调试。   - INFO：信息。   - WARN：警告。   - ERROR：错误。 **默认取值**：INFO。 
 */
public class FlinkLoggerLevel {

    /**
     * Enum TRACE for value: "TRACE"
     */
    public static final FlinkLoggerLevel TRACE = new FlinkLoggerLevel("TRACE");

    /**
     * Enum DEBUG for value: "DEBUG"
     */
    public static final FlinkLoggerLevel DEBUG = new FlinkLoggerLevel("DEBUG");

    /**
     * Enum INFO for value: "INFO"
     */
    public static final FlinkLoggerLevel INFO = new FlinkLoggerLevel("INFO");

    /**
     * Enum WARN for value: "WARN"
     */
    public static final FlinkLoggerLevel WARN = new FlinkLoggerLevel("WARN");

    /**
     * Enum ERROR for value: "ERROR"
     */
    public static final FlinkLoggerLevel ERROR = new FlinkLoggerLevel("ERROR");

    private static final Map<String, FlinkLoggerLevel> STATIC_FIELDS = createStaticFields();

    private static Map<String, FlinkLoggerLevel> createStaticFields() {
        Map<String, FlinkLoggerLevel> map = new HashMap<>();
        map.put("TRACE", TRACE);
        map.put("DEBUG", DEBUG);
        map.put("INFO", INFO);
        map.put("WARN", WARN);
        map.put("ERROR", ERROR);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FlinkLoggerLevel(String value) {
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
    public static FlinkLoggerLevel fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlinkLoggerLevel(value));
    }

    public static FlinkLoggerLevel valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FlinkLoggerLevel) {
            return this.value.equals(((FlinkLoggerLevel) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
