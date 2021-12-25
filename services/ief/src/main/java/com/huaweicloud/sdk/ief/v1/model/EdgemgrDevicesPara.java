package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 终端设备属性 */
public class EdgemgrDevicesPara {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Map<String, ValueInAttributes> attributes = null;

    public EdgemgrDevicesPara withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 终端设备描述，最大长度255，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EdgemgrDevicesPara withAttributes(Map<String, ValueInAttributes> attributes) {
        this.attributes = attributes;
        return this;
    }

    public EdgemgrDevicesPara putAttributesItem(String key, ValueInAttributes attributesItem) {
        if (this.attributes == null) {
            this.attributes = new HashMap<>();
        }
        this.attributes.put(key, attributesItem);
        return this;
    }

    public EdgemgrDevicesPara withAttributes(Consumer<Map<String, ValueInAttributes>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new HashMap<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /** Get attributes
     * 
     * @return attributes */
    public Map<String, ValueInAttributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, ValueInAttributes> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgemgrDevicesPara edgemgrDevicesPara = (EdgemgrDevicesPara) o;
        return Objects.equals(this.description, edgemgrDevicesPara.description)
            && Objects.equals(this.attributes, edgemgrDevicesPara.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgemgrDevicesPara {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
