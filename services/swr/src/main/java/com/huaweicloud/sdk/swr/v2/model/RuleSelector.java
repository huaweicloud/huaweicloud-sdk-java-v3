package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RuleSelector
 */
public class RuleSelector {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decoration")

    private String decoration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private String pattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extras")

    private String extras;

    public RuleSelector withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 匹配类型，目前只支持doublestar
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public RuleSelector withDecoration(String decoration) {
        this.decoration = decoration;
        return this;
    }

    /**
     * 选择器匹配类型,当前支持repoMatches
     * @return decoration
     */
    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public RuleSelector withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * 选择器匹配样式，最大长度512。支持正则表达式，正则表达式规则可填写如 nginx-* ，{repo1，repo2} 等，其中： * ： 匹配不包含 '/' 的任何字段。 **：匹配包含 '/' 的任何字段。 ? ：匹配任何单个非 '/' 的字符。 {选项1,选项2,...}：同时匹配多个选项。
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public RuleSelector withExtras(String extras) {
        this.extras = extras;
        return this;
    }

    /**
     * 预留字段
     * @return extras
     */
    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleSelector that = (RuleSelector) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.decoration, that.decoration)
            && Objects.equals(this.pattern, that.pattern) && Objects.equals(this.extras, that.extras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, decoration, pattern, extras);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleSelector {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    decoration: ").append(toIndentedString(decoration)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
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
