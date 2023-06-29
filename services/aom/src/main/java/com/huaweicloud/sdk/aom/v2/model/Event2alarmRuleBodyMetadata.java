package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 源数据
 */
public class Event2alarmRuleBodyMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customField")

    private List<String> customField = null;

    public Event2alarmRuleBodyMetadata withCustomField(List<String> customField) {
        this.customField = customField;
        return this;
    }

    public Event2alarmRuleBodyMetadata addCustomFieldItem(String customFieldItem) {
        if (this.customField == null) {
            this.customField = new ArrayList<>();
        }
        this.customField.add(customFieldItem);
        return this;
    }

    public Event2alarmRuleBodyMetadata withCustomField(Consumer<List<String>> customFieldSetter) {
        if (this.customField == null) {
            this.customField = new ArrayList<>();
        }
        customFieldSetter.accept(this.customField);
        return this;
    }

    /**
     * 用户自定义标签
     * @return customField
     */
    public List<String> getCustomField() {
        return customField;
    }

    public void setCustomField(List<String> customField) {
        this.customField = customField;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event2alarmRuleBodyMetadata that = (Event2alarmRuleBodyMetadata) obj;
        return Objects.equals(this.customField, that.customField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customField);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event2alarmRuleBodyMetadata {\n");
        sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
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
