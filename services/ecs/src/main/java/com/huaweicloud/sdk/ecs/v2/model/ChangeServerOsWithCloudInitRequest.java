package com.huaweicloud.sdk.ecs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithCloudInitRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ChangeServerOsWithCloudInitRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_id")
    
    private String serverId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ChangeServerOsWithCloudInitRequestBody body;

    public ChangeServerOsWithCloudInitRequest withServerId(String serverId) {
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

    

    public ChangeServerOsWithCloudInitRequest withBody(ChangeServerOsWithCloudInitRequestBody body) {
        this.body = body;
        return this;
    }

    public ChangeServerOsWithCloudInitRequest withBody(Consumer<ChangeServerOsWithCloudInitRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ChangeServerOsWithCloudInitRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ChangeServerOsWithCloudInitRequestBody getBody() {
        return body;
    }

    public void setBody(ChangeServerOsWithCloudInitRequestBody body) {
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
        ChangeServerOsWithCloudInitRequest changeServerOsWithCloudInitRequest = (ChangeServerOsWithCloudInitRequest) o;
        return Objects.equals(this.serverId, changeServerOsWithCloudInitRequest.serverId) &&
            Objects.equals(this.body, changeServerOsWithCloudInitRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serverId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeServerOsWithCloudInitRequest {\n");
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

