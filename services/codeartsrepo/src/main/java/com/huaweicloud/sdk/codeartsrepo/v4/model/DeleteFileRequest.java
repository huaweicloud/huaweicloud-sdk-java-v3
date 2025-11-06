package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_message")

    private String commitMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_email")

    private String authorEmail;

    public DeleteFileRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public DeleteFileRequest withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释：** 文件路径。 **取值范围：** 字符串长度不少于1，不超过10000。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public DeleteFileRequest withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * **参数解释：** 作者名称
     * @return authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public DeleteFileRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * **参数解释：** 分支名称。 **取值范围：** 字符串长度不少于1，不超过2000。
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public DeleteFileRequest withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * **参数解释：** 删除描述。 **取值范围：** 字符串长度不少于1，不超过2000。
     * @return commitMessage
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public DeleteFileRequest withAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
        return this;
    }

    /**
     * **参数解释：** 作者邮箱。 **取值范围：** 字符串长度不少于1，不超过2000。
     * @return authorEmail
     */
    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteFileRequest that = (DeleteFileRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.authorName, that.authorName) && Objects.equals(this.branch, that.branch)
            && Objects.equals(this.commitMessage, that.commitMessage)
            && Objects.equals(this.authorEmail, that.authorEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, filePath, authorName, branch, commitMessage, authorEmail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteFileRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
        sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
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
