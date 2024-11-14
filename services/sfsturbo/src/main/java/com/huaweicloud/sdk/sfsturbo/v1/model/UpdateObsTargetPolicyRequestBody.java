package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新后端存储自动同步策略请求体
 */
public class UpdateObsTargetPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private ObsDataRepositoryPolicy policy;

    public UpdateObsTargetPolicyRequestBody withPolicy(ObsDataRepositoryPolicy policy) {
        this.policy = policy;
        return this;
    }

    public UpdateObsTargetPolicyRequestBody withPolicy(Consumer<ObsDataRepositoryPolicy> policySetter) {
        if (this.policy == null) {
            this.policy = new ObsDataRepositoryPolicy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public ObsDataRepositoryPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(ObsDataRepositoryPolicy policy) {
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
        UpdateObsTargetPolicyRequestBody that = (UpdateObsTargetPolicyRequestBody) obj;
        return Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateObsTargetPolicyRequestBody {\n");
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
