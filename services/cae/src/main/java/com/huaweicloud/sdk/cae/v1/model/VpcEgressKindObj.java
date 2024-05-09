package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“VpcEgress”，该值不可修改。
 */
public class VpcEgressKindObj {

    /**
     * Enum VPCEGRESS for value: "VpcEgress"
     */
    public static final VpcEgressKindObj VPCEGRESS = new VpcEgressKindObj("VpcEgress");

    private static final Map<String, VpcEgressKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, VpcEgressKindObj> createStaticFields() {
        Map<String, VpcEgressKindObj> map = new HashMap<>();
        map.put("VpcEgress", VPCEGRESS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    VpcEgressKindObj(String value) {
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
    public static VpcEgressKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VpcEgressKindObj(value));
    }

    public static VpcEgressKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VpcEgressKindObj) {
            return this.value.equals(((VpcEgressKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
