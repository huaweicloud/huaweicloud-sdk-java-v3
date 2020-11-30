package com.huaweicloud.sdk.nat.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.nat.v2.model.*;

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
     * 批量创建DNAT规则。
     *
     * @param BatchCreateNatGatewayDnatRulesRequest 请求对象
     * @return CompletableFuture<BatchCreateNatGatewayDnatRulesResponse>
     */
    public CompletableFuture<BatchCreateNatGatewayDnatRulesResponse> batchCreateNatGatewayDnatRulesAsync(BatchCreateNatGatewayDnatRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.batchCreateNatGatewayDnatRules);
    }

    /**
     * 创建DNAT规则
     * 创建DNAT规则。
     *
     * @param CreateNatGatewayDnatRuleRequest 请求对象
     * @return CompletableFuture<CreateNatGatewayDnatRuleResponse>
     */
    public CompletableFuture<CreateNatGatewayDnatRuleResponse> createNatGatewayDnatRuleAsync(CreateNatGatewayDnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.createNatGatewayDnatRule);
    }

    /**
     * 删除DNAT规则
     * 删除指定的DNAT规则。
     *
     * @param DeleteNatGatewayDnatRuleRequest 请求对象
     * @return CompletableFuture<DeleteNatGatewayDnatRuleResponse>
     */
    public CompletableFuture<DeleteNatGatewayDnatRuleResponse> deleteNatGatewayDnatRuleAsync(DeleteNatGatewayDnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.deleteNatGatewayDnatRule);
    }

    /**
     * 查询DNAT规则列表
     * 查询DNAT规则列表。
     *
     * @param ListNatGatewayDnatRulesRequest 请求对象
     * @return CompletableFuture<ListNatGatewayDnatRulesResponse>
     */
    public CompletableFuture<ListNatGatewayDnatRulesResponse> listNatGatewayDnatRulesAsync(ListNatGatewayDnatRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listNatGatewayDnatRules);
    }

    /**
     * 查询指定的DNAT规则详情
     * 查询指定的DNAT规则详情。
     *
     * @param ShowNatGatewayDnatRuleRequest 请求对象
     * @return CompletableFuture<ShowNatGatewayDnatRuleResponse>
     */
    public CompletableFuture<ShowNatGatewayDnatRuleResponse> showNatGatewayDnatRuleAsync(ShowNatGatewayDnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.showNatGatewayDnatRule);
    }

    /**
     * 更新DNAT规则
     * 更新指定的DNAT规则。
     *
     * @param UpdateNatGatewayDnatRuleRequest 请求对象
     * @return CompletableFuture<UpdateNatGatewayDnatRuleResponse>
     */
    public CompletableFuture<UpdateNatGatewayDnatRuleResponse> updateNatGatewayDnatRuleAsync(UpdateNatGatewayDnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.updateNatGatewayDnatRule);
    }

    /**
     * 创建公网NAT网关
     * 创建公网NAT网关实例。
     *
     * @param CreateNatGatewayRequest 请求对象
     * @return CompletableFuture<CreateNatGatewayResponse>
     */
    public CompletableFuture<CreateNatGatewayResponse> createNatGatewayAsync(CreateNatGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.createNatGateway);
    }

    /**
     * 删除公网NAT网关
     * 删除公网NAT网关实例。
     *
     * @param DeleteNatGatewayRequest 请求对象
     * @return CompletableFuture<DeleteNatGatewayResponse>
     */
    public CompletableFuture<DeleteNatGatewayResponse> deleteNatGatewayAsync(DeleteNatGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.deleteNatGateway);
    }

    /**
     * 查询公网NAT网关列表
     * 查询公网NAT网关实例列表。
     *
     * @param ListNatGatewaysRequest 请求对象
     * @return CompletableFuture<ListNatGatewaysResponse>
     */
    public CompletableFuture<ListNatGatewaysResponse> listNatGatewaysAsync(ListNatGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listNatGateways);
    }

    /**
     * 查询指定的公网NAT网关详情
     * 查询指定的公网NAT网关实例详情。
     *
     * @param ShowNatGatewayRequest 请求对象
     * @return CompletableFuture<ShowNatGatewayResponse>
     */
    public CompletableFuture<ShowNatGatewayResponse> showNatGatewayAsync(ShowNatGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.showNatGateway);
    }

    /**
     * 更新公网NAT网关
     * 更新公网NAT网关实例。
     *
     * @param UpdateNatGatewayRequest 请求对象
     * @return CompletableFuture<UpdateNatGatewayResponse>
     */
    public CompletableFuture<UpdateNatGatewayResponse> updateNatGatewayAsync(UpdateNatGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.updateNatGateway);
    }

    /**
     * 创建SNAT规则
     * 创建SNAT规则。
     *
     * @param CreateNatGatewaySnatRuleRequest 请求对象
     * @return CompletableFuture<CreateNatGatewaySnatRuleResponse>
     */
    public CompletableFuture<CreateNatGatewaySnatRuleResponse> createNatGatewaySnatRuleAsync(CreateNatGatewaySnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.createNatGatewaySnatRule);
    }

    /**
     * 删除SNAT规则
     * 删除指定的SNAT规则。
     *
     * @param DeleteNatGatewaySnatRuleRequest 请求对象
     * @return CompletableFuture<DeleteNatGatewaySnatRuleResponse>
     */
    public CompletableFuture<DeleteNatGatewaySnatRuleResponse> deleteNatGatewaySnatRuleAsync(DeleteNatGatewaySnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.deleteNatGatewaySnatRule);
    }

    /**
     * 查询SNAT规则列表
     * 查询SNAT规则列表。
     *
     * @param ListNatGatewaySnatRulesRequest 请求对象
     * @return CompletableFuture<ListNatGatewaySnatRulesResponse>
     */
    public CompletableFuture<ListNatGatewaySnatRulesResponse> listNatGatewaySnatRulesAsync(ListNatGatewaySnatRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listNatGatewaySnatRules);
    }

    /**
     * 查询指定的SNAT规则详情
     * 查询指定的SNAT规则详情。
     *
     * @param ShowNatGatewaySnatRuleRequest 请求对象
     * @return CompletableFuture<ShowNatGatewaySnatRuleResponse>
     */
    public CompletableFuture<ShowNatGatewaySnatRuleResponse> showNatGatewaySnatRuleAsync(ShowNatGatewaySnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.showNatGatewaySnatRule);
    }

    /**
     * 更新SNAT规则
     * 更新指定的SNAT规则。
     *
     * @param UpdateNatGatewaySnatRuleRequest 请求对象
     * @return CompletableFuture<UpdateNatGatewaySnatRuleResponse>
     */
    public CompletableFuture<UpdateNatGatewaySnatRuleResponse> updateNatGatewaySnatRuleAsync(UpdateNatGatewaySnatRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.updateNatGatewaySnatRule);
    }

}