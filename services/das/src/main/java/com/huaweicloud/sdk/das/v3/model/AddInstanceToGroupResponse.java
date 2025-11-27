package com.huaweicloud.sdk.das.v3.model;

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
public class AddInstanceToGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_instance_ids")

    private List<String> successInstanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_instance_ids")

    private List<String> failedInstanceIds = null;

    public AddInstanceToGroupResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 是否成功
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public AddInstanceToGroupResponse withSuccessInstanceIds(List<String> successInstanceIds) {
        this.successInstanceIds = successInstanceIds;
        return this;
    }

    public AddInstanceToGroupResponse addSuccessInstanceIdsItem(String successInstanceIdsItem) {
        if (this.successInstanceIds == null) {
            this.successInstanceIds = new ArrayList<>();
        }
        this.successInstanceIds.add(successInstanceIdsItem);
        return this;
    }

    public AddInstanceToGroupResponse withSuccessInstanceIds(Consumer<List<String>> successInstanceIdsSetter) {
        if (this.successInstanceIds == null) {
            this.successInstanceIds = new ArrayList<>();
        }
        successInstanceIdsSetter.accept(this.successInstanceIds);
        return this;
    }

    /**
     * 成功的实例ID列表
     * @return successInstanceIds
     */
    public List<String> getSuccessInstanceIds() {
        return successInstanceIds;
    }

    public void setSuccessInstanceIds(List<String> successInstanceIds) {
        this.successInstanceIds = successInstanceIds;
    }

    public AddInstanceToGroupResponse withFailedInstanceIds(List<String> failedInstanceIds) {
        this.failedInstanceIds = failedInstanceIds;
        return this;
    }

    public AddInstanceToGroupResponse addFailedInstanceIdsItem(String failedInstanceIdsItem) {
        if (this.failedInstanceIds == null) {
            this.failedInstanceIds = new ArrayList<>();
        }
        this.failedInstanceIds.add(failedInstanceIdsItem);
        return this;
    }

    public AddInstanceToGroupResponse withFailedInstanceIds(Consumer<List<String>> failedInstanceIdsSetter) {
        if (this.failedInstanceIds == null) {
            this.failedInstanceIds = new ArrayList<>();
        }
        failedInstanceIdsSetter.accept(this.failedInstanceIds);
        return this;
    }

    /**
     * 失败的实例ID列表
     * @return failedInstanceIds
     */
    public List<String> getFailedInstanceIds() {
        return failedInstanceIds;
    }

    public void setFailedInstanceIds(List<String> failedInstanceIds) {
        this.failedInstanceIds = failedInstanceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddInstanceToGroupResponse that = (AddInstanceToGroupResponse) obj;
        return Objects.equals(this.success, that.success)
            && Objects.equals(this.successInstanceIds, that.successInstanceIds)
            && Objects.equals(this.failedInstanceIds, that.failedInstanceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, successInstanceIds, failedInstanceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddInstanceToGroupResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    successInstanceIds: ").append(toIndentedString(successInstanceIds)).append("\n");
        sb.append("    failedInstanceIds: ").append(toIndentedString(failedInstanceIds)).append("\n");
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
