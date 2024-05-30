package com.huaweicloud.sdk.cse.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.cse.v1.model.CreateEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.CreateGovernancePolicyRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateGovernancePolicyResponse;
import com.huaweicloud.sdk.cse.v1.model.CreateHttp2RpcRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateHttp2RpcResponse;
import com.huaweicloud.sdk.cse.v1.model.CreateMicroserviceRouteRuleRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateMicroserviceRouteRuleResponse;
import com.huaweicloud.sdk.cse.v1.model.CreateNacosNamespacesRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateNacosNamespacesResponse;
import com.huaweicloud.sdk.cse.v1.model.CreatePluginRequest;
import com.huaweicloud.sdk.cse.v1.model.CreatePluginResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteGovernancePolicyRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteGovernancePolicyResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteHttp2RpcRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteHttp2RpcResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteMicroserviceRouteRuleRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteMicroserviceRouteRuleResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteNacosNamespacesRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteNacosNamespacesResponse;
import com.huaweicloud.sdk.cse.v1.model.DeletePluginRequest;
import com.huaweicloud.sdk.cse.v1.model.DeletePluginResponse;
import com.huaweicloud.sdk.cse.v1.model.DownloadKieRequest;
import com.huaweicloud.sdk.cse.v1.model.DownloadKieResponse;
import com.huaweicloud.sdk.cse.v1.model.ListEnginesRequest;
import com.huaweicloud.sdk.cse.v1.model.ListEnginesResponse;
import com.huaweicloud.sdk.cse.v1.model.ListFlavorsRequest;
import com.huaweicloud.sdk.cse.v1.model.ListFlavorsResponse;
import com.huaweicloud.sdk.cse.v1.model.ListGovernancePolicyByPolicyIdRequest;
import com.huaweicloud.sdk.cse.v1.model.ListGovernancePolicyByPolicyIdResponse;
import com.huaweicloud.sdk.cse.v1.model.ListGovernancePolicyRequest;
import com.huaweicloud.sdk.cse.v1.model.ListGovernancePolicyResponse;
import com.huaweicloud.sdk.cse.v1.model.ListGovernancePolicysRequest;
import com.huaweicloud.sdk.cse.v1.model.ListGovernancePolicysResponse;
import com.huaweicloud.sdk.cse.v1.model.ListMicroserviceRouteRuleRequest;
import com.huaweicloud.sdk.cse.v1.model.ListMicroserviceRouteRuleResponse;
import com.huaweicloud.sdk.cse.v1.model.ListNacosNamespacesRequest;
import com.huaweicloud.sdk.cse.v1.model.ListNacosNamespacesResponse;
import com.huaweicloud.sdk.cse.v1.model.ModifyHttp2RpcRequest;
import com.huaweicloud.sdk.cse.v1.model.ModifyHttp2RpcResponse;
import com.huaweicloud.sdk.cse.v1.model.ModifyPluginRequest;
import com.huaweicloud.sdk.cse.v1.model.ModifyPluginResponse;
import com.huaweicloud.sdk.cse.v1.model.ResizeEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.ResizeEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.RetryEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.RetryEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineJobRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineJobResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineQuotasRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineQuotasResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowHttp2RpcsRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowHttp2RpcsResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowPluginsRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowPluginsResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowSinglePluginRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowSinglePluginResponse;
import com.huaweicloud.sdk.cse.v1.model.UpdateGovernancePolicyRequest;
import com.huaweicloud.sdk.cse.v1.model.UpdateGovernancePolicyResponse;
import com.huaweicloud.sdk.cse.v1.model.UpdateNacosNamespacesRequest;
import com.huaweicloud.sdk.cse.v1.model.UpdateNacosNamespacesResponse;
import com.huaweicloud.sdk.cse.v1.model.UpgradeEngineConfigRequest;
import com.huaweicloud.sdk.cse.v1.model.UpgradeEngineConfigResponse;
import com.huaweicloud.sdk.cse.v1.model.UpgradeEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.UpgradeEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.UploadKieRequest;
import com.huaweicloud.sdk.cse.v1.model.UploadKieResponse;

import java.util.concurrent.CompletableFuture;

public class CseAsyncClient {

