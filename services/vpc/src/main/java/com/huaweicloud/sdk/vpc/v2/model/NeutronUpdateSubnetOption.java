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
public class NeutronUpdateSubnetOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_nameservers")

    private List<String> dnsNameservers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_dhcp")

    private Boolean enableDhcp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_routes")

    private List<HostRoute> hostRoutes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocation_pools")

    private List<AllocationPool> allocationPools = null;

    public NeutronUpdateSubnetOption withDnsNameservers(List<String> dnsNameservers) {
        this.dnsNameservers = dnsNameservers;
        return this;
    }

    public NeutronUpdateSubnetOption addDnsNameserversItem(String dnsNameserversItem) {
        if (this.dnsNameservers == null) {
            this.dnsNameservers = new ArrayList<>();
        }
        this.dnsNameservers.add(dnsNameserversItem);
        return this;
    }

    public NeutronUpdateSubnetOption withDnsNameservers(Consumer<List<String>> dnsNameserversSetter) {
        if (this.dnsNameservers == null) {
            this.dnsNameservers = new ArrayList<>();
        }
        dnsNameserversSetter.accept(this.dnsNameservers);
        return this;
    }

    /**
     * 功能说明：dns服务器 取值范围：IP地址格式例如：\"dns_nameservers\": [\"8.xx.xx.8\",\"8.xx.xx.4\"]，最多5个 默认值：不填时为空，无法使用云内网DNS功能 [内网DNS地址请参见](https://support.huaweicloud.com/dns_faq/dns_faq_002.html) [通过API获取请参见](https://support.huaweicloud.com/api-dns/dns_api_69001.html)
     * @return dnsNameservers
     */
    public List<String> getDnsNameservers() {
        return dnsNameservers;
    }

    public void setDnsNameservers(List<String> dnsNameservers) {
        this.dnsNameservers = dnsNameservers;
    }

    public NeutronUpdateSubnetOption withEnableDhcp(Boolean enableDhcp) {
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

    public NeutronUpdateSubnetOption withHostRoutes(List<HostRoute> hostRoutes) {
        this.hostRoutes = hostRoutes;
        return this;
    }

    public NeutronUpdateSubnetOption addHostRoutesItem(HostRoute hostRoutesItem) {
        if (this.hostRoutes == null) {
            this.hostRoutes = new ArrayList<>();
        }
        this.hostRoutes.add(hostRoutesItem);
        return this;
    }

    public NeutronUpdateSubnetOption withHostRoutes(Consumer<List<HostRoute>> hostRoutesSetter) {
        if (this.hostRoutes == null) {
            this.hostRoutes = new ArrayList<>();
        }
        hostRoutesSetter.accept(this.hostRoutes);
        return this;
    }

    /**
     * 功能说明：虚拟机静态路由，参见“host_route对象”表 约束：不支持，忽略输入信息
     * @return hostRoutes
     */
    public List<HostRoute> getHostRoutes() {
        return hostRoutes;
    }

    public void setHostRoutes(List<HostRoute> hostRoutes) {
        this.hostRoutes = hostRoutes;
    }

    public NeutronUpdateSubnetOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 子网的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NeutronUpdateSubnetOption withAllocationPools(List<AllocationPool> allocationPools) {
        this.allocationPools = allocationPools;
        return this;
    }

    public NeutronUpdateSubnetOption addAllocationPoolsItem(AllocationPool allocationPoolsItem) {
        if (this.allocationPools == null) {
            this.allocationPools = new ArrayList<>();
        }
        this.allocationPools.add(allocationPoolsItem);
        return this;
    }

    public NeutronUpdateSubnetOption withAllocationPools(Consumer<List<AllocationPool>> allocationPoolsSetter) {
        if (this.allocationPools == null) {
            this.allocationPools = new ArrayList<>();
        }
        allocationPoolsSetter.accept(this.allocationPools);
        return this;
    }

    /**
     * 功能说明：可用的IP池，allocation_pool对象参见表 allocation_pool对象 例如：[ { \"start\": \"10.0.0.2\", \"end\": \"10.0.0.251\"} ]每个子网的第1个和最后3个IP地址为系统保留地址。以192.168.1.0/24为例，192.168.1.0、 192.168.1.253、192.168.1.254和192.168.1.255这些地址是系统保留地址。系统预留地址默认不在allocation_pool范围内。 约束：更新时allocation_pool范围不能包含网关和广播地址的所有IP。
     * @return allocationPools
     */
    public List<AllocationPool> getAllocationPools() {
        return allocationPools;
    }

    public void setAllocationPools(List<AllocationPool> allocationPools) {
        this.allocationPools = allocationPools;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronUpdateSubnetOption that = (NeutronUpdateSubnetOption) obj;
        return Objects.equals(this.dnsNameservers, that.dnsNameservers)
            && Objects.equals(this.enableDhcp, that.enableDhcp) && Objects.equals(this.hostRoutes, that.hostRoutes)
            && Objects.equals(this.name, that.name) && Objects.equals(this.allocationPools, that.allocationPools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnsNameservers, enableDhcp, hostRoutes, name, allocationPools);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateSubnetOption {\n");
        sb.append("    dnsNameservers: ").append(toIndentedString(dnsNameservers)).append("\n");
        sb.append("    enableDhcp: ").append(toIndentedString(enableDhcp)).append("\n");
        sb.append("    hostRoutes: ").append(toIndentedString(hostRoutes)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    allocationPools: ").append(toIndentedString(allocationPools)).append("\n");
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
