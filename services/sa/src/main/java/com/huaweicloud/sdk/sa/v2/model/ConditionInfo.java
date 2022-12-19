package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Condition info of rule
 */
public class ConditionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression_type")

    private String expressionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<ConditionItem> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logics")

    private Object logics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cron")

    private String cron;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_type")

    private String scheduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repeat_range")

    private String repeatRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repeat_count")

    private String repeatCount;

    public ConditionInfo withExpressionType(String expressionType) {
        this.expressionType = expressionType;
        return this;
    }

    /**
     * expression type, all, any, user_define
     * @return expressionType
     */
    public String getExpressionType() {
        return expressionType;
    }

    public void setExpressionType(String expressionType) {
        this.expressionType = expressionType;
    }

    public ConditionInfo withConditions(List<ConditionItem> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ConditionInfo addConditionsItem(ConditionItem conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public ConditionInfo withConditions(Consumer<List<ConditionItem>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * Information of conditions.
     * @return conditions
     */
    public List<ConditionItem> getConditions() {
        return conditions;
    }

    public void setConditions(List<ConditionItem> conditions) {
        this.conditions = conditions;
    }

    public ConditionInfo withLogics(Object logics) {
        this.logics = logics;
        return this;
    }

    /**
     * Logic item of condition.
     * @return logics
     */
    public Object getLogics() {
        return logics;
    }

    public void setLogics(Object logics) {
        this.logics = logics;
    }

    public ConditionInfo withCron(String cron) {
        this.cron = cron;
        return this;
    }

    /**
     * Cron 表达式
     * @return cron
     */
    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public ConditionInfo withScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }

    /**
     * schedule type, second hours...
     * @return scheduleType
     */
    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public ConditionInfo withRepeatRange(String repeatRange) {
        this.repeatRange = repeatRange;
        return this;
    }

    /**
     * 执行时间段 2021-01-30T23:00:00Z+0800
     * @return repeatRange
     */
    public String getRepeatRange() {
        return repeatRange;
    }

    public void setRepeatRange(String repeatRange) {
        this.repeatRange = repeatRange;
    }

    public ConditionInfo withRepeatCount(String repeatCount) {
        this.repeatCount = repeatCount;
        return this;
    }

    /**
     * 重复次数
     * @return repeatCount
     */
    public String getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(String repeatCount) {
        this.repeatCount = repeatCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConditionInfo conditionInfo = (ConditionInfo) o;
        return Objects.equals(this.expressionType, conditionInfo.expressionType)
            && Objects.equals(this.conditions, conditionInfo.conditions)
            && Objects.equals(this.logics, conditionInfo.logics) && Objects.equals(this.cron, conditionInfo.cron)
            && Objects.equals(this.scheduleType, conditionInfo.scheduleType)
            && Objects.equals(this.repeatRange, conditionInfo.repeatRange)
            && Objects.equals(this.repeatCount, conditionInfo.repeatCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expressionType, conditions, logics, cron, scheduleType, repeatRange, repeatCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionInfo {\n");
        sb.append("    expressionType: ").append(toIndentedString(expressionType)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    logics: ").append(toIndentedString(logics)).append("\n");
        sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
        sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
        sb.append("    repeatRange: ").append(toIndentedString(repeatRange)).append("\n");
        sb.append("    repeatCount: ").append(toIndentedString(repeatCount)).append("\n");
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
