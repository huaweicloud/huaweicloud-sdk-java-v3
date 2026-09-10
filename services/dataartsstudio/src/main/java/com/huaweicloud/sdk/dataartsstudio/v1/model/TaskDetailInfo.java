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
 * 任务详细信息。
 */
public class TaskDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_report_id")

    private String monitorReportId;

    /**
     * 任务类型。 - FLINK：Flink类型 - SPARK：Spark类型 - DRS：DRS类型
     */
    public static final class TaskTypeEnum {

        /**
         * Enum FLINK for value: "FLINK"
         */
        public static final TaskTypeEnum FLINK = new TaskTypeEnum("FLINK");

        /**
         * Enum SPARK for value: "SPARK"
         */
        public static final TaskTypeEnum SPARK = new TaskTypeEnum("SPARK");

        /**
         * Enum DRS for value: "DRS"
         */
        public static final TaskTypeEnum DRS = new TaskTypeEnum("DRS");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("FLINK", FLINK);
            map.put("SPARK", SPARK);
            map.put("DRS", DRS);
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
     * 作业运行状态。 - INITIALIZING：初始化中 - SNAPSHOT：全量阶段 - BINLOG：增量阶段
     */
    public static final class RunningStatusEnum {

        /**
         * Enum INITIALIZING for value: "INITIALIZING"
         */
        public static final RunningStatusEnum INITIALIZING = new RunningStatusEnum("INITIALIZING");

        /**
         * Enum SNAPSHOT for value: "SNAPSHOT"
         */
        public static final RunningStatusEnum SNAPSHOT = new RunningStatusEnum("SNAPSHOT");

        /**
         * Enum BINLOG for value: "BINLOG"
         */
        public static final RunningStatusEnum BINLOG = new RunningStatusEnum("BINLOG");

        private static final Map<String, RunningStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RunningStatusEnum> createStaticFields() {
            Map<String, RunningStatusEnum> map = new HashMap<>();
            map.put("INITIALIZING", INITIALIZING);
            map.put("SNAPSHOT", SNAPSHOT);
            map.put("BINLOG", BINLOG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RunningStatusEnum(String value) {
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
        public static RunningStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RunningStatusEnum(value));
        }

        public static RunningStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RunningStatusEnum) {
                return this.value.equals(((RunningStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_status")

    private RunningStatusEnum runningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_job_id")

    private String externalJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracking_url")

    private String trackingUrl;

    /**
     * 任务状态。 - EXCEPTION：异常 - STOPPING：停止中 - SUBMITTING：提交中 - RUNNING：运行中 - STOPPED：已停止 - SUCCESS：成功
     */
    public static final class StateEnum {

        /**
         * Enum EXCEPTION for value: "EXCEPTION"
         */
        public static final StateEnum EXCEPTION = new StateEnum("EXCEPTION");

        /**
         * Enum STOPPING for value: "STOPPING"
         */
        public static final StateEnum STOPPING = new StateEnum("STOPPING");

        /**
         * Enum SUBMITTING for value: "SUBMITTING"
         */
        public static final StateEnum SUBMITTING = new StateEnum("SUBMITTING");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StateEnum RUNNING = new StateEnum("RUNNING");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final StateEnum STOPPED = new StateEnum("STOPPED");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StateEnum SUCCESS = new StateEnum("SUCCESS");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("EXCEPTION", EXCEPTION);
            map.put("STOPPING", STOPPING);
            map.put("SUBMITTING", SUBMITTING);
            map.put("RUNNING", RUNNING);
            map.put("STOPPED", STOPPED);
            map.put("SUCCESS", SUCCESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public TaskDetailInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 集成任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskDetailInfo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称，长度限制0-57个字符。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskDetailInfo withMonitorReportId(String monitorReportId) {
        this.monitorReportId = monitorReportId;
        return this;
    }

    /**
     * DLF作业ID。
     * @return monitorReportId
     */
    public String getMonitorReportId() {
        return monitorReportId;
    }

    public void setMonitorReportId(String monitorReportId) {
        this.monitorReportId = monitorReportId;
    }

    public TaskDetailInfo withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型。 - FLINK：Flink类型 - SPARK：Spark类型 - DRS：DRS类型
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public TaskDetailInfo withRunningStatus(RunningStatusEnum runningStatus) {
        this.runningStatus = runningStatus;
        return this;
    }

    /**
     * 作业运行状态。 - INITIALIZING：初始化中 - SNAPSHOT：全量阶段 - BINLOG：增量阶段
     * @return runningStatus
     */
    public RunningStatusEnum getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(RunningStatusEnum runningStatus) {
        this.runningStatus = runningStatus;
    }

    public TaskDetailInfo withExternalJobId(String externalJobId) {
        this.externalJobId = externalJobId;
        return this;
    }

    /**
     * 计算作业ID，DLI/CCE/DRS执行的作业ID。
     * @return externalJobId
     */
    public String getExternalJobId() {
        return externalJobId;
    }

    public void setExternalJobId(String externalJobId) {
        this.externalJobId = externalJobId;
    }

    public TaskDetailInfo withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 源端类型。
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public TaskDetailInfo withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 目的端类型。
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public TaskDetailInfo withTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
        return this;
    }

    /**
     * MRS Flink作业trackingUrl。
     * @return trackingUrl
     */
    public String getTrackingUrl() {
        return trackingUrl;
    }

    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    public TaskDetailInfo withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 任务状态。 - EXCEPTION：异常 - STOPPING：停止中 - SUBMITTING：提交中 - RUNNING：运行中 - STOPPED：已停止 - SUCCESS：成功
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public TaskDetailInfo withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public TaskDetailInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间，毫秒时间戳。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public TaskDetailInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 任务更新时间，毫秒时间戳。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskDetailInfo that = (TaskDetailInfo) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.monitorReportId, that.monitorReportId)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.runningStatus, that.runningStatus)
            && Objects.equals(this.externalJobId, that.externalJobId)
            && Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.targetType, that.targetType)
            && Objects.equals(this.trackingUrl, that.trackingUrl) && Objects.equals(this.state, that.state)
            && Objects.equals(this.errorMsg, that.errorMsg) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskName,
            monitorReportId,
            taskType,
            runningStatus,
            externalJobId,
            sourceType,
            targetType,
            trackingUrl,
            state,
            errorMsg,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskDetailInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    monitorReportId: ").append(toIndentedString(monitorReportId)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    runningStatus: ").append(toIndentedString(runningStatus)).append("\n");
        sb.append("    externalJobId: ").append(toIndentedString(externalJobId)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
