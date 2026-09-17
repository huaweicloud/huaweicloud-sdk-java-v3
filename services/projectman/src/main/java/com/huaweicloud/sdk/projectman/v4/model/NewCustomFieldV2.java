package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自定义字段
 */
public class NewCustomFieldV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field")

    private String customField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public NewCustomFieldV2 withCustomField(String customField) {
        this.customField = customField;
        return this;
    }

    /**
     * **参数解释：** 自定义字段。 **取值范围：** 不涉及。
     * @return customField
     */
    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    public NewCustomFieldV2 withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * **参数解释：** 自定义字段名称。 **取值范围：** 不涉及。
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public NewCustomFieldV2 withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 自定义属性对应的值，多个值以英文逗号区分开。 **取值范围：** 不涉及。
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
        NewCustomFieldV2 that = (NewCustomFieldV2) obj;
        return Objects.equals(this.customField, that.customField) && Objects.equals(this.fieldName, that.fieldName)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customField, fieldName, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewCustomFieldV2 {\n");
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
