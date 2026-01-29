package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 管道所有者类型 - SYSTEM 系统 - USER 用户 - CLOUD_LOG 云日志  **约束限制** 不涉及 **取值范围**: - SYSTEM - USER - CLOUD_LOG  **默认值** 不涉及
 */
public class PipeOwnerType {

    /**
     * Enum SYSTEM for value: "SYSTEM"
     */
    public static final PipeOwnerType SYSTEM = new PipeOwnerType("SYSTEM");

    /**
     * Enum USER for value: "USER"
     */
    public static final PipeOwnerType USER = new PipeOwnerType("USER");

    /**
     * Enum CLOUD_LOG for value: "CLOUD_LOG"
     */
    public static final PipeOwnerType CLOUD_LOG = new PipeOwnerType("CLOUD_LOG");

    private static final Map<String, PipeOwnerType> STATIC_FIELDS = createStaticFields();

    private static Map<String, PipeOwnerType> createStaticFields() {
        Map<String, PipeOwnerType> map = new HashMap<>();
        map.put("SYSTEM", SYSTEM);
        map.put("USER", USER);
        map.put("CLOUD_LOG", CLOUD_LOG);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PipeOwnerType(String value) {
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
    public static PipeOwnerType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PipeOwnerType(value));
    }

    public static PipeOwnerType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PipeOwnerType) {
            return this.value.equals(((PipeOwnerType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
