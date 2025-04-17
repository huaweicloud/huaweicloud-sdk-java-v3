package com.huaweicloud.sdk.antiddos.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowNewTaskStatusResponse extends SdkResponse {

    /**
     * 任务状态，可选范围： - success: 表示成功 - failed: 表示失败 - waiting: 表示等待 - running: 表示运行中 - preprocess: 表示预处理 - ready: 表示准备
     */
    public static final class TaskStatusEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final TaskStatusEnum SUCCESS = new TaskStatusEnum("success");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final TaskStatusEnum FAILED = new TaskStatusEnum("failed");

        /**
         * Enum WAITING for value: "waiting"
         */
        public static final TaskStatusEnum WAITING = new TaskStatusEnum("waiting");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final TaskStatusEnum RUNNING = new TaskStatusEnum("running");

        /**
         * Enum PREPROCESS for value: "preprocess"
         */
        public static final TaskStatusEnum PREPROCESS = new TaskStatusEnum("preprocess");

        /**
         * Enum READY for value: "ready"
         */
        public static final TaskStatusEnum READY = new TaskStatusEnum("ready");

        private static final Map<String, TaskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskStatusEnum> createStaticFields() {
            Map<String, TaskStatusEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
            map.put("waiting", WAITING);
            map.put("running", RUNNING);
            map.put("preprocess", PREPROCESS);
            map.put("ready", READY);
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
    @JsonProperty(value = "task_status")

    private TaskStatusEnum taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_msg")

    private String taskMsg;

    public ShowNewTaskStatusResponse withTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态，可选范围： - success: 表示成功 - failed: 表示失败 - waiting: 表示等待 - running: 表示运行中 - preprocess: 表示预处理 - ready: 表示准备
     * @return taskStatus
     */
    public TaskStatusEnum getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ShowNewTaskStatusResponse withTaskMsg(String taskMsg) {
        this.taskMsg = taskMsg;
        return this;
    }

    /**
     * 任务的附加信息
     * @return taskMsg
     */
    public String getTaskMsg() {
        return taskMsg;
    }

    public void setTaskMsg(String taskMsg) {
        this.taskMsg = taskMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNewTaskStatusResponse that = (ShowNewTaskStatusResponse) obj;
        return Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.taskMsg, that.taskMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskStatus, taskMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNewTaskStatusResponse {\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    taskMsg: ").append(toIndentedString(taskMsg)).append("\n");
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
