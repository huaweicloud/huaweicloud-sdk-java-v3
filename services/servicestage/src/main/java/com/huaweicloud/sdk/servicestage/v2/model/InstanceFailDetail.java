package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/** 失败描述。 cluster_deleted, // 集群被删除 cluster_unavailable, // 集群不可用 cluster_inaccessible, // 集群无法访问 namespace_deleted, //
 * 命名空间被删除 namespace_unavailable, // 命名空间不可用 namespace_inaccessible, // 命名空间无法访问 resource_deleted, // 资源已删除 */
public class InstanceFailDetail {

    /** Enum CLUSTER_DELETED for value: "cluster_deleted" */
    public static final InstanceFailDetail CLUSTER_DELETED = new InstanceFailDetail("cluster_deleted");

    /** Enum CLUSTER_UNAVAILABLE for value: "cluster_unavailable" */
    public static final InstanceFailDetail CLUSTER_UNAVAILABLE = new InstanceFailDetail("cluster_unavailable");

    /** Enum CLUSTER_INACCESSIBLE for value: "cluster_inaccessible" */
    public static final InstanceFailDetail CLUSTER_INACCESSIBLE = new InstanceFailDetail("cluster_inaccessible");

    /** Enum NAMESPACE_DELETED for value: "namespace_deleted" */
    public static final InstanceFailDetail NAMESPACE_DELETED = new InstanceFailDetail("namespace_deleted");

    /** Enum NAMESPACE_UNAVAILABLE for value: "namespace_unavailable" */
    public static final InstanceFailDetail NAMESPACE_UNAVAILABLE = new InstanceFailDetail("namespace_unavailable");

    /** Enum NAMESPACE_INACCESSIBLE for value: "namespace_inaccessible" */
    public static final InstanceFailDetail NAMESPACE_INACCESSIBLE = new InstanceFailDetail("namespace_inaccessible");

    /** Enum RESOURCE_DELETED for value: "resource_deleted" */
    public static final InstanceFailDetail RESOURCE_DELETED = new InstanceFailDetail("resource_deleted");

    private static final Map<String, InstanceFailDetail> STATIC_FIELDS = createStaticFields();

    private static Map<String, InstanceFailDetail> createStaticFields() {
        Map<String, InstanceFailDetail> map = new HashMap<>();
        map.put("cluster_deleted", CLUSTER_DELETED);
        map.put("cluster_unavailable", CLUSTER_UNAVAILABLE);
        map.put("cluster_inaccessible", CLUSTER_INACCESSIBLE);
        map.put("namespace_deleted", NAMESPACE_DELETED);
        map.put("namespace_unavailable", NAMESPACE_UNAVAILABLE);
        map.put("namespace_inaccessible", NAMESPACE_INACCESSIBLE);
        map.put("resource_deleted", RESOURCE_DELETED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InstanceFailDetail(String value) {
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
    public static InstanceFailDetail fromValue(String value) {
        if (value == null) {
            return null;
        }
        InstanceFailDetail result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new InstanceFailDetail(value);
        }
        return result;
    }

    public static InstanceFailDetail valueOf(String value) {
        if (value == null) {
            return null;
        }
        InstanceFailDetail result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InstanceFailDetail) {
            return this.value.equals(((InstanceFailDetail) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
