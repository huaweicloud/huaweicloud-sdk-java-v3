package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClickHouseNodeInfoResponseBodyNodeList
 */
public class ClickHouseNodeInfoResponseBodyNodeList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    public ClickHouseNodeInfoResponseBodyNodeList withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * ClickHouse实例节点id。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ClickHouseNodeInfoResponseBodyNodeList withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * ClickHouse实例节点名称。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public ClickHouseNodeInfoResponseBodyNodeList withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 节点主备角色。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClickHouseNodeInfoResponseBodyNodeList that = (ClickHouseNodeInfoResponseBodyNodeList) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, nodeName, role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClickHouseNodeInfoResponseBodyNodeList {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
