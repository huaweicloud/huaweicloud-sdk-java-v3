package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListStorageAssignmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_id")

    private String storageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "claim_mode")

    private String claimMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_claim_id")

    private String storageClaimId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach")

    private String attach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_type")

    private String attachType;

    public ListStorageAssignmentRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的偏移量。
     * minimum: 0
     * maximum: 2147483646
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListStorageAssignmentRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次查询的大小[1-100]。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListStorageAssignmentRequest withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * WKS存储ID。
     * @return storageId
     */
    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public ListStorageAssignmentRequest withClaimMode(String claimMode) {
        this.claimMode = claimMode;
        return this;
    }

    /**
     * 存储声明的类型，claim_mode为share时，storage_claim_id必填。 * `USER` -  用户目录 * `SHARE` - 共享目录
     * @return claimMode
     */
    public String getClaimMode() {
        return claimMode;
    }

    public void setClaimMode(String claimMode) {
        this.claimMode = claimMode;
    }

    public ListStorageAssignmentRequest withStorageClaimId(String storageClaimId) {
        this.storageClaimId = storageClaimId;
        return this;
    }

    /**
     * WKS存储目录声明ID。
     * @return storageClaimId
     */
    public String getStorageClaimId() {
        return storageClaimId;
    }

    public void setStorageClaimId(String storageClaimId) {
        this.storageClaimId = storageClaimId;
    }

    public ListStorageAssignmentRequest withAttach(String attach) {
        this.attach = attach;
        return this;
    }

    /**
     * 成员。
     * @return attach
     */
    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public ListStorageAssignmentRequest withAttachType(String attachType) {
        this.attachType = attachType;
        return this;
    }

    /**
     * 关联对象类型： * `USER` -  用户 * `USER_GROUP` - 用户组
     * @return attachType
     */
    public String getAttachType() {
        return attachType;
    }

    public void setAttachType(String attachType) {
        this.attachType = attachType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStorageAssignmentRequest that = (ListStorageAssignmentRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.storageId, that.storageId) && Objects.equals(this.claimMode, that.claimMode)
            && Objects.equals(this.storageClaimId, that.storageClaimId) && Objects.equals(this.attach, that.attach)
            && Objects.equals(this.attachType, that.attachType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, storageId, claimMode, storageClaimId, attach, attachType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStorageAssignmentRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    storageId: ").append(toIndentedString(storageId)).append("\n");
        sb.append("    claimMode: ").append(toIndentedString(claimMode)).append("\n");
        sb.append("    storageClaimId: ").append(toIndentedString(storageClaimId)).append("\n");
        sb.append("    attach: ").append(toIndentedString(attach)).append("\n");
        sb.append("    attachType: ").append(toIndentedString(attachType)).append("\n");
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
