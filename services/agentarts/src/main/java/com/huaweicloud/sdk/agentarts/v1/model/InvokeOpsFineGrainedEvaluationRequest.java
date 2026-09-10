package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class InvokeOpsFineGrainedEvaluationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_id")

    private String evaluatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private InvokeOpsFineGrainedEvaluationRequestBody body;

    public InvokeOpsFineGrainedEvaluationRequest withEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
        return this;
    }

    /**
     * **参数解释：** 评估器的唯一标识符，用于指定本次评估使用的评估器。 **约束限制：** 字符串类型，长度1到36字符，评估器必须已存在。 **取值范围：** 符合通用唯一识别码(UUID)标准的字符串。 **默认取值：** 不涉及。
     * @return evaluatorId
     */
    public String getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public InvokeOpsFineGrainedEvaluationRequest withBody(InvokeOpsFineGrainedEvaluationRequestBody body) {
        this.body = body;
        return this;
    }

    public InvokeOpsFineGrainedEvaluationRequest withBody(
        Consumer<InvokeOpsFineGrainedEvaluationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new InvokeOpsFineGrainedEvaluationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public InvokeOpsFineGrainedEvaluationRequestBody getBody() {
        return body;
    }

    public void setBody(InvokeOpsFineGrainedEvaluationRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InvokeOpsFineGrainedEvaluationRequest that = (InvokeOpsFineGrainedEvaluationRequest) obj;
        return Objects.equals(this.evaluatorId, that.evaluatorId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvokeOpsFineGrainedEvaluationRequest {\n");
        sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
