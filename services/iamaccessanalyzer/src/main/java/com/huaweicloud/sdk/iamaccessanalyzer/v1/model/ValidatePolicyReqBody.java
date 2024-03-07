package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ValidatePolicyReqBody
 */
public class ValidatePolicyReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_document")

    private String policyDocument;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private PolicyType policyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validate_policy_resource_type")

    private ValidatePolicyResourceType validatePolicyResourceType;

    public ValidatePolicyReqBody withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * 该策略JSON格式策略文档。
     * @return policyDocument
     */
    public String getPolicyDocument() {
        return policyDocument;
    }

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    public ValidatePolicyReqBody withPolicyType(PolicyType policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Get policyType
     * @return policyType
     */
    public PolicyType getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType;
    }

    public ValidatePolicyReqBody withValidatePolicyResourceType(ValidatePolicyResourceType validatePolicyResourceType) {
        this.validatePolicyResourceType = validatePolicyResourceType;
        return this;
    }

    /**
     * Get validatePolicyResourceType
     * @return validatePolicyResourceType
     */
    public ValidatePolicyResourceType getValidatePolicyResourceType() {
        return validatePolicyResourceType;
    }

    public void setValidatePolicyResourceType(ValidatePolicyResourceType validatePolicyResourceType) {
        this.validatePolicyResourceType = validatePolicyResourceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidatePolicyReqBody that = (ValidatePolicyReqBody) obj;
        return Objects.equals(this.policyDocument, that.policyDocument)
            && Objects.equals(this.policyType, that.policyType)
            && Objects.equals(this.validatePolicyResourceType, that.validatePolicyResourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyDocument, policyType, validatePolicyResourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidatePolicyReqBody {\n");
        sb.append("    policyDocument: ").append(toIndentedString(policyDocument)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    validatePolicyResourceType: ").append(toIndentedString(validatePolicyResourceType)).append("\n");
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
