package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IPv6 IP绑定带宽请求体。
 */
public class VirtualPortResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_bandwidth_id")

    private String ipv6BandwidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    public VirtualPortResponse withIpv6BandwidthId(String ipv6BandwidthId) {
        this.ipv6BandwidthId = ipv6BandwidthId;
        return this;
    }

    /**
     * IPv6带宽ID。
     * @return ipv6BandwidthId
     */
    public String getIpv6BandwidthId() {
        return ipv6BandwidthId;
    }

    public void setIpv6BandwidthId(String ipv6BandwidthId) {
        this.ipv6BandwidthId = ipv6BandwidthId;
    }

    public VirtualPortResponse withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * IPv6虚拟IP或私网IP ID。
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VirtualPortResponse that = (VirtualPortResponse) obj;
        return Objects.equals(this.ipv6BandwidthId, that.ipv6BandwidthId) && Objects.equals(this.portId, that.portId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipv6BandwidthId, portId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualPortResponse {\n");
        sb.append("    ipv6BandwidthId: ").append(toIndentedString(ipv6BandwidthId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
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
