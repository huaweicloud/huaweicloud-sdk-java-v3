package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 大区。云连接支持的大区有： - Chinese-Mainland（中国大陆） - Asia-Pacific（亚太） - Africa（非洲） - Western-Latin-America（拉美西） - Eastern-Latin-America（拉美东） - Northern-Latin-America（拉美北）
 */
public class AreaIdDef {

    /**
     * Enum CHINESE_MAINLAND for value: "Chinese-Mainland"
     */
    public static final AreaIdDef CHINESE_MAINLAND = new AreaIdDef("Chinese-Mainland");

    /**
     * Enum ASIA_PACIFIC for value: "Asia-Pacific"
     */
    public static final AreaIdDef ASIA_PACIFIC = new AreaIdDef("Asia-Pacific");

    /**
     * Enum AFRICA for value: "Africa"
     */
    public static final AreaIdDef AFRICA = new AreaIdDef("Africa");

    /**
     * Enum WESTERN_LATIN_AMERICA for value: "Western-Latin-America"
     */
    public static final AreaIdDef WESTERN_LATIN_AMERICA = new AreaIdDef("Western-Latin-America");

    /**
     * Enum EASTERN_LATIN_AMERICA for value: "Eastern-Latin-America"
     */
    public static final AreaIdDef EASTERN_LATIN_AMERICA = new AreaIdDef("Eastern-Latin-America");

    /**
     * Enum NORTHERN_LATIN_AMERICA for value: "Northern-Latin-America"
     */
    public static final AreaIdDef NORTHERN_LATIN_AMERICA = new AreaIdDef("Northern-Latin-America");

    private static final Map<String, AreaIdDef> STATIC_FIELDS = createStaticFields();

    private static Map<String, AreaIdDef> createStaticFields() {
        Map<String, AreaIdDef> map = new HashMap<>();
        map.put("Chinese-Mainland", CHINESE_MAINLAND);
        map.put("Asia-Pacific", ASIA_PACIFIC);
        map.put("Africa", AFRICA);
        map.put("Western-Latin-America", WESTERN_LATIN_AMERICA);
        map.put("Eastern-Latin-America", EASTERN_LATIN_AMERICA);
        map.put("Northern-Latin-America", NORTHERN_LATIN_AMERICA);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AreaIdDef(String value) {
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
    public static AreaIdDef fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AreaIdDef(value));
    }

    public static AreaIdDef valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AreaIdDef) {
            return this.value.equals(((AreaIdDef) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
