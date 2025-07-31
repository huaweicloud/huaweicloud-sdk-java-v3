package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 评估指标详情
 */
public class AssessProperty {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected")

    private String expected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual")

    private String actual;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion_en")

    private String suggestionEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public AssessProperty withExpected(String expected) {
        this.expected = expected;
        return this;
    }

    /**
     * 预期信息
     * @return expected
     */
    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public AssessProperty withActual(String actual) {
        this.actual = actual;
        return this;
    }

    /**
     * 实际信息
     * @return actual
     */
    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public AssessProperty withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 中文建议
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public AssessProperty withSuggestionEn(String suggestionEn) {
        this.suggestionEn = suggestionEn;
        return this;
    }

    /**
     * 英文建议
     * @return suggestionEn
     */
    public String getSuggestionEn() {
        return suggestionEn;
    }

    public void setSuggestionEn(String suggestionEn) {
        this.suggestionEn = suggestionEn;
    }

    public AssessProperty withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 是否超出范围
     * minimum: -1
     * maximum: 1
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssessProperty that = (AssessProperty) obj;
        return Objects.equals(this.expected, that.expected) && Objects.equals(this.actual, that.actual)
            && Objects.equals(this.suggestion, that.suggestion) && Objects.equals(this.suggestionEn, that.suggestionEn)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expected, actual, suggestion, suggestionEn, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssessProperty {\n");
        sb.append("    expected: ").append(toIndentedString(expected)).append("\n");
        sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    suggestionEn: ").append(toIndentedString(suggestionEn)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
