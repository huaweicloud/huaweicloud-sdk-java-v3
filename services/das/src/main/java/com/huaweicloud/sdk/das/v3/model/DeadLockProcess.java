package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 死锁会话信息
 */
public class DeadLockProcess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spid")

    private String spid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_id")

    private String processId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_name")

    private String loginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_used")

    private Long logUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    public DeadLockProcess withSpid(String spid) {
        this.spid = spid;
        return this;
    }

    /**
     * 服务进程ID
     * @return spid
     */
    public String getSpid() {
        return spid;
    }

    public void setSpid(String spid) {
        this.spid = spid;
    }

    public DeadLockProcess withProcessId(String processId) {
        this.processId = processId;
        return this;
    }

    /**
     * 会话ID
     * @return processId
     */
    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public DeadLockProcess withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public DeadLockProcess withLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    /**
     * 用户名称
     * @return loginName
     */
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public DeadLockProcess withLogUsed(Long logUsed) {
        this.logUsed = logUsed;
        return this;
    }

    /**
     * 任务使用的日志空间
     * @return logUsed
     */
    public Long getLogUsed() {
        return logUsed;
    }

    public void setLogUsed(Long logUsed) {
        this.logUsed = logUsed;
    }

    public DeadLockProcess withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * SQL语句
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeadLockProcess that = (DeadLockProcess) obj;
        return Objects.equals(this.spid, that.spid) && Objects.equals(this.processId, that.processId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.loginName, that.loginName)
            && Objects.equals(this.logUsed, that.logUsed) && Objects.equals(this.sql, that.sql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spid, processId, hostName, loginName, logUsed, sql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeadLockProcess {\n");
        sb.append("    spid: ").append(toIndentedString(spid)).append("\n");
        sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    loginName: ").append(toIndentedString(loginName)).append("\n");
        sb.append("    logUsed: ").append(toIndentedString(logUsed)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
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
