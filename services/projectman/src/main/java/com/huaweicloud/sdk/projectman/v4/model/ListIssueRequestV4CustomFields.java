package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListIssueRequestV4CustomFields
 */
public class ListIssueRequestV4CustomFields {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field")

    private String customField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public ListIssueRequestV4CustomFields withCustomField(String customField) {
        this.customField = customField;
        return this;
    }

    /**
     * 自定义属性字段
     * @return customField
     */
    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    public ListIssueRequestV4CustomFields withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 自定义属性对应的值
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
        ListIssueRequestV4CustomFields listIssueRequestV4CustomFields = (ListIssueRequestV4CustomFields) o;
        return Objects.equals(this.customField, listIssueRequestV4CustomFields.customField)
            && Objects.equals(this.value, listIssueRequestV4CustomFields.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customField, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssueRequestV4CustomFields {\n");
        sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
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
