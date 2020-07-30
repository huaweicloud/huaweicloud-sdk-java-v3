package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 运行平台类型。  应用可以在不同的平台上运行，可选用的平台的类型有以下几种：cce、vmapp。 
 */
public enum InstancePlatformType {
  
  CCE("cce"),
  
  VMAPP("vmapp");

  private String value;

  InstancePlatformType(String value) {
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
  public static InstancePlatformType fromValue(String value) {
    for (InstancePlatformType b : InstancePlatformType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

