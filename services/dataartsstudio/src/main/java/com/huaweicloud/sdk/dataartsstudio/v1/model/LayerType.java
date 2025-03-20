package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 数仓分层的类型，可以是关系建模（ER）、维度建模（DIMENSION）和数据集市（DM）
 */
public class LayerType {

    /**
     * Enum THIRD_NF for value: "THIRD_NF"
     */
    public static final LayerType THIRD_NF = new LayerType("THIRD_NF");

    /**
     * Enum DIMENSION for value: "DIMENSION"
     */
    public static final LayerType DIMENSION = new LayerType("DIMENSION");

    /**
     * Enum DM for value: "DM"
     */
    public static final LayerType DM = new LayerType("DM");

    private static final Map<String, LayerType> STATIC_FIELDS = createStaticFields();

    private static Map<String, LayerType> createStaticFields() {
        Map<String, LayerType> map = new HashMap<>();
        map.put("THIRD_NF", THIRD_NF);
        map.put("DIMENSION", DIMENSION);
        map.put("DM", DM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    LayerType(String value) {
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
    public static LayerType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LayerType(value));
    }

    public static LayerType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LayerType) {
            return this.value.equals(((LayerType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
