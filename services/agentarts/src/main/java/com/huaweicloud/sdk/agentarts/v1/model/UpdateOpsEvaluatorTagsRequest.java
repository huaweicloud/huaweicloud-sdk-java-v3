package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateOpsEvaluatorTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_id")

    private String evaluatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateOpsResourceTagsRequestBody body;

    public UpdateOpsEvaluatorTagsRequest withEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
        return this;
    }

    /**
     * **参数解释：** 评估器的唯一标识符（ID）。用于在路径中精确定位需要进行标签更新操作的评估器实例。 **约束限制：** 长度为1到100个字符的字符串。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return evaluatorId
     */
    public String getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public UpdateOpsEvaluatorTagsRequest withBody(UpdateOpsResourceTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateOpsEvaluatorTagsRequest withBody(Consumer<UpdateOpsResourceTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateOpsResourceTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateOpsResourceTagsRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateOpsResourceTagsRequestBody body) {
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
        UpdateOpsEvaluatorTagsRequest that = (UpdateOpsEvaluatorTagsRequest) obj;
        return Objects.equals(this.evaluatorId, that.evaluatorId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpsEvaluatorTagsRequest {\n");
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
