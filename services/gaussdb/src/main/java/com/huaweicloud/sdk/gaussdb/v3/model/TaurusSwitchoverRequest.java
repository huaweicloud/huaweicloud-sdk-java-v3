package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TaurusSwitchoverRequest
 */
public class TaurusSwitchoverRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    
    private String nodeId;

    public TaurusSwitchoverRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 只读节点ID，倒换后为主节点。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaurusSwitchoverRequest taurusSwitchoverRequest = (TaurusSwitchoverRequest) o;
        return Objects.equals(this.nodeId, taurusSwitchoverRequest.nodeId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaurusSwitchoverRequest {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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

