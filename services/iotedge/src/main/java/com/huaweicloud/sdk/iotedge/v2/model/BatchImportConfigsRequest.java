package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.BatchImportConfigsRequestBody;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchImportConfigsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    @JacksonXmlProperty(localName = "node_id")
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ia_id")
    
    @JacksonXmlProperty(localName = "ia_id")
    
    private String iaId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    @JacksonXmlProperty(localName = "body")
    
    private BatchImportConfigsRequestBody body;

    public BatchImportConfigsRequest withNodeId(String nodeId) {
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

    

    public BatchImportConfigsRequest withIaId(String iaId) {
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

    

    public BatchImportConfigsRequest withBody(BatchImportConfigsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchImportConfigsRequest withBody(Consumer<BatchImportConfigsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new BatchImportConfigsRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchImportConfigsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchImportConfigsRequestBody body) {
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
        BatchImportConfigsRequest batchImportConfigsRequest = (BatchImportConfigsRequest) o;
        return Objects.equals(this.nodeId, batchImportConfigsRequest.nodeId) &&
            Objects.equals(this.iaId, batchImportConfigsRequest.iaId) &&
            Objects.equals(this.body, batchImportConfigsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeId, iaId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchImportConfigsRequest {\n");
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

