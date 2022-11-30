package com.huaweicloud.sdk.nat.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.nat.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class NatAsyncClient {

    protected HcClient hcClient;

    public NatAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<NatAsyncClient> newBuilder() {
        return new ClientBuilder<>(NatAsyncClient::new);
    }

    /**
     * 批量创建DNAT规则
     *
     * 批量创建DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateNatGatewayDnatRulesRequest 请求对象
     * @return CompletableFuture<BatchCreateNatGatewayDnatRulesResponse>
     */
    public CompletableFuture<BatchCreateNatGatewayDnatRulesResponse> batchCreateNatGatewayDnatRulesAsync(
        BatchCreateNatGatewayDnatRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.batchCreateNatGatewayDnatRules);
    }

    /**
     * 批量创建DNAT规则
     *
     * 批量创建DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateNatGatewayDnatRulesRequest 请求对象
     * @return AsyncInvoker<BatchCreateNatGatewayDnatRulesRequest, BatchCreateNatGatewayDnatRulesResponse>
     */
    public AsyncInvoker<BatchCreateNatGatewayDnatRulesRequest, BatchCreateNatGatewayDnatRulesResponse> batchCreateNatGatewayDnatRulesAsyncInvoker(
        BatchCreateNatGatewayDnatRulesRequest request) {
        return new AsyncInvoker<BatchCreateNatGatewayDnatRulesRequest, BatchCreateNatGatewayDnatRulesResponse>(request,
            NatMeta.batchCreateNatGatewayDnatRules, hcClient);
    }

    /**
     * 创建DNAT规则
     *
     * 创建DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNatGatewayDnatRuleRequest 请求对象
     * @return CompletableFuture<CreateNatGatewayDnatRuleResponse>
     */
    public CompletableFuture<CreateNatGatewayDnatRuleResponse> createNatGatewayDnatRuleAsync(
        CreateNatGatewayDnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.createNatGatewayDnatRule);
    }

    /**
     * 创建DNAT规则
     *
     * 创建DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNatGatewayDnatRuleRequest 请求对象
     * @return AsyncInvoker<CreateNatGatewayDnatRuleRequest, CreateNatGatewayDnatRuleResponse>
     */
    public AsyncInvoker<CreateNatGatewayDnatRuleRequest, CreateNatGatewayDnatRuleResponse> createNatGatewayDnatRuleAsyncInvoker(
        CreateNatGatewayDnatRuleRequest request) {
        return new AsyncInvoker<CreateNatGatewayDnatRuleRequest, CreateNatGatewayDnatRuleResponse>(request,
            NatMeta.createNatGatewayDnatRule, hcClient);
    }

    /**
     * 删除DNAT规则
     *
     * 删除指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNatGatewayDnatRuleRequest 请求对象
     * @return CompletableFuture<DeleteNatGatewayDnatRuleResponse>
     */
    public CompletableFuture<DeleteNatGatewayDnatRuleResponse> deleteNatGatewayDnatRuleAsync(
        DeleteNatGatewayDnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.deleteNatGatewayDnatRule);
    }

    /**
     * 删除DNAT规则
     *
     * 删除指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNatGatewayDnatRuleRequest 请求对象
     * @return AsyncInvoker<DeleteNatGatewayDnatRuleRequest, DeleteNatGatewayDnatRuleResponse>
     */
    public AsyncInvoker<DeleteNatGatewayDnatRuleRequest, DeleteNatGatewayDnatRuleResponse> deleteNatGatewayDnatRuleAsyncInvoker(
        DeleteNatGatewayDnatRuleRequest request) {
        return new AsyncInvoker<DeleteNatGatewayDnatRuleRequest, DeleteNatGatewayDnatRuleResponse>(request,
            NatMeta.deleteNatGatewayDnatRule, hcClient);
    }

    /**
     * 查询DNAT规则列表
     *
     * 查询DNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewayDnatRulesRequest 请求对象
     * @return CompletableFuture<ListNatGatewayDnatRulesResponse>
     */
    public CompletableFuture<ListNatGatewayDnatRulesResponse> listNatGatewayDnatRulesAsync(
        ListNatGatewayDnatRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listNatGatewayDnatRules);
    }

    /**
     * 查询DNAT规则列表
     *
     * 查询DNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewayDnatRulesRequest 请求对象
     * @return AsyncInvoker<ListNatGatewayDnatRulesRequest, ListNatGatewayDnatRulesResponse>
     */
    public AsyncInvoker<ListNatGatewayDnatRulesRequest, ListNatGatewayDnatRulesResponse> listNatGatewayDnatRulesAsyncInvoker(
        ListNatGatewayDnatRulesRequest request) {
        return new AsyncInvoker<ListNatGatewayDnatRulesRequest, ListNatGatewayDnatRulesResponse>(request,
            NatMeta.listNatGatewayDnatRules, hcClient);
    }

    /**
     * 查询指定的DNAT规则详情
     *
     * 查询指定的DNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNatGatewayDnatRuleRequest 请求对象
     * @return CompletableFuture<ShowNatGatewayDnatRuleResponse>
     */
    public CompletableFuture<ShowNatGatewayDnatRuleResponse> showNatGatewayDnatRuleAsync(
        ShowNatGatewayDnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.showNatGatewayDnatRule);
    }

    /**
     * 查询指定的DNAT规则详情
     *
     * 查询指定的DNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNatGatewayDnatRuleRequest 请求对象
     * @return AsyncInvoker<ShowNatGatewayDnatRuleRequest, ShowNatGatewayDnatRuleResponse>
     */
    public AsyncInvoker<ShowNatGatewayDnatRuleRequest, ShowNatGatewayDnatRuleResponse> showNatGatewayDnatRuleAsyncInvoker(
        ShowNatGatewayDnatRuleRequest request) {
        return new AsyncInvoker<ShowNatGatewayDnatRuleRequest, ShowNatGatewayDnatRuleResponse>(request,
            NatMeta.showNatGatewayDnatRule, hcClient);
    }

    /**
     * 更新DNAT规则
     *
     * 更新指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNatGatewayDnatRuleRequest 请求对象
     * @return CompletableFuture<UpdateNatGatewayDnatRuleResponse>
     */
    public CompletableFuture<UpdateNatGatewayDnatRuleResponse> updateNatGatewayDnatRuleAsync(
        UpdateNatGatewayDnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.updateNatGatewayDnatRule);
    }

    /**
     * 更新DNAT规则
     *
     * 更新指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNatGatewayDnatRuleRequest 请求对象
     * @return AsyncInvoker<UpdateNatGatewayDnatRuleRequest, UpdateNatGatewayDnatRuleResponse>
     */
    public AsyncInvoker<UpdateNatGatewayDnatRuleRequest, UpdateNatGatewayDnatRuleResponse> updateNatGatewayDnatRuleAsyncInvoker(
        UpdateNatGatewayDnatRuleRequest request) {
        return new AsyncInvoker<UpdateNatGatewayDnatRuleRequest, UpdateNatGatewayDnatRuleResponse>(request,
            NatMeta.updateNatGatewayDnatRule, hcClient);
    }

    /**
     * 创建公网NAT网关
     *
     * 创建公网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNatGatewayRequest 请求对象
     * @return CompletableFuture<CreateNatGatewayResponse>
     */
    public CompletableFuture<CreateNatGatewayResponse> createNatGatewayAsync(CreateNatGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.createNatGateway);
    }

    /**
     * 创建公网NAT网关
     *
     * 创建公网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNatGatewayRequest 请求对象
     * @return AsyncInvoker<CreateNatGatewayRequest, CreateNatGatewayResponse>
     */
    public AsyncInvoker<CreateNatGatewayRequest, CreateNatGatewayResponse> createNatGatewayAsyncInvoker(
        CreateNatGatewayRequest request) {
        return new AsyncInvoker<CreateNatGatewayRequest, CreateNatGatewayResponse>(request, NatMeta.createNatGateway,
            hcClient);
    }

    /**
     * 删除公网NAT网关
     *
     * 删除公网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNatGatewayRequest 请求对象
     * @return CompletableFuture<DeleteNatGatewayResponse>
     */
    public CompletableFuture<DeleteNatGatewayResponse> deleteNatGatewayAsync(DeleteNatGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.deleteNatGateway);
    }

    /**
     * 删除公网NAT网关
     *
     * 删除公网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNatGatewayRequest 请求对象
     * @return AsyncInvoker<DeleteNatGatewayRequest, DeleteNatGatewayResponse>
     */
    public AsyncInvoker<DeleteNatGatewayRequest, DeleteNatGatewayResponse> deleteNatGatewayAsyncInvoker(
        DeleteNatGatewayRequest request) {
        return new AsyncInvoker<DeleteNatGatewayRequest, DeleteNatGatewayResponse>(request, NatMeta.deleteNatGateway,
            hcClient);
    }

    /**
     * 查询公网NAT网关列表
     *
     * 查询公网NAT网关实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewaysRequest 请求对象
     * @return CompletableFuture<ListNatGatewaysResponse>
     */
    public CompletableFuture<ListNatGatewaysResponse> listNatGatewaysAsync(ListNatGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listNatGateways);
    }

    /**
     * 查询公网NAT网关列表
     *
     * 查询公网NAT网关实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewaysRequest 请求对象
     * @return AsyncInvoker<ListNatGatewaysRequest, ListNatGatewaysResponse>
     */
    public AsyncInvoker<ListNatGatewaysRequest, ListNatGatewaysResponse> listNatGatewaysAsyncInvoker(
        ListNatGatewaysRequest request) {
        return new AsyncInvoker<ListNatGatewaysRequest, ListNatGatewaysResponse>(request, NatMeta.listNatGateways,
            hcClient);
    }

    /**
     * 查询指定的公网NAT网关详情
     *
     * 查询指定的公网NAT网关实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNatGatewayRequest 请求对象
     * @return CompletableFuture<ShowNatGatewayResponse>
     */
    public CompletableFuture<ShowNatGatewayResponse> showNatGatewayAsync(ShowNatGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.showNatGateway);
    }

    /**
     * 查询指定的公网NAT网关详情
     *
     * 查询指定的公网NAT网关实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNatGatewayRequest 请求对象
     * @return AsyncInvoker<ShowNatGatewayRequest, ShowNatGatewayResponse>
     */
    public AsyncInvoker<ShowNatGatewayRequest, ShowNatGatewayResponse> showNatGatewayAsyncInvoker(
        ShowNatGatewayRequest request) {
        return new AsyncInvoker<ShowNatGatewayRequest, ShowNatGatewayResponse>(request, NatMeta.showNatGateway,
            hcClient);
    }

    /**
     * 更新公网NAT网关
     *
     * 更新公网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNatGatewayRequest 请求对象
     * @return CompletableFuture<UpdateNatGatewayResponse>
     */
    public CompletableFuture<UpdateNatGatewayResponse> updateNatGatewayAsync(UpdateNatGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.updateNatGateway);
    }

    /**
     * 更新公网NAT网关
     *
     * 更新公网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNatGatewayRequest 请求对象
     * @return AsyncInvoker<UpdateNatGatewayRequest, UpdateNatGatewayResponse>
     */
    public AsyncInvoker<UpdateNatGatewayRequest, UpdateNatGatewayResponse> updateNatGatewayAsyncInvoker(
        UpdateNatGatewayRequest request) {
        return new AsyncInvoker<UpdateNatGatewayRequest, UpdateNatGatewayResponse>(request, NatMeta.updateNatGateway,
            hcClient);
    }

    /**
     * 创建SNAT规则
     *
     * 创建SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNatGatewaySnatRuleRequest 请求对象
     * @return CompletableFuture<CreateNatGatewaySnatRuleResponse>
     */
    public CompletableFuture<CreateNatGatewaySnatRuleResponse> createNatGatewaySnatRuleAsync(
        CreateNatGatewaySnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.createNatGatewaySnatRule);
    }

    /**
     * 创建SNAT规则
     *
     * 创建SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNatGatewaySnatRuleRequest 请求对象
     * @return AsyncInvoker<CreateNatGatewaySnatRuleRequest, CreateNatGatewaySnatRuleResponse>
     */
    public AsyncInvoker<CreateNatGatewaySnatRuleRequest, CreateNatGatewaySnatRuleResponse> createNatGatewaySnatRuleAsyncInvoker(
        CreateNatGatewaySnatRuleRequest request) {
        return new AsyncInvoker<CreateNatGatewaySnatRuleRequest, CreateNatGatewaySnatRuleResponse>(request,
            NatMeta.createNatGatewaySnatRule, hcClient);
    }

    /**
     * 删除SNAT规则
     *
     * 删除指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNatGatewaySnatRuleRequest 请求对象
     * @return CompletableFuture<DeleteNatGatewaySnatRuleResponse>
     */
    public CompletableFuture<DeleteNatGatewaySnatRuleResponse> deleteNatGatewaySnatRuleAsync(
        DeleteNatGatewaySnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.deleteNatGatewaySnatRule);
    }

    /**
     * 删除SNAT规则
     *
     * 删除指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNatGatewaySnatRuleRequest 请求对象
     * @return AsyncInvoker<DeleteNatGatewaySnatRuleRequest, DeleteNatGatewaySnatRuleResponse>
     */
    public AsyncInvoker<DeleteNatGatewaySnatRuleRequest, DeleteNatGatewaySnatRuleResponse> deleteNatGatewaySnatRuleAsyncInvoker(
        DeleteNatGatewaySnatRuleRequest request) {
        return new AsyncInvoker<DeleteNatGatewaySnatRuleRequest, DeleteNatGatewaySnatRuleResponse>(request,
            NatMeta.deleteNatGatewaySnatRule, hcClient);
    }

    /**
     * 查询SNAT规则列表
     *
     * 查询SNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewaySnatRulesRequest 请求对象
     * @return CompletableFuture<ListNatGatewaySnatRulesResponse>
     */
    public CompletableFuture<ListNatGatewaySnatRulesResponse> listNatGatewaySnatRulesAsync(
        ListNatGatewaySnatRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listNatGatewaySnatRules);
    }

    /**
     * 查询SNAT规则列表
     *
     * 查询SNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewaySnatRulesRequest 请求对象
     * @return AsyncInvoker<ListNatGatewaySnatRulesRequest, ListNatGatewaySnatRulesResponse>
     */
    public AsyncInvoker<ListNatGatewaySnatRulesRequest, ListNatGatewaySnatRulesResponse> listNatGatewaySnatRulesAsyncInvoker(
        ListNatGatewaySnatRulesRequest request) {
        return new AsyncInvoker<ListNatGatewaySnatRulesRequest, ListNatGatewaySnatRulesResponse>(request,
            NatMeta.listNatGatewaySnatRules, hcClient);
    }

    /**
     * 查询指定的SNAT规则详情
     *
     * 查询指定的SNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNatGatewaySnatRuleRequest 请求对象
     * @return CompletableFuture<ShowNatGatewaySnatRuleResponse>
     */
    public CompletableFuture<ShowNatGatewaySnatRuleResponse> showNatGatewaySnatRuleAsync(
        ShowNatGatewaySnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.showNatGatewaySnatRule);
    }

    /**
     * 查询指定的SNAT规则详情
     *
     * 查询指定的SNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNatGatewaySnatRuleRequest 请求对象
     * @return AsyncInvoker<ShowNatGatewaySnatRuleRequest, ShowNatGatewaySnatRuleResponse>
     */
    public AsyncInvoker<ShowNatGatewaySnatRuleRequest, ShowNatGatewaySnatRuleResponse> showNatGatewaySnatRuleAsyncInvoker(
        ShowNatGatewaySnatRuleRequest request) {
        return new AsyncInvoker<ShowNatGatewaySnatRuleRequest, ShowNatGatewaySnatRuleResponse>(request,
            NatMeta.showNatGatewaySnatRule, hcClient);
    }

    /**
     * 更新SNAT规则
     *
     * 更新指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNatGatewaySnatRuleRequest 请求对象
     * @return CompletableFuture<UpdateNatGatewaySnatRuleResponse>
     */
    public CompletableFuture<UpdateNatGatewaySnatRuleResponse> updateNatGatewaySnatRuleAsync(
        UpdateNatGatewaySnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.updateNatGatewaySnatRule);
    }

    /**
     * 更新SNAT规则
     *
     * 更新指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNatGatewaySnatRuleRequest 请求对象
     * @return AsyncInvoker<UpdateNatGatewaySnatRuleRequest, UpdateNatGatewaySnatRuleResponse>
     */
    public AsyncInvoker<UpdateNatGatewaySnatRuleRequest, UpdateNatGatewaySnatRuleResponse> updateNatGatewaySnatRuleAsyncInvoker(
        UpdateNatGatewaySnatRuleRequest request) {
        return new AsyncInvoker<UpdateNatGatewaySnatRuleRequest, UpdateNatGatewaySnatRuleResponse>(request,
            NatMeta.updateNatGatewaySnatRule, hcClient);
    }

}
