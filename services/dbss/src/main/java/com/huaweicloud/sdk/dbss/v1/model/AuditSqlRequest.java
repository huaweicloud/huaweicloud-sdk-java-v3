package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AuditSqlRequest
 */
public class AuditSqlRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private AuditSqlRequestTime time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_levels")

    private String riskLevels;

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
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_statement")

    private String sqlStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_response")

    private String sqlResponse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_order")

    private String timeOrder;

    public AuditSqlRequest withTime(AuditSqlRequestTime time) {
        this.time = time;
        return this;
    }

    public AuditSqlRequest withTime(Consumer<AuditSqlRequestTime> timeSetter) {
        if (this.time == null) {
            this.time = new AuditSqlRequestTime();
            timeSetter.accept(this.time);
        }

        return this;
    }

    /**
     * Get time
     * @return time
     */
    public AuditSqlRequestTime getTime() {
        return time;
    }

    public void setTime(AuditSqlRequestTime time) {
        this.time = time;
    }

    public AuditSqlRequest withRiskLevels(String riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }

    /**
     * 风险级别 - HIGH：高 - MEDIUM：中 - LOW：低 - NO_RISK：无
     * @return riskLevels
     */
    public String getRiskLevels() {
        return riskLevels;
    }

    public void setRiskLevels(String riskLevels) {
        this.riskLevels = riskLevels;
    }

    public AuditSqlRequest withClientIp(String clientIp) {
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

    public AuditSqlRequest withClientName(String clientName) {
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

    public AuditSqlRequest withDbIp(String dbIp) {
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

    public AuditSqlRequest withDbUser(String dbUser) {
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

    public AuditSqlRequest withQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * 查询类型 - LOGIN：LOGIN - CREATE_TABLE：CREATE TABLE - CREATE_TABLESPACE：CREATE TABLESPACE - DROP_TABLE：DROP TABLE - DROP_TABLESPACE：DROP TABLESPACE - DELETE：DELETE - INSERT：INSERT - INSERT_SELECT：INSERT SELECT - SELECT：SELECT - SELECT_FOR_UPDATE：SELECT FOR UPDATE - UPDATE：UPDATE - CREATE_USER：CREATE USER - DROP_USER：DROP USER - GRANT：GRANT - OPERATE：OPERATE - ALL: ALL
     * @return queryType
     */
    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public AuditSqlRequest withRuleName(String ruleName) {
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

    public AuditSqlRequest withSqlStatement(String sqlStatement) {
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

    public AuditSqlRequest withSqlResponse(String sqlResponse) {
        this.sqlResponse = sqlResponse;
        return this;
    }

    /**
     * 响应结果 - SUCCESS：成功 - FAILED：失败
     * @return sqlResponse
     */
    public String getSqlResponse() {
        return sqlResponse;
    }

    public void setSqlResponse(String sqlResponse) {
        this.sqlResponse = sqlResponse;
    }

    public AuditSqlRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 页码
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public AuditSqlRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 条数
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public AuditSqlRequest withTimeOrder(String timeOrder) {
        this.timeOrder = timeOrder;
        return this;
    }

    /**
     * 时间顺序 - DESC：降序 - ASC：升序
     * @return timeOrder
     */
    public String getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(String timeOrder) {
        this.timeOrder = timeOrder;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditSqlRequest that = (AuditSqlRequest) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.riskLevels, that.riskLevels)
            && Objects.equals(this.clientIp, that.clientIp) && Objects.equals(this.clientName, that.clientName)
            && Objects.equals(this.dbIp, that.dbIp) && Objects.equals(this.dbUser, that.dbUser)
            && Objects.equals(this.queryType, that.queryType) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.sqlStatement, that.sqlStatement)
            && Objects.equals(this.sqlResponse, that.sqlResponse) && Objects.equals(this.page, that.page)
            && Objects.equals(this.size, that.size) && Objects.equals(this.timeOrder, that.timeOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time,
            riskLevels,
            clientIp,
            clientName,
            dbIp,
            dbUser,
            queryType,
            ruleName,
            sqlStatement,
            sqlResponse,
            page,
            size,
            timeOrder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditSqlRequest {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    riskLevels: ").append(toIndentedString(riskLevels)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
        sb.append("    dbIp: ").append(toIndentedString(dbIp)).append("\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    sqlStatement: ").append(toIndentedString(sqlStatement)).append("\n");
        sb.append("    sqlResponse: ").append(toIndentedString(sqlResponse)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    timeOrder: ").append(toIndentedString(timeOrder)).append("\n");
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
