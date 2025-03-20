package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPasswordPolicyV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_policy")

    private PasswordPolicy passwordPolicy;

    public ShowPasswordPolicyV5Response withPasswordPolicy(PasswordPolicy passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
        return this;
    }

    public ShowPasswordPolicyV5Response withPasswordPolicy(Consumer<PasswordPolicy> passwordPolicySetter) {
        if (this.passwordPolicy == null) {
            this.passwordPolicy = new PasswordPolicy();
            passwordPolicySetter.accept(this.passwordPolicy);
        }

        return this;
    }

    /**
     * Get passwordPolicy
     * @return passwordPolicy
     */
    public PasswordPolicy getPasswordPolicy() {
        return passwordPolicy;
    }

    public void setPasswordPolicy(PasswordPolicy passwordPolicy) {
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
        ShowPasswordPolicyV5Response that = (ShowPasswordPolicyV5Response) obj;
        return Objects.equals(this.passwordPolicy, that.passwordPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwordPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPasswordPolicyV5Response {\n");
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
