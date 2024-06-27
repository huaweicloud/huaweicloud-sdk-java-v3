package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用例自定义字段信息
 */
public class QueryCustomFieldsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    private String fieldName;

    public QueryCustomFieldsInfo withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 测试用例自定义字段Id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public QueryCustomFieldsInfo withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public QueryCustomFieldsInfo addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public QueryCustomFieldsInfo withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 测试用例自定义字段值
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public QueryCustomFieldsInfo withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * 自定义字段名，优先取id再取fieldName
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryCustomFieldsInfo that = (QueryCustomFieldsInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.values, that.values)
            && Objects.equals(this.fieldName, that.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, values, fieldName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCustomFieldsInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
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
