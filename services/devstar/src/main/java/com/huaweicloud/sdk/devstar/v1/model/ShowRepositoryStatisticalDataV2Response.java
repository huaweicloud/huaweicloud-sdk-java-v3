package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ShowRepositoryStatisticalDataV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_number")

    private Integer commitNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_repo_cap")

    private String gitRepoCap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_commit_time")

    private String lastCommitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_lines")

    private Integer codeLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_number")

    private Integer branchNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_url")

    private String detailUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_url")

    private String downloadUrl;

    public ShowRepositoryStatisticalDataV2Response withName(String name) {
        this.name = name;
        return this;
    }

    /** 代码仓的名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowRepositoryStatisticalDataV2Response withCommitNumber(Integer commitNumber) {
        this.commitNumber = commitNumber;
        return this;
    }

    /** 提交数量 minimum: 0 maximum: 2147483647
     * 
     * @return commitNumber */
    public Integer getCommitNumber() {
        return commitNumber;
    }

    public void setCommitNumber(Integer commitNumber) {
        this.commitNumber = commitNumber;
    }

    public ShowRepositoryStatisticalDataV2Response withGitRepoCap(String gitRepoCap) {
        this.gitRepoCap = gitRepoCap;
        return this;
    }

    /** Git库容量
     * 
     * @return gitRepoCap */
    public String getGitRepoCap() {
        return gitRepoCap;
    }

    public void setGitRepoCap(String gitRepoCap) {
        this.gitRepoCap = gitRepoCap;
    }

    public ShowRepositoryStatisticalDataV2Response withLastCommitTime(String lastCommitTime) {
        this.lastCommitTime = lastCommitTime;
        return this;
    }

    /** 近一次提交时间
     * 
     * @return lastCommitTime */
    public String getLastCommitTime() {
        return lastCommitTime;
    }

    public void setLastCommitTime(String lastCommitTime) {
        this.lastCommitTime = lastCommitTime;
    }

    public ShowRepositoryStatisticalDataV2Response withCodeLines(Integer codeLines) {
        this.codeLines = codeLines;
        return this;
    }

    /** 代码行数 minimum: 0 maximum: 2147483647
     * 
     * @return codeLines */
    public Integer getCodeLines() {
        return codeLines;
    }

    public void setCodeLines(Integer codeLines) {
        this.codeLines = codeLines;
    }

    public ShowRepositoryStatisticalDataV2Response withBranchNumber(Integer branchNumber) {
        this.branchNumber = branchNumber;
        return this;
    }

    /** 分支数量 minimum: 0 maximum: 2147483647
     * 
     * @return branchNumber */
    public Integer getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(Integer branchNumber) {
        this.branchNumber = branchNumber;
    }

    public ShowRepositoryStatisticalDataV2Response withDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }

    /** 代码仓路径url
     * 
     * @return detailUrl */
    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public ShowRepositoryStatisticalDataV2Response withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /** 代码仓下载url
     * 
     * @return downloadUrl */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRepositoryStatisticalDataV2Response showRepositoryStatisticalDataV2Response =
            (ShowRepositoryStatisticalDataV2Response) o;
        return Objects.equals(this.name, showRepositoryStatisticalDataV2Response.name)
            && Objects.equals(this.commitNumber, showRepositoryStatisticalDataV2Response.commitNumber)
            && Objects.equals(this.gitRepoCap, showRepositoryStatisticalDataV2Response.gitRepoCap)
            && Objects.equals(this.lastCommitTime, showRepositoryStatisticalDataV2Response.lastCommitTime)
            && Objects.equals(this.codeLines, showRepositoryStatisticalDataV2Response.codeLines)
            && Objects.equals(this.branchNumber, showRepositoryStatisticalDataV2Response.branchNumber)
            && Objects.equals(this.detailUrl, showRepositoryStatisticalDataV2Response.detailUrl)
            && Objects.equals(this.downloadUrl, showRepositoryStatisticalDataV2Response.downloadUrl);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, commitNumber, gitRepoCap, lastCommitTime, codeLines, branchNumber, detailUrl, downloadUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryStatisticalDataV2Response {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    commitNumber: ").append(toIndentedString(commitNumber)).append("\n");
        sb.append("    gitRepoCap: ").append(toIndentedString(gitRepoCap)).append("\n");
        sb.append("    lastCommitTime: ").append(toIndentedString(lastCommitTime)).append("\n");
        sb.append("    codeLines: ").append(toIndentedString(codeLines)).append("\n");
        sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
        sb.append("    detailUrl: ").append(toIndentedString(detailUrl)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
