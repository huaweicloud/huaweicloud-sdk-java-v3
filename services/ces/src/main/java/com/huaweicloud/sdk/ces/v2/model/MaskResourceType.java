package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 屏蔽资源类型。 **约束限制**： 不涉及。 **取值范围**: - ALL_INSTANCE：全部资源 - MULTI_INSTANCE：多实例资源 **默认取值**： 不涉及。 
 */
public class MaskResourceType {

    /**
     * Enum ALL_INSTANCE for value: "ALL_INSTANCE"
     */
    public static final MaskResourceType ALL_INSTANCE = new MaskResourceType("ALL_INSTANCE");

    /**
     * Enum MULTI_INSTANCE for value: "MULTI_INSTANCE"
     */
    public static final MaskResourceType MULTI_INSTANCE = new MaskResourceType("MULTI_INSTANCE");

    private static final Map<String, MaskResourceType> STATIC_FIELDS = createStaticFields();

    private static Map<String, MaskResourceType> createStaticFields() {
        Map<String, MaskResourceType> map = new HashMap<>();
        map.put("ALL_INSTANCE", ALL_INSTANCE);
        map.put("MULTI_INSTANCE", MULTI_INSTANCE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    MaskResourceType(String value) {
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
    public static MaskResourceType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MaskResourceType(value));
    }

    public static MaskResourceType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MaskResourceType) {
            return this.value.equals(((MaskResourceType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
