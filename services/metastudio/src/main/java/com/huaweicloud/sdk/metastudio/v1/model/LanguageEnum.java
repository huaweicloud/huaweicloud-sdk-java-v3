package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 智能交互语言 * CN：中文 * EN：英文
 */
public class LanguageEnum {

    /**
     * Enum CN for value: "CN"
     */
    public static final LanguageEnum CN = new LanguageEnum("CN");

    /**
     * Enum EN for value: "EN"
     */
    public static final LanguageEnum EN = new LanguageEnum("EN");

    private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, LanguageEnum> createStaticFields() {
        Map<String, LanguageEnum> map = new HashMap<>();
        map.put("CN", CN);
        map.put("EN", EN);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    LanguageEnum(String value) {
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
    public static LanguageEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LanguageEnum(value));
    }

    public static LanguageEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LanguageEnum) {
            return this.value.equals(((LanguageEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
