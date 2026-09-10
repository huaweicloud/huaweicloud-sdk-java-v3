package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateOpsAnalysisTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysis_task_id")

    private String analysisTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateOpsAnalysisTaskRequestBody body;

    public UpdateOpsAnalysisTaskRequest withAnalysisTaskId(String analysisTaskId) {
        this.analysisTaskId = analysisTaskId;
        return this;
    }

    /**
     * **参数解释：** 分析任务ID，标识任务的唯一标识符。获取方法请参考查询分析任务列表。  **约束限制：** 不涉及  **取值范围：** 32位ID字符串。  **默认取值：** 无
     * @return analysisTaskId
     */
    public String getAnalysisTaskId() {
        return analysisTaskId;
    }

    public void setAnalysisTaskId(String analysisTaskId) {
        this.analysisTaskId = analysisTaskId;
    }

    public UpdateOpsAnalysisTaskRequest withBody(UpdateOpsAnalysisTaskRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateOpsAnalysisTaskRequest withBody(Consumer<UpdateOpsAnalysisTaskRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateOpsAnalysisTaskRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateOpsAnalysisTaskRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateOpsAnalysisTaskRequestBody body) {
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
        UpdateOpsAnalysisTaskRequest that = (UpdateOpsAnalysisTaskRequest) obj;
        return Objects.equals(this.analysisTaskId, that.analysisTaskId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(analysisTaskId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpsAnalysisTaskRequest {\n");
        sb.append("    analysisTaskId: ").append(toIndentedString(analysisTaskId)).append("\n");
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
