package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FaceQuality
 */
public class FaceQuality {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_score")

    private Double totalScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blur")

    private Double blur;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pose")

    private Double pose;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occlusion")

    private Double occlusion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "illumination")

    private Double illumination;

    public FaceQuality withTotalScore(Double totalScore) {
        this.totalScore = totalScore;
        return this;
    }

    /**
     * 人脸质量总分，取值范围[0-1]，分值越大质量越高。
     * @return totalScore
     */
    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public FaceQuality withBlur(Double blur) {
        this.blur = blur;
        return this;
    }

    /**
     * 模糊度，取值范围[0-1]，分值越大模糊问题越严重。
     * @return blur
     */
    public Double getBlur() {
        return blur;
    }

    public void setBlur(Double blur) {
        this.blur = blur;
    }

    public FaceQuality withPose(Double pose) {
        this.pose = pose;
        return this;
    }

    /**
     * 姿态，取值范围[0-1]，分值越大姿态问题越严重。
     * @return pose
     */
    public Double getPose() {
        return pose;
    }

    public void setPose(Double pose) {
        this.pose = pose;
    }

    public FaceQuality withOcclusion(Double occlusion) {
        this.occlusion = occlusion;
        return this;
    }

    /**
     * 遮挡，取值范围[0-1]，分值越大遮挡问题越严重。
     * @return occlusion
     */
    public Double getOcclusion() {
        return occlusion;
    }

    public void setOcclusion(Double occlusion) {
        this.occlusion = occlusion;
    }

    public FaceQuality withIllumination(Double illumination) {
        this.illumination = illumination;
        return this;
    }

    /**
     * 光照，取值范围[0-1]，分值越大光照问题越严重。
     * @return illumination
     */
    public Double getIllumination() {
        return illumination;
    }

    public void setIllumination(Double illumination) {
        this.illumination = illumination;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FaceQuality faceQuality = (FaceQuality) o;
        return Objects.equals(this.totalScore, faceQuality.totalScore) && Objects.equals(this.blur, faceQuality.blur)
            && Objects.equals(this.pose, faceQuality.pose) && Objects.equals(this.occlusion, faceQuality.occlusion)
            && Objects.equals(this.illumination, faceQuality.illumination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalScore, blur, pose, occlusion, illumination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaceQuality {\n");
        sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
        sb.append("    blur: ").append(toIndentedString(blur)).append("\n");
        sb.append("    pose: ").append(toIndentedString(pose)).append("\n");
        sb.append("    occlusion: ").append(toIndentedString(occlusion)).append("\n");
        sb.append("    illumination: ").append(toIndentedString(illumination)).append("\n");
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
