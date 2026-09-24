package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DebugOpsEvaluatorRequestBodyGevalConfigRubric
 */
public class DebugOpsEvaluatorRequestBodyGevalConfigRubric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference_outcome")

    private String referenceOutcome;

    public DebugOpsEvaluatorRequestBodyGevalConfigRubric withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * **参数解释：** 该档位对应的评估得分。 **约束限制：** 必须为0~1之间的数值，且不能与其他档位的score重复。 **取值范围：** 0~1（闭区间）。 **默认取值：** 不涉及。 
     * minimum: 0
     * maximum: 1
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public DebugOpsEvaluatorRequestBodyGevalConfigRubric withReferenceOutcome(String referenceOutcome) {
        this.referenceOutcome = referenceOutcome;
        return this;
    }

    /**
     * **参数解释：** 该分数档位对应的参考输出描述，作为大模型评分的锚点文本。 **约束限制：** 必填；去除首尾空格后长度需在1~200字符之间，不能为空或纯空白。 **取值范围：** 1~200字符。 **默认取值：** 不涉及。 
     * @return referenceOutcome
     */
    public String getReferenceOutcome() {
        return referenceOutcome;
    }

    public void setReferenceOutcome(String referenceOutcome) {
        this.referenceOutcome = referenceOutcome;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DebugOpsEvaluatorRequestBodyGevalConfigRubric that = (DebugOpsEvaluatorRequestBodyGevalConfigRubric) obj;
        return Objects.equals(this.score, that.score) && Objects.equals(this.referenceOutcome, that.referenceOutcome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, referenceOutcome);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugOpsEvaluatorRequestBodyGevalConfigRubric {\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    referenceOutcome: ").append(toIndentedString(referenceOutcome)).append("\n");
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
