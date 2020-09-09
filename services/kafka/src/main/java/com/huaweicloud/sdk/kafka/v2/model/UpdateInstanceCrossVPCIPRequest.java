package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceCrossVPCIPReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateInstanceCrossVPCIPRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateInstanceCrossVPCIPReq body = null;

    public UpdateInstanceCrossVPCIPRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateInstanceCrossVPCIPRequest withBody(UpdateInstanceCrossVPCIPReq body) {
        this.body = body;
        return this;
    }

    public UpdateInstanceCrossVPCIPRequest withBody(Consumer<UpdateInstanceCrossVPCIPReq> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateInstanceCrossVPCIPReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateInstanceCrossVPCIPReq getBody() {
        return body;
    }

    public void setBody(UpdateInstanceCrossVPCIPReq body) {
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
        UpdateInstanceCrossVPCIPRequest updateInstanceCrossVPCIPRequest = (UpdateInstanceCrossVPCIPRequest) o;
        return Objects.equals(this.instanceId, updateInstanceCrossVPCIPRequest.instanceId) &&
            Objects.equals(this.body, updateInstanceCrossVPCIPRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceCrossVPCIPRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

