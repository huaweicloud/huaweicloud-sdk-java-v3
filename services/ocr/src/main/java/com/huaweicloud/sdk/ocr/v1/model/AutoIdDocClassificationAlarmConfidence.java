package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AutoIdDocClassificationAlarmConfidence
 */
public class AutoIdDocClassificationAlarmConfidence {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blur_score")

    private Integer blurScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "glare_score")

    private Integer glareScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocking_within_border_score")

    private Integer blockingWithinBorderScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insufficient_lighting_score")

    private Integer insufficientLightingScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "copy_score")

    private Integer copyScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "border_integrity_score")

    private Integer borderIntegrityScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reproduce_score")

    private Integer reproduceScore;

    public AutoIdDocClassificationAlarmConfidence withBlurScore(Integer blurScore) {
        this.blurScore = blurScore;
        return this;
    }

    /**
     * 证件图像模糊告警分数，分数越高，证件图像模糊的可能性越高。 
     * @return blurScore
     */
    public Integer getBlurScore() {
        return blurScore;
    }

    public void setBlurScore(Integer blurScore) {
        this.blurScore = blurScore;
    }

    public AutoIdDocClassificationAlarmConfidence withGlareScore(Integer glareScore) {
        this.glareScore = glareScore;
        return this;
    }

    /**
     * 证件图像反光告警分数，分数越高，证件图像反光的可能性越高。 
     * @return glareScore
     */
    public Integer getGlareScore() {
        return glareScore;
    }

    public void setGlareScore(Integer glareScore) {
        this.glareScore = glareScore;
    }

    public AutoIdDocClassificationAlarmConfidence withBlockingWithinBorderScore(Integer blockingWithinBorderScore) {
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

    public AutoIdDocClassificationAlarmConfidence withInsufficientLightingScore(Integer insufficientLightingScore) {
        this.insufficientLightingScore = insufficientLightingScore;
        return this;
    }

    /**
     * 证件图像过暗告警分数，分数越高，证件图像过暗的可能性越高。 
     * @return insufficientLightingScore
     */
    public Integer getInsufficientLightingScore() {
        return insufficientLightingScore;
    }

    public void setInsufficientLightingScore(Integer insufficientLightingScore) {
        this.insufficientLightingScore = insufficientLightingScore;
    }

    public AutoIdDocClassificationAlarmConfidence withCopyScore(Integer copyScore) {
        this.copyScore = copyScore;
        return this;
    }

    /**
     * 证件图像复印件告警分数，分数越高，证件图像是复印件的可能性越高。 
     * @return copyScore
     */
    public Integer getCopyScore() {
        return copyScore;
    }

    public void setCopyScore(Integer copyScore) {
        this.copyScore = copyScore;
    }

    public AutoIdDocClassificationAlarmConfidence withBorderIntegrityScore(Integer borderIntegrityScore) {
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

    public AutoIdDocClassificationAlarmConfidence withReproduceScore(Integer reproduceScore) {
        this.reproduceScore = reproduceScore;
        return this;
    }

    /**
     * 证件图像翻拍告警分数，分数越高，证件图像经过翻拍的可能性越高。 
     * @return reproduceScore
     */
    public Integer getReproduceScore() {
        return reproduceScore;
    }

    public void setReproduceScore(Integer reproduceScore) {
        this.reproduceScore = reproduceScore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoIdDocClassificationAlarmConfidence that = (AutoIdDocClassificationAlarmConfidence) obj;
        return Objects.equals(this.blurScore, that.blurScore) && Objects.equals(this.glareScore, that.glareScore)
            && Objects.equals(this.blockingWithinBorderScore, that.blockingWithinBorderScore)
            && Objects.equals(this.insufficientLightingScore, that.insufficientLightingScore)
            && Objects.equals(this.copyScore, that.copyScore)
            && Objects.equals(this.borderIntegrityScore, that.borderIntegrityScore)
            && Objects.equals(this.reproduceScore, that.reproduceScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blurScore,
            glareScore,
            blockingWithinBorderScore,
            insufficientLightingScore,
            copyScore,
            borderIntegrityScore,
            reproduceScore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoIdDocClassificationAlarmConfidence {\n");
        sb.append("    blurScore: ").append(toIndentedString(blurScore)).append("\n");
        sb.append("    glareScore: ").append(toIndentedString(glareScore)).append("\n");
        sb.append("    blockingWithinBorderScore: ").append(toIndentedString(blockingWithinBorderScore)).append("\n");
        sb.append("    insufficientLightingScore: ").append(toIndentedString(insufficientLightingScore)).append("\n");
        sb.append("    copyScore: ").append(toIndentedString(copyScore)).append("\n");
        sb.append("    borderIntegrityScore: ").append(toIndentedString(borderIntegrityScore)).append("\n");
        sb.append("    reproduceScore: ").append(toIndentedString(reproduceScore)).append("\n");
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
