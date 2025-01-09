package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 认证类型。 RADIUS_GATEWAY：短信辅助认证 OAUTH2:OAUTH2认证 CLIENT_TOKEN:本地token认证 USER_PASSWORD:密码认证类型
 */
public class AuthTypeEnum {

    /**
     * Enum RADIUS_GATEWAY for value: "RADIUS_GATEWAY"
     */
    public static final AuthTypeEnum RADIUS_GATEWAY = new AuthTypeEnum("RADIUS_GATEWAY");

    /**
     * Enum OAUTH2 for value: "OAUTH2"
     */
    public static final AuthTypeEnum OAUTH2 = new AuthTypeEnum("OAUTH2");

    /**
     * Enum LDAP for value: "LDAP"
     */
    public static final AuthTypeEnum LDAP = new AuthTypeEnum("LDAP");

    /**
     * Enum CLIENT_TOKEN for value: "CLIENT_TOKEN"
     */
    public static final AuthTypeEnum CLIENT_TOKEN = new AuthTypeEnum("CLIENT_TOKEN");

    /**
     * Enum USER_PASSWORD for value: "USER_PASSWORD"
     */
    public static final AuthTypeEnum USER_PASSWORD = new AuthTypeEnum("USER_PASSWORD");

    /**
     * Enum FINGER for value: "FINGER"
     */
    public static final AuthTypeEnum FINGER = new AuthTypeEnum("FINGER");

    private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AuthTypeEnum> createStaticFields() {
        Map<String, AuthTypeEnum> map = new HashMap<>();
        map.put("RADIUS_GATEWAY", RADIUS_GATEWAY);
        map.put("OAUTH2", OAUTH2);
        map.put("LDAP", LDAP);
        map.put("CLIENT_TOKEN", CLIENT_TOKEN);
        map.put("USER_PASSWORD", USER_PASSWORD);
        map.put("FINGER", FINGER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AuthTypeEnum(String value) {
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
    public static AuthTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthTypeEnum(value));
    }

    public static AuthTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AuthTypeEnum) {
            return this.value.equals(((AuthTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
