package com.huaweicloud.sdk.codeartsrepo.v4.model;

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
public class AssociateGroupUserGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private List<MemberBaseDto> success = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure")

    private List<FailureForBatchCreateGroupMembersDto> failure = null;

    public AssociateGroupUserGroupResponse withSuccess(List<MemberBaseDto> success) {
        this.success = success;
        return this;
    }

    public AssociateGroupUserGroupResponse addSuccessItem(MemberBaseDto successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public AssociateGroupUserGroupResponse withSuccess(Consumer<List<MemberBaseDto>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 关联成功成员列表
     * @return success
     */
    public List<MemberBaseDto> getSuccess() {
        return success;
    }

    public void setSuccess(List<MemberBaseDto> success) {
        this.success = success;
    }

    public AssociateGroupUserGroupResponse withFailure(List<FailureForBatchCreateGroupMembersDto> failure) {
        this.failure = failure;
        return this;
    }

    public AssociateGroupUserGroupResponse addFailureItem(FailureForBatchCreateGroupMembersDto failureItem) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        this.failure.add(failureItem);
        return this;
    }

    public AssociateGroupUserGroupResponse withFailure(
        Consumer<List<FailureForBatchCreateGroupMembersDto>> failureSetter) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        failureSetter.accept(this.failure);
        return this;
    }

    /**
     * 关联失败成员列表
     * @return failure
     */
    public List<FailureForBatchCreateGroupMembersDto> getFailure() {
        return failure;
    }

    public void setFailure(List<FailureForBatchCreateGroupMembersDto> failure) {
        this.failure = failure;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateGroupUserGroupResponse that = (AssociateGroupUserGroupResponse) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.failure, that.failure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, failure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateGroupUserGroupResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
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
