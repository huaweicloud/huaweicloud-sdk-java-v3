package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户自定义字段
 */
public class WorkitemCustomField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_id")

    private String fieldId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_type")

    private String fieldType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_option_source")

    private String fieldOptionSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public WorkitemCustomField withFieldId(String fieldId) {
        this.fieldId = fieldId;
        return this;
    }

    /**
     * 自定义字段id
     * @return fieldId
     */
    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public WorkitemCustomField withFieldName(String fieldName) {
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

    public WorkitemCustomField withFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * 自定义字段类型, \"Date\",\"Number\",\"DateTime\", \"MultiLineText\",\"SingleLineText\", \"Select\",  \"Checkbox\"
     * @return fieldType
     */
    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public WorkitemCustomField withFieldOptionSource(String fieldOptionSource) {
        this.fieldOptionSource = fieldOptionSource;
        return this;
    }

    /**
     * 自定义字段的选项源,CUSTOM，USER，DOMAIN，ITERATION，MODULE，TAG
     * @return fieldOptionSource
     */
    public String getFieldOptionSource() {
        return fieldOptionSource;
    }

    public void setFieldOptionSource(String fieldOptionSource) {
        this.fieldOptionSource = fieldOptionSource;
    }

    public WorkitemCustomField withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 自定义字段值, (field_type为Date,Number,DateTime时,field_option_source为空，value值是数字的字符串)， (field_type为MultiLineText,SingleLineText时,field_option_source为空，value值是文本字符串)， (field_type为Select ,field_option_source为CUSTOM时，value值是文本字符串) (field_type为Select ,field_option_source为USER，DOMAIN，ITERATION，MODULE，TAG时，value值是Json格式{}), (field_type为Checkbox ,field_option_source为CUSTOM时，value值是字符串数组[\\\"aaa\\\"]), (field_type为\"Checkbox\" ,field_option_source为USER，DOMAIN，ITERATION，MODULE，TAG时，value值是Json的数组[{},{}])
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
        WorkitemCustomField that = (WorkitemCustomField) obj;
        return Objects.equals(this.fieldId, that.fieldId) && Objects.equals(this.fieldName, that.fieldName)
            && Objects.equals(this.fieldType, that.fieldType)
            && Objects.equals(this.fieldOptionSource, that.fieldOptionSource) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldId, fieldName, fieldType, fieldOptionSource, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkitemCustomField {\n");
        sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    fieldOptionSource: ").append(toIndentedString(fieldOptionSource)).append("\n");
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
