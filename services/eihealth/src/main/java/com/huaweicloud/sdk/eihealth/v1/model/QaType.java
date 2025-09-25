package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 问答类型。 **约束限制**： 不涉及 **取值范围**： * chat_call：普通问答 * tool_call：实验问答 * deepresearch_call：深度探究 **默认取值**： 不涉及 
 */
public class QaType {

    /**
     * Enum CHAT_CALL for value: "chat_call"
     */
    public static final QaType CHAT_CALL = new QaType("chat_call");

    /**
     * Enum TOOL_CALL for value: "tool_call"
     */
    public static final QaType TOOL_CALL = new QaType("tool_call");

    /**
     * Enum DEEPRESEARCH_CALL for value: "deepresearch_call"
     */
    public static final QaType DEEPRESEARCH_CALL = new QaType("deepresearch_call");

    private static final Map<String, QaType> STATIC_FIELDS = createStaticFields();

    private static Map<String, QaType> createStaticFields() {
        Map<String, QaType> map = new HashMap<>();
        map.put("chat_call", CHAT_CALL);
        map.put("tool_call", TOOL_CALL);
        map.put("deepresearch_call", DEEPRESEARCH_CALL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    QaType(String value) {
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
    public static QaType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new QaType(value));
    }

    public static QaType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof QaType) {
            return this.value.equals(((QaType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
