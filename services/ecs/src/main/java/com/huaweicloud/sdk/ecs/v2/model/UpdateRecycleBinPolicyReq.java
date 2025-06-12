package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateRecycleBinPolicyReq
 */
public class UpdateRecycleBinPolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private UpdateRecycleBinPolicyOption policy;

    public UpdateRecycleBinPolicyReq withPolicy(UpdateRecycleBinPolicyOption policy) {
        this.policy = policy;
        return this;
    }

    public UpdateRecycleBinPolicyReq withPolicy(Consumer<UpdateRecycleBinPolicyOption> policySetter) {
        if (this.policy == null) {
            this.policy = new UpdateRecycleBinPolicyOption();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public UpdateRecycleBinPolicyOption getPolicy() {
        return policy;
    }

    public void setPolicy(UpdateRecycleBinPolicyOption policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRecycleBinPolicyReq that = (UpdateRecycleBinPolicyReq) obj;
        return Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRecycleBinPolicyReq {\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
