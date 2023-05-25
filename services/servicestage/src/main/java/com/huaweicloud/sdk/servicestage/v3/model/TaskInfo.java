package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TaskInfo
 */
public class TaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "messages")

    private String messages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    /**
     * Gets or Sets taskStatus
     */
    public static final class TaskStatusEnum {

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final TaskStatusEnum RUNNING = new TaskStatusEnum("RUNNING");

        /**
         * Enum SKIPPED for value: "SKIPPED"
         */
        public static final TaskStatusEnum SKIPPED = new TaskStatusEnum("SKIPPED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final TaskStatusEnum FAILED = new TaskStatusEnum("FAILED");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final TaskStatusEnum SUCCEEDED = new TaskStatusEnum("SUCCEEDED");

        private static final Map<String, TaskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskStatusEnum> createStaticFields() {
            Map<String, TaskStatusEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("SKIPPED", SKIPPED);
            map.put("FAILED", FAILED);
            map.put("SUCCEEDED", SUCCEEDED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TaskStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TaskStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TaskStatusEnum(value);
            }
            return result;
        }

        public static TaskStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TaskStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskStatusEnum) {
                return this.value.equals(((TaskStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private TaskStatusEnum taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    public TaskInfo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public TaskInfo withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * Get updateAt
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public TaskInfo withMessages(String messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Get messages
     * @return messages
     */
    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public TaskInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get taskId
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskInfo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * Get taskName
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskInfo withTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * Get taskStatus
     * @return taskStatus
     */
    public TaskStatusEnum getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
    }

    public TaskInfo withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * Get taskType
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskInfo taskInfo = (TaskInfo) o;
        return Objects.equals(this.createdAt, taskInfo.createdAt) && Objects.equals(this.updateAt, taskInfo.updateAt)
            && Objects.equals(this.messages, taskInfo.messages) && Objects.equals(this.taskId, taskInfo.taskId)
            && Objects.equals(this.taskName, taskInfo.taskName) && Objects.equals(this.taskStatus, taskInfo.taskStatus)
            && Objects.equals(this.taskType, taskInfo.taskType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, updateAt, messages, taskId, taskName, taskStatus, taskType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInfo {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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
