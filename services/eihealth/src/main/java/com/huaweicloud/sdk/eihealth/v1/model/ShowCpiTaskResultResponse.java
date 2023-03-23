package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCpiTaskResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AsyncTaskStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_data")

    private CpiTaskData taskData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private CpiResult result;

    public ShowCpiTaskResultResponse withStatus(AsyncTaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public AsyncTaskStatus getStatus() {
        return status;
    }

    public void setStatus(AsyncTaskStatus status) {
        this.status = status;
    }

    public ShowCpiTaskResultResponse withTaskData(CpiTaskData taskData) {
        this.taskData = taskData;
        return this;
    }

    public ShowCpiTaskResultResponse withTaskData(Consumer<CpiTaskData> taskDataSetter) {
        if (this.taskData == null) {
            this.taskData = new CpiTaskData();
            taskDataSetter.accept(this.taskData);
        }

        return this;
    }

    /**
     * Get taskData
     * @return taskData
     */
    public CpiTaskData getTaskData() {
        return taskData;
    }

    public void setTaskData(CpiTaskData taskData) {
        this.taskData = taskData;
    }

    public ShowCpiTaskResultResponse withResult(CpiResult result) {
        this.result = result;
        return this;
    }

    public ShowCpiTaskResultResponse withResult(Consumer<CpiResult> resultSetter) {
        if (this.result == null) {
            this.result = new CpiResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public CpiResult getResult() {
        return result;
    }

    public void setResult(CpiResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCpiTaskResultResponse showCpiTaskResultResponse = (ShowCpiTaskResultResponse) o;
        return Objects.equals(this.status, showCpiTaskResultResponse.status)
            && Objects.equals(this.taskData, showCpiTaskResultResponse.taskData)
            && Objects.equals(this.result, showCpiTaskResultResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, taskData, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCpiTaskResultResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskData: ").append(toIndentedString(taskData)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
