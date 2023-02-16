package com.huaweicloud.sdk.iotedge.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeApplicationVersionDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateEdgeApplicationVersionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_app_id")
    
    
    private String edgeAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private CreateEdgeApplicationVersionDTO body;

    public CreateEdgeApplicationVersionRequest withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    


    /**
     * 应用ID，应用唯一。
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    

    public CreateEdgeApplicationVersionRequest withBody(CreateEdgeApplicationVersionDTO body) {
        this.body = body;
        return this;
    }

    public CreateEdgeApplicationVersionRequest withBody(Consumer<CreateEdgeApplicationVersionDTO> bodySetter) {
        if(this.body == null ){
            this.body = new CreateEdgeApplicationVersionDTO();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateEdgeApplicationVersionDTO getBody() {
        return body;
    }

    public void setBody(CreateEdgeApplicationVersionDTO body) {
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
        CreateEdgeApplicationVersionRequest createEdgeApplicationVersionRequest = (CreateEdgeApplicationVersionRequest) o;
        return Objects.equals(this.edgeAppId, createEdgeApplicationVersionRequest.edgeAppId) &&
            Objects.equals(this.body, createEdgeApplicationVersionRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEdgeApplicationVersionRequest {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
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

