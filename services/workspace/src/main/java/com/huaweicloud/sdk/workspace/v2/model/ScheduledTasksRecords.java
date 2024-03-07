package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 定时任务执行记录。
 */
public class ScheduledTasksRecords {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_type")

    private String scheduledType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private Integer successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_num")

    private Integer skipNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_task_id")

    private String executeTaskId;

    public ScheduledTasksRecords withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务执行记录id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScheduledTasksRecords withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 执行时间，格式为yyyy-MM-dd HH:mm:ss。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ScheduledTasksRecords withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型。START：开机，STOP：关机，REBOOT：重启，HIBERNATE：休眠，REBUILD：重建系统盘。
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ScheduledTasksRecords withScheduledType(String scheduledType) {
        this.scheduledType = scheduledType;
        return this;
    }

    /**
     * 执行周期类型。FIXED_TIME：指定时间，DAY：按天，WEEK：按周，MONTH：按月。
     * @return scheduledType
     */
    public String getScheduledType() {
        return scheduledType;
    }

    public void setScheduledType(String scheduledType) {
        this.scheduledType = scheduledType;
    }

    public ScheduledTasksRecords withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 本次执行状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ScheduledTasksRecords withSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * 成功桌面个数。
     * @return successNum
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public ScheduledTasksRecords withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * 失败桌面个数。
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public ScheduledTasksRecords withSkipNum(Integer skipNum) {
        this.skipNum = skipNum;
        return this;
    }

    /**
     * 跳过桌面个数。
     * @return skipNum
     */
    public Integer getSkipNum() {
        return skipNum;
    }

    public void setSkipNum(Integer skipNum) {
        this.skipNum = skipNum;
    }

    public ScheduledTasksRecords withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public ScheduledTasksRecords withExecuteTaskId(String executeTaskId) {
        this.executeTaskId = executeTaskId;
        return this;
    }

    /**
     * 执行定时任务的任务id，只有定时执行脚本返回。
     * @return executeTaskId
     */
    public String getExecuteTaskId() {
        return executeTaskId;
    }

    public void setExecuteTaskId(String executeTaskId) {
        this.executeTaskId = executeTaskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduledTasksRecords that = (ScheduledTasksRecords) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.scheduledType, that.scheduledType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.successNum, that.successNum)
            && Objects.equals(this.failedNum, that.failedNum) && Objects.equals(this.skipNum, that.skipNum)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.executeTaskId, that.executeTaskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            startTime,
            taskType,
            scheduledType,
            status,
            successNum,
            failedNum,
            skipNum,
            timeZone,
            executeTaskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduledTasksRecords {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    skipNum: ").append(toIndentedString(skipNum)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    executeTaskId: ").append(toIndentedString(executeTaskId)).append("\n");
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
