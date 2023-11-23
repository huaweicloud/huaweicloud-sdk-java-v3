package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 存储库信息
 */
public class RepoInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_url")

    private String httpsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_status")

    private String repoStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public RepoInfo withHttpsUrl(String httpsUrl) {
        this.httpsUrl = httpsUrl;
        return this;
    }

    /**
     * http地址
     * @return httpsUrl
     */
    public String getHttpsUrl() {
        return httpsUrl;
    }

    public void setHttpsUrl(String httpsUrl) {
        this.httpsUrl = httpsUrl;
    }

    public RepoInfo withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 存储库链接
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public RepoInfo withRepoStatus(String repoStatus) {
        this.repoStatus = repoStatus;
        return this;
    }

    /**
     * 存储库状态
     * @return repoStatus
     */
    public String getRepoStatus() {
        return repoStatus;
    }

    public void setRepoStatus(String repoStatus) {
        this.repoStatus = repoStatus;
    }

    public RepoInfo withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 报错信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public RepoInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepoInfo that = (RepoInfo) obj;
        return Objects.equals(this.httpsUrl, that.httpsUrl) && Objects.equals(this.webUrl, that.webUrl)
            && Objects.equals(this.repoStatus, that.repoStatus) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpsUrl, webUrl, repoStatus, errorMsg, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoInfo {\n");
        sb.append("    httpsUrl: ").append(toIndentedString(httpsUrl)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    repoStatus: ").append(toIndentedString(repoStatus)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
