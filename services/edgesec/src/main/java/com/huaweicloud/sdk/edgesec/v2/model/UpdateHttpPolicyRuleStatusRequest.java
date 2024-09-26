package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateHttpPolicyRuleStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateHttpPolicyRuleStatusRequestBody body;

    public UpdateHttpPolicyRuleStatusRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 防护策略id
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdateHttpPolicyRuleStatusRequest withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * 防护策略规则 cc|custom|whiteblackip|privacy|ignore|geoip|antitamper|antileakage|punishment|ip-reputation
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public UpdateHttpPolicyRuleStatusRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 防护策略规则id
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public UpdateHttpPolicyRuleStatusRequest withBody(UpdateHttpPolicyRuleStatusRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateHttpPolicyRuleStatusRequest withBody(Consumer<UpdateHttpPolicyRuleStatusRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateHttpPolicyRuleStatusRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateHttpPolicyRuleStatusRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateHttpPolicyRuleStatusRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHttpPolicyRuleStatusRequest that = (UpdateHttpPolicyRuleStatusRequest) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.ruleType, that.ruleType)
            && Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, ruleType, ruleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHttpPolicyRuleStatusRequest {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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
