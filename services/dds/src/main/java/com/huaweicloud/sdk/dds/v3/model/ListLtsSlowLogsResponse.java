package com.huaweicloud.sdk.dds.v3.model;

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
public class ListLtsSlowLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_logs")

    private List<SlowLogDetail> slowLogs = null;

    public ListLtsSlowLogsResponse withSlowLogs(List<SlowLogDetail> slowLogs) {
        this.slowLogs = slowLogs;
        return this;
    }

    public ListLtsSlowLogsResponse addSlowLogsItem(SlowLogDetail slowLogsItem) {
        if (this.slowLogs == null) {
            this.slowLogs = new ArrayList<>();
        }
        this.slowLogs.add(slowLogsItem);
        return this;
    }

    public ListLtsSlowLogsResponse withSlowLogs(Consumer<List<SlowLogDetail>> slowLogsSetter) {
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
    public List<SlowLogDetail> getSlowLogs() {
        return slowLogs;
    }

    public void setSlowLogs(List<SlowLogDetail> slowLogs) {
        this.slowLogs = slowLogs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLtsSlowLogsResponse listLtsSlowLogsResponse = (ListLtsSlowLogsResponse) o;
        return Objects.equals(this.slowLogs, listLtsSlowLogsResponse.slowLogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slowLogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLtsSlowLogsResponse {\n");
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
