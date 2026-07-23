package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchAddOpsEvaluationTaskCustomLabelValuesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchAddOpsEvaluationTaskCustomLabelValuesRequestBody body;

    public BatchAddOpsEvaluationTaskCustomLabelValuesRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 评估任务的唯一标识符（ID）。该ID用于在API路径中精确定位需要操作的目标评估任务。 **约束限制：** 长度为0到100个字符的字符串。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public BatchAddOpsEvaluationTaskCustomLabelValuesRequest withBody(
        BatchAddOpsEvaluationTaskCustomLabelValuesRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchAddOpsEvaluationTaskCustomLabelValuesRequest withBody(
        Consumer<BatchAddOpsEvaluationTaskCustomLabelValuesRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchAddOpsEvaluationTaskCustomLabelValuesRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchAddOpsEvaluationTaskCustomLabelValuesRequestBody getBody() {
        return body;
    }

    public void setBody(BatchAddOpsEvaluationTaskCustomLabelValuesRequestBody body) {
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
        BatchAddOpsEvaluationTaskCustomLabelValuesRequest that =
            (BatchAddOpsEvaluationTaskCustomLabelValuesRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddOpsEvaluationTaskCustomLabelValuesRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
