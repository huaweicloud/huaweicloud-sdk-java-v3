package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 接入网络实例类型，GDGW (专线)和ER_ROUTE_TABLE (路由表)。
 */
public class AttachmentInstanceTypeEnum {

    /**
     * Enum GDGW for value: "GDGW"
     */
    public static final AttachmentInstanceTypeEnum GDGW = new AttachmentInstanceTypeEnum("GDGW");

    /**
     * Enum ER_ROUTE_TABLE for value: "ER_ROUTE_TABLE"
     */
    public static final AttachmentInstanceTypeEnum ER_ROUTE_TABLE = new AttachmentInstanceTypeEnum("ER_ROUTE_TABLE");

    private static final Map<String, AttachmentInstanceTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AttachmentInstanceTypeEnum> createStaticFields() {
        Map<String, AttachmentInstanceTypeEnum> map = new HashMap<>();
        map.put("GDGW", GDGW);
        map.put("ER_ROUTE_TABLE", ER_ROUTE_TABLE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AttachmentInstanceTypeEnum(String value) {
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
    public static AttachmentInstanceTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AttachmentInstanceTypeEnum(value));
    }

    public static AttachmentInstanceTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AttachmentInstanceTypeEnum) {
            return this.value.equals(((AttachmentInstanceTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
