package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 知识库类型 * QUESTION_ANSWER：问答 * DOCUMENT：文档
 */
public class KnowledgeTypeEnum {

    /**
     * Enum QUESTION_ANSWER for value: "QUESTION_ANSWER"
     */
    public static final KnowledgeTypeEnum QUESTION_ANSWER = new KnowledgeTypeEnum("QUESTION_ANSWER");

    /**
     * Enum DOCUMENT for value: "DOCUMENT"
     */
    public static final KnowledgeTypeEnum DOCUMENT = new KnowledgeTypeEnum("DOCUMENT");

    private static final Map<String, KnowledgeTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, KnowledgeTypeEnum> createStaticFields() {
        Map<String, KnowledgeTypeEnum> map = new HashMap<>();
        map.put("QUESTION_ANSWER", QUESTION_ANSWER);
        map.put("DOCUMENT", DOCUMENT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    KnowledgeTypeEnum(String value) {
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
    public static KnowledgeTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KnowledgeTypeEnum(value));
    }

    public static KnowledgeTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof KnowledgeTypeEnum) {
            return this.value.equals(((KnowledgeTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
