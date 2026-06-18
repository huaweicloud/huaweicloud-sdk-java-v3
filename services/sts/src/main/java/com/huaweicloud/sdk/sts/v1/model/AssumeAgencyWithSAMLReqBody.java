package com.huaweicloud.sdk.sts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 接口/v5/agencies/assume-with-saml的Http请求体。  **取值范围**： 不涉及。 
 */
public class AssumeAgencyWithSAMLReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration_seconds")

    private Integer durationSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private String policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_ids")

    private List<String> policyIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_urn")

    private String providerUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_urn")

    private String agencyUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saml_assertion")

    private String samlAssertion;

    public AssumeAgencyWithSAMLReqBody withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * **参数解释**： 获得的临时安全凭证的有效时间（单位：秒）。  **约束限制**： 获得的临时安全凭证的有效时间（单位：秒）。请注意，该时间需要小于信任委托本身设置的最大会话持续时间。同时最终的会话持续时间以duration_seconds，  SAML身份验证响应中SessionNotOnOrAfter值和SessionDuration值三者中较短的一个为准。  **取值范围**： 取值范围为[900,43200]。  **默认取值**： 默认值为3600。 
     * minimum: 900
     * maximum: 43200
     * @return durationSeconds
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public AssumeAgencyWithSAMLReqBody withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * **参数解释**： 自定义策略，限制本次会话获得的临时安全凭证的权限范围不会超过该自定义策略指定的权限。  **约束限制**： 本次会话获得的临时安全凭证的权限范围不会超过该自定义策略指定的权限。 长度范围为[2,2048]。  **取值范围**： 不涉及。  **默认取值**： 不涉及。 
     * @return policy
     */
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public AssumeAgencyWithSAMLReqBody withPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }

    public AssumeAgencyWithSAMLReqBody addPolicyIdsItem(String policyIdsItem) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        this.policyIds.add(policyIdsItem);
        return this;
    }

    public AssumeAgencyWithSAMLReqBody withPolicyIds(Consumer<List<String>> policyIdsSetter) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        policyIdsSetter.accept(this.policyIds);
        return this;
    }

    /**
     * **参数解释**： 预置策略列表，限制本次会话获得的临时安全凭证的权限范围不会超过该预置策略指定的权限。  **约束限制**： 不涉及。  **取值范围**： 不涉及。  **默认取值**： 不涉及。 
     * @return policyIds
     */
    public List<String> getPolicyIds() {
        return policyIds;
    }

    public void setPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
    }

    public AssumeAgencyWithSAMLReqBody withProviderUrn(String providerUrn) {
        this.providerUrn = providerUrn;
        return this;
    }

    /**
     * **参数解释**： SAML提供商的URN。  **约束限制**： 长度范围为[0,1500]。  **取值范围**： 不涉及。  **默认取值**： 不涉及。 
     * @return providerUrn
     */
    public String getProviderUrn() {
        return providerUrn;
    }

    public void setProviderUrn(String providerUrn) {
        this.providerUrn = providerUrn;
    }

    public AssumeAgencyWithSAMLReqBody withAgencyUrn(String agencyUrn) {
        this.agencyUrn = agencyUrn;
        return this;
    }

    /**
     * **参数解释**： 目标信任委托的URN。  **约束限制**： 长度范围为[0,1500]。  **取值范围**： 不涉及。  **默认取值**： 不涉及。 
     * @return agencyUrn
     */
    public String getAgencyUrn() {
        return agencyUrn;
    }

    public void setAgencyUrn(String agencyUrn) {
        this.agencyUrn = agencyUrn;
    }

    public AssumeAgencyWithSAMLReqBody withSamlAssertion(String samlAssertion) {
        this.samlAssertion = samlAssertion;
        return this;
    }

    /**
     * **参数解释**： 由SAML身份提供商提供的Base64编码的SAML身份验证响应。  **约束限制**： 长度范围为[4,100000]。  **取值范围**： 不涉及。  **默认取值**： 不涉及。 
     * @return samlAssertion
     */
    public String getSamlAssertion() {
        return samlAssertion;
    }

    public void setSamlAssertion(String samlAssertion) {
        this.samlAssertion = samlAssertion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssumeAgencyWithSAMLReqBody that = (AssumeAgencyWithSAMLReqBody) obj;
        return Objects.equals(this.durationSeconds, that.durationSeconds) && Objects.equals(this.policy, that.policy)
            && Objects.equals(this.policyIds, that.policyIds) && Objects.equals(this.providerUrn, that.providerUrn)
            && Objects.equals(this.agencyUrn, that.agencyUrn) && Objects.equals(this.samlAssertion, that.samlAssertion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(durationSeconds, policy, policyIds, providerUrn, agencyUrn, samlAssertion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssumeAgencyWithSAMLReqBody {\n");
        sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    policyIds: ").append(toIndentedString(policyIds)).append("\n");
        sb.append("    providerUrn: ").append(toIndentedString(providerUrn)).append("\n");
        sb.append("    agencyUrn: ").append(toIndentedString(agencyUrn)).append("\n");
        sb.append("    samlAssertion: ").append(toIndentedString(samlAssertion)).append("\n");
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
