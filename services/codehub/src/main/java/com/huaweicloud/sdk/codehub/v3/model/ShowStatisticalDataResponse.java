package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowStatisticalDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoName")

    @JacksonXmlProperty(localName = "repoName")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commitCount")

    @JacksonXmlProperty(localName = "commitCount")

    private Integer commitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoSize")

    @JacksonXmlProperty(localName = "repoSize")

    private String repoSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastCommitTime")

    @JacksonXmlProperty(localName = "lastCommitTime")

    private String lastCommitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codeLines")

    @JacksonXmlProperty(localName = "codeLines")

    private Integer codeLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branchCount")

    @JacksonXmlProperty(localName = "branchCount")

    private Integer branchCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archiveUrl")

    @JacksonXmlProperty(localName = "archiveUrl")

    private String archiveUrl;

    public ShowStatisticalDataResponse withRepoName(String repoName) {
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

    public ShowStatisticalDataResponse withCommitCount(Integer commitCount) {
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

    public ShowStatisticalDataResponse withRepoSize(String repoSize) {
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

    public ShowStatisticalDataResponse withLastCommitTime(String lastCommitTime) {
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

    public ShowStatisticalDataResponse withCodeLines(Integer codeLines) {
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

    public ShowStatisticalDataResponse withBranchCount(Integer branchCount) {
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

    public ShowStatisticalDataResponse withArchiveUrl(String archiveUrl) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowStatisticalDataResponse showStatisticalDataResponse = (ShowStatisticalDataResponse) o;
        return Objects.equals(this.repoName, showStatisticalDataResponse.repoName)
            && Objects.equals(this.commitCount, showStatisticalDataResponse.commitCount)
            && Objects.equals(this.repoSize, showStatisticalDataResponse.repoSize)
            && Objects.equals(this.lastCommitTime, showStatisticalDataResponse.lastCommitTime)
            && Objects.equals(this.codeLines, showStatisticalDataResponse.codeLines)
            && Objects.equals(this.branchCount, showStatisticalDataResponse.branchCount)
            && Objects.equals(this.archiveUrl, showStatisticalDataResponse.archiveUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoName, commitCount, repoSize, lastCommitTime, codeLines, branchCount, archiveUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatisticalDataResponse {\n");
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
