package com.huaweicloud.sdk.iotedge.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.ConfirmIaConfigsRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchConfirmConfigsNewRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ia_id")
    

    private String iaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private ConfirmIaConfigsRequestBody body;

    public BatchConfirmConfigsNewRequest withNodeId(String nodeId) {
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

    

    public BatchConfirmConfigsNewRequest withIaId(String iaId) {
        this.iaId = iaId;
        return this;
    }

    


    /**
     * 边侧第三方应用的模块ID
     * @return iaId
     */
    public String getIaId() {
        return iaId;
    }

    public void setIaId(String iaId) {
        this.iaId = iaId;
    }

    

    public BatchConfirmConfigsNewRequest withBody(ConfirmIaConfigsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchConfirmConfigsNewRequest withBody(Consumer<ConfirmIaConfigsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ConfirmIaConfigsRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ConfirmIaConfigsRequestBody getBody() {
        return body;
    }

    public void setBody(ConfirmIaConfigsRequestBody body) {
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
        BatchConfirmConfigsNewRequest batchConfirmConfigsNewRequest = (BatchConfirmConfigsNewRequest) o;
        return Objects.equals(this.nodeId, batchConfirmConfigsNewRequest.nodeId) &&
            Objects.equals(this.iaId, batchConfirmConfigsNewRequest.iaId) &&
            Objects.equals(this.body, batchConfirmConfigsNewRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeId, iaId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchConfirmConfigsNewRequest {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    iaId: ").append(toIndentedString(iaId)).append("\n");
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

