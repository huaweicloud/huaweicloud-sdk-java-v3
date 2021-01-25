package com.huaweicloud.sdk.ecs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.UpdateAutoTerminateTimeServerRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateAutoTerminateTimeServerRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_id")
    
    private String serverId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateAutoTerminateTimeServerRequestBody body = null;

    public UpdateAutoTerminateTimeServerRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    


    /**
     * Get serverId
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public UpdateAutoTerminateTimeServerRequest withBody(UpdateAutoTerminateTimeServerRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateAutoTerminateTimeServerRequest withBody(Consumer<UpdateAutoTerminateTimeServerRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateAutoTerminateTimeServerRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateAutoTerminateTimeServerRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateAutoTerminateTimeServerRequestBody body) {
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
        UpdateAutoTerminateTimeServerRequest updateAutoTerminateTimeServerRequest = (UpdateAutoTerminateTimeServerRequest) o;
        return Objects.equals(this.serverId, updateAutoTerminateTimeServerRequest.serverId) &&
            Objects.equals(this.body, updateAutoTerminateTimeServerRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serverId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAutoTerminateTimeServerRequest {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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

