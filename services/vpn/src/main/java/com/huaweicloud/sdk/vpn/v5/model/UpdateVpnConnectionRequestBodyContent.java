package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateVpnConnectionRequestBodyContent
 */
public class UpdateVpnConnectionRequestBodyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cgw_id")

    private String cgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_subnets")

    private List<String> peerSubnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_local_address")

    private String tunnelLocalAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_peer_address")

    private String tunnelPeerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "psk")

    private String psk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_rules")

    private List<PolicyRule> policyRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ikepolicy")

    private UpdateIkePolicy ikepolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipsecpolicy")

    private UpdateIpsecPolicy ipsecpolicy;

    public UpdateVpnConnectionRequestBodyContent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * VPN连接名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateVpnConnectionRequestBodyContent withCgwId(String cgwId) {
        this.cgwId = cgwId;
        return this;
    }

    /**
     * 对端网关ID
     * @return cgwId
     */
    public String getCgwId() {
        return cgwId;
    }

    public void setCgwId(String cgwId) {
        this.cgwId = cgwId;
    }

    public UpdateVpnConnectionRequestBodyContent withPeerSubnets(List<String> peerSubnets) {
        this.peerSubnets = peerSubnets;
        return this;
    }

    public UpdateVpnConnectionRequestBodyContent addPeerSubnetsItem(String peerSubnetsItem) {
        if (this.peerSubnets == null) {
            this.peerSubnets = new ArrayList<>();
        }
        this.peerSubnets.add(peerSubnetsItem);
        return this;
    }

    public UpdateVpnConnectionRequestBodyContent withPeerSubnets(Consumer<List<String>> peerSubnetsSetter) {
        if (this.peerSubnets == null) {
            this.peerSubnets = new ArrayList<>();
        }
        peerSubnetsSetter.accept(this.peerSubnets);
        return this;
    }

    /**
     * 对端网段
     * @return peerSubnets
     */
    public List<String> getPeerSubnets() {
        return peerSubnets;
    }

    public void setPeerSubnets(List<String> peerSubnets) {
        this.peerSubnets = peerSubnets;
    }

    public UpdateVpnConnectionRequestBodyContent withTunnelLocalAddress(String tunnelLocalAddress) {
        this.tunnelLocalAddress = tunnelLocalAddress;
        return this;
    }

    /**
     * 本端隧道口地址
     * @return tunnelLocalAddress
     */
    public String getTunnelLocalAddress() {
        return tunnelLocalAddress;
    }

    public void setTunnelLocalAddress(String tunnelLocalAddress) {
        this.tunnelLocalAddress = tunnelLocalAddress;
    }

    public UpdateVpnConnectionRequestBodyContent withTunnelPeerAddress(String tunnelPeerAddress) {
        this.tunnelPeerAddress = tunnelPeerAddress;
        return this;
    }

    /**
     * 对端隧道口地址
     * @return tunnelPeerAddress
     */
    public String getTunnelPeerAddress() {
        return tunnelPeerAddress;
    }

    public void setTunnelPeerAddress(String tunnelPeerAddress) {
        this.tunnelPeerAddress = tunnelPeerAddress;
    }

    public UpdateVpnConnectionRequestBodyContent withPsk(String psk) {
        this.psk = psk;
        return this;
    }

    /**
     * 预共享密钥，只能包含大写字母、小写字母、数字和特殊字符(~!@#$%^()-_+={ },./:;)且至少包含四种字符的三种
     * @return psk
     */
    public String getPsk() {
        return psk;
    }

    public void setPsk(String psk) {
        this.psk = psk;
    }

    public UpdateVpnConnectionRequestBodyContent withPolicyRules(List<PolicyRule> policyRules) {
        this.policyRules = policyRules;
        return this;
    }

    public UpdateVpnConnectionRequestBodyContent addPolicyRulesItem(PolicyRule policyRulesItem) {
        if (this.policyRules == null) {
            this.policyRules = new ArrayList<>();
        }
        this.policyRules.add(policyRulesItem);
        return this;
    }

    public UpdateVpnConnectionRequestBodyContent withPolicyRules(Consumer<List<PolicyRule>> policyRulesSetter) {
        if (this.policyRules == null) {
            this.policyRules = new ArrayList<>();
        }
        policyRulesSetter.accept(this.policyRules);
        return this;
    }

    /**
     * 策略模式的策略规则组
     * @return policyRules
     */
    public List<PolicyRule> getPolicyRules() {
        return policyRules;
    }

    public void setPolicyRules(List<PolicyRule> policyRules) {
        this.policyRules = policyRules;
    }

    public UpdateVpnConnectionRequestBodyContent withIkepolicy(UpdateIkePolicy ikepolicy) {
        this.ikepolicy = ikepolicy;
        return this;
    }

    public UpdateVpnConnectionRequestBodyContent withIkepolicy(Consumer<UpdateIkePolicy> ikepolicySetter) {
        if (this.ikepolicy == null) {
            this.ikepolicy = new UpdateIkePolicy();
            ikepolicySetter.accept(this.ikepolicy);
        }

        return this;
    }

    /**
     * Get ikepolicy
     * @return ikepolicy
     */
    public UpdateIkePolicy getIkepolicy() {
        return ikepolicy;
    }

    public void setIkepolicy(UpdateIkePolicy ikepolicy) {
        this.ikepolicy = ikepolicy;
    }

    public UpdateVpnConnectionRequestBodyContent withIpsecpolicy(UpdateIpsecPolicy ipsecpolicy) {
        this.ipsecpolicy = ipsecpolicy;
        return this;
    }

    public UpdateVpnConnectionRequestBodyContent withIpsecpolicy(Consumer<UpdateIpsecPolicy> ipsecpolicySetter) {
        if (this.ipsecpolicy == null) {
            this.ipsecpolicy = new UpdateIpsecPolicy();
            ipsecpolicySetter.accept(this.ipsecpolicy);
        }

        return this;
    }

    /**
     * Get ipsecpolicy
     * @return ipsecpolicy
     */
    public UpdateIpsecPolicy getIpsecpolicy() {
        return ipsecpolicy;
    }

    public void setIpsecpolicy(UpdateIpsecPolicy ipsecpolicy) {
        this.ipsecpolicy = ipsecpolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVpnConnectionRequestBodyContent that = (UpdateVpnConnectionRequestBodyContent) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.cgwId, that.cgwId)
            && Objects.equals(this.peerSubnets, that.peerSubnets)
            && Objects.equals(this.tunnelLocalAddress, that.tunnelLocalAddress)
            && Objects.equals(this.tunnelPeerAddress, that.tunnelPeerAddress) && Objects.equals(this.psk, that.psk)
            && Objects.equals(this.policyRules, that.policyRules) && Objects.equals(this.ikepolicy, that.ikepolicy)
            && Objects.equals(this.ipsecpolicy, that.ipsecpolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            cgwId,
            peerSubnets,
            tunnelLocalAddress,
            tunnelPeerAddress,
            psk,
            policyRules,
            ikepolicy,
            ipsecpolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpnConnectionRequestBodyContent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cgwId: ").append(toIndentedString(cgwId)).append("\n");
        sb.append("    peerSubnets: ").append(toIndentedString(peerSubnets)).append("\n");
        sb.append("    tunnelLocalAddress: ").append(toIndentedString(tunnelLocalAddress)).append("\n");
        sb.append("    tunnelPeerAddress: ").append(toIndentedString(tunnelPeerAddress)).append("\n");
        sb.append("    psk: ").append(toIndentedString(psk)).append("\n");
        sb.append("    policyRules: ").append(toIndentedString(policyRules)).append("\n");
        sb.append("    ikepolicy: ").append(toIndentedString(ikepolicy)).append("\n");
        sb.append("    ipsecpolicy: ").append(toIndentedString(ipsecpolicy)).append("\n");
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
