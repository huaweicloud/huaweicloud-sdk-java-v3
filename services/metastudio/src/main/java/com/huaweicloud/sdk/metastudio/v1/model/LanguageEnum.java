package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 智能交互语言 * zh_CN：简体中文（已下线，请使用CN） * en_US：英语（已下线，请使用EN） * CN：中文 * EN：英文 * ESP：西班牙语（仅海外站点支持） * por：葡萄牙语（仅海外站点支持） * Arabic：阿拉伯语（仅海外站点支持） * Thai：泰语（仅海外站点支持）
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

    /**
     * Enum CN for value: "CN"
     */
    public static final LanguageEnum CN = new LanguageEnum("CN");

    /**
     * Enum EN for value: "EN"
     */
    public static final LanguageEnum EN = new LanguageEnum("EN");

    /**
     * Enum ESP for value: "ESP"
     */
    public static final LanguageEnum ESP = new LanguageEnum("ESP");

    /**
     * Enum POR for value: "por"
     */
    public static final LanguageEnum POR = new LanguageEnum("por");

    /**
     * Enum ARABIC for value: "Arabic"
     */
    public static final LanguageEnum ARABIC = new LanguageEnum("Arabic");

    /**
     * Enum THAI for value: "Thai"
     */
    public static final LanguageEnum THAI = new LanguageEnum("Thai");

    private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, LanguageEnum> createStaticFields() {
        Map<String, LanguageEnum> map = new HashMap<>();
        map.put("zh_CN", ZH_CN);
        map.put("en_US", EN_US);
        map.put("CN", CN);
        map.put("EN", EN);
        map.put("ESP", ESP);
        map.put("por", POR);
        map.put("Arabic", ARABIC);
        map.put("Thai", THAI);
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
