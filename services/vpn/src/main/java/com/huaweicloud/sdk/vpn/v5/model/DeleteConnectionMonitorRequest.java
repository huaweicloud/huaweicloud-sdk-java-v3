package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteConnectionMonitorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_monitor_id")

    private String connectionMonitorId;

    public DeleteConnectionMonitorRequest withConnectionMonitorId(String connectionMonitorId) {
        this.connectionMonitorId = connectionMonitorId;
        return this;
    }

    /**
     * VPN连接监控的ID
     * @return connectionMonitorId
     */
    public String getConnectionMonitorId() {
        return connectionMonitorId;
    }

    public void setConnectionMonitorId(String connectionMonitorId) {
        this.connectionMonitorId = connectionMonitorId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteConnectionMonitorRequest that = (DeleteConnectionMonitorRequest) obj;
        return Objects.equals(this.connectionMonitorId, that.connectionMonitorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionMonitorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteConnectionMonitorRequest {\n");
        sb.append("    connectionMonitorId: ").append(toIndentedString(connectionMonitorId)).append("\n");
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
