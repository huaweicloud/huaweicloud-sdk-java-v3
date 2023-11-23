package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 匹配Header的规则。
 */
public class CreateMatchHeadersHeader {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exact")

    private String exact;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caseInsensitive")

    private Boolean caseInsensitive;

    public CreateMatchHeadersHeader withExact(String exact) {
        this.exact = exact;
        return this;
    }

    /**
     * 精确匹配值。
     * @return exact
     */
    public String getExact() {
        return exact;
    }

    public void setExact(String exact) {
        this.exact = exact;
    }

    public CreateMatchHeadersHeader withCaseInsensitive(Boolean caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
        return this;
    }

    /**
     * 是否区分大小写。
     * @return caseInsensitive
     */
    public Boolean getCaseInsensitive() {
        return caseInsensitive;
    }

    public void setCaseInsensitive(Boolean caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMatchHeadersHeader that = (CreateMatchHeadersHeader) obj;
        return Objects.equals(this.exact, that.exact) && Objects.equals(this.caseInsensitive, that.caseInsensitive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exact, caseInsensitive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMatchHeadersHeader {\n");
        sb.append("    exact: ").append(toIndentedString(exact)).append("\n");
        sb.append("    caseInsensitive: ").append(toIndentedString(caseInsensitive)).append("\n");
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
