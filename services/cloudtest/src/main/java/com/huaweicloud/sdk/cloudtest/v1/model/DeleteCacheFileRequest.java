package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteCacheFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_uri")

    private String parentUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bak_up")

    private Boolean bakUp;

    public DeleteCacheFileRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，固定长度32位字符（字母和数字）。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DeleteCacheFileRequest withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 删除附件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public DeleteCacheFileRequest withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 附件Uri
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public DeleteCacheFileRequest withParentUri(String parentUri) {
        this.parentUri = parentUri;
        return this;
    }

    /**
     * 附件挂载资源Uri
     * @return parentUri
     */
    public String getParentUri() {
        return parentUri;
    }

    public void setParentUri(String parentUri) {
        this.parentUri = parentUri;
    }

    public DeleteCacheFileRequest withBakUp(Boolean bakUp) {
        this.bakUp = bakUp;
        return this;
    }

    /**
     * 是否备份
     * @return bakUp
     */
    public Boolean getBakUp() {
        return bakUp;
    }

    public void setBakUp(Boolean bakUp) {
        this.bakUp = bakUp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCacheFileRequest that = (DeleteCacheFileRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.uri, that.uri) && Objects.equals(this.parentUri, that.parentUri)
            && Objects.equals(this.bakUp, that.bakUp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, filePath, uri, parentUri, bakUp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCacheFileRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    parentUri: ").append(toIndentedString(parentUri)).append("\n");
        sb.append("    bakUp: ").append(toIndentedString(bakUp)).append("\n");
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
