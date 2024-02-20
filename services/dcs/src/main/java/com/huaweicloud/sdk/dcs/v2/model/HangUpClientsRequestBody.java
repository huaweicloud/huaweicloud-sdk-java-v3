package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HangUpClientsRequestBody
 */
public class HangUpClientsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_addrs")

    private List<String> clientAddrs = null;

    public HangUpClientsRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点id
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public HangUpClientsRequestBody withClientAddrs(List<String> clientAddrs) {
        this.clientAddrs = clientAddrs;
        return this;
    }

    public HangUpClientsRequestBody addClientAddrsItem(String clientAddrsItem) {
        if (this.clientAddrs == null) {
            this.clientAddrs = new ArrayList<>();
        }
        this.clientAddrs.add(clientAddrsItem);
        return this;
    }

    public HangUpClientsRequestBody withClientAddrs(Consumer<List<String>> clientAddrsSetter) {
        if (this.clientAddrs == null) {
            this.clientAddrs = new ArrayList<>();
        }
        clientAddrsSetter.accept(this.clientAddrs);
        return this;
    }

    /**
     * 要kill的会话addr列表
     * @return clientAddrs
     */
    public List<String> getClientAddrs() {
        return clientAddrs;
    }

    public void setClientAddrs(List<String> clientAddrs) {
        this.clientAddrs = clientAddrs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HangUpClientsRequestBody that = (HangUpClientsRequestBody) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.clientAddrs, that.clientAddrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, clientAddrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HangUpClientsRequestBody {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    clientAddrs: ").append(toIndentedString(clientAddrs)).append("\n");
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
