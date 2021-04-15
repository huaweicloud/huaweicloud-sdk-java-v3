package com.huaweicloud.sdk.dgc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dgc.v1.model.ConnectionInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListConnectionsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private String total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connections")
    
    private List<ConnectionInfo> connections = null;
    
    public ListConnectionsResponse withTotal(String total) {
        this.total = total;
        return this;
    }

    


    /**
     * Get total
     * @return total
     */
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    

    public ListConnectionsResponse withConnections(List<ConnectionInfo> connections) {
        this.connections = connections;
        return this;
    }

    
    public ListConnectionsResponse addConnectionsItem(ConnectionInfo connectionsItem) {
        if(this.connections == null) {
            this.connections = new ArrayList<>();
        }
        this.connections.add(connectionsItem);
        return this;
    }

    public ListConnectionsResponse withConnections(Consumer<List<ConnectionInfo>> connectionsSetter) {
        if(this.connections == null) {
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
        return Objects.equals(this.total, listConnectionsResponse.total) &&
            Objects.equals(this.connections, listConnectionsResponse.connections);
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

