package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProcessorVo
 */
public class ProcessorVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_duration_nano")

    private Long execDurationNano;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_step_task_ins_id")

    private List<String> lastStepTaskInsId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_in_record_cnt")

    private Long taskInRecordCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_out_record_cnt")

    private Long taskOutRecordCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_show_info")

    private Object taskShowInfo;

    /**
     * 执行状态，作业任务状态，NEW.新建,SUBMITING.提交中,ACCEPTED.已接收,DEPLOYING.部署中,RUNNING.运行中,SUCCEEDED.成功,FAILED.失败,TERMINATED.中止,TERMINATING.中止中,PENDING.等待中
     */
    public static final class TaskStatusEnum {

        /**
         * Enum ACCEPTED for value: "ACCEPTED"
         */
        public static final TaskStatusEnum ACCEPTED = new TaskStatusEnum("ACCEPTED");

        /**
         * Enum DEPLOYING for value: "DEPLOYING"
         */
        public static final TaskStatusEnum DEPLOYING = new TaskStatusEnum("DEPLOYING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final TaskStatusEnum FAILED = new TaskStatusEnum("FAILED");

        /**
         * Enum NEW for value: "NEW"
         */
        public static final TaskStatusEnum NEW = new TaskStatusEnum("NEW");

        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final TaskStatusEnum PENDING = new TaskStatusEnum("PENDING");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final TaskStatusEnum RUNNING = new TaskStatusEnum("RUNNING");

        /**
         * Enum SUBMITING for value: "SUBMITING"
         */
        public static final TaskStatusEnum SUBMITING = new TaskStatusEnum("SUBMITING");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final TaskStatusEnum SUCCEEDED = new TaskStatusEnum("SUCCEEDED");

        /**
         * Enum TERMINATED for value: "TERMINATED"
         */
        public static final TaskStatusEnum TERMINATED = new TaskStatusEnum("TERMINATED");

        /**
         * Enum TERMINATING for value: "TERMINATING"
         */
        public static final TaskStatusEnum TERMINATING = new TaskStatusEnum("TERMINATING");

        private static final Map<String, TaskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskStatusEnum> createStaticFields() {
            Map<String, TaskStatusEnum> map = new HashMap<>();
            map.put("ACCEPTED", ACCEPTED);
            map.put("DEPLOYING", DEPLOYING);
            map.put("FAILED", FAILED);
            map.put("NEW", NEW);
            map.put("PENDING", PENDING);
            map.put("RUNNING", RUNNING);
            map.put("SUBMITING", SUBMITING);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("TERMINATED", TERMINATED);
            map.put("TERMINATING", TERMINATING);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskStatusEnum(value));
        }

        public static TaskStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private TaskStatusEnum taskStatus;

    public ProcessorVo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ProcessorVo withExecDurationNano(Long execDurationNano) {
        this.execDurationNano = execDurationNano;
        return this;
    }

    /**
     * 执行时长
     * @return execDurationNano
     */
    public Long getExecDurationNano() {
        return execDurationNano;
    }

    public void setExecDurationNano(Long execDurationNano) {
        this.execDurationNano = execDurationNano;
    }

    public ProcessorVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 执行过程id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProcessorVo withLastStepTaskInsId(List<String> lastStepTaskInsId) {
        this.lastStepTaskInsId = lastStepTaskInsId;
        return this;
    }

    public ProcessorVo addLastStepTaskInsIdItem(String lastStepTaskInsIdItem) {
        if (this.lastStepTaskInsId == null) {
            this.lastStepTaskInsId = new ArrayList<>();
        }
        this.lastStepTaskInsId.add(lastStepTaskInsIdItem);
        return this;
    }

    public ProcessorVo withLastStepTaskInsId(Consumer<List<String>> lastStepTaskInsIdSetter) {
        if (this.lastStepTaskInsId == null) {
            this.lastStepTaskInsId = new ArrayList<>();
        }
        lastStepTaskInsIdSetter.accept(this.lastStepTaskInsId);
        return this;
    }

    /**
     * 上游子任务id
     * @return lastStepTaskInsId
     */
    public List<String> getLastStepTaskInsId() {
        return lastStepTaskInsId;
    }

    public void setLastStepTaskInsId(List<String> lastStepTaskInsId) {
        this.lastStepTaskInsId = lastStepTaskInsId;
    }

    public ProcessorVo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ProcessorVo withTaskInRecordCnt(Long taskInRecordCnt) {
        this.taskInRecordCnt = taskInRecordCnt;
        return this;
    }

    /**
     * 输入个数
     * @return taskInRecordCnt
     */
    public Long getTaskInRecordCnt() {
        return taskInRecordCnt;
    }

    public void setTaskInRecordCnt(Long taskInRecordCnt) {
        this.taskInRecordCnt = taskInRecordCnt;
    }

    public ProcessorVo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 执行过程名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ProcessorVo withTaskOutRecordCnt(Long taskOutRecordCnt) {
        this.taskOutRecordCnt = taskOutRecordCnt;
        return this;
    }

    /**
     * 输出个数
     * @return taskOutRecordCnt
     */
    public Long getTaskOutRecordCnt() {
        return taskOutRecordCnt;
    }

    public void setTaskOutRecordCnt(Long taskOutRecordCnt) {
        this.taskOutRecordCnt = taskOutRecordCnt;
    }

    public ProcessorVo withTaskShowInfo(Object taskShowInfo) {
        this.taskShowInfo = taskShowInfo;
        return this;
    }

    /**
     * processor对外展示信息，k,v
     * @return taskShowInfo
     */
    public Object getTaskShowInfo() {
        return taskShowInfo;
    }

    public void setTaskShowInfo(Object taskShowInfo) {
        this.taskShowInfo = taskShowInfo;
    }

    public ProcessorVo withTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 执行状态，作业任务状态，NEW.新建,SUBMITING.提交中,ACCEPTED.已接收,DEPLOYING.部署中,RUNNING.运行中,SUCCEEDED.成功,FAILED.失败,TERMINATED.中止,TERMINATING.中止中,PENDING.等待中
     * @return taskStatus
     */
    public TaskStatusEnum getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessorVo that = (ProcessorVo) obj;
        return Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.execDurationNano, that.execDurationNano) && Objects.equals(this.id, that.id)
            && Objects.equals(this.lastStepTaskInsId, that.lastStepTaskInsId)
            && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.taskInRecordCnt, that.taskInRecordCnt)
            && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.taskOutRecordCnt, that.taskOutRecordCnt)
            && Objects.equals(this.taskShowInfo, that.taskShowInfo) && Objects.equals(this.taskStatus, that.taskStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime,
            execDurationNano,
            id,
            lastStepTaskInsId,
            startTime,
            taskInRecordCnt,
            taskName,
            taskOutRecordCnt,
            taskShowInfo,
            taskStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessorVo {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    execDurationNano: ").append(toIndentedString(execDurationNano)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastStepTaskInsId: ").append(toIndentedString(lastStepTaskInsId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    taskInRecordCnt: ").append(toIndentedString(taskInRecordCnt)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskOutRecordCnt: ").append(toIndentedString(taskOutRecordCnt)).append("\n");
        sb.append("    taskShowInfo: ").append(toIndentedString(taskShowInfo)).append("\n");
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
