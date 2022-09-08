package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateSecurityPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_policy")

    private UpdateSecurityPolicyOption securityPolicy;

    public UpdateSecurityPolicyRequestBody withSecurityPolicy(UpdateSecurityPolicyOption securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }

    public UpdateSecurityPolicyRequestBody withSecurityPolicy(
        Consumer<UpdateSecurityPolicyOption> securityPolicySetter) {
        if (this.securityPolicy == null) {
            this.securityPolicy = new UpdateSecurityPolicyOption();
            securityPolicySetter.accept(this.securityPolicy);
        }

        return this;
    }

    /**
     * Get securityPolicy
     * @return securityPolicy
     */
    public UpdateSecurityPolicyOption getSecurityPolicy() {
        return securityPolicy;
    }

    public void setSecurityPolicy(UpdateSecurityPolicyOption securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSecurityPolicyRequestBody updateSecurityPolicyRequestBody = (UpdateSecurityPolicyRequestBody) o;
        return Objects.equals(this.securityPolicy, updateSecurityPolicyRequestBody.securityPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecurityPolicyRequestBody {\n");
        sb.append("    securityPolicy: ").append(toIndentedString(securityPolicy)).append("\n");
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
