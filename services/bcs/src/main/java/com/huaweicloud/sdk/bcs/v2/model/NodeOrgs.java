package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点组织
 */
public class NodeOrgs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_count")

    private Long nodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pvc_name")

    private String pvcName;

    public NodeOrgs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组织名称，IEF节点绑定模式下组织名与IEF节点名称保持一致。支持英文，数字，中文字符和中划线(-), 不能以中划线(-)开头，长度4-24个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NodeOrgs withNodeCount(Long nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * 组织目标节点数, 1-2的正整数
     * @return nodeCount
     */
    public Long getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Long nodeCount) {
        this.nodeCount = nodeCount;
    }

    public NodeOrgs withPvcName(String pvcName) {
        this.pvcName = pvcName;
        return this;
    }

    /**
     * pvc名称，添加组织时需要提供pvc_name。CCE模式必填
     * @return pvcName
     */
    public String getPvcName() {
        return pvcName;
    }

    public void setPvcName(String pvcName) {
        this.pvcName = pvcName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeOrgs that = (NodeOrgs) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.nodeCount, that.nodeCount)
            && Objects.equals(this.pvcName, that.pvcName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nodeCount, pvcName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeOrgs {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
        sb.append("    pvcName: ").append(toIndentedString(pvcName)).append("\n");
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
