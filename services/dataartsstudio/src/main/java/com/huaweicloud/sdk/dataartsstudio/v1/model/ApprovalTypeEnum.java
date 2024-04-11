package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 业务审核类型。PUBLISH(发布)、OFFLINE(下线)。
 */
public class ApprovalTypeEnum {

    /**
     * Enum PUBLISH for value: "PUBLISH"
     */
    public static final ApprovalTypeEnum PUBLISH = new ApprovalTypeEnum("PUBLISH");

    /**
     * Enum OFFLINE for value: "OFFLINE"
     */
    public static final ApprovalTypeEnum OFFLINE = new ApprovalTypeEnum("OFFLINE");

    private static final Map<String, ApprovalTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ApprovalTypeEnum> createStaticFields() {
        Map<String, ApprovalTypeEnum> map = new HashMap<>();
        map.put("PUBLISH", PUBLISH);
        map.put("OFFLINE", OFFLINE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ApprovalTypeEnum(String value) {
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
    public static ApprovalTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApprovalTypeEnum(value));
    }

    public static ApprovalTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ApprovalTypeEnum) {
            return this.value.equals(((ApprovalTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
