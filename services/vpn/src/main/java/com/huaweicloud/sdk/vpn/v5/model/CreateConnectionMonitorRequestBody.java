package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateConnectionMonitorRequestBody
 */
public class CreateConnectionMonitorRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_monitor")

    private CreateConnectionMonitorRequestBodyContent connectionMonitor;

    public CreateConnectionMonitorRequestBody withConnectionMonitor(
        CreateConnectionMonitorRequestBodyContent connectionMonitor) {
        this.connectionMonitor = connectionMonitor;
        return this;
    }

    public CreateConnectionMonitorRequestBody withConnectionMonitor(
        Consumer<CreateConnectionMonitorRequestBodyContent> connectionMonitorSetter) {
        if (this.connectionMonitor == null) {
            this.connectionMonitor = new CreateConnectionMonitorRequestBodyContent();
            connectionMonitorSetter.accept(this.connectionMonitor);
        }

        return this;
    }

    /**
     * Get connectionMonitor
     * @return connectionMonitor
     */
    public CreateConnectionMonitorRequestBodyContent getConnectionMonitor() {
        return connectionMonitor;
    }

    public void setConnectionMonitor(CreateConnectionMonitorRequestBodyContent connectionMonitor) {
        this.connectionMonitor = connectionMonitor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateConnectionMonitorRequestBody that = (CreateConnectionMonitorRequestBody) obj;
        return Objects.equals(this.connectionMonitor, that.connectionMonitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionMonitor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConnectionMonitorRequestBody {\n");
        sb.append("    connectionMonitor: ").append(toIndentedString(connectionMonitor)).append("\n");
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
