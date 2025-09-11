package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RuleAddSqlRequest
 */
public class RuleAddSqlRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_regex")

    private String sqlRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public RuleAddSqlRequest withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级  - LOW：低  - MEDIUM：中  - HIGH：高 - NO_RISK：无
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public RuleAddSqlRequest withRuleName(String ruleName) {
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

    public RuleAddSqlRequest withSqlRegex(String sqlRegex) {
        this.sqlRegex = sqlRegex;
        return this;
    }

    /**
     * 正则表达式
     * @return sqlRegex
     */
    public String getSqlRegex() {
        return sqlRegex;
    }

    public void setSqlRegex(String sqlRegex) {
        this.sqlRegex = sqlRegex;
    }

    public RuleAddSqlRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态  - ON：开启  - OFF：关闭
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
        RuleAddSqlRequest that = (RuleAddSqlRequest) obj;
        return Objects.equals(this.riskLevel, that.riskLevel) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.sqlRegex, that.sqlRegex) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskLevel, ruleName, sqlRegex, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleAddSqlRequest {\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    sqlRegex: ").append(toIndentedString(sqlRegex)).append("\n");
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
