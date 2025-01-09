package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPolicyGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group")

    private PolicyGroup policyGroup;

    public ShowPolicyGroupResponse withPolicyGroup(PolicyGroup policyGroup) {
        this.policyGroup = policyGroup;
        return this;
    }

    public ShowPolicyGroupResponse withPolicyGroup(Consumer<PolicyGroup> policyGroupSetter) {
        if (this.policyGroup == null) {
            this.policyGroup = new PolicyGroup();
            policyGroupSetter.accept(this.policyGroup);
        }

        return this;
    }

    /**
     * Get policyGroup
     * @return policyGroup
     */
    public PolicyGroup getPolicyGroup() {
        return policyGroup;
    }

    public void setPolicyGroup(PolicyGroup policyGroup) {
        this.policyGroup = policyGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPolicyGroupResponse that = (ShowPolicyGroupResponse) obj;
        return Objects.equals(this.policyGroup, that.policyGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPolicyGroupResponse {\n");
        sb.append("    policyGroup: ").append(toIndentedString(policyGroup)).append("\n");
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
