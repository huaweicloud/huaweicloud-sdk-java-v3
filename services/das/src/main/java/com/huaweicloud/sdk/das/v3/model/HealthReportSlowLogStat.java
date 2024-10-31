package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HealthReportSlowLogStat
 */
public class HealthReportSlowLogStat {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_slow_log")

    private Boolean collectSlowLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_execute_slow_logs")

    private List<HealthReportSqlTemplate> topExecuteSlowLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_avg_query_time_slow_logs")

    private List<HealthReportSqlTemplate> topAvgQueryTimeSlowLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_max_query_time_slow_logs")

    private List<HealthReportSqlTemplate> topMaxQueryTimeSlowLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined_exceeding")

    private List<HealthReportSqlTemplate> rowsExaminedExceeding = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyze_success")

    private Boolean analyzeSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public HealthReportSlowLogStat withCollectSlowLog(Boolean collectSlowLog) {
        this.collectSlowLog = collectSlowLog;
        return this;
    }

    /**
     * 是否收集慢SQL。
     * @return collectSlowLog
     */
    public Boolean getCollectSlowLog() {
        return collectSlowLog;
    }

    public void setCollectSlowLog(Boolean collectSlowLog) {
        this.collectSlowLog = collectSlowLog;
    }

    public HealthReportSlowLogStat withTopExecuteSlowLogs(List<HealthReportSqlTemplate> topExecuteSlowLogs) {
        this.topExecuteSlowLogs = topExecuteSlowLogs;
        return this;
    }

    public HealthReportSlowLogStat addTopExecuteSlowLogsItem(HealthReportSqlTemplate topExecuteSlowLogsItem) {
        if (this.topExecuteSlowLogs == null) {
            this.topExecuteSlowLogs = new ArrayList<>();
        }
        this.topExecuteSlowLogs.add(topExecuteSlowLogsItem);
        return this;
    }

    public HealthReportSlowLogStat withTopExecuteSlowLogs(
        Consumer<List<HealthReportSqlTemplate>> topExecuteSlowLogsSetter) {
        if (this.topExecuteSlowLogs == null) {
            this.topExecuteSlowLogs = new ArrayList<>();
        }
        topExecuteSlowLogsSetter.accept(this.topExecuteSlowLogs);
        return this;
    }

    /**
     * 慢SQL Top执行次数列表。
     * @return topExecuteSlowLogs
     */
    public List<HealthReportSqlTemplate> getTopExecuteSlowLogs() {
        return topExecuteSlowLogs;
    }

    public void setTopExecuteSlowLogs(List<HealthReportSqlTemplate> topExecuteSlowLogs) {
        this.topExecuteSlowLogs = topExecuteSlowLogs;
    }

    public HealthReportSlowLogStat withTopAvgQueryTimeSlowLogs(List<HealthReportSqlTemplate> topAvgQueryTimeSlowLogs) {
        this.topAvgQueryTimeSlowLogs = topAvgQueryTimeSlowLogs;
        return this;
    }

    public HealthReportSlowLogStat addTopAvgQueryTimeSlowLogsItem(HealthReportSqlTemplate topAvgQueryTimeSlowLogsItem) {
        if (this.topAvgQueryTimeSlowLogs == null) {
            this.topAvgQueryTimeSlowLogs = new ArrayList<>();
        }
        this.topAvgQueryTimeSlowLogs.add(topAvgQueryTimeSlowLogsItem);
        return this;
    }

    public HealthReportSlowLogStat withTopAvgQueryTimeSlowLogs(
        Consumer<List<HealthReportSqlTemplate>> topAvgQueryTimeSlowLogsSetter) {
        if (this.topAvgQueryTimeSlowLogs == null) {
            this.topAvgQueryTimeSlowLogs = new ArrayList<>();
        }
        topAvgQueryTimeSlowLogsSetter.accept(this.topAvgQueryTimeSlowLogs);
        return this;
    }

    /**
     * 慢SQL Top平均执行时间列表。
     * @return topAvgQueryTimeSlowLogs
     */
    public List<HealthReportSqlTemplate> getTopAvgQueryTimeSlowLogs() {
        return topAvgQueryTimeSlowLogs;
    }

    public void setTopAvgQueryTimeSlowLogs(List<HealthReportSqlTemplate> topAvgQueryTimeSlowLogs) {
        this.topAvgQueryTimeSlowLogs = topAvgQueryTimeSlowLogs;
    }

    public HealthReportSlowLogStat withTopMaxQueryTimeSlowLogs(List<HealthReportSqlTemplate> topMaxQueryTimeSlowLogs) {
        this.topMaxQueryTimeSlowLogs = topMaxQueryTimeSlowLogs;
        return this;
    }

