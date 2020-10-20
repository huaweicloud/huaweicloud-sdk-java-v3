package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.UpdateActionReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateRuleActionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Stage-Auth-Token")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String stageAuthToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Instance-Id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_id")
    
    private String actionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateActionReq body = null;

    public UpdateRuleActionRequest withStageAuthToken(String stageAuthToken) {
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

    public UpdateRuleActionRequest withInstanceId(String instanceId) {
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

    public UpdateRuleActionRequest withActionId(String actionId) {
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

    public UpdateRuleActionRequest withBody(UpdateActionReq body) {
        this.body = body;
        return this;
    }

    public UpdateRuleActionRequest withBody(Consumer<UpdateActionReq> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateActionReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateActionReq getBody() {
        return body;
    }

    public void setBody(UpdateActionReq body) {
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
        UpdateRuleActionRequest updateRuleActionRequest = (UpdateRuleActionRequest) o;
        return Objects.equals(this.stageAuthToken, updateRuleActionRequest.stageAuthToken) &&
            Objects.equals(this.instanceId, updateRuleActionRequest.instanceId) &&
            Objects.equals(this.actionId, updateRuleActionRequest.actionId) &&
            Objects.equals(this.body, updateRuleActionRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stageAuthToken, instanceId, actionId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRuleActionRequest {\n");
        sb.append("    stageAuthToken: ").append(toIndentedString("******")).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

