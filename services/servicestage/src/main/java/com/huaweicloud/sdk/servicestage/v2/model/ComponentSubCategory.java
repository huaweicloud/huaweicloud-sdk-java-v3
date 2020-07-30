package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 应用组件子类型。  Webapp的子类型有Web、Magento、Wordpress。  MicroService的子类型有Java Chassis、Go Chassis、Mesher、SpringCloud。  Common的子类型可以为空。 
 */
public enum ComponentSubCategory {
  
  WEB("Web"),
  
  MAGENTO("Magento"),
  
  WORDPRESS("Wordpress"),
  
  SPRINGCLOUD("SpringCloud"),
  
  JAVA_CHASSIS("Java Chassis"),
  
  GO_CHASSIS("Go Chassis"),
  
  MESHER("Mesher");

  private String value;

  ComponentSubCategory(String value) {
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
  public static ComponentSubCategory fromValue(String value) {
    for (ComponentSubCategory b : ComponentSubCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

