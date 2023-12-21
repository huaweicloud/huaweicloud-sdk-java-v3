package com.huaweicloud.sdk.vod.v1.model;

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
public class UpdateStorageModeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_result_array")

    private List<TaskResult> taskResultArray = null;

    public UpdateStorageModeResponse withTaskResultArray(List<TaskResult> taskResultArray) {
        this.taskResultArray = taskResultArray;
        return this;
    }

    public UpdateStorageModeResponse addTaskResultArrayItem(TaskResult taskResultArrayItem) {
        if (this.taskResultArray == null) {
            this.taskResultArray = new ArrayList<>();
        }
        this.taskResultArray.add(taskResultArrayItem);
        return this;
    }

    public UpdateStorageModeResponse withTaskResultArray(Consumer<List<TaskResult>> taskResultArraySetter) {
        if (this.taskResultArray == null) {
            this.taskResultArray = new ArrayList<>();
        }
        taskResultArraySetter.accept(this.taskResultArray);
        return this;
    }

    /**
     * Get taskResultArray
     * @return taskResultArray
     */
    public List<TaskResult> getTaskResultArray() {
        return taskResultArray;
    }

    public void setTaskResultArray(List<TaskResult> taskResultArray) {
        this.taskResultArray = taskResultArray;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateStorageModeResponse that = (UpdateStorageModeResponse) obj;
        return Objects.equals(this.taskResultArray, that.taskResultArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskResultArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStorageModeResponse {\n");
        sb.append("    taskResultArray: ").append(toIndentedString(taskResultArray)).append("\n");
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
