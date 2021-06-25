package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.CustomPostBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateCustomRuleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_id")
    
    private String policyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule_id")
    
    private String ruleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CustomPostBody body;

    public UpdateCustomRuleRequest withPolicyId(String policyId) {
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

    

    public UpdateCustomRuleRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    


    /**
     * customRuleId
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    

    public UpdateCustomRuleRequest withBody(CustomPostBody body) {
        this.body = body;
        return this;
    }

    public UpdateCustomRuleRequest withBody(Consumer<CustomPostBody> bodySetter) {
        if(this.body == null ){
            this.body = new CustomPostBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CustomPostBody getBody() {
        return body;
    }

    public void setBody(CustomPostBody body) {
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
        UpdateCustomRuleRequest updateCustomRuleRequest = (UpdateCustomRuleRequest) o;
        return Objects.equals(this.policyId, updateCustomRuleRequest.policyId) &&
            Objects.equals(this.ruleId, updateCustomRuleRequest.ruleId) &&
            Objects.equals(this.body, updateCustomRuleRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(policyId, ruleId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCustomRuleRequest {\n");
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

