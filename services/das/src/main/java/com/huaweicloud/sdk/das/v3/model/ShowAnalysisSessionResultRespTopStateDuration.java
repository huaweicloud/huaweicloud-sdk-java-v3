package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowAnalysisSessionResultRespTopStateDuration
 */
public class ShowAnalysisSessionResultRespTopStateDuration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_status")

    private String executionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_statement")

    private String sqlStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_duration")

    private String stateDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_duration")

    private String transactionDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_lock_wait_time")

    private String transactionLockWaitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_status")

    private String transactionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_locked_by_transactions")

    private String rowsLockedByTransactions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables_locked_by_transactions")

    private String tablesLockedByTransactions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_updated_by_transactions")

    private String rowsUpdatedByTransactions;

    public ShowAnalysisSessionResultRespTopStateDuration withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话ID
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public ShowAnalysisSessionResultRespTopStateDuration withUser(String user) {
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

    public ShowAnalysisSessionResultRespTopStateDuration withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 主机IP
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ShowAnalysisSessionResultRespTopStateDuration withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ShowAnalysisSessionResultRespTopStateDuration withExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }

    /**
     * 执行状态
     * @return executionStatus
     */
    public String getExecutionStatus() {
        return executionStatus;
    }

    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }

    public ShowAnalysisSessionResultRespTopStateDuration withCommand(String command) {
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

    public ShowAnalysisSessionResultRespTopStateDuration withSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
        return this;
    }

    /**
     * SQL语句
     * @return sqlStatement
     */
    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public ShowAnalysisSessionResultRespTopStateDuration withStateDuration(String stateDuration) {
        this.stateDuration = stateDuration;
        return this;
    }

    /**
     * 状态持续时间（秒）
     * @return stateDuration
     */
    public String getStateDuration() {
        return stateDuration;
    }

    public void setStateDuration(String stateDuration) {
        this.stateDuration = stateDuration;
    }

    public ShowAnalysisSessionResultRespTopStateDuration withTransactionDuration(String transactionDuration) {
        this.transactionDuration = transactionDuration;
        return this;
    }

    /**
     * 事务持续时间（秒）
     * @return transactionDuration
     */
    public String getTransactionDuration() {
        return transactionDuration;
    }

    public void setTransactionDuration(String transactionDuration) {
        this.transactionDuration = transactionDuration;
    }

    public ShowAnalysisSessionResultRespTopStateDuration withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * 事务ID
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public ShowAnalysisSessionResultRespTopStateDuration withTransactionLockWaitTime(String transactionLockWaitTime) {
        this.transactionLockWaitTime = transactionLockWaitTime;
        return this;
    }

    /**
     * 事务锁等待时长（秒）
     * @return transactionLockWaitTime
     */
    public String getTransactionLockWaitTime() {
        return transactionLockWaitTime;
    }

    public void setTransactionLockWaitTime(String transactionLockWaitTime) {
        this.transactionLockWaitTime = transactionLockWaitTime;
    }

    public ShowAnalysisSessionResultRespTopStateDuration withTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }

    /**
     * 事务状态
     * @return transactionStatus
     */
    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public ShowAnalysisSessionResultRespTopStateDuration withRowsLockedByTransactions(String rowsLockedByTransactions) {
        this.rowsLockedByTransactions = rowsLockedByTransactions;
        return this;
    }

    /**
     * 事务锁定行数
     * @return rowsLockedByTransactions
     */
    public String getRowsLockedByTransactions() {
        return rowsLockedByTransactions;
    }

    public void setRowsLockedByTransactions(String rowsLockedByTransactions) {
        this.rowsLockedByTransactions = rowsLockedByTransactions;
    }

    public ShowAnalysisSessionResultRespTopStateDuration withTablesLockedByTransactions(
        String tablesLockedByTransactions) {
        this.tablesLockedByTransactions = tablesLockedByTransactions;
        return this;
    }

    /**
     * 事务锁定表数量
     * @return tablesLockedByTransactions
     */
    public String getTablesLockedByTransactions() {
        return tablesLockedByTransactions;
    }

    public void setTablesLockedByTransactions(String tablesLockedByTransactions) {
        this.tablesLockedByTransactions = tablesLockedByTransactions;
    }

    public ShowAnalysisSessionResultRespTopStateDuration withRowsUpdatedByTransactions(
        String rowsUpdatedByTransactions) {
        this.rowsUpdatedByTransactions = rowsUpdatedByTransactions;
        return this;
    }

    /**
     * 事务更新行数
     * @return rowsUpdatedByTransactions
     */
    public String getRowsUpdatedByTransactions() {
        return rowsUpdatedByTransactions;
    }

    public void setRowsUpdatedByTransactions(String rowsUpdatedByTransactions) {
        this.rowsUpdatedByTransactions = rowsUpdatedByTransactions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAnalysisSessionResultRespTopStateDuration that = (ShowAnalysisSessionResultRespTopStateDuration) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.user, that.user)
            && Objects.equals(this.host, that.host) && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.executionStatus, that.executionStatus) && Objects.equals(this.command, that.command)
            && Objects.equals(this.sqlStatement, that.sqlStatement)
            && Objects.equals(this.stateDuration, that.stateDuration)
            && Objects.equals(this.transactionDuration, that.transactionDuration)
            && Objects.equals(this.transactionId, that.transactionId)
            && Objects.equals(this.transactionLockWaitTime, that.transactionLockWaitTime)
            && Objects.equals(this.transactionStatus, that.transactionStatus)
            && Objects.equals(this.rowsLockedByTransactions, that.rowsLockedByTransactions)
            && Objects.equals(this.tablesLockedByTransactions, that.tablesLockedByTransactions)
            && Objects.equals(this.rowsUpdatedByTransactions, that.rowsUpdatedByTransactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId,
            user,
            host,
            databaseName,
            executionStatus,
            command,
            sqlStatement,
            stateDuration,
            transactionDuration,
            transactionId,
            transactionLockWaitTime,
            transactionStatus,
            rowsLockedByTransactions,
            tablesLockedByTransactions,
            rowsUpdatedByTransactions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAnalysisSessionResultRespTopStateDuration {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    executionStatus: ").append(toIndentedString(executionStatus)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    sqlStatement: ").append(toIndentedString(sqlStatement)).append("\n");
        sb.append("    stateDuration: ").append(toIndentedString(stateDuration)).append("\n");
        sb.append("    transactionDuration: ").append(toIndentedString(transactionDuration)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    transactionLockWaitTime: ").append(toIndentedString(transactionLockWaitTime)).append("\n");
        sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
        sb.append("    rowsLockedByTransactions: ").append(toIndentedString(rowsLockedByTransactions)).append("\n");
        sb.append("    tablesLockedByTransactions: ").append(toIndentedString(tablesLockedByTransactions)).append("\n");
        sb.append("    rowsUpdatedByTransactions: ").append(toIndentedString(rowsUpdatedByTransactions)).append("\n");
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
