package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 标签选择器
 */
public class LabelSelector {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matchExpressions")

    @JacksonXmlProperty(localName = "matchExpressions")

    private List<MatchExpression> matchExpressions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matchLabels")

    @JacksonXmlProperty(localName = "matchLabels")

    private Map<String, String> matchLabels = null;

    public LabelSelector withMatchExpressions(List<MatchExpression> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }

    public LabelSelector addMatchExpressionsItem(MatchExpression matchExpressionsItem) {
        if (this.matchExpressions == null) {
            this.matchExpressions = new ArrayList<>();
        }
        this.matchExpressions.add(matchExpressionsItem);
        return this;
    }

    public LabelSelector withMatchExpressions(Consumer<List<MatchExpression>> matchExpressionsSetter) {
        if (this.matchExpressions == null) {
            this.matchExpressions = new ArrayList<>();
        }
        matchExpressionsSetter.accept(this.matchExpressions);
        return this;
    }

    /**
     * 匹配规则表达式
     * @return matchExpressions
     */
    public List<MatchExpression> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(List<MatchExpression> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public LabelSelector withMatchLabels(Map<String, String> matchLabels) {
        this.matchLabels = matchLabels;
        return this;
    }

    public LabelSelector putMatchLabelsItem(String key, String matchLabelsItem) {
        if (this.matchLabels == null) {
            this.matchLabels = new HashMap<>();
        }
        this.matchLabels.put(key, matchLabelsItem);
        return this;
    }

    public LabelSelector withMatchLabels(Consumer<Map<String, String>> matchLabelsSetter) {
        if (this.matchLabels == null) {
            this.matchLabels = new HashMap<>();
        }
        matchLabelsSetter.accept(this.matchLabels);
        return this;
    }

    /**
     * 匹配的标签，格式为key:value键值对。 单个键值对相当于matchExpressions的一个元素，key字段为key，操作符为In，values数组中只有value。
     * @return matchLabels
     */
    public Map<String, String> getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(Map<String, String> matchLabels) {
        this.matchLabels = matchLabels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelSelector labelSelector = (LabelSelector) o;
        return Objects.equals(this.matchExpressions, labelSelector.matchExpressions)
            && Objects.equals(this.matchLabels, labelSelector.matchLabels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchExpressions, matchLabels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelSelector {\n");
        sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
        sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
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
