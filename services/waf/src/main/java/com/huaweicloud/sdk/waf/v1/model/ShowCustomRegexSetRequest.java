package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCustomRegexSetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex_set_id")

    private String regexSetId;

    public ShowCustomRegexSetRequest withRegexSetId(String regexSetId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCustomRegexSetRequest that = (ShowCustomRegexSetRequest) obj;
        return Objects.equals(this.regexSetId, that.regexSetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regexSetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCustomRegexSetRequest {\n");
        sb.append("    regexSetId: ").append(toIndentedString(regexSetId)).append("\n");
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
