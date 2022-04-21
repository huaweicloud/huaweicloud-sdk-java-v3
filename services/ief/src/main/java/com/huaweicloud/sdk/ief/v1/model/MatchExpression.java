package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 匹配规则表达式
 */
public class MatchExpression {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    public MatchExpression withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 规则的标签
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public MatchExpression withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作符，取值如下。 In：标签值需要在values的列表中 NotIn：标签的值不在某个列表中 Exists：某个标签存在 DoesNotExist：某个标签不存在 Gt：标签的值大于某个值（字符串比较） Lt：标签的值小于某个值（字符串比较）
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public MatchExpression withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public MatchExpression addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public MatchExpression withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 一组标签值。 如果运算符为In或NotIn，则值数组必须非空。 如果运算符为Exists 或DoesNotExist，则值数组必须为空。 如果运算符是Gt或Lt，则值数组必须具有单个元素，该元素将被解释为整数。
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MatchExpression matchExpression = (MatchExpression) o;
        return Objects.equals(this.key, matchExpression.key) && Objects.equals(this.operator, matchExpression.operator)
            && Objects.equals(this.values, matchExpression.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, operator, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MatchExpression {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
