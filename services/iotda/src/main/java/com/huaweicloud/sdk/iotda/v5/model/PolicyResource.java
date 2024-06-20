package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 预调配模板设备策略资源详情结构体。
 */
public class PolicyResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_ids")

    private List<String> policyIds = null;

    public PolicyResource withPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }

    public PolicyResource addPolicyIdsItem(String policyIdsItem) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        this.policyIds.add(policyIdsItem);
        return this;
    }

    public PolicyResource withPolicyIds(Consumer<List<String>> policyIdsSetter) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        policyIdsSetter.accept(this.policyIds);
        return this;
    }

    /**
     * **参数说明**：设备需要绑定的策略id列表
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
        PolicyResource that = (PolicyResource) obj;
        return Objects.equals(this.policyIds, that.policyIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyResource {\n");
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
