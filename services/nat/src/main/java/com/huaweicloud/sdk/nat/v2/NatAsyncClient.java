package com.huaweicloud.sdk.nat.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateDeleteNatGatewayTagRequest;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateDeleteNatGatewayTagResponse;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateDeletePrivateNatTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateDeletePrivateNatTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateDeleteTransitIpTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateDeleteTransitIpTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateNatGatewayDnatRulesRequest;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateNatGatewayDnatRulesResponse;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayDnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayDnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayRequest;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayResponse;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewaySnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewaySnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayTagRequest;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayTagResponse;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateDnatRequest;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateDnatResponse;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateNatRequest;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateNatResponse;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateNatTagRequest;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateNatTagResponse;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateSnatRequest;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateSnatResponse;
import com.huaweicloud.sdk.nat.v2.model.CreateTransitIpRequest;
import com.huaweicloud.sdk.nat.v2.model.CreateTransitIpResponse;
import com.huaweicloud.sdk.nat.v2.model.CreateTransitIpTagRequest;
import com.huaweicloud.sdk.nat.v2.model.CreateTransitIpTagResponse;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewayDnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewayDnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewayRequest;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewayResponse;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewaySnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewaySnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewayTagRequest;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewayTagResponse;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateDnatRequest;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateDnatResponse;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateNatRequest;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateNatResponse;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateNatTagRequest;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateNatTagResponse;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateSnatRequest;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateSnatResponse;
import com.huaweicloud.sdk.nat.v2.model.DeleteTransitIpRequest;
import com.huaweicloud.sdk.nat.v2.model.DeleteTransitIpResponse;
import com.huaweicloud.sdk.nat.v2.model.DeleteTransitIpTagRequest;
import com.huaweicloud.sdk.nat.v2.model.DeleteTransitIpTagResponse;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewayByTagRequest;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewayByTagResponse;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewayDnatRulesRequest;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewayDnatRulesResponse;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewaySnatRulesRequest;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewaySnatRulesResponse;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewayTagRequest;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewayTagResponse;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewaysRequest;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewaysResponse;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateDnatsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateDnatsResponse;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateNatTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateNatTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateNatsByTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateNatsByTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateNatsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateNatsResponse;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateSnatsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateSnatsResponse;
import com.huaweicloud.sdk.nat.v2.model.ListTransitIpTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListTransitIpTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.ListTransitIpsByTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListTransitIpsByTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.ListTransitIpsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListTransitIpsResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewayDnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewayDnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewayRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewayResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewaySnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewaySnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewayTagRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewayTagResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateDnatRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateDnatResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateNatRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateNatResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateNatTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateNatTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateSnatRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateSnatResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowTransitIpRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowTransitIpResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowTransitIpTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowTransitIpTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewayDnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewayDnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewayRequest;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewayResponse;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewaySnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewaySnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateDnatRequest;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateDnatResponse;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateNatRequest;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateNatResponse;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateSnatRequest;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateSnatResponse;

import java.util.concurrent.CompletableFuture;

public class NatAsyncClient {

    protected HcClient hcClient;

    public NatAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<NatAsyncClient> newBuilder() {
        ClientBuilder<NatAsyncClient> clientBuilder = new ClientBuilder<>(NatAsyncClient::new);
        return clientBuilder;
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
     * 创建DNAT规则
     *
     * 创建DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateDnatRequest 请求对象
     * @return CompletableFuture<CreatePrivateDnatResponse>
     */
    public CompletableFuture<CreatePrivateDnatResponse> createPrivateDnatAsync(CreatePrivateDnatRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.createPrivateDnat);
    }

