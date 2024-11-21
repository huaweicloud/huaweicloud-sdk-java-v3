package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateMolDockingJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vina_score")

    private Float vinaScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pose")

    private String pose;

    public CreateMolDockingJobResponse withVinaScore(Float vinaScore) {
        this.vinaScore = vinaScore;
        return this;
    }

    /**
     * 对接打分结果。
     * @return vinaScore
     */
    public Float getVinaScore() {
        return vinaScore;
    }

    public void setVinaScore(Float vinaScore) {
        this.vinaScore = vinaScore;
    }

    public CreateMolDockingJobResponse withPose(String pose) {
        this.pose = pose;
        return this;
    }

    /**
     * 对接构象。
     * @return pose
     */
    public String getPose() {
        return pose;
    }

    public void setPose(String pose) {
        this.pose = pose;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMolDockingJobResponse that = (CreateMolDockingJobResponse) obj;
        return Objects.equals(this.vinaScore, that.vinaScore) && Objects.equals(this.pose, that.pose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinaScore, pose);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMolDockingJobResponse {\n");
        sb.append("    vinaScore: ").append(toIndentedString(vinaScore)).append("\n");
        sb.append("    pose: ").append(toIndentedString(pose)).append("\n");
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
