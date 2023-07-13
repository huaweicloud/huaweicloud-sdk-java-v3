package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CompareTaskList
 */
public class CompareTaskList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_task_id")

    private String compareTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_type")

    private String compareType;

    /**
     * 对比任务的状态。 - RUNNING-运行中 - WAITING_FOR_RUNNING-等待启动中 - SUCCESSFUL-完成 - FAILED-失败 - CANCELLED-已取消 - TIMEOUT_INTERRUPT-超时中断 - FULL_DOING-全量校验中 - INCRE_DOING-增量校验中
     */
    public static final class CompareTaskStatusEnum {

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final CompareTaskStatusEnum RUNNING = new CompareTaskStatusEnum("RUNNING");

        /**
         * Enum WAITING_FOR_RUNNING for value: "WAITING_FOR_RUNNING"
         */
        public static final CompareTaskStatusEnum WAITING_FOR_RUNNING =
            new CompareTaskStatusEnum("WAITING_FOR_RUNNING");

        /**
         * Enum SUCCESSFUL for value: "SUCCESSFUL"
         */
        public static final CompareTaskStatusEnum SUCCESSFUL = new CompareTaskStatusEnum("SUCCESSFUL");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final CompareTaskStatusEnum FAILED = new CompareTaskStatusEnum("FAILED");

        /**
         * Enum CANCELLED for value: "CANCELLED"
         */
        public static final CompareTaskStatusEnum CANCELLED = new CompareTaskStatusEnum("CANCELLED");

        /**
         * Enum TIMEOUT_INTERRUPT for value: "TIMEOUT_INTERRUPT"
         */
        public static final CompareTaskStatusEnum TIMEOUT_INTERRUPT = new CompareTaskStatusEnum("TIMEOUT_INTERRUPT");

        /**
         * Enum FULL_DOING for value: "FULL_DOING"
         */
        public static final CompareTaskStatusEnum FULL_DOING = new CompareTaskStatusEnum("FULL_DOING");

        /**
         * Enum INCRE_DOING for value: "INCRE_DOING"
         */
        public static final CompareTaskStatusEnum INCRE_DOING = new CompareTaskStatusEnum("INCRE_DOING");

        private static final Map<String, CompareTaskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CompareTaskStatusEnum> createStaticFields() {
            Map<String, CompareTaskStatusEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("WAITING_FOR_RUNNING", WAITING_FOR_RUNNING);
            map.put("SUCCESSFUL", SUCCESSFUL);
            map.put("FAILED", FAILED);
            map.put("CANCELLED", CANCELLED);
            map.put("TIMEOUT_INTERRUPT", TIMEOUT_INTERRUPT);
            map.put("FULL_DOING", FULL_DOING);
            map.put("INCRE_DOING", INCRE_DOING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CompareTaskStatusEnum(String value) {
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
        public static CompareTaskStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CompareTaskStatusEnum(value));
        }

        public static CompareTaskStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CompareTaskStatusEnum) {
                return this.value.equals(((CompareTaskStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_task_status")

    private CompareTaskStatusEnum compareTaskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public CompareTaskList withCompareTaskId(String compareTaskId) {
        this.compareTaskId = compareTaskId;
        return this;
    }

    /**
     * 对比任务的id。
     * @return compareTaskId
     */
    public String getCompareTaskId() {
        return compareTaskId;
    }

    public void setCompareTaskId(String compareTaskId) {
        this.compareTaskId = compareTaskId;
    }

    public CompareTaskList withCompareType(String compareType) {
        this.compareType = compareType;
        return this;
    }

    /**
     * 对比任务的类型。
     * @return compareType
     */
    public String getCompareType() {
        return compareType;
    }

    public void setCompareType(String compareType) {
        this.compareType = compareType;
    }

    public CompareTaskList withCompareTaskStatus(CompareTaskStatusEnum compareTaskStatus) {
        this.compareTaskStatus = compareTaskStatus;
        return this;
    }

    /**
     * 对比任务的状态。 - RUNNING-运行中 - WAITING_FOR_RUNNING-等待启动中 - SUCCESSFUL-完成 - FAILED-失败 - CANCELLED-已取消 - TIMEOUT_INTERRUPT-超时中断 - FULL_DOING-全量校验中 - INCRE_DOING-增量校验中
     * @return compareTaskStatus
     */
    public CompareTaskStatusEnum getCompareTaskStatus() {
        return compareTaskStatus;
    }

    public void setCompareTaskStatus(CompareTaskStatusEnum compareTaskStatus) {
        this.compareTaskStatus = compareTaskStatus;
    }

    public CompareTaskList withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 对比开始时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CompareTaskList withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 对比结束时间。
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
        CompareTaskList that = (CompareTaskList) obj;
        return Objects.equals(this.compareTaskId, that.compareTaskId)
            && Objects.equals(this.compareType, that.compareType)
            && Objects.equals(this.compareTaskStatus, that.compareTaskStatus)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compareTaskId, compareType, compareTaskStatus, createTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareTaskList {\n");
        sb.append("    compareTaskId: ").append(toIndentedString(compareTaskId)).append("\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    compareTaskStatus: ").append(toIndentedString(compareTaskStatus)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
