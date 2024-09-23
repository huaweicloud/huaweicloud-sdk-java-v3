package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 两个账号（发起者和接收者）之间为了能安全地建立关系，所需要交换的信息。例如，当管理账号（发起者）邀请另一个账号（接收者）加入其组织时，两个账号一系列邀请（握手）请求和响应交换信息。
 */
public class HandshakeDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_at")

    private OffsetDateTime expiredAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "management_account_id")

    private String managementAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "management_account_name")

    private String managementAccountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notes")

    private String notes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private TargetDto target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public HandshakeDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 邀请（握手）的唯一标识符（ID）。源账号在发起邀请（握手）时创建ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HandshakeDto withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 邀请（握手）的统一资源名称。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public HandshakeDto withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 邀请（握手）请求被接受、取消、拒绝或到期的日期和时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public HandshakeDto withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 提出邀请（握手）请求的日期和时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public HandshakeDto withExpiredAt(OffsetDateTime expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    /**
     * 邀请（握手）过期的日期和时间。
     * @return expiredAt
     */
    public OffsetDateTime getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(OffsetDateTime expiredAt) {
        this.expiredAt = expiredAt;
    }

    public HandshakeDto withManagementAccountId(String managementAccountId) {
        this.managementAccountId = managementAccountId;
        return this;
    }

    /**
     * 组织管理账号的唯一标识符（ID）。
     * @return managementAccountId
     */
    public String getManagementAccountId() {
        return managementAccountId;
    }

    public void setManagementAccountId(String managementAccountId) {
        this.managementAccountId = managementAccountId;
    }

    public HandshakeDto withManagementAccountName(String managementAccountName) {
        this.managementAccountName = managementAccountName;
        return this;
    }

    /**
     * 组织管理账号的名称。
     * @return managementAccountName
     */
    public String getManagementAccountName() {
        return managementAccountName;
    }

    public void setManagementAccountName(String managementAccountName) {
        this.managementAccountName = managementAccountName;
    }

    public HandshakeDto withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * 组织的唯一标识符（ID）。
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public HandshakeDto withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * 给收件账号所有者的邮件中的附加信息。
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public HandshakeDto withTarget(TargetDto target) {
        this.target = target;
        return this;
    }

    public HandshakeDto withTarget(Consumer<TargetDto> targetSetter) {
        if (this.target == null) {
            this.target = new TargetDto();
            targetSetter.accept(this.target);
        }

        return this;
    }

    /**
     * Get target
     * @return target
     */
    public TargetDto getTarget() {
        return target;
    }

    public void setTarget(TargetDto target) {
        this.target = target;
    }

    public HandshakeDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 邀请（握手）的当前状态, pending：邀请中；accepted：接受邀请；cancelled：取消邀请；declined：拒绝邀请；expired：邀请过期。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HandshakeDto that = (HandshakeDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.urn, that.urn)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.expiredAt, that.expiredAt)
            && Objects.equals(this.managementAccountId, that.managementAccountId)
            && Objects.equals(this.managementAccountName, that.managementAccountName)
            && Objects.equals(this.organizationId, that.organizationId) && Objects.equals(this.notes, that.notes)
            && Objects.equals(this.target, that.target) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            urn,
            updatedAt,
            createdAt,
            expiredAt,
            managementAccountId,
            managementAccountName,
            organizationId,
            notes,
            target,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HandshakeDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
        sb.append("    managementAccountId: ").append(toIndentedString(managementAccountId)).append("\n");
        sb.append("    managementAccountName: ").append(toIndentedString(managementAccountName)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
