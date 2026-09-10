package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateOpsAgentTuningTaskTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_tuning_task_id")

    private String agentTuningTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreateOpsAgentTuningTaskTagsRequestBody body;

    public BatchCreateOpsAgentTuningTaskTagsRequest withAgentTuningTaskId(String agentTuningTaskId) {
        this.agentTuningTaskId = agentTuningTaskId;
        return this;
    }

    /**
     * **参数解释：** 智能体优化任务ID，标识任务的唯一标识符。获取方法请参考查询智能体优化任务列表。  **约束限制：** 不涉及  **取值范围：** 32位ID字符串。  **默认取值：** 无
     * @return agentTuningTaskId
     */
    public String getAgentTuningTaskId() {
        return agentTuningTaskId;
    }

    public void setAgentTuningTaskId(String agentTuningTaskId) {
        this.agentTuningTaskId = agentTuningTaskId;
    }

    public BatchCreateOpsAgentTuningTaskTagsRequest withBody(BatchCreateOpsAgentTuningTaskTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateOpsAgentTuningTaskTagsRequest withBody(
        Consumer<BatchCreateOpsAgentTuningTaskTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateOpsAgentTuningTaskTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchCreateOpsAgentTuningTaskTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateOpsAgentTuningTaskTagsRequestBody body) {
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
        BatchCreateOpsAgentTuningTaskTagsRequest that = (BatchCreateOpsAgentTuningTaskTagsRequest) obj;
        return Objects.equals(this.agentTuningTaskId, that.agentTuningTaskId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentTuningTaskId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateOpsAgentTuningTaskTagsRequest {\n");
        sb.append("    agentTuningTaskId: ").append(toIndentedString(agentTuningTaskId)).append("\n");
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
