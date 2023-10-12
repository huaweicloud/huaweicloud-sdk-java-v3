package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LabelSelector
 */
public class LabelSelector {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matchLabels")

    private Map<String, String> matchLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matchExpressions")

    private List<FieldSelector> matchExpressions = null;

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
     * Get matchLabels
     * @return matchLabels
     */
    public Map<String, String> getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(Map<String, String> matchLabels) {
        this.matchLabels = matchLabels;
    }

    public LabelSelector withMatchExpressions(List<FieldSelector> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }

    public LabelSelector addMatchExpressionsItem(FieldSelector matchExpressionsItem) {
        if (this.matchExpressions == null) {
            this.matchExpressions = new ArrayList<>();
        }
        this.matchExpressions.add(matchExpressionsItem);
        return this;
    }

    public LabelSelector withMatchExpressions(Consumer<List<FieldSelector>> matchExpressionsSetter) {
        if (this.matchExpressions == null) {
            this.matchExpressions = new ArrayList<>();
        }
        matchExpressionsSetter.accept(this.matchExpressions);
        return this;
    }

    /**
     * Get matchExpressions
     * @return matchExpressions
     */
    public List<FieldSelector> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(List<FieldSelector> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LabelSelector that = (LabelSelector) obj;
        return Objects.equals(this.matchLabels, that.matchLabels)
            && Objects.equals(this.matchExpressions, that.matchExpressions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchLabels, matchExpressions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelSelector {\n");
        sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
        sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
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
