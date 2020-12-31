package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.AddSubsetsToGatewayRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class AddSubsetsToGatewayRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private Integer deviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private AddSubsetsToGatewayRequestBody body = null;

    public AddSubsetsToGatewayRequest withInstanceId(String instanceId) {
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

    public AddSubsetsToGatewayRequest withDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * Get deviceId
     * minimum: 0
     * maximum: 200376420520689663
     * @return deviceId
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public AddSubsetsToGatewayRequest withBody(AddSubsetsToGatewayRequestBody body) {
        this.body = body;
        return this;
    }

    public AddSubsetsToGatewayRequest withBody(Consumer<AddSubsetsToGatewayRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new AddSubsetsToGatewayRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public AddSubsetsToGatewayRequestBody getBody() {
        return body;
    }

    public void setBody(AddSubsetsToGatewayRequestBody body) {
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
        AddSubsetsToGatewayRequest addSubsetsToGatewayRequest = (AddSubsetsToGatewayRequest) o;
        return Objects.equals(this.instanceId, addSubsetsToGatewayRequest.instanceId) &&
            Objects.equals(this.deviceId, addSubsetsToGatewayRequest.deviceId) &&
            Objects.equals(this.body, addSubsetsToGatewayRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, deviceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddSubsetsToGatewayRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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

