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
 * 
 */
public class CompareTaskList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_task_id")

    private String compareTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_type")

    private String compareType;

    /** 对比任务的状态。 */
    public static final class CompareTaskStatusEnum {

        /** Enum RUNNING_ for value: "RUNNING-运行中" */
        public static final CompareTaskStatusEnum RUNNING_ = new CompareTaskStatusEnum("RUNNING-运行中");

        /** Enum WAITING_FOR_RUNNING_ for value: "WAITING_FOR_RUNNING-等待启动中" */
        public static final CompareTaskStatusEnum WAITING_FOR_RUNNING_ =
            new CompareTaskStatusEnum("WAITING_FOR_RUNNING-等待启动中");

        /** Enum SUCCESSFUL_ for value: "SUCCESSFUL-完成" */
        public static final CompareTaskStatusEnum SUCCESSFUL_ = new CompareTaskStatusEnum("SUCCESSFUL-完成");

        /** Enum FAILED_ for value: "FAILED-失败" */
        public static final CompareTaskStatusEnum FAILED_ = new CompareTaskStatusEnum("FAILED-失败");

        /** Enum CANCELLED_ for value: "CANCELLED-已取消" */
        public static final CompareTaskStatusEnum CANCELLED_ = new CompareTaskStatusEnum("CANCELLED-已取消");

        /** Enum TIMEOUT_INTERRUPT_ for value: "TIMEOUT_INTERRUPT-超时中断" */
        public static final CompareTaskStatusEnum TIMEOUT_INTERRUPT_ =
            new CompareTaskStatusEnum("TIMEOUT_INTERRUPT-超时中断");

        /** Enum FULL_DOING_ for value: "FULL_DOING-全量校验中" */
        public static final CompareTaskStatusEnum FULL_DOING_ = new CompareTaskStatusEnum("FULL_DOING-全量校验中");

        /** Enum INCRE_DOING_ for value: "INCRE_DOING-增量校验中" */
        public static final CompareTaskStatusEnum INCRE_DOING_ = new CompareTaskStatusEnum("INCRE_DOING-增量校验中");

        private static final Map<String, CompareTaskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CompareTaskStatusEnum> createStaticFields() {
            Map<String, CompareTaskStatusEnum> map = new HashMap<>();
            map.put("RUNNING-运行中", RUNNING_);
            map.put("WAITING_FOR_RUNNING-等待启动中", WAITING_FOR_RUNNING_);
            map.put("SUCCESSFUL-完成", SUCCESSFUL_);
            map.put("FAILED-失败", FAILED_);
            map.put("CANCELLED-已取消", CANCELLED_);
            map.put("TIMEOUT_INTERRUPT-超时中断", TIMEOUT_INTERRUPT_);
            map.put("FULL_DOING-全量校验中", FULL_DOING_);
            map.put("INCRE_DOING-增量校验中", INCRE_DOING_);
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
            CompareTaskStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CompareTaskStatusEnum(value);
            }
            return result;
        }

        public static CompareTaskStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CompareTaskStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /** 对比任务的id。
     * 
     * @return compareTaskId */
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

    /** 对比任务的类型。
     * 
     * @return compareType */
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

    /** 对比任务的状态。
     * 
     * @return compareTaskStatus */
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

    /** 对比开始时间。
     * 
     * @return createTime */
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

    /** 对比结束时间。
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompareTaskList compareTaskList = (CompareTaskList) o;
        return Objects.equals(this.compareTaskId, compareTaskList.compareTaskId)
            && Objects.equals(this.compareType, compareTaskList.compareType)
            && Objects.equals(this.compareTaskStatus, compareTaskList.compareTaskStatus)
            && Objects.equals(this.createTime, compareTaskList.createTime)
            && Objects.equals(this.endTime, compareTaskList.endTime);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
