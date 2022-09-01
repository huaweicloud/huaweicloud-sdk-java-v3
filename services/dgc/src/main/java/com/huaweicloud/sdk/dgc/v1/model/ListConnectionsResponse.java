package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListConnectionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connections")

    @JacksonXmlProperty(localName = "connections")

    private List<ConnectionInfo> connections = null;

    public ListConnectionsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListConnectionsResponse withConnections(List<ConnectionInfo> connections) {
        this.connections = connections;
        return this;
    }

    public ListConnectionsResponse addConnectionsItem(ConnectionInfo connectionsItem) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        this.connections.add(connectionsItem);
        return this;
    }

    public ListConnectionsResponse withConnections(Consumer<List<ConnectionInfo>> connectionsSetter) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        connectionsSetter.accept(this.connections);
        return this;
    }

    /**
     * Get connections
     * @return connections
     */
    public List<ConnectionInfo> getConnections() {
        return connections;
    }

    public void setConnections(List<ConnectionInfo> connections) {
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
        ListConnectionsResponse listConnectionsResponse = (ListConnectionsResponse) o;
        return Objects.equals(this.total, listConnectionsResponse.total)
            && Objects.equals(this.connections, listConnectionsResponse.connections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, connections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConnectionsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
