package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateAccountAssignmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_assignment_creation_status")

    private AccountAssignmentOperationStatusDto accountAssignmentCreationStatus;

    public CreateAccountAssignmentResponse withAccountAssignmentCreationStatus(
        AccountAssignmentOperationStatusDto accountAssignmentCreationStatus) {
        this.accountAssignmentCreationStatus = accountAssignmentCreationStatus;
        return this;
    }

    public CreateAccountAssignmentResponse withAccountAssignmentCreationStatus(
        Consumer<AccountAssignmentOperationStatusDto> accountAssignmentCreationStatusSetter) {
        if (this.accountAssignmentCreationStatus == null) {
            this.accountAssignmentCreationStatus = new AccountAssignmentOperationStatusDto();
            accountAssignmentCreationStatusSetter.accept(this.accountAssignmentCreationStatus);
        }

        return this;
    }

    /**
     * Get accountAssignmentCreationStatus
     * @return accountAssignmentCreationStatus
     */
    public AccountAssignmentOperationStatusDto getAccountAssignmentCreationStatus() {
        return accountAssignmentCreationStatus;
    }

    public void setAccountAssignmentCreationStatus(
        AccountAssignmentOperationStatusDto accountAssignmentCreationStatus) {
        this.accountAssignmentCreationStatus = accountAssignmentCreationStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAccountAssignmentResponse that = (CreateAccountAssignmentResponse) obj;
        return Objects.equals(this.accountAssignmentCreationStatus, that.accountAssignmentCreationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountAssignmentCreationStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccountAssignmentResponse {\n");
        sb.append("    accountAssignmentCreationStatus: ")
            .append(toIndentedString(accountAssignmentCreationStatus))
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
