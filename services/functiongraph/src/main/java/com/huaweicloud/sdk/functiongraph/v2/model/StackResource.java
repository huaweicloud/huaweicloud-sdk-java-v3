package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源栈
 */
public class StackResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_resource_id")

    private String physicalResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_resource_name")

    private String physicalResourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_resource_name")

    private String logicalResourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_resource_type")

    private String logicalResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_status")

    private String resourceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_message")

    private String statusMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "href")

    private String href;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    public StackResource withPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
        return this;
    }

    /**
     * 物理资源id
     * @return physicalResourceId
     */
    public String getPhysicalResourceId() {
        return physicalResourceId;
    }

    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    public StackResource withPhysicalResourceName(String physicalResourceName) {
        this.physicalResourceName = physicalResourceName;
        return this;
    }

    /**
     * 物理资源名称
     * @return physicalResourceName
     */
    public String getPhysicalResourceName() {
        return physicalResourceName;
    }

    public void setPhysicalResourceName(String physicalResourceName) {
        this.physicalResourceName = physicalResourceName;
    }

    public StackResource withLogicalResourceName(String logicalResourceName) {
        this.logicalResourceName = logicalResourceName;
        return this;
    }

    /**
     * 逻辑资源名称
     * @return logicalResourceName
     */
    public String getLogicalResourceName() {
        return logicalResourceName;
    }

    public void setLogicalResourceName(String logicalResourceName) {
        this.logicalResourceName = logicalResourceName;
    }

    public StackResource withLogicalResourceType(String logicalResourceType) {
        this.logicalResourceType = logicalResourceType;
        return this;
    }

    /**
     * 逻辑资源类型
     * @return logicalResourceType
     */
    public String getLogicalResourceType() {
        return logicalResourceType;
    }

    public void setLogicalResourceType(String logicalResourceType) {
        this.logicalResourceType = logicalResourceType;
    }

    public StackResource withResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
        return this;
    }

    /**
     * 资源状态
     * @return resourceStatus
     */
    public String getResourceStatus() {
        return resourceStatus;
    }

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    public StackResource withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * 状态信息
     * @return statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public StackResource withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * 超链接地址
     * @return href
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public StackResource withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 云服务名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StackResource that = (StackResource) obj;
        return Objects.equals(this.physicalResourceId, that.physicalResourceId)
            && Objects.equals(this.physicalResourceName, that.physicalResourceName)
            && Objects.equals(this.logicalResourceName, that.logicalResourceName)
            && Objects.equals(this.logicalResourceType, that.logicalResourceType)
            && Objects.equals(this.resourceStatus, that.resourceStatus)
            && Objects.equals(this.statusMessage, that.statusMessage) && Objects.equals(this.href, that.href)
            && Objects.equals(this.displayName, that.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(physicalResourceId,
            physicalResourceName,
            logicalResourceName,
            logicalResourceType,
            resourceStatus,
            statusMessage,
            href,
            displayName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackResource {\n");
        sb.append("    physicalResourceId: ").append(toIndentedString(physicalResourceId)).append("\n");
        sb.append("    physicalResourceName: ").append(toIndentedString(physicalResourceName)).append("\n");
        sb.append("    logicalResourceName: ").append(toIndentedString(logicalResourceName)).append("\n");
        sb.append("    logicalResourceType: ").append(toIndentedString(logicalResourceType)).append("\n");
        sb.append("    resourceStatus: ").append(toIndentedString(resourceStatus)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
