package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NetworkInterfaces
 */
public class NetworkInterfaces {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary")

    private Boolean primary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_addresses")

    private List<String> ipAddresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_addresses")

    private List<String> ipv6Addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association")

    private Association association;

    public NetworkInterfaces withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 网卡端口id
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public NetworkInterfaces withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * 是否是主网卡
     * @return primary
     */
    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public NetworkInterfaces withIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    public NetworkInterfaces addIpAddressesItem(String ipAddressesItem) {
        if (this.ipAddresses == null) {
            this.ipAddresses = new ArrayList<>();
        }
        this.ipAddresses.add(ipAddressesItem);
        return this;
    }

    public NetworkInterfaces withIpAddresses(Consumer<List<String>> ipAddressesSetter) {
        if (this.ipAddresses == null) {
            this.ipAddresses = new ArrayList<>();
        }
        ipAddressesSetter.accept(this.ipAddresses);
        return this;
    }

    /**
     * ipv4地址
     * @return ipAddresses
     */
    public List<String> getIpAddresses() {
        return ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public NetworkInterfaces withIpv6Addresses(List<String> ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
        return this;
    }

    public NetworkInterfaces addIpv6AddressesItem(String ipv6AddressesItem) {
        if (this.ipv6Addresses == null) {
            this.ipv6Addresses = new ArrayList<>();
        }
        this.ipv6Addresses.add(ipv6AddressesItem);
        return this;
    }

    public NetworkInterfaces withIpv6Addresses(Consumer<List<String>> ipv6AddressesSetter) {
        if (this.ipv6Addresses == null) {
            this.ipv6Addresses = new ArrayList<>();
        }
        ipv6AddressesSetter.accept(this.ipv6Addresses);
        return this;
    }

    /**
     * ipv6地址
     * @return ipv6Addresses
     */
    public List<String> getIpv6Addresses() {
        return ipv6Addresses;
    }

    public void setIpv6Addresses(List<String> ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
    }

    public NetworkInterfaces withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网id
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public NetworkInterfaces withAssociation(Association association) {
        this.association = association;
        return this;
    }

    public NetworkInterfaces withAssociation(Consumer<Association> associationSetter) {
        if (this.association == null) {
            this.association = new Association();
            associationSetter.accept(this.association);
        }

        return this;
    }

    /**
     * Get association
     * @return association
     */
    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkInterfaces that = (NetworkInterfaces) obj;
        return Objects.equals(this.portId, that.portId) && Objects.equals(this.primary, that.primary)
            && Objects.equals(this.ipAddresses, that.ipAddresses)
            && Objects.equals(this.ipv6Addresses, that.ipv6Addresses) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.association, that.association);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portId, primary, ipAddresses, ipv6Addresses, subnetId, association);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkInterfaces {\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
        sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
        sb.append("    ipv6Addresses: ").append(toIndentedString(ipv6Addresses)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    association: ").append(toIndentedString(association)).append("\n");
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
