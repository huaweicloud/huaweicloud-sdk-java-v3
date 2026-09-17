package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class BindNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subsystem_count")

    private Integer subsystemCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_type")

    private String resourceSpecType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_edge_node_id")

    private String associatedEdgeNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_edge_node_name")

    private String associatedEdgeNodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_params")

    private String extendParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size")

    private Integer resourceSize;

    public BindNodeResponse withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public BindNodeResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型：industry|campus
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BindNodeResponse withSubsystemCount(Integer subsystemCount) {
        this.subsystemCount = subsystemCount;
        return this;
    }

    /**
     * 对接的子系统数量
     * minimum: 1
     * maximum: 50
     * @return subsystemCount
     */
    public Integer getSubsystemCount() {
        return subsystemCount;
    }

    public void setSubsystemCount(Integer subsystemCount) {
        this.subsystemCount = subsystemCount;
    }

    public BindNodeResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * CBC上注册的资源类型编码。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public BindNodeResponse withResourceSpecType(String resourceSpecType) {
        this.resourceSpecType = resourceSpecType;
        return this;
    }

    /**
     * CBC上注册的资源类型编码。
     * @return resourceSpecType
     */
    public String getResourceSpecType() {
        return resourceSpecType;
    }

    public void setResourceSpecType(String resourceSpecType) {
        this.resourceSpecType = resourceSpecType;
    }

    public BindNodeResponse withAssociatedEdgeNodeId(String associatedEdgeNodeId) {
        this.associatedEdgeNodeId = associatedEdgeNodeId;
        return this;
    }

    /**
     * 关联的边缘节点ID
     * @return associatedEdgeNodeId
     */
    public String getAssociatedEdgeNodeId() {
        return associatedEdgeNodeId;
    }

    public void setAssociatedEdgeNodeId(String associatedEdgeNodeId) {
        this.associatedEdgeNodeId = associatedEdgeNodeId;
    }

    public BindNodeResponse withAssociatedEdgeNodeName(String associatedEdgeNodeName) {
        this.associatedEdgeNodeName = associatedEdgeNodeName;
        return this;
    }

    /**
     * 关联的边缘节点名称
     * @return associatedEdgeNodeName
     */
    public String getAssociatedEdgeNodeName() {
        return associatedEdgeNodeName;
    }

    public void setAssociatedEdgeNodeName(String associatedEdgeNodeName) {
        this.associatedEdgeNodeName = associatedEdgeNodeName;
    }

    public BindNodeResponse withExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    /**
     * 扩展开通参数。
     * @return extendParams
     */
    public String getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(String extendParams) {
        this.extendParams = extendParams;
    }

    public BindNodeResponse withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    /**
     * 资源容量大小，线性产品使用
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BindNodeResponse that = (BindNodeResponse) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.subsystemCount, that.subsystemCount)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSpecType, that.resourceSpecType)
            && Objects.equals(this.associatedEdgeNodeId, that.associatedEdgeNodeId)
            && Objects.equals(this.associatedEdgeNodeName, that.associatedEdgeNodeName)
            && Objects.equals(this.extendParams, that.extendParams)
            && Objects.equals(this.resourceSize, that.resourceSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId,
            type,
            subsystemCount,
            resourceType,
            resourceSpecType,
            associatedEdgeNodeId,
            associatedEdgeNodeName,
            extendParams,
            resourceSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindNodeResponse {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    subsystemCount: ").append(toIndentedString(subsystemCount)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecType: ").append(toIndentedString(resourceSpecType)).append("\n");
        sb.append("    associatedEdgeNodeId: ").append(toIndentedString(associatedEdgeNodeId)).append("\n");
        sb.append("    associatedEdgeNodeName: ").append(toIndentedString(associatedEdgeNodeName)).append("\n");
        sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
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
