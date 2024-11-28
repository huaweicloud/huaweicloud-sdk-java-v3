package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 平台对接类型。 * MEITUAN_OFFICIAL：对接美团直播平台官方接口 * MSS_STANDARD：对接MetaStudio定义的标准接口
 */
public class AccessTypeEnum {

    /**
     * Enum MEITUAN_OFFICIAL for value: "MEITUAN_OFFICIAL"
     */
    public static final AccessTypeEnum MEITUAN_OFFICIAL = new AccessTypeEnum("MEITUAN_OFFICIAL");

    /**
     * Enum MSS_STANDARD for value: "MSS_STANDARD"
     */
    public static final AccessTypeEnum MSS_STANDARD = new AccessTypeEnum("MSS_STANDARD");

    private static final Map<String, AccessTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AccessTypeEnum> createStaticFields() {
        Map<String, AccessTypeEnum> map = new HashMap<>();
        map.put("MEITUAN_OFFICIAL", MEITUAN_OFFICIAL);
        map.put("MSS_STANDARD", MSS_STANDARD);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AccessTypeEnum(String value) {
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
    public static AccessTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessTypeEnum(value));
    }

    public static AccessTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AccessTypeEnum) {
            return this.value.equals(((AccessTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
