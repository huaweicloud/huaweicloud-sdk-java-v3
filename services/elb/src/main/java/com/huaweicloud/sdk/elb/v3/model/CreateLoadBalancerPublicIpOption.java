package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateLoadBalancerPublicIpOption
 */
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

    /**
     * **参数解释**：IP版本。  **约束限制**：不涉及  **取值范围**：  - 4：表示IPv4。  - 6：表示IPv6。  **默认取值**：4  [不支持IPv6，请勿设置为6。](tag:dt)
     * @return ipVersion
     */
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

    /**
     * **参数解释**：弹性公网IP的网络类型，默认5_bgp，更多请参考弹性公网ip创建。  [**约束限制**：华南-深圳局点该参数取值只能为5_gray。](tag:hws) [**约束限制**：只支持设置为5_gray。](tag:dt)  **取值范围**：5_bgp - 全动态BGP。  **默认取值**：5_bgp
     * @return networkType
     */
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

    /**
     * **参数解释**：计费订单信息。  **约束限制**： - 空：按需计费。 [- 非空：包周期计费。格式：order_id:product_id:region_id:project_id](tag:hws)  **取值范围**：不涉及  **默认取值**：不涉及  [不支持该字段，请勿使用。](tag:hws_hk,hws_eu,hws_eu_wb,hws_test,srg,fcs,fcs_vm,dt,ctc,cmcc,tm,sbc,hk_sbc,hk_tm,hk_vdf,ct)
     * @return billingInfo
     */
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

    /**
     * **参数解释**：弹性公网IP的描述信息。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return description
     */
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

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public CreateLoadBalancerBandwidthOption getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(CreateLoadBalancerBandwidthOption bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLoadBalancerPublicIpOption that = (CreateLoadBalancerPublicIpOption) obj;
        return Objects.equals(this.ipVersion, that.ipVersion) && Objects.equals(this.networkType, that.networkType)
            && Objects.equals(this.billingInfo, that.billingInfo) && Objects.equals(this.description, that.description)
            && Objects.equals(this.bandwidth, that.bandwidth);
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
