package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 失败描述。  cluster_deleted,        // 集群被删除  cluster_unavailable,    // 集群不可用  cluster_inaccessible,   // 集群无法访问  namespace_deleted,      // 命名空间被删除  namespace_unavailable,  // 命名空间不可用  namespace_inaccessible, // 命名空间无法访问  resource_deleted,       // 资源已删除 
 */
public enum InstanceFailDetail {
  
  CLUSTER_DELETED("cluster_deleted"),
  
  CLUSTER_UNAVAILABLE("cluster_unavailable"),
  
  CLUSTER_INACCESSIBLE("cluster_inaccessible"),
  
  NAMESPACE_DELETED("namespace_deleted"),
  
  NAMESPACE_UNAVAILABLE("namespace_unavailable"),
  
  NAMESPACE_INACCESSIBLE("namespace_inaccessible"),
  
  RESOURCE_DELETED("resource_deleted");

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
    for (InstanceFailDetail b : InstanceFailDetail.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

