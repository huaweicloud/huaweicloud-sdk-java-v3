package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CambodianIdCardScoreInformationResult
 */
public class CambodianIdCardScoreInformationResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idcard_type_score")

    private Integer idcardTypeScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "border_integrity_score")

    private Integer borderIntegrityScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocking_within_border_score")

    private Integer blockingWithinBorderScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blur_score")

    private Integer blurScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "glare_score")

    private Integer glareScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tampering_score")

    private Integer tamperingScore;

    public CambodianIdCardScoreInformationResult withIdcardTypeScore(Integer idcardTypeScore) {
        this.idcardTypeScore = idcardTypeScore;
        return this;
    }

    /**
     * 告警分数，字段取值范围[0, 99]值大于50表示复印件，小于等于50表示原件，值越靠近99，表示复印件的可能性越大，值越靠近0，表示原件的可能性越大。  仅在传入参数return_idcard_type为true时，返回该字段。 
     * @return idcardTypeScore
     */
    public Integer getIdcardTypeScore() {
        return idcardTypeScore;
    }

    public void setIdcardTypeScore(Integer idcardTypeScore) {
        this.idcardTypeScore = idcardTypeScore;
    }

    public CambodianIdCardScoreInformationResult withBorderIntegrityScore(Integer borderIntegrityScore) {
        this.borderIntegrityScore = borderIntegrityScore;
        return this;
    }

    /**
     * 告警分数，字段取值范围[0, 99]值大于50表示边框不完整，小于50表示边框完整，值越靠近99，表示边框不完整的可能性越大，值越靠近0，表示边框完整的可能性越大。 仅在传入参数detect_border_integrity为true时，返回该字段。 
     * @return borderIntegrityScore
     */
    public Integer getBorderIntegrityScore() {
        return borderIntegrityScore;
    }

    public void setBorderIntegrityScore(Integer borderIntegrityScore) {
        this.borderIntegrityScore = borderIntegrityScore;
    }

    public CambodianIdCardScoreInformationResult withBlockingWithinBorderScore(Integer blockingWithinBorderScore) {
        this.blockingWithinBorderScore = blockingWithinBorderScore;
        return this;
    }

    /**
     * 告警分数，字段取值范围[0, 99]值大于50表示框内有遮挡，小于50表示框内无遮挡，值越靠近99，表示框内有遮挡的可能性越大，值越靠近0，表示框内无遮挡的可能性越大。 仅在传入参数detect_blocking_within_border为true时，返回该字段。 
     * @return blockingWithinBorderScore
     */
    public Integer getBlockingWithinBorderScore() {
        return blockingWithinBorderScore;
    }

    public void setBlockingWithinBorderScore(Integer blockingWithinBorderScore) {
        this.blockingWithinBorderScore = blockingWithinBorderScore;
    }

    public CambodianIdCardScoreInformationResult withBlurScore(Integer blurScore) {
        this.blurScore = blurScore;
        return this;
    }

    /**
     * 告警分数，字段取值范围[0, 99]值大于50表示身份证模糊，小于50表示身份证清晰，值越靠近99，表示身份证模糊的可能性越大，值越靠近0，表示身份证清晰的可能性越大。 仅在传入参数detect_blur为true时，返回该字段。 
     * @return blurScore
     */
    public Integer getBlurScore() {
        return blurScore;
    }

    public void setBlurScore(Integer blurScore) {
        this.blurScore = blurScore;
    }

    public CambodianIdCardScoreInformationResult withGlareScore(Integer glareScore) {
        this.glareScore = glareScore;
        return this;
    }

    /**
     * 告警分数，字段取值范围[0, 99]值大于50表示身份证反光，小于50表示身份证不反光，值越靠近99，表示身份证反光的可能性越大，值越靠近0，表示身份证不反光的可能性越大。 仅在传入参数detect_glare为true时，返回该字段。 
     * @return glareScore
     */
    public Integer getGlareScore() {
        return glareScore;
    }

    public void setGlareScore(Integer glareScore) {
        this.glareScore = glareScore;
    }

    public CambodianIdCardScoreInformationResult withTamperingScore(Integer tamperingScore) {
        this.tamperingScore = tamperingScore;
        return this;
    }

    /**
     * 告警分数，字段取值范围[0, 99]值大于50表示身份证人像被其他非身份证人像篡改过，小于50表示身份证人像未被篡改，值越靠近99，表示身份证人像被篡改的可能性越大，值越靠近0，表示身份证未人像被篡改的可能性越大。 仅在传入参数detect_tampering为true时，返回该字段。 
     * @return tamperingScore
     */
    public Integer getTamperingScore() {
        return tamperingScore;
    }

    public void setTamperingScore(Integer tamperingScore) {
        this.tamperingScore = tamperingScore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CambodianIdCardScoreInformationResult that = (CambodianIdCardScoreInformationResult) obj;
        return Objects.equals(this.idcardTypeScore, that.idcardTypeScore)
            && Objects.equals(this.borderIntegrityScore, that.borderIntegrityScore)
            && Objects.equals(this.blockingWithinBorderScore, that.blockingWithinBorderScore)
            && Objects.equals(this.blurScore, that.blurScore) && Objects.equals(this.glareScore, that.glareScore)
            && Objects.equals(this.tamperingScore, that.tamperingScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcardTypeScore,
            borderIntegrityScore,
            blockingWithinBorderScore,
            blurScore,
            glareScore,
            tamperingScore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CambodianIdCardScoreInformationResult {\n");
        sb.append("    idcardTypeScore: ").append(toIndentedString(idcardTypeScore)).append("\n");
        sb.append("    borderIntegrityScore: ").append(toIndentedString(borderIntegrityScore)).append("\n");
        sb.append("    blockingWithinBorderScore: ").append(toIndentedString(blockingWithinBorderScore)).append("\n");
        sb.append("    blurScore: ").append(toIndentedString(blurScore)).append("\n");
        sb.append("    glareScore: ").append(toIndentedString(glareScore)).append("\n");
        sb.append("    tamperingScore: ").append(toIndentedString(tamperingScore)).append("\n");
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
