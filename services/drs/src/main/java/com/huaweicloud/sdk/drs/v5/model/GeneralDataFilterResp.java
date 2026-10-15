package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据过滤对象响应体
 */
public class GeneralDataFilterResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_filter_condition")

    private String sourceFilterCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_filter_condition")

    private String targetFilterCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_separated")

    private String conditionSeparated;

    public GeneralDataFilterResp withSourceFilterCondition(String sourceFilterCondition) {
        this.sourceFilterCondition = sourceFilterCondition;
        return this;
    }

    /**
     * 源数据库的过滤条件SQL表达式。
     * @return sourceFilterCondition
     */
    public String getSourceFilterCondition() {
        return sourceFilterCondition;
    }

    public void setSourceFilterCondition(String sourceFilterCondition) {
        this.sourceFilterCondition = sourceFilterCondition;
    }

    public GeneralDataFilterResp withTargetFilterCondition(String targetFilterCondition) {
        this.targetFilterCondition = targetFilterCondition;
        return this;
    }

    /**
     * 目标数据库的过滤条件SQL表达式。
     * @return targetFilterCondition
     */
    public String getTargetFilterCondition() {
        return targetFilterCondition;
    }

    public void setTargetFilterCondition(String targetFilterCondition) {
        this.targetFilterCondition = targetFilterCondition;
    }

    public GeneralDataFilterResp withConditionSeparated(String conditionSeparated) {
        this.conditionSeparated = conditionSeparated;
        return this;
    }

    /**
     * 标记源库和目标库过滤条件是否分开配置。
     * @return conditionSeparated
     */
    public String getConditionSeparated() {
        return conditionSeparated;
    }

    public void setConditionSeparated(String conditionSeparated) {
        this.conditionSeparated = conditionSeparated;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeneralDataFilterResp that = (GeneralDataFilterResp) obj;
        return Objects.equals(this.sourceFilterCondition, that.sourceFilterCondition)
            && Objects.equals(this.targetFilterCondition, that.targetFilterCondition)
            && Objects.equals(this.conditionSeparated, that.conditionSeparated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceFilterCondition, targetFilterCondition, conditionSeparated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneralDataFilterResp {\n");
        sb.append("    sourceFilterCondition: ").append(toIndentedString(sourceFilterCondition)).append("\n");
        sb.append("    targetFilterCondition: ").append(toIndentedString(targetFilterCondition)).append("\n");
        sb.append("    conditionSeparated: ").append(toIndentedString(conditionSeparated)).append("\n");
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
