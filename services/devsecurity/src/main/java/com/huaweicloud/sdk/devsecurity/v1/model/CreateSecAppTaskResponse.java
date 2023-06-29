package com.huaweicloud.sdk.devsecurity.v1.model;

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
public class CreateSecAppTaskResponse extends SdkResponse {

    /**
     * 状态码:   * success - 成功   * failure - 失败 
     */
    public static final class InfoCodeEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final InfoCodeEnum SUCCESS = new InfoCodeEnum("success");

        /**
         * Enum FAILURE for value: "failure"
         */
        public static final InfoCodeEnum FAILURE = new InfoCodeEnum("failure");

        private static final Map<String, InfoCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InfoCodeEnum> createStaticFields() {
            Map<String, InfoCodeEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("failure", FAILURE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InfoCodeEnum(String value) {
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
        public static InfoCodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InfoCodeEnum(value));
        }

        public static InfoCodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InfoCodeEnum) {
                return this.value.equals(((InfoCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info_code")

    private InfoCodeEnum infoCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info_description")

    private String infoDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    /**
     * 任务状态:   * WAITING - 等待   * RUNNING - 进行   * SUCCESS - 完成   * FAILURE - 失败   * STOP - 停止   * DELETED - 删除 
     */
    public static final class TaskStatusEnum {

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final TaskStatusEnum WAITING = new TaskStatusEnum("WAITING");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final TaskStatusEnum RUNNING = new TaskStatusEnum("RUNNING");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final TaskStatusEnum SUCCESS = new TaskStatusEnum("SUCCESS");

        /**
         * Enum FAILURE for value: "FAILURE"
         */
        public static final TaskStatusEnum FAILURE = new TaskStatusEnum("FAILURE");

        /**
         * Enum STOP for value: "STOP"
         */
        public static final TaskStatusEnum STOP = new TaskStatusEnum("STOP");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final TaskStatusEnum DELETED = new TaskStatusEnum("DELETED");

        private static final Map<String, TaskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskStatusEnum> createStaticFields() {
            Map<String, TaskStatusEnum> map = new HashMap<>();
            map.put("WAITING", WAITING);
            map.put("RUNNING", RUNNING);
            map.put("SUCCESS", SUCCESS);
            map.put("FAILURE", FAILURE);
            map.put("STOP", STOP);
            map.put("DELETED", DELETED);
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

    public CreateSecAppTaskResponse withInfoCode(InfoCodeEnum infoCode) {
        this.infoCode = infoCode;
        return this;
    }

    /**
     * 状态码:   * success - 成功   * failure - 失败 
     * @return infoCode
     */
    public InfoCodeEnum getInfoCode() {
        return infoCode;
    }

    public void setInfoCode(InfoCodeEnum infoCode) {
        this.infoCode = infoCode;
    }

    public CreateSecAppTaskResponse withInfoDescription(String infoDescription) {
        this.infoDescription = infoDescription;
        return this;
    }

    /**
     * 返回的提示信息
     * @return infoDescription
     */
    public String getInfoDescription() {
        return infoDescription;
    }

    public void setInfoDescription(String infoDescription) {
        this.infoDescription = infoDescription;
    }

    public CreateSecAppTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public CreateSecAppTaskResponse withTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态:   * WAITING - 等待   * RUNNING - 进行   * SUCCESS - 完成   * FAILURE - 失败   * STOP - 停止   * DELETED - 删除 
     * @return taskStatus
     */
    public TaskStatusEnum getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSecAppTaskResponse that = (CreateSecAppTaskResponse) obj;
        return Objects.equals(this.infoCode, that.infoCode)
            && Objects.equals(this.infoDescription, that.infoDescription) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.taskStatus, that.taskStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoCode, infoDescription, taskId, taskStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecAppTaskResponse {\n");
        sb.append("    infoCode: ").append(toIndentedString(infoCode)).append("\n");
        sb.append("    infoDescription: ").append(toIndentedString(infoDescription)).append("\n");
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
