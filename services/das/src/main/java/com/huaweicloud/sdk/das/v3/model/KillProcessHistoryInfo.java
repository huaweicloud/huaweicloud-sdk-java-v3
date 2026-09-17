package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * KillProcessHistoryInfo对象
 */
public class KillProcessHistoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private Long taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private Long sessionId;

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
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private String info;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kill_time")

    private Long killTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "killed_source")

    private String killedSource;

    public KillProcessHistoryInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public KillProcessHistoryInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public KillProcessHistoryInfo withTaskId(Long taskId) {
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

    public KillProcessHistoryInfo withSessionId(Long sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话ID
     * @return sessionId
     */
    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public KillProcessHistoryInfo withUser(String user) {
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

    public KillProcessHistoryInfo withHost(String host) {
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

    public KillProcessHistoryInfo withDb(String db) {
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

    public KillProcessHistoryInfo withCommand(String command) {
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

    public KillProcessHistoryInfo withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 执行时间
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public KillProcessHistoryInfo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public KillProcessHistoryInfo withInfo(String info) {
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

    public KillProcessHistoryInfo withKillTime(Long killTime) {
        this.killTime = killTime;
        return this;
    }

    /**
     * Kill时间
     * @return killTime
     */
    public Long getKillTime() {
        return killTime;
    }

    public void setKillTime(Long killTime) {
        this.killTime = killTime;
    }

    public KillProcessHistoryInfo withKilledSource(String killedSource) {
        this.killedSource = killedSource;
        return this;
    }

    /**
     * 会话被查杀的来源
     * @return killedSource
     */
    public String getKilledSource() {
        return killedSource;
    }

    public void setKilledSource(String killedSource) {
        this.killedSource = killedSource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KillProcessHistoryInfo that = (KillProcessHistoryInfo) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.sessionId, that.sessionId)
            && Objects.equals(this.user, that.user) && Objects.equals(this.host, that.host)
            && Objects.equals(this.db, that.db) && Objects.equals(this.command, that.command)
            && Objects.equals(this.time, that.time) && Objects.equals(this.state, that.state)
            && Objects.equals(this.info, that.info) && Objects.equals(this.killTime, that.killTime)
            && Objects.equals(this.killedSource, that.killedSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            nodeId,
            taskId,
            sessionId,
            user,
            host,
            db,
            command,
            time,
            state,
            info,
            killTime,
            killedSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KillProcessHistoryInfo {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    killTime: ").append(toIndentedString(killTime)).append("\n");
        sb.append("    killedSource: ").append(toIndentedString(killedSource)).append("\n");
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
