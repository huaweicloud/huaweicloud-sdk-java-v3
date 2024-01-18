package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户类型： * &#x60;USER&#x60; - 用户 * &#x60;USER_GROUP&#x60; - 用户组
 */
public class AccountTypeEnum {

    /**
     * Enum USER for value: "USER"
     */
    public static final AccountTypeEnum USER = new AccountTypeEnum("USER");

    /**
     * Enum USER_GROUP for value: "USER_GROUP"
     */
    public static final AccountTypeEnum USER_GROUP = new AccountTypeEnum("USER_GROUP");

    private static final Map<String, AccountTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AccountTypeEnum> createStaticFields() {
        Map<String, AccountTypeEnum> map = new HashMap<>();
        map.put("USER", USER);
        map.put("USER_GROUP", USER_GROUP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AccountTypeEnum(String value) {
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
    public static AccountTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccountTypeEnum(value));
    }

    public static AccountTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AccountTypeEnum) {
            return this.value.equals(((AccountTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
