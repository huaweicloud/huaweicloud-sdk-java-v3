package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VpnGatewayRoutingTableEntryVo
 */
public class VpnGatewayRoutingTableEntryVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nexthop")

    private String nexthop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outbound_interface_ip")

    private String outboundInterfaceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin")

    private String origin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "as_path")

    private String asPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "med")

    private Long med;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nexthop_resource")

    private NexthopResourceVo nexthopResource;

    public VpnGatewayRoutingTableEntryVo withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 目的地址
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public VpnGatewayRoutingTableEntryVo withNexthop(String nexthop) {
        this.nexthop = nexthop;
        return this;
    }

    /**
     * 下一跳地址
     * @return nexthop
     */
    public String getNexthop() {
        return nexthop;
    }

    public void setNexthop(String nexthop) {
        this.nexthop = nexthop;
    }

    public VpnGatewayRoutingTableEntryVo withOutboundInterfaceIp(String outboundInterfaceIp) {
        this.outboundInterfaceIp = outboundInterfaceIp;
        return this;
    }

    /**
     * 出接口地址
     * @return outboundInterfaceIp
     */
    public String getOutboundInterfaceIp() {
        return outboundInterfaceIp;
    }

    public void setOutboundInterfaceIp(String outboundInterfaceIp) {
        this.outboundInterfaceIp = outboundInterfaceIp;
    }

    public VpnGatewayRoutingTableEntryVo withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * BGP路由来源
     * @return origin
     */
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public VpnGatewayRoutingTableEntryVo withAsPath(String asPath) {
        this.asPath = asPath;
        return this;
    }

    /**
     * BGP路由的AS路径
     * @return asPath
     */
    public String getAsPath() {
        return asPath;
    }

    public void setAsPath(String asPath) {
        this.asPath = asPath;
    }

    public VpnGatewayRoutingTableEntryVo withMed(Long med) {
        this.med = med;
        return this;
    }

    /**
     * BGP路由的MED值
     * @return med
     */
    public Long getMed() {
        return med;
    }

    public void setMed(Long med) {
        this.med = med;
    }

    public VpnGatewayRoutingTableEntryVo withNexthopResource(NexthopResourceVo nexthopResource) {
        this.nexthopResource = nexthopResource;
        return this;
    }

    public VpnGatewayRoutingTableEntryVo withNexthopResource(Consumer<NexthopResourceVo> nexthopResourceSetter) {
        if (this.nexthopResource == null) {
            this.nexthopResource = new NexthopResourceVo();
            nexthopResourceSetter.accept(this.nexthopResource);
        }

        return this;
    }

    /**
     * Get nexthopResource
     * @return nexthopResource
     */
    public NexthopResourceVo getNexthopResource() {
        return nexthopResource;
    }

    public void setNexthopResource(NexthopResourceVo nexthopResource) {
        this.nexthopResource = nexthopResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpnGatewayRoutingTableEntryVo that = (VpnGatewayRoutingTableEntryVo) obj;
        return Objects.equals(this.destination, that.destination) && Objects.equals(this.nexthop, that.nexthop)
            && Objects.equals(this.outboundInterfaceIp, that.outboundInterfaceIp)
            && Objects.equals(this.origin, that.origin) && Objects.equals(this.asPath, that.asPath)
            && Objects.equals(this.med, that.med) && Objects.equals(this.nexthopResource, that.nexthopResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, nexthop, outboundInterfaceIp, origin, asPath, med, nexthopResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpnGatewayRoutingTableEntryVo {\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
        sb.append("    outboundInterfaceIp: ").append(toIndentedString(outboundInterfaceIp)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    asPath: ").append(toIndentedString(asPath)).append("\n");
        sb.append("    med: ").append(toIndentedString(med)).append("\n");
        sb.append("    nexthopResource: ").append(toIndentedString(nexthopResource)).append("\n");
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
