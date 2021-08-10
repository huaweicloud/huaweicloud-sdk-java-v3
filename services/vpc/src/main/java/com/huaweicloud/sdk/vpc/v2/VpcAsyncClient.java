package com.huaweicloud.sdk.vpc.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vpc.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class VpcAsyncClient {

    protected HcClient hcClient;

    public VpcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcAsyncClient> newBuilder() {
        return new ClientBuilder<>(VpcAsyncClient::new);
    }

    /** 接受对等连接请求 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户接受其他租户发起的对等连接请求。
     *
     * @param AcceptVpcPeeringRequest 请求对象
     * @return CompletableFuture<AcceptVpcPeeringResponse> */
    public CompletableFuture<AcceptVpcPeeringResponse> acceptVpcPeeringAsync(AcceptVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.acceptVpcPeering);
    }

    /** 接受对等连接请求 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户接受其他租户发起的对等连接请求。
     *
     * @param AcceptVpcPeeringRequest 请求对象
     * @return AsyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> */
    public AsyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> acceptVpcPeeringAsyncInvoker(
        AcceptVpcPeeringRequest request) {
        return new AsyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse>(request, VpcMeta.acceptVpcPeering,
            hcClient);
    }

    /** 子网关联路由表 路由表关联子网。子网关联路由表A后，再关联B，不需要先跟路由表A解关联再关联路由表B
     *
     * @param AssociateRouteTableRequest 请求对象
     * @return CompletableFuture<AssociateRouteTableResponse> */
    public CompletableFuture<AssociateRouteTableResponse> associateRouteTableAsync(AssociateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.associateRouteTable);
    }

    /** 子网关联路由表 路由表关联子网。子网关联路由表A后，再关联B，不需要先跟路由表A解关联再关联路由表B
     *
     * @param AssociateRouteTableRequest 请求对象
     * @return AsyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse> */
    public AsyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse> associateRouteTableAsyncInvoker(
        AssociateRouteTableRequest request) {
        return new AsyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse>(request,
            VpcMeta.associateRouteTable, hcClient);
    }

    /** 批量创建子网资源标签 为指定的子网资源实例批量添加标签。 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     *
     * @param BatchCreateSubnetTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateSubnetTagsResponse> */
    public CompletableFuture<BatchCreateSubnetTagsResponse> batchCreateSubnetTagsAsync(
        BatchCreateSubnetTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateSubnetTags);
    }

    /** 批量创建子网资源标签 为指定的子网资源实例批量添加标签。 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     *
     * @param BatchCreateSubnetTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse> */
    public AsyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse> batchCreateSubnetTagsAsyncInvoker(
        BatchCreateSubnetTagsRequest request) {
        return new AsyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse>(request,
            VpcMeta.batchCreateSubnetTags, hcClient);
    }

    /** 批量删除子网资源标签 为指定的子网资源实例批量删除标签 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     *
     * @param BatchDeleteSubnetTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteSubnetTagsResponse> */
    public CompletableFuture<BatchDeleteSubnetTagsResponse> batchDeleteSubnetTagsAsync(
        BatchDeleteSubnetTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchDeleteSubnetTags);
    }

    /** 批量删除子网资源标签 为指定的子网资源实例批量删除标签 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     *
     * @param BatchDeleteSubnetTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse> */
    public AsyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse> batchDeleteSubnetTagsAsyncInvoker(
        BatchDeleteSubnetTagsRequest request) {
        return new AsyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse>(request,
            VpcMeta.batchDeleteSubnetTags, hcClient);
    }

    /** 创建端口 创建端口。
     *
     * @param CreatePortRequest 请求对象
     * @return CompletableFuture<CreatePortResponse> */
    public CompletableFuture<CreatePortResponse> createPortAsync(CreatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createPort);
    }

    /** 创建端口 创建端口。
     *
     * @param CreatePortRequest 请求对象
     * @return AsyncInvoker<CreatePortRequest, CreatePortResponse> */
    public AsyncInvoker<CreatePortRequest, CreatePortResponse> createPortAsyncInvoker(CreatePortRequest request) {
        return new AsyncInvoker<CreatePortRequest, CreatePortResponse>(request, VpcMeta.createPort, hcClient);
    }

    /** 创建路由表 创建路由表
     *
     * @param CreateRouteTableRequest 请求对象
     * @return CompletableFuture<CreateRouteTableResponse> */
    public CompletableFuture<CreateRouteTableResponse> createRouteTableAsync(CreateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createRouteTable);
    }

    /** 创建路由表 创建路由表
     *
     * @param CreateRouteTableRequest 请求对象
     * @return AsyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse> */
    public AsyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse> createRouteTableAsyncInvoker(
        CreateRouteTableRequest request) {
        return new AsyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse>(request, VpcMeta.createRouteTable,
            hcClient);
    }

    /** 创建安全组 创建安全组。
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupResponse> */
    public CompletableFuture<CreateSecurityGroupResponse> createSecurityGroupAsync(CreateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    /** 创建安全组 创建安全组。
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> */
    public AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupAsyncInvoker(
        CreateSecurityGroupRequest request) {
        return new AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>(request,
            VpcMeta.createSecurityGroup, hcClient);
    }

    /** 创建安全组规则 创建安全组规则。
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupRuleResponse> */
    public CompletableFuture<CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsync(
        CreateSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    /** 创建安全组规则 创建安全组规则。
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> */
    public AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsyncInvoker(
        CreateSecurityGroupRuleRequest request) {
        return new AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>(request,
            VpcMeta.createSecurityGroupRule, hcClient);
    }

    /** 创建子网 创建子网。
     *
     * @param CreateSubnetRequest 请求对象
     * @return CompletableFuture<CreateSubnetResponse> */
    public CompletableFuture<CreateSubnetResponse> createSubnetAsync(CreateSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSubnet);
    }

    /** 创建子网 创建子网。
     *
     * @param CreateSubnetRequest 请求对象
     * @return AsyncInvoker<CreateSubnetRequest, CreateSubnetResponse> */
    public AsyncInvoker<CreateSubnetRequest, CreateSubnetResponse> createSubnetAsyncInvoker(
        CreateSubnetRequest request) {
        return new AsyncInvoker<CreateSubnetRequest, CreateSubnetResponse>(request, VpcMeta.createSubnet, hcClient);
    }

    /** 创建子网资源标签 给指定子网资源实例增加标签信息。 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateSubnetTagRequest 请求对象
     * @return CompletableFuture<CreateSubnetTagResponse> */
    public CompletableFuture<CreateSubnetTagResponse> createSubnetTagAsync(CreateSubnetTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSubnetTag);
    }

    /** 创建子网资源标签 给指定子网资源实例增加标签信息。 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateSubnetTagRequest 请求对象
     * @return AsyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse> */
    public AsyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse> createSubnetTagAsyncInvoker(
        CreateSubnetTagRequest request) {
        return new AsyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse>(request, VpcMeta.createSubnetTag,
            hcClient);
    }

    /** 创建对等连接 创建对等连接。
     *
     * @param CreateVpcPeeringRequest 请求对象
     * @return CompletableFuture<CreateVpcPeeringResponse> */
    public CompletableFuture<CreateVpcPeeringResponse> createVpcPeeringAsync(CreateVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpcPeering);
    }

    /** 创建对等连接 创建对等连接。
     *
     * @param CreateVpcPeeringRequest 请求对象
     * @return AsyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse> */
    public AsyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse> createVpcPeeringAsyncInvoker(
        CreateVpcPeeringRequest request) {
        return new AsyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse>(request, VpcMeta.createVpcPeering,
            hcClient);
    }

    /** 删除端口 删除端口。
     *
     * @param DeletePortRequest 请求对象
     * @return CompletableFuture<DeletePortResponse> */
    public CompletableFuture<DeletePortResponse> deletePortAsync(DeletePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deletePort);
    }

    /** 删除端口 删除端口。
     *
     * @param DeletePortRequest 请求对象
     * @return AsyncInvoker<DeletePortRequest, DeletePortResponse> */
    public AsyncInvoker<DeletePortRequest, DeletePortResponse> deletePortAsyncInvoker(DeletePortRequest request) {
        return new AsyncInvoker<DeletePortRequest, DeletePortResponse>(request, VpcMeta.deletePort, hcClient);
    }

    /** 删除路由表 删除路由表
     *
     * @param DeleteRouteTableRequest 请求对象
     * @return CompletableFuture<DeleteRouteTableResponse> */
    public CompletableFuture<DeleteRouteTableResponse> deleteRouteTableAsync(DeleteRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteRouteTable);
    }

    /** 删除路由表 删除路由表
     *
     * @param DeleteRouteTableRequest 请求对象
     * @return AsyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse> */
    public AsyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse> deleteRouteTableAsyncInvoker(
        DeleteRouteTableRequest request) {
        return new AsyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse>(request, VpcMeta.deleteRouteTable,
            hcClient);
    }

    /** 删除安全组 删除安全组。
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupResponse> */
    public CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroupAsync(DeleteSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    /** 删除安全组 删除安全组。
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> */
    public AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupAsyncInvoker(
        DeleteSecurityGroupRequest request) {
        return new AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>(request,
            VpcMeta.deleteSecurityGroup, hcClient);
    }

    /** 删除安全组规则 删除安全组规则。
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupRuleResponse> */
    public CompletableFuture<DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsync(
        DeleteSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    /** 删除安全组规则 删除安全组规则。
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> */
    public AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsyncInvoker(
        DeleteSecurityGroupRuleRequest request) {
        return new AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>(request,
            VpcMeta.deleteSecurityGroupRule, hcClient);
    }

    /** 删除子网 删除子网
     *
     * @param DeleteSubnetRequest 请求对象
     * @return CompletableFuture<DeleteSubnetResponse> */
    public CompletableFuture<DeleteSubnetResponse> deleteSubnetAsync(DeleteSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSubnet);
    }

    /** 删除子网 删除子网
     *
     * @param DeleteSubnetRequest 请求对象
     * @return AsyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse> */
    public AsyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnetAsyncInvoker(
        DeleteSubnetRequest request) {
        return new AsyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>(request, VpcMeta.deleteSubnet, hcClient);
    }

    /** 删除子网资源标签 删除指定子网资源实例的标签信息。 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     *
     * @param DeleteSubnetTagRequest 请求对象
     * @return CompletableFuture<DeleteSubnetTagResponse> */
    public CompletableFuture<DeleteSubnetTagResponse> deleteSubnetTagAsync(DeleteSubnetTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSubnetTag);
    }

    /** 删除子网资源标签 删除指定子网资源实例的标签信息。 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     *
     * @param DeleteSubnetTagRequest 请求对象
     * @return AsyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse> */
    public AsyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse> deleteSubnetTagAsyncInvoker(
        DeleteSubnetTagRequest request) {
        return new AsyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse>(request, VpcMeta.deleteSubnetTag,
            hcClient);
    }

    /** 删除对等连接 删除对等连接。 可以在在本端或对端任何一端删除对等连接。
     *
     * @param DeleteVpcPeeringRequest 请求对象
     * @return CompletableFuture<DeleteVpcPeeringResponse> */
    public CompletableFuture<DeleteVpcPeeringResponse> deleteVpcPeeringAsync(DeleteVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpcPeering);
    }

    /** 删除对等连接 删除对等连接。 可以在在本端或对端任何一端删除对等连接。
     *
     * @param DeleteVpcPeeringRequest 请求对象
     * @return AsyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> */
    public AsyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> deleteVpcPeeringAsyncInvoker(
        DeleteVpcPeeringRequest request) {
        return new AsyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse>(request, VpcMeta.deleteVpcPeering,
            hcClient);
    }

    /** 子网解关联路由表 子网解关联路由表
     *
     * @param DisassociateRouteTableRequest 请求对象
     * @return CompletableFuture<DisassociateRouteTableResponse> */
    public CompletableFuture<DisassociateRouteTableResponse> disassociateRouteTableAsync(
        DisassociateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.disassociateRouteTable);
    }

    /** 子网解关联路由表 子网解关联路由表
     *
     * @param DisassociateRouteTableRequest 请求对象
     * @return AsyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse> */
    public AsyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse> disassociateRouteTableAsyncInvoker(
        DisassociateRouteTableRequest request) {
        return new AsyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse>(request,
            VpcMeta.disassociateRouteTable, hcClient);
    }

    /** 查询端口列表 查询提交请求的租户的所有端口，单次查询最多返回2000条数据。
     *
     * @param ListPortsRequest 请求对象
     * @return CompletableFuture<ListPortsResponse> */
    public CompletableFuture<ListPortsResponse> listPortsAsync(ListPortsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listPorts);
    }

    /** 查询端口列表 查询提交请求的租户的所有端口，单次查询最多返回2000条数据。
     *
     * @param ListPortsRequest 请求对象
     * @return AsyncInvoker<ListPortsRequest, ListPortsResponse> */
    public AsyncInvoker<ListPortsRequest, ListPortsResponse> listPortsAsyncInvoker(ListPortsRequest request) {
        return new AsyncInvoker<ListPortsRequest, ListPortsResponse>(request, VpcMeta.listPorts, hcClient);
    }

    /** 查询路由表列表 查询提交请求的帐户的所有路由表列表，并根据过滤条件进行过滤
     *
     * @param ListRouteTablesRequest 请求对象
     * @return CompletableFuture<ListRouteTablesResponse> */
    public CompletableFuture<ListRouteTablesResponse> listRouteTablesAsync(ListRouteTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listRouteTables);
    }

    /** 查询路由表列表 查询提交请求的帐户的所有路由表列表，并根据过滤条件进行过滤
     *
     * @param ListRouteTablesRequest 请求对象
     * @return AsyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse> */
    public AsyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse> listRouteTablesAsyncInvoker(
        ListRouteTablesRequest request) {
        return new AsyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse>(request, VpcMeta.listRouteTables,
            hcClient);
    }

    /** 查询安全组规则列表 查询安全组规则列表。
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupRulesResponse> */
    public CompletableFuture<ListSecurityGroupRulesResponse> listSecurityGroupRulesAsync(
        ListSecurityGroupRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    /** 查询安全组规则列表 查询安全组规则列表。
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> */
    public AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesAsyncInvoker(
        ListSecurityGroupRulesRequest request) {
        return new AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>(request,
            VpcMeta.listSecurityGroupRules, hcClient);
    }

    /** 查询安全组列表 查询安全组列表
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupsResponse> */
    public CompletableFuture<ListSecurityGroupsResponse> listSecurityGroupsAsync(ListSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    /** 查询安全组列表 查询安全组列表
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> */
    public AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsAsyncInvoker(
        ListSecurityGroupsRequest request) {
        return new AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>(request,
            VpcMeta.listSecurityGroups, hcClient);
    }

    /** 查询子网项目标签 查询租户在指定区域和实例类型的所有标签集合
     *
     * @param ListSubnetTagsRequest 请求对象
     * @return CompletableFuture<ListSubnetTagsResponse> */
    public CompletableFuture<ListSubnetTagsResponse> listSubnetTagsAsync(ListSubnetTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubnetTags);
    }

    /** 查询子网项目标签 查询租户在指定区域和实例类型的所有标签集合
     *
     * @param ListSubnetTagsRequest 请求对象
     * @return AsyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse> */
    public AsyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse> listSubnetTagsAsyncInvoker(
        ListSubnetTagsRequest request) {
        return new AsyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse>(request, VpcMeta.listSubnetTags,
            hcClient);
    }

    /** 查询子网列表 查询子网列表
     *
     * @param ListSubnetsRequest 请求对象
     * @return CompletableFuture<ListSubnetsResponse> */
    public CompletableFuture<ListSubnetsResponse> listSubnetsAsync(ListSubnetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubnets);
    }

    /** 查询子网列表 查询子网列表
     *
     * @param ListSubnetsRequest 请求对象
     * @return AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse> */
    public AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse> listSubnetsAsyncInvoker(ListSubnetsRequest request) {
        return new AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse>(request, VpcMeta.listSubnets, hcClient);
    }

    /** 查询子网资源实例 使用标签过滤实例
     *
     * @param ListSubnetsByTagsRequest 请求对象
     * @return CompletableFuture<ListSubnetsByTagsResponse> */
    public CompletableFuture<ListSubnetsByTagsResponse> listSubnetsByTagsAsync(ListSubnetsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubnetsByTags);
    }

    /** 查询子网资源实例 使用标签过滤实例
     *
     * @param ListSubnetsByTagsRequest 请求对象
     * @return AsyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse> */
    public AsyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse> listSubnetsByTagsAsyncInvoker(
        ListSubnetsByTagsRequest request) {
        return new AsyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse>(request, VpcMeta.listSubnetsByTags,
            hcClient);
    }

    /** 查询对等连接列表 查询提交请求的租户的所有对等连接。根据过滤条件进行过滤。
     *
     * @param ListVpcPeeringsRequest 请求对象
     * @return CompletableFuture<ListVpcPeeringsResponse> */
    public CompletableFuture<ListVpcPeeringsResponse> listVpcPeeringsAsync(ListVpcPeeringsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcPeerings);
    }

    /** 查询对等连接列表 查询提交请求的租户的所有对等连接。根据过滤条件进行过滤。
     *
     * @param ListVpcPeeringsRequest 请求对象
     * @return AsyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse> */
    public AsyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse> listVpcPeeringsAsyncInvoker(
        ListVpcPeeringsRequest request) {
        return new AsyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse>(request, VpcMeta.listVpcPeerings,
            hcClient);
    }

    /** 拒绝对等连接请求 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户拒绝其他租户发起的对等连接请求。
     *
     * @param RejectVpcPeeringRequest 请求对象
     * @return CompletableFuture<RejectVpcPeeringResponse> */
    public CompletableFuture<RejectVpcPeeringResponse> rejectVpcPeeringAsync(RejectVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.rejectVpcPeering);
    }

    /** 拒绝对等连接请求 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户拒绝其他租户发起的对等连接请求。
     *
     * @param RejectVpcPeeringRequest 请求对象
     * @return AsyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse> */
    public AsyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse> rejectVpcPeeringAsyncInvoker(
        RejectVpcPeeringRequest request) {
        return new AsyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse>(request, VpcMeta.rejectVpcPeering,
            hcClient);
    }

    /** 查询端口 查询单个端口详情。
     *
     * @param ShowPortRequest 请求对象
     * @return CompletableFuture<ShowPortResponse> */
    public CompletableFuture<ShowPortResponse> showPortAsync(ShowPortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showPort);
    }

    /** 查询端口 查询单个端口详情。
     *
     * @param ShowPortRequest 请求对象
     * @return AsyncInvoker<ShowPortRequest, ShowPortResponse> */
    public AsyncInvoker<ShowPortRequest, ShowPortResponse> showPortAsyncInvoker(ShowPortRequest request) {
        return new AsyncInvoker<ShowPortRequest, ShowPortResponse>(request, VpcMeta.showPort, hcClient);
    }

    /** 查询配额 查询单租户在VPC服务下的网络资源配额，包括vpc配额、子网配额、安全组配额、安全组规则配额、弹性公网IP配额，vpn配额等。
     *
     * @param ShowQuotaRequest 请求对象
     * @return CompletableFuture<ShowQuotaResponse> */
    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showQuota);
    }

    /** 查询配额 查询单租户在VPC服务下的网络资源配额，包括vpc配额、子网配额、安全组配额、安全组规则配额、弹性公网IP配额，vpn配额等。
     *
     * @param ShowQuotaRequest 请求对象
     * @return AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> */
    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, VpcMeta.showQuota, hcClient);
    }

    /** 查询路由表 查询路由表详情
     *
     * @param ShowRouteTableRequest 请求对象
     * @return CompletableFuture<ShowRouteTableResponse> */
    public CompletableFuture<ShowRouteTableResponse> showRouteTableAsync(ShowRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showRouteTable);
    }

    /** 查询路由表 查询路由表详情
     *
     * @param ShowRouteTableRequest 请求对象
     * @return AsyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse> */
    public AsyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse> showRouteTableAsyncInvoker(
        ShowRouteTableRequest request) {
        return new AsyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse>(request, VpcMeta.showRouteTable,
            hcClient);
    }

    /** 查询安全组 查询单个安全组详情。
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupResponse> */
    public CompletableFuture<ShowSecurityGroupResponse> showSecurityGroupAsync(ShowSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    /** 查询安全组 查询单个安全组详情。
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> */
    public AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupAsyncInvoker(
        ShowSecurityGroupRequest request) {
        return new AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>(request, VpcMeta.showSecurityGroup,
            hcClient);
    }

    /** 查询安全组规则 查询单个安全组规则详情
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupRuleResponse> */
    public CompletableFuture<ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsync(
        ShowSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    /** 查询安全组规则 查询单个安全组规则详情
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> */
    public AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsyncInvoker(
        ShowSecurityGroupRuleRequest request) {
        return new AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>(request,
            VpcMeta.showSecurityGroupRule, hcClient);
    }

    /** 查询子网 查询子网详情。
     *
     * @param ShowSubnetRequest 请求对象
     * @return CompletableFuture<ShowSubnetResponse> */
    public CompletableFuture<ShowSubnetResponse> showSubnetAsync(ShowSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubnet);
    }

    /** 查询子网 查询子网详情。
     *
     * @param ShowSubnetRequest 请求对象
     * @return AsyncInvoker<ShowSubnetRequest, ShowSubnetResponse> */
    public AsyncInvoker<ShowSubnetRequest, ShowSubnetResponse> showSubnetAsyncInvoker(ShowSubnetRequest request) {
        return new AsyncInvoker<ShowSubnetRequest, ShowSubnetResponse>(request, VpcMeta.showSubnet, hcClient);
    }

    /** 查询子网资源标签 查询指定子网实例的标签信息。
     *
     * @param ShowSubnetTagsRequest 请求对象
     * @return CompletableFuture<ShowSubnetTagsResponse> */
    public CompletableFuture<ShowSubnetTagsResponse> showSubnetTagsAsync(ShowSubnetTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubnetTags);
    }

    /** 查询子网资源标签 查询指定子网实例的标签信息。
     *
     * @param ShowSubnetTagsRequest 请求对象
     * @return AsyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse> */
    public AsyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse> showSubnetTagsAsyncInvoker(
        ShowSubnetTagsRequest request) {
        return new AsyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse>(request, VpcMeta.showSubnetTags,
            hcClient);
    }

    /** 查询对等连接 查询对等连接详情。
     *
     * @param ShowVpcPeeringRequest 请求对象
     * @return CompletableFuture<ShowVpcPeeringResponse> */
    public CompletableFuture<ShowVpcPeeringResponse> showVpcPeeringAsync(ShowVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpcPeering);
    }

    /** 查询对等连接 查询对等连接详情。
     *
     * @param ShowVpcPeeringRequest 请求对象
     * @return AsyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse> */
    public AsyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse> showVpcPeeringAsyncInvoker(
        ShowVpcPeeringRequest request) {
        return new AsyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse>(request, VpcMeta.showVpcPeering,
            hcClient);
    }

    /** 更新端口 更新端口。
     *
     * @param UpdatePortRequest 请求对象
     * @return CompletableFuture<UpdatePortResponse> */
    public CompletableFuture<UpdatePortResponse> updatePortAsync(UpdatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updatePort);
    }

    /** 更新端口 更新端口。
     *
     * @param UpdatePortRequest 请求对象
     * @return AsyncInvoker<UpdatePortRequest, UpdatePortResponse> */
    public AsyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortAsyncInvoker(UpdatePortRequest request) {
        return new AsyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, VpcMeta.updatePort, hcClient);
    }

    /** 更新路由表 更新路由表，包括可以更新路由表的名称，描述，以及新增、更新、删除路由条目
     *
     * @param UpdateRouteTableRequest 请求对象
     * @return CompletableFuture<UpdateRouteTableResponse> */
    public CompletableFuture<UpdateRouteTableResponse> updateRouteTableAsync(UpdateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateRouteTable);
    }

    /** 更新路由表 更新路由表，包括可以更新路由表的名称，描述，以及新增、更新、删除路由条目
     *
     * @param UpdateRouteTableRequest 请求对象
     * @return AsyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse> */
    public AsyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse> updateRouteTableAsyncInvoker(
        UpdateRouteTableRequest request) {
        return new AsyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse>(request, VpcMeta.updateRouteTable,
            hcClient);
    }

    /** 更新子网 更新子网。
     *
     * @param UpdateSubnetRequest 请求对象
     * @return CompletableFuture<UpdateSubnetResponse> */
    public CompletableFuture<UpdateSubnetResponse> updateSubnetAsync(UpdateSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateSubnet);
    }

    /** 更新子网 更新子网。
     *
     * @param UpdateSubnetRequest 请求对象
     * @return AsyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse> */
    public AsyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnetAsyncInvoker(
        UpdateSubnetRequest request) {
        return new AsyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>(request, VpcMeta.updateSubnet, hcClient);
    }

    /** 更新对等连接 更新对等连接。
     *
     * @param UpdateVpcPeeringRequest 请求对象
     * @return CompletableFuture<UpdateVpcPeeringResponse> */
    public CompletableFuture<UpdateVpcPeeringResponse> updateVpcPeeringAsync(UpdateVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateVpcPeering);
    }

    /** 更新对等连接 更新对等连接。
     *
     * @param UpdateVpcPeeringRequest 请求对象
     * @return AsyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> */
    public AsyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> updateVpcPeeringAsyncInvoker(
        UpdateVpcPeeringRequest request) {
        return new AsyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse>(request, VpcMeta.updateVpcPeering,
            hcClient);
    }

    /** 申请私有IP 申请私有IP。
     *
     * @param CreatePrivateipRequest 请求对象
     * @return CompletableFuture<CreatePrivateipResponse> */
    public CompletableFuture<CreatePrivateipResponse> createPrivateipAsync(CreatePrivateipRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createPrivateip);
    }

    /** 申请私有IP 申请私有IP。
     *
     * @param CreatePrivateipRequest 请求对象
     * @return AsyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse> */
    public AsyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse> createPrivateipAsyncInvoker(
        CreatePrivateipRequest request) {
        return new AsyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse>(request, VpcMeta.createPrivateip,
            hcClient);
    }

    /** 删除私有IP 删除私有IP。
     *
     * @param DeletePrivateipRequest 请求对象
     * @return CompletableFuture<DeletePrivateipResponse> */
    public CompletableFuture<DeletePrivateipResponse> deletePrivateipAsync(DeletePrivateipRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deletePrivateip);
    }

    /** 删除私有IP 删除私有IP。
     *
     * @param DeletePrivateipRequest 请求对象
     * @return AsyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse> */
    public AsyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse> deletePrivateipAsyncInvoker(
        DeletePrivateipRequest request) {
        return new AsyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse>(request, VpcMeta.deletePrivateip,
            hcClient);
    }

    /** 查询私有IP列表 查询指定子网下的私有IP列表。
     *
     * @param ListPrivateipsRequest 请求对象
     * @return CompletableFuture<ListPrivateipsResponse> */
    public CompletableFuture<ListPrivateipsResponse> listPrivateipsAsync(ListPrivateipsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listPrivateips);
    }

    /** 查询私有IP列表 查询指定子网下的私有IP列表。
     *
     * @param ListPrivateipsRequest 请求对象
     * @return AsyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse> */
    public AsyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse> listPrivateipsAsyncInvoker(
        ListPrivateipsRequest request) {
        return new AsyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse>(request, VpcMeta.listPrivateips,
            hcClient);
    }

    /** 查询网络IP使用情况 显示一个指定网络中的IPv4地址使用情况。 包括此网络中的IP总数以及已用IP总数，以及网络下每一个子网的IP地址总数和可用IP地址总数。 &gt; 须知 -
     * 系统预留地址指的是子网的第1个以及最后4个地址，一般用于网关、DHCP等服务。 - 这里以及下文描述的IP地址总数、已用IP地址总数不包含系统预留地址。 -
     * 在分配IP时，用户可以指定系统预留的IP地址。但是不论IP是如何分配的，只要是处于系统预留IP地址段的IP均不会被统计到已用IP地址数目和IP地址总数中。
     *
     * @param ShowNetworkIpAvailabilitiesRequest 请求对象
     * @return CompletableFuture<ShowNetworkIpAvailabilitiesResponse> */
    public CompletableFuture<ShowNetworkIpAvailabilitiesResponse> showNetworkIpAvailabilitiesAsync(
        ShowNetworkIpAvailabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showNetworkIpAvailabilities);
    }

    /** 查询网络IP使用情况 显示一个指定网络中的IPv4地址使用情况。 包括此网络中的IP总数以及已用IP总数，以及网络下每一个子网的IP地址总数和可用IP地址总数。 &gt; 须知 -
     * 系统预留地址指的是子网的第1个以及最后4个地址，一般用于网关、DHCP等服务。 - 这里以及下文描述的IP地址总数、已用IP地址总数不包含系统预留地址。 -
     * 在分配IP时，用户可以指定系统预留的IP地址。但是不论IP是如何分配的，只要是处于系统预留IP地址段的IP均不会被统计到已用IP地址数目和IP地址总数中。
     *
     * @param ShowNetworkIpAvailabilitiesRequest 请求对象
     * @return AsyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> */
    public AsyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> showNetworkIpAvailabilitiesAsyncInvoker(
        ShowNetworkIpAvailabilitiesRequest request) {
        return new AsyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse>(request,
            VpcMeta.showNetworkIpAvailabilities, hcClient);
    }

    /** 查询私有IP 指定ID查询私有IP。
     *
     * @param ShowPrivateipRequest 请求对象
     * @return CompletableFuture<ShowPrivateipResponse> */
    public CompletableFuture<ShowPrivateipResponse> showPrivateipAsync(ShowPrivateipRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showPrivateip);
    }

    /** 查询私有IP 指定ID查询私有IP。
     *
     * @param ShowPrivateipRequest 请求对象
     * @return AsyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse> */
    public AsyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse> showPrivateipAsyncInvoker(
        ShowPrivateipRequest request) {
        return new AsyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse>(request, VpcMeta.showPrivateip, hcClient);
    }

    /** 创建安全组 创建安全组
     *
     * @param NeutronCreateSecurityGroupRequest 请求对象
     * @return CompletableFuture<NeutronCreateSecurityGroupResponse> */
    public CompletableFuture<NeutronCreateSecurityGroupResponse> neutronCreateSecurityGroupAsync(
        NeutronCreateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateSecurityGroup);
    }

    /** 创建安全组 创建安全组
     *
     * @param NeutronCreateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse> */
    public AsyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse> neutronCreateSecurityGroupAsyncInvoker(
        NeutronCreateSecurityGroupRequest request) {
        return new AsyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse>(request,
            VpcMeta.neutronCreateSecurityGroup, hcClient);
    }

    /** 创建安全组规则 创建安全组规则
     *
     * @param NeutronCreateSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<NeutronCreateSecurityGroupRuleResponse> */
    public CompletableFuture<NeutronCreateSecurityGroupRuleResponse> neutronCreateSecurityGroupRuleAsync(
        NeutronCreateSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateSecurityGroupRule);
    }

    /** 创建安全组规则 创建安全组规则
     *
     * @param NeutronCreateSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse> */
    public AsyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse> neutronCreateSecurityGroupRuleAsyncInvoker(
        NeutronCreateSecurityGroupRuleRequest request) {
        return new AsyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse>(request,
            VpcMeta.neutronCreateSecurityGroupRule, hcClient);
    }

    /** 删除安全组 删除安全组
     *
     * @param NeutronDeleteSecurityGroupRequest 请求对象
     * @return CompletableFuture<NeutronDeleteSecurityGroupResponse> */
    public CompletableFuture<NeutronDeleteSecurityGroupResponse> neutronDeleteSecurityGroupAsync(
        NeutronDeleteSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteSecurityGroup);
    }

    /** 删除安全组 删除安全组
     *
     * @param NeutronDeleteSecurityGroupRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse> */
    public AsyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse> neutronDeleteSecurityGroupAsyncInvoker(
        NeutronDeleteSecurityGroupRequest request) {
        return new AsyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse>(request,
            VpcMeta.neutronDeleteSecurityGroup, hcClient);
    }

    /** 删除安全组规则 删除安全组规则
     *
     * @param NeutronDeleteSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<NeutronDeleteSecurityGroupRuleResponse> */
    public CompletableFuture<NeutronDeleteSecurityGroupRuleResponse> neutronDeleteSecurityGroupRuleAsync(
        NeutronDeleteSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteSecurityGroupRule);
    }

    /** 删除安全组规则 删除安全组规则
     *
     * @param NeutronDeleteSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse> */
    public AsyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse> neutronDeleteSecurityGroupRuleAsyncInvoker(
        NeutronDeleteSecurityGroupRuleRequest request) {
        return new AsyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse>(request,
            VpcMeta.neutronDeleteSecurityGroupRule, hcClient);
    }

    /** 查询安全组规则列表 查询提交请求的租户有权限查看的所有安全组规则。单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询
     *
     * @param NeutronListSecurityGroupRulesRequest 请求对象
     * @return CompletableFuture<NeutronListSecurityGroupRulesResponse> */
    public CompletableFuture<NeutronListSecurityGroupRulesResponse> neutronListSecurityGroupRulesAsync(
        NeutronListSecurityGroupRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListSecurityGroupRules);
    }

    /** 查询安全组规则列表 查询提交请求的租户有权限查看的所有安全组规则。单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询
     *
     * @param NeutronListSecurityGroupRulesRequest 请求对象
     * @return AsyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse> */
    public AsyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse> neutronListSecurityGroupRulesAsyncInvoker(
        NeutronListSecurityGroupRulesRequest request) {
        return new AsyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse>(request,
            VpcMeta.neutronListSecurityGroupRules, hcClient);
    }

    /** 查询安全组列表 查询提交请求租户的所有安全组，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询 。
     *
     * @param NeutronListSecurityGroupsRequest 请求对象
     * @return CompletableFuture<NeutronListSecurityGroupsResponse> */
    public CompletableFuture<NeutronListSecurityGroupsResponse> neutronListSecurityGroupsAsync(
        NeutronListSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListSecurityGroups);
    }

    /** 查询安全组列表 查询提交请求租户的所有安全组，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询 。
     *
     * @param NeutronListSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse> */
    public AsyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse> neutronListSecurityGroupsAsyncInvoker(
        NeutronListSecurityGroupsRequest request) {
        return new AsyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse>(request,
            VpcMeta.neutronListSecurityGroups, hcClient);
    }

    /** 查询安全组 查询安全组详情
     *
     * @param NeutronShowSecurityGroupRequest 请求对象
     * @return CompletableFuture<NeutronShowSecurityGroupResponse> */
    public CompletableFuture<NeutronShowSecurityGroupResponse> neutronShowSecurityGroupAsync(
        NeutronShowSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowSecurityGroup);
    }

    /** 查询安全组 查询安全组详情
     *
     * @param NeutronShowSecurityGroupRequest 请求对象
     * @return AsyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse> */
    public AsyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse> neutronShowSecurityGroupAsyncInvoker(
        NeutronShowSecurityGroupRequest request) {
        return new AsyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse>(request,
            VpcMeta.neutronShowSecurityGroup, hcClient);
    }

    /** 查询安全组规则 查询安全组规则详情。
     *
     * @param NeutronShowSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<NeutronShowSecurityGroupRuleResponse> */
    public CompletableFuture<NeutronShowSecurityGroupRuleResponse> neutronShowSecurityGroupRuleAsync(
        NeutronShowSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowSecurityGroupRule);
    }

    /** 查询安全组规则 查询安全组规则详情。
     *
     * @param NeutronShowSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse> */
    public AsyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse> neutronShowSecurityGroupRuleAsyncInvoker(
        NeutronShowSecurityGroupRuleRequest request) {
        return new AsyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse>(request,
            VpcMeta.neutronShowSecurityGroupRule, hcClient);
    }

    /** 更新安全组 更新安全组
     *
     * @param NeutronUpdateSecurityGroupRequest 请求对象
     * @return CompletableFuture<NeutronUpdateSecurityGroupResponse> */
    public CompletableFuture<NeutronUpdateSecurityGroupResponse> neutronUpdateSecurityGroupAsync(
        NeutronUpdateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateSecurityGroup);
    }

    /** 更新安全组 更新安全组
     *
     * @param NeutronUpdateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse> */
    public AsyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse> neutronUpdateSecurityGroupAsyncInvoker(
        NeutronUpdateSecurityGroupRequest request) {
        return new AsyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse>(request,
            VpcMeta.neutronUpdateSecurityGroup, hcClient);
    }

    /** 插入网络ACL规则 插入一条网络ACL规则到某一网络ACL策略中。
     *
     * @param NeutronAddFirewallRuleRequest 请求对象
     * @return CompletableFuture<NeutronAddFirewallRuleResponse> */
    public CompletableFuture<NeutronAddFirewallRuleResponse> neutronAddFirewallRuleAsync(
        NeutronAddFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronAddFirewallRule);
    }

    /** 插入网络ACL规则 插入一条网络ACL规则到某一网络ACL策略中。
     *
     * @param NeutronAddFirewallRuleRequest 请求对象
     * @return AsyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> */
    public AsyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> neutronAddFirewallRuleAsyncInvoker(
        NeutronAddFirewallRuleRequest request) {
        return new AsyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse>(request,
            VpcMeta.neutronAddFirewallRule, hcClient);
    }

    /** 创建网络ACL组 创建网络ACL组
     *
     * @param NeutronCreateFirewallGroupRequest 请求对象
     * @return CompletableFuture<NeutronCreateFirewallGroupResponse> */
    public CompletableFuture<NeutronCreateFirewallGroupResponse> neutronCreateFirewallGroupAsync(
        NeutronCreateFirewallGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateFirewallGroup);
    }

    /** 创建网络ACL组 创建网络ACL组
     *
     * @param NeutronCreateFirewallGroupRequest 请求对象
     * @return AsyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> */
    public AsyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> neutronCreateFirewallGroupAsyncInvoker(
        NeutronCreateFirewallGroupRequest request) {
        return new AsyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse>(request,
            VpcMeta.neutronCreateFirewallGroup, hcClient);
    }

    /** 创建网络ACL策略 创建网络ACL策略。
     *
     * @param NeutronCreateFirewallPolicyRequest 请求对象
     * @return CompletableFuture<NeutronCreateFirewallPolicyResponse> */
    public CompletableFuture<NeutronCreateFirewallPolicyResponse> neutronCreateFirewallPolicyAsync(
        NeutronCreateFirewallPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateFirewallPolicy);
    }

    /** 创建网络ACL策略 创建网络ACL策略。
     *
     * @param NeutronCreateFirewallPolicyRequest 请求对象
     * @return AsyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> */
    public AsyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> neutronCreateFirewallPolicyAsyncInvoker(
        NeutronCreateFirewallPolicyRequest request) {
        return new AsyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse>(request,
            VpcMeta.neutronCreateFirewallPolicy, hcClient);
    }

    /** 创建网络ACL规则 创建网络ACL规则。
     *
     * @param NeutronCreateFirewallRuleRequest 请求对象
     * @return CompletableFuture<NeutronCreateFirewallRuleResponse> */
    public CompletableFuture<NeutronCreateFirewallRuleResponse> neutronCreateFirewallRuleAsync(
        NeutronCreateFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateFirewallRule);
    }

    /** 创建网络ACL规则 创建网络ACL规则。
     *
     * @param NeutronCreateFirewallRuleRequest 请求对象
     * @return AsyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> */
    public AsyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> neutronCreateFirewallRuleAsyncInvoker(
        NeutronCreateFirewallRuleRequest request) {
        return new AsyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse>(request,
            VpcMeta.neutronCreateFirewallRule, hcClient);
    }

    /** 删除网络ACL组 删除网络ACL组
     *
     * @param NeutronDeleteFirewallGroupRequest 请求对象
     * @return CompletableFuture<NeutronDeleteFirewallGroupResponse> */
    public CompletableFuture<NeutronDeleteFirewallGroupResponse> neutronDeleteFirewallGroupAsync(
        NeutronDeleteFirewallGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteFirewallGroup);
    }

    /** 删除网络ACL组 删除网络ACL组
     *
     * @param NeutronDeleteFirewallGroupRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> */
    public AsyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> neutronDeleteFirewallGroupAsyncInvoker(
        NeutronDeleteFirewallGroupRequest request) {
        return new AsyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse>(request,
            VpcMeta.neutronDeleteFirewallGroup, hcClient);
    }

    /** 删除网络ACL策略 删除网络ACL策略。
     *
     * @param NeutronDeleteFirewallPolicyRequest 请求对象
     * @return CompletableFuture<NeutronDeleteFirewallPolicyResponse> */
    public CompletableFuture<NeutronDeleteFirewallPolicyResponse> neutronDeleteFirewallPolicyAsync(
        NeutronDeleteFirewallPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteFirewallPolicy);
    }

    /** 删除网络ACL策略 删除网络ACL策略。
     *
     * @param NeutronDeleteFirewallPolicyRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> */
    public AsyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> neutronDeleteFirewallPolicyAsyncInvoker(
        NeutronDeleteFirewallPolicyRequest request) {
        return new AsyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse>(request,
            VpcMeta.neutronDeleteFirewallPolicy, hcClient);
    }

    /** 删除网络ACL规则 删除网络ACL规则。
     *
     * @param NeutronDeleteFirewallRuleRequest 请求对象
     * @return CompletableFuture<NeutronDeleteFirewallRuleResponse> */
    public CompletableFuture<NeutronDeleteFirewallRuleResponse> neutronDeleteFirewallRuleAsync(
        NeutronDeleteFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteFirewallRule);
    }

    /** 删除网络ACL规则 删除网络ACL规则。
     *
     * @param NeutronDeleteFirewallRuleRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> */
    public AsyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> neutronDeleteFirewallRuleAsyncInvoker(
        NeutronDeleteFirewallRuleRequest request) {
        return new AsyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse>(request,
            VpcMeta.neutronDeleteFirewallRule, hcClient);
    }

    /** 查询所有网络ACL组 查询提交请求的租户有权限操作的所有网络ACL组信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     *
     * @param NeutronListFirewallGroupsRequest 请求对象
     * @return CompletableFuture<NeutronListFirewallGroupsResponse> */
    public CompletableFuture<NeutronListFirewallGroupsResponse> neutronListFirewallGroupsAsync(
        NeutronListFirewallGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListFirewallGroups);
    }

    /** 查询所有网络ACL组 查询提交请求的租户有权限操作的所有网络ACL组信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     *
     * @param NeutronListFirewallGroupsRequest 请求对象
     * @return AsyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> */
    public AsyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> neutronListFirewallGroupsAsyncInvoker(
        NeutronListFirewallGroupsRequest request) {
        return new AsyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse>(request,
            VpcMeta.neutronListFirewallGroups, hcClient);
    }

    /** 查询所有网络ACL策略 查询提交请求的租户有权限操作的所有网络ACL策略信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     *
     * @param NeutronListFirewallPoliciesRequest 请求对象
     * @return CompletableFuture<NeutronListFirewallPoliciesResponse> */
    public CompletableFuture<NeutronListFirewallPoliciesResponse> neutronListFirewallPoliciesAsync(
        NeutronListFirewallPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListFirewallPolicies);
    }

    /** 查询所有网络ACL策略 查询提交请求的租户有权限操作的所有网络ACL策略信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     *
     * @param NeutronListFirewallPoliciesRequest 请求对象
     * @return AsyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> */
    public AsyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> neutronListFirewallPoliciesAsyncInvoker(
        NeutronListFirewallPoliciesRequest request) {
        return new AsyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse>(request,
            VpcMeta.neutronListFirewallPolicies, hcClient);
    }

    /** 查询所有网络ACL规则 查询提交请求的租户有权限操作的所有网络ACL规则信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     *
     * @param NeutronListFirewallRulesRequest 请求对象
     * @return CompletableFuture<NeutronListFirewallRulesResponse> */
    public CompletableFuture<NeutronListFirewallRulesResponse> neutronListFirewallRulesAsync(
        NeutronListFirewallRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListFirewallRules);
    }

    /** 查询所有网络ACL规则 查询提交请求的租户有权限操作的所有网络ACL规则信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     *
     * @param NeutronListFirewallRulesRequest 请求对象
     * @return AsyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> */
    public AsyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> neutronListFirewallRulesAsyncInvoker(
        NeutronListFirewallRulesRequest request) {
        return new AsyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse>(request,
            VpcMeta.neutronListFirewallRules, hcClient);
    }

    /** 移除网络ACL规则 从某一网络ACL策略中移除一条网络ACL规则。
     *
     * @param NeutronRemoveFirewallRuleRequest 请求对象
     * @return CompletableFuture<NeutronRemoveFirewallRuleResponse> */
    public CompletableFuture<NeutronRemoveFirewallRuleResponse> neutronRemoveFirewallRuleAsync(
        NeutronRemoveFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronRemoveFirewallRule);
    }

    /** 移除网络ACL规则 从某一网络ACL策略中移除一条网络ACL规则。
     *
     * @param NeutronRemoveFirewallRuleRequest 请求对象
     * @return AsyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> */
    public AsyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> neutronRemoveFirewallRuleAsyncInvoker(
        NeutronRemoveFirewallRuleRequest request) {
        return new AsyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse>(request,
            VpcMeta.neutronRemoveFirewallRule, hcClient);
    }

    /** 查询特定网络ACL组详情 查询特定网络ACL组详情。
     *
     * @param NeutronShowFirewallGroupRequest 请求对象
     * @return CompletableFuture<NeutronShowFirewallGroupResponse> */
    public CompletableFuture<NeutronShowFirewallGroupResponse> neutronShowFirewallGroupAsync(
        NeutronShowFirewallGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowFirewallGroup);
    }

    /** 查询特定网络ACL组详情 查询特定网络ACL组详情。
     *
     * @param NeutronShowFirewallGroupRequest 请求对象
     * @return AsyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> */
    public AsyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> neutronShowFirewallGroupAsyncInvoker(
        NeutronShowFirewallGroupRequest request) {
        return new AsyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse>(request,
            VpcMeta.neutronShowFirewallGroup, hcClient);
    }

    /** 查询特定网络ACL策略详情 查询特定网络ACL策略详情。
     *
     * @param NeutronShowFirewallPolicyRequest 请求对象
     * @return CompletableFuture<NeutronShowFirewallPolicyResponse> */
    public CompletableFuture<NeutronShowFirewallPolicyResponse> neutronShowFirewallPolicyAsync(
        NeutronShowFirewallPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowFirewallPolicy);
    }

    /** 查询特定网络ACL策略详情 查询特定网络ACL策略详情。
     *
     * @param NeutronShowFirewallPolicyRequest 请求对象
     * @return AsyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> */
    public AsyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> neutronShowFirewallPolicyAsyncInvoker(
        NeutronShowFirewallPolicyRequest request) {
        return new AsyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse>(request,
            VpcMeta.neutronShowFirewallPolicy, hcClient);
    }

    /** 查询特定网络ACL规则 查询特定网络ACL规则。
     *
     * @param NeutronShowFirewallRuleRequest 请求对象
     * @return CompletableFuture<NeutronShowFirewallRuleResponse> */
    public CompletableFuture<NeutronShowFirewallRuleResponse> neutronShowFirewallRuleAsync(
        NeutronShowFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowFirewallRule);
    }

    /** 查询特定网络ACL规则 查询特定网络ACL规则。
     *
     * @param NeutronShowFirewallRuleRequest 请求对象
     * @return AsyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> */
    public AsyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> neutronShowFirewallRuleAsyncInvoker(
        NeutronShowFirewallRuleRequest request) {
        return new AsyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse>(request,
            VpcMeta.neutronShowFirewallRule, hcClient);
    }

    /** 更新网络ACL组 更新网络ACL组。
     *
     * @param NeutronUpdateFirewallGroupRequest 请求对象
     * @return CompletableFuture<NeutronUpdateFirewallGroupResponse> */
    public CompletableFuture<NeutronUpdateFirewallGroupResponse> neutronUpdateFirewallGroupAsync(
        NeutronUpdateFirewallGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateFirewallGroup);
    }

    /** 更新网络ACL组 更新网络ACL组。
     *
     * @param NeutronUpdateFirewallGroupRequest 请求对象
     * @return AsyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> */
    public AsyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> neutronUpdateFirewallGroupAsyncInvoker(
        NeutronUpdateFirewallGroupRequest request) {
        return new AsyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse>(request,
            VpcMeta.neutronUpdateFirewallGroup, hcClient);
    }

    /** 更新网络ACL策略 更新网络ACL策略。
     *
     * @param NeutronUpdateFirewallPolicyRequest 请求对象
     * @return CompletableFuture<NeutronUpdateFirewallPolicyResponse> */
    public CompletableFuture<NeutronUpdateFirewallPolicyResponse> neutronUpdateFirewallPolicyAsync(
        NeutronUpdateFirewallPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateFirewallPolicy);
    }

    /** 更新网络ACL策略 更新网络ACL策略。
     *
     * @param NeutronUpdateFirewallPolicyRequest 请求对象
     * @return AsyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> */
    public AsyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> neutronUpdateFirewallPolicyAsyncInvoker(
        NeutronUpdateFirewallPolicyRequest request) {
        return new AsyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse>(request,
            VpcMeta.neutronUpdateFirewallPolicy, hcClient);
    }

    /** 更新网络ACL规则 更新网络ACL规则。
     *
     * @param NeutronUpdateFirewallRuleRequest 请求对象
     * @return CompletableFuture<NeutronUpdateFirewallRuleResponse> */
    public CompletableFuture<NeutronUpdateFirewallRuleResponse> neutronUpdateFirewallRuleAsync(
        NeutronUpdateFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateFirewallRule);
    }

    /** 更新网络ACL规则 更新网络ACL规则。
     *
     * @param NeutronUpdateFirewallRuleRequest 请求对象
     * @return AsyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> */
    public AsyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> neutronUpdateFirewallRuleAsyncInvoker(
        NeutronUpdateFirewallRuleRequest request) {
        return new AsyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse>(request,
            VpcMeta.neutronUpdateFirewallRule, hcClient);
    }

    /** 批量创建VPC资源标签 为指定的VPC资源实例批量添加标签。 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     *
     * @param BatchCreateVpcTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateVpcTagsResponse> */
    public CompletableFuture<BatchCreateVpcTagsResponse> batchCreateVpcTagsAsync(BatchCreateVpcTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateVpcTags);
    }

    /** 批量创建VPC资源标签 为指定的VPC资源实例批量添加标签。 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     *
     * @param BatchCreateVpcTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse> */
    public AsyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse> batchCreateVpcTagsAsyncInvoker(
        BatchCreateVpcTagsRequest request) {
        return new AsyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse>(request,
            VpcMeta.batchCreateVpcTags, hcClient);
    }

    /** 批量删除VPC资源标签 为指定的VPC资源实例批量删除标签。 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     *
     * @param BatchDeleteVpcTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteVpcTagsResponse> */
    public CompletableFuture<BatchDeleteVpcTagsResponse> batchDeleteVpcTagsAsync(BatchDeleteVpcTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchDeleteVpcTags);
    }

    /** 批量删除VPC资源标签 为指定的VPC资源实例批量删除标签。 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     *
     * @param BatchDeleteVpcTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse> */
    public AsyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse> batchDeleteVpcTagsAsyncInvoker(
        BatchDeleteVpcTagsRequest request) {
        return new AsyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse>(request,
            VpcMeta.batchDeleteVpcTags, hcClient);
    }

    /** 创建VPC 创建虚拟私有云。
     *
     * @param CreateVpcRequest 请求对象
     * @return CompletableFuture<CreateVpcResponse> */
    public CompletableFuture<CreateVpcResponse> createVpcAsync(CreateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpc);
    }

    /** 创建VPC 创建虚拟私有云。
     *
     * @param CreateVpcRequest 请求对象
     * @return AsyncInvoker<CreateVpcRequest, CreateVpcResponse> */
    public AsyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcAsyncInvoker(CreateVpcRequest request) {
        return new AsyncInvoker<CreateVpcRequest, CreateVpcResponse>(request, VpcMeta.createVpc, hcClient);
    }

    /** 创建VPC资源标签 给指定VPC资源实例增加标签信息 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateVpcResourceTagRequest 请求对象
     * @return CompletableFuture<CreateVpcResourceTagResponse> */
    public CompletableFuture<CreateVpcResourceTagResponse> createVpcResourceTagAsync(
        CreateVpcResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpcResourceTag);
    }

    /** 创建VPC资源标签 给指定VPC资源实例增加标签信息 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateVpcResourceTagRequest 请求对象
     * @return AsyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse> */
    public AsyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse> createVpcResourceTagAsyncInvoker(
        CreateVpcResourceTagRequest request) {
        return new AsyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse>(request,
            VpcMeta.createVpcResourceTag, hcClient);
    }

    /** 创建VPC路由 创建路由
     *
     * @param CreateVpcRouteRequest 请求对象
     * @return CompletableFuture<CreateVpcRouteResponse> */
    public CompletableFuture<CreateVpcRouteResponse> createVpcRouteAsync(CreateVpcRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpcRoute);
    }

    /** 创建VPC路由 创建路由
     *
     * @param CreateVpcRouteRequest 请求对象
     * @return AsyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse> */
    public AsyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse> createVpcRouteAsyncInvoker(
        CreateVpcRouteRequest request) {
        return new AsyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse>(request, VpcMeta.createVpcRoute,
            hcClient);
    }

    /** 删除VPC 删除虚拟私有云。
     *
     * @param DeleteVpcRequest 请求对象
     * @return CompletableFuture<DeleteVpcResponse> */
    public CompletableFuture<DeleteVpcResponse> deleteVpcAsync(DeleteVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    /** 删除VPC 删除虚拟私有云。
     *
     * @param DeleteVpcRequest 请求对象
     * @return AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse> */
    public AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcAsyncInvoker(DeleteVpcRequest request) {
        return new AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse>(request, VpcMeta.deleteVpc, hcClient);
    }

    /** 删除VPC路由 删除路由
     *
     * @param DeleteVpcRouteRequest 请求对象
     * @return CompletableFuture<DeleteVpcRouteResponse> */
    public CompletableFuture<DeleteVpcRouteResponse> deleteVpcRouteAsync(DeleteVpcRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpcRoute);
    }

    /** 删除VPC路由 删除路由
     *
     * @param DeleteVpcRouteRequest 请求对象
     * @return AsyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse> */
    public AsyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse> deleteVpcRouteAsyncInvoker(
        DeleteVpcRouteRequest request) {
        return new AsyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse>(request, VpcMeta.deleteVpcRoute,
            hcClient);
    }

    /** 删除VPC资源标签 删除指定VPC资源实例的标签信息 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     *
     * @param DeleteVpcTagRequest 请求对象
     * @return CompletableFuture<DeleteVpcTagResponse> */
    public CompletableFuture<DeleteVpcTagResponse> deleteVpcTagAsync(DeleteVpcTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpcTag);
    }

    /** 删除VPC资源标签 删除指定VPC资源实例的标签信息 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     *
     * @param DeleteVpcTagRequest 请求对象
     * @return AsyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse> */
    public AsyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse> deleteVpcTagAsyncInvoker(
        DeleteVpcTagRequest request) {
        return new AsyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse>(request, VpcMeta.deleteVpcTag, hcClient);
    }

    /** 查询VPC路由列表 查询提交请求的租户的所有路由列表，并根据过滤条件进行过滤。
     *
     * @param ListVpcRoutesRequest 请求对象
     * @return CompletableFuture<ListVpcRoutesResponse> */
    public CompletableFuture<ListVpcRoutesResponse> listVpcRoutesAsync(ListVpcRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcRoutes);
    }

    /** 查询VPC路由列表 查询提交请求的租户的所有路由列表，并根据过滤条件进行过滤。
     *
     * @param ListVpcRoutesRequest 请求对象
     * @return AsyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse> */
    public AsyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse> listVpcRoutesAsyncInvoker(
        ListVpcRoutesRequest request) {
        return new AsyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse>(request, VpcMeta.listVpcRoutes, hcClient);
    }

    /** 查询VPC项目标签 查询租户在指定区域和实例类型的所有标签集合
     *
     * @param ListVpcTagsRequest 请求对象
     * @return CompletableFuture<ListVpcTagsResponse> */
    public CompletableFuture<ListVpcTagsResponse> listVpcTagsAsync(ListVpcTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcTags);
    }

    /** 查询VPC项目标签 查询租户在指定区域和实例类型的所有标签集合
     *
     * @param ListVpcTagsRequest 请求对象
     * @return AsyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse> */
    public AsyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse> listVpcTagsAsyncInvoker(ListVpcTagsRequest request) {
        return new AsyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse>(request, VpcMeta.listVpcTags, hcClient);
    }

    /** 查询VPC列表 查询虚拟私有云列表。
     *
     * @param ListVpcsRequest 请求对象
     * @return CompletableFuture<ListVpcsResponse> */
    public CompletableFuture<ListVpcsResponse> listVpcsAsync(ListVpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcs);
    }

    /** 查询VPC列表 查询虚拟私有云列表。
     *
     * @param ListVpcsRequest 请求对象
     * @return AsyncInvoker<ListVpcsRequest, ListVpcsResponse> */
    public AsyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsAsyncInvoker(ListVpcsRequest request) {
        return new AsyncInvoker<ListVpcsRequest, ListVpcsResponse>(request, VpcMeta.listVpcs, hcClient);
    }

    /** 查询VPC资源实例 使用标签过滤实例。
     *
     * @param ListVpcsByTagsRequest 请求对象
     * @return CompletableFuture<ListVpcsByTagsResponse> */
    public CompletableFuture<ListVpcsByTagsResponse> listVpcsByTagsAsync(ListVpcsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcsByTags);
    }

    /** 查询VPC资源实例 使用标签过滤实例。
     *
     * @param ListVpcsByTagsRequest 请求对象
     * @return AsyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse> */
    public AsyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse> listVpcsByTagsAsyncInvoker(
        ListVpcsByTagsRequest request) {
        return new AsyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse>(request, VpcMeta.listVpcsByTags,
            hcClient);
    }

    /** 查询VPC 查询虚拟私有云。
     *
     * @param ShowVpcRequest 请求对象
     * @return CompletableFuture<ShowVpcResponse> */
    public CompletableFuture<ShowVpcResponse> showVpcAsync(ShowVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpc);
    }

    /** 查询VPC 查询虚拟私有云。
     *
     * @param ShowVpcRequest 请求对象
     * @return AsyncInvoker<ShowVpcRequest, ShowVpcResponse> */
    public AsyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcAsyncInvoker(ShowVpcRequest request) {
        return new AsyncInvoker<ShowVpcRequest, ShowVpcResponse>(request, VpcMeta.showVpc, hcClient);
    }

    /** 查询VPC路由 查询路由详情
     *
     * @param ShowVpcRouteRequest 请求对象
     * @return CompletableFuture<ShowVpcRouteResponse> */
    public CompletableFuture<ShowVpcRouteResponse> showVpcRouteAsync(ShowVpcRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpcRoute);
    }

    /** 查询VPC路由 查询路由详情
     *
     * @param ShowVpcRouteRequest 请求对象
     * @return AsyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse> */
    public AsyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse> showVpcRouteAsyncInvoker(
        ShowVpcRouteRequest request) {
        return new AsyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse>(request, VpcMeta.showVpcRoute, hcClient);
    }

    /** 查询VPC资源标签 查询指定VPC实例的标签信息
     *
     * @param ShowVpcTagsRequest 请求对象
     * @return CompletableFuture<ShowVpcTagsResponse> */
    public CompletableFuture<ShowVpcTagsResponse> showVpcTagsAsync(ShowVpcTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpcTags);
    }

    /** 查询VPC资源标签 查询指定VPC实例的标签信息
     *
     * @param ShowVpcTagsRequest 请求对象
     * @return AsyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse> */
    public AsyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse> showVpcTagsAsyncInvoker(ShowVpcTagsRequest request) {
        return new AsyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse>(request, VpcMeta.showVpcTags, hcClient);
    }

    /** 更新VPC 更新虚拟私有云。
     *
     * @param UpdateVpcRequest 请求对象
     * @return CompletableFuture<UpdateVpcResponse> */
    public CompletableFuture<UpdateVpcResponse> updateVpcAsync(UpdateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateVpc);
    }

    /** 更新VPC 更新虚拟私有云。
     *
     * @param UpdateVpcRequest 请求对象
     * @return AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse> */
    public AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcAsyncInvoker(UpdateVpcRequest request) {
        return new AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse>(request, VpcMeta.updateVpc, hcClient);
    }

}
