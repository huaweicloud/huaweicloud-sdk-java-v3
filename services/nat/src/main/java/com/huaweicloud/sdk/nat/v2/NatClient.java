package com.huaweicloud.sdk.nat.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
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
     * @param BatchCreateDnatRulesRequest 请求对象
     * @return BatchCreateDnatRulesResponse
     */
    public BatchCreateDnatRulesResponse batchCreateDnatRules(BatchCreateDnatRulesRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.batchCreateDnatRules);
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
     * 更新SNAT规则
     * 更新指定的SNAT规则。
     *
     * @param UpdateNatGatewaySnatRuleRequest 请求对象
     * @return UpdateNatGatewaySnatRuleResponse
     */
    public UpdateNatGatewaySnatRuleResponse updateNatGatewaySnatRule(UpdateNatGatewaySnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.updateNatGatewaySnatRule);
    }

}