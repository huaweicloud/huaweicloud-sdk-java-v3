package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 采集通道监控状态 - SUCCESS_PART 部分运行 - SUCCESS_ALL 全部运行 - SUCCESS_NO 没有运行  **约束限制** 不涉及 **取值范围**: - SUCCESS_PART - SUCCESS_ALL - SUCCESS_NO  **默认值** 不涉及
 */
public class HealthStatus {

    /**
     * Enum SUCCESS_PART for value: "SUCCESS_PART"
     */
    public static final HealthStatus SUCCESS_PART = new HealthStatus("SUCCESS_PART");

    /**
     * Enum SUCCESS_ALL for value: "SUCCESS_ALL"
     */
    public static final HealthStatus SUCCESS_ALL = new HealthStatus("SUCCESS_ALL");

    /**
     * Enum SUCCESS_NO for value: "SUCCESS_NO"
     */
    public static final HealthStatus SUCCESS_NO = new HealthStatus("SUCCESS_NO");

    private static final Map<String, HealthStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, HealthStatus> createStaticFields() {
        Map<String, HealthStatus> map = new HashMap<>();
        map.put("SUCCESS_PART", SUCCESS_PART);
        map.put("SUCCESS_ALL", SUCCESS_ALL);
        map.put("SUCCESS_NO", SUCCESS_NO);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    HealthStatus(String value) {
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
    public static HealthStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HealthStatus(value));
    }

    public static HealthStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HealthStatus) {
            return this.value.equals(((HealthStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