    /**
     * 创建DNAT规则
     *
     * 创建DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateDnatRequest 请求对象
     * @return AsyncInvoker<CreatePrivateDnatRequest, CreatePrivateDnatResponse>
     */
    public AsyncInvoker<CreatePrivateDnatRequest, CreatePrivateDnatResponse> createPrivateDnatAsyncInvoker(
        CreatePrivateDnatRequest request) {
        return new AsyncInvoker<CreatePrivateDnatRequest, CreatePrivateDnatResponse>(request, NatMeta.createPrivateDnat,
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
     * 删除DNAT规则
     *
     * 删除指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateDnatRequest 请求对象
     * @return CompletableFuture<DeletePrivateDnatResponse>
     */
    public CompletableFuture<DeletePrivateDnatResponse> deletePrivateDnatAsync(DeletePrivateDnatRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.deletePrivateDnat);
    }

    /**
     * 删除DNAT规则
     *
     * 删除指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateDnatRequest 请求对象
     * @return AsyncInvoker<DeletePrivateDnatRequest, DeletePrivateDnatResponse>
     */
    public AsyncInvoker<DeletePrivateDnatRequest, DeletePrivateDnatResponse> deletePrivateDnatAsyncInvoker(
        DeletePrivateDnatRequest request) {
        return new AsyncInvoker<DeletePrivateDnatRequest, DeletePrivateDnatResponse>(request, NatMeta.deletePrivateDnat,
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
     * 查询DNAT规则列表
     *
     * 查询DNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateDnatsRequest 请求对象
     * @return CompletableFuture<ListPrivateDnatsResponse>
     */
    public CompletableFuture<ListPrivateDnatsResponse> listPrivateDnatsAsync(ListPrivateDnatsRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listPrivateDnats);
    }

    /**
     * 查询DNAT规则列表
     *
     * 查询DNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateDnatsRequest 请求对象
     * @return AsyncInvoker<ListPrivateDnatsRequest, ListPrivateDnatsResponse>
     */
    public AsyncInvoker<ListPrivateDnatsRequest, ListPrivateDnatsResponse> listPrivateDnatsAsyncInvoker(
        ListPrivateDnatsRequest request) {
        return new AsyncInvoker<ListPrivateDnatsRequest, ListPrivateDnatsResponse>(request, NatMeta.listPrivateDnats,
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
     * 查询指定的DNAT规则详情
     *
     * 查询指定的DNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateDnatRequest 请求对象
     * @return CompletableFuture<ShowPrivateDnatResponse>
     */
    public CompletableFuture<ShowPrivateDnatResponse> showPrivateDnatAsync(ShowPrivateDnatRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.showPrivateDnat);
    }

    /**
     * 查询指定的DNAT规则详情
     *
     * 查询指定的DNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateDnatRequest 请求对象
     * @return AsyncInvoker<ShowPrivateDnatRequest, ShowPrivateDnatResponse>
     */
    public AsyncInvoker<ShowPrivateDnatRequest, ShowPrivateDnatResponse> showPrivateDnatAsyncInvoker(
        ShowPrivateDnatRequest request) {
        return new AsyncInvoker<ShowPrivateDnatRequest, ShowPrivateDnatResponse>(request, NatMeta.showPrivateDnat,
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
     * 更新DNAT规则
     *
     * 更新指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateDnatRequest 请求对象
     * @return CompletableFuture<UpdatePrivateDnatResponse>
     */
    public CompletableFuture<UpdatePrivateDnatResponse> updatePrivateDnatAsync(UpdatePrivateDnatRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.updatePrivateDnat);
    }

    /**
     * 更新DNAT规则
     *
     * 更新指定的DNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateDnatRequest 请求对象
     * @return AsyncInvoker<UpdatePrivateDnatRequest, UpdatePrivateDnatResponse>
     */
    public AsyncInvoker<UpdatePrivateDnatRequest, UpdatePrivateDnatResponse> updatePrivateDnatAsyncInvoker(
        UpdatePrivateDnatRequest request) {
        return new AsyncInvoker<UpdatePrivateDnatRequest, UpdatePrivateDnatResponse>(request, NatMeta.updatePrivateDnat,
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
     * @return CompletableFuture<BatchCreateDeleteTransitIpTagsResponse>
     */
    public CompletableFuture<BatchCreateDeleteTransitIpTagsResponse> batchCreateDeleteTransitIpTagsAsync(
        BatchCreateDeleteTransitIpTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.batchCreateDeleteTransitIpTags);
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
     * @return AsyncInvoker<BatchCreateDeleteTransitIpTagsRequest, BatchCreateDeleteTransitIpTagsResponse>
     */
    public AsyncInvoker<BatchCreateDeleteTransitIpTagsRequest, BatchCreateDeleteTransitIpTagsResponse> batchCreateDeleteTransitIpTagsAsyncInvoker(
        BatchCreateDeleteTransitIpTagsRequest request) {
        return new AsyncInvoker<BatchCreateDeleteTransitIpTagsRequest, BatchCreateDeleteTransitIpTagsResponse>(request,
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
     * @return CompletableFuture<CreateTransitIpTagResponse>
     */
    public CompletableFuture<CreateTransitIpTagResponse> createTransitIpTagAsync(CreateTransitIpTagRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.createTransitIpTag);
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
     * @return AsyncInvoker<CreateTransitIpTagRequest, CreateTransitIpTagResponse>
     */
    public AsyncInvoker<CreateTransitIpTagRequest, CreateTransitIpTagResponse> createTransitIpTagAsyncInvoker(
        CreateTransitIpTagRequest request) {
        return new AsyncInvoker<CreateTransitIpTagRequest, CreateTransitIpTagResponse>(request,
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
     * @return CompletableFuture<DeleteTransitIpTagResponse>
     */
    public CompletableFuture<DeleteTransitIpTagResponse> deleteTransitIpTagAsync(DeleteTransitIpTagRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.deleteTransitIpTag);
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
     * @return AsyncInvoker<DeleteTransitIpTagRequest, DeleteTransitIpTagResponse>
     */
    public AsyncInvoker<DeleteTransitIpTagRequest, DeleteTransitIpTagResponse> deleteTransitIpTagAsyncInvoker(
        DeleteTransitIpTagRequest request) {
        return new AsyncInvoker<DeleteTransitIpTagRequest, DeleteTransitIpTagResponse>(request,
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
     * @return CompletableFuture<ListTransitIpTagsResponse>
     */
    public CompletableFuture<ListTransitIpTagsResponse> listTransitIpTagsAsync(ListTransitIpTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listTransitIpTags);
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
     * @return AsyncInvoker<ListTransitIpTagsRequest, ListTransitIpTagsResponse>
     */
    public AsyncInvoker<ListTransitIpTagsRequest, ListTransitIpTagsResponse> listTransitIpTagsAsyncInvoker(
        ListTransitIpTagsRequest request) {
        return new AsyncInvoker<ListTransitIpTagsRequest, ListTransitIpTagsResponse>(request, NatMeta.listTransitIpTags,
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
     * @return CompletableFuture<ListTransitIpsByTagsResponse>
     */
    public CompletableFuture<ListTransitIpsByTagsResponse> listTransitIpsByTagsAsync(
        ListTransitIpsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listTransitIpsByTags);
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
     * @return AsyncInvoker<ListTransitIpsByTagsRequest, ListTransitIpsByTagsResponse>
     */
    public AsyncInvoker<ListTransitIpsByTagsRequest, ListTransitIpsByTagsResponse> listTransitIpsByTagsAsyncInvoker(
        ListTransitIpsByTagsRequest request) {
        return new AsyncInvoker<ListTransitIpsByTagsRequest, ListTransitIpsByTagsResponse>(request,
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
     * @return CompletableFuture<ShowTransitIpTagsResponse>
     */
    public CompletableFuture<ShowTransitIpTagsResponse> showTransitIpTagsAsync(ShowTransitIpTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.showTransitIpTags);
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
     * @return AsyncInvoker<ShowTransitIpTagsRequest, ShowTransitIpTagsResponse>
     */
    public AsyncInvoker<ShowTransitIpTagsRequest, ShowTransitIpTagsResponse> showTransitIpTagsAsyncInvoker(
        ShowTransitIpTagsRequest request) {
        return new AsyncInvoker<ShowTransitIpTagsRequest, ShowTransitIpTagsResponse>(request, NatMeta.showTransitIpTags,
            hcClient);
    }

    /**
     * 批量添加/删除公网NAT网关资源标签
     *
     * - 为指定公网NAT网关实例批量添加或删除标签。 
     * - 标签管理服务需要使用该接口批量管理实例的标签。 
     * - 一个资源上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateDeleteNatGatewayTagRequest 请求对象
     * @return CompletableFuture<BatchCreateDeleteNatGatewayTagResponse>
     */
    public CompletableFuture<BatchCreateDeleteNatGatewayTagResponse> batchCreateDeleteNatGatewayTagAsync(
        BatchCreateDeleteNatGatewayTagRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.batchCreateDeleteNatGatewayTag);
    }

    /**
     * 批量添加/删除公网NAT网关资源标签
     *
     * - 为指定公网NAT网关实例批量添加或删除标签。 
     * - 标签管理服务需要使用该接口批量管理实例的标签。 
     * - 一个资源上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateDeleteNatGatewayTagRequest 请求对象
     * @return AsyncInvoker<BatchCreateDeleteNatGatewayTagRequest, BatchCreateDeleteNatGatewayTagResponse>
     */
    public AsyncInvoker<BatchCreateDeleteNatGatewayTagRequest, BatchCreateDeleteNatGatewayTagResponse> batchCreateDeleteNatGatewayTagAsyncInvoker(
        BatchCreateDeleteNatGatewayTagRequest request) {
        return new AsyncInvoker<BatchCreateDeleteNatGatewayTagRequest, BatchCreateDeleteNatGatewayTagResponse>(request,
            NatMeta.batchCreateDeleteNatGatewayTag, hcClient);
    }

    /**
     * 添加公网NAT网关资源标签
     *
     * - 添加公网NAT网关资源标签。一个资源上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNatGatewayTagRequest 请求对象
     * @return CompletableFuture<CreateNatGatewayTagResponse>
     */
    public CompletableFuture<CreateNatGatewayTagResponse> createNatGatewayTagAsync(CreateNatGatewayTagRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.createNatGatewayTag);
    }

    /**
     * 添加公网NAT网关资源标签
     *
     * - 添加公网NAT网关资源标签。一个资源上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNatGatewayTagRequest 请求对象
     * @return AsyncInvoker<CreateNatGatewayTagRequest, CreateNatGatewayTagResponse>
     */
    public AsyncInvoker<CreateNatGatewayTagRequest, CreateNatGatewayTagResponse> createNatGatewayTagAsyncInvoker(
        CreateNatGatewayTagRequest request) {
        return new AsyncInvoker<CreateNatGatewayTagRequest, CreateNatGatewayTagResponse>(request,
            NatMeta.createNatGatewayTag, hcClient);
    }

    /**
     * 删除公网NAT网关资源标签
     *
     * - 删除指定公网NAT网关资源实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNatGatewayTagRequest 请求对象
     * @return CompletableFuture<DeleteNatGatewayTagResponse>
     */
    public CompletableFuture<DeleteNatGatewayTagResponse> deleteNatGatewayTagAsync(DeleteNatGatewayTagRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.deleteNatGatewayTag);
    }

    /**
     * 删除公网NAT网关资源标签
     *
     * - 删除指定公网NAT网关资源实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNatGatewayTagRequest 请求对象
     * @return AsyncInvoker<DeleteNatGatewayTagRequest, DeleteNatGatewayTagResponse>
     */
    public AsyncInvoker<DeleteNatGatewayTagRequest, DeleteNatGatewayTagResponse> deleteNatGatewayTagAsyncInvoker(
        DeleteNatGatewayTagRequest request) {
        return new AsyncInvoker<DeleteNatGatewayTagRequest, DeleteNatGatewayTagResponse>(request,
            NatMeta.deleteNatGatewayTag, hcClient);
    }

    /**
     * 查询公网NAT网关资源实例
     *
     * - 使用标签过滤公网NAT网关资源实例。
     * - 标签管理服务需要提供按标签过滤公网NAT网关服务实例并汇总显示在列表中，需要公网NAT网关服务提供查询能力。
     * - 资源默认按照创建时间倒序，资源tag也按照创建时间倒序。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewayByTagRequest 请求对象
     * @return CompletableFuture<ListNatGatewayByTagResponse>
     */
    public CompletableFuture<ListNatGatewayByTagResponse> listNatGatewayByTagAsync(ListNatGatewayByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listNatGatewayByTag);
    }

    /**
     * 查询公网NAT网关资源实例
     *
     * - 使用标签过滤公网NAT网关资源实例。
     * - 标签管理服务需要提供按标签过滤公网NAT网关服务实例并汇总显示在列表中，需要公网NAT网关服务提供查询能力。
     * - 资源默认按照创建时间倒序，资源tag也按照创建时间倒序。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewayByTagRequest 请求对象
     * @return AsyncInvoker<ListNatGatewayByTagRequest, ListNatGatewayByTagResponse>
     */
    public AsyncInvoker<ListNatGatewayByTagRequest, ListNatGatewayByTagResponse> listNatGatewayByTagAsyncInvoker(
        ListNatGatewayByTagRequest request) {
        return new AsyncInvoker<ListNatGatewayByTagRequest, ListNatGatewayByTagResponse>(request,
            NatMeta.listNatGatewayByTag, hcClient);
    }

    /**
     * 查询公网NAT网关项目标签
     *
     * - 查询租户在指定项目和公网NAT网关实例类型的所有标签集合。
     * - 标签管理服务需要能够列出当前租户全部已使用的标签集合，为各服务Console打标签和过滤实例时提供标签联想功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewayTagRequest 请求对象
     * @return CompletableFuture<ListNatGatewayTagResponse>
     */
    public CompletableFuture<ListNatGatewayTagResponse> listNatGatewayTagAsync(ListNatGatewayTagRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listNatGatewayTag);
    }

    /**
     * 查询公网NAT网关项目标签
     *
     * - 查询租户在指定项目和公网NAT网关实例类型的所有标签集合。
     * - 标签管理服务需要能够列出当前租户全部已使用的标签集合，为各服务Console打标签和过滤实例时提供标签联想功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNatGatewayTagRequest 请求对象
     * @return AsyncInvoker<ListNatGatewayTagRequest, ListNatGatewayTagResponse>
     */
    public AsyncInvoker<ListNatGatewayTagRequest, ListNatGatewayTagResponse> listNatGatewayTagAsyncInvoker(
        ListNatGatewayTagRequest request) {
        return new AsyncInvoker<ListNatGatewayTagRequest, ListNatGatewayTagResponse>(request, NatMeta.listNatGatewayTag,
            hcClient);
    }

    /**
     * 查询公网NAT网关资源标签
     *
     * - 查询指定公网NAT网关实例的标签信息。
     * - 标签管理服务需要使用该接口查询指定公网NAT网关实例的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNatGatewayTagRequest 请求对象
     * @return CompletableFuture<ShowNatGatewayTagResponse>
     */
    public CompletableFuture<ShowNatGatewayTagResponse> showNatGatewayTagAsync(ShowNatGatewayTagRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.showNatGatewayTag);
    }

    /**
     * 查询公网NAT网关资源标签
     *
     * - 查询指定公网NAT网关实例的标签信息。
     * - 标签管理服务需要使用该接口查询指定公网NAT网关实例的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNatGatewayTagRequest 请求对象
     * @return AsyncInvoker<ShowNatGatewayTagRequest, ShowNatGatewayTagResponse>
     */
    public AsyncInvoker<ShowNatGatewayTagRequest, ShowNatGatewayTagResponse> showNatGatewayTagAsyncInvoker(
        ShowNatGatewayTagRequest request) {
        return new AsyncInvoker<ShowNatGatewayTagRequest, ShowNatGatewayTagResponse>(request, NatMeta.showNatGatewayTag,
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
     * @return CompletableFuture<BatchCreateDeletePrivateNatTagsResponse>
     */
    public CompletableFuture<BatchCreateDeletePrivateNatTagsResponse> batchCreateDeletePrivateNatTagsAsync(
        BatchCreateDeletePrivateNatTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.batchCreateDeletePrivateNatTags);
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
     * @return AsyncInvoker<BatchCreateDeletePrivateNatTagsRequest, BatchCreateDeletePrivateNatTagsResponse>
     */
    public AsyncInvoker<BatchCreateDeletePrivateNatTagsRequest, BatchCreateDeletePrivateNatTagsResponse> batchCreateDeletePrivateNatTagsAsyncInvoker(
        BatchCreateDeletePrivateNatTagsRequest request) {
        return new AsyncInvoker<BatchCreateDeletePrivateNatTagsRequest, BatchCreateDeletePrivateNatTagsResponse>(
            request, NatMeta.batchCreateDeletePrivateNatTags, hcClient);
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
     * 创建私网NAT网关
     *
     * 创建私网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateNatRequest 请求对象
     * @return CompletableFuture<CreatePrivateNatResponse>
     */
    public CompletableFuture<CreatePrivateNatResponse> createPrivateNatAsync(CreatePrivateNatRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.createPrivateNat);
    }

    /**
     * 创建私网NAT网关
     *
     * 创建私网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateNatRequest 请求对象
     * @return AsyncInvoker<CreatePrivateNatRequest, CreatePrivateNatResponse>
     */
    public AsyncInvoker<CreatePrivateNatRequest, CreatePrivateNatResponse> createPrivateNatAsyncInvoker(
        CreatePrivateNatRequest request) {
        return new AsyncInvoker<CreatePrivateNatRequest, CreatePrivateNatResponse>(request, NatMeta.createPrivateNat,
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
     * @return CompletableFuture<CreatePrivateNatTagResponse>
     */
    public CompletableFuture<CreatePrivateNatTagResponse> createPrivateNatTagAsync(CreatePrivateNatTagRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.createPrivateNatTag);
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
     * @return AsyncInvoker<CreatePrivateNatTagRequest, CreatePrivateNatTagResponse>
     */
    public AsyncInvoker<CreatePrivateNatTagRequest, CreatePrivateNatTagResponse> createPrivateNatTagAsyncInvoker(
        CreatePrivateNatTagRequest request) {
        return new AsyncInvoker<CreatePrivateNatTagRequest, CreatePrivateNatTagResponse>(request,
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
     * 删除私网NAT网关
     *
     * 删除私网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateNatRequest 请求对象
     * @return CompletableFuture<DeletePrivateNatResponse>
     */
    public CompletableFuture<DeletePrivateNatResponse> deletePrivateNatAsync(DeletePrivateNatRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.deletePrivateNat);
    }

    /**
     * 删除私网NAT网关
     *
     * 删除私网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateNatRequest 请求对象
     * @return AsyncInvoker<DeletePrivateNatRequest, DeletePrivateNatResponse>
     */
    public AsyncInvoker<DeletePrivateNatRequest, DeletePrivateNatResponse> deletePrivateNatAsyncInvoker(
        DeletePrivateNatRequest request) {
        return new AsyncInvoker<DeletePrivateNatRequest, DeletePrivateNatResponse>(request, NatMeta.deletePrivateNat,
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
     * @return CompletableFuture<DeletePrivateNatTagResponse>
     */
    public CompletableFuture<DeletePrivateNatTagResponse> deletePrivateNatTagAsync(DeletePrivateNatTagRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.deletePrivateNatTag);
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
     * @return AsyncInvoker<DeletePrivateNatTagRequest, DeletePrivateNatTagResponse>
     */
    public AsyncInvoker<DeletePrivateNatTagRequest, DeletePrivateNatTagResponse> deletePrivateNatTagAsyncInvoker(
        DeletePrivateNatTagRequest request) {
        return new AsyncInvoker<DeletePrivateNatTagRequest, DeletePrivateNatTagResponse>(request,
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
     * 查询私网NAT网关项目标签
     *
     * - 查询租户在指定Project和实例类型的所有私网NAT网关标签集合。
     * - 标签管理服务需要能够列出当前租户全部已使用的私网NAT网关标签集合，为打私网NAT网关标签和过滤私网NAT网关实例时提供标签联想功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateNatTagsRequest 请求对象
     * @return CompletableFuture<ListPrivateNatTagsResponse>
     */
    public CompletableFuture<ListPrivateNatTagsResponse> listPrivateNatTagsAsync(ListPrivateNatTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listPrivateNatTags);
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
     * @return AsyncInvoker<ListPrivateNatTagsRequest, ListPrivateNatTagsResponse>
     */
    public AsyncInvoker<ListPrivateNatTagsRequest, ListPrivateNatTagsResponse> listPrivateNatTagsAsyncInvoker(
        ListPrivateNatTagsRequest request) {
        return new AsyncInvoker<ListPrivateNatTagsRequest, ListPrivateNatTagsResponse>(request,
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
     * @return CompletableFuture<ListPrivateNatsResponse>
     */
    public CompletableFuture<ListPrivateNatsResponse> listPrivateNatsAsync(ListPrivateNatsRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listPrivateNats);
    }

    /**
     * 查询私网NAT网关列表
     *
     * 查询私网NAT网关实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateNatsRequest 请求对象
     * @return AsyncInvoker<ListPrivateNatsRequest, ListPrivateNatsResponse>
     */
    public AsyncInvoker<ListPrivateNatsRequest, ListPrivateNatsResponse> listPrivateNatsAsyncInvoker(
        ListPrivateNatsRequest request) {
        return new AsyncInvoker<ListPrivateNatsRequest, ListPrivateNatsResponse>(request, NatMeta.listPrivateNats,
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
     * @return CompletableFuture<ListPrivateNatsByTagsResponse>
     */
    public CompletableFuture<ListPrivateNatsByTagsResponse> listPrivateNatsByTagsAsync(
        ListPrivateNatsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listPrivateNatsByTags);
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
     * @return AsyncInvoker<ListPrivateNatsByTagsRequest, ListPrivateNatsByTagsResponse>
     */
    public AsyncInvoker<ListPrivateNatsByTagsRequest, ListPrivateNatsByTagsResponse> listPrivateNatsByTagsAsyncInvoker(
        ListPrivateNatsByTagsRequest request) {
        return new AsyncInvoker<ListPrivateNatsByTagsRequest, ListPrivateNatsByTagsResponse>(request,
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
     * 查询指定的私网NAT网关详情
     *
     * 查询指定的私网NAT网关实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateNatRequest 请求对象
     * @return CompletableFuture<ShowPrivateNatResponse>
     */
    public CompletableFuture<ShowPrivateNatResponse> showPrivateNatAsync(ShowPrivateNatRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.showPrivateNat);
    }

    /**
     * 查询指定的私网NAT网关详情
     *
     * 查询指定的私网NAT网关实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateNatRequest 请求对象
     * @return AsyncInvoker<ShowPrivateNatRequest, ShowPrivateNatResponse>
     */
    public AsyncInvoker<ShowPrivateNatRequest, ShowPrivateNatResponse> showPrivateNatAsyncInvoker(
        ShowPrivateNatRequest request) {
        return new AsyncInvoker<ShowPrivateNatRequest, ShowPrivateNatResponse>(request, NatMeta.showPrivateNat,
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
     * @return CompletableFuture<ShowPrivateNatTagsResponse>
     */
    public CompletableFuture<ShowPrivateNatTagsResponse> showPrivateNatTagsAsync(ShowPrivateNatTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.showPrivateNatTags);
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
     * @return AsyncInvoker<ShowPrivateNatTagsRequest, ShowPrivateNatTagsResponse>
     */
    public AsyncInvoker<ShowPrivateNatTagsRequest, ShowPrivateNatTagsResponse> showPrivateNatTagsAsyncInvoker(
        ShowPrivateNatTagsRequest request) {
        return new AsyncInvoker<ShowPrivateNatTagsRequest, ShowPrivateNatTagsResponse>(request,
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
     * 更新私网NAT网关
     *
     * 更新私网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateNatRequest 请求对象
     * @return CompletableFuture<UpdatePrivateNatResponse>
     */
    public CompletableFuture<UpdatePrivateNatResponse> updatePrivateNatAsync(UpdatePrivateNatRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.updatePrivateNat);
    }

    /**
     * 更新私网NAT网关
     *
     * 更新私网NAT网关实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateNatRequest 请求对象
     * @return AsyncInvoker<UpdatePrivateNatRequest, UpdatePrivateNatResponse>
     */
    public AsyncInvoker<UpdatePrivateNatRequest, UpdatePrivateNatResponse> updatePrivateNatAsyncInvoker(
        UpdatePrivateNatRequest request) {
        return new AsyncInvoker<UpdatePrivateNatRequest, UpdatePrivateNatResponse>(request, NatMeta.updatePrivateNat,
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
     * @return CompletableFuture<CreateTransitIpResponse>
     */
    public CompletableFuture<CreateTransitIpResponse> createTransitIpAsync(CreateTransitIpRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.createTransitIp);
    }

    /**
     * 创建中转IP
     *
     * 创建中转IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTransitIpRequest 请求对象
     * @return AsyncInvoker<CreateTransitIpRequest, CreateTransitIpResponse>
     */
    public AsyncInvoker<CreateTransitIpRequest, CreateTransitIpResponse> createTransitIpAsyncInvoker(
        CreateTransitIpRequest request) {
        return new AsyncInvoker<CreateTransitIpRequest, CreateTransitIpResponse>(request, NatMeta.createTransitIp,
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
     * @return CompletableFuture<DeleteTransitIpResponse>
     */
    public CompletableFuture<DeleteTransitIpResponse> deleteTransitIpAsync(DeleteTransitIpRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.deleteTransitIp);
    }

    /**
     * 删除中转IP
     *
     * 删除中转IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTransitIpRequest 请求对象
     * @return AsyncInvoker<DeleteTransitIpRequest, DeleteTransitIpResponse>
     */
    public AsyncInvoker<DeleteTransitIpRequest, DeleteTransitIpResponse> deleteTransitIpAsyncInvoker(
        DeleteTransitIpRequest request) {
        return new AsyncInvoker<DeleteTransitIpRequest, DeleteTransitIpResponse>(request, NatMeta.deleteTransitIp,
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
     * @return CompletableFuture<ListTransitIpsResponse>
     */
    public CompletableFuture<ListTransitIpsResponse> listTransitIpsAsync(ListTransitIpsRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listTransitIps);
    }

    /**
     * 查询中转IP列表
     *
     * 查询中转IP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTransitIpsRequest 请求对象
     * @return AsyncInvoker<ListTransitIpsRequest, ListTransitIpsResponse>
     */
    public AsyncInvoker<ListTransitIpsRequest, ListTransitIpsResponse> listTransitIpsAsyncInvoker(
        ListTransitIpsRequest request) {
        return new AsyncInvoker<ListTransitIpsRequest, ListTransitIpsResponse>(request, NatMeta.listTransitIps,
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
     * @return CompletableFuture<ShowTransitIpResponse>
     */
    public CompletableFuture<ShowTransitIpResponse> showTransitIpAsync(ShowTransitIpRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.showTransitIp);
    }

    /**
     * 查询指定的中转IP详情
     *
     * 查询中转IP详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTransitIpRequest 请求对象
     * @return AsyncInvoker<ShowTransitIpRequest, ShowTransitIpResponse>
     */
    public AsyncInvoker<ShowTransitIpRequest, ShowTransitIpResponse> showTransitIpAsyncInvoker(
        ShowTransitIpRequest request) {
        return new AsyncInvoker<ShowTransitIpRequest, ShowTransitIpResponse>(request, NatMeta.showTransitIp, hcClient);
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
     * 创建SNAT规则
     *
     * 创建SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateSnatRequest 请求对象
     * @return CompletableFuture<CreatePrivateSnatResponse>
     */
    public CompletableFuture<CreatePrivateSnatResponse> createPrivateSnatAsync(CreatePrivateSnatRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.createPrivateSnat);
    }

    /**
     * 创建SNAT规则
     *
     * 创建SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateSnatRequest 请求对象
     * @return AsyncInvoker<CreatePrivateSnatRequest, CreatePrivateSnatResponse>
     */
    public AsyncInvoker<CreatePrivateSnatRequest, CreatePrivateSnatResponse> createPrivateSnatAsyncInvoker(
        CreatePrivateSnatRequest request) {
        return new AsyncInvoker<CreatePrivateSnatRequest, CreatePrivateSnatResponse>(request, NatMeta.createPrivateSnat,
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
     * 删除SNAT规则
     *
     * 删除指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateSnatRequest 请求对象
     * @return CompletableFuture<DeletePrivateSnatResponse>
     */
    public CompletableFuture<DeletePrivateSnatResponse> deletePrivateSnatAsync(DeletePrivateSnatRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.deletePrivateSnat);
    }

    /**
     * 删除SNAT规则
     *
     * 删除指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateSnatRequest 请求对象
     * @return AsyncInvoker<DeletePrivateSnatRequest, DeletePrivateSnatResponse>
     */
    public AsyncInvoker<DeletePrivateSnatRequest, DeletePrivateSnatResponse> deletePrivateSnatAsyncInvoker(
        DeletePrivateSnatRequest request) {
        return new AsyncInvoker<DeletePrivateSnatRequest, DeletePrivateSnatResponse>(request, NatMeta.deletePrivateSnat,
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
     * 查询SNAT规则列表
     *
     * 查询SNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateSnatsRequest 请求对象
     * @return CompletableFuture<ListPrivateSnatsResponse>
     */
    public CompletableFuture<ListPrivateSnatsResponse> listPrivateSnatsAsync(ListPrivateSnatsRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.listPrivateSnats);
    }

    /**
     * 查询SNAT规则列表
     *
     * 查询SNAT规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateSnatsRequest 请求对象
     * @return AsyncInvoker<ListPrivateSnatsRequest, ListPrivateSnatsResponse>
     */
    public AsyncInvoker<ListPrivateSnatsRequest, ListPrivateSnatsResponse> listPrivateSnatsAsyncInvoker(
        ListPrivateSnatsRequest request) {
        return new AsyncInvoker<ListPrivateSnatsRequest, ListPrivateSnatsResponse>(request, NatMeta.listPrivateSnats,
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
     * 查询指定的SNAT规则详情
     *
     * 查询指定的SNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateSnatRequest 请求对象
     * @return CompletableFuture<ShowPrivateSnatResponse>
     */
    public CompletableFuture<ShowPrivateSnatResponse> showPrivateSnatAsync(ShowPrivateSnatRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.showPrivateSnat);
    }

    /**
     * 查询指定的SNAT规则详情
     *
     * 查询指定的SNAT规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateSnatRequest 请求对象
     * @return AsyncInvoker<ShowPrivateSnatRequest, ShowPrivateSnatResponse>
     */
    public AsyncInvoker<ShowPrivateSnatRequest, ShowPrivateSnatResponse> showPrivateSnatAsyncInvoker(
        ShowPrivateSnatRequest request) {
        return new AsyncInvoker<ShowPrivateSnatRequest, ShowPrivateSnatResponse>(request, NatMeta.showPrivateSnat,
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

    /**
     * 更新SNAT规则
     *
     * 更新指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateSnatRequest 请求对象
     * @return CompletableFuture<UpdatePrivateSnatResponse>
     */
    public CompletableFuture<UpdatePrivateSnatResponse> updatePrivateSnatAsync(UpdatePrivateSnatRequest request) {
        return hcClient.asyncInvokeHttp(request, NatMeta.updatePrivateSnat);
    }

    /**
     * 更新SNAT规则
     *
     * 更新指定的SNAT规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateSnatRequest 请求对象
     * @return AsyncInvoker<UpdatePrivateSnatRequest, UpdatePrivateSnatResponse>
     */
    public AsyncInvoker<UpdatePrivateSnatRequest, UpdatePrivateSnatResponse> updatePrivateSnatAsyncInvoker(
        UpdatePrivateSnatRequest request) {
        return new AsyncInvoker<UpdatePrivateSnatRequest, UpdatePrivateSnatResponse>(request, NatMeta.updatePrivateSnat,
            hcClient);
    }

}
