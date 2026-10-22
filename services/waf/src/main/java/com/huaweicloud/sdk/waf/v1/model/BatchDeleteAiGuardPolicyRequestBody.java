package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除策略请求
 */
public class BatchDeleteAiGuardPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_ids")

    private List<String> policyIds = null;

    public BatchDeleteAiGuardPolicyRequestBody withPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }

    public BatchDeleteAiGuardPolicyRequestBody addPolicyIdsItem(String policyIdsItem) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        this.policyIds.add(policyIdsItem);
        return this;
    }

    public BatchDeleteAiGuardPolicyRequestBody withPolicyIds(Consumer<List<String>> policyIdsSetter) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        policyIdsSetter.accept(this.policyIds);
        return this;
    }

    /**
     * 策略 ID 列表
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
        BatchDeleteAiGuardPolicyRequestBody that = (BatchDeleteAiGuardPolicyRequestBody) obj;
        return Objects.equals(this.policyIds, that.policyIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteAiGuardPolicyRequestBody {\n");
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
