package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FailedCustomRegexSet
 */
public class FailedCustomRegexSet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex_set_id")

    private String regexSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public FailedCustomRegexSet withRegexSetId(String regexSetId) {
        this.regexSetId = regexSetId;
        return this;
    }

    /**
     * 失败的正则库ID
     * @return regexSetId
     */
    public String getRegexSetId() {
        return regexSetId;
    }

    public void setRegexSetId(String regexSetId) {
        this.regexSetId = regexSetId;
    }

    public FailedCustomRegexSet withReason(String reason) {
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
        FailedCustomRegexSet that = (FailedCustomRegexSet) obj;
        return Objects.equals(this.regexSetId, that.regexSetId) && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regexSetId, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailedCustomRegexSet {\n");
        sb.append("    regexSetId: ").append(toIndentedString(regexSetId)).append("\n");
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
