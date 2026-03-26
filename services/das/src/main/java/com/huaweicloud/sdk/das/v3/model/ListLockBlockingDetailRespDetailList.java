package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListLockBlockingDetailRespDetailList
 */
public class ListLockBlockingDetailRespDetailList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_id")

    private String uniqueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spid")

    private Long spid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocked_by_spid")

    private Long blockedBySpid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_time")

    private Long collectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elapsed_time")

    private Long elapsedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Long cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_time")

    private Long waitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_type")

    private String waitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_hash")

    private String queryHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_app_name")

    private String clientAppName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_id")

    private String loginId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd")

    private String cmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_io")

    private Long physicalIo;

    public ListLockBlockingDetailRespDetailList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListLockBlockingDetailRespDetailList withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * 批次ID
     * @return uniqueId
     */
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public ListLockBlockingDetailRespDetailList withSpid(Long spid) {
        this.spid = spid;
        return this;
    }

    /**
     * 会话ID
     * minimum: 0
     * maximum: 9223372036854775807
     * @return spid
     */
    public Long getSpid() {
        return spid;
    }

    public void setSpid(Long spid) {
        this.spid = spid;
    }

    public ListLockBlockingDetailRespDetailList withBlockedBySpid(Long blockedBySpid) {
        this.blockedBySpid = blockedBySpid;
        return this;
    }

    /**
     * 阻塞会话ID
     * minimum: 0
     * maximum: 9223372036854775807
     * @return blockedBySpid
     */
    public Long getBlockedBySpid() {
        return blockedBySpid;
    }

    public void setBlockedBySpid(Long blockedBySpid) {
        this.blockedBySpid = blockedBySpid;
    }

    public ListLockBlockingDetailRespDetailList withCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    /**
     * 采集时间
     * minimum: 0
     * maximum: 253370736001000
     * @return collectTime
     */
    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    public ListLockBlockingDetailRespDetailList withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * SQL开始时间
     * minimum: 0
     * maximum: 253370736001000
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListLockBlockingDetailRespDetailList withElapsedTime(Long elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }

    /**
     * 执行耗时（ms）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return elapsedTime
     */
    public Long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public ListLockBlockingDetailRespDetailList withCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU时间（ms）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return cpu
     */
    public Long getCpu() {
        return cpu;
    }

    public void setCpu(Long cpu) {
        this.cpu = cpu;
    }

    public ListLockBlockingDetailRespDetailList withWaitTime(Long waitTime) {
        this.waitTime = waitTime;
        return this;
    }

    /**
     * 阻塞时长（ms）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return waitTime
     */
    public Long getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Long waitTime) {
        this.waitTime = waitTime;
    }

    public ListLockBlockingDetailRespDetailList withWaitType(String waitType) {
        this.waitType = waitType;
        return this;
    }

    /**
     * 等待类型
     * @return waitType
     */
    public String getWaitType() {
        return waitType;
    }

    public void setWaitType(String waitType) {
        this.waitType = waitType;
    }

    public ListLockBlockingDetailRespDetailList withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * SQL
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public ListLockBlockingDetailRespDetailList withQueryHash(String queryHash) {
        this.queryHash = queryHash;
        return this;
    }

    /**
     * Query Hash
     * @return queryHash
     */
    public String getQueryHash() {
        return queryHash;
    }

    public void setQueryHash(String queryHash) {
        this.queryHash = queryHash;
    }

    public ListLockBlockingDetailRespDetailList withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ListLockBlockingDetailRespDetailList withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 客户端HostName
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListLockBlockingDetailRespDetailList withClientAppName(String clientAppName) {
        this.clientAppName = clientAppName;
        return this;
    }

    /**
     * 客户端名称
     * @return clientAppName
     */
    public String getClientAppName() {
        return clientAppName;
    }

    public void setClientAppName(String clientAppName) {
        this.clientAppName = clientAppName;
    }

    public ListLockBlockingDetailRespDetailList withLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }

    /**
     * 当前用户
     * @return loginId
     */
    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public ListLockBlockingDetailRespDetailList withCmd(String cmd) {
        this.cmd = cmd;
        return this;
    }

    /**
     * SQL命令类型
     * @return cmd
     */
    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public ListLockBlockingDetailRespDetailList withPhysicalIo(Long physicalIo) {
        this.physicalIo = physicalIo;
        return this;
    }

    /**
     * SQL消耗的I/O
     * minimum: 0
     * maximum: 9223372036854775807
     * @return physicalIo
     */
    public Long getPhysicalIo() {
        return physicalIo;
    }

    public void setPhysicalIo(Long physicalIo) {
        this.physicalIo = physicalIo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLockBlockingDetailRespDetailList that = (ListLockBlockingDetailRespDetailList) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.uniqueId, that.uniqueId)
            && Objects.equals(this.spid, that.spid) && Objects.equals(this.blockedBySpid, that.blockedBySpid)
            && Objects.equals(this.collectTime, that.collectTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.elapsedTime, that.elapsedTime) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.waitTime, that.waitTime) && Objects.equals(this.waitType, that.waitType)
            && Objects.equals(this.sql, that.sql) && Objects.equals(this.queryHash, that.queryHash)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.clientAppName, that.clientAppName) && Objects.equals(this.loginId, that.loginId)
            && Objects.equals(this.cmd, that.cmd) && Objects.equals(this.physicalIo, that.physicalIo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            uniqueId,
            spid,
            blockedBySpid,
            collectTime,
            startTime,
            elapsedTime,
            cpu,
            waitTime,
            waitType,
            sql,
            queryHash,
            dbName,
            hostName,
            clientAppName,
            loginId,
            cmd,
            physicalIo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLockBlockingDetailRespDetailList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
        sb.append("    spid: ").append(toIndentedString(spid)).append("\n");
        sb.append("    blockedBySpid: ").append(toIndentedString(blockedBySpid)).append("\n");
        sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
        sb.append("    waitType: ").append(toIndentedString(waitType)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    queryHash: ").append(toIndentedString(queryHash)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    clientAppName: ").append(toIndentedString(clientAppName)).append("\n");
        sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
        sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
        sb.append("    physicalIo: ").append(toIndentedString(physicalIo)).append("\n");
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
