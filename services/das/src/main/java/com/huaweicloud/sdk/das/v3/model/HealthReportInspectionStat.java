package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HealthReportInspectionStat
 */
public class HealthReportInspectionStat {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_score")

    private List<HealthReportInspectionScore> inspectionScore = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyze_success")

    private Boolean analyzeSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public HealthReportInspectionStat withInspectionScore(List<HealthReportInspectionScore> inspectionScore) {
        this.inspectionScore = inspectionScore;
        return this;
    }

    public HealthReportInspectionStat addInspectionScoreItem(HealthReportInspectionScore inspectionScoreItem) {
        if (this.inspectionScore == null) {
            this.inspectionScore = new ArrayList<>();
        }
        this.inspectionScore.add(inspectionScoreItem);
        return this;
    }

    public HealthReportInspectionStat withInspectionScore(
        Consumer<List<HealthReportInspectionScore>> inspectionScoreSetter) {
        if (this.inspectionScore == null) {
            this.inspectionScore = new ArrayList<>();
        }
        inspectionScoreSetter.accept(this.inspectionScore);
        return this;
    }

    /**
     * 巡检评分。
     * @return inspectionScore
     */
    public List<HealthReportInspectionScore> getInspectionScore() {
        return inspectionScore;
    }

    public void setInspectionScore(List<HealthReportInspectionScore> inspectionScore) {
        this.inspectionScore = inspectionScore;
    }

    public HealthReportInspectionStat withAnalyzeSuccess(Boolean analyzeSuccess) {
        this.analyzeSuccess = analyzeSuccess;
        return this;
    }

    /**
     * 统计分析是否成功。
     * @return analyzeSuccess
     */
    public Boolean getAnalyzeSuccess() {
        return analyzeSuccess;
    }

    public void setAnalyzeSuccess(Boolean analyzeSuccess) {
        this.analyzeSuccess = analyzeSuccess;
    }

    public HealthReportInspectionStat withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportInspectionStat that = (HealthReportInspectionStat) obj;
        return Objects.equals(this.inspectionScore, that.inspectionScore)
            && Objects.equals(this.analyzeSuccess, that.analyzeSuccess)
            && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inspectionScore, analyzeSuccess, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportInspectionStat {\n");
        sb.append("    inspectionScore: ").append(toIndentedString(inspectionScore)).append("\n");
        sb.append("    analyzeSuccess: ").append(toIndentedString(analyzeSuccess)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
