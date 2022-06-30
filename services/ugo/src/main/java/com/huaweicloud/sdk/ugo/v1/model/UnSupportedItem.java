package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SQL语句不支持转换的详情。
 */
public class UnSupportedItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_number")

    private Integer lineNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private Integer position;

    public UnSupportedItem withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * SQL语句不支持转换的原因。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public UnSupportedItem withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * SQL语句不支持转换的建议。
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public UnSupportedItem withLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    /**
     * 行号。
     * @return lineNumber
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public UnSupportedItem withPosition(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * 位置。
     * @return position
     */
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnSupportedItem unSupportedItem = (UnSupportedItem) o;
        return Objects.equals(this.reason, unSupportedItem.reason)
            && Objects.equals(this.suggestion, unSupportedItem.suggestion)
            && Objects.equals(this.lineNumber, unSupportedItem.lineNumber)
            && Objects.equals(this.position, unSupportedItem.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, suggestion, lineNumber, position);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnSupportedItem {\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
