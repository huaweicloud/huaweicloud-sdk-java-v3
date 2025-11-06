package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepositoryDirDto
 */
public class RepositoryDirDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_message")

    private String commitMessage;

    public RepositoryDirDto withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释：** 目录路径。 **约束限制：** 目录路径层级最大不能超过29。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public RepositoryDirDto withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * **参数解释：** 分支名。 **取值范围：** 最小1个字节，最大200字节 **约束限制：** 该仓库下的已有分支。
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public RepositoryDirDto withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * **参数解释：** 提交信息。 **取值范围：** 不涉及。
     * @return commitMessage
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryDirDto that = (RepositoryDirDto) obj;
        return Objects.equals(this.filePath, that.filePath) && Objects.equals(this.branchName, that.branchName)
            && Objects.equals(this.commitMessage, that.commitMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath, branchName, commitMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryDirDto {\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
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
