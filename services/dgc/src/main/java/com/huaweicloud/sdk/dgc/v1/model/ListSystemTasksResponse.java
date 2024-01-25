package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSystemTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdate")

    private Long lastUpdate;

    /**
     * 作业运行状态 RUNNING：运行中 SUCCESSFUL：运行成功 FAILED：运行失败
     */
    public static final class StatusEnum {

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum SUCCESSFUL for value: "SUCCESSFUL"
         */
        public static final StatusEnum SUCCESSFUL = new StatusEnum("SUCCESSFUL");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("SUCCESSFUL", SUCCESSFUL);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtasks")

    private List<SubTaskStatus> subtasks = null;

    public ListSystemTasksResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 作业ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListSystemTasksResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListSystemTasksResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 作业开始日期 13位时间戳
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListSystemTasksResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 作业结束日期 13位时间戳
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListSystemTasksResponse withLastUpdate(Long lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    /**
     * 作业最后更新日期 13位时间戳
     * @return lastUpdate
     */
    public Long getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public ListSystemTasksResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 作业运行状态 RUNNING：运行中 SUCCESSFUL：运行成功 FAILED：运行失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListSystemTasksResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 作业消息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListSystemTasksResponse withSubtasks(List<SubTaskStatus> subtasks) {
        this.subtasks = subtasks;
        return this;
    }

    public ListSystemTasksResponse addSubtasksItem(SubTaskStatus subtasksItem) {
        if (this.subtasks == null) {
            this.subtasks = new ArrayList<>();
        }
        this.subtasks.add(subtasksItem);
        return this;
    }

    public ListSystemTasksResponse withSubtasks(Consumer<List<SubTaskStatus>> subtasksSetter) {
        if (this.subtasks == null) {
            this.subtasks = new ArrayList<>();
        }
        subtasksSetter.accept(this.subtasks);
        return this;
    }

    /**
     * 当前作业包含的子作业
     * @return subtasks
     */
    public List<SubTaskStatus> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(List<SubTaskStatus> subtasks) {
        this.subtasks = subtasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSystemTasksResponse that = (ListSystemTasksResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.lastUpdate, that.lastUpdate) && Objects.equals(this.status, that.status)
            && Objects.equals(this.message, that.message) && Objects.equals(this.subtasks, that.subtasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, startTime, endTime, lastUpdate, status, message, subtasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSystemTasksResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    subtasks: ").append(toIndentedString(subtasks)).append("\n");
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
