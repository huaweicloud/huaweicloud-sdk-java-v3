package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 防护
 */
public class LlmRuleInfoPromptDetectOptsAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response")

    private LlmRuleInfoPromptDetectOptsActionResponse response;

    public LlmRuleInfoPromptDetectOptsAction withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 防护动作
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LlmRuleInfoPromptDetectOptsAction withResponse(LlmRuleInfoPromptDetectOptsActionResponse response) {
        this.response = response;
        return this;
    }

    public LlmRuleInfoPromptDetectOptsAction withResponse(
        Consumer<LlmRuleInfoPromptDetectOptsActionResponse> responseSetter) {
        if (this.response == null) {
            this.response = new LlmRuleInfoPromptDetectOptsActionResponse();
            responseSetter.accept(this.response);
        }

        return this;
    }

    /**
     * Get response
     * @return response
     */
    public LlmRuleInfoPromptDetectOptsActionResponse getResponse() {
        return response;
    }

    public void setResponse(LlmRuleInfoPromptDetectOptsActionResponse response) {
        this.response = response;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LlmRuleInfoPromptDetectOptsAction that = (LlmRuleInfoPromptDetectOptsAction) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.response, that.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, response);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LlmRuleInfoPromptDetectOptsAction {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
