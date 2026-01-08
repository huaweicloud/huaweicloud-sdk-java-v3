package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VpcQuotas
 */
public class VpcQuotas {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_policy_contain_rules")

    private Integer aclPolicyContainRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_group")

    private Integer addressGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_group_contain_ipset")

    private Integer addressGroupContainIpset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clouddcn_firewall_group")

    private Integer clouddcnFirewallGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clouddcn_acl_policy_contain_rules")

    private Integer clouddcnAclPolicyContainRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_gateway")

    private Integer edgeGateway;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eni_contain_secgroup")

    private Integer eniContainSecgroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_policy_contain_ipv4_composite_rules")

    private Integer firewallPolicyContainIpv4CompositeRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_policy_contain_ipv6_composite_rules")

    private Integer firewallPolicyContainIpv6CompositeRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forward_policy")

    private Integer forwardPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forward_policy_contain_ports")

    private Integer forwardPolicyContainPorts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forward_rule")

    private Integer forwardRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peering")

    private Integer peering;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roce_cluster_contain_networks")

    private Integer roceClusterContainNetworks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtb_allow_sys_cidr_routes")

    private Integer rtbAllowSysCidrRoutes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_bandwidth")

    private Integer sharedBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_bandwidth_contain_publicip")

    private Integer sharedBandwidthContainPublicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secgroup_contain_rules")

    private Integer secgroupContainRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secgroup_referred_by_nic")

    private Integer secgroupReferredByNic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    private Integer securityGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_contain_egress_ipv4_composite_rules")

    private Integer securityGroupContainEgressIpv4CompositeRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_contain_egress_ipv6_composite_rules")

    private Integer securityGroupContainEgressIpv6CompositeRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_contain_ingress_ipv4_composite_rules")

    private Integer securityGroupContainIngressIpv4CompositeRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_contain_ingress_ipv6_composite_rules")

    private Integer securityGroupContainIngressIpv6CompositeRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_rule")

    private Integer securityGroupRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_contain_eni")

    private Integer subnetContainEni;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter")

    private Integer trafficMirrorFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter_referred_by_session")

    private Integer trafficMirrorFilterReferredBySession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter_contain_rules_each_direction")

    private Integer trafficMirrorFilterContainRulesEachDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_session")

    private Integer trafficMirrorSession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_session_contain_sources")

    private Integer trafficMirrorSessionContainSources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_source_referred_by_session")

    private Integer trafficMirrorSourceReferredBySession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_target_elb_referred_by_session")

    private Integer trafficMirrorTargetElbReferredBySession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_target_eni_referred_by_session")

    private Integer trafficMirrorTargetEniReferredBySession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip")

    private Integer vip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet")

    private Integer virsubnet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_contain_ipv4_cidr_reservations")

    private Integer virsubnetContainIpv4CidrReservations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_contain_ipv6_cidr_reservations")

    private Integer virsubnetContainIpv6CidrReservations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private Integer vpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_contain_eni")

    private Integer vpcContainEni;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_contain_vip")

    private Integer vpcContainVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_contain_virsubnet")

    private Integer vpcContainVirsubnet;

    public VpcQuotas withAclPolicyContainRules(Integer aclPolicyContainRules) {
        this.aclPolicyContainRules = aclPolicyContainRules;
        return this;
    }

    /**
     * **参数解释**： 网络ACL单方向规则数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return aclPolicyContainRules
     */
    public Integer getAclPolicyContainRules() {
        return aclPolicyContainRules;
    }

    public void setAclPolicyContainRules(Integer aclPolicyContainRules) {
        this.aclPolicyContainRules = aclPolicyContainRules;
    }

    public VpcQuotas withAddressGroup(Integer addressGroup) {
        this.addressGroup = addressGroup;
        return this;
    }

    /**
     * **参数解释**： IP地址组数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return addressGroup
     */
    public Integer getAddressGroup() {
        return addressGroup;
    }

    public void setAddressGroup(Integer addressGroup) {
        this.addressGroup = addressGroup;
    }

    public VpcQuotas withAddressGroupContainIpset(Integer addressGroupContainIpset) {
        this.addressGroupContainIpset = addressGroupContainIpset;
        return this;
    }

    /**
     * **参数解释**： IP地址组包含的IP地址集数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return addressGroupContainIpset
     */
    public Integer getAddressGroupContainIpset() {
        return addressGroupContainIpset;
    }

    public void setAddressGroupContainIpset(Integer addressGroupContainIpset) {
        this.addressGroupContainIpset = addressGroupContainIpset;
    }

    public VpcQuotas withClouddcnFirewallGroup(Integer clouddcnFirewallGroup) {
        this.clouddcnFirewallGroup = clouddcnFirewallGroup;
        return this;
    }