    protected HcClient hcClient;

    public CseAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CseAsyncClient> newBuilder() {
        ClientBuilder<CseAsyncClient> clientBuilder = new ClientBuilder<>(CseAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建微服务引擎
     *
     * 创建微服务引擎，支持创建ServiceComb引擎专享版、注册配置中心、应用网关（公测）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEngineRequest 请求对象
     * @return CompletableFuture<CreateEngineResponse>
     */
    public CompletableFuture<CreateEngineResponse> createEngineAsync(CreateEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.createEngine);
    }

    /**
     * 创建微服务引擎
     *
     * 创建微服务引擎，支持创建ServiceComb引擎专享版、注册配置中心、应用网关（公测）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEngineRequest 请求对象
     * @return AsyncInvoker<CreateEngineRequest, CreateEngineResponse>
     */
    public AsyncInvoker<CreateEngineRequest, CreateEngineResponse> createEngineAsyncInvoker(
        CreateEngineRequest request) {
        return new AsyncInvoker<>(request, CseMeta.createEngine, hcClient);
    }

    /**
     * 创建治理策略
     *
     * 创建治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGovernancePolicyRequest 请求对象
     * @return CompletableFuture<CreateGovernancePolicyResponse>
     */
    public CompletableFuture<CreateGovernancePolicyResponse> createGovernancePolicyAsync(
        CreateGovernancePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.createGovernancePolicy);
    }

    /**
     * 创建治理策略
     *
     * 创建治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGovernancePolicyRequest 请求对象
     * @return AsyncInvoker<CreateGovernancePolicyRequest, CreateGovernancePolicyResponse>
     */
    public AsyncInvoker<CreateGovernancePolicyRequest, CreateGovernancePolicyResponse> createGovernancePolicyAsyncInvoker(
        CreateGovernancePolicyRequest request) {
        return new AsyncInvoker<>(request, CseMeta.createGovernancePolicy, hcClient);
    }

