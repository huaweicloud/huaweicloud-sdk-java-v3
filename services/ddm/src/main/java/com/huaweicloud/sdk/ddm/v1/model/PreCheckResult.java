package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PreCheckResult
 */
public class PreCheckResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note")

    private String note;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handling_suggestion")

    private String handlingSuggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_detail_message")

    private String errorDetailMessage;

    public PreCheckResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 检查项名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PreCheckResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 检查项结果。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PreCheckResult withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * 检查项提示信息。
     * @return note
     */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public PreCheckResult withHandlingSuggestion(String handlingSuggestion) {
        this.handlingSuggestion = handlingSuggestion;
        return this;
    }

    /**
     * 处理建议。
     * @return handlingSuggestion
     */
    public String getHandlingSuggestion() {
        return handlingSuggestion;
    }

    public void setHandlingSuggestion(String handlingSuggestion) {
        this.handlingSuggestion = handlingSuggestion;
    }

    public PreCheckResult withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public PreCheckResult withErrorDetailMessage(String errorDetailMessage) {
        this.errorDetailMessage = errorDetailMessage;
        return this;
    }

    /**
     * 详细错误信息。
     * @return errorDetailMessage
     */
    public String getErrorDetailMessage() {
        return errorDetailMessage;
    }

    public void setErrorDetailMessage(String errorDetailMessage) {
        this.errorDetailMessage = errorDetailMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreCheckResult that = (PreCheckResult) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.note, that.note) && Objects.equals(this.handlingSuggestion, that.handlingSuggestion)
            && Objects.equals(this.errorMessage, that.errorMessage)
            && Objects.equals(this.errorDetailMessage, that.errorDetailMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, note, handlingSuggestion, errorMessage, errorDetailMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreCheckResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    handlingSuggestion: ").append(toIndentedString(handlingSuggestion)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorDetailMessage: ").append(toIndentedString(errorDetailMessage)).append("\n");
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
