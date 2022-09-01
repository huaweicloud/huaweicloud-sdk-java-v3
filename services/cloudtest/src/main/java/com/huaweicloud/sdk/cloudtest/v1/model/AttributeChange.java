package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 对象，包括编号与名称
 */
public class AttributeChange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_value")

    @JacksonXmlProperty(localName = "new_value")

    private String newValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_value")

    @JacksonXmlProperty(localName = "old_value")

    private String oldValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute_type")

    @JacksonXmlProperty(localName = "attribute_type")

    private String attributeType;

    public AttributeChange withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
     * 变更后的取值
     * @return newValue
     */
    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public AttributeChange withOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     * 变更前的取值
     * @return oldValue
     */
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public AttributeChange withAttributeType(String attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * 发生变更的测试计划属性
     * @return attributeType
     */
    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttributeChange attributeChange = (AttributeChange) o;
        return Objects.equals(this.newValue, attributeChange.newValue)
            && Objects.equals(this.oldValue, attributeChange.oldValue)
            && Objects.equals(this.attributeType, attributeChange.attributeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newValue, oldValue, attributeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttributeChange {\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
        sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
        sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
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
