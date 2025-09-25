package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 问答角色。 **约束限制**： 不涉及 **取值范围**： * user：用户问题的内容 * assistant：助手回答内容 **默认取值**： 不涉及 
 */
public class MessageRole {

    /**
     * Enum USER for value: "user"
     */
    public static final MessageRole USER = new MessageRole("user");

    /**
     * Enum ASSISTANT for value: "assistant"
     */
    public static final MessageRole ASSISTANT = new MessageRole("assistant");

    private static final Map<String, MessageRole> STATIC_FIELDS = createStaticFields();

    private static Map<String, MessageRole> createStaticFields() {
        Map<String, MessageRole> map = new HashMap<>();
        map.put("user", USER);
        map.put("assistant", ASSISTANT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    MessageRole(String value) {
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
    public static MessageRole fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MessageRole(value));
    }

    public static MessageRole valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MessageRole) {
            return this.value.equals(((MessageRole) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
