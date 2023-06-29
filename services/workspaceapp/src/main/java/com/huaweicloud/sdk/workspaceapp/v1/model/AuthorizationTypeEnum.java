package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 授权类型，基于应用(组)授权，默认为APP_GROUP授权。 * &#39;APP&#39; - 按照应用授权 * &#39;APP_GROUP&#39; - 按照应用组授权
 */
public class AuthorizationTypeEnum {

    /**
     * Enum APP for value: "APP"
     */
    public static final AuthorizationTypeEnum APP = new AuthorizationTypeEnum("APP");

    /**
     * Enum APP_GROUP for value: "APP_GROUP"
     */
    public static final AuthorizationTypeEnum APP_GROUP = new AuthorizationTypeEnum("APP_GROUP");

    private static final Map<String, AuthorizationTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AuthorizationTypeEnum> createStaticFields() {
        Map<String, AuthorizationTypeEnum> map = new HashMap<>();
        map.put("APP", APP);
        map.put("APP_GROUP", APP_GROUP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AuthorizationTypeEnum(String value) {
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
    public static AuthorizationTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthorizationTypeEnum(value));
    }

    public static AuthorizationTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AuthorizationTypeEnum) {
            return this.value.equals(((AuthorizationTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
