package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.PolicyAntiCrawlerPutInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateAnticrawlerRuleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_id")
    
    private String policyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule_id")
    
    private String ruleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private PolicyAntiCrawlerPutInfo body;

    public UpdateAnticrawlerRuleRequest withPolicyId(String policyId) {
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

    

    public UpdateAnticrawlerRuleRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    


    /**
     * anticrawlerRuleId
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    

    public UpdateAnticrawlerRuleRequest withBody(PolicyAntiCrawlerPutInfo body) {
        this.body = body;
        return this;
    }

    public UpdateAnticrawlerRuleRequest withBody(Consumer<PolicyAntiCrawlerPutInfo> bodySetter) {
        if(this.body == null ){
            this.body = new PolicyAntiCrawlerPutInfo();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public PolicyAntiCrawlerPutInfo getBody() {
        return body;
    }

    public void setBody(PolicyAntiCrawlerPutInfo body) {
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
        UpdateAnticrawlerRuleRequest updateAnticrawlerRuleRequest = (UpdateAnticrawlerRuleRequest) o;
        return Objects.equals(this.policyId, updateAnticrawlerRuleRequest.policyId) &&
            Objects.equals(this.ruleId, updateAnticrawlerRuleRequest.ruleId) &&
            Objects.equals(this.body, updateAnticrawlerRuleRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(policyId, ruleId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAnticrawlerRuleRequest {\n");
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

