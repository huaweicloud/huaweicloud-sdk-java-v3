package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVpnConnectionRequestBodyContent
 */
public class CreateVpnConnectionRequestBodyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_id")

    private String vgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_ip")

    private String vgwIp;

    /**
     * 连接模式 允许范围[policy, static, bgp] policy: 策略模式 static: 静态路由模式 bgp: bgp路由模式
     */
    public static final class StyleEnum {

        /**
         * Enum POLICY for value: "policy"
         */
        public static final StyleEnum POLICY = new StyleEnum("policy");

        /**
         * Enum STATIC for value: "static"
         */
        public static final StyleEnum STATIC = new StyleEnum("static");

        /**
         * Enum BGP for value: "bgp"
         */
        public static final StyleEnum BGP = new StyleEnum("bgp");

        private static final Map<String, StyleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StyleEnum> createStaticFields() {
            Map<String, StyleEnum> map = new HashMap<>();
            map.put("policy", POLICY);
            map.put("static", STATIC);
            map.put("bgp", BGP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StyleEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StyleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StyleEnum(value));
        }

        public static StyleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StyleEnum) {
                return this.value.equals(((StyleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "style")

    private StyleEnum style;

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
    @JsonProperty(value = "enable_nqa")

    private Boolean enableNqa;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_hub")

    private Boolean enableHub;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "psk")

    private String psk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_rules")

    private List<PolicyRule> policyRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ikepolicy")

    private IkePolicy ikepolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipsecpolicy")

    private IpsecPolicy ipsecpolicy;

    /**
     * 连接的HA角色
     */
    public static final class HaRoleEnum {

        /**
         * Enum MASTER for value: "master"
         */
        public static final HaRoleEnum MASTER = new HaRoleEnum("master");

        /**
         * Enum SLAVE for value: "slave"
         */
        public static final HaRoleEnum SLAVE = new HaRoleEnum("slave");

        private static final Map<String, HaRoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HaRoleEnum> createStaticFields() {
            Map<String, HaRoleEnum> map = new HashMap<>();
            map.put("master", MASTER);
            map.put("slave", SLAVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HaRoleEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static HaRoleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HaRoleEnum(value));
        }

        public static HaRoleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HaRoleEnum) {
                return this.value.equals(((HaRoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_role")

    private HaRoleEnum haRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<VpnResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_subnets_v6")

    private List<String> peerSubnetsV6 = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_rules_v6")

    private List<PolicyRule> policyRulesV6 = null;

    public CreateVpnConnectionRequestBodyContent withName(String name) {
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

    public CreateVpnConnectionRequestBodyContent withVgwId(String vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    /**
     * VPN网关ID
     * @return vgwId
     */
    public String getVgwId() {
        return vgwId;
    }

    public void setVgwId(String vgwId) {
        this.vgwId = vgwId;
    }

    public CreateVpnConnectionRequestBodyContent withVgwIp(String vgwIp) {
        this.vgwIp = vgwIp;
        return this;
    }

    /**
     * VGW IP
     * @return vgwIp
     */
    public String getVgwIp() {
        return vgwIp;
    }

    public void setVgwIp(String vgwIp) {
        this.vgwIp = vgwIp;
    }

    public CreateVpnConnectionRequestBodyContent withStyle(StyleEnum style) {
        this.style = style;
        return this;
    }

    /**
     * 连接模式 允许范围[policy, static, bgp] policy: 策略模式 static: 静态路由模式 bgp: bgp路由模式
     * @return style
     */
    public StyleEnum getStyle() {
        return style;
    }

    public void setStyle(StyleEnum style) {
        this.style = style;
    }

    public CreateVpnConnectionRequestBodyContent withCgwId(String cgwId) {
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

    public CreateVpnConnectionRequestBodyContent withPeerSubnets(List<String> peerSubnets) {
        this.peerSubnets = peerSubnets;
        return this;
    }

    public CreateVpnConnectionRequestBodyContent addPeerSubnetsItem(String peerSubnetsItem) {
        if (this.peerSubnets == null) {
            this.peerSubnets = new ArrayList<>();
        }
        this.peerSubnets.add(peerSubnetsItem);
        return this;
    }

    public CreateVpnConnectionRequestBodyContent withPeerSubnets(Consumer<List<String>> peerSubnetsSetter) {
        if (this.peerSubnets == null) {
            this.peerSubnets = new ArrayList<>();
        }
        peerSubnetsSetter.accept(this.peerSubnets);
        return this;
    }

    /**
     * 对端子网
     * @return peerSubnets
     */
    public List<String> getPeerSubnets() {
        return peerSubnets;
    }

    public void setPeerSubnets(List<String> peerSubnets) {
        this.peerSubnets = peerSubnets;
    }

    public CreateVpnConnectionRequestBodyContent withTunnelLocalAddress(String tunnelLocalAddress) {
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

    public CreateVpnConnectionRequestBodyContent withTunnelPeerAddress(String tunnelPeerAddress) {
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

    public CreateVpnConnectionRequestBodyContent withEnableNqa(Boolean enableNqa) {
        this.enableNqa = enableNqa;
        return this;
    }

    /**
     * 开启NQA检测
     * @return enableNqa
     */
    public Boolean getEnableNqa() {
        return enableNqa;
    }

    public void setEnableNqa(Boolean enableNqa) {
        this.enableNqa = enableNqa;
    }

    public CreateVpnConnectionRequestBodyContent withEnableHub(Boolean enableHub) {
        this.enableHub = enableHub;
        return this;
    }

    /**
     * 开启分支互联
     * @return enableHub
     */
    public Boolean getEnableHub() {
        return enableHub;
    }

    public void setEnableHub(Boolean enableHub) {
        this.enableHub = enableHub;
    }

    public CreateVpnConnectionRequestBodyContent withPsk(String psk) {
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

    public CreateVpnConnectionRequestBodyContent withPolicyRules(List<PolicyRule> policyRules) {
        this.policyRules = policyRules;
        return this;
    }

    public CreateVpnConnectionRequestBodyContent addPolicyRulesItem(PolicyRule policyRulesItem) {
        if (this.policyRules == null) {
            this.policyRules = new ArrayList<>();
        }
        this.policyRules.add(policyRulesItem);
        return this;
    }

    public CreateVpnConnectionRequestBodyContent withPolicyRules(Consumer<List<PolicyRule>> policyRulesSetter) {
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

    public CreateVpnConnectionRequestBodyContent withIkepolicy(IkePolicy ikepolicy) {
        this.ikepolicy = ikepolicy;
        return this;
    }

    public CreateVpnConnectionRequestBodyContent withIkepolicy(Consumer<IkePolicy> ikepolicySetter) {
        if (this.ikepolicy == null) {
            this.ikepolicy = new IkePolicy();
            ikepolicySetter.accept(this.ikepolicy);
        }

        return this;
    }

    /**
     * Get ikepolicy
     * @return ikepolicy
     */
    public IkePolicy getIkepolicy() {
        return ikepolicy;
    }

    public void setIkepolicy(IkePolicy ikepolicy) {
        this.ikepolicy = ikepolicy;
    }

    public CreateVpnConnectionRequestBodyContent withIpsecpolicy(IpsecPolicy ipsecpolicy) {
        this.ipsecpolicy = ipsecpolicy;
        return this;
    }

    public CreateVpnConnectionRequestBodyContent withIpsecpolicy(Consumer<IpsecPolicy> ipsecpolicySetter) {
        if (this.ipsecpolicy == null) {
            this.ipsecpolicy = new IpsecPolicy();
            ipsecpolicySetter.accept(this.ipsecpolicy);
        }

        return this;
    }

    /**
     * Get ipsecpolicy
     * @return ipsecpolicy
     */
    public IpsecPolicy getIpsecpolicy() {
        return ipsecpolicy;
    }

    public void setIpsecpolicy(IpsecPolicy ipsecpolicy) {
        this.ipsecpolicy = ipsecpolicy;
    }

    public CreateVpnConnectionRequestBodyContent withHaRole(HaRoleEnum haRole) {
        this.haRole = haRole;
        return this;
    }

    /**
     * 连接的HA角色
     * @return haRole
     */
    public HaRoleEnum getHaRole() {
        return haRole;
    }

    public void setHaRole(HaRoleEnum haRole) {
        this.haRole = haRole;
    }

    public CreateVpnConnectionRequestBodyContent withTags(List<VpnResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateVpnConnectionRequestBodyContent addTagsItem(VpnResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateVpnConnectionRequestBodyContent withTags(Consumer<List<VpnResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<VpnResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<VpnResourceTag> tags) {
        this.tags = tags;
    }

    public CreateVpnConnectionRequestBodyContent withPeerSubnetsV6(List<String> peerSubnetsV6) {
        this.peerSubnetsV6 = peerSubnetsV6;
        return this;
    }

    public CreateVpnConnectionRequestBodyContent addPeerSubnetsV6Item(String peerSubnetsV6Item) {
        if (this.peerSubnetsV6 == null) {
            this.peerSubnetsV6 = new ArrayList<>();
        }
        this.peerSubnetsV6.add(peerSubnetsV6Item);
        return this;
    }

    public CreateVpnConnectionRequestBodyContent withPeerSubnetsV6(Consumer<List<String>> peerSubnetsV6Setter) {
        if (this.peerSubnetsV6 == null) {
            this.peerSubnetsV6 = new ArrayList<>();
        }
        peerSubnetsV6Setter.accept(this.peerSubnetsV6);
        return this;
    }

    /**
     * 使能ipv6的对端子网
     * @return peerSubnetsV6
     */
    public List<String> getPeerSubnetsV6() {
        return peerSubnetsV6;
    }

    public void setPeerSubnetsV6(List<String> peerSubnetsV6) {
        this.peerSubnetsV6 = peerSubnetsV6;
    }

    public CreateVpnConnectionRequestBodyContent withPolicyRulesV6(List<PolicyRule> policyRulesV6) {
        this.policyRulesV6 = policyRulesV6;
        return this;
    }

    public CreateVpnConnectionRequestBodyContent addPolicyRulesV6Item(PolicyRule policyRulesV6Item) {
        if (this.policyRulesV6 == null) {
            this.policyRulesV6 = new ArrayList<>();
        }
        this.policyRulesV6.add(policyRulesV6Item);
        return this;
    }

    public CreateVpnConnectionRequestBodyContent withPolicyRulesV6(Consumer<List<PolicyRule>> policyRulesV6Setter) {
        if (this.policyRulesV6 == null) {
            this.policyRulesV6 = new ArrayList<>();
        }
        policyRulesV6Setter.accept(this.policyRulesV6);
        return this;
    }

    /**
     * 策略模式的ipv6策略规则组
     * @return policyRulesV6
     */
    public List<PolicyRule> getPolicyRulesV6() {
        return policyRulesV6;
    }

    public void setPolicyRulesV6(List<PolicyRule> policyRulesV6) {
        this.policyRulesV6 = policyRulesV6;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVpnConnectionRequestBodyContent that = (CreateVpnConnectionRequestBodyContent) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.vgwId, that.vgwId)
            && Objects.equals(this.vgwIp, that.vgwIp) && Objects.equals(this.style, that.style)
            && Objects.equals(this.cgwId, that.cgwId) && Objects.equals(this.peerSubnets, that.peerSubnets)
            && Objects.equals(this.tunnelLocalAddress, that.tunnelLocalAddress)
            && Objects.equals(this.tunnelPeerAddress, that.tunnelPeerAddress)
            && Objects.equals(this.enableNqa, that.enableNqa) && Objects.equals(this.enableHub, that.enableHub)
            && Objects.equals(this.psk, that.psk) && Objects.equals(this.policyRules, that.policyRules)
            && Objects.equals(this.ikepolicy, that.ikepolicy) && Objects.equals(this.ipsecpolicy, that.ipsecpolicy)
            && Objects.equals(this.haRole, that.haRole) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.peerSubnetsV6, that.peerSubnetsV6)
            && Objects.equals(this.policyRulesV6, that.policyRulesV6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            vgwId,
            vgwIp,
            style,
            cgwId,
            peerSubnets,
            tunnelLocalAddress,
            tunnelPeerAddress,
            enableNqa,
            enableHub,
            psk,
            policyRules,
            ikepolicy,
            ipsecpolicy,
            haRole,
            tags,
            peerSubnetsV6,
            policyRulesV6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpnConnectionRequestBodyContent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
        sb.append("    vgwIp: ").append(toIndentedString(vgwIp)).append("\n");
        sb.append("    style: ").append(toIndentedString(style)).append("\n");
        sb.append("    cgwId: ").append(toIndentedString(cgwId)).append("\n");
        sb.append("    peerSubnets: ").append(toIndentedString(peerSubnets)).append("\n");
        sb.append("    tunnelLocalAddress: ").append(toIndentedString(tunnelLocalAddress)).append("\n");
        sb.append("    tunnelPeerAddress: ").append(toIndentedString(tunnelPeerAddress)).append("\n");
        sb.append("    enableNqa: ").append(toIndentedString(enableNqa)).append("\n");
        sb.append("    enableHub: ").append(toIndentedString(enableHub)).append("\n");
        sb.append("    psk: ").append(toIndentedString(psk)).append("\n");
        sb.append("    policyRules: ").append(toIndentedString(policyRules)).append("\n");
        sb.append("    ikepolicy: ").append(toIndentedString(ikepolicy)).append("\n");
        sb.append("    ipsecpolicy: ").append(toIndentedString(ipsecpolicy)).append("\n");
        sb.append("    haRole: ").append(toIndentedString(haRole)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    peerSubnetsV6: ").append(toIndentedString(peerSubnetsV6)).append("\n");
        sb.append("    policyRulesV6: ").append(toIndentedString(policyRulesV6)).append("\n");
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
