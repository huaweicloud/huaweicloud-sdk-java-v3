package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CommitAction
 */
public class CommitAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_path")

    private String previousPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding")

    private String encoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_commit_id")

    private String lastCommitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_filemode")

    private Boolean executeFilemode;

    public CommitAction withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 要执行的操作：create、delete、move、update、chmod
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CommitAction withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件的完整路径。例如lib/class.rb
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public CommitAction withPreviousPath(String previousPath) {
        this.previousPath = previousPath;
        return this;
    }

    /**
     * 要移动的文件的原始完整路径。例如lib/class1.rb。仅在move操作时生效
     * @return previousPath
     */
    public String getPreviousPath() {
        return previousPath;
    }

    public void setPreviousPath(String previousPath) {
        this.previousPath = previousPath;
    }

    public CommitAction withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 文件内容，create和update操作时必须。未指定内容的移动操作将保留现有文件内容，内容的任何其他值将覆盖文件内容。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CommitAction withEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * 文件编码：text、base64。默认为text
     * @return encoding
     */
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public CommitAction withLastCommitId(String lastCommitId) {
        this.lastCommitId = lastCommitId;
        return this;
    }

    /**
     * 最后一个已知的提交ID。仅在update、move、delete操作时生效
     * @return lastCommitId
     */
    public String getLastCommitId() {
        return lastCommitId;
    }

    public void setLastCommitId(String lastCommitId) {
        this.lastCommitId = lastCommitId;
    }

    public CommitAction withExecuteFilemode(Boolean executeFilemode) {
        this.executeFilemode = executeFilemode;
        return this;
    }

    /**
     * 启用或者禁用文件的执行模式。仅在chmod操作时生效
     * @return executeFilemode
     */
    public Boolean getExecuteFilemode() {
        return executeFilemode;
    }

    public void setExecuteFilemode(Boolean executeFilemode) {
        this.executeFilemode = executeFilemode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommitAction commitAction = (CommitAction) o;
        return Objects.equals(this.action, commitAction.action) && Objects.equals(this.filePath, commitAction.filePath)
            && Objects.equals(this.previousPath, commitAction.previousPath)
            && Objects.equals(this.content, commitAction.content)
            && Objects.equals(this.encoding, commitAction.encoding)
            && Objects.equals(this.lastCommitId, commitAction.lastCommitId)
            && Objects.equals(this.executeFilemode, commitAction.executeFilemode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, filePath, previousPath, content, encoding, lastCommitId, executeFilemode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitAction {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    previousPath: ").append(toIndentedString(previousPath)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
        sb.append("    lastCommitId: ").append(toIndentedString(lastCommitId)).append("\n");
        sb.append("    executeFilemode: ").append(toIndentedString(executeFilemode)).append("\n");
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
