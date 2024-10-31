package com.huaweicloud.sdk.lts.v2.model;

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
public class ListLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private List<LogContents> logs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isQueryComplete")

    private Boolean isQueryComplete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysisLogs")

    private List<Object> analysisLogs = null;

    public ListLogsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 日志条数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListLogsResponse withLogs(List<LogContents> logs) {
        this.logs = logs;
        return this;
    }

    public ListLogsResponse addLogsItem(LogContents logsItem) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public ListLogsResponse withLogs(Consumer<List<LogContents>> logsSetter) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        logsSetter.accept(this.logs);
        return this;
    }

    /**
     * 日志信息。
     * @return logs
     */
    public List<LogContents> getLogs() {
        return logs;
    }

    public void setLogs(List<LogContents> logs) {
        this.logs = logs;
    }

    public ListLogsResponse withIsQueryComplete(Boolean isQueryComplete) {
        this.isQueryComplete = isQueryComplete;
        return this;
    }

    /**
     * 是否查询完成。
     * @return isQueryComplete
     */
    public Boolean getIsQueryComplete() {
        return isQueryComplete;
    }

    public void setIsQueryComplete(Boolean isQueryComplete) {
        this.isQueryComplete = isQueryComplete;
    }

    public ListLogsResponse withAnalysisLogs(List<Object> analysisLogs) {
        this.analysisLogs = analysisLogs;
        return this;
    }

    public ListLogsResponse addAnalysisLogsItem(Object analysisLogsItem) {
        if (this.analysisLogs == null) {
            this.analysisLogs = new ArrayList<>();
        }
        this.analysisLogs.add(analysisLogsItem);
        return this;
    }

    public ListLogsResponse withAnalysisLogs(Consumer<List<Object>> analysisLogsSetter) {
        if (this.analysisLogs == null) {
            this.analysisLogs = new ArrayList<>();
        }
        analysisLogsSetter.accept(this.analysisLogs);
        return this;
    }

    /**
     * 分析日志返回响应体
     * @return analysisLogs
     */
    public List<Object> getAnalysisLogs() {
        return analysisLogs;
    }

    public void setAnalysisLogs(List<Object> analysisLogs) {
        this.analysisLogs = analysisLogs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLogsResponse that = (ListLogsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.logs, that.logs)
            && Objects.equals(this.isQueryComplete, that.isQueryComplete)
            && Objects.equals(this.analysisLogs, that.analysisLogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, logs, isQueryComplete, analysisLogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("    isQueryComplete: ").append(toIndentedString(isQueryComplete)).append("\n");
        sb.append("    analysisLogs: ").append(toIndentedString(analysisLogs)).append("\n");
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
