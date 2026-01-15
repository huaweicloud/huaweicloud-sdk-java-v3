package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RuleRiskStatisticsDto
 */
public class RuleRiskStatisticsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_risk_count")

    private List<AuditInstanceRiskCount> instanceRiskCount = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    public RuleRiskStatisticsDto withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public RuleRiskStatisticsDto withInstanceRiskCount(List<AuditInstanceRiskCount> instanceRiskCount) {
        this.instanceRiskCount = instanceRiskCount;
        return this;
    }

    public RuleRiskStatisticsDto addInstanceRiskCountItem(AuditInstanceRiskCount instanceRiskCountItem) {
        if (this.instanceRiskCount == null) {
            this.instanceRiskCount = new ArrayList<>();
        }
        this.instanceRiskCount.add(instanceRiskCountItem);
        return this;
    }

    public RuleRiskStatisticsDto withInstanceRiskCount(Consumer<List<AuditInstanceRiskCount>> instanceRiskCountSetter) {
        if (this.instanceRiskCount == null) {
            this.instanceRiskCount = new ArrayList<>();
        }
        instanceRiskCountSetter.accept(this.instanceRiskCount);
        return this;
    }

    /**
     * 实例数据库风险汇总
     * @return instanceRiskCount
     */
    public List<AuditInstanceRiskCount> getInstanceRiskCount() {
        return instanceRiskCount;
    }

    public void setInstanceRiskCount(List<AuditInstanceRiskCount> instanceRiskCount) {
        this.instanceRiskCount = instanceRiskCount;
    }

    public RuleRiskStatisticsDto withRuleName(String ruleName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleRiskStatisticsDto that = (RuleRiskStatisticsDto) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.instanceRiskCount, that.instanceRiskCount)
            && Objects.equals(this.ruleName, that.ruleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, instanceRiskCount, ruleName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleRiskStatisticsDto {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    instanceRiskCount: ").append(toIndentedString(instanceRiskCount)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
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
