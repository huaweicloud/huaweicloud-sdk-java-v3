package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceTopSlowLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_slow_log")

    private Boolean collectSlowLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_execute_slow_logs")

    private List<InsTopSlowLogInfo> topExecuteSlowLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_avg_query_time_slow_logs")

    private List<InsTopSlowLogInfo> topAvgQueryTimeSlowLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_max_query_time_slow_logs")

    private List<InsTopSlowLogInfo> topMaxQueryTimeSlowLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined_exceeding")

    private List<InsTopSlowLogInfo> rowsExaminedExceeding = null;

    public ShowInstanceTopSlowLogResponse withCollectSlowLog(Boolean collectSlowLog) {
        this.collectSlowLog = collectSlowLog;
        return this;
    }

    /**
     * 采集慢SQL开关
     * @return collectSlowLog
     */
    public Boolean getCollectSlowLog() {
        return collectSlowLog;
    }

    public void setCollectSlowLog(Boolean collectSlowLog) {
        this.collectSlowLog = collectSlowLog;
    }

    public ShowInstanceTopSlowLogResponse withTopExecuteSlowLogs(List<InsTopSlowLogInfo> topExecuteSlowLogs) {
        this.topExecuteSlowLogs = topExecuteSlowLogs;
        return this;
    }

    public ShowInstanceTopSlowLogResponse addTopExecuteSlowLogsItem(InsTopSlowLogInfo topExecuteSlowLogsItem) {
        if (this.topExecuteSlowLogs == null) {
            this.topExecuteSlowLogs = new ArrayList<>();
        }
        this.topExecuteSlowLogs.add(topExecuteSlowLogsItem);
        return this;
    }

    public ShowInstanceTopSlowLogResponse withTopExecuteSlowLogs(
        Consumer<List<InsTopSlowLogInfo>> topExecuteSlowLogsSetter) {
        if (this.topExecuteSlowLogs == null) {
            this.topExecuteSlowLogs = new ArrayList<>();
        }
        topExecuteSlowLogsSetter.accept(this.topExecuteSlowLogs);
        return this;
    }

    /**
     * 按执行次数排序的慢SQL列表
     * @return topExecuteSlowLogs
     */
    public List<InsTopSlowLogInfo> getTopExecuteSlowLogs() {
        return topExecuteSlowLogs;
    }

    public void setTopExecuteSlowLogs(List<InsTopSlowLogInfo> topExecuteSlowLogs) {
        this.topExecuteSlowLogs = topExecuteSlowLogs;
    }

    public ShowInstanceTopSlowLogResponse withTopAvgQueryTimeSlowLogs(List<InsTopSlowLogInfo> topAvgQueryTimeSlowLogs) {
        this.topAvgQueryTimeSlowLogs = topAvgQueryTimeSlowLogs;
        return this;
    }

    public ShowInstanceTopSlowLogResponse addTopAvgQueryTimeSlowLogsItem(
        InsTopSlowLogInfo topAvgQueryTimeSlowLogsItem) {
        if (this.topAvgQueryTimeSlowLogs == null) {
            this.topAvgQueryTimeSlowLogs = new ArrayList<>();
        }
        this.topAvgQueryTimeSlowLogs.add(topAvgQueryTimeSlowLogsItem);
        return this;
    }

    public ShowInstanceTopSlowLogResponse withTopAvgQueryTimeSlowLogs(
        Consumer<List<InsTopSlowLogInfo>> topAvgQueryTimeSlowLogsSetter) {
        if (this.topAvgQueryTimeSlowLogs == null) {
            this.topAvgQueryTimeSlowLogs = new ArrayList<>();
        }
        topAvgQueryTimeSlowLogsSetter.accept(this.topAvgQueryTimeSlowLogs);
        return this;
    }

    /**
     * 按平均执行时间排序的慢SQL列表
     * @return topAvgQueryTimeSlowLogs
     */
    public List<InsTopSlowLogInfo> getTopAvgQueryTimeSlowLogs() {
        return topAvgQueryTimeSlowLogs;
    }

    public void setTopAvgQueryTimeSlowLogs(List<InsTopSlowLogInfo> topAvgQueryTimeSlowLogs) {
        this.topAvgQueryTimeSlowLogs = topAvgQueryTimeSlowLogs;
    }

    public ShowInstanceTopSlowLogResponse withTopMaxQueryTimeSlowLogs(List<InsTopSlowLogInfo> topMaxQueryTimeSlowLogs) {
        this.topMaxQueryTimeSlowLogs = topMaxQueryTimeSlowLogs;
        return this;
    }

    public ShowInstanceTopSlowLogResponse addTopMaxQueryTimeSlowLogsItem(
        InsTopSlowLogInfo topMaxQueryTimeSlowLogsItem) {
        if (this.topMaxQueryTimeSlowLogs == null) {
            this.topMaxQueryTimeSlowLogs = new ArrayList<>();
        }
        this.topMaxQueryTimeSlowLogs.add(topMaxQueryTimeSlowLogsItem);
        return this;
    }

    public ShowInstanceTopSlowLogResponse withTopMaxQueryTimeSlowLogs(
        Consumer<List<InsTopSlowLogInfo>> topMaxQueryTimeSlowLogsSetter) {
        if (this.topMaxQueryTimeSlowLogs == null) {
            this.topMaxQueryTimeSlowLogs = new ArrayList<>();
        }
        topMaxQueryTimeSlowLogsSetter.accept(this.topMaxQueryTimeSlowLogs);
        return this;
    }

    /**
     * 按最大执行时间排序的慢SQL列表
     * @return topMaxQueryTimeSlowLogs
     */
    public List<InsTopSlowLogInfo> getTopMaxQueryTimeSlowLogs() {
        return topMaxQueryTimeSlowLogs;
    }

    public void setTopMaxQueryTimeSlowLogs(List<InsTopSlowLogInfo> topMaxQueryTimeSlowLogs) {
        this.topMaxQueryTimeSlowLogs = topMaxQueryTimeSlowLogs;
    }

    public ShowInstanceTopSlowLogResponse withRowsExaminedExceeding(List<InsTopSlowLogInfo> rowsExaminedExceeding) {
        this.rowsExaminedExceeding = rowsExaminedExceeding;
        return this;
    }

    public ShowInstanceTopSlowLogResponse addRowsExaminedExceedingItem(InsTopSlowLogInfo rowsExaminedExceedingItem) {
        if (this.rowsExaminedExceeding == null) {
            this.rowsExaminedExceeding = new ArrayList<>();
        }
        this.rowsExaminedExceeding.add(rowsExaminedExceedingItem);
        return this;
    }

    public ShowInstanceTopSlowLogResponse withRowsExaminedExceeding(
        Consumer<List<InsTopSlowLogInfo>> rowsExaminedExceedingSetter) {
        if (this.rowsExaminedExceeding == null) {
            this.rowsExaminedExceeding = new ArrayList<>();
        }
        rowsExaminedExceedingSetter.accept(this.rowsExaminedExceeding);
        return this;
    }

    /**
     * 按扫描返回比排序的慢SQL列表
     * @return rowsExaminedExceeding
     */
    public List<InsTopSlowLogInfo> getRowsExaminedExceeding() {
        return rowsExaminedExceeding;
    }

    public void setRowsExaminedExceeding(List<InsTopSlowLogInfo> rowsExaminedExceeding) {
        this.rowsExaminedExceeding = rowsExaminedExceeding;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceTopSlowLogResponse that = (ShowInstanceTopSlowLogResponse) obj;
        return Objects.equals(this.collectSlowLog, that.collectSlowLog)
            && Objects.equals(this.topExecuteSlowLogs, that.topExecuteSlowLogs)
            && Objects.equals(this.topAvgQueryTimeSlowLogs, that.topAvgQueryTimeSlowLogs)
            && Objects.equals(this.topMaxQueryTimeSlowLogs, that.topMaxQueryTimeSlowLogs)
            && Objects.equals(this.rowsExaminedExceeding, that.rowsExaminedExceeding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectSlowLog,
            topExecuteSlowLogs,
            topAvgQueryTimeSlowLogs,
            topMaxQueryTimeSlowLogs,
            rowsExaminedExceeding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceTopSlowLogResponse {\n");
        sb.append("    collectSlowLog: ").append(toIndentedString(collectSlowLog)).append("\n");
        sb.append("    topExecuteSlowLogs: ").append(toIndentedString(topExecuteSlowLogs)).append("\n");
        sb.append("    topAvgQueryTimeSlowLogs: ").append(toIndentedString(topAvgQueryTimeSlowLogs)).append("\n");
        sb.append("    topMaxQueryTimeSlowLogs: ").append(toIndentedString(topMaxQueryTimeSlowLogs)).append("\n");
        sb.append("    rowsExaminedExceeding: ").append(toIndentedString(rowsExaminedExceeding)).append("\n");
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
