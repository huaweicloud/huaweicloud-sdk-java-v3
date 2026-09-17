package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateOpsEvaluatorTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_id")

    private String evaluatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private OpsResourceTagsBatchOptionRequestBody body;

    public BatchCreateOpsEvaluatorTagsRequest withEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
        return this;
    }

    /**
     * **参数解释：** 评估器的唯一标识符（ID）。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 **获取方式：** 通过查询接口获取。
     * @return evaluatorId
     */
    public String getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public BatchCreateOpsEvaluatorTagsRequest withBody(OpsResourceTagsBatchOptionRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateOpsEvaluatorTagsRequest withBody(Consumer<OpsResourceTagsBatchOptionRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new OpsResourceTagsBatchOptionRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public OpsResourceTagsBatchOptionRequestBody getBody() {
        return body;
    }

    public void setBody(OpsResourceTagsBatchOptionRequestBody body) {
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
        BatchCreateOpsEvaluatorTagsRequest that = (BatchCreateOpsEvaluatorTagsRequest) obj;
        return Objects.equals(this.evaluatorId, that.evaluatorId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateOpsEvaluatorTagsRequest {\n");
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
