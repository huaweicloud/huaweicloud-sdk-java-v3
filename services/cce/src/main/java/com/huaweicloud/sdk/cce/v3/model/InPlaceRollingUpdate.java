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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

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

    public InPlaceRollingUpdate withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * **参数解释：** 节点升级批次作用域 **约束限制：** 不涉及 **取值范围：** \"Cluster\"：节点升级批次配置应用到整个集群，整个升级过程不重置升级批次 \"NodePool\"：节点升级批次配置应用到节点池，升级每个节点池都会重置升级批次 **默认取值：** \"Cluster\" 
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InPlaceRollingUpdate that = (InPlaceRollingUpdate) obj;
        return Objects.equals(this.userDefinedStep, that.userDefinedStep) && Objects.equals(this.scope, that.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userDefinedStep, scope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InPlaceRollingUpdate {\n");
        sb.append("    userDefinedStep: ").append(toIndentedString(userDefinedStep)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
