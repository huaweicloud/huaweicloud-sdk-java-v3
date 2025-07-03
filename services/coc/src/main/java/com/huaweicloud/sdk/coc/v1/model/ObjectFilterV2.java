package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ObjectFilterV2
 */
public class ObjectFilterV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field")

    private String field;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_type")

    private String matchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority_type")

    private String priorityType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<Object> values = null;

    public ObjectFilterV2 withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作符 in/like/startwith/endwith/=/!=/>/<等
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ObjectFilterV2 withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * 字段名称
     * @return field
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public ObjectFilterV2 withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 分组
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ObjectFilterV2 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 条件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectFilterV2 withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * 匹配方式
     * @return matchType
     */
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public ObjectFilterV2 withPriorityType(String priorityType) {
        this.priorityType = priorityType;
        return this;
    }

    /**
     * 优先级处理方式
     * @return priorityType
     */
    public String getPriorityType() {
        return priorityType;
    }

    public void setPriorityType(String priorityType) {
        this.priorityType = priorityType;
    }

    public ObjectFilterV2 withValues(List<Object> values) {
        this.values = values;
        return this;
    }

    public ObjectFilterV2 addValuesItem(Object valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ObjectFilterV2 withValues(Consumer<List<Object>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 搜索值
     * @return values
     */
    public List<Object> getValues() {
        return values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectFilterV2 that = (ObjectFilterV2) obj;
        return Objects.equals(this.operator, that.operator) && Objects.equals(this.field, that.field)
            && Objects.equals(this.group, that.group) && Objects.equals(this.name, that.name)
            && Objects.equals(this.matchType, that.matchType) && Objects.equals(this.priorityType, that.priorityType)
            && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operator, field, group, name, matchType, priorityType, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectFilterV2 {\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    priorityType: ").append(toIndentedString(priorityType)).append("\n");
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
