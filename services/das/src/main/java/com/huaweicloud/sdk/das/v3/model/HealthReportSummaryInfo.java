package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HealthReportSummaryInfo
 */
public class HealthReportSummaryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysis_results")

    private List<HealthReportAnalysisResult> analysisResults = null;

    public HealthReportSummaryInfo withAnalysisResults(List<HealthReportAnalysisResult> analysisResults) {
        this.analysisResults = analysisResults;
        return this;
    }

    public HealthReportSummaryInfo addAnalysisResultsItem(HealthReportAnalysisResult analysisResultsItem) {
        if (this.analysisResults == null) {
            this.analysisResults = new ArrayList<>();
        }
        this.analysisResults.add(analysisResultsItem);
        return this;
    }

    public HealthReportSummaryInfo withAnalysisResults(
        Consumer<List<HealthReportAnalysisResult>> analysisResultsSetter) {
        if (this.analysisResults == null) {
            this.analysisResults = new ArrayList<>();
        }
        analysisResultsSetter.accept(this.analysisResults);
        return this;
    }

    /**
     * 分析结果列表
     * @return analysisResults
     */
    public List<HealthReportAnalysisResult> getAnalysisResults() {
        return analysisResults;
    }

    public void setAnalysisResults(List<HealthReportAnalysisResult> analysisResults) {
        this.analysisResults = analysisResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportSummaryInfo that = (HealthReportSummaryInfo) obj;
        return Objects.equals(this.analysisResults, that.analysisResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(analysisResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportSummaryInfo {\n");
        sb.append("    analysisResults: ").append(toIndentedString(analysisResults)).append("\n");
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
