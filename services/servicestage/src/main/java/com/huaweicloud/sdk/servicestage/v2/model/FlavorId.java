package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 资源规格。
 */
public enum FlavorId {
  
  MICRO_5G_0_5C_1G("MICRO-5G:0.5C:1G"),
  
  SMALL_10G_1_0C_2G("SMALL-10G:1.0C:2G"),
  
  STANDARD_30G_2_0C_4G("STANDARD-30G:2.0C:4G"),
  
  LARGE_50G_4_0C_8G("LARGE-50G:4.0C:8G"),
  
  XLARGE_100G_4_0C_16G("XLARGE-100G:4.0C:16G"),
  
  CUSTOM_XG_X_X_X_X("CUSTOM-XG:X-X:X-X");

  private String value;

  FlavorId(String value) {
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
  public static FlavorId fromValue(String value) {
    for (FlavorId b : FlavorId.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

