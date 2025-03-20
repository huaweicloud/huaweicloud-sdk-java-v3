package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLoginPolicyV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_policy")

    private LoginPolicy loginPolicy;

    public ShowLoginPolicyV5Response withLoginPolicy(LoginPolicy loginPolicy) {
        this.loginPolicy = loginPolicy;
        return this;
    }

    public ShowLoginPolicyV5Response withLoginPolicy(Consumer<LoginPolicy> loginPolicySetter) {
        if (this.loginPolicy == null) {
            this.loginPolicy = new LoginPolicy();
            loginPolicySetter.accept(this.loginPolicy);
        }

        return this;
    }

    /**
     * Get loginPolicy
     * @return loginPolicy
     */
    public LoginPolicy getLoginPolicy() {
        return loginPolicy;
    }

    public void setLoginPolicy(LoginPolicy loginPolicy) {
        this.loginPolicy = loginPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLoginPolicyV5Response that = (ShowLoginPolicyV5Response) obj;
        return Objects.equals(this.loginPolicy, that.loginPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLoginPolicyV5Response {\n");
        sb.append("    loginPolicy: ").append(toIndentedString(loginPolicy)).append("\n");
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
