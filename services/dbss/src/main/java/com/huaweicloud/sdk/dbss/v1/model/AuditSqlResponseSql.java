package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * sql信息
 */
public class AuditSqlResponseSql {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_statement")

    private String sqlStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_name")

    private String clientName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_ip")

    private String dbIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user")

    private String dbUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private String queryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operated_obj_info")

    private List<AuditSqlResponseSqlOperatedObjInfo> operatedObjInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_response")

    private String sqlResponse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_instance")

    private String dbInstance;

    public AuditSqlResponseSql withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AuditSqlResponseSql withSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
        return this;
    }

    /**
     * sql语句
     * @return sqlStatement
     */
    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public AuditSqlResponseSql withClientIp(String clientIp) {
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

    public AuditSqlResponseSql withClientName(String clientName) {
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

    public AuditSqlResponseSql withDbIp(String dbIp) {
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

    public AuditSqlResponseSql withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * 数据库用户名
     * @return dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public AuditSqlResponseSql withQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * 查询类型 LOGIN,CREATE_TABLE,CREATE_TABLESPACE,DROP_TABLE, DROP_TABLESPACE,DELETE,INSERT,INSERT_SELECT,SELECT,SELECT_FOR_UPDATE, UPDATE,CREATE_USER,DROP_USER,GRANT,OPERATE ALL
     * @return queryType
     */
    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public AuditSqlResponseSql withOperatedObjInfo(List<AuditSqlResponseSqlOperatedObjInfo> operatedObjInfo) {
        this.operatedObjInfo = operatedObjInfo;
        return this;
    }

    public AuditSqlResponseSql addOperatedObjInfoItem(AuditSqlResponseSqlOperatedObjInfo operatedObjInfoItem) {
        if (this.operatedObjInfo == null) {
            this.operatedObjInfo = new ArrayList<>();
        }
        this.operatedObjInfo.add(operatedObjInfoItem);
        return this;
    }

    public AuditSqlResponseSql withOperatedObjInfo(
        Consumer<List<AuditSqlResponseSqlOperatedObjInfo>> operatedObjInfoSetter) {
        if (this.operatedObjInfo == null) {
            this.operatedObjInfo = new ArrayList<>();
        }
        operatedObjInfoSetter.accept(this.operatedObjInfo);
        return this;
    }

    /**
     * 操作对象列表
     * @return operatedObjInfo
     */
    public List<AuditSqlResponseSqlOperatedObjInfo> getOperatedObjInfo() {
        return operatedObjInfo;
    }

    public void setOperatedObjInfo(List<AuditSqlResponseSqlOperatedObjInfo> operatedObjInfo) {
        this.operatedObjInfo = operatedObjInfo;
    }

    public AuditSqlResponseSql withRuleName(String ruleName) {
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

    public AuditSqlResponseSql withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险级别 - HIGH - MEDIUM - LOW - NO_RISK
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public AuditSqlResponseSql withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 审计开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public AuditSqlResponseSql withSqlResponse(String sqlResponse) {
        this.sqlResponse = sqlResponse;
        return this;
    }

    /**
     * 响应结果 - SUCCESS - FAILED
     * @return sqlResponse
     */
    public String getSqlResponse() {
        return sqlResponse;
    }

    public void setSqlResponse(String sqlResponse) {
        this.sqlResponse = sqlResponse;
    }

    public AuditSqlResponseSql withDbInstance(String dbInstance) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditSqlResponseSql that = (AuditSqlResponseSql) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.sqlStatement, that.sqlStatement)
            && Objects.equals(this.clientIp, that.clientIp) && Objects.equals(this.clientName, that.clientName)
            && Objects.equals(this.dbIp, that.dbIp) && Objects.equals(this.dbUser, that.dbUser)
            && Objects.equals(this.queryType, that.queryType)
            && Objects.equals(this.operatedObjInfo, that.operatedObjInfo)
            && Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.riskLevel, that.riskLevel)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.sqlResponse, that.sqlResponse)
            && Objects.equals(this.dbInstance, that.dbInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            sqlStatement,
            clientIp,
            clientName,
            dbIp,
            dbUser,
            queryType,
            operatedObjInfo,
            ruleName,
            riskLevel,
            startTime,
            sqlResponse,
            dbInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditSqlResponseSql {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sqlStatement: ").append(toIndentedString(sqlStatement)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
        sb.append("    dbIp: ").append(toIndentedString(dbIp)).append("\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    operatedObjInfo: ").append(toIndentedString(operatedObjInfo)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    sqlResponse: ").append(toIndentedString(sqlResponse)).append("\n");
        sb.append("    dbInstance: ").append(toIndentedString(dbInstance)).append("\n");
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
