package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepositoryStatisticsVO
 */
public class RepositoryStatisticsVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoName")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commitCount")

    private Integer commitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoSize")

    private String repoSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastCommitTime")

    private String lastCommitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codeLines")

    private Integer codeLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branchCount")

    private Integer branchCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archiveUrl")

    private String archiveUrl;

    public RepositoryStatisticsVO withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * 仓库名称
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public RepositoryStatisticsVO withCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
        return this;
    }

    /**
     * 提交次数
     * @return commitCount
     */
    public Integer getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
    }

    public RepositoryStatisticsVO withRepoSize(String repoSize) {
        this.repoSize = repoSize;
        return this;
    }

    /**
     * 仓库容量
     * @return repoSize
     */
    public String getRepoSize() {
        return repoSize;
    }

    public void setRepoSize(String repoSize) {
        this.repoSize = repoSize;
    }

    public RepositoryStatisticsVO withLastCommitTime(String lastCommitTime) {
        this.lastCommitTime = lastCommitTime;
        return this;
    }

    /**
     * 最近一次提交时间
     * @return lastCommitTime
     */
    public String getLastCommitTime() {
        return lastCommitTime;
    }

    public void setLastCommitTime(String lastCommitTime) {
        this.lastCommitTime = lastCommitTime;
    }

    public RepositoryStatisticsVO withCodeLines(Integer codeLines) {
        this.codeLines = codeLines;
        return this;
    }

    /**
     * 代码行数
     * @return codeLines
     */
    public Integer getCodeLines() {
        return codeLines;
    }

    public void setCodeLines(Integer codeLines) {
        this.codeLines = codeLines;
    }

    public RepositoryStatisticsVO withBranchCount(Integer branchCount) {
        this.branchCount = branchCount;
        return this;
    }

    /**
     * 分支数量
     * @return branchCount
     */
    public Integer getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(Integer branchCount) {
        this.branchCount = branchCount;
    }

    public RepositoryStatisticsVO withArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }

    /**
     * 代码仓下载地址
     * @return archiveUrl
     */
    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryStatisticsVO that = (RepositoryStatisticsVO) obj;
        return Objects.equals(this.repoName, that.repoName) && Objects.equals(this.commitCount, that.commitCount)
            && Objects.equals(this.repoSize, that.repoSize) && Objects.equals(this.lastCommitTime, that.lastCommitTime)
            && Objects.equals(this.codeLines, that.codeLines) && Objects.equals(this.branchCount, that.branchCount)
            && Objects.equals(this.archiveUrl, that.archiveUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoName, commitCount, repoSize, lastCommitTime, codeLines, branchCount, archiveUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryStatisticsVO {\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    commitCount: ").append(toIndentedString(commitCount)).append("\n");
        sb.append("    repoSize: ").append(toIndentedString(repoSize)).append("\n");
        sb.append("    lastCommitTime: ").append(toIndentedString(lastCommitTime)).append("\n");
        sb.append("    codeLines: ").append(toIndentedString(codeLines)).append("\n");
        sb.append("    branchCount: ").append(toIndentedString(branchCount)).append("\n");
        sb.append("    archiveUrl: ").append(toIndentedString(archiveUrl)).append("\n");
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
