package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListFoldersAndFilesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_storage_assignment_id")

    private String cloudStorageAssignmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_url")

    private String folderUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListFoldersAndFilesRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListFoldersAndFilesRequest withCloudStorageAssignmentId(String cloudStorageAssignmentId) {
        this.cloudStorageAssignmentId = cloudStorageAssignmentId;
        return this;
    }

    /**
     * 个人文件夹ID。(用户拥有多个文件夹时，如果不传个人文件夹id则选择最早创建的文件系统进行文件查询)
     * @return cloudStorageAssignmentId
     */
    public String getCloudStorageAssignmentId() {
        return cloudStorageAssignmentId;
    }

    public void setCloudStorageAssignmentId(String cloudStorageAssignmentId) {
        this.cloudStorageAssignmentId = cloudStorageAssignmentId;
    }

    public ListFoldersAndFilesRequest withFolderUrl(String folderUrl) {
        this.folderUrl = folderUrl;
        return this;
    }

    /**
     * 查询文件夹路径
     * @return folderUrl
     */
    public String getFolderUrl() {
        return folderUrl;
    }

    public void setFolderUrl(String folderUrl) {
        this.folderUrl = folderUrl;
    }

    public ListFoldersAndFilesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 指定一个标识符，从该标识符以后按文件名的字典顺序返回文件列表。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListFoldersAndFilesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 列举文件系统的最大数目，返回的文件系统列表将是按照字典顺序的最多前 limit 个，默认取值为1000。
     * minimum: 0
     * maximum: 1000000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFoldersAndFilesRequest that = (ListFoldersAndFilesRequest) obj;
        return Objects.equals(this.userName, that.userName)
            && Objects.equals(this.cloudStorageAssignmentId, that.cloudStorageAssignmentId)
            && Objects.equals(this.folderUrl, that.folderUrl) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, cloudStorageAssignmentId, folderUrl, marker, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFoldersAndFilesRequest {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    cloudStorageAssignmentId: ").append(toIndentedString(cloudStorageAssignmentId)).append("\n");
        sb.append("    folderUrl: ").append(toIndentedString(folderUrl)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
