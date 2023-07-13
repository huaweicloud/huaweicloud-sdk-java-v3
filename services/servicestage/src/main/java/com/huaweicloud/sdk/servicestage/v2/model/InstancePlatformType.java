package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 运行平台类型。  应用可以在不同的平台上运行，可选用的平台的类型有以下几种：cce、vmapp。 
 */
public class InstancePlatformType {

    /**
     * Enum CCE for value: "cce"
     */
    public static final InstancePlatformType CCE = new InstancePlatformType("cce");

    /**
     * Enum VMAPP for value: "vmapp"
     */
    public static final InstancePlatformType VMAPP = new InstancePlatformType("vmapp");

    private static final Map<String, InstancePlatformType> STATIC_FIELDS = createStaticFields();

    private static Map<String, InstancePlatformType> createStaticFields() {
        Map<String, InstancePlatformType> map = new HashMap<>();
        map.put("cce", CCE);
        map.put("vmapp", VMAPP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InstancePlatformType(String value) {
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
    public static InstancePlatformType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstancePlatformType(value));
    }

    public static InstancePlatformType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InstancePlatformType) {
            return this.value.equals(((InstancePlatformType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
