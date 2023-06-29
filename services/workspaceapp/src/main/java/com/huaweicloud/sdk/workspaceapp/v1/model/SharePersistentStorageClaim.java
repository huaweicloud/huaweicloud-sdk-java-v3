package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 基于WKS存储创建的，文件夹存储声明
 */
public class SharePersistentStorageClaim {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_claim_id")

    private String storageClaimId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_path")

    private String folderPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delimiter")

    private String delimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "claim_mode")

    private ClaimMode claimMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Map<String, Integer> count = null;

    public SharePersistentStorageClaim withStorageClaimId(String storageClaimId) {
        this.storageClaimId = storageClaimId;
        return this;
    }

    /**
     * WKS存储目录声明ID
     * @return storageClaimId
     */
    public String getStorageClaimId() {
        return storageClaimId;
    }

    public void setStorageClaimId(String storageClaimId) {
        this.storageClaimId = storageClaimId;
    }

    public SharePersistentStorageClaim withFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * 存储对象路径 注: path是对象在系统中的完整路径 例如系统中存在如下目录结构的数据. SFS-Tmp: └─shares   ├─image   └─video image的路径: shares/image/ video的路径: shares/video/
     * @return folderPath
     */
    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public SharePersistentStorageClaim withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * 路径分隔符
     * @return delimiter
     */
    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public SharePersistentStorageClaim withClaimMode(ClaimMode claimMode) {
        this.claimMode = claimMode;
        return this;
    }

    /**
     * Get claimMode
     * @return claimMode
     */
    public ClaimMode getClaimMode() {
        return claimMode;
    }

    public void setClaimMode(ClaimMode claimMode) {
        this.claimMode = claimMode;
    }

    public SharePersistentStorageClaim withCount(Map<String, Integer> count) {
        this.count = count;
        return this;
    }

    public SharePersistentStorageClaim putCountItem(String key, Integer countItem) {
        if (this.count == null) {
            this.count = new HashMap<>();
        }
        this.count.put(key, countItem);
        return this;
    }

    public SharePersistentStorageClaim withCount(Consumer<Map<String, Integer>> countSetter) {
        if (this.count == null) {
            this.count = new HashMap<>();
        }
        countSetter.accept(this.count);
        return this;
    }

    /**
     * 共享目录的关联用户、用户组数量
     * @return count
     */
    public Map<String, Integer> getCount() {
        return count;
    }

    public void setCount(Map<String, Integer> count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SharePersistentStorageClaim that = (SharePersistentStorageClaim) obj;
        return Objects.equals(this.storageClaimId, that.storageClaimId)
            && Objects.equals(this.folderPath, that.folderPath) && Objects.equals(this.delimiter, that.delimiter)
            && Objects.equals(this.claimMode, that.claimMode) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageClaimId, folderPath, delimiter, claimMode, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SharePersistentStorageClaim {\n");
        sb.append("    storageClaimId: ").append(toIndentedString(storageClaimId)).append("\n");
        sb.append("    folderPath: ").append(toIndentedString(folderPath)).append("\n");
        sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
        sb.append("    claimMode: ").append(toIndentedString(claimMode)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
