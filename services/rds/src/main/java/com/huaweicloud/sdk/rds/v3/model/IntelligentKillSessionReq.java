package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 一键自动kill会话请求体
 */
public class IntelligentKillSessionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_add_sql_limit_rule")

    private Boolean autoAddSqlLimitRule;

    public IntelligentKillSessionReq withAutoAddSqlLimitRule(Boolean autoAddSqlLimitRule) {
        this.autoAddSqlLimitRule = autoAddSqlLimitRule;
        return this;
    }

    /**
     * 是否自动SQL限流
     * @return autoAddSqlLimitRule
     */
    public Boolean getAutoAddSqlLimitRule() {
        return autoAddSqlLimitRule;
    }

    public void setAutoAddSqlLimitRule(Boolean autoAddSqlLimitRule) {
        this.autoAddSqlLimitRule = autoAddSqlLimitRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntelligentKillSessionReq that = (IntelligentKillSessionReq) obj;
        return Objects.equals(this.autoAddSqlLimitRule, that.autoAddSqlLimitRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoAddSqlLimitRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntelligentKillSessionReq {\n");
        sb.append("    autoAddSqlLimitRule: ").append(toIndentedString(autoAddSqlLimitRule)).append("\n");
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