    /**
     * **参数解释**： CloudDCN场景的网络ACL数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return clouddcnFirewallGroup
     */
    public Integer getClouddcnFirewallGroup() {
        return clouddcnFirewallGroup;
    }

    public void setClouddcnFirewallGroup(Integer clouddcnFirewallGroup) {
        this.clouddcnFirewallGroup = clouddcnFirewallGroup;
    }

    public VpcQuotas withClouddcnAclPolicyContainRules(Integer clouddcnAclPolicyContainRules) {
        this.clouddcnAclPolicyContainRules = clouddcnAclPolicyContainRules;
        return this;
    }

    /**
     * **参数解释**： CloudDCN场景的网络ACL单方向规则数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return clouddcnAclPolicyContainRules
     */
    public Integer getClouddcnAclPolicyContainRules() {
        return clouddcnAclPolicyContainRules;
    }

    public void setClouddcnAclPolicyContainRules(Integer clouddcnAclPolicyContainRules) {
        this.clouddcnAclPolicyContainRules = clouddcnAclPolicyContainRules;
    }

    public VpcQuotas withEdgeGateway(Integer edgeGateway) {
        this.edgeGateway = edgeGateway;
        return this;
    }

    /**
     * **参数解释**： 边缘网关数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return edgeGateway
     */
    public Integer getEdgeGateway() {
        return edgeGateway;
    }

    public void setEdgeGateway(Integer edgeGateway) {
        this.edgeGateway = edgeGateway;
    }

    public VpcQuotas withEniContainSecgroup(Integer eniContainSecgroup) {
        this.eniContainSecgroup = eniContainSecgroup;
        return this;
    }

    /**
     * **参数解释**： 弹性网卡关联的安全组数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return eniContainSecgroup
     */
    public Integer getEniContainSecgroup() {
        return eniContainSecgroup;
    }

    public void setEniContainSecgroup(Integer eniContainSecgroup) {
        this.eniContainSecgroup = eniContainSecgroup;
    }

    public VpcQuotas withFirewallPolicyContainIpv4CompositeRules(Integer firewallPolicyContainIpv4CompositeRules) {
        this.firewallPolicyContainIpv4CompositeRules = firewallPolicyContainIpv4CompositeRules;
        return this;
    }

    /**
     * **参数解释**： 网络ACL中配置了IP地址组或不连续端口的IPv4规则数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return firewallPolicyContainIpv4CompositeRules
     */
    public Integer getFirewallPolicyContainIpv4CompositeRules() {
        return firewallPolicyContainIpv4CompositeRules;
    }

    public void setFirewallPolicyContainIpv4CompositeRules(Integer firewallPolicyContainIpv4CompositeRules) {
        this.firewallPolicyContainIpv4CompositeRules = firewallPolicyContainIpv4CompositeRules;
    }

    public VpcQuotas withFirewallPolicyContainIpv6CompositeRules(Integer firewallPolicyContainIpv6CompositeRules) {
        this.firewallPolicyContainIpv6CompositeRules = firewallPolicyContainIpv6CompositeRules;
        return this;
    }

    /**
     * **参数解释**： 网络ACL中配置了IP地址组或不连续端口的IPv6规则数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return firewallPolicyContainIpv6CompositeRules
     */
    public Integer getFirewallPolicyContainIpv6CompositeRules() {
        return firewallPolicyContainIpv6CompositeRules;
    }

    public void setFirewallPolicyContainIpv6CompositeRules(Integer firewallPolicyContainIpv6CompositeRules) {
        this.firewallPolicyContainIpv6CompositeRules = firewallPolicyContainIpv6CompositeRules;
    }

    public VpcQuotas withForwardPolicy(Integer forwardPolicy) {
        this.forwardPolicy = forwardPolicy;
        return this;
    }

    /**
     * **参数解释**： 云转发策略数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return forwardPolicy
     */
    public Integer getForwardPolicy() {
        return forwardPolicy;
    }

    public void setForwardPolicy(Integer forwardPolicy) {
        this.forwardPolicy = forwardPolicy;
    }

    public VpcQuotas withForwardPolicyContainPorts(Integer forwardPolicyContainPorts) {
        this.forwardPolicyContainPorts = forwardPolicyContainPorts;
        return this;
    }

    /**
     * **参数解释**： 云转发策略关联端口数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return forwardPolicyContainPorts
     */
    public Integer getForwardPolicyContainPorts() {
        return forwardPolicyContainPorts;
    }

    public void setForwardPolicyContainPorts(Integer forwardPolicyContainPorts) {
        this.forwardPolicyContainPorts = forwardPolicyContainPorts;
    }

    public VpcQuotas withForwardRule(Integer forwardRule) {
        this.forwardRule = forwardRule;
        return this;
    }

    /**
     * **参数解释**： 云转发规则数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return forwardRule
     */
    public Integer getForwardRule() {
        return forwardRule;
    }

