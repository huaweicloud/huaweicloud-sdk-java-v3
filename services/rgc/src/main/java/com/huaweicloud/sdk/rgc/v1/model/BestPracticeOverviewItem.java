package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 最佳实践检测结果各个场景的概览。
 */
public class BestPracticeOverviewItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private BigDecimal score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detection_count")

    private Integer detectionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_risk_count")

    private Integer highRiskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium_risk_count")

    private Integer mediumRiskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "low_risk_count")

    private Integer lowRiskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_item_description")

    private List<String> riskItemDescription = null;

    public BestPracticeOverviewItem withScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    /**
     * 分数
     * @return score
     */
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public BestPracticeOverviewItem withDetectionCount(Integer detectionCount) {
        this.detectionCount = detectionCount;
        return this;
    }

    /**
     * 检测项个数
     * @return detectionCount
     */
    public Integer getDetectionCount() {
        return detectionCount;
    }

    public void setDetectionCount(Integer detectionCount) {
        this.detectionCount = detectionCount;
    }

    public BestPracticeOverviewItem withHighRiskCount(Integer highRiskCount) {
        this.highRiskCount = highRiskCount;
        return this;
    }

    /**
     * 高风险项个数
     * @return highRiskCount
     */
    public Integer getHighRiskCount() {
        return highRiskCount;
    }

    public void setHighRiskCount(Integer highRiskCount) {
        this.highRiskCount = highRiskCount;
    }

    public BestPracticeOverviewItem withMediumRiskCount(Integer mediumRiskCount) {
        this.mediumRiskCount = mediumRiskCount;
        return this;
    }

    /**
     * 中风险项个数
     * @return mediumRiskCount
     */
    public Integer getMediumRiskCount() {
        return mediumRiskCount;
    }

    public void setMediumRiskCount(Integer mediumRiskCount) {
        this.mediumRiskCount = mediumRiskCount;
    }

    public BestPracticeOverviewItem withLowRiskCount(Integer lowRiskCount) {
        this.lowRiskCount = lowRiskCount;
        return this;
    }

    /**
     * 低风险项个数
     * @return lowRiskCount
     */
    public Integer getLowRiskCount() {
        return lowRiskCount;
    }

    public void setLowRiskCount(Integer lowRiskCount) {
        this.lowRiskCount = lowRiskCount;
    }

    public BestPracticeOverviewItem withRiskItemDescription(List<String> riskItemDescription) {
        this.riskItemDescription = riskItemDescription;
        return this;
    }

    public BestPracticeOverviewItem addRiskItemDescriptionItem(String riskItemDescriptionItem) {
        if (this.riskItemDescription == null) {
            this.riskItemDescription = new ArrayList<>();
        }
        this.riskItemDescription.add(riskItemDescriptionItem);
        return this;
    }

    public BestPracticeOverviewItem withRiskItemDescription(Consumer<List<String>> riskItemDescriptionSetter) {
        if (this.riskItemDescription == null) {
            this.riskItemDescription = new ArrayList<>();
        }
        riskItemDescriptionSetter.accept(this.riskItemDescription);
        return this;
    }

    /**
     * 风险描述
     * @return riskItemDescription
     */
    public List<String> getRiskItemDescription() {
        return riskItemDescription;
    }

    public void setRiskItemDescription(List<String> riskItemDescription) {
        this.riskItemDescription = riskItemDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BestPracticeOverviewItem that = (BestPracticeOverviewItem) obj;
        return Objects.equals(this.score, that.score) && Objects.equals(this.detectionCount, that.detectionCount)
            && Objects.equals(this.highRiskCount, that.highRiskCount)
            && Objects.equals(this.mediumRiskCount, that.mediumRiskCount)
            && Objects.equals(this.lowRiskCount, that.lowRiskCount)
            && Objects.equals(this.riskItemDescription, that.riskItemDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, detectionCount, highRiskCount, mediumRiskCount, lowRiskCount, riskItemDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BestPracticeOverviewItem {\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    detectionCount: ").append(toIndentedString(detectionCount)).append("\n");
        sb.append("    highRiskCount: ").append(toIndentedString(highRiskCount)).append("\n");
        sb.append("    mediumRiskCount: ").append(toIndentedString(mediumRiskCount)).append("\n");
        sb.append("    lowRiskCount: ").append(toIndentedString(lowRiskCount)).append("\n");
        sb.append("    riskItemDescription: ").append(toIndentedString(riskItemDescription)).append("\n");
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
