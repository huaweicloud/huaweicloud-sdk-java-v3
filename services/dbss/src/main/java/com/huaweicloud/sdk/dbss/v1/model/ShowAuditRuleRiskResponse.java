package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAuditRuleRiskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<RuleRiskInfoBeanSchemas> schemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank")

    private Integer rank;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_case")

    private Boolean ignoreCase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_ids")

    private String dbIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_symbol")

    private String executionSymbol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_time")

    private Integer executionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect_symbol")

    private String affectSymbol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect_rows")

    private Integer affectRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ips")

    private String clientIps;

    public ShowAuditRuleRiskResponse withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 风险规则ID
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public ShowAuditRuleRiskResponse withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 风险名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ShowAuditRuleRiskResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 风险规则状态 - OFF - ON
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowAuditRuleRiskResponse withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 操作集合, 中间逗号分隔。 LOGIN,CREATE_TABLE,CREATE_TABLESPACE,DROP_TABLE, DROP_TABLESPACE,DELETE,INSERT,INSERT_SELECT,SELECT,SELECT_FOR_UPDATE, UPDATE,CREATE_USER,DROP_USER,GRANT,OPERATE ALL
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ShowAuditRuleRiskResponse withSchemas(List<RuleRiskInfoBeanSchemas> schemas) {
        this.schemas = schemas;
        return this;
    }

    public ShowAuditRuleRiskResponse addSchemasItem(RuleRiskInfoBeanSchemas schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public ShowAuditRuleRiskResponse withSchemas(Consumer<List<RuleRiskInfoBeanSchemas>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * Schema列表
     * @return schemas
     */
    public List<RuleRiskInfoBeanSchemas> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<RuleRiskInfoBeanSchemas> schemas) {
        this.schemas = schemas;
    }

    public ShowAuditRuleRiskResponse withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * 风险规则优先级。数字越小优先级越高。
     * @return rank
     */
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public ShowAuditRuleRiskResponse withIgnoreCase(Boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
        return this;
    }

    /**
     * 是否忽略大小写
     * @return ignoreCase
     */
    public Boolean getIgnoreCase() {
        return ignoreCase;
    }

    public void setIgnoreCase(Boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
    }

    public ShowAuditRuleRiskResponse withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险级别 - LOW - MEDIUM - HIGH - NO_RISK
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public ShowAuditRuleRiskResponse withDbIds(String dbIds) {
        this.dbIds = dbIds;
        return this;
    }

    /**
     * 数据库id，中间逗号分隔（单个id 小于256位）
     * @return dbIds
     */
    public String getDbIds() {
        return dbIds;
    }

    public void setDbIds(String dbIds) {
        this.dbIds = dbIds;
    }

    public ShowAuditRuleRiskResponse withExecutionSymbol(String executionSymbol) {
        this.executionSymbol = executionSymbol;
        return this;
    }

    /**
     * 执行时长对执行时长阈值的关系 - GREATER - EQUAL - LESS - GREATER_EQUAL - LESS_EQUAL - NO_MATCH
     * @return executionSymbol
     */
    public String getExecutionSymbol() {
        return executionSymbol;
    }

    public void setExecutionSymbol(String executionSymbol) {
        this.executionSymbol = executionSymbol;
    }

    public ShowAuditRuleRiskResponse withExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    /**
     * 设定的执行时长阈值
     * @return executionTime
     */
    public Integer getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    public ShowAuditRuleRiskResponse withAffectSymbol(String affectSymbol) {
        this.affectSymbol = affectSymbol;
        return this;
    }

    /**
     * 影响行数对行数阈值的关系：  - GREATER - EQUAL - LESS - GREATER_EQUAL - LESS_EQUAL - NO_MATCH
     * @return affectSymbol
     */
    public String getAffectSymbol() {
        return affectSymbol;
    }

    public void setAffectSymbol(String affectSymbol) {
        this.affectSymbol = affectSymbol;
    }

    public ShowAuditRuleRiskResponse withAffectRows(Integer affectRows) {
        this.affectRows = affectRows;
        return this;
    }

    /**
     * 设定的影响行数阈值
     * @return affectRows
     */
    public Integer getAffectRows() {
        return affectRows;
    }

    public void setAffectRows(Integer affectRows) {
        this.affectRows = affectRows;
    }

    public ShowAuditRuleRiskResponse withClientIps(String clientIps) {
        this.clientIps = clientIps;
        return this;
    }

    /**
     * 客户端IP段: IP-IP格式，或IP/XX 格式。 各个IP段使用逗号连接
     * @return clientIps
     */
    public String getClientIps() {
        return clientIps;
    }

    public void setClientIps(String clientIps) {
        this.clientIps = clientIps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAuditRuleRiskResponse that = (ShowAuditRuleRiskResponse) obj;
        return Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.action, that.action)
            && Objects.equals(this.schemas, that.schemas) && Objects.equals(this.rank, that.rank)
            && Objects.equals(this.ignoreCase, that.ignoreCase) && Objects.equals(this.riskLevel, that.riskLevel)
            && Objects.equals(this.dbIds, that.dbIds) && Objects.equals(this.executionSymbol, that.executionSymbol)
            && Objects.equals(this.executionTime, that.executionTime)
            && Objects.equals(this.affectSymbol, that.affectSymbol) && Objects.equals(this.affectRows, that.affectRows)
            && Objects.equals(this.clientIps, that.clientIps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId,
            ruleName,
            status,
            action,
            schemas,
            rank,
            ignoreCase,
            riskLevel,
            dbIds,
            executionSymbol,
            executionTime,
            affectSymbol,
            affectRows,
            clientIps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuditRuleRiskResponse {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
        sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    dbIds: ").append(toIndentedString(dbIds)).append("\n");
        sb.append("    executionSymbol: ").append(toIndentedString(executionSymbol)).append("\n");
        sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
        sb.append("    affectSymbol: ").append(toIndentedString(affectSymbol)).append("\n");
        sb.append("    affectRows: ").append(toIndentedString(affectRows)).append("\n");
        sb.append("    clientIps: ").append(toIndentedString(clientIps)).append("\n");
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
