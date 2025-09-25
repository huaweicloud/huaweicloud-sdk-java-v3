package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 助手类型。 **约束限制**： 不涉及 **取值范围**： * auto：通用助手 * drug：药物助手 * gene：基因助手 **默认取值**： 不涉及 
 */
public class AgentType {

    /**
     * Enum AUTO for value: "auto"
     */
    public static final AgentType AUTO = new AgentType("auto");

    /**
     * Enum GENE for value: "gene"
     */
    public static final AgentType GENE = new AgentType("gene");

    /**
     * Enum DRUG for value: "drug"
     */
    public static final AgentType DRUG = new AgentType("drug");

    private static final Map<String, AgentType> STATIC_FIELDS = createStaticFields();

    private static Map<String, AgentType> createStaticFields() {
        Map<String, AgentType> map = new HashMap<>();
        map.put("auto", AUTO);
        map.put("gene", GENE);
        map.put("drug", DRUG);
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
