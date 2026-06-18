package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRepoStatisticsSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_name")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_count")

    private Integer commitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_size")

    private String repoSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_commit_time")

    private String lastCommitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_lines")

    private Integer codeLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_count")

    private Integer branchCount;

    public ShowRepoStatisticsSummaryResponse withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * **参数解释：** 仓库名称。 **取值范围：** 最小1个字节，最大200字节 **默认取值：** 不涉及。
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public ShowRepoStatisticsSummaryResponse withCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
        return this;
    }

    /**
     * **参数解释：** 默认分支的提交数量。 **取值范围：** 最小0 **默认取值：** 0
     * minimum: 0
     * maximum: 2147483647
     * @return commitCount
     */
    public Integer getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
    }

    public ShowRepoStatisticsSummaryResponse withRepoSize(String repoSize) {
        this.repoSize = repoSize;
        return this;
    }

    /**
     * **参数解释：** 仓库占用磁盘空间大小。 **取值范围：** 最小0 **默认取值：** 0
     * @return repoSize
     */
    public String getRepoSize() {
        return repoSize;
    }

    public void setRepoSize(String repoSize) {
        this.repoSize = repoSize;
    }

    public ShowRepoStatisticsSummaryResponse withLastCommitTime(String lastCommitTime) {
        this.lastCommitTime = lastCommitTime;
        return this;
    }

    /**
     * **参数解释：** 仓库最新的提交日期，格式yyyy-MM-dd'T'HH:mm:ssXXX,例：2025-10-30T08:27:43.000Z **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return lastCommitTime
     */
    public String getLastCommitTime() {
        return lastCommitTime;
    }

    public void setLastCommitTime(String lastCommitTime) {
        this.lastCommitTime = lastCommitTime;
    }

    public ShowRepoStatisticsSummaryResponse withCodeLines(Integer codeLines) {
        this.codeLines = codeLines;
        return this;
    }

    /**
     * **参数解释：** 默认分支的代码行数。 **取值范围：** 最小0 **默认取值：** 0。
     * minimum: 0
     * maximum: 2147483647
     * @return codeLines
     */
    public Integer getCodeLines() {
        return codeLines;
    }

    public void setCodeLines(Integer codeLines) {
        this.codeLines = codeLines;
    }

    public ShowRepoStatisticsSummaryResponse withBranchCount(Integer branchCount) {
        this.branchCount = branchCount;
        return this;
    }

    /**
     * **参数解释：** 仓库分支数量 **取值范围：** 最小0 **默认取值：** 0
     * minimum: 0
     * maximum: 2147483647
     * @return branchCount
     */
    public Integer getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(Integer branchCount) {
        this.branchCount = branchCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRepoStatisticsSummaryResponse that = (ShowRepoStatisticsSummaryResponse) obj;
        return Objects.equals(this.repoName, that.repoName) && Objects.equals(this.commitCount, that.commitCount)
            && Objects.equals(this.repoSize, that.repoSize) && Objects.equals(this.lastCommitTime, that.lastCommitTime)
            && Objects.equals(this.codeLines, that.codeLines) && Objects.equals(this.branchCount, that.branchCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoName, commitCount, repoSize, lastCommitTime, codeLines, branchCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepoStatisticsSummaryResponse {\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    commitCount: ").append(toIndentedString(commitCount)).append("\n");
        sb.append("    repoSize: ").append(toIndentedString(repoSize)).append("\n");
        sb.append("    lastCommitTime: ").append(toIndentedString(lastCommitTime)).append("\n");
        sb.append("    codeLines: ").append(toIndentedString(codeLines)).append("\n");
        sb.append("    branchCount: ").append(toIndentedString(branchCount)).append("\n");
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
