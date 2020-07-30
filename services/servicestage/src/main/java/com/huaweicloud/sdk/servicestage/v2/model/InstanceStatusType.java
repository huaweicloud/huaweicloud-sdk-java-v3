package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 实例状态。
 */
public enum InstanceStatusType {
  
  INITIALIZING("INITIALIZING"),
  
  UPGRADING("UPGRADING"),
  
  FAILED("FAILED"),
  
  RUNNING("RUNNING"),
  
  DOWN("DOWN"),
  
  DELETING("DELETING"),
  
  DELETED("DELETED"),
  
  RESERVED("RESERVED"),
  
  STARTING("STARTING"),
  
  STOPPING("STOPPING"),
  
  STOPPED("STOPPED"),
  
  RESTARTING("RESTARTING"),
  
  PENDING("PENDING"),
  
  UNKNOWN("UNKNOWN"),
  
  PARTIALLY_FAILED("PARTIALLY_FAILED");

  private String value;

  InstanceStatusType(String value) {
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
  public static InstanceStatusType fromValue(String value) {
    for (InstanceStatusType b : InstanceStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

