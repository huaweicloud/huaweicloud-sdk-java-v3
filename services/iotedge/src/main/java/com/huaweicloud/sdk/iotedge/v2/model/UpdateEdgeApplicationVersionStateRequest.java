package com.huaweicloud.sdk.iotedge.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeAppVersionStateDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateEdgeApplicationVersionStateRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_app_id")
    
    
    private String edgeAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private UpdateEdgeAppVersionStateDTO body;

    public UpdateEdgeApplicationVersionStateRequest withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    


    /**
     * 应用ID，应用唯一标识。
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    

    public UpdateEdgeApplicationVersionStateRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 应用版本,应用内版本唯一。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public UpdateEdgeApplicationVersionStateRequest withBody(UpdateEdgeAppVersionStateDTO body) {
        this.body = body;
        return this;
    }

    public UpdateEdgeApplicationVersionStateRequest withBody(Consumer<UpdateEdgeAppVersionStateDTO> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateEdgeAppVersionStateDTO();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateEdgeAppVersionStateDTO getBody() {
        return body;
    }

    public void setBody(UpdateEdgeAppVersionStateDTO body) {
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
        UpdateEdgeApplicationVersionStateRequest updateEdgeApplicationVersionStateRequest = (UpdateEdgeApplicationVersionStateRequest) o;
        return Objects.equals(this.edgeAppId, updateEdgeApplicationVersionStateRequest.edgeAppId) &&
            Objects.equals(this.version, updateEdgeApplicationVersionStateRequest.version) &&
            Objects.equals(this.body, updateEdgeApplicationVersionStateRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, version, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEdgeApplicationVersionStateRequest {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

