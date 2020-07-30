package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 应用组件类型包括：Webapp、MicroService、Common。
 */
public enum ComponentCategory {
  
  WEBAPP("Webapp"),
  
  MICROSERVICE("MicroService"),
  
  COMMON("Common");

  private String value;

  ComponentCategory(String value) {
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
  public static ComponentCategory fromValue(String value) {
    for (ComponentCategory b : ComponentCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

