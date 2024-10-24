package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DescribeAccountAssignmentDeletionStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_assignment_deletion_status")

    private AccountAssignmentOperationStatusDto accountAssignmentDeletionStatus;

    public DescribeAccountAssignmentDeletionStatusResponse withAccountAssignmentDeletionStatus(
        AccountAssignmentOperationStatusDto accountAssignmentDeletionStatus) {
        this.accountAssignmentDeletionStatus = accountAssignmentDeletionStatus;
        return this;
    }

    public DescribeAccountAssignmentDeletionStatusResponse withAccountAssignmentDeletionStatus(
        Consumer<AccountAssignmentOperationStatusDto> accountAssignmentDeletionStatusSetter) {
        if (this.accountAssignmentDeletionStatus == null) {
            this.accountAssignmentDeletionStatus = new AccountAssignmentOperationStatusDto();
            accountAssignmentDeletionStatusSetter.accept(this.accountAssignmentDeletionStatus);
        }

        return this;
    }

    /**
     * Get accountAssignmentDeletionStatus
     * @return accountAssignmentDeletionStatus
     */
    public AccountAssignmentOperationStatusDto getAccountAssignmentDeletionStatus() {
        return accountAssignmentDeletionStatus;
    }

    public void setAccountAssignmentDeletionStatus(
        AccountAssignmentOperationStatusDto accountAssignmentDeletionStatus) {
        this.accountAssignmentDeletionStatus = accountAssignmentDeletionStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DescribeAccountAssignmentDeletionStatusResponse that = (DescribeAccountAssignmentDeletionStatusResponse) obj;
        return Objects.equals(this.accountAssignmentDeletionStatus, that.accountAssignmentDeletionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountAssignmentDeletionStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DescribeAccountAssignmentDeletionStatusResponse {\n");
        sb.append("    accountAssignmentDeletionStatus: ")
            .append(toIndentedString(accountAssignmentDeletionStatus))
            .append("\n");
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
