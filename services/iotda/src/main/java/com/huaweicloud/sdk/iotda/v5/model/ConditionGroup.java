package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 规则条件组 */
public class ConditionGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<RuleCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic")

    private String logic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private TimeRange timeRange;

    public ConditionGroup withConditions(List<RuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ConditionGroup addConditionsItem(RuleCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public ConditionGroup withConditions(Consumer<List<RuleCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /** **参数说明**：规则的条件列表，单个规则最多支持设置10个条件。
     * 
     * @return conditions */
    public List<RuleCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<RuleCondition> conditions) {
        this.conditions = conditions;
    }

    public ConditionGroup withLogic(String logic) {
        this.logic = logic;
        return this;
    }

    /** **参数说明**：规则条件列表中多个条件之间的逻辑关系，默认值：and。 **取值范围**： - and：逻辑且。 - or：逻辑或。
     * 
     * @return logic */
    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }

    public ConditionGroup withTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public ConditionGroup withTimeRange(Consumer<TimeRange> timeRangeSetter) {
        if (this.timeRange == null) {
            this.timeRange = new TimeRange();
            timeRangeSetter.accept(this.timeRange);
        }

        return this;
    }

    /** Get timeRange
     * 
     * @return timeRange */
    public TimeRange getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConditionGroup conditionGroup = (ConditionGroup) o;
        return Objects.equals(this.conditions, conditionGroup.conditions)
            && Objects.equals(this.logic, conditionGroup.logic)
            && Objects.equals(this.timeRange, conditionGroup.timeRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditions, logic, timeRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionGroup {\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
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
