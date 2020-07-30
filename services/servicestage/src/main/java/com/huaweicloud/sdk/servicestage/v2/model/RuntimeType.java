package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 运行时类型。
 */
public enum RuntimeType {
  
  TOMCAT8("Tomcat8"),
  
  JAVA8("Java8"),
  
  PHP7("Php7"),
  
  NODEJS8("Nodejs8"),
  
  DOCKER("Docker"),
  
  PYTHON3("Python3"),
  
  CUSTOM("Custom");

  private String value;

  RuntimeType(String value) {
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
  public static RuntimeType fromValue(String value) {
    for (RuntimeType b : RuntimeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

