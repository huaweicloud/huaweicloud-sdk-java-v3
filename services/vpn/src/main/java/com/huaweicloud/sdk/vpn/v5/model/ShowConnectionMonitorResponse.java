package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowConnectionMonitorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_monitor")

    private ConnectionMonitorInfo connectionMonitor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowConnectionMonitorResponse withConnectionMonitor(ConnectionMonitorInfo connectionMonitor) {
        this.connectionMonitor = connectionMonitor;
        return this;
    }

    public ShowConnectionMonitorResponse withConnectionMonitor(
        Consumer<ConnectionMonitorInfo> connectionMonitorSetter) {
        if (this.connectionMonitor == null) {
            this.connectionMonitor = new ConnectionMonitorInfo();
            connectionMonitorSetter.accept(this.connectionMonitor);
        }

        return this;
    }

    /**
     * Get connectionMonitor
     * @return connectionMonitor
     */
    public ConnectionMonitorInfo getConnectionMonitor() {
        return connectionMonitor;
    }

    public void setConnectionMonitor(ConnectionMonitorInfo connectionMonitor) {
        this.connectionMonitor = connectionMonitor;
    }

    public ShowConnectionMonitorResponse withRequestId(String requestId) {
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
        ShowConnectionMonitorResponse that = (ShowConnectionMonitorResponse) obj;
        return Objects.equals(this.connectionMonitor, that.connectionMonitor)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionMonitor, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConnectionMonitorResponse {\n");
        sb.append("    connectionMonitor: ").append(toIndentedString(connectionMonitor)).append("\n");
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
