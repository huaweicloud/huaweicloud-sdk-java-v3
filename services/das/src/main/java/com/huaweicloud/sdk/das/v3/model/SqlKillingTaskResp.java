package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自动kill会话任务
 */
public class SqlKillingTaskResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db")

    private String db;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private String info;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private Long taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_duration")

    private Long taskDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_state")

    private Integer taskState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public SqlKillingTaskResp withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户名
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public SqlKillingTaskResp withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * host地址
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public SqlKillingTaskResp withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * 数据库
     * @return db
     */
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public SqlKillingTaskResp withInfo(String info) {
        this.info = info;
        return this;
    }

    /**
     * 信息
     * @return info
     */
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public SqlKillingTaskResp withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 命令行
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public SqlKillingTaskResp withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 次数
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public SqlKillingTaskResp withTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public SqlKillingTaskResp withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public SqlKillingTaskResp withTaskDuration(Long taskDuration) {
        this.taskDuration = taskDuration;
        return this;
    }

    /**
     * 任务耗时
     * @return taskDuration
     */
    public Long getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(Long taskDuration) {
        this.taskDuration = taskDuration;
    }

    public SqlKillingTaskResp withTaskState(Integer taskState) {
        this.taskState = taskState;
        return this;
    }

    /**
     * 任务状态
     * @return taskState
     */
    public Integer getTaskState() {
        return taskState;
    }

    public void setTaskState(Integer taskState) {
        this.taskState = taskState;
    }

    public SqlKillingTaskResp withStartTime(Long startTime) {
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

    public SqlKillingTaskResp withEndTime(Long endTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlKillingTaskResp that = (SqlKillingTaskResp) obj;
        return Objects.equals(this.user, that.user) && Objects.equals(this.host, that.host)
            && Objects.equals(this.db, that.db) && Objects.equals(this.info, that.info)
            && Objects.equals(this.command, that.command) && Objects.equals(this.time, that.time)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.taskDuration, that.taskDuration) && Objects.equals(this.taskState, that.taskState)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(user, host, db, info, command, time, taskId, taskType, taskDuration, taskState, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlKillingTaskResp {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    taskDuration: ").append(toIndentedString(taskDuration)).append("\n");
        sb.append("    taskState: ").append(toIndentedString(taskState)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
