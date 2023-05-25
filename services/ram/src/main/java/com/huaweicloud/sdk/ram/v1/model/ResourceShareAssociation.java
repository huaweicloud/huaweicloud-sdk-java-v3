package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 与资源共享实例关联的资源使用者或共享资源的详细信息。
 */
public class ResourceShareAssociation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_entity")

    private String associatedEntity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_type")

    private String associationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external")

    private Boolean external;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_id")

    private String resourceShareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_name")

    private String resourceShareName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ResourceShareAssociation withAssociatedEntity(String associatedEntity) {
        this.associatedEntity = associatedEntity;
        return this;
    }

    /**
     * 绑定的实体。这可以是共享资源的URN、帐号ID、共享资源目录的URN或文件夹的URN之一。
     * @return associatedEntity
     */
    public String getAssociatedEntity() {
        return associatedEntity;
    }

    public void setAssociatedEntity(String associatedEntity) {
        this.associatedEntity = associatedEntity;
    }

    public ResourceShareAssociation withAssociationType(String associationType) {
        this.associationType = associationType;
        return this;
    }

    /**
     * 绑定中包含的实体类型。
     * @return associationType
     */
    public String getAssociationType() {
        return associationType;
    }

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    public ResourceShareAssociation withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 绑定被创建的时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ResourceShareAssociation withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 最后一次更新绑定的时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ResourceShareAssociation withExternal(Boolean external) {
        this.external = external;
        return this;
    }

    /**
     * 标识资源使用者是否和共享的拥有者属于同一个组织
     * @return external
     */
    public Boolean getExternal() {
        return external;
    }

    public void setExternal(Boolean external) {
        this.external = external;
    }

    public ResourceShareAssociation withResourceShareId(String resourceShareId) {
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

    public ResourceShareAssociation withResourceShareName(String resourceShareName) {
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

    public ResourceShareAssociation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 绑定的当前状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceShareAssociation resourceShareAssociation = (ResourceShareAssociation) o;
        return Objects.equals(this.associatedEntity, resourceShareAssociation.associatedEntity)
            && Objects.equals(this.associationType, resourceShareAssociation.associationType)
            && Objects.equals(this.createdAt, resourceShareAssociation.createdAt)
            && Objects.equals(this.updatedAt, resourceShareAssociation.updatedAt)
            && Objects.equals(this.external, resourceShareAssociation.external)
            && Objects.equals(this.resourceShareId, resourceShareAssociation.resourceShareId)
            && Objects.equals(this.resourceShareName, resourceShareAssociation.resourceShareName)
            && Objects.equals(this.status, resourceShareAssociation.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(associatedEntity,
            associationType,
            createdAt,
            updatedAt,
            external,
            resourceShareId,
            resourceShareName,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceShareAssociation {\n");
        sb.append("    associatedEntity: ").append(toIndentedString(associatedEntity)).append("\n");
        sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    external: ").append(toIndentedString(external)).append("\n");
        sb.append("    resourceShareId: ").append(toIndentedString(resourceShareId)).append("\n");
        sb.append("    resourceShareName: ").append(toIndentedString(resourceShareName)).append("\n");
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
