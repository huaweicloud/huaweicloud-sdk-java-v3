package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GetResourceCopySummaryResponseSummary
 */
public class GetResourceCopySummaryResponseSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistic_date")

    private String statisticDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_copy_counts")

    private Integer totalCopyCounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed_copy_counts")

    private Integer completedCopyCounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_copy_counts")

    private Integer failedCopyCounts;

    public GetResourceCopySummaryResponseSummary withStatisticDate(String statisticDate) {
        this.statisticDate = statisticDate;
        return this;
    }

    /**
     * 统计日期
     * @return statisticDate
     */
    public String getStatisticDate() {
        return statisticDate;
    }

    public void setStatisticDate(String statisticDate) {
        this.statisticDate = statisticDate;
    }

    public GetResourceCopySummaryResponseSummary withTotalCopyCounts(Integer totalCopyCounts) {
        this.totalCopyCounts = totalCopyCounts;
        return this;
    }

    /**
     * 当前统计日期内的备份总数
     * minimum: 0
     * maximum: 2147483647
     * @return totalCopyCounts
     */
    public Integer getTotalCopyCounts() {
        return totalCopyCounts;
    }

    public void setTotalCopyCounts(Integer totalCopyCounts) {
        this.totalCopyCounts = totalCopyCounts;
    }

    public GetResourceCopySummaryResponseSummary withCompletedCopyCounts(Integer completedCopyCounts) {
        this.completedCopyCounts = completedCopyCounts;
        return this;
    }

    /**
     * 当前统计日期内的完成备份总数, key -> ResourceCopyStatisticsKeyEnum.COMPLETED.getValue()
     * minimum: 0
     * maximum: 2147483647
     * @return completedCopyCounts
     */
    public Integer getCompletedCopyCounts() {
        return completedCopyCounts;
    }

    public void setCompletedCopyCounts(Integer completedCopyCounts) {
        this.completedCopyCounts = completedCopyCounts;
    }

    public GetResourceCopySummaryResponseSummary withFailedCopyCounts(Integer failedCopyCounts) {
        this.failedCopyCounts = failedCopyCounts;
        return this;
    }

    /**
     * 当前统计日期内的失败备份总数, key -> ResourceCopyStatisticsKeyEnum.FAILED.getValue()
     * minimum: 0
     * maximum: 2147483647
     * @return failedCopyCounts
     */
    public Integer getFailedCopyCounts() {
        return failedCopyCounts;
    }

    public void setFailedCopyCounts(Integer failedCopyCounts) {
        this.failedCopyCounts = failedCopyCounts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetResourceCopySummaryResponseSummary that = (GetResourceCopySummaryResponseSummary) obj;
        return Objects.equals(this.statisticDate, that.statisticDate)
            && Objects.equals(this.totalCopyCounts, that.totalCopyCounts)
            && Objects.equals(this.completedCopyCounts, that.completedCopyCounts)
            && Objects.equals(this.failedCopyCounts, that.failedCopyCounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statisticDate, totalCopyCounts, completedCopyCounts, failedCopyCounts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetResourceCopySummaryResponseSummary {\n");
        sb.append("    statisticDate: ").append(toIndentedString(statisticDate)).append("\n");
        sb.append("    totalCopyCounts: ").append(toIndentedString(totalCopyCounts)).append("\n");
        sb.append("    completedCopyCounts: ").append(toIndentedString(completedCopyCounts)).append("\n");
        sb.append("    failedCopyCounts: ").append(toIndentedString(failedCopyCounts)).append("\n");
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
