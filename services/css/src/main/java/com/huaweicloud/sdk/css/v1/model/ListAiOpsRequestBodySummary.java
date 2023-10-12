package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 风险概要。
 */
public class ListAiOpsRequestBodySummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high")

    private Integer high;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium")

    private Integer medium;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private Integer suggestion;

    public ListAiOpsRequestBodySummary withHigh(Integer high) {
        this.high = high;
        return this;
    }

    /**
     * 检测项判定为高风险的数量。
     * @return high
     */
    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public ListAiOpsRequestBodySummary withMedium(Integer medium) {
        this.medium = medium;
        return this;
    }

    /**
     * 检测项判定为中风险的数量。
     * @return medium
     */
    public Integer getMedium() {
        return medium;
    }

    public void setMedium(Integer medium) {
        this.medium = medium;
    }

    public ListAiOpsRequestBodySummary withSuggestion(Integer suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 检测项判定为建议的数量。
     * @return suggestion
     */
    public Integer getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(Integer suggestion) {
        this.suggestion = suggestion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAiOpsRequestBodySummary that = (ListAiOpsRequestBodySummary) obj;
        return Objects.equals(this.high, that.high) && Objects.equals(this.medium, that.medium)
            && Objects.equals(this.suggestion, that.suggestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(high, medium, suggestion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAiOpsRequestBodySummary {\n");
        sb.append("    high: ").append(toIndentedString(high)).append("\n");
        sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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
