package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTestVersionCaseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_uri")

    private String caseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskUri")

    private String taskUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh")

    private Boolean refresh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_recycle")

    private Boolean isRecycle;

    public ShowTestVersionCaseRequest withCaseUri(String caseUri) {
        this.caseUri = caseUri;
        return this;
    }

    /**
     * 用例id
     * @return caseUri
     */
    public String getCaseUri() {
        return caseUri;
    }

    public void setCaseUri(String caseUri) {
        this.caseUri = caseUri;
    }

    public ShowTestVersionCaseRequest withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 分支uri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public ShowTestVersionCaseRequest withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public ShowTestVersionCaseRequest withTaskUri(String taskUri) {
        this.taskUri = taskUri;
        return this;
    }

    /**
     * 任务
     * @return taskUri
     */
    public String getTaskUri() {
        return taskUri;
    }

    public void setTaskUri(String taskUri) {
        this.taskUri = taskUri;
    }

    public ShowTestVersionCaseRequest withRefresh(Boolean refresh) {
        this.refresh = refresh;
        return this;
    }

    /**
     * 是否刷新缓存
     * @return refresh
     */
    public Boolean getRefresh() {
        return refresh;
    }

    public void setRefresh(Boolean refresh) {
        this.refresh = refresh;
    }

    public ShowTestVersionCaseRequest withIsRecycle(Boolean isRecycle) {
        this.isRecycle = isRecycle;
        return this;
    }

    /**
     * 是否回收站资源
     * @return isRecycle
     */
    public Boolean getIsRecycle() {
        return isRecycle;
    }

    public void setIsRecycle(Boolean isRecycle) {
        this.isRecycle = isRecycle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTestVersionCaseRequest that = (ShowTestVersionCaseRequest) obj;
        return Objects.equals(this.caseUri, that.caseUri) && Objects.equals(this.versionUri, that.versionUri)
            && Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.taskUri, that.taskUri)
            && Objects.equals(this.refresh, that.refresh) && Objects.equals(this.isRecycle, that.isRecycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseUri, versionUri, projectUuid, taskUri, refresh, isRecycle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTestVersionCaseRequest {\n");
        sb.append("    caseUri: ").append(toIndentedString(caseUri)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    taskUri: ").append(toIndentedString(taskUri)).append("\n");
        sb.append("    refresh: ").append(toIndentedString(refresh)).append("\n");
        sb.append("    isRecycle: ").append(toIndentedString(isRecycle)).append("\n");
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
