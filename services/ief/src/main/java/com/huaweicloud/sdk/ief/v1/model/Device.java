package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 终端设备属性
 */
public class Device {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_protocol")

    private String accessProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Map<String, ValueInAttributes> attributes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_type")

    private String connectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "twin")

    private Map<String, ValueInTwinResponse> twin = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config")

    private AccessConfig accessConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_visitors")

    private Map<String, ValueInPropertyVisitors> propertyVisitors = null;

    public Device withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 终端设备ID，只允许英文字母、数字、下划线、中划线，必须以英文字母和数字开头，长度限制为24~64之间
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Device withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 终端设备名称，只允许中文字符、英文字母、数字、下划线、中划线，长度限制为1~64
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Device withAccessProtocol(String accessProtocol) {
        this.accessProtocol = accessProtocol;
        return this;
    }

    /**
     * 访问协议，有如下选项： - userdefine：自定义协议 - modbus：modbus协议 - opc-ua：opc-ua协议 默认为userdefine
     * @return accessProtocol
     */
    public String getAccessProtocol() {
        return accessProtocol;
    }

    public void setAccessProtocol(String accessProtocol) {
        this.accessProtocol = accessProtocol;
    }

    public Device withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 终端设备描述，最大长度255，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Device withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Device withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Device withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Device withAttributes(Map<String, ValueInAttributes> attributes) {
        this.attributes = attributes;
        return this;
    }

    public Device putAttributesItem(String key, ValueInAttributes attributesItem) {
        if (this.attributes == null) {
            this.attributes = new HashMap<>();
        }
        this.attributes.put(key, attributesItem);
        return this;
    }

    public Device withAttributes(Consumer<Map<String, ValueInAttributes>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new HashMap<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /**
     * 终端设备静态属性信息
     * @return attributes
     */
    public Map<String, ValueInAttributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, ValueInAttributes> attributes) {
        this.attributes = attributes;
    }

    public Device withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * 连接类型，默认为edge
     * @return connectionType
     */
    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public Device withTwin(Map<String, ValueInTwinResponse> twin) {
        this.twin = twin;
        return this;
    }

    public Device putTwinItem(String key, ValueInTwinResponse twinItem) {
        if (this.twin == null) {
            this.twin = new HashMap<>();
        }
        this.twin.put(key, twinItem);
        return this;
    }

    public Device withTwin(Consumer<Map<String, ValueInTwinResponse>> twinSetter) {
        if (this.twin == null) {
            this.twin = new HashMap<>();
        }
        twinSetter.accept(this.twin);
        return this;
    }

    /**
     * 终端设备孪生属性信息
     * @return twin
     */
    public Map<String, ValueInTwinResponse> getTwin() {
        return twin;
    }

    public void setTwin(Map<String, ValueInTwinResponse> twin) {
        this.twin = twin;
    }

    public Device withAccessConfig(AccessConfig accessConfig) {
        this.accessConfig = accessConfig;
        return this;
    }

    public Device withAccessConfig(Consumer<AccessConfig> accessConfigSetter) {
        if (this.accessConfig == null) {
            this.accessConfig = new AccessConfig();
            accessConfigSetter.accept(this.accessConfig);
        }

        return this;
    }

    /**
     * Get accessConfig
     * @return accessConfig
     */
    public AccessConfig getAccessConfig() {
        return accessConfig;
    }

    public void setAccessConfig(AccessConfig accessConfig) {
        this.accessConfig = accessConfig;
    }

    public Device withPropertyVisitors(Map<String, ValueInPropertyVisitors> propertyVisitors) {
        this.propertyVisitors = propertyVisitors;
        return this;
    }

    public Device putPropertyVisitorsItem(String key, ValueInPropertyVisitors propertyVisitorsItem) {
        if (this.propertyVisitors == null) {
            this.propertyVisitors = new HashMap<>();
        }
        this.propertyVisitors.put(key, propertyVisitorsItem);
        return this;
    }

    public Device withPropertyVisitors(Consumer<Map<String, ValueInPropertyVisitors>> propertyVisitorsSetter) {
        if (this.propertyVisitors == null) {
            this.propertyVisitors = new HashMap<>();
        }
        propertyVisitorsSetter.accept(this.propertyVisitors);
        return this;
    }

    /**
     * 孪生属性配置
     * @return propertyVisitors
     */
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
        Device device = (Device) o;
        return Objects.equals(this.id, device.id) && Objects.equals(this.name, device.name)
            && Objects.equals(this.accessProtocol, device.accessProtocol)
            && Objects.equals(this.description, device.description) && Objects.equals(this.projectId, device.projectId)
            && Objects.equals(this.createdAt, device.createdAt) && Objects.equals(this.updatedAt, device.updatedAt)
            && Objects.equals(this.attributes, device.attributes)
            && Objects.equals(this.connectionType, device.connectionType) && Objects.equals(this.twin, device.twin)
            && Objects.equals(this.accessConfig, device.accessConfig)
            && Objects.equals(this.propertyVisitors, device.propertyVisitors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            accessProtocol,
            description,
            projectId,
            createdAt,
            updatedAt,
            attributes,
            connectionType,
            twin,
            accessConfig,
            propertyVisitors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Device {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    accessProtocol: ").append(toIndentedString(accessProtocol)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    twin: ").append(toIndentedString(twin)).append("\n");
        sb.append("    accessConfig: ").append(toIndentedString(accessConfig)).append("\n");
        sb.append("    propertyVisitors: ").append(toIndentedString(propertyVisitors)).append("\n");
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
