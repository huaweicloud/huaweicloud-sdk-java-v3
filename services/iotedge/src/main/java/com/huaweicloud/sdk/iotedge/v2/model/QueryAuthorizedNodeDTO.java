package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QueryAuthorizedNodeDTO
 */
public class QueryAuthorizedNodeDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authorized_time")
    
    
    private String authorizedTime;

    public QueryAuthorizedNodeDTO withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 边缘节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public QueryAuthorizedNodeDTO withAuthorizedTime(String authorizedTime) {
        this.authorizedTime = authorizedTime;
        return this;
    }

    


    /**
     * 授权时间
     * @return authorizedTime
     */
    public String getAuthorizedTime() {
        return authorizedTime;
    }

    public void setAuthorizedTime(String authorizedTime) {
        this.authorizedTime = authorizedTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryAuthorizedNodeDTO queryAuthorizedNodeDTO = (QueryAuthorizedNodeDTO) o;
        return Objects.equals(this.nodeId, queryAuthorizedNodeDTO.nodeId) &&
            Objects.equals(this.authorizedTime, queryAuthorizedNodeDTO.authorizedTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeId, authorizedTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryAuthorizedNodeDTO {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    authorizedTime: ").append(toIndentedString(authorizedTime)).append("\n");
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

