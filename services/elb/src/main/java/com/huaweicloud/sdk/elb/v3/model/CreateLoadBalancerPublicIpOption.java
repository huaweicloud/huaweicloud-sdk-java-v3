package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 创建ELB时，新建公网IP请求参数 */
public class CreateLoadBalancerPublicIpOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private String networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private String billingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private CreateLoadBalancerBandwidthOption bandwidth;

    public CreateLoadBalancerPublicIpOption withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /** ip版数。 有效值：4表示IPv4，暂不支持新建IPv6
     * 
     * @return ipVersion */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public CreateLoadBalancerPublicIpOption withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /** 弹性公网IP的网络类型，默认5_bgp，更多请参考弹性公网ip创建
     * 
     * @return networkType */
    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public CreateLoadBalancerPublicIpOption withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /** 账单信息 如果billinginfo不为空,说明是包周期的带宽
     * 
     * @return billingInfo */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public CreateLoadBalancerPublicIpOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 弹性公网IP的描述信息，不支持特殊字符
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateLoadBalancerPublicIpOption withBandwidth(CreateLoadBalancerBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public CreateLoadBalancerPublicIpOption withBandwidth(Consumer<CreateLoadBalancerBandwidthOption> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new CreateLoadBalancerBandwidthOption();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /** Get bandwidth
     * 
     * @return bandwidth */
    public CreateLoadBalancerBandwidthOption getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(CreateLoadBalancerBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateLoadBalancerPublicIpOption createLoadBalancerPublicIpOption = (CreateLoadBalancerPublicIpOption) o;
        return Objects.equals(this.ipVersion, createLoadBalancerPublicIpOption.ipVersion)
            && Objects.equals(this.networkType, createLoadBalancerPublicIpOption.networkType)
            && Objects.equals(this.billingInfo, createLoadBalancerPublicIpOption.billingInfo)
            && Objects.equals(this.description, createLoadBalancerPublicIpOption.description)
            && Objects.equals(this.bandwidth, createLoadBalancerPublicIpOption.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipVersion, networkType, billingInfo, description, bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLoadBalancerPublicIpOption {\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
