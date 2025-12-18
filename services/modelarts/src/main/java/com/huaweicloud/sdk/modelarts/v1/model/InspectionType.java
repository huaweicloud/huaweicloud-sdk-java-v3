package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：巡检类型。 **取值范围**：   - STANDARD：标准巡检   - DEEP：深度巡检 
 */
public class InspectionType {

    /**
     * Enum STANDARD for value: "STANDARD"
     */
    public static final InspectionType STANDARD = new InspectionType("STANDARD");

    /**
     * Enum DEEP for value: "DEEP"
     */
    public static final InspectionType DEEP = new InspectionType("DEEP");

    private static final Map<String, InspectionType> STATIC_FIELDS = createStaticFields();

    private static Map<String, InspectionType> createStaticFields() {
        Map<String, InspectionType> map = new HashMap<>();
        map.put("STANDARD", STANDARD);
        map.put("DEEP", DEEP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InspectionType(String value) {
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
    public static InspectionType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InspectionType(value));
    }

    public static InspectionType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InspectionType) {
            return this.value.equals(((InspectionType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
