package com.huaweicloud.sdk.vss.v3.model;

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
public class CreateTasksResponse extends SdkResponse {

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
            InfoCodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InfoCodeEnum(value);
            }
            return result;
        }

        public static InfoCodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            InfoCodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "info_code")

    private InfoCodeEnum infoCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info_description")

    @JacksonXmlProperty(localName = "info_description")

    private String infoDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private String taskId;

    /**
     * 任务状态:   * running - 正在运行   * success - 成功   * canceled - 已取消   * waiting - 正在等待   * failure - 失败 
     */
    public static final class TaskStatusEnum {

        /**
         * Enum RUNNING for value: "running"
         */
        public static final TaskStatusEnum RUNNING = new TaskStatusEnum("running");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final TaskStatusEnum SUCCESS = new TaskStatusEnum("success");

        /**
         * Enum CANCELED for value: "canceled"
         */
        public static final TaskStatusEnum CANCELED = new TaskStatusEnum("canceled");

        /**
         * Enum WAITING for value: "waiting"
         */
        public static final TaskStatusEnum WAITING = new TaskStatusEnum("waiting");

        /**
         * Enum FAILURE for value: "failure"
         */
        public static final TaskStatusEnum FAILURE = new TaskStatusEnum("failure");

        private static final Map<String, TaskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskStatusEnum> createStaticFields() {
            Map<String, TaskStatusEnum> map = new HashMap<>();
            map.put("running", RUNNING);
            map.put("success", SUCCESS);
            map.put("canceled", CANCELED);
            map.put("waiting", WAITING);
            map.put("failure", FAILURE);
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

    public CreateTasksResponse withInfoCode(InfoCodeEnum infoCode) {
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

    public CreateTasksResponse withInfoDescription(String infoDescription) {
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

    public CreateTasksResponse withTaskId(String taskId) {
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

    public CreateTasksResponse withTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态:   * running - 正在运行   * success - 成功   * canceled - 已取消   * waiting - 正在等待   * failure - 失败 
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
        CreateTasksResponse createTasksResponse = (CreateTasksResponse) o;
        return Objects.equals(this.infoCode, createTasksResponse.infoCode)
            && Objects.equals(this.infoDescription, createTasksResponse.infoDescription)
            && Objects.equals(this.taskId, createTasksResponse.taskId)
            && Objects.equals(this.taskStatus, createTasksResponse.taskStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoCode, infoDescription, taskId, taskStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTasksResponse {\n");
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
