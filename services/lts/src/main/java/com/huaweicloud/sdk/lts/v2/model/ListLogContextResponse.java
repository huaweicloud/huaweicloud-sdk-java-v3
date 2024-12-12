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
public class ListLogContextResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private List<LogContents> logs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backwards_count")

    private Integer backwardsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forwards_count")

    private Integer forwardsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isQueryComplete")

    private Boolean isQueryComplete;

    public ListLogContextResponse withLogs(List<LogContents> logs) {
        this.logs = logs;
        return this;
    }

    public ListLogContextResponse addLogsItem(LogContents logsItem) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public ListLogContextResponse withLogs(Consumer<List<LogContents>> logsSetter) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        logsSetter.accept(this.logs);
        return this;
    }

    /**
     * 上下文日志信息。
     * @return logs
     */
    public List<LogContents> getLogs() {
        return logs;
    }

    public void setLogs(List<LogContents> logs) {
        this.logs = logs;
    }

    public ListLogContextResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 返回的总日志条数，包含请求参数中所指定的起始日志。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListLogContextResponse withBackwardsCount(Integer backwardsCount) {
        this.backwardsCount = backwardsCount;
        return this;
    }

    /**
     * 向前查询到的日志条数。
     * minimum: 0
     * maximum: 500
     * @return backwardsCount
     */
    public Integer getBackwardsCount() {
        return backwardsCount;
    }

    public void setBackwardsCount(Integer backwardsCount) {
        this.backwardsCount = backwardsCount;
    }

    public ListLogContextResponse withForwardsCount(Integer forwardsCount) {
        this.forwardsCount = forwardsCount;
        return this;
    }

    /**
     * 向后查询到的日志条数。
     * minimum: 0
     * maximum: 500
     * @return forwardsCount
     */
    public Integer getForwardsCount() {
        return forwardsCount;
    }

    public void setForwardsCount(Integer forwardsCount) {
        this.forwardsCount = forwardsCount;
    }

    public ListLogContextResponse withIsQueryComplete(Boolean isQueryComplete) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLogContextResponse that = (ListLogContextResponse) obj;
        return Objects.equals(this.logs, that.logs) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.backwardsCount, that.backwardsCount)
            && Objects.equals(this.forwardsCount, that.forwardsCount)
            && Objects.equals(this.isQueryComplete, that.isQueryComplete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logs, totalCount, backwardsCount, forwardsCount, isQueryComplete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogContextResponse {\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    backwardsCount: ").append(toIndentedString(backwardsCount)).append("\n");
        sb.append("    forwardsCount: ").append(toIndentedString(forwardsCount)).append("\n");
        sb.append("    isQueryComplete: ").append(toIndentedString(isQueryComplete)).append("\n");
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
