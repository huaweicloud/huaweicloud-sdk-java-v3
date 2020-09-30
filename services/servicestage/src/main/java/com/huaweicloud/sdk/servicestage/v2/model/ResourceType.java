package com.huaweicloud.sdk.servicestage.v2.model;





import java.util.function.Consumer;
import java.util.Objects;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 资源类型。  基础资源：cce、cci、ecs、as。  可选资源：rds、dcs、elb等其他类型。 
 */
public class ResourceType {
    
    /**
     * Enum SECURITY_GROUP for value: "security_group"
     */
    public static final ResourceType SECURITY_GROUP = new ResourceType("security_group");
    
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
     * Enum CCI for value: "cci"
     */
    public static final ResourceType CCI = new ResourceType("cci");
    
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
    
    /**
     * Enum PVC for value: "pvc"
     */
    public static final ResourceType PVC = new ResourceType("pvc");
    
    /**
     * Enum APM for value: "apm"
     */
    public static final ResourceType APM = new ResourceType("apm");
    

    private static final Map<String, ResourceType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ResourceType> createStaticFields() {
        Map<String, ResourceType> map = new HashMap<>();
        map.put("security_group", SECURITY_GROUP);
        map.put("eip", EIP);
        map.put("elb", ELB);
        map.put("cce", CCE);
        map.put("cci", CCI);
        map.put("ecs", ECS);
        map.put("as", AS);
        map.put("cse", CSE);
        map.put("dcs", DCS);
        map.put("rds", RDS);
        map.put("pvc", PVC);
        map.put("apm", APM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ResourceType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return String.valueOf(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ResourceType fromValue(String value) {
        if( value == null ){
            return null;
        }
        ResourceType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new ResourceType(value);
        }
        return result;
    }

    public static ResourceType valueOf(String value) {
        if( value == null ){
            return null;
        }
        ResourceType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ResourceType) {
            return this.value.equals(((ResourceType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

