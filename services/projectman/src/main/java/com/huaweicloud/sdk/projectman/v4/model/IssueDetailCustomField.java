package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IssueDetailCustomField
 */
public class IssueDetailCustomField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field")

    private String customField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_type")

    private String fieldType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public IssueDetailCustomField withCustomField(String customField) {
        this.customField = customField;
        return this;
    }

    /**
     * 自定义字段
     * @return customField
     */
    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    public IssueDetailCustomField withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * 自定义字段名称
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public IssueDetailCustomField withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 自定义属性对应的值，多个值以英文逗号区分开
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public IssueDetailCustomField withFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * 自定义字段类型， textArea 多行文本，text 单行文本，select 下拉框，number 数字，time_date 日期，checkbox 多选框，radio 单选框
     * @return fieldType
     */
    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public IssueDetailCustomField withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 自定义字段描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueDetailCustomField that = (IssueDetailCustomField) obj;
        return Objects.equals(this.customField, that.customField) && Objects.equals(this.fieldName, that.fieldName)
            && Objects.equals(this.value, that.value) && Objects.equals(this.fieldType, that.fieldType)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customField, fieldName, value, fieldType, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueDetailCustomField {\n");
        sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
