package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ShowJobLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private List<LogContentDto> logs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_storage_link")

    private String logStorageLink;

    public ShowJobLogResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 作业日志条数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowJobLogResponse withLogs(List<LogContentDto> logs) {
        this.logs = logs;
        return this;
    }

    public ShowJobLogResponse addLogsItem(LogContentDto logsItem) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public ShowJobLogResponse withLogs(Consumer<List<LogContentDto>> logsSetter) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        logsSetter.accept(this.logs);
        return this;
    }

    /**
     * 作业日志内容列表
     * @return logs
     */
    public List<LogContentDto> getLogs() {
        return logs;
    }

    public void setLogs(List<LogContentDto> logs) {
        this.logs = logs;
    }

    public ShowJobLogResponse withLogStorageLink(String logStorageLink) {
        this.logStorageLink = logStorageLink;
        return this;
    }

    /**
     * 作业日志存储链接
     * @return logStorageLink
     */
    public String getLogStorageLink() {
        return logStorageLink;
    }

    public void setLogStorageLink(String logStorageLink) {
        this.logStorageLink = logStorageLink;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobLogResponse that = (ShowJobLogResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.logs, that.logs)
            && Objects.equals(this.logStorageLink, that.logStorageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, logs, logStorageLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobLogResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("    logStorageLink: ").append(toIndentedString(logStorageLink)).append("\n");
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
