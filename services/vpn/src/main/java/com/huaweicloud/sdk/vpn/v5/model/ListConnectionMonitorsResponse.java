package com.huaweicloud.sdk.vpn.v5.model;

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
public class ListConnectionMonitorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_monitors")

    private List<ConnectionMonitorInfo> connectionMonitors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListConnectionMonitorsResponse withConnectionMonitors(List<ConnectionMonitorInfo> connectionMonitors) {
        this.connectionMonitors = connectionMonitors;
        return this;
    }

    public ListConnectionMonitorsResponse addConnectionMonitorsItem(ConnectionMonitorInfo connectionMonitorsItem) {
        if (this.connectionMonitors == null) {
            this.connectionMonitors = new ArrayList<>();
        }
        this.connectionMonitors.add(connectionMonitorsItem);
        return this;
    }

    public ListConnectionMonitorsResponse withConnectionMonitors(
        Consumer<List<ConnectionMonitorInfo>> connectionMonitorsSetter) {
        if (this.connectionMonitors == null) {
            this.connectionMonitors = new ArrayList<>();
        }
        connectionMonitorsSetter.accept(this.connectionMonitors);
        return this;
    }

    /**
     * Get connectionMonitors
     * @return connectionMonitors
     */
    public List<ConnectionMonitorInfo> getConnectionMonitors() {
        return connectionMonitors;
    }

    public void setConnectionMonitors(List<ConnectionMonitorInfo> connectionMonitors) {
        this.connectionMonitors = connectionMonitors;
    }

    public ListConnectionMonitorsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConnectionMonitorsResponse that = (ListConnectionMonitorsResponse) obj;
        return Objects.equals(this.connectionMonitors, that.connectionMonitors)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionMonitors, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConnectionMonitorsResponse {\n");
        sb.append("    connectionMonitors: ").append(toIndentedString(connectionMonitors)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
