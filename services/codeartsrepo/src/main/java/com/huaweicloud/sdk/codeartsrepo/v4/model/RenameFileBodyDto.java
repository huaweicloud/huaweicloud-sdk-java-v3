package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RenameFileBodyDto
 */
public class RenameFileBodyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_message")

    private String commitMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_branch")

    private String startBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_email")

    private String authorEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_path")

    private String previousPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infer_content")

    private Boolean inferContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding")

    private String encoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_commit_id")

    private String lastCommitId;

    public RenameFileBodyDto withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释：** 文件路径 **取值范围：** 不涉及。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public RenameFileBodyDto withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * **参数解释：** 分支名 **取值范围：** 不涉及。
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public RenameFileBodyDto withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * **参数解释：** 提交信息 **取值范围：** 不涉及。
     * @return commitMessage
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public RenameFileBodyDto withStartBranch(String startBranch) {
        this.startBranch = startBranch;
        return this;
    }

    /**
     * **参数解释：** 基于分支名（即基于某分支，向其他分支进行推送） **取值范围：** 不涉及。
     * @return startBranch
     */
    public String getStartBranch() {
        return startBranch;
    }

    public void setStartBranch(String startBranch) {
        this.startBranch = startBranch;
    }

    public RenameFileBodyDto withAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
        return this;
    }

    /**
     * **参数解释：** 作者邮箱 **取值范围：** 不涉及。
     * @return authorEmail
     */
    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public RenameFileBodyDto withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * **参数解释：** 作者名称 **取值范围：** 不涉及。
     * @return authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public RenameFileBodyDto withPreviousPath(String previousPath) {
        this.previousPath = previousPath;
        return this;
    }

    /**
     * **参数解释：** 改名前地址 **取值范围：** 不涉及。
     * @return previousPath
     */
    public String getPreviousPath() {
        return previousPath;
    }

    public void setPreviousPath(String previousPath) {
        this.previousPath = previousPath;
    }

    public RenameFileBodyDto withInferContent(Boolean inferContent) {
        this.inferContent = inferContent;
        return this;
    }

    /**
     * **参数解释：** 是否迁移内容（与content字段不能同时为空） **取值范围：** 不涉及。
     * @return inferContent
     */
    public Boolean getInferContent() {
        return inferContent;
    }

    public void setInferContent(Boolean inferContent) {
        this.inferContent = inferContent;
    }

    public RenameFileBodyDto withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释：** 文件内容（与infer_content字段不能同时为空） **取值范围：** 不涉及。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public RenameFileBodyDto withEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * **参数解释：** 编码方式。 **取值范围：** - text。 - base64.
     * @return encoding
     */
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public RenameFileBodyDto withLastCommitId(String lastCommitId) {
        this.lastCommitId = lastCommitId;
        return this;
    }

    /**
     * **参数解释：** 上次已知的文件提交ID。 **取值范围：** 不涉及。
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
        RenameFileBodyDto that = (RenameFileBodyDto) obj;
        return Objects.equals(this.filePath, that.filePath) && Objects.equals(this.branchName, that.branchName)
            && Objects.equals(this.commitMessage, that.commitMessage)
            && Objects.equals(this.startBranch, that.startBranch) && Objects.equals(this.authorEmail, that.authorEmail)
            && Objects.equals(this.authorName, that.authorName) && Objects.equals(this.previousPath, that.previousPath)
            && Objects.equals(this.inferContent, that.inferContent) && Objects.equals(this.content, that.content)
            && Objects.equals(this.encoding, that.encoding) && Objects.equals(this.lastCommitId, that.lastCommitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath,
            branchName,
            commitMessage,
            startBranch,
            authorEmail,
            authorName,
            previousPath,
            inferContent,
            content,
            encoding,
            lastCommitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenameFileBodyDto {\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
        sb.append("    startBranch: ").append(toIndentedString(startBranch)).append("\n");
        sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    previousPath: ").append(toIndentedString(previousPath)).append("\n");
        sb.append("    inferContent: ").append(toIndentedString(inferContent)).append("\n");
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
