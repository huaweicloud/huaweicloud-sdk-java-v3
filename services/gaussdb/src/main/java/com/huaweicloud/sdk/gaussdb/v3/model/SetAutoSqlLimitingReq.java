package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：  开启自治限流规则请求体。  **约束限制**：  不涉及。
 */
public class SetAutoSqlLimitingReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_sql_limiting_rules")

    private List<AutoSqlLimitingRule> autoSqlLimitingRules = null;

    public SetAutoSqlLimitingReq withAutoSqlLimitingRules(List<AutoSqlLimitingRule> autoSqlLimitingRules) {
        this.autoSqlLimitingRules = autoSqlLimitingRules;
        return this;
    }

    public SetAutoSqlLimitingReq addAutoSqlLimitingRulesItem(AutoSqlLimitingRule autoSqlLimitingRulesItem) {
        if (this.autoSqlLimitingRules == null) {
            this.autoSqlLimitingRules = new ArrayList<>();
        }
        this.autoSqlLimitingRules.add(autoSqlLimitingRulesItem);
        return this;
    }

    public SetAutoSqlLimitingReq withAutoSqlLimitingRules(
        Consumer<List<AutoSqlLimitingRule>> autoSqlLimitingRulesSetter) {
        if (this.autoSqlLimitingRules == null) {
            this.autoSqlLimitingRules = new ArrayList<>();
        }
        autoSqlLimitingRulesSetter.accept(this.autoSqlLimitingRules);
        return this;
    }

    /**
     * **参数解释**：  开启自治限流规则。  **约束限制**：  不涉及。
     * @return autoSqlLimitingRules
     */
    public List<AutoSqlLimitingRule> getAutoSqlLimitingRules() {
        return autoSqlLimitingRules;
    }

    public void setAutoSqlLimitingRules(List<AutoSqlLimitingRule> autoSqlLimitingRules) {
        this.autoSqlLimitingRules = autoSqlLimitingRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetAutoSqlLimitingReq that = (SetAutoSqlLimitingReq) obj;
        return Objects.equals(this.autoSqlLimitingRules, that.autoSqlLimitingRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoSqlLimitingRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAutoSqlLimitingReq {\n");
        sb.append("    autoSqlLimitingRules: ").append(toIndentedString(autoSqlLimitingRules)).append("\n");
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
