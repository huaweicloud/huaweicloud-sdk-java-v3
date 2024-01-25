package com.huaweicloud.sdk.cse.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class CseClient {

    protected HcClient hcClient;

    public CseClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CseClient> newBuilder() {
        ClientBuilder<CseClient> clientBuilder = new ClientBuilder<>(CseClient::new);
        return clientBuilder;
    }

    /**
     * 创建微服务引擎专享版
     *
     * 创建微服务引擎专享版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEngineRequest 请求对象
     * @return CreateEngineResponse
     */
    public CreateEngineResponse createEngine(CreateEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.createEngine);
    }

    /**
     * 创建微服务引擎专享版
     *
     * 创建微服务引擎专享版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEngineRequest 请求对象
     * @return SyncInvoker<CreateEngineRequest, CreateEngineResponse>
     */
    public SyncInvoker<CreateEngineRequest, CreateEngineResponse> createEngineInvoker(CreateEngineRequest request) {
        return new SyncInvoker<>(request, CseMeta.createEngine, hcClient);
    }

    /**
     * 创建治理策略
     *
     * 创建治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGovernancePolicyRequest 请求对象
     * @return CreateGovernancePolicyResponse
     */
    public CreateGovernancePolicyResponse createGovernancePolicy(CreateGovernancePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.createGovernancePolicy);
    }

    /**
     * 创建治理策略
     *
     * 创建治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGovernancePolicyRequest 请求对象
     * @return SyncInvoker<CreateGovernancePolicyRequest, CreateGovernancePolicyResponse>
     */
    public SyncInvoker<CreateGovernancePolicyRequest, CreateGovernancePolicyResponse> createGovernancePolicyInvoker(
        CreateGovernancePolicyRequest request) {
        return new SyncInvoker<>(request, CseMeta.createGovernancePolicy, hcClient);
    }

    /**
     * 创建灰度发布策略
     *
     * 创建灰度发布策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMicroserviceRouteRuleRequest 请求对象
     * @return CreateMicroserviceRouteRuleResponse
     */
    public CreateMicroserviceRouteRuleResponse createMicroserviceRouteRule(CreateMicroserviceRouteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.createMicroserviceRouteRule);
    }

    /**
     * 创建灰度发布策略
     *
     * 创建灰度发布策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMicroserviceRouteRuleRequest 请求对象
     * @return SyncInvoker<CreateMicroserviceRouteRuleRequest, CreateMicroserviceRouteRuleResponse>
     */
    public SyncInvoker<CreateMicroserviceRouteRuleRequest, CreateMicroserviceRouteRuleResponse> createMicroserviceRouteRuleInvoker(
        CreateMicroserviceRouteRuleRequest request) {
        return new SyncInvoker<>(request, CseMeta.createMicroserviceRouteRule, hcClient);
    }

    /**
     * 删除微服务引擎专享版
     *
     * 删除微服务引擎专享版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEngineRequest 请求对象
     * @return DeleteEngineResponse
     */
    public DeleteEngineResponse deleteEngine(DeleteEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.deleteEngine);
    }

    /**
     * 删除微服务引擎专享版
     *
     * 删除微服务引擎专享版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEngineRequest 请求对象
     * @return SyncInvoker<DeleteEngineRequest, DeleteEngineResponse>
     */
    public SyncInvoker<DeleteEngineRequest, DeleteEngineResponse> deleteEngineInvoker(DeleteEngineRequest request) {
        return new SyncInvoker<>(request, CseMeta.deleteEngine, hcClient);
    }

    /**
     * 删除治理策略
     *
     * 删除治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGovernancePolicyRequest 请求对象
     * @return DeleteGovernancePolicyResponse
     */
    public DeleteGovernancePolicyResponse deleteGovernancePolicy(DeleteGovernancePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.deleteGovernancePolicy);
    }

    /**
     * 删除治理策略
     *
     * 删除治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGovernancePolicyRequest 请求对象
     * @return SyncInvoker<DeleteGovernancePolicyRequest, DeleteGovernancePolicyResponse>
     */
    public SyncInvoker<DeleteGovernancePolicyRequest, DeleteGovernancePolicyResponse> deleteGovernancePolicyInvoker(
        DeleteGovernancePolicyRequest request) {
        return new SyncInvoker<>(request, CseMeta.deleteGovernancePolicy, hcClient);
    }

    /**
     * 删除灰度发布策略
     *
     * 删除灰度发布策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMicroserviceRouteRuleRequest 请求对象
     * @return DeleteMicroserviceRouteRuleResponse
     */
    public DeleteMicroserviceRouteRuleResponse deleteMicroserviceRouteRule(DeleteMicroserviceRouteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.deleteMicroserviceRouteRule);
    }

    /**
     * 删除灰度发布策略
     *
     * 删除灰度发布策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMicroserviceRouteRuleRequest 请求对象
     * @return SyncInvoker<DeleteMicroserviceRouteRuleRequest, DeleteMicroserviceRouteRuleResponse>
     */
    public SyncInvoker<DeleteMicroserviceRouteRuleRequest, DeleteMicroserviceRouteRuleResponse> deleteMicroserviceRouteRuleInvoker(
        DeleteMicroserviceRouteRuleRequest request) {
        return new SyncInvoker<>(request, CseMeta.deleteMicroserviceRouteRule, hcClient);
    }

    /**
     * 导出kie配置
     *
     * 导出kie配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadKieRequest 请求对象
     * @return DownloadKieResponse
     */
    public DownloadKieResponse downloadKie(DownloadKieRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.downloadKie);
    }

    /**
     * 导出kie配置
     *
     * 导出kie配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadKieRequest 请求对象
     * @return SyncInvoker<DownloadKieRequest, DownloadKieResponse>
     */
    public SyncInvoker<DownloadKieRequest, DownloadKieResponse> downloadKieInvoker(DownloadKieRequest request) {
        return new SyncInvoker<>(request, CseMeta.downloadKie, hcClient);
    }

    /**
     * 查询微服务引擎列表
     *
     * 查询微服务引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnginesRequest 请求对象
     * @return ListEnginesResponse
     */
    public ListEnginesResponse listEngines(ListEnginesRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.listEngines);
    }

    /**
     * 查询微服务引擎列表
     *
     * 查询微服务引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnginesRequest 请求对象
     * @return SyncInvoker<ListEnginesRequest, ListEnginesResponse>
     */
    public SyncInvoker<ListEnginesRequest, ListEnginesResponse> listEnginesInvoker(ListEnginesRequest request) {
        return new SyncInvoker<>(request, CseMeta.listEngines, hcClient);
    }

    /**
     * 查询微服务引擎专享版的规格列表
     *
     * 查询微服务引擎专享版的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.listFlavors);
    }

    /**
     * 查询微服务引擎专享版的规格列表
     *
     * 查询微服务引擎专享版的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<>(request, CseMeta.listFlavors, hcClient);
    }

    /**
     * 查询指定类型治理策略列表
     *
     * 查询指定类型治理策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGovernancePolicyRequest 请求对象
     * @return ListGovernancePolicyResponse
     */
    public ListGovernancePolicyResponse listGovernancePolicy(ListGovernancePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.listGovernancePolicy);
    }

    /**
     * 查询指定类型治理策略列表
     *
     * 查询指定类型治理策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGovernancePolicyRequest 请求对象
     * @return SyncInvoker<ListGovernancePolicyRequest, ListGovernancePolicyResponse>
     */
    public SyncInvoker<ListGovernancePolicyRequest, ListGovernancePolicyResponse> listGovernancePolicyInvoker(
        ListGovernancePolicyRequest request) {
        return new SyncInvoker<>(request, CseMeta.listGovernancePolicy, hcClient);
    }

    /**
     * 查询治理策略详情
     *
     * 查询治理策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGovernancePolicyByPolicyIdRequest 请求对象
     * @return ListGovernancePolicyByPolicyIdResponse
     */
    public ListGovernancePolicyByPolicyIdResponse listGovernancePolicyByPolicyId(
        ListGovernancePolicyByPolicyIdRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.listGovernancePolicyByPolicyId);
    }

    /**
     * 查询治理策略详情
     *
     * 查询治理策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGovernancePolicyByPolicyIdRequest 请求对象
     * @return SyncInvoker<ListGovernancePolicyByPolicyIdRequest, ListGovernancePolicyByPolicyIdResponse>
     */
    public SyncInvoker<ListGovernancePolicyByPolicyIdRequest, ListGovernancePolicyByPolicyIdResponse> listGovernancePolicyByPolicyIdInvoker(
        ListGovernancePolicyByPolicyIdRequest request) {
        return new SyncInvoker<>(request, CseMeta.listGovernancePolicyByPolicyId, hcClient);
    }

    /**
     * 查询治理策略列表
     *
     * 查询治理策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGovernancePolicysRequest 请求对象
     * @return ListGovernancePolicysResponse
     */
    public ListGovernancePolicysResponse listGovernancePolicys(ListGovernancePolicysRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.listGovernancePolicys);
    }

    /**
     * 查询治理策略列表
     *
     * 查询治理策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGovernancePolicysRequest 请求对象
     * @return SyncInvoker<ListGovernancePolicysRequest, ListGovernancePolicysResponse>
     */
    public SyncInvoker<ListGovernancePolicysRequest, ListGovernancePolicysResponse> listGovernancePolicysInvoker(
        ListGovernancePolicysRequest request) {
        return new SyncInvoker<>(request, CseMeta.listGovernancePolicys, hcClient);
    }

    /**
     * 查询微服务的灰度发布规则
     *
     * 查询微服务的灰度发布规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMicroserviceRouteRuleRequest 请求对象
     * @return ListMicroserviceRouteRuleResponse
     */
    public ListMicroserviceRouteRuleResponse listMicroserviceRouteRule(ListMicroserviceRouteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.listMicroserviceRouteRule);
    }

    /**
     * 查询微服务的灰度发布规则
     *
     * 查询微服务的灰度发布规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMicroserviceRouteRuleRequest 请求对象
     * @return SyncInvoker<ListMicroserviceRouteRuleRequest, ListMicroserviceRouteRuleResponse>
     */
    public SyncInvoker<ListMicroserviceRouteRuleRequest, ListMicroserviceRouteRuleResponse> listMicroserviceRouteRuleInvoker(
        ListMicroserviceRouteRuleRequest request) {
        return new SyncInvoker<>(request, CseMeta.listMicroserviceRouteRule, hcClient);
    }

    /**
     * 变更微服务引擎规格
     *
     * 变更微服务引擎规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeEngineRequest 请求对象
     * @return ResizeEngineResponse
     */
    public ResizeEngineResponse resizeEngine(ResizeEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.resizeEngine);
    }

    /**
     * 变更微服务引擎规格
     *
     * 变更微服务引擎规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeEngineRequest 请求对象
     * @return SyncInvoker<ResizeEngineRequest, ResizeEngineResponse>
     */
    public SyncInvoker<ResizeEngineRequest, ResizeEngineResponse> resizeEngineInvoker(ResizeEngineRequest request) {
        return new SyncInvoker<>(request, CseMeta.resizeEngine, hcClient);
    }

    /**
     * 对微服务引擎专享版进行重试
     *
     * 对微服务引擎专享版进行重试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryEngineRequest 请求对象
     * @return RetryEngineResponse
     */
    public RetryEngineResponse retryEngine(RetryEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.retryEngine);
    }

    /**
     * 对微服务引擎专享版进行重试
     *
     * 对微服务引擎专享版进行重试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryEngineRequest 请求对象
     * @return SyncInvoker<RetryEngineRequest, RetryEngineResponse>
     */
    public SyncInvoker<RetryEngineRequest, RetryEngineResponse> retryEngineInvoker(RetryEngineRequest request) {
        return new SyncInvoker<>(request, CseMeta.retryEngine, hcClient);
    }

    /**
     * 查询微服务引擎专享版详情
     *
     * 查询微服务引擎专享版详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineRequest 请求对象
     * @return ShowEngineResponse
     */
    public ShowEngineResponse showEngine(ShowEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.showEngine);
    }

    /**
     * 查询微服务引擎专享版详情
     *
     * 查询微服务引擎专享版详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineRequest 请求对象
     * @return SyncInvoker<ShowEngineRequest, ShowEngineResponse>
     */
    public SyncInvoker<ShowEngineRequest, ShowEngineResponse> showEngineInvoker(ShowEngineRequest request) {
        return new SyncInvoker<>(request, CseMeta.showEngine, hcClient);
    }

    /**
     * 查询微服务引擎任务详情
     *
     * 查询微服务引擎任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineJobRequest 请求对象
     * @return ShowEngineJobResponse
     */
    public ShowEngineJobResponse showEngineJob(ShowEngineJobRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.showEngineJob);
    }

    /**
     * 查询微服务引擎任务详情
     *
     * 查询微服务引擎任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineJobRequest 请求对象
     * @return SyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse>
     */
    public SyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse> showEngineJobInvoker(ShowEngineJobRequest request) {
        return new SyncInvoker<>(request, CseMeta.showEngineJob, hcClient);
    }

    /**
     * 查询微服务引擎配额
     *
     * 查询微服务引擎配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineQuotasRequest 请求对象
     * @return ShowEngineQuotasResponse
     */
    public ShowEngineQuotasResponse showEngineQuotas(ShowEngineQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.showEngineQuotas);
    }

    /**
     * 查询微服务引擎配额
     *
     * 查询微服务引擎配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEngineQuotasRequest 请求对象
     * @return SyncInvoker<ShowEngineQuotasRequest, ShowEngineQuotasResponse>
     */
    public SyncInvoker<ShowEngineQuotasRequest, ShowEngineQuotasResponse> showEngineQuotasInvoker(
        ShowEngineQuotasRequest request) {
        return new SyncInvoker<>(request, CseMeta.showEngineQuotas, hcClient);
    }

    /**
     * 修改治理策略
     *
     * 修改治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGovernancePolicyRequest 请求对象
     * @return UpdateGovernancePolicyResponse
     */
    public UpdateGovernancePolicyResponse updateGovernancePolicy(UpdateGovernancePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.updateGovernancePolicy);
    }

    /**
     * 修改治理策略
     *
     * 修改治理策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGovernancePolicyRequest 请求对象
     * @return SyncInvoker<UpdateGovernancePolicyRequest, UpdateGovernancePolicyResponse>
     */
    public SyncInvoker<UpdateGovernancePolicyRequest, UpdateGovernancePolicyResponse> updateGovernancePolicyInvoker(
        UpdateGovernancePolicyRequest request) {
        return new SyncInvoker<>(request, CseMeta.updateGovernancePolicy, hcClient);
    }

    /**
     * 升级微服务引擎专享版
     *
     * 升级微服务引擎专享版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeEngineRequest 请求对象
     * @return UpgradeEngineResponse
     */
    public UpgradeEngineResponse upgradeEngine(UpgradeEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.upgradeEngine);
    }

    /**
     * 升级微服务引擎专享版
     *
     * 升级微服务引擎专享版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeEngineRequest 请求对象
     * @return SyncInvoker<UpgradeEngineRequest, UpgradeEngineResponse>
     */
    public SyncInvoker<UpgradeEngineRequest, UpgradeEngineResponse> upgradeEngineInvoker(UpgradeEngineRequest request) {
        return new SyncInvoker<>(request, CseMeta.upgradeEngine, hcClient);
    }

    /**
     * 更新微服务引擎专享版配置
     *
     * 更新微服务引擎专享版配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeEngineConfigRequest 请求对象
     * @return UpgradeEngineConfigResponse
     */
    public UpgradeEngineConfigResponse upgradeEngineConfig(UpgradeEngineConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.upgradeEngineConfig);
    }

    /**
     * 更新微服务引擎专享版配置
     *
     * 更新微服务引擎专享版配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeEngineConfigRequest 请求对象
     * @return SyncInvoker<UpgradeEngineConfigRequest, UpgradeEngineConfigResponse>
     */
    public SyncInvoker<UpgradeEngineConfigRequest, UpgradeEngineConfigResponse> upgradeEngineConfigInvoker(
        UpgradeEngineConfigRequest request) {
        return new SyncInvoker<>(request, CseMeta.upgradeEngineConfig, hcClient);
    }

    /**
     * 导入kie配置
     *
     * 导入kie配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadKieRequest 请求对象
     * @return UploadKieResponse
     */
    public UploadKieResponse uploadKie(UploadKieRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.uploadKie);
    }

    /**
     * 导入kie配置
     *
     * 导入kie配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadKieRequest 请求对象
     * @return SyncInvoker<UploadKieRequest, UploadKieResponse>
     */
    public SyncInvoker<UploadKieRequest, UploadKieResponse> uploadKieInvoker(UploadKieRequest request) {
        return new SyncInvoker<>(request, CseMeta.uploadKie, hcClient);
    }

    /**
     * 创建http转rpc方法
     *
     * 创建http转rpc方法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttp2RpcRequest 请求对象
     * @return CreateHttp2RpcResponse
     */
    public CreateHttp2RpcResponse createHttp2Rpc(CreateHttp2RpcRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.createHttp2Rpc);
    }

    /**
     * 创建http转rpc方法
     *
     * 创建http转rpc方法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttp2RpcRequest 请求对象
     * @return SyncInvoker<CreateHttp2RpcRequest, CreateHttp2RpcResponse>
     */
    public SyncInvoker<CreateHttp2RpcRequest, CreateHttp2RpcResponse> createHttp2RpcInvoker(
        CreateHttp2RpcRequest request) {
        return new SyncInvoker<>(request, CseMeta.createHttp2Rpc, hcClient);
    }

    /**
     * 创建插件
     *
     * 创建插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePluginRequest 请求对象
     * @return CreatePluginResponse
     */
    public CreatePluginResponse createPlugin(CreatePluginRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.createPlugin);
    }

    /**
     * 创建插件
     *
     * 创建插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePluginRequest 请求对象
     * @return SyncInvoker<CreatePluginRequest, CreatePluginResponse>
     */
    public SyncInvoker<CreatePluginRequest, CreatePluginResponse> createPluginInvoker(CreatePluginRequest request) {
        return new SyncInvoker<>(request, CseMeta.createPlugin, hcClient);
    }

    /**
     * 删除http转rpc方法
     *
     * 删除http转rpc方法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttp2RpcRequest 请求对象
     * @return DeleteHttp2RpcResponse
     */
    public DeleteHttp2RpcResponse deleteHttp2Rpc(DeleteHttp2RpcRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.deleteHttp2Rpc);
    }

    /**
     * 删除http转rpc方法
     *
     * 删除http转rpc方法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttp2RpcRequest 请求对象
     * @return SyncInvoker<DeleteHttp2RpcRequest, DeleteHttp2RpcResponse>
     */
    public SyncInvoker<DeleteHttp2RpcRequest, DeleteHttp2RpcResponse> deleteHttp2RpcInvoker(
        DeleteHttp2RpcRequest request) {
        return new SyncInvoker<>(request, CseMeta.deleteHttp2Rpc, hcClient);
    }

    /**
     * 删除插件
     *
     * 删除插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePluginRequest 请求对象
     * @return DeletePluginResponse
     */
    public DeletePluginResponse deletePlugin(DeletePluginRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.deletePlugin);
    }

    /**
     * 删除插件
     *
     * 删除插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePluginRequest 请求对象
     * @return SyncInvoker<DeletePluginRequest, DeletePluginResponse>
     */
    public SyncInvoker<DeletePluginRequest, DeletePluginResponse> deletePluginInvoker(DeletePluginRequest request) {
        return new SyncInvoker<>(request, CseMeta.deletePlugin, hcClient);
    }

    /**
     * 修改http转rpc方法
     *
     * 修改http转rpc方法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyHttp2RpcRequest 请求对象
     * @return ModifyHttp2RpcResponse
     */
    public ModifyHttp2RpcResponse modifyHttp2Rpc(ModifyHttp2RpcRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.modifyHttp2Rpc);
    }

    /**
     * 修改http转rpc方法
     *
     * 修改http转rpc方法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyHttp2RpcRequest 请求对象
     * @return SyncInvoker<ModifyHttp2RpcRequest, ModifyHttp2RpcResponse>
     */
    public SyncInvoker<ModifyHttp2RpcRequest, ModifyHttp2RpcResponse> modifyHttp2RpcInvoker(
        ModifyHttp2RpcRequest request) {
        return new SyncInvoker<>(request, CseMeta.modifyHttp2Rpc, hcClient);
    }

    /**
     * 修改插件
     *
     * 修改插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyPluginRequest 请求对象
     * @return ModifyPluginResponse
     */
    public ModifyPluginResponse modifyPlugin(ModifyPluginRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.modifyPlugin);
    }

    /**
     * 修改插件
     *
     * 修改插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyPluginRequest 请求对象
     * @return SyncInvoker<ModifyPluginRequest, ModifyPluginResponse>
     */
    public SyncInvoker<ModifyPluginRequest, ModifyPluginResponse> modifyPluginInvoker(ModifyPluginRequest request) {
        return new SyncInvoker<>(request, CseMeta.modifyPlugin, hcClient);
    }

    /**
     * 查询http2rpc资源列表
     *
     * 查询http转rpc资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttp2RpcsRequest 请求对象
     * @return ShowHttp2RpcsResponse
     */
    public ShowHttp2RpcsResponse showHttp2Rpcs(ShowHttp2RpcsRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.showHttp2Rpcs);
    }

    /**
     * 查询http2rpc资源列表
     *
     * 查询http转rpc资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttp2RpcsRequest 请求对象
     * @return SyncInvoker<ShowHttp2RpcsRequest, ShowHttp2RpcsResponse>
     */
    public SyncInvoker<ShowHttp2RpcsRequest, ShowHttp2RpcsResponse> showHttp2RpcsInvoker(ShowHttp2RpcsRequest request) {
        return new SyncInvoker<>(request, CseMeta.showHttp2Rpcs, hcClient);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPluginsRequest 请求对象
     * @return ShowPluginsResponse
     */
    public ShowPluginsResponse showPlugins(ShowPluginsRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.showPlugins);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPluginsRequest 请求对象
     * @return SyncInvoker<ShowPluginsRequest, ShowPluginsResponse>
     */
    public SyncInvoker<ShowPluginsRequest, ShowPluginsResponse> showPluginsInvoker(ShowPluginsRequest request) {
        return new SyncInvoker<>(request, CseMeta.showPlugins, hcClient);
    }

    /**
     * 查询单个插件
     *
     * 查询单个插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSinglePluginRequest 请求对象
     * @return ShowSinglePluginResponse
     */
    public ShowSinglePluginResponse showSinglePlugin(ShowSinglePluginRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.showSinglePlugin);
    }

    /**
     * 查询单个插件
     *
     * 查询单个插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSinglePluginRequest 请求对象
     * @return SyncInvoker<ShowSinglePluginRequest, ShowSinglePluginResponse>
     */
    public SyncInvoker<ShowSinglePluginRequest, ShowSinglePluginResponse> showSinglePluginInvoker(
        ShowSinglePluginRequest request) {
        return new SyncInvoker<>(request, CseMeta.showSinglePlugin, hcClient);
    }

    /**
     * 创建nacos命名空间
     *
     * 创建nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNacosNamespacesRequest 请求对象
     * @return CreateNacosNamespacesResponse
     */
    public CreateNacosNamespacesResponse createNacosNamespaces(CreateNacosNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.createNacosNamespaces);
    }

    /**
     * 创建nacos命名空间
     *
     * 创建nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNacosNamespacesRequest 请求对象
     * @return SyncInvoker<CreateNacosNamespacesRequest, CreateNacosNamespacesResponse>
     */
    public SyncInvoker<CreateNacosNamespacesRequest, CreateNacosNamespacesResponse> createNacosNamespacesInvoker(
        CreateNacosNamespacesRequest request) {
        return new SyncInvoker<>(request, CseMeta.createNacosNamespaces, hcClient);
    }

    /**
     * 删除nacos命名空间
     *
     * 删除nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNacosNamespacesRequest 请求对象
     * @return DeleteNacosNamespacesResponse
     */
    public DeleteNacosNamespacesResponse deleteNacosNamespaces(DeleteNacosNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.deleteNacosNamespaces);
    }

    /**
     * 删除nacos命名空间
     *
     * 删除nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNacosNamespacesRequest 请求对象
     * @return SyncInvoker<DeleteNacosNamespacesRequest, DeleteNacosNamespacesResponse>
     */
    public SyncInvoker<DeleteNacosNamespacesRequest, DeleteNacosNamespacesResponse> deleteNacosNamespacesInvoker(
        DeleteNacosNamespacesRequest request) {
        return new SyncInvoker<>(request, CseMeta.deleteNacosNamespaces, hcClient);
    }

    /**
     * 查询nacos命名空间
     *
     * 查询nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNacosNamespacesRequest 请求对象
     * @return ListNacosNamespacesResponse
     */
    public ListNacosNamespacesResponse listNacosNamespaces(ListNacosNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.listNacosNamespaces);
    }

    /**
     * 查询nacos命名空间
     *
     * 查询nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNacosNamespacesRequest 请求对象
     * @return SyncInvoker<ListNacosNamespacesRequest, ListNacosNamespacesResponse>
     */
    public SyncInvoker<ListNacosNamespacesRequest, ListNacosNamespacesResponse> listNacosNamespacesInvoker(
        ListNacosNamespacesRequest request) {
        return new SyncInvoker<>(request, CseMeta.listNacosNamespaces, hcClient);
    }

    /**
     * 更新nacos命名空间
     *
     * 更新nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNacosNamespacesRequest 请求对象
     * @return UpdateNacosNamespacesResponse
     */
    public UpdateNacosNamespacesResponse updateNacosNamespaces(UpdateNacosNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.updateNacosNamespaces);
    }

    /**
     * 更新nacos命名空间
     *
     * 更新nacos命名空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNacosNamespacesRequest 请求对象
     * @return SyncInvoker<UpdateNacosNamespacesRequest, UpdateNacosNamespacesResponse>
     */
    public SyncInvoker<UpdateNacosNamespacesRequest, UpdateNacosNamespacesResponse> updateNacosNamespacesInvoker(
        UpdateNacosNamespacesRequest request) {
        return new SyncInvoker<>(request, CseMeta.updateNacosNamespaces, hcClient);
    }

}
