package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowOperationalDataCurrentMonthUsingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_success_rate")

    private Integer alertSuccessRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_tasks")

    private Integer runningTasks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_alerts")

    private Integer totalAlerts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_days")

    private Integer totalDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_runs")

    private Long totalRuns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_tasks")

    private Integer totalTasks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_item_count")

    private Integer workItemCount;

    public ShowOperationalDataCurrentMonthUsingResponse withAlertSuccessRate(Integer alertSuccessRate) {
        this.alertSuccessRate = alertSuccessRate;
        return this;
    }

    /**
     * 告警成功比率，恒为1
     * @return alertSuccessRate
     */
    public Integer getAlertSuccessRate() {
        return alertSuccessRate;
    }

    public void setAlertSuccessRate(Integer alertSuccessRate) {
        this.alertSuccessRate = alertSuccessRate;
    }

    public ShowOperationalDataCurrentMonthUsingResponse withRunningTasks(Integer runningTasks) {
        this.runningTasks = runningTasks;
        return this;
    }

    /**
     * 正在运行的任务个数
     * @return runningTasks
     */
    public Integer getRunningTasks() {
        return runningTasks;
    }

    public void setRunningTasks(Integer runningTasks) {
        this.runningTasks = runningTasks;
    }

    public ShowOperationalDataCurrentMonthUsingResponse withTotalAlerts(Integer totalAlerts) {
        this.totalAlerts = totalAlerts;
        return this;
    }

    /**
     * 总告警数
     * @return totalAlerts
     */
    public Integer getTotalAlerts() {
        return totalAlerts;
    }

    public void setTotalAlerts(Integer totalAlerts) {
        this.totalAlerts = totalAlerts;
    }

    public ShowOperationalDataCurrentMonthUsingResponse withTotalDays(Integer totalDays) {
        this.totalDays = totalDays;
        return this;
    }

    /**
     * 总运行天数
     * @return totalDays
     */
    public Integer getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(Integer totalDays) {
        this.totalDays = totalDays;
    }

    public ShowOperationalDataCurrentMonthUsingResponse withTotalRuns(Long totalRuns) {
        this.totalRuns = totalRuns;
        return this;
    }

    /**
     * 总运行个数
     * @return totalRuns
     */
    public Long getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(Long totalRuns) {
        this.totalRuns = totalRuns;
    }

    public ShowOperationalDataCurrentMonthUsingResponse withTotalTasks(Integer totalTasks) {
        this.totalTasks = totalTasks;
        return this;
    }

    /**
     * 总任务个数
     * @return totalTasks
     */
    public Integer getTotalTasks() {
        return totalTasks;
    }

    public void setTotalTasks(Integer totalTasks) {
        this.totalTasks = totalTasks;
    }

    public ShowOperationalDataCurrentMonthUsingResponse withWorkItemCount(Integer workItemCount) {
        this.workItemCount = workItemCount;
        return this;
    }

    /**
     * 工作项个数
     * @return workItemCount
     */
    public Integer getWorkItemCount() {
        return workItemCount;
    }

    public void setWorkItemCount(Integer workItemCount) {
        this.workItemCount = workItemCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOperationalDataCurrentMonthUsingResponse that = (ShowOperationalDataCurrentMonthUsingResponse) obj;
        return Objects.equals(this.alertSuccessRate, that.alertSuccessRate)
            && Objects.equals(this.runningTasks, that.runningTasks)
            && Objects.equals(this.totalAlerts, that.totalAlerts) && Objects.equals(this.totalDays, that.totalDays)
            && Objects.equals(this.totalRuns, that.totalRuns) && Objects.equals(this.totalTasks, that.totalTasks)
            && Objects.equals(this.workItemCount, that.workItemCount);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(alertSuccessRate, runningTasks, totalAlerts, totalDays, totalRuns, totalTasks, workItemCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOperationalDataCurrentMonthUsingResponse {\n");
        sb.append("    alertSuccessRate: ").append(toIndentedString(alertSuccessRate)).append("\n");
        sb.append("    runningTasks: ").append(toIndentedString(runningTasks)).append("\n");
        sb.append("    totalAlerts: ").append(toIndentedString(totalAlerts)).append("\n");
        sb.append("    totalDays: ").append(toIndentedString(totalDays)).append("\n");
        sb.append("    totalRuns: ").append(toIndentedString(totalRuns)).append("\n");
        sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
        sb.append("    workItemCount: ").append(toIndentedString(workItemCount)).append("\n");
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
