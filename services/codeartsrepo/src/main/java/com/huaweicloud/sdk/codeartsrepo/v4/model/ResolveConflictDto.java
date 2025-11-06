package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResolveConflictDto
 */
public class ResolveConflictDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_message")

    private String commitMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<ResolveConflictFileDto> files = null;

    public ResolveConflictDto withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * **参数解释：** 提交信息
     * @return commitMessage
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public ResolveConflictDto withFiles(List<ResolveConflictFileDto> files) {
        this.files = files;
        return this;
    }

    public ResolveConflictDto addFilesItem(ResolveConflictFileDto filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public ResolveConflictDto withFiles(Consumer<List<ResolveConflictFileDto>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * **参数解释：** 冲突的文件      
     * @return files
     */
    public List<ResolveConflictFileDto> getFiles() {
        return files;
    }

    public void setFiles(List<ResolveConflictFileDto> files) {
        this.files = files;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResolveConflictDto that = (ResolveConflictDto) obj;
        return Objects.equals(this.commitMessage, that.commitMessage) && Objects.equals(this.files, that.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commitMessage, files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResolveConflictDto {\n");
        sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
