package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DataobjectSearchConditionData
 */
public class DataobjectSearchConditionData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filed")

    private String filed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public DataobjectSearchConditionData withFiled(String filed) {
        this.filed = filed;
        return this;
    }

    /**
     * 字段
     * @return filed
     */
    public String getFiled() {
        return filed;
    }

    public void setFiled(String filed) {
        this.filed = filed;
    }

    public DataobjectSearchConditionData withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * 逻辑表达式
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public DataobjectSearchConditionData withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 字段值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataobjectSearchConditionData that = (DataobjectSearchConditionData) obj;
        return Objects.equals(this.filed, that.filed) && Objects.equals(this.expression, that.expression)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filed, expression, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataobjectSearchConditionData {\n");
        sb.append("    filed: ").append(toIndentedString(filed)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
