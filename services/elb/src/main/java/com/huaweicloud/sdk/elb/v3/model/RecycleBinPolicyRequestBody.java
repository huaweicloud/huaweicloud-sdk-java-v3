package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新回收站配置的请求体。
 */
public class RecycleBinPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private RecycleBinPolicy policy;

    public RecycleBinPolicyRequestBody withPolicy(RecycleBinPolicy policy) {
        this.policy = policy;
        return this;
    }

    public RecycleBinPolicyRequestBody withPolicy(Consumer<RecycleBinPolicy> policySetter) {
        if (this.policy == null) {
            this.policy = new RecycleBinPolicy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public RecycleBinPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(RecycleBinPolicy policy) {
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
        RecycleBinPolicyRequestBody that = (RecycleBinPolicyRequestBody) obj;
        return Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecycleBinPolicyRequestBody {\n");
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
