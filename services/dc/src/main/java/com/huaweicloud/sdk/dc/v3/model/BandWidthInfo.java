package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 带宽信息
 */
public class BandWidthInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Integer bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcb_id")

    private String gcbId;

    public BandWidthInfo withBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 带宽值
     * minimum: 0
     * maximum: 268435455
     * @return bandwidthSize
     */
    public Integer getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public BandWidthInfo withGcbId(String gcbId) {
        this.gcbId = gcbId;
        return this;
    }

    /**
     * 购买全域互连带宽包ID
     * @return gcbId
     */
    public String getGcbId() {
        return gcbId;
    }

    public void setGcbId(String gcbId) {
        this.gcbId = gcbId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BandWidthInfo that = (BandWidthInfo) obj;
        return Objects.equals(this.bandwidthSize, that.bandwidthSize) && Objects.equals(this.gcbId, that.gcbId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthSize, gcbId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandWidthInfo {\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    gcbId: ").append(toIndentedString(gcbId)).append("\n");
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
