package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSearchTaskResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AsyncTaskStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_data")

    private SearchTaskData taskData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private SearchResult result;

    public ShowSearchTaskResultResponse withStatus(AsyncTaskStatus status) {
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

    public ShowSearchTaskResultResponse withTaskData(SearchTaskData taskData) {
        this.taskData = taskData;
        return this;
    }

    public ShowSearchTaskResultResponse withTaskData(Consumer<SearchTaskData> taskDataSetter) {
        if (this.taskData == null) {
            this.taskData = new SearchTaskData();
            taskDataSetter.accept(this.taskData);
        }

        return this;
    }

    /**
     * Get taskData
     * @return taskData
     */
    public SearchTaskData getTaskData() {
        return taskData;
    }

    public void setTaskData(SearchTaskData taskData) {
        this.taskData = taskData;
    }

    public ShowSearchTaskResultResponse withResult(SearchResult result) {
        this.result = result;
        return this;
    }

    public ShowSearchTaskResultResponse withResult(Consumer<SearchResult> resultSetter) {
        if (this.result == null) {
            this.result = new SearchResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public SearchResult getResult() {
        return result;
    }

    public void setResult(SearchResult result) {
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
        ShowSearchTaskResultResponse that = (ShowSearchTaskResultResponse) obj;
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
        sb.append("class ShowSearchTaskResultResponse {\n");
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
