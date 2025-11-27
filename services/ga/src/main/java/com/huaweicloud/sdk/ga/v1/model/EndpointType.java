package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 终端节点类型，取值范围: - EIP：本账号中的弹性公网IP - ECS：本账号中私网ECS实例 - ELB：本账号中私网ELB实例 - CUSTOM_IP：云外公网IP - CUSTOM_DOMAIN_NAME：云外公网域名 - CUSTOM_EIP：本Region的弹性公网IP
 */
public class EndpointType {

    /**
     * Enum EIP for value: "EIP"
     */
    public static final EndpointType EIP = new EndpointType("EIP");

    /**
     * Enum ECS for value: "ECS"
     */
    public static final EndpointType ECS = new EndpointType("ECS");

    /**
     * Enum ELB for value: "ELB"
     */
    public static final EndpointType ELB = new EndpointType("ELB");

    /**
     * Enum CUSTOM_IP for value: "CUSTOM_IP"
     */
    public static final EndpointType CUSTOM_IP = new EndpointType("CUSTOM_IP");

    /**
     * Enum CUSTOM_DOMAIN_NAME for value: "CUSTOM_DOMAIN_NAME"
     */
    public static final EndpointType CUSTOM_DOMAIN_NAME = new EndpointType("CUSTOM_DOMAIN_NAME");

    /**
     * Enum CUSTOM_EIP for value: "CUSTOM_EIP"
     */
    public static final EndpointType CUSTOM_EIP = new EndpointType("CUSTOM_EIP");

    private static final Map<String, EndpointType> STATIC_FIELDS = createStaticFields();

    private static Map<String, EndpointType> createStaticFields() {
        Map<String, EndpointType> map = new HashMap<>();
        map.put("EIP", EIP);
        map.put("ECS", ECS);
        map.put("ELB", ELB);
        map.put("CUSTOM_IP", CUSTOM_IP);
        map.put("CUSTOM_DOMAIN_NAME", CUSTOM_DOMAIN_NAME);
        map.put("CUSTOM_EIP", CUSTOM_EIP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    EndpointType(String value) {
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
    public static EndpointType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EndpointType(value));
    }

    public static EndpointType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EndpointType) {
            return this.value.equals(((EndpointType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
