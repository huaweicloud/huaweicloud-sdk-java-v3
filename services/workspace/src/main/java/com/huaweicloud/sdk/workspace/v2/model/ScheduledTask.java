package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 定时任务信息。
 */
public class ScheduledTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_type")

    private String scheduledType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "life_cycle_type")

    private String lifeCycleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_status")

    private String lastStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_execution_time")

    private String nextExecutionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_time")

    private Integer waitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_params")

    private String extraParams;

    public ScheduledTask withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScheduledTask withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ScheduledTask withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型。START：开机，STOP：关机，REBOOT：重启，HIBERNATE：休眠，REBUILD：重建系统盘，EXECUTE_SCRIPT：执行脚本，CREATE_SNAPSHOT：创建快照，DELETE_BLACK_ECS：删除桌面
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ScheduledTask withScheduledType(String scheduledType) {
        this.scheduledType = scheduledType;
        return this;
    }

    /**
     * 执行周期。FIXED_TIME：指定时间，DAY：按天，WEEK：按周，MONTH：按月。
     * @return scheduledType
     */
    public String getScheduledType() {
        return scheduledType;
    }

    public void setScheduledType(String scheduledType) {
        this.scheduledType = scheduledType;
    }

    public ScheduledTask withLifeCycleType(String lifeCycleType) {
        this.lifeCycleType = lifeCycleType;
        return this;
    }

    /**
     * 触发场景类型。
     * @return lifeCycleType
     */
    public String getLifeCycleType() {
        return lifeCycleType;
    }

    public void setLifeCycleType(String lifeCycleType) {
        this.lifeCycleType = lifeCycleType;
    }

    public ScheduledTask withLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    /**
     * 最近一次执行状态。SUCCESS：成功，SKIP：跳过，FAIL：失败。
     * @return lastStatus
     */
    public String getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    public ScheduledTask withNextExecutionTime(String nextExecutionTime) {
        this.nextExecutionTime = nextExecutionTime;
        return this;
    }

    /**
     * 下一次执行时间。格式为yyyy-MM-dd HH:mm:ss。
     * @return nextExecutionTime
     */
    public String getNextExecutionTime() {
        return nextExecutionTime;
    }

    public void setNextExecutionTime(String nextExecutionTime) {
        this.nextExecutionTime = nextExecutionTime;
    }

    public ScheduledTask withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 到期时间，格式为yyyy-MM-dd HH:mm:ss。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public ScheduledTask withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否启用。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ScheduledTask withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ScheduledTask withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级。触发式任务使用。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ScheduledTask withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public ScheduledTask withWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
        return this;
    }

    /**
     * 触发式任务触发后，等待时长。
     * @return waitTime
     */
    public Integer getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
    }

    public ScheduledTask withExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }

    /**
     * 扩展参数，json格式。
     * @return extraParams
     */
    public String getExtraParams() {
        return extraParams;
    }

    public void setExtraParams(String extraParams) {
        this.extraParams = extraParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduledTask that = (ScheduledTask) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.scheduledType, that.scheduledType)
            && Objects.equals(this.lifeCycleType, that.lifeCycleType)
            && Objects.equals(this.lastStatus, that.lastStatus)
            && Objects.equals(this.nextExecutionTime, that.nextExecutionTime)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.description, that.description) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.waitTime, that.waitTime)
            && Objects.equals(this.extraParams, that.extraParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            taskName,
            taskType,
            scheduledType,
            lifeCycleType,
            lastStatus,
            nextExecutionTime,
            expireTime,
            enable,
            description,
            priority,
            timeZone,
            waitTime,
            extraParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduledTask {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    lifeCycleType: ").append(toIndentedString(lifeCycleType)).append("\n");
        sb.append("    lastStatus: ").append(toIndentedString(lastStatus)).append("\n");
        sb.append("    nextExecutionTime: ").append(toIndentedString(nextExecutionTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
        sb.append("    extraParams: ").append(toIndentedString(extraParams)).append("\n");
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
