package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateInstallCmdRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_node_id")
    
    
    private String edgeNodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    
    
    private String arch;

    public CreateInstallCmdRequest withEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
        return this;
    }

    


    /**
     * 边缘节点ID
     * @return edgeNodeId
     */
    public String getEdgeNodeId() {
        return edgeNodeId;
    }

    public void setEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
    }

    

    public CreateInstallCmdRequest withArch(String arch) {
        this.arch = arch;
        return this;
    }

    


    /**
     * 节点架构
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstallCmdRequest createInstallCmdRequest = (CreateInstallCmdRequest) o;
        return Objects.equals(this.edgeNodeId, createInstallCmdRequest.edgeNodeId) &&
            Objects.equals(this.arch, createInstallCmdRequest.arch);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, arch);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstallCmdRequest {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
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

