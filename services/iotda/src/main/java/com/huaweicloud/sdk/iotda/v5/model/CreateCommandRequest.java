package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.DeviceCommandRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateCommandRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private String deviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Instance-Id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private DeviceCommandRequest body = null;

    public CreateCommandRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * Get deviceId
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public CreateCommandRequest withInstanceId(String instanceId) {
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

    public CreateCommandRequest withBody(DeviceCommandRequest body) {
        this.body = body;
        return this;
    }

    public CreateCommandRequest withBody(Consumer<DeviceCommandRequest> bodySetter) {
        if(this.body == null ){
            this.body = new DeviceCommandRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public DeviceCommandRequest getBody() {
        return body;
    }

    public void setBody(DeviceCommandRequest body) {
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
        CreateCommandRequest createCommandRequest = (CreateCommandRequest) o;
        return Objects.equals(this.deviceId, createCommandRequest.deviceId) &&
            Objects.equals(this.instanceId, createCommandRequest.instanceId) &&
            Objects.equals(this.body, createCommandRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deviceId, instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCommandRequest {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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

