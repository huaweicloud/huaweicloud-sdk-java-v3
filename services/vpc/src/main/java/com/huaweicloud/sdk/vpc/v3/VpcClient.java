package com.huaweicloud.sdk.vpc.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.vpc.v3.model.*;

public class VpcClient {

    protected HcClient hcClient;

    public VpcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcClient> newBuilder() {
        return new ClientBuilder<>(VpcClient::new);
    }

    /** 批量创建辅助弹性网卡 批量创建辅助弹性网卡
     *
     * @param BatchCreateSubNetworkInterfaceRequest 请求对象
     * @return BatchCreateSubNetworkInterfaceResponse */
    public BatchCreateSubNetworkInterfaceResponse batchCreateSubNetworkInterface(
        BatchCreateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateSubNetworkInterface);
    }

    /** 批量创建辅助弹性网卡 批量创建辅助弹性网卡
     *
     * @param BatchCreateSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> */
    public SyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> batchCreateSubNetworkInterfaceInvoker(
        BatchCreateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse>(request,
            VpcMeta.batchCreateSubNetworkInterface, hcClient);
    }

    /** 创建安全组 创建安全组
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return CreateSecurityGroupResponse */
    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    /** 创建安全组 创建安全组
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> */
    public SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupInvoker(
        CreateSecurityGroupRequest request) {
        return new SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>(request,
            VpcMeta.createSecurityGroup, hcClient);
    }

    /** 创建安全组规则 创建安全组规则
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return CreateSecurityGroupRuleResponse */
    public CreateSecurityGroupRuleResponse createSecurityGroupRule(CreateSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    /** 创建安全组规则 创建安全组规则
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> */
    public SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleInvoker(
        CreateSecurityGroupRuleRequest request) {
        return new SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>(request,
            VpcMeta.createSecurityGroupRule, hcClient);
    }

    /** 创建辅助弹性网卡 创建辅助弹性网卡
     *
     * @param CreateSubNetworkInterfaceRequest 请求对象
     * @return CreateSubNetworkInterfaceResponse */
    public CreateSubNetworkInterfaceResponse createSubNetworkInterface(CreateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSubNetworkInterface);
    }

    /** 创建辅助弹性网卡 创建辅助弹性网卡
     *
     * @param CreateSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> */
    public SyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> createSubNetworkInterfaceInvoker(
        CreateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse>(request,
            VpcMeta.createSubNetworkInterface, hcClient);
    }

    /** 删除安全组 删除安全组
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return DeleteSecurityGroupResponse */
    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    /** 删除安全组 删除安全组
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> */
    public SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupInvoker(
        DeleteSecurityGroupRequest request) {
        return new SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>(request,
            VpcMeta.deleteSecurityGroup, hcClient);
    }

    /** 删除安全组规则 删除安全组规则
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return DeleteSecurityGroupRuleResponse */
    public DeleteSecurityGroupRuleResponse deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    /** 删除安全组规则 删除安全组规则
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> */
    public SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleInvoker(
        DeleteSecurityGroupRuleRequest request) {
        return new SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>(request,
            VpcMeta.deleteSecurityGroupRule, hcClient);
    }

    /** 删除辅助弹性网卡 删除辅助弹性网卡
     *
     * @param DeleteSubNetworkInterfaceRequest 请求对象
     * @return DeleteSubNetworkInterfaceResponse */
    public DeleteSubNetworkInterfaceResponse deleteSubNetworkInterface(DeleteSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSubNetworkInterface);
    }

    /** 删除辅助弹性网卡 删除辅助弹性网卡
     *
     * @param DeleteSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> */
    public SyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterfaceInvoker(
        DeleteSubNetworkInterfaceRequest request) {
        return new SyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse>(request,
            VpcMeta.deleteSubNetworkInterface, hcClient);
    }

    /** 查询安全组规则列表 查询安全组规则列表
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return ListSecurityGroupRulesResponse */
    public ListSecurityGroupRulesResponse listSecurityGroupRules(ListSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    /** 查询安全组规则列表 查询安全组规则列表
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> */
    public SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesInvoker(
        ListSecurityGroupRulesRequest request) {
        return new SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>(request,
            VpcMeta.listSecurityGroupRules, hcClient);
    }

    /** 查询安全组列表 查询某租户下的安全组列表
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return ListSecurityGroupsResponse */
    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    /** 查询安全组列表 查询某租户下的安全组列表
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> */
    public SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsInvoker(
        ListSecurityGroupsRequest request) {
        return new SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>(request,
            VpcMeta.listSecurityGroups, hcClient);
    }

    /** 查询租户下辅助弹性网卡列表 查询辅助弹性网卡列表，单次查询最多返回2000条数据
     *
     * @param ListSubNetworkInterfacesRequest 请求对象
     * @return ListSubNetworkInterfacesResponse */
    public ListSubNetworkInterfacesResponse listSubNetworkInterfaces(ListSubNetworkInterfacesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubNetworkInterfaces);
    }

    /** 查询租户下辅助弹性网卡列表 查询辅助弹性网卡列表，单次查询最多返回2000条数据
     *
     * @param ListSubNetworkInterfacesRequest 请求对象
     * @return SyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> */
    public SyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> listSubNetworkInterfacesInvoker(
        ListSubNetworkInterfacesRequest request) {
        return new SyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse>(request,
            VpcMeta.listSubNetworkInterfaces, hcClient);
    }

    /** 查询安全组 查询单个安全组详情
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return ShowSecurityGroupResponse */
    public ShowSecurityGroupResponse showSecurityGroup(ShowSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    /** 查询安全组 查询单个安全组详情
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> */
    public SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupInvoker(
        ShowSecurityGroupRequest request) {
        return new SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>(request, VpcMeta.showSecurityGroup,
            hcClient);
    }

    /** 查询安全组规则 查询单个安全组规则
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return ShowSecurityGroupRuleResponse */
    public ShowSecurityGroupRuleResponse showSecurityGroupRule(ShowSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    /** 查询安全组规则 查询单个安全组规则
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> */
    public SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleInvoker(
        ShowSecurityGroupRuleRequest request) {
        return new SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>(request,
            VpcMeta.showSecurityGroupRule, hcClient);
    }

    /** 查询租户下辅助弹性网卡 查询辅助弹性网卡详情
     *
     * @param ShowSubNetworkInterfaceRequest 请求对象
     * @return ShowSubNetworkInterfaceResponse */
    public ShowSubNetworkInterfaceResponse showSubNetworkInterface(ShowSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubNetworkInterface);
    }

    /** 查询租户下辅助弹性网卡 查询辅助弹性网卡详情
     *
     * @param ShowSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> */
    public SyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> showSubNetworkInterfaceInvoker(
        ShowSubNetworkInterfaceRequest request) {
        return new SyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse>(request,
            VpcMeta.showSubNetworkInterface, hcClient);
    }

    /** 查询租户下辅助弹性网卡数目 查询辅助弹性网卡数目
     *
     * @param ShowSubNetworkInterfacesQuantityRequest 请求对象
     * @return ShowSubNetworkInterfacesQuantityResponse */
    public ShowSubNetworkInterfacesQuantityResponse showSubNetworkInterfacesQuantity(
        ShowSubNetworkInterfacesQuantityRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubNetworkInterfacesQuantity);
    }

    /** 查询租户下辅助弹性网卡数目 查询辅助弹性网卡数目
     *
     * @param ShowSubNetworkInterfacesQuantityRequest 请求对象
     * @return SyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> */
    public SyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantityInvoker(
        ShowSubNetworkInterfacesQuantityRequest request) {
        return new SyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse>(
            request, VpcMeta.showSubNetworkInterfacesQuantity, hcClient);
    }

    /** 更新安全组 更新安全组
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return UpdateSecurityGroupResponse */
    public UpdateSecurityGroupResponse updateSecurityGroup(UpdateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSecurityGroup);
    }

    /** 更新安全组 更新安全组
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> */
    public SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupInvoker(
        UpdateSecurityGroupRequest request) {
        return new SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>(request,
            VpcMeta.updateSecurityGroup, hcClient);
    }

    /** 更新辅助弹性网卡 更新辅助弹性网卡
     *
     * @param UpdateSubNetworkInterfaceRequest 请求对象
     * @return UpdateSubNetworkInterfaceResponse */
    public UpdateSubNetworkInterfaceResponse updateSubNetworkInterface(UpdateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSubNetworkInterface);
    }

    /** 更新辅助弹性网卡 更新辅助弹性网卡
     *
     * @param UpdateSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> */
    public SyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> updateSubNetworkInterfaceInvoker(
        UpdateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse>(request,
            VpcMeta.updateSubNetworkInterface, hcClient);
    }

}
