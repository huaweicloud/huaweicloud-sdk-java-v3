package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CreateSharedBandwidthResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private BandwidthResp bandwidth;

    public CreateSharedBandwidthResponse withBandwidth(BandwidthResp bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public CreateSharedBandwidthResponse withBandwidth(Consumer<BandwidthResp> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new BandwidthResp();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /** Get bandwidth
     * 
     * @return bandwidth */
    public BandwidthResp getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BandwidthResp bandwidth) {
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
        CreateSharedBandwidthResponse createSharedBandwidthResponse = (CreateSharedBandwidthResponse) o;
        return Objects.equals(this.bandwidth, createSharedBandwidthResponse.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSharedBandwidthResponse {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
