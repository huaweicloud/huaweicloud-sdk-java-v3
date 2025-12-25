package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: Vpc服务状态 - MANAGE 管理通道 - DATA 数据通道  **约束限制** 不涉及  **取值范围**: - MANAGE - DATA  **默认值** 不涉及
 */
public class VpcServiceType {

    /**
     * Enum MANAGE for value: "MANAGE"
     */
    public static final VpcServiceType MANAGE = new VpcServiceType("MANAGE");

    /**
     * Enum DATA for value: "DATA"
     */
    public static final VpcServiceType DATA = new VpcServiceType("DATA");

    private static final Map<String, VpcServiceType> STATIC_FIELDS = createStaticFields();

    private static Map<String, VpcServiceType> createStaticFields() {
        Map<String, VpcServiceType> map = new HashMap<>();
        map.put("MANAGE", MANAGE);
        map.put("DATA", DATA);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    VpcServiceType(String value) {
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
    public static VpcServiceType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VpcServiceType(value));
    }

    public static VpcServiceType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VpcServiceType) {
            return this.value.equals(((VpcServiceType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
