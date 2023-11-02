package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 剧本触发规则详情
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

    private List<String> logics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cron")

    private String cron;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_type")

    private String scheduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_type")

    private String startType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_type")

    private String endType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repeat_range")

    private String repeatRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_once")

    private Boolean onlyOnce;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_type")

    private String executionType;

    public ConditionInfo withExpressionType(String expressionType) {
        this.expressionType = expressionType;
        return this;
    }

    /**
     * 表达式类型。默认为common,事件触发剧本必填
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
     * 触发条件。事件触发剧本必填
     * @return conditions
     */
    public List<ConditionItem> getConditions() {
        return conditions;
    }

    public void setConditions(List<ConditionItem> conditions) {
        this.conditions = conditions;
    }

    public ConditionInfo withLogics(List<String> logics) {
        this.logics = logics;
        return this;
    }

    public ConditionInfo addLogicsItem(String logicsItem) {
        if (this.logics == null) {
            this.logics = new ArrayList<>();
        }
        this.logics.add(logicsItem);
        return this;
    }

    public ConditionInfo withLogics(Consumer<List<String>> logicsSetter) {
        if (this.logics == null) {
            this.logics = new ArrayList<>();
        }
        logicsSetter.accept(this.logics);
        return this;
    }

    /**
     * 条件逻辑组合。事件触发剧本必填
     * @return logics
     */
    public List<String> getLogics() {
        return logics;
    }

    public void setLogics(List<String> logics) {
        this.logics = logics;
    }

    public ConditionInfo withCron(String cron) {
        this.cron = cron;
        return this;
    }

    /**
     * Cron 表达式（定时任务）。定时触发剧本必填
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
     * 定时重复类型(second--秒, hour--小时,day--天，week-周)。定时触发剧本必填
     * @return scheduleType
     */
    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public ConditionInfo withStartType(String startType) {
        this.startType = startType;
        return this;
    }

    /**
     * 剧本开始执行类型，IMMEDIATELY--创建完成立即执行, CUSTOM--自定义执行时间。定时触发剧本必填
     * @return startType
     */
    public String getStartType() {
        return startType;
    }

    public void setStartType(String startType) {
        this.startType = startType;
    }

    public ConditionInfo withEndType(String endType) {
        this.endType = endType;
        return this;
    }

    /**
     * 剧本结束执行类型，FOREVER--一直执行, CUSTOM--自定义结束时间。定时触发剧本必填
     * @return endType
     */
    public String getEndType() {
        return endType;
    }

    public void setEndType(String endType) {
        this.endType = endType;
    }

    public ConditionInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 定时结束时间。定时触发剧本必填
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ConditionInfo withRepeatRange(String repeatRange) {
        this.repeatRange = repeatRange;
        return this;
    }

    /**
     * 执行时间段 2021-01-30T23:00:00Z+0800。定时触发剧本必填
     * @return repeatRange
     */
    public String getRepeatRange() {
        return repeatRange;
    }

    public void setRepeatRange(String repeatRange) {
        this.repeatRange = repeatRange;
    }

    public ConditionInfo withOnlyOnce(Boolean onlyOnce) {
        this.onlyOnce = onlyOnce;
        return this;
    }

    /**
     * 是否只执行一次。定时触发剧本必填
     * @return onlyOnce
     */
    public Boolean getOnlyOnce() {
        return onlyOnce;
    }

    public void setOnlyOnce(Boolean onlyOnce) {
        this.onlyOnce = onlyOnce;
    }

    public ConditionInfo withExecutionType(String executionType) {
        this.executionType = executionType;
        return this;
    }

    /**
     * 执行队列类型（PARALLEL-新任务与之前任务并行）。定时触发剧本必填
     * @return executionType
     */
    public String getExecutionType() {
        return executionType;
    }

    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConditionInfo that = (ConditionInfo) obj;
        return Objects.equals(this.expressionType, that.expressionType)
            && Objects.equals(this.conditions, that.conditions) && Objects.equals(this.logics, that.logics)
            && Objects.equals(this.cron, that.cron) && Objects.equals(this.scheduleType, that.scheduleType)
            && Objects.equals(this.startType, that.startType) && Objects.equals(this.endType, that.endType)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.repeatRange, that.repeatRange)
            && Objects.equals(this.onlyOnce, that.onlyOnce) && Objects.equals(this.executionType, that.executionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expressionType,
            conditions,
            logics,
            cron,
            scheduleType,
            startType,
            endType,
            endTime,
            repeatRange,
            onlyOnce,
            executionType);
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
        sb.append("    startType: ").append(toIndentedString(startType)).append("\n");
        sb.append("    endType: ").append(toIndentedString(endType)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    repeatRange: ").append(toIndentedString(repeatRange)).append("\n");
        sb.append("    onlyOnce: ").append(toIndentedString(onlyOnce)).append("\n");
        sb.append("    executionType: ").append(toIndentedString(executionType)).append("\n");
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
