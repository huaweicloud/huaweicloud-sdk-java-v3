package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * TaskLogsVO
 */
public class TaskLogsVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddm_instance_id")

    private String ddmInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private BigDecimal createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public TaskLogsVO withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**：  分片变更任务ID。  **参数范围**：  不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskLogsVO withDdmInstanceId(String ddmInstanceId) {
        this.ddmInstanceId = ddmInstanceId;
        return this;
    }

    /**
     * **参数解释**：  DDM实例ID。  **参数范围**：  不涉及。
     * @return ddmInstanceId
     */
    public String getDdmInstanceId() {
        return ddmInstanceId;
    }

    public void setDdmInstanceId(String ddmInstanceId) {
        this.ddmInstanceId = ddmInstanceId;
    }

    public TaskLogsVO withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释**：  等级。  **参数范围**：  不涉及。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public TaskLogsVO withCreatedTime(BigDecimal createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数解释**：  创建时间。  **参数范围**：  不涉及。
     * minimum: 0
     * maximum: 9.223372036854775E+18
     * @return createdTime
     */
    public BigDecimal getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(BigDecimal createdTime) {
        this.createdTime = createdTime;
    }

    public TaskLogsVO withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**：  消息。  **参数范围**：  不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskLogsVO that = (TaskLogsVO) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.ddmInstanceId, that.ddmInstanceId)
            && Objects.equals(this.level, that.level) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, ddmInstanceId, level, createdTime, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskLogsVO {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    ddmInstanceId: ").append(toIndentedString(ddmInstanceId)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
