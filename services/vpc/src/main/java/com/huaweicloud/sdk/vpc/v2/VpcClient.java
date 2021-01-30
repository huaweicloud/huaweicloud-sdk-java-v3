package com.huaweicloud.sdk.vpc.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
     * 接受对等连接请求
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户接受其他租户发起的对等连接请求。
     *
     * @param AcceptVpcPeeringRequest 请求对象
     * @return SyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse>
     */
    public SyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> acceptVpcPeeringInvoker(AcceptVpcPeeringRequest request) {
        return new SyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse>(request, VpcMeta.acceptVpcPeering, hcClient);
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
     * 创建端口
     * 创建端口。
     *
     * @param CreatePortRequest 请求对象
     * @return SyncInvoker<CreatePortRequest, CreatePortResponse>
     */
    public SyncInvoker<CreatePortRequest, CreatePortResponse> createPortInvoker(CreatePortRequest request) {
        return new SyncInvoker<CreatePortRequest, CreatePortResponse>(request, VpcMeta.createPort, hcClient);
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
     * 创建安全组
     * 创建安全组。
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>
     */
    public SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupInvoker(CreateSecurityGroupRequest request) {
        return new SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>(request, VpcMeta.createSecurityGroup, hcClient);
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
     * 创建安全组规则
     * 创建安全组规则。
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>
     */
    public SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleInvoker(CreateSecurityGroupRuleRequest request) {
        return new SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>(request, VpcMeta.createSecurityGroupRule, hcClient);
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
     * 创建子网
     * 创建子网。
     *
     * @param CreateSubnetRequest 请求对象
     * @return SyncInvoker<CreateSubnetRequest, CreateSubnetResponse>
     */
    public SyncInvoker<CreateSubnetRequest, CreateSubnetResponse> createSubnetInvoker(CreateSubnetRequest request) {
        return new SyncInvoker<CreateSubnetRequest, CreateSubnetResponse>(request, VpcMeta.createSubnet, hcClient);
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
     * 创建对等连接
     * 创建对等连接。
     *
     * @param CreateVpcPeeringRequest 请求对象
     * @return SyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse>
     */
    public SyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse> createVpcPeeringInvoker(CreateVpcPeeringRequest request) {
        return new SyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse>(request, VpcMeta.createVpcPeering, hcClient);
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
     * 删除端口
     * 删除端口。
     *
     * @param DeletePortRequest 请求对象
     * @return SyncInvoker<DeletePortRequest, DeletePortResponse>
     */
    public SyncInvoker<DeletePortRequest, DeletePortResponse> deletePortInvoker(DeletePortRequest request) {
        return new SyncInvoker<DeletePortRequest, DeletePortResponse>(request, VpcMeta.deletePort, hcClient);
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
     * 删除安全组
     * 删除安全组。
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>
     */
    public SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupInvoker(DeleteSecurityGroupRequest request) {
        return new SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>(request, VpcMeta.deleteSecurityGroup, hcClient);
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
     * 删除安全组规则
     * 删除安全组规则。
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>
     */
    public SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleInvoker(DeleteSecurityGroupRuleRequest request) {
        return new SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>(request, VpcMeta.deleteSecurityGroupRule, hcClient);
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
     * 删除子网
     * 删除子网
     *
     * @param DeleteSubnetRequest 请求对象
     * @return SyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>
     */
    public SyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnetInvoker(DeleteSubnetRequest request) {
        return new SyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>(request, VpcMeta.deleteSubnet, hcClient);
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
     * 删除对等连接
     * 删除对等连接。 可以在在本端或对端任何一端删除对等连接。
     *
     * @param DeleteVpcPeeringRequest 请求对象
     * @return SyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse>
     */
    public SyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> deleteVpcPeeringInvoker(DeleteVpcPeeringRequest request) {
        return new SyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse>(request, VpcMeta.deleteVpcPeering, hcClient);
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
     * 查询端口列表
     * 查询提交请求的租户的所有端口，单次查询最多返回2000条数据。
     *
     * @param ListPortsRequest 请求对象
     * @return SyncInvoker<ListPortsRequest, ListPortsResponse>
     */
    public SyncInvoker<ListPortsRequest, ListPortsResponse> listPortsInvoker(ListPortsRequest request) {
        return new SyncInvoker<ListPortsRequest, ListPortsResponse>(request, VpcMeta.listPorts, hcClient);
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
     * 查询安全组规则列表
     * 查询安全组规则列表。
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>
     */
    public SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesInvoker(ListSecurityGroupRulesRequest request) {
        return new SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>(request, VpcMeta.listSecurityGroupRules, hcClient);
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
     * 查询安全组列表
     * 查询安全组列表
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsInvoker(ListSecurityGroupsRequest request) {
        return new SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>(request, VpcMeta.listSecurityGroups, hcClient);
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
     * 查询子网列表
     * 查询子网列表
     *
     * @param ListSubnetsRequest 请求对象
     * @return SyncInvoker<ListSubnetsRequest, ListSubnetsResponse>
     */
    public SyncInvoker<ListSubnetsRequest, ListSubnetsResponse> listSubnetsInvoker(ListSubnetsRequest request) {
        return new SyncInvoker<ListSubnetsRequest, ListSubnetsResponse>(request, VpcMeta.listSubnets, hcClient);
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
     * 查询对等连接列表
     * 查询提交请求的租户的所有对等连接。根据过滤条件进行过滤。
     *
     * @param ListVpcPeeringsRequest 请求对象
     * @return SyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse>
     */
    public SyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse> listVpcPeeringsInvoker(ListVpcPeeringsRequest request) {
        return new SyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse>(request, VpcMeta.listVpcPeerings, hcClient);
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
     * 拒绝对等连接请求
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户拒绝其他租户发起的对等连接请求。
     *
     * @param RejectVpcPeeringRequest 请求对象
     * @return SyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse>
     */
    public SyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse> rejectVpcPeeringInvoker(RejectVpcPeeringRequest request) {
        return new SyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse>(request, VpcMeta.rejectVpcPeering, hcClient);
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
     * 查询端口
     * 查询单个端口详情。
     *
     * @param ShowPortRequest 请求对象
     * @return SyncInvoker<ShowPortRequest, ShowPortResponse>
     */
    public SyncInvoker<ShowPortRequest, ShowPortResponse> showPortInvoker(ShowPortRequest request) {
        return new SyncInvoker<ShowPortRequest, ShowPortResponse>(request, VpcMeta.showPort, hcClient);
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
     * 查询配额
     * 查询单租户在VPC服务下的网络资源配额，包括vpc配额、子网配额、安全组配额、安全组规则配额、弹性公网IP配额，vpn配额等。
     *
     * @param ShowQuotaRequest 请求对象
     * @return SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, VpcMeta.showQuota, hcClient);
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
     * 查询安全组
     * 查询单个安全组详情。
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>
     */
    public SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupInvoker(ShowSecurityGroupRequest request) {
        return new SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>(request, VpcMeta.showSecurityGroup, hcClient);
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
     * 查询安全组规则
     * 查询单个安全组规则详情
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>
     */
    public SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleInvoker(ShowSecurityGroupRuleRequest request) {
        return new SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>(request, VpcMeta.showSecurityGroupRule, hcClient);
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
     * 查询子网
     * 查询子网详情。
     *
     * @param ShowSubnetRequest 请求对象
     * @return SyncInvoker<ShowSubnetRequest, ShowSubnetResponse>
     */
    public SyncInvoker<ShowSubnetRequest, ShowSubnetResponse> showSubnetInvoker(ShowSubnetRequest request) {
        return new SyncInvoker<ShowSubnetRequest, ShowSubnetResponse>(request, VpcMeta.showSubnet, hcClient);
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
     * 查询对等连接
     * 查询对等连接详情。
     *
     * @param ShowVpcPeeringRequest 请求对象
     * @return SyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse>
     */
    public SyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse> showVpcPeeringInvoker(ShowVpcPeeringRequest request) {
        return new SyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse>(request, VpcMeta.showVpcPeering, hcClient);
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
     * 更新端口
     * 更新端口。
     *
     * @param UpdatePortRequest 请求对象
     * @return SyncInvoker<UpdatePortRequest, UpdatePortResponse>
     */
    public SyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortInvoker(UpdatePortRequest request) {
        return new SyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, VpcMeta.updatePort, hcClient);
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
     * 更新子网
     * 更新子网。
     *
     * @param UpdateSubnetRequest 请求对象
     * @return SyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>
     */
    public SyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnetInvoker(UpdateSubnetRequest request) {
        return new SyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>(request, VpcMeta.updateSubnet, hcClient);
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
     * 更新对等连接
     * 更新对等连接。
     *
     * @param UpdateVpcPeeringRequest 请求对象
     * @return SyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse>
     */
    public SyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> updateVpcPeeringInvoker(UpdateVpcPeeringRequest request) {
        return new SyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse>(request, VpcMeta.updateVpcPeering, hcClient);
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
     * 申请私有IP
     * 申请私有IP。
     *
     * @param CreatePrivateipRequest 请求对象
     * @return SyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse>
     */
    public SyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse> createPrivateipInvoker(CreatePrivateipRequest request) {
        return new SyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse>(request, VpcMeta.createPrivateip, hcClient);
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
     * 删除私有IP
     * 删除私有IP。
     *
     * @param DeletePrivateipRequest 请求对象
     * @return SyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse>
     */
    public SyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse> deletePrivateipInvoker(DeletePrivateipRequest request) {
        return new SyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse>(request, VpcMeta.deletePrivateip, hcClient);
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
     * 查询私有IP列表
     * 查询指定子网下的私有IP列表。
     *
     * @param ListPrivateipsRequest 请求对象
     * @return SyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse>
     */
    public SyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse> listPrivateipsInvoker(ListPrivateipsRequest request) {
        return new SyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse>(request, VpcMeta.listPrivateips, hcClient);
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
     * 查询网络IP使用情况
     * 显示一个指定网络中的IPv4地址使用情况。 包括此网络中的IP总数以及已用IP总数，以及网络下每一个子网的IP地址总数和可用IP地址总数。  &gt; 须知  - 系统预留地址指的是子网的第1个以及最后4个地址，一般用于网关、DHCP等服务。 - 这里以及下文描述的IP地址总数、已用IP地址总数不包含系统预留地址。 - 在分配IP时，用户可以指定系统预留的IP地址。但是不论IP是如何分配的，只要是处于系统预留IP地址段的IP均不会被统计到已用IP地址数目和IP地址总数中。
     *
     * @param ShowNetworkIpAvailabilitiesRequest 请求对象
     * @return SyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse>
     */
    public SyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> showNetworkIpAvailabilitiesInvoker(ShowNetworkIpAvailabilitiesRequest request) {
        return new SyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse>(request, VpcMeta.showNetworkIpAvailabilities, hcClient);
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
     * 查询私有IP
     * 指定ID查询私有IP。
     *
     * @param ShowPrivateipRequest 请求对象
     * @return SyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse>
     */
    public SyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse> showPrivateipInvoker(ShowPrivateipRequest request) {
        return new SyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse>(request, VpcMeta.showPrivateip, hcClient);
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
     * 插入网络ACL规则
     * 插入一条网络ACL规则到某一网络ACL策略中。
     *
     * @param NeutronAddFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse>
     */
    public SyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> neutronAddFirewallRuleInvoker(NeutronAddFirewallRuleRequest request) {
        return new SyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse>(request, VpcMeta.neutronAddFirewallRule, hcClient);
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
     * 创建网络ACL组
     * 创建网络ACL组
     *
     * @param NeutronCreateFirewallGroupRequest 请求对象
     * @return SyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse>
     */
    public SyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> neutronCreateFirewallGroupInvoker(NeutronCreateFirewallGroupRequest request) {
        return new SyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse>(request, VpcMeta.neutronCreateFirewallGroup, hcClient);
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
     * 创建网络ACL策略
     * 创建网络ACL策略。
     *
     * @param NeutronCreateFirewallPolicyRequest 请求对象
     * @return SyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse>
     */
    public SyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> neutronCreateFirewallPolicyInvoker(NeutronCreateFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse>(request, VpcMeta.neutronCreateFirewallPolicy, hcClient);
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
     * 创建网络ACL规则
     * 创建网络ACL规则。
     *
     * @param NeutronCreateFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse>
     */
    public SyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> neutronCreateFirewallRuleInvoker(NeutronCreateFirewallRuleRequest request) {
        return new SyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse>(request, VpcMeta.neutronCreateFirewallRule, hcClient);
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
     * 删除网络ACL组
     * 删除网络ACL组
     *
     * @param NeutronDeleteFirewallGroupRequest 请求对象
     * @return SyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse>
     */
    public SyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> neutronDeleteFirewallGroupInvoker(NeutronDeleteFirewallGroupRequest request) {
        return new SyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse>(request, VpcMeta.neutronDeleteFirewallGroup, hcClient);
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
     * 删除网络ACL策略
     * 删除网络ACL策略。
     *
     * @param NeutronDeleteFirewallPolicyRequest 请求对象
     * @return SyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse>
     */
    public SyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> neutronDeleteFirewallPolicyInvoker(NeutronDeleteFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse>(request, VpcMeta.neutronDeleteFirewallPolicy, hcClient);
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
     * 删除网络ACL规则
     * 删除网络ACL规则。
     *
     * @param NeutronDeleteFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse>
     */
    public SyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> neutronDeleteFirewallRuleInvoker(NeutronDeleteFirewallRuleRequest request) {
        return new SyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse>(request, VpcMeta.neutronDeleteFirewallRule, hcClient);
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
     * 查询所有网络ACL组
     * 查询提交请求的租户有权限操作的所有网络ACL组信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     *
     * @param NeutronListFirewallGroupsRequest 请求对象
     * @return SyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse>
     */
    public SyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> neutronListFirewallGroupsInvoker(NeutronListFirewallGroupsRequest request) {
        return new SyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse>(request, VpcMeta.neutronListFirewallGroups, hcClient);
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
     * 查询所有网络ACL策略
     * 查询提交请求的租户有权限操作的所有网络ACL策略信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     *
     * @param NeutronListFirewallPoliciesRequest 请求对象
     * @return SyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse>
     */
    public SyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> neutronListFirewallPoliciesInvoker(NeutronListFirewallPoliciesRequest request) {
        return new SyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse>(request, VpcMeta.neutronListFirewallPolicies, hcClient);
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
     * 查询所有网络ACL规则
     * 查询提交请求的租户有权限操作的所有网络ACL规则信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     *
     * @param NeutronListFirewallRulesRequest 请求对象
     * @return SyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse>
     */
    public SyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> neutronListFirewallRulesInvoker(NeutronListFirewallRulesRequest request) {
        return new SyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse>(request, VpcMeta.neutronListFirewallRules, hcClient);
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
     * 移除网络ACL规则
     * 从某一网络ACL策略中移除一条网络ACL规则。
     *
     * @param NeutronRemoveFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse>
     */
    public SyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> neutronRemoveFirewallRuleInvoker(NeutronRemoveFirewallRuleRequest request) {
        return new SyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse>(request, VpcMeta.neutronRemoveFirewallRule, hcClient);
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
     * 查询特定网络ACL组详情
     * 查询特定网络ACL组详情。
     *
     * @param NeutronShowFirewallGroupRequest 请求对象
     * @return SyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse>
     */
    public SyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> neutronShowFirewallGroupInvoker(NeutronShowFirewallGroupRequest request) {
        return new SyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse>(request, VpcMeta.neutronShowFirewallGroup, hcClient);
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
     * 查询特定网络ACL策略详情
     * 查询特定网络ACL策略详情。
     *
     * @param NeutronShowFirewallPolicyRequest 请求对象
     * @return SyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse>
     */
    public SyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> neutronShowFirewallPolicyInvoker(NeutronShowFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse>(request, VpcMeta.neutronShowFirewallPolicy, hcClient);
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
     * 查询特定网络ACL规则
     * 查询特定网络ACL规则。
     *
     * @param NeutronShowFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse>
     */
    public SyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> neutronShowFirewallRuleInvoker(NeutronShowFirewallRuleRequest request) {
        return new SyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse>(request, VpcMeta.neutronShowFirewallRule, hcClient);
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
     * 更新网络ACL组
     * 更新网络ACL组。
     *
     * @param NeutronUpdateFirewallGroupRequest 请求对象
     * @return SyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse>
     */
    public SyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> neutronUpdateFirewallGroupInvoker(NeutronUpdateFirewallGroupRequest request) {
        return new SyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse>(request, VpcMeta.neutronUpdateFirewallGroup, hcClient);
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
     * 更新网络ACL策略
     * 更新网络ACL策略。
     *
     * @param NeutronUpdateFirewallPolicyRequest 请求对象
     * @return SyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse>
     */
    public SyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> neutronUpdateFirewallPolicyInvoker(NeutronUpdateFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse>(request, VpcMeta.neutronUpdateFirewallPolicy, hcClient);
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
     * 更新网络ACL规则
     * 更新网络ACL规则。
     *
     * @param NeutronUpdateFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse>
     */
    public SyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> neutronUpdateFirewallRuleInvoker(NeutronUpdateFirewallRuleRequest request) {
        return new SyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse>(request, VpcMeta.neutronUpdateFirewallRule, hcClient);
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
     * 创建VPC
     * 创建虚拟私有云。
     *
     * @param CreateVpcRequest 请求对象
     * @return SyncInvoker<CreateVpcRequest, CreateVpcResponse>
     */
    public SyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcInvoker(CreateVpcRequest request) {
        return new SyncInvoker<CreateVpcRequest, CreateVpcResponse>(request, VpcMeta.createVpc, hcClient);
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
     * 创建VPC路由
     * 创建路由
     *
     * @param CreateVpcRouteRequest 请求对象
     * @return SyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse>
     */
    public SyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse> createVpcRouteInvoker(CreateVpcRouteRequest request) {
        return new SyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse>(request, VpcMeta.createVpcRoute, hcClient);
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
     * 删除VPC
     * 删除虚拟私有云。
     *
     * @param DeleteVpcRequest 请求对象
     * @return SyncInvoker<DeleteVpcRequest, DeleteVpcResponse>
     */
    public SyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcInvoker(DeleteVpcRequest request) {
        return new SyncInvoker<DeleteVpcRequest, DeleteVpcResponse>(request, VpcMeta.deleteVpc, hcClient);
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
     * 删除VPC路由
     * 删除路由
     *
     * @param DeleteVpcRouteRequest 请求对象
     * @return SyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse>
     */
    public SyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse> deleteVpcRouteInvoker(DeleteVpcRouteRequest request) {
        return new SyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse>(request, VpcMeta.deleteVpcRoute, hcClient);
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
     * 查询VPC路由列表
     * 查询提交请求的租户的所有路由列表，并根据过滤条件进行过滤。
     *
     * @param ListVpcRoutesRequest 请求对象
     * @return SyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse>
     */
    public SyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse> listVpcRoutesInvoker(ListVpcRoutesRequest request) {
        return new SyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse>(request, VpcMeta.listVpcRoutes, hcClient);
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
     * 查询VPC列表
     * 查询虚拟私有云列表。
     *
     * @param ListVpcsRequest 请求对象
     * @return SyncInvoker<ListVpcsRequest, ListVpcsResponse>
     */
    public SyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsInvoker(ListVpcsRequest request) {
        return new SyncInvoker<ListVpcsRequest, ListVpcsResponse>(request, VpcMeta.listVpcs, hcClient);
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
     * 查询VPC
     * 查询虚拟私有云。
     *
     * @param ShowVpcRequest 请求对象
     * @return SyncInvoker<ShowVpcRequest, ShowVpcResponse>
     */
    public SyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcInvoker(ShowVpcRequest request) {
        return new SyncInvoker<ShowVpcRequest, ShowVpcResponse>(request, VpcMeta.showVpc, hcClient);
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
     * 查询VPC路由
     * 查询路由详情
     *
     * @param ShowVpcRouteRequest 请求对象
     * @return SyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse>
     */
    public SyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse> showVpcRouteInvoker(ShowVpcRouteRequest request) {
        return new SyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse>(request, VpcMeta.showVpcRoute, hcClient);
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

    /**
     * 更新VPC
     * 更新虚拟私有云。
     *
     * @param UpdateVpcRequest 请求对象
     * @return SyncInvoker<UpdateVpcRequest, UpdateVpcResponse>
     */
    public SyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcInvoker(UpdateVpcRequest request) {
        return new SyncInvoker<UpdateVpcRequest, UpdateVpcResponse>(request, VpcMeta.updateVpc, hcClient);
    }

}