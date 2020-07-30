package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 收费模式，支持provided、on_demanded、monthly三种模式。  默认provided，表示使用用户提供的已有资源，无需收费。 
 */
public enum ChargeMode {
  
  PROVIDED("provided"),
  
  ON_DEMANDED("on_demanded"),
  
  MONTHLY("monthly");

  private String value;

  ChargeMode(String value) {
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
  public static ChargeMode fromValue(String value) {
    for (ChargeMode b : ChargeMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

