package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 任务实例类型 QUALITY_TASK:质量作业 CONSISTENCY_TASK:对账作业
     */
    public static final class TaskTypeEnum {

        /**
         * Enum QUALITY_TASK for value: "QUALITY_TASK"
         */
        public static final TaskTypeEnum QUALITY_TASK = new TaskTypeEnum("QUALITY_TASK");

        /**
         * Enum CONSISTENCY_TASK for value: "CONSISTENCY_TASK"
         */
        public static final TaskTypeEnum CONSISTENCY_TASK = new TaskTypeEnum("CONSISTENCY_TASK");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("QUALITY_TASK", QUALITY_TASK);
            map.put("CONSISTENCY_TASK", CONSISTENCY_TASK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskTypeEnum(String value) {
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
        public static TaskTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskTypeEnum(value));
        }

        public static TaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskTypeEnum) {
                return this.value.equals(((TaskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private TaskTypeEnum taskType;

    /**
     * 状态, RUNNING:运行中,FAILED:失败,ALARMING:报警,SUCCESS:正常,SUSPENDING:暂停中,UNKNOWN:未定义
     */
    public static final class RunStatusEnum {

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final RunStatusEnum SUCCESS = new RunStatusEnum("SUCCESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final RunStatusEnum FAILED = new RunStatusEnum("FAILED");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final RunStatusEnum RUNNING = new RunStatusEnum("RUNNING");

        /**
         * Enum ALARMING for value: "ALARMING"
         */
        public static final RunStatusEnum ALARMING = new RunStatusEnum("ALARMING");

        private static final Map<String, RunStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RunStatusEnum> createStaticFields() {
            Map<String, RunStatusEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("FAILED", FAILED);
            map.put("RUNNING", RUNNING);
            map.put("ALARMING", ALARMING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RunStatusEnum(String value) {
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
        public static RunStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RunStatusEnum(value));
        }

        public static RunStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RunStatusEnum) {
                return this.value.equals(((RunStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_status")

    private RunStatusEnum runStatus;

    /**
     * 通知状态 NOT_TRIGGERED:未触发,SUCCESS:成功,FAILED:失败
     */
    public static final class NotifyStatusEnum {

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final NotifyStatusEnum SUCCESS = new NotifyStatusEnum("SUCCESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final NotifyStatusEnum FAILED = new NotifyStatusEnum("FAILED");

        /**
         * Enum NOT_TRIGGERED for value: "NOT_TRIGGERED"
         */
        public static final NotifyStatusEnum NOT_TRIGGERED = new NotifyStatusEnum("NOT_TRIGGERED");

        private static final Map<String, NotifyStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotifyStatusEnum> createStaticFields() {
            Map<String, NotifyStatusEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("FAILED", FAILED);
            map.put("NOT_TRIGGERED", NOT_TRIGGERED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotifyStatusEnum(String value) {
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
        public static NotifyStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NotifyStatusEnum(value));
        }

        public static NotifyStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotifyStatusEnum) {
                return this.value.equals(((NotifyStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_status")

    private NotifyStatusEnum notifyStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListInstancesRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * workspace 信息
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListInstancesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInstancesRequest withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务实例类型 QUALITY_TASK:质量作业 CONSISTENCY_TASK:对账作业
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public ListInstancesRequest withRunStatus(RunStatusEnum runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    /**
     * 状态, RUNNING:运行中,FAILED:失败,ALARMING:报警,SUCCESS:正常,SUSPENDING:暂停中,UNKNOWN:未定义
     * @return runStatus
     */
    public RunStatusEnum getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(RunStatusEnum runStatus) {
        this.runStatus = runStatus;
    }

    public ListInstancesRequest withNotifyStatus(NotifyStatusEnum notifyStatus) {
        this.notifyStatus = notifyStatus;
        return this;
    }

    /**
     * 通知状态 NOT_TRIGGERED:未触发,SUCCESS:成功,FAILED:失败
     * @return notifyStatus
     */
    public NotifyStatusEnum getNotifyStatus() {
        return notifyStatus;
    }

    public void setNotifyStatus(NotifyStatusEnum notifyStatus) {
        this.notifyStatus = notifyStatus;
    }

    public ListInstancesRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 最近运行时间查询区间的开始时间,13位时间戳(精确到毫秒)
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListInstancesRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 最近运行时间查询区间的结束时间,13位时间戳(精确到毫秒)
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListInstancesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量,最大值为100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListInstancesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesRequest that = (ListInstancesRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.name, that.name)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.runStatus, that.runStatus)
            && Objects.equals(this.notifyStatus, that.notifyStatus) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, name, taskType, runStatus, notifyStatus, startTime, endTime, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
        sb.append("    notifyStatus: ").append(toIndentedString(notifyStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
