package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateDomainProtectPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_policy")

    private ProtectPolicyOption protectPolicy;

    public UpdateDomainProtectPolicyRequestBody withProtectPolicy(ProtectPolicyOption protectPolicy) {
        this.protectPolicy = protectPolicy;
        return this;
    }

    public UpdateDomainProtectPolicyRequestBody withProtectPolicy(Consumer<ProtectPolicyOption> protectPolicySetter) {
        if (this.protectPolicy == null) {
            this.protectPolicy = new ProtectPolicyOption();
            protectPolicySetter.accept(this.protectPolicy);
        }

        return this;
    }

    /**
     * Get protectPolicy
     * @return protectPolicy
     */
    public ProtectPolicyOption getProtectPolicy() {
        return protectPolicy;
    }

    public void setProtectPolicy(ProtectPolicyOption protectPolicy) {
        this.protectPolicy = protectPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainProtectPolicyRequestBody updateDomainProtectPolicyRequestBody =
            (UpdateDomainProtectPolicyRequestBody) o;
        return Objects.equals(this.protectPolicy, updateDomainProtectPolicyRequestBody.protectPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainProtectPolicyRequestBody {\n");
        sb.append("    protectPolicy: ").append(toIndentedString(protectPolicy)).append("\n");
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
