package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FailedCustomAnswers
 */
public class FailedCustomAnswers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answer_id")

    private String answerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public FailedCustomAnswers withAnswerId(String answerId) {
        this.answerId = answerId;
        return this;
    }

    /**
     * 代答库ID
     * @return answerId
     */
    public String getAnswerId() {
        return answerId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    public FailedCustomAnswers withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 失败原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FailedCustomAnswers that = (FailedCustomAnswers) obj;
        return Objects.equals(this.answerId, that.answerId) && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerId, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailedCustomAnswers {\n");
        sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
