package com.huaweicloud.sdk.workspaceapp.v1.model;

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
public class ListFoldersAndFilesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<FileInfo> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folders")

    private List<FolderInfo> folders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_keys")

    private Integer maxKeys;

    public ListFoldersAndFilesResponse withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 文件系统所在区域代号。
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ListFoldersAndFilesResponse withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 文件名的绝对路径的前缀。
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public ListFoldersAndFilesResponse withFiles(List<FileInfo> files) {
        this.files = files;
        return this;
    }

    public ListFoldersAndFilesResponse addFilesItem(FileInfo filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public ListFoldersAndFilesResponse withFiles(Consumer<List<FileInfo>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 文件信息列表。
     * @return files
     */
    public List<FileInfo> getFiles() {
        return files;
    }

    public void setFiles(List<FileInfo> files) {
        this.files = files;
    }

    public ListFoldersAndFilesResponse withFolders(List<FolderInfo> folders) {
        this.folders = folders;
        return this;
    }

    public ListFoldersAndFilesResponse addFoldersItem(FolderInfo foldersItem) {
        if (this.folders == null) {
            this.folders = new ArrayList<>();
        }
        this.folders.add(foldersItem);
        return this;
    }

    public ListFoldersAndFilesResponse withFolders(Consumer<List<FolderInfo>> foldersSetter) {
        if (this.folders == null) {
            this.folders = new ArrayList<>();
        }
        foldersSetter.accept(this.folders);
        return this;
    }

    /**
     * 文件夹信息列表。
     * @return folders
     */
    public List<FolderInfo> getFolders() {
        return folders;
    }

    public void setFolders(List<FolderInfo> folders) {
        this.folders = folders;
    }

    public ListFoldersAndFilesResponse withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 本次列举的文件的起始位置，默认为空。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListFoldersAndFilesResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下次列举请求的的起始位置，默认为空。
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ListFoldersAndFilesResponse withMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    /**
     * 本次列举可以返回的最大文件数量，非本次列举返回的数量，取入参与系统默认值的小值为准。
     * @return maxKeys
     */
    public Integer getMaxKeys() {
        return maxKeys;
    }

    public void setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFoldersAndFilesResponse that = (ListFoldersAndFilesResponse) obj;
        return Objects.equals(this.location, that.location) && Objects.equals(this.prefix, that.prefix)
            && Objects.equals(this.files, that.files) && Objects.equals(this.folders, that.folders)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.nextMarker, that.nextMarker)
            && Objects.equals(this.maxKeys, that.maxKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, prefix, files, folders, marker, nextMarker, maxKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFoldersAndFilesResponse {\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    maxKeys: ").append(toIndentedString(maxKeys)).append("\n");
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
