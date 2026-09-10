package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云手机属性信息。
 */
public class PropertyToUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_id")

    private String phoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property")

    private String property;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_property")

    private Map<String, String> customProperty = null;

    public PropertyToUpdate withPhoneId(String phoneId) {
        this.phoneId = phoneId;
        return this;
    }

    /**
     * 云手机id，不超过32个字节。
     * @return phoneId
     */
    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public PropertyToUpdate withProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * 云手机属性列表，为Json格式字符串。
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public PropertyToUpdate withCustomProperty(Map<String, String> customProperty) {
        this.customProperty = customProperty;
        return this;
    }

    public PropertyToUpdate putCustomPropertyItem(String key, String customPropertyItem) {
        if (this.customProperty == null) {
            this.customProperty = new HashMap<>();
        }
        this.customProperty.put(key, customPropertyItem);
        return this;
    }

    public PropertyToUpdate withCustomProperty(Consumer<Map<String, String>> customPropertySetter) {
        if (this.customProperty == null) {
            this.customProperty = new HashMap<>();
        }
        customPropertySetter.accept(this.customProperty);
        return this;
    }

    /**
     * 用户自定义属性键值对。若涉及 OS 系统属性，需遵循系统属性规范。注意：本字段与 property 字段的合并总长度不得超过 7800 字节。
     * @return customProperty
     */
    public Map<String, String> getCustomProperty() {
        return customProperty;
    }

    public void setCustomProperty(Map<String, String> customProperty) {
        this.customProperty = customProperty;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PropertyToUpdate that = (PropertyToUpdate) obj;
        return Objects.equals(this.phoneId, that.phoneId) && Objects.equals(this.property, that.property)
            && Objects.equals(this.customProperty, that.customProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneId, property, customProperty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertyToUpdate {\n");
        sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    customProperty: ").append(toIndentedString(customProperty)).append("\n");
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
