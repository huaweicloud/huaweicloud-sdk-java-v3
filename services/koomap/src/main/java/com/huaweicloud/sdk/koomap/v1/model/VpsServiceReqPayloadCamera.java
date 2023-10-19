package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 相机内参。
 */
public class VpsServiceReqPayloadCamera {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fx")

    private Float fx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fy")

    private Float fy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cx")

    private Integer cx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cy")

    private Integer cy;

    public VpsServiceReqPayloadCamera withFx(Float fx) {
        this.fx = fx;
        return this;
    }

    /**
     * 相机内参，焦距fx。
     * @return fx
     */
    public Float getFx() {
        return fx;
    }

    public void setFx(Float fx) {
        this.fx = fx;
    }

    public VpsServiceReqPayloadCamera withFy(Float fy) {
        this.fy = fy;
        return this;
    }

    /**
     * 相机内参，焦距fy。
     * @return fy
     */
    public Float getFy() {
        return fy;
    }

    public void setFy(Float fy) {
        this.fy = fy;
    }

    public VpsServiceReqPayloadCamera withCx(Integer cx) {
        this.cx = cx;
        return this;
    }

    /**
     * 相机内参，相机光心坐标cx。
     * @return cx
     */
    public Integer getCx() {
        return cx;
    }

    public void setCx(Integer cx) {
        this.cx = cx;
    }

    public VpsServiceReqPayloadCamera withCy(Integer cy) {
        this.cy = cy;
        return this;
    }

    /**
     * 相机内参，相机光心坐标cy。
     * @return cy
     */
    public Integer getCy() {
        return cy;
    }

    public void setCy(Integer cy) {
        this.cy = cy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpsServiceReqPayloadCamera that = (VpsServiceReqPayloadCamera) obj;
        return Objects.equals(this.fx, that.fx) && Objects.equals(this.fy, that.fy) && Objects.equals(this.cx, that.cx)
            && Objects.equals(this.cy, that.cy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fx, fy, cx, cy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpsServiceReqPayloadCamera {\n");
        sb.append("    fx: ").append(toIndentedString(fx)).append("\n");
        sb.append("    fy: ").append(toIndentedString(fy)).append("\n");
        sb.append("    cx: ").append(toIndentedString(cx)).append("\n");
        sb.append("    cy: ").append(toIndentedString(cy)).append("\n");
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
