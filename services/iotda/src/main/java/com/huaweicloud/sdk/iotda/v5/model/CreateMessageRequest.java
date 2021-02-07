package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.DeviceMessageRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateMessageRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private String deviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Stage-Auth-Token")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String stageAuthToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Sp-Auth-Token")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String spAuthToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Instance-Id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private DeviceMessageRequest body = null;

    public CreateMessageRequest withDeviceId(String deviceId) {
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

    public CreateMessageRequest withStageAuthToken(String stageAuthToken) {
        this.stageAuthToken = stageAuthToken;
        return this;
    }

    


    /**
     * Get stageAuthToken
     * @return stageAuthToken
     */
    public String getStageAuthToken() {
        return stageAuthToken;
    }

    public void setStageAuthToken(String stageAuthToken) {
        this.stageAuthToken = stageAuthToken;
    }

    public CreateMessageRequest withSpAuthToken(String spAuthToken) {
        this.spAuthToken = spAuthToken;
        return this;
    }

    


    /**
     * Get spAuthToken
     * @return spAuthToken
     */
    public String getSpAuthToken() {
        return spAuthToken;
    }

    public void setSpAuthToken(String spAuthToken) {
        this.spAuthToken = spAuthToken;
    }

    public CreateMessageRequest withInstanceId(String instanceId) {
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

    public CreateMessageRequest withBody(DeviceMessageRequest body) {
        this.body = body;
        return this;
    }

    public CreateMessageRequest withBody(Consumer<DeviceMessageRequest> bodySetter) {
        if(this.body == null ){
            this.body = new DeviceMessageRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public DeviceMessageRequest getBody() {
        return body;
    }

    public void setBody(DeviceMessageRequest body) {
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
        CreateMessageRequest createMessageRequest = (CreateMessageRequest) o;
        return Objects.equals(this.deviceId, createMessageRequest.deviceId) &&
            Objects.equals(this.stageAuthToken, createMessageRequest.stageAuthToken) &&
            Objects.equals(this.spAuthToken, createMessageRequest.spAuthToken) &&
            Objects.equals(this.instanceId, createMessageRequest.instanceId) &&
            Objects.equals(this.body, createMessageRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deviceId, stageAuthToken, spAuthToken, instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessageRequest {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    stageAuthToken: ").append(toIndentedString("******")).append("\n");
        sb.append("    spAuthToken: ").append(toIndentedString("******")).append("\n");
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