    public HealthReportSlowLogStat addTopMaxQueryTimeSlowLogsItem(HealthReportSqlTemplate topMaxQueryTimeSlowLogsItem) {
        if (this.topMaxQueryTimeSlowLogs == null) {
            this.topMaxQueryTimeSlowLogs = new ArrayList<>();
        }
        this.topMaxQueryTimeSlowLogs.add(topMaxQueryTimeSlowLogsItem);
        return this;
    }

    public HealthReportSlowLogStat withTopMaxQueryTimeSlowLogs(
        Consumer<List<HealthReportSqlTemplate>> topMaxQueryTimeSlowLogsSetter) {
        if (this.topMaxQueryTimeSlowLogs == null) {
            this.topMaxQueryTimeSlowLogs = new ArrayList<>();
        }
        topMaxQueryTimeSlowLogsSetter.accept(this.topMaxQueryTimeSlowLogs);
        return this;
    }

    /**
     * 慢SQL Top最大执行时间列表。
     * @return topMaxQueryTimeSlowLogs
     */
    public List<HealthReportSqlTemplate> getTopMaxQueryTimeSlowLogs() {
        return topMaxQueryTimeSlowLogs;
    }

    public void setTopMaxQueryTimeSlowLogs(List<HealthReportSqlTemplate> topMaxQueryTimeSlowLogs) {
        this.topMaxQueryTimeSlowLogs = topMaxQueryTimeSlowLogs;
    }

    public HealthReportSlowLogStat withRowsExaminedExceeding(List<HealthReportSqlTemplate> rowsExaminedExceeding) {
        this.rowsExaminedExceeding = rowsExaminedExceeding;
        return this;
    }

    public HealthReportSlowLogStat addRowsExaminedExceedingItem(HealthReportSqlTemplate rowsExaminedExceedingItem) {
        if (this.rowsExaminedExceeding == null) {
            this.rowsExaminedExceeding = new ArrayList<>();
        }
        this.rowsExaminedExceeding.add(rowsExaminedExceedingItem);
        return this;
    }

    public HealthReportSlowLogStat withRowsExaminedExceeding(
        Consumer<List<HealthReportSqlTemplate>> rowsExaminedExceedingSetter) {
        if (this.rowsExaminedExceeding == null) {
            this.rowsExaminedExceeding = new ArrayList<>();
        }
        rowsExaminedExceedingSetter.accept(this.rowsExaminedExceeding);
        return this;
    }

    /**
     * 慢SQL Top扫描返回比列表。
     * @return rowsExaminedExceeding
     */
    public List<HealthReportSqlTemplate> getRowsExaminedExceeding() {
        return rowsExaminedExceeding;
    }

    public void setRowsExaminedExceeding(List<HealthReportSqlTemplate> rowsExaminedExceeding) {
        this.rowsExaminedExceeding = rowsExaminedExceeding;
    }

    public HealthReportSlowLogStat withAnalyzeSuccess(Boolean analyzeSuccess) {
        this.analyzeSuccess = analyzeSuccess;
        return this;
    }

    /**
     * 统计分析是否成功。
     * @return analyzeSuccess
     */
    public Boolean getAnalyzeSuccess() {
        return analyzeSuccess;
    }

    public void setAnalyzeSuccess(Boolean analyzeSuccess) {
        this.analyzeSuccess = analyzeSuccess;
    }

    public HealthReportSlowLogStat withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportSlowLogStat that = (HealthReportSlowLogStat) obj;
        return Objects.equals(this.collectSlowLog, that.collectSlowLog)
            && Objects.equals(this.topExecuteSlowLogs, that.topExecuteSlowLogs)
            && Objects.equals(this.topAvgQueryTimeSlowLogs, that.topAvgQueryTimeSlowLogs)
            && Objects.equals(this.topMaxQueryTimeSlowLogs, that.topMaxQueryTimeSlowLogs)
            && Objects.equals(this.rowsExaminedExceeding, that.rowsExaminedExceeding)
            && Objects.equals(this.analyzeSuccess, that.analyzeSuccess)
            && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectSlowLog,
            topExecuteSlowLogs,
            topAvgQueryTimeSlowLogs,
            topMaxQueryTimeSlowLogs,
            rowsExaminedExceeding,
            analyzeSuccess,
            errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportSlowLogStat {\n");
        sb.append("    collectSlowLog: ").append(toIndentedString(collectSlowLog)).append("\n");
        sb.append("    topExecuteSlowLogs: ").append(toIndentedString(topExecuteSlowLogs)).append("\n");
        sb.append("    topAvgQueryTimeSlowLogs: ").append(toIndentedString(topAvgQueryTimeSlowLogs)).append("\n");
        sb.append("    topMaxQueryTimeSlowLogs: ").append(toIndentedString(topMaxQueryTimeSlowLogs)).append("\n");
        sb.append("    rowsExaminedExceeding: ").append(toIndentedString(rowsExaminedExceeding)).append("\n");
        sb.append("    analyzeSuccess: ").append(toIndentedString(analyzeSuccess)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
