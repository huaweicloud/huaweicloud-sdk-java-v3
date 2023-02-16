package com.huaweicloud.sdk.iotedge.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.AuthorizeNa2NodesRequestDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchAssociateNaToNodesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="na_id")
    
    
    private String naId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    
    private String action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private AuthorizeNa2NodesRequestDTO body;

    public BatchAssociateNaToNodesRequest withNaId(String naId) {
        this.naId = naId;
        return this;
    }

    


    /**
     * 北向数据接收端点ID
     * @return naId
     */
    public String getNaId() {
        return naId;
    }

    public void setNaId(String naId) {
        this.naId = naId;
    }

    

    public BatchAssociateNaToNodesRequest withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 批量删除delete，批量添加add
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    

    public BatchAssociateNaToNodesRequest withBody(AuthorizeNa2NodesRequestDTO body) {
        this.body = body;
        return this;
    }

    public BatchAssociateNaToNodesRequest withBody(Consumer<AuthorizeNa2NodesRequestDTO> bodySetter) {
        if(this.body == null ){
            this.body = new AuthorizeNa2NodesRequestDTO();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public AuthorizeNa2NodesRequestDTO getBody() {
        return body;
    }

    public void setBody(AuthorizeNa2NodesRequestDTO body) {
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
        BatchAssociateNaToNodesRequest batchAssociateNaToNodesRequest = (BatchAssociateNaToNodesRequest) o;
        return Objects.equals(this.naId, batchAssociateNaToNodesRequest.naId) &&
            Objects.equals(this.action, batchAssociateNaToNodesRequest.action) &&
            Objects.equals(this.body, batchAssociateNaToNodesRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(naId, action, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAssociateNaToNodesRequest {\n");
        sb.append("    naId: ").append(toIndentedString(naId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

