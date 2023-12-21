package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 子网配置
 */
public class SubnetConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_bandwidth_enable")

    private Boolean ipv6BandwidthEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_bandwidth")

    private Ipv6Bandwidth ipv6Bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_address_pairs")

    private List<AllowedAddressPair> allowedAddressPairs = null;

    public SubnetConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 边缘子网ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SubnetConfig withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 创建实例是否开启IPv6能力。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public SubnetConfig withIpv6BandwidthEnable(Boolean ipv6BandwidthEnable) {
        this.ipv6BandwidthEnable = ipv6BandwidthEnable;
        return this;
    }

    /**
     * 是否使用IPv6带宽。  约束： - ipv6_enable=true时，有效； - 使用IPv6带宽后，优先根据ipv6_bandwidth中配置的带宽，如果ipv6_bandwidth未设置，则使用使用IPv6子网所在Ipv6池的带宽,如果当前IPv6所在池子下面没有带宽，则自动创建带宽
     * @return ipv6BandwidthEnable
     */
    public Boolean getIpv6BandwidthEnable() {
        return ipv6BandwidthEnable;
    }

    public void setIpv6BandwidthEnable(Boolean ipv6BandwidthEnable) {
        this.ipv6BandwidthEnable = ipv6BandwidthEnable;
    }

    public SubnetConfig withIpv6Bandwidth(Ipv6Bandwidth ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
        return this;
    }

    public SubnetConfig withIpv6Bandwidth(Consumer<Ipv6Bandwidth> ipv6BandwidthSetter) {
        if (this.ipv6Bandwidth == null) {
            this.ipv6Bandwidth = new Ipv6Bandwidth();
            ipv6BandwidthSetter.accept(this.ipv6Bandwidth);
        }

        return this;
    }

    /**
     * Get ipv6Bandwidth
     * @return ipv6Bandwidth
     */
    public Ipv6Bandwidth getIpv6Bandwidth() {
        return ipv6Bandwidth;
    }

    public void setIpv6Bandwidth(Ipv6Bandwidth ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
    }

    public SubnetConfig withAllowedAddressPairs(List<AllowedAddressPair> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
        return this;
    }

    public SubnetConfig addAllowedAddressPairsItem(AllowedAddressPair allowedAddressPairsItem) {
        if (this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        this.allowedAddressPairs.add(allowedAddressPairsItem);
        return this;
    }

    public SubnetConfig withAllowedAddressPairs(Consumer<List<AllowedAddressPair>> allowedAddressPairsSetter) {
        if (this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        allowedAddressPairsSetter.accept(this.allowedAddressPairs);
        return this;
    }

    /**
     * - 功能说明：IP/Mac对列表 - 约束：     IP地址不允许为 “0.0.0.0/0”     如果allowed_address_pairs配置地址池较大的CIDR（掩码小于24位），建议为该port配置一个单独的安全组。     如果allowed_address_pairs为“1.1.1.1/0”，表示关闭源目地址检查开关
     * @return allowedAddressPairs
     */
    public List<AllowedAddressPair> getAllowedAddressPairs() {
        return allowedAddressPairs;
    }

    public void setAllowedAddressPairs(List<AllowedAddressPair> allowedAddressPairs) {
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
        SubnetConfig that = (SubnetConfig) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.ipv6Enable, that.ipv6Enable)
            && Objects.equals(this.ipv6BandwidthEnable, that.ipv6BandwidthEnable)
            && Objects.equals(this.ipv6Bandwidth, that.ipv6Bandwidth)
            && Objects.equals(this.allowedAddressPairs, that.allowedAddressPairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ipv6Enable, ipv6BandwidthEnable, ipv6Bandwidth, allowedAddressPairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubnetConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    ipv6BandwidthEnable: ").append(toIndentedString(ipv6BandwidthEnable)).append("\n");
        sb.append("    ipv6Bandwidth: ").append(toIndentedString(ipv6Bandwidth)).append("\n");
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
