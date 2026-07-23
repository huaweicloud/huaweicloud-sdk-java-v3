package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 评估操作的过滤条件对象。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class EvaluationOpsFilters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_op")

    private String logicOp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_conditions")

    private List<Object> filterConditions = null;

    public EvaluationOpsFilters withLogicOp(String logicOp) {
        this.logicOp = logicOp;
        return this;
    }

    /**
     * **参数解释：** 过滤条件的逻辑运算符。And表示全显，Or表示任一。 **约束限制：** 0到10000字符。 **取值范围：** And, Or。 **默认取值：** 不涉及。
     * @return logicOp
     */
    public String getLogicOp() {
        return logicOp;
    }

    public void setLogicOp(String logicOp) {
        this.logicOp = logicOp;
    }

    public EvaluationOpsFilters withFilterConditions(List<Object> filterConditions) {
        this.filterConditions = filterConditions;
        return this;
    }

    public EvaluationOpsFilters addFilterConditionsItem(Object filterConditionsItem) {
        if (this.filterConditions == null) {
            this.filterConditions = new ArrayList<>();
        }
        this.filterConditions.add(filterConditionsItem);
        return this;
    }

    public EvaluationOpsFilters withFilterConditions(Consumer<List<Object>> filterConditionsSetter) {
        if (this.filterConditions == null) {
            this.filterConditions = new ArrayList<>();
        }
        filterConditionsSetter.accept(this.filterConditions);
        return this;
    }

    /**
     * **参数解释：** 具体的过滤条件列表。每个元素为一个JSON格式的字符串。 **约束限制：** 数组长度为0到10000。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return filterConditions
     */
    public List<Object> getFilterConditions() {
        return filterConditions;
    }

    public void setFilterConditions(List<Object> filterConditions) {
        this.filterConditions = filterConditions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvaluationOpsFilters that = (EvaluationOpsFilters) obj;
        return Objects.equals(this.logicOp, that.logicOp)
            && Objects.equals(this.filterConditions, that.filterConditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicOp, filterConditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsFilters {\n");
        sb.append("    logicOp: ").append(toIndentedString(logicOp)).append("\n");
        sb.append("    filterConditions: ").append(toIndentedString(filterConditions)).append("\n");
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
