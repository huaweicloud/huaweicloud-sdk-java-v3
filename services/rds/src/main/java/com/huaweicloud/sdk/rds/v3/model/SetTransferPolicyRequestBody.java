package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 转储策略请求体
 */
public class SetTransferPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private List<TransferPolicyParam> policy = null;

    public SetTransferPolicyRequestBody withPolicy(List<TransferPolicyParam> policy) {
        this.policy = policy;
        return this;
    }

    public SetTransferPolicyRequestBody addPolicyItem(TransferPolicyParam policyItem) {
        if (this.policy == null) {
            this.policy = new ArrayList<>();
        }
        this.policy.add(policyItem);
        return this;
    }

    public SetTransferPolicyRequestBody withPolicy(Consumer<List<TransferPolicyParam>> policySetter) {
        if (this.policy == null) {
            this.policy = new ArrayList<>();
        }
        policySetter.accept(this.policy);
        return this;
    }

    /**
     * 自动转储策略
     * @return policy
     */
    public List<TransferPolicyParam> getPolicy() {
        return policy;
    }

    public void setPolicy(List<TransferPolicyParam> policy) {
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
        SetTransferPolicyRequestBody that = (SetTransferPolicyRequestBody) obj;
        return Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetTransferPolicyRequestBody {\n");
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
