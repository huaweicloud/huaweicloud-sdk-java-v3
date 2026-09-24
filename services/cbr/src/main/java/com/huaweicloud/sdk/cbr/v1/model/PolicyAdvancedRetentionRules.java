package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 按照时间的高级保留策略
 */
public class PolicyAdvancedRetentionRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weekly_retention_rules")

    private PolicyWeeklyRetentionRules weeklyRetentionRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monthly_retention_rules")

    private PolicyMonthlyRetentionRules monthlyRetentionRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "yearly_retention_rules")

    private PolicyYearlyRetentionRules yearlyRetentionRules;

    public PolicyAdvancedRetentionRules withWeeklyRetentionRules(PolicyWeeklyRetentionRules weeklyRetentionRules) {
        this.weeklyRetentionRules = weeklyRetentionRules;
        return this;
    }

    public PolicyAdvancedRetentionRules withWeeklyRetentionRules(
        Consumer<PolicyWeeklyRetentionRules> weeklyRetentionRulesSetter) {
        if (this.weeklyRetentionRules == null) {
            this.weeklyRetentionRules = new PolicyWeeklyRetentionRules();
            weeklyRetentionRulesSetter.accept(this.weeklyRetentionRules);
        }

        return this;
    }

    /**
     * Get weeklyRetentionRules
     * @return weeklyRetentionRules
     */
    public PolicyWeeklyRetentionRules getWeeklyRetentionRules() {
        return weeklyRetentionRules;
    }

    public void setWeeklyRetentionRules(PolicyWeeklyRetentionRules weeklyRetentionRules) {
        this.weeklyRetentionRules = weeklyRetentionRules;
    }

    public PolicyAdvancedRetentionRules withMonthlyRetentionRules(PolicyMonthlyRetentionRules monthlyRetentionRules) {
        this.monthlyRetentionRules = monthlyRetentionRules;
        return this;
    }

    public PolicyAdvancedRetentionRules withMonthlyRetentionRules(
        Consumer<PolicyMonthlyRetentionRules> monthlyRetentionRulesSetter) {
        if (this.monthlyRetentionRules == null) {
            this.monthlyRetentionRules = new PolicyMonthlyRetentionRules();
            monthlyRetentionRulesSetter.accept(this.monthlyRetentionRules);
        }

        return this;
    }

    /**
     * Get monthlyRetentionRules
     * @return monthlyRetentionRules
     */
    public PolicyMonthlyRetentionRules getMonthlyRetentionRules() {
        return monthlyRetentionRules;
    }

    public void setMonthlyRetentionRules(PolicyMonthlyRetentionRules monthlyRetentionRules) {
        this.monthlyRetentionRules = monthlyRetentionRules;
    }

    public PolicyAdvancedRetentionRules withYearlyRetentionRules(PolicyYearlyRetentionRules yearlyRetentionRules) {
        this.yearlyRetentionRules = yearlyRetentionRules;
        return this;
    }

    public PolicyAdvancedRetentionRules withYearlyRetentionRules(
        Consumer<PolicyYearlyRetentionRules> yearlyRetentionRulesSetter) {
        if (this.yearlyRetentionRules == null) {
            this.yearlyRetentionRules = new PolicyYearlyRetentionRules();
            yearlyRetentionRulesSetter.accept(this.yearlyRetentionRules);
        }

        return this;
    }

    /**
     * Get yearlyRetentionRules
     * @return yearlyRetentionRules
     */
    public PolicyYearlyRetentionRules getYearlyRetentionRules() {
        return yearlyRetentionRules;
    }

    public void setYearlyRetentionRules(PolicyYearlyRetentionRules yearlyRetentionRules) {
        this.yearlyRetentionRules = yearlyRetentionRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyAdvancedRetentionRules that = (PolicyAdvancedRetentionRules) obj;
        return Objects.equals(this.weeklyRetentionRules, that.weeklyRetentionRules)
            && Objects.equals(this.monthlyRetentionRules, that.monthlyRetentionRules)
            && Objects.equals(this.yearlyRetentionRules, that.yearlyRetentionRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weeklyRetentionRules, monthlyRetentionRules, yearlyRetentionRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyAdvancedRetentionRules {\n");
        sb.append("    weeklyRetentionRules: ").append(toIndentedString(weeklyRetentionRules)).append("\n");
        sb.append("    monthlyRetentionRules: ").append(toIndentedString(monthlyRetentionRules)).append("\n");
        sb.append("    yearlyRetentionRules: ").append(toIndentedString(yearlyRetentionRules)).append("\n");
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
