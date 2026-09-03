package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceHealthReport4ApiResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary_info")

    private SummaryInfo summaryInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_info")

    private HealthReportInstanceInfo instanceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "performance_stat")

    private PerformanceStat performanceStat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_stat")

    private DiskStat diskStat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_space_stat")

    private TableSpaceStat tableSpaceStat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_log_stat")

    private SlowLogStat slowLogStat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_sql_stat")

    private FullSqlStat fullSqlStat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_stat")

    private InspectionStat inspectionStat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suffix_uri")

    private String suffixUri;

    public ShowInstanceHealthReport4ApiResponse withSuccess(Boolean success) {
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

    public ShowInstanceHealthReport4ApiResponse withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 日报诊断区间的起始时间（Unix timestamp），单位：毫秒
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public ShowInstanceHealthReport4ApiResponse withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 日报诊断区间的结束时间（Unix timestamp），单位：毫秒
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public ShowInstanceHealthReport4ApiResponse withTaskId(String taskId) {
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

    public ShowInstanceHealthReport4ApiResponse withSummaryInfo(SummaryInfo summaryInfo) {
        this.summaryInfo = summaryInfo;
        return this;
    }

    public ShowInstanceHealthReport4ApiResponse withSummaryInfo(Consumer<SummaryInfo> summaryInfoSetter) {
        if (this.summaryInfo == null) {
            this.summaryInfo = new SummaryInfo();
            summaryInfoSetter.accept(this.summaryInfo);
        }

        return this;
    }

    /**
     * Get summaryInfo
     * @return summaryInfo
     */
    public SummaryInfo getSummaryInfo() {
        return summaryInfo;
    }

    public void setSummaryInfo(SummaryInfo summaryInfo) {
        this.summaryInfo = summaryInfo;
    }

    public ShowInstanceHealthReport4ApiResponse withInstanceInfo(HealthReportInstanceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }

    public ShowInstanceHealthReport4ApiResponse withInstanceInfo(
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

    public ShowInstanceHealthReport4ApiResponse withPerformanceStat(PerformanceStat performanceStat) {
        this.performanceStat = performanceStat;
        return this;
    }

    public ShowInstanceHealthReport4ApiResponse withPerformanceStat(Consumer<PerformanceStat> performanceStatSetter) {
        if (this.performanceStat == null) {
            this.performanceStat = new PerformanceStat();
            performanceStatSetter.accept(this.performanceStat);
        }

        return this;
    }

    /**
     * Get performanceStat
     * @return performanceStat
     */
    public PerformanceStat getPerformanceStat() {
        return performanceStat;
    }

    public void setPerformanceStat(PerformanceStat performanceStat) {
        this.performanceStat = performanceStat;
    }

    public ShowInstanceHealthReport4ApiResponse withDiskStat(DiskStat diskStat) {
        this.diskStat = diskStat;
        return this;
    }

    public ShowInstanceHealthReport4ApiResponse withDiskStat(Consumer<DiskStat> diskStatSetter) {
        if (this.diskStat == null) {
            this.diskStat = new DiskStat();
            diskStatSetter.accept(this.diskStat);
        }

        return this;
    }

    /**
     * Get diskStat
     * @return diskStat
     */
    public DiskStat getDiskStat() {
        return diskStat;
    }

    public void setDiskStat(DiskStat diskStat) {
        this.diskStat = diskStat;
    }

    public ShowInstanceHealthReport4ApiResponse withTableSpaceStat(TableSpaceStat tableSpaceStat) {
        this.tableSpaceStat = tableSpaceStat;
        return this;
    }

    public ShowInstanceHealthReport4ApiResponse withTableSpaceStat(Consumer<TableSpaceStat> tableSpaceStatSetter) {
        if (this.tableSpaceStat == null) {
            this.tableSpaceStat = new TableSpaceStat();
            tableSpaceStatSetter.accept(this.tableSpaceStat);
        }

        return this;
    }

    /**
     * Get tableSpaceStat
     * @return tableSpaceStat
     */
    public TableSpaceStat getTableSpaceStat() {
        return tableSpaceStat;
    }

    public void setTableSpaceStat(TableSpaceStat tableSpaceStat) {
        this.tableSpaceStat = tableSpaceStat;
    }

    public ShowInstanceHealthReport4ApiResponse withSlowLogStat(SlowLogStat slowLogStat) {
        this.slowLogStat = slowLogStat;
        return this;
    }

    public ShowInstanceHealthReport4ApiResponse withSlowLogStat(Consumer<SlowLogStat> slowLogStatSetter) {
        if (this.slowLogStat == null) {
            this.slowLogStat = new SlowLogStat();
            slowLogStatSetter.accept(this.slowLogStat);
        }

        return this;
    }

    /**
     * Get slowLogStat
     * @return slowLogStat
     */
    public SlowLogStat getSlowLogStat() {
        return slowLogStat;
    }

    public void setSlowLogStat(SlowLogStat slowLogStat) {
        this.slowLogStat = slowLogStat;
    }

    public ShowInstanceHealthReport4ApiResponse withFullSqlStat(FullSqlStat fullSqlStat) {
        this.fullSqlStat = fullSqlStat;
        return this;
    }

    public ShowInstanceHealthReport4ApiResponse withFullSqlStat(Consumer<FullSqlStat> fullSqlStatSetter) {
        if (this.fullSqlStat == null) {
            this.fullSqlStat = new FullSqlStat();
            fullSqlStatSetter.accept(this.fullSqlStat);
        }

        return this;
    }

    /**
     * Get fullSqlStat
     * @return fullSqlStat
     */
    public FullSqlStat getFullSqlStat() {
        return fullSqlStat;
    }

    public void setFullSqlStat(FullSqlStat fullSqlStat) {
        this.fullSqlStat = fullSqlStat;
    }

    public ShowInstanceHealthReport4ApiResponse withInspectionStat(InspectionStat inspectionStat) {
        this.inspectionStat = inspectionStat;
        return this;
    }

    public ShowInstanceHealthReport4ApiResponse withInspectionStat(Consumer<InspectionStat> inspectionStatSetter) {
        if (this.inspectionStat == null) {
            this.inspectionStat = new InspectionStat();
            inspectionStatSetter.accept(this.inspectionStat);
        }

        return this;
    }

    /**
     * Get inspectionStat
     * @return inspectionStat
     */
    public InspectionStat getInspectionStat() {
        return inspectionStat;
    }

    public void setInspectionStat(InspectionStat inspectionStat) {
        this.inspectionStat = inspectionStat;
    }

    public ShowInstanceHealthReport4ApiResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ShowInstanceHealthReport4ApiResponse withSuffixUri(String suffixUri) {
        this.suffixUri = suffixUri;
        return this;
    }

    /**
     * 报告链接
     * @return suffixUri
     */
    public String getSuffixUri() {
        return suffixUri;
    }

    public void setSuffixUri(String suffixUri) {
        this.suffixUri = suffixUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceHealthReport4ApiResponse that = (ShowInstanceHealthReport4ApiResponse) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.startAt, that.startAt)
            && Objects.equals(this.endAt, that.endAt) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.summaryInfo, that.summaryInfo)
            && Objects.equals(this.instanceInfo, that.instanceInfo)
            && Objects.equals(this.performanceStat, that.performanceStat)
            && Objects.equals(this.diskStat, that.diskStat) && Objects.equals(this.tableSpaceStat, that.tableSpaceStat)
            && Objects.equals(this.slowLogStat, that.slowLogStat) && Objects.equals(this.fullSqlStat, that.fullSqlStat)
            && Objects.equals(this.inspectionStat, that.inspectionStat)
            && Objects.equals(this.errorMessage, that.errorMessage) && Objects.equals(this.suffixUri, that.suffixUri);
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
            inspectionStat,
            errorMessage,
            suffixUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceHealthReport4ApiResponse {\n");
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
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    suffixUri: ").append(toIndentedString(suffixUri)).append("\n");
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
