package com.huaweicloud.sdk.nat.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.nat.v2.model.*;

public class NatClient {
    protected HcClient hcClient;

    public NatClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<NatClient> newBuilder() {
        return new ClientBuilder<>(NatClient::new);
    }


    /**
     * 批量创建DNAT规则
     * 批量创建DNAT规则。
     *
     * @param BatchCreateNatGatewayDnatRulesRequest 请求对象
     * @return BatchCreateNatGatewayDnatRulesResponse
     */
    public BatchCreateNatGatewayDnatRulesResponse batchCreateNatGatewayDnatRules(BatchCreateNatGatewayDnatRulesRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.batchCreateNatGatewayDnatRules);
    }

    /**
     * 批量创建DNAT规则
     * 批量创建DNAT规则。
     *
     * @param BatchCreateNatGatewayDnatRulesRequest 请求对象
     * @return SyncInvoker<BatchCreateNatGatewayDnatRulesRequest, BatchCreateNatGatewayDnatRulesResponse>
     */
    public SyncInvoker<BatchCreateNatGatewayDnatRulesRequest, BatchCreateNatGatewayDnatRulesResponse> batchCreateNatGatewayDnatRulesInvoker(BatchCreateNatGatewayDnatRulesRequest request) {
        return new SyncInvoker<BatchCreateNatGatewayDnatRulesRequest, BatchCreateNatGatewayDnatRulesResponse>(request, NatMeta.batchCreateNatGatewayDnatRules, hcClient);
    }

    /**
     * 创建DNAT规则
     * 创建DNAT规则。
     *
     * @param CreateNatGatewayDnatRuleRequest 请求对象
     * @return CreateNatGatewayDnatRuleResponse
     */
    public CreateNatGatewayDnatRuleResponse createNatGatewayDnatRule(CreateNatGatewayDnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.createNatGatewayDnatRule);
    }

    /**
     * 创建DNAT规则
     * 创建DNAT规则。
     *
     * @param CreateNatGatewayDnatRuleRequest 请求对象
     * @return SyncInvoker<CreateNatGatewayDnatRuleRequest, CreateNatGatewayDnatRuleResponse>
     */
    public SyncInvoker<CreateNatGatewayDnatRuleRequest, CreateNatGatewayDnatRuleResponse> createNatGatewayDnatRuleInvoker(CreateNatGatewayDnatRuleRequest request) {
        return new SyncInvoker<CreateNatGatewayDnatRuleRequest, CreateNatGatewayDnatRuleResponse>(request, NatMeta.createNatGatewayDnatRule, hcClient);
    }

    /**
     * 删除DNAT规则
     * 删除指定的DNAT规则。
     *
     * @param DeleteNatGatewayDnatRuleRequest 请求对象
     * @return DeleteNatGatewayDnatRuleResponse
     */
    public DeleteNatGatewayDnatRuleResponse deleteNatGatewayDnatRule(DeleteNatGatewayDnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.deleteNatGatewayDnatRule);
    }

    /**
     * 删除DNAT规则
     * 删除指定的DNAT规则。
     *
     * @param DeleteNatGatewayDnatRuleRequest 请求对象
     * @return SyncInvoker<DeleteNatGatewayDnatRuleRequest, DeleteNatGatewayDnatRuleResponse>
     */
    public SyncInvoker<DeleteNatGatewayDnatRuleRequest, DeleteNatGatewayDnatRuleResponse> deleteNatGatewayDnatRuleInvoker(DeleteNatGatewayDnatRuleRequest request) {
        return new SyncInvoker<DeleteNatGatewayDnatRuleRequest, DeleteNatGatewayDnatRuleResponse>(request, NatMeta.deleteNatGatewayDnatRule, hcClient);
    }

    /**
     * 查询DNAT规则列表
     * 查询DNAT规则列表。
     *
     * @param ListNatGatewayDnatRulesRequest 请求对象
     * @return ListNatGatewayDnatRulesResponse
     */
    public ListNatGatewayDnatRulesResponse listNatGatewayDnatRules(ListNatGatewayDnatRulesRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.listNatGatewayDnatRules);
    }

    /**
     * 查询DNAT规则列表
     * 查询DNAT规则列表。
     *
     * @param ListNatGatewayDnatRulesRequest 请求对象
     * @return SyncInvoker<ListNatGatewayDnatRulesRequest, ListNatGatewayDnatRulesResponse>
     */
    public SyncInvoker<ListNatGatewayDnatRulesRequest, ListNatGatewayDnatRulesResponse> listNatGatewayDnatRulesInvoker(ListNatGatewayDnatRulesRequest request) {
        return new SyncInvoker<ListNatGatewayDnatRulesRequest, ListNatGatewayDnatRulesResponse>(request, NatMeta.listNatGatewayDnatRules, hcClient);
    }

    /**
     * 查询指定的DNAT规则详情
     * 查询指定的DNAT规则详情。
     *
     * @param ShowNatGatewayDnatRuleRequest 请求对象
     * @return ShowNatGatewayDnatRuleResponse
     */
    public ShowNatGatewayDnatRuleResponse showNatGatewayDnatRule(ShowNatGatewayDnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.showNatGatewayDnatRule);
    }

    /**
     * 查询指定的DNAT规则详情
     * 查询指定的DNAT规则详情。
     *
     * @param ShowNatGatewayDnatRuleRequest 请求对象
     * @return SyncInvoker<ShowNatGatewayDnatRuleRequest, ShowNatGatewayDnatRuleResponse>
     */
    public SyncInvoker<ShowNatGatewayDnatRuleRequest, ShowNatGatewayDnatRuleResponse> showNatGatewayDnatRuleInvoker(ShowNatGatewayDnatRuleRequest request) {
        return new SyncInvoker<ShowNatGatewayDnatRuleRequest, ShowNatGatewayDnatRuleResponse>(request, NatMeta.showNatGatewayDnatRule, hcClient);
    }

    /**
     * 更新DNAT规则
     * 更新指定的DNAT规则。
     *
     * @param UpdateNatGatewayDnatRuleRequest 请求对象
     * @return UpdateNatGatewayDnatRuleResponse
     */
    public UpdateNatGatewayDnatRuleResponse updateNatGatewayDnatRule(UpdateNatGatewayDnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.updateNatGatewayDnatRule);
    }

    /**
     * 更新DNAT规则
     * 更新指定的DNAT规则。
     *
     * @param UpdateNatGatewayDnatRuleRequest 请求对象
     * @return SyncInvoker<UpdateNatGatewayDnatRuleRequest, UpdateNatGatewayDnatRuleResponse>
     */
    public SyncInvoker<UpdateNatGatewayDnatRuleRequest, UpdateNatGatewayDnatRuleResponse> updateNatGatewayDnatRuleInvoker(UpdateNatGatewayDnatRuleRequest request) {
        return new SyncInvoker<UpdateNatGatewayDnatRuleRequest, UpdateNatGatewayDnatRuleResponse>(request, NatMeta.updateNatGatewayDnatRule, hcClient);
    }

    /**
     * 创建公网NAT网关
     * 创建公网NAT网关实例。
     *
     * @param CreateNatGatewayRequest 请求对象
     * @return CreateNatGatewayResponse
     */
    public CreateNatGatewayResponse createNatGateway(CreateNatGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.createNatGateway);
    }

    /**
     * 创建公网NAT网关
     * 创建公网NAT网关实例。
     *
     * @param CreateNatGatewayRequest 请求对象
     * @return SyncInvoker<CreateNatGatewayRequest, CreateNatGatewayResponse>
     */
    public SyncInvoker<CreateNatGatewayRequest, CreateNatGatewayResponse> createNatGatewayInvoker(CreateNatGatewayRequest request) {
        return new SyncInvoker<CreateNatGatewayRequest, CreateNatGatewayResponse>(request, NatMeta.createNatGateway, hcClient);
    }

    /**
     * 删除公网NAT网关
     * 删除公网NAT网关实例。
     *
     * @param DeleteNatGatewayRequest 请求对象
     * @return DeleteNatGatewayResponse
     */
    public DeleteNatGatewayResponse deleteNatGateway(DeleteNatGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.deleteNatGateway);
    }

    /**
     * 删除公网NAT网关
     * 删除公网NAT网关实例。
     *
     * @param DeleteNatGatewayRequest 请求对象
     * @return SyncInvoker<DeleteNatGatewayRequest, DeleteNatGatewayResponse>
     */
    public SyncInvoker<DeleteNatGatewayRequest, DeleteNatGatewayResponse> deleteNatGatewayInvoker(DeleteNatGatewayRequest request) {
        return new SyncInvoker<DeleteNatGatewayRequest, DeleteNatGatewayResponse>(request, NatMeta.deleteNatGateway, hcClient);
    }

    /**
     * 查询公网NAT网关列表
     * 查询公网NAT网关实例列表。
     *
     * @param ListNatGatewaysRequest 请求对象
     * @return ListNatGatewaysResponse
     */
    public ListNatGatewaysResponse listNatGateways(ListNatGatewaysRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.listNatGateways);
    }

    /**
     * 查询公网NAT网关列表
     * 查询公网NAT网关实例列表。
     *
     * @param ListNatGatewaysRequest 请求对象
     * @return SyncInvoker<ListNatGatewaysRequest, ListNatGatewaysResponse>
     */
    public SyncInvoker<ListNatGatewaysRequest, ListNatGatewaysResponse> listNatGatewaysInvoker(ListNatGatewaysRequest request) {
        return new SyncInvoker<ListNatGatewaysRequest, ListNatGatewaysResponse>(request, NatMeta.listNatGateways, hcClient);
    }

    /**
     * 查询指定的公网NAT网关详情
     * 查询指定的公网NAT网关实例详情。
     *
     * @param ShowNatGatewayRequest 请求对象
     * @return ShowNatGatewayResponse
     */
    public ShowNatGatewayResponse showNatGateway(ShowNatGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.showNatGateway);
    }

    /**
     * 查询指定的公网NAT网关详情
     * 查询指定的公网NAT网关实例详情。
     *
     * @param ShowNatGatewayRequest 请求对象
     * @return SyncInvoker<ShowNatGatewayRequest, ShowNatGatewayResponse>
     */
    public SyncInvoker<ShowNatGatewayRequest, ShowNatGatewayResponse> showNatGatewayInvoker(ShowNatGatewayRequest request) {
        return new SyncInvoker<ShowNatGatewayRequest, ShowNatGatewayResponse>(request, NatMeta.showNatGateway, hcClient);
    }

    /**
     * 更新公网NAT网关
     * 更新公网NAT网关实例。
     *
     * @param UpdateNatGatewayRequest 请求对象
     * @return UpdateNatGatewayResponse
     */
    public UpdateNatGatewayResponse updateNatGateway(UpdateNatGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.updateNatGateway);
    }

    /**
     * 更新公网NAT网关
     * 更新公网NAT网关实例。
     *
     * @param UpdateNatGatewayRequest 请求对象
     * @return SyncInvoker<UpdateNatGatewayRequest, UpdateNatGatewayResponse>
     */
    public SyncInvoker<UpdateNatGatewayRequest, UpdateNatGatewayResponse> updateNatGatewayInvoker(UpdateNatGatewayRequest request) {
        return new SyncInvoker<UpdateNatGatewayRequest, UpdateNatGatewayResponse>(request, NatMeta.updateNatGateway, hcClient);
    }

    /**
     * 创建SNAT规则
     * 创建SNAT规则。
     *
     * @param CreateNatGatewaySnatRuleRequest 请求对象
     * @return CreateNatGatewaySnatRuleResponse
     */
    public CreateNatGatewaySnatRuleResponse createNatGatewaySnatRule(CreateNatGatewaySnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.createNatGatewaySnatRule);
    }

    /**
     * 创建SNAT规则
     * 创建SNAT规则。
     *
     * @param CreateNatGatewaySnatRuleRequest 请求对象
     * @return SyncInvoker<CreateNatGatewaySnatRuleRequest, CreateNatGatewaySnatRuleResponse>
     */
    public SyncInvoker<CreateNatGatewaySnatRuleRequest, CreateNatGatewaySnatRuleResponse> createNatGatewaySnatRuleInvoker(CreateNatGatewaySnatRuleRequest request) {
        return new SyncInvoker<CreateNatGatewaySnatRuleRequest, CreateNatGatewaySnatRuleResponse>(request, NatMeta.createNatGatewaySnatRule, hcClient);
    }

    /**
     * 删除SNAT规则
     * 删除指定的SNAT规则。
     *
     * @param DeleteNatGatewaySnatRuleRequest 请求对象
     * @return DeleteNatGatewaySnatRuleResponse
     */
    public DeleteNatGatewaySnatRuleResponse deleteNatGatewaySnatRule(DeleteNatGatewaySnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.deleteNatGatewaySnatRule);
    }

    /**
     * 删除SNAT规则
     * 删除指定的SNAT规则。
     *
     * @param DeleteNatGatewaySnatRuleRequest 请求对象
     * @return SyncInvoker<DeleteNatGatewaySnatRuleRequest, DeleteNatGatewaySnatRuleResponse>
     */
    public SyncInvoker<DeleteNatGatewaySnatRuleRequest, DeleteNatGatewaySnatRuleResponse> deleteNatGatewaySnatRuleInvoker(DeleteNatGatewaySnatRuleRequest request) {
        return new SyncInvoker<DeleteNatGatewaySnatRuleRequest, DeleteNatGatewaySnatRuleResponse>(request, NatMeta.deleteNatGatewaySnatRule, hcClient);
    }

    /**
     * 查询SNAT规则列表
     * 查询SNAT规则列表。
     *
     * @param ListNatGatewaySnatRulesRequest 请求对象
     * @return ListNatGatewaySnatRulesResponse
     */
    public ListNatGatewaySnatRulesResponse listNatGatewaySnatRules(ListNatGatewaySnatRulesRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.listNatGatewaySnatRules);
    }

    /**
     * 查询SNAT规则列表
     * 查询SNAT规则列表。
     *
     * @param ListNatGatewaySnatRulesRequest 请求对象
     * @return SyncInvoker<ListNatGatewaySnatRulesRequest, ListNatGatewaySnatRulesResponse>
     */
    public SyncInvoker<ListNatGatewaySnatRulesRequest, ListNatGatewaySnatRulesResponse> listNatGatewaySnatRulesInvoker(ListNatGatewaySnatRulesRequest request) {
        return new SyncInvoker<ListNatGatewaySnatRulesRequest, ListNatGatewaySnatRulesResponse>(request, NatMeta.listNatGatewaySnatRules, hcClient);
    }

    /**
     * 查询指定的SNAT规则详情
     * 查询指定的SNAT规则详情。
     *
     * @param ShowNatGatewaySnatRuleRequest 请求对象
     * @return ShowNatGatewaySnatRuleResponse
     */
    public ShowNatGatewaySnatRuleResponse showNatGatewaySnatRule(ShowNatGatewaySnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.showNatGatewaySnatRule);
    }

    /**
     * 查询指定的SNAT规则详情
     * 查询指定的SNAT规则详情。
     *
     * @param ShowNatGatewaySnatRuleRequest 请求对象
     * @return SyncInvoker<ShowNatGatewaySnatRuleRequest, ShowNatGatewaySnatRuleResponse>
     */
    public SyncInvoker<ShowNatGatewaySnatRuleRequest, ShowNatGatewaySnatRuleResponse> showNatGatewaySnatRuleInvoker(ShowNatGatewaySnatRuleRequest request) {
        return new SyncInvoker<ShowNatGatewaySnatRuleRequest, ShowNatGatewaySnatRuleResponse>(request, NatMeta.showNatGatewaySnatRule, hcClient);
    }

    /**
     * 更新SNAT规则
     * 更新指定的SNAT规则。
     *
     * @param UpdateNatGatewaySnatRuleRequest 请求对象
     * @return UpdateNatGatewaySnatRuleResponse
     */
    public UpdateNatGatewaySnatRuleResponse updateNatGatewaySnatRule(UpdateNatGatewaySnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.updateNatGatewaySnatRule);
    }

    /**
     * 更新SNAT规则
     * 更新指定的SNAT规则。
     *
     * @param UpdateNatGatewaySnatRuleRequest 请求对象
     * @return SyncInvoker<UpdateNatGatewaySnatRuleRequest, UpdateNatGatewaySnatRuleResponse>
     */
    public SyncInvoker<UpdateNatGatewaySnatRuleRequest, UpdateNatGatewaySnatRuleResponse> updateNatGatewaySnatRuleInvoker(UpdateNatGatewaySnatRuleRequest request) {
        return new SyncInvoker<UpdateNatGatewaySnatRuleRequest, UpdateNatGatewaySnatRuleResponse>(request, NatMeta.updateNatGatewaySnatRule, hcClient);
    }

}