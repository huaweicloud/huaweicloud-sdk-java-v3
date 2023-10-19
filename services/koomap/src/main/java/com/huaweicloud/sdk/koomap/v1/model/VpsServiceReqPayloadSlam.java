package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VpsServiceReqPayloadSlam
 */
public class VpsServiceReqPayloadSlam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x")

    private Double x;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "y")

    private Double y;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "z")

    private Double z;

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

    public VpsServiceReqPayloadSlam withX(Double x) {
        this.x = x;
        return this;
    }

    /**
     * 坐标参数x。
     * @return x
     */
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public VpsServiceReqPayloadSlam withY(Double y) {
        this.y = y;
        return this;
    }

    /**
     * 坐标参数y。
     * @return y
     */
    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public VpsServiceReqPayloadSlam withZ(Double z) {
        this.z = z;
        return this;
    }

    /**
     * 坐标参数z。
     * @return z
     */
    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public VpsServiceReqPayloadSlam withQx(Double qx) {
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

    public VpsServiceReqPayloadSlam withQy(Double qy) {
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

    public VpsServiceReqPayloadSlam withQz(Double qz) {
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

    public VpsServiceReqPayloadSlam withQw(Double qw) {
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
        VpsServiceReqPayloadSlam that = (VpsServiceReqPayloadSlam) obj;
        return Objects.equals(this.x, that.x) && Objects.equals(this.y, that.y) && Objects.equals(this.z, that.z)
            && Objects.equals(this.qx, that.qx) && Objects.equals(this.qy, that.qy) && Objects.equals(this.qz, that.qz)
            && Objects.equals(this.qw, that.qw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, qx, qy, qz, qw);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpsServiceReqPayloadSlam {\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
        sb.append("    z: ").append(toIndentedString(z)).append("\n");
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
