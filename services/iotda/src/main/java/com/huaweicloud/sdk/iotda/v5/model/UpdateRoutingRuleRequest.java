package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRuleReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateRoutingRuleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Instance-Id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule_id")
    
    private String ruleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateRuleReq body;

    public UpdateRoutingRuleRequest withInstanceId(String instanceId) {
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

    

    public UpdateRoutingRuleRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    


    /**
     * Get ruleId
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    

    public UpdateRoutingRuleRequest withBody(UpdateRuleReq body) {
        this.body = body;
        return this;
    }

    public UpdateRoutingRuleRequest withBody(Consumer<UpdateRuleReq> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateRuleReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateRuleReq getBody() {
        return body;
    }

    public void setBody(UpdateRuleReq body) {
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
        UpdateRoutingRuleRequest updateRoutingRuleRequest = (UpdateRoutingRuleRequest) o;
        return Objects.equals(this.instanceId, updateRoutingRuleRequest.instanceId) &&
            Objects.equals(this.ruleId, updateRoutingRuleRequest.ruleId) &&
            Objects.equals(this.body, updateRoutingRuleRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, ruleId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRoutingRuleRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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

