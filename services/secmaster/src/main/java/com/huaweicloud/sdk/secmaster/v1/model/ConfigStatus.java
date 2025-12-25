package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 采集通道配置状态 - OK 完成 - CHANGE 修改  **约束限制** 不涉及 **取值范围**: - OK - CHANGE  **默认值** 不涉及
 */
public class ConfigStatus {

    /**
     * Enum OK for value: "OK"
     */
    public static final ConfigStatus OK = new ConfigStatus("OK");

    /**
     * Enum CHANGE for value: "CHANGE"
     */
    public static final ConfigStatus CHANGE = new ConfigStatus("CHANGE");

    private static final Map<String, ConfigStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ConfigStatus> createStaticFields() {
        Map<String, ConfigStatus> map = new HashMap<>();
        map.put("OK", OK);
        map.put("CHANGE", CHANGE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ConfigStatus(String value) {
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
    public static ConfigStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConfigStatus(value));
    }

    public static ConfigStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ConfigStatus) {
            return this.value.equals(((ConfigStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
