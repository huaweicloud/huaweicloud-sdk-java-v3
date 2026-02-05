package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文件夹重定向配置。
 */
public class FolderRedirectionOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_path")

    private String relativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_paths")

    private String storagePaths;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_common_folders")

    private Integer includeCommonFolders;

    public FolderRedirectionOptions withRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    /**
     * 目标文件夹位置。
     * @return relativePath
     */
    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public FolderRedirectionOptions withStoragePaths(String storagePaths) {
        this.storagePaths = storagePaths;
        return this;
    }

    /**
     * 用户存储路径。
     * @return storagePaths
     */
    public String getStoragePaths() {
        return storagePaths;
    }

    public void setStoragePaths(String storagePaths) {
        this.storagePaths = storagePaths;
    }

    public FolderRedirectionOptions withIncludeCommonFolders(Integer includeCommonFolders) {
        this.includeCommonFolders = includeCommonFolders;
        return this;
    }

    /**
     * 文件夹选项。
     * minimum: 0
     * maximum: 8191
     * @return includeCommonFolders
     */
    public Integer getIncludeCommonFolders() {
        return includeCommonFolders;
    }

    public void setIncludeCommonFolders(Integer includeCommonFolders) {
        this.includeCommonFolders = includeCommonFolders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FolderRedirectionOptions that = (FolderRedirectionOptions) obj;
        return Objects.equals(this.relativePath, that.relativePath)
            && Objects.equals(this.storagePaths, that.storagePaths)
            && Objects.equals(this.includeCommonFolders, that.includeCommonFolders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relativePath, storagePaths, includeCommonFolders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FolderRedirectionOptions {\n");
        sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
        sb.append("    storagePaths: ").append(toIndentedString(storagePaths)).append("\n");
        sb.append("    includeCommonFolders: ").append(toIndentedString(includeCommonFolders)).append("\n");
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
