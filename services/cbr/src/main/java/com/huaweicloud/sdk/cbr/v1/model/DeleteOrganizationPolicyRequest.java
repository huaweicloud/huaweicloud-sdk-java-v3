package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteOrganizationPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_policy_id")

    private String organizationPolicyId;

    public DeleteOrganizationPolicyRequest withOrganizationPolicyId(String organizationPolicyId) {
        this.organizationPolicyId = organizationPolicyId;
        return this;
    }

    /**
     * 组织策略ID
     * @return organizationPolicyId
     */
    public String getOrganizationPolicyId() {
        return organizationPolicyId;
    }

    public void setOrganizationPolicyId(String organizationPolicyId) {
        this.organizationPolicyId = organizationPolicyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteOrganizationPolicyRequest that = (DeleteOrganizationPolicyRequest) obj;
        return Objects.equals(this.organizationPolicyId, that.organizationPolicyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationPolicyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteOrganizationPolicyRequest {\n");
        sb.append("    organizationPolicyId: ").append(toIndentedString(organizationPolicyId)).append("\n");
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
