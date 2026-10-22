package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchDeleteAiGuardPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_ids")

    private List<String> policyIds = null;

    public BatchDeleteAiGuardPolicyResponse withPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }

    public BatchDeleteAiGuardPolicyResponse addPolicyIdsItem(String policyIdsItem) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        this.policyIds.add(policyIdsItem);
        return this;
    }

    public BatchDeleteAiGuardPolicyResponse withPolicyIds(Consumer<List<String>> policyIdsSetter) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        policyIdsSetter.accept(this.policyIds);
        return this;
    }

    /**
     * 已删除的策略 ID 列表
     * @return policyIds
     */
    public List<String> getPolicyIds() {
        return policyIds;
    }

    public void setPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteAiGuardPolicyResponse that = (BatchDeleteAiGuardPolicyResponse) obj;
        return Objects.equals(this.policyIds, that.policyIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteAiGuardPolicyResponse {\n");
        sb.append("    policyIds: ").append(toIndentedString(policyIds)).append("\n");
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
