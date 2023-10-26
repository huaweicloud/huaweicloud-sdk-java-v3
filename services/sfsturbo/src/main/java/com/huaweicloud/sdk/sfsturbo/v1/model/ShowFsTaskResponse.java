package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFsTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    /**
     * 任务状态, SUCCESS表示成功，DOING表示正在执行，FAIL表示失败
     */
    public static final class StatusEnum {

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");

        /**
         * Enum DOING for value: "DOING"
         */
        public static final StatusEnum DOING = new StatusEnum("DOING");

        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final StatusEnum FAIL = new StatusEnum("FAIL");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("DOING", DOING);
            map.put("FAIL", FAIL);
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
    @JsonProperty(value = "dir_usage")

    private FsDuInfo dirUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ShowFsTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowFsTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态, SUCCESS表示成功，DOING表示正在执行，FAIL表示失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowFsTaskResponse withDirUsage(FsDuInfo dirUsage) {
        this.dirUsage = dirUsage;
        return this;
    }

    public ShowFsTaskResponse withDirUsage(Consumer<FsDuInfo> dirUsageSetter) {
        if (this.dirUsage == null) {
            this.dirUsage = new FsDuInfo();
            dirUsageSetter.accept(this.dirUsage);
        }

        return this;
    }

    /**
     * 目录资源使用情况(包含子目录)
     * @return dirUsage
     */
    public FsDuInfo getDirUsage() {
        return dirUsage;
    }

    public void setDirUsage(FsDuInfo dirUsage) {
        this.dirUsage = dirUsage;
    }

    public ShowFsTaskResponse withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 任务开始时间，UTC时间，例如：2006-01-02 15:04:05'
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ShowFsTaskResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间，UTC时间，例如：2006-01-02 15:04:06'
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFsTaskResponse that = (ShowFsTaskResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.dirUsage, that.dirUsage) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, status, dirUsage, beginTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFsTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dirUsage: ").append(toIndentedString(dirUsage)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
