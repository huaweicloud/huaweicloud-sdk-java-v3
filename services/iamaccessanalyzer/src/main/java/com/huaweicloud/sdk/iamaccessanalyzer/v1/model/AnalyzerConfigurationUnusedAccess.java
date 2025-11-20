package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 未使用的访问分析器的配置项。
 */
public class AnalyzerConfigurationUnusedAccess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unused_access_age")

    private Integer unusedAccessAge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unused_analysis_rule")

    private UnusedAnalysisRule unusedAnalysisRule;

    public AnalyzerConfigurationUnusedAccess withUnusedAccessAge(Integer unusedAccessAge) {
        this.unusedAccessAge = unusedAccessAge;
        return this;
    }

    /**
     * 生成分析结果的预设天数。
     * minimum: 1
     * maximum: 180
     * @return unusedAccessAge
     */
    public Integer getUnusedAccessAge() {
        return unusedAccessAge;
    }

    public void setUnusedAccessAge(Integer unusedAccessAge) {
        this.unusedAccessAge = unusedAccessAge;
    }

    public AnalyzerConfigurationUnusedAccess withUnusedAnalysisRule(UnusedAnalysisRule unusedAnalysisRule) {
        this.unusedAnalysisRule = unusedAnalysisRule;
        return this;
    }

    public AnalyzerConfigurationUnusedAccess withUnusedAnalysisRule(
        Consumer<UnusedAnalysisRule> unusedAnalysisRuleSetter) {
        if (this.unusedAnalysisRule == null) {
            this.unusedAnalysisRule = new UnusedAnalysisRule();
            unusedAnalysisRuleSetter.accept(this.unusedAnalysisRule);
        }

        return this;
    }

    /**
     * Get unusedAnalysisRule
     * @return unusedAnalysisRule
     */
    public UnusedAnalysisRule getUnusedAnalysisRule() {
        return unusedAnalysisRule;
    }

    public void setUnusedAnalysisRule(UnusedAnalysisRule unusedAnalysisRule) {
        this.unusedAnalysisRule = unusedAnalysisRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyzerConfigurationUnusedAccess that = (AnalyzerConfigurationUnusedAccess) obj;
        return Objects.equals(this.unusedAccessAge, that.unusedAccessAge)
            && Objects.equals(this.unusedAnalysisRule, that.unusedAnalysisRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unusedAccessAge, unusedAnalysisRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalyzerConfigurationUnusedAccess {\n");
        sb.append("    unusedAccessAge: ").append(toIndentedString(unusedAccessAge)).append("\n");
        sb.append("    unusedAnalysisRule: ").append(toIndentedString(unusedAnalysisRule)).append("\n");
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
