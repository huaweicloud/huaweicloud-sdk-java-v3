package com.huaweicloud.sdk.vpc.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.vpc.v2.model.*;

public class VpcClient {
    protected HcClient hcClient;

    public VpcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcClient> newBuilder() {
        return new ClientBuilder<>(VpcClient::new);
    }


    /**
     * 接受对等连接请求
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户接受其他租户发起的对等连接请求。
     *
     * @param AcceptVpcPeeringRequest 请求对象
     * @return AcceptVpcPeeringResponse
     */
    public AcceptVpcPeeringResponse acceptVpcPeering(AcceptVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.acceptVpcPeering);
    }

    /**
     * 创建端口
     * 创建端口。
     *
     * @param CreatePortRequest 请求对象
     * @return CreatePortResponse
     */
    public CreatePortResponse createPort(CreatePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createPort);
    }

    /**
     * 创建安全组
     * 创建安全组。
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return CreateSecurityGroupResponse
     */
    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    /**
     * 创建安全组规则
     * 创建安全组规则。
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return CreateSecurityGroupRuleResponse
     */
    public CreateSecurityGroupRuleResponse createSecurityGroupRule(CreateSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    /**
     * 创建子网
     * 创建子网。
     *
     * @param CreateSubnetRequest 请求对象
     * @return CreateSubnetResponse
     */
    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSubnet);
    }

    /**
     * 创建对等连接
     * 创建对等连接。
     *
     * @param CreateVpcPeeringRequest 请求对象
     * @return CreateVpcPeeringResponse
     */
    public CreateVpcPeeringResponse createVpcPeering(CreateVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpcPeering);
    }

    /**
     * 删除端口
     * 删除端口。
     *
     * @param DeletePortRequest 请求对象
     * @return DeletePortResponse
     */
    public DeletePortResponse deletePort(DeletePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deletePort);
    }

    /**
     * 删除安全组
     * 删除安全组。
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return DeleteSecurityGroupResponse
     */
    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    /**
     * 删除安全组规则
     * 删除安全组规则。
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return DeleteSecurityGroupRuleResponse
     */
    public DeleteSecurityGroupRuleResponse deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    /**
     * 删除子网
     * 删除子网
     *
     * @param DeleteSubnetRequest 请求对象
     * @return DeleteSubnetResponse
     */
    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSubnet);
    }

    /**
     * 删除对等连接
     * 删除对等连接。 可以在在本端或对端任何一端删除对等连接。
     *
     * @param DeleteVpcPeeringRequest 请求对象
     * @return DeleteVpcPeeringResponse
     */
    public DeleteVpcPeeringResponse deleteVpcPeering(DeleteVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpcPeering);
    }

    /**
     * 查询端口列表
     * 查询提交请求的租户的所有端口，单次查询最多返回2000条数据。
     *
     * @param ListPortsRequest 请求对象
     * @return ListPortsResponse
     */
    public ListPortsResponse listPorts(ListPortsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listPorts);
    }

    /**
     * 查询安全组规则列表
     * 查询安全组规则列表。
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return ListSecurityGroupRulesResponse
     */
    public ListSecurityGroupRulesResponse listSecurityGroupRules(ListSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    /**
     * 查询安全组列表
     * 查询安全组列表
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return ListSecurityGroupsResponse
     */
    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    /**
     * 查询子网列表
     * 查询子网列表
     *
     * @param ListSubnetsRequest 请求对象
     * @return ListSubnetsResponse
     */
    public ListSubnetsResponse listSubnets(ListSubnetsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubnets);
    }

    /**
     * 查询对等连接列表
     * 查询提交请求的租户的所有对等连接。根据过滤条件进行过滤。
     *
     * @param ListVpcPeeringsRequest 请求对象
     * @return ListVpcPeeringsResponse
     */
    public ListVpcPeeringsResponse listVpcPeerings(ListVpcPeeringsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcPeerings);
    }

    /**
     * 拒绝对等连接请求
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户拒绝其他租户发起的对等连接请求。
     *
     * @param RejectVpcPeeringRequest 请求对象
     * @return RejectVpcPeeringResponse
     */
    public RejectVpcPeeringResponse rejectVpcPeering(RejectVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.rejectVpcPeering);
    }

    /**
     * 查询端口
     * 查询单个端口详情。
     *
     * @param ShowPortRequest 请求对象
     * @return ShowPortResponse
     */
    public ShowPortResponse showPort(ShowPortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showPort);
    }

    /**
     * 查询配额
     * 查询单租户在VPC服务下的网络资源配额，包括vpc配额、子网配额、安全组配额、安全组规则配额、弹性公网IP配额，vpn配额等。
     *
     * @param ShowQuotaRequest 请求对象
     * @return ShowQuotaResponse
     */
    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showQuota);
    }

    /**
     * 查询安全组
     * 查询单个安全组详情。
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return ShowSecurityGroupResponse
     */
    public ShowSecurityGroupResponse showSecurityGroup(ShowSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    /**
     * 查询安全组规则
     * 查询单个安全组规则详情
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return ShowSecurityGroupRuleResponse
     */
    public ShowSecurityGroupRuleResponse showSecurityGroupRule(ShowSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    /**
     * 查询子网
     * 查询子网详情。
     *
     * @param ShowSubnetRequest 请求对象
     * @return ShowSubnetResponse
     */
    public ShowSubnetResponse showSubnet(ShowSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubnet);
    }

    /**
     * 查询对等连接
     * 查询对等连接详情。
     *
     * @param ShowVpcPeeringRequest 请求对象
     * @return ShowVpcPeeringResponse
     */
    public ShowVpcPeeringResponse showVpcPeering(ShowVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpcPeering);
    }

    /**
     * 更新端口
     * 更新端口。
     *
     * @param UpdatePortRequest 请求对象
     * @return UpdatePortResponse
     */
    public UpdatePortResponse updatePort(UpdatePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updatePort);
    }

    /**
     * 更新子网
     * 更新子网。
     *
     * @param UpdateSubnetRequest 请求对象
     * @return UpdateSubnetResponse
     */
    public UpdateSubnetResponse updateSubnet(UpdateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSubnet);
    }

    /**
     * 更新对等连接
     * 更新对等连接。
     *
     * @param UpdateVpcPeeringRequest 请求对象
     * @return UpdateVpcPeeringResponse
     */
    public UpdateVpcPeeringResponse updateVpcPeering(UpdateVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateVpcPeering);
    }

    /**
     * 申请私有IP
     * 申请私有IP。
     *
     * @param CreatePrivateipRequest 请求对象
     * @return CreatePrivateipResponse
     */
    public CreatePrivateipResponse createPrivateip(CreatePrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createPrivateip);
    }

    /**
     * 删除私有IP
     * 删除私有IP。
     *
     * @param DeletePrivateipRequest 请求对象
     * @return DeletePrivateipResponse
     */
    public DeletePrivateipResponse deletePrivateip(DeletePrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deletePrivateip);
    }

    /**
     * 查询私有IP列表
     * 查询指定子网下的私有IP列表。
     *
     * @param ListPrivateipsRequest 请求对象
     * @return ListPrivateipsResponse
     */
    public ListPrivateipsResponse listPrivateips(ListPrivateipsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listPrivateips);
    }

    /**
     * 查询网络IP使用情况
     * 显示一个指定网络中的IPv4地址使用情况。 包括此网络中的IP总数以及已用IP总数，以及网络下每一个子网的IP地址总数和可用IP地址总数。  &gt; 须知  - 系统预留地址指的是子网的第1个以及最后4个地址，一般用于网关、DHCP等服务。 - 这里以及下文描述的IP地址总数、已用IP地址总数不包含系统预留地址。 - 在分配IP时，用户可以指定系统预留的IP地址。但是不论IP是如何分配的，只要是处于系统预留IP地址段的IP均不会被统计到已用IP地址数目和IP地址总数中。
     *
     * @param ShowNetworkIpAvailabilitiesRequest 请求对象
     * @return ShowNetworkIpAvailabilitiesResponse
     */
    public ShowNetworkIpAvailabilitiesResponse showNetworkIpAvailabilities(ShowNetworkIpAvailabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showNetworkIpAvailabilities);
    }

    /**
     * 查询私有IP
     * 指定ID查询私有IP。
     *
     * @param ShowPrivateipRequest 请求对象
     * @return ShowPrivateipResponse
     */
    public ShowPrivateipResponse showPrivateip(ShowPrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showPrivateip);
    }

    /**
     * 插入网络ACL规则
     * 插入一条网络ACL规则到某一网络ACL策略中。
     *
     * @param NeutronAddFirewallRuleRequest 请求对象
     * @return NeutronAddFirewallRuleResponse
     */
    public NeutronAddFirewallRuleResponse neutronAddFirewallRule(NeutronAddFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronAddFirewallRule);
    }

    /**
     * 创建网络ACL组
     * 创建网络ACL组
     *
     * @param NeutronCreateFirewallGroupRequest 请求对象
     * @return NeutronCreateFirewallGroupResponse
     */
    public NeutronCreateFirewallGroupResponse neutronCreateFirewallGroup(NeutronCreateFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateFirewallGroup);
    }

    /**
     * 创建网络ACL策略
     * 创建网络ACL策略。
     *
     * @param NeutronCreateFirewallPolicyRequest 请求对象
     * @return NeutronCreateFirewallPolicyResponse
     */
    public NeutronCreateFirewallPolicyResponse neutronCreateFirewallPolicy(NeutronCreateFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateFirewallPolicy);
    }

    /**
     * 创建网络ACL规则
     * 创建网络ACL规则。
     *
     * @param NeutronCreateFirewallRuleRequest 请求对象
     * @return NeutronCreateFirewallRuleResponse
     */
    public NeutronCreateFirewallRuleResponse neutronCreateFirewallRule(NeutronCreateFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateFirewallRule);
    }

    /**
     * 删除网络ACL组
     * 删除网络ACL组
     *
     * @param NeutronDeleteFirewallGroupRequest 请求对象
     * @return NeutronDeleteFirewallGroupResponse
     */
    public NeutronDeleteFirewallGroupResponse neutronDeleteFirewallGroup(NeutronDeleteFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteFirewallGroup);
    }

    /**
     * 删除网络ACL策略
     * 删除网络ACL策略。
     *
     * @param NeutronDeleteFirewallPolicyRequest 请求对象
     * @return NeutronDeleteFirewallPolicyResponse
     */
    public NeutronDeleteFirewallPolicyResponse neutronDeleteFirewallPolicy(NeutronDeleteFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteFirewallPolicy);
    }

    /**
     * 删除网络ACL规则
     * 删除网络ACL规则。
     *
     * @param NeutronDeleteFirewallRuleRequest 请求对象
     * @return NeutronDeleteFirewallRuleResponse
     */
    public NeutronDeleteFirewallRuleResponse neutronDeleteFirewallRule(NeutronDeleteFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteFirewallRule);
    }

    /**
     * 查询所有网络ACL组
     * 查询提交请求的租户有权限操作的所有网络ACL组信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     *
     * @param NeutronListFirewallGroupsRequest 请求对象
     * @return NeutronListFirewallGroupsResponse
     */
    public NeutronListFirewallGroupsResponse neutronListFirewallGroups(NeutronListFirewallGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListFirewallGroups);
    }

    /**
     * 查询所有网络ACL策略
     * 查询提交请求的租户有权限操作的所有网络ACL策略信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     *
     * @param NeutronListFirewallPoliciesRequest 请求对象
     * @return NeutronListFirewallPoliciesResponse
     */
    public NeutronListFirewallPoliciesResponse neutronListFirewallPolicies(NeutronListFirewallPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListFirewallPolicies);
    }

    /**
     * 查询所有网络ACL规则
     * 查询提交请求的租户有权限操作的所有网络ACL规则信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     *
     * @param NeutronListFirewallRulesRequest 请求对象
     * @return NeutronListFirewallRulesResponse
     */
    public NeutronListFirewallRulesResponse neutronListFirewallRules(NeutronListFirewallRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListFirewallRules);
    }

    /**
     * 移除网络ACL规则
     * 从某一网络ACL策略中移除一条网络ACL规则。
     *
     * @param NeutronRemoveFirewallRuleRequest 请求对象
     * @return NeutronRemoveFirewallRuleResponse
     */
    public NeutronRemoveFirewallRuleResponse neutronRemoveFirewallRule(NeutronRemoveFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronRemoveFirewallRule);
    }

    /**
     * 查询特定网络ACL组详情
     * 查询特定网络ACL组详情。
     *
     * @param NeutronShowFirewallGroupRequest 请求对象
     * @return NeutronShowFirewallGroupResponse
     */
    public NeutronShowFirewallGroupResponse neutronShowFirewallGroup(NeutronShowFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowFirewallGroup);
    }

    /**
     * 查询特定网络ACL策略详情
     * 查询特定网络ACL策略详情。
     *
     * @param NeutronShowFirewallPolicyRequest 请求对象
     * @return NeutronShowFirewallPolicyResponse
     */
    public NeutronShowFirewallPolicyResponse neutronShowFirewallPolicy(NeutronShowFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowFirewallPolicy);
    }

    /**
     * 查询特定网络ACL规则
     * 查询特定网络ACL规则。
     *
     * @param NeutronShowFirewallRuleRequest 请求对象
     * @return NeutronShowFirewallRuleResponse
     */
    public NeutronShowFirewallRuleResponse neutronShowFirewallRule(NeutronShowFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowFirewallRule);
    }

    /**
     * 更新网络ACL组
     * 更新网络ACL组。
     *
     * @param NeutronUpdateFirewallGroupRequest 请求对象
     * @return NeutronUpdateFirewallGroupResponse
     */
    public NeutronUpdateFirewallGroupResponse neutronUpdateFirewallGroup(NeutronUpdateFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateFirewallGroup);
    }

    /**
     * 更新网络ACL策略
     * 更新网络ACL策略。
     *
     * @param NeutronUpdateFirewallPolicyRequest 请求对象
     * @return NeutronUpdateFirewallPolicyResponse
     */
    public NeutronUpdateFirewallPolicyResponse neutronUpdateFirewallPolicy(NeutronUpdateFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateFirewallPolicy);
    }

    /**
     * 更新网络ACL规则
     * 更新网络ACL规则。
     *
     * @param NeutronUpdateFirewallRuleRequest 请求对象
     * @return NeutronUpdateFirewallRuleResponse
     */
    public NeutronUpdateFirewallRuleResponse neutronUpdateFirewallRule(NeutronUpdateFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateFirewallRule);
    }

    /**
     * 创建VPC
     * 创建虚拟私有云。
     *
     * @param CreateVpcRequest 请求对象
     * @return CreateVpcResponse
     */
    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpc);
    }

    /**
     * 创建VPC路由
     * 创建路由
     *
     * @param CreateVpcRouteRequest 请求对象
     * @return CreateVpcRouteResponse
     */
    public CreateVpcRouteResponse createVpcRoute(CreateVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpcRoute);
    }

    /**
     * 删除VPC
     * 删除虚拟私有云。
     *
     * @param DeleteVpcRequest 请求对象
     * @return DeleteVpcResponse
     */
    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    /**
     * 删除VPC路由
     * 删除路由
     *
     * @param DeleteVpcRouteRequest 请求对象
     * @return DeleteVpcRouteResponse
     */
    public DeleteVpcRouteResponse deleteVpcRoute(DeleteVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpcRoute);
    }

    /**
     * 查询VPC路由列表
     * 查询提交请求的租户的所有路由列表，并根据过滤条件进行过滤。
     *
     * @param ListVpcRoutesRequest 请求对象
     * @return ListVpcRoutesResponse
     */
    public ListVpcRoutesResponse listVpcRoutes(ListVpcRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcRoutes);
    }

    /**
     * 查询VPC列表
     * 查询虚拟私有云列表。
     *
     * @param ListVpcsRequest 请求对象
     * @return ListVpcsResponse
     */
    public ListVpcsResponse listVpcs(ListVpcsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcs);
    }

    /**
     * 查询VPC
     * 查询虚拟私有云。
     *
     * @param ShowVpcRequest 请求对象
     * @return ShowVpcResponse
     */
    public ShowVpcResponse showVpc(ShowVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpc);
    }

    /**
     * 查询VPC路由
     * 查询路由详情
     *
     * @param ShowVpcRouteRequest 请求对象
     * @return ShowVpcRouteResponse
     */
    public ShowVpcRouteResponse showVpcRoute(ShowVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpcRoute);
    }

    /**
     * 更新VPC
     * 更新虚拟私有云。
     *
     * @param UpdateVpcRequest 请求对象
     * @return UpdateVpcResponse
     */
    public UpdateVpcResponse updateVpc(UpdateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateVpc);
    }

}