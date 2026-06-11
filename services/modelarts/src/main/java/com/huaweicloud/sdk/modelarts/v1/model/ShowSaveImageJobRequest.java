package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowSaveImageJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "training_job_id")

    private String trainingJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public ShowSaveImageJobRequest withTrainingJobId(String trainingJobId) {
        this.trainingJobId = trainingJobId;
        return this;
    }

    /**
     * 训练作业ID。获取方法请参见[查询训练作业列表](ListTrainingJobs.xml)。
     * @return trainingJobId
     */
    public String getTrainingJobId() {
        return trainingJobId;
    }

    public void setTrainingJobId(String trainingJobId) {
        this.trainingJobId = trainingJobId;
    }

    public ShowSaveImageJobRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 训练作业的任务名称。可从训练作业详情中的status.tasks字段中获取。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSaveImageJobRequest that = (ShowSaveImageJobRequest) obj;
        return Objects.equals(this.trainingJobId, that.trainingJobId) && Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainingJobId, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSaveImageJobRequest {\n");
        sb.append("    trainingJobId: ").append(toIndentedString(trainingJobId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
