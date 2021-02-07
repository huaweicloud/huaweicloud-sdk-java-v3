package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.UpdateSubReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateSubscriptionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Sp-Auth-Token")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String spAuthToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Stage-Auth-Token")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String stageAuthToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Instance-Id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subscription_id")
    
    private String subscriptionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateSubReq body = null;

    public UpdateSubscriptionRequest withSpAuthToken(String spAuthToken) {
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

    public UpdateSubscriptionRequest withStageAuthToken(String stageAuthToken) {
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

    public UpdateSubscriptionRequest withInstanceId(String instanceId) {
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

    public UpdateSubscriptionRequest withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    


    /**
     * Get subscriptionId
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public UpdateSubscriptionRequest withBody(UpdateSubReq body) {
        this.body = body;
        return this;
    }

    public UpdateSubscriptionRequest withBody(Consumer<UpdateSubReq> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateSubReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateSubReq getBody() {
        return body;
    }

    public void setBody(UpdateSubReq body) {
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
        UpdateSubscriptionRequest updateSubscriptionRequest = (UpdateSubscriptionRequest) o;
        return Objects.equals(this.spAuthToken, updateSubscriptionRequest.spAuthToken) &&
            Objects.equals(this.stageAuthToken, updateSubscriptionRequest.stageAuthToken) &&
            Objects.equals(this.instanceId, updateSubscriptionRequest.instanceId) &&
            Objects.equals(this.subscriptionId, updateSubscriptionRequest.subscriptionId) &&
            Objects.equals(this.body, updateSubscriptionRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(spAuthToken, stageAuthToken, instanceId, subscriptionId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubscriptionRequest {\n");
        sb.append("    spAuthToken: ").append(toIndentedString("******")).append("\n");
        sb.append("    stageAuthToken: ").append(toIndentedString("******")).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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

