package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 未使用分析规则。
 */
public class UnusedAnalysisRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclusions")

    private List<UnusedAnalysisRuleCriteria> exclusions = null;

    public UnusedAnalysisRule withExclusions(List<UnusedAnalysisRuleCriteria> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    public UnusedAnalysisRule addExclusionsItem(UnusedAnalysisRuleCriteria exclusionsItem) {
        if (this.exclusions == null) {
            this.exclusions = new ArrayList<>();
        }
        this.exclusions.add(exclusionsItem);
        return this;
    }

    public UnusedAnalysisRule withExclusions(Consumer<List<UnusedAnalysisRuleCriteria>> exclusionsSetter) {
        if (this.exclusions == null) {
            this.exclusions = new ArrayList<>();
        }
        exclusionsSetter.accept(this.exclusions);
        return this;
    }

    /**
     * 排除规则。
     * @return exclusions
     */
    public List<UnusedAnalysisRuleCriteria> getExclusions() {
        return exclusions;
    }

    public void setExclusions(List<UnusedAnalysisRuleCriteria> exclusions) {
        this.exclusions = exclusions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnusedAnalysisRule that = (UnusedAnalysisRule) obj;
        return Objects.equals(this.exclusions, that.exclusions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exclusions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnusedAnalysisRule {\n");
        sb.append("    exclusions: ").append(toIndentedString(exclusions)).append("\n");
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
