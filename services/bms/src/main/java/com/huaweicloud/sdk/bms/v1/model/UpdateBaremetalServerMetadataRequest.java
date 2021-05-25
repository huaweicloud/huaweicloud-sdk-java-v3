package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.MetaData;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateBaremetalServerMetadataRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_id")
    
    private String serverId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private MetaData body;

    public UpdateBaremetalServerMetadataRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    


    /**
     * 裸金属服务器ID
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    

    public UpdateBaremetalServerMetadataRequest withBody(MetaData body) {
        this.body = body;
        return this;
    }

    public UpdateBaremetalServerMetadataRequest withBody(Consumer<MetaData> bodySetter) {
        if(this.body == null ){
            this.body = new MetaData();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public MetaData getBody() {
        return body;
    }

    public void setBody(MetaData body) {
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
        UpdateBaremetalServerMetadataRequest updateBaremetalServerMetadataRequest = (UpdateBaremetalServerMetadataRequest) o;
        return Objects.equals(this.serverId, updateBaremetalServerMetadataRequest.serverId) &&
            Objects.equals(this.body, updateBaremetalServerMetadataRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serverId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBaremetalServerMetadataRequest {\n");
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

