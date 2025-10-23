package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_basic_info")

    private TaskEntity taskBasicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_additional_info")

    private TaskAdditionalInfo taskAdditionalInfo;

    public ShowTaskResponse withTaskBasicInfo(TaskEntity taskBasicInfo) {
        this.taskBasicInfo = taskBasicInfo;
        return this;
    }

    public ShowTaskResponse withTaskBasicInfo(Consumer<TaskEntity> taskBasicInfoSetter) {
        if (this.taskBasicInfo == null) {
            this.taskBasicInfo = new TaskEntity();
            taskBasicInfoSetter.accept(this.taskBasicInfo);
        }

        return this;
    }

    /**
     * Get taskBasicInfo
     * @return taskBasicInfo
     */
    public TaskEntity getTaskBasicInfo() {
        return taskBasicInfo;
    }

    public void setTaskBasicInfo(TaskEntity taskBasicInfo) {
        this.taskBasicInfo = taskBasicInfo;
    }

    public ShowTaskResponse withTaskAdditionalInfo(TaskAdditionalInfo taskAdditionalInfo) {
        this.taskAdditionalInfo = taskAdditionalInfo;
        return this;
    }

    public ShowTaskResponse withTaskAdditionalInfo(Consumer<TaskAdditionalInfo> taskAdditionalInfoSetter) {
        if (this.taskAdditionalInfo == null) {
            this.taskAdditionalInfo = new TaskAdditionalInfo();
            taskAdditionalInfoSetter.accept(this.taskAdditionalInfo);
        }

        return this;
    }

    /**
     * Get taskAdditionalInfo
     * @return taskAdditionalInfo
     */
    public TaskAdditionalInfo getTaskAdditionalInfo() {
        return taskAdditionalInfo;
    }

    public void setTaskAdditionalInfo(TaskAdditionalInfo taskAdditionalInfo) {
        this.taskAdditionalInfo = taskAdditionalInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskResponse that = (ShowTaskResponse) obj;
        return Objects.equals(this.taskBasicInfo, that.taskBasicInfo)
            && Objects.equals(this.taskAdditionalInfo, that.taskAdditionalInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskBasicInfo, taskAdditionalInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskResponse {\n");
        sb.append("    taskBasicInfo: ").append(toIndentedString(taskBasicInfo)).append("\n");
        sb.append("    taskAdditionalInfo: ").append(toIndentedString(taskAdditionalInfo)).append("\n");
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
