package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListTransactionResponseBodyRows
 */
public class ListTransactionResponseBodyRows {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sessionid")

    private Integer sessionid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private Integer pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    private Integer queryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datname")

    private String datname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_addr")

    private String clientAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_port")

    private Integer clientPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usename")

    private String usename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_start")

    private String backendStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xact_start")

    private String xactStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_name")

    private String applicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_change")

    private String stateChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_start")

    private String queryStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting")

    private String waiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_sql_id")

    private Integer uniqueSqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_xid")

    private String topXid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_xid")

    private String currentXid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_time")

    private String execTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xlog_quantity")

    private Integer xlogQuantity;

    public ListTransactionResponseBodyRows withSessionid(Integer sessionid) {
        this.sessionid = sessionid;
        return this;
    }

    /**
     * **参数解释**: 事务ID。 **取值范围**: 不涉及。
     * @return sessionid
     */
    public Integer getSessionid() {
        return sessionid;
    }

    public void setSessionid(Integer sessionid) {
        this.sessionid = sessionid;
    }

    public ListTransactionResponseBodyRows withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * **参数解释**: 线程ID。 **取值范围**: 不涉及。
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public ListTransactionResponseBodyRows withQueryId(Integer queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * **参数解释**: SQL查询ID。 **取值范围**: 不涉及。
     * @return queryId
     */
    public Integer getQueryId() {
        return queryId;
    }

    public void setQueryId(Integer queryId) {
        this.queryId = queryId;
    }

    public ListTransactionResponseBodyRows withDatname(String datname) {
        this.datname = datname;
        return this;
    }

    /**
     * **参数解释**: 数据库。 **取值范围**: 不涉及。
     * @return datname
     */
    public String getDatname() {
        return datname;
    }

    public void setDatname(String datname) {
        this.datname = datname;
    }

    public ListTransactionResponseBodyRows withClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
        return this;
    }

    /**
     * **参数解释**: 用户发起事务请求的客户端地址。 **取值范围**: 不涉及。
     * @return clientAddr
     */
    public String getClientAddr() {
        return clientAddr;
    }

