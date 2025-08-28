package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateTokenPolicyV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_policy")

    private TokenPolicy tokenPolicy;

    public UpdateTokenPolicyV5Response withTokenPolicy(TokenPolicy tokenPolicy) {
        this.tokenPolicy = tokenPolicy;
        return this;
    }

    public UpdateTokenPolicyV5Response withTokenPolicy(Consumer<TokenPolicy> tokenPolicySetter) {
        if (this.tokenPolicy == null) {
            this.tokenPolicy = new TokenPolicy();
            tokenPolicySetter.accept(this.tokenPolicy);
        }

        return this;
    }

    /**
     * Get tokenPolicy
     * @return tokenPolicy
     */
    public TokenPolicy getTokenPolicy() {
        return tokenPolicy;
    }

    public void setTokenPolicy(TokenPolicy tokenPolicy) {
        this.tokenPolicy = tokenPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTokenPolicyV5Response that = (UpdateTokenPolicyV5Response) obj;
        return Objects.equals(this.tokenPolicy, that.tokenPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tokenPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTokenPolicyV5Response {\n");
        sb.append("    tokenPolicy: ").append(toIndentedString(tokenPolicy)).append("\n");
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
