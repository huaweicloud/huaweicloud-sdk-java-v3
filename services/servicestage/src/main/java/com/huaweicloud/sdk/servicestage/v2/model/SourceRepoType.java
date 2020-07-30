package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 代码仓类型，支持GitHub、GitLab、Gitee、Bitbucket。
 */
public enum SourceRepoType {
  
  GITHUB("GitHub"),
  
  GITLAB("GitLab"),
  
  GITEE("Gitee"),
  
  BITBUCKET("Bitbucket");

  private String value;

  SourceRepoType(String value) {
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
  public static SourceRepoType fromValue(String value) {
    for (SourceRepoType b : SourceRepoType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

