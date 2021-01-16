package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 节点组织
 */
public class NodeOrgs  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_count")
    
    private Integer nodeCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pvc_name")
    
    private String pvcName;

    public NodeOrgs withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 组织名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NodeOrgs withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    


    /**
     * 组织目标节点数
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    public NodeOrgs withPvcName(String pvcName) {
        this.pvcName = pvcName;
        return this;
    }

    


    /**
     * pvc名称，添加组织时需要提供pvc_name
     * @return pvcName
     */
    public String getPvcName() {
        return pvcName;
    }

    public void setPvcName(String pvcName) {
        this.pvcName = pvcName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeOrgs nodeOrgs = (NodeOrgs) o;
        return Objects.equals(this.name, nodeOrgs.name) &&
            Objects.equals(this.nodeCount, nodeOrgs.nodeCount) &&
            Objects.equals(this.pvcName, nodeOrgs.pvcName);
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

