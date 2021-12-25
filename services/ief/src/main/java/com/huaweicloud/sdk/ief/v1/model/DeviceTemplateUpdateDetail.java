package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 设备模板 */
public class DeviceTemplateUpdateDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Map<String, ValueInAttributes> attributes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "twin")

    private Map<String, ValueInTwin> twin = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private DeviceTemplateUpdateDetailTags tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_protocol")

    private String accessProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_visitors")

    private Map<String, ValueInPropertyVisitors> propertyVisitors = null;

    public DeviceTemplateUpdateDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 设备模板描述,最大长度255
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeviceTemplateUpdateDetail withAttributes(Map<String, ValueInAttributes> attributes) {
        this.attributes = attributes;
        return this;
    }

    public DeviceTemplateUpdateDetail putAttributesItem(String key, ValueInAttributes attributesItem) {
        if (this.attributes == null) {
            this.attributes = new HashMap<>();
        }
        this.attributes.put(key, attributesItem);
        return this;
    }

    public DeviceTemplateUpdateDetail withAttributes(Consumer<Map<String, ValueInAttributes>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new HashMap<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /** 终端设备静态属性，最多64个键值。
     * 
     * @return attributes */
    public Map<String, ValueInAttributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, ValueInAttributes> attributes) {
        this.attributes = attributes;
    }

    public DeviceTemplateUpdateDetail withTwin(Map<String, ValueInTwin> twin) {
        this.twin = twin;
        return this;
    }

    public DeviceTemplateUpdateDetail putTwinItem(String key, ValueInTwin twinItem) {
        if (this.twin == null) {
            this.twin = new HashMap<>();
        }
        this.twin.put(key, twinItem);
        return this;
    }

    public DeviceTemplateUpdateDetail withTwin(Consumer<Map<String, ValueInTwin>> twinSetter) {
        if (this.twin == null) {
            this.twin = new HashMap<>();
        }
        twinSetter.accept(this.twin);
        return this;
    }

    /** 终端设备动态属性
     * 
     * @return twin */
    public Map<String, ValueInTwin> getTwin() {
        return twin;
    }

    public void setTwin(Map<String, ValueInTwin> twin) {
        this.twin = twin;
    }

    public DeviceTemplateUpdateDetail withTags(DeviceTemplateUpdateDetailTags tags) {
        this.tags = tags;
        return this;
    }

    public DeviceTemplateUpdateDetail withTags(Consumer<DeviceTemplateUpdateDetailTags> tagsSetter) {
        if (this.tags == null) {
            this.tags = new DeviceTemplateUpdateDetailTags();
            tagsSetter.accept(this.tags);
        }

        return this;
    }

    /** Get tags
     * 
     * @return tags */
    public DeviceTemplateUpdateDetailTags getTags() {
        return tags;
    }

    public void setTags(DeviceTemplateUpdateDetailTags tags) {
        this.tags = tags;
    }

    public DeviceTemplateUpdateDetail withAccessProtocol(String accessProtocol) {
        this.accessProtocol = accessProtocol;
        return this;
    }

    /** - userdefine：自定义协议 - modbus：modbus协议 - opc-ua：opc-ua协议
     * 
     * @return accessProtocol */
    public String getAccessProtocol() {
        return accessProtocol;
    }

    public void setAccessProtocol(String accessProtocol) {
        this.accessProtocol = accessProtocol;
    }

    public DeviceTemplateUpdateDetail withPropertyVisitors(Map<String, ValueInPropertyVisitors> propertyVisitors) {
        this.propertyVisitors = propertyVisitors;
        return this;
    }

    public DeviceTemplateUpdateDetail putPropertyVisitorsItem(String key,
        ValueInPropertyVisitors propertyVisitorsItem) {
        if (this.propertyVisitors == null) {
            this.propertyVisitors = new HashMap<>();
        }
        this.propertyVisitors.put(key, propertyVisitorsItem);
        return this;
    }

    public DeviceTemplateUpdateDetail withPropertyVisitors(
        Consumer<Map<String, ValueInPropertyVisitors>> propertyVisitorsSetter) {
        if (this.propertyVisitors == null) {
            this.propertyVisitors = new HashMap<>();
        }
        propertyVisitorsSetter.accept(this.propertyVisitors);
        return this;
    }

    /** 孪生属性配置，与access_protocol关联。
     * 
     * @return propertyVisitors */
    public Map<String, ValueInPropertyVisitors> getPropertyVisitors() {
        return propertyVisitors;
    }

    public void setPropertyVisitors(Map<String, ValueInPropertyVisitors> propertyVisitors) {
        this.propertyVisitors = propertyVisitors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceTemplateUpdateDetail deviceTemplateUpdateDetail = (DeviceTemplateUpdateDetail) o;
        return Objects.equals(this.description, deviceTemplateUpdateDetail.description)
            && Objects.equals(this.attributes, deviceTemplateUpdateDetail.attributes)
            && Objects.equals(this.twin, deviceTemplateUpdateDetail.twin)
            && Objects.equals(this.tags, deviceTemplateUpdateDetail.tags)
            && Objects.equals(this.accessProtocol, deviceTemplateUpdateDetail.accessProtocol)
            && Objects.equals(this.propertyVisitors, deviceTemplateUpdateDetail.propertyVisitors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, attributes, twin, tags, accessProtocol, propertyVisitors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceTemplateUpdateDetail {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    twin: ").append(toIndentedString(twin)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    accessProtocol: ").append(toIndentedString(accessProtocol)).append("\n");
        sb.append("    propertyVisitors: ").append(toIndentedString(propertyVisitors)).append("\n");
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
