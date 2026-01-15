package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SQL语句对象
 */
public class SqlDetailBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_result")

    private String auditResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_port")

    private Integer clientPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_mac")

    private String clientMac;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_name")

    private String clientName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_os_name")

    private String clientOsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_os_user")

    private String clientOsUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_port_str")

    private String clientPortStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_tool")

    private String clientTool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_port")

    private Integer dbPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_instance")

    private String dbInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_ip")

    private String dbIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_mac")

    private String dbMac;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_port_str")

    private String dbPortStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_service_name")

    private String dbServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_session_id")

    private String dbSessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_type")

    private String dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user")

    private String dbUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time")

    private Long executeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field")

    private String field;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lines")

    private String lines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_result")

    private String logResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object")

    private String _object;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    private String queryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private String queryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_length")

    private Integer responseLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_status")

    private String responseStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_id")

    private String scopeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_name")

    private String scopeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_response")

    private String sqlResponse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_result")

    private String sqlResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_statement")

    private String sqlStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tcp_session_id")

    private String tcpSessionId;

    public SqlDetailBean withAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }

    /**
     * 审计结果
     * @return auditResult
     */
    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult;
    }

    public SqlDetailBean withClientPort(Integer clientPort) {
        this.clientPort = clientPort;
        return this;
    }

    /**
     * 客户端端口
     * @return clientPort
     */
    public Integer getClientPort() {
        return clientPort;
    }

    public void setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
    }

    public SqlDetailBean withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * 客户端IP
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public SqlDetailBean withClientMac(String clientMac) {
        this.clientMac = clientMac;
        return this;
    }

    /**
     * 客户端MAC地址
     * @return clientMac
     */
    public String getClientMac() {
        return clientMac;
    }

    public void setClientMac(String clientMac) {
        this.clientMac = clientMac;
    }

    public SqlDetailBean withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * 客户端名称
     * @return clientName
     */
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public SqlDetailBean withClientOsName(String clientOsName) {
        this.clientOsName = clientOsName;
        return this;
    }

    /**
     * 客户端系统主机名称
     * @return clientOsName
     */
    public String getClientOsName() {
        return clientOsName;
    }

    public void setClientOsName(String clientOsName) {
        this.clientOsName = clientOsName;
    }

    public SqlDetailBean withClientOsUser(String clientOsUser) {
        this.clientOsUser = clientOsUser;
        return this;
    }

    /**
     * 客户端操作系统用户名
     * @return clientOsUser
     */
    public String getClientOsUser() {
        return clientOsUser;
    }

    public void setClientOsUser(String clientOsUser) {
        this.clientOsUser = clientOsUser;
    }

    public SqlDetailBean withClientPortStr(String clientPortStr) {
        this.clientPortStr = clientPortStr;
        return this;
    }

    /**
     * 客户端端口字符
     * @return clientPortStr
     */
    public String getClientPortStr() {
        return clientPortStr;
    }

    public void setClientPortStr(String clientPortStr) {
        this.clientPortStr = clientPortStr;
    }

    public SqlDetailBean withClientTool(String clientTool) {
        this.clientTool = clientTool;
        return this;
    }

    /**
     * 客户端连接工具
     * @return clientTool
     */
    public String getClientTool() {
        return clientTool;
    }

    public void setClientTool(String clientTool) {
        this.clientTool = clientTool;
    }

    public SqlDetailBean withDbPort(Integer dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * 数据库端口
     * @return dbPort
     */
    public Integer getDbPort() {
        return dbPort;
    }

    public void setDbPort(Integer dbPort) {
        this.dbPort = dbPort;
    }

    public SqlDetailBean withDbInstance(String dbInstance) {
        this.dbInstance = dbInstance;
        return this;
    }

    /**
     * 数据库实例
     * @return dbInstance
     */
    public String getDbInstance() {
        return dbInstance;
    }

    public void setDbInstance(String dbInstance) {
        this.dbInstance = dbInstance;
    }

    public SqlDetailBean withDbIp(String dbIp) {
        this.dbIp = dbIp;
        return this;
    }

    /**
     * 数据库IP
     * @return dbIp
     */
    public String getDbIp() {
        return dbIp;
    }

    public void setDbIp(String dbIp) {
        this.dbIp = dbIp;
    }

    public SqlDetailBean withDbMac(String dbMac) {
        this.dbMac = dbMac;
        return this;
    }

    /**
     * 数据库MAC地址
     * @return dbMac
     */
    public String getDbMac() {
        return dbMac;
    }

    public void setDbMac(String dbMac) {
        this.dbMac = dbMac;
    }

    public SqlDetailBean withDbPortStr(String dbPortStr) {
        this.dbPortStr = dbPortStr;
        return this;
    }

    /**
     * 数据库端口字符
     * @return dbPortStr
     */
    public String getDbPortStr() {
        return dbPortStr;
    }

    public void setDbPortStr(String dbPortStr) {
        this.dbPortStr = dbPortStr;
    }

    public SqlDetailBean withDbServiceName(String dbServiceName) {
        this.dbServiceName = dbServiceName;
        return this;
    }

    /**
     * 数据库服务名称
     * @return dbServiceName
     */
    public String getDbServiceName() {
        return dbServiceName;
    }

    public void setDbServiceName(String dbServiceName) {
        this.dbServiceName = dbServiceName;
    }

    public SqlDetailBean withDbSessionId(String dbSessionId) {
        this.dbSessionId = dbSessionId;
        return this;
    }

    /**
     * 数据库连接ID
     * @return dbSessionId
     */
    public String getDbSessionId() {
        return dbSessionId;
    }

    public void setDbSessionId(String dbSessionId) {
        this.dbSessionId = dbSessionId;
    }

    public SqlDetailBean withDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * 数据库类型 - MYSQL：MySQL - ORACLE：Oracle - POSTGRESQL：PostgreSQL - SQLSERVER：SQL Server - DAMENG：DAMENG - TAURUS：Taurus DB - DWS：GaussDB(DWS) - KINGBASE：Kingbase - GAUSSDBOPENGAUSS：GaussDB/openGauss - GREENPLUM：Greenplum - HIGHGO：HIGHGO - SHENTONG：ShenTong - GBASE8A：GBase 8a - GBASE8S：GBase 8s - GBASEXDM：GBase XDM - MONGODB：MongoDB - DDS：DDS(MongoDB)
     * @return dbType
     */
    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public SqlDetailBean withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * 数据库用户
     * @return dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public SqlDetailBean withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 请求结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SqlDetailBean withExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    /**
     * 执行时长
     * @return executeTime
     */
    public Long getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
    }

    public SqlDetailBean withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * 操作对象类型信息
     * @return field
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public SqlDetailBean withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 记录ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SqlDetailBean withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 风险等级   - LOW：低  - MEDIUM：中  - HIGH：高  - NO_RISK：无
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public SqlDetailBean withLines(String lines) {
        this.lines = lines;
        return this;
    }

    /**
     * 影响行数
     * @return lines
     */
    public String getLines() {
        return lines;
    }

    public void setLines(String lines) {
        this.lines = lines;
    }

    public SqlDetailBean withLogResult(String logResult) {
        this.logResult = logResult;
        return this;
    }

    /**
     * 登入登出结果
     * @return logResult
     */
    public String getLogResult() {
        return logResult;
    }

    public void setLogResult(String logResult) {
        this.logResult = logResult;
    }

    public SqlDetailBean withObject(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * 操作对象
     * @return _object
     */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    public SqlDetailBean withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 操作对象类型
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public SqlDetailBean withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * 查询ID
     * @return queryId
     */
    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public SqlDetailBean withQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * 操作类型
     * @return queryType
     */
    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public SqlDetailBean withResponseLength(Integer responseLength) {
        this.responseLength = responseLength;
        return this;
    }

    /**
     * 数据长度
     * @return responseLength
     */
    public Integer getResponseLength() {
        return responseLength;
    }

    public void setResponseLength(Integer responseLength) {
        this.responseLength = responseLength;
    }

    public SqlDetailBean withResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
        return this;
    }

    /**
     * 响应状态
     * @return responseStatus
     */
    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public SqlDetailBean withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则ID
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public SqlDetailBean withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public SqlDetailBean withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * 规则类型
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public SqlDetailBean withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * 数据库SCHEMA
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public SqlDetailBean withScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }

    /**
     * 审计范围ID
     * @return scopeId
     */
    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    public SqlDetailBean withScopeName(String scopeName) {
        this.scopeName = scopeName;
        return this;
    }

    /**
     * 审计范围名称
     * @return scopeName
     */
    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    public SqlDetailBean withSqlResponse(String sqlResponse) {
        this.sqlResponse = sqlResponse;
        return this;
    }

    /**
     * SQL返回结果
     * @return sqlResponse
     */
    public String getSqlResponse() {
        return sqlResponse;
    }

    public void setSqlResponse(String sqlResponse) {
        this.sqlResponse = sqlResponse;
    }

    public SqlDetailBean withSqlResult(String sqlResult) {
        this.sqlResult = sqlResult;
        return this;
    }

    /**
     * SQL处理结果
     * @return sqlResult
     */
    public String getSqlResult() {
        return sqlResult;
    }

    public void setSqlResult(String sqlResult) {
        this.sqlResult = sqlResult;
    }

    public SqlDetailBean withSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
        return this;
    }

    /**
     * SQL语句内容
     * @return sqlStatement
     */
    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public SqlDetailBean withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 请求开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SqlDetailBean withTcpSessionId(String tcpSessionId) {
        this.tcpSessionId = tcpSessionId;
        return this;
    }

    /**
     * TCP连接ID
     * @return tcpSessionId
     */
    public String getTcpSessionId() {
        return tcpSessionId;
    }

    public void setTcpSessionId(String tcpSessionId) {
        this.tcpSessionId = tcpSessionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlDetailBean that = (SqlDetailBean) obj;
        return Objects.equals(this.auditResult, that.auditResult) && Objects.equals(this.clientPort, that.clientPort)
            && Objects.equals(this.clientIp, that.clientIp) && Objects.equals(this.clientMac, that.clientMac)
            && Objects.equals(this.clientName, that.clientName) && Objects.equals(this.clientOsName, that.clientOsName)
            && Objects.equals(this.clientOsUser, that.clientOsUser)
            && Objects.equals(this.clientPortStr, that.clientPortStr)
            && Objects.equals(this.clientTool, that.clientTool) && Objects.equals(this.dbPort, that.dbPort)
            && Objects.equals(this.dbInstance, that.dbInstance) && Objects.equals(this.dbIp, that.dbIp)
            && Objects.equals(this.dbMac, that.dbMac) && Objects.equals(this.dbPortStr, that.dbPortStr)
            && Objects.equals(this.dbServiceName, that.dbServiceName)
            && Objects.equals(this.dbSessionId, that.dbSessionId) && Objects.equals(this.dbType, that.dbType)
            && Objects.equals(this.dbUser, that.dbUser) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.executeTime, that.executeTime) && Objects.equals(this.field, that.field)
            && Objects.equals(this.id, that.id) && Objects.equals(this.level, that.level)
            && Objects.equals(this.lines, that.lines) && Objects.equals(this.logResult, that.logResult)
            && Objects.equals(this._object, that._object) && Objects.equals(this.objectType, that.objectType)
            && Objects.equals(this.queryId, that.queryId) && Objects.equals(this.queryType, that.queryType)
            && Objects.equals(this.responseLength, that.responseLength)
            && Objects.equals(this.responseStatus, that.responseStatus) && Objects.equals(this.ruleId, that.ruleId)
            && Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.ruleType, that.ruleType)
            && Objects.equals(this.schema, that.schema) && Objects.equals(this.scopeId, that.scopeId)
            && Objects.equals(this.scopeName, that.scopeName) && Objects.equals(this.sqlResponse, that.sqlResponse)
            && Objects.equals(this.sqlResult, that.sqlResult) && Objects.equals(this.sqlStatement, that.sqlStatement)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.tcpSessionId, that.tcpSessionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditResult,
            clientPort,
            clientIp,
            clientMac,
            clientName,
            clientOsName,
            clientOsUser,
            clientPortStr,
            clientTool,
            dbPort,
            dbInstance,
            dbIp,
            dbMac,
            dbPortStr,
            dbServiceName,
            dbSessionId,
            dbType,
            dbUser,
            endTime,
            executeTime,
            field,
            id,
            level,
            lines,
            logResult,
            _object,
            objectType,
            queryId,
            queryType,
            responseLength,
            responseStatus,
            ruleId,
            ruleName,
            ruleType,
            schema,
            scopeId,
            scopeName,
            sqlResponse,
            sqlResult,
            sqlStatement,
            startTime,
            tcpSessionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlDetailBean {\n");
        sb.append("    auditResult: ").append(toIndentedString(auditResult)).append("\n");
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    clientMac: ").append(toIndentedString(clientMac)).append("\n");
        sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
        sb.append("    clientOsName: ").append(toIndentedString(clientOsName)).append("\n");
        sb.append("    clientOsUser: ").append(toIndentedString(clientOsUser)).append("\n");
        sb.append("    clientPortStr: ").append(toIndentedString(clientPortStr)).append("\n");
        sb.append("    clientTool: ").append(toIndentedString(clientTool)).append("\n");
        sb.append("    dbPort: ").append(toIndentedString(dbPort)).append("\n");
        sb.append("    dbInstance: ").append(toIndentedString(dbInstance)).append("\n");
        sb.append("    dbIp: ").append(toIndentedString(dbIp)).append("\n");
        sb.append("    dbMac: ").append(toIndentedString(dbMac)).append("\n");
        sb.append("    dbPortStr: ").append(toIndentedString(dbPortStr)).append("\n");
        sb.append("    dbServiceName: ").append(toIndentedString(dbServiceName)).append("\n");
        sb.append("    dbSessionId: ").append(toIndentedString(dbSessionId)).append("\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
        sb.append("    logResult: ").append(toIndentedString(logResult)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    responseLength: ").append(toIndentedString(responseLength)).append("\n");
        sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    scopeId: ").append(toIndentedString(scopeId)).append("\n");
        sb.append("    scopeName: ").append(toIndentedString(scopeName)).append("\n");
        sb.append("    sqlResponse: ").append(toIndentedString(sqlResponse)).append("\n");
        sb.append("    sqlResult: ").append(toIndentedString(sqlResult)).append("\n");
        sb.append("    sqlStatement: ").append(toIndentedString(sqlStatement)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    tcpSessionId: ").append(toIndentedString(tcpSessionId)).append("\n");
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
