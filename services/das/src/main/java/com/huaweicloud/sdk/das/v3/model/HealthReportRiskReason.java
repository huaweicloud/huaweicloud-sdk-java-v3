package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HealthReportRiskReason
 */
public class HealthReportRiskReason {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason_code")

    private String reasonCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason_content")

    private String reasonContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestions")

    private List<HealthReportRiskSuggestion> suggestions = null;

    public HealthReportRiskReason withReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    /**
     * 可能原因编码。
     * @return reasonCode
     */
    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public HealthReportRiskReason withReasonContent(String reasonContent) {
        this.reasonContent = reasonContent;
        return this;
    }

    /**
     * 可能原因内容。
     * @return reasonContent
     */
    public String getReasonContent() {
        return reasonContent;
    }

    public void setReasonContent(String reasonContent) {
        this.reasonContent = reasonContent;
    }

    public HealthReportRiskReason withSuggestions(List<HealthReportRiskSuggestion> suggestions) {
        this.suggestions = suggestions;
        return this;
    }

    public HealthReportRiskReason addSuggestionsItem(HealthReportRiskSuggestion suggestionsItem) {
        if (this.suggestions == null) {
            this.suggestions = new ArrayList<>();
        }
        this.suggestions.add(suggestionsItem);
        return this;
    }

    public HealthReportRiskReason withSuggestions(Consumer<List<HealthReportRiskSuggestion>> suggestionsSetter) {
        if (this.suggestions == null) {
            this.suggestions = new ArrayList<>();
        }
        suggestionsSetter.accept(this.suggestions);
        return this;
    }

    /**
     * 建议优化措施列表。
     * @return suggestions
     */
    public List<HealthReportRiskSuggestion> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<HealthReportRiskSuggestion> suggestions) {
        this.suggestions = suggestions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportRiskReason that = (HealthReportRiskReason) obj;
        return Objects.equals(this.reasonCode, that.reasonCode)
            && Objects.equals(this.reasonContent, that.reasonContent)
            && Objects.equals(this.suggestions, that.suggestions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reasonCode, reasonContent, suggestions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportRiskReason {\n");
        sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
        sb.append("    reasonContent: ").append(toIndentedString(reasonContent)).append("\n");
        sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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
