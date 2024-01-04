package com.huaweicloud.sdk.cse.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.cse.v1.model.CreateEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.CreateGovernancePolicyRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateGovernancePolicyResponse;
import com.huaweicloud.sdk.cse.v1.model.CreateMicroserviceRouteRuleRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateMicroserviceRouteRuleResponse;
import com.huaweicloud.sdk.cse.v1.model.CreateNacosNamespacesRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateNacosNamespacesResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteGovernancePolicyRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteGovernancePolicyResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteMicroserviceRouteRuleRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteMicroserviceRouteRuleResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteNacosNamespacesRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteNacosNamespacesResponse;
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
     * 创建微服务引擎专享版
     *
     * 创建微服务引擎专享版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEngineRequest 请求对象
     * @return CompletableFuture<CreateEngineResponse>
     */
    public CompletableFuture<CreateEngineResponse> createEngineAsync(CreateEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.createEngine);
    }

    /**
     * 创建微服务引擎专享版
     *
     * 创建微服务引擎专享版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEngineRequest 请求对象
     * @return AsyncInvoker<CreateEngineRequest, CreateEngineResponse>
     */
    public AsyncInvoker<CreateEngineRequest, CreateEngineResponse> createEngineAsyncInvoker(
        CreateEngineRequest request) {
        return new AsyncInvoker<CreateEngineRequest, CreateEngineResponse>(request, CseMeta.createEngine, hcClient);
    }

    /**
     * 创建治理策略
     *
     * 创建治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGovernancePolicyRequest 请求对象
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
     * @param CreateGovernancePolicyRequest 请求对象
     * @return AsyncInvoker<CreateGovernancePolicyRequest, CreateGovernancePolicyResponse>
     */
    public AsyncInvoker<CreateGovernancePolicyRequest, CreateGovernancePolicyResponse> createGovernancePolicyAsyncInvoker(
        CreateGovernancePolicyRequest request) {
        return new AsyncInvoker<CreateGovernancePolicyRequest, CreateGovernancePolicyResponse>(request,
            CseMeta.createGovernancePolicy, hcClient);
    }

    /**
     * 创建灰度发布策略
     *
     * 创建灰度发布策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMicroserviceRouteRuleRequest 请求对象
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
     * @param CreateMicroserviceRouteRuleRequest 请求对象
     * @return AsyncInvoker<CreateMicroserviceRouteRuleRequest, CreateMicroserviceRouteRuleResponse>
     */
    public AsyncInvoker<CreateMicroserviceRouteRuleRequest, CreateMicroserviceRouteRuleResponse> createMicroserviceRouteRuleAsyncInvoker(
        CreateMicroserviceRouteRuleRequest request) {
        return new AsyncInvoker<CreateMicroserviceRouteRuleRequest, CreateMicroserviceRouteRuleResponse>(request,
            CseMeta.createMicroserviceRouteRule, hcClient);
    }

    /**
     * 删除微服务引擎专享版
     *
     * 删除微服务引擎专享版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEngineRequest 请求对象
     * @return CompletableFuture<DeleteEngineResponse>
     */
    public CompletableFuture<DeleteEngineResponse> deleteEngineAsync(DeleteEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.deleteEngine);
    }

    /**
     * 删除微服务引擎专享版
     *
     * 删除微服务引擎专享版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEngineRequest 请求对象
     * @return AsyncInvoker<DeleteEngineRequest, DeleteEngineResponse>
     */
    public AsyncInvoker<DeleteEngineRequest, DeleteEngineResponse> deleteEngineAsyncInvoker(
        DeleteEngineRequest request) {
        return new AsyncInvoker<DeleteEngineRequest, DeleteEngineResponse>(request, CseMeta.deleteEngine, hcClient);
    }

    /**
     * 删除治理策略
     *
     * 删除治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGovernancePolicyRequest 请求对象
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
     * @param DeleteGovernancePolicyRequest 请求对象
     * @return AsyncInvoker<DeleteGovernancePolicyRequest, DeleteGovernancePolicyResponse>
     */
    public AsyncInvoker<DeleteGovernancePolicyRequest, DeleteGovernancePolicyResponse> deleteGovernancePolicyAsyncInvoker(
        DeleteGovernancePolicyRequest request) {
        return new AsyncInvoker<DeleteGovernancePolicyRequest, DeleteGovernancePolicyResponse>(request,
            CseMeta.deleteGovernancePolicy, hcClient);
    }

    /**
     * 删除灰度发布策略
     *
     * 删除灰度发布策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMicroserviceRouteRuleRequest 请求对象
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
     * @param DeleteMicroserviceRouteRuleRequest 请求对象
     * @return AsyncInvoker<DeleteMicroserviceRouteRuleRequest, DeleteMicroserviceRouteRuleResponse>
     */
    public AsyncInvoker<DeleteMicroserviceRouteRuleRequest, DeleteMicroserviceRouteRuleResponse> deleteMicroserviceRouteRuleAsyncInvoker(
        DeleteMicroserviceRouteRuleRequest request) {
        return new AsyncInvoker<DeleteMicroserviceRouteRuleRequest, DeleteMicroserviceRouteRuleResponse>(request,
            CseMeta.deleteMicroserviceRouteRule, hcClient);
    }

    /**
     * 导出kie配置
     *
     * 导出kie配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadKieRequest 请求对象
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
     * @param DownloadKieRequest 请求对象
     * @return AsyncInvoker<DownloadKieRequest, DownloadKieResponse>
     */
    public AsyncInvoker<DownloadKieRequest, DownloadKieResponse> downloadKieAsyncInvoker(DownloadKieRequest request) {
        return new AsyncInvoker<DownloadKieRequest, DownloadKieResponse>(request, CseMeta.downloadKie, hcClient);
    }

    /**
     * 查询微服务引擎列表
     *
     * 查询微服务引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnginesRequest 请求对象
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
     * @param ListEnginesRequest 请求对象
     * @return AsyncInvoker<ListEnginesRequest, ListEnginesResponse>
     */
    public AsyncInvoker<ListEnginesRequest, ListEnginesResponse> listEnginesAsyncInvoker(ListEnginesRequest request) {
        return new AsyncInvoker<ListEnginesRequest, ListEnginesResponse>(request, CseMeta.listEngines, hcClient);
    }

    /**
     * 查询微服务引擎专享版的规格列表
     *
     * 查询微服务引擎专享版的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.listFlavors);
    }

    /**
     * 查询微服务引擎专享版的规格列表
     *
     * 查询微服务引擎专享版的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, CseMeta.listFlavors, hcClient);
    }

    /**
     * 查询指定类型治理策略列表
     *
     * 查询指定类型治理策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGovernancePolicyRequest 请求对象
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
     * @param ListGovernancePolicyRequest 请求对象
     * @return AsyncInvoker<ListGovernancePolicyRequest, ListGovernancePolicyResponse>
     */
    public AsyncInvoker<ListGovernancePolicyRequest, ListGovernancePolicyResponse> listGovernancePolicyAsyncInvoker(
        ListGovernancePolicyRequest request) {
        return new AsyncInvoker<ListGovernancePolicyRequest, ListGovernancePolicyResponse>(request,
            CseMeta.listGovernancePolicy, hcClient);
    }

    /**
     * 查询治理策略详情
     *
     * 查询治理策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGovernancePolicyByPolicyIdRequest 请求对象
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
     * @param ListGovernancePolicyByPolicyIdRequest 请求对象
     * @return AsyncInvoker<ListGovernancePolicyByPolicyIdRequest, ListGovernancePolicyByPolicyIdResponse>
     */
    public AsyncInvoker<ListGovernancePolicyByPolicyIdRequest, ListGovernancePolicyByPolicyIdResponse> listGovernancePolicyByPolicyIdAsyncInvoker(
        ListGovernancePolicyByPolicyIdRequest request) {
        return new AsyncInvoker<ListGovernancePolicyByPolicyIdRequest, ListGovernancePolicyByPolicyIdResponse>(request,
            CseMeta.listGovernancePolicyByPolicyId, hcClient);
    }

    /**
     * 查询治理策略列表
     *
     * 查询治理策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGovernancePolicysRequest 请求对象
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
     * @param ListGovernancePolicysRequest 请求对象
     * @return AsyncInvoker<ListGovernancePolicysRequest, ListGovernancePolicysResponse>
     */
    public AsyncInvoker<ListGovernancePolicysRequest, ListGovernancePolicysResponse> listGovernancePolicysAsyncInvoker(
        ListGovernancePolicysRequest request) {
        return new AsyncInvoker<ListGovernancePolicysRequest, ListGovernancePolicysResponse>(request,
            CseMeta.listGovernancePolicys, hcClient);
    }

    /**
     * 查询微服务的灰度发布规则
     *
     * 查询微服务的灰度发布规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMicroserviceRouteRuleRequest 请求对象
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
     * @param ListMicroserviceRouteRuleRequest 请求对象
     * @return AsyncInvoker<ListMicroserviceRouteRuleRequest, ListMicroserviceRouteRuleResponse>
     */
    public AsyncInvoker<ListMicroserviceRouteRuleRequest, ListMicroserviceRouteRuleResponse> listMicroserviceRouteRuleAsyncInvoker(
        ListMicroserviceRouteRuleRequest request) {
        return new AsyncInvoker<ListMicroserviceRouteRuleRequest, ListMicroserviceRouteRuleResponse>(request,
            CseMeta.listMicroserviceRouteRule, hcClient);
    }

    /**
     * 变更微服务引擎规格
     *
     * 变更微服务引擎规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeEngineRequest 请求对象
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
     * @param ResizeEngineRequest 请求对象
     * @return AsyncInvoker<ResizeEngineRequest, ResizeEngineResponse>
     */
    public AsyncInvoker<ResizeEngineRequest, ResizeEngineResponse> resizeEngineAsyncInvoker(
        ResizeEngineRequest request) {
        return new AsyncInvoker<ResizeEngineRequest, ResizeEngineResponse>(request, CseMeta.resizeEngine, hcClient);
    }

    /**
     * 对微服务引擎专享版进行重试
     *
     * 对微服务引擎专享版进行重试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryEngineRequest 请求对象
     * @return CompletableFuture<RetryEngineResponse>
     */
    public CompletableFuture<RetryEngineResponse> retryEngineAsync(RetryEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.retryEngine);
    }

    /**
     * 对微服务引擎专享版进行重试
     *
     * 对微服务引擎专享版进行重试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryEngineRequest 请求对象
     * @return AsyncInvoker<RetryEngineRequest, RetryEngineResponse>
     */
    public AsyncInvoker<RetryEngineRequest, RetryEngineResponse> retryEngineAsyncInvoker(RetryEngineRequest request) {
        return new AsyncInvoker<RetryEngineRequest, RetryEngineResponse>(request, CseMeta.retryEngine, hcClient);
    }

    /**
     * 查询微服务引擎专享版详情
     *
     * 查询微服务引擎专享版详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEngineRequest 请求对象
     * @return CompletableFuture<ShowEngineResponse>
     */
    public CompletableFuture<ShowEngineResponse> showEngineAsync(ShowEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.showEngine);
    }

    /**
     * 查询微服务引擎专享版详情
     *
     * 查询微服务引擎专享版详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEngineRequest 请求对象
     * @return AsyncInvoker<ShowEngineRequest, ShowEngineResponse>
     */
    public AsyncInvoker<ShowEngineRequest, ShowEngineResponse> showEngineAsyncInvoker(ShowEngineRequest request) {
        return new AsyncInvoker<ShowEngineRequest, ShowEngineResponse>(request, CseMeta.showEngine, hcClient);
    }

    /**
     * 查询微服务引擎任务详情
     *
     * 查询微服务引擎任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEngineJobRequest 请求对象
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
     * @param ShowEngineJobRequest 请求对象
     * @return AsyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse>
     */
    public AsyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse> showEngineJobAsyncInvoker(
        ShowEngineJobRequest request) {
        return new AsyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse>(request, CseMeta.showEngineJob, hcClient);
    }

    /**
     * 查询微服务引擎配额
     *
     * 查询微服务引擎配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEngineQuotasRequest 请求对象
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
     * @param ShowEngineQuotasRequest 请求对象
     * @return AsyncInvoker<ShowEngineQuotasRequest, ShowEngineQuotasResponse>
     */
    public AsyncInvoker<ShowEngineQuotasRequest, ShowEngineQuotasResponse> showEngineQuotasAsyncInvoker(
        ShowEngineQuotasRequest request) {
        return new AsyncInvoker<ShowEngineQuotasRequest, ShowEngineQuotasResponse>(request, CseMeta.showEngineQuotas,
            hcClient);
    }

    /**
     * 修改治理策略
     *
     * 修改治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGovernancePolicyRequest 请求对象
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
     * @param UpdateGovernancePolicyRequest 请求对象
     * @return AsyncInvoker<UpdateGovernancePolicyRequest, UpdateGovernancePolicyResponse>
     */
    public AsyncInvoker<UpdateGovernancePolicyRequest, UpdateGovernancePolicyResponse> updateGovernancePolicyAsyncInvoker(
        UpdateGovernancePolicyRequest request) {
        return new AsyncInvoker<UpdateGovernancePolicyRequest, UpdateGovernancePolicyResponse>(request,
            CseMeta.updateGovernancePolicy, hcClient);
    }

    /**
     * 升级微服务引擎专享版
     *
     * 升级微服务引擎专享版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeEngineRequest 请求对象
     * @return CompletableFuture<UpgradeEngineResponse>
     */
    public CompletableFuture<UpgradeEngineResponse> upgradeEngineAsync(UpgradeEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.upgradeEngine);
    }

    /**
     * 升级微服务引擎专享版
     *
     * 升级微服务引擎专享版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeEngineRequest 请求对象
     * @return AsyncInvoker<UpgradeEngineRequest, UpgradeEngineResponse>
     */
    public AsyncInvoker<UpgradeEngineRequest, UpgradeEngineResponse> upgradeEngineAsyncInvoker(
        UpgradeEngineRequest request) {
        return new AsyncInvoker<UpgradeEngineRequest, UpgradeEngineResponse>(request, CseMeta.upgradeEngine, hcClient);
    }

    /**
     * 更新微服务引擎专享版配置
     *
     * 更新微服务引擎专享版配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeEngineConfigRequest 请求对象
     * @return CompletableFuture<UpgradeEngineConfigResponse>
     */
    public CompletableFuture<UpgradeEngineConfigResponse> upgradeEngineConfigAsync(UpgradeEngineConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CseMeta.upgradeEngineConfig);
    }

    /**
     * 更新微服务引擎专享版配置
     *
     * 更新微服务引擎专享版配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeEngineConfigRequest 请求对象
     * @return AsyncInvoker<UpgradeEngineConfigRequest, UpgradeEngineConfigResponse>
     */
    public AsyncInvoker<UpgradeEngineConfigRequest, UpgradeEngineConfigResponse> upgradeEngineConfigAsyncInvoker(
        UpgradeEngineConfigRequest request) {
        return new AsyncInvoker<UpgradeEngineConfigRequest, UpgradeEngineConfigResponse>(request,
            CseMeta.upgradeEngineConfig, hcClient);
    }

    /**
     * 导入kie配置
     *
     * 导入kie配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadKieRequest 请求对象
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
     * @param UploadKieRequest 请求对象
     * @return AsyncInvoker<UploadKieRequest, UploadKieResponse>
     */
    public AsyncInvoker<UploadKieRequest, UploadKieResponse> uploadKieAsyncInvoker(UploadKieRequest request) {
        return new AsyncInvoker<UploadKieRequest, UploadKieResponse>(request, CseMeta.uploadKie, hcClient);
    }

    /**
     * 创建nacos命名空间
     *
     * 创建nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNacosNamespacesRequest 请求对象
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
     * @param CreateNacosNamespacesRequest 请求对象
     * @return AsyncInvoker<CreateNacosNamespacesRequest, CreateNacosNamespacesResponse>
     */
    public AsyncInvoker<CreateNacosNamespacesRequest, CreateNacosNamespacesResponse> createNacosNamespacesAsyncInvoker(
        CreateNacosNamespacesRequest request) {
        return new AsyncInvoker<CreateNacosNamespacesRequest, CreateNacosNamespacesResponse>(request,
            CseMeta.createNacosNamespaces, hcClient);
    }

    /**
     * 删除nacos命名空间
     *
     * 删除nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNacosNamespacesRequest 请求对象
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
     * @param DeleteNacosNamespacesRequest 请求对象
     * @return AsyncInvoker<DeleteNacosNamespacesRequest, DeleteNacosNamespacesResponse>
     */
    public AsyncInvoker<DeleteNacosNamespacesRequest, DeleteNacosNamespacesResponse> deleteNacosNamespacesAsyncInvoker(
        DeleteNacosNamespacesRequest request) {
        return new AsyncInvoker<DeleteNacosNamespacesRequest, DeleteNacosNamespacesResponse>(request,
            CseMeta.deleteNacosNamespaces, hcClient);
    }

    /**
     * 查询nacos命名空间
     *
     * 查询nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNacosNamespacesRequest 请求对象
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
     * @param ListNacosNamespacesRequest 请求对象
     * @return AsyncInvoker<ListNacosNamespacesRequest, ListNacosNamespacesResponse>
     */
    public AsyncInvoker<ListNacosNamespacesRequest, ListNacosNamespacesResponse> listNacosNamespacesAsyncInvoker(
        ListNacosNamespacesRequest request) {
        return new AsyncInvoker<ListNacosNamespacesRequest, ListNacosNamespacesResponse>(request,
            CseMeta.listNacosNamespaces, hcClient);
    }

    /**
     * 更新nacos命名空间
     *
     * 更新nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNacosNamespacesRequest 请求对象
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
     * @param UpdateNacosNamespacesRequest 请求对象
     * @return AsyncInvoker<UpdateNacosNamespacesRequest, UpdateNacosNamespacesResponse>
     */
    public AsyncInvoker<UpdateNacosNamespacesRequest, UpdateNacosNamespacesResponse> updateNacosNamespacesAsyncInvoker(
        UpdateNacosNamespacesRequest request) {
        return new AsyncInvoker<UpdateNacosNamespacesRequest, UpdateNacosNamespacesResponse>(request,
            CseMeta.updateNacosNamespaces, hcClient);
    }

}
