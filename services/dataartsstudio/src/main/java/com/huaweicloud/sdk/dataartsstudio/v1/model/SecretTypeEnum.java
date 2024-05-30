package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 密级类型。 枚举值：   - PUBLIC: 公开   - SECRET: 秘密   - CONFIDENTIAL: 机密   - SUPER_SECRET: 绝密 
 */
public class SecretTypeEnum {

    /**
     * Enum PUBLIC for value: "PUBLIC"
     */
    public static final SecretTypeEnum PUBLIC = new SecretTypeEnum("PUBLIC");

    /**
     * Enum SECRET for value: "SECRET"
     */
    public static final SecretTypeEnum SECRET = new SecretTypeEnum("SECRET");

    /**
     * Enum CONFIDENTIAL for value: "CONFIDENTIAL"
     */
    public static final SecretTypeEnum CONFIDENTIAL = new SecretTypeEnum("CONFIDENTIAL");

    /**
     * Enum SUPER_SECRET for value: "SUPER_SECRET"
     */
    public static final SecretTypeEnum SUPER_SECRET = new SecretTypeEnum("SUPER_SECRET");

    private static final Map<String, SecretTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, SecretTypeEnum> createStaticFields() {
        Map<String, SecretTypeEnum> map = new HashMap<>();
        map.put("PUBLIC", PUBLIC);
        map.put("SECRET", SECRET);
        map.put("CONFIDENTIAL", CONFIDENTIAL);
        map.put("SUPER_SECRET", SUPER_SECRET);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SecretTypeEnum(String value) {
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
    public static SecretTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SecretTypeEnum(value));
    }

    public static SecretTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SecretTypeEnum) {
            return this.value.equals(((SecretTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
