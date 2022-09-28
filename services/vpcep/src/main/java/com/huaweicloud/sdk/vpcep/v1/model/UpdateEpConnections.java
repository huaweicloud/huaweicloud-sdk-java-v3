package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateEpConnections
 */
public class UpdateEpConnections {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connections")

    private List<ConnectionsDesc> connections = null;

    public UpdateEpConnections withConnections(List<ConnectionsDesc> connections) {
        this.connections = connections;
        return this;
    }

    public UpdateEpConnections addConnectionsItem(ConnectionsDesc connectionsItem) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        this.connections.add(connectionsItem);
        return this;
    }

    public UpdateEpConnections withConnections(Consumer<List<ConnectionsDesc>> connectionsSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEpConnections updateEpConnections = (UpdateEpConnections) o;
        return Objects.equals(this.connections, updateEpConnections.connections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEpConnections {\n");
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
