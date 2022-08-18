package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateBandwidthRequestBody
 */
public class UpdateBandwidthRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_size")

    private Integer bandWidthSize;

    public UpdateBandwidthRequestBody withBandWidthSize(Integer bandWidthSize) {
        this.bandWidthSize = bandWidthSize;
        return this;
    }

    /**
     * - 小于等于300Mbit/s：默认最小增长步长为1Mbit/s。 - 300Mbit/s~1000Mbit/s：默认最小增长步长为50Mbit/s。 - 大于1000Mbit/s：默认最小增长步长为500Mbit/s。
     * @return bandWidthSize
     */
    public Integer getBandWidthSize() {
        return bandWidthSize;
    }

    public void setBandWidthSize(Integer bandWidthSize) {
        this.bandWidthSize = bandWidthSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateBandwidthRequestBody updateBandwidthRequestBody = (UpdateBandwidthRequestBody) o;
        return Objects.equals(this.bandWidthSize, updateBandwidthRequestBody.bandWidthSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandWidthSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBandwidthRequestBody {\n");
        sb.append("    bandWidthSize: ").append(toIndentedString(bandWidthSize)).append("\n");
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
