package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 智能交互语言 * zh_CN:简体中文 * en_US:英语
 */
public class LanguageEnum {

    /**
     * Enum ZH_CN for value: "zh_CN"
     */
    public static final LanguageEnum ZH_CN = new LanguageEnum("zh_CN");

    /**
     * Enum EN_US for value: "en_US"
     */
    public static final LanguageEnum EN_US = new LanguageEnum("en_US");

    private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, LanguageEnum> createStaticFields() {
        Map<String, LanguageEnum> map = new HashMap<>();
        map.put("zh_CN", ZH_CN);
        map.put("en_US", EN_US);
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
