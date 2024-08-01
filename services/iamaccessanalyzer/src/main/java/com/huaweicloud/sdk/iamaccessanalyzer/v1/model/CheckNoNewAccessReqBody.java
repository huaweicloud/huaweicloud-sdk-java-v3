package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckNoNewAccessReqBody
 */
public class CheckNoNewAccessReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existing_policy_document")

    private String existingPolicyDocument;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_policy_document")

    private String newPolicyDocument;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private PolicyDocumentType policyType;

    public CheckNoNewAccessReqBody withExistingPolicyDocument(String existingPolicyDocument) {
        this.existingPolicyDocument = existingPolicyDocument;
        return this;
    }

    /**
     * 该策略JSON格式策略文档。
     * @return existingPolicyDocument
     */
    public String getExistingPolicyDocument() {
        return existingPolicyDocument;
    }

    public void setExistingPolicyDocument(String existingPolicyDocument) {
        this.existingPolicyDocument = existingPolicyDocument;
    }

    public CheckNoNewAccessReqBody withNewPolicyDocument(String newPolicyDocument) {
        this.newPolicyDocument = newPolicyDocument;
        return this;
    }

    /**
     * 该策略JSON格式策略文档。
     * @return newPolicyDocument
     */
    public String getNewPolicyDocument() {
        return newPolicyDocument;
    }

    public void setNewPolicyDocument(String newPolicyDocument) {
        this.newPolicyDocument = newPolicyDocument;
    }

    public CheckNoNewAccessReqBody withPolicyType(PolicyDocumentType policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Get policyType
     * @return policyType
     */
    public PolicyDocumentType getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyDocumentType policyType) {
        this.policyType = policyType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckNoNewAccessReqBody that = (CheckNoNewAccessReqBody) obj;
        return Objects.equals(this.existingPolicyDocument, that.existingPolicyDocument)
            && Objects.equals(this.newPolicyDocument, that.newPolicyDocument)
            && Objects.equals(this.policyType, that.policyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(existingPolicyDocument, newPolicyDocument, policyType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckNoNewAccessReqBody {\n");
        sb.append("    existingPolicyDocument: ").append(toIndentedString(existingPolicyDocument)).append("\n");
        sb.append("    newPolicyDocument: ").append(toIndentedString(newPolicyDocument)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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
