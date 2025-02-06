package com.huaweicloud.sdk.optverse.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_json")

    private Object inputJson;

    /**
     * 状态
     */
    public static final class StatusEnum {

        /**
         * Enum RUNNING for value: "Running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("Running");

        /**
         * Enum PENDING for value: "Pending"
         */
        public static final StatusEnum PENDING = new StatusEnum("Pending");

        /**
         * Enum EXPIRED for value: "Expired"
         */
        public static final StatusEnum EXPIRED = new StatusEnum("Expired");

        /**
         * Enum UNKNOWN for value: "Unknown"
         */
        public static final StatusEnum UNKNOWN = new StatusEnum("Unknown");

        /**
         * Enum FAILED for value: "Failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("Failed");

        /**
         * Enum SUCCEEDED for value: "Succeeded"
         */
        public static final StatusEnum SUCCEEDED = new StatusEnum("Succeeded");

        /**
         * Enum STOPPED for value: "Stopped"
         */
        public static final StatusEnum STOPPED = new StatusEnum("Stopped");

        /**
         * Enum DELETED for value: "Deleted"
         */
        public static final StatusEnum DELETED = new StatusEnum("Deleted");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Running", RUNNING);
            map.put("Pending", PENDING);
            map.put("Expired", EXPIRED);
            map.put("Unknown", UNKNOWN);
            map.put("Failed", FAILED);
            map.put("Succeeded", SUCCEEDED);
            map.put("Stopped", STOPPED);
            map.put("Deleted", DELETED);
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
    @JsonProperty(value = "progress")

    private Object progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_json")

    private Object outputJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    public ShowTaskResponse withTaskId(String taskId) {
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

    public ShowTaskResponse withInputJson(Object inputJson) {
        this.inputJson = inputJson;
        return this;
    }

    /**
     * 用户输入
     * @return inputJson
     */
    public Object getInputJson() {
        return inputJson;
    }

    public void setInputJson(Object inputJson) {
        this.inputJson = inputJson;
    }

    public ShowTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowTaskResponse withProgress(Object progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 任务进度
     * @return progress
     */
    public Object getProgress() {
        return progress;
    }

    public void setProgress(Object progress) {
        this.progress = progress;
    }

    public ShowTaskResponse withOutputJson(Object outputJson) {
        this.outputJson = outputJson;
        return this;
    }

    /**
     * 输出
     * @return outputJson
     */
    public Object getOutputJson() {
        return outputJson;
    }

    public void setOutputJson(Object outputJson) {
        this.outputJson = outputJson;
    }

    public ShowTaskResponse withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public ShowTaskResponse withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public ShowTaskResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskResponse that = (ShowTaskResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.inputJson, that.inputJson)
            && Objects.equals(this.status, that.status) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.outputJson, that.outputJson) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, inputJson, status, progress, outputJson, startTime, endTime, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    inputJson: ").append(toIndentedString(inputJson)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    outputJson: ").append(toIndentedString(outputJson)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
