package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DescribePasswordPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_policy")

    private PasswordPolicyDto passwordPolicy;

    public DescribePasswordPolicyResponse withPasswordPolicy(PasswordPolicyDto passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
        return this;
    }

    public DescribePasswordPolicyResponse withPasswordPolicy(Consumer<PasswordPolicyDto> passwordPolicySetter) {
        if (this.passwordPolicy == null) {
            this.passwordPolicy = new PasswordPolicyDto();
            passwordPolicySetter.accept(this.passwordPolicy);
        }

        return this;
    }

    /**
     * Get passwordPolicy
     * @return passwordPolicy
     */
    public PasswordPolicyDto getPasswordPolicy() {
        return passwordPolicy;
    }

    public void setPasswordPolicy(PasswordPolicyDto passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DescribePasswordPolicyResponse that = (DescribePasswordPolicyResponse) obj;
        return Objects.equals(this.passwordPolicy, that.passwordPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwordPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DescribePasswordPolicyResponse {\n");
        sb.append("    passwordPolicy: ").append(toIndentedString(passwordPolicy)).append("\n");
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
