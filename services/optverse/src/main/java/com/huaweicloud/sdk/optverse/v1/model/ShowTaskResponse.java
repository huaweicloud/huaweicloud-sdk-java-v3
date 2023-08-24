package com.huaweicloud.sdk.optverse.v1.model;

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

    /**
     * 任务运行状态，暂考虑取值仅为 Running/Failed/Successed
     */
    public static final class StatusEnum {

        /**
         * Enum RUNNING for value: "Running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("Running");

        /**
         * Enum FAILED for value: "Failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("Failed");

        /**
         * Enum SUCCESSED for value: "Successed"
         */
        public static final StatusEnum SUCCESSED = new StatusEnum("Successed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Running", RUNNING);
            map.put("Failed", FAILED);
            map.put("Successed", SUCCESSED);
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
    @JsonProperty(value = "input_json")

    private Object inputJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_url")

    private String inputUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_json")

    private Object outputJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_url")

    private String outputUrl;

    public ShowTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务编号
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务运行状态，暂考虑取值仅为 Running/Failed/Successed
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowTaskResponse withInputJson(Object inputJson) {
        this.inputJson = inputJson;
        return this;
    }

    /**
     * 如果提交任务使用了input_enable参数，并且创建任务使用的是json格式非文件方式，该值为输入的字符串; 对应数据结构参见创建任务时的结构体
     * @return inputJson
     */
    public Object getInputJson() {
        return inputJson;
    }

    public void setInputJson(Object inputJson) {
        this.inputJson = inputJson;
    }

    public ShowTaskResponse withInputUrl(String inputUrl) {
        this.inputUrl = inputUrl;
        return this;
    }

    /**
     * 如果提交任务使用了input_enable参数，并且创建任务使用的是文件方式，该值为OBS对应的文件绝对路径
     * @return inputUrl
     */
    public String getInputUrl() {
        return inputUrl;
    }

    public void setInputUrl(String inputUrl) {
        this.inputUrl = inputUrl;
    }

    public ShowTaskResponse withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间（UTC）
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
     * 结束时间（UTC）
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
     * 创建时间（UTC）
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ShowTaskResponse withOutputJson(Object outputJson) {
        this.outputJson = outputJson;
        return this;
    }

    /**
     * 任务处理结果，json格式；每个子服务该对象结构不同，框架层不解析具体key，运行态直接拷贝算法服务返回信息、
     * @return outputJson
     */
    public Object getOutputJson() {
        return outputJson;
    }

    public void setOutputJson(Object outputJson) {
        this.outputJson = outputJson;
    }

    public ShowTaskResponse withOutputUrl(String outputUrl) {
        this.outputUrl = outputUrl;
        return this;
    }

    /**
     * 任务结果文件对应的绝对地址，具体值由租户OBS对应的待存储路径前缀和文件名组成，文件名服务端固定用task_id命名
     * @return outputUrl
     */
    public String getOutputUrl() {
        return outputUrl;
    }

    public void setOutputUrl(String outputUrl) {
        this.outputUrl = outputUrl;
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
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.inputJson, that.inputJson) && Objects.equals(this.inputUrl, that.inputUrl)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.outputJson, that.outputJson)
            && Objects.equals(this.outputUrl, that.outputUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, status, inputJson, inputUrl, startTime, endTime, createTime, outputJson, outputUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    inputJson: ").append(toIndentedString(inputJson)).append("\n");
        sb.append("    inputUrl: ").append(toIndentedString(inputUrl)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    outputJson: ").append(toIndentedString(outputJson)).append("\n");
        sb.append("    outputUrl: ").append(toIndentedString(outputUrl)).append("\n");
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
