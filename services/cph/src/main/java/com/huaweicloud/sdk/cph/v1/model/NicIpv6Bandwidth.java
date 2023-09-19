package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 绑定的共享带宽信息，详情请参见 ipv6_bandwidth数据结构说明。
 */
public class NicIpv6Bandwidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_id")

    private String bandWidthId;

    public NicIpv6Bandwidth withBandWidthId(String bandWidthId) {
        this.bandWidthId = bandWidthId;
        return this;
    }

    /**
     * ipv6绑定的共享带宽ID。
     * @return bandWidthId
     */
    public String getBandWidthId() {
        return bandWidthId;
    }

    public void setBandWidthId(String bandWidthId) {
        this.bandWidthId = bandWidthId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NicIpv6Bandwidth that = (NicIpv6Bandwidth) obj;
        return Objects.equals(this.bandWidthId, that.bandWidthId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandWidthId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NicIpv6Bandwidth {\n");
        sb.append("    bandWidthId: ").append(toIndentedString(bandWidthId)).append("\n");
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
