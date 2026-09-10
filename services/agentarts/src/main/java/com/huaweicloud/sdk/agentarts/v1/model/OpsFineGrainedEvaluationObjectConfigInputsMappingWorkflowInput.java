package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 工作流输入参数来源配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class OpsFineGrainedEvaluationObjectConfigInputsMappingWorkflowInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    public OpsFineGrainedEvaluationObjectConfigInputsMappingWorkflowInput withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * **参数解释：** 工作流执行时的参数来源。 **约束限制：** 字符长度1到100。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsFineGrainedEvaluationObjectConfigInputsMappingWorkflowInput that =
            (OpsFineGrainedEvaluationObjectConfigInputsMappingWorkflowInput) obj;
        return Objects.equals(this.query, that.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(query);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsFineGrainedEvaluationObjectConfigInputsMappingWorkflowInput {\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
