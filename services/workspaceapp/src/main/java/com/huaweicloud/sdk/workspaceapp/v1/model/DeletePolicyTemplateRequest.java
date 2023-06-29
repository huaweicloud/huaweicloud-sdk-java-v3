package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeletePolicyTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_template_id")

    private String policyTemplateId;

    public DeletePolicyTemplateRequest withPolicyTemplateId(String policyTemplateId) {
        this.policyTemplateId = policyTemplateId;
        return this;
    }

    /**
     * 策略模板id。
     * @return policyTemplateId
     */
    public String getPolicyTemplateId() {
        return policyTemplateId;
    }

    public void setPolicyTemplateId(String policyTemplateId) {
        this.policyTemplateId = policyTemplateId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeletePolicyTemplateRequest that = (DeletePolicyTemplateRequest) obj;
        return Objects.equals(this.policyTemplateId, that.policyTemplateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyTemplateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePolicyTemplateRequest {\n");
        sb.append("    policyTemplateId: ").append(toIndentedString(policyTemplateId)).append("\n");
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
