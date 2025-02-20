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
public class ListInstanceTopSlowLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_execute_slow_logs")

    private List<TopInstanceSlowLogTopExecuteSlowLogs> topExecuteSlowLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_avg_query_time_slow_logs")

    private List<TopInstanceSlowLogTopExecuteSlowLogs> topAvgQueryTimeSlowLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_max_query_time_slow_logs")

    private List<TopInstanceSlowLogTopExecuteSlowLogs> topMaxQueryTimeSlowLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined_exceeding")

    private List<TopInstanceSlowLogRowsExaminedExceeding> rowsExaminedExceeding = null;

    public ListInstanceTopSlowLogResponse withTopExecuteSlowLogs(
        List<TopInstanceSlowLogTopExecuteSlowLogs> topExecuteSlowLogs) {
        this.topExecuteSlowLogs = topExecuteSlowLogs;
        return this;
    }

    public ListInstanceTopSlowLogResponse addTopExecuteSlowLogsItem(
        TopInstanceSlowLogTopExecuteSlowLogs topExecuteSlowLogsItem) {
        if (this.topExecuteSlowLogs == null) {
            this.topExecuteSlowLogs = new ArrayList<>();
        }
        this.topExecuteSlowLogs.add(topExecuteSlowLogsItem);
        return this;
    }

    public ListInstanceTopSlowLogResponse withTopExecuteSlowLogs(
        Consumer<List<TopInstanceSlowLogTopExecuteSlowLogs>> topExecuteSlowLogsSetter) {
        if (this.topExecuteSlowLogs == null) {
            this.topExecuteSlowLogs = new ArrayList<>();
        }
        topExecuteSlowLogsSetter.accept(this.topExecuteSlowLogs);
        return this;
    }

    /**
     * 执行次数列表
     * @return topExecuteSlowLogs
     */
    public List<TopInstanceSlowLogTopExecuteSlowLogs> getTopExecuteSlowLogs() {
        return topExecuteSlowLogs;
    }

    public void setTopExecuteSlowLogs(List<TopInstanceSlowLogTopExecuteSlowLogs> topExecuteSlowLogs) {
        this.topExecuteSlowLogs = topExecuteSlowLogs;
    }

    public ListInstanceTopSlowLogResponse withTopAvgQueryTimeSlowLogs(
        List<TopInstanceSlowLogTopExecuteSlowLogs> topAvgQueryTimeSlowLogs) {
        this.topAvgQueryTimeSlowLogs = topAvgQueryTimeSlowLogs;
        return this;
    }

    public ListInstanceTopSlowLogResponse addTopAvgQueryTimeSlowLogsItem(
        TopInstanceSlowLogTopExecuteSlowLogs topAvgQueryTimeSlowLogsItem) {
        if (this.topAvgQueryTimeSlowLogs == null) {
            this.topAvgQueryTimeSlowLogs = new ArrayList<>();
        }
        this.topAvgQueryTimeSlowLogs.add(topAvgQueryTimeSlowLogsItem);
        return this;
    }

    public ListInstanceTopSlowLogResponse withTopAvgQueryTimeSlowLogs(
        Consumer<List<TopInstanceSlowLogTopExecuteSlowLogs>> topAvgQueryTimeSlowLogsSetter) {
        if (this.topAvgQueryTimeSlowLogs == null) {
            this.topAvgQueryTimeSlowLogs = new ArrayList<>();
        }
        topAvgQueryTimeSlowLogsSetter.accept(this.topAvgQueryTimeSlowLogs);
        return this;
    }

    /**
     * 平均执行时间列表
     * @return topAvgQueryTimeSlowLogs
     */
    public List<TopInstanceSlowLogTopExecuteSlowLogs> getTopAvgQueryTimeSlowLogs() {
        return topAvgQueryTimeSlowLogs;
    }

    public void setTopAvgQueryTimeSlowLogs(List<TopInstanceSlowLogTopExecuteSlowLogs> topAvgQueryTimeSlowLogs) {
        this.topAvgQueryTimeSlowLogs = topAvgQueryTimeSlowLogs;
    }

    public ListInstanceTopSlowLogResponse withTopMaxQueryTimeSlowLogs(
        List<TopInstanceSlowLogTopExecuteSlowLogs> topMaxQueryTimeSlowLogs) {
        this.topMaxQueryTimeSlowLogs = topMaxQueryTimeSlowLogs;
        return this;
    }

    public ListInstanceTopSlowLogResponse addTopMaxQueryTimeSlowLogsItem(
        TopInstanceSlowLogTopExecuteSlowLogs topMaxQueryTimeSlowLogsItem) {
        if (this.topMaxQueryTimeSlowLogs == null) {
            this.topMaxQueryTimeSlowLogs = new ArrayList<>();
        }
        this.topMaxQueryTimeSlowLogs.add(topMaxQueryTimeSlowLogsItem);
        return this;
    }

    public ListInstanceTopSlowLogResponse withTopMaxQueryTimeSlowLogs(
        Consumer<List<TopInstanceSlowLogTopExecuteSlowLogs>> topMaxQueryTimeSlowLogsSetter) {
        if (this.topMaxQueryTimeSlowLogs == null) {
            this.topMaxQueryTimeSlowLogs = new ArrayList<>();
        }
        topMaxQueryTimeSlowLogsSetter.accept(this.topMaxQueryTimeSlowLogs);
        return this;
    }

    /**
     * 最大执行时间列表
     * @return topMaxQueryTimeSlowLogs
     */
    public List<TopInstanceSlowLogTopExecuteSlowLogs> getTopMaxQueryTimeSlowLogs() {
        return topMaxQueryTimeSlowLogs;
    }

    public void setTopMaxQueryTimeSlowLogs(List<TopInstanceSlowLogTopExecuteSlowLogs> topMaxQueryTimeSlowLogs) {
        this.topMaxQueryTimeSlowLogs = topMaxQueryTimeSlowLogs;
    }

    public ListInstanceTopSlowLogResponse withRowsExaminedExceeding(
        List<TopInstanceSlowLogRowsExaminedExceeding> rowsExaminedExceeding) {
        this.rowsExaminedExceeding = rowsExaminedExceeding;
        return this;
    }

    public ListInstanceTopSlowLogResponse addRowsExaminedExceedingItem(
        TopInstanceSlowLogRowsExaminedExceeding rowsExaminedExceedingItem) {
        if (this.rowsExaminedExceeding == null) {
            this.rowsExaminedExceeding = new ArrayList<>();
        }
        this.rowsExaminedExceeding.add(rowsExaminedExceedingItem);
        return this;
    }

    public ListInstanceTopSlowLogResponse withRowsExaminedExceeding(
        Consumer<List<TopInstanceSlowLogRowsExaminedExceeding>> rowsExaminedExceedingSetter) {
        if (this.rowsExaminedExceeding == null) {
            this.rowsExaminedExceeding = new ArrayList<>();
        }
        rowsExaminedExceedingSetter.accept(this.rowsExaminedExceeding);
        return this;
    }

    /**
     * 扫描返回比列表
     * @return rowsExaminedExceeding
     */
    public List<TopInstanceSlowLogRowsExaminedExceeding> getRowsExaminedExceeding() {
        return rowsExaminedExceeding;
    }

    public void setRowsExaminedExceeding(List<TopInstanceSlowLogRowsExaminedExceeding> rowsExaminedExceeding) {
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
        ListInstanceTopSlowLogResponse that = (ListInstanceTopSlowLogResponse) obj;
        return Objects.equals(this.topExecuteSlowLogs, that.topExecuteSlowLogs)
            && Objects.equals(this.topAvgQueryTimeSlowLogs, that.topAvgQueryTimeSlowLogs)
            && Objects.equals(this.topMaxQueryTimeSlowLogs, that.topMaxQueryTimeSlowLogs)
            && Objects.equals(this.rowsExaminedExceeding, that.rowsExaminedExceeding);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(topExecuteSlowLogs, topAvgQueryTimeSlowLogs, topMaxQueryTimeSlowLogs, rowsExaminedExceeding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceTopSlowLogResponse {\n");
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
