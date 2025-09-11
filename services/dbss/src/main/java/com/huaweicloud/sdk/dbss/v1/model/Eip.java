package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * EIP信息
 */
public class Eip {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private BandWidth bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipproductid")

    private String ipproductid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iptype")

    private String iptype;

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

    public Eip withIpproductid(String ipproductid) {
        this.ipproductid = ipproductid;
        return this;
    }

    /**
     * IP产品ID
     * @return ipproductid
     */
    public String getIpproductid() {
        return ipproductid;
    }

    public void setIpproductid(String ipproductid) {
        this.ipproductid = ipproductid;
    }

    public Eip withIptype(String iptype) {
        this.iptype = iptype;
        return this;
    }

    /**
     * EIP类型
     * @return iptype
     */
    public String getIptype() {
        return iptype;
    }

    public void setIptype(String iptype) {
        this.iptype = iptype;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Eip that = (Eip) obj;
        return Objects.equals(this.bandwidth, that.bandwidth) && Objects.equals(this.ipproductid, that.ipproductid)
            && Objects.equals(this.iptype, that.iptype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidth, ipproductid, iptype);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Eip {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    ipproductid: ").append(toIndentedString(ipproductid)).append("\n");
        sb.append("    iptype: ").append(toIndentedString(iptype)).append("\n");
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
