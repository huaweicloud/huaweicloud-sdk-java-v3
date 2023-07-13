package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 资源共享邀请的详细信息。
 */
public class ResourceShareInvitation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receiver_account_id")

    private String receiverAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_id")

    private String resourceShareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_name")

    private String resourceShareName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_invitation_id")

    private String resourceShareInvitationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sender_account_id")

    private String senderAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public ResourceShareInvitation withReceiverAccountId(String receiverAccountId) {
        this.receiverAccountId = receiverAccountId;
        return this;
    }

    /**
     * 接收资源共享邀请的帐号ID。
     * @return receiverAccountId
     */
    public String getReceiverAccountId() {
        return receiverAccountId;
    }

    public void setReceiverAccountId(String receiverAccountId) {
        this.receiverAccountId = receiverAccountId;
    }

    public ResourceShareInvitation withResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }

    /**
     * 资源共享实例的ID。
     * @return resourceShareId
     */
    public String getResourceShareId() {
        return resourceShareId;
    }

    public void setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
    }

    public ResourceShareInvitation withResourceShareName(String resourceShareName) {
        this.resourceShareName = resourceShareName;
        return this;
    }

    /**
     * 资源共享实例的名称。
     * @return resourceShareName
     */
    public String getResourceShareName() {
        return resourceShareName;
    }

    public void setResourceShareName(String resourceShareName) {
        this.resourceShareName = resourceShareName;
    }

    public ResourceShareInvitation withResourceShareInvitationId(String resourceShareInvitationId) {
        this.resourceShareInvitationId = resourceShareInvitationId;
        return this;
    }

    /**
     * 资源共享邀请的ID。
     * @return resourceShareInvitationId
     */
    public String getResourceShareInvitationId() {
        return resourceShareInvitationId;
    }

    public void setResourceShareInvitationId(String resourceShareInvitationId) {
        this.resourceShareInvitationId = resourceShareInvitationId;
    }

    public ResourceShareInvitation withSenderAccountId(String senderAccountId) {
        this.senderAccountId = senderAccountId;
        return this;
    }

    /**
     * 发送资源共享邀请的帐号ID。
     * @return senderAccountId
     */
    public String getSenderAccountId() {
        return senderAccountId;
    }

    public void setSenderAccountId(String senderAccountId) {
        this.senderAccountId = senderAccountId;
    }

    public ResourceShareInvitation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源共享邀请的当前状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResourceShareInvitation withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建邀请的时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ResourceShareInvitation withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 最后一次更新邀请的时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceShareInvitation that = (ResourceShareInvitation) obj;
        return Objects.equals(this.receiverAccountId, that.receiverAccountId)
            && Objects.equals(this.resourceShareId, that.resourceShareId)
            && Objects.equals(this.resourceShareName, that.resourceShareName)
            && Objects.equals(this.resourceShareInvitationId, that.resourceShareInvitationId)
            && Objects.equals(this.senderAccountId, that.senderAccountId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiverAccountId,
            resourceShareId,
            resourceShareName,
            resourceShareInvitationId,
            senderAccountId,
            status,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceShareInvitation {\n");
        sb.append("    receiverAccountId: ").append(toIndentedString(receiverAccountId)).append("\n");
        sb.append("    resourceShareId: ").append(toIndentedString(resourceShareId)).append("\n");
        sb.append("    resourceShareName: ").append(toIndentedString(resourceShareName)).append("\n");
        sb.append("    resourceShareInvitationId: ").append(toIndentedString(resourceShareInvitationId)).append("\n");
        sb.append("    senderAccountId: ").append(toIndentedString(senderAccountId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
