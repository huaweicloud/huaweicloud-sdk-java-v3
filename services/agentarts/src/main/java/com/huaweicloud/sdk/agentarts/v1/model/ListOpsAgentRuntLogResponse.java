package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListOpsAgentRuntLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_query_complete")

    private Boolean isQueryComplete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private List<AgentLogContent> logs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scroll_id")

    private String scrollId;

    public ListOpsAgentRuntLogResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 日志数
     * minimum: 0
     * maximum: 1000000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListOpsAgentRuntLogResponse withIsQueryComplete(Boolean isQueryComplete) {
        this.isQueryComplete = isQueryComplete;
        return this;
    }

    /**
     * 是否查询完成
     * @return isQueryComplete
     */
    public Boolean getIsQueryComplete() {
        return isQueryComplete;
    }

    public void setIsQueryComplete(Boolean isQueryComplete) {
        this.isQueryComplete = isQueryComplete;
    }

    public ListOpsAgentRuntLogResponse withLogs(List<AgentLogContent> logs) {
        this.logs = logs;
        return this;
    }

    public ListOpsAgentRuntLogResponse addLogsItem(AgentLogContent logsItem) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public ListOpsAgentRuntLogResponse withLogs(Consumer<List<AgentLogContent>> logsSetter) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        logsSetter.accept(this.logs);
        return this;
    }

    /**
     * 日志内容
     * @return logs
     */
    public List<AgentLogContent> getLogs() {
        return logs;
    }

    public void setLogs(List<AgentLogContent> logs) {
        this.logs = logs;
    }

    public ListOpsAgentRuntLogResponse withScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }

    /**
     * Get scrollId
     * @return scrollId
     */
    public String getScrollId() {
        return scrollId;
    }

    public void setScrollId(String scrollId) {
        this.scrollId = scrollId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsAgentRuntLogResponse that = (ListOpsAgentRuntLogResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.isQueryComplete, that.isQueryComplete)
            && Objects.equals(this.logs, that.logs) && Objects.equals(this.scrollId, that.scrollId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, isQueryComplete, logs, scrollId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsAgentRuntLogResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    isQueryComplete: ").append(toIndentedString(isQueryComplete)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("    scrollId: ").append(toIndentedString(scrollId)).append("\n");
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
