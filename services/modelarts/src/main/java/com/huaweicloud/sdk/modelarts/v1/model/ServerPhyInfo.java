package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ServerPhyInfo
 */
public class ServerPhyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_nodes")

    private List<String> networkNodes = null;

    public ServerPhyInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释**：Lite Server实例资源ID。 **取值范围**：长度为[8,36]个字符。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ServerPhyInfo withNetworkNodes(List<String> networkNodes) {
        this.networkNodes = networkNodes;
        return this;
    }

    public ServerPhyInfo addNetworkNodesItem(String networkNodesItem) {
        if (this.networkNodes == null) {
            this.networkNodes = new ArrayList<>();
        }
        this.networkNodes.add(networkNodesItem);
        return this;
    }

    public ServerPhyInfo withNetworkNodes(Consumer<List<String>> networkNodesSetter) {
        if (this.networkNodes == null) {
            this.networkNodes = new ArrayList<>();
        }
        networkNodesSetter.accept(this.networkNodes);
        return this;
    }

    /**
     * **参数解释**：Tor信息。 **取值范围**：多个ip信息，IPv4格式。
     * @return networkNodes
     */
    public List<String> getNetworkNodes() {
        return networkNodes;
    }

    public void setNetworkNodes(List<String> networkNodes) {
        this.networkNodes = networkNodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerPhyInfo that = (ServerPhyInfo) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.networkNodes, that.networkNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, networkNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerPhyInfo {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    networkNodes: ").append(toIndentedString(networkNodes)).append("\n");
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
