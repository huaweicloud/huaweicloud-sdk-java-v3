package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListDomainLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private List<CdnLog> logs = null;

    public ListDomainLogsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 日志总数。
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListDomainLogsResponse withLogs(List<CdnLog> logs) {
        this.logs = logs;
        return this;
    }

    public ListDomainLogsResponse addLogsItem(CdnLog logsItem) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public ListDomainLogsResponse withLogs(Consumer<List<CdnLog>> logsSetter) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        logsSetter.accept(this.logs);
        return this;
    }

    /** 日志列表数据。
     * 
     * @return logs */
    public List<CdnLog> getLogs() {
        return logs;
    }

    public void setLogs(List<CdnLog> logs) {
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
        ListDomainLogsResponse listDomainLogsResponse = (ListDomainLogsResponse) o;
        return Objects.equals(this.total, listDomainLogsResponse.total)
            && Objects.equals(this.logs, listDomainLogsResponse.logs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, logs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainLogsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
