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
public class DeleteApplicationRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Sp-Auth-Token")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String spAuthToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Instance-Id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;

    public DeleteApplicationRequest withSpAuthToken(String spAuthToken) {
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

    public DeleteApplicationRequest withInstanceId(String instanceId) {
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

    public DeleteApplicationRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * Get appId
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteApplicationRequest deleteApplicationRequest = (DeleteApplicationRequest) o;
        return Objects.equals(this.spAuthToken, deleteApplicationRequest.spAuthToken) &&
            Objects.equals(this.instanceId, deleteApplicationRequest.instanceId) &&
            Objects.equals(this.appId, deleteApplicationRequest.appId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(spAuthToken, instanceId, appId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteApplicationRequest {\n");
        sb.append("    spAuthToken: ").append(toIndentedString("******")).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

