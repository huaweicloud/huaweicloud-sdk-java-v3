package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 采集通道下发 - READY 等待下发 - ALL_SUCCESS 全部成功 - PARTIAL_SUCCESS 部分成功 - EXCEPTION 异常  **约束限制** 不涉及 **取值范围**: - READY - ALL_SUCCESS - PARTIAL_SUCCESS - EXCEPTION  **默认值** 不涉及
 */
public class InstallStatus {

    /**
     * Enum READY for value: "READY"
     */
    public static final InstallStatus READY = new InstallStatus("READY");

    /**
     * Enum ALL_SUCCESS for value: "ALL_SUCCESS"
     */
    public static final InstallStatus ALL_SUCCESS = new InstallStatus("ALL_SUCCESS");

    /**
     * Enum PARTIAL_SUCCESS for value: "PARTIAL_SUCCESS"
     */
    public static final InstallStatus PARTIAL_SUCCESS = new InstallStatus("PARTIAL_SUCCESS");

    /**
     * Enum EXCEPTION for value: "EXCEPTION"
     */
    public static final InstallStatus EXCEPTION = new InstallStatus("EXCEPTION");

    private static final Map<String, InstallStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, InstallStatus> createStaticFields() {
        Map<String, InstallStatus> map = new HashMap<>();
        map.put("READY", READY);
        map.put("ALL_SUCCESS", ALL_SUCCESS);
        map.put("PARTIAL_SUCCESS", PARTIAL_SUCCESS);
        map.put("EXCEPTION", EXCEPTION);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InstallStatus(String value) {
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
    public static InstallStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstallStatus(value));
    }

    public static InstallStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InstallStatus) {
            return this.value.equals(((InstallStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
