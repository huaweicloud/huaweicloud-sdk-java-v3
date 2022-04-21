package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 将弹性公网IP插入共享带宽的请求体
 */
public class AddPublicipsIntoSharedBandwidthRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private AddPublicipsIntoSharedBandwidthOption bandwidth;

    public AddPublicipsIntoSharedBandwidthRequestBody withBandwidth(AddPublicipsIntoSharedBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public AddPublicipsIntoSharedBandwidthRequestBody withBandwidth(
        Consumer<AddPublicipsIntoSharedBandwidthOption> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new AddPublicipsIntoSharedBandwidthOption();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public AddPublicipsIntoSharedBandwidthOption getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(AddPublicipsIntoSharedBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddPublicipsIntoSharedBandwidthRequestBody addPublicipsIntoSharedBandwidthRequestBody =
            (AddPublicipsIntoSharedBandwidthRequestBody) o;
        return Objects.equals(this.bandwidth, addPublicipsIntoSharedBandwidthRequestBody.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddPublicipsIntoSharedBandwidthRequestBody {\n");
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
