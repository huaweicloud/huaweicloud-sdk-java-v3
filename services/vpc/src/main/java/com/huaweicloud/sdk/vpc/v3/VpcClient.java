package com.huaweicloud.sdk.vpc.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.vpc.v3.model.*;

public class VpcClient {
    protected HcClient hcClient;

    public VpcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcClient> newBuilder() {
        return new ClientBuilder<>(VpcClient::new);
    }


    /**
     * 批量创建辅助弹性网卡
     * 批量创建辅助弹性网卡
     *
     * @param BatchCreateSubNetworkInterfaceV3Request 请求对象
     * @return BatchCreateSubNetworkInterfaceV3Response
    */
    public BatchCreateSubNetworkInterfaceV3Response batchCreateSubNetworkInterfaceV3(BatchCreateSubNetworkInterfaceV3Request request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateSubNetworkInterfaceV3);
    }

    /**
     * 创建安全组
     * 创建安全组
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return CreateSecurityGroupResponse
    */
    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    /**
     * 创建安全组规则
     * 创建安全组规则
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return CreateSecurityGroupRuleResponse
    */
    public CreateSecurityGroupRuleResponse createSecurityGroupRule(CreateSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    /**
     * 创建辅助弹性网卡
     * 创建辅助弹性网卡
     *
     * @param CreateSubNetworkInterfaceRequest 请求对象
     * @return CreateSubNetworkInterfaceResponse
    */
    public CreateSubNetworkInterfaceResponse createSubNetworkInterface(CreateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSubNetworkInterface);
    }

    /**
     * 删除安全组
     * 删除安全组
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return DeleteSecurityGroupResponse
    */
    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    /**
     * 删除安全组规则
     * 删除安全组规则
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return DeleteSecurityGroupRuleResponse
    */
    public DeleteSecurityGroupRuleResponse deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    /**
     * 删除辅助弹性网卡
     * 删除辅助弹性网卡
     *
     * @param DeleteSubNetworkInterfaceRequest 请求对象
     * @return DeleteSubNetworkInterfaceResponse
    */
    public DeleteSubNetworkInterfaceResponse deleteSubNetworkInterface(DeleteSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSubNetworkInterface);
    }

    /**
     * 查询安全组规则列表
     * 查询安全组规则列表
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return ListSecurityGroupRulesResponse
    */
    public ListSecurityGroupRulesResponse listSecurityGroupRules(ListSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    /**
     * 查询安全组列表
     * 查询某租户下的安全组列表
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return ListSecurityGroupsResponse
    */
    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    /**
     * 查询租户下辅助弹性网卡列表
     * 查询辅助弹性网卡列表，单次查询最多返回2000条数据
     *
     * @param ListSubNetworkInterfacesRequest 请求对象
     * @return ListSubNetworkInterfacesResponse
    */
    public ListSubNetworkInterfacesResponse listSubNetworkInterfaces(ListSubNetworkInterfacesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubNetworkInterfaces);
    }

    /**
     * 查询安全组
     * 查询单个安全组详情
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return ShowSecurityGroupResponse
    */
    public ShowSecurityGroupResponse showSecurityGroup(ShowSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    /**
     * 查询安全组规则
     * 查询单个安全组规则
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return ShowSecurityGroupRuleResponse
    */
    public ShowSecurityGroupRuleResponse showSecurityGroupRule(ShowSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    /**
     * 查询租户下辅助弹性网卡
     * 查询辅助弹性网卡详情
     *
     * @param ShowSubNetworkInterfaceRequest 请求对象
     * @return ShowSubNetworkInterfaceResponse
    */
    public ShowSubNetworkInterfaceResponse showSubNetworkInterface(ShowSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubNetworkInterface);
    }

    /**
     * 查询租户下辅助弹性网卡数目
     * 查询辅助弹性网卡数目
     *
     * @param ShowSubNetworkInterfacesQuantityRequest 请求对象
     * @return ShowSubNetworkInterfacesQuantityResponse
    */
    public ShowSubNetworkInterfacesQuantityResponse showSubNetworkInterfacesQuantity(ShowSubNetworkInterfacesQuantityRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubNetworkInterfacesQuantity);
    }

    /**
     * 更新安全组
     * 更新安全组
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return UpdateSecurityGroupResponse
    */
    public UpdateSecurityGroupResponse updateSecurityGroup(UpdateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSecurityGroup);
    }

    /**
     * 更新辅助弹性网卡
     * 更新辅助弹性网卡
     *
     * @param UpdateSubNetworkInterfaceRequest 请求对象
     * @return UpdateSubNetworkInterfaceResponse
    */
    public UpdateSubNetworkInterfaceResponse updateSubNetworkInterface(UpdateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSubNetworkInterface);
    }

}