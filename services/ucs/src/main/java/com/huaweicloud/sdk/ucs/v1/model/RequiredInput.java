package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RequiredInput
 */
public class RequiredInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "USERNAME")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "MASTER-1")

    private String master1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "MASTER-2")

    private String master2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "MASTER-3")

    private String master3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ACCESS_EXTERNAL_LOAD_BALANCE")

    private Boolean accessExternalLoadBalance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CILIUM_IPV4POOL_CIDR")

    private String ciliumIpv4poolCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NETWORK_CIDR")

    private String networkCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "DNS_SERVER_IP")

    private String dnsServerIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NTP_SERVER_IP")

    private String ntpServerIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "IAM_DOMAIN_ID")

    private String iamDomainId;

    public RequiredInput withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public RequiredInput withMaster1(String master1) {
        this.master1 = master1;
        return this;
    }

    /**
     * 控制节点1IP地址
     * @return master1
     */
    public String getMaster1() {
        return master1;
    }

    public void setMaster1(String master1) {
        this.master1 = master1;
    }

    public RequiredInput withMaster2(String master2) {
        this.master2 = master2;
        return this;
    }

    /**
     * 控制节点2IP地址
     * @return master2
     */
    public String getMaster2() {
        return master2;
    }

    public void setMaster2(String master2) {
        this.master2 = master2;
    }

    public RequiredInput withMaster3(String master3) {
        this.master3 = master3;
        return this;
    }

    /**
     * 控制节点3IP地址
     * @return master3
     */
    public String getMaster3() {
        return master3;
    }

    public void setMaster3(String master3) {
        this.master3 = master3;
    }

    public RequiredInput withAccessExternalLoadBalance(Boolean accessExternalLoadBalance) {
        this.accessExternalLoadBalance = accessExternalLoadBalance;
        return this;
    }

    /**
     * 是否启用外部负载均衡器
     * @return accessExternalLoadBalance
     */
    public Boolean getAccessExternalLoadBalance() {
        return accessExternalLoadBalance;
    }

    public void setAccessExternalLoadBalance(Boolean accessExternalLoadBalance) {
        this.accessExternalLoadBalance = accessExternalLoadBalance;
    }

    public RequiredInput withCiliumIpv4poolCidr(String ciliumIpv4poolCidr) {
        this.ciliumIpv4poolCidr = ciliumIpv4poolCidr;
        return this;
    }

    /**
     * Cilium网络组件的IPv4地址池CIDR
     * @return ciliumIpv4poolCidr
     */
    public String getCiliumIpv4poolCidr() {
        return ciliumIpv4poolCidr;
    }

    public void setCiliumIpv4poolCidr(String ciliumIpv4poolCidr) {
        this.ciliumIpv4poolCidr = ciliumIpv4poolCidr;
    }

    public RequiredInput withNetworkCidr(String networkCidr) {
        this.networkCidr = networkCidr;
        return this;
    }

    /**
     * 容器网络的CIDR范围
     * @return networkCidr
     */
    public String getNetworkCidr() {
        return networkCidr;
    }

    public void setNetworkCidr(String networkCidr) {
        this.networkCidr = networkCidr;
    }

    public RequiredInput withDnsServerIp(String dnsServerIp) {
        this.dnsServerIp = dnsServerIp;
        return this;
    }

    /**
     * DNS服务器IP地址
     * @return dnsServerIp
     */
    public String getDnsServerIp() {
        return dnsServerIp;
    }

    public void setDnsServerIp(String dnsServerIp) {
        this.dnsServerIp = dnsServerIp;
    }

    public RequiredInput withNtpServerIp(String ntpServerIp) {
        this.ntpServerIp = ntpServerIp;
        return this;
    }

    /**
     * NTP服务器IP地址
     * @return ntpServerIp
     */
    public String getNtpServerIp() {
        return ntpServerIp;
    }

    public void setNtpServerIp(String ntpServerIp) {
        this.ntpServerIp = ntpServerIp;
    }

    public RequiredInput withIamDomainId(String iamDomainId) {
        this.iamDomainId = iamDomainId;
        return this;
    }

    /**
     * IAM域ID
     * @return iamDomainId
     */
    public String getIamDomainId() {
        return iamDomainId;
    }

    public void setIamDomainId(String iamDomainId) {
        this.iamDomainId = iamDomainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RequiredInput that = (RequiredInput) obj;
        return Objects.equals(this.username, that.username) && Objects.equals(this.master1, that.master1)
            && Objects.equals(this.master2, that.master2) && Objects.equals(this.master3, that.master3)
            && Objects.equals(this.accessExternalLoadBalance, that.accessExternalLoadBalance)
            && Objects.equals(this.ciliumIpv4poolCidr, that.ciliumIpv4poolCidr)
            && Objects.equals(this.networkCidr, that.networkCidr) && Objects.equals(this.dnsServerIp, that.dnsServerIp)
            && Objects.equals(this.ntpServerIp, that.ntpServerIp) && Objects.equals(this.iamDomainId, that.iamDomainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username,
            master1,
            master2,
            master3,
            accessExternalLoadBalance,
            ciliumIpv4poolCidr,
            networkCidr,
            dnsServerIp,
            ntpServerIp,
            iamDomainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequiredInput {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    master1: ").append(toIndentedString(master1)).append("\n");
        sb.append("    master2: ").append(toIndentedString(master2)).append("\n");
        sb.append("    master3: ").append(toIndentedString(master3)).append("\n");
        sb.append("    accessExternalLoadBalance: ").append(toIndentedString(accessExternalLoadBalance)).append("\n");
        sb.append("    ciliumIpv4poolCidr: ").append(toIndentedString(ciliumIpv4poolCidr)).append("\n");
        sb.append("    networkCidr: ").append(toIndentedString(networkCidr)).append("\n");
        sb.append("    dnsServerIp: ").append(toIndentedString(dnsServerIp)).append("\n");
        sb.append("    ntpServerIp: ").append(toIndentedString(ntpServerIp)).append("\n");
        sb.append("    iamDomainId: ").append(toIndentedString(iamDomainId)).append("\n");
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
