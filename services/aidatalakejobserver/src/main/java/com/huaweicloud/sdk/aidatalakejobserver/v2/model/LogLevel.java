package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：日志级别配置，用于控制日志输出的详细程度。 **约束限制**：不涉及。 **取值范围**： - DEBUG：调试级别。 - TRACE：跟踪级别。 - WARN：警告级别。 - INFO：信息级别。 - ERROR：错误级别。 **默认取值**：INFO。 
 */
public class LogLevel {

    /**
     * Enum DEBUG for value: "DEBUG"
     */
    public static final LogLevel DEBUG = new LogLevel("DEBUG");

    /**
     * Enum TRACE for value: "TRACE"
     */
    public static final LogLevel TRACE = new LogLevel("TRACE");

    /**
     * Enum WARN for value: "WARN"
     */
    public static final LogLevel WARN = new LogLevel("WARN");

    /**
     * Enum INFO for value: "INFO"
     */
    public static final LogLevel INFO = new LogLevel("INFO");

    /**
     * Enum ERROR for value: "ERROR"
     */
    public static final LogLevel ERROR = new LogLevel("ERROR");

    private static final Map<String, LogLevel> STATIC_FIELDS = createStaticFields();

    private static Map<String, LogLevel> createStaticFields() {
        Map<String, LogLevel> map = new HashMap<>();
        map.put("DEBUG", DEBUG);
        map.put("TRACE", TRACE);
        map.put("WARN", WARN);
        map.put("INFO", INFO);
        map.put("ERROR", ERROR);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    LogLevel(String value) {
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
    public static LogLevel fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogLevel(value));
    }

    public static LogLevel valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LogLevel) {
            return this.value.equals(((LogLevel) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
