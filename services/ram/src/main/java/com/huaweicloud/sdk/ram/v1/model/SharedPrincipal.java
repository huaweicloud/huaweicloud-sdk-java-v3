package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 描述资源共享管理的角色
 */
public class SharedPrincipal {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_id")

    private String resourceShareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public SharedPrincipal withResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }

    /**
     * 资源使用者绑定的资源共享实例的ID。
     * @return resourceShareId
     */
    public String getResourceShareId() {
        return resourceShareId;
    }

    public void setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
    }

    public SharedPrincipal withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源使用者的帐号ID或URN。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SharedPrincipal withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 资源使用者与资源共享实例关联的时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public SharedPrincipal withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 最后一次更新资源共享实例的时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SharedPrincipal sharedPrincipal = (SharedPrincipal) o;
        return Objects.equals(this.resourceShareId, sharedPrincipal.resourceShareId)
            && Objects.equals(this.id, sharedPrincipal.id) && Objects.equals(this.createdAt, sharedPrincipal.createdAt)
            && Objects.equals(this.updatedAt, sharedPrincipal.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceShareId, id, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SharedPrincipal {\n");
        sb.append("    resourceShareId: ").append(toIndentedString(resourceShareId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
