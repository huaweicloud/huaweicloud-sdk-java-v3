package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 附件的额外信息。
 */
public class CentralNetworkAttachmentSpecificationValueInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_table_id")

    private String enterpriseRouterTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_parent_instance_id")

    private String attachmentParentInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosted_cloud")

    private HostedCloudEnum hostedCloud;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approved_state")

    private ApprovedStateEnum approvedState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public CentralNetworkAttachmentSpecificationValueInfo withEnterpriseRouterTableId(String enterpriseRouterTableId) {
        this.enterpriseRouterTableId = enterpriseRouterTableId;
        return this;
    }

    /**
     * 企业路由器的路由表ID。
     * @return enterpriseRouterTableId
     */
    public String getEnterpriseRouterTableId() {
        return enterpriseRouterTableId;
    }

    public void setEnterpriseRouterTableId(String enterpriseRouterTableId) {
        this.enterpriseRouterTableId = enterpriseRouterTableId;
    }

    public CentralNetworkAttachmentSpecificationValueInfo withAttachmentParentInstanceId(
        String attachmentParentInstanceId) {
        this.attachmentParentInstanceId = attachmentParentInstanceId;
        return this;
    }

    /**
     * 连接的父资源ID，这里表示企业路由器ID。
     * @return attachmentParentInstanceId
     */
    public String getAttachmentParentInstanceId() {
        return attachmentParentInstanceId;
    }

    public void setAttachmentParentInstanceId(String attachmentParentInstanceId) {
        this.attachmentParentInstanceId = attachmentParentInstanceId;
    }

    public CentralNetworkAttachmentSpecificationValueInfo withHostedCloud(HostedCloudEnum hostedCloud) {
        this.hostedCloud = hostedCloud;
        return this;
    }

    /**
     * Get hostedCloud
     * @return hostedCloud
     */
    public HostedCloudEnum getHostedCloud() {
        return hostedCloud;
    }

    public void setHostedCloud(HostedCloudEnum hostedCloud) {
        this.hostedCloud = hostedCloud;
    }

    public CentralNetworkAttachmentSpecificationValueInfo withApprovedState(ApprovedStateEnum approvedState) {
        this.approvedState = approvedState;
        return this;
    }

    /**
     * Get approvedState
     * @return approvedState
     */
    public ApprovedStateEnum getApprovedState() {
        return approvedState;
    }

    public void setApprovedState(ApprovedStateEnum approvedState) {
        this.approvedState = approvedState;
    }

    public CentralNetworkAttachmentSpecificationValueInfo withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 审批拒绝创建附件的原因。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetworkAttachmentSpecificationValueInfo that = (CentralNetworkAttachmentSpecificationValueInfo) obj;
        return Objects.equals(this.enterpriseRouterTableId, that.enterpriseRouterTableId)
            && Objects.equals(this.attachmentParentInstanceId, that.attachmentParentInstanceId)
            && Objects.equals(this.hostedCloud, that.hostedCloud)
            && Objects.equals(this.approvedState, that.approvedState) && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseRouterTableId, attachmentParentInstanceId, hostedCloud, approvedState, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetworkAttachmentSpecificationValueInfo {\n");
        sb.append("    enterpriseRouterTableId: ").append(toIndentedString(enterpriseRouterTableId)).append("\n");
        sb.append("    attachmentParentInstanceId: ").append(toIndentedString(attachmentParentInstanceId)).append("\n");
        sb.append("    hostedCloud: ").append(toIndentedString(hostedCloud)).append("\n");
        sb.append("    approvedState: ").append(toIndentedString(approvedState)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
