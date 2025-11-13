package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdatePublicRecordsetsFilter
 */
public class BatchUpdatePublicRecordsetsFilter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation")

    private String relation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<BatchUpdatePublicRecordsetsConditionvalue> conditions = null;

    public BatchUpdatePublicRecordsetsFilter withRelation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * **参数解释：** 过滤条件之间的关系。 **约束限制：** 不涉及。 **取值范围：** - OR：或 - AND：与  **默认取值：** 不涉及。
     * @return relation
     */
    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public BatchUpdatePublicRecordsetsFilter withConditions(
        List<BatchUpdatePublicRecordsetsConditionvalue> conditions) {
        this.conditions = conditions;
        return this;
    }

    public BatchUpdatePublicRecordsetsFilter addConditionsItem(
        BatchUpdatePublicRecordsetsConditionvalue conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public BatchUpdatePublicRecordsetsFilter withConditions(
        Consumer<List<BatchUpdatePublicRecordsetsConditionvalue>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * **参数解释：** 条件列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return conditions
     */
    public List<BatchUpdatePublicRecordsetsConditionvalue> getConditions() {
        return conditions;
    }

    public void setConditions(List<BatchUpdatePublicRecordsetsConditionvalue> conditions) {
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
        BatchUpdatePublicRecordsetsFilter that = (BatchUpdatePublicRecordsetsFilter) obj;
        return Objects.equals(this.relation, that.relation) && Objects.equals(this.conditions, that.conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relation, conditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdatePublicRecordsetsFilter {\n");
        sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
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
