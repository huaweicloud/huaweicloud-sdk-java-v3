package com.huaweicloud.sdk.iotedge.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.CreateRouterReqDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateRoutesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_node_id")
    
    
    private String edgeNodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private List<CreateRouterReqDTO> body = null;
    
    public UpdateRoutesRequest withEdgeNodeId(String edgeNodeId) {
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

    

    public UpdateRoutesRequest withBody(List<CreateRouterReqDTO> body) {
        this.body = body;
        return this;
    }

    
    public UpdateRoutesRequest addBodyItem(CreateRouterReqDTO bodyItem) {
        if(this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public UpdateRoutesRequest withBody(Consumer<List<CreateRouterReqDTO>> bodySetter) {
        if(this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<CreateRouterReqDTO> getBody() {
        return body;
    }

    public void setBody(List<CreateRouterReqDTO> body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRoutesRequest updateRoutesRequest = (UpdateRoutesRequest) o;
        return Objects.equals(this.edgeNodeId, updateRoutesRequest.edgeNodeId) &&
            Objects.equals(this.body, updateRoutesRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRoutesRequest {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

