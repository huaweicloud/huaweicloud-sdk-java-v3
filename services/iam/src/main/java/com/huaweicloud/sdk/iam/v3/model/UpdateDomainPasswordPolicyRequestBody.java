package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateDomainPasswordPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_policy")

    @JacksonXmlProperty(localName = "password_policy")

    private PasswordPolicyOption passwordPolicy;

    public UpdateDomainPasswordPolicyRequestBody withPasswordPolicy(PasswordPolicyOption passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
        return this;
    }

    public UpdateDomainPasswordPolicyRequestBody withPasswordPolicy(
        Consumer<PasswordPolicyOption> passwordPolicySetter) {
        if (this.passwordPolicy == null) {
            this.passwordPolicy = new PasswordPolicyOption();
            passwordPolicySetter.accept(this.passwordPolicy);
        }

        return this;
    }

    /**
     * Get passwordPolicy
     * @return passwordPolicy
     */
    public PasswordPolicyOption getPasswordPolicy() {
        return passwordPolicy;
    }

    public void setPasswordPolicy(PasswordPolicyOption passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainPasswordPolicyRequestBody updateDomainPasswordPolicyRequestBody =
            (UpdateDomainPasswordPolicyRequestBody) o;
        return Objects.equals(this.passwordPolicy, updateDomainPasswordPolicyRequestBody.passwordPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwordPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainPasswordPolicyRequestBody {\n");
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
