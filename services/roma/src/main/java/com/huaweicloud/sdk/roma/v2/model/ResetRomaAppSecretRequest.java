package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.UpdateAppSecretReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ResetRomaAppSecretRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateAppSecretReq body;

    public ResetRomaAppSecretRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public ResetRomaAppSecretRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ResetRomaAppSecretRequest withBody(UpdateAppSecretReq body) {
        this.body = body;
        return this;
    }

    public ResetRomaAppSecretRequest withBody(Consumer<UpdateAppSecretReq> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateAppSecretReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateAppSecretReq getBody() {
        return body;
    }

    public void setBody(UpdateAppSecretReq body) {
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
        ResetRomaAppSecretRequest resetRomaAppSecretRequest = (ResetRomaAppSecretRequest) o;
        return Objects.equals(this.appId, resetRomaAppSecretRequest.appId) &&
            Objects.equals(this.instanceId, resetRomaAppSecretRequest.instanceId) &&
            Objects.equals(this.body, resetRomaAppSecretRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetRomaAppSecretRequest {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

