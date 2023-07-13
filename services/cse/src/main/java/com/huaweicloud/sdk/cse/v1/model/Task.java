package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 子任务
 */
public class Task {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private Integer jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    /**
     * 子任务的类型
     */
    public static final class TypeEnum {

        /**
         * Enum CREATE for value: "Create"
         */
        public static final TypeEnum CREATE = new TypeEnum("Create");

        /**
         * Enum DELETE for value: "Delete"
         */
        public static final TypeEnum DELETE = new TypeEnum("Delete");

        /**
         * Enum UPGRADE for value: "Upgrade"
         */
        public static final TypeEnum UPGRADE = new TypeEnum("Upgrade");

        /**
         * Enum MODIFY for value: "Modify"
         */
        public static final TypeEnum MODIFY = new TypeEnum("Modify");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("Create", CREATE);
            map.put("Delete", DELETE);
            map.put("Upgrade", UPGRADE);
            map.put("Modify", MODIFY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned")

    private String assigned;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_order")

    private Integer taskOrder;

    /**
     * 子任务状态
     */
    public static final class StatusEnum {

        /**
         * Enum INIT for value: "Init"
         */
        public static final StatusEnum INIT = new StatusEnum("Init");

        /**
         * Enum EXECUTING for value: "Executing"
         */
        public static final StatusEnum EXECUTING = new StatusEnum("Executing");

        /**
         * Enum ERROR for value: "Error"
         */
        public static final StatusEnum ERROR = new StatusEnum("Error");

        /**
         * Enum TIMEOUT for value: "Timeout"
         */
        public static final StatusEnum TIMEOUT = new StatusEnum("Timeout");

        /**
         * Enum FINISHED for value: "Finished"
         */
        public static final StatusEnum FINISHED = new StatusEnum("Finished");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Init", INIT);
            map.put("Executing", EXECUTING);
            map.put("Error", ERROR);
            map.put("Timeout", TIMEOUT);
            map.put("Finished", FINISHED);
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
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log")

    private String log;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private String output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_executor_brief")

    private TaskExecutorBrief taskExecutorBrief;

    public Task withJobId(Integer jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 子任务所属任务ID
     * @return jobId
     */
    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Task withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 子任务ID，使用uuid
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Task withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 子任务的类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Task withAssigned(String assigned) {
        this.assigned = assigned;
        return this;
    }

    /**
     * 子任务的执行者
     * @return assigned
     */
    public String getAssigned() {
        return assigned;
    }

    public void setAssigned(String assigned) {
        this.assigned = assigned;
    }

    public Task withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 子任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Task withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 子任务所属引擎名称
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public Task withTaskOrder(Integer taskOrder) {
        this.taskOrder = taskOrder;
        return this;
    }

    /**
     * 子任务执行的顺序, 从小到大
     * @return taskOrder
     */
    public Integer getTaskOrder() {
        return taskOrder;
    }

    public void setTaskOrder(Integer taskOrder) {
        this.taskOrder = taskOrder;
    }

    public Task withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 子任务状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Task withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 子任务开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Task withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 子任务结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Task withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 子任务创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Task withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 子任务更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Task withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 子任务是否超时
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Task withLog(String log) {
        this.log = log;
        return this;
    }

    /**
     * 子任务详细信息，执行过程中产生的辅助信息
     * @return log
     */
    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public Task withOutput(String output) {
        this.output = output;
        return this;
    }

    /**
     * 子任务输出信息
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public Task withTaskExecutorBrief(TaskExecutorBrief taskExecutorBrief) {
        this.taskExecutorBrief = taskExecutorBrief;
        return this;
    }

    public Task withTaskExecutorBrief(Consumer<TaskExecutorBrief> taskExecutorBriefSetter) {
        if (this.taskExecutorBrief == null) {
            this.taskExecutorBrief = new TaskExecutorBrief();
            taskExecutorBriefSetter.accept(this.taskExecutorBrief);
        }

        return this;
    }

    /**
     * Get taskExecutorBrief
     * @return taskExecutorBrief
     */
    public TaskExecutorBrief getTaskExecutorBrief() {
        return taskExecutorBrief;
    }

    public void setTaskExecutorBrief(TaskExecutorBrief taskExecutorBrief) {
        this.taskExecutorBrief = taskExecutorBrief;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Task that = (Task) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.type, that.type) && Objects.equals(this.assigned, that.assigned)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.taskOrder, that.taskOrder) && Objects.equals(this.status, that.status)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.timeout, that.timeout) && Objects.equals(this.log, that.log)
            && Objects.equals(this.output, that.output)
            && Objects.equals(this.taskExecutorBrief, that.taskExecutorBrief);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            id,
            type,
            assigned,
            taskName,
            engineName,
            taskOrder,
            status,
            startTime,
            endTime,
            createTime,
            updateTime,
            timeout,
            log,
            output,
            taskExecutorBrief);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Task {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    taskOrder: ").append(toIndentedString(taskOrder)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    taskExecutorBrief: ").append(toIndentedString(taskExecutorBrief)).append("\n");
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
