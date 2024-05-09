package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets SearchType
 */
public class SearchType {

    /**
     * Enum ECFP_4 for value: "ECFP_4"
     */
    public static final SearchType ECFP_4 = new SearchType("ECFP_4");

    /**
     * Enum SCAFFOLD for value: "SCAFFOLD"
     */
    public static final SearchType SCAFFOLD = new SearchType("SCAFFOLD");

    private static final Map<String, SearchType> STATIC_FIELDS = createStaticFields();

    private static Map<String, SearchType> createStaticFields() {
        Map<String, SearchType> map = new HashMap<>();
        map.put("ECFP_4", ECFP_4);
        map.put("SCAFFOLD", SCAFFOLD);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SearchType(String value) {
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
    public static SearchType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SearchType(value));
    }

    public static SearchType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SearchType) {
            return this.value.equals(((SearchType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
