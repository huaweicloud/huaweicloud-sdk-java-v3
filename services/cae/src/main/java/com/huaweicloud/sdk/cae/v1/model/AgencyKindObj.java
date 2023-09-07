package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“Agency”，该值不可修改。
 */
public class AgencyKindObj {

    /**
     * Enum AGENCY for value: "Agency"
     */
    public static final AgencyKindObj AGENCY = new AgencyKindObj("Agency");

    private static final Map<String, AgencyKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, AgencyKindObj> createStaticFields() {
        Map<String, AgencyKindObj> map = new HashMap<>();
        map.put("Agency", AGENCY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AgencyKindObj(String value) {
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
    public static AgencyKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgencyKindObj(value));
    }

    public static AgencyKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AgencyKindObj) {
            return this.value.equals(((AgencyKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
