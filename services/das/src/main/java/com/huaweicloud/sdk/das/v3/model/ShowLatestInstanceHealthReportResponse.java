package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLatestInstanceHealthReportResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private BigDecimal startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private BigDecimal endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary_info")

    private HealthReportSummaryInfo summaryInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_info")

    private HealthReportInstanceInfo instanceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "performance_stat")

    private HealthReportPerformanceStat performanceStat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_stat")

    private HealthReportDiskStat diskStat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_space_stat")

    private HealthReportTableSpaceNewStat tableSpaceStat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log_stat")

    private HealthReportSlowLogStat slowLogStat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_sql_stat")

    private HealthReportFullSqlStat fullSqlStat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_stat")

    private HealthReportInspectionStat inspectionStat;

    public ShowLatestInstanceHealthReportResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 日报诊断是否成功
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ShowLatestInstanceHealthReportResponse withStartAt(BigDecimal startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 日报诊断区间的起始时间（Unix timestamp），单位：毫秒
     * @return startAt
     */
    public BigDecimal getStartAt() {
        return startAt;
    }

    public void setStartAt(BigDecimal startAt) {
        this.startAt = startAt;
    }

    public ShowLatestInstanceHealthReportResponse withEndAt(BigDecimal endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 日报诊断区间的结束时间（Unix timestamp），单位：毫秒
     * @return endAt
     */
    public BigDecimal getEndAt() {
        return endAt;
    }

    public void setEndAt(BigDecimal endAt) {
        this.endAt = endAt;
    }

    public ShowLatestInstanceHealthReportResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 报告ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowLatestInstanceHealthReportResponse withSummaryInfo(HealthReportSummaryInfo summaryInfo) {
        this.summaryInfo = summaryInfo;
        return this;
    }

    public ShowLatestInstanceHealthReportResponse withSummaryInfo(Consumer<HealthReportSummaryInfo> summaryInfoSetter) {
        if (this.summaryInfo == null) {
            this.summaryInfo = new HealthReportSummaryInfo();
            summaryInfoSetter.accept(this.summaryInfo);
        }

        return this;
    }

    /**
     * Get summaryInfo
     * @return summaryInfo
     */
    public HealthReportSummaryInfo getSummaryInfo() {
        return summaryInfo;
    }

    public void setSummaryInfo(HealthReportSummaryInfo summaryInfo) {
        this.summaryInfo = summaryInfo;
    }

    public ShowLatestInstanceHealthReportResponse withInstanceInfo(HealthReportInstanceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }

    public ShowLatestInstanceHealthReportResponse withInstanceInfo(
        Consumer<HealthReportInstanceInfo> instanceInfoSetter) {
        if (this.instanceInfo == null) {
            this.instanceInfo = new HealthReportInstanceInfo();
            instanceInfoSetter.accept(this.instanceInfo);
        }

        return this;
    }

    /**
     * Get instanceInfo
     * @return instanceInfo
     */
    public HealthReportInstanceInfo getInstanceInfo() {
        return instanceInfo;
    }

    public void setInstanceInfo(HealthReportInstanceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
    }

    public ShowLatestInstanceHealthReportResponse withPerformanceStat(HealthReportPerformanceStat performanceStat) {
        this.performanceStat = performanceStat;
        return this;
    }

    public ShowLatestInstanceHealthReportResponse withPerformanceStat(
        Consumer<HealthReportPerformanceStat> performanceStatSetter) {
        if (this.performanceStat == null) {
            this.performanceStat = new HealthReportPerformanceStat();
            performanceStatSetter.accept(this.performanceStat);
        }

        return this;
    }

    /**
     * Get performanceStat
     * @return performanceStat
     */
    public HealthReportPerformanceStat getPerformanceStat() {
        return performanceStat;
    }

    public void setPerformanceStat(HealthReportPerformanceStat performanceStat) {
        this.performanceStat = performanceStat;
    }

    public ShowLatestInstanceHealthReportResponse withDiskStat(HealthReportDiskStat diskStat) {
        this.diskStat = diskStat;
        return this;
    }

    public ShowLatestInstanceHealthReportResponse withDiskStat(Consumer<HealthReportDiskStat> diskStatSetter) {
        if (this.diskStat == null) {
            this.diskStat = new HealthReportDiskStat();
            diskStatSetter.accept(this.diskStat);
        }

        return this;
    }

    /**
     * Get diskStat
     * @return diskStat
     */
    public HealthReportDiskStat getDiskStat() {
        return diskStat;
    }

    public void setDiskStat(HealthReportDiskStat diskStat) {
        this.diskStat = diskStat;
    }

    public ShowLatestInstanceHealthReportResponse withTableSpaceStat(HealthReportTableSpaceNewStat tableSpaceStat) {
        this.tableSpaceStat = tableSpaceStat;
        return this;
    }

    public ShowLatestInstanceHealthReportResponse withTableSpaceStat(
        Consumer<HealthReportTableSpaceNewStat> tableSpaceStatSetter) {
        if (this.tableSpaceStat == null) {
            this.tableSpaceStat = new HealthReportTableSpaceNewStat();
            tableSpaceStatSetter.accept(this.tableSpaceStat);
        }

        return this;
    }

    /**
     * Get tableSpaceStat
     * @return tableSpaceStat
     */
    public HealthReportTableSpaceNewStat getTableSpaceStat() {
        return tableSpaceStat;
    }

    public void setTableSpaceStat(HealthReportTableSpaceNewStat tableSpaceStat) {
        this.tableSpaceStat = tableSpaceStat;
    }

    public ShowLatestInstanceHealthReportResponse withSlowLogStat(HealthReportSlowLogStat slowLogStat) {
        this.slowLogStat = slowLogStat;
        return this;
    }

    public ShowLatestInstanceHealthReportResponse withSlowLogStat(Consumer<HealthReportSlowLogStat> slowLogStatSetter) {
        if (this.slowLogStat == null) {
            this.slowLogStat = new HealthReportSlowLogStat();
            slowLogStatSetter.accept(this.slowLogStat);
        }

        return this;
    }

    /**
     * Get slowLogStat
     * @return slowLogStat
     */
    public HealthReportSlowLogStat getSlowLogStat() {
        return slowLogStat;
    }

    public void setSlowLogStat(HealthReportSlowLogStat slowLogStat) {
        this.slowLogStat = slowLogStat;
    }

    public ShowLatestInstanceHealthReportResponse withFullSqlStat(HealthReportFullSqlStat fullSqlStat) {
        this.fullSqlStat = fullSqlStat;
        return this;
    }

    public ShowLatestInstanceHealthReportResponse withFullSqlStat(Consumer<HealthReportFullSqlStat> fullSqlStatSetter) {
        if (this.fullSqlStat == null) {
            this.fullSqlStat = new HealthReportFullSqlStat();
            fullSqlStatSetter.accept(this.fullSqlStat);
        }

        return this;
    }

    /**
     * Get fullSqlStat
     * @return fullSqlStat
     */
    public HealthReportFullSqlStat getFullSqlStat() {
        return fullSqlStat;
    }

    public void setFullSqlStat(HealthReportFullSqlStat fullSqlStat) {
        this.fullSqlStat = fullSqlStat;
    }

    public ShowLatestInstanceHealthReportResponse withInspectionStat(HealthReportInspectionStat inspectionStat) {
        this.inspectionStat = inspectionStat;
        return this;
    }

    public ShowLatestInstanceHealthReportResponse withInspectionStat(
        Consumer<HealthReportInspectionStat> inspectionStatSetter) {
        if (this.inspectionStat == null) {
            this.inspectionStat = new HealthReportInspectionStat();
            inspectionStatSetter.accept(this.inspectionStat);
        }

        return this;
    }

    /**
     * Get inspectionStat
     * @return inspectionStat
     */
    public HealthReportInspectionStat getInspectionStat() {
        return inspectionStat;
    }

    public void setInspectionStat(HealthReportInspectionStat inspectionStat) {
        this.inspectionStat = inspectionStat;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLatestInstanceHealthReportResponse that = (ShowLatestInstanceHealthReportResponse) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.startAt, that.startAt)
            && Objects.equals(this.endAt, that.endAt) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.summaryInfo, that.summaryInfo)
            && Objects.equals(this.instanceInfo, that.instanceInfo)
            && Objects.equals(this.performanceStat, that.performanceStat)
            && Objects.equals(this.diskStat, that.diskStat) && Objects.equals(this.tableSpaceStat, that.tableSpaceStat)
            && Objects.equals(this.slowLogStat, that.slowLogStat) && Objects.equals(this.fullSqlStat, that.fullSqlStat)
            && Objects.equals(this.inspectionStat, that.inspectionStat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success,
            startAt,
            endAt,
            taskId,
            summaryInfo,
            instanceInfo,
            performanceStat,
            diskStat,
            tableSpaceStat,
            slowLogStat,
            fullSqlStat,
            inspectionStat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLatestInstanceHealthReportResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    summaryInfo: ").append(toIndentedString(summaryInfo)).append("\n");
        sb.append("    instanceInfo: ").append(toIndentedString(instanceInfo)).append("\n");
        sb.append("    performanceStat: ").append(toIndentedString(performanceStat)).append("\n");
        sb.append("    diskStat: ").append(toIndentedString(diskStat)).append("\n");
        sb.append("    tableSpaceStat: ").append(toIndentedString(tableSpaceStat)).append("\n");
        sb.append("    slowLogStat: ").append(toIndentedString(slowLogStat)).append("\n");
        sb.append("    fullSqlStat: ").append(toIndentedString(fullSqlStat)).append("\n");
        sb.append("    inspectionStat: ").append(toIndentedString(inspectionStat)).append("\n");
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
