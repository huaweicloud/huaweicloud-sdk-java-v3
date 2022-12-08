package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 弹性IP
 */
public class Eip {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_type")

    private String ipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_product_id")

    private String ipProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private BandWidth bandwidth;

    public Eip withIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * eip的类型
     * @return ipType
     */
    public String getIpType() {
        return ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public Eip withIpProductId(String ipProductId) {
        this.ipProductId = ipProductId;
        return this;
    }

    /**
     * IP地址对应产品ID
     * @return ipProductId
     */
    public String getIpProductId() {
        return ipProductId;
    }

    public void setIpProductId(String ipProductId) {
        this.ipProductId = ipProductId;
    }

    public Eip withBandwidth(BandWidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public Eip withBandwidth(Consumer<BandWidth> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new BandWidth();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public BandWidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BandWidth bandwidth) {
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
        Eip eip = (Eip) o;
        return Objects.equals(this.ipType, eip.ipType) && Objects.equals(this.ipProductId, eip.ipProductId)
            && Objects.equals(this.bandwidth, eip.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipType, ipProductId, bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Eip {\n");
        sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
        sb.append("    ipProductId: ").append(toIndentedString(ipProductId)).append("\n");
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
