package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AttachInternalIpRequestBody
 */
public class AttachInternalIpRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_ip")

    private String newIp;

    public AttachInternalIpRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public AttachInternalIpRequestBody withNewIp(String newIp) {
        this.newIp = newIp;
        return this;
    }

    /**
     * 新的Ip需要为用户可用vpc中的网段。只支持IPV4。
     * @return newIp
     */
    public String getNewIp() {
        return newIp;
    }

    public void setNewIp(String newIp) {
        this.newIp = newIp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttachInternalIpRequestBody attachInternalIpRequestBody = (AttachInternalIpRequestBody) o;
        return Objects.equals(this.nodeId, attachInternalIpRequestBody.nodeId)
            && Objects.equals(this.newIp, attachInternalIpRequestBody.newIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, newIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachInternalIpRequestBody {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    newIp: ").append(toIndentedString(newIp)).append("\n");
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
