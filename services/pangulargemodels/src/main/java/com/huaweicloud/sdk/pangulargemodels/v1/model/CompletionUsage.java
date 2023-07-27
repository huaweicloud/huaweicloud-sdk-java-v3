package com.huaweicloud.sdk.pangulargemodels.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * tokens统计对象
 */
public class CompletionUsage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completion_tokens")

    private BigDecimal completionTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt_tokens")

    private BigDecimal promptTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_tokens")

    private BigDecimal totalTokens;

    public CompletionUsage withCompletionTokens(BigDecimal completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }

    /**
     * 表示模型生成的答案中包含的tokens的数量。
     * @return completionTokens
     */
    public BigDecimal getCompletionTokens() {
        return completionTokens;
    }

    public void setCompletionTokens(BigDecimal completionTokens) {
        this.completionTokens = completionTokens;
    }

    public CompletionUsage withPromptTokens(BigDecimal promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }

    /**
     * 表示生成结果时使用的提示文本的tokens的数量。
     * @return promptTokens
     */
    public BigDecimal getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(BigDecimal promptTokens) {
        this.promptTokens = promptTokens;
    }

    public CompletionUsage withTotalTokens(BigDecimal totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }

    /**
     * 对话过程中使用的tokens总数。
     * @return totalTokens
     */
    public BigDecimal getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(BigDecimal totalTokens) {
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
        CompletionUsage that = (CompletionUsage) obj;
        return Objects.equals(this.completionTokens, that.completionTokens)
            && Objects.equals(this.promptTokens, that.promptTokens)
            && Objects.equals(this.totalTokens, that.totalTokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(completionTokens, promptTokens, totalTokens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompletionUsage {\n");
        sb.append("    completionTokens: ").append(toIndentedString(completionTokens)).append("\n");
        sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n");
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
