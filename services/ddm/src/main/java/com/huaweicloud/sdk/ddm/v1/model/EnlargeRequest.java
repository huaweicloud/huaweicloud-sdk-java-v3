package com.huaweicloud.sdk.ddm.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto request Object
 */
public class EnlargeRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor_id")
    
    private String flavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_number")
    
    private Integer nodeNumber;

    public EnlargeRequest withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    


    /**
     * 当前进行节点扩容的DDM实例底层虚机规格id
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    

    public EnlargeRequest withNodeNumber(Integer nodeNumber) {
        this.nodeNumber = nodeNumber;
        return this;
    }

    


    /**
     * 需要扩容的节点个数
     * @return nodeNumber
     */
    public Integer getNodeNumber() {
        return nodeNumber;
    }

    public void setNodeNumber(Integer nodeNumber) {
        this.nodeNumber = nodeNumber;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnlargeRequest enlargeRequest = (EnlargeRequest) o;
        return Objects.equals(this.flavorId, enlargeRequest.flavorId) &&
            Objects.equals(this.nodeNumber, enlargeRequest.nodeNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flavorId, nodeNumber);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnlargeRequest {\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    nodeNumber: ").append(toIndentedString(nodeNumber)).append("\n");
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

