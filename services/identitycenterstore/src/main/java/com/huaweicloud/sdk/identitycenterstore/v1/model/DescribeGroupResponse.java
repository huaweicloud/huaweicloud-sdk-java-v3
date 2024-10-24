package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DescribeGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_id")

    private String externalId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_ids")

    private List<ExternalIdDto> externalIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_id")

    private String identityStoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private Long updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_by")

    private String updatedBy;

    public DescribeGroupResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 包含组描述的字符串
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DescribeGroupResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 包含组显示名称的字符串
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public DescribeGroupResponse withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * 外部身份源分配给此资源的标识符
     * @return externalId
     */
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public DescribeGroupResponse withExternalIds(List<ExternalIdDto> externalIds) {
        this.externalIds = externalIds;
        return this;
    }

    public DescribeGroupResponse addExternalIdsItem(ExternalIdDto externalIdsItem) {
        if (this.externalIds == null) {
            this.externalIds = new ArrayList<>();
        }
        this.externalIds.add(externalIdsItem);
        return this;
    }

    public DescribeGroupResponse withExternalIds(Consumer<List<ExternalIdDto>> externalIdsSetter) {
        if (this.externalIds == null) {
            this.externalIds = new ArrayList<>();
        }
        externalIdsSetter.accept(this.externalIds);
        return this;
    }

    /**
     * 包含外部身份提供商颁发给此资源的标识符的对象列表
     * @return externalIds
     */
    public List<ExternalIdDto> getExternalIds() {
        return externalIds;
    }

    public void setExternalIds(List<ExternalIdDto> externalIds) {
        this.externalIds = externalIds;
    }

    public DescribeGroupResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 身份源中IAM身份中心用户组的全局唯一标识符（ID）
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public DescribeGroupResponse withIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
        return this;
    }

    /**
     * 身份源的全局唯一标识符（ID）
     * @return identityStoreId
     */
    public String getIdentityStoreId() {
        return identityStoreId;
    }

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    public DescribeGroupResponse withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时的时间戳
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public DescribeGroupResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建者
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public DescribeGroupResponse withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时的时间戳
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DescribeGroupResponse withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * 更新者
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DescribeGroupResponse that = (DescribeGroupResponse) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.externalId, that.externalId) && Objects.equals(this.externalIds, that.externalIds)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.identityStoreId, that.identityStoreId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.updatedBy, that.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            displayName,
            externalId,
            externalIds,
            groupId,
            identityStoreId,
            createdAt,
            createdBy,
            updatedAt,
            updatedBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DescribeGroupResponse {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    identityStoreId: ").append(toIndentedString(identityStoreId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