    public void setForwardRule(Integer forwardRule) {
        this.forwardRule = forwardRule;
    }

    public VpcQuotas withPeering(Integer peering) {
        this.peering = peering;
        return this;
    }

    /**
     * **参数解释**： 对等连接数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return peering
     */
    public Integer getPeering() {
        return peering;
    }

    public void setPeering(Integer peering) {
        this.peering = peering;
    }

    public VpcQuotas withRoceClusterContainNetworks(Integer roceClusterContainNetworks) {
        this.roceClusterContainNetworks = roceClusterContainNetworks;
        return this;
    }

    /**
     * **参数解释**： 一个physical_network下支持创建的roce网络数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return roceClusterContainNetworks
     */
    public Integer getRoceClusterContainNetworks() {
        return roceClusterContainNetworks;
    }

    public void setRoceClusterContainNetworks(Integer roceClusterContainNetworks) {
        this.roceClusterContainNetworks = roceClusterContainNetworks;
    }

    public VpcQuotas withRtbAllowSysCidrRoutes(Integer rtbAllowSysCidrRoutes) {
        this.rtbAllowSysCidrRoutes = rtbAllowSysCidrRoutes;
        return this;
    }

    /**
     * **参数解释**： 路由表支持系统路由数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return rtbAllowSysCidrRoutes
     */
    public Integer getRtbAllowSysCidrRoutes() {
        return rtbAllowSysCidrRoutes;
    }

    public void setRtbAllowSysCidrRoutes(Integer rtbAllowSysCidrRoutes) {
        this.rtbAllowSysCidrRoutes = rtbAllowSysCidrRoutes;
    }

    public VpcQuotas withSharedBandwidth(Integer sharedBandwidth) {
        this.sharedBandwidth = sharedBandwidth;
        return this;
    }

    /**
     * **参数解释**： 共享带宽组数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return sharedBandwidth
     */
    public Integer getSharedBandwidth() {
        return sharedBandwidth;
    }

    public void setSharedBandwidth(Integer sharedBandwidth) {
        this.sharedBandwidth = sharedBandwidth;
    }

    public VpcQuotas withSharedBandwidthContainPublicip(Integer sharedBandwidthContainPublicip) {
        this.sharedBandwidthContainPublicip = sharedBandwidthContainPublicip;
        return this;
    }

    /**
     * **参数解释**： 单个共享带宽关联的弹性公网IP数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return sharedBandwidthContainPublicip
     */
    public Integer getSharedBandwidthContainPublicip() {
        return sharedBandwidthContainPublicip;
    }

    public void setSharedBandwidthContainPublicip(Integer sharedBandwidthContainPublicip) {
        this.sharedBandwidthContainPublicip = sharedBandwidthContainPublicip;
    }

    public VpcQuotas withSecgroupContainRules(Integer secgroupContainRules) {
        this.secgroupContainRules = secgroupContainRules;
        return this;
    }

    /**
     * **参数解释**： 单个安全组包含的规则数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return secgroupContainRules
     */
    public Integer getSecgroupContainRules() {
        return secgroupContainRules;
    }

    public void setSecgroupContainRules(Integer secgroupContainRules) {
        this.secgroupContainRules = secgroupContainRules;
    }

    public VpcQuotas withSecgroupReferredByNic(Integer secgroupReferredByNic) {
        this.secgroupReferredByNic = secgroupReferredByNic;
        return this;
    }

    /**
     * **参数解释**： 单个安全组关联的网卡数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return secgroupReferredByNic
     */
    public Integer getSecgroupReferredByNic() {
        return secgroupReferredByNic;
    }

    public void setSecgroupReferredByNic(Integer secgroupReferredByNic) {
        this.secgroupReferredByNic = secgroupReferredByNic;
    }

