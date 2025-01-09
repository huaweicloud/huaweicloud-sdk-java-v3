package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListPolicyGroupInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_groups")

    private List<PolicyGroupForList> policyGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListPolicyGroupInfoResponse withPolicyGroups(List<PolicyGroupForList> policyGroups) {
        this.policyGroups = policyGroups;
        return this;
    }

    public ListPolicyGroupInfoResponse addPolicyGroupsItem(PolicyGroupForList policyGroupsItem) {
        if (this.policyGroups == null) {
            this.policyGroups = new ArrayList<>();
        }
        this.policyGroups.add(policyGroupsItem);
        return this;
    }

    public ListPolicyGroupInfoResponse withPolicyGroups(Consumer<List<PolicyGroupForList>> policyGroupsSetter) {
        if (this.policyGroups == null) {
            this.policyGroups = new ArrayList<>();
        }
        policyGroupsSetter.accept(this.policyGroups);
        return this;
    }

    /**
     * 策略组。
     * @return policyGroups
     */
    public List<PolicyGroupForList> getPolicyGroups() {
        return policyGroups;
    }

    public void setPolicyGroups(List<PolicyGroupForList> policyGroups) {
        this.policyGroups = policyGroups;
    }

    public ListPolicyGroupInfoResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPolicyGroupInfoResponse that = (ListPolicyGroupInfoResponse) obj;
        return Objects.equals(this.policyGroups, that.policyGroups) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyGroups, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyGroupInfoResponse {\n");
        sb.append("    policyGroups: ").append(toIndentedString(policyGroups)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
