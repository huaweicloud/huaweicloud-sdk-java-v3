package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 产品层级跨纬规则创建时需要指明为产品层级规则，resource_level取值为product即为产品层级跨纬规则，不填或者取值为dimension则为旧的规则类型
 */
public class ResourceLevel {

    /**
     * Enum PRODUCT for value: "product"
     */
    public static final ResourceLevel PRODUCT = new ResourceLevel("product");

    /**
     * Enum DIMENSION for value: "dimension"
     */
    public static final ResourceLevel DIMENSION = new ResourceLevel("dimension");

    private static final Map<String, ResourceLevel> STATIC_FIELDS = createStaticFields();

    private static Map<String, ResourceLevel> createStaticFields() {
        Map<String, ResourceLevel> map = new HashMap<>();
        map.put("product", PRODUCT);
        map.put("dimension", DIMENSION);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ResourceLevel(String value) {
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
    public static ResourceLevel fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceLevel(value));
    }

    public static ResourceLevel valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ResourceLevel) {
            return this.value.equals(((ResourceLevel) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
