package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSynthesisTaskResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AsyncTaskStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_data")

    private SynthesisTaskData taskData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private SynthesisResult result;

    public ShowSynthesisTaskResultResponse withStatus(AsyncTaskStatus status) {
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

    public ShowSynthesisTaskResultResponse withTaskData(SynthesisTaskData taskData) {
        this.taskData = taskData;
        return this;
    }

    public ShowSynthesisTaskResultResponse withTaskData(Consumer<SynthesisTaskData> taskDataSetter) {
        if (this.taskData == null) {
            this.taskData = new SynthesisTaskData();
            taskDataSetter.accept(this.taskData);
        }

        return this;
    }

    /**
     * Get taskData
     * @return taskData
     */
    public SynthesisTaskData getTaskData() {
        return taskData;
    }

    public void setTaskData(SynthesisTaskData taskData) {
        this.taskData = taskData;
    }

    public ShowSynthesisTaskResultResponse withResult(SynthesisResult result) {
        this.result = result;
        return this;
    }

    public ShowSynthesisTaskResultResponse withResult(Consumer<SynthesisResult> resultSetter) {
        if (this.result == null) {
            this.result = new SynthesisResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public SynthesisResult getResult() {
        return result;
    }

    public void setResult(SynthesisResult result) {
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
        ShowSynthesisTaskResultResponse showSynthesisTaskResultResponse = (ShowSynthesisTaskResultResponse) o;
        return Objects.equals(this.status, showSynthesisTaskResultResponse.status)
            && Objects.equals(this.taskData, showSynthesisTaskResultResponse.taskData)
            && Objects.equals(this.result, showSynthesisTaskResultResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, taskData, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSynthesisTaskResultResponse {\n");
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
