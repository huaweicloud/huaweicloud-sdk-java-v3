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
public class ListCheckpointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private List<CheckpointRsp> logs = null;

    public ListCheckpointResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总条数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListCheckpointResponse withLogs(List<CheckpointRsp> logs) {
        this.logs = logs;
        return this;
    }

    public ListCheckpointResponse addLogsItem(CheckpointRsp logsItem) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public ListCheckpointResponse withLogs(Consumer<List<CheckpointRsp>> logsSetter) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        logsSetter.accept(this.logs);
        return this;
    }

    /**
     * 数据作业执行日志
     * @return logs
     */
    public List<CheckpointRsp> getLogs() {
        return logs;
    }

    public void setLogs(List<CheckpointRsp> logs) {
        this.logs = logs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCheckpointResponse listCheckpointResponse = (ListCheckpointResponse) o;
        return Objects.equals(this.count, listCheckpointResponse.count)
            && Objects.equals(this.logs, listCheckpointResponse.logs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, logs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCheckpointResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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
