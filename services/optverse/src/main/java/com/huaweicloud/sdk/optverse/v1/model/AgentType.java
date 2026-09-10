package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 助手类型。 **约束限制**： 不涉及 **取值范围**： * optverse：天筹工具链 * predict：预测工具链 * vrp：路径规划工具链 * demand：需求助手 **默认取值**： 不涉及 
 */
public class AgentType {

    /**
     * Enum OPTVERSE for value: "optverse"
     */
    public static final AgentType OPTVERSE = new AgentType("optverse");

    /**
     * Enum PREDICT for value: "predict"
     */
    public static final AgentType PREDICT = new AgentType("predict");

    /**
     * Enum VRP for value: "vrp"
     */
    public static final AgentType VRP = new AgentType("vrp");

    /**
     * Enum DEMAND for value: "demand"
     */
    public static final AgentType DEMAND = new AgentType("demand");

    private static final Map<String, AgentType> STATIC_FIELDS = createStaticFields();

    private static Map<String, AgentType> createStaticFields() {
        Map<String, AgentType> map = new HashMap<>();
        map.put("optverse", OPTVERSE);
        map.put("predict", PREDICT);
        map.put("vrp", VRP);
        map.put("demand", DEMAND);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AgentType(String value) {
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
    public static AgentType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgentType(value));
    }

    public static AgentType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AgentType) {
            return this.value.equals(((AgentType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
