package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModifyPolicyGroupRequest
 */
public class ModifyPolicyGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group")

    private PolicyGroupForUpdate policyGroup;

    public ModifyPolicyGroupRequest withPolicyGroup(PolicyGroupForUpdate policyGroup) {
        this.policyGroup = policyGroup;
        return this;
    }

    public ModifyPolicyGroupRequest withPolicyGroup(Consumer<PolicyGroupForUpdate> policyGroupSetter) {
        if (this.policyGroup == null) {
            this.policyGroup = new PolicyGroupForUpdate();
            policyGroupSetter.accept(this.policyGroup);
        }

        return this;
    }

    /**
     * Get policyGroup
     * @return policyGroup
     */
    public PolicyGroupForUpdate getPolicyGroup() {
        return policyGroup;
    }

    public void setPolicyGroup(PolicyGroupForUpdate policyGroup) {
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
        ModifyPolicyGroupRequest that = (ModifyPolicyGroupRequest) obj;
        return Objects.equals(this.policyGroup, that.policyGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyPolicyGroupRequest {\n");
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
