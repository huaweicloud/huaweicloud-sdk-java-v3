package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 节点状态 - RUN 运行 - STOP 停止  **约束限制** 不涉及 **取值范围**: - RUN - STOP  **默认值** 不涉及
 */
public class NodeStatus {

    /**
     * Enum RUN for value: "RUN"
     */
    public static final NodeStatus RUN = new NodeStatus("RUN");

    /**
     * Enum STOP for value: "STOP"
     */
    public static final NodeStatus STOP = new NodeStatus("STOP");

    private static final Map<String, NodeStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, NodeStatus> createStaticFields() {
        Map<String, NodeStatus> map = new HashMap<>();
        map.put("RUN", RUN);
        map.put("STOP", STOP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    NodeStatus(String value) {
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
    public static NodeStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NodeStatus(value));
    }

    public static NodeStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NodeStatus) {
            return this.value.equals(((NodeStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
