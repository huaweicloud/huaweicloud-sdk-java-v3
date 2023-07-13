package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets ResourceType
 */
public class ResourceType {

    /**
     * Enum VPC for value: "vpc"
     */
    public static final ResourceType VPC = new ResourceType("vpc");

    /**
     * Enum EIP for value: "eip"
     */
    public static final ResourceType EIP = new ResourceType("eip");

    /**
     * Enum ELB for value: "elb"
     */
    public static final ResourceType ELB = new ResourceType("elb");

    /**
     * Enum CCE for value: "cce"
     */
    public static final ResourceType CCE = new ResourceType("cce");

    /**
     * Enum ECS for value: "ecs"
     */
    public static final ResourceType ECS = new ResourceType("ecs");

    /**
     * Enum AS for value: "as"
     */
    public static final ResourceType AS = new ResourceType("as");

    /**
     * Enum CSE for value: "cse"
     */
    public static final ResourceType CSE = new ResourceType("cse");

    /**
     * Enum DCS for value: "dcs"
     */
    public static final ResourceType DCS = new ResourceType("dcs");

    /**
     * Enum RDS for value: "rds"
     */
    public static final ResourceType RDS = new ResourceType("rds");

    private static final Map<String, ResourceType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ResourceType> createStaticFields() {
        Map<String, ResourceType> map = new HashMap<>();
        map.put("vpc", VPC);
        map.put("eip", EIP);
        map.put("elb", ELB);
        map.put("cce", CCE);
        map.put("ecs", ECS);
        map.put("as", AS);
        map.put("cse", CSE);
        map.put("dcs", DCS);
        map.put("rds", RDS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ResourceType(String value) {
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
    public static ResourceType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceType(value));
    }

    public static ResourceType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ResourceType) {
            return this.value.equals(((ResourceType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
