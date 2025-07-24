package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShareTypesAttribution
 */
public class ShareTypesAttribution {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private ShareTypesAttributionCapacity capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private ShareTypesAttributionBandwidth bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iops")

    private ShareTypesAttributionIops iops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_channel_4k_latency")

    private ShareTypesAttributionSingleChannel4KLatency singleChannel4kLatency;

    public ShareTypesAttribution withCapacity(ShareTypesAttributionCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    public ShareTypesAttribution withCapacity(Consumer<ShareTypesAttributionCapacity> capacitySetter) {
        if (this.capacity == null) {
            this.capacity = new ShareTypesAttributionCapacity();
            capacitySetter.accept(this.capacity);
        }

        return this;
    }

    /**
     * Get capacity
     * @return capacity
     */
    public ShareTypesAttributionCapacity getCapacity() {
        return capacity;
    }

    public void setCapacity(ShareTypesAttributionCapacity capacity) {
        this.capacity = capacity;
    }

    public ShareTypesAttribution withBandwidth(ShareTypesAttributionBandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public ShareTypesAttribution withBandwidth(Consumer<ShareTypesAttributionBandwidth> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new ShareTypesAttributionBandwidth();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public ShareTypesAttributionBandwidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(ShareTypesAttributionBandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    public ShareTypesAttribution withIops(ShareTypesAttributionIops iops) {
        this.iops = iops;
        return this;
    }

    public ShareTypesAttribution withIops(Consumer<ShareTypesAttributionIops> iopsSetter) {
        if (this.iops == null) {
            this.iops = new ShareTypesAttributionIops();
            iopsSetter.accept(this.iops);
        }

        return this;
    }

    /**
     * Get iops
     * @return iops
     */
    public ShareTypesAttributionIops getIops() {
        return iops;
    }

    public void setIops(ShareTypesAttributionIops iops) {
        this.iops = iops;
    }

    public ShareTypesAttribution withSingleChannel4kLatency(
        ShareTypesAttributionSingleChannel4KLatency singleChannel4kLatency) {
        this.singleChannel4kLatency = singleChannel4kLatency;
        return this;
    }

    public ShareTypesAttribution withSingleChannel4kLatency(
        Consumer<ShareTypesAttributionSingleChannel4KLatency> singleChannel4kLatencySetter) {
        if (this.singleChannel4kLatency == null) {
            this.singleChannel4kLatency = new ShareTypesAttributionSingleChannel4KLatency();
            singleChannel4kLatencySetter.accept(this.singleChannel4kLatency);
        }

        return this;
    }

    /**
     * Get singleChannel4kLatency
     * @return singleChannel4kLatency
     */
    public ShareTypesAttributionSingleChannel4KLatency getSingleChannel4kLatency() {
        return singleChannel4kLatency;
    }

    public void setSingleChannel4kLatency(ShareTypesAttributionSingleChannel4KLatency singleChannel4kLatency) {
        this.singleChannel4kLatency = singleChannel4kLatency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShareTypesAttribution that = (ShareTypesAttribution) obj;
        return Objects.equals(this.capacity, that.capacity) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.iops, that.iops)
            && Objects.equals(this.singleChannel4kLatency, that.singleChannel4kLatency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, bandwidth, iops, singleChannel4kLatency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShareTypesAttribution {\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
        sb.append("    singleChannel4kLatency: ").append(toIndentedString(singleChannel4kLatency)).append("\n");
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
