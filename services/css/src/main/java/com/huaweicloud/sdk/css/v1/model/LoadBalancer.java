package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LoadBalancer
 */
public class LoadBalancer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guaranteed")

    private String guaranteed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private String billingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    private String provisioningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners")

    private List<IdListWrapper> listeners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_address")

    private String vipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_port_id")

    private String vipPortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_address")

    private String ipv6VipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicips")

    private List<PublicIpInfo> publicips = null;

    public LoadBalancer withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 负载均衡器ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoadBalancer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 负载均衡器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoadBalancer withGuaranteed(String guaranteed) {
        this.guaranteed = guaranteed;
        return this;
    }

    /**
     * 是否独享型负载均衡器。
     * @return guaranteed
     */
    public String getGuaranteed() {
        return guaranteed;
    }

    public void setGuaranteed(String guaranteed) {
        this.guaranteed = guaranteed;
    }

    public LoadBalancer withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /**
     * 资源账单信息。
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public LoadBalancer withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LoadBalancer withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 负载均衡器所属VPC ID，即虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public LoadBalancer withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /**
     * 负载均衡器的配置状态。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public LoadBalancer withListeners(List<IdListWrapper> listeners) {
        this.listeners = listeners;
        return this;
    }

    public LoadBalancer addListenersItem(IdListWrapper listenersItem) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        this.listeners.add(listenersItem);
        return this;
    }

    public LoadBalancer withListeners(Consumer<List<IdListWrapper>> listenersSetter) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /**
     * 关联的listener列表。
     * @return listeners
     */
    public List<IdListWrapper> getListeners() {
        return listeners;
    }

    public void setListeners(List<IdListWrapper> listeners) {
        this.listeners = listeners;
    }

    public LoadBalancer withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    /**
     * 负载均衡器的IPv4虚拟IP地址。
     * @return vipAddress
     */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public LoadBalancer withVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
        return this;
    }

    /**
     * 负载均衡器的IPv4对应的port ID。
     * @return vipPortId
     */
    public String getVipPortId() {
        return vipPortId;
    }

    public void setVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
    }

    public LoadBalancer withIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
        return this;
    }

    /**
     * 负载均衡器的IPv6地址。
     * @return ipv6VipAddress
     */
    public String getIpv6VipAddress() {
        return ipv6VipAddress;
    }

    public void setIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
    }

    public LoadBalancer withPublicips(List<PublicIpInfo> publicips) {
        this.publicips = publicips;
        return this;
    }

    public LoadBalancer addPublicipsItem(PublicIpInfo publicipsItem) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        this.publicips.add(publicipsItem);
        return this;
    }

    public LoadBalancer withPublicips(Consumer<List<PublicIpInfo>> publicipsSetter) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        publicipsSetter.accept(this.publicips);
        return this;
    }

    /**
     * 负载均衡器绑定的公网IP。
     * @return publicips
     */
    public List<PublicIpInfo> getPublicips() {
        return publicips;
    }

    public void setPublicips(List<PublicIpInfo> publicips) {
        this.publicips = publicips;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoadBalancer that = (LoadBalancer) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.guaranteed, that.guaranteed) && Objects.equals(this.billingInfo, that.billingInfo)
            && Objects.equals(this.description, that.description) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.provisioningStatus, that.provisioningStatus)
            && Objects.equals(this.listeners, that.listeners) && Objects.equals(this.vipAddress, that.vipAddress)
            && Objects.equals(this.vipPortId, that.vipPortId)
            && Objects.equals(this.ipv6VipAddress, that.ipv6VipAddress)
            && Objects.equals(this.publicips, that.publicips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            guaranteed,
            billingInfo,
            description,
            vpcId,
            provisioningStatus,
            listeners,
            vipAddress,
            vipPortId,
            ipv6VipAddress,
            publicips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadBalancer {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    guaranteed: ").append(toIndentedString(guaranteed)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    vipPortId: ").append(toIndentedString(vipPortId)).append("\n");
        sb.append("    ipv6VipAddress: ").append(toIndentedString(ipv6VipAddress)).append("\n");
        sb.append("    publicips: ").append(toIndentedString(publicips)).append("\n");
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
