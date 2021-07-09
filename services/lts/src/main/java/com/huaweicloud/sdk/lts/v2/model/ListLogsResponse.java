package com.huaweicloud.sdk.lts.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.lts.v2.model.LogContents;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListLogsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logs")
    
    private List<LogContents> logs = null;
    
    public ListLogsResponse withLogs(List<LogContents> logs) {
        this.logs = logs;
        return this;
    }

    
    public ListLogsResponse addLogsItem(LogContents logsItem) {
        if(this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public ListLogsResponse withLogs(Consumer<List<LogContents>> logsSetter) {
        if(this.logs == null) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLogsResponse listLogsResponse = (ListLogsResponse) o;
        return Objects.equals(this.logs, listLogsResponse.logs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(logs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogsResponse {\n");
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

