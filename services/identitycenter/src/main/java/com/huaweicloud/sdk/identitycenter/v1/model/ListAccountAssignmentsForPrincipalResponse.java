package com.huaweicloud.sdk.identitycenter.v1.model;

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
public class ListAccountAssignmentsForPrincipalResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_assignments")

    private List<AccountAssignmentDto> accountAssignments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListAccountAssignmentsForPrincipalResponse withAccountAssignments(
        List<AccountAssignmentDto> accountAssignments) {
        this.accountAssignments = accountAssignments;
        return this;
    }

    public ListAccountAssignmentsForPrincipalResponse addAccountAssignmentsItem(
        AccountAssignmentDto accountAssignmentsItem) {
        if (this.accountAssignments == null) {
            this.accountAssignments = new ArrayList<>();
        }
        this.accountAssignments.add(accountAssignmentsItem);
        return this;
    }

    public ListAccountAssignmentsForPrincipalResponse withAccountAssignments(
        Consumer<List<AccountAssignmentDto>> accountAssignmentsSetter) {
        if (this.accountAssignments == null) {
            this.accountAssignments = new ArrayList<>();
        }
        accountAssignmentsSetter.accept(this.accountAssignments);
        return this;
    }

    /**
     * 满足查询条件的账号分配列表
     * @return accountAssignments
     */
    public List<AccountAssignmentDto> getAccountAssignments() {
        return accountAssignments;
    }

    public void setAccountAssignments(List<AccountAssignmentDto> accountAssignments) {
        this.accountAssignments = accountAssignments;
    }

    public ListAccountAssignmentsForPrincipalResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAccountAssignmentsForPrincipalResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAccountAssignmentsForPrincipalResponse that = (ListAccountAssignmentsForPrincipalResponse) obj;
        return Objects.equals(this.accountAssignments, that.accountAssignments)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountAssignments, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccountAssignmentsForPrincipalResponse {\n");
        sb.append("    accountAssignments: ").append(toIndentedString(accountAssignments)).append("\n");
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
