package com.huaweicloud.sdk.config.v1;

import com.huaweicloud.sdk.config.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class ConfigClient {

    protected HcClient hcClient;

    public ConfigClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ConfigClient> newBuilder() {
        return new ClientBuilder<>(ConfigClient::new, "GlobalCredentials");
    }

    /**
     * 创建资源聚合器授权
     *
     * 给资源聚合器帐号授予从源帐号收集数据的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAggregationAuthorizationRequest 请求对象
     * @return CreateAggregationAuthorizationResponse
     */
    public CreateAggregationAuthorizationResponse createAggregationAuthorization(
        CreateAggregationAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.createAggregationAuthorization);
    }

    /**
     * 创建资源聚合器授权
     *
     * 给资源聚合器帐号授予从源帐号收集数据的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAggregationAuthorizationRequest 请求对象
     * @return SyncInvoker<CreateAggregationAuthorizationRequest, CreateAggregationAuthorizationResponse>
     */
    public SyncInvoker<CreateAggregationAuthorizationRequest, CreateAggregationAuthorizationResponse> createAggregationAuthorizationInvoker(
        CreateAggregationAuthorizationRequest request) {
        return new SyncInvoker<CreateAggregationAuthorizationRequest, CreateAggregationAuthorizationResponse>(request,
            ConfigMeta.createAggregationAuthorization, hcClient);
    }

    /**
     * 创建资源聚合器
     *
     * 创建资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConfigurationAggregatorRequest 请求对象
     * @return CreateConfigurationAggregatorResponse
     */
    public CreateConfigurationAggregatorResponse createConfigurationAggregator(
        CreateConfigurationAggregatorRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.createConfigurationAggregator);
    }

    /**
     * 创建资源聚合器
     *
     * 创建资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConfigurationAggregatorRequest 请求对象
     * @return SyncInvoker<CreateConfigurationAggregatorRequest, CreateConfigurationAggregatorResponse>
     */
    public SyncInvoker<CreateConfigurationAggregatorRequest, CreateConfigurationAggregatorResponse> createConfigurationAggregatorInvoker(
        CreateConfigurationAggregatorRequest request) {
        return new SyncInvoker<CreateConfigurationAggregatorRequest, CreateConfigurationAggregatorResponse>(request,
            ConfigMeta.createConfigurationAggregator, hcClient);
    }

    /**
     * 删除资源聚合器授权
     *
     * 删除指定资源聚合器帐号的授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAggregationAuthorizationRequest 请求对象
     * @return DeleteAggregationAuthorizationResponse
     */
    public DeleteAggregationAuthorizationResponse deleteAggregationAuthorization(
        DeleteAggregationAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.deleteAggregationAuthorization);
    }

    /**
     * 删除资源聚合器授权
     *
     * 删除指定资源聚合器帐号的授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAggregationAuthorizationRequest 请求对象
     * @return SyncInvoker<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResponse>
     */
    public SyncInvoker<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResponse> deleteAggregationAuthorizationInvoker(
        DeleteAggregationAuthorizationRequest request) {
        return new SyncInvoker<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResponse>(request,
            ConfigMeta.deleteAggregationAuthorization, hcClient);
    }

    /**
     * 删除资源聚合器
     *
     * 删除资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigurationAggregatorRequest 请求对象
     * @return DeleteConfigurationAggregatorResponse
     */
    public DeleteConfigurationAggregatorResponse deleteConfigurationAggregator(
        DeleteConfigurationAggregatorRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.deleteConfigurationAggregator);
    }

    /**
     * 删除资源聚合器
     *
     * 删除资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigurationAggregatorRequest 请求对象
     * @return SyncInvoker<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResponse>
     */
    public SyncInvoker<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResponse> deleteConfigurationAggregatorInvoker(
        DeleteConfigurationAggregatorRequest request) {
        return new SyncInvoker<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResponse>(request,
            ConfigMeta.deleteConfigurationAggregator, hcClient);
    }

    /**
     * 删除聚合器帐号中挂起的授权请求
     *
     * 删除聚合器帐号中挂起的授权请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePendingAggregationRequestRequest 请求对象
     * @return DeletePendingAggregationRequestResponse
     */
    public DeletePendingAggregationRequestResponse deletePendingAggregationRequest(
        DeletePendingAggregationRequestRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.deletePendingAggregationRequest);
    }

    /**
     * 删除聚合器帐号中挂起的授权请求
     *
     * 删除聚合器帐号中挂起的授权请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePendingAggregationRequestRequest 请求对象
     * @return SyncInvoker<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResponse>
     */
    public SyncInvoker<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResponse> deletePendingAggregationRequestInvoker(
        DeletePendingAggregationRequestRequest request) {
        return new SyncInvoker<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResponse>(request,
            ConfigMeta.deletePendingAggregationRequest, hcClient);
    }

    /**
     * 查询聚合合规规则列表
     *
     * 查询合规和不合规规则的列表，其中包含合规和不合规规则的资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAggregateComplianceByPolicyAssignmentRequest 请求对象
     * @return ListAggregateComplianceByPolicyAssignmentResponse
     */
    public ListAggregateComplianceByPolicyAssignmentResponse listAggregateComplianceByPolicyAssignment(
        ListAggregateComplianceByPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listAggregateComplianceByPolicyAssignment);
    }

    /**
     * 查询聚合合规规则列表
     *
     * 查询合规和不合规规则的列表，其中包含合规和不合规规则的资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAggregateComplianceByPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<ListAggregateComplianceByPolicyAssignmentRequest, ListAggregateComplianceByPolicyAssignmentResponse>
     */
    public SyncInvoker<ListAggregateComplianceByPolicyAssignmentRequest, ListAggregateComplianceByPolicyAssignmentResponse> listAggregateComplianceByPolicyAssignmentInvoker(
        ListAggregateComplianceByPolicyAssignmentRequest request) {
        return new SyncInvoker<ListAggregateComplianceByPolicyAssignmentRequest, ListAggregateComplianceByPolicyAssignmentResponse>(
            request, ConfigMeta.listAggregateComplianceByPolicyAssignment, hcClient);
    }

    /**
     * 查询聚合器中资源的列表
     *
     * 查询资源聚合器中特定资源的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAggregateDiscoveredResourcesRequest 请求对象
     * @return ListAggregateDiscoveredResourcesResponse
     */
    public ListAggregateDiscoveredResourcesResponse listAggregateDiscoveredResources(
        ListAggregateDiscoveredResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listAggregateDiscoveredResources);
    }

    /**
     * 查询聚合器中资源的列表
     *
     * 查询资源聚合器中特定资源的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAggregateDiscoveredResourcesRequest 请求对象
     * @return SyncInvoker<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResponse>
     */
    public SyncInvoker<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResponse> listAggregateDiscoveredResourcesInvoker(
        ListAggregateDiscoveredResourcesRequest request) {
        return new SyncInvoker<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResponse>(
            request, ConfigMeta.listAggregateDiscoveredResources, hcClient);
    }

    /**
     * 查询资源聚合器授权列表
     *
     * 查询授权过的资源聚合器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAggregationAuthorizationsRequest 请求对象
     * @return ListAggregationAuthorizationsResponse
     */
    public ListAggregationAuthorizationsResponse listAggregationAuthorizations(
        ListAggregationAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listAggregationAuthorizations);
    }

    /**
     * 查询资源聚合器授权列表
     *
     * 查询授权过的资源聚合器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAggregationAuthorizationsRequest 请求对象
     * @return SyncInvoker<ListAggregationAuthorizationsRequest, ListAggregationAuthorizationsResponse>
     */
    public SyncInvoker<ListAggregationAuthorizationsRequest, ListAggregationAuthorizationsResponse> listAggregationAuthorizationsInvoker(
        ListAggregationAuthorizationsRequest request) {
        return new SyncInvoker<ListAggregationAuthorizationsRequest, ListAggregationAuthorizationsResponse>(request,
            ConfigMeta.listAggregationAuthorizations, hcClient);
    }

    /**
     * 查询资源聚合器列表
     *
     * 查询资源聚合器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationAggregatorsRequest 请求对象
     * @return ListConfigurationAggregatorsResponse
     */
    public ListConfigurationAggregatorsResponse listConfigurationAggregators(
        ListConfigurationAggregatorsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listConfigurationAggregators);
    }

    /**
     * 查询资源聚合器列表
     *
     * 查询资源聚合器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationAggregatorsRequest 请求对象
     * @return SyncInvoker<ListConfigurationAggregatorsRequest, ListConfigurationAggregatorsResponse>
     */
    public SyncInvoker<ListConfigurationAggregatorsRequest, ListConfigurationAggregatorsResponse> listConfigurationAggregatorsInvoker(
        ListConfigurationAggregatorsRequest request) {
        return new SyncInvoker<ListConfigurationAggregatorsRequest, ListConfigurationAggregatorsResponse>(request,
            ConfigMeta.listConfigurationAggregators, hcClient);
    }

    /**
     * 查询所有挂起的聚合请求列表
     *
     * 查询所有挂起的聚合请求列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPendingAggregationRequestsRequest 请求对象
     * @return ListPendingAggregationRequestsResponse
     */
    public ListPendingAggregationRequestsResponse listPendingAggregationRequests(
        ListPendingAggregationRequestsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listPendingAggregationRequests);
    }

    /**
     * 查询所有挂起的聚合请求列表
     *
     * 查询所有挂起的聚合请求列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPendingAggregationRequestsRequest 请求对象
     * @return SyncInvoker<ListPendingAggregationRequestsRequest, ListPendingAggregationRequestsResponse>
     */
    public SyncInvoker<ListPendingAggregationRequestsRequest, ListPendingAggregationRequestsResponse> listPendingAggregationRequestsInvoker(
        ListPendingAggregationRequestsRequest request) {
        return new SyncInvoker<ListPendingAggregationRequestsRequest, ListPendingAggregationRequestsResponse>(request,
            ConfigMeta.listPendingAggregationRequests, hcClient);
    }

    /**
     * 对指定聚合器执行高级查询
     *
     * 对指定聚合器执行高级查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAggregateResourceQueryRequest 请求对象
     * @return RunAggregateResourceQueryResponse
     */
    public RunAggregateResourceQueryResponse runAggregateResourceQuery(RunAggregateResourceQueryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.runAggregateResourceQuery);
    }

    /**
     * 对指定聚合器执行高级查询
     *
     * 对指定聚合器执行高级查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAggregateResourceQueryRequest 请求对象
     * @return SyncInvoker<RunAggregateResourceQueryRequest, RunAggregateResourceQueryResponse>
     */
    public SyncInvoker<RunAggregateResourceQueryRequest, RunAggregateResourceQueryResponse> runAggregateResourceQueryInvoker(
        RunAggregateResourceQueryRequest request) {
        return new SyncInvoker<RunAggregateResourceQueryRequest, RunAggregateResourceQueryResponse>(request,
            ConfigMeta.runAggregateResourceQuery, hcClient);
    }

    /**
     * 查询指定聚合合规规则的评估结果详情
     *
     * 返回指定聚合合规规则的评估结果详情。包含评估了哪些资源，以及每个资源是否符合规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAggregateComplianceDetailsByPolicyAssignmentRequest 请求对象
     * @return ShowAggregateComplianceDetailsByPolicyAssignmentResponse
     */
    public ShowAggregateComplianceDetailsByPolicyAssignmentResponse showAggregateComplianceDetailsByPolicyAssignment(
        ShowAggregateComplianceDetailsByPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showAggregateComplianceDetailsByPolicyAssignment);
    }

    /**
     * 查询指定聚合合规规则的评估结果详情
     *
     * 返回指定聚合合规规则的评估结果详情。包含评估了哪些资源，以及每个资源是否符合规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAggregateComplianceDetailsByPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<ShowAggregateComplianceDetailsByPolicyAssignmentRequest, ShowAggregateComplianceDetailsByPolicyAssignmentResponse>
     */
    public SyncInvoker<ShowAggregateComplianceDetailsByPolicyAssignmentRequest, ShowAggregateComplianceDetailsByPolicyAssignmentResponse> showAggregateComplianceDetailsByPolicyAssignmentInvoker(
        ShowAggregateComplianceDetailsByPolicyAssignmentRequest request) {
        return new SyncInvoker<ShowAggregateComplianceDetailsByPolicyAssignmentRequest, ShowAggregateComplianceDetailsByPolicyAssignmentResponse>(
            request, ConfigMeta.showAggregateComplianceDetailsByPolicyAssignment, hcClient);
    }

    /**
     * 查询聚合器中帐号资源的计数
     *
     * 查询聚合器中帐号资源的计数，支持通过过滤器和GroupByKey来统计资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAggregateDiscoveredResourceCountsRequest 请求对象
     * @return ShowAggregateDiscoveredResourceCountsResponse
     */
    public ShowAggregateDiscoveredResourceCountsResponse showAggregateDiscoveredResourceCounts(
        ShowAggregateDiscoveredResourceCountsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showAggregateDiscoveredResourceCounts);
    }

    /**
     * 查询聚合器中帐号资源的计数
     *
     * 查询聚合器中帐号资源的计数，支持通过过滤器和GroupByKey来统计资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAggregateDiscoveredResourceCountsRequest 请求对象
     * @return SyncInvoker<ShowAggregateDiscoveredResourceCountsRequest, ShowAggregateDiscoveredResourceCountsResponse>
     */
    public SyncInvoker<ShowAggregateDiscoveredResourceCountsRequest, ShowAggregateDiscoveredResourceCountsResponse> showAggregateDiscoveredResourceCountsInvoker(
        ShowAggregateDiscoveredResourceCountsRequest request) {
        return new SyncInvoker<ShowAggregateDiscoveredResourceCountsRequest, ShowAggregateDiscoveredResourceCountsResponse>(
            request, ConfigMeta.showAggregateDiscoveredResourceCounts, hcClient);
    }

    /**
     * 查询指定聚合合规规则详情
     *
     * 返回指定聚合合规规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAggregatePolicyAssignmentDetailRequest 请求对象
     * @return ShowAggregatePolicyAssignmentDetailResponse
     */
    public ShowAggregatePolicyAssignmentDetailResponse showAggregatePolicyAssignmentDetail(
        ShowAggregatePolicyAssignmentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showAggregatePolicyAssignmentDetail);
    }

    /**
     * 查询指定聚合合规规则详情
     *
     * 返回指定聚合合规规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAggregatePolicyAssignmentDetailRequest 请求对象
     * @return SyncInvoker<ShowAggregatePolicyAssignmentDetailRequest, ShowAggregatePolicyAssignmentDetailResponse>
     */
    public SyncInvoker<ShowAggregatePolicyAssignmentDetailRequest, ShowAggregatePolicyAssignmentDetailResponse> showAggregatePolicyAssignmentDetailInvoker(
        ShowAggregatePolicyAssignmentDetailRequest request) {
        return new SyncInvoker<ShowAggregatePolicyAssignmentDetailRequest, ShowAggregatePolicyAssignmentDetailResponse>(
            request, ConfigMeta.showAggregatePolicyAssignmentDetail, hcClient);
    }

    /**
     * 查询聚合器中一个或多个帐户的合规概况
     *
     * 查询聚合器中一个或多个帐户的合规和不合规规则数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAggregatePolicyStateComplianceSummaryRequest 请求对象
     * @return ShowAggregatePolicyStateComplianceSummaryResponse
     */
    public ShowAggregatePolicyStateComplianceSummaryResponse showAggregatePolicyStateComplianceSummary(
        ShowAggregatePolicyStateComplianceSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showAggregatePolicyStateComplianceSummary);
    }

    /**
     * 查询聚合器中一个或多个帐户的合规概况
     *
     * 查询聚合器中一个或多个帐户的合规和不合规规则数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAggregatePolicyStateComplianceSummaryRequest 请求对象
     * @return SyncInvoker<ShowAggregatePolicyStateComplianceSummaryRequest, ShowAggregatePolicyStateComplianceSummaryResponse>
     */
    public SyncInvoker<ShowAggregatePolicyStateComplianceSummaryRequest, ShowAggregatePolicyStateComplianceSummaryResponse> showAggregatePolicyStateComplianceSummaryInvoker(
        ShowAggregatePolicyStateComplianceSummaryRequest request) {
        return new SyncInvoker<ShowAggregatePolicyStateComplianceSummaryRequest, ShowAggregatePolicyStateComplianceSummaryResponse>(
            request, ConfigMeta.showAggregatePolicyStateComplianceSummary, hcClient);
    }

    /**
     * 查询源帐号中资源的详情
     *
     * 查询源帐号中特定资源的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAggregateResourceConfigRequest 请求对象
     * @return ShowAggregateResourceConfigResponse
     */
    public ShowAggregateResourceConfigResponse showAggregateResourceConfig(ShowAggregateResourceConfigRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showAggregateResourceConfig);
    }

    /**
     * 查询源帐号中资源的详情
     *
     * 查询源帐号中特定资源的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAggregateResourceConfigRequest 请求对象
     * @return SyncInvoker<ShowAggregateResourceConfigRequest, ShowAggregateResourceConfigResponse>
     */
    public SyncInvoker<ShowAggregateResourceConfigRequest, ShowAggregateResourceConfigResponse> showAggregateResourceConfigInvoker(
        ShowAggregateResourceConfigRequest request) {
        return new SyncInvoker<ShowAggregateResourceConfigRequest, ShowAggregateResourceConfigResponse>(request,
            ConfigMeta.showAggregateResourceConfig, hcClient);
    }

    /**
     * 查询指定资源聚合器
     *
     * 查询指定资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationAggregatorRequest 请求对象
     * @return ShowConfigurationAggregatorResponse
     */
    public ShowConfigurationAggregatorResponse showConfigurationAggregator(ShowConfigurationAggregatorRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showConfigurationAggregator);
    }

    /**
     * 查询指定资源聚合器
     *
     * 查询指定资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationAggregatorRequest 请求对象
     * @return SyncInvoker<ShowConfigurationAggregatorRequest, ShowConfigurationAggregatorResponse>
     */
    public SyncInvoker<ShowConfigurationAggregatorRequest, ShowConfigurationAggregatorResponse> showConfigurationAggregatorInvoker(
        ShowConfigurationAggregatorRequest request) {
        return new SyncInvoker<ShowConfigurationAggregatorRequest, ShowConfigurationAggregatorResponse>(request,
            ConfigMeta.showConfigurationAggregator, hcClient);
    }

    /**
     * 查询指定资源聚合器聚合帐号的状态信息
     *
     * 查询指定资源聚合器聚合帐号的状态信息，状态包括验证源帐号和聚合器帐号之间授权的信息。如果失败，状态包含相关的错误码或消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationAggregatorSourcesStatusRequest 请求对象
     * @return ShowConfigurationAggregatorSourcesStatusResponse
     */
    public ShowConfigurationAggregatorSourcesStatusResponse showConfigurationAggregatorSourcesStatus(
        ShowConfigurationAggregatorSourcesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showConfigurationAggregatorSourcesStatus);
    }

    /**
     * 查询指定资源聚合器聚合帐号的状态信息
     *
     * 查询指定资源聚合器聚合帐号的状态信息，状态包括验证源帐号和聚合器帐号之间授权的信息。如果失败，状态包含相关的错误码或消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationAggregatorSourcesStatusRequest 请求对象
     * @return SyncInvoker<ShowConfigurationAggregatorSourcesStatusRequest, ShowConfigurationAggregatorSourcesStatusResponse>
     */
    public SyncInvoker<ShowConfigurationAggregatorSourcesStatusRequest, ShowConfigurationAggregatorSourcesStatusResponse> showConfigurationAggregatorSourcesStatusInvoker(
        ShowConfigurationAggregatorSourcesStatusRequest request) {
        return new SyncInvoker<ShowConfigurationAggregatorSourcesStatusRequest, ShowConfigurationAggregatorSourcesStatusResponse>(
            request, ConfigMeta.showConfigurationAggregatorSourcesStatus, hcClient);
    }

    /**
     * 更新资源聚合器
     *
     * 更新资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationAggregatorRequest 请求对象
     * @return UpdateConfigurationAggregatorResponse
     */
    public UpdateConfigurationAggregatorResponse updateConfigurationAggregator(
        UpdateConfigurationAggregatorRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.updateConfigurationAggregator);
    }

    /**
     * 更新资源聚合器
     *
     * 更新资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationAggregatorRequest 请求对象
     * @return SyncInvoker<UpdateConfigurationAggregatorRequest, UpdateConfigurationAggregatorResponse>
     */
    public SyncInvoker<UpdateConfigurationAggregatorRequest, UpdateConfigurationAggregatorResponse> updateConfigurationAggregatorInvoker(
        UpdateConfigurationAggregatorRequest request) {
        return new SyncInvoker<UpdateConfigurationAggregatorRequest, UpdateConfigurationAggregatorResponse>(request,
            ConfigMeta.updateConfigurationAggregator, hcClient);
    }

    /**
     * 查询资源历史
     *
     * 查询资源与资源关系的变更历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceHistoryRequest 请求对象
     * @return ShowResourceHistoryResponse
     */
    public ShowResourceHistoryResponse showResourceHistory(ShowResourceHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showResourceHistory);
    }

    /**
     * 查询资源历史
     *
     * 查询资源与资源关系的变更历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceHistoryRequest 请求对象
     * @return SyncInvoker<ShowResourceHistoryRequest, ShowResourceHistoryResponse>
     */
    public SyncInvoker<ShowResourceHistoryRequest, ShowResourceHistoryResponse> showResourceHistoryInvoker(
        ShowResourceHistoryRequest request) {
        return new SyncInvoker<ShowResourceHistoryRequest, ShowResourceHistoryResponse>(request,
            ConfigMeta.showResourceHistory, hcClient);
    }

    /**
     * 创建或更新组织合规规则
     *
     * 创建或更新组织合规规则，如果规则名称已存在，则为更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrganizationPolicyAssignmentRequest 请求对象
     * @return CreateOrganizationPolicyAssignmentResponse
     */
    public CreateOrganizationPolicyAssignmentResponse createOrganizationPolicyAssignment(
        CreateOrganizationPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.createOrganizationPolicyAssignment);
    }

    /**
     * 创建或更新组织合规规则
     *
     * 创建或更新组织合规规则，如果规则名称已存在，则为更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrganizationPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<CreateOrganizationPolicyAssignmentRequest, CreateOrganizationPolicyAssignmentResponse>
     */
    public SyncInvoker<CreateOrganizationPolicyAssignmentRequest, CreateOrganizationPolicyAssignmentResponse> createOrganizationPolicyAssignmentInvoker(
        CreateOrganizationPolicyAssignmentRequest request) {
        return new SyncInvoker<CreateOrganizationPolicyAssignmentRequest, CreateOrganizationPolicyAssignmentResponse>(
            request, ConfigMeta.createOrganizationPolicyAssignment, hcClient);
    }

    /**
     * 创建合规规则
     *
     * 创建新的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyAssignmentsRequest 请求对象
     * @return CreatePolicyAssignmentsResponse
     */
    public CreatePolicyAssignmentsResponse createPolicyAssignments(CreatePolicyAssignmentsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.createPolicyAssignments);
    }

    /**
     * 创建合规规则
     *
     * 创建新的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyAssignmentsRequest 请求对象
     * @return SyncInvoker<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse>
     */
    public SyncInvoker<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse> createPolicyAssignmentsInvoker(
        CreatePolicyAssignmentsRequest request) {
        return new SyncInvoker<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse>(request,
            ConfigMeta.createPolicyAssignments, hcClient);
    }

    /**
     * 删除组织合规规则
     *
     * 删除组织合规规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteOrganizationPolicyAssignmentRequest 请求对象
     * @return DeleteOrganizationPolicyAssignmentResponse
     */
    public DeleteOrganizationPolicyAssignmentResponse deleteOrganizationPolicyAssignment(
        DeleteOrganizationPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.deleteOrganizationPolicyAssignment);
    }

    /**
     * 删除组织合规规则
     *
     * 删除组织合规规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteOrganizationPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<DeleteOrganizationPolicyAssignmentRequest, DeleteOrganizationPolicyAssignmentResponse>
     */
    public SyncInvoker<DeleteOrganizationPolicyAssignmentRequest, DeleteOrganizationPolicyAssignmentResponse> deleteOrganizationPolicyAssignmentInvoker(
        DeleteOrganizationPolicyAssignmentRequest request) {
        return new SyncInvoker<DeleteOrganizationPolicyAssignmentRequest, DeleteOrganizationPolicyAssignmentResponse>(
            request, ConfigMeta.deleteOrganizationPolicyAssignment, hcClient);
    }

    /**
     * 删除合规规则
     *
     * 根据规则ID删除此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyAssignmentRequest 请求对象
     * @return DeletePolicyAssignmentResponse
     */
    public DeletePolicyAssignmentResponse deletePolicyAssignment(DeletePolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.deletePolicyAssignment);
    }

    /**
     * 删除合规规则
     *
     * 根据规则ID删除此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyAssignmentRequest 请求对象
     * @return SyncInvoker<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse>
     */
    public SyncInvoker<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse> deletePolicyAssignmentInvoker(
        DeletePolicyAssignmentRequest request) {
        return new SyncInvoker<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse>(request,
            ConfigMeta.deletePolicyAssignment, hcClient);
    }

    /**
     * 停用合规规则
     *
     * 根据规则ID停用此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisablePolicyAssignmentRequest 请求对象
     * @return DisablePolicyAssignmentResponse
     */
    public DisablePolicyAssignmentResponse disablePolicyAssignment(DisablePolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.disablePolicyAssignment);
    }

    /**
     * 停用合规规则
     *
     * 根据规则ID停用此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisablePolicyAssignmentRequest 请求对象
     * @return SyncInvoker<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse>
     */
    public SyncInvoker<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse> disablePolicyAssignmentInvoker(
        DisablePolicyAssignmentRequest request) {
        return new SyncInvoker<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse>(request,
            ConfigMeta.disablePolicyAssignment, hcClient);
    }

    /**
     * 启用合规规则
     *
     * 根据规则ID启用此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnablePolicyAssignmentRequest 请求对象
     * @return EnablePolicyAssignmentResponse
     */
    public EnablePolicyAssignmentResponse enablePolicyAssignment(EnablePolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.enablePolicyAssignment);
    }

    /**
     * 启用合规规则
     *
     * 根据规则ID启用此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnablePolicyAssignmentRequest 请求对象
     * @return SyncInvoker<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse>
     */
    public SyncInvoker<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse> enablePolicyAssignmentInvoker(
        EnablePolicyAssignmentRequest request) {
        return new SyncInvoker<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse>(request,
            ConfigMeta.enablePolicyAssignment, hcClient);
    }

    /**
     * 列出内置策略
     *
     * 列出用户的内置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBuiltInPolicyDefinitionsRequest 请求对象
     * @return ListBuiltInPolicyDefinitionsResponse
     */
    public ListBuiltInPolicyDefinitionsResponse listBuiltInPolicyDefinitions(
        ListBuiltInPolicyDefinitionsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listBuiltInPolicyDefinitions);
    }

    /**
     * 列出内置策略
     *
     * 列出用户的内置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBuiltInPolicyDefinitionsRequest 请求对象
     * @return SyncInvoker<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse>
     */
    public SyncInvoker<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse> listBuiltInPolicyDefinitionsInvoker(
        ListBuiltInPolicyDefinitionsRequest request) {
        return new SyncInvoker<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse>(request,
            ConfigMeta.listBuiltInPolicyDefinitions, hcClient);
    }

    /**
     * 查询组织合规规则列表
     *
     * 查询组织合规规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOrganizationPolicyAssignmentsRequest 请求对象
     * @return ListOrganizationPolicyAssignmentsResponse
     */
    public ListOrganizationPolicyAssignmentsResponse listOrganizationPolicyAssignments(
        ListOrganizationPolicyAssignmentsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listOrganizationPolicyAssignments);
    }

    /**
     * 查询组织合规规则列表
     *
     * 查询组织合规规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOrganizationPolicyAssignmentsRequest 请求对象
     * @return SyncInvoker<ListOrganizationPolicyAssignmentsRequest, ListOrganizationPolicyAssignmentsResponse>
     */
    public SyncInvoker<ListOrganizationPolicyAssignmentsRequest, ListOrganizationPolicyAssignmentsResponse> listOrganizationPolicyAssignmentsInvoker(
        ListOrganizationPolicyAssignmentsRequest request) {
        return new SyncInvoker<ListOrganizationPolicyAssignmentsRequest, ListOrganizationPolicyAssignmentsResponse>(
            request, ConfigMeta.listOrganizationPolicyAssignments, hcClient);
    }

    /**
     * 列出合规规则
     *
     * 列出用户的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyAssignmentsRequest 请求对象
     * @return ListPolicyAssignmentsResponse
     */
    public ListPolicyAssignmentsResponse listPolicyAssignments(ListPolicyAssignmentsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listPolicyAssignments);
    }

    /**
     * 列出合规规则
     *
     * 列出用户的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyAssignmentsRequest 请求对象
     * @return SyncInvoker<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse>
     */
    public SyncInvoker<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse> listPolicyAssignmentsInvoker(
        ListPolicyAssignmentsRequest request) {
        return new SyncInvoker<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse>(request,
            ConfigMeta.listPolicyAssignments, hcClient);
    }

    /**
     * 获取规则的合规结果
     *
     * 根据规则ID查询所有的合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyStatesByAssignmentIdRequest 请求对象
     * @return ListPolicyStatesByAssignmentIdResponse
     */
    public ListPolicyStatesByAssignmentIdResponse listPolicyStatesByAssignmentId(
        ListPolicyStatesByAssignmentIdRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listPolicyStatesByAssignmentId);
    }

    /**
     * 获取规则的合规结果
     *
     * 根据规则ID查询所有的合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyStatesByAssignmentIdRequest 请求对象
     * @return SyncInvoker<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse>
     */
    public SyncInvoker<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse> listPolicyStatesByAssignmentIdInvoker(
        ListPolicyStatesByAssignmentIdRequest request) {
        return new SyncInvoker<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse>(request,
            ConfigMeta.listPolicyStatesByAssignmentId, hcClient);
    }

    /**
     * 获取用户的合规结果
     *
     * 查询用户所有的合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyStatesByDomainIdRequest 请求对象
     * @return ListPolicyStatesByDomainIdResponse
     */
    public ListPolicyStatesByDomainIdResponse listPolicyStatesByDomainId(ListPolicyStatesByDomainIdRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listPolicyStatesByDomainId);
    }

    /**
     * 获取用户的合规结果
     *
     * 查询用户所有的合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyStatesByDomainIdRequest 请求对象
     * @return SyncInvoker<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse>
     */
    public SyncInvoker<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse> listPolicyStatesByDomainIdInvoker(
        ListPolicyStatesByDomainIdRequest request) {
        return new SyncInvoker<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse>(request,
            ConfigMeta.listPolicyStatesByDomainId, hcClient);
    }

    /**
     * 获取资源的合规结果
     *
     * 根据资源ID查询所有合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyStatesByResourceIdRequest 请求对象
     * @return ListPolicyStatesByResourceIdResponse
     */
    public ListPolicyStatesByResourceIdResponse listPolicyStatesByResourceId(
        ListPolicyStatesByResourceIdRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listPolicyStatesByResourceId);
    }

    /**
     * 获取资源的合规结果
     *
     * 根据资源ID查询所有合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyStatesByResourceIdRequest 请求对象
     * @return SyncInvoker<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse>
     */
    public SyncInvoker<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse> listPolicyStatesByResourceIdInvoker(
        ListPolicyStatesByResourceIdRequest request) {
        return new SyncInvoker<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse>(request,
            ConfigMeta.listPolicyStatesByResourceId, hcClient);
    }

    /**
     * 运行合规评估
     *
     * 根据规则ID评估此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunEvaluationByPolicyAssignmentIdRequest 请求对象
     * @return RunEvaluationByPolicyAssignmentIdResponse
     */
    public RunEvaluationByPolicyAssignmentIdResponse runEvaluationByPolicyAssignmentId(
        RunEvaluationByPolicyAssignmentIdRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.runEvaluationByPolicyAssignmentId);
    }

    /**
     * 运行合规评估
     *
     * 根据规则ID评估此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunEvaluationByPolicyAssignmentIdRequest 请求对象
     * @return SyncInvoker<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse>
     */
    public SyncInvoker<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse> runEvaluationByPolicyAssignmentIdInvoker(
        RunEvaluationByPolicyAssignmentIdRequest request) {
        return new SyncInvoker<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse>(
            request, ConfigMeta.runEvaluationByPolicyAssignmentId, hcClient);
    }

    /**
     * 查询单个内置策略
     *
     * 根据策略ID查询单个内置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBuiltInPolicyDefinitionRequest 请求对象
     * @return ShowBuiltInPolicyDefinitionResponse
     */
    public ShowBuiltInPolicyDefinitionResponse showBuiltInPolicyDefinition(ShowBuiltInPolicyDefinitionRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showBuiltInPolicyDefinition);
    }

    /**
     * 查询单个内置策略
     *
     * 根据策略ID查询单个内置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBuiltInPolicyDefinitionRequest 请求对象
     * @return SyncInvoker<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse>
     */
    public SyncInvoker<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse> showBuiltInPolicyDefinitionInvoker(
        ShowBuiltInPolicyDefinitionRequest request) {
        return new SyncInvoker<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse>(request,
            ConfigMeta.showBuiltInPolicyDefinition, hcClient);
    }

    /**
     * 获取规则的评估状态
     *
     * 根据规则ID查询此规则的评估状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEvaluationStateByAssignmentIdRequest 请求对象
     * @return ShowEvaluationStateByAssignmentIdResponse
     */
    public ShowEvaluationStateByAssignmentIdResponse showEvaluationStateByAssignmentId(
        ShowEvaluationStateByAssignmentIdRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showEvaluationStateByAssignmentId);
    }

    /**
     * 获取规则的评估状态
     *
     * 根据规则ID查询此规则的评估状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEvaluationStateByAssignmentIdRequest 请求对象
     * @return SyncInvoker<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse>
     */
    public SyncInvoker<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse> showEvaluationStateByAssignmentIdInvoker(
        ShowEvaluationStateByAssignmentIdRequest request) {
        return new SyncInvoker<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse>(
            request, ConfigMeta.showEvaluationStateByAssignmentId, hcClient);
    }

    /**
     * 查询指定组织合规规则
     *
     * 查询指定组织合规规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOrganizationPolicyAssignmentRequest 请求对象
     * @return ShowOrganizationPolicyAssignmentResponse
     */
    public ShowOrganizationPolicyAssignmentResponse showOrganizationPolicyAssignment(
        ShowOrganizationPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showOrganizationPolicyAssignment);
    }

    /**
     * 查询指定组织合规规则
     *
     * 查询指定组织合规规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOrganizationPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<ShowOrganizationPolicyAssignmentRequest, ShowOrganizationPolicyAssignmentResponse>
     */
    public SyncInvoker<ShowOrganizationPolicyAssignmentRequest, ShowOrganizationPolicyAssignmentResponse> showOrganizationPolicyAssignmentInvoker(
        ShowOrganizationPolicyAssignmentRequest request) {
        return new SyncInvoker<ShowOrganizationPolicyAssignmentRequest, ShowOrganizationPolicyAssignmentResponse>(
            request, ConfigMeta.showOrganizationPolicyAssignment, hcClient);
    }

    /**
     * 查询组织内每个成员帐号合规规则部署的详细状态
     *
     * 查询组织内每个成员帐号合规规则部署的详细状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOrganizationPolicyAssignmentDetailedStatusRequest 请求对象
     * @return ShowOrganizationPolicyAssignmentDetailedStatusResponse
     */
    public ShowOrganizationPolicyAssignmentDetailedStatusResponse showOrganizationPolicyAssignmentDetailedStatus(
        ShowOrganizationPolicyAssignmentDetailedStatusRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showOrganizationPolicyAssignmentDetailedStatus);
    }

    /**
     * 查询组织内每个成员帐号合规规则部署的详细状态
     *
     * 查询组织内每个成员帐号合规规则部署的详细状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOrganizationPolicyAssignmentDetailedStatusRequest 请求对象
     * @return SyncInvoker<ShowOrganizationPolicyAssignmentDetailedStatusRequest, ShowOrganizationPolicyAssignmentDetailedStatusResponse>
     */
    public SyncInvoker<ShowOrganizationPolicyAssignmentDetailedStatusRequest, ShowOrganizationPolicyAssignmentDetailedStatusResponse> showOrganizationPolicyAssignmentDetailedStatusInvoker(
        ShowOrganizationPolicyAssignmentDetailedStatusRequest request) {
        return new SyncInvoker<ShowOrganizationPolicyAssignmentDetailedStatusRequest, ShowOrganizationPolicyAssignmentDetailedStatusResponse>(
            request, ConfigMeta.showOrganizationPolicyAssignmentDetailedStatus, hcClient);
    }

    /**
     * 查询组织合规规则部署状态
     *
     * 查询组织合规规则部署状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOrganizationPolicyAssignmentStatusesRequest 请求对象
     * @return ShowOrganizationPolicyAssignmentStatusesResponse
     */
    public ShowOrganizationPolicyAssignmentStatusesResponse showOrganizationPolicyAssignmentStatuses(
        ShowOrganizationPolicyAssignmentStatusesRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showOrganizationPolicyAssignmentStatuses);
    }

    /**
     * 查询组织合规规则部署状态
     *
     * 查询组织合规规则部署状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOrganizationPolicyAssignmentStatusesRequest 请求对象
     * @return SyncInvoker<ShowOrganizationPolicyAssignmentStatusesRequest, ShowOrganizationPolicyAssignmentStatusesResponse>
     */
    public SyncInvoker<ShowOrganizationPolicyAssignmentStatusesRequest, ShowOrganizationPolicyAssignmentStatusesResponse> showOrganizationPolicyAssignmentStatusesInvoker(
        ShowOrganizationPolicyAssignmentStatusesRequest request) {
        return new SyncInvoker<ShowOrganizationPolicyAssignmentStatusesRequest, ShowOrganizationPolicyAssignmentStatusesResponse>(
            request, ConfigMeta.showOrganizationPolicyAssignmentStatuses, hcClient);
    }

    /**
     * 获取单个合规规则
     *
     * 根据规则ID获取单个规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPolicyAssignmentRequest 请求对象
     * @return ShowPolicyAssignmentResponse
     */
    public ShowPolicyAssignmentResponse showPolicyAssignment(ShowPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showPolicyAssignment);
    }

    /**
     * 获取单个合规规则
     *
     * 根据规则ID获取单个规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse>
     */
    public SyncInvoker<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse> showPolicyAssignmentInvoker(
        ShowPolicyAssignmentRequest request) {
        return new SyncInvoker<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse>(request,
            ConfigMeta.showPolicyAssignment, hcClient);
    }

    /**
     * 更新合规规则
     *
     * 更新用户的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyAssignmentRequest 请求对象
     * @return UpdatePolicyAssignmentResponse
     */
    public UpdatePolicyAssignmentResponse updatePolicyAssignment(UpdatePolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.updatePolicyAssignment);
    }

    /**
     * 更新合规规则
     *
     * 更新用户的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyAssignmentRequest 请求对象
     * @return SyncInvoker<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse>
     */
    public SyncInvoker<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse> updatePolicyAssignmentInvoker(
        UpdatePolicyAssignmentRequest request) {
        return new SyncInvoker<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse>(request,
            ConfigMeta.updatePolicyAssignment, hcClient);
    }

    /**
     * 更新合规评估结果
     *
     * 更新用户自定义合规规则的合规评估结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyStateRequest 请求对象
     * @return UpdatePolicyStateResponse
     */
    public UpdatePolicyStateResponse updatePolicyState(UpdatePolicyStateRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.updatePolicyState);
    }

    /**
     * 更新合规评估结果
     *
     * 更新用户自定义合规规则的合规评估结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyStateRequest 请求对象
     * @return SyncInvoker<UpdatePolicyStateRequest, UpdatePolicyStateResponse>
     */
    public SyncInvoker<UpdatePolicyStateRequest, UpdatePolicyStateResponse> updatePolicyStateInvoker(
        UpdatePolicyStateRequest request) {
        return new SyncInvoker<UpdatePolicyStateRequest, UpdatePolicyStateResponse>(request,
            ConfigMeta.updatePolicyState, hcClient);
    }

    /**
     * 创建高级查询
     *
     * 创建新的高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStoredQueryRequest 请求对象
     * @return CreateStoredQueryResponse
     */
    public CreateStoredQueryResponse createStoredQuery(CreateStoredQueryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.createStoredQuery);
    }

    /**
     * 创建高级查询
     *
     * 创建新的高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStoredQueryRequest 请求对象
     * @return SyncInvoker<CreateStoredQueryRequest, CreateStoredQueryResponse>
     */
    public SyncInvoker<CreateStoredQueryRequest, CreateStoredQueryResponse> createStoredQueryInvoker(
        CreateStoredQueryRequest request) {
        return new SyncInvoker<CreateStoredQueryRequest, CreateStoredQueryResponse>(request,
            ConfigMeta.createStoredQuery, hcClient);
    }

    /**
     * 删除高级查询
     *
     * 删除单个高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStoredQueryRequest 请求对象
     * @return DeleteStoredQueryResponse
     */
    public DeleteStoredQueryResponse deleteStoredQuery(DeleteStoredQueryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.deleteStoredQuery);
    }

    /**
     * 删除高级查询
     *
     * 删除单个高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStoredQueryRequest 请求对象
     * @return SyncInvoker<DeleteStoredQueryRequest, DeleteStoredQueryResponse>
     */
    public SyncInvoker<DeleteStoredQueryRequest, DeleteStoredQueryResponse> deleteStoredQueryInvoker(
        DeleteStoredQueryRequest request) {
        return new SyncInvoker<DeleteStoredQueryRequest, DeleteStoredQueryResponse>(request,
            ConfigMeta.deleteStoredQuery, hcClient);
    }

    /**
     * 列举高级查询Schema
     *
     * List Schemas
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSchemasRequest 请求对象
     * @return ListSchemasResponse
     */
    public ListSchemasResponse listSchemas(ListSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listSchemas);
    }

    /**
     * 列举高级查询Schema
     *
     * List Schemas
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSchemasRequest 请求对象
     * @return SyncInvoker<ListSchemasRequest, ListSchemasResponse>
     */
    public SyncInvoker<ListSchemasRequest, ListSchemasResponse> listSchemasInvoker(ListSchemasRequest request) {
        return new SyncInvoker<ListSchemasRequest, ListSchemasResponse>(request, ConfigMeta.listSchemas, hcClient);
    }

    /**
     * 列出高级查询
     *
     * 列举所有高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStoredQueriesRequest 请求对象
     * @return ListStoredQueriesResponse
     */
    public ListStoredQueriesResponse listStoredQueries(ListStoredQueriesRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listStoredQueries);
    }

    /**
     * 列出高级查询
     *
     * 列举所有高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStoredQueriesRequest 请求对象
     * @return SyncInvoker<ListStoredQueriesRequest, ListStoredQueriesResponse>
     */
    public SyncInvoker<ListStoredQueriesRequest, ListStoredQueriesResponse> listStoredQueriesInvoker(
        ListStoredQueriesRequest request) {
        return new SyncInvoker<ListStoredQueriesRequest, ListStoredQueriesResponse>(request,
            ConfigMeta.listStoredQueries, hcClient);
    }

    /**
     * 运行高级查询
     *
     * 执行高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueryRequest 请求对象
     * @return RunQueryResponse
     */
    public RunQueryResponse runQuery(RunQueryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.runQuery);
    }

    /**
     * 运行高级查询
     *
     * 执行高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueryRequest 请求对象
     * @return SyncInvoker<RunQueryRequest, RunQueryResponse>
     */
    public SyncInvoker<RunQueryRequest, RunQueryResponse> runQueryInvoker(RunQueryRequest request) {
        return new SyncInvoker<RunQueryRequest, RunQueryResponse>(request, ConfigMeta.runQuery, hcClient);
    }

    /**
     * 查询单个高级查询
     *
     * Show Resource Query Language
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStoredQueryRequest 请求对象
     * @return ShowStoredQueryResponse
     */
    public ShowStoredQueryResponse showStoredQuery(ShowStoredQueryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showStoredQuery);
    }

    /**
     * 查询单个高级查询
     *
     * Show Resource Query Language
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStoredQueryRequest 请求对象
     * @return SyncInvoker<ShowStoredQueryRequest, ShowStoredQueryResponse>
     */
    public SyncInvoker<ShowStoredQueryRequest, ShowStoredQueryResponse> showStoredQueryInvoker(
        ShowStoredQueryRequest request) {
        return new SyncInvoker<ShowStoredQueryRequest, ShowStoredQueryResponse>(request, ConfigMeta.showStoredQuery,
            hcClient);
    }

    /**
     * 更新单个高级查询
     *
     * 更新自定义查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStoredQueryRequest 请求对象
     * @return UpdateStoredQueryResponse
     */
    public UpdateStoredQueryResponse updateStoredQuery(UpdateStoredQueryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.updateStoredQuery);
    }

    /**
     * 更新单个高级查询
     *
     * 更新自定义查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStoredQueryRequest 请求对象
     * @return SyncInvoker<UpdateStoredQueryRequest, UpdateStoredQueryResponse>
     */
    public SyncInvoker<UpdateStoredQueryRequest, UpdateStoredQueryResponse> updateStoredQueryInvoker(
        UpdateStoredQueryRequest request) {
        return new SyncInvoker<UpdateStoredQueryRequest, UpdateStoredQueryResponse>(request,
            ConfigMeta.updateStoredQuery, hcClient);
    }

    /**
     * 查询用户可见的区域
     *
     * 查询用户可见的区域
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRegionsRequest 请求对象
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listRegions);
    }

    /**
     * 查询用户可见的区域
     *
     * 查询用户可见的区域
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRegionsRequest 请求对象
     * @return SyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public SyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsInvoker(ListRegionsRequest request) {
        return new SyncInvoker<ListRegionsRequest, ListRegionsResponse>(request, ConfigMeta.listRegions, hcClient);
    }

    /**
     * 列举资源关系
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为\&quot;in\&quot; 或者\&quot;out\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceRelationsRequest 请求对象
     * @return ShowResourceRelationsResponse
     */
    public ShowResourceRelationsResponse showResourceRelations(ShowResourceRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showResourceRelations);
    }

    /**
     * 列举资源关系
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为\&quot;in\&quot; 或者\&quot;out\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceRelationsRequest 请求对象
     * @return SyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse>
     */
    public SyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse> showResourceRelationsInvoker(
        ShowResourceRelationsRequest request) {
        return new SyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse>(request,
            ConfigMeta.showResourceRelations, hcClient);
    }

    /**
     * 列举资源关系详情
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为“in”或者“out”，需要当帐号有rms:resources:getRelation权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceRelationsDetailRequest 请求对象
     * @return ShowResourceRelationsDetailResponse
     */
    public ShowResourceRelationsDetailResponse showResourceRelationsDetail(ShowResourceRelationsDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showResourceRelationsDetail);
    }

    /**
     * 列举资源关系详情
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为“in”或者“out”，需要当帐号有rms:resources:getRelation权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceRelationsDetailRequest 请求对象
     * @return SyncInvoker<ShowResourceRelationsDetailRequest, ShowResourceRelationsDetailResponse>
     */
    public SyncInvoker<ShowResourceRelationsDetailRequest, ShowResourceRelationsDetailResponse> showResourceRelationsDetailInvoker(
        ShowResourceRelationsDetailRequest request) {
        return new SyncInvoker<ShowResourceRelationsDetailRequest, ShowResourceRelationsDetailResponse>(request,
            ConfigMeta.showResourceRelationsDetail, hcClient);
    }

    /**
     * 列举资源概要
     *
     * 查询当前帐号的资源概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectAllResourcesSummaryRequest 请求对象
     * @return CollectAllResourcesSummaryResponse
     */
    public CollectAllResourcesSummaryResponse collectAllResourcesSummary(CollectAllResourcesSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.collectAllResourcesSummary);
    }

    /**
     * 列举资源概要
     *
     * 查询当前帐号的资源概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectAllResourcesSummaryRequest 请求对象
     * @return SyncInvoker<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse>
     */
    public SyncInvoker<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse> collectAllResourcesSummaryInvoker(
        CollectAllResourcesSummaryRequest request) {
        return new SyncInvoker<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse>(request,
            ConfigMeta.collectAllResourcesSummary, hcClient);
    }

    /**
     * 查询资源数量
     *
     * 查询当前帐号的资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountAllResourcesRequest 请求对象
     * @return CountAllResourcesResponse
     */
    public CountAllResourcesResponse countAllResources(CountAllResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.countAllResources);
    }

    /**
     * 查询资源数量
     *
     * 查询当前帐号的资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountAllResourcesRequest 请求对象
     * @return SyncInvoker<CountAllResourcesRequest, CountAllResourcesResponse>
     */
    public SyncInvoker<CountAllResourcesRequest, CountAllResourcesResponse> countAllResourcesInvoker(
        CountAllResourcesRequest request) {
        return new SyncInvoker<CountAllResourcesRequest, CountAllResourcesResponse>(request,
            ConfigMeta.countAllResources, hcClient);
    }

    /**
     * 列举所有资源
     *
     * 返回当前用户下所有资源，需要当前用户有rms:resources:list权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllResourcesRequest 请求对象
     * @return ListAllResourcesResponse
     */
    public ListAllResourcesResponse listAllResources(ListAllResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listAllResources);
    }

    /**
     * 列举所有资源
     *
     * 返回当前用户下所有资源，需要当前用户有rms:resources:list权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllResourcesRequest 请求对象
     * @return SyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse>
     */
    public SyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse> listAllResourcesInvoker(
        ListAllResourcesRequest request) {
        return new SyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse>(request, ConfigMeta.listAllResources,
            hcClient);
    }

    /**
     * 列举资源标签
     *
     * 查询当前帐号下所有资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllTagsRequest 请求对象
     * @return ListAllTagsResponse
     */
    public ListAllTagsResponse listAllTags(ListAllTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listAllTags);
    }

    /**
     * 列举资源标签
     *
     * 查询当前帐号下所有资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllTagsRequest 请求对象
     * @return SyncInvoker<ListAllTagsRequest, ListAllTagsResponse>
     */
    public SyncInvoker<ListAllTagsRequest, ListAllTagsResponse> listAllTagsInvoker(ListAllTagsRequest request) {
        return new SyncInvoker<ListAllTagsRequest, ListAllTagsResponse>(request, ConfigMeta.listAllTags, hcClient);
    }

    /**
     * 列举云服务
     *
     * 查询Config支持的云服务、资源、区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProvidersRequest 请求对象
     * @return ListProvidersResponse
     */
    public ListProvidersResponse listProviders(ListProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listProviders);
    }

    /**
     * 列举云服务
     *
     * 查询Config支持的云服务、资源、区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProvidersRequest 请求对象
     * @return SyncInvoker<ListProvidersRequest, ListProvidersResponse>
     */
    public SyncInvoker<ListProvidersRequest, ListProvidersResponse> listProvidersInvoker(ListProvidersRequest request) {
        return new SyncInvoker<ListProvidersRequest, ListProvidersResponse>(request, ConfigMeta.listProviders,
            hcClient);
    }

    /**
     * 列举指定类型的资源
     *
     * 返回当前租户下特定资源类型的资源，需要当前用户有rms:resources:list权限。比如查询云服务器，对应的Config资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。 Config支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourcesRequest 请求对象
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listResources);
    }

    /**
     * 列举指定类型的资源
     *
     * 返回当前租户下特定资源类型的资源，需要当前用户有rms:resources:list权限。比如查询云服务器，对应的Config资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。 Config支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourcesRequest 请求对象
     * @return SyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public SyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesInvoker(ListResourcesRequest request) {
        return new SyncInvoker<ListResourcesRequest, ListResourcesResponse>(request, ConfigMeta.listResources,
            hcClient);
    }

    /**
     * 查询单个资源
     *
     * 指定资源ID，返回该资源的详细信息，需要当前用户有rms:resources:get权限。比如查询云服务器，对应的Config资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。Config支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceByIdRequest 请求对象
     * @return ShowResourceByIdResponse
     */
    public ShowResourceByIdResponse showResourceById(ShowResourceByIdRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showResourceById);
    }

    /**
     * 查询单个资源
     *
     * 指定资源ID，返回该资源的详细信息，需要当前用户有rms:resources:get权限。比如查询云服务器，对应的Config资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。Config支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceByIdRequest 请求对象
     * @return SyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse>
     */
    public SyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse> showResourceByIdInvoker(
        ShowResourceByIdRequest request) {
        return new SyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse>(request, ConfigMeta.showResourceById,
            hcClient);
    }

    /**
     * 查询帐号下的单个资源
     *
     * 查询当前帐号下的单个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceDetailRequest 请求对象
     * @return ShowResourceDetailResponse
     */
    public ShowResourceDetailResponse showResourceDetail(ShowResourceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showResourceDetail);
    }

    /**
     * 查询帐号下的单个资源
     *
     * 查询当前帐号下的单个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceDetailRequest 请求对象
     * @return SyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse>
     */
    public SyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse> showResourceDetailInvoker(
        ShowResourceDetailRequest request) {
        return new SyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse>(request,
            ConfigMeta.showResourceDetail, hcClient);
    }

    /**
     * 创建或更新记录器
     *
     * 创建或更新资源记录器，只能存在一个资源记录器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrackerConfigRequest 请求对象
     * @return CreateTrackerConfigResponse
     */
    public CreateTrackerConfigResponse createTrackerConfig(CreateTrackerConfigRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.createTrackerConfig);
    }

    /**
     * 创建或更新记录器
     *
     * 创建或更新资源记录器，只能存在一个资源记录器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrackerConfigRequest 请求对象
     * @return SyncInvoker<CreateTrackerConfigRequest, CreateTrackerConfigResponse>
     */
    public SyncInvoker<CreateTrackerConfigRequest, CreateTrackerConfigResponse> createTrackerConfigInvoker(
        CreateTrackerConfigRequest request) {
        return new SyncInvoker<CreateTrackerConfigRequest, CreateTrackerConfigResponse>(request,
            ConfigMeta.createTrackerConfig, hcClient);
    }

    /**
     * 删除记录器
     *
     * 删除资源记录器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrackerConfigRequest 请求对象
     * @return DeleteTrackerConfigResponse
     */
    public DeleteTrackerConfigResponse deleteTrackerConfig(DeleteTrackerConfigRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.deleteTrackerConfig);
    }

    /**
     * 删除记录器
     *
     * 删除资源记录器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrackerConfigRequest 请求对象
     * @return SyncInvoker<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse>
     */
    public SyncInvoker<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse> deleteTrackerConfigInvoker(
        DeleteTrackerConfigRequest request) {
        return new SyncInvoker<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse>(request,
            ConfigMeta.deleteTrackerConfig, hcClient);
    }

    /**
     * 查询记录器
     *
     * 查询资源记录器的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTrackerConfigRequest 请求对象
     * @return ShowTrackerConfigResponse
     */
    public ShowTrackerConfigResponse showTrackerConfig(ShowTrackerConfigRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showTrackerConfig);
    }

    /**
     * 查询记录器
     *
     * 查询资源记录器的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTrackerConfigRequest 请求对象
     * @return SyncInvoker<ShowTrackerConfigRequest, ShowTrackerConfigResponse>
     */
    public SyncInvoker<ShowTrackerConfigRequest, ShowTrackerConfigResponse> showTrackerConfigInvoker(
        ShowTrackerConfigRequest request) {
        return new SyncInvoker<ShowTrackerConfigRequest, ShowTrackerConfigResponse>(request,
            ConfigMeta.showTrackerConfig, hcClient);
    }

}
