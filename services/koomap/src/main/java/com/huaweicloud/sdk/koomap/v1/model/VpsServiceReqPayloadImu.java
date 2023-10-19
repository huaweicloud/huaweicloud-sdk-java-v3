package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VpsServiceReqPayloadImu
 */
public class VpsServiceReqPayloadImu {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accuracy")

    private Double accuracy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azimuth")

    private Double azimuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roll")

    private Double roll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pitch")

    private Double pitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qx")

    private Double qx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qy")

    private Double qy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qz")

    private Double qz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qw")

    private Double qw;

    public VpsServiceReqPayloadImu withAccuracy(Double accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    /**
     * 误差值。
     * @return accuracy
     */
    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public VpsServiceReqPayloadImu withAzimuth(Double azimuth) {
        this.azimuth = azimuth;
        return this;
    }

    /**
     * 欧拉角参数。
     * @return azimuth
     */
    public Double getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(Double azimuth) {
        this.azimuth = azimuth;
    }

    public VpsServiceReqPayloadImu withRoll(Double roll) {
        this.roll = roll;
        return this;
    }

    /**
     * 欧拉角参数。
     * @return roll
     */
    public Double getRoll() {
        return roll;
    }

    public void setRoll(Double roll) {
        this.roll = roll;
    }

    public VpsServiceReqPayloadImu withPitch(Double pitch) {
        this.pitch = pitch;
        return this;
    }

    /**
     * 欧拉角参数。
     * @return pitch
     */
    public Double getPitch() {
        return pitch;
    }

    public void setPitch(Double pitch) {
        this.pitch = pitch;
    }

    public VpsServiceReqPayloadImu withQx(Double qx) {
        this.qx = qx;
        return this;
    }

    /**
     * 旋转向量qx。
     * @return qx
     */
    public Double getQx() {
        return qx;
    }

    public void setQx(Double qx) {
        this.qx = qx;
    }

    public VpsServiceReqPayloadImu withQy(Double qy) {
        this.qy = qy;
        return this;
    }

    /**
     * 旋转向量qy。
     * @return qy
     */
    public Double getQy() {
        return qy;
    }

    public void setQy(Double qy) {
        this.qy = qy;
    }

    public VpsServiceReqPayloadImu withQz(Double qz) {
        this.qz = qz;
        return this;
    }

    /**
     * 旋转向量qz。
     * @return qz
     */
    public Double getQz() {
        return qz;
    }

    public void setQz(Double qz) {
        this.qz = qz;
    }

    public VpsServiceReqPayloadImu withQw(Double qw) {
        this.qw = qw;
        return this;
    }

    /**
     * 旋转向量qw。
     * @return qw
     */
    public Double getQw() {
        return qw;
    }

    public void setQw(Double qw) {
        this.qw = qw;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpsServiceReqPayloadImu that = (VpsServiceReqPayloadImu) obj;
        return Objects.equals(this.accuracy, that.accuracy) && Objects.equals(this.azimuth, that.azimuth)
            && Objects.equals(this.roll, that.roll) && Objects.equals(this.pitch, that.pitch)
            && Objects.equals(this.qx, that.qx) && Objects.equals(this.qy, that.qy) && Objects.equals(this.qz, that.qz)
            && Objects.equals(this.qw, that.qw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accuracy, azimuth, roll, pitch, qx, qy, qz, qw);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpsServiceReqPayloadImu {\n");
        sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
        sb.append("    azimuth: ").append(toIndentedString(azimuth)).append("\n");
        sb.append("    roll: ").append(toIndentedString(roll)).append("\n");
        sb.append("    pitch: ").append(toIndentedString(pitch)).append("\n");
        sb.append("    qx: ").append(toIndentedString(qx)).append("\n");
        sb.append("    qy: ").append(toIndentedString(qy)).append("\n");
        sb.append("    qz: ").append(toIndentedString(qz)).append("\n");
        sb.append("    qw: ").append(toIndentedString(qw)).append("\n");
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
