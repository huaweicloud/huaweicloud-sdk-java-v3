package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.CreateCcRuleRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateCcRuleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_id")
    
    private String policyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule_id")
    
    private String ruleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateCcRuleRequestBody body;

    public UpdateCcRuleRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    


    /**
     * policyid
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    

    public UpdateCcRuleRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    


    /**
     * ccRuleId
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    

    public UpdateCcRuleRequest withBody(CreateCcRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateCcRuleRequest withBody(Consumer<CreateCcRuleRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateCcRuleRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateCcRuleRequestBody getBody() {
        return body;
    }

    public void setBody(CreateCcRuleRequestBody body) {
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
        UpdateCcRuleRequest updateCcRuleRequest = (UpdateCcRuleRequest) o;
        return Objects.equals(this.policyId, updateCcRuleRequest.policyId) &&
            Objects.equals(this.ruleId, updateCcRuleRequest.ruleId) &&
            Objects.equals(this.body, updateCcRuleRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(policyId, ruleId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCcRuleRequest {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
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

