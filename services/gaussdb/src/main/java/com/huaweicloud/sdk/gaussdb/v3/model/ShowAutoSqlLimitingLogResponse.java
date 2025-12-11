package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowAutoSqlLimitingLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private List<AutoSqlLimitingLog> logs = null;

    public ShowAutoSqlLimitingLogResponse withLogs(List<AutoSqlLimitingLog> logs) {
        this.logs = logs;
        return this;
    }

    public ShowAutoSqlLimitingLogResponse addLogsItem(AutoSqlLimitingLog logsItem) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public ShowAutoSqlLimitingLogResponse withLogs(Consumer<List<AutoSqlLimitingLog>> logsSetter) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        logsSetter.accept(this.logs);
        return this;
    }

    /**
     * **参数解释**：  查询自治限流执行记录列表。  **约束限制**：  不涉及。
     * @return logs
     */
    public List<AutoSqlLimitingLog> getLogs() {
        return logs;
    }

    public void setLogs(List<AutoSqlLimitingLog> logs) {
        this.logs = logs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutoSqlLimitingLogResponse that = (ShowAutoSqlLimitingLogResponse) obj;
        return Objects.equals(this.logs, that.logs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoSqlLimitingLogResponse {\n");
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
