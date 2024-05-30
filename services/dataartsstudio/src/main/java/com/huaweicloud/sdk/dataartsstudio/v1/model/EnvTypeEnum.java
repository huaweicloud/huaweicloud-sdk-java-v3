package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 开发生产环境类型。 枚举值：   - INVALID_TYPE: 无效环境   - DEV_TYPE: 开发环境   - PROD_TYPE: 生产环境   - DEV_PROD_TYPE: 开发生产环境 
 */
public class EnvTypeEnum {

    /**
     * Enum INVALID_TYPE for value: "INVALID_TYPE"
     */
    public static final EnvTypeEnum INVALID_TYPE = new EnvTypeEnum("INVALID_TYPE");

    /**
     * Enum DEV_TYPE for value: "DEV_TYPE"
     */
    public static final EnvTypeEnum DEV_TYPE = new EnvTypeEnum("DEV_TYPE");

    /**
     * Enum PROD_TYPE for value: "PROD_TYPE"
     */
    public static final EnvTypeEnum PROD_TYPE = new EnvTypeEnum("PROD_TYPE");

    /**
     * Enum DEV_PROD_TYPE for value: "DEV_PROD_TYPE"
     */
    public static final EnvTypeEnum DEV_PROD_TYPE = new EnvTypeEnum("DEV_PROD_TYPE");

    private static final Map<String, EnvTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, EnvTypeEnum> createStaticFields() {
        Map<String, EnvTypeEnum> map = new HashMap<>();
        map.put("INVALID_TYPE", INVALID_TYPE);
        map.put("DEV_TYPE", DEV_TYPE);
        map.put("PROD_TYPE", PROD_TYPE);
        map.put("DEV_PROD_TYPE", DEV_PROD_TYPE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    EnvTypeEnum(String value) {
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
    public static EnvTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EnvTypeEnum(value));
    }

    public static EnvTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EnvTypeEnum) {
            return this.value.equals(((EnvTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
