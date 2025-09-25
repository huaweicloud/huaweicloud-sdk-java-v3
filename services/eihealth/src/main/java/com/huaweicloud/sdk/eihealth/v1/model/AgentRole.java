package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 助手角色。 **约束限制**： 不涉及 **取值范围**： * Common：对话助手角色 * Biomed：作业助手角色 **默认取值**： Common 
 */
public class AgentRole {

    /**
     * Enum COMMON for value: "Common"
     */
    public static final AgentRole COMMON = new AgentRole("Common");

    /**
     * Enum BIOMED for value: "Biomed"
     */
    public static final AgentRole BIOMED = new AgentRole("Biomed");

    private static final Map<String, AgentRole> STATIC_FIELDS = createStaticFields();

    private static Map<String, AgentRole> createStaticFields() {
        Map<String, AgentRole> map = new HashMap<>();
        map.put("Common", COMMON);
        map.put("Biomed", BIOMED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AgentRole(String value) {
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
    public static AgentRole fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgentRole(value));
    }

    public static AgentRole valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AgentRole) {
            return this.value.equals(((AgentRole) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
