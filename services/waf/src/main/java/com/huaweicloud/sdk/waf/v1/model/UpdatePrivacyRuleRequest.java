package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdatePrivacyRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePrivacyRuleRequestBody body;

    public UpdatePrivacyRuleRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 您可以通过调用企业项目管理服务（EPS)的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdatePrivacyRuleRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /** 防护策略id，您可以通过调用查询防护策略列表（ListPolicy）获取策略id
     * 
     * @return policyId */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdatePrivacyRuleRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /** privacyRuleId
     * 
     * @return ruleId */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public UpdatePrivacyRuleRequest withBody(UpdatePrivacyRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePrivacyRuleRequest withBody(Consumer<UpdatePrivacyRuleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePrivacyRuleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdatePrivacyRuleRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePrivacyRuleRequestBody body) {
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
        UpdatePrivacyRuleRequest updatePrivacyRuleRequest = (UpdatePrivacyRuleRequest) o;
        return Objects.equals(this.enterpriseProjectId, updatePrivacyRuleRequest.enterpriseProjectId)
            && Objects.equals(this.policyId, updatePrivacyRuleRequest.policyId)
            && Objects.equals(this.ruleId, updatePrivacyRuleRequest.ruleId)
            && Objects.equals(this.body, updatePrivacyRuleRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, policyId, ruleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrivacyRuleRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
