package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 评估操作的过滤选项包装对象。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class EvaluationOpsFilterOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filters")

    private EvaluationOpsFilters filters;

    public EvaluationOpsFilterOption withFilters(EvaluationOpsFilters filters) {
        this.filters = filters;
        return this;
    }

    public EvaluationOpsFilterOption withFilters(Consumer<EvaluationOpsFilters> filtersSetter) {
        if (this.filters == null) {
            this.filters = new EvaluationOpsFilters();
            filtersSetter.accept(this.filters);
        }

        return this;
    }

    /**
     * Get filters
     * @return filters
     */
    public EvaluationOpsFilters getFilters() {
        return filters;
    }

    public void setFilters(EvaluationOpsFilters filters) {
        this.filters = filters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvaluationOpsFilterOption that = (EvaluationOpsFilterOption) obj;
        return Objects.equals(this.filters, that.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsFilterOption {\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
