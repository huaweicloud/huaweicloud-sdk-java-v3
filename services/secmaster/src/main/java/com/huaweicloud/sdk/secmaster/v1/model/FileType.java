package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 文件类型 - JVM JVM配置文件类型 - LOG4J2 Log4j2日志配置文件类型 - YML YAML配置文件类型  **约束限制** 不涉及 **取值范围**: - JVM - LOG4J2 - YML   **默认值** 不涉及
 */
public class FileType {

    /**
     * Enum JVM for value: "JVM"
     */
    public static final FileType JVM = new FileType("JVM");

    /**
     * Enum LOG4J2 for value: "LOG4J2"
     */
    public static final FileType LOG4J2 = new FileType("LOG4J2");

    /**
     * Enum YML for value: "YML"
     */
    public static final FileType YML = new FileType("YML");

    private static final Map<String, FileType> STATIC_FIELDS = createStaticFields();

    private static Map<String, FileType> createStaticFields() {
        Map<String, FileType> map = new HashMap<>();
        map.put("JVM", JVM);
        map.put("LOG4J2", LOG4J2);
        map.put("YML", YML);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FileType(String value) {
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
    public static FileType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FileType(value));
    }

    public static FileType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FileType) {
            return this.value.equals(((FileType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
