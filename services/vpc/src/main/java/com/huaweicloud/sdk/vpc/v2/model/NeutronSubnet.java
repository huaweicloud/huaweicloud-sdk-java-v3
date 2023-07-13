package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronSubnet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocation_pools")

    private List<AllocationPool> allocationPools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_nameservers")

    private List<String> dnsNameservers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_dhcp")

    private Boolean enableDhcp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_ip")

    private String gatewayIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_routes")

    private List<HostRoute> hostRoutes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_address_mode")

    private String ipv6AddressMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_ra_mode")

    private String ipv6RaMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_id")

    private String networkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetpool_id")

    private String subnetpoolId;

    public NeutronSubnet withAllocationPools(List<AllocationPool> allocationPools) {
        this.allocationPools = allocationPools;
        return this;
    }

    public NeutronSubnet addAllocationPoolsItem(AllocationPool allocationPoolsItem) {
        if (this.allocationPools == null) {
            this.allocationPools = new ArrayList<>();
        }
        this.allocationPools.add(allocationPoolsItem);
        return this;
    }

    public NeutronSubnet withAllocationPools(Consumer<List<AllocationPool>> allocationPoolsSetter) {
        if (this.allocationPools == null) {
            this.allocationPools = new ArrayList<>();
        }
        allocationPoolsSetter.accept(this.allocationPools);
        return this;
    }

    /**
     * 功能说明：可用的IP池，allocation_pool对象参见 allocation_pool对象 例如：[ { \"start\": \"10.0.0.2\", \"end\": \"10.0.0.251\"} ]每个子网的第1个和最后4个IP地址为系统保留地址。以192.168.1.0/24为例，192.168.1.0、 192.168.1.252、192.168.1.253、192.168.1.254和192.168.1.255这些地址是系统保留地址。系统预留地址默认不在allocation_pool范围内 约束：更新时allocation_pool范围不能包含网关和广播地址的所有IP。
     * @return allocationPools
     */
    public List<AllocationPool> getAllocationPools() {
        return allocationPools;
    }

    public void setAllocationPools(List<AllocationPool> allocationPools) {
        this.allocationPools = allocationPools;
    }

    public NeutronSubnet withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 功能说明：子网网段 取值范围：CIDR格式，只支持10.0.0.0/8,172.16.0.0/12,192.168.0.0/16三个网段内的地址，掩码长度不能大于28 约束：当ip_version=6时，该字段不支持设置
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public NeutronSubnet withDnsNameservers(List<String> dnsNameservers) {
        this.dnsNameservers = dnsNameservers;
        return this;
    }

    public NeutronSubnet addDnsNameserversItem(String dnsNameserversItem) {
        if (this.dnsNameservers == null) {
            this.dnsNameservers = new ArrayList<>();
        }
        this.dnsNameservers.add(dnsNameserversItem);
        return this;
    }

    public NeutronSubnet withDnsNameservers(Consumer<List<String>> dnsNameserversSetter) {
        if (this.dnsNameservers == null) {
            this.dnsNameservers = new ArrayList<>();
        }
        dnsNameserversSetter.accept(this.dnsNameservers);
        return this;
    }

    /**
     * 功能说明：子网关联的DNS名称服务器列表 取值范围：IP地址格式例如：\"dns_nameservers\": [\"8.xx.xx.8\",\"8.xx.xx.4\"]； 默认值：不填时为空，无法使用云内网DNS功能
     * @return dnsNameservers
     */
    public List<String> getDnsNameservers() {
        return dnsNameservers;
    }

    public void setDnsNameservers(List<String> dnsNameservers) {
        this.dnsNameservers = dnsNameservers;
    }

    public NeutronSubnet withEnableDhcp(Boolean enableDhcp) {
        this.enableDhcp = enableDhcp;
        return this;
    }

    /**
     * 功能说明：是否启动dhcp 取值范围：只支持true
     * @return enableDhcp
     */
    public Boolean getEnableDhcp() {
        return enableDhcp;
    }

    public void setEnableDhcp(Boolean enableDhcp) {
        this.enableDhcp = enableDhcp;
    }

    public NeutronSubnet withGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
        return this;
    }

    /**
     * 功能说明：子网网关IP  取值范围：本子网网段内的可用IP  约束：不允许和allocation_pools地址块冲突；ip_version=6时该字段不支持设置 默认值：本子网网段内第一个可用IP
     * @return gatewayIp
     */
    public String getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
    }

    public NeutronSubnet withHostRoutes(List<HostRoute> hostRoutes) {
        this.hostRoutes = hostRoutes;
        return this;
    }

    public NeutronSubnet addHostRoutesItem(HostRoute hostRoutesItem) {
        if (this.hostRoutes == null) {
            this.hostRoutes = new ArrayList<>();
        }
        this.hostRoutes.add(hostRoutesItem);
        return this;
    }

    public NeutronSubnet withHostRoutes(Consumer<List<HostRoute>> hostRoutesSetter) {
        if (this.hostRoutes == null) {
            this.hostRoutes = new ArrayList<>();
        }
        hostRoutesSetter.accept(this.hostRoutes);
        return this;
    }

    /**
     * 虚拟机静态路由，参见“host_route对象”表
     * @return hostRoutes
     */
    public List<HostRoute> getHostRoutes() {
        return hostRoutes;
    }

    public void setHostRoutes(List<HostRoute> hostRoutes) {
        this.hostRoutes = hostRoutes;
    }

    public NeutronSubnet withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 子网ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NeutronSubnet withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * 功能说明：IP协议版本 取值范围：4或6(支持后)
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public NeutronSubnet withIpv6AddressMode(String ipv6AddressMode) {
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

    public NeutronSubnet withIpv6RaMode(String ipv6RaMode) {
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

    public NeutronSubnet withName(String name) {
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

    public NeutronSubnet withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * 所属网络的ID
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public NeutronSubnet withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public NeutronSubnet withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public NeutronSubnet withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 功能说明：资源创建UTC时间 格式：yyyy-MM-ddTHH:mm:ss
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public NeutronSubnet withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 功能说明：资源更新UTC时间 格式：yyyy-MM-ddTHH:mm:ss
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public NeutronSubnet withSubnetpoolId(String subnetpoolId) {
        this.subnetpoolId = subnetpoolId;
        return this;
    }

    /**
     * 子网池id 【使用说明】目前IPv4不支持，IPv6支持
     * @return subnetpoolId
     */
    public String getSubnetpoolId() {
        return subnetpoolId;
    }

    public void setSubnetpoolId(String subnetpoolId) {
        this.subnetpoolId = subnetpoolId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronSubnet that = (NeutronSubnet) obj;
        return Objects.equals(this.allocationPools, that.allocationPools) && Objects.equals(this.cidr, that.cidr)
            && Objects.equals(this.dnsNameservers, that.dnsNameservers)
            && Objects.equals(this.enableDhcp, that.enableDhcp) && Objects.equals(this.gatewayIp, that.gatewayIp)
            && Objects.equals(this.hostRoutes, that.hostRoutes) && Objects.equals(this.id, that.id)
            && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.ipv6AddressMode, that.ipv6AddressMode)
            && Objects.equals(this.ipv6RaMode, that.ipv6RaMode) && Objects.equals(this.name, that.name)
            && Objects.equals(this.networkId, that.networkId) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.subnetpoolId, that.subnetpoolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allocationPools,
            cidr,
            dnsNameservers,
            enableDhcp,
            gatewayIp,
            hostRoutes,
            id,
            ipVersion,
            ipv6AddressMode,
            ipv6RaMode,
            name,
            networkId,
            tenantId,
            projectId,
            createdAt,
            updatedAt,
            subnetpoolId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronSubnet {\n");
        sb.append("    allocationPools: ").append(toIndentedString(allocationPools)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    dnsNameservers: ").append(toIndentedString(dnsNameservers)).append("\n");
        sb.append("    enableDhcp: ").append(toIndentedString(enableDhcp)).append("\n");
        sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
        sb.append("    hostRoutes: ").append(toIndentedString(hostRoutes)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    ipv6AddressMode: ").append(toIndentedString(ipv6AddressMode)).append("\n");
        sb.append("    ipv6RaMode: ").append(toIndentedString(ipv6RaMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    subnetpoolId: ").append(toIndentedString(subnetpoolId)).append("\n");
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
