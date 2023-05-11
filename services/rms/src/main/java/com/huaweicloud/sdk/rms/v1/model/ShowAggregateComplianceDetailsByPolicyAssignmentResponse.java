package com.huaweicloud.sdk.rms.v1.model;

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
public class ShowAggregateComplianceDetailsByPolicyAssignmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_states")

    private List<PolicyState> policyStates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ShowAggregateComplianceDetailsByPolicyAssignmentResponse withPolicyStates(List<PolicyState> policyStates) {
        this.policyStates = policyStates;
        return this;
    }

    public ShowAggregateComplianceDetailsByPolicyAssignmentResponse addPolicyStatesItem(PolicyState policyStatesItem) {
        if (this.policyStates == null) {
            this.policyStates = new ArrayList<>();
        }
        this.policyStates.add(policyStatesItem);
        return this;
    }

    public ShowAggregateComplianceDetailsByPolicyAssignmentResponse withPolicyStates(
        Consumer<List<PolicyState>> policyStatesSetter) {
        if (this.policyStates == null) {
            this.policyStates = new ArrayList<>();
        }
        policyStatesSetter.accept(this.policyStates);
        return this;
    }

    /**
     * 合规结果查询返回值
     * @return policyStates
     */
    public List<PolicyState> getPolicyStates() {
        return policyStates;
    }

    public void setPolicyStates(List<PolicyState> policyStates) {
        this.policyStates = policyStates;
    }

    public ShowAggregateComplianceDetailsByPolicyAssignmentResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ShowAggregateComplianceDetailsByPolicyAssignmentResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAggregateComplianceDetailsByPolicyAssignmentResponse showAggregateComplianceDetailsByPolicyAssignmentResponse =
            (ShowAggregateComplianceDetailsByPolicyAssignmentResponse) o;
        return Objects.equals(this.policyStates, showAggregateComplianceDetailsByPolicyAssignmentResponse.policyStates)
            && Objects.equals(this.pageInfo, showAggregateComplianceDetailsByPolicyAssignmentResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyStates, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAggregateComplianceDetailsByPolicyAssignmentResponse {\n");
        sb.append("    policyStates: ").append(toIndentedString(policyStates)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
