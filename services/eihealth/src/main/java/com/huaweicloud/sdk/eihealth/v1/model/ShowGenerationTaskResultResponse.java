package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowGenerationTaskResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AsyncTaskStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_data")

    private GenerationTaskData taskData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private GenerationResult result;

    public ShowGenerationTaskResultResponse withStatus(AsyncTaskStatus status) {
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

    public ShowGenerationTaskResultResponse withTaskData(GenerationTaskData taskData) {
        this.taskData = taskData;
        return this;
    }

    public ShowGenerationTaskResultResponse withTaskData(Consumer<GenerationTaskData> taskDataSetter) {
        if (this.taskData == null) {
            this.taskData = new GenerationTaskData();
            taskDataSetter.accept(this.taskData);
        }

        return this;
    }

    /**
     * Get taskData
     * @return taskData
     */
    public GenerationTaskData getTaskData() {
        return taskData;
    }

    public void setTaskData(GenerationTaskData taskData) {
        this.taskData = taskData;
    }

    public ShowGenerationTaskResultResponse withResult(GenerationResult result) {
        this.result = result;
        return this;
    }

    public ShowGenerationTaskResultResponse withResult(Consumer<GenerationResult> resultSetter) {
        if (this.result == null) {
            this.result = new GenerationResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public GenerationResult getResult() {
        return result;
    }

    public void setResult(GenerationResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGenerationTaskResultResponse that = (ShowGenerationTaskResultResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.taskData, that.taskData)
            && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, taskData, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGenerationTaskResultResponse {\n");
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
