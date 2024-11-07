package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 跨地域类型。 - intra-region (域内) - inter-region (跨域)
 */
public class CrossRegionTypeEnum {

    /**
     * Enum INTRA_REGION for value: "intra-region"
     */
    public static final CrossRegionTypeEnum INTRA_REGION = new CrossRegionTypeEnum("intra-region");

    /**
     * Enum INTER_REGION for value: "inter-region"
     */
    public static final CrossRegionTypeEnum INTER_REGION = new CrossRegionTypeEnum("inter-region");

    private static final Map<String, CrossRegionTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, CrossRegionTypeEnum> createStaticFields() {
        Map<String, CrossRegionTypeEnum> map = new HashMap<>();
        map.put("intra-region", INTRA_REGION);
        map.put("inter-region", INTER_REGION);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    CrossRegionTypeEnum(String value) {
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
    public static CrossRegionTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CrossRegionTypeEnum(value));
    }

    public static CrossRegionTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CrossRegionTypeEnum) {
            return this.value.equals(((CrossRegionTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
