package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 基于WKS存储创建的，文件夹存储声明
 */
public class PersistentStorageClaim {

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

    public PersistentStorageClaim withStorageClaimId(String storageClaimId) {
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

    public PersistentStorageClaim withFolderPath(String folderPath) {
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

    public PersistentStorageClaim withDelimiter(String delimiter) {
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

    public PersistentStorageClaim withClaimMode(ClaimMode claimMode) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistentStorageClaim that = (PersistentStorageClaim) obj;
        return Objects.equals(this.storageClaimId, that.storageClaimId)
            && Objects.equals(this.folderPath, that.folderPath) && Objects.equals(this.delimiter, that.delimiter)
            && Objects.equals(this.claimMode, that.claimMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageClaimId, folderPath, delimiter, claimMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistentStorageClaim {\n");
        sb.append("    storageClaimId: ").append(toIndentedString(storageClaimId)).append("\n");
        sb.append("    folderPath: ").append(toIndentedString(folderPath)).append("\n");
        sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
        sb.append("    claimMode: ").append(toIndentedString(claimMode)).append("\n");
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
