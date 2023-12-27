package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 依赖条件
 */
public class Condition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_node_name")

    private String preNodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    public Condition withPreNodeName(String preNodeName) {
        this.preNodeName = preNodeName;
        return this;
    }

    /**
     * 本节点依赖的前一个节点名称
     * @return preNodeName
     */
    public String getPreNodeName() {
        return preNodeName;
    }

    public void setPreNodeName(String preNodeName) {
        this.preNodeName = preNodeName;
    }

    public Condition withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * EL表达式，如果EL表达式的计算结果为true，则触发执行本节点。
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Condition that = (Condition) obj;
        return Objects.equals(this.preNodeName, that.preNodeName) && Objects.equals(this.expression, that.expression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preNodeName, expression);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Condition {\n");
        sb.append("    preNodeName: ").append(toIndentedString(preNodeName)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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
