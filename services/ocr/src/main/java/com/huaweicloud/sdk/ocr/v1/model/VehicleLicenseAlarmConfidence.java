package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class VehicleLicenseAlarmConfidence {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocking_within_border_score")

    private Integer blockingWithinBorderScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "border_integrity_score")

    private Integer borderIntegrityScore;

    public VehicleLicenseAlarmConfidence withBlockingWithinBorderScore(Integer blockingWithinBorderScore) {
        this.blockingWithinBorderScore = blockingWithinBorderScore;
        return this;
    }

    /**
     * 证件图像框内遮挡告警分数，分数越高，证件图像框内遮挡的可能性越高。
     * @return blockingWithinBorderScore
     */
    public Integer getBlockingWithinBorderScore() {
        return blockingWithinBorderScore;
    }

    public void setBlockingWithinBorderScore(Integer blockingWithinBorderScore) {
        this.blockingWithinBorderScore = blockingWithinBorderScore;
    }

    public VehicleLicenseAlarmConfidence withBorderIntegrityScore(Integer borderIntegrityScore) {
        this.borderIntegrityScore = borderIntegrityScore;
        return this;
    }

    /**
     * 证件图像边框完整性告警分数，分数越高，证件图像边框不完整的可能性越高。
     * @return borderIntegrityScore
     */
    public Integer getBorderIntegrityScore() {
        return borderIntegrityScore;
    }

    public void setBorderIntegrityScore(Integer borderIntegrityScore) {
        this.borderIntegrityScore = borderIntegrityScore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VehicleLicenseAlarmConfidence that = (VehicleLicenseAlarmConfidence) obj;
        return Objects.equals(this.blockingWithinBorderScore, that.blockingWithinBorderScore)
            && Objects.equals(this.borderIntegrityScore, that.borderIntegrityScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockingWithinBorderScore, borderIntegrityScore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VehicleLicenseAlarmConfidence {\n");
        sb.append("    blockingWithinBorderScore: ").append(toIndentedString(blockingWithinBorderScore)).append("\n");
        sb.append("    borderIntegrityScore: ").append(toIndentedString(borderIntegrityScore)).append("\n");
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
