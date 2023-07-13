package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 过滤条件
 */
public class ReportFilter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creatorIds")

    private String creatorIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ownerIds")

    private String ownerIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ranks")

    private String ranks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "releaseIds")

    private String releaseIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moduleIds")

    private String moduleIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private String results;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labelIds")

    private String labelIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAssociateIssue")

    private String isAssociateIssue;

    public ReportFilter withCreatorIds(String creatorIds) {
        this.creatorIds = creatorIds;
        return this;
    }

    /**
     * 创建人
     * @return creatorIds
     */
    public String getCreatorIds() {
        return creatorIds;
    }

    public void setCreatorIds(String creatorIds) {
        this.creatorIds = creatorIds;
    }

    public ReportFilter withOwnerIds(String ownerIds) {
        this.ownerIds = ownerIds;
        return this;
    }

    /**
     * 所属人
     * @return ownerIds
     */
    public String getOwnerIds() {
        return ownerIds;
    }

    public void setOwnerIds(String ownerIds) {
        this.ownerIds = ownerIds;
    }

    public ReportFilter withRanks(String ranks) {
        this.ranks = ranks;
        return this;
    }

    /**
     * 级别
     * @return ranks
     */
    public String getRanks() {
        return ranks;
    }

    public void setRanks(String ranks) {
        this.ranks = ranks;
    }

    public ReportFilter withReleaseIds(String releaseIds) {
        this.releaseIds = releaseIds;
        return this;
    }

    /**
     * releaseId
     * @return releaseIds
     */
    public String getReleaseIds() {
        return releaseIds;
    }

    public void setReleaseIds(String releaseIds) {
        this.releaseIds = releaseIds;
    }

    public ReportFilter withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ReportFilter withModuleIds(String moduleIds) {
        this.moduleIds = moduleIds;
        return this;
    }

    /**
     * 级别
     * @return moduleIds
     */
    public String getModuleIds() {
        return moduleIds;
    }

    public void setModuleIds(String moduleIds) {
        this.moduleIds = moduleIds;
    }

    public ReportFilter withResults(String results) {
        this.results = results;
        return this;
    }

    /**
     * 结果
     * @return results
     */
    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public ReportFilter withLabelIds(String labelIds) {
        this.labelIds = labelIds;
        return this;
    }

    /**
     * 标签
     * @return labelIds
     */
    public String getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(String labelIds) {
        this.labelIds = labelIds;
    }

    public ReportFilter withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ReportFilter withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ReportFilter withIsAssociateIssue(String isAssociateIssue) {
        this.isAssociateIssue = isAssociateIssue;
        return this;
    }

    /**
     * 是否关联需求
     * @return isAssociateIssue
     */
    public String getIsAssociateIssue() {
        return isAssociateIssue;
    }

    public void setIsAssociateIssue(String isAssociateIssue) {
        this.isAssociateIssue = isAssociateIssue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportFilter that = (ReportFilter) obj;
        return Objects.equals(this.creatorIds, that.creatorIds) && Objects.equals(this.ownerIds, that.ownerIds)
            && Objects.equals(this.ranks, that.ranks) && Objects.equals(this.releaseIds, that.releaseIds)
            && Objects.equals(this.status, that.status) && Objects.equals(this.moduleIds, that.moduleIds)
            && Objects.equals(this.results, that.results) && Objects.equals(this.labelIds, that.labelIds)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.isAssociateIssue, that.isAssociateIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creatorIds,
            ownerIds,
            ranks,
            releaseIds,
            status,
            moduleIds,
            results,
            labelIds,
            startTime,
            endTime,
            isAssociateIssue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportFilter {\n");
        sb.append("    creatorIds: ").append(toIndentedString(creatorIds)).append("\n");
        sb.append("    ownerIds: ").append(toIndentedString(ownerIds)).append("\n");
        sb.append("    ranks: ").append(toIndentedString(ranks)).append("\n");
        sb.append("    releaseIds: ").append(toIndentedString(releaseIds)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    moduleIds: ").append(toIndentedString(moduleIds)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    isAssociateIssue: ").append(toIndentedString(isAssociateIssue)).append("\n");
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
