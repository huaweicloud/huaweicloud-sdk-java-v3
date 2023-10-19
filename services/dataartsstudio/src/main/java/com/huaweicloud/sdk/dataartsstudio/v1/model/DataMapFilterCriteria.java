package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 过滤条件
 */
public class DataMapFilterCriteria {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute")

    private String attribute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Object value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private ConditionInfo condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criterion")

    private List<DataMapFilterCriteria> criterion = null;

    public DataMapFilterCriteria withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * 属性
     * @return attribute
     */
    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public DataMapFilterCriteria withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作表示，默认值EQ
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public DataMapFilterCriteria withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * 值
     * @return value
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public DataMapFilterCriteria withCondition(ConditionInfo condition) {
        this.condition = condition;
        return this;
    }

    public DataMapFilterCriteria withCondition(Consumer<ConditionInfo> conditionSetter) {
        if (this.condition == null) {
            this.condition = new ConditionInfo();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public ConditionInfo getCondition() {
        return condition;
    }

    public void setCondition(ConditionInfo condition) {
        this.condition = condition;
    }

    public DataMapFilterCriteria withCriterion(List<DataMapFilterCriteria> criterion) {
        this.criterion = criterion;
        return this;
    }

    public DataMapFilterCriteria addCriterionItem(DataMapFilterCriteria criterionItem) {
        if (this.criterion == null) {
            this.criterion = new ArrayList<>();
        }
        this.criterion.add(criterionItem);
        return this;
    }

    public DataMapFilterCriteria withCriterion(Consumer<List<DataMapFilterCriteria>> criterionSetter) {
        if (this.criterion == null) {
            this.criterion = new ArrayList<>();
        }
        criterionSetter.accept(this.criterion);
        return this;
    }

    /**
     * 条件准则
     * @return criterion
     */
    public List<DataMapFilterCriteria> getCriterion() {
        return criterion;
    }

    public void setCriterion(List<DataMapFilterCriteria> criterion) {
        this.criterion = criterion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataMapFilterCriteria that = (DataMapFilterCriteria) obj;
        return Objects.equals(this.attribute, that.attribute) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.value, that.value) && Objects.equals(this.condition, that.condition)
            && Objects.equals(this.criterion, that.criterion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attribute, operator, value, condition, criterion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataMapFilterCriteria {\n");
        sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    criterion: ").append(toIndentedString(criterion)).append("\n");
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
