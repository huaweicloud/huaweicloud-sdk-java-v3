package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：  Agent运行时所需的入站认证类型，Agent网关将根据该配置进行入站认证。 - CUSTOM_JWT: OAuth 2.0认证方式，使用自定义JWT认证机制 - IAM: IAM认证方式，使用IAM签名认证机制 - API_KEY: API Key认证方式，使用自定义API Key进行认证 **约束限制**: 不涉及。 **取值范围**： 长度为1-10个字符。允许的值： - CUSTOM_JWT - IAM - API_KEY **默认取值**: IAM
 */
public class CoreRunAuthorizerType {

    /**
     * Enum CUSTOM_JWT for value: "CUSTOM_JWT"
     */
    public static final CoreRunAuthorizerType CUSTOM_JWT = new CoreRunAuthorizerType("CUSTOM_JWT");

    /**
     * Enum IAM for value: "IAM"
     */
    public static final CoreRunAuthorizerType IAM = new CoreRunAuthorizerType("IAM");

    /**
     * Enum API_KEY for value: "API_KEY"
     */
    public static final CoreRunAuthorizerType API_KEY = new CoreRunAuthorizerType("API_KEY");

    private static final Map<String, CoreRunAuthorizerType> STATIC_FIELDS = createStaticFields();

    private static Map<String, CoreRunAuthorizerType> createStaticFields() {
        Map<String, CoreRunAuthorizerType> map = new HashMap<>();
        map.put("CUSTOM_JWT", CUSTOM_JWT);
        map.put("IAM", IAM);
        map.put("API_KEY", API_KEY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    CoreRunAuthorizerType(String value) {
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
    public static CoreRunAuthorizerType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CoreRunAuthorizerType(value));
    }

    public static CoreRunAuthorizerType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CoreRunAuthorizerType) {
            return this.value.equals(((CoreRunAuthorizerType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
