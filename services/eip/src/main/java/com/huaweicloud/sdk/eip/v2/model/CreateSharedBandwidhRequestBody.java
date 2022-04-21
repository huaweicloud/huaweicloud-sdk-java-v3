package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建共享带宽请求体
 */
public class CreateSharedBandwidhRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private CreateSharedBandwidthOption bandwidth;

    public CreateSharedBandwidhRequestBody withBandwidth(CreateSharedBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public CreateSharedBandwidhRequestBody withBandwidth(Consumer<CreateSharedBandwidthOption> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new CreateSharedBandwidthOption();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public CreateSharedBandwidthOption getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(CreateSharedBandwidthOption bandwidth) {
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
        CreateSharedBandwidhRequestBody createSharedBandwidhRequestBody = (CreateSharedBandwidhRequestBody) o;
        return Objects.equals(this.bandwidth, createSharedBandwidhRequestBody.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSharedBandwidhRequestBody {\n");
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
