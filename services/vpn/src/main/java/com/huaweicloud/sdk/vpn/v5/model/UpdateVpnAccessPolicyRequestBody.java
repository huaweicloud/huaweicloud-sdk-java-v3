package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateVpnAccessPolicyRequestBody
 */
public class UpdateVpnAccessPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_policy")

    private UpdateVpnAccessPolicyRequestBodyContent accessPolicy;

    public UpdateVpnAccessPolicyRequestBody withAccessPolicy(UpdateVpnAccessPolicyRequestBodyContent accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    public UpdateVpnAccessPolicyRequestBody withAccessPolicy(
        Consumer<UpdateVpnAccessPolicyRequestBodyContent> accessPolicySetter) {
        if (this.accessPolicy == null) {
            this.accessPolicy = new UpdateVpnAccessPolicyRequestBodyContent();
            accessPolicySetter.accept(this.accessPolicy);
        }

        return this;
    }

    /**
     * Get accessPolicy
     * @return accessPolicy
     */
    public UpdateVpnAccessPolicyRequestBodyContent getAccessPolicy() {
        return accessPolicy;
    }

    public void setAccessPolicy(UpdateVpnAccessPolicyRequestBodyContent accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVpnAccessPolicyRequestBody that = (UpdateVpnAccessPolicyRequestBody) obj;
        return Objects.equals(this.accessPolicy, that.accessPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpnAccessPolicyRequestBody {\n");
        sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
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
