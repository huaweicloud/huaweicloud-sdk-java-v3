package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设备属性过滤信息，自定义结构。
 */
public class PropertyFilter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_values")

    private List<String> inValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private Strategy strategy;

    public PropertyFilter withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数说明**：设备属性的路径信息，格式：service_id/DataProperty，例如门磁状态为“DoorWindow/status”。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PropertyFilter withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * **参数说明**：数据比较的操作符。 **取值范围**：当前支持的操作符有：>，<，>=，<=，=，in:表示在指定值中匹配和between:表示数值区间。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public PropertyFilter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数说明**：数据比较表达式的右值。与数据比较操作符between联用时，右值表示最小值和最大值，用逗号隔开，如“20,30”表示大于等于20小于30。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PropertyFilter withInValues(List<String> inValues) {
        this.inValues = inValues;
        return this;
    }

    public PropertyFilter addInValuesItem(String inValuesItem) {
        if (this.inValues == null) {
            this.inValues = new ArrayList<>();
        }
        this.inValues.add(inValuesItem);
        return this;
    }

    public PropertyFilter withInValues(Consumer<List<String>> inValuesSetter) {
        if (this.inValues == null) {
            this.inValues = new ArrayList<>();
        }
        inValuesSetter.accept(this.inValues);
        return this;
    }

    /**
     * **参数说明**：当operator为in时该字段必填，使用该字段传递比较表达式右值，上限为20个。
     * @return inValues
     */
    public List<String> getInValues() {
        return inValues;
    }

    public void setInValues(List<String> inValues) {
        this.inValues = inValues;
    }

    public PropertyFilter withStrategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public PropertyFilter withStrategy(Consumer<Strategy> strategySetter) {
        if (this.strategy == null) {
            this.strategy = new Strategy();
            strategySetter.accept(this.strategy);
        }

        return this;
    }

    /**
     * Get strategy
     * @return strategy
     */
    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PropertyFilter that = (PropertyFilter) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.value, that.value) && Objects.equals(this.inValues, that.inValues)
            && Objects.equals(this.strategy, that.strategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, operator, value, inValues, strategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertyFilter {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    inValues: ").append(toIndentedString(inValues)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
