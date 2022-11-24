package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 单个任务的执行成功率
 */
public class TaskSuccessRate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_rate")

    private String successRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_count")

    private Integer recordCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_record_count")

    private Integer successRecordCount;

    public TaskSuccessRate withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskSuccessRate withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskSuccessRate withSuccessRate(String successRate) {
        this.successRate = successRate;
        return this;
    }

    /**
     * 成功率
     * @return successRate
     */
    public String getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(String successRate) {
        this.successRate = successRate;
    }

    public TaskSuccessRate withRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    /**
     * 执行记录数
     * @return recordCount
     */
    public Integer getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    public TaskSuccessRate withSuccessRecordCount(Integer successRecordCount) {
        this.successRecordCount = successRecordCount;
        return this;
    }

    /**
     * 成功的执行记录数
     * @return successRecordCount
     */
    public Integer getSuccessRecordCount() {
        return successRecordCount;
    }

    public void setSuccessRecordCount(Integer successRecordCount) {
        this.successRecordCount = successRecordCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskSuccessRate taskSuccessRate = (TaskSuccessRate) o;
        return Objects.equals(this.taskId, taskSuccessRate.taskId)
            && Objects.equals(this.taskName, taskSuccessRate.taskName)
            && Objects.equals(this.successRate, taskSuccessRate.successRate)
            && Objects.equals(this.recordCount, taskSuccessRate.recordCount)
            && Objects.equals(this.successRecordCount, taskSuccessRate.successRecordCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskName, successRate, recordCount, successRecordCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskSuccessRate {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
        sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
        sb.append("    successRecordCount: ").append(toIndentedString(successRecordCount)).append("\n");
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
