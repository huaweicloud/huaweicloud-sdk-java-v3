package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AddPublicipsIntoSharedBandwidthResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private BandwidthRespInsert bandwidth;

    public AddPublicipsIntoSharedBandwidthResponse withBandwidth(BandwidthRespInsert bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public AddPublicipsIntoSharedBandwidthResponse withBandwidth(Consumer<BandwidthRespInsert> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new BandwidthRespInsert();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public BandwidthRespInsert getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BandwidthRespInsert bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddPublicipsIntoSharedBandwidthResponse that = (AddPublicipsIntoSharedBandwidthResponse) obj;
        return Objects.equals(this.bandwidth, that.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddPublicipsIntoSharedBandwidthResponse {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
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
