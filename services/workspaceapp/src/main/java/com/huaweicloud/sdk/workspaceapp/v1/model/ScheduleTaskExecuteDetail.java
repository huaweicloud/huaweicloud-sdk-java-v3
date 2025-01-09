package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 定时任务执行记录子任务详情。
 */
public class ScheduleTaskExecuteDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_id")

    private String executeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ScheduleTaskStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private ScheduleTaskTypeEnum taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private OffsetDateTime beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private String resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_message")

    private String resultMessage;

    public ScheduleTaskExecuteDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 定时任务执行记录主键id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScheduleTaskExecuteDetail withExecuteId(String executeId) {
        this.executeId = executeId;
        return this;
    }

    /**
     * 主任务记录id。
     * @return executeId
     */
    public String getExecuteId() {
        return executeId;
    }

    public void setExecuteId(String executeId) {
        this.executeId = executeId;
    }

    public ScheduleTaskExecuteDetail withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 操作的server_id。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ScheduleTaskExecuteDetail withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * 操作的机器名称。
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public ScheduleTaskExecuteDetail withStatus(ScheduleTaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ScheduleTaskStatus getStatus() {
        return status;
    }

    public void setStatus(ScheduleTaskStatus status) {
        this.status = status;
    }

    public ScheduleTaskExecuteDetail withTaskType(ScheduleTaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * Get taskType
     * @return taskType
     */
    public ScheduleTaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(ScheduleTaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public ScheduleTaskExecuteDetail withTimeZone(String timeZone) {
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

    public ScheduleTaskExecuteDetail withBeginTime(OffsetDateTime beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 子任务开始时间。
     * @return beginTime
     */
    public OffsetDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(OffsetDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public ScheduleTaskExecuteDetail withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 子任务结束时间。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public ScheduleTaskExecuteDetail withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 任务执行失败时的错误码。
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public ScheduleTaskExecuteDetail withResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }

    /**
     * 任务失败原因。
     * @return resultMessage
     */
    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduleTaskExecuteDetail that = (ScheduleTaskExecuteDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.executeId, that.executeId)
            && Objects.equals(this.serverId, that.serverId) && Objects.equals(this.serverName, that.serverName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.resultCode, that.resultCode)
            && Objects.equals(this.resultMessage, that.resultMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            executeId,
            serverId,
            serverName,
            status,
            taskType,
            timeZone,
            beginTime,
            endTime,
            resultCode,
            resultMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleTaskExecuteDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    executeId: ").append(toIndentedString(executeId)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    resultMessage: ").append(toIndentedString(resultMessage)).append("\n");
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
