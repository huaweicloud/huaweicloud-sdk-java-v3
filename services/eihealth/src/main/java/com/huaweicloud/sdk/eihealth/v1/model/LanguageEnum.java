package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets LanguageEnum
 */
public class LanguageEnum {

    /**
     * Enum EN_US for value: "en_us"
     */
    public static final LanguageEnum EN_US = new LanguageEnum("en_us");

    /**
     * Enum ZH_CN for value: "zh_cn"
     */
    public static final LanguageEnum ZH_CN = new LanguageEnum("zh_cn");

    private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, LanguageEnum> createStaticFields() {
        Map<String, LanguageEnum> map = new HashMap<>();
        map.put("en_us", EN_US);
        map.put("zh_cn", ZH_CN);
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
        LanguageEnum result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new LanguageEnum(value);
        }
        return result;
    }

    public static LanguageEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        LanguageEnum result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
