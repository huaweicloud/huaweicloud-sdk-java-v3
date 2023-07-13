package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteAccessPoliciesReq
 */
public class BatchDeleteAccessPoliciesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id_list")

    private List<String> policyIdList = null;

    public BatchDeleteAccessPoliciesReq withPolicyIdList(List<String> policyIdList) {
        this.policyIdList = policyIdList;
        return this;
    }

    public BatchDeleteAccessPoliciesReq addPolicyIdListItem(String policyIdListItem) {
        if (this.policyIdList == null) {
            this.policyIdList = new ArrayList<>();
        }
        this.policyIdList.add(policyIdListItem);
        return this;
    }

    public BatchDeleteAccessPoliciesReq withPolicyIdList(Consumer<List<String>> policyIdListSetter) {
        if (this.policyIdList == null) {
            this.policyIdList = new ArrayList<>();
        }
        policyIdListSetter.accept(this.policyIdList);
        return this;
    }

    /**
     * 策略ID列表。
     * @return policyIdList
     */
    public List<String> getPolicyIdList() {
        return policyIdList;
    }

    public void setPolicyIdList(List<String> policyIdList) {
        this.policyIdList = policyIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteAccessPoliciesReq that = (BatchDeleteAccessPoliciesReq) obj;
        return Objects.equals(this.policyIdList, that.policyIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteAccessPoliciesReq {\n");
        sb.append("    policyIdList: ").append(toIndentedString(policyIdList)).append("\n");
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
