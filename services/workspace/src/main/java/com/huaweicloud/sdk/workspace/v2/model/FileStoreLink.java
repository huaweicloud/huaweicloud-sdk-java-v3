package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 文件存储路径支持OBS或者外部链接，store_type指定实际生效的配置,bucket_store和file_link必须设置其一。
 */
public class FileStoreLink {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_type")

    private FileStoreTypeEnum storeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_store")

    private BucketStore bucketStore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_link")

    private String fileLink;

    public FileStoreLink withStoreType(FileStoreTypeEnum storeType) {
        this.storeType = storeType;
        return this;
    }

    /**
     * Get storeType
     * @return storeType
     */
    public FileStoreTypeEnum getStoreType() {
        return storeType;
    }

    public void setStoreType(FileStoreTypeEnum storeType) {
        this.storeType = storeType;
    }

    public FileStoreLink withBucketStore(BucketStore bucketStore) {
        this.bucketStore = bucketStore;
        return this;
    }

    public FileStoreLink withBucketStore(Consumer<BucketStore> bucketStoreSetter) {
        if (this.bucketStore == null) {
            this.bucketStore = new BucketStore();
            bucketStoreSetter.accept(this.bucketStore);
        }

        return this;
    }

    /**
     * Get bucketStore
     * @return bucketStore
     */
    public BucketStore getBucketStore() {
        return bucketStore;
    }

    public void setBucketStore(BucketStore bucketStore) {
        this.bucketStore = bucketStore;
    }

    public FileStoreLink withFileLink(String fileLink) {
        this.fileLink = fileLink;
        return this;
    }

    /**
     * 文件下载完整路径。
     * @return fileLink
     */
    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileStoreLink that = (FileStoreLink) obj;
        return Objects.equals(this.storeType, that.storeType) && Objects.equals(this.bucketStore, that.bucketStore)
            && Objects.equals(this.fileLink, that.fileLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeType, bucketStore, fileLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileStoreLink {\n");
        sb.append("    storeType: ").append(toIndentedString(storeType)).append("\n");
        sb.append("    bucketStore: ").append(toIndentedString(bucketStore)).append("\n");
        sb.append("    fileLink: ").append(toIndentedString(fileLink)).append("\n");
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
