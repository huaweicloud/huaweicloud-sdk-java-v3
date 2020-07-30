package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 操作，支持start, stop, restart, scale, rollback。
 */
public enum InstanceActionType {
  
  START("start"),
  
  STOP("stop"),
  
  RESTART("restart"),
  
  SCALE("scale"),
  
  ROLLBACK("rollback");

  private String value;

  InstanceActionType(String value) {
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
  public static InstanceActionType fromValue(String value) {
    for (InstanceActionType b : InstanceActionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

