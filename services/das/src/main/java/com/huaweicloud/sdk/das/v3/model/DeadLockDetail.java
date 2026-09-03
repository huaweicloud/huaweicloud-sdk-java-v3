package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 死锁详情
 */
public class DeadLockDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_lock_id")

    private String deadLockId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_tran_started")

    private String lastTranStarted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spid")

    private String spid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_victim")

    private Boolean isVictim;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_used")

    private Long logUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_mode")

    private String lockMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_resource_desc")

    private String waitResourceDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_owned")

    private String objectOwned;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_requested")

    private String objectRequested;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_resource")

    private String waitResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_name")

    private String loginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_app")

    private String clientApp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_id")

    private String dbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_detail_list")

    private List<DeadLockSubDetail> subDetailList = null;

    public DeadLockDetail withDeadLockId(String deadLockId) {
        this.deadLockId = deadLockId;
        return this;
    }

    /**
     * 死锁ID
     * @return deadLockId
     */
    public String getDeadLockId() {
        return deadLockId;
    }

    public void setDeadLockId(String deadLockId) {
        this.deadLockId = deadLockId;
    }

    public DeadLockDetail withLastTranStarted(String lastTranStarted) {
        this.lastTranStarted = lastTranStarted;
        return this;
    }

    /**
     * 事务开启时间
     * @return lastTranStarted
     */
    public String getLastTranStarted() {
        return lastTranStarted;
    }

    public void setLastTranStarted(String lastTranStarted) {
        this.lastTranStarted = lastTranStarted;
    }

    public DeadLockDetail withSpid(String spid) {
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

    public DeadLockDetail withIsVictim(Boolean isVictim) {
        this.isVictim = isVictim;
        return this;
    }

    /**
     * 该会话是否已被终止
     * @return isVictim
     */
    public Boolean getIsVictim() {
        return isVictim;
    }

    public void setIsVictim(Boolean isVictim) {
        this.isVictim = isVictim;
    }

    public DeadLockDetail withLogUsed(Long logUsed) {
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

    public DeadLockDetail withLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }

    /**
     * 锁模式（S,X,U）
     * @return lockMode
     */
    public String getLockMode() {
        return lockMode;
    }

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    public DeadLockDetail withWaitResourceDesc(String waitResourceDesc) {
        this.waitResourceDesc = waitResourceDesc;
        return this;
    }

    /**
     * 等待中的资源详情
     * @return waitResourceDesc
     */
    public String getWaitResourceDesc() {
        return waitResourceDesc;
    }

    public void setWaitResourceDesc(String waitResourceDesc) {
        this.waitResourceDesc = waitResourceDesc;
    }

    public DeadLockDetail withObjectOwned(String objectOwned) {
        this.objectOwned = objectOwned;
        return this;
    }

    /**
     * 被锁住的对象
     * @return objectOwned
     */
    public String getObjectOwned() {
        return objectOwned;
    }

    public void setObjectOwned(String objectOwned) {
        this.objectOwned = objectOwned;
    }

    public DeadLockDetail withObjectRequested(String objectRequested) {
        this.objectRequested = objectRequested;
        return this;
    }

    /**
     * 请求加锁的对象
     * @return objectRequested
     */
    public String getObjectRequested() {
        return objectRequested;
    }

    public void setObjectRequested(String objectRequested) {
        this.objectRequested = objectRequested;
    }

    public DeadLockDetail withWaitResource(String waitResource) {
        this.waitResource = waitResource;
        return this;
    }

    /**
     * 等待资源名称
     * @return waitResource
     */
    public String getWaitResource() {
        return waitResource;
    }

    public void setWaitResource(String waitResource) {
        this.waitResource = waitResource;
    }

    public DeadLockDetail withHostName(String hostName) {
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

    public DeadLockDetail withLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    /**
     * 状态
     * @return loginName
     */
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public DeadLockDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 等待中的资源详情
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DeadLockDetail withClientApp(String clientApp) {
        this.clientApp = clientApp;
        return this;
    }

    /**
     * 客户端
     * @return clientApp
     */
    public String getClientApp() {
        return clientApp;
    }

    public void setClientApp(String clientApp) {
        this.clientApp = clientApp;
    }

    public DeadLockDetail withSql(String sql) {
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

    public DeadLockDetail withDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }

    /**
     * 数据库ID
     * @return dbId
     */
    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public DeadLockDetail withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public DeadLockDetail withSubDetailList(List<DeadLockSubDetail> subDetailList) {
        this.subDetailList = subDetailList;
        return this;
    }

    public DeadLockDetail addSubDetailListItem(DeadLockSubDetail subDetailListItem) {
        if (this.subDetailList == null) {
            this.subDetailList = new ArrayList<>();
        }
        this.subDetailList.add(subDetailListItem);
        return this;
    }

    public DeadLockDetail withSubDetailList(Consumer<List<DeadLockSubDetail>> subDetailListSetter) {
        if (this.subDetailList == null) {
            this.subDetailList = new ArrayList<>();
        }
        subDetailListSetter.accept(this.subDetailList);
        return this;
    }

    /**
     * 死锁子明细列表
     * @return subDetailList
     */
    public List<DeadLockSubDetail> getSubDetailList() {
        return subDetailList;
    }

    public void setSubDetailList(List<DeadLockSubDetail> subDetailList) {
        this.subDetailList = subDetailList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeadLockDetail that = (DeadLockDetail) obj;
        return Objects.equals(this.deadLockId, that.deadLockId)
            && Objects.equals(this.lastTranStarted, that.lastTranStarted) && Objects.equals(this.spid, that.spid)
            && Objects.equals(this.isVictim, that.isVictim) && Objects.equals(this.logUsed, that.logUsed)
            && Objects.equals(this.lockMode, that.lockMode)
            && Objects.equals(this.waitResourceDesc, that.waitResourceDesc)
            && Objects.equals(this.objectOwned, that.objectOwned)
            && Objects.equals(this.objectRequested, that.objectRequested)
            && Objects.equals(this.waitResource, that.waitResource) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.loginName, that.loginName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.clientApp, that.clientApp) && Objects.equals(this.sql, that.sql)
            && Objects.equals(this.dbId, that.dbId) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.subDetailList, that.subDetailList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deadLockId,
            lastTranStarted,
            spid,
            isVictim,
            logUsed,
            lockMode,
            waitResourceDesc,
            objectOwned,
            objectRequested,
            waitResource,
            hostName,
            loginName,
            status,
            clientApp,
            sql,
            dbId,
            dbName,
            subDetailList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeadLockDetail {\n");
        sb.append("    deadLockId: ").append(toIndentedString(deadLockId)).append("\n");
        sb.append("    lastTranStarted: ").append(toIndentedString(lastTranStarted)).append("\n");
        sb.append("    spid: ").append(toIndentedString(spid)).append("\n");
        sb.append("    isVictim: ").append(toIndentedString(isVictim)).append("\n");
        sb.append("    logUsed: ").append(toIndentedString(logUsed)).append("\n");
        sb.append("    lockMode: ").append(toIndentedString(lockMode)).append("\n");
        sb.append("    waitResourceDesc: ").append(toIndentedString(waitResourceDesc)).append("\n");
        sb.append("    objectOwned: ").append(toIndentedString(objectOwned)).append("\n");
        sb.append("    objectRequested: ").append(toIndentedString(objectRequested)).append("\n");
        sb.append("    waitResource: ").append(toIndentedString(waitResource)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    loginName: ").append(toIndentedString(loginName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    clientApp: ").append(toIndentedString(clientApp)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    subDetailList: ").append(toIndentedString(subDetailList)).append("\n");
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