    public VpcQuotas withSecurityGroup(Integer securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    /**
     * **参数解释**： 安全组数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return securityGroup
     */
    public Integer getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(Integer securityGroup) {
        this.securityGroup = securityGroup;
    }

    public VpcQuotas withSecurityGroupContainEgressIpv4CompositeRules(
        Integer securityGroupContainEgressIpv4CompositeRules) {
        this.securityGroupContainEgressIpv4CompositeRules = securityGroupContainEgressIpv4CompositeRules;
        return this;
    }

    /**
     * **参数解释**： 安全组中配置了IP地址组、不连续端口或远端安全组的IPv4出方向规则数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return securityGroupContainEgressIpv4CompositeRules
     */
    public Integer getSecurityGroupContainEgressIpv4CompositeRules() {
        return securityGroupContainEgressIpv4CompositeRules;
    }

    public void setSecurityGroupContainEgressIpv4CompositeRules(Integer securityGroupContainEgressIpv4CompositeRules) {
        this.securityGroupContainEgressIpv4CompositeRules = securityGroupContainEgressIpv4CompositeRules;
    }

    public VpcQuotas withSecurityGroupContainEgressIpv6CompositeRules(
        Integer securityGroupContainEgressIpv6CompositeRules) {
        this.securityGroupContainEgressIpv6CompositeRules = securityGroupContainEgressIpv6CompositeRules;
        return this;
    }

    /**
     * **参数解释**： 安全组中配置了IP地址组、不连续端口或远端安全组的IPv6出方向规则数配。 **取值范围**： 整数，-1表示此配额未上线。
     * @return securityGroupContainEgressIpv6CompositeRules
     */
    public Integer getSecurityGroupContainEgressIpv6CompositeRules() {
        return securityGroupContainEgressIpv6CompositeRules;
    }

    public void setSecurityGroupContainEgressIpv6CompositeRules(Integer securityGroupContainEgressIpv6CompositeRules) {
        this.securityGroupContainEgressIpv6CompositeRules = securityGroupContainEgressIpv6CompositeRules;
    }

    public VpcQuotas withSecurityGroupContainIngressIpv4CompositeRules(
        Integer securityGroupContainIngressIpv4CompositeRules) {
        this.securityGroupContainIngressIpv4CompositeRules = securityGroupContainIngressIpv4CompositeRules;
        return this;
    }

    /**
     * **参数解释**： 安全组中配置了IP地址组、不连续端口或远端安全组的IPv4入方向规则数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return securityGroupContainIngressIpv4CompositeRules
     */
    public Integer getSecurityGroupContainIngressIpv4CompositeRules() {
        return securityGroupContainIngressIpv4CompositeRules;
    }

    public void setSecurityGroupContainIngressIpv4CompositeRules(
        Integer securityGroupContainIngressIpv4CompositeRules) {
        this.securityGroupContainIngressIpv4CompositeRules = securityGroupContainIngressIpv4CompositeRules;
    }

    public VpcQuotas withSecurityGroupContainIngressIpv6CompositeRules(
        Integer securityGroupContainIngressIpv6CompositeRules) {
        this.securityGroupContainIngressIpv6CompositeRules = securityGroupContainIngressIpv6CompositeRules;
        return this;
    }

    /**
     * **参数解释**： 安全组中配置了IP地址组、不连续端口或远端安全组的IPv6入方向规则数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return securityGroupContainIngressIpv6CompositeRules
     */
    public Integer getSecurityGroupContainIngressIpv6CompositeRules() {
        return securityGroupContainIngressIpv6CompositeRules;
    }

    public void setSecurityGroupContainIngressIpv6CompositeRules(
        Integer securityGroupContainIngressIpv6CompositeRules) {
        this.securityGroupContainIngressIpv6CompositeRules = securityGroupContainIngressIpv6CompositeRules;
    }

    public VpcQuotas withSecurityGroupRule(Integer securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
        return this;
    }

    /**
     * **参数解释**： 安全组规则数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return securityGroupRule
     */
    public Integer getSecurityGroupRule() {
        return securityGroupRule;
    }

    public void setSecurityGroupRule(Integer securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
    }

    public VpcQuotas withSubnetContainEni(Integer subnetContainEni) {
        this.subnetContainEni = subnetContainEni;
        return this;
    }

    /**
     * **参数解释**： 单个子网包含的弹性网卡数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return subnetContainEni
     */
    public Integer getSubnetContainEni() {
        return subnetContainEni;
    }

    public void setSubnetContainEni(Integer subnetContainEni) {
        this.subnetContainEni = subnetContainEni;
    }

    public VpcQuotas withTrafficMirrorFilter(Integer trafficMirrorFilter) {
        this.trafficMirrorFilter = trafficMirrorFilter;
        return this;
    }

    /**
     * **参数解释**： 流量镜像筛选条件数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return trafficMirrorFilter
     */
    public Integer getTrafficMirrorFilter() {
        return trafficMirrorFilter;
    }

    public void setTrafficMirrorFilter(Integer trafficMirrorFilter) {
        this.trafficMirrorFilter = trafficMirrorFilter;
    }

    public VpcQuotas withTrafficMirrorFilterReferredBySession(Integer trafficMirrorFilterReferredBySession) {
        this.trafficMirrorFilterReferredBySession = trafficMirrorFilterReferredBySession;
        return this;
    }

    /**
     * **参数解释**： 单个流量镜像筛选条件被镜像会话引用数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return trafficMirrorFilterReferredBySession
     */
    public Integer getTrafficMirrorFilterReferredBySession() {
        return trafficMirrorFilterReferredBySession;
    }

    public void setTrafficMirrorFilterReferredBySession(Integer trafficMirrorFilterReferredBySession) {
        this.trafficMirrorFilterReferredBySession = trafficMirrorFilterReferredBySession;
    }

    public VpcQuotas withTrafficMirrorFilterContainRulesEachDirection(
        Integer trafficMirrorFilterContainRulesEachDirection) {
        this.trafficMirrorFilterContainRulesEachDirection = trafficMirrorFilterContainRulesEachDirection;
        return this;
    }

    /**
     * **参数解释**： 流量镜像筛选条件单方向规则数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return trafficMirrorFilterContainRulesEachDirection
     */
    public Integer getTrafficMirrorFilterContainRulesEachDirection() {
        return trafficMirrorFilterContainRulesEachDirection;
    }

    public void setTrafficMirrorFilterContainRulesEachDirection(Integer trafficMirrorFilterContainRulesEachDirection) {
        this.trafficMirrorFilterContainRulesEachDirection = trafficMirrorFilterContainRulesEachDirection;
    }

    public VpcQuotas withTrafficMirrorSession(Integer trafficMirrorSession) {
        this.trafficMirrorSession = trafficMirrorSession;
        return this;
    }

    /**
     * **参数解释**： 流量镜像会话数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return trafficMirrorSession
     */
    public Integer getTrafficMirrorSession() {
        return trafficMirrorSession;
    }

    public void setTrafficMirrorSession(Integer trafficMirrorSession) {
        this.trafficMirrorSession = trafficMirrorSession;
    }

    public VpcQuotas withTrafficMirrorSessionContainSources(Integer trafficMirrorSessionContainSources) {
        this.trafficMirrorSessionContainSources = trafficMirrorSessionContainSources;
        return this;
    }

    /**
     * **参数解释**： 单个流量镜像会话关联的镜像源数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return trafficMirrorSessionContainSources
     */
    public Integer getTrafficMirrorSessionContainSources() {
        return trafficMirrorSessionContainSources;
    }

    public void setTrafficMirrorSessionContainSources(Integer trafficMirrorSessionContainSources) {
        this.trafficMirrorSessionContainSources = trafficMirrorSessionContainSources;
    }

    public VpcQuotas withTrafficMirrorSourceReferredBySession(Integer trafficMirrorSourceReferredBySession) {
        this.trafficMirrorSourceReferredBySession = trafficMirrorSourceReferredBySession;
        return this;
    }

    /**
     * **参数解释**： 单个镜像源被流量镜像会话引用次数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return trafficMirrorSourceReferredBySession
     */
    public Integer getTrafficMirrorSourceReferredBySession() {
        return trafficMirrorSourceReferredBySession;
    }

    public void setTrafficMirrorSourceReferredBySession(Integer trafficMirrorSourceReferredBySession) {
        this.trafficMirrorSourceReferredBySession = trafficMirrorSourceReferredBySession;
    }

    public VpcQuotas withTrafficMirrorTargetElbReferredBySession(Integer trafficMirrorTargetElbReferredBySession) {
        this.trafficMirrorTargetElbReferredBySession = trafficMirrorTargetElbReferredBySession;
        return this;
    }

    /**
     * **参数解释**： 私网弹性负载均衡类型的镜像目的被会话引用次数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return trafficMirrorTargetElbReferredBySession
     */
    public Integer getTrafficMirrorTargetElbReferredBySession() {
        return trafficMirrorTargetElbReferredBySession;
    }

    public void setTrafficMirrorTargetElbReferredBySession(Integer trafficMirrorTargetElbReferredBySession) {
        this.trafficMirrorTargetElbReferredBySession = trafficMirrorTargetElbReferredBySession;
    }

    public VpcQuotas withTrafficMirrorTargetEniReferredBySession(Integer trafficMirrorTargetEniReferredBySession) {
        this.trafficMirrorTargetEniReferredBySession = trafficMirrorTargetEniReferredBySession;
        return this;
    }

    /**
     * **参数解释**： 弹性网卡类型的镜像目的被会话引用次数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return trafficMirrorTargetEniReferredBySession
     */
    public Integer getTrafficMirrorTargetEniReferredBySession() {
        return trafficMirrorTargetEniReferredBySession;
    }

    public void setTrafficMirrorTargetEniReferredBySession(Integer trafficMirrorTargetEniReferredBySession) {
        this.trafficMirrorTargetEniReferredBySession = trafficMirrorTargetEniReferredBySession;
    }

    public VpcQuotas withVip(Integer vip) {
        this.vip = vip;
        return this;
    }

    /**
     * **参数解释**： 虚拟IP数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return vip
     */
    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public VpcQuotas withVirsubnet(Integer virsubnet) {
        this.virsubnet = virsubnet;
        return this;
    }

    /**
     * **参数解释**： 子网数配额。 **取值范围**： 整数，-1表示此配额未上线，请通过[v1查询配额接口](vpc_quota_0001.xml)。
     * @return virsubnet
     */
    public Integer getVirsubnet() {
        return virsubnet;
    }

    public void setVirsubnet(Integer virsubnet) {
        this.virsubnet = virsubnet;
    }

    public VpcQuotas withVirsubnetContainIpv4CidrReservations(Integer virsubnetContainIpv4CidrReservations) {
        this.virsubnetContainIpv4CidrReservations = virsubnetContainIpv4CidrReservations;
        return this;
    }

    /**
     * **参数解释**： 单子网包含IPv4子网预留网段数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return virsubnetContainIpv4CidrReservations
     */
    public Integer getVirsubnetContainIpv4CidrReservations() {
        return virsubnetContainIpv4CidrReservations;
    }

    public void setVirsubnetContainIpv4CidrReservations(Integer virsubnetContainIpv4CidrReservations) {
        this.virsubnetContainIpv4CidrReservations = virsubnetContainIpv4CidrReservations;
    }

    public VpcQuotas withVirsubnetContainIpv6CidrReservations(Integer virsubnetContainIpv6CidrReservations) {
        this.virsubnetContainIpv6CidrReservations = virsubnetContainIpv6CidrReservations;
        return this;
    }

    /**
     * **参数解释**： 单子网包含IPv6子网预留网段数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return virsubnetContainIpv6CidrReservations
     */
    public Integer getVirsubnetContainIpv6CidrReservations() {
        return virsubnetContainIpv6CidrReservations;
    }

    public void setVirsubnetContainIpv6CidrReservations(Integer virsubnetContainIpv6CidrReservations) {
        this.virsubnetContainIpv6CidrReservations = virsubnetContainIpv6CidrReservations;
    }

    public VpcQuotas withVpc(Integer vpc) {
        this.vpc = vpc;
        return this;
    }

    /**
     * **参数解释**： VPC数配额。 **取值范围**： 整数，-1表示此配额未上线，请通过[v1查询配额接口](vpc_quota_0001.xml)。
     * @return vpc
     */
    public Integer getVpc() {
        return vpc;
    }

    public void setVpc(Integer vpc) {
        this.vpc = vpc;
    }

    public VpcQuotas withVpcContainEni(Integer vpcContainEni) {
        this.vpcContainEni = vpcContainEni;
        return this;
    }

    /**
     * **参数解释**： 单个VPC包含弹性网卡数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return vpcContainEni
     */
    public Integer getVpcContainEni() {
        return vpcContainEni;
    }

    public void setVpcContainEni(Integer vpcContainEni) {
        this.vpcContainEni = vpcContainEni;
    }

    public VpcQuotas withVpcContainVip(Integer vpcContainVip) {
        this.vpcContainVip = vpcContainVip;
        return this;
    }

    /**
     * **参数解释**： 单个VPC包含虚拟IP数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return vpcContainVip
     */
    public Integer getVpcContainVip() {
        return vpcContainVip;
    }

    public void setVpcContainVip(Integer vpcContainVip) {
        this.vpcContainVip = vpcContainVip;
    }

    public VpcQuotas withVpcContainVirsubnet(Integer vpcContainVirsubnet) {
        this.vpcContainVirsubnet = vpcContainVirsubnet;
        return this;
    }

    /**
     * **参数解释**： 单个VPC包含子网数配额。 **取值范围**： 整数，-1表示此配额未上线。
     * @return vpcContainVirsubnet
     */
    public Integer getVpcContainVirsubnet() {
        return vpcContainVirsubnet;
    }

    public void setVpcContainVirsubnet(Integer vpcContainVirsubnet) {
        this.vpcContainVirsubnet = vpcContainVirsubnet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpcQuotas that = (VpcQuotas) obj;
        return Objects.equals(this.aclPolicyContainRules, that.aclPolicyContainRules)
            && Objects.equals(this.addressGroup, that.addressGroup)
            && Objects.equals(this.addressGroupContainIpset, that.addressGroupContainIpset)
            && Objects.equals(this.clouddcnFirewallGroup, that.clouddcnFirewallGroup)
            && Objects.equals(this.clouddcnAclPolicyContainRules, that.clouddcnAclPolicyContainRules)
            && Objects.equals(this.edgeGateway, that.edgeGateway)
            && Objects.equals(this.eniContainSecgroup, that.eniContainSecgroup)
            && Objects.equals(this.firewallPolicyContainIpv4CompositeRules,
                that.firewallPolicyContainIpv4CompositeRules)
            && Objects.equals(this.firewallPolicyContainIpv6CompositeRules,
                that.firewallPolicyContainIpv6CompositeRules)
            && Objects.equals(this.forwardPolicy, that.forwardPolicy)
            && Objects.equals(this.forwardPolicyContainPorts, that.forwardPolicyContainPorts)
            && Objects.equals(this.forwardRule, that.forwardRule) && Objects.equals(this.peering, that.peering)
            && Objects.equals(this.roceClusterContainNetworks, that.roceClusterContainNetworks)
            && Objects.equals(this.rtbAllowSysCidrRoutes, that.rtbAllowSysCidrRoutes)
            && Objects.equals(this.sharedBandwidth, that.sharedBandwidth)
            && Objects.equals(this.sharedBandwidthContainPublicip, that.sharedBandwidthContainPublicip)
            && Objects.equals(this.secgroupContainRules, that.secgroupContainRules)
            && Objects.equals(this.secgroupReferredByNic, that.secgroupReferredByNic)
            && Objects.equals(this.securityGroup, that.securityGroup)
            && Objects.equals(this.securityGroupContainEgressIpv4CompositeRules,
                that.securityGroupContainEgressIpv4CompositeRules)
            && Objects.equals(this.securityGroupContainEgressIpv6CompositeRules,
                that.securityGroupContainEgressIpv6CompositeRules)
            && Objects.equals(this.securityGroupContainIngressIpv4CompositeRules,
                that.securityGroupContainIngressIpv4CompositeRules)
            && Objects.equals(this.securityGroupContainIngressIpv6CompositeRules,
                that.securityGroupContainIngressIpv6CompositeRules)
            && Objects.equals(this.securityGroupRule, that.securityGroupRule)
            && Objects.equals(this.subnetContainEni, that.subnetContainEni)
            && Objects.equals(this.trafficMirrorFilter, that.trafficMirrorFilter)
            && Objects.equals(this.trafficMirrorFilterReferredBySession, that.trafficMirrorFilterReferredBySession)
            && Objects.equals(this.trafficMirrorFilterContainRulesEachDirection,
                that.trafficMirrorFilterContainRulesEachDirection)
            && Objects.equals(this.trafficMirrorSession, that.trafficMirrorSession)
            && Objects.equals(this.trafficMirrorSessionContainSources, that.trafficMirrorSessionContainSources)
            && Objects.equals(this.trafficMirrorSourceReferredBySession, that.trafficMirrorSourceReferredBySession)
            && Objects.equals(this.trafficMirrorTargetElbReferredBySession,
                that.trafficMirrorTargetElbReferredBySession)
            && Objects.equals(this.trafficMirrorTargetEniReferredBySession,
                that.trafficMirrorTargetEniReferredBySession)
            && Objects.equals(this.vip, that.vip) && Objects.equals(this.virsubnet, that.virsubnet)
            && Objects.equals(this.virsubnetContainIpv4CidrReservations, that.virsubnetContainIpv4CidrReservations)
            && Objects.equals(this.virsubnetContainIpv6CidrReservations, that.virsubnetContainIpv6CidrReservations)
            && Objects.equals(this.vpc, that.vpc) && Objects.equals(this.vpcContainEni, that.vpcContainEni)
            && Objects.equals(this.vpcContainVip, that.vpcContainVip)
            && Objects.equals(this.vpcContainVirsubnet, that.vpcContainVirsubnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aclPolicyContainRules,
            addressGroup,
            addressGroupContainIpset,
            clouddcnFirewallGroup,
            clouddcnAclPolicyContainRules,
            edgeGateway,
            eniContainSecgroup,
            firewallPolicyContainIpv4CompositeRules,
            firewallPolicyContainIpv6CompositeRules,
            forwardPolicy,
            forwardPolicyContainPorts,
            forwardRule,
            peering,
            roceClusterContainNetworks,
            rtbAllowSysCidrRoutes,
            sharedBandwidth,
            sharedBandwidthContainPublicip,
            secgroupContainRules,
            secgroupReferredByNic,
            securityGroup,
            securityGroupContainEgressIpv4CompositeRules,
            securityGroupContainEgressIpv6CompositeRules,
            securityGroupContainIngressIpv4CompositeRules,
            securityGroupContainIngressIpv6CompositeRules,
            securityGroupRule,
            subnetContainEni,
            trafficMirrorFilter,
            trafficMirrorFilterReferredBySession,
            trafficMirrorFilterContainRulesEachDirection,
            trafficMirrorSession,
            trafficMirrorSessionContainSources,
            trafficMirrorSourceReferredBySession,
            trafficMirrorTargetElbReferredBySession,
            trafficMirrorTargetEniReferredBySession,
            vip,
            virsubnet,
            virsubnetContainIpv4CidrReservations,
            virsubnetContainIpv6CidrReservations,
            vpc,
            vpcContainEni,
            vpcContainVip,
            vpcContainVirsubnet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcQuotas {\n");
        sb.append("    aclPolicyContainRules: ").append(toIndentedString(aclPolicyContainRules)).append("\n");
        sb.append("    addressGroup: ").append(toIndentedString(addressGroup)).append("\n");
        sb.append("    addressGroupContainIpset: ").append(toIndentedString(addressGroupContainIpset)).append("\n");
        sb.append("    clouddcnFirewallGroup: ").append(toIndentedString(clouddcnFirewallGroup)).append("\n");
        sb.append("    clouddcnAclPolicyContainRules: ")
            .append(toIndentedString(clouddcnAclPolicyContainRules))
            .append("\n");
        sb.append("    edgeGateway: ").append(toIndentedString(edgeGateway)).append("\n");
        sb.append("    eniContainSecgroup: ").append(toIndentedString(eniContainSecgroup)).append("\n");
        sb.append("    firewallPolicyContainIpv4CompositeRules: ")
            .append(toIndentedString(firewallPolicyContainIpv4CompositeRules))
            .append("\n");
        sb.append("    firewallPolicyContainIpv6CompositeRules: ")
            .append(toIndentedString(firewallPolicyContainIpv6CompositeRules))
            .append("\n");
        sb.append("    forwardPolicy: ").append(toIndentedString(forwardPolicy)).append("\n");
        sb.append("    forwardPolicyContainPorts: ").append(toIndentedString(forwardPolicyContainPorts)).append("\n");
        sb.append("    forwardRule: ").append(toIndentedString(forwardRule)).append("\n");
        sb.append("    peering: ").append(toIndentedString(peering)).append("\n");
        sb.append("    roceClusterContainNetworks: ").append(toIndentedString(roceClusterContainNetworks)).append("\n");
        sb.append("    rtbAllowSysCidrRoutes: ").append(toIndentedString(rtbAllowSysCidrRoutes)).append("\n");
        sb.append("    sharedBandwidth: ").append(toIndentedString(sharedBandwidth)).append("\n");
        sb.append("    sharedBandwidthContainPublicip: ")
            .append(toIndentedString(sharedBandwidthContainPublicip))
            .append("\n");
        sb.append("    secgroupContainRules: ").append(toIndentedString(secgroupContainRules)).append("\n");
        sb.append("    secgroupReferredByNic: ").append(toIndentedString(secgroupReferredByNic)).append("\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
        sb.append("    securityGroupContainEgressIpv4CompositeRules: ")
            .append(toIndentedString(securityGroupContainEgressIpv4CompositeRules))
            .append("\n");
        sb.append("    securityGroupContainEgressIpv6CompositeRules: ")
            .append(toIndentedString(securityGroupContainEgressIpv6CompositeRules))
            .append("\n");
        sb.append("    securityGroupContainIngressIpv4CompositeRules: ")
            .append(toIndentedString(securityGroupContainIngressIpv4CompositeRules))
            .append("\n");
        sb.append("    securityGroupContainIngressIpv6CompositeRules: ")
            .append(toIndentedString(securityGroupContainIngressIpv6CompositeRules))
            .append("\n");
        sb.append("    securityGroupRule: ").append(toIndentedString(securityGroupRule)).append("\n");
        sb.append("    subnetContainEni: ").append(toIndentedString(subnetContainEni)).append("\n");
        sb.append("    trafficMirrorFilter: ").append(toIndentedString(trafficMirrorFilter)).append("\n");
        sb.append("    trafficMirrorFilterReferredBySession: ")
            .append(toIndentedString(trafficMirrorFilterReferredBySession))
            .append("\n");
        sb.append("    trafficMirrorFilterContainRulesEachDirection: ")
            .append(toIndentedString(trafficMirrorFilterContainRulesEachDirection))
            .append("\n");
        sb.append("    trafficMirrorSession: ").append(toIndentedString(trafficMirrorSession)).append("\n");
        sb.append("    trafficMirrorSessionContainSources: ")
            .append(toIndentedString(trafficMirrorSessionContainSources))
            .append("\n");
        sb.append("    trafficMirrorSourceReferredBySession: ")
            .append(toIndentedString(trafficMirrorSourceReferredBySession))
            .append("\n");
        sb.append("    trafficMirrorTargetElbReferredBySession: ")
            .append(toIndentedString(trafficMirrorTargetElbReferredBySession))
            .append("\n");
        sb.append("    trafficMirrorTargetEniReferredBySession: ")
            .append(toIndentedString(trafficMirrorTargetEniReferredBySession))
            .append("\n");
        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
        sb.append("    virsubnet: ").append(toIndentedString(virsubnet)).append("\n");
        sb.append("    virsubnetContainIpv4CidrReservations: ")
            .append(toIndentedString(virsubnetContainIpv4CidrReservations))
            .append("\n");
        sb.append("    virsubnetContainIpv6CidrReservations: ")
            .append(toIndentedString(virsubnetContainIpv6CidrReservations))
            .append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    vpcContainEni: ").append(toIndentedString(vpcContainEni)).append("\n");
        sb.append("    vpcContainVip: ").append(toIndentedString(vpcContainVip)).append("\n");
        sb.append("    vpcContainVirsubnet: ").append(toIndentedString(vpcContainVirsubnet)).append("\n");
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
