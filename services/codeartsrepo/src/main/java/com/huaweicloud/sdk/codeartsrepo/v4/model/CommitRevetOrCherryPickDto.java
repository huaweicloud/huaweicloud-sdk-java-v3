package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CommitRevetOrCherryPickDto
 */
public class CommitRevetOrCherryPickDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_new_merge_request")

    private Boolean withNewMergeRequest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public CommitRevetOrCherryPickDto withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * revert目标分支
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public CommitRevetOrCherryPickDto withWithNewMergeRequest(Boolean withNewMergeRequest) {
        this.withNewMergeRequest = withNewMergeRequest;
        return this;
    }

    /**
     * 是否使用创建MR的形式Revert
     * @return withNewMergeRequest
     */
    public Boolean getWithNewMergeRequest() {
        return withNewMergeRequest;
    }

    public void setWithNewMergeRequest(Boolean withNewMergeRequest) {
        this.withNewMergeRequest = withNewMergeRequest;
    }

    public CommitRevetOrCherryPickDto withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 提交信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommitRevetOrCherryPickDto that = (CommitRevetOrCherryPickDto) obj;
        return Objects.equals(this.branch, that.branch)
            && Objects.equals(this.withNewMergeRequest, that.withNewMergeRequest)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch, withNewMergeRequest, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitRevetOrCherryPickDto {\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    withNewMergeRequest: ").append(toIndentedString(withNewMergeRequest)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
