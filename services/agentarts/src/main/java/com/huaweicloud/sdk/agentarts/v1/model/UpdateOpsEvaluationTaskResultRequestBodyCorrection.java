package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 包含校正详情的对象，包括校正原因和最终得分。 **约束限制：** reason和score均必填。 
 */
public class UpdateOpsEvaluationTaskResultRequestBodyCorrection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private String score;

    public UpdateOpsEvaluationTaskResultRequestBodyCorrection withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释：** 校正评估结果的具体原因说明。 **约束限制：** 长度为1到 2000个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public UpdateOpsEvaluationTaskResultRequestBodyCorrection withScore(String score) {
        this.score = score;
        return this;
    }

    /**
     * **参数解释：** 校正后的新评估分数。 **约束限制：** 固定长度为3个字符。 **取值范围：** 0到1之间的数字字符串，保留1位小数（如 \"1.0\", \"0.5\"）。 **默认取值：** 不涉及。 
     * @return score
     */
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateOpsEvaluationTaskResultRequestBodyCorrection that =
            (UpdateOpsEvaluationTaskResultRequestBodyCorrection) obj;
        return Objects.equals(this.reason, that.reason) && Objects.equals(this.score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpsEvaluationTaskResultRequestBodyCorrection {\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
