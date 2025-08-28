package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * EsLoadBalancerResource
 */
public class EsLoadBalancerResource {

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

    private EsListenersResource listeners;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_address")

    private String vipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicips")

    private EsPublicipsResource publicips;

    public EsLoadBalancerResource withId(String id) {
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

    public EsLoadBalancerResource withName(String name) {
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

    public EsLoadBalancerResource withGuaranteed(String guaranteed) {
        this.guaranteed = guaranteed;
        return this;
    }

    /**
     * Indicates whether the LB is an exclusive LB. - false：共享型。 - true：独享型。
     * @return guaranteed
     */
    public String getGuaranteed() {
        return guaranteed;
    }

    public void setGuaranteed(String guaranteed) {
        this.guaranteed = guaranteed;
    }

    public EsLoadBalancerResource withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /**
     * 资源账单信息 - 空：按需计费。 - 非空：包周期计费。
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public EsLoadBalancerResource withDescription(String description) {
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

    public EsLoadBalancerResource withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 负载均衡器所属VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public EsLoadBalancerResource withProvisioningStatus(String provisioningStatus) {
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

    public EsLoadBalancerResource withListeners(EsListenersResource listeners) {
        this.listeners = listeners;
        return this;
    }

    public EsLoadBalancerResource withListeners(Consumer<EsListenersResource> listenersSetter) {
        if (this.listeners == null) {
            this.listeners = new EsListenersResource();
            listenersSetter.accept(this.listeners);
        }

        return this;
    }

    /**
     * Get listeners
     * @return listeners
     */
    public EsListenersResource getListeners() {
        return listeners;
    }

    public void setListeners(EsListenersResource listeners) {
        this.listeners = listeners;
    }

    public EsLoadBalancerResource withVipAddress(String vipAddress) {
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

    public EsLoadBalancerResource withPublicips(EsPublicipsResource publicips) {
        this.publicips = publicips;
        return this;
    }

    public EsLoadBalancerResource withPublicips(Consumer<EsPublicipsResource> publicipsSetter) {
        if (this.publicips == null) {
            this.publicips = new EsPublicipsResource();
            publicipsSetter.accept(this.publicips);
        }

        return this;
    }

    /**
     * Get publicips
     * @return publicips
     */
    public EsPublicipsResource getPublicips() {
        return publicips;
    }

    public void setPublicips(EsPublicipsResource publicips) {
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
        EsLoadBalancerResource that = (EsLoadBalancerResource) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.guaranteed, that.guaranteed) && Objects.equals(this.billingInfo, that.billingInfo)
            && Objects.equals(this.description, that.description) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.provisioningStatus, that.provisioningStatus)
            && Objects.equals(this.listeners, that.listeners) && Objects.equals(this.vipAddress, that.vipAddress)
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
            publicips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EsLoadBalancerResource {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    guaranteed: ").append(toIndentedString(guaranteed)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
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
