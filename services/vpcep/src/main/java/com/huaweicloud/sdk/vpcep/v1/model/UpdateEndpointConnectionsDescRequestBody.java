package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateEndpointConnectionsDescRequestBody
 */
public class UpdateEndpointConnectionsDescRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connections")

    private List<ConnectionsDesc> connections = null;

    public UpdateEndpointConnectionsDescRequestBody withConnections(List<ConnectionsDesc> connections) {
        this.connections = connections;
        return this;
    }

    public UpdateEndpointConnectionsDescRequestBody addConnectionsItem(ConnectionsDesc connectionsItem) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        this.connections.add(connectionsItem);
        return this;
    }

    public UpdateEndpointConnectionsDescRequestBody withConnections(Consumer<List<ConnectionsDesc>> connectionsSetter) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        connectionsSetter.accept(this.connections);
        return this;
    }

    /**
     * 连接管理描述字段列表
     * @return connections
     */
    public List<ConnectionsDesc> getConnections() {
        return connections;
    }

    public void setConnections(List<ConnectionsDesc> connections) {
        this.connections = connections;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEndpointConnectionsDescRequestBody that = (UpdateEndpointConnectionsDescRequestBody) obj;
        return Objects.equals(this.connections, that.connections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointConnectionsDescRequestBody {\n");
        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
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
