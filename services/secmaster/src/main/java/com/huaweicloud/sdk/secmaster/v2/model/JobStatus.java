package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 作业状态 - ENABLED 启用 - DISABLED 禁用  **约束限制** 不涉及 **取值范围**: - ENABLED - DISABLED  **默认值** 不涉及    
 */
public class JobStatus {

    /**
     * Enum ENABLED for value: "ENABLED"
     */
    public static final JobStatus ENABLED = new JobStatus("ENABLED");

    /**
     * Enum DISABLED for value: "DISABLED"
     */
    public static final JobStatus DISABLED = new JobStatus("DISABLED");

    private static final Map<String, JobStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobStatus> createStaticFields() {
        Map<String, JobStatus> map = new HashMap<>();
        map.put("ENABLED", ENABLED);
        map.put("DISABLED", DISABLED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    JobStatus(String value) {
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
    public static JobStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobStatus(value));
    }

    public static JobStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobStatus) {
            return this.value.equals(((JobStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
