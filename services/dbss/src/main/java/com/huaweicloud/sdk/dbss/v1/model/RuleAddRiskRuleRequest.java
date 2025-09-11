package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RuleAddRiskRuleRequest
 */
public class RuleAddRiskRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect_rows")

    private Integer affectRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect_symbol")

    private String affectSymbol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ips")

    private String clientIps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_ids")

    private String dbIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exception_ips")

    private String exceptionIps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_symbol")

    private String executionSymbol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_time")

    private Long executionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_case")

    private Boolean ignoreCase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<SchemaBean> schemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public RuleAddRiskRuleRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 操作类型，多个用英文','分隔
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public RuleAddRiskRuleRequest withAffectRows(Integer affectRows) {
        this.affectRows = affectRows;
        return this;
    }

    /**
     * 影响行数
     * @return affectRows
     */
    public Integer getAffectRows() {
        return affectRows;
    }

    public void setAffectRows(Integer affectRows) {
        this.affectRows = affectRows;
    }

    public RuleAddRiskRuleRequest withAffectSymbol(String affectSymbol) {
        this.affectSymbol = affectSymbol;
        return this;
    }

    /**
     * 影响行数操作符 - GREATER: 大于 - EQUAL: 等于 - LESS: 小于 - GREATER_EQUAL: 大于等于 - LESS_EQUAL: 小于等于 - NO_MATCH: 不等于
     * @return affectSymbol
     */
    public String getAffectSymbol() {
        return affectSymbol;
    }

    public void setAffectSymbol(String affectSymbol) {
        this.affectSymbol = affectSymbol;
    }

    public RuleAddRiskRuleRequest withClientIps(String clientIps) {
        this.clientIps = clientIps;
        return this;
    }

    /**
     * 客户端IP，多个用英文','分隔
     * @return clientIps
     */
    public String getClientIps() {
        return clientIps;
    }

    public void setClientIps(String clientIps) {
        this.clientIps = clientIps;
    }

    public RuleAddRiskRuleRequest withDbIds(String dbIds) {
        this.dbIds = dbIds;
        return this;
    }

    /**
     * 数据库ID，多个用英文','分隔
     * @return dbIds
     */
    public String getDbIds() {
        return dbIds;
    }

    public void setDbIds(String dbIds) {
        this.dbIds = dbIds;
    }

    public RuleAddRiskRuleRequest withExceptionIps(String exceptionIps) {
        this.exceptionIps = exceptionIps;
        return this;
    }

    /**
     * 例外IP，IP内不做匹配，多个用英文','分隔
     * @return exceptionIps
     */
    public String getExceptionIps() {
        return exceptionIps;
    }

    public void setExceptionIps(String exceptionIps) {
        this.exceptionIps = exceptionIps;
    }

    public RuleAddRiskRuleRequest withExecutionSymbol(String executionSymbol) {
        this.executionSymbol = executionSymbol;
        return this;
    }

    /**
     * 执行时长操作符 - GREATER: 大于 - EQUAL: 等于 - LESS: 小于 - GREATER_EQUAL: 大于等于 - LESS_EQUAL: 小于等于 - NO_MATCH: 不等于
     * @return executionSymbol
     */
    public String getExecutionSymbol() {
        return executionSymbol;
    }

    public void setExecutionSymbol(String executionSymbol) {
        this.executionSymbol = executionSymbol;
    }

    public RuleAddRiskRuleRequest withExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    /**
     * 执行时长
     * @return executionTime
     */
    public Long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
    }

    public RuleAddRiskRuleRequest withIgnoreCase(Boolean ignoreCase) {
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

    public RuleAddRiskRuleRequest withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级   - LOW：低  - MEDIUM：中  - HIGH：高  - NO_RISK：无
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public RuleAddRiskRuleRequest withRuleName(String ruleName) {
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

    public RuleAddRiskRuleRequest withSchemas(List<SchemaBean> schemas) {
        this.schemas = schemas;
        return this;
    }

    public RuleAddRiskRuleRequest addSchemasItem(SchemaBean schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public RuleAddRiskRuleRequest withSchemas(Consumer<List<SchemaBean>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * 操作对象
     * @return schemas
     */
    public List<SchemaBean> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<SchemaBean> schemas) {
        this.schemas = schemas;
    }

    public RuleAddRiskRuleRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态  - OFF：已关闭  - ON：已开启
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleAddRiskRuleRequest that = (RuleAddRiskRuleRequest) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.affectRows, that.affectRows)
            && Objects.equals(this.affectSymbol, that.affectSymbol) && Objects.equals(this.clientIps, that.clientIps)
            && Objects.equals(this.dbIds, that.dbIds) && Objects.equals(this.exceptionIps, that.exceptionIps)
            && Objects.equals(this.executionSymbol, that.executionSymbol)
            && Objects.equals(this.executionTime, that.executionTime)
            && Objects.equals(this.ignoreCase, that.ignoreCase) && Objects.equals(this.riskLevel, that.riskLevel)
            && Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.schemas, that.schemas)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            affectRows,
            affectSymbol,
            clientIps,
            dbIds,
            exceptionIps,
            executionSymbol,
            executionTime,
            ignoreCase,
            riskLevel,
            ruleName,
            schemas,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleAddRiskRuleRequest {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    affectRows: ").append(toIndentedString(affectRows)).append("\n");
        sb.append("    affectSymbol: ").append(toIndentedString(affectSymbol)).append("\n");
        sb.append("    clientIps: ").append(toIndentedString(clientIps)).append("\n");
        sb.append("    dbIds: ").append(toIndentedString(dbIds)).append("\n");
        sb.append("    exceptionIps: ").append(toIndentedString(exceptionIps)).append("\n");
        sb.append("    executionSymbol: ").append(toIndentedString(executionSymbol)).append("\n");
        sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
        sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
