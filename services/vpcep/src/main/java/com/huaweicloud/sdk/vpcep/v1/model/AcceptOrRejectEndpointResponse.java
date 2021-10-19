package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class AcceptOrRejectEndpointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connections")

    private List<Endpoints> connections = null;

    public AcceptOrRejectEndpointResponse withConnections(List<Endpoints> connections) {
        this.connections = connections;
        return this;
    }

    public AcceptOrRejectEndpointResponse addConnectionsItem(Endpoints connectionsItem) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        this.connections.add(connectionsItem);
        return this;
    }

    public AcceptOrRejectEndpointResponse withConnections(Consumer<List<Endpoints>> connectionsSetter) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        connectionsSetter.accept(this.connections);
        return this;
    }

    /** 连接列表
     * 
     * @return connections */
    public List<Endpoints> getConnections() {
        return connections;
    }

    public void setConnections(List<Endpoints> connections) {
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
        AcceptOrRejectEndpointResponse acceptOrRejectEndpointResponse = (AcceptOrRejectEndpointResponse) o;
        return Objects.equals(this.connections, acceptOrRejectEndpointResponse.connections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AcceptOrRejectEndpointResponse {\n");
        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
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
