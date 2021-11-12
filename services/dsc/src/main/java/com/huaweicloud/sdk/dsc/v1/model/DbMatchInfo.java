package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** DbMatchInfo */
public class DbMatchInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_risk_level")

    private Integer ruleRiskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_line")

    private List<Long> columnLine = null;

    public DbMatchInfo withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /** 列名
     * 
     * @return columnName */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public DbMatchInfo withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /** 匹配的规则名
     * 
     * @return ruleName */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public DbMatchInfo withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /** 匹配的规则ID
     * 
     * @return ruleId */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public DbMatchInfo withRuleRiskLevel(Integer ruleRiskLevel) {
        this.ruleRiskLevel = ruleRiskLevel;
        return this;
    }

    /** 匹配规则风险等级
     * 
     * @return ruleRiskLevel */
    public Integer getRuleRiskLevel() {
        return ruleRiskLevel;
    }

    public void setRuleRiskLevel(Integer ruleRiskLevel) {
        this.ruleRiskLevel = ruleRiskLevel;
    }

    public DbMatchInfo withColumnLine(List<Long> columnLine) {
        this.columnLine = columnLine;
        return this;
    }

    public DbMatchInfo addColumnLineItem(Long columnLineItem) {
        if (this.columnLine == null) {
            this.columnLine = new ArrayList<>();
        }
        this.columnLine.add(columnLineItem);
        return this;
    }

    public DbMatchInfo withColumnLine(Consumer<List<Long>> columnLineSetter) {
        if (this.columnLine == null) {
            this.columnLine = new ArrayList<>();
        }
        columnLineSetter.accept(this.columnLine);
        return this;
    }

    /** 风险数据行
     * 
     * @return columnLine */
    public List<Long> getColumnLine() {
        return columnLine;
    }

    public void setColumnLine(List<Long> columnLine) {
        this.columnLine = columnLine;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DbMatchInfo dbMatchInfo = (DbMatchInfo) o;
        return Objects.equals(this.columnName, dbMatchInfo.columnName)
            && Objects.equals(this.ruleName, dbMatchInfo.ruleName) && Objects.equals(this.ruleId, dbMatchInfo.ruleId)
            && Objects.equals(this.ruleRiskLevel, dbMatchInfo.ruleRiskLevel)
            && Objects.equals(this.columnLine, dbMatchInfo.columnLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, ruleName, ruleId, ruleRiskLevel, columnLine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbMatchInfo {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleRiskLevel: ").append(toIndentedString(ruleRiskLevel)).append("\n");
        sb.append("    columnLine: ").append(toIndentedString(columnLine)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
