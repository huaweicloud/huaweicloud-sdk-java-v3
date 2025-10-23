package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MrCherryRevertDto
 */
public class MrCherryRevertDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_new_merge_request")

    private Boolean withNewMergeRequest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public MrCherryRevertDto withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 分支名
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public MrCherryRevertDto withWithNewMergeRequest(Boolean withNewMergeRequest) {
        this.withNewMergeRequest = withNewMergeRequest;
        return this;
    }

    /**
     * 是否通过新建合并请求来Cherry pick或revert合并请求
     * @return withNewMergeRequest
     */
    public Boolean getWithNewMergeRequest() {
        return withNewMergeRequest;
    }

    public void setWithNewMergeRequest(Boolean withNewMergeRequest) {
        this.withNewMergeRequest = withNewMergeRequest;
    }

    public MrCherryRevertDto withMessage(String message) {
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
        MrCherryRevertDto that = (MrCherryRevertDto) obj;
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
        sb.append("class MrCherryRevertDto {\n");
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
