package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.ResetDeviceSecret;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ResetDeviceSecretRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Instance-Id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private String deviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_id")
    
    private String actionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ResetDeviceSecret body;

    public ResetDeviceSecretRequest withInstanceId(String instanceId) {
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

    

    public ResetDeviceSecretRequest withDeviceId(String deviceId) {
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

    

    public ResetDeviceSecretRequest withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    


    /**
     * Get actionId
     * @return actionId
     */
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    

    public ResetDeviceSecretRequest withBody(ResetDeviceSecret body) {
        this.body = body;
        return this;
    }

    public ResetDeviceSecretRequest withBody(Consumer<ResetDeviceSecret> bodySetter) {
        if(this.body == null ){
            this.body = new ResetDeviceSecret();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ResetDeviceSecret getBody() {
        return body;
    }

    public void setBody(ResetDeviceSecret body) {
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
        ResetDeviceSecretRequest resetDeviceSecretRequest = (ResetDeviceSecretRequest) o;
        return Objects.equals(this.instanceId, resetDeviceSecretRequest.instanceId) &&
            Objects.equals(this.deviceId, resetDeviceSecretRequest.deviceId) &&
            Objects.equals(this.actionId, resetDeviceSecretRequest.actionId) &&
            Objects.equals(this.body, resetDeviceSecretRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, deviceId, actionId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetDeviceSecretRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
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

