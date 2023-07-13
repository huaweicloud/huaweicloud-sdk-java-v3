package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 。
 */
public class TaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CREATED_AT")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "LAST_HEALTH_CHECK")

    private String lastHealthCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "MESSAGES")

    private String messages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OWNER_ID")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TASK_ID")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TASK_INDEX")

    private Integer taskIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TASK_NAME")

    private String taskName;

    /**
     * 任务状态。
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskStatusEnum(value));
        }

        public static TaskStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "TASK_STATUS")

    private TaskStatusEnum taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TASK_TYPE")

    private String taskType;

    public TaskInfo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public TaskInfo withLastHealthCheck(String lastHealthCheck) {
        this.lastHealthCheck = lastHealthCheck;
        return this;
    }

    /**
     * 健康检查时间。
     * @return lastHealthCheck
     */
    public String getLastHealthCheck() {
        return lastHealthCheck;
    }

    public void setLastHealthCheck(String lastHealthCheck) {
        this.lastHealthCheck = lastHealthCheck;
    }

    public TaskInfo withMessages(String messages) {
        this.messages = messages;
        return this;
    }

    /**
     * 消息。
     * @return messages
     */
    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public TaskInfo withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * 创建用户ID。
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public TaskInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskInfo withTaskIndex(Integer taskIndex) {
        this.taskIndex = taskIndex;
        return this;
    }

    /**
     * 任务序号。
     * @return taskIndex
     */
    public Integer getTaskIndex() {
        return taskIndex;
    }

    public void setTaskIndex(Integer taskIndex) {
        this.taskIndex = taskIndex;
    }

    public TaskInfo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称。
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
     * 任务状态。
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
     * 任务类型。
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskInfo that = (TaskInfo) obj;
        return Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.lastHealthCheck, that.lastHealthCheck)
            && Objects.equals(this.messages, that.messages) && Objects.equals(this.ownerId, that.ownerId)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskIndex, that.taskIndex)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.taskStatus, that.taskStatus)
            && Objects.equals(this.taskType, that.taskType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(createdAt, lastHealthCheck, messages, ownerId, taskId, taskIndex, taskName, taskStatus, taskType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInfo {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    lastHealthCheck: ").append(toIndentedString(lastHealthCheck)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskIndex: ").append(toIndentedString(taskIndex)).append("\n");
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
