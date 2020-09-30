package com.huaweicloud.sdk.vpc.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.vpc.v3.model.*;

public class VpcAsyncClient {
    protected HcClient hcClient;

    public VpcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcAsyncClient> newBuilder() {
        return new ClientBuilder<>(VpcAsyncClient::new);
    }


    /**
     * 批量创建辅助弹性网卡
     * 批量创建辅助弹性网卡
     *
     * @param BatchCreateSubNetworkInterfaceV3Request 请求对象
     * @return CompletableFuture<BatchCreateSubNetworkInterfaceV3Response>
     */
    public CompletableFuture<BatchCreateSubNetworkInterfaceV3Response> batchCreateSubNetworkInterfaceV3Async(BatchCreateSubNetworkInterfaceV3Request request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateSubNetworkInterfaceV3);
    }

    /**
     * 创建安全组
     * 创建安全组
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupResponse>
     */
    public CompletableFuture<CreateSecurityGroupResponse> createSecurityGroupAsync(CreateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    /**
     * 创建安全组规则
     * 创建安全组规则
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupRuleResponse>
     */
    public CompletableFuture<CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsync(CreateSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    /**
     * 创建辅助弹性网卡
     * 创建辅助弹性网卡
     *
     * @param CreateSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<CreateSubNetworkInterfaceResponse>
     */
    public CompletableFuture<CreateSubNetworkInterfaceResponse> createSubNetworkInterfaceAsync(CreateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSubNetworkInterface);
    }

    /**
     * 删除安全组
     * 删除安全组
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupResponse>
     */
    public CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroupAsync(DeleteSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    /**
     * 删除安全组规则
     * 删除安全组规则
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupRuleResponse>
     */
    public CompletableFuture<DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsync(DeleteSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    /**
     * 删除辅助弹性网卡
     * 删除辅助弹性网卡
     *
     * @param DeleteSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<DeleteSubNetworkInterfaceResponse>
     */
    public CompletableFuture<DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterfaceAsync(DeleteSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSubNetworkInterface);
    }

    /**
     * 查询安全组规则列表
     * 查询安全组规则列表
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupRulesResponse>
     */
    public CompletableFuture<ListSecurityGroupRulesResponse> listSecurityGroupRulesAsync(ListSecurityGroupRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    /**
     * 查询安全组列表
     * 查询某租户下的安全组列表
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupsResponse>
     */
    public CompletableFuture<ListSecurityGroupsResponse> listSecurityGroupsAsync(ListSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    /**
     * 查询租户下辅助弹性网卡列表
     * 查询辅助弹性网卡列表，单次查询最多返回2000条数据
     *
     * @param ListSubNetworkInterfacesRequest 请求对象
     * @return CompletableFuture<ListSubNetworkInterfacesResponse>
     */
    public CompletableFuture<ListSubNetworkInterfacesResponse> listSubNetworkInterfacesAsync(ListSubNetworkInterfacesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubNetworkInterfaces);
    }

    /**
     * 查询安全组
     * 查询单个安全组详情
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupResponse>
     */
    public CompletableFuture<ShowSecurityGroupResponse> showSecurityGroupAsync(ShowSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    /**
     * 查询安全组规则
     * 查询单个安全组规则
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupRuleResponse>
     */
    public CompletableFuture<ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsync(ShowSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    /**
     * 查询租户下辅助弹性网卡
     * 查询辅助弹性网卡详情
     *
     * @param ShowSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<ShowSubNetworkInterfaceResponse>
     */
    public CompletableFuture<ShowSubNetworkInterfaceResponse> showSubNetworkInterfaceAsync(ShowSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubNetworkInterface);
    }

    /**
     * 查询租户下辅助弹性网卡数目
     * 查询辅助弹性网卡数目
     *
     * @param ShowSubNetworkInterfacesQuantityRequest 请求对象
     * @return CompletableFuture<ShowSubNetworkInterfacesQuantityResponse>
     */
    public CompletableFuture<ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantityAsync(ShowSubNetworkInterfacesQuantityRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubNetworkInterfacesQuantity);
    }

    /**
     * 更新安全组
     * 更新安全组
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateSecurityGroupResponse>
     */
    public CompletableFuture<UpdateSecurityGroupResponse> updateSecurityGroupAsync(UpdateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateSecurityGroup);
    }

    /**
     * 更新辅助弹性网卡
     * 更新辅助弹性网卡
     *
     * @param UpdateSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<UpdateSubNetworkInterfaceResponse>
     */
    public CompletableFuture<UpdateSubNetworkInterfaceResponse> updateSubNetworkInterfaceAsync(UpdateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateSubNetworkInterface);
    }

}