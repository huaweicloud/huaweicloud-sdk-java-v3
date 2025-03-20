package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetPolicyVersionV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_version")

    private PolicyVersion policyVersion;

    public GetPolicyVersionV5Response withPolicyVersion(PolicyVersion policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }

    public GetPolicyVersionV5Response withPolicyVersion(Consumer<PolicyVersion> policyVersionSetter) {
        if (this.policyVersion == null) {
            this.policyVersion = new PolicyVersion();
            policyVersionSetter.accept(this.policyVersion);
        }

        return this;
    }

    /**
     * Get policyVersion
     * @return policyVersion
     */
    public PolicyVersion getPolicyVersion() {
        return policyVersion;
    }

    public void setPolicyVersion(PolicyVersion policyVersion) {
        this.policyVersion = policyVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetPolicyVersionV5Response that = (GetPolicyVersionV5Response) obj;
        return Objects.equals(this.policyVersion, that.policyVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPolicyVersionV5Response {\n");
        sb.append("    policyVersion: ").append(toIndentedString(policyVersion)).append("\n");
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
