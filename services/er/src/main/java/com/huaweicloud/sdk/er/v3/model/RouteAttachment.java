package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RouteAttachment
 */
public class RouteAttachment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_id")

    private String attachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    public RouteAttachment withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 连接关联的资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public RouteAttachment withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 连接关联的资源类型: - vpc：虚拟私有云 - vpn：vpn网关 - vgw：云专线的虚拟网关 - vpn：vpn网关 - vgw：云专线的虚拟网关 - peering：对等连接，通过云连接CC加载不同区域的企业路由器来创建“对等连接（Peering）”连接 -  -  -
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public RouteAttachment withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * 连接ID
     * @return attachmentId
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public RouteAttachment withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 路由优先级，普通路由固定值为1
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteAttachment that = (RouteAttachment) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.attachmentId, that.attachmentId) && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceType, attachmentId, priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RouteAttachment {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
