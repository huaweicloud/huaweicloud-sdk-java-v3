package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 带宽包实例ID。
 */
public class BandwidthPackageId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_package_id")

    private String bandwidthPackageId;

    public BandwidthPackageId withBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }

    /**
     * 带宽包实例ID。
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return bandwidthPackageId;
    }

    public void setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BandwidthPackageId that = (BandwidthPackageId) obj;
        return Objects.equals(this.bandwidthPackageId, that.bandwidthPackageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthPackageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthPackageId {\n");
        sb.append("    bandwidthPackageId: ").append(toIndentedString(bandwidthPackageId)).append("\n");
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
