package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateOpsModelTuningTaskTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreateOpsModelTuningTaskTagsRequestBody body;

    public BatchCreateOpsModelTuningTaskTagsRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 模型优化任务ID，标识任务的唯一标识符。获取方法请参考查询模型优化任务列表。  **约束限制：** 不涉及  **取值范围：** 32位ID字符串。  **默认取值：** 无
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public BatchCreateOpsModelTuningTaskTagsRequest withBody(BatchCreateOpsModelTuningTaskTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateOpsModelTuningTaskTagsRequest withBody(
        Consumer<BatchCreateOpsModelTuningTaskTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateOpsModelTuningTaskTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchCreateOpsModelTuningTaskTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateOpsModelTuningTaskTagsRequestBody body) {
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
        BatchCreateOpsModelTuningTaskTagsRequest that = (BatchCreateOpsModelTuningTaskTagsRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateOpsModelTuningTaskTagsRequest {\n");
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
