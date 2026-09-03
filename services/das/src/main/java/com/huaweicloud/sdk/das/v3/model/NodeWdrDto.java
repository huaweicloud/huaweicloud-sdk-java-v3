package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点WDR报表信息
 */
public class NodeWdrDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_wdr")

    private String nodeWdr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    public NodeWdrDto withNodeWdr(String nodeWdr) {
        this.nodeWdr = nodeWdr;
        return this;
    }

    /**
     * 节点WDR报表下载地址
     * @return nodeWdr
     */
    public String getNodeWdr() {
        return nodeWdr;
    }

    public void setNodeWdr(String nodeWdr) {
        this.nodeWdr = nodeWdr;
    }

    public NodeWdrDto withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点WDR报表名称
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
        NodeWdrDto that = (NodeWdrDto) obj;
        return Objects.equals(this.nodeWdr, that.nodeWdr) && Objects.equals(this.nodeName, that.nodeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeWdr, nodeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeWdrDto {\n");
        sb.append("    nodeWdr: ").append(toIndentedString(nodeWdr)).append("\n");
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
