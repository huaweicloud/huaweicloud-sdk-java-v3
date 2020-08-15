package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 失败描述。  cluster_deleted,        // 集群被删除  cluster_unavailable,    // 集群不可用  cluster_inaccessible,   // 集群无法访问  namespace_deleted,      // 命名空间被删除  namespace_unavailable,  // 命名空间不可用  namespace_inaccessible, // 命名空间无法访问  resource_deleted,       // 资源已删除 
 */
public class InstanceFailDetail {
    
    /**
     * Enum CLUSTER_DELETED for value: "cluster_deleted"
     */
    public static final InstanceFailDetail CLUSTER_DELETED = new InstanceFailDetail("cluster_deleted");
    
    /**
     * Enum CLUSTER_UNAVAILABLE for value: "cluster_unavailable"
     */
    public static final InstanceFailDetail CLUSTER_UNAVAILABLE = new InstanceFailDetail("cluster_unavailable");
    
    /**
     * Enum CLUSTER_INACCESSIBLE for value: "cluster_inaccessible"
     */
    public static final InstanceFailDetail CLUSTER_INACCESSIBLE = new InstanceFailDetail("cluster_inaccessible");
    
    /**
     * Enum NAMESPACE_DELETED for value: "namespace_deleted"
     */
    public static final InstanceFailDetail NAMESPACE_DELETED = new InstanceFailDetail("namespace_deleted");
    
    /**
     * Enum NAMESPACE_UNAVAILABLE for value: "namespace_unavailable"
     */
    public static final InstanceFailDetail NAMESPACE_UNAVAILABLE = new InstanceFailDetail("namespace_unavailable");
    
    /**
     * Enum NAMESPACE_INACCESSIBLE for value: "namespace_inaccessible"
     */
    public static final InstanceFailDetail NAMESPACE_INACCESSIBLE = new InstanceFailDetail("namespace_inaccessible");
    
    /**
     * Enum RESOURCE_DELETED for value: "resource_deleted"
     */
    public static final InstanceFailDetail RESOURCE_DELETED = new InstanceFailDetail("resource_deleted");
    

    public static final Map<String, InstanceFailDetail> staticFields = new HashMap<String, InstanceFailDetail>() {
        { 
            put("cluster_deleted", CLUSTER_DELETED);
            put("cluster_unavailable", CLUSTER_UNAVAILABLE);
            put("cluster_inaccessible", CLUSTER_INACCESSIBLE);
            put("namespace_deleted", NAMESPACE_DELETED);
            put("namespace_unavailable", NAMESPACE_UNAVAILABLE);
            put("namespace_inaccessible", NAMESPACE_INACCESSIBLE);
            put("resource_deleted", RESOURCE_DELETED);
        }
    };

    private String value;

    InstanceFailDetail(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static InstanceFailDetail fromValue(String value) {
        if( value == null ){
            return null;
        }
        InstanceFailDetail result = staticFields.get(value);
        if (result == null) {
            result = staticFields.putIfAbsent(value, new InstanceFailDetail(value));
            if (result == null) {
                result = staticFields.get(value);
            }
        }
        return result;
    }

    public static InstanceFailDetail valueOf(String value) {
        if( value == null ){
            return null;
        }
        InstanceFailDetail result = staticFields.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof InstanceFailDetail) {
            return this.value.equals(((InstanceFailDetail) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

