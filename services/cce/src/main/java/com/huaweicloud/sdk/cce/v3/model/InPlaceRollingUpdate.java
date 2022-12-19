package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 原地升级配置
 */
public class InPlaceRollingUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userDefinedStep")

    private Integer userDefinedStep;

    public InPlaceRollingUpdate withUserDefinedStep(Integer userDefinedStep) {
        this.userDefinedStep = userDefinedStep;
        return this;
    }

    /**
     * 节点升级步长，取值范围为[1, 40]，建议取值20
     * @return userDefinedStep
     */
    public Integer getUserDefinedStep() {
        return userDefinedStep;
    }

    public void setUserDefinedStep(Integer userDefinedStep) {
        this.userDefinedStep = userDefinedStep;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InPlaceRollingUpdate inPlaceRollingUpdate = (InPlaceRollingUpdate) o;
        return Objects.equals(this.userDefinedStep, inPlaceRollingUpdate.userDefinedStep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userDefinedStep);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InPlaceRollingUpdate {\n");
        sb.append("    userDefinedStep: ").append(toIndentedString(userDefinedStep)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
