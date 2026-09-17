package com.huaweicloud.sdk.iotedge.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源信息。
 */
public class ResourceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_rule")

    private String chargingRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_edge_cluster_id")

    private String associatedEdgeClusterId;

    public ResourceDetail withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id，添加资源时由边缘侧生成
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ResourceDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态，冻结:freeze、解冻:unfreeze、退订:delete。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResourceDetail withChargingRule(String chargingRule) {
        this.chargingRule = chargingRule;
        return this;
    }

    /**
     * 计费规则
     * @return chargingRule
     */
    public String getChargingRule() {
        return chargingRule;
    }

    public void setChargingRule(String chargingRule) {
        this.chargingRule = chargingRule;
    }

    public ResourceDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 内部类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceDetail withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称，由边缘侧生成。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ResourceDetail withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 公有云CBC上注册的服务类型英文名
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public ResourceDetail withResourceType(String resourceType) {
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

    public ResourceDetail withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格编码
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ResourceDetail withAssociatedEdgeClusterId(String associatedEdgeClusterId) {
        this.associatedEdgeClusterId = associatedEdgeClusterId;
        return this;
    }

    /**
     * 关联的边缘集群ID
     * @return associatedEdgeClusterId
     */
    public String getAssociatedEdgeClusterId() {
        return associatedEdgeClusterId;
    }

    public void setAssociatedEdgeClusterId(String associatedEdgeClusterId) {
        this.associatedEdgeClusterId = associatedEdgeClusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceDetail that = (ResourceDetail) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.chargingRule, that.chargingRule) && Objects.equals(this.type, that.type)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.associatedEdgeClusterId, that.associatedEdgeClusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId,
            status,
            chargingRule,
            type,
            resourceName,
            cloudServiceType,
            resourceType,
            resourceSpecCode,
            associatedEdgeClusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceDetail {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    chargingRule: ").append(toIndentedString(chargingRule)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    associatedEdgeClusterId: ").append(toIndentedString(associatedEdgeClusterId)).append("\n");
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
