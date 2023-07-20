package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 共享带宽移出弹性公网IP请求对象
 */
public class DetachSharedbwReqPublicip {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private DetachSharedbwDict bandwidth;

    public DetachSharedbwReqPublicip withBandwidth(DetachSharedbwDict bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public DetachSharedbwReqPublicip withBandwidth(Consumer<DetachSharedbwDict> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new DetachSharedbwDict();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public DetachSharedbwDict getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(DetachSharedbwDict bandwidth) {
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
        DetachSharedbwReqPublicip that = (DetachSharedbwReqPublicip) obj;
        return Objects.equals(this.bandwidth, that.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachSharedbwReqPublicip {\n");
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
