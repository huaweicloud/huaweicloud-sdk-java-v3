package com.huaweicloud.sdk.iotedge.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 集群节点信息
 */
public class NodeConfig  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_ip")
    

    private String nodeIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_name")
    

    private String nodeName;

    public NodeConfig withNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }

    


    /**
     * 节点IP
     * @return nodeIp
     */
    public String getNodeIp() {
        return nodeIp;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    

    public NodeConfig withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    


    /**
     * 节点名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeConfig nodeConfig = (NodeConfig) o;
        return Objects.equals(this.nodeIp, nodeConfig.nodeIp) &&
            Objects.equals(this.nodeName, nodeConfig.nodeName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeIp, nodeName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeConfig {\n");
        sb.append("    nodeIp: ").append(toIndentedString(nodeIp)).append("\n");
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

