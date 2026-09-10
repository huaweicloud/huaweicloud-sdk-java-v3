package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateOpsEvaluatorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_id")

    private String evaluatorId;

    public CreateOpsEvaluatorResponse withEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
        return this;
    }

    /**
     * **参数解释：** 成功创建后生成的评估器唯一标识符。 **取值范围：** 符合通用唯一识别码(UUID)标准的字符串。 
     * @return evaluatorId
     */
    public String getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOpsEvaluatorResponse that = (CreateOpsEvaluatorResponse) obj;
        return Objects.equals(this.evaluatorId, that.evaluatorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOpsEvaluatorResponse {\n");
        sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
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
