package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 批量删除评估器（Evaluator）的请求体。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class BatchDeleteOpsEvaluatorRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_ids")

    private List<String> evaluatorIds = null;

    public BatchDeleteOpsEvaluatorRequestBody withEvaluatorIds(List<String> evaluatorIds) {
        this.evaluatorIds = evaluatorIds;
        return this;
    }

    public BatchDeleteOpsEvaluatorRequestBody addEvaluatorIdsItem(String evaluatorIdsItem) {
        if (this.evaluatorIds == null) {
            this.evaluatorIds = new ArrayList<>();
        }
        this.evaluatorIds.add(evaluatorIdsItem);
        return this;
    }

    public BatchDeleteOpsEvaluatorRequestBody withEvaluatorIds(Consumer<List<String>> evaluatorIdsSetter) {
        if (this.evaluatorIds == null) {
            this.evaluatorIds = new ArrayList<>();
        }
        evaluatorIdsSetter.accept(this.evaluatorIds);
        return this;
    }

    /**
     * **参数解释：** 待批量删除的评估器唯一标识符列表。 **约束限制：** 数组长度0到10000。 **取值范围：** 每个ID为长度不超过 100 字符的字符串。 **默认取值：** 不涉及。 
     * @return evaluatorIds
     */
    public List<String> getEvaluatorIds() {
        return evaluatorIds;
    }

    public void setEvaluatorIds(List<String> evaluatorIds) {
        this.evaluatorIds = evaluatorIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteOpsEvaluatorRequestBody that = (BatchDeleteOpsEvaluatorRequestBody) obj;
        return Objects.equals(this.evaluatorIds, that.evaluatorIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteOpsEvaluatorRequestBody {\n");
        sb.append("    evaluatorIds: ").append(toIndentedString(evaluatorIds)).append("\n");
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
