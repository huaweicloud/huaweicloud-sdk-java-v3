package com.huaweicloud.sdk.vpc.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
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
     *
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户接受其他租户发起的对等连接请求。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AcceptVpcPeeringRequest 请求对象
     * @return AcceptVpcPeeringResponse
     */
    public AcceptVpcPeeringResponse acceptVpcPeering(AcceptVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.acceptVpcPeering);
    }

    /**
     * 接受对等连接请求
     *
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户接受其他租户发起的对等连接请求。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AcceptVpcPeeringRequest 请求对象
     * @return SyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse>
     */
    public SyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> acceptVpcPeeringInvoker(
        AcceptVpcPeeringRequest request) {
        return new SyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse>(request, VpcMeta.acceptVpcPeering,
            hcClient);
    }

    /**
     * 子网关联路由表
     *
     * 路由表关联子网。子网关联路由表A后，再关联B，不需要先跟路由表A解关联再关联路由表B
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AssociateRouteTableRequest 请求对象
     * @return AssociateRouteTableResponse
     */
    public AssociateRouteTableResponse associateRouteTable(AssociateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.associateRouteTable);
    }

    /**
     * 子网关联路由表
     *
     * 路由表关联子网。子网关联路由表A后，再关联B，不需要先跟路由表A解关联再关联路由表B
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AssociateRouteTableRequest 请求对象
     * @return SyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse>
     */
    public SyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse> associateRouteTableInvoker(
        AssociateRouteTableRequest request) {
        return new SyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse>(request,
            VpcMeta.associateRouteTable, hcClient);
    }

    /**
     * 批量创建子网资源标签
     *
     * 为指定的子网资源实例批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateSubnetTagsRequest 请求对象
     * @return BatchCreateSubnetTagsResponse
     */
    public BatchCreateSubnetTagsResponse batchCreateSubnetTags(BatchCreateSubnetTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateSubnetTags);
    }

    /**
     * 批量创建子网资源标签
     *
     * 为指定的子网资源实例批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateSubnetTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse>
     */
    public SyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse> batchCreateSubnetTagsInvoker(
        BatchCreateSubnetTagsRequest request) {
        return new SyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse>(request,
            VpcMeta.batchCreateSubnetTags, hcClient);
    }

    /**
     * 批量删除子网资源标签
     *
     * 为指定的子网资源实例批量删除标签
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteSubnetTagsRequest 请求对象
     * @return BatchDeleteSubnetTagsResponse
     */
    public BatchDeleteSubnetTagsResponse batchDeleteSubnetTags(BatchDeleteSubnetTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchDeleteSubnetTags);
    }

    /**
     * 批量删除子网资源标签
     *
     * 为指定的子网资源实例批量删除标签
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteSubnetTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse>
     */
    public SyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse> batchDeleteSubnetTagsInvoker(
        BatchDeleteSubnetTagsRequest request) {
        return new SyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse>(request,
            VpcMeta.batchDeleteSubnetTags, hcClient);
    }

    /**
     * 创建端口
     *
     * 创建端口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePortRequest 请求对象
     * @return CreatePortResponse
     */
    public CreatePortResponse createPort(CreatePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createPort);
    }

    /**
     * 创建端口
     *
     * 创建端口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePortRequest 请求对象
     * @return SyncInvoker<CreatePortRequest, CreatePortResponse>
     */
    public SyncInvoker<CreatePortRequest, CreatePortResponse> createPortInvoker(CreatePortRequest request) {
        return new SyncInvoker<CreatePortRequest, CreatePortResponse>(request, VpcMeta.createPort, hcClient);
    }

    /**
     * 创建路由表
     *
     * 创建路由表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRouteTableRequest 请求对象
     * @return CreateRouteTableResponse
     */
    public CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createRouteTable);
    }

    /**
     * 创建路由表
     *
     * 创建路由表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRouteTableRequest 请求对象
     * @return SyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse>
     */
    public SyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse> createRouteTableInvoker(
        CreateRouteTableRequest request) {
        return new SyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse>(request, VpcMeta.createRouteTable,
            hcClient);
    }

    /**
     * 创建安全组
     *
     * 创建安全组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return CreateSecurityGroupResponse
     */
    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    /**
     * 创建安全组
     *
     * 创建安全组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>
     */
    public SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupInvoker(
        CreateSecurityGroupRequest request) {
        return new SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>(request,
            VpcMeta.createSecurityGroup, hcClient);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return CreateSecurityGroupRuleResponse
     */
    public CreateSecurityGroupRuleResponse createSecurityGroupRule(CreateSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>
     */
    public SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleInvoker(
        CreateSecurityGroupRuleRequest request) {
        return new SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>(request,
            VpcMeta.createSecurityGroupRule, hcClient);
    }

    /**
     * 创建子网
     *
     * 创建子网。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSubnetRequest 请求对象
     * @return CreateSubnetResponse
     */
    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSubnet);
    }

    /**
     * 创建子网
     *
     * 创建子网。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSubnetRequest 请求对象
     * @return SyncInvoker<CreateSubnetRequest, CreateSubnetResponse>
     */
    public SyncInvoker<CreateSubnetRequest, CreateSubnetResponse> createSubnetInvoker(CreateSubnetRequest request) {
        return new SyncInvoker<CreateSubnetRequest, CreateSubnetResponse>(request, VpcMeta.createSubnet, hcClient);
    }

    /**
     * 创建子网资源标签
     *
     * 给指定子网资源实例增加标签信息。
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSubnetTagRequest 请求对象
     * @return CreateSubnetTagResponse
     */
    public CreateSubnetTagResponse createSubnetTag(CreateSubnetTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSubnetTag);
    }

    /**
     * 创建子网资源标签
     *
     * 给指定子网资源实例增加标签信息。
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSubnetTagRequest 请求对象
     * @return SyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse>
     */
    public SyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse> createSubnetTagInvoker(
        CreateSubnetTagRequest request) {
        return new SyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse>(request, VpcMeta.createSubnetTag,
            hcClient);
    }

    /**
     * 创建对等连接
     *
     * 创建对等连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVpcPeeringRequest 请求对象
     * @return CreateVpcPeeringResponse
     */
    public CreateVpcPeeringResponse createVpcPeering(CreateVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpcPeering);
    }

    /**
     * 创建对等连接
     *
     * 创建对等连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVpcPeeringRequest 请求对象
     * @return SyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse>
     */
    public SyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse> createVpcPeeringInvoker(
        CreateVpcPeeringRequest request) {
        return new SyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse>(request, VpcMeta.createVpcPeering,
            hcClient);
    }

    /**
     * 删除端口
     *
     * 删除端口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePortRequest 请求对象
     * @return DeletePortResponse
     */
    public DeletePortResponse deletePort(DeletePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deletePort);
    }

    /**
     * 删除端口
     *
     * 删除端口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePortRequest 请求对象
     * @return SyncInvoker<DeletePortRequest, DeletePortResponse>
     */
    public SyncInvoker<DeletePortRequest, DeletePortResponse> deletePortInvoker(DeletePortRequest request) {
        return new SyncInvoker<DeletePortRequest, DeletePortResponse>(request, VpcMeta.deletePort, hcClient);
    }

    /**
     * 删除路由表
     *
     * 删除路由表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteRouteTableRequest 请求对象
     * @return DeleteRouteTableResponse
     */
    public DeleteRouteTableResponse deleteRouteTable(DeleteRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteRouteTable);
    }

    /**
     * 删除路由表
     *
     * 删除路由表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteRouteTableRequest 请求对象
     * @return SyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse>
     */
    public SyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse> deleteRouteTableInvoker(
        DeleteRouteTableRequest request) {
        return new SyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse>(request, VpcMeta.deleteRouteTable,
            hcClient);
    }

    /**
     * 删除安全组
     *
     * 删除安全组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return DeleteSecurityGroupResponse
     */
    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    /**
     * 删除安全组
     *
     * 删除安全组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>
     */
    public SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupInvoker(
        DeleteSecurityGroupRequest request) {
        return new SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>(request,
            VpcMeta.deleteSecurityGroup, hcClient);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return DeleteSecurityGroupRuleResponse
     */
    public DeleteSecurityGroupRuleResponse deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>
     */
    public SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleInvoker(
        DeleteSecurityGroupRuleRequest request) {
        return new SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>(request,
            VpcMeta.deleteSecurityGroupRule, hcClient);
    }

    /**
     * 删除子网
     *
     * 删除子网
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSubnetRequest 请求对象
     * @return DeleteSubnetResponse
     */
    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSubnet);
    }

    /**
     * 删除子网
     *
     * 删除子网
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSubnetRequest 请求对象
     * @return SyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>
     */
    public SyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnetInvoker(DeleteSubnetRequest request) {
        return new SyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>(request, VpcMeta.deleteSubnet, hcClient);
    }

    /**
     * 删除子网资源标签
     *
     * 删除指定子网资源实例的标签信息。
     * 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSubnetTagRequest 请求对象
     * @return DeleteSubnetTagResponse
     */
    public DeleteSubnetTagResponse deleteSubnetTag(DeleteSubnetTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSubnetTag);
    }

    /**
     * 删除子网资源标签
     *
     * 删除指定子网资源实例的标签信息。
     * 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSubnetTagRequest 请求对象
     * @return SyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse>
     */
    public SyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse> deleteSubnetTagInvoker(
        DeleteSubnetTagRequest request) {
        return new SyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse>(request, VpcMeta.deleteSubnetTag,
            hcClient);
    }

    /**
     * 删除对等连接
     *
     * 删除对等连接。
     * 可以在在本端或对端任何一端删除对等连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVpcPeeringRequest 请求对象
     * @return DeleteVpcPeeringResponse
     */
    public DeleteVpcPeeringResponse deleteVpcPeering(DeleteVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpcPeering);
    }

    /**
     * 删除对等连接
     *
     * 删除对等连接。
     * 可以在在本端或对端任何一端删除对等连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVpcPeeringRequest 请求对象
     * @return SyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse>
     */
    public SyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> deleteVpcPeeringInvoker(
        DeleteVpcPeeringRequest request) {
        return new SyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse>(request, VpcMeta.deleteVpcPeering,
            hcClient);
    }

    /**
     * 子网解关联路由表
     *
     * 子网解关联路由表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisassociateRouteTableRequest 请求对象
     * @return DisassociateRouteTableResponse
     */
    public DisassociateRouteTableResponse disassociateRouteTable(DisassociateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.disassociateRouteTable);
    }

    /**
     * 子网解关联路由表
     *
     * 子网解关联路由表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisassociateRouteTableRequest 请求对象
     * @return SyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse>
     */
    public SyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse> disassociateRouteTableInvoker(
        DisassociateRouteTableRequest request) {
        return new SyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse>(request,
            VpcMeta.disassociateRouteTable, hcClient);
    }

    /**
     * 查询端口列表
     *
     * 查询提交请求的租户的所有端口，单次查询最多返回2000条数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPortsRequest 请求对象
     * @return ListPortsResponse
     */
    public ListPortsResponse listPorts(ListPortsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listPorts);
    }

    /**
     * 查询端口列表
     *
     * 查询提交请求的租户的所有端口，单次查询最多返回2000条数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPortsRequest 请求对象
     * @return SyncInvoker<ListPortsRequest, ListPortsResponse>
     */
    public SyncInvoker<ListPortsRequest, ListPortsResponse> listPortsInvoker(ListPortsRequest request) {
        return new SyncInvoker<ListPortsRequest, ListPortsResponse>(request, VpcMeta.listPorts, hcClient);
    }

    /**
     * 查询路由表列表
     *
     * 查询提交请求的帐户的所有路由表列表，并根据过滤条件进行过滤
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRouteTablesRequest 请求对象
     * @return ListRouteTablesResponse
     */
    public ListRouteTablesResponse listRouteTables(ListRouteTablesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listRouteTables);
    }

    /**
     * 查询路由表列表
     *
     * 查询提交请求的帐户的所有路由表列表，并根据过滤条件进行过滤
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRouteTablesRequest 请求对象
     * @return SyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse>
     */
    public SyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse> listRouteTablesInvoker(
        ListRouteTablesRequest request) {
        return new SyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse>(request, VpcMeta.listRouteTables,
            hcClient);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询安全组规则列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return ListSecurityGroupRulesResponse
     */
    public ListSecurityGroupRulesResponse listSecurityGroupRules(ListSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询安全组规则列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>
     */
    public SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesInvoker(
        ListSecurityGroupRulesRequest request) {
        return new SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>(request,
            VpcMeta.listSecurityGroupRules, hcClient);
    }

    /**
     * 查询安全组列表
     *
     * 查询安全组列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return ListSecurityGroupsResponse
     */
    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    /**
     * 查询安全组列表
     *
     * 查询安全组列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsInvoker(
        ListSecurityGroupsRequest request) {
        return new SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>(request,
            VpcMeta.listSecurityGroups, hcClient);
    }

    /**
     * 查询子网项目标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSubnetTagsRequest 请求对象
     * @return ListSubnetTagsResponse
     */
    public ListSubnetTagsResponse listSubnetTags(ListSubnetTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubnetTags);
    }

    /**
     * 查询子网项目标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSubnetTagsRequest 请求对象
     * @return SyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse>
     */
    public SyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse> listSubnetTagsInvoker(
        ListSubnetTagsRequest request) {
        return new SyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse>(request, VpcMeta.listSubnetTags,
            hcClient);
    }

    /**
     * 查询子网列表
     *
     * 查询子网列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSubnetsRequest 请求对象
     * @return ListSubnetsResponse
     */
    public ListSubnetsResponse listSubnets(ListSubnetsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubnets);
    }

    /**
     * 查询子网列表
     *
     * 查询子网列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSubnetsRequest 请求对象
     * @return SyncInvoker<ListSubnetsRequest, ListSubnetsResponse>
     */
    public SyncInvoker<ListSubnetsRequest, ListSubnetsResponse> listSubnetsInvoker(ListSubnetsRequest request) {
        return new SyncInvoker<ListSubnetsRequest, ListSubnetsResponse>(request, VpcMeta.listSubnets, hcClient);
    }

    /**
     * 查询子网资源实例
     *
     * 使用标签过滤实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSubnetsByTagsRequest 请求对象
     * @return ListSubnetsByTagsResponse
     */
    public ListSubnetsByTagsResponse listSubnetsByTags(ListSubnetsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubnetsByTags);
    }

    /**
     * 查询子网资源实例
     *
     * 使用标签过滤实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSubnetsByTagsRequest 请求对象
     * @return SyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse>
     */
    public SyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse> listSubnetsByTagsInvoker(
        ListSubnetsByTagsRequest request) {
        return new SyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse>(request, VpcMeta.listSubnetsByTags,
            hcClient);
    }

    /**
     * 查询对等连接列表
     *
     * 查询提交请求的租户的所有对等连接。根据过滤条件进行过滤。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVpcPeeringsRequest 请求对象
     * @return ListVpcPeeringsResponse
     */
    public ListVpcPeeringsResponse listVpcPeerings(ListVpcPeeringsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcPeerings);
    }

    /**
     * 查询对等连接列表
     *
     * 查询提交请求的租户的所有对等连接。根据过滤条件进行过滤。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVpcPeeringsRequest 请求对象
     * @return SyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse>
     */
    public SyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse> listVpcPeeringsInvoker(
        ListVpcPeeringsRequest request) {
        return new SyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse>(request, VpcMeta.listVpcPeerings,
            hcClient);
    }

    /**
     * 拒绝对等连接请求
     *
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户拒绝其他租户发起的对等连接请求。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RejectVpcPeeringRequest 请求对象
     * @return RejectVpcPeeringResponse
     */
    public RejectVpcPeeringResponse rejectVpcPeering(RejectVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.rejectVpcPeering);
    }

    /**
     * 拒绝对等连接请求
     *
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户拒绝其他租户发起的对等连接请求。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RejectVpcPeeringRequest 请求对象
     * @return SyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse>
     */
    public SyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse> rejectVpcPeeringInvoker(
        RejectVpcPeeringRequest request) {
        return new SyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse>(request, VpcMeta.rejectVpcPeering,
            hcClient);
    }

    /**
     * 查询端口
     *
     * 查询单个端口详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPortRequest 请求对象
     * @return ShowPortResponse
     */
    public ShowPortResponse showPort(ShowPortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showPort);
    }

    /**
     * 查询端口
     *
     * 查询单个端口详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPortRequest 请求对象
     * @return SyncInvoker<ShowPortRequest, ShowPortResponse>
     */
    public SyncInvoker<ShowPortRequest, ShowPortResponse> showPortInvoker(ShowPortRequest request) {
        return new SyncInvoker<ShowPortRequest, ShowPortResponse>(request, VpcMeta.showPort, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在VPC服务下的网络资源配额，包括vpc配额、子网配额、安全组配额、安全组规则配额、弹性公网IP配额，vpn配额等。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return ShowQuotaResponse
     */
    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showQuota);
    }

    /**
     * 查询配额
     *
     * 查询单租户在VPC服务下的网络资源配额，包括vpc配额、子网配额、安全组配额、安全组规则配额、弹性公网IP配额，vpn配额等。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, VpcMeta.showQuota, hcClient);
    }

    /**
     * 查询路由表
     *
     * 查询路由表详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRouteTableRequest 请求对象
     * @return ShowRouteTableResponse
     */
    public ShowRouteTableResponse showRouteTable(ShowRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showRouteTable);
    }

    /**
     * 查询路由表
     *
     * 查询路由表详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRouteTableRequest 请求对象
     * @return SyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse>
     */
    public SyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse> showRouteTableInvoker(
        ShowRouteTableRequest request) {
        return new SyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse>(request, VpcMeta.showRouteTable,
            hcClient);
    }

    /**
     * 查询安全组
     *
     * 查询单个安全组详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return ShowSecurityGroupResponse
     */
    public ShowSecurityGroupResponse showSecurityGroup(ShowSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    /**
     * 查询安全组
     *
     * 查询单个安全组详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>
     */
    public SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupInvoker(
        ShowSecurityGroupRequest request) {
        return new SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>(request, VpcMeta.showSecurityGroup,
            hcClient);
    }

    /**
     * 查询安全组规则
     *
     * 查询单个安全组规则详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return ShowSecurityGroupRuleResponse
     */
    public ShowSecurityGroupRuleResponse showSecurityGroupRule(ShowSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    /**
     * 查询安全组规则
     *
     * 查询单个安全组规则详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>
     */
    public SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleInvoker(
        ShowSecurityGroupRuleRequest request) {
        return new SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>(request,
            VpcMeta.showSecurityGroupRule, hcClient);
    }

    /**
     * 查询子网
     *
     * 查询子网详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSubnetRequest 请求对象
     * @return ShowSubnetResponse
     */
    public ShowSubnetResponse showSubnet(ShowSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubnet);
    }

    /**
     * 查询子网
     *
     * 查询子网详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSubnetRequest 请求对象
     * @return SyncInvoker<ShowSubnetRequest, ShowSubnetResponse>
     */
    public SyncInvoker<ShowSubnetRequest, ShowSubnetResponse> showSubnetInvoker(ShowSubnetRequest request) {
        return new SyncInvoker<ShowSubnetRequest, ShowSubnetResponse>(request, VpcMeta.showSubnet, hcClient);
    }

    /**
     * 查询子网资源标签
     *
     * 查询指定子网实例的标签信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSubnetTagsRequest 请求对象
     * @return ShowSubnetTagsResponse
     */
    public ShowSubnetTagsResponse showSubnetTags(ShowSubnetTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubnetTags);
    }

    /**
     * 查询子网资源标签
     *
     * 查询指定子网实例的标签信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSubnetTagsRequest 请求对象
     * @return SyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse>
     */
    public SyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse> showSubnetTagsInvoker(
        ShowSubnetTagsRequest request) {
        return new SyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse>(request, VpcMeta.showSubnetTags,
            hcClient);
    }

    /**
     * 查询对等连接
     *
     * 查询对等连接详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVpcPeeringRequest 请求对象
     * @return ShowVpcPeeringResponse
     */
    public ShowVpcPeeringResponse showVpcPeering(ShowVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpcPeering);
    }

    /**
     * 查询对等连接
     *
     * 查询对等连接详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVpcPeeringRequest 请求对象
     * @return SyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse>
     */
    public SyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse> showVpcPeeringInvoker(
        ShowVpcPeeringRequest request) {
        return new SyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse>(request, VpcMeta.showVpcPeering,
            hcClient);
    }

    /**
     * 更新端口
     *
     * 更新端口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePortRequest 请求对象
     * @return UpdatePortResponse
     */
    public UpdatePortResponse updatePort(UpdatePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updatePort);
    }

    /**
     * 更新端口
     *
     * 更新端口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePortRequest 请求对象
     * @return SyncInvoker<UpdatePortRequest, UpdatePortResponse>
     */
    public SyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortInvoker(UpdatePortRequest request) {
        return new SyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, VpcMeta.updatePort, hcClient);
    }

    /**
     * 更新路由表
     *
     * 更新路由表，包括可以更新路由表的名称，描述，以及新增、更新、删除路由条目
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateRouteTableRequest 请求对象
     * @return UpdateRouteTableResponse
     */
    public UpdateRouteTableResponse updateRouteTable(UpdateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateRouteTable);
    }

    /**
     * 更新路由表
     *
     * 更新路由表，包括可以更新路由表的名称，描述，以及新增、更新、删除路由条目
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateRouteTableRequest 请求对象
     * @return SyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse>
     */
    public SyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse> updateRouteTableInvoker(
        UpdateRouteTableRequest request) {
        return new SyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse>(request, VpcMeta.updateRouteTable,
            hcClient);
    }

    /**
     * 更新子网
     *
     * 更新子网。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateSubnetRequest 请求对象
     * @return UpdateSubnetResponse
     */
    public UpdateSubnetResponse updateSubnet(UpdateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSubnet);
    }

    /**
     * 更新子网
     *
     * 更新子网。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateSubnetRequest 请求对象
     * @return SyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>
     */
    public SyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnetInvoker(UpdateSubnetRequest request) {
        return new SyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>(request, VpcMeta.updateSubnet, hcClient);
    }

    /**
     * 更新对等连接
     *
     * 更新对等连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVpcPeeringRequest 请求对象
     * @return UpdateVpcPeeringResponse
     */
    public UpdateVpcPeeringResponse updateVpcPeering(UpdateVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateVpcPeering);
    }

    /**
     * 更新对等连接
     *
     * 更新对等连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVpcPeeringRequest 请求对象
     * @return SyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse>
     */
    public SyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> updateVpcPeeringInvoker(
        UpdateVpcPeeringRequest request) {
        return new SyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse>(request, VpcMeta.updateVpcPeering,
            hcClient);
    }

    /**
     * 申请私有IP
     *
     * 申请私有IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePrivateipRequest 请求对象
     * @return CreatePrivateipResponse
     */
    public CreatePrivateipResponse createPrivateip(CreatePrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createPrivateip);
    }

    /**
     * 申请私有IP
     *
     * 申请私有IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePrivateipRequest 请求对象
     * @return SyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse>
     */
    public SyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse> createPrivateipInvoker(
        CreatePrivateipRequest request) {
        return new SyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse>(request, VpcMeta.createPrivateip,
            hcClient);
    }

    /**
     * 删除私有IP
     *
     * 删除私有IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePrivateipRequest 请求对象
     * @return DeletePrivateipResponse
     */
    public DeletePrivateipResponse deletePrivateip(DeletePrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deletePrivateip);
    }

    /**
     * 删除私有IP
     *
     * 删除私有IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePrivateipRequest 请求对象
     * @return SyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse>
     */
    public SyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse> deletePrivateipInvoker(
        DeletePrivateipRequest request) {
        return new SyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse>(request, VpcMeta.deletePrivateip,
            hcClient);
    }

    /**
     * 查询私有IP列表
     *
     * 查询指定子网下的私有IP列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPrivateipsRequest 请求对象
     * @return ListPrivateipsResponse
     */
    public ListPrivateipsResponse listPrivateips(ListPrivateipsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listPrivateips);
    }

    /**
     * 查询私有IP列表
     *
     * 查询指定子网下的私有IP列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPrivateipsRequest 请求对象
     * @return SyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse>
     */
    public SyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse> listPrivateipsInvoker(
        ListPrivateipsRequest request) {
        return new SyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse>(request, VpcMeta.listPrivateips,
            hcClient);
    }

    /**
     * 查询网络IP使用情况
     *
     * 显示一个指定网络中的IPv4地址使用情况。
     * 包括此网络中的IP总数以及已用IP总数，以及网络下每一个子网的IP地址总数和可用IP地址总数。
     * 
     * &gt; 须知
     * 
     * - 系统预留地址指的是子网的第1个以及最后4个地址，一般用于网关、DHCP等服务。
     * - 这里以及下文描述的IP地址总数、已用IP地址总数不包含系统预留地址。
     * - 在分配IP时，用户可以指定系统预留的IP地址。但是不论IP是如何分配的，只要是处于系统预留IP地址段的IP均不会被统计到已用IP地址数目和IP地址总数中。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowNetworkIpAvailabilitiesRequest 请求对象
     * @return ShowNetworkIpAvailabilitiesResponse
     */
    public ShowNetworkIpAvailabilitiesResponse showNetworkIpAvailabilities(ShowNetworkIpAvailabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showNetworkIpAvailabilities);
    }

    /**
     * 查询网络IP使用情况
     *
     * 显示一个指定网络中的IPv4地址使用情况。
     * 包括此网络中的IP总数以及已用IP总数，以及网络下每一个子网的IP地址总数和可用IP地址总数。
     * 
     * &gt; 须知
     * 
     * - 系统预留地址指的是子网的第1个以及最后4个地址，一般用于网关、DHCP等服务。
     * - 这里以及下文描述的IP地址总数、已用IP地址总数不包含系统预留地址。
     * - 在分配IP时，用户可以指定系统预留的IP地址。但是不论IP是如何分配的，只要是处于系统预留IP地址段的IP均不会被统计到已用IP地址数目和IP地址总数中。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowNetworkIpAvailabilitiesRequest 请求对象
     * @return SyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse>
     */
    public SyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> showNetworkIpAvailabilitiesInvoker(
        ShowNetworkIpAvailabilitiesRequest request) {
        return new SyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse>(request,
            VpcMeta.showNetworkIpAvailabilities, hcClient);
    }

    /**
     * 查询私有IP
     *
     * 指定ID查询私有IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPrivateipRequest 请求对象
     * @return ShowPrivateipResponse
     */
    public ShowPrivateipResponse showPrivateip(ShowPrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showPrivateip);
    }

    /**
     * 查询私有IP
     *
     * 指定ID查询私有IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPrivateipRequest 请求对象
     * @return SyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse>
     */
    public SyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse> showPrivateipInvoker(ShowPrivateipRequest request) {
        return new SyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse>(request, VpcMeta.showPrivateip, hcClient);
    }

    /**
     * 创建安全组
     *
     * 创建安全组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronCreateSecurityGroupRequest 请求对象
     * @return NeutronCreateSecurityGroupResponse
     */
    public NeutronCreateSecurityGroupResponse neutronCreateSecurityGroup(NeutronCreateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateSecurityGroup);
    }

    /**
     * 创建安全组
     *
     * 创建安全组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronCreateSecurityGroupRequest 请求对象
     * @return SyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse>
     */
    public SyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse> neutronCreateSecurityGroupInvoker(
        NeutronCreateSecurityGroupRequest request) {
        return new SyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse>(request,
            VpcMeta.neutronCreateSecurityGroup, hcClient);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronCreateSecurityGroupRuleRequest 请求对象
     * @return NeutronCreateSecurityGroupRuleResponse
     */
    public NeutronCreateSecurityGroupRuleResponse neutronCreateSecurityGroupRule(
        NeutronCreateSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateSecurityGroupRule);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronCreateSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse>
     */
    public SyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse> neutronCreateSecurityGroupRuleInvoker(
        NeutronCreateSecurityGroupRuleRequest request) {
        return new SyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse>(request,
            VpcMeta.neutronCreateSecurityGroupRule, hcClient);
    }

    /**
     * 删除安全组
     *
     * 删除安全组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronDeleteSecurityGroupRequest 请求对象
     * @return NeutronDeleteSecurityGroupResponse
     */
    public NeutronDeleteSecurityGroupResponse neutronDeleteSecurityGroup(NeutronDeleteSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteSecurityGroup);
    }

    /**
     * 删除安全组
     *
     * 删除安全组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronDeleteSecurityGroupRequest 请求对象
     * @return SyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse>
     */
    public SyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse> neutronDeleteSecurityGroupInvoker(
        NeutronDeleteSecurityGroupRequest request) {
        return new SyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse>(request,
            VpcMeta.neutronDeleteSecurityGroup, hcClient);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronDeleteSecurityGroupRuleRequest 请求对象
     * @return NeutronDeleteSecurityGroupRuleResponse
     */
    public NeutronDeleteSecurityGroupRuleResponse neutronDeleteSecurityGroupRule(
        NeutronDeleteSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteSecurityGroupRule);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronDeleteSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse>
     */
    public SyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse> neutronDeleteSecurityGroupRuleInvoker(
        NeutronDeleteSecurityGroupRuleRequest request) {
        return new SyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse>(request,
            VpcMeta.neutronDeleteSecurityGroupRule, hcClient);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询提交请求的租户有权限查看的所有安全组规则。单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronListSecurityGroupRulesRequest 请求对象
     * @return NeutronListSecurityGroupRulesResponse
     */
    public NeutronListSecurityGroupRulesResponse neutronListSecurityGroupRules(
        NeutronListSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListSecurityGroupRules);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询提交请求的租户有权限查看的所有安全组规则。单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronListSecurityGroupRulesRequest 请求对象
     * @return SyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse>
     */
    public SyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse> neutronListSecurityGroupRulesInvoker(
        NeutronListSecurityGroupRulesRequest request) {
        return new SyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse>(request,
            VpcMeta.neutronListSecurityGroupRules, hcClient);
    }

    /**
     * 查询安全组列表
     *
     * 查询提交请求租户的所有安全组，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询 。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronListSecurityGroupsRequest 请求对象
     * @return NeutronListSecurityGroupsResponse
     */
    public NeutronListSecurityGroupsResponse neutronListSecurityGroups(NeutronListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListSecurityGroups);
    }

    /**
     * 查询安全组列表
     *
     * 查询提交请求租户的所有安全组，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询 。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronListSecurityGroupsRequest 请求对象
     * @return SyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse>
     */
    public SyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse> neutronListSecurityGroupsInvoker(
        NeutronListSecurityGroupsRequest request) {
        return new SyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse>(request,
            VpcMeta.neutronListSecurityGroups, hcClient);
    }

    /**
     * 查询安全组
     *
     * 查询安全组详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronShowSecurityGroupRequest 请求对象
     * @return NeutronShowSecurityGroupResponse
     */
    public NeutronShowSecurityGroupResponse neutronShowSecurityGroup(NeutronShowSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowSecurityGroup);
    }

    /**
     * 查询安全组
     *
     * 查询安全组详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronShowSecurityGroupRequest 请求对象
     * @return SyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse>
     */
    public SyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse> neutronShowSecurityGroupInvoker(
        NeutronShowSecurityGroupRequest request) {
        return new SyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse>(request,
            VpcMeta.neutronShowSecurityGroup, hcClient);
    }

    /**
     * 查询安全组规则
     *
     * 查询安全组规则详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronShowSecurityGroupRuleRequest 请求对象
     * @return NeutronShowSecurityGroupRuleResponse
     */
    public NeutronShowSecurityGroupRuleResponse neutronShowSecurityGroupRule(
        NeutronShowSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowSecurityGroupRule);
    }

    /**
     * 查询安全组规则
     *
     * 查询安全组规则详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronShowSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse>
     */
    public SyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse> neutronShowSecurityGroupRuleInvoker(
        NeutronShowSecurityGroupRuleRequest request) {
        return new SyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse>(request,
            VpcMeta.neutronShowSecurityGroupRule, hcClient);
    }

    /**
     * 更新安全组
     *
     * 更新安全组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronUpdateSecurityGroupRequest 请求对象
     * @return NeutronUpdateSecurityGroupResponse
     */
    public NeutronUpdateSecurityGroupResponse neutronUpdateSecurityGroup(NeutronUpdateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateSecurityGroup);
    }

    /**
     * 更新安全组
     *
     * 更新安全组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronUpdateSecurityGroupRequest 请求对象
     * @return SyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse>
     */
    public SyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse> neutronUpdateSecurityGroupInvoker(
        NeutronUpdateSecurityGroupRequest request) {
        return new SyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse>(request,
            VpcMeta.neutronUpdateSecurityGroup, hcClient);
    }

    /**
     * 插入网络ACL规则
     *
     * 插入一条网络ACL规则到某一网络ACL策略中。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronAddFirewallRuleRequest 请求对象
     * @return NeutronAddFirewallRuleResponse
     */
    public NeutronAddFirewallRuleResponse neutronAddFirewallRule(NeutronAddFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronAddFirewallRule);
    }

    /**
     * 插入网络ACL规则
     *
     * 插入一条网络ACL规则到某一网络ACL策略中。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronAddFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse>
     */
    public SyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> neutronAddFirewallRuleInvoker(
        NeutronAddFirewallRuleRequest request) {
        return new SyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse>(request,
            VpcMeta.neutronAddFirewallRule, hcClient);
    }

    /**
     * 创建网络ACL组
     *
     * 创建网络ACL组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronCreateFirewallGroupRequest 请求对象
     * @return NeutronCreateFirewallGroupResponse
     */
    public NeutronCreateFirewallGroupResponse neutronCreateFirewallGroup(NeutronCreateFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateFirewallGroup);
    }

    /**
     * 创建网络ACL组
     *
     * 创建网络ACL组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronCreateFirewallGroupRequest 请求对象
     * @return SyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse>
     */
    public SyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> neutronCreateFirewallGroupInvoker(
        NeutronCreateFirewallGroupRequest request) {
        return new SyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse>(request,
            VpcMeta.neutronCreateFirewallGroup, hcClient);
    }

    /**
     * 创建网络ACL策略
     *
     * 创建网络ACL策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronCreateFirewallPolicyRequest 请求对象
     * @return NeutronCreateFirewallPolicyResponse
     */
    public NeutronCreateFirewallPolicyResponse neutronCreateFirewallPolicy(NeutronCreateFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateFirewallPolicy);
    }

    /**
     * 创建网络ACL策略
     *
     * 创建网络ACL策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronCreateFirewallPolicyRequest 请求对象
     * @return SyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse>
     */
    public SyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> neutronCreateFirewallPolicyInvoker(
        NeutronCreateFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse>(request,
            VpcMeta.neutronCreateFirewallPolicy, hcClient);
    }

    /**
     * 创建网络ACL规则
     *
     * 创建网络ACL规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronCreateFirewallRuleRequest 请求对象
     * @return NeutronCreateFirewallRuleResponse
     */
    public NeutronCreateFirewallRuleResponse neutronCreateFirewallRule(NeutronCreateFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateFirewallRule);
    }

    /**
     * 创建网络ACL规则
     *
     * 创建网络ACL规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronCreateFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse>
     */
    public SyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> neutronCreateFirewallRuleInvoker(
        NeutronCreateFirewallRuleRequest request) {
        return new SyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse>(request,
            VpcMeta.neutronCreateFirewallRule, hcClient);
    }

    /**
     * 删除网络ACL组
     *
     * 删除网络ACL组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronDeleteFirewallGroupRequest 请求对象
     * @return NeutronDeleteFirewallGroupResponse
     */
    public NeutronDeleteFirewallGroupResponse neutronDeleteFirewallGroup(NeutronDeleteFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteFirewallGroup);
    }

    /**
     * 删除网络ACL组
     *
     * 删除网络ACL组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronDeleteFirewallGroupRequest 请求对象
     * @return SyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse>
     */
    public SyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> neutronDeleteFirewallGroupInvoker(
        NeutronDeleteFirewallGroupRequest request) {
        return new SyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse>(request,
            VpcMeta.neutronDeleteFirewallGroup, hcClient);
    }

    /**
     * 删除网络ACL策略
     *
     * 删除网络ACL策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronDeleteFirewallPolicyRequest 请求对象
     * @return NeutronDeleteFirewallPolicyResponse
     */
    public NeutronDeleteFirewallPolicyResponse neutronDeleteFirewallPolicy(NeutronDeleteFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteFirewallPolicy);
    }

    /**
     * 删除网络ACL策略
     *
     * 删除网络ACL策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronDeleteFirewallPolicyRequest 请求对象
     * @return SyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse>
     */
    public SyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> neutronDeleteFirewallPolicyInvoker(
        NeutronDeleteFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse>(request,
            VpcMeta.neutronDeleteFirewallPolicy, hcClient);
    }

    /**
     * 删除网络ACL规则
     *
     * 删除网络ACL规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronDeleteFirewallRuleRequest 请求对象
     * @return NeutronDeleteFirewallRuleResponse
     */
    public NeutronDeleteFirewallRuleResponse neutronDeleteFirewallRule(NeutronDeleteFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteFirewallRule);
    }

    /**
     * 删除网络ACL规则
     *
     * 删除网络ACL规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronDeleteFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse>
     */
    public SyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> neutronDeleteFirewallRuleInvoker(
        NeutronDeleteFirewallRuleRequest request) {
        return new SyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse>(request,
            VpcMeta.neutronDeleteFirewallRule, hcClient);
    }

    /**
     * 查询所有网络ACL组
     *
     * 查询提交请求的租户有权限操作的所有网络ACL组信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronListFirewallGroupsRequest 请求对象
     * @return NeutronListFirewallGroupsResponse
     */
    public NeutronListFirewallGroupsResponse neutronListFirewallGroups(NeutronListFirewallGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListFirewallGroups);
    }

    /**
     * 查询所有网络ACL组
     *
     * 查询提交请求的租户有权限操作的所有网络ACL组信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronListFirewallGroupsRequest 请求对象
     * @return SyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse>
     */
    public SyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> neutronListFirewallGroupsInvoker(
        NeutronListFirewallGroupsRequest request) {
        return new SyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse>(request,
            VpcMeta.neutronListFirewallGroups, hcClient);
    }

    /**
     * 查询所有网络ACL策略
     *
     * 查询提交请求的租户有权限操作的所有网络ACL策略信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronListFirewallPoliciesRequest 请求对象
     * @return NeutronListFirewallPoliciesResponse
     */
    public NeutronListFirewallPoliciesResponse neutronListFirewallPolicies(NeutronListFirewallPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListFirewallPolicies);
    }

    /**
     * 查询所有网络ACL策略
     *
     * 查询提交请求的租户有权限操作的所有网络ACL策略信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronListFirewallPoliciesRequest 请求对象
     * @return SyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse>
     */
    public SyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> neutronListFirewallPoliciesInvoker(
        NeutronListFirewallPoliciesRequest request) {
        return new SyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse>(request,
            VpcMeta.neutronListFirewallPolicies, hcClient);
    }

    /**
     * 查询所有网络ACL规则
     *
     * 查询提交请求的租户有权限操作的所有网络ACL规则信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronListFirewallRulesRequest 请求对象
     * @return NeutronListFirewallRulesResponse
     */
    public NeutronListFirewallRulesResponse neutronListFirewallRules(NeutronListFirewallRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListFirewallRules);
    }

    /**
     * 查询所有网络ACL规则
     *
     * 查询提交请求的租户有权限操作的所有网络ACL规则信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronListFirewallRulesRequest 请求对象
     * @return SyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse>
     */
    public SyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> neutronListFirewallRulesInvoker(
        NeutronListFirewallRulesRequest request) {
        return new SyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse>(request,
            VpcMeta.neutronListFirewallRules, hcClient);
    }

    /**
     * 移除网络ACL规则
     *
     * 从某一网络ACL策略中移除一条网络ACL规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronRemoveFirewallRuleRequest 请求对象
     * @return NeutronRemoveFirewallRuleResponse
     */
    public NeutronRemoveFirewallRuleResponse neutronRemoveFirewallRule(NeutronRemoveFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronRemoveFirewallRule);
    }

    /**
     * 移除网络ACL规则
     *
     * 从某一网络ACL策略中移除一条网络ACL规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronRemoveFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse>
     */
    public SyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> neutronRemoveFirewallRuleInvoker(
        NeutronRemoveFirewallRuleRequest request) {
        return new SyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse>(request,
            VpcMeta.neutronRemoveFirewallRule, hcClient);
    }

    /**
     * 查询特定网络ACL组详情
     *
     * 查询特定网络ACL组详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronShowFirewallGroupRequest 请求对象
     * @return NeutronShowFirewallGroupResponse
     */
    public NeutronShowFirewallGroupResponse neutronShowFirewallGroup(NeutronShowFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowFirewallGroup);
    }

    /**
     * 查询特定网络ACL组详情
     *
     * 查询特定网络ACL组详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronShowFirewallGroupRequest 请求对象
     * @return SyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse>
     */
    public SyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> neutronShowFirewallGroupInvoker(
        NeutronShowFirewallGroupRequest request) {
        return new SyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse>(request,
            VpcMeta.neutronShowFirewallGroup, hcClient);
    }

    /**
     * 查询特定网络ACL策略详情
     *
     * 查询特定网络ACL策略详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronShowFirewallPolicyRequest 请求对象
     * @return NeutronShowFirewallPolicyResponse
     */
    public NeutronShowFirewallPolicyResponse neutronShowFirewallPolicy(NeutronShowFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowFirewallPolicy);
    }

    /**
     * 查询特定网络ACL策略详情
     *
     * 查询特定网络ACL策略详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronShowFirewallPolicyRequest 请求对象
     * @return SyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse>
     */
    public SyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> neutronShowFirewallPolicyInvoker(
        NeutronShowFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse>(request,
            VpcMeta.neutronShowFirewallPolicy, hcClient);
    }

    /**
     * 查询特定网络ACL规则
     *
     * 查询特定网络ACL规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronShowFirewallRuleRequest 请求对象
     * @return NeutronShowFirewallRuleResponse
     */
    public NeutronShowFirewallRuleResponse neutronShowFirewallRule(NeutronShowFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowFirewallRule);
    }

    /**
     * 查询特定网络ACL规则
     *
     * 查询特定网络ACL规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronShowFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse>
     */
    public SyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> neutronShowFirewallRuleInvoker(
        NeutronShowFirewallRuleRequest request) {
        return new SyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse>(request,
            VpcMeta.neutronShowFirewallRule, hcClient);
    }

    /**
     * 更新网络ACL组
     *
     * 更新网络ACL组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronUpdateFirewallGroupRequest 请求对象
     * @return NeutronUpdateFirewallGroupResponse
     */
    public NeutronUpdateFirewallGroupResponse neutronUpdateFirewallGroup(NeutronUpdateFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateFirewallGroup);
    }

    /**
     * 更新网络ACL组
     *
     * 更新网络ACL组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronUpdateFirewallGroupRequest 请求对象
     * @return SyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse>
     */
    public SyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> neutronUpdateFirewallGroupInvoker(
        NeutronUpdateFirewallGroupRequest request) {
        return new SyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse>(request,
            VpcMeta.neutronUpdateFirewallGroup, hcClient);
    }

    /**
     * 更新网络ACL策略
     *
     * 更新网络ACL策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronUpdateFirewallPolicyRequest 请求对象
     * @return NeutronUpdateFirewallPolicyResponse
     */
    public NeutronUpdateFirewallPolicyResponse neutronUpdateFirewallPolicy(NeutronUpdateFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateFirewallPolicy);
    }

    /**
     * 更新网络ACL策略
     *
     * 更新网络ACL策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronUpdateFirewallPolicyRequest 请求对象
     * @return SyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse>
     */
    public SyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> neutronUpdateFirewallPolicyInvoker(
        NeutronUpdateFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse>(request,
            VpcMeta.neutronUpdateFirewallPolicy, hcClient);
    }

    /**
     * 更新网络ACL规则
     *
     * 更新网络ACL规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronUpdateFirewallRuleRequest 请求对象
     * @return NeutronUpdateFirewallRuleResponse
     */
    public NeutronUpdateFirewallRuleResponse neutronUpdateFirewallRule(NeutronUpdateFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateFirewallRule);
    }

    /**
     * 更新网络ACL规则
     *
     * 更新网络ACL规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param NeutronUpdateFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse>
     */
    public SyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> neutronUpdateFirewallRuleInvoker(
        NeutronUpdateFirewallRuleRequest request) {
        return new SyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse>(request,
            VpcMeta.neutronUpdateFirewallRule, hcClient);
    }

    /**
     * 批量创建VPC资源标签
     *
     * 为指定的VPC资源实例批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateVpcTagsRequest 请求对象
     * @return BatchCreateVpcTagsResponse
     */
    public BatchCreateVpcTagsResponse batchCreateVpcTags(BatchCreateVpcTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateVpcTags);
    }

    /**
     * 批量创建VPC资源标签
     *
     * 为指定的VPC资源实例批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateVpcTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse>
     */
    public SyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse> batchCreateVpcTagsInvoker(
        BatchCreateVpcTagsRequest request) {
        return new SyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse>(request,
            VpcMeta.batchCreateVpcTags, hcClient);
    }

    /**
     * 批量删除VPC资源标签
     *
     * 为指定的VPC资源实例批量删除标签。
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteVpcTagsRequest 请求对象
     * @return BatchDeleteVpcTagsResponse
     */
    public BatchDeleteVpcTagsResponse batchDeleteVpcTags(BatchDeleteVpcTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchDeleteVpcTags);
    }

    /**
     * 批量删除VPC资源标签
     *
     * 为指定的VPC资源实例批量删除标签。
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteVpcTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse>
     */
    public SyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse> batchDeleteVpcTagsInvoker(
        BatchDeleteVpcTagsRequest request) {
        return new SyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse>(request,
            VpcMeta.batchDeleteVpcTags, hcClient);
    }

    /**
     * 创建VPC
     *
     * 创建虚拟私有云。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVpcRequest 请求对象
     * @return CreateVpcResponse
     */
    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpc);
    }

    /**
     * 创建VPC
     *
     * 创建虚拟私有云。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVpcRequest 请求对象
     * @return SyncInvoker<CreateVpcRequest, CreateVpcResponse>
     */
    public SyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcInvoker(CreateVpcRequest request) {
        return new SyncInvoker<CreateVpcRequest, CreateVpcResponse>(request, VpcMeta.createVpc, hcClient);
    }

    /**
     * 创建VPC资源标签
     *
     * 给指定VPC资源实例增加标签信息
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVpcResourceTagRequest 请求对象
     * @return CreateVpcResourceTagResponse
     */
    public CreateVpcResourceTagResponse createVpcResourceTag(CreateVpcResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpcResourceTag);
    }

    /**
     * 创建VPC资源标签
     *
     * 给指定VPC资源实例增加标签信息
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVpcResourceTagRequest 请求对象
     * @return SyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse>
     */
    public SyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse> createVpcResourceTagInvoker(
        CreateVpcResourceTagRequest request) {
        return new SyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse>(request,
            VpcMeta.createVpcResourceTag, hcClient);
    }

    /**
     * 创建VPC路由
     *
     * 创建路由
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVpcRouteRequest 请求对象
     * @return CreateVpcRouteResponse
     */
    public CreateVpcRouteResponse createVpcRoute(CreateVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpcRoute);
    }

    /**
     * 创建VPC路由
     *
     * 创建路由
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVpcRouteRequest 请求对象
     * @return SyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse>
     */
    public SyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse> createVpcRouteInvoker(
        CreateVpcRouteRequest request) {
        return new SyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse>(request, VpcMeta.createVpcRoute,
            hcClient);
    }

    /**
     * 删除VPC
     *
     * 删除虚拟私有云。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVpcRequest 请求对象
     * @return DeleteVpcResponse
     */
    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    /**
     * 删除VPC
     *
     * 删除虚拟私有云。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVpcRequest 请求对象
     * @return SyncInvoker<DeleteVpcRequest, DeleteVpcResponse>
     */
    public SyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcInvoker(DeleteVpcRequest request) {
        return new SyncInvoker<DeleteVpcRequest, DeleteVpcResponse>(request, VpcMeta.deleteVpc, hcClient);
    }

    /**
     * 删除VPC路由
     *
     * 删除路由
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVpcRouteRequest 请求对象
     * @return DeleteVpcRouteResponse
     */
    public DeleteVpcRouteResponse deleteVpcRoute(DeleteVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpcRoute);
    }

    /**
     * 删除VPC路由
     *
     * 删除路由
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVpcRouteRequest 请求对象
     * @return SyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse>
     */
    public SyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse> deleteVpcRouteInvoker(
        DeleteVpcRouteRequest request) {
        return new SyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse>(request, VpcMeta.deleteVpcRoute,
            hcClient);
    }

    /**
     * 删除VPC资源标签
     *
     * 删除指定VPC资源实例的标签信息
     * 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVpcTagRequest 请求对象
     * @return DeleteVpcTagResponse
     */
    public DeleteVpcTagResponse deleteVpcTag(DeleteVpcTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpcTag);
    }

    /**
     * 删除VPC资源标签
     *
     * 删除指定VPC资源实例的标签信息
     * 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVpcTagRequest 请求对象
     * @return SyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse>
     */
    public SyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse> deleteVpcTagInvoker(DeleteVpcTagRequest request) {
        return new SyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse>(request, VpcMeta.deleteVpcTag, hcClient);
    }

    /**
     * 查询VPC路由列表
     *
     * 查询提交请求的租户的所有路由列表，并根据过滤条件进行过滤。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVpcRoutesRequest 请求对象
     * @return ListVpcRoutesResponse
     */
    public ListVpcRoutesResponse listVpcRoutes(ListVpcRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcRoutes);
    }

    /**
     * 查询VPC路由列表
     *
     * 查询提交请求的租户的所有路由列表，并根据过滤条件进行过滤。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVpcRoutesRequest 请求对象
     * @return SyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse>
     */
    public SyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse> listVpcRoutesInvoker(ListVpcRoutesRequest request) {
        return new SyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse>(request, VpcMeta.listVpcRoutes, hcClient);
    }

    /**
     * 查询VPC项目标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVpcTagsRequest 请求对象
     * @return ListVpcTagsResponse
     */
    public ListVpcTagsResponse listVpcTags(ListVpcTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcTags);
    }

    /**
     * 查询VPC项目标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVpcTagsRequest 请求对象
     * @return SyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse>
     */
    public SyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse> listVpcTagsInvoker(ListVpcTagsRequest request) {
        return new SyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse>(request, VpcMeta.listVpcTags, hcClient);
    }

    /**
     * 查询VPC列表
     *
     * 查询虚拟私有云列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVpcsRequest 请求对象
     * @return ListVpcsResponse
     */
    public ListVpcsResponse listVpcs(ListVpcsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcs);
    }

    /**
     * 查询VPC列表
     *
     * 查询虚拟私有云列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVpcsRequest 请求对象
     * @return SyncInvoker<ListVpcsRequest, ListVpcsResponse>
     */
    public SyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsInvoker(ListVpcsRequest request) {
        return new SyncInvoker<ListVpcsRequest, ListVpcsResponse>(request, VpcMeta.listVpcs, hcClient);
    }

    /**
     * 查询VPC资源实例
     *
     * 使用标签过滤实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVpcsByTagsRequest 请求对象
     * @return ListVpcsByTagsResponse
     */
    public ListVpcsByTagsResponse listVpcsByTags(ListVpcsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcsByTags);
    }

    /**
     * 查询VPC资源实例
     *
     * 使用标签过滤实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVpcsByTagsRequest 请求对象
     * @return SyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse>
     */
    public SyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse> listVpcsByTagsInvoker(
        ListVpcsByTagsRequest request) {
        return new SyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse>(request, VpcMeta.listVpcsByTags,
            hcClient);
    }

    /**
     * 查询VPC
     *
     * 查询虚拟私有云。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVpcRequest 请求对象
     * @return ShowVpcResponse
     */
    public ShowVpcResponse showVpc(ShowVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpc);
    }

    /**
     * 查询VPC
     *
     * 查询虚拟私有云。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVpcRequest 请求对象
     * @return SyncInvoker<ShowVpcRequest, ShowVpcResponse>
     */
    public SyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcInvoker(ShowVpcRequest request) {
        return new SyncInvoker<ShowVpcRequest, ShowVpcResponse>(request, VpcMeta.showVpc, hcClient);
    }

    /**
     * 查询VPC路由
     *
     * 查询路由详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVpcRouteRequest 请求对象
     * @return ShowVpcRouteResponse
     */
    public ShowVpcRouteResponse showVpcRoute(ShowVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpcRoute);
    }

    /**
     * 查询VPC路由
     *
     * 查询路由详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVpcRouteRequest 请求对象
     * @return SyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse>
     */
    public SyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse> showVpcRouteInvoker(ShowVpcRouteRequest request) {
        return new SyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse>(request, VpcMeta.showVpcRoute, hcClient);
    }

    /**
     * 查询VPC资源标签
     *
     * 查询指定VPC实例的标签信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVpcTagsRequest 请求对象
     * @return ShowVpcTagsResponse
     */
    public ShowVpcTagsResponse showVpcTags(ShowVpcTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpcTags);
    }

    /**
     * 查询VPC资源标签
     *
     * 查询指定VPC实例的标签信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVpcTagsRequest 请求对象
     * @return SyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse>
     */
    public SyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse> showVpcTagsInvoker(ShowVpcTagsRequest request) {
        return new SyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse>(request, VpcMeta.showVpcTags, hcClient);
    }

    /**
     * 更新VPC
     *
     * 更新虚拟私有云。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVpcRequest 请求对象
     * @return UpdateVpcResponse
     */
    public UpdateVpcResponse updateVpc(UpdateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateVpc);
    }

    /**
     * 更新VPC
     *
     * 更新虚拟私有云。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVpcRequest 请求对象
     * @return SyncInvoker<UpdateVpcRequest, UpdateVpcResponse>
     */
    public SyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcInvoker(UpdateVpcRequest request) {
        return new SyncInvoker<UpdateVpcRequest, UpdateVpcResponse>(request, VpcMeta.updateVpc, hcClient);
    }

}
