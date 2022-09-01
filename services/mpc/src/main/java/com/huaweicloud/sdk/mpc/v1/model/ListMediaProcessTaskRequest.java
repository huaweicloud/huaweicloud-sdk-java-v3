package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListMediaProcessTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private List<String> taskId = null;

    /**
    * 任务状态。  取值如下： - WAITING：等待启动 - PROCESSING：处理中 - SUCCEEDED：处理成功 - FAILED：处理失败 - CANCELED：已取消 
    */
    public static final class StatusEnum {

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final StatusEnum WAITING = new StatusEnum("WAITING");

        /**
         * Enum PROCESSING for value: "PROCESSING"
         */
        public static final StatusEnum PROCESSING = new StatusEnum("PROCESSING");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final StatusEnum SUCCEEDED = new StatusEnum("SUCCEEDED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final StatusEnum CANCELED = new StatusEnum("CANCELED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("WAITING", WAITING);
            map.put("PROCESSING", PROCESSING);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("FAILED", FAILED);
            map.put("CANCELED", CANCELED);
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    @JacksonXmlProperty(localName = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    public ListMediaProcessTaskRequest withTaskId(List<String> taskId) {
        this.taskId = taskId;
        return this;
    }

    public ListMediaProcessTaskRequest addTaskIdItem(String taskIdItem) {
        if (this.taskId == null) {
            this.taskId = new ArrayList<>();
        }
        this.taskId.add(taskIdItem);
        return this;
    }

    public ListMediaProcessTaskRequest withTaskId(Consumer<List<String>> taskIdSetter) {
        if (this.taskId == null) {
            this.taskId = new ArrayList<>();
        }
        taskIdSetter.accept(this.taskId);
        return this;
    }

    /**
     * 独立加密任务ID。一次最多10个 
     * @return taskId
     */
    public List<String> getTaskId() {
        return taskId;
    }

    public void setTaskId(List<String> taskId) {
        this.taskId = taskId;
    }

    public ListMediaProcessTaskRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。  取值如下： - WAITING：等待启动 - PROCESSING：处理中 - SUCCEEDED：处理成功 - FAILED：处理失败 - CANCELED：已取消 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListMediaProcessTaskRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间。格式为yyyymmddhhmmss。必须是与时区无关的UTC时间，指定task_id时该参数无效 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListMediaProcessTaskRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。格式为yyyymmddhhmmss。必须是与时区无关的UTC时间，指定task_id时该参数无效 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListMediaProcessTaskRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 分页编号。查询指定“task_id”时，该参数无效。  默认值：0。 
     * minimum: 0
     * maximum: 50000
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListMediaProcessTaskRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 每页记录数。查询指定“task_id”时，该参数无效。  取值范围：[1,100]。  默认值：10。 
     * minimum: 1
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMediaProcessTaskRequest listMediaProcessTaskRequest = (ListMediaProcessTaskRequest) o;
        return Objects.equals(this.taskId, listMediaProcessTaskRequest.taskId)
            && Objects.equals(this.status, listMediaProcessTaskRequest.status)
            && Objects.equals(this.startTime, listMediaProcessTaskRequest.startTime)
            && Objects.equals(this.endTime, listMediaProcessTaskRequest.endTime)
            && Objects.equals(this.page, listMediaProcessTaskRequest.page)
            && Objects.equals(this.size, listMediaProcessTaskRequest.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, status, startTime, endTime, page, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMediaProcessTaskRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
