package com.huaweicloud.sdk.antiddos.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.antiddos.v1.model.DailyLog;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDailyLogResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Long total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logs")
    
    private List<DailyLog> logs = null;
    
    public ListDailyLogResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    


    /**
     * 弹性IP总数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    

    public ListDailyLogResponse withLogs(List<DailyLog> logs) {
        this.logs = logs;
        return this;
    }

    
    public ListDailyLogResponse addLogsItem(DailyLog logsItem) {
        if(this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public ListDailyLogResponse withLogs(Consumer<List<DailyLog>> logsSetter) {
        if(this.logs == null) {
            this.logs = new ArrayList<>();
        }
        logsSetter.accept(this.logs);
        return this;
    }

    /**
     * 异常事件列表
     * @return logs
     */
    public List<DailyLog> getLogs() {
        return logs;
    }

    public void setLogs(List<DailyLog> logs) {
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
        ListDailyLogResponse listDailyLogResponse = (ListDailyLogResponse) o;
        return Objects.equals(this.total, listDailyLogResponse.total) &&
            Objects.equals(this.logs, listDailyLogResponse.logs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, logs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDailyLogResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

