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
public class ListAccountAssignmentDeletionStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_assignments_deletion_status")

    private List<AccountAssignmentOperationStatusMetadataDto> accountAssignmentsDeletionStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListAccountAssignmentDeletionStatusResponse withAccountAssignmentsDeletionStatus(
        List<AccountAssignmentOperationStatusMetadataDto> accountAssignmentsDeletionStatus) {
        this.accountAssignmentsDeletionStatus = accountAssignmentsDeletionStatus;
        return this;
    }

    public ListAccountAssignmentDeletionStatusResponse addAccountAssignmentsDeletionStatusItem(
        AccountAssignmentOperationStatusMetadataDto accountAssignmentsDeletionStatusItem) {
        if (this.accountAssignmentsDeletionStatus == null) {
            this.accountAssignmentsDeletionStatus = new ArrayList<>();
        }
        this.accountAssignmentsDeletionStatus.add(accountAssignmentsDeletionStatusItem);
        return this;
    }

    public ListAccountAssignmentDeletionStatusResponse withAccountAssignmentsDeletionStatus(
        Consumer<List<AccountAssignmentOperationStatusMetadataDto>> accountAssignmentsDeletionStatusSetter) {
        if (this.accountAssignmentsDeletionStatus == null) {
            this.accountAssignmentsDeletionStatus = new ArrayList<>();
        }
        accountAssignmentsDeletionStatusSetter.accept(this.accountAssignmentsDeletionStatus);
        return this;
    }

    /**
     * 操作状态列表
     * @return accountAssignmentsDeletionStatus
     */
    public List<AccountAssignmentOperationStatusMetadataDto> getAccountAssignmentsDeletionStatus() {
        return accountAssignmentsDeletionStatus;
    }

    public void setAccountAssignmentsDeletionStatus(
        List<AccountAssignmentOperationStatusMetadataDto> accountAssignmentsDeletionStatus) {
        this.accountAssignmentsDeletionStatus = accountAssignmentsDeletionStatus;
    }

    public ListAccountAssignmentDeletionStatusResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAccountAssignmentDeletionStatusResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
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
        ListAccountAssignmentDeletionStatusResponse that = (ListAccountAssignmentDeletionStatusResponse) obj;
        return Objects.equals(this.accountAssignmentsDeletionStatus, that.accountAssignmentsDeletionStatus)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountAssignmentsDeletionStatus, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccountAssignmentDeletionStatusResponse {\n");
        sb.append("    accountAssignmentsDeletionStatus: ")
            .append(toIndentedString(accountAssignmentsDeletionStatus))
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
