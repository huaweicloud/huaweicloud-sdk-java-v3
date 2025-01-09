package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 认证类型。 OTP：OTP辅助认证 RADIUS: RADIUS认证
 */
public class AuthAssistEnum {

    /**
     * Enum OTP for value: "OTP"
     */
    public static final AuthAssistEnum OTP = new AuthAssistEnum("OTP");

    /**
     * Enum RADIUS_GATEWAY for value: "RADIUS_GATEWAY"
     */
    public static final AuthAssistEnum RADIUS_GATEWAY = new AuthAssistEnum("RADIUS_GATEWAY");

    /**
     * Enum RADIUS for value: "RADIUS"
     */
    public static final AuthAssistEnum RADIUS = new AuthAssistEnum("RADIUS");

    private static final Map<String, AuthAssistEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AuthAssistEnum> createStaticFields() {
        Map<String, AuthAssistEnum> map = new HashMap<>();
        map.put("OTP", OTP);
        map.put("RADIUS_GATEWAY", RADIUS_GATEWAY);
        map.put("RADIUS", RADIUS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AuthAssistEnum(String value) {
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
    public static AuthAssistEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthAssistEnum(value));
    }

    public static AuthAssistEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AuthAssistEnum) {
            return this.value.equals(((AuthAssistEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
