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
public class ListAccountAssignmentCreationStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_assignments_creation_status")

    private List<AccountAssignmentOperationStatusMetadataDto> accountAssignmentsCreationStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListAccountAssignmentCreationStatusResponse withAccountAssignmentsCreationStatus(
        List<AccountAssignmentOperationStatusMetadataDto> accountAssignmentsCreationStatus) {
        this.accountAssignmentsCreationStatus = accountAssignmentsCreationStatus;
        return this;
    }

    public ListAccountAssignmentCreationStatusResponse addAccountAssignmentsCreationStatusItem(
        AccountAssignmentOperationStatusMetadataDto accountAssignmentsCreationStatusItem) {
        if (this.accountAssignmentsCreationStatus == null) {
            this.accountAssignmentsCreationStatus = new ArrayList<>();
        }
        this.accountAssignmentsCreationStatus.add(accountAssignmentsCreationStatusItem);
        return this;
    }

    public ListAccountAssignmentCreationStatusResponse withAccountAssignmentsCreationStatus(
        Consumer<List<AccountAssignmentOperationStatusMetadataDto>> accountAssignmentsCreationStatusSetter) {
        if (this.accountAssignmentsCreationStatus == null) {
            this.accountAssignmentsCreationStatus = new ArrayList<>();
        }
        accountAssignmentsCreationStatusSetter.accept(this.accountAssignmentsCreationStatus);
        return this;
    }

    /**
     * 操作状态列表.
     * @return accountAssignmentsCreationStatus
     */
    public List<AccountAssignmentOperationStatusMetadataDto> getAccountAssignmentsCreationStatus() {
        return accountAssignmentsCreationStatus;
    }

    public void setAccountAssignmentsCreationStatus(
        List<AccountAssignmentOperationStatusMetadataDto> accountAssignmentsCreationStatus) {
        this.accountAssignmentsCreationStatus = accountAssignmentsCreationStatus;
    }

    public ListAccountAssignmentCreationStatusResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAccountAssignmentCreationStatusResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
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
        ListAccountAssignmentCreationStatusResponse that = (ListAccountAssignmentCreationStatusResponse) obj;
        return Objects.equals(this.accountAssignmentsCreationStatus, that.accountAssignmentsCreationStatus)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountAssignmentsCreationStatus, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccountAssignmentCreationStatusResponse {\n");
        sb.append("    accountAssignmentsCreationStatus: ")
            .append(toIndentedString(accountAssignmentsCreationStatus))
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
