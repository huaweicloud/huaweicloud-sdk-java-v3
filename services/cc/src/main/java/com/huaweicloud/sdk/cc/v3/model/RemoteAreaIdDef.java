package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 对端大区。云连接支持的大区有： - Chinese-Mainland（中国大陆） - Asia-Pacific（亚太） - Africa（非洲） - Western-Latin-America（拉美西） - Eastern-Latin-America（拉美东） - Northern-Latin-America（拉美北）
 */
public class RemoteAreaIdDef {

    /**
     * Enum CHINESE_MAINLAND for value: "Chinese-Mainland"
     */
    public static final RemoteAreaIdDef CHINESE_MAINLAND = new RemoteAreaIdDef("Chinese-Mainland");

    /**
     * Enum ASIA_PACIFIC for value: "Asia-Pacific"
     */
    public static final RemoteAreaIdDef ASIA_PACIFIC = new RemoteAreaIdDef("Asia-Pacific");

    /**
     * Enum AFRICA for value: "Africa"
     */
    public static final RemoteAreaIdDef AFRICA = new RemoteAreaIdDef("Africa");

    /**
     * Enum WESTERN_LATIN_AMERICA for value: "Western-Latin-America"
     */
    public static final RemoteAreaIdDef WESTERN_LATIN_AMERICA = new RemoteAreaIdDef("Western-Latin-America");

    /**
     * Enum EASTERN_LATIN_AMERICA for value: "Eastern-Latin-America"
     */
    public static final RemoteAreaIdDef EASTERN_LATIN_AMERICA = new RemoteAreaIdDef("Eastern-Latin-America");

    /**
     * Enum NORTHERN_LATIN_AMERICA for value: "Northern-Latin-America"
     */
    public static final RemoteAreaIdDef NORTHERN_LATIN_AMERICA = new RemoteAreaIdDef("Northern-Latin-America");

    private static final Map<String, RemoteAreaIdDef> STATIC_FIELDS = createStaticFields();

    private static Map<String, RemoteAreaIdDef> createStaticFields() {
        Map<String, RemoteAreaIdDef> map = new HashMap<>();
        map.put("Chinese-Mainland", CHINESE_MAINLAND);
        map.put("Asia-Pacific", ASIA_PACIFIC);
        map.put("Africa", AFRICA);
        map.put("Western-Latin-America", WESTERN_LATIN_AMERICA);
        map.put("Eastern-Latin-America", EASTERN_LATIN_AMERICA);
        map.put("Northern-Latin-America", NORTHERN_LATIN_AMERICA);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    RemoteAreaIdDef(String value) {
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
    public static RemoteAreaIdDef fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RemoteAreaIdDef(value));
    }

    public static RemoteAreaIdDef valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RemoteAreaIdDef) {
            return this.value.equals(((RemoteAreaIdDef) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
