package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateFileBodyDto
 */
public class UpdateFileBodyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_message")

    private String commitMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_email")

    private String authorEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding")

    private String encoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_commit_id")

    private String lastCommitId;

    public UpdateFileBodyDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateFileBodyDto withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public UpdateFileBodyDto withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 分支名
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public UpdateFileBodyDto withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * 提交信息
     * @return commitMessage
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public UpdateFileBodyDto withAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
        return this;
    }

    /**
     * 作者邮箱
     * @return authorEmail
     */
    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public UpdateFileBodyDto withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * 作者名称
     * @return authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public UpdateFileBodyDto withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 文件内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UpdateFileBodyDto withEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * 编码方式
     * @return encoding
     */
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public UpdateFileBodyDto withLastCommitId(String lastCommitId) {
        this.lastCommitId = lastCommitId;
        return this;
    }

    /**
     * 最新提交commit
     * @return lastCommitId
     */
    public String getLastCommitId() {
        return lastCommitId;
    }

    public void setLastCommitId(String lastCommitId) {
        this.lastCommitId = lastCommitId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFileBodyDto that = (UpdateFileBodyDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.branch, that.branch) && Objects.equals(this.commitMessage, that.commitMessage)
            && Objects.equals(this.authorEmail, that.authorEmail) && Objects.equals(this.authorName, that.authorName)
            && Objects.equals(this.content, that.content) && Objects.equals(this.encoding, that.encoding)
            && Objects.equals(this.lastCommitId, that.lastCommitId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, filePath, branch, commitMessage, authorEmail, authorName, content, encoding, lastCommitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFileBodyDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
        sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
        sb.append("    lastCommitId: ").append(toIndentedString(lastCommitId)).append("\n");
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
