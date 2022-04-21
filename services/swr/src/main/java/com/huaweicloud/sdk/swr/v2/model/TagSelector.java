package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TagSelector
 */
public class TagSelector {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private String pattern;

    public TagSelector withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 匹配规则，label、regexp
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public TagSelector withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * kind是label时，设置为镜像版本,kind是regexp时，设置为正则表达式
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagSelector tagSelector = (TagSelector) o;
        return Objects.equals(this.kind, tagSelector.kind) && Objects.equals(this.pattern, tagSelector.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, pattern);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagSelector {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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
