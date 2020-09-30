package com.huaweicloud.sdk.vpc.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.vpc.v2.model.*;

public class VpcAsyncClient {
    protected HcClient hcClient;

    public VpcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcAsyncClient> newBuilder() {
        return new ClientBuilder<>(VpcAsyncClient::new);
    }


    /**
     * 接受对等连接请求
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户接受其他租户发起的对等连接请求。
     *
     * @param AcceptVpcPeeringRequest 请求对象
     * @return CompletableFuture<AcceptVpcPeeringResponse>
     */
    public CompletableFuture<AcceptVpcPeeringResponse> acceptVpcPeeringAsync(AcceptVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.acceptVpcPeering);
    }

    /**
     * 创建端口
     * 创建端口。
     *
     * @param CreatePortRequest 请求对象
     * @return CompletableFuture<CreatePortResponse>
     */
    public CompletableFuture<CreatePortResponse> createPortAsync(CreatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createPort);
    }

    /**
     * 创建安全组
     * 创建安全组。
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupResponse>
     */
    public CompletableFuture<CreateSecurityGroupResponse> createSecurityGroupAsync(CreateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    /**
     * 创建安全组规则
     * 创建安全组规则。
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupRuleResponse>
     */
    public CompletableFuture<CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsync(CreateSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    /**
     * 创建子网
     * 创建子网。
     *
     * @param CreateSubnetRequest 请求对象
     * @return CompletableFuture<CreateSubnetResponse>
     */
    public CompletableFuture<CreateSubnetResponse> createSubnetAsync(CreateSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSubnet);
    }

    /**
     * 创建对等连接
     * 创建对等连接。
     *
     * @param CreateVpcPeeringRequest 请求对象
     * @return CompletableFuture<CreateVpcPeeringResponse>
     */
    public CompletableFuture<CreateVpcPeeringResponse> createVpcPeeringAsync(CreateVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpcPeering);
    }

    /**
     * 删除端口
     * 删除端口。
     *
     * @param DeletePortRequest 请求对象
     * @return CompletableFuture<DeletePortResponse>
     */
    public CompletableFuture<DeletePortResponse> deletePortAsync(DeletePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deletePort);
    }

    /**
     * 删除安全组
     * 删除安全组。
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupResponse>
     */
    public CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroupAsync(DeleteSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    /**
     * 删除安全组规则
     * 删除安全组规则。
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupRuleResponse>
     */
    public CompletableFuture<DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsync(DeleteSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    /**
     * 删除子网
     * 删除子网
     *
     * @param DeleteSubnetRequest 请求对象
     * @return CompletableFuture<DeleteSubnetResponse>
     */
    public CompletableFuture<DeleteSubnetResponse> deleteSubnetAsync(DeleteSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSubnet);
    }

    /**
     * 删除对等连接
     * 删除对等连接。 可以在在本端或对端任何一端删除对等连接。
     *
     * @param DeleteVpcPeeringRequest 请求对象
     * @return CompletableFuture<DeleteVpcPeeringResponse>
     */
    public CompletableFuture<DeleteVpcPeeringResponse> deleteVpcPeeringAsync(DeleteVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpcPeering);
    }

    /**
     * 查询端口列表
     * 查询提交请求的租户的所有端口，单次查询最多返回2000条数据。
     *
     * @param ListPortsRequest 请求对象
     * @return CompletableFuture<ListPortsResponse>
     */
    public CompletableFuture<ListPortsResponse> listPortsAsync(ListPortsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listPorts);
    }

    /**
     * 查询安全组规则列表
     * 查询安全组规则列表。
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupRulesResponse>
     */
    public CompletableFuture<ListSecurityGroupRulesResponse> listSecurityGroupRulesAsync(ListSecurityGroupRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    /**
     * 查询安全组列表
     * 查询安全组列表
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupsResponse>
     */
    public CompletableFuture<ListSecurityGroupsResponse> listSecurityGroupsAsync(ListSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    /**
     * 查询子网列表
     * 查询子网列表
     *
     * @param ListSubnetsRequest 请求对象
     * @return CompletableFuture<ListSubnetsResponse>
     */
    public CompletableFuture<ListSubnetsResponse> listSubnetsAsync(ListSubnetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubnets);
    }

    /**
     * 查询对等连接列表
     * 查询提交请求的租户的所有对等连接。根据过滤条件进行过滤。
     *
     * @param ListVpcPeeringsRequest 请求对象
     * @return CompletableFuture<ListVpcPeeringsResponse>
     */
    public CompletableFuture<ListVpcPeeringsResponse> listVpcPeeringsAsync(ListVpcPeeringsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcPeerings);
    }

    /**
     * 拒绝对等连接请求
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户拒绝其他租户发起的对等连接请求。
     *
     * @param RejectVpcPeeringRequest 请求对象
     * @return CompletableFuture<RejectVpcPeeringResponse>
     */
    public CompletableFuture<RejectVpcPeeringResponse> rejectVpcPeeringAsync(RejectVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.rejectVpcPeering);
    }

    /**
     * 查询端口
     * 查询单个端口详情。
     *
     * @param ShowPortRequest 请求对象
     * @return CompletableFuture<ShowPortResponse>
     */
    public CompletableFuture<ShowPortResponse> showPortAsync(ShowPortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showPort);
    }

    /**
     * 查询配额
     * 查询单租户在VPC服务下的网络资源配额，包括vpc配额、子网配额、安全组配额、安全组规则配额、弹性公网IP配额，vpn配额等。
     *
     * @param ShowQuotaRequest 请求对象
     * @return CompletableFuture<ShowQuotaResponse>
     */
    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showQuota);
    }

    /**
     * 查询安全组
     * 查询单个安全组详情。
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupResponse>
     */
    public CompletableFuture<ShowSecurityGroupResponse> showSecurityGroupAsync(ShowSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    /**
     * 查询安全组规则
     * 查询单个安全组规则详情
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupRuleResponse>
     */
    public CompletableFuture<ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsync(ShowSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    /**
     * 查询子网
     * 查询子网详情。
     *
     * @param ShowSubnetRequest 请求对象
     * @return CompletableFuture<ShowSubnetResponse>
     */
    public CompletableFuture<ShowSubnetResponse> showSubnetAsync(ShowSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubnet);
    }

    /**
     * 查询对等连接
     * 查询对等连接详情。
     *
     * @param ShowVpcPeeringRequest 请求对象
     * @return CompletableFuture<ShowVpcPeeringResponse>
     */
    public CompletableFuture<ShowVpcPeeringResponse> showVpcPeeringAsync(ShowVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpcPeering);
    }

    /**
     * 更新端口
     * 更新端口。
     *
     * @param UpdatePortRequest 请求对象
     * @return CompletableFuture<UpdatePortResponse>
     */
    public CompletableFuture<UpdatePortResponse> updatePortAsync(UpdatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updatePort);
    }

    /**
     * 更新子网
     * 更新子网。
     *
     * @param UpdateSubnetRequest 请求对象
     * @return CompletableFuture<UpdateSubnetResponse>
     */
    public CompletableFuture<UpdateSubnetResponse> updateSubnetAsync(UpdateSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateSubnet);
    }

    /**
     * 更新对等连接
     * 更新对等连接。
     *
     * @param UpdateVpcPeeringRequest 请求对象
     * @return CompletableFuture<UpdateVpcPeeringResponse>
     */
    public CompletableFuture<UpdateVpcPeeringResponse> updateVpcPeeringAsync(UpdateVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateVpcPeering);
    }

    /**
     * 申请私有IP
     * 申请私有IP。
     *
     * @param CreatePrivateipRequest 请求对象
     * @return CompletableFuture<CreatePrivateipResponse>
     */
    public CompletableFuture<CreatePrivateipResponse> createPrivateipAsync(CreatePrivateipRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createPrivateip);
    }

    /**
     * 删除私有IP
     * 删除私有IP。
     *
     * @param DeletePrivateipRequest 请求对象
     * @return CompletableFuture<DeletePrivateipResponse>
     */
    public CompletableFuture<DeletePrivateipResponse> deletePrivateipAsync(DeletePrivateipRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deletePrivateip);
    }

    /**
     * 查询私有IP列表
     * 查询指定子网下的私有IP列表。
     *
     * @param ListPrivateipsRequest 请求对象
     * @return CompletableFuture<ListPrivateipsResponse>
     */
    public CompletableFuture<ListPrivateipsResponse> listPrivateipsAsync(ListPrivateipsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listPrivateips);
    }

    /**
     * 查询网络IP使用情况
     * 显示一个指定网络中的IPv4地址使用情况。 包括此网络中的IP总数以及已用IP总数，以及网络下每一个子网的IP地址总数和可用IP地址总数。  &gt; 须知  - 系统预留地址指的是子网的第1个以及最后4个地址，一般用于网关、DHCP等服务。 - 这里以及下文描述的IP地址总数、已用IP地址总数不包含系统预留地址。 - 在分配IP时，用户可以指定系统预留的IP地址。但是不论IP是如何分配的，只要是处于系统预留IP地址段的IP均不会被统计到已用IP地址数目和IP地址总数中。
     *
     * @param ShowNetworkIpAvailabilitiesRequest 请求对象
     * @return CompletableFuture<ShowNetworkIpAvailabilitiesResponse>
     */
    public CompletableFuture<ShowNetworkIpAvailabilitiesResponse> showNetworkIpAvailabilitiesAsync(ShowNetworkIpAvailabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showNetworkIpAvailabilities);
    }

    /**
     * 查询私有IP
     * 指定ID查询私有IP。
     *
     * @param ShowPrivateipRequest 请求对象
     * @return CompletableFuture<ShowPrivateipResponse>
     */
    public CompletableFuture<ShowPrivateipResponse> showPrivateipAsync(ShowPrivateipRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showPrivateip);
    }

    /**
     * 创建VPC
     * 创建虚拟私有云。
     *
     * @param CreateVpcRequest 请求对象
     * @return CompletableFuture<CreateVpcResponse>
     */
    public CompletableFuture<CreateVpcResponse> createVpcAsync(CreateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpc);
    }

    /**
     * 创建VPC路由
     * 创建路由
     *
     * @param CreateVpcRouteRequest 请求对象
     * @return CompletableFuture<CreateVpcRouteResponse>
     */
    public CompletableFuture<CreateVpcRouteResponse> createVpcRouteAsync(CreateVpcRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpcRoute);
    }

    /**
     * 删除VPC
     * 删除虚拟私有云。
     *
     * @param DeleteVpcRequest 请求对象
     * @return CompletableFuture<DeleteVpcResponse>
     */
    public CompletableFuture<DeleteVpcResponse> deleteVpcAsync(DeleteVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    /**
     * 删除VPC路由
     * 删除路由
     *
     * @param DeleteVpcRouteRequest 请求对象
     * @return CompletableFuture<DeleteVpcRouteResponse>
     */
    public CompletableFuture<DeleteVpcRouteResponse> deleteVpcRouteAsync(DeleteVpcRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpcRoute);
    }

    /**
     * 查询VPC路由列表
     * 查询提交请求的租户的所有路由列表，并根据过滤条件进行过滤。
     *
     * @param ListVpcRoutesRequest 请求对象
     * @return CompletableFuture<ListVpcRoutesResponse>
     */
    public CompletableFuture<ListVpcRoutesResponse> listVpcRoutesAsync(ListVpcRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcRoutes);
    }

    /**
     * 查询VPC列表
     * 查询虚拟私有云列表。
     *
     * @param ListVpcsRequest 请求对象
     * @return CompletableFuture<ListVpcsResponse>
     */
    public CompletableFuture<ListVpcsResponse> listVpcsAsync(ListVpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcs);
    }

    /**
     * 查询VPC
     * 查询虚拟私有云。
     *
     * @param ShowVpcRequest 请求对象
     * @return CompletableFuture<ShowVpcResponse>
     */
    public CompletableFuture<ShowVpcResponse> showVpcAsync(ShowVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpc);
    }

    /**
     * 查询VPC路由
     * 查询路由详情
     *
     * @param ShowVpcRouteRequest 请求对象
     * @return CompletableFuture<ShowVpcRouteResponse>
     */
    public CompletableFuture<ShowVpcRouteResponse> showVpcRouteAsync(ShowVpcRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpcRoute);
    }

    /**
     * 更新VPC
     * 更新虚拟私有云。
     *
     * @param UpdateVpcRequest 请求对象
     * @return CompletableFuture<UpdateVpcResponse>
     */
    public CompletableFuture<UpdateVpcResponse> updateVpcAsync(UpdateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateVpc);
    }

}