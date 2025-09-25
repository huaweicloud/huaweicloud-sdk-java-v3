package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 响应防护
 */
public class LlmRuleInfoRespDetectOptsAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abort_response_content")

    private String abortResponseContent;

    public LlmRuleInfoRespDetectOptsAction withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 响应防护动作
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LlmRuleInfoRespDetectOptsAction withAbortResponseContent(String abortResponseContent) {
        this.abortResponseContent = abortResponseContent;
        return this;
    }

    /**
     * 终止响应协议
     * @return abortResponseContent
     */
    public String getAbortResponseContent() {
        return abortResponseContent;
    }

    public void setAbortResponseContent(String abortResponseContent) {
        this.abortResponseContent = abortResponseContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LlmRuleInfoRespDetectOptsAction that = (LlmRuleInfoRespDetectOptsAction) obj;
        return Objects.equals(this.category, that.category)
            && Objects.equals(this.abortResponseContent, that.abortResponseContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, abortResponseContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LlmRuleInfoRespDetectOptsAction {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    abortResponseContent: ").append(toIndentedString(abortResponseContent)).append("\n");
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
