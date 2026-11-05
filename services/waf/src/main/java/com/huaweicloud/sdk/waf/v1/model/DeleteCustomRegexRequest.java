package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteCustomRegexRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex_set_id")

    private String regexSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex_id")

    private String regexId;

    public DeleteCustomRegexRequest withRegexSetId(String regexSetId) {
        this.regexSetId = regexSetId;
        return this;
    }

    /**
     * 正则库ID
     * @return regexSetId
     */
    public String getRegexSetId() {
        return regexSetId;
    }

    public void setRegexSetId(String regexSetId) {
        this.regexSetId = regexSetId;
    }

    public DeleteCustomRegexRequest withRegexId(String regexId) {
        this.regexId = regexId;
        return this;
    }

    /**
     * 正则ID
     * @return regexId
     */
    public String getRegexId() {
        return regexId;
    }

    public void setRegexId(String regexId) {
        this.regexId = regexId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCustomRegexRequest that = (DeleteCustomRegexRequest) obj;
        return Objects.equals(this.regexSetId, that.regexSetId) && Objects.equals(this.regexId, that.regexId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regexSetId, regexId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCustomRegexRequest {\n");
        sb.append("    regexSetId: ").append(toIndentedString(regexSetId)).append("\n");
        sb.append("    regexId: ").append(toIndentedString(regexId)).append("\n");
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