    /**
     * 创建灰度发布策略
     *
     * 创建灰度发布策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMicroserviceRouteRuleRequest 请求对象
     * @return CompletableFuture<CreateMicroserviceRouteRuleResponse>
     */
    public CompletableFuture<CreateMicroserviceRouteRuleResponse> createMicroserviceRouteRuleAsync(
        CreateMicroserviceRouteRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.createMicroserviceRouteRule);
    }

    /**
     * 创建灰度发布策略
     *
     * 创建灰度发布策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMicroserviceRouteRuleRequest 请求对象
     * @return AsyncInvoker<CreateMicroserviceRouteRuleRequest, CreateMicroserviceRouteRuleResponse>
     */
    public AsyncInvoker<CreateMicroserviceRouteRuleRequest, CreateMicroserviceRouteRuleResponse> createMicroserviceRouteRuleAsyncInvoker(
        CreateMicroserviceRouteRuleRequest request) {
        return new AsyncInvoker<>(request, CseMeta.createMicroserviceRouteRule, hcClient);
    }

    /**
     * 删除微服务引擎
     *
     * 删除微服务引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEngineRequest 请求对象
     * @return CompletableFuture<DeleteEngineResponse>
     */
    public CompletableFuture<DeleteEngineResponse> deleteEngineAsync(DeleteEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.deleteEngine);
    }

    /**
     * 删除微服务引擎
     *
     * 删除微服务引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEngineRequest 请求对象
     * @return AsyncInvoker<DeleteEngineRequest, DeleteEngineResponse>
     */
    public AsyncInvoker<DeleteEngineRequest, DeleteEngineResponse> deleteEngineAsyncInvoker(
        DeleteEngineRequest request) {
        return new AsyncInvoker<>(request, CseMeta.deleteEngine, hcClient);
    }

    /**
     * 删除治理策略
     *
     * 删除治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGovernancePolicyRequest 请求对象
     * @return CompletableFuture<DeleteGovernancePolicyResponse>
     */
    public CompletableFuture<DeleteGovernancePolicyResponse> deleteGovernancePolicyAsync(
        DeleteGovernancePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.deleteGovernancePolicy);
    }

    /**
     * 删除治理策略
     *
     * 删除治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGovernancePolicyRequest 请求对象
     * @return AsyncInvoker<DeleteGovernancePolicyRequest, DeleteGovernancePolicyResponse>
     */
    public AsyncInvoker<DeleteGovernancePolicyRequest, DeleteGovernancePolicyResponse> deleteGovernancePolicyAsyncInvoker(
        DeleteGovernancePolicyRequest request) {
        return new AsyncInvoker<>(request, CseMeta.deleteGovernancePolicy, hcClient);
    }

    /**
     * 删除灰度发布策略
     *
     * 删除灰度发布策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMicroserviceRouteRuleRequest 请求对象
     * @return CompletableFuture<DeleteMicroserviceRouteRuleResponse>
     */
    public CompletableFuture<DeleteMicroserviceRouteRuleResponse> deleteMicroserviceRouteRuleAsync(
        DeleteMicroserviceRouteRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.deleteMicroserviceRouteRule);
    }

    /**
     * 删除灰度发布策略
     *
     * 删除灰度发布策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMicroserviceRouteRuleRequest 请求对象
     * @return AsyncInvoker<DeleteMicroserviceRouteRuleRequest, DeleteMicroserviceRouteRuleResponse>
     */
    public AsyncInvoker<DeleteMicroserviceRouteRuleRequest, DeleteMicroserviceRouteRuleResponse> deleteMicroserviceRouteRuleAsyncInvoker(
        DeleteMicroserviceRouteRuleRequest request) {
        return new AsyncInvoker<>(request, CseMeta.deleteMicroserviceRouteRule, hcClient);
    }

    /**
     * 导出kie配置
     *
     * 导出kie配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadKieRequest 请求对象
     * @return CompletableFuture<DownloadKieResponse>
     */
    public CompletableFuture<DownloadKieResponse> downloadKieAsync(DownloadKieRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.downloadKie);
    }

    /**
     * 导出kie配置
     *
     * 导出kie配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadKieRequest 请求对象
     * @return AsyncInvoker<DownloadKieRequest, DownloadKieResponse>
     */
    public AsyncInvoker<DownloadKieRequest, DownloadKieResponse> downloadKieAsyncInvoker(DownloadKieRequest request) {
        return new AsyncInvoker<>(request, CseMeta.downloadKie, hcClient);
    }

    /**
     * 查询微服务引擎列表
     *
     * 查询微服务引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnginesRequest 请求对象
     * @return CompletableFuture<ListEnginesResponse>
     */
    public CompletableFuture<ListEnginesResponse> listEnginesAsync(ListEnginesRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.listEngines);
    }

    /**
     * 查询微服务引擎列表
     *
     * 查询微服务引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnginesRequest 请求对象
     * @return AsyncInvoker<ListEnginesRequest, ListEnginesResponse>
     */
    public AsyncInvoker<ListEnginesRequest, ListEnginesResponse> listEnginesAsyncInvoker(ListEnginesRequest request) {
        return new AsyncInvoker<>(request, CseMeta.listEngines, hcClient);
    }

    /**
     * 查询微服务引擎的规格列表
     *
     * 查询微服务引擎的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.listFlavors);
    }

    /**
     * 查询微服务引擎的规格列表
     *
     * 查询微服务引擎的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<>(request, CseMeta.listFlavors, hcClient);
    }

    /**
     * 查询指定类型治理策略列表
     *
     * 查询指定类型治理策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGovernancePolicyRequest 请求对象
     * @return CompletableFuture<ListGovernancePolicyResponse>
     */
    public CompletableFuture<ListGovernancePolicyResponse> listGovernancePolicyAsync(
        ListGovernancePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.listGovernancePolicy);
    }

    /**
     * 查询指定类型治理策略列表
     *
     * 查询指定类型治理策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGovernancePolicyRequest 请求对象
     * @return AsyncInvoker<ListGovernancePolicyRequest, ListGovernancePolicyResponse>
     */
    public AsyncInvoker<ListGovernancePolicyRequest, ListGovernancePolicyResponse> listGovernancePolicyAsyncInvoker(
        ListGovernancePolicyRequest request) {
        return new AsyncInvoker<>(request, CseMeta.listGovernancePolicy, hcClient);
    }

    /**
     * 查询治理策略详情
     *
     * 查询治理策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGovernancePolicyByPolicyIdRequest 请求对象
     * @return CompletableFuture<ListGovernancePolicyByPolicyIdResponse>
     */
    public CompletableFuture<ListGovernancePolicyByPolicyIdResponse> listGovernancePolicyByPolicyIdAsync(
        ListGovernancePolicyByPolicyIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.listGovernancePolicyByPolicyId);
    }

    /**
     * 查询治理策略详情
     *
     * 查询治理策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGovernancePolicyByPolicyIdRequest 请求对象
     * @return AsyncInvoker<ListGovernancePolicyByPolicyIdRequest, ListGovernancePolicyByPolicyIdResponse>
     */
    public AsyncInvoker<ListGovernancePolicyByPolicyIdRequest, ListGovernancePolicyByPolicyIdResponse> listGovernancePolicyByPolicyIdAsyncInvoker(
        ListGovernancePolicyByPolicyIdRequest request) {
        return new AsyncInvoker<>(request, CseMeta.listGovernancePolicyByPolicyId, hcClient);
    }

    /**
     * 查询治理策略列表
     *
     * 查询治理策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGovernancePolicysRequest 请求对象
     * @return CompletableFuture<ListGovernancePolicysResponse>
     */
    public CompletableFuture<ListGovernancePolicysResponse> listGovernancePolicysAsync(
        ListGovernancePolicysRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.listGovernancePolicys);
    }

    /**
     * 查询治理策略列表
     *
     * 查询治理策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGovernancePolicysRequest 请求对象
     * @return AsyncInvoker<ListGovernancePolicysRequest, ListGovernancePolicysResponse>
     */
    public AsyncInvoker<ListGovernancePolicysRequest, ListGovernancePolicysResponse> listGovernancePolicysAsyncInvoker(
        ListGovernancePolicysRequest request) {
        return new AsyncInvoker<>(request, CseMeta.listGovernancePolicys, hcClient);
    }

    /**
     * 查询微服务的灰度发布规则
     *
     * 查询微服务的灰度发布规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMicroserviceRouteRuleRequest 请求对象
     * @return CompletableFuture<ListMicroserviceRouteRuleResponse>
     */
    public CompletableFuture<ListMicroserviceRouteRuleResponse> listMicroserviceRouteRuleAsync(
        ListMicroserviceRouteRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.listMicroserviceRouteRule);
    }

    /**
     * 查询微服务的灰度发布规则
     *
     * 查询微服务的灰度发布规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMicroserviceRouteRuleRequest 请求对象
     * @return AsyncInvoker<ListMicroserviceRouteRuleRequest, ListMicroserviceRouteRuleResponse>
     */
    public AsyncInvoker<ListMicroserviceRouteRuleRequest, ListMicroserviceRouteRuleResponse> listMicroserviceRouteRuleAsyncInvoker(
        ListMicroserviceRouteRuleRequest request) {
        return new AsyncInvoker<>(request, CseMeta.listMicroserviceRouteRule, hcClient);
    }

    /**
     * 变更微服务引擎规格
     *
     * 变更微服务引擎规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeEngineRequest 请求对象
     * @return CompletableFuture<ResizeEngineResponse>
     */
    public CompletableFuture<ResizeEngineResponse> resizeEngineAsync(ResizeEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.resizeEngine);
    }

    /**
     * 变更微服务引擎规格
     *
     * 变更微服务引擎规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeEngineRequest 请求对象
     * @return AsyncInvoker<ResizeEngineRequest, ResizeEngineResponse>
     */
    public AsyncInvoker<ResizeEngineRequest, ResizeEngineResponse> resizeEngineAsyncInvoker(
        ResizeEngineRequest request) {
        return new AsyncInvoker<>(request, CseMeta.resizeEngine, hcClient);
    }

    /**
     * 对微服务引擎进行重试
     *
     * 对微服务引擎进行重试，当前支持ServiceComb专享版引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryEngineRequest 请求对象
     * @return CompletableFuture<RetryEngineResponse>
     */
    public CompletableFuture<RetryEngineResponse> retryEngineAsync(RetryEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.retryEngine);
    }

    /**
     * 对微服务引擎进行重试
     *
     * 对微服务引擎进行重试，当前支持ServiceComb专享版引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryEngineRequest 请求对象
     * @return AsyncInvoker<RetryEngineRequest, RetryEngineResponse>
     */
    public AsyncInvoker<RetryEngineRequest, RetryEngineResponse> retryEngineAsyncInvoker(RetryEngineRequest request) {
        return new AsyncInvoker<>(request, CseMeta.retryEngine, hcClient);
    }

    /**
     * 查询微服务引擎详情
     *
     * 查询微服务引擎详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineRequest 请求对象
     * @return CompletableFuture<ShowEngineResponse>
     */
    public CompletableFuture<ShowEngineResponse> showEngineAsync(ShowEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.showEngine);
    }

    /**
     * 查询微服务引擎详情
     *
     * 查询微服务引擎详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineRequest 请求对象
     * @return AsyncInvoker<ShowEngineRequest, ShowEngineResponse>
     */
    public AsyncInvoker<ShowEngineRequest, ShowEngineResponse> showEngineAsyncInvoker(ShowEngineRequest request) {
        return new AsyncInvoker<>(request, CseMeta.showEngine, hcClient);
    }

    /**
     * 查询微服务引擎任务详情
     *
     * 查询微服务引擎任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineJobRequest 请求对象
     * @return CompletableFuture<ShowEngineJobResponse>
     */
    public CompletableFuture<ShowEngineJobResponse> showEngineJobAsync(ShowEngineJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.showEngineJob);
    }

    /**
     * 查询微服务引擎任务详情
     *
     * 查询微服务引擎任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineJobRequest 请求对象
     * @return AsyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse>
     */
    public AsyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse> showEngineJobAsyncInvoker(
        ShowEngineJobRequest request) {
        return new AsyncInvoker<>(request, CseMeta.showEngineJob, hcClient);
    }

    /**
     * 查询微服务引擎配额
     *
     * 查询微服务引擎配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineQuotasRequest 请求对象
     * @return CompletableFuture<ShowEngineQuotasResponse>
     */
    public CompletableFuture<ShowEngineQuotasResponse> showEngineQuotasAsync(ShowEngineQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.showEngineQuotas);
    }

    /**
     * 查询微服务引擎配额
     *
     * 查询微服务引擎配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineQuotasRequest 请求对象
     * @return AsyncInvoker<ShowEngineQuotasRequest, ShowEngineQuotasResponse>
     */
    public AsyncInvoker<ShowEngineQuotasRequest, ShowEngineQuotasResponse> showEngineQuotasAsyncInvoker(
        ShowEngineQuotasRequest request) {
        return new AsyncInvoker<>(request, CseMeta.showEngineQuotas, hcClient);
    }

    /**
     * 修改治理策略
     *
     * 修改治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGovernancePolicyRequest 请求对象
     * @return CompletableFuture<UpdateGovernancePolicyResponse>
     */
    public CompletableFuture<UpdateGovernancePolicyResponse> updateGovernancePolicyAsync(
        UpdateGovernancePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.updateGovernancePolicy);
    }

    /**
     * 修改治理策略
     *
     * 修改治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGovernancePolicyRequest 请求对象
     * @return AsyncInvoker<UpdateGovernancePolicyRequest, UpdateGovernancePolicyResponse>
     */
    public AsyncInvoker<UpdateGovernancePolicyRequest, UpdateGovernancePolicyResponse> updateGovernancePolicyAsyncInvoker(
        UpdateGovernancePolicyRequest request) {
        return new AsyncInvoker<>(request, CseMeta.updateGovernancePolicy, hcClient);
    }

    /**
     * 升级微服务引擎
     *
     * 升级微服务引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeEngineRequest 请求对象
     * @return CompletableFuture<UpgradeEngineResponse>
     */
    public CompletableFuture<UpgradeEngineResponse> upgradeEngineAsync(UpgradeEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.upgradeEngine);
    }

    /**
     * 升级微服务引擎
     *
     * 升级微服务引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeEngineRequest 请求对象
     * @return AsyncInvoker<UpgradeEngineRequest, UpgradeEngineResponse>
     */
    public AsyncInvoker<UpgradeEngineRequest, UpgradeEngineResponse> upgradeEngineAsyncInvoker(
        UpgradeEngineRequest request) {
        return new AsyncInvoker<>(request, CseMeta.upgradeEngine, hcClient);
    }

    /**
     * 更新微服务引擎配置
     *
     * 更新微服务引擎配置，更新ServiceComb专享版引擎与注册配置中心引擎的配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeEngineConfigRequest 请求对象
     * @return CompletableFuture<UpgradeEngineConfigResponse>
     */
    public CompletableFuture<UpgradeEngineConfigResponse> upgradeEngineConfigAsync(UpgradeEngineConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.upgradeEngineConfig);
    }

    /**
     * 更新微服务引擎配置
     *
     * 更新微服务引擎配置，更新ServiceComb专享版引擎与注册配置中心引擎的配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeEngineConfigRequest 请求对象
     * @return AsyncInvoker<UpgradeEngineConfigRequest, UpgradeEngineConfigResponse>
     */
    public AsyncInvoker<UpgradeEngineConfigRequest, UpgradeEngineConfigResponse> upgradeEngineConfigAsyncInvoker(
        UpgradeEngineConfigRequest request) {
        return new AsyncInvoker<>(request, CseMeta.upgradeEngineConfig, hcClient);
    }

    /**
     * 导入kie配置
     *
     * 导入kie配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadKieRequest 请求对象
     * @return CompletableFuture<UploadKieResponse>
     */
    public CompletableFuture<UploadKieResponse> uploadKieAsync(UploadKieRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.uploadKie);
    }

    /**
     * 导入kie配置
     *
     * 导入kie配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadKieRequest 请求对象
     * @return AsyncInvoker<UploadKieRequest, UploadKieResponse>
     */
    public AsyncInvoker<UploadKieRequest, UploadKieResponse> uploadKieAsyncInvoker(UploadKieRequest request) {
        return new AsyncInvoker<>(request, CseMeta.uploadKie, hcClient);
    }

    /**
     * 创建http转rpc方法
     *
     * 创建http转rpc方法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttp2RpcRequest 请求对象
     * @return CompletableFuture<CreateHttp2RpcResponse>
     */
    public CompletableFuture<CreateHttp2RpcResponse> createHttp2RpcAsync(CreateHttp2RpcRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.createHttp2Rpc);
    }

    /**
     * 创建http转rpc方法
     *
     * 创建http转rpc方法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttp2RpcRequest 请求对象
     * @return AsyncInvoker<CreateHttp2RpcRequest, CreateHttp2RpcResponse>
     */
    public AsyncInvoker<CreateHttp2RpcRequest, CreateHttp2RpcResponse> createHttp2RpcAsyncInvoker(
        CreateHttp2RpcRequest request) {
        return new AsyncInvoker<>(request, CseMeta.createHttp2Rpc, hcClient);
    }

    /**
     * 创建插件
     *
     * 创建插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePluginRequest 请求对象
     * @return CompletableFuture<CreatePluginResponse>
     */
    public CompletableFuture<CreatePluginResponse> createPluginAsync(CreatePluginRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.createPlugin);
    }

    /**
     * 创建插件
     *
     * 创建插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePluginRequest 请求对象
     * @return AsyncInvoker<CreatePluginRequest, CreatePluginResponse>
     */
    public AsyncInvoker<CreatePluginRequest, CreatePluginResponse> createPluginAsyncInvoker(
        CreatePluginRequest request) {
        return new AsyncInvoker<>(request, CseMeta.createPlugin, hcClient);
    }

    /**
     * 删除http转rpc方法
     *
     * 删除http转rpc方法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttp2RpcRequest 请求对象
     * @return CompletableFuture<DeleteHttp2RpcResponse>
     */
    public CompletableFuture<DeleteHttp2RpcResponse> deleteHttp2RpcAsync(DeleteHttp2RpcRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.deleteHttp2Rpc);
    }

    /**
     * 删除http转rpc方法
     *
     * 删除http转rpc方法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttp2RpcRequest 请求对象
     * @return AsyncInvoker<DeleteHttp2RpcRequest, DeleteHttp2RpcResponse>
     */
    public AsyncInvoker<DeleteHttp2RpcRequest, DeleteHttp2RpcResponse> deleteHttp2RpcAsyncInvoker(
        DeleteHttp2RpcRequest request) {
        return new AsyncInvoker<>(request, CseMeta.deleteHttp2Rpc, hcClient);
    }

    /**
     * 删除插件
     *
     * 删除插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePluginRequest 请求对象
     * @return CompletableFuture<DeletePluginResponse>
     */
    public CompletableFuture<DeletePluginResponse> deletePluginAsync(DeletePluginRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.deletePlugin);
    }

    /**
     * 删除插件
     *
     * 删除插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePluginRequest 请求对象
     * @return AsyncInvoker<DeletePluginRequest, DeletePluginResponse>
     */
    public AsyncInvoker<DeletePluginRequest, DeletePluginResponse> deletePluginAsyncInvoker(
        DeletePluginRequest request) {
        return new AsyncInvoker<>(request, CseMeta.deletePlugin, hcClient);
    }

    /**
     * 修改http转rpc方法
     *
     * 修改http转rpc方法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyHttp2RpcRequest 请求对象
     * @return CompletableFuture<ModifyHttp2RpcResponse>
     */
    public CompletableFuture<ModifyHttp2RpcResponse> modifyHttp2RpcAsync(ModifyHttp2RpcRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.modifyHttp2Rpc);
    }

    /**
     * 修改http转rpc方法
     *
     * 修改http转rpc方法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyHttp2RpcRequest 请求对象
     * @return AsyncInvoker<ModifyHttp2RpcRequest, ModifyHttp2RpcResponse>
     */
    public AsyncInvoker<ModifyHttp2RpcRequest, ModifyHttp2RpcResponse> modifyHttp2RpcAsyncInvoker(
        ModifyHttp2RpcRequest request) {
        return new AsyncInvoker<>(request, CseMeta.modifyHttp2Rpc, hcClient);
    }

    /**
     * 修改插件
     *
     * 修改插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyPluginRequest 请求对象
     * @return CompletableFuture<ModifyPluginResponse>
     */
    public CompletableFuture<ModifyPluginResponse> modifyPluginAsync(ModifyPluginRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.modifyPlugin);
    }

    /**
     * 修改插件
     *
     * 修改插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyPluginRequest 请求对象
     * @return AsyncInvoker<ModifyPluginRequest, ModifyPluginResponse>
     */
    public AsyncInvoker<ModifyPluginRequest, ModifyPluginResponse> modifyPluginAsyncInvoker(
        ModifyPluginRequest request) {
        return new AsyncInvoker<>(request, CseMeta.modifyPlugin, hcClient);
    }

    /**
     * 查询http2rpc资源列表
     *
     * 查询http转rpc资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttp2RpcsRequest 请求对象
     * @return CompletableFuture<ShowHttp2RpcsResponse>
     */
    public CompletableFuture<ShowHttp2RpcsResponse> showHttp2RpcsAsync(ShowHttp2RpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.showHttp2Rpcs);
    }

    /**
     * 查询http2rpc资源列表
     *
     * 查询http转rpc资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttp2RpcsRequest 请求对象
     * @return AsyncInvoker<ShowHttp2RpcsRequest, ShowHttp2RpcsResponse>
     */
    public AsyncInvoker<ShowHttp2RpcsRequest, ShowHttp2RpcsResponse> showHttp2RpcsAsyncInvoker(
        ShowHttp2RpcsRequest request) {
        return new AsyncInvoker<>(request, CseMeta.showHttp2Rpcs, hcClient);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPluginsRequest 请求对象
     * @return CompletableFuture<ShowPluginsResponse>
     */
    public CompletableFuture<ShowPluginsResponse> showPluginsAsync(ShowPluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.showPlugins);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPluginsRequest 请求对象
     * @return AsyncInvoker<ShowPluginsRequest, ShowPluginsResponse>
     */
    public AsyncInvoker<ShowPluginsRequest, ShowPluginsResponse> showPluginsAsyncInvoker(ShowPluginsRequest request) {
        return new AsyncInvoker<>(request, CseMeta.showPlugins, hcClient);
    }

    /**
     * 查询单个插件
     *
     * 查询单个插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSinglePluginRequest 请求对象
     * @return CompletableFuture<ShowSinglePluginResponse>
     */
    public CompletableFuture<ShowSinglePluginResponse> showSinglePluginAsync(ShowSinglePluginRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.showSinglePlugin);
    }

    /**
     * 查询单个插件
     *
     * 查询单个插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSinglePluginRequest 请求对象
     * @return AsyncInvoker<ShowSinglePluginRequest, ShowSinglePluginResponse>
     */
    public AsyncInvoker<ShowSinglePluginRequest, ShowSinglePluginResponse> showSinglePluginAsyncInvoker(
        ShowSinglePluginRequest request) {
        return new AsyncInvoker<>(request, CseMeta.showSinglePlugin, hcClient);
    }

    /**
     * 创建nacos命名空间
     *
     * 创建nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNacosNamespacesRequest 请求对象
     * @return CompletableFuture<CreateNacosNamespacesResponse>
     */
    public CompletableFuture<CreateNacosNamespacesResponse> createNacosNamespacesAsync(
        CreateNacosNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.createNacosNamespaces);
    }

    /**
     * 创建nacos命名空间
     *
     * 创建nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNacosNamespacesRequest 请求对象
     * @return AsyncInvoker<CreateNacosNamespacesRequest, CreateNacosNamespacesResponse>
     */
    public AsyncInvoker<CreateNacosNamespacesRequest, CreateNacosNamespacesResponse> createNacosNamespacesAsyncInvoker(
        CreateNacosNamespacesRequest request) {
        return new AsyncInvoker<>(request, CseMeta.createNacosNamespaces, hcClient);
    }

    /**
     * 删除nacos命名空间
     *
     * 删除nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNacosNamespacesRequest 请求对象
     * @return CompletableFuture<DeleteNacosNamespacesResponse>
     */
    public CompletableFuture<DeleteNacosNamespacesResponse> deleteNacosNamespacesAsync(
        DeleteNacosNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.deleteNacosNamespaces);
    }

    /**
     * 删除nacos命名空间
     *
     * 删除nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNacosNamespacesRequest 请求对象
     * @return AsyncInvoker<DeleteNacosNamespacesRequest, DeleteNacosNamespacesResponse>
     */
    public AsyncInvoker<DeleteNacosNamespacesRequest, DeleteNacosNamespacesResponse> deleteNacosNamespacesAsyncInvoker(
        DeleteNacosNamespacesRequest request) {
        return new AsyncInvoker<>(request, CseMeta.deleteNacosNamespaces, hcClient);
    }

    /**
     * 查询nacos命名空间
     *
     * 查询nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNacosNamespacesRequest 请求对象
     * @return CompletableFuture<ListNacosNamespacesResponse>
     */
    public CompletableFuture<ListNacosNamespacesResponse> listNacosNamespacesAsync(ListNacosNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.listNacosNamespaces);
    }

    /**
     * 查询nacos命名空间
     *
     * 查询nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNacosNamespacesRequest 请求对象
     * @return AsyncInvoker<ListNacosNamespacesRequest, ListNacosNamespacesResponse>
     */
    public AsyncInvoker<ListNacosNamespacesRequest, ListNacosNamespacesResponse> listNacosNamespacesAsyncInvoker(
        ListNacosNamespacesRequest request) {
        return new AsyncInvoker<>(request, CseMeta.listNacosNamespaces, hcClient);
    }

    /**
     * 更新nacos命名空间
     *
     * 更新nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNacosNamespacesRequest 请求对象
     * @return CompletableFuture<UpdateNacosNamespacesResponse>
     */
    public CompletableFuture<UpdateNacosNamespacesResponse> updateNacosNamespacesAsync(
        UpdateNacosNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.updateNacosNamespaces);
    }

    /**
     * 更新nacos命名空间
     *
     * 更新nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNacosNamespacesRequest 请求对象
     * @return AsyncInvoker<UpdateNacosNamespacesRequest, UpdateNacosNamespacesResponse>
     */
    public AsyncInvoker<UpdateNacosNamespacesRequest, UpdateNacosNamespacesResponse> updateNacosNamespacesAsyncInvoker(
        UpdateNacosNamespacesRequest request) {
        return new AsyncInvoker<>(request, CseMeta.updateNacosNamespaces, hcClient);
    }

}
