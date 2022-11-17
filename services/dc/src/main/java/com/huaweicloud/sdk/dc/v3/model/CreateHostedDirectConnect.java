package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建托管专线参数对象
 */
public class CreateHostedDirectConnect {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosting_id")

    private String hostingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vlan")

    private Integer vlan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_tenant_id")

    private String resourceTenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_location")

    private String peerLocation;

    public CreateHostedDirectConnect withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 托管物理专线的名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateHostedDirectConnect withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 托管专线的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateHostedDirectConnect withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 指定托管专线接入带宽,单位Mbps
     * minimum: 2
     * maximum: 400000
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public CreateHostedDirectConnect withHostingId(String hostingId) {
        this.hostingId = hostingId;
        return this;
    }

    /**
     * hosted物理专线对应的hosting物理专线的ID
     * @return hostingId
     */
    public String getHostingId() {
        return hostingId;
    }

    public void setHostingId(String hostingId) {
        this.hostingId = hostingId;
    }

    public CreateHostedDirectConnect withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    /**
     * 指定托管(hosted)专线预分配的vlan
     * minimum: 0
     * maximum: 3999
     * @return vlan
     */
    public Integer getVlan() {
        return vlan;
    }

    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    public CreateHostedDirectConnect withResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }

    /**
     * 为其他租户创建托管专线，指定对应的租户ID
     * @return resourceTenantId
     */
    public String getResourceTenantId() {
        return resourceTenantId;
    }

    public void setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
    }

    public CreateHostedDirectConnect withPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }

    /**
     * 物理专线对端所在的物理位置，省/市/街道或IDC名字。
     * @return peerLocation
     */
    public String getPeerLocation() {
        return peerLocation;
    }

    public void setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateHostedDirectConnect createHostedDirectConnect = (CreateHostedDirectConnect) o;
        return Objects.equals(this.name, createHostedDirectConnect.name)
            && Objects.equals(this.description, createHostedDirectConnect.description)
            && Objects.equals(this.bandwidth, createHostedDirectConnect.bandwidth)
            && Objects.equals(this.hostingId, createHostedDirectConnect.hostingId)
            && Objects.equals(this.vlan, createHostedDirectConnect.vlan)
            && Objects.equals(this.resourceTenantId, createHostedDirectConnect.resourceTenantId)
            && Objects.equals(this.peerLocation, createHostedDirectConnect.peerLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, bandwidth, hostingId, vlan, resourceTenantId, peerLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHostedDirectConnect {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    hostingId: ").append(toIndentedString(hostingId)).append("\n");
        sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
        sb.append("    resourceTenantId: ").append(toIndentedString(resourceTenantId)).append("\n");
        sb.append("    peerLocation: ").append(toIndentedString(peerLocation)).append("\n");
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
