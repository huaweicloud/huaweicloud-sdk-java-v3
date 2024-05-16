package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 可读节点信息。
 */
public class ReadableNodeInfos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_ip")

    private String dataIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    public ReadableNodeInfos withDataIp(String dataIp) {
        this.dataIp = dataIp;
        return this;
    }

    /**
     * 可读节点IP。
     * @return dataIp
     */
    public String getDataIp() {
        return dataIp;
    }

    public void setDataIp(String dataIp) {
        this.dataIp = dataIp;
    }

    public ReadableNodeInfos withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 可读节点ID。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ReadableNodeInfos withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 可读节点名称。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReadableNodeInfos that = (ReadableNodeInfos) obj;
        return Objects.equals(this.dataIp, that.dataIp) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeName, that.nodeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataIp, nodeId, nodeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadableNodeInfos {\n");
        sb.append("    dataIp: ").append(toIndentedString(dataIp)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
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
