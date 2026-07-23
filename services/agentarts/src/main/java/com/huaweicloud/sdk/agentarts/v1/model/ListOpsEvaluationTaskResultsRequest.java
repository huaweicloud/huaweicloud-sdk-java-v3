package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListOpsEvaluationTaskResultsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListOpsEvaluationTaskResultsRequestBody body;

    public ListOpsEvaluationTaskResultsRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 需要查询结果的评估任务唯一标识符（ID）。 **约束限制：** 字符串长度为0-100。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListOpsEvaluationTaskResultsRequest withBody(ListOpsEvaluationTaskResultsRequestBody body) {
        this.body = body;
        return this;
    }

    public ListOpsEvaluationTaskResultsRequest withBody(Consumer<ListOpsEvaluationTaskResultsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListOpsEvaluationTaskResultsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ListOpsEvaluationTaskResultsRequestBody getBody() {
        return body;
    }

    public void setBody(ListOpsEvaluationTaskResultsRequestBody body) {
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
        ListOpsEvaluationTaskResultsRequest that = (ListOpsEvaluationTaskResultsRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluationTaskResultsRequest {\n");
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
