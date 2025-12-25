package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 节点的健康状态 - NORMAL 正常 - ANOMALIES 异常 - FAULTS 故障 - LOST_CONTACT 失联  **约束限制** 不涉及 **取值范围**: - NORMAL - ANOMALIES - FAULTS - LOST_CONTACT  **默认值** 不涉及
 */
public class NodeHealthStatus {

    /**
     * Enum NORMAL for value: "NORMAL"
     */
    public static final NodeHealthStatus NORMAL = new NodeHealthStatus("NORMAL");

    /**
     * Enum ANOMALIES for value: "ANOMALIES"
     */
    public static final NodeHealthStatus ANOMALIES = new NodeHealthStatus("ANOMALIES");

    /**
     * Enum FAULTS for value: "FAULTS"
     */
    public static final NodeHealthStatus FAULTS = new NodeHealthStatus("FAULTS");

    /**
     * Enum LOST_CONTACT for value: "LOST_CONTACT"
     */
    public static final NodeHealthStatus LOST_CONTACT = new NodeHealthStatus("LOST_CONTACT");

    private static final Map<String, NodeHealthStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, NodeHealthStatus> createStaticFields() {
        Map<String, NodeHealthStatus> map = new HashMap<>();
        map.put("NORMAL", NORMAL);
        map.put("ANOMALIES", ANOMALIES);
        map.put("FAULTS", FAULTS);
        map.put("LOST_CONTACT", LOST_CONTACT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    NodeHealthStatus(String value) {
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
    public static NodeHealthStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NodeHealthStatus(value));
    }

    public static NodeHealthStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NodeHealthStatus) {
            return this.value.equals(((NodeHealthStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
