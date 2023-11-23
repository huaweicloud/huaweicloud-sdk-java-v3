package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ListCassandraSlowLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_logs")

    private List<CassandraSlowLogDetail> slowLogs = null;

    public ListCassandraSlowLogsResponse withSlowLogs(List<CassandraSlowLogDetail> slowLogs) {
        this.slowLogs = slowLogs;
        return this;
    }

    public ListCassandraSlowLogsResponse addSlowLogsItem(CassandraSlowLogDetail slowLogsItem) {
        if (this.slowLogs == null) {
            this.slowLogs = new ArrayList<>();
        }
        this.slowLogs.add(slowLogsItem);
        return this;
    }

    public ListCassandraSlowLogsResponse withSlowLogs(Consumer<List<CassandraSlowLogDetail>> slowLogsSetter) {
        if (this.slowLogs == null) {
            this.slowLogs = new ArrayList<>();
        }
        slowLogsSetter.accept(this.slowLogs);
        return this;
    }

    /**
     * 慢日志具体信息。
     * @return slowLogs
     */
    public List<CassandraSlowLogDetail> getSlowLogs() {
        return slowLogs;
    }

    public void setSlowLogs(List<CassandraSlowLogDetail> slowLogs) {
        this.slowLogs = slowLogs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCassandraSlowLogsResponse that = (ListCassandraSlowLogsResponse) obj;
        return Objects.equals(this.slowLogs, that.slowLogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slowLogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCassandraSlowLogsResponse {\n");
        sb.append("    slowLogs: ").append(toIndentedString(slowLogs)).append("\n");
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
