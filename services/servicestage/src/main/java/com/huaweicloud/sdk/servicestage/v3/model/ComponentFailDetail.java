package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * cluster_deleted,        // 集群被删除 cluster_unavailable,    // 集群不可用 cluster_inaccessible,   // 集群无法访问 namespace_deleted,      // 命名空间被删除 namespace_unavailable,  // 命名空间不可用 namespace_inaccessible, // 命名空间无法访问 resource_deleted,       // 资源已删除 create_failed,          // 创建组件失败 delete_failed           // 删除组件失败 
 */
public class ComponentFailDetail {

    /**
     * Enum CLUSTER_DELETED for value: "cluster_deleted"
     */
    public static final ComponentFailDetail CLUSTER_DELETED = new ComponentFailDetail("cluster_deleted");

    /**
     * Enum CLUSTER_UNAVAILABLE for value: "cluster_unavailable"
     */
    public static final ComponentFailDetail CLUSTER_UNAVAILABLE = new ComponentFailDetail("cluster_unavailable");

    /**
     * Enum CLUSTER_INACCESSIBLE for value: "cluster_inaccessible"
     */
    public static final ComponentFailDetail CLUSTER_INACCESSIBLE = new ComponentFailDetail("cluster_inaccessible");

    /**
     * Enum NAMESPACE_DELETED for value: "namespace_deleted"
     */
    public static final ComponentFailDetail NAMESPACE_DELETED = new ComponentFailDetail("namespace_deleted");

    /**
     * Enum NAMESPACE_UNAVAILABLE for value: "namespace_unavailable"
     */
    public static final ComponentFailDetail NAMESPACE_UNAVAILABLE = new ComponentFailDetail("namespace_unavailable");

    /**
     * Enum NAMESPACE_INACCESSIBLE for value: "namespace_inaccessible"
     */
    public static final ComponentFailDetail NAMESPACE_INACCESSIBLE = new ComponentFailDetail("namespace_inaccessible");

    /**
     * Enum RESOURCE_DELETED for value: "resource_deleted"
     */
    public static final ComponentFailDetail RESOURCE_DELETED = new ComponentFailDetail("resource_deleted");

    /**
     * Enum CREATE_FAILED for value: "create_failed"
     */
    public static final ComponentFailDetail CREATE_FAILED = new ComponentFailDetail("create_failed");

    /**
     * Enum DELETE_FAILED for value: "delete_failed"
     */
    public static final ComponentFailDetail DELETE_FAILED = new ComponentFailDetail("delete_failed");

    private static final Map<String, ComponentFailDetail> STATIC_FIELDS = createStaticFields();

    private static Map<String, ComponentFailDetail> createStaticFields() {
        Map<String, ComponentFailDetail> map = new HashMap<>();
        map.put("cluster_deleted", CLUSTER_DELETED);
        map.put("cluster_unavailable", CLUSTER_UNAVAILABLE);
        map.put("cluster_inaccessible", CLUSTER_INACCESSIBLE);
        map.put("namespace_deleted", NAMESPACE_DELETED);
        map.put("namespace_unavailable", NAMESPACE_UNAVAILABLE);
        map.put("namespace_inaccessible", NAMESPACE_INACCESSIBLE);
        map.put("resource_deleted", RESOURCE_DELETED);
        map.put("create_failed", CREATE_FAILED);
        map.put("delete_failed", DELETE_FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ComponentFailDetail(String value) {
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
    public static ComponentFailDetail fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ComponentFailDetail(value));
    }

    public static ComponentFailDetail valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComponentFailDetail) {
            return this.value.equals(((ComponentFailDetail) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