    public void setClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
    }

    public ListTransactionResponseBodyRows withClientPort(Integer clientPort) {
        this.clientPort = clientPort;
        return this;
    }

    /**
     * **参数解释**: 用户发起事务请求的客户端端口。 **取值范围**: 不涉及。
     * @return clientPort
     */
    public Integer getClientPort() {
        return clientPort;
    }

    public void setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
    }

    public ListTransactionResponseBodyRows withUsename(String usename) {
        this.usename = usename;
        return this;
    }

    /**
     * **参数解释**: 用户名。 **取值范围**: 不涉及。 **取值范围**: 不涉及。
     * @return usename
     */
    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public ListTransactionResponseBodyRows withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * **参数解释**: 查询的SQL语句。 **取值范围**: 不涉及。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ListTransactionResponseBodyRows withBackendStart(String backendStart) {
        this.backendStart = backendStart;
        return this;
    }

    /**
     * **参数解释**: 会话开始时间。 **取值范围**: 不涉及。
     * @return backendStart
     */
    public String getBackendStart() {
        return backendStart;
    }

    public void setBackendStart(String backendStart) {
        this.backendStart = backendStart;
    }

    public ListTransactionResponseBodyRows withXactStart(String xactStart) {
        this.xactStart = xactStart;
        return this;
    }

    /**
     * **参数解释**: 事务开始时间。 **取值范围**: 不涉及。
     * @return xactStart
     */
    public String getXactStart() {
        return xactStart;
    }

    public void setXactStart(String xactStart) {
        this.xactStart = xactStart;
    }

    public ListTransactionResponseBodyRows withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * **参数解释**: 应用名称。 **取值范围**: 不涉及。
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public ListTransactionResponseBodyRows withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**: 事务状态。 **取值范围**: 不涉及。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ListTransactionResponseBodyRows withStateChange(String stateChange) {
        this.stateChange = stateChange;
        return this;
    }

    /**
     * **参数解释**: 事务变更时间。 **取值范围**: 不涉及。
     * @return stateChange
     */
    public String getStateChange() {
        return stateChange;
    }

    public void setStateChange(String stateChange) {
        this.stateChange = stateChange;
    }

    public ListTransactionResponseBodyRows withQueryStart(String queryStart) {
        this.queryStart = queryStart;
        return this;
    }

    /**
     * **参数解释**: 查询开始时间。 **取值范围**: 不涉及。
     * @return queryStart
     */
    public String getQueryStart() {
        return queryStart;
    }

    public void setQueryStart(String queryStart) {
        this.queryStart = queryStart;
    }

    public ListTransactionResponseBodyRows withWaiting(String waiting) {
        this.waiting = waiting;
        return this;
    }

    /**
     * **参数解释**: 是否等待。 **取值范围**: 不涉及。
     * @return waiting
     */
    public String getWaiting() {
        return waiting;
    }

    public void setWaiting(String waiting) {
        this.waiting = waiting;
    }

    public ListTransactionResponseBodyRows withUniqueSqlId(Integer uniqueSqlId) {
        this.uniqueSqlId = uniqueSqlId;
        return this;
    }

    /**
     * **参数解释**: 归一化ID。 **取值范围**: 不涉及。
     * @return uniqueSqlId
     */
    public Integer getUniqueSqlId() {
        return uniqueSqlId;
    }

    public void setUniqueSqlId(Integer uniqueSqlId) {
        this.uniqueSqlId = uniqueSqlId;
    }

    public ListTransactionResponseBodyRows withTopXid(String topXid) {
        this.topXid = topXid;
        return this;
    }

    /**
     * **参数解释**: 顶层事务ID。
     * @return topXid
     */
    public String getTopXid() {
        return topXid;
    }

    public void setTopXid(String topXid) {
        this.topXid = topXid;
    }

    public ListTransactionResponseBodyRows withCurrentXid(String currentXid) {
        this.currentXid = currentXid;
        return this;
    }

    /**
     * **参数解释**: 当前事务ID。 **取值范围**: 不涉及。
     * @return currentXid
     */
    public String getCurrentXid() {
        return currentXid;
    }

    public void setCurrentXid(String currentXid) {
        this.currentXid = currentXid;
    }

    public ListTransactionResponseBodyRows withExecTime(String execTime) {
        this.execTime = execTime;
        return this;
    }

    /**
     * **参数解释**: 事务执行时长。 **取值范围**: 不涉及。
     * @return execTime
     */
    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime;
    }

    public ListTransactionResponseBodyRows withXlogQuantity(Integer xlogQuantity) {
        this.xlogQuantity = xlogQuantity;
        return this;
    }

    /**
     * **参数解释**: 事务xlog量。 **取值范围**: 不涉及。
     * @return xlogQuantity
     */
    public Integer getXlogQuantity() {
        return xlogQuantity;
    }

    public void setXlogQuantity(Integer xlogQuantity) {
        this.xlogQuantity = xlogQuantity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTransactionResponseBodyRows that = (ListTransactionResponseBodyRows) obj;
        return Objects.equals(this.sessionid, that.sessionid) && Objects.equals(this.pid, that.pid)
            && Objects.equals(this.queryId, that.queryId) && Objects.equals(this.datname, that.datname)
            && Objects.equals(this.clientAddr, that.clientAddr) && Objects.equals(this.clientPort, that.clientPort)
            && Objects.equals(this.usename, that.usename) && Objects.equals(this.query, that.query)
            && Objects.equals(this.backendStart, that.backendStart) && Objects.equals(this.xactStart, that.xactStart)
            && Objects.equals(this.applicationName, that.applicationName) && Objects.equals(this.state, that.state)
            && Objects.equals(this.stateChange, that.stateChange) && Objects.equals(this.queryStart, that.queryStart)
            && Objects.equals(this.waiting, that.waiting) && Objects.equals(this.uniqueSqlId, that.uniqueSqlId)
            && Objects.equals(this.topXid, that.topXid) && Objects.equals(this.currentXid, that.currentXid)
            && Objects.equals(this.execTime, that.execTime) && Objects.equals(this.xlogQuantity, that.xlogQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionid,
            pid,
            queryId,
            datname,
            clientAddr,
            clientPort,
            usename,
            query,
            backendStart,
            xactStart,
            applicationName,
            state,
            stateChange,
            queryStart,
            waiting,
            uniqueSqlId,
            topXid,
            currentXid,
            execTime,
            xlogQuantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTransactionResponseBodyRows {\n");
        sb.append("    sessionid: ").append(toIndentedString(sessionid)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
        sb.append("    datname: ").append(toIndentedString(datname)).append("\n");
        sb.append("    clientAddr: ").append(toIndentedString(clientAddr)).append("\n");
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    usename: ").append(toIndentedString(usename)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    backendStart: ").append(toIndentedString(backendStart)).append("\n");
        sb.append("    xactStart: ").append(toIndentedString(xactStart)).append("\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateChange: ").append(toIndentedString(stateChange)).append("\n");
        sb.append("    queryStart: ").append(toIndentedString(queryStart)).append("\n");
        sb.append("    waiting: ").append(toIndentedString(waiting)).append("\n");
        sb.append("    uniqueSqlId: ").append(toIndentedString(uniqueSqlId)).append("\n");
        sb.append("    topXid: ").append(toIndentedString(topXid)).append("\n");
        sb.append("    currentXid: ").append(toIndentedString(currentXid)).append("\n");
        sb.append("    execTime: ").append(toIndentedString(execTime)).append("\n");
        sb.append("    xlogQuantity: ").append(toIndentedString(xlogQuantity)).append("\n");
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
