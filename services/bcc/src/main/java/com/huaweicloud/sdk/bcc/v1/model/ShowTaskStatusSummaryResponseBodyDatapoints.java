package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowTaskStatusSummaryResponseBodyDatapoints
 */
public class ShowTaskStatusSummaryResponseBodyDatapoints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics_date")

    private String statisticsDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_task_count")

    private Integer totalTaskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed_task_count")

    private Integer completedTaskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_task_count")

    private Integer failedTaskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_task_count")

    private Integer runningTaskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skipped_task_count")

    private Integer skippedTaskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout_task_count")

    private Integer timeoutTaskCount;

    public ShowTaskStatusSummaryResponseBodyDatapoints withStatisticsDate(String statisticsDate) {
        this.statisticsDate = statisticsDate;
        return this;
    }

    /**
     * 统计日期
     * @return statisticsDate
     */
    public String getStatisticsDate() {
        return statisticsDate;
    }

    public void setStatisticsDate(String statisticsDate) {
        this.statisticsDate = statisticsDate;
    }

    public ShowTaskStatusSummaryResponseBodyDatapoints withTotalTaskCount(Integer totalTaskCount) {
        this.totalTaskCount = totalTaskCount;
        return this;
    }

    /**
     * 当前统计周期内的总任务数
     * @return totalTaskCount
     */
    public Integer getTotalTaskCount() {
        return totalTaskCount;
    }

    public void setTotalTaskCount(Integer totalTaskCount) {
        this.totalTaskCount = totalTaskCount;
    }

    public ShowTaskStatusSummaryResponseBodyDatapoints withCompletedTaskCount(Integer completedTaskCount) {
        this.completedTaskCount = completedTaskCount;
        return this;
    }

    /**
     * 当前统计周期内的已完成的任务数
     * @return completedTaskCount
     */
    public Integer getCompletedTaskCount() {
        return completedTaskCount;
    }

    public void setCompletedTaskCount(Integer completedTaskCount) {
        this.completedTaskCount = completedTaskCount;
    }

    public ShowTaskStatusSummaryResponseBodyDatapoints withFailedTaskCount(Integer failedTaskCount) {
        this.failedTaskCount = failedTaskCount;
        return this;
    }

    /**
     * 当前统计周期内的失败任务数
     * @return failedTaskCount
     */
    public Integer getFailedTaskCount() {
        return failedTaskCount;
    }

    public void setFailedTaskCount(Integer failedTaskCount) {
        this.failedTaskCount = failedTaskCount;
    }

    public ShowTaskStatusSummaryResponseBodyDatapoints withRunningTaskCount(Integer runningTaskCount) {
        this.runningTaskCount = runningTaskCount;
        return this;
    }

    /**
     * 当前统计周期内的运行中任务数
     * @return runningTaskCount
     */
    public Integer getRunningTaskCount() {
        return runningTaskCount;
    }

    public void setRunningTaskCount(Integer runningTaskCount) {
        this.runningTaskCount = runningTaskCount;
    }

    public ShowTaskStatusSummaryResponseBodyDatapoints withSkippedTaskCount(Integer skippedTaskCount) {
        this.skippedTaskCount = skippedTaskCount;
        return this;
    }

    /**
     * 当前统计周期内的跳过任务数
     * @return skippedTaskCount
     */
    public Integer getSkippedTaskCount() {
        return skippedTaskCount;
    }

    public void setSkippedTaskCount(Integer skippedTaskCount) {
        this.skippedTaskCount = skippedTaskCount;
    }

    public ShowTaskStatusSummaryResponseBodyDatapoints withTimeoutTaskCount(Integer timeoutTaskCount) {
        this.timeoutTaskCount = timeoutTaskCount;
        return this;
    }

    /**
     * 当前统计周期内的超时任务数
     * @return timeoutTaskCount
     */
    public Integer getTimeoutTaskCount() {
        return timeoutTaskCount;
    }

    public void setTimeoutTaskCount(Integer timeoutTaskCount) {
        this.timeoutTaskCount = timeoutTaskCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskStatusSummaryResponseBodyDatapoints that = (ShowTaskStatusSummaryResponseBodyDatapoints) obj;
        return Objects.equals(this.statisticsDate, that.statisticsDate)
            && Objects.equals(this.totalTaskCount, that.totalTaskCount)
            && Objects.equals(this.completedTaskCount, that.completedTaskCount)
            && Objects.equals(this.failedTaskCount, that.failedTaskCount)
            && Objects.equals(this.runningTaskCount, that.runningTaskCount)
            && Objects.equals(this.skippedTaskCount, that.skippedTaskCount)
            && Objects.equals(this.timeoutTaskCount, that.timeoutTaskCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statisticsDate,
            totalTaskCount,
            completedTaskCount,
            failedTaskCount,
            runningTaskCount,
            skippedTaskCount,
            timeoutTaskCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskStatusSummaryResponseBodyDatapoints {\n");
        sb.append("    statisticsDate: ").append(toIndentedString(statisticsDate)).append("\n");
        sb.append("    totalTaskCount: ").append(toIndentedString(totalTaskCount)).append("\n");
        sb.append("    completedTaskCount: ").append(toIndentedString(completedTaskCount)).append("\n");
        sb.append("    failedTaskCount: ").append(toIndentedString(failedTaskCount)).append("\n");
        sb.append("    runningTaskCount: ").append(toIndentedString(runningTaskCount)).append("\n");
        sb.append("    skippedTaskCount: ").append(toIndentedString(skippedTaskCount)).append("\n");
        sb.append("    timeoutTaskCount: ").append(toIndentedString(timeoutTaskCount)).append("\n");
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
