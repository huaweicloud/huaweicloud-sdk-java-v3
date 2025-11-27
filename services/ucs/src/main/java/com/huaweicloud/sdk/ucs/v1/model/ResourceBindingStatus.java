package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceBindingStatus
 */
public class ResourceBindingStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedulerObservedGeneration")

    private Integer schedulerObservedGeneration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<ConditionStatus> conditions = null;

    public ResourceBindingStatus withSchedulerObservedGeneration(Integer schedulerObservedGeneration) {
        this.schedulerObservedGeneration = schedulerObservedGeneration;
        return this;
    }

    /**
     * 记录调度器当前观察到的资源生成版本代数
     * @return schedulerObservedGeneration
     */
    public Integer getSchedulerObservedGeneration() {
        return schedulerObservedGeneration;
    }

    public void setSchedulerObservedGeneration(Integer schedulerObservedGeneration) {
        this.schedulerObservedGeneration = schedulerObservedGeneration;
    }

    public ResourceBindingStatus withConditions(List<ConditionStatus> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ResourceBindingStatus addConditionsItem(ConditionStatus conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public ResourceBindingStatus withConditions(Consumer<List<ConditionStatus>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 资源的各种状态条件
     * @return conditions
     */
    public List<ConditionStatus> getConditions() {
        return conditions;
    }

    public void setConditions(List<ConditionStatus> conditions) {
        this.conditions = conditions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceBindingStatus that = (ResourceBindingStatus) obj;
        return Objects.equals(this.schedulerObservedGeneration, that.schedulerObservedGeneration)
            && Objects.equals(this.conditions, that.conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedulerObservedGeneration, conditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceBindingStatus {\n");
        sb.append("    schedulerObservedGeneration: ")
            .append(toIndentedString(schedulerObservedGeneration))
            .append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
