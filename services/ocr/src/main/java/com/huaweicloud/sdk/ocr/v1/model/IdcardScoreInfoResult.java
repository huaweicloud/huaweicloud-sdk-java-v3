package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class IdcardScoreInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tampering_score")

    private Integer tamperingScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interim_score")

    private Integer interimScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reproduce_score")

    private Integer reproduceScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "copy_score")

    private Integer copyScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "border_integrity_score")

    private Integer borderIntegrityScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blur_score")

    private Integer blurScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "glare_score")

    private Integer glareScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocking_within_border_score")

    private Integer blockingWithinBorderScore;

    public IdcardScoreInfoResult withTamperingScore(Integer tamperingScore) {
        this.tamperingScore = tamperingScore;
        return this;
    }

    /**
     * 身份证PS告警分数，分数越高，PS的可能性越高。 仅在传入参数detect_tampering为true时，返回该字段。 
     * @return tamperingScore
     */
    public Integer getTamperingScore() {
        return tamperingScore;
    }

    public void setTamperingScore(Integer tamperingScore) {
        this.tamperingScore = tamperingScore;
    }

    public IdcardScoreInfoResult withInterimScore(Integer interimScore) {
        this.interimScore = interimScore;
        return this;
    }

    /**
     * 临时身份证告警分数，分数越高，临时身份证的可能性越高。 仅在传入参数detect_interim为true时，返回该字段。 
     * @return interimScore
     */
    public Integer getInterimScore() {
        return interimScore;
    }

    public void setInterimScore(Integer interimScore) {
        this.interimScore = interimScore;
    }

    public IdcardScoreInfoResult withReproduceScore(Integer reproduceScore) {
        this.reproduceScore = reproduceScore;
        return this;
    }

    /**
     * 身份证翻拍告警分数，分数越高，身份证图像经过翻拍的可能性越高。 仅在传入参数detect_reproduce为true时，返回该字段。 
     * @return reproduceScore
     */
    public Integer getReproduceScore() {
        return reproduceScore;
    }

    public void setReproduceScore(Integer reproduceScore) {
        this.reproduceScore = reproduceScore;
    }

    public IdcardScoreInfoResult withCopyScore(Integer copyScore) {
        this.copyScore = copyScore;
        return this;
    }

    /**
     * 身份证复印告警分数, 分数越高，身份证图像是复印件的可能性越高。 仅在传入参数detect_copy为true时，返回该字段。 
     * @return copyScore
     */
    public Integer getCopyScore() {
        return copyScore;
    }

    public void setCopyScore(Integer copyScore) {
        this.copyScore = copyScore;
    }

    public IdcardScoreInfoResult withBorderIntegrityScore(Integer borderIntegrityScore) {
        this.borderIntegrityScore = borderIntegrityScore;
        return this;
    }

    /**
     * 身份证边缘完整性告警的分数，分数越高，身份证图像边缘不完整的可能性越高。 仅在传入参数detect_border_integrity为true时，返回该字段。 
     * @return borderIntegrityScore
     */
    public Integer getBorderIntegrityScore() {
        return borderIntegrityScore;
    }

    public void setBorderIntegrityScore(Integer borderIntegrityScore) {
        this.borderIntegrityScore = borderIntegrityScore;
    }

    public IdcardScoreInfoResult withBlurScore(Integer blurScore) {
        this.blurScore = blurScore;
        return this;
    }

    /**
     * 身份证模糊告警分数，分数越高，身份证图像模糊的可能性越高。 仅在传入参数detect_blur为true时，返回该字段。 
     * @return blurScore
     */
    public Integer getBlurScore() {
        return blurScore;
    }

    public void setBlurScore(Integer blurScore) {
        this.blurScore = blurScore;
    }

    public IdcardScoreInfoResult withGlareScore(Integer glareScore) {
        this.glareScore = glareScore;
        return this;
    }

    /**
     * 身份证反光告警分数，分数越高，身份证图像存在反光的可能性越高。 仅在传入参数detect_glare为true时，返回该字段。 
     * @return glareScore
     */
    public Integer getGlareScore() {
        return glareScore;
    }

    public void setGlareScore(Integer glareScore) {
        this.glareScore = glareScore;
    }

    public IdcardScoreInfoResult withBlockingWithinBorderScore(Integer blockingWithinBorderScore) {
        this.blockingWithinBorderScore = blockingWithinBorderScore;
        return this;
    }

    /**
     * 身份证图像框内是否有遮挡的告警分数，分数越高，身份证图像框内存在异物遮挡的可能性越高。 仅在传入参数detect_blocking_within_border为true时，返回该字段。 
     * @return blockingWithinBorderScore
     */
    public Integer getBlockingWithinBorderScore() {
        return blockingWithinBorderScore;
    }

    public void setBlockingWithinBorderScore(Integer blockingWithinBorderScore) {
        this.blockingWithinBorderScore = blockingWithinBorderScore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdcardScoreInfoResult that = (IdcardScoreInfoResult) obj;
        return Objects.equals(this.tamperingScore, that.tamperingScore)
            && Objects.equals(this.interimScore, that.interimScore)
            && Objects.equals(this.reproduceScore, that.reproduceScore)
            && Objects.equals(this.copyScore, that.copyScore)
            && Objects.equals(this.borderIntegrityScore, that.borderIntegrityScore)
            && Objects.equals(this.blurScore, that.blurScore) && Objects.equals(this.glareScore, that.glareScore)
            && Objects.equals(this.blockingWithinBorderScore, that.blockingWithinBorderScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tamperingScore,
            interimScore,
            reproduceScore,
            copyScore,
            borderIntegrityScore,
            blurScore,
            glareScore,
            blockingWithinBorderScore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdcardScoreInfoResult {\n");
        sb.append("    tamperingScore: ").append(toIndentedString(tamperingScore)).append("\n");
        sb.append("    interimScore: ").append(toIndentedString(interimScore)).append("\n");
        sb.append("    reproduceScore: ").append(toIndentedString(reproduceScore)).append("\n");
        sb.append("    copyScore: ").append(toIndentedString(copyScore)).append("\n");
        sb.append("    borderIntegrityScore: ").append(toIndentedString(borderIntegrityScore)).append("\n");
        sb.append("    blurScore: ").append(toIndentedString(blurScore)).append("\n");
        sb.append("    glareScore: ").append(toIndentedString(glareScore)).append("\n");
        sb.append("    blockingWithinBorderScore: ").append(toIndentedString(blockingWithinBorderScore)).append("\n");
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
