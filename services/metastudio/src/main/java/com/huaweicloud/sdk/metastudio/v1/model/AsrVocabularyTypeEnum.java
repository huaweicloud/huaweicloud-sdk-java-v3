package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 热词表类型。 &gt; MOBVOI:使用的语音识别服务为MOBVOI时选择此类型
 */
public class AsrVocabularyTypeEnum {

    /**
     * Enum MOBVOI for value: "MOBVOI"
     */
    public static final AsrVocabularyTypeEnum MOBVOI = new AsrVocabularyTypeEnum("MOBVOI");

    private static final Map<String, AsrVocabularyTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AsrVocabularyTypeEnum> createStaticFields() {
        Map<String, AsrVocabularyTypeEnum> map = new HashMap<>();
        map.put("MOBVOI", MOBVOI);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AsrVocabularyTypeEnum(String value) {
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
    public static AsrVocabularyTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AsrVocabularyTypeEnum(value));
    }

    public static AsrVocabularyTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AsrVocabularyTypeEnum) {
            return this.value.equals(((AsrVocabularyTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
