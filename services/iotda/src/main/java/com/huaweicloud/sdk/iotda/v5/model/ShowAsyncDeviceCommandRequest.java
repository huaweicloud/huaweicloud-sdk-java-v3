package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowAsyncDeviceCommandRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private String deviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Stage-Auth-Token")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String stageAuthToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Instance-Id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="command_id")
    
    private String commandId;

    public ShowAsyncDeviceCommandRequest withDeviceId(String deviceId) {
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

    public ShowAsyncDeviceCommandRequest withStageAuthToken(String stageAuthToken) {
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

    public ShowAsyncDeviceCommandRequest withInstanceId(String instanceId) {
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

    public ShowAsyncDeviceCommandRequest withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    


    /**
     * Get commandId
     * @return commandId
     */
    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAsyncDeviceCommandRequest showAsyncDeviceCommandRequest = (ShowAsyncDeviceCommandRequest) o;
        return Objects.equals(this.deviceId, showAsyncDeviceCommandRequest.deviceId) &&
            Objects.equals(this.stageAuthToken, showAsyncDeviceCommandRequest.stageAuthToken) &&
            Objects.equals(this.instanceId, showAsyncDeviceCommandRequest.instanceId) &&
            Objects.equals(this.commandId, showAsyncDeviceCommandRequest.commandId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deviceId, stageAuthToken, instanceId, commandId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAsyncDeviceCommandRequest {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    stageAuthToken: ").append(toIndentedString("******")).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
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

