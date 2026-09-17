package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 添加自动kill会话任务请求体
 */
public class CreateKillTaskRequestBody {

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
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private String info;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_duration")

    private Long taskDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    public CreateKillTaskRequestBody withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 数据库用户
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public CreateKillTaskRequestBody withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 数据库主机
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public CreateKillTaskRequestBody withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * 数据库名称
     * @return db
     */
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public CreateKillTaskRequestBody withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 命令类型
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public CreateKillTaskRequestBody withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 会话执行时间
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public CreateKillTaskRequestBody withInfo(String info) {
        this.info = info;
        return this;
    }

    /**
     * SQL信息
     * @return info
     */
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public CreateKillTaskRequestBody withTaskDuration(Long taskDuration) {
        this.taskDuration = taskDuration;
        return this;
    }

    /**
     * 任务持续时间
     * @return taskDuration
     */
    public Long getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(Long taskDuration) {
        this.taskDuration = taskDuration;
    }

    public CreateKillTaskRequestBody withTaskType(String taskType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateKillTaskRequestBody that = (CreateKillTaskRequestBody) obj;
        return Objects.equals(this.user, that.user) && Objects.equals(this.host, that.host)
            && Objects.equals(this.db, that.db) && Objects.equals(this.command, that.command)
            && Objects.equals(this.time, that.time) && Objects.equals(this.info, that.info)
            && Objects.equals(this.taskDuration, that.taskDuration) && Objects.equals(this.taskType, that.taskType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, host, db, command, time, info, taskDuration, taskType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKillTaskRequestBody {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    taskDuration: ").append(toIndentedString(taskDuration)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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
