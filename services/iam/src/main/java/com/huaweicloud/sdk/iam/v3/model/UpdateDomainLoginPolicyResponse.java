package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateDomainLoginPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_policy")

    private LoginPolicyResult loginPolicy;

    public UpdateDomainLoginPolicyResponse withLoginPolicy(LoginPolicyResult loginPolicy) {
        this.loginPolicy = loginPolicy;
        return this;
    }

    public UpdateDomainLoginPolicyResponse withLoginPolicy(Consumer<LoginPolicyResult> loginPolicySetter) {
        if (this.loginPolicy == null) {
            this.loginPolicy = new LoginPolicyResult();
            loginPolicySetter.accept(this.loginPolicy);
        }

        return this;
    }

    /**
     * Get loginPolicy
     * @return loginPolicy
     */
    public LoginPolicyResult getLoginPolicy() {
        return loginPolicy;
    }

    public void setLoginPolicy(LoginPolicyResult loginPolicy) {
        this.loginPolicy = loginPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainLoginPolicyResponse updateDomainLoginPolicyResponse = (UpdateDomainLoginPolicyResponse) o;
        return Objects.equals(this.loginPolicy, updateDomainLoginPolicyResponse.loginPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainLoginPolicyResponse {\n");
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
