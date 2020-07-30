package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 模板名称。
 */
public enum Template {
  
  MAGENTO("magento"),
  
  MBAAS("mbaas"),
  
  WORDPRESS("wordpress");

  private String value;

  Template(String value) {
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
  public static Template fromValue(String value) {
    for (Template b : Template.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

