package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AiguardCustomRegexBody
 */
public class AiguardCustomRegexBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex_expression")

    private String regexExpression;

    public AiguardCustomRegexBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 正则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AiguardCustomRegexBody withRegexExpression(String regexExpression) {
        this.regexExpression = regexExpression;
        return this;
    }

    /**
     * 正则表达式
     * @return regexExpression
     */
    public String getRegexExpression() {
        return regexExpression;
    }

    public void setRegexExpression(String regexExpression) {
        this.regexExpression = regexExpression;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiguardCustomRegexBody that = (AiguardCustomRegexBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.regexExpression, that.regexExpression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regexExpression);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiguardCustomRegexBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regexExpression: ").append(toIndentedString(regexExpression)).append("\n");
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
