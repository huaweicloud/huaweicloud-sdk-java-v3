package com.huaweicloud.sdk.nat.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
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
     *
     * 批量创建DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateNatGatewayDnatRulesRequest 请求对象
     * @return BatchCreateNatGatewayDnatRulesResponse
     */
    public BatchCreateNatGatewayDnatRulesResponse batchCreateNatGatewayDnatRules(
        BatchCreateNatGatewayDnatRulesRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.batchCreateNatGatewayDnatRules);
    }

    /**
     * 批量创建DNAT规则
     *
     * 批量创建DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateNatGatewayDnatRulesRequest 请求对象
     * @return SyncInvoker<BatchCreateNatGatewayDnatRulesRequest, BatchCreateNatGatewayDnatRulesResponse>
     */
    public SyncInvoker<BatchCreateNatGatewayDnatRulesRequest, BatchCreateNatGatewayDnatRulesResponse> batchCreateNatGatewayDnatRulesInvoker(
        BatchCreateNatGatewayDnatRulesRequest request) {
        return new SyncInvoker<BatchCreateNatGatewayDnatRulesRequest, BatchCreateNatGatewayDnatRulesResponse>(request,
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
     * @return CreateNatGatewayDnatRuleResponse
     */
    public CreateNatGatewayDnatRuleResponse createNatGatewayDnatRule(CreateNatGatewayDnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.createNatGatewayDnatRule);
    }

    /**
     * 创建DNAT规则
     *
     * 创建DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNatGatewayDnatRuleRequest 请求对象
     * @return SyncInvoker<CreateNatGatewayDnatRuleRequest, CreateNatGatewayDnatRuleResponse>
     */
    public SyncInvoker<CreateNatGatewayDnatRuleRequest, CreateNatGatewayDnatRuleResponse> createNatGatewayDnatRuleInvoker(
        CreateNatGatewayDnatRuleRequest request) {
        return new SyncInvoker<CreateNatGatewayDnatRuleRequest, CreateNatGatewayDnatRuleResponse>(request,
            NatMeta.createNatGatewayDnatRule, hcClient);
    }

    /**
     * 创建DNAT规则
     *
     * 创建DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateDnatRequest 请求对象
     * @return CreatePrivateDnatResponse
     */
    public CreatePrivateDnatResponse createPrivateDnat(CreatePrivateDnatRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.createPrivateDnat);
    }

    /**
     * 创建DNAT规则
     *
     * 创建DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateDnatRequest 请求对象
     * @return SyncInvoker<CreatePrivateDnatRequest, CreatePrivateDnatResponse>
     */
    public SyncInvoker<CreatePrivateDnatRequest, CreatePrivateDnatResponse> createPrivateDnatInvoker(
        CreatePrivateDnatRequest request) {
        return new SyncInvoker<CreatePrivateDnatRequest, CreatePrivateDnatResponse>(request, NatMeta.createPrivateDnat,
            hcClient);
    }

    /**
     * 删除DNAT规则
     *
     * 删除指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNatGatewayDnatRuleRequest 请求对象
     * @return DeleteNatGatewayDnatRuleResponse
     */
    public DeleteNatGatewayDnatRuleResponse deleteNatGatewayDnatRule(DeleteNatGatewayDnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.deleteNatGatewayDnatRule);
    }

    /**
     * 删除DNAT规则
     *
     * 删除指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNatGatewayDnatRuleRequest 请求对象
     * @return SyncInvoker<DeleteNatGatewayDnatRuleRequest, DeleteNatGatewayDnatRuleResponse>
     */
    public SyncInvoker<DeleteNatGatewayDnatRuleRequest, DeleteNatGatewayDnatRuleResponse> deleteNatGatewayDnatRuleInvoker(
        DeleteNatGatewayDnatRuleRequest request) {
        return new SyncInvoker<DeleteNatGatewayDnatRuleRequest, DeleteNatGatewayDnatRuleResponse>(request,
            NatMeta.deleteNatGatewayDnatRule, hcClient);
    }

    /**
     * 删除DNAT规则
     *
     * 删除指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateDnatRequest 请求对象
     * @return DeletePrivateDnatResponse
     */
    public DeletePrivateDnatResponse deletePrivateDnat(DeletePrivateDnatRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.deletePrivateDnat);
    }

    /**
     * 删除DNAT规则
     *
     * 删除指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateDnatRequest 请求对象
     * @return SyncInvoker<DeletePrivateDnatRequest, DeletePrivateDnatResponse>
     */
    public SyncInvoker<DeletePrivateDnatRequest, DeletePrivateDnatResponse> deletePrivateDnatInvoker(
        DeletePrivateDnatRequest request) {
        return new SyncInvoker<DeletePrivateDnatRequest, DeletePrivateDnatResponse>(request, NatMeta.deletePrivateDnat,
            hcClient);
    }

    /**
     * 查询DNAT规则列表
     *
     * 查询DNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewayDnatRulesRequest 请求对象
     * @return ListNatGatewayDnatRulesResponse
     */
    public ListNatGatewayDnatRulesResponse listNatGatewayDnatRules(ListNatGatewayDnatRulesRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.listNatGatewayDnatRules);
    }

    /**
     * 查询DNAT规则列表
     *
     * 查询DNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewayDnatRulesRequest 请求对象
     * @return SyncInvoker<ListNatGatewayDnatRulesRequest, ListNatGatewayDnatRulesResponse>
     */
    public SyncInvoker<ListNatGatewayDnatRulesRequest, ListNatGatewayDnatRulesResponse> listNatGatewayDnatRulesInvoker(
        ListNatGatewayDnatRulesRequest request) {
        return new SyncInvoker<ListNatGatewayDnatRulesRequest, ListNatGatewayDnatRulesResponse>(request,
            NatMeta.listNatGatewayDnatRules, hcClient);
    }

    /**
     * 查询DNAT规则列表
     *
     * 查询DNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateDnatsRequest 请求对象
     * @return ListPrivateDnatsResponse
     */
    public ListPrivateDnatsResponse listPrivateDnats(ListPrivateDnatsRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.listPrivateDnats);
    }

    /**
     * 查询DNAT规则列表
     *
     * 查询DNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateDnatsRequest 请求对象
     * @return SyncInvoker<ListPrivateDnatsRequest, ListPrivateDnatsResponse>
     */
    public SyncInvoker<ListPrivateDnatsRequest, ListPrivateDnatsResponse> listPrivateDnatsInvoker(
        ListPrivateDnatsRequest request) {
        return new SyncInvoker<ListPrivateDnatsRequest, ListPrivateDnatsResponse>(request, NatMeta.listPrivateDnats,
            hcClient);
    }

    /**
     * 查询指定的DNAT规则详情
     *
     * 查询指定的DNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNatGatewayDnatRuleRequest 请求对象
     * @return ShowNatGatewayDnatRuleResponse
     */
    public ShowNatGatewayDnatRuleResponse showNatGatewayDnatRule(ShowNatGatewayDnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.showNatGatewayDnatRule);
    }

    /**
     * 查询指定的DNAT规则详情
     *
     * 查询指定的DNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNatGatewayDnatRuleRequest 请求对象
     * @return SyncInvoker<ShowNatGatewayDnatRuleRequest, ShowNatGatewayDnatRuleResponse>
     */
    public SyncInvoker<ShowNatGatewayDnatRuleRequest, ShowNatGatewayDnatRuleResponse> showNatGatewayDnatRuleInvoker(
        ShowNatGatewayDnatRuleRequest request) {
        return new SyncInvoker<ShowNatGatewayDnatRuleRequest, ShowNatGatewayDnatRuleResponse>(request,
            NatMeta.showNatGatewayDnatRule, hcClient);
    }

    /**
     * 查询指定的DNAT规则详情
     *
     * 查询指定的DNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateDnatRequest 请求对象
     * @return ShowPrivateDnatResponse
     */
    public ShowPrivateDnatResponse showPrivateDnat(ShowPrivateDnatRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.showPrivateDnat);
    }

    /**
     * 查询指定的DNAT规则详情
     *
     * 查询指定的DNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateDnatRequest 请求对象
     * @return SyncInvoker<ShowPrivateDnatRequest, ShowPrivateDnatResponse>
     */
    public SyncInvoker<ShowPrivateDnatRequest, ShowPrivateDnatResponse> showPrivateDnatInvoker(
        ShowPrivateDnatRequest request) {
        return new SyncInvoker<ShowPrivateDnatRequest, ShowPrivateDnatResponse>(request, NatMeta.showPrivateDnat,
            hcClient);
    }

    /**
     * 更新DNAT规则
     *
     * 更新指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNatGatewayDnatRuleRequest 请求对象
     * @return UpdateNatGatewayDnatRuleResponse
     */
    public UpdateNatGatewayDnatRuleResponse updateNatGatewayDnatRule(UpdateNatGatewayDnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.updateNatGatewayDnatRule);
    }

    /**
     * 更新DNAT规则
     *
     * 更新指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNatGatewayDnatRuleRequest 请求对象
     * @return SyncInvoker<UpdateNatGatewayDnatRuleRequest, UpdateNatGatewayDnatRuleResponse>
     */
    public SyncInvoker<UpdateNatGatewayDnatRuleRequest, UpdateNatGatewayDnatRuleResponse> updateNatGatewayDnatRuleInvoker(
        UpdateNatGatewayDnatRuleRequest request) {
        return new SyncInvoker<UpdateNatGatewayDnatRuleRequest, UpdateNatGatewayDnatRuleResponse>(request,
            NatMeta.updateNatGatewayDnatRule, hcClient);
    }

    /**
     * 更新DNAT规则
     *
     * 更新指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateDnatRequest 请求对象
     * @return UpdatePrivateDnatResponse
     */
    public UpdatePrivateDnatResponse updatePrivateDnat(UpdatePrivateDnatRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.updatePrivateDnat);
    }

    /**
     * 更新DNAT规则
     *
     * 更新指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateDnatRequest 请求对象
     * @return SyncInvoker<UpdatePrivateDnatRequest, UpdatePrivateDnatResponse>
     */
    public SyncInvoker<UpdatePrivateDnatRequest, UpdatePrivateDnatResponse> updatePrivateDnatInvoker(
        UpdatePrivateDnatRequest request) {
        return new SyncInvoker<UpdatePrivateDnatRequest, UpdatePrivateDnatResponse>(request, NatMeta.updatePrivateDnat,
            hcClient);
    }

    /**
     * 批量添加删除中转IP标签
     *
     * - 为指定中转IP实例批量添加或删除标签
     * - 标签管理服务需要使用该接口批量管理中转IP实例的标签。
     * - 一个中转IP上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateDeleteTransitIpTagsRequest 请求对象
     * @return BatchCreateDeleteTransitIpTagsResponse
     */
    public BatchCreateDeleteTransitIpTagsResponse batchCreateDeleteTransitIpTags(
        BatchCreateDeleteTransitIpTagsRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.batchCreateDeleteTransitIpTags);
    }

    /**
     * 批量添加删除中转IP标签
     *
     * - 为指定中转IP实例批量添加或删除标签
     * - 标签管理服务需要使用该接口批量管理中转IP实例的标签。
     * - 一个中转IP上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateDeleteTransitIpTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateDeleteTransitIpTagsRequest, BatchCreateDeleteTransitIpTagsResponse>
     */
    public SyncInvoker<BatchCreateDeleteTransitIpTagsRequest, BatchCreateDeleteTransitIpTagsResponse> batchCreateDeleteTransitIpTagsInvoker(
        BatchCreateDeleteTransitIpTagsRequest request) {
        return new SyncInvoker<BatchCreateDeleteTransitIpTagsRequest, BatchCreateDeleteTransitIpTagsResponse>(request,
            NatMeta.batchCreateDeleteTransitIpTags, hcClient);
    }

    /**
     * 添加中转IP标签
     *
     * - 一个中转IP上最多有10个标签。
     * - 此接口为幂等接口：
     * - 创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTransitIpTagRequest 请求对象
     * @return CreateTransitIpTagResponse
     */
    public CreateTransitIpTagResponse createTransitIpTag(CreateTransitIpTagRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.createTransitIpTag);
    }

    /**
     * 添加中转IP标签
     *
     * - 一个中转IP上最多有10个标签。
     * - 此接口为幂等接口：
     * - 创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTransitIpTagRequest 请求对象
     * @return SyncInvoker<CreateTransitIpTagRequest, CreateTransitIpTagResponse>
     */
    public SyncInvoker<CreateTransitIpTagRequest, CreateTransitIpTagResponse> createTransitIpTagInvoker(
        CreateTransitIpTagRequest request) {
        return new SyncInvoker<CreateTransitIpTagRequest, CreateTransitIpTagResponse>(request,
            NatMeta.createTransitIpTag, hcClient);
    }

    /**
     * 删除中转IP标签
     *
     * - 幂等接口：
     * - 删除时，不对标签字符集做校验，调用接口前必须要做encodeURI，服务端需要对接口uri做decodeURI。删除的key不存在报404，key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTransitIpTagRequest 请求对象
     * @return DeleteTransitIpTagResponse
     */
    public DeleteTransitIpTagResponse deleteTransitIpTag(DeleteTransitIpTagRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.deleteTransitIpTag);
    }

    /**
     * 删除中转IP标签
     *
     * - 幂等接口：
     * - 删除时，不对标签字符集做校验，调用接口前必须要做encodeURI，服务端需要对接口uri做decodeURI。删除的key不存在报404，key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTransitIpTagRequest 请求对象
     * @return SyncInvoker<DeleteTransitIpTagRequest, DeleteTransitIpTagResponse>
     */
    public SyncInvoker<DeleteTransitIpTagRequest, DeleteTransitIpTagResponse> deleteTransitIpTagInvoker(
        DeleteTransitIpTagRequest request) {
        return new SyncInvoker<DeleteTransitIpTagRequest, DeleteTransitIpTagResponse>(request,
            NatMeta.deleteTransitIpTag, hcClient);
    }

    /**
     * 查询中转IP项目标签
     *
     * - 查询租户在指定Project和实例类型的所有中转IP标签集合。
     * - 标签管理服务需要能够列出当前租户全部已使用的中转IP标签集合，为打中转IP标签和过滤中转IP实例时提供标签联想功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTransitIpTagsRequest 请求对象
     * @return ListTransitIpTagsResponse
     */
    public ListTransitIpTagsResponse listTransitIpTags(ListTransitIpTagsRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.listTransitIpTags);
    }

    /**
     * 查询中转IP项目标签
     *
     * - 查询租户在指定Project和实例类型的所有中转IP标签集合。
     * - 标签管理服务需要能够列出当前租户全部已使用的中转IP标签集合，为打中转IP标签和过滤中转IP实例时提供标签联想功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTransitIpTagsRequest 请求对象
     * @return SyncInvoker<ListTransitIpTagsRequest, ListTransitIpTagsResponse>
     */
    public SyncInvoker<ListTransitIpTagsRequest, ListTransitIpTagsResponse> listTransitIpTagsInvoker(
        ListTransitIpTagsRequest request) {
        return new SyncInvoker<ListTransitIpTagsRequest, ListTransitIpTagsResponse>(request, NatMeta.listTransitIpTags,
            hcClient);
    }

    /**
     * 查询中转IP实例
     *
     * - 使用标签过滤中转IP实例。
     * - 标签管理服务需要提供按标签过滤中转IP服务实例并汇总显示在列表中，需要中转IP服务提供查询能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTransitIpsByTagsRequest 请求对象
     * @return ListTransitIpsByTagsResponse
     */
    public ListTransitIpsByTagsResponse listTransitIpsByTags(ListTransitIpsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.listTransitIpsByTags);
    }

    /**
     * 查询中转IP实例
     *
     * - 使用标签过滤中转IP实例。
     * - 标签管理服务需要提供按标签过滤中转IP服务实例并汇总显示在列表中，需要中转IP服务提供查询能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTransitIpsByTagsRequest 请求对象
     * @return SyncInvoker<ListTransitIpsByTagsRequest, ListTransitIpsByTagsResponse>
     */
    public SyncInvoker<ListTransitIpsByTagsRequest, ListTransitIpsByTagsResponse> listTransitIpsByTagsInvoker(
        ListTransitIpsByTagsRequest request) {
        return new SyncInvoker<ListTransitIpsByTagsRequest, ListTransitIpsByTagsResponse>(request,
            NatMeta.listTransitIpsByTags, hcClient);
    }

    /**
     * 查询中转IP标签
     *
     * - 查询指定中转IP实例的标签信息。
     * - 标签管理服务需要使用该接口查询指定中转IP实例的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTransitIpTagsRequest 请求对象
     * @return ShowTransitIpTagsResponse
     */
    public ShowTransitIpTagsResponse showTransitIpTags(ShowTransitIpTagsRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.showTransitIpTags);
    }

    /**
     * 查询中转IP标签
     *
     * - 查询指定中转IP实例的标签信息。
     * - 标签管理服务需要使用该接口查询指定中转IP实例的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTransitIpTagsRequest 请求对象
     * @return SyncInvoker<ShowTransitIpTagsRequest, ShowTransitIpTagsResponse>
     */
    public SyncInvoker<ShowTransitIpTagsRequest, ShowTransitIpTagsResponse> showTransitIpTagsInvoker(
        ShowTransitIpTagsRequest request) {
        return new SyncInvoker<ShowTransitIpTagsRequest, ShowTransitIpTagsResponse>(request, NatMeta.showTransitIpTags,
            hcClient);
    }

    /**
     * 批量添加删除私网NAT网关标签
     *
     * - 为指定私网NAT网关实例批量添加或删除标签
     * - 标签管理服务需要使用该接口批量管理私网NAT网关实例的标签。
     * - 一个私网NAT网关上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateDeletePrivateNatTagsRequest 请求对象
     * @return BatchCreateDeletePrivateNatTagsResponse
     */
    public BatchCreateDeletePrivateNatTagsResponse batchCreateDeletePrivateNatTags(
        BatchCreateDeletePrivateNatTagsRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.batchCreateDeletePrivateNatTags);
    }

    /**
     * 批量添加删除私网NAT网关标签
     *
     * - 为指定私网NAT网关实例批量添加或删除标签
     * - 标签管理服务需要使用该接口批量管理私网NAT网关实例的标签。
     * - 一个私网NAT网关上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateDeletePrivateNatTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateDeletePrivateNatTagsRequest, BatchCreateDeletePrivateNatTagsResponse>
     */
    public SyncInvoker<BatchCreateDeletePrivateNatTagsRequest, BatchCreateDeletePrivateNatTagsResponse> batchCreateDeletePrivateNatTagsInvoker(
        BatchCreateDeletePrivateNatTagsRequest request) {
        return new SyncInvoker<BatchCreateDeletePrivateNatTagsRequest, BatchCreateDeletePrivateNatTagsResponse>(request,
            NatMeta.batchCreateDeletePrivateNatTags, hcClient);
    }

    /**
     * 创建公网NAT网关
     *
     * 创建公网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNatGatewayRequest 请求对象
     * @return CreateNatGatewayResponse
     */
    public CreateNatGatewayResponse createNatGateway(CreateNatGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.createNatGateway);
    }

    /**
     * 创建公网NAT网关
     *
     * 创建公网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNatGatewayRequest 请求对象
     * @return SyncInvoker<CreateNatGatewayRequest, CreateNatGatewayResponse>
     */
    public SyncInvoker<CreateNatGatewayRequest, CreateNatGatewayResponse> createNatGatewayInvoker(
        CreateNatGatewayRequest request) {
        return new SyncInvoker<CreateNatGatewayRequest, CreateNatGatewayResponse>(request, NatMeta.createNatGateway,
            hcClient);
    }

    /**
     * 创建私网NAT网关
     *
     * 创建私网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateNatRequest 请求对象
     * @return CreatePrivateNatResponse
     */
    public CreatePrivateNatResponse createPrivateNat(CreatePrivateNatRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.createPrivateNat);
    }

    /**
     * 创建私网NAT网关
     *
     * 创建私网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateNatRequest 请求对象
     * @return SyncInvoker<CreatePrivateNatRequest, CreatePrivateNatResponse>
     */
    public SyncInvoker<CreatePrivateNatRequest, CreatePrivateNatResponse> createPrivateNatInvoker(
        CreatePrivateNatRequest request) {
        return new SyncInvoker<CreatePrivateNatRequest, CreatePrivateNatResponse>(request, NatMeta.createPrivateNat,
            hcClient);
    }

    /**
     * 添加私网NAT网关标签
     *
     * - 一个私网NAT网关上最多有10个标签。
     * - 此接口为幂等接口：
     * - 创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateNatTagRequest 请求对象
     * @return CreatePrivateNatTagResponse
     */
    public CreatePrivateNatTagResponse createPrivateNatTag(CreatePrivateNatTagRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.createPrivateNatTag);
    }

    /**
     * 添加私网NAT网关标签
     *
     * - 一个私网NAT网关上最多有10个标签。
     * - 此接口为幂等接口：
     * - 创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateNatTagRequest 请求对象
     * @return SyncInvoker<CreatePrivateNatTagRequest, CreatePrivateNatTagResponse>
     */
    public SyncInvoker<CreatePrivateNatTagRequest, CreatePrivateNatTagResponse> createPrivateNatTagInvoker(
        CreatePrivateNatTagRequest request) {
        return new SyncInvoker<CreatePrivateNatTagRequest, CreatePrivateNatTagResponse>(request,
            NatMeta.createPrivateNatTag, hcClient);
    }

    /**
     * 删除公网NAT网关
     *
     * 删除公网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNatGatewayRequest 请求对象
     * @return DeleteNatGatewayResponse
     */
    public DeleteNatGatewayResponse deleteNatGateway(DeleteNatGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.deleteNatGateway);
    }

    /**
     * 删除公网NAT网关
     *
     * 删除公网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNatGatewayRequest 请求对象
     * @return SyncInvoker<DeleteNatGatewayRequest, DeleteNatGatewayResponse>
     */
    public SyncInvoker<DeleteNatGatewayRequest, DeleteNatGatewayResponse> deleteNatGatewayInvoker(
        DeleteNatGatewayRequest request) {
        return new SyncInvoker<DeleteNatGatewayRequest, DeleteNatGatewayResponse>(request, NatMeta.deleteNatGateway,
            hcClient);
    }

    /**
     * 删除私网NAT网关
     *
     * 删除私网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateNatRequest 请求对象
     * @return DeletePrivateNatResponse
     */
    public DeletePrivateNatResponse deletePrivateNat(DeletePrivateNatRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.deletePrivateNat);
    }

    /**
     * 删除私网NAT网关
     *
     * 删除私网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateNatRequest 请求对象
     * @return SyncInvoker<DeletePrivateNatRequest, DeletePrivateNatResponse>
     */
    public SyncInvoker<DeletePrivateNatRequest, DeletePrivateNatResponse> deletePrivateNatInvoker(
        DeletePrivateNatRequest request) {
        return new SyncInvoker<DeletePrivateNatRequest, DeletePrivateNatResponse>(request, NatMeta.deletePrivateNat,
            hcClient);
    }

    /**
     * 删除私网NAT网关标签
     *
     * - 幂等接口：
     * - 删除时，不对标签字符集做校验，调用接口前必须要做encodeURI，服务端需要对接口uri做decodeURI。删除的key不存在报404，key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateNatTagRequest 请求对象
     * @return DeletePrivateNatTagResponse
     */
    public DeletePrivateNatTagResponse deletePrivateNatTag(DeletePrivateNatTagRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.deletePrivateNatTag);
    }

    /**
     * 删除私网NAT网关标签
     *
     * - 幂等接口：
     * - 删除时，不对标签字符集做校验，调用接口前必须要做encodeURI，服务端需要对接口uri做decodeURI。删除的key不存在报404，key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateNatTagRequest 请求对象
     * @return SyncInvoker<DeletePrivateNatTagRequest, DeletePrivateNatTagResponse>
     */
    public SyncInvoker<DeletePrivateNatTagRequest, DeletePrivateNatTagResponse> deletePrivateNatTagInvoker(
        DeletePrivateNatTagRequest request) {
        return new SyncInvoker<DeletePrivateNatTagRequest, DeletePrivateNatTagResponse>(request,
            NatMeta.deletePrivateNatTag, hcClient);
    }

    /**
     * 查询公网NAT网关列表
     *
     * 查询公网NAT网关实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewaysRequest 请求对象
     * @return ListNatGatewaysResponse
     */
    public ListNatGatewaysResponse listNatGateways(ListNatGatewaysRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.listNatGateways);
    }

    /**
     * 查询公网NAT网关列表
     *
     * 查询公网NAT网关实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewaysRequest 请求对象
     * @return SyncInvoker<ListNatGatewaysRequest, ListNatGatewaysResponse>
     */
    public SyncInvoker<ListNatGatewaysRequest, ListNatGatewaysResponse> listNatGatewaysInvoker(
        ListNatGatewaysRequest request) {
        return new SyncInvoker<ListNatGatewaysRequest, ListNatGatewaysResponse>(request, NatMeta.listNatGateways,
            hcClient);
    }

    /**
     * 查询私网NAT网关项目标签
     *
     * - 查询租户在指定Project和实例类型的所有私网NAT网关标签集合。
     * - 标签管理服务需要能够列出当前租户全部已使用的私网NAT网关标签集合，为打私网NAT网关标签和过滤私网NAT网关实例时提供标签联想功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateNatTagsRequest 请求对象
     * @return ListPrivateNatTagsResponse
     */
    public ListPrivateNatTagsResponse listPrivateNatTags(ListPrivateNatTagsRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.listPrivateNatTags);
    }

    /**
     * 查询私网NAT网关项目标签
     *
     * - 查询租户在指定Project和实例类型的所有私网NAT网关标签集合。
     * - 标签管理服务需要能够列出当前租户全部已使用的私网NAT网关标签集合，为打私网NAT网关标签和过滤私网NAT网关实例时提供标签联想功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateNatTagsRequest 请求对象
     * @return SyncInvoker<ListPrivateNatTagsRequest, ListPrivateNatTagsResponse>
     */
    public SyncInvoker<ListPrivateNatTagsRequest, ListPrivateNatTagsResponse> listPrivateNatTagsInvoker(
        ListPrivateNatTagsRequest request) {
        return new SyncInvoker<ListPrivateNatTagsRequest, ListPrivateNatTagsResponse>(request,
            NatMeta.listPrivateNatTags, hcClient);
    }

    /**
     * 查询私网NAT网关列表
     *
     * 查询私网NAT网关实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateNatsRequest 请求对象
     * @return ListPrivateNatsResponse
     */
    public ListPrivateNatsResponse listPrivateNats(ListPrivateNatsRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.listPrivateNats);
    }

    /**
     * 查询私网NAT网关列表
     *
     * 查询私网NAT网关实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateNatsRequest 请求对象
     * @return SyncInvoker<ListPrivateNatsRequest, ListPrivateNatsResponse>
     */
    public SyncInvoker<ListPrivateNatsRequest, ListPrivateNatsResponse> listPrivateNatsInvoker(
        ListPrivateNatsRequest request) {
        return new SyncInvoker<ListPrivateNatsRequest, ListPrivateNatsResponse>(request, NatMeta.listPrivateNats,
            hcClient);
    }

    /**
     * 查询私网NAT网关实例
     *
     * - 使用标签过滤私网NAT网关实例。
     * - 标签管理服务需要提供按标签过滤私网NAT网关服务实例并汇总显示在列表中，需要私网NAT网关服务提供查询能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateNatsByTagsRequest 请求对象
     * @return ListPrivateNatsByTagsResponse
     */
    public ListPrivateNatsByTagsResponse listPrivateNatsByTags(ListPrivateNatsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.listPrivateNatsByTags);
    }

    /**
     * 查询私网NAT网关实例
     *
     * - 使用标签过滤私网NAT网关实例。
     * - 标签管理服务需要提供按标签过滤私网NAT网关服务实例并汇总显示在列表中，需要私网NAT网关服务提供查询能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateNatsByTagsRequest 请求对象
     * @return SyncInvoker<ListPrivateNatsByTagsRequest, ListPrivateNatsByTagsResponse>
     */
    public SyncInvoker<ListPrivateNatsByTagsRequest, ListPrivateNatsByTagsResponse> listPrivateNatsByTagsInvoker(
        ListPrivateNatsByTagsRequest request) {
        return new SyncInvoker<ListPrivateNatsByTagsRequest, ListPrivateNatsByTagsResponse>(request,
            NatMeta.listPrivateNatsByTags, hcClient);
    }

    /**
     * 查询指定的公网NAT网关详情
     *
     * 查询指定的公网NAT网关实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNatGatewayRequest 请求对象
     * @return ShowNatGatewayResponse
     */
    public ShowNatGatewayResponse showNatGateway(ShowNatGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.showNatGateway);
    }

    /**
     * 查询指定的公网NAT网关详情
     *
     * 查询指定的公网NAT网关实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNatGatewayRequest 请求对象
     * @return SyncInvoker<ShowNatGatewayRequest, ShowNatGatewayResponse>
     */
    public SyncInvoker<ShowNatGatewayRequest, ShowNatGatewayResponse> showNatGatewayInvoker(
        ShowNatGatewayRequest request) {
        return new SyncInvoker<ShowNatGatewayRequest, ShowNatGatewayResponse>(request, NatMeta.showNatGateway,
            hcClient);
    }

    /**
     * 查询指定的私网NAT网关详情
     *
     * 查询指定的私网NAT网关实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateNatRequest 请求对象
     * @return ShowPrivateNatResponse
     */
    public ShowPrivateNatResponse showPrivateNat(ShowPrivateNatRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.showPrivateNat);
    }

    /**
     * 查询指定的私网NAT网关详情
     *
     * 查询指定的私网NAT网关实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateNatRequest 请求对象
     * @return SyncInvoker<ShowPrivateNatRequest, ShowPrivateNatResponse>
     */
    public SyncInvoker<ShowPrivateNatRequest, ShowPrivateNatResponse> showPrivateNatInvoker(
        ShowPrivateNatRequest request) {
        return new SyncInvoker<ShowPrivateNatRequest, ShowPrivateNatResponse>(request, NatMeta.showPrivateNat,
            hcClient);
    }

    /**
     * 查询私网NAT网关标签
     *
     * - 查询指定私网NAT网关实例的标签信息。
     * - 标签管理服务需要使用该接口查询指定私网NAT网关实例的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateNatTagsRequest 请求对象
     * @return ShowPrivateNatTagsResponse
     */
    public ShowPrivateNatTagsResponse showPrivateNatTags(ShowPrivateNatTagsRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.showPrivateNatTags);
    }

    /**
     * 查询私网NAT网关标签
     *
     * - 查询指定私网NAT网关实例的标签信息。
     * - 标签管理服务需要使用该接口查询指定私网NAT网关实例的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateNatTagsRequest 请求对象
     * @return SyncInvoker<ShowPrivateNatTagsRequest, ShowPrivateNatTagsResponse>
     */
    public SyncInvoker<ShowPrivateNatTagsRequest, ShowPrivateNatTagsResponse> showPrivateNatTagsInvoker(
        ShowPrivateNatTagsRequest request) {
        return new SyncInvoker<ShowPrivateNatTagsRequest, ShowPrivateNatTagsResponse>(request,
            NatMeta.showPrivateNatTags, hcClient);
    }

    /**
     * 更新公网NAT网关
     *
     * 更新公网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNatGatewayRequest 请求对象
     * @return UpdateNatGatewayResponse
     */
    public UpdateNatGatewayResponse updateNatGateway(UpdateNatGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.updateNatGateway);
    }

    /**
     * 更新公网NAT网关
     *
     * 更新公网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNatGatewayRequest 请求对象
     * @return SyncInvoker<UpdateNatGatewayRequest, UpdateNatGatewayResponse>
     */
    public SyncInvoker<UpdateNatGatewayRequest, UpdateNatGatewayResponse> updateNatGatewayInvoker(
        UpdateNatGatewayRequest request) {
        return new SyncInvoker<UpdateNatGatewayRequest, UpdateNatGatewayResponse>(request, NatMeta.updateNatGateway,
            hcClient);
    }

    /**
     * 更新私网NAT网关
     *
     * 更新私网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateNatRequest 请求对象
     * @return UpdatePrivateNatResponse
     */
    public UpdatePrivateNatResponse updatePrivateNat(UpdatePrivateNatRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.updatePrivateNat);
    }

    /**
     * 更新私网NAT网关
     *
     * 更新私网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateNatRequest 请求对象
     * @return SyncInvoker<UpdatePrivateNatRequest, UpdatePrivateNatResponse>
     */
    public SyncInvoker<UpdatePrivateNatRequest, UpdatePrivateNatResponse> updatePrivateNatInvoker(
        UpdatePrivateNatRequest request) {
        return new SyncInvoker<UpdatePrivateNatRequest, UpdatePrivateNatResponse>(request, NatMeta.updatePrivateNat,
            hcClient);
    }

    /**
     * 创建中转IP
     *
     * 创建中转IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTransitIpRequest 请求对象
     * @return CreateTransitIpResponse
     */
    public CreateTransitIpResponse createTransitIp(CreateTransitIpRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.createTransitIp);
    }

    /**
     * 创建中转IP
     *
     * 创建中转IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTransitIpRequest 请求对象
     * @return SyncInvoker<CreateTransitIpRequest, CreateTransitIpResponse>
     */
    public SyncInvoker<CreateTransitIpRequest, CreateTransitIpResponse> createTransitIpInvoker(
        CreateTransitIpRequest request) {
        return new SyncInvoker<CreateTransitIpRequest, CreateTransitIpResponse>(request, NatMeta.createTransitIp,
            hcClient);
    }

    /**
     * 删除中转IP
     *
     * 删除中转IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTransitIpRequest 请求对象
     * @return DeleteTransitIpResponse
     */
    public DeleteTransitIpResponse deleteTransitIp(DeleteTransitIpRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.deleteTransitIp);
    }

    /**
     * 删除中转IP
     *
     * 删除中转IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTransitIpRequest 请求对象
     * @return SyncInvoker<DeleteTransitIpRequest, DeleteTransitIpResponse>
     */
    public SyncInvoker<DeleteTransitIpRequest, DeleteTransitIpResponse> deleteTransitIpInvoker(
        DeleteTransitIpRequest request) {
        return new SyncInvoker<DeleteTransitIpRequest, DeleteTransitIpResponse>(request, NatMeta.deleteTransitIp,
            hcClient);
    }

    /**
     * 查询中转IP列表
     *
     * 查询中转IP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTransitIpsRequest 请求对象
     * @return ListTransitIpsResponse
     */
    public ListTransitIpsResponse listTransitIps(ListTransitIpsRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.listTransitIps);
    }

    /**
     * 查询中转IP列表
     *
     * 查询中转IP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTransitIpsRequest 请求对象
     * @return SyncInvoker<ListTransitIpsRequest, ListTransitIpsResponse>
     */
    public SyncInvoker<ListTransitIpsRequest, ListTransitIpsResponse> listTransitIpsInvoker(
        ListTransitIpsRequest request) {
        return new SyncInvoker<ListTransitIpsRequest, ListTransitIpsResponse>(request, NatMeta.listTransitIps,
            hcClient);
    }

    /**
     * 查询指定的中转IP详情
     *
     * 查询中转IP详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTransitIpRequest 请求对象
     * @return ShowTransitIpResponse
     */
    public ShowTransitIpResponse showTransitIp(ShowTransitIpRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.showTransitIp);
    }

    /**
     * 查询指定的中转IP详情
     *
     * 查询中转IP详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTransitIpRequest 请求对象
     * @return SyncInvoker<ShowTransitIpRequest, ShowTransitIpResponse>
     */
    public SyncInvoker<ShowTransitIpRequest, ShowTransitIpResponse> showTransitIpInvoker(ShowTransitIpRequest request) {
        return new SyncInvoker<ShowTransitIpRequest, ShowTransitIpResponse>(request, NatMeta.showTransitIp, hcClient);
    }

    /**
     * 创建SNAT规则
     *
     * 创建SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNatGatewaySnatRuleRequest 请求对象
     * @return CreateNatGatewaySnatRuleResponse
     */
    public CreateNatGatewaySnatRuleResponse createNatGatewaySnatRule(CreateNatGatewaySnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.createNatGatewaySnatRule);
    }

    /**
     * 创建SNAT规则
     *
     * 创建SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNatGatewaySnatRuleRequest 请求对象
     * @return SyncInvoker<CreateNatGatewaySnatRuleRequest, CreateNatGatewaySnatRuleResponse>
     */
    public SyncInvoker<CreateNatGatewaySnatRuleRequest, CreateNatGatewaySnatRuleResponse> createNatGatewaySnatRuleInvoker(
        CreateNatGatewaySnatRuleRequest request) {
        return new SyncInvoker<CreateNatGatewaySnatRuleRequest, CreateNatGatewaySnatRuleResponse>(request,
            NatMeta.createNatGatewaySnatRule, hcClient);
    }

    /**
     * 创建SNAT规则
     *
     * 创建SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateSnatRequest 请求对象
     * @return CreatePrivateSnatResponse
     */
    public CreatePrivateSnatResponse createPrivateSnat(CreatePrivateSnatRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.createPrivateSnat);
    }

    /**
     * 创建SNAT规则
     *
     * 创建SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateSnatRequest 请求对象
     * @return SyncInvoker<CreatePrivateSnatRequest, CreatePrivateSnatResponse>
     */
    public SyncInvoker<CreatePrivateSnatRequest, CreatePrivateSnatResponse> createPrivateSnatInvoker(
        CreatePrivateSnatRequest request) {
        return new SyncInvoker<CreatePrivateSnatRequest, CreatePrivateSnatResponse>(request, NatMeta.createPrivateSnat,
            hcClient);
    }

    /**
     * 删除SNAT规则
     *
     * 删除指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNatGatewaySnatRuleRequest 请求对象
     * @return DeleteNatGatewaySnatRuleResponse
     */
    public DeleteNatGatewaySnatRuleResponse deleteNatGatewaySnatRule(DeleteNatGatewaySnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.deleteNatGatewaySnatRule);
    }

    /**
     * 删除SNAT规则
     *
     * 删除指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNatGatewaySnatRuleRequest 请求对象
     * @return SyncInvoker<DeleteNatGatewaySnatRuleRequest, DeleteNatGatewaySnatRuleResponse>
     */
    public SyncInvoker<DeleteNatGatewaySnatRuleRequest, DeleteNatGatewaySnatRuleResponse> deleteNatGatewaySnatRuleInvoker(
        DeleteNatGatewaySnatRuleRequest request) {
        return new SyncInvoker<DeleteNatGatewaySnatRuleRequest, DeleteNatGatewaySnatRuleResponse>(request,
            NatMeta.deleteNatGatewaySnatRule, hcClient);
    }

    /**
     * 删除SNAT规则
     *
     * 删除指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateSnatRequest 请求对象
     * @return DeletePrivateSnatResponse
     */
    public DeletePrivateSnatResponse deletePrivateSnat(DeletePrivateSnatRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.deletePrivateSnat);
    }

    /**
     * 删除SNAT规则
     *
     * 删除指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateSnatRequest 请求对象
     * @return SyncInvoker<DeletePrivateSnatRequest, DeletePrivateSnatResponse>
     */
    public SyncInvoker<DeletePrivateSnatRequest, DeletePrivateSnatResponse> deletePrivateSnatInvoker(
        DeletePrivateSnatRequest request) {
        return new SyncInvoker<DeletePrivateSnatRequest, DeletePrivateSnatResponse>(request, NatMeta.deletePrivateSnat,
            hcClient);
    }

    /**
     * 查询SNAT规则列表
     *
     * 查询SNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewaySnatRulesRequest 请求对象
     * @return ListNatGatewaySnatRulesResponse
     */
    public ListNatGatewaySnatRulesResponse listNatGatewaySnatRules(ListNatGatewaySnatRulesRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.listNatGatewaySnatRules);
    }

    /**
     * 查询SNAT规则列表
     *
     * 查询SNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewaySnatRulesRequest 请求对象
     * @return SyncInvoker<ListNatGatewaySnatRulesRequest, ListNatGatewaySnatRulesResponse>
     */
    public SyncInvoker<ListNatGatewaySnatRulesRequest, ListNatGatewaySnatRulesResponse> listNatGatewaySnatRulesInvoker(
        ListNatGatewaySnatRulesRequest request) {
        return new SyncInvoker<ListNatGatewaySnatRulesRequest, ListNatGatewaySnatRulesResponse>(request,
            NatMeta.listNatGatewaySnatRules, hcClient);
    }

    /**
     * 查询SNAT规则列表
     *
     * 查询SNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateSnatsRequest 请求对象
     * @return ListPrivateSnatsResponse
     */
    public ListPrivateSnatsResponse listPrivateSnats(ListPrivateSnatsRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.listPrivateSnats);
    }

    /**
     * 查询SNAT规则列表
     *
     * 查询SNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateSnatsRequest 请求对象
     * @return SyncInvoker<ListPrivateSnatsRequest, ListPrivateSnatsResponse>
     */
    public SyncInvoker<ListPrivateSnatsRequest, ListPrivateSnatsResponse> listPrivateSnatsInvoker(
        ListPrivateSnatsRequest request) {
        return new SyncInvoker<ListPrivateSnatsRequest, ListPrivateSnatsResponse>(request, NatMeta.listPrivateSnats,
            hcClient);
    }

    /**
     * 查询指定的SNAT规则详情
     *
     * 查询指定的SNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNatGatewaySnatRuleRequest 请求对象
     * @return ShowNatGatewaySnatRuleResponse
     */
    public ShowNatGatewaySnatRuleResponse showNatGatewaySnatRule(ShowNatGatewaySnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.showNatGatewaySnatRule);
    }

    /**
     * 查询指定的SNAT规则详情
     *
     * 查询指定的SNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNatGatewaySnatRuleRequest 请求对象
     * @return SyncInvoker<ShowNatGatewaySnatRuleRequest, ShowNatGatewaySnatRuleResponse>
     */
    public SyncInvoker<ShowNatGatewaySnatRuleRequest, ShowNatGatewaySnatRuleResponse> showNatGatewaySnatRuleInvoker(
        ShowNatGatewaySnatRuleRequest request) {
        return new SyncInvoker<ShowNatGatewaySnatRuleRequest, ShowNatGatewaySnatRuleResponse>(request,
            NatMeta.showNatGatewaySnatRule, hcClient);
    }

    /**
     * 查询指定的SNAT规则详情
     *
     * 查询指定的SNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateSnatRequest 请求对象
     * @return ShowPrivateSnatResponse
     */
    public ShowPrivateSnatResponse showPrivateSnat(ShowPrivateSnatRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.showPrivateSnat);
    }

    /**
     * 查询指定的SNAT规则详情
     *
     * 查询指定的SNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateSnatRequest 请求对象
     * @return SyncInvoker<ShowPrivateSnatRequest, ShowPrivateSnatResponse>
     */
    public SyncInvoker<ShowPrivateSnatRequest, ShowPrivateSnatResponse> showPrivateSnatInvoker(
        ShowPrivateSnatRequest request) {
        return new SyncInvoker<ShowPrivateSnatRequest, ShowPrivateSnatResponse>(request, NatMeta.showPrivateSnat,
            hcClient);
    }

    /**
     * 更新SNAT规则
     *
     * 更新指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNatGatewaySnatRuleRequest 请求对象
     * @return UpdateNatGatewaySnatRuleResponse
     */
    public UpdateNatGatewaySnatRuleResponse updateNatGatewaySnatRule(UpdateNatGatewaySnatRuleRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.updateNatGatewaySnatRule);
    }

    /**
     * 更新SNAT规则
     *
     * 更新指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNatGatewaySnatRuleRequest 请求对象
     * @return SyncInvoker<UpdateNatGatewaySnatRuleRequest, UpdateNatGatewaySnatRuleResponse>
     */
    public SyncInvoker<UpdateNatGatewaySnatRuleRequest, UpdateNatGatewaySnatRuleResponse> updateNatGatewaySnatRuleInvoker(
        UpdateNatGatewaySnatRuleRequest request) {
        return new SyncInvoker<UpdateNatGatewaySnatRuleRequest, UpdateNatGatewaySnatRuleResponse>(request,
            NatMeta.updateNatGatewaySnatRule, hcClient);
    }

    /**
     * 更新SNAT规则
     *
     * 更新指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateSnatRequest 请求对象
     * @return UpdatePrivateSnatResponse
     */
    public UpdatePrivateSnatResponse updatePrivateSnat(UpdatePrivateSnatRequest request) {
        return hcClient.syncInvokeHttp(request, NatMeta.updatePrivateSnat);
    }

    /**
     * 更新SNAT规则
     *
     * 更新指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateSnatRequest 请求对象
     * @return SyncInvoker<UpdatePrivateSnatRequest, UpdatePrivateSnatResponse>
     */
    public SyncInvoker<UpdatePrivateSnatRequest, UpdatePrivateSnatResponse> updatePrivateSnatInvoker(
        UpdatePrivateSnatRequest request) {
        return new SyncInvoker<UpdatePrivateSnatRequest, UpdatePrivateSnatResponse>(request, NatMeta.updatePrivateSnat,
            hcClient);
    }

}
