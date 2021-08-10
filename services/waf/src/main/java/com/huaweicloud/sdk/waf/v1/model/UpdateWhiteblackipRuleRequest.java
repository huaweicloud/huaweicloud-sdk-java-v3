package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateWhiteblackipRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateWhiteBlackIpRuleRequestBody body;

    public UpdateWhiteblackipRuleRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /** 策略id（策略id从查询防护策略列表接口获取）
     * 
     * @return policyId */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdateWhiteblackipRuleRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /** whiteblackIpRuleId
     * 
     * @return ruleId */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public UpdateWhiteblackipRuleRequest withBody(UpdateWhiteBlackIpRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateWhiteblackipRuleRequest withBody(Consumer<UpdateWhiteBlackIpRuleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateWhiteBlackIpRuleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateWhiteBlackIpRuleRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateWhiteBlackIpRuleRequestBody body) {
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
        UpdateWhiteblackipRuleRequest updateWhiteblackipRuleRequest = (UpdateWhiteblackipRuleRequest) o;
        return Objects.equals(this.policyId, updateWhiteblackipRuleRequest.policyId)
            && Objects.equals(this.ruleId, updateWhiteblackipRuleRequest.ruleId)
            && Objects.equals(this.body, updateWhiteblackipRuleRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, ruleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWhiteblackipRuleRequest {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
