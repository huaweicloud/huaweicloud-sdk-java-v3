package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchUpdateOpsEvaluationTaskCustomLabelValuesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchUpdateOpsEvaluationTaskCustomLabelValuesRequestBody body;

    public BatchUpdateOpsEvaluationTaskCustomLabelValuesRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 评估任务的唯一标识符（ID）。该参数嵌入在API路径中，用于定位需要批量更新标签值的具体任务。 **约束限制：** 长度为1到1000个字符的字符串。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public BatchUpdateOpsEvaluationTaskCustomLabelValuesRequest withBody(
        BatchUpdateOpsEvaluationTaskCustomLabelValuesRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchUpdateOpsEvaluationTaskCustomLabelValuesRequest withBody(
        Consumer<BatchUpdateOpsEvaluationTaskCustomLabelValuesRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchUpdateOpsEvaluationTaskCustomLabelValuesRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchUpdateOpsEvaluationTaskCustomLabelValuesRequestBody getBody() {
        return body;
    }

    public void setBody(BatchUpdateOpsEvaluationTaskCustomLabelValuesRequestBody body) {
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
        BatchUpdateOpsEvaluationTaskCustomLabelValuesRequest that =
            (BatchUpdateOpsEvaluationTaskCustomLabelValuesRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateOpsEvaluationTaskCustomLabelValuesRequest {\n");
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
