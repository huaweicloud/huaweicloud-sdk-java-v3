package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.PolicyAntiCrawlerPostInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateAnticrawlerRulesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_id")
    
    private String policyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private PolicyAntiCrawlerPostInfo body;

    public CreateAnticrawlerRulesRequest withPolicyId(String policyId) {
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

    

    public CreateAnticrawlerRulesRequest withBody(PolicyAntiCrawlerPostInfo body) {
        this.body = body;
        return this;
    }

    public CreateAnticrawlerRulesRequest withBody(Consumer<PolicyAntiCrawlerPostInfo> bodySetter) {
        if(this.body == null ){
            this.body = new PolicyAntiCrawlerPostInfo();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public PolicyAntiCrawlerPostInfo getBody() {
        return body;
    }

    public void setBody(PolicyAntiCrawlerPostInfo body) {
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
        CreateAnticrawlerRulesRequest createAnticrawlerRulesRequest = (CreateAnticrawlerRulesRequest) o;
        return Objects.equals(this.policyId, createAnticrawlerRulesRequest.policyId) &&
            Objects.equals(this.body, createAnticrawlerRulesRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(policyId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAnticrawlerRulesRequest {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
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

