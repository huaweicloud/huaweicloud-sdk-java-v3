package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * IpDetails
 */
public class IpDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    @JacksonXmlProperty(localName = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    @JacksonXmlProperty(localName = "bandwidth_size")

    private Integer bandwidthSize;

    public IpDetails withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * IP地址
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public IpDetails withBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 带宽大小
     * @return bandwidthSize
     */
    public Integer getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IpDetails ipDetails = (IpDetails) o;
        return Objects.equals(this.ipAddress, ipDetails.ipAddress)
            && Objects.equals(this.bandwidthSize, ipDetails.bandwidthSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddress, bandwidthSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpDetails {\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
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
