package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SubmoduleReqDto
 */
public class SubmoduleReqDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subrepo_id")

    private String subrepoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_message")

    private String commitMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subrepo_branch")

    private String subrepoBranch;

    public SubmoduleReqDto withBranchName(String branchName) {
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

    public SubmoduleReqDto withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 子模块在该仓库下的文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public SubmoduleReqDto withSubrepoId(String subrepoId) {
        this.subrepoId = subrepoId;
        return this;
    }

    /**
     * 子模块所在仓库的仓库ID
     * @return subrepoId
     */
    public String getSubrepoId() {
        return subrepoId;
    }

    public void setSubrepoId(String subrepoId) {
        this.subrepoId = subrepoId;
    }

    public SubmoduleReqDto withCommitMessage(String commitMessage) {
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

    public SubmoduleReqDto withSubrepoBranch(String subrepoBranch) {
        this.subrepoBranch = subrepoBranch;
        return this;
    }

    /**
     * **参数解释：** 子模块分支名。 **取值范围：** 最小1个字节，最大200字节 **约束限制：** 目标仓库下的已有分支。
     * @return subrepoBranch
     */
    public String getSubrepoBranch() {
        return subrepoBranch;
    }

    public void setSubrepoBranch(String subrepoBranch) {
        this.subrepoBranch = subrepoBranch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubmoduleReqDto that = (SubmoduleReqDto) obj;
        return Objects.equals(this.branchName, that.branchName) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.subrepoId, that.subrepoId) && Objects.equals(this.commitMessage, that.commitMessage)
            && Objects.equals(this.subrepoBranch, that.subrepoBranch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchName, filePath, subrepoId, commitMessage, subrepoBranch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubmoduleReqDto {\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    subrepoId: ").append(toIndentedString(subrepoId)).append("\n");
        sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
        sb.append("    subrepoBranch: ").append(toIndentedString(subrepoBranch)).append("\n");
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
