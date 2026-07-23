package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MetricFilterParam
 */
public class MetricFilterParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_name")

    private String labelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_value")

    private String labelValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    public MetricFilterParam withLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    /**
     * 标签名
     * @return labelName
     */
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public MetricFilterParam withLabelValue(String labelValue) {
        this.labelValue = labelValue;
        return this;
    }

    /**
     * 标签值
     * @return labelValue
     */
    public String getLabelValue() {
        return labelValue;
    }

    public void setLabelValue(String labelValue) {
        this.labelValue = labelValue;
    }

    public MetricFilterParam withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作类型
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricFilterParam that = (MetricFilterParam) obj;
        return Objects.equals(this.labelName, that.labelName) && Objects.equals(this.labelValue, that.labelValue)
            && Objects.equals(this.operator, that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelName, labelValue, operator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricFilterParam {\n");
        sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
        sb.append("    labelValue: ").append(toIndentedString(labelValue)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
