package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 与相应权重关联的节点选择器项。
 */
public class PreferredSchedulingTermPreference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matchExpressions")

    private List<MatchExpression> matchExpressions = null;

    public PreferredSchedulingTermPreference withMatchExpressions(List<MatchExpression> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }

    public PreferredSchedulingTermPreference addMatchExpressionsItem(MatchExpression matchExpressionsItem) {
        if (this.matchExpressions == null) {
            this.matchExpressions = new ArrayList<>();
        }
        this.matchExpressions.add(matchExpressionsItem);
        return this;
    }

    public PreferredSchedulingTermPreference withMatchExpressions(
        Consumer<List<MatchExpression>> matchExpressionsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreferredSchedulingTermPreference that = (PreferredSchedulingTermPreference) obj;
        return Objects.equals(this.matchExpressions, that.matchExpressions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchExpressions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreferredSchedulingTermPreference {\n");
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
