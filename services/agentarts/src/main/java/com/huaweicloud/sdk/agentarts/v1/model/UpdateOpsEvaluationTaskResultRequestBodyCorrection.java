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
        return Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpsEvaluationTaskResultRequestBodyCorrection {\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
