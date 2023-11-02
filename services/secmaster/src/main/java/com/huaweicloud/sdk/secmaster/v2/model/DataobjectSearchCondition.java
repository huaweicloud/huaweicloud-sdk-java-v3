package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 搜索条件表达式
 */
public class DataobjectSearchCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<DataobjectSearchConditionConditions> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logics")

    private List<DataobjectSearchConditionLogics> logics = null;

    public DataobjectSearchCondition withConditions(List<DataobjectSearchConditionConditions> conditions) {
        this.conditions = conditions;
        return this;
    }

    public DataobjectSearchCondition addConditionsItem(DataobjectSearchConditionConditions conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public DataobjectSearchCondition withConditions(
        Consumer<List<DataobjectSearchConditionConditions>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 表达式列表
     * @return conditions
     */
    public List<DataobjectSearchConditionConditions> getConditions() {
        return conditions;
    }

    public void setConditions(List<DataobjectSearchConditionConditions> conditions) {
        this.conditions = conditions;
    }

    public DataobjectSearchCondition withLogics(List<DataobjectSearchConditionLogics> logics) {
        this.logics = logics;
        return this;
    }

    public DataobjectSearchCondition addLogicsItem(DataobjectSearchConditionLogics logicsItem) {
        if (this.logics == null) {
            this.logics = new ArrayList<>();
        }
        this.logics.add(logicsItem);
        return this;
    }

    public DataobjectSearchCondition withLogics(Consumer<List<DataobjectSearchConditionLogics>> logicsSetter) {
        if (this.logics == null) {
            this.logics = new ArrayList<>();
        }
        logicsSetter.accept(this.logics);
        return this;
    }

    /**
     * 表达式逻辑
     * @return logics
     */
    public List<DataobjectSearchConditionLogics> getLogics() {
        return logics;
    }

    public void setLogics(List<DataobjectSearchConditionLogics> logics) {
        this.logics = logics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataobjectSearchCondition that = (DataobjectSearchCondition) obj;
        return Objects.equals(this.conditions, that.conditions) && Objects.equals(this.logics, that.logics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditions, logics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataobjectSearchCondition {\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    logics: ").append(toIndentedString(logics)).append("\n");
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
