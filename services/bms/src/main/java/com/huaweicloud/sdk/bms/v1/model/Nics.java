package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * nics字段数据结构说明
 */
public class Nics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private UUID subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_address_pairs")

    private List<CreateServerNicAllowedAddressPairs> allowedAddressPairs = null;

    public Nics withSubnetId(UUID subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 裸金属服务器网卡所在的子网信息。需要指定vpcid对应VPC下已创建的子网（subnet）的网络ID（network_id），UUID格式。子网（subnet）的网络ID（network_id）可以从虚拟私有云控制台或者参考《虚拟私有云API参考》的“查询子网列表”章节获取。
     * @return subnetId
     */
    public UUID getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(UUID subnetId) {
        this.subnetId = subnetId;
    }

    public Nics withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * 创建裸金属服务器网卡的IP地址，IPv4格式,约束：不填或空字符串，默认在网络（network）对应的子网中自动分配一个未使用的IP作网卡的IP地址。若指定IP地址，该IP地址必须在网络（network）对应的子网的网段内，且未被使用。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Nics withAllowedAddressPairs(List<CreateServerNicAllowedAddressPairs> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
        return this;
    }

    public Nics addAllowedAddressPairsItem(CreateServerNicAllowedAddressPairs allowedAddressPairsItem) {
        if (this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        this.allowedAddressPairs.add(allowedAddressPairsItem);
        return this;
    }

    public Nics withAllowedAddressPairs(Consumer<List<CreateServerNicAllowedAddressPairs>> allowedAddressPairsSetter) {
        if (this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        allowedAddressPairsSetter.accept(this.allowedAddressPairs);
        return this;
    }

    /**
     * IP/Mac对列表， 约束：IP地址不允许为 “0.0.0.0/0” 如果allowed_address_pairs配置地址池较大的CIDR（掩码小于24位），建议为该port配置一个单独的安全组 如果allowed_address_pairs为“1.1.1.1/0”，表示关闭源目地址检查开关 被绑定的云服务器网卡allowed_address_pairs填“1.1.1.1/0”
     * @return allowedAddressPairs
     */
    public List<CreateServerNicAllowedAddressPairs> getAllowedAddressPairs() {
        return allowedAddressPairs;
    }

    public void setAllowedAddressPairs(List<CreateServerNicAllowedAddressPairs> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Nics that = (Nics) obj;
        return Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.ipAddress, that.ipAddress)
            && Objects.equals(this.allowedAddressPairs, that.allowedAddressPairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId, ipAddress, allowedAddressPairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Nics {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    allowedAddressPairs: ").append(toIndentedString(allowedAddressPairs)).append("\n");
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
