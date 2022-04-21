package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCustomPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private PolicyRoleResult role;

    public ShowCustomPolicyResponse withRole(PolicyRoleResult role) {
        this.role = role;
        return this;
    }

    public ShowCustomPolicyResponse withRole(Consumer<PolicyRoleResult> roleSetter) {
        if (this.role == null) {
            this.role = new PolicyRoleResult();
            roleSetter.accept(this.role);
        }

        return this;
    }

    /**
     * Get role
     * @return role
     */
    public PolicyRoleResult getRole() {
        return role;
    }

    public void setRole(PolicyRoleResult role) {
        this.role = role;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCustomPolicyResponse showCustomPolicyResponse = (ShowCustomPolicyResponse) o;
        return Objects.equals(this.role, showCustomPolicyResponse.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCustomPolicyResponse {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
