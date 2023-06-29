package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckRecordDataInfo
 */
public class CheckRecordDataInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_time")

    private String checkTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_end_time")

    private String checkEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_counts")

    private CheckRecordIssueCountsInfo issueCounts;

    public CheckRecordDataInfo withCheckTime(String checkTime) {
        this.checkTime = checkTime;
        return this;
    }

    /**
     * 检查任务执行开始时间
     * @return checkTime
     */
    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public CheckRecordDataInfo withCheckEndTime(String checkEndTime) {
        this.checkEndTime = checkEndTime;
        return this;
    }

    /**
     * 检查任务执行结束时间
     * @return checkEndTime
     */
    public String getCheckEndTime() {
        return checkEndTime;
    }

    public void setCheckEndTime(String checkEndTime) {
        this.checkEndTime = checkEndTime;
    }

    public CheckRecordDataInfo withIssueCounts(CheckRecordIssueCountsInfo issueCounts) {
        this.issueCounts = issueCounts;
        return this;
    }

    public CheckRecordDataInfo withIssueCounts(Consumer<CheckRecordIssueCountsInfo> issueCountsSetter) {
        if (this.issueCounts == null) {
            this.issueCounts = new CheckRecordIssueCountsInfo();
            issueCountsSetter.accept(this.issueCounts);
        }

        return this;
    }

    /**
     * Get issueCounts
     * @return issueCounts
     */
    public CheckRecordIssueCountsInfo getIssueCounts() {
        return issueCounts;
    }

    public void setIssueCounts(CheckRecordIssueCountsInfo issueCounts) {
        this.issueCounts = issueCounts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckRecordDataInfo that = (CheckRecordDataInfo) obj;
        return Objects.equals(this.checkTime, that.checkTime) && Objects.equals(this.checkEndTime, that.checkEndTime)
            && Objects.equals(this.issueCounts, that.issueCounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkTime, checkEndTime, issueCounts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRecordDataInfo {\n");
        sb.append("    checkTime: ").append(toIndentedString(checkTime)).append("\n");
        sb.append("    checkEndTime: ").append(toIndentedString(checkEndTime)).append("\n");
        sb.append("    issueCounts: ").append(toIndentedString(issueCounts)).append("\n");
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
