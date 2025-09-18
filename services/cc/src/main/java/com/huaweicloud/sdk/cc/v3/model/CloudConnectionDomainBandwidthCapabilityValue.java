package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CloudConnectionDomainBandwidthCapabilityValue
 */
public class CloudConnectionDomainBandwidthCapabilityValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private CloudConnectionDomainBandwidthValue bandwidth;

    public CloudConnectionDomainBandwidthCapabilityValue withBandwidth(CloudConnectionDomainBandwidthValue bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public CloudConnectionDomainBandwidthCapabilityValue withBandwidth(
        Consumer<CloudConnectionDomainBandwidthValue> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new CloudConnectionDomainBandwidthValue();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public CloudConnectionDomainBandwidthValue getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(CloudConnectionDomainBandwidthValue bandwidth) {
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
        CloudConnectionDomainBandwidthCapabilityValue that = (CloudConnectionDomainBandwidthCapabilityValue) obj;
        return Objects.equals(this.bandwidth, that.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudConnectionDomainBandwidthCapabilityValue {\n");
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
