package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询条件构建对象。
 */
public class QueryCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<QueryCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditionName")

    private String conditionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditionValues")

    private List<String> conditionValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditionValue")

    private String conditionValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignoreStr")

    private Boolean ignoreStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "joinTableAlias")

    private String joinTableAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "joiner")

    private String joiner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preCondition")

    private QueryCondition preCondition;

    public QueryCondition withConditions(List<QueryCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public QueryCondition addConditionsItem(QueryCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public QueryCondition withConditions(Consumer<List<QueryCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * **参数解释：**  用于定义一组嵌套查询条件，其逻辑关系由同级的joiner属性决定。每个子条件可包含基础条件或嵌套条件，形成多层级查询逻辑。  - 基础条件结构：由conditionName（属性英文名称）、operator（操作符）、conditionValues（条件值）组成单一查询条件。 - 嵌套条件结构：包含子级joiner和conditions数组，支持多层级逻辑嵌套。  **约束限制：**  当一个对象同时符合基础条件和嵌套条件时，系统将优先考虑嵌套条件，并忽略基础条件。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return conditions
     */
    public List<QueryCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<QueryCondition> conditions) {
        this.conditions = conditions;
    }

    public QueryCondition withConditionName(String conditionName) {
        this.conditionName = conditionName;
        return this;
    }

    /**
     * **参数解释：**  表示查询条件的名称（对应数据模型中属性的英文名称）。  **约束限制：**  该参数仅在conditions数组中生效，在filter中不生效。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return conditionName
     */
    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public QueryCondition withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * **参数解释：**  操作符。  **约束限制：**  - 仅在conditions数组中生效，在filter中不生效。 - “多值”为“是”的属性支持使用contains、=、like、customLike、startWith、endWith、ISNULL。 - “多值”为“否”的属性不支持使用contains。   **取值范围：**  - =：等于查询。 - <：小于查询。 - \\>：大于查询。 - \\>=：大于等于查询。 - <=：小于等于查询。 - <>：不等于查询。 - startWith：头匹配查询。 - endWith：尾匹配查询。 - like：模糊查询。 - customLike：支持输入*或%的模糊查询。 - in：包含查询。 - not in：排除查询。 - ISNULL：值为空查询。 - NOTNULL：值不为空查询。 - contains：包含查询。  **默认取值：**  不涉及。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public QueryCondition withConditionValues(List<String> conditionValues) {
        this.conditionValues = conditionValues;
        return this;
    }

    public QueryCondition addConditionValuesItem(String conditionValuesItem) {
        if (this.conditionValues == null) {
            this.conditionValues = new ArrayList<>();
        }
        this.conditionValues.add(conditionValuesItem);
        return this;
    }

    public QueryCondition withConditionValues(Consumer<List<String>> conditionValuesSetter) {
        if (this.conditionValues == null) {
            this.conditionValues = new ArrayList<>();
        }
        conditionValuesSetter.accept(this.conditionValues);
        return this;
    }

    /**
     * **参数解释：**  查询条件的值。  **约束限制：**  仅在conditions数组中生效，在filter中不生效。  **取值范围：**  - 非多值约束属性：operator为in时有多个值，operator为其他操作符时均为单个值。 - 多值约束属性：operator为contains或=时，取值为多个值。operator为其他操作符时均为单个值。  **默认取值：**  不涉及。
     * @return conditionValues
     */
    public List<String> getConditionValues() {
        return conditionValues;
    }

    public void setConditionValues(List<String> conditionValues) {
        this.conditionValues = conditionValues;
    }

    public QueryCondition withConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
        return this;
    }

    /**
     * **参数解释：**  查询条件值（已过时）。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return conditionValue
     */
    public String getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
    }

    public QueryCondition withIgnoreStr(Boolean ignoreStr) {
        this.ignoreStr = ignoreStr;
        return this;
    }

    /**
     * **参数解释：**  是否忽略大小写。  **约束限制：**  仅在conditions数组中生效，在filter中不生效。  **取值范围：**  - true：表示忽略。 - false：表示不忽略。  **默认取值：**  false。
     * @return ignoreStr
     */
    public Boolean getIgnoreStr() {
        return ignoreStr;
    }

    public void setIgnoreStr(Boolean ignoreStr) {
        this.ignoreStr = ignoreStr;
    }

    public QueryCondition withJoinTableAlias(String joinTableAlias) {
        this.joinTableAlias = joinTableAlias;
        return this;
    }

    /**
     * **参数解释：**  关联查询时被关联表的别名。  **约束限制：**  仅在conditions数组中生效，在filter中不生效。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return joinTableAlias
     */
    public String getJoinTableAlias() {
        return joinTableAlias;
    }

    public void setJoinTableAlias(String joinTableAlias) {
        this.joinTableAlias = joinTableAlias;
    }

    public QueryCondition withJoiner(String joiner) {
        this.joiner = joiner;
        return this;
    }

    /**
     * **参数解释：**  连接符，连接conditions中的条件对象。  **约束限制：**  不涉及。  **取值范围：**  - and：与连接。 - or：或连接。  **默认取值：**  不涉及。
     * @return joiner
     */
    public String getJoiner() {
        return joiner;
    }

    public void setJoiner(String joiner) {
        this.joiner = joiner;
    }

    public QueryCondition withPreCondition(QueryCondition preCondition) {
        this.preCondition = preCondition;
        return this;
    }

    public QueryCondition withPreCondition(Consumer<QueryCondition> preConditionSetter) {
        if (this.preCondition == null) {
            this.preCondition = new QueryCondition();
            preConditionSetter.accept(this.preCondition);
        }

        return this;
    }

    /**
     * Get preCondition
     * @return preCondition
     */
    public QueryCondition getPreCondition() {
        return preCondition;
    }

    public void setPreCondition(QueryCondition preCondition) {
        this.preCondition = preCondition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryCondition that = (QueryCondition) obj;
        return Objects.equals(this.conditions, that.conditions)
            && Objects.equals(this.conditionName, that.conditionName) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.conditionValues, that.conditionValues)
            && Objects.equals(this.conditionValue, that.conditionValue)
            && Objects.equals(this.ignoreStr, that.ignoreStr)
            && Objects.equals(this.joinTableAlias, that.joinTableAlias) && Objects.equals(this.joiner, that.joiner)
            && Objects.equals(this.preCondition, that.preCondition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditions,
            conditionName,
            operator,
            conditionValues,
            conditionValue,
            ignoreStr,
            joinTableAlias,
            joiner,
            preCondition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCondition {\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    conditionName: ").append(toIndentedString(conditionName)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    conditionValues: ").append(toIndentedString(conditionValues)).append("\n");
        sb.append("    conditionValue: ").append(toIndentedString(conditionValue)).append("\n");
        sb.append("    ignoreStr: ").append(toIndentedString(ignoreStr)).append("\n");
        sb.append("    joinTableAlias: ").append(toIndentedString(joinTableAlias)).append("\n");
        sb.append("    joiner: ").append(toIndentedString(joiner)).append("\n");
        sb.append("    preCondition: ").append(toIndentedString(preCondition)).append("\n");
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
