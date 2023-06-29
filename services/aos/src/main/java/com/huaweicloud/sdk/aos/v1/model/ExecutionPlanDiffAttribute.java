package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExecutionPlanDiffAttribute
 */
public class ExecutionPlanDiffAttribute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_value")

    private String previousValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_value")

    private String targetValue;

    public ExecutionPlanDiffAttribute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 当前资源将要被修改的参数的名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExecutionPlanDiffAttribute withPreviousValue(String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * 当前资源被修改的参数的原始值。  若是资源创建的场景，则previous_value为空  若远端资源产生了偏差，则同一个资源会返回两个ExecutionPlanItem，其中一个的drifted为true，另一个的drifted为false   * drifted为true的previous_value为资源栈中所维持的资源属性和状态   * drifted为false的previous_value为provider请求远端资源后，远端资源所返回的资源属性和状态  若远端资源未产生偏差，则只会返回一个drifted为false的ExecutionPlanItem   * drifted为false的previous_value为资源栈中所维持的资源属性和状态 
     * @return previousValue
     */
    public String getPreviousValue() {
        return previousValue;
    }

    public void setPreviousValue(String previousValue) {
        this.previousValue = previousValue;
    }

    public ExecutionPlanDiffAttribute withTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * 当前资源被修改的参数的目的值。  若是资源删除的场景，则target_value为空  若远端资源产生了偏差，则同一个资源会返回两个ExecutionPlanItem，其中一个的drifted为true，另一个的drifted为false   * drifted为true的target_value为provider请求远端资源后，远端资源所返回的资源属性和状态   * drifted为false的target_value为基于用户模板更新的资源属性和状态  若远端资源未产生偏差，则只会返回一个drifted为false的ExecutionPlanItem   * drifted为false的target_value为基于用户模板更新的资源属性和状态 
     * @return targetValue
     */
    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecutionPlanDiffAttribute that = (ExecutionPlanDiffAttribute) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.previousValue, that.previousValue)
            && Objects.equals(this.targetValue, that.targetValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, previousValue, targetValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionPlanDiffAttribute {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    previousValue: ").append(toIndentedString(previousValue)).append("\n");
        sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
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
