package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShareTypeUsage
 */
public class ShareTypeUsage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private ShareTypeUsageCapacity capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private ShareTypeUsageBandwidth bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quantity")

    private ShareTypeUsageQuantity quantity;

    public ShareTypeUsage withCapacity(ShareTypeUsageCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    public ShareTypeUsage withCapacity(Consumer<ShareTypeUsageCapacity> capacitySetter) {
        if (this.capacity == null) {
            this.capacity = new ShareTypeUsageCapacity();
            capacitySetter.accept(this.capacity);
        }

        return this;
    }

    /**
     * Get capacity
     * @return capacity
     */
    public ShareTypeUsageCapacity getCapacity() {
        return capacity;
    }

    public void setCapacity(ShareTypeUsageCapacity capacity) {
        this.capacity = capacity;
    }

    public ShareTypeUsage withBandwidth(ShareTypeUsageBandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public ShareTypeUsage withBandwidth(Consumer<ShareTypeUsageBandwidth> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new ShareTypeUsageBandwidth();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public ShareTypeUsageBandwidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(ShareTypeUsageBandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    public ShareTypeUsage withQuantity(ShareTypeUsageQuantity quantity) {
        this.quantity = quantity;
        return this;
    }

    public ShareTypeUsage withQuantity(Consumer<ShareTypeUsageQuantity> quantitySetter) {
        if (this.quantity == null) {
            this.quantity = new ShareTypeUsageQuantity();
            quantitySetter.accept(this.quantity);
        }

        return this;
    }

    /**
     * Get quantity
     * @return quantity
     */
    public ShareTypeUsageQuantity getQuantity() {
        return quantity;
    }

    public void setQuantity(ShareTypeUsageQuantity quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShareTypeUsage that = (ShareTypeUsage) obj;
        return Objects.equals(this.capacity, that.capacity) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, bandwidth, quantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShareTypeUsage {\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
