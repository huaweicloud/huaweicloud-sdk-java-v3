package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建弹性公网IP请求体。
 */
public class CreatePublicIpRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private CreatePublicIpOption publicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private CreatePublicIpBandwidthOption bandwidth;

    public CreatePublicIpRequestBody withPublicip(CreatePublicIpOption publicip) {
        this.publicip = publicip;
        return this;
    }

    public CreatePublicIpRequestBody withPublicip(Consumer<CreatePublicIpOption> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new CreatePublicIpOption();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public CreatePublicIpOption getPublicip() {
        return publicip;
    }

    public void setPublicip(CreatePublicIpOption publicip) {
        this.publicip = publicip;
    }

    public CreatePublicIpRequestBody withBandwidth(CreatePublicIpBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public CreatePublicIpRequestBody withBandwidth(Consumer<CreatePublicIpBandwidthOption> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new CreatePublicIpBandwidthOption();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public CreatePublicIpBandwidthOption getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(CreatePublicIpBandwidthOption bandwidth) {
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
        CreatePublicIpRequestBody that = (CreatePublicIpRequestBody) obj;
        return Objects.equals(this.publicip, that.publicip) && Objects.equals(this.bandwidth, that.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicip, bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePublicIpRequestBody {\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
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
