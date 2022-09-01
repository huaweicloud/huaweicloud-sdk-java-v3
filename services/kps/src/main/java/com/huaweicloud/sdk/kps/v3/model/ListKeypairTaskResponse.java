package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ListKeypairTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    @JacksonXmlProperty(localName = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private String taskId;

    /**
     * 密钥对正在处理的状态。 - READY_RESET 准备重置 - RUNNING_RESET 正在重置 - FAILED_RESET 重置失败 - SUCCESS_RESET 重置成功 - READY_REPLACE 准备替换 - RUNNING_REPLACE 正在替换 - FAILED_RESET 替换失败 - SUCCESS_RESET 替换成功 - READY_UNBIND 准备解绑 - RUNNING_UNBIND 正在解绑 - FAILED_UNBIND 解绑失败 - SUCCESS_UNBIND 解绑成功
     */
    public static final class TaskStatusEnum {

        /**
         * Enum READY_RESET for value: "READY_RESET"
         */
        public static final TaskStatusEnum READY_RESET = new TaskStatusEnum("READY_RESET");

        /**
         * Enum RUNNING_RESET for value: "RUNNING_RESET"
         */
        public static final TaskStatusEnum RUNNING_RESET = new TaskStatusEnum("RUNNING_RESET");

        /**
         * Enum FAILED_RESET for value: "FAILED_RESET"
         */
        public static final TaskStatusEnum FAILED_RESET = new TaskStatusEnum("FAILED_RESET");

        /**
         * Enum SUCCESS_RESET for value: "SUCCESS_RESET"
         */
        public static final TaskStatusEnum SUCCESS_RESET = new TaskStatusEnum("SUCCESS_RESET");

        /**
         * Enum READY_REPLACE for value: "READY_REPLACE"
         */
        public static final TaskStatusEnum READY_REPLACE = new TaskStatusEnum("READY_REPLACE");

        /**
         * Enum RUNNING_REPLACE for value: "RUNNING_REPLACE"
         */
        public static final TaskStatusEnum RUNNING_REPLACE = new TaskStatusEnum("RUNNING_REPLACE");

        /**
         * Enum READY_UNBIND for value: "READY_UNBIND"
         */
        public static final TaskStatusEnum READY_UNBIND = new TaskStatusEnum("READY_UNBIND");

        /**
         * Enum RUNNING_UNBIND for value: "RUNNING_UNBIND"
         */
        public static final TaskStatusEnum RUNNING_UNBIND = new TaskStatusEnum("RUNNING_UNBIND");

        /**
         * Enum FAILED_UNBIND for value: "FAILED_UNBIND"
         */
        public static final TaskStatusEnum FAILED_UNBIND = new TaskStatusEnum("FAILED_UNBIND");

        /**
         * Enum SUCCESS_UNBIND for value: "SUCCESS_UNBIND"
         */
        public static final TaskStatusEnum SUCCESS_UNBIND = new TaskStatusEnum("SUCCESS_UNBIND");

        private static final Map<String, TaskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskStatusEnum> createStaticFields() {
            Map<String, TaskStatusEnum> map = new HashMap<>();
            map.put("READY_RESET", READY_RESET);
            map.put("RUNNING_RESET", RUNNING_RESET);
            map.put("FAILED_RESET", FAILED_RESET);
            map.put("SUCCESS_RESET", SUCCESS_RESET);
            map.put("READY_REPLACE", READY_REPLACE);
            map.put("RUNNING_REPLACE", RUNNING_REPLACE);
            map.put("READY_UNBIND", READY_UNBIND);
            map.put("RUNNING_UNBIND", RUNNING_UNBIND);
            map.put("FAILED_UNBIND", FAILED_UNBIND);
            map.put("SUCCESS_UNBIND", SUCCESS_UNBIND);
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

    @JacksonXmlProperty(localName = "task_status")

    private TaskStatusEnum taskStatus;

    public ListKeypairTaskResponse withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 租户虚拟机ID
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ListKeypairTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务下发成功返回的ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListKeypairTaskResponse withTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 密钥对正在处理的状态。 - READY_RESET 准备重置 - RUNNING_RESET 正在重置 - FAILED_RESET 重置失败 - SUCCESS_RESET 重置成功 - READY_REPLACE 准备替换 - RUNNING_REPLACE 正在替换 - FAILED_RESET 替换失败 - SUCCESS_RESET 替换成功 - READY_UNBIND 准备解绑 - RUNNING_UNBIND 正在解绑 - FAILED_UNBIND 解绑失败 - SUCCESS_UNBIND 解绑成功
     * @return taskStatus
     */
    public TaskStatusEnum getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListKeypairTaskResponse listKeypairTaskResponse = (ListKeypairTaskResponse) o;
        return Objects.equals(this.serverId, listKeypairTaskResponse.serverId)
            && Objects.equals(this.taskId, listKeypairTaskResponse.taskId)
            && Objects.equals(this.taskStatus, listKeypairTaskResponse.taskStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, taskId, taskStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKeypairTaskResponse {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
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
