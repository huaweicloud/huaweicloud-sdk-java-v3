package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 节点应用成功与否状态、原因 - COLLECTOR_USE 采集器使用中，无法移除 - NODE_OFFLINE 节点失联状态，无法应用  **约束限制** 不涉及 **取值范围**: - COLLECTOR_USE - NODE_OFFLINE  **默认值** 不涉及
 */
public class NodeApplyFailEnum {

    /**
     * Enum COLLECTOR_USE for value: "COLLECTOR_USE"
     */
    public static final NodeApplyFailEnum COLLECTOR_USE = new NodeApplyFailEnum("COLLECTOR_USE");

    /**
     * Enum NODE_OFFLINE for value: "NODE_OFFLINE"
     */
    public static final NodeApplyFailEnum NODE_OFFLINE = new NodeApplyFailEnum("NODE_OFFLINE");

    private static final Map<String, NodeApplyFailEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, NodeApplyFailEnum> createStaticFields() {
        Map<String, NodeApplyFailEnum> map = new HashMap<>();
        map.put("COLLECTOR_USE", COLLECTOR_USE);
        map.put("NODE_OFFLINE", NODE_OFFLINE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    NodeApplyFailEnum(String value) {
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
    public static NodeApplyFailEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NodeApplyFailEnum(value));
    }

    public static NodeApplyFailEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NodeApplyFailEnum) {
            return this.value.equals(((NodeApplyFailEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
