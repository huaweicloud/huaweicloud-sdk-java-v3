package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量导出策略组请求。
 */
public class ExportPolicyGroupsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_ids")

    private List<String> policyGroupIds = null;

    public ExportPolicyGroupsReq withPolicyGroupIds(List<String> policyGroupIds) {
        this.policyGroupIds = policyGroupIds;
        return this;
    }

    public ExportPolicyGroupsReq addPolicyGroupIdsItem(String policyGroupIdsItem) {
        if (this.policyGroupIds == null) {
            this.policyGroupIds = new ArrayList<>();
        }
        this.policyGroupIds.add(policyGroupIdsItem);
        return this;
    }

    public ExportPolicyGroupsReq withPolicyGroupIds(Consumer<List<String>> policyGroupIdsSetter) {
        if (this.policyGroupIds == null) {
            this.policyGroupIds = new ArrayList<>();
        }
        policyGroupIdsSetter.accept(this.policyGroupIds);
        return this;
    }

    /**
     * 导出策略组的id列表。
     * @return policyGroupIds
     */
    public List<String> getPolicyGroupIds() {
        return policyGroupIds;
    }

    public void setPolicyGroupIds(List<String> policyGroupIds) {
        this.policyGroupIds = policyGroupIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportPolicyGroupsReq that = (ExportPolicyGroupsReq) obj;
        return Objects.equals(this.policyGroupIds, that.policyGroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyGroupIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportPolicyGroupsReq {\n");
        sb.append("    policyGroupIds: ").append(toIndentedString(policyGroupIds)).append("\n");
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
