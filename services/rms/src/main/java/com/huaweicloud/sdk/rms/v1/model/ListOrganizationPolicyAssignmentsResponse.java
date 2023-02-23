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
public class ListOrganizationPolicyAssignmentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_policy_assignments")

    private List<OrganizationPolicyAssignmentResponse> organizationPolicyAssignments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListOrganizationPolicyAssignmentsResponse withOrganizationPolicyAssignments(
        List<OrganizationPolicyAssignmentResponse> organizationPolicyAssignments) {
        this.organizationPolicyAssignments = organizationPolicyAssignments;
        return this;
    }

    public ListOrganizationPolicyAssignmentsResponse addOrganizationPolicyAssignmentsItem(
        OrganizationPolicyAssignmentResponse organizationPolicyAssignmentsItem) {
        if (this.organizationPolicyAssignments == null) {
            this.organizationPolicyAssignments = new ArrayList<>();
        }
        this.organizationPolicyAssignments.add(organizationPolicyAssignmentsItem);
        return this;
    }

    public ListOrganizationPolicyAssignmentsResponse withOrganizationPolicyAssignments(
        Consumer<List<OrganizationPolicyAssignmentResponse>> organizationPolicyAssignmentsSetter) {
        if (this.organizationPolicyAssignments == null) {
            this.organizationPolicyAssignments = new ArrayList<>();
        }
        organizationPolicyAssignmentsSetter.accept(this.organizationPolicyAssignments);
        return this;
    }

    /**
     * 组织合规规则列表。
     * @return organizationPolicyAssignments
     */
    public List<OrganizationPolicyAssignmentResponse> getOrganizationPolicyAssignments() {
        return organizationPolicyAssignments;
    }

    public void setOrganizationPolicyAssignments(
        List<OrganizationPolicyAssignmentResponse> organizationPolicyAssignments) {
        this.organizationPolicyAssignments = organizationPolicyAssignments;
    }

    public ListOrganizationPolicyAssignmentsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListOrganizationPolicyAssignmentsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListOrganizationPolicyAssignmentsResponse listOrganizationPolicyAssignmentsResponse =
            (ListOrganizationPolicyAssignmentsResponse) o;
        return Objects.equals(this.organizationPolicyAssignments,
            listOrganizationPolicyAssignmentsResponse.organizationPolicyAssignments)
            && Objects.equals(this.pageInfo, listOrganizationPolicyAssignmentsResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationPolicyAssignments, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOrganizationPolicyAssignmentsResponse {\n");
        sb.append("    organizationPolicyAssignments: ")
            .append(toIndentedString(organizationPolicyAssignments))
            .append("\n");
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
