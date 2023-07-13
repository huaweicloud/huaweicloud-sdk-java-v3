package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Bucket
 */
public class Bucket {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_location")

    private String bucketLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_policy")

    private String bucketPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private Boolean deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_deleted")

    private Boolean isDeleted;

    public Bucket withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 资产名称
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public Bucket withBucketLocation(String bucketLocation) {
        this.bucketLocation = bucketLocation;
        return this;
    }

    /**
     * 桶位置
     * @return bucketLocation
     */
    public String getBucketLocation() {
        return bucketLocation;
    }

    public void setBucketLocation(String bucketLocation) {
        this.bucketLocation = bucketLocation;
    }

    public Bucket withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 桶名称
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public Bucket withBucketPolicy(String bucketPolicy) {
        this.bucketPolicy = bucketPolicy;
        return this;
    }

    /**
     * 桶策略
     * @return bucketPolicy
     */
    public String getBucketPolicy() {
        return bucketPolicy;
    }

    public void setBucketPolicy(String bucketPolicy) {
        this.bucketPolicy = bucketPolicy;
    }

    public Bucket withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Bucket withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * 是否被删除
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Bucket withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 桶ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Bucket withIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * 是否被删除
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bucket that = (Bucket) obj;
        return Objects.equals(this.assetName, that.assetName)
            && Objects.equals(this.bucketLocation, that.bucketLocation)
            && Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.bucketPolicy, that.bucketPolicy)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.deleted, that.deleted)
            && Objects.equals(this.id, that.id) && Objects.equals(this.isDeleted, that.isDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetName, bucketLocation, bucketName, bucketPolicy, createTime, deleted, id, isDeleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Bucket {\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    bucketLocation: ").append(toIndentedString(bucketLocation)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    bucketPolicy: ").append(toIndentedString(bucketPolicy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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
