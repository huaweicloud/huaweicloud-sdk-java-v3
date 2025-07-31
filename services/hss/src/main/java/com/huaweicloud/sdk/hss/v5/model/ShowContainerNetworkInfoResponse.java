package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowContainerNetworkInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private String vpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet")

    private String subnet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    private String securityGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv4_cidr")

    private String ipv4Cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidrs")

    private String cidrs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kube_proxy_mode")

    private String kubeProxyMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_egress")

    private Boolean isSupportEgress;

    public ShowContainerNetworkInfoResponse withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 网络模型
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ShowContainerNetworkInfoResponse withVpc(String vpc) {
        this.vpc = vpc;
        return this;
    }

    /**
     * VPC Id
     * @return vpc
     */
    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    public ShowContainerNetworkInfoResponse withSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * 网络ID
     * @return subnet
     */
    public String getSubnet() {
        return subnet;
    }

    public void setSubnet(String subnet) {
        this.subnet = subnet;
    }

    public ShowContainerNetworkInfoResponse withSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    /**
     * 安全组
     * @return securityGroup
     */
    public String getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
    }

    public ShowContainerNetworkInfoResponse withIpv4Cidr(String ipv4Cidr) {
        this.ipv4Cidr = ipv4Cidr;
        return this;
    }

    /**
     * IPv4 服务网段
     * @return ipv4Cidr
     */
    public String getIpv4Cidr() {
        return ipv4Cidr;
    }

    public void setIpv4Cidr(String ipv4Cidr) {
        this.ipv4Cidr = ipv4Cidr;
    }

    public ShowContainerNetworkInfoResponse withCidrs(String cidrs) {
        this.cidrs = cidrs;
        return this;
    }

    /**
     * 容器网络网段
     * @return cidrs
     */
    public String getCidrs() {
        return cidrs;
    }

    public void setCidrs(String cidrs) {
        this.cidrs = cidrs;
    }

    public ShowContainerNetworkInfoResponse withKubeProxyMode(String kubeProxyMode) {
        this.kubeProxyMode = kubeProxyMode;
        return this;
    }

    /**
     * 服务转发模式:    - iptables   - ipvs
     * @return kubeProxyMode
     */
    public String getKubeProxyMode() {
        return kubeProxyMode;
    }

    public void setKubeProxyMode(String kubeProxyMode) {
        this.kubeProxyMode = kubeProxyMode;
    }

    public ShowContainerNetworkInfoResponse withIsSupportEgress(Boolean isSupportEgress) {
        this.isSupportEgress = isSupportEgress;
        return this;
    }

    /**
     * 是否支持配置egress规则: true、false
     * @return isSupportEgress
     */
    public Boolean getIsSupportEgress() {
        return isSupportEgress;
    }

    public void setIsSupportEgress(Boolean isSupportEgress) {
        this.isSupportEgress = isSupportEgress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowContainerNetworkInfoResponse that = (ShowContainerNetworkInfoResponse) obj;
        return Objects.equals(this.mode, that.mode) && Objects.equals(this.vpc, that.vpc)
            && Objects.equals(this.subnet, that.subnet) && Objects.equals(this.securityGroup, that.securityGroup)
            && Objects.equals(this.ipv4Cidr, that.ipv4Cidr) && Objects.equals(this.cidrs, that.cidrs)
            && Objects.equals(this.kubeProxyMode, that.kubeProxyMode)
            && Objects.equals(this.isSupportEgress, that.isSupportEgress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, vpc, subnet, securityGroup, ipv4Cidr, cidrs, kubeProxyMode, isSupportEgress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowContainerNetworkInfoResponse {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
        sb.append("    ipv4Cidr: ").append(toIndentedString(ipv4Cidr)).append("\n");
        sb.append("    cidrs: ").append(toIndentedString(cidrs)).append("\n");
        sb.append("    kubeProxyMode: ").append(toIndentedString(kubeProxyMode)).append("\n");
        sb.append("    isSupportEgress: ").append(toIndentedString(isSupportEgress)).append("\n");
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
