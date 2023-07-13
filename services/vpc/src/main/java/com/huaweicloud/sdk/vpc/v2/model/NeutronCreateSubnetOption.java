package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronCreateSubnetOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_id")

    private String networkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_ip")

    private String gatewayIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocation_pools")

    private List<AllocationPool> allocationPools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_nameservers")

    private List<String> dnsNameservers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_routes")

    private List<HostRoute> hostRoutes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_dhcp")

    private Boolean enableDhcp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_address_mode")

    private String ipv6AddressMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_ra_mode")

    private String ipv6RaMode;

    public NeutronCreateSubnetOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：子网的名称 取值范围：0-255个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NeutronCreateSubnetOption withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 功能说明：子网网段 取值范围：必须是cidr格式，只支持10.0.0.0/8,172.16.0.0/12,192.168.0.0/16三个网段内的地址，掩码长度不能大于28
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public NeutronCreateSubnetOption withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * 功能说明：子网所属网络ID
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public NeutronCreateSubnetOption withGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
        return this;
    }

    /**
     * 功能说明：子网网关 取值范围：子网网段中的IP地址 约束：必须是ip格式
     * @return gatewayIp
     */
    public String getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
    }

    public NeutronCreateSubnetOption withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * 功能说明：IP版本信息 取值范围：4或者6(特定局点)
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public NeutronCreateSubnetOption withAllocationPools(List<AllocationPool> allocationPools) {
        this.allocationPools = allocationPools;
        return this;
    }

    public NeutronCreateSubnetOption addAllocationPoolsItem(AllocationPool allocationPoolsItem) {
        if (this.allocationPools == null) {
            this.allocationPools = new ArrayList<>();
        }
        this.allocationPools.add(allocationPoolsItem);
        return this;
    }

    public NeutronCreateSubnetOption withAllocationPools(Consumer<List<AllocationPool>> allocationPoolsSetter) {
        if (this.allocationPools == null) {
            this.allocationPools = new ArrayList<>();
        }
        allocationPoolsSetter.accept(this.allocationPools);
        return this;
    }

    /**
     * 功能说明：可用的IP池，allocation_pool对象参见allocation_pool对象 例如：[ { \"start\": \"10.0.0.2\", \"end\": \"10.0.0.251\"} ]每个子网的第1个和最后4个IP地址为系统保留地址。以192.168.1.0/24为例，192.168.1.0、 192.168.1.252、192.168.1.253、192.168.1.254和192.168.1.255这些地址是系统保留地址。系统预留地址默认不在allocation_pool范围内。 约束：更新时allocation_pool范围不能包含网关和广播地址的所有IP。
     * @return allocationPools
     */
    public List<AllocationPool> getAllocationPools() {
        return allocationPools;
    }

    public void setAllocationPools(List<AllocationPool> allocationPools) {
        this.allocationPools = allocationPools;
    }

    public NeutronCreateSubnetOption withDnsNameservers(List<String> dnsNameservers) {
        this.dnsNameservers = dnsNameservers;
        return this;
    }

    public NeutronCreateSubnetOption addDnsNameserversItem(String dnsNameserversItem) {
        if (this.dnsNameservers == null) {
            this.dnsNameservers = new ArrayList<>();
        }
        this.dnsNameservers.add(dnsNameserversItem);
        return this;
    }

    public NeutronCreateSubnetOption withDnsNameservers(Consumer<List<String>> dnsNameserversSetter) {
        if (this.dnsNameservers == null) {
            this.dnsNameservers = new ArrayList<>();
        }
        dnsNameserversSetter.accept(this.dnsNameservers);
        return this;
    }

    /**
     * 功能说明：子网关联的DNS名称服务器列表 取值范围：IP地址格式例如：\"dns_nameservers\": [\"8.xx.xx.8\",\"8.xx.xx.4\"] 默认值：不填时为空，无法使用云内网DNS功能 [内网DNS地址请参见](https://support.huaweicloud.com/dns_faq/dns_faq_002.html) [通过API获取请参见](https://support.huaweicloud.com/api-dns/dns_api_69001.html)
     * @return dnsNameservers
     */
    public List<String> getDnsNameservers() {
        return dnsNameservers;
    }

    public void setDnsNameservers(List<String> dnsNameservers) {
        this.dnsNameservers = dnsNameservers;
    }

    public NeutronCreateSubnetOption withHostRoutes(List<HostRoute> hostRoutes) {
        this.hostRoutes = hostRoutes;
        return this;
    }

    public NeutronCreateSubnetOption addHostRoutesItem(HostRoute hostRoutesItem) {
        if (this.hostRoutes == null) {
            this.hostRoutes = new ArrayList<>();
        }
        this.hostRoutes.add(hostRoutesItem);
        return this;
    }

    public NeutronCreateSubnetOption withHostRoutes(Consumer<List<HostRoute>> hostRoutesSetter) {
        if (this.hostRoutes == null) {
            this.hostRoutes = new ArrayList<>();
        }
        hostRoutesSetter.accept(this.hostRoutes);
        return this;
    }

    /**
     * 功能说明：虚拟机静态路由，参见“host_route对象”表 约束：不支持设置
     * @return hostRoutes
     */
    public List<HostRoute> getHostRoutes() {
        return hostRoutes;
    }

    public void setHostRoutes(List<HostRoute> hostRoutes) {
        this.hostRoutes = hostRoutes;
    }

    public NeutronCreateSubnetOption withEnableDhcp(Boolean enableDhcp) {
        this.enableDhcp = enableDhcp;
        return this;
    }

    /**
     * 功能说明：是否启动dhcp，false表示不提供dhcp服务的能力 约束：只支持true
     * @return enableDhcp
     */
    public Boolean getEnableDhcp() {
        return enableDhcp;
    }

    public void setEnableDhcp(Boolean enableDhcp) {
        this.enableDhcp = enableDhcp;
    }

    public NeutronCreateSubnetOption withIpv6AddressMode(String ipv6AddressMode) {
        this.ipv6AddressMode = ipv6AddressMode;
        return this;
    }

    /**
     * 功能说明：IPv6寻址模式 取值范围：dhcpv6-stateful
     * @return ipv6AddressMode
     */
    public String getIpv6AddressMode() {
        return ipv6AddressMode;
    }

    public void setIpv6AddressMode(String ipv6AddressMode) {
        this.ipv6AddressMode = ipv6AddressMode;
    }

    public NeutronCreateSubnetOption withIpv6RaMode(String ipv6RaMode) {
        this.ipv6RaMode = ipv6RaMode;
        return this;
    }

    /**
     * 功能说明：IPv6路由广播模式 取值范围：dhcpv6-stateful
     * @return ipv6RaMode
     */
    public String getIpv6RaMode() {
        return ipv6RaMode;
    }

    public void setIpv6RaMode(String ipv6RaMode) {
        this.ipv6RaMode = ipv6RaMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronCreateSubnetOption that = (NeutronCreateSubnetOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.cidr, that.cidr)
            && Objects.equals(this.networkId, that.networkId) && Objects.equals(this.gatewayIp, that.gatewayIp)
            && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.allocationPools, that.allocationPools)
            && Objects.equals(this.dnsNameservers, that.dnsNameservers)
            && Objects.equals(this.hostRoutes, that.hostRoutes) && Objects.equals(this.enableDhcp, that.enableDhcp)
            && Objects.equals(this.ipv6AddressMode, that.ipv6AddressMode)
            && Objects.equals(this.ipv6RaMode, that.ipv6RaMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            cidr,
            networkId,
            gatewayIp,
            ipVersion,
            allocationPools,
            dnsNameservers,
            hostRoutes,
            enableDhcp,
            ipv6AddressMode,
            ipv6RaMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateSubnetOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    allocationPools: ").append(toIndentedString(allocationPools)).append("\n");
        sb.append("    dnsNameservers: ").append(toIndentedString(dnsNameservers)).append("\n");
        sb.append("    hostRoutes: ").append(toIndentedString(hostRoutes)).append("\n");
        sb.append("    enableDhcp: ").append(toIndentedString(enableDhcp)).append("\n");
        sb.append("    ipv6AddressMode: ").append(toIndentedString(ipv6AddressMode)).append("\n");
        sb.append("    ipv6RaMode: ").append(toIndentedString(ipv6RaMode)).append("\n");
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
