package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** OpenEngressEipReq */
public class OpenEngressEipReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private String bandwidthSize;

    public OpenEngressEipReq withBandwidthSize(String bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /** 出公网带宽 单位：Mbit/s
     * 
     * @return bandwidthSize */
    public String getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(String bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenEngressEipReq openEngressEipReq = (OpenEngressEipReq) o;
        return Objects.equals(this.bandwidthSize, openEngressEipReq.bandwidthSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenEngressEipReq {\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
