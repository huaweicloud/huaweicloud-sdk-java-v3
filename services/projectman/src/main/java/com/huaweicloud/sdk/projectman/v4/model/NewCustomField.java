package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 自定义字段
 */
public class NewCustomField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field")

    @JacksonXmlProperty(localName = "custom_field")

    private String customField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    @JacksonXmlProperty(localName = "field_name")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private String value;

    public NewCustomField withCustomField(String customField) {
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

    public NewCustomField withFieldName(String fieldName) {
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

    public NewCustomField withValue(String value) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NewCustomField newCustomField = (NewCustomField) o;
        return Objects.equals(this.customField, newCustomField.customField)
            && Objects.equals(this.fieldName, newCustomField.fieldName)
            && Objects.equals(this.value, newCustomField.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customField, fieldName, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewCustomField {\n");
        sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
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
