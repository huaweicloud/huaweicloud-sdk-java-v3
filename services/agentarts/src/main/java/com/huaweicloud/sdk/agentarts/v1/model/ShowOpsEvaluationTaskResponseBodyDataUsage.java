package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Token 用量统计。
 */
public class ShowOpsEvaluationTaskResponseBodyDataUsage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt_tokens")

    private Long promptTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completion_tokens")

    private Long completionTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_tokens")

    private Long totalTokens;

    public ShowOpsEvaluationTaskResponseBodyDataUsage withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowOpsEvaluationTaskResponseBodyDataUsage withPromptTokens(Long promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }

    /**
     * 输入 Token 数
     * @return promptTokens
     */
    public Long getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(Long promptTokens) {
        this.promptTokens = promptTokens;
    }

    public ShowOpsEvaluationTaskResponseBodyDataUsage withCompletionTokens(Long completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }

    /**
     * 输出 Token 数
     * @return completionTokens
     */
    public Long getCompletionTokens() {
        return completionTokens;
    }

    public void setCompletionTokens(Long completionTokens) {
        this.completionTokens = completionTokens;
    }

    public ShowOpsEvaluationTaskResponseBodyDataUsage withTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }

    /**
     * 总 Token 数
     * @return totalTokens
     */
    public Long getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluationTaskResponseBodyDataUsage that = (ShowOpsEvaluationTaskResponseBodyDataUsage) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.promptTokens, that.promptTokens)
            && Objects.equals(this.completionTokens, that.completionTokens)
            && Objects.equals(this.totalTokens, that.totalTokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, promptTokens, completionTokens, totalTokens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluationTaskResponseBodyDataUsage {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n");
        sb.append("    completionTokens: ").append(toIndentedString(completionTokens)).append("\n");
        sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
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
