package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HealthReportRiskSuggestion
 */
public class HealthReportRiskSuggestion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion_code")

    private String suggestionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion_content")

    private String suggestionContent;

    public HealthReportRiskSuggestion withSuggestionCode(String suggestionCode) {
        this.suggestionCode = suggestionCode;
        return this;
    }

    /**
     * 建议优化措施编码。
     * @return suggestionCode
     */
    public String getSuggestionCode() {
        return suggestionCode;
    }

    public void setSuggestionCode(String suggestionCode) {
        this.suggestionCode = suggestionCode;
    }

    public HealthReportRiskSuggestion withSuggestionContent(String suggestionContent) {
        this.suggestionContent = suggestionContent;
        return this;
    }

    /**
     * 建议优化措施。
     * @return suggestionContent
     */
    public String getSuggestionContent() {
        return suggestionContent;
    }

    public void setSuggestionContent(String suggestionContent) {
        this.suggestionContent = suggestionContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportRiskSuggestion that = (HealthReportRiskSuggestion) obj;
        return Objects.equals(this.suggestionCode, that.suggestionCode)
            && Objects.equals(this.suggestionContent, that.suggestionContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suggestionCode, suggestionContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportRiskSuggestion {\n");
        sb.append("    suggestionCode: ").append(toIndentedString(suggestionCode)).append("\n");
        sb.append("    suggestionContent: ").append(toIndentedString(suggestionContent)).append("\n");
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
