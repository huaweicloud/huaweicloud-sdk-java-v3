package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 相互作用力类型：氢键、疏水作用、盐桥、π-π堆积、π-阳离子
 */
public class InteractionType {

    /**
     * Enum HYDROGEN_BOND for value: "hydrogen_bond"
     */
    public static final InteractionType HYDROGEN_BOND = new InteractionType("hydrogen_bond");

    /**
     * Enum HYDROPHOBIC_ACTION for value: "hydrophobic_action"
     */
    public static final InteractionType HYDROPHOBIC_ACTION = new InteractionType("hydrophobic_action");

    /**
     * Enum SALT_BRIDGE for value: "salt_bridge"
     */
    public static final InteractionType SALT_BRIDGE = new InteractionType("salt_bridge");

    /**
     * Enum PI_STACKING for value: "pi_stacking"
     */
    public static final InteractionType PI_STACKING = new InteractionType("pi_stacking");

    /**
     * Enum PI_CATION for value: "pi_cation"
     */
    public static final InteractionType PI_CATION = new InteractionType("pi_cation");

    private static final Map<String, InteractionType> STATIC_FIELDS = createStaticFields();

    private static Map<String, InteractionType> createStaticFields() {
        Map<String, InteractionType> map = new HashMap<>();
        map.put("hydrogen_bond", HYDROGEN_BOND);
        map.put("hydrophobic_action", HYDROPHOBIC_ACTION);
        map.put("salt_bridge", SALT_BRIDGE);
        map.put("pi_stacking", PI_STACKING);
        map.put("pi_cation", PI_CATION);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InteractionType(String value) {
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
    public static InteractionType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InteractionType(value));
    }

    public static InteractionType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InteractionType) {
            return this.value.equals(((InteractionType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
