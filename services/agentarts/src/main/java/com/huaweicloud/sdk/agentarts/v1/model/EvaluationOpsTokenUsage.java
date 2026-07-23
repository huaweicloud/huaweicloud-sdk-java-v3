package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：**   大模型调用产生的Token资源消耗统计对象。 **取值范围：**   不涉及。 
 */
public class EvaluationOpsTokenUsage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt_tokens")

    private Long promptTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completion_tokens")

    private Long completionTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_tokens")

    private Long totalTokens;

    public EvaluationOpsTokenUsage withPromptTokens(Long promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }

    /**
     * **参数解释：**   输入提示词所消耗的Token数量。 **取值范围：**   0-9,999,999,999。 
     * minimum: 0
     * maximum: 9999999999
     * @return promptTokens
     */
    public Long getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(Long promptTokens) {
        this.promptTokens = promptTokens;
    }

    public EvaluationOpsTokenUsage withCompletionTokens(Long completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }

    /**
     * **参数解释：**   模型生成内容所消耗的Token数量。 **取值范围：**   0-9,999,999,999。 
     * minimum: 0
     * maximum: 9999999999
     * @return completionTokens
     */
    public Long getCompletionTokens() {
        return completionTokens;
    }

    public void setCompletionTokens(Long completionTokens) {
        this.completionTokens = completionTokens;
    }

    public EvaluationOpsTokenUsage withTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }

    /**
     * **参数解释：**   本次任务产生的Token消耗总量。 **取值范围：**   0-9,999,999,999。 
     * minimum: 0
     * maximum: 9999999999
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
        EvaluationOpsTokenUsage that = (EvaluationOpsTokenUsage) obj;
        return Objects.equals(this.promptTokens, that.promptTokens)
            && Objects.equals(this.completionTokens, that.completionTokens)
            && Objects.equals(this.totalTokens, that.totalTokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promptTokens, completionTokens, totalTokens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsTokenUsage {\n");
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
