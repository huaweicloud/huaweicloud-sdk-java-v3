package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * FollowerMigrateRequest
 */
public class FollowerMigrateRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodeId")
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="azCode")
    
    private String azCode;

    public FollowerMigrateRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 备机节点Id
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public FollowerMigrateRequest withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    


    /**
     * 要迁入的可用区code
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FollowerMigrateRequest followerMigrateRequest = (FollowerMigrateRequest) o;
        return Objects.equals(this.nodeId, followerMigrateRequest.nodeId) &&
            Objects.equals(this.azCode, followerMigrateRequest.azCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeId, azCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FollowerMigrateRequest {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
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

