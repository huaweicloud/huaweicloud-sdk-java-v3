package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WKS存储
 */
public class PersistentStorage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_metadata")

    private StorageMetadata storageMetadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_claim_count")

    private Integer userClaimCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_claim_count")

    private Integer shareClaimCount;

    public PersistentStorage withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * WKS存储ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PersistentStorage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersistentStorage withStorageMetadata(StorageMetadata storageMetadata) {
        this.storageMetadata = storageMetadata;
        return this;
    }

    public PersistentStorage withStorageMetadata(Consumer<StorageMetadata> storageMetadataSetter) {
        if (this.storageMetadata == null) {
            this.storageMetadata = new StorageMetadata();
            storageMetadataSetter.accept(this.storageMetadata);
        }

        return this;
    }

    /**
     * Get storageMetadata
     * @return storageMetadata
     */
    public StorageMetadata getStorageMetadata() {
        return storageMetadata;
    }

    public void setStorageMetadata(StorageMetadata storageMetadata) {
        this.storageMetadata = storageMetadata;
    }

    public PersistentStorage withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public PersistentStorage withUserClaimCount(Integer userClaimCount) {
        this.userClaimCount = userClaimCount;
        return this;
    }

    /**
     * 个人目录声明数量
     * @return userClaimCount
     */
    public Integer getUserClaimCount() {
        return userClaimCount;
    }

    public void setUserClaimCount(Integer userClaimCount) {
        this.userClaimCount = userClaimCount;
    }

    public PersistentStorage withShareClaimCount(Integer shareClaimCount) {
        this.shareClaimCount = shareClaimCount;
        return this;
    }

    /**
     * 共享目录声明数量
     * @return shareClaimCount
     */
    public Integer getShareClaimCount() {
        return shareClaimCount;
    }

    public void setShareClaimCount(Integer shareClaimCount) {
        this.shareClaimCount = shareClaimCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistentStorage that = (PersistentStorage) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.storageMetadata, that.storageMetadata)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.userClaimCount, that.userClaimCount)
            && Objects.equals(this.shareClaimCount, that.shareClaimCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, storageMetadata, createTime, userClaimCount, shareClaimCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistentStorage {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    storageMetadata: ").append(toIndentedString(storageMetadata)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    userClaimCount: ").append(toIndentedString(userClaimCount)).append("\n");
        sb.append("    shareClaimCount: ").append(toIndentedString(shareClaimCount)).append("\n");
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
