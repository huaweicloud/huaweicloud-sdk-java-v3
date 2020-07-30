package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 资源类型。  基础资源：cce、cci、ecs、as。  可选资源：rds、dcs、elb等其他类型。 
 */
public enum ResourceType {
  
  SECURITY_GROUP("security_group"),
  
  EIP("eip"),
  
  ELB("elb"),
  
  CCE("cce"),
  
  CCI("cci"),
  
  ECS("ecs"),
  
  AS("as"),
  
  CSE("cse"),
  
  DCS("dcs"),
  
  RDS("rds"),
  
  PVC("pvc"),
  
  APM("apm");

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
    for (ResourceType b : ResourceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

