package com.huaweicloud.sdk.roma.v2.model;

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
public class BatchStartOrStopTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_count")

    private Integer failureCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure")

    private List<TaskBeanFacade> failure = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private List<TaskBeanFacade> success = null;

    public BatchStartOrStopTasksResponse withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 成功的个数
     * minimum: 0
     * maximum: 999999
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public BatchStartOrStopTasksResponse withFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
        return this;
    }

    /**
     * 失败的个数
     * minimum: 0
     * maximum: 999999
     * @return failureCount
     */
    public Integer getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
    }

    public BatchStartOrStopTasksResponse withFailure(List<TaskBeanFacade> failure) {
        this.failure = failure;
        return this;
    }

    public BatchStartOrStopTasksResponse addFailureItem(TaskBeanFacade failureItem) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        this.failure.add(failureItem);
        return this;
    }

    public BatchStartOrStopTasksResponse withFailure(Consumer<List<TaskBeanFacade>> failureSetter) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        failureSetter.accept(this.failure);
        return this;
    }

    /**
     * 失败的详情
     * @return failure
     */
    public List<TaskBeanFacade> getFailure() {
        return failure;
    }

    public void setFailure(List<TaskBeanFacade> failure) {
        this.failure = failure;
    }

    public BatchStartOrStopTasksResponse withSuccess(List<TaskBeanFacade> success) {
        this.success = success;
        return this;
    }

    public BatchStartOrStopTasksResponse addSuccessItem(TaskBeanFacade successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public BatchStartOrStopTasksResponse withSuccess(Consumer<List<TaskBeanFacade>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 成功的任务信息
     * @return success
     */
    public List<TaskBeanFacade> getSuccess() {
        return success;
    }

    public void setSuccess(List<TaskBeanFacade> success) {
        this.success = success;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchStartOrStopTasksResponse that = (BatchStartOrStopTasksResponse) obj;
        return Objects.equals(this.successCount, that.successCount)
            && Objects.equals(this.failureCount, that.failureCount) && Objects.equals(this.failure, that.failure)
            && Objects.equals(this.success, that.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successCount, failureCount, failure, success);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStartOrStopTasksResponse {\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    failureCount: ").append(toIndentedString(failureCount)).append("\n");
        sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
