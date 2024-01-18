package com.huaweicloud.sdk.rms.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.rms.v1.model.CollectAllResourcesSummaryRequest;
import com.huaweicloud.sdk.rms.v1.model.CollectAllResourcesSummaryResponse;
import com.huaweicloud.sdk.rms.v1.model.CountAllResourcesRequest;
import com.huaweicloud.sdk.rms.v1.model.CountAllResourcesResponse;
import com.huaweicloud.sdk.rms.v1.model.CreateAggregationAuthorizationRequest;
import com.huaweicloud.sdk.rms.v1.model.CreateAggregationAuthorizationResponse;
import com.huaweicloud.sdk.rms.v1.model.CreateConfigurationAggregatorRequest;
import com.huaweicloud.sdk.rms.v1.model.CreateConfigurationAggregatorResponse;
import com.huaweicloud.sdk.rms.v1.model.CreateOrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.CreateOrganizationPolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.CreatePolicyAssignmentsRequest;
import com.huaweicloud.sdk.rms.v1.model.CreatePolicyAssignmentsResponse;
import com.huaweicloud.sdk.rms.v1.model.CreateStoredQueryRequest;
import com.huaweicloud.sdk.rms.v1.model.CreateStoredQueryResponse;
import com.huaweicloud.sdk.rms.v1.model.CreateTrackerConfigRequest;
import com.huaweicloud.sdk.rms.v1.model.CreateTrackerConfigResponse;
import com.huaweicloud.sdk.rms.v1.model.DeleteAggregationAuthorizationRequest;
import com.huaweicloud.sdk.rms.v1.model.DeleteAggregationAuthorizationResponse;
import com.huaweicloud.sdk.rms.v1.model.DeleteConfigurationAggregatorRequest;
import com.huaweicloud.sdk.rms.v1.model.DeleteConfigurationAggregatorResponse;
import com.huaweicloud.sdk.rms.v1.model.DeleteOrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.DeleteOrganizationPolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.DeletePendingAggregationRequestRequest;
import com.huaweicloud.sdk.rms.v1.model.DeletePendingAggregationRequestResponse;
import com.huaweicloud.sdk.rms.v1.model.DeletePolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.DeletePolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.DeleteStoredQueryRequest;
import com.huaweicloud.sdk.rms.v1.model.DeleteStoredQueryResponse;
import com.huaweicloud.sdk.rms.v1.model.DeleteTrackerConfigRequest;
import com.huaweicloud.sdk.rms.v1.model.DeleteTrackerConfigResponse;
import com.huaweicloud.sdk.rms.v1.model.DisablePolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.DisablePolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.EnablePolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.EnablePolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.ListAggregateComplianceByPolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.ListAggregateComplianceByPolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.ListAggregateDiscoveredResourcesRequest;
import com.huaweicloud.sdk.rms.v1.model.ListAggregateDiscoveredResourcesResponse;
import com.huaweicloud.sdk.rms.v1.model.ListAggregationAuthorizationsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListAggregationAuthorizationsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListAllResourcesRequest;
import com.huaweicloud.sdk.rms.v1.model.ListAllResourcesResponse;
import com.huaweicloud.sdk.rms.v1.model.ListAllTagsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListAllTagsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListBuiltInPolicyDefinitionsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListBuiltInPolicyDefinitionsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListConfigurationAggregatorsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListConfigurationAggregatorsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListOrganizationPolicyAssignmentsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListOrganizationPolicyAssignmentsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListPendingAggregationRequestsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListPendingAggregationRequestsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyAssignmentsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyAssignmentsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyStatesByAssignmentIdRequest;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyStatesByAssignmentIdResponse;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyStatesByDomainIdRequest;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyStatesByDomainIdResponse;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyStatesByResourceIdRequest;
import com.huaweicloud.sdk.rms.v1.model.ListPolicyStatesByResourceIdResponse;
import com.huaweicloud.sdk.rms.v1.model.ListProvidersRequest;
import com.huaweicloud.sdk.rms.v1.model.ListProvidersResponse;
import com.huaweicloud.sdk.rms.v1.model.ListRegionsRequest;
import com.huaweicloud.sdk.rms.v1.model.ListRegionsResponse;
import com.huaweicloud.sdk.rms.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.rms.v1.model.ListResourcesResponse;
import com.huaweicloud.sdk.rms.v1.model.ListSchemasRequest;
import com.huaweicloud.sdk.rms.v1.model.ListSchemasResponse;
import com.huaweicloud.sdk.rms.v1.model.ListStoredQueriesRequest;
import com.huaweicloud.sdk.rms.v1.model.ListStoredQueriesResponse;
import com.huaweicloud.sdk.rms.v1.model.RunAggregateResourceQueryRequest;
import com.huaweicloud.sdk.rms.v1.model.RunAggregateResourceQueryResponse;
import com.huaweicloud.sdk.rms.v1.model.RunEvaluationByPolicyAssignmentIdRequest;
import com.huaweicloud.sdk.rms.v1.model.RunEvaluationByPolicyAssignmentIdResponse;
import com.huaweicloud.sdk.rms.v1.model.RunQueryRequest;
import com.huaweicloud.sdk.rms.v1.model.RunQueryResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregateComplianceDetailsByPolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregateComplianceDetailsByPolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregateDiscoveredResourceCountsRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregateDiscoveredResourceCountsResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregatePolicyAssignmentDetailRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregatePolicyAssignmentDetailResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregatePolicyStateComplianceSummaryRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregatePolicyStateComplianceSummaryResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregateResourceConfigRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowAggregateResourceConfigResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowBuiltInPolicyDefinitionRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowBuiltInPolicyDefinitionResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowConfigurationAggregatorRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowConfigurationAggregatorResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowConfigurationAggregatorSourcesStatusRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowConfigurationAggregatorSourcesStatusResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowEvaluationStateByAssignmentIdRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowEvaluationStateByAssignmentIdResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowOrganizationPolicyAssignmentDetailedStatusRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowOrganizationPolicyAssignmentDetailedStatusResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowOrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowOrganizationPolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowOrganizationPolicyAssignmentStatusesRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowOrganizationPolicyAssignmentStatusesResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowPolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowPolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceByIdRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceByIdResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceDetailRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceDetailResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceHistoryRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceHistoryResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceRelationsDetailRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceRelationsDetailResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceRelationsRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowResourceRelationsResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowStoredQueryRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowStoredQueryResponse;
import com.huaweicloud.sdk.rms.v1.model.ShowTrackerConfigRequest;
import com.huaweicloud.sdk.rms.v1.model.ShowTrackerConfigResponse;
import com.huaweicloud.sdk.rms.v1.model.UpdateConfigurationAggregatorRequest;
import com.huaweicloud.sdk.rms.v1.model.UpdateConfigurationAggregatorResponse;
import com.huaweicloud.sdk.rms.v1.model.UpdatePolicyAssignmentRequest;
import com.huaweicloud.sdk.rms.v1.model.UpdatePolicyAssignmentResponse;
import com.huaweicloud.sdk.rms.v1.model.UpdatePolicyStateRequest;
import com.huaweicloud.sdk.rms.v1.model.UpdatePolicyStateResponse;
import com.huaweicloud.sdk.rms.v1.model.UpdateStoredQueryRequest;
import com.huaweicloud.sdk.rms.v1.model.UpdateStoredQueryResponse;

import java.util.concurrent.CompletableFuture;

public class RmsAsyncClient {

    protected HcClient hcClient;

    public RmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RmsAsyncClient> newBuilder() {
        ClientBuilder<RmsAsyncClient> clientBuilder = new ClientBuilder<>(RmsAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 创建资源聚合器授权
     *
     * 给资源聚合器帐号授予从源帐号收集数据的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAggregationAuthorizationRequest 请求对象
     * @return CompletableFuture<CreateAggregationAuthorizationResponse>
     */
    public CompletableFuture<CreateAggregationAuthorizationResponse> createAggregationAuthorizationAsync(
        CreateAggregationAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.createAggregationAuthorization);
    }

    /**
     * 创建资源聚合器授权
     *
     * 给资源聚合器帐号授予从源帐号收集数据的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAggregationAuthorizationRequest 请求对象
     * @return AsyncInvoker<CreateAggregationAuthorizationRequest, CreateAggregationAuthorizationResponse>
     */
    public AsyncInvoker<CreateAggregationAuthorizationRequest, CreateAggregationAuthorizationResponse> createAggregationAuthorizationAsyncInvoker(
        CreateAggregationAuthorizationRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.createAggregationAuthorization, hcClient);
    }

    /**
     * 创建资源聚合器
     *
     * 创建资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationAggregatorRequest 请求对象
     * @return CompletableFuture<CreateConfigurationAggregatorResponse>
     */
    public CompletableFuture<CreateConfigurationAggregatorResponse> createConfigurationAggregatorAsync(
        CreateConfigurationAggregatorRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.createConfigurationAggregator);
    }

    /**
     * 创建资源聚合器
     *
     * 创建资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationAggregatorRequest 请求对象
     * @return AsyncInvoker<CreateConfigurationAggregatorRequest, CreateConfigurationAggregatorResponse>
     */
    public AsyncInvoker<CreateConfigurationAggregatorRequest, CreateConfigurationAggregatorResponse> createConfigurationAggregatorAsyncInvoker(
        CreateConfigurationAggregatorRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.createConfigurationAggregator, hcClient);
    }

    /**
     * 删除资源聚合器授权
     *
     * 删除指定资源聚合器帐号的授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAggregationAuthorizationRequest 请求对象
     * @return CompletableFuture<DeleteAggregationAuthorizationResponse>
     */
    public CompletableFuture<DeleteAggregationAuthorizationResponse> deleteAggregationAuthorizationAsync(
        DeleteAggregationAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.deleteAggregationAuthorization);
    }

    /**
     * 删除资源聚合器授权
     *
     * 删除指定资源聚合器帐号的授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAggregationAuthorizationRequest 请求对象
     * @return AsyncInvoker<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResponse>
     */
    public AsyncInvoker<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResponse> deleteAggregationAuthorizationAsyncInvoker(
        DeleteAggregationAuthorizationRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.deleteAggregationAuthorization, hcClient);
    }

    /**
     * 删除资源聚合器
     *
     * 删除资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationAggregatorRequest 请求对象
     * @return CompletableFuture<DeleteConfigurationAggregatorResponse>
     */
    public CompletableFuture<DeleteConfigurationAggregatorResponse> deleteConfigurationAggregatorAsync(
        DeleteConfigurationAggregatorRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.deleteConfigurationAggregator);
    }

    /**
     * 删除资源聚合器
     *
     * 删除资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationAggregatorRequest 请求对象
     * @return AsyncInvoker<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResponse>
     */
    public AsyncInvoker<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResponse> deleteConfigurationAggregatorAsyncInvoker(
        DeleteConfigurationAggregatorRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.deleteConfigurationAggregator, hcClient);
    }

    /**
     * 删除聚合器帐号中挂起的授权请求
     *
     * 删除聚合器帐号中挂起的授权请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePendingAggregationRequestRequest 请求对象
     * @return CompletableFuture<DeletePendingAggregationRequestResponse>
     */
    public CompletableFuture<DeletePendingAggregationRequestResponse> deletePendingAggregationRequestAsync(
        DeletePendingAggregationRequestRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.deletePendingAggregationRequest);
    }

    /**
     * 删除聚合器帐号中挂起的授权请求
     *
     * 删除聚合器帐号中挂起的授权请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePendingAggregationRequestRequest 请求对象
     * @return AsyncInvoker<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResponse>
     */
    public AsyncInvoker<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResponse> deletePendingAggregationRequestAsyncInvoker(
        DeletePendingAggregationRequestRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.deletePendingAggregationRequest, hcClient);
    }

    /**
     * 查询聚合合规规则列表
     *
     * 查询合规和不合规规则的列表，其中包含合规和不合规规则的资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregateComplianceByPolicyAssignmentRequest 请求对象
     * @return CompletableFuture<ListAggregateComplianceByPolicyAssignmentResponse>
     */
    public CompletableFuture<ListAggregateComplianceByPolicyAssignmentResponse> listAggregateComplianceByPolicyAssignmentAsync(
        ListAggregateComplianceByPolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listAggregateComplianceByPolicyAssignment);
    }

    /**
     * 查询聚合合规规则列表
     *
     * 查询合规和不合规规则的列表，其中包含合规和不合规规则的资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregateComplianceByPolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<ListAggregateComplianceByPolicyAssignmentRequest, ListAggregateComplianceByPolicyAssignmentResponse>
     */
    public AsyncInvoker<ListAggregateComplianceByPolicyAssignmentRequest, ListAggregateComplianceByPolicyAssignmentResponse> listAggregateComplianceByPolicyAssignmentAsyncInvoker(
        ListAggregateComplianceByPolicyAssignmentRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listAggregateComplianceByPolicyAssignment, hcClient);
    }

    /**
     * 查询聚合器中资源的列表
     *
     * 查询资源聚合器中特定资源的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregateDiscoveredResourcesRequest 请求对象
     * @return CompletableFuture<ListAggregateDiscoveredResourcesResponse>
     */
    public CompletableFuture<ListAggregateDiscoveredResourcesResponse> listAggregateDiscoveredResourcesAsync(
        ListAggregateDiscoveredResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listAggregateDiscoveredResources);
    }

    /**
     * 查询聚合器中资源的列表
     *
     * 查询资源聚合器中特定资源的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregateDiscoveredResourcesRequest 请求对象
     * @return AsyncInvoker<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResponse>
     */
    public AsyncInvoker<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResponse> listAggregateDiscoveredResourcesAsyncInvoker(
        ListAggregateDiscoveredResourcesRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listAggregateDiscoveredResources, hcClient);
    }

    /**
     * 查询资源聚合器授权列表
     *
     * 查询授权过的资源聚合器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregationAuthorizationsRequest 请求对象
     * @return CompletableFuture<ListAggregationAuthorizationsResponse>
     */
    public CompletableFuture<ListAggregationAuthorizationsResponse> listAggregationAuthorizationsAsync(
        ListAggregationAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listAggregationAuthorizations);
    }

    /**
     * 查询资源聚合器授权列表
     *
     * 查询授权过的资源聚合器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregationAuthorizationsRequest 请求对象
     * @return AsyncInvoker<ListAggregationAuthorizationsRequest, ListAggregationAuthorizationsResponse>
     */
    public AsyncInvoker<ListAggregationAuthorizationsRequest, ListAggregationAuthorizationsResponse> listAggregationAuthorizationsAsyncInvoker(
        ListAggregationAuthorizationsRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listAggregationAuthorizations, hcClient);
    }

    /**
     * 查询资源聚合器列表
     *
     * 查询资源聚合器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationAggregatorsRequest 请求对象
     * @return CompletableFuture<ListConfigurationAggregatorsResponse>
     */
    public CompletableFuture<ListConfigurationAggregatorsResponse> listConfigurationAggregatorsAsync(
        ListConfigurationAggregatorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listConfigurationAggregators);
    }

    /**
     * 查询资源聚合器列表
     *
     * 查询资源聚合器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationAggregatorsRequest 请求对象
     * @return AsyncInvoker<ListConfigurationAggregatorsRequest, ListConfigurationAggregatorsResponse>
     */
    public AsyncInvoker<ListConfigurationAggregatorsRequest, ListConfigurationAggregatorsResponse> listConfigurationAggregatorsAsyncInvoker(
        ListConfigurationAggregatorsRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listConfigurationAggregators, hcClient);
    }

    /**
     * 查询所有挂起的聚合请求列表
     *
     * 查询所有挂起的聚合请求列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPendingAggregationRequestsRequest 请求对象
     * @return CompletableFuture<ListPendingAggregationRequestsResponse>
     */
    public CompletableFuture<ListPendingAggregationRequestsResponse> listPendingAggregationRequestsAsync(
        ListPendingAggregationRequestsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listPendingAggregationRequests);
    }

    /**
     * 查询所有挂起的聚合请求列表
     *
     * 查询所有挂起的聚合请求列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPendingAggregationRequestsRequest 请求对象
     * @return AsyncInvoker<ListPendingAggregationRequestsRequest, ListPendingAggregationRequestsResponse>
     */
    public AsyncInvoker<ListPendingAggregationRequestsRequest, ListPendingAggregationRequestsResponse> listPendingAggregationRequestsAsyncInvoker(
        ListPendingAggregationRequestsRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listPendingAggregationRequests, hcClient);
    }

    /**
     * 对指定聚合器执行高级查询
     *
     * 对指定聚合器执行高级查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunAggregateResourceQueryRequest 请求对象
     * @return CompletableFuture<RunAggregateResourceQueryResponse>
     */
    public CompletableFuture<RunAggregateResourceQueryResponse> runAggregateResourceQueryAsync(
        RunAggregateResourceQueryRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.runAggregateResourceQuery);
    }

    /**
     * 对指定聚合器执行高级查询
     *
     * 对指定聚合器执行高级查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunAggregateResourceQueryRequest 请求对象
     * @return AsyncInvoker<RunAggregateResourceQueryRequest, RunAggregateResourceQueryResponse>
     */
    public AsyncInvoker<RunAggregateResourceQueryRequest, RunAggregateResourceQueryResponse> runAggregateResourceQueryAsyncInvoker(
        RunAggregateResourceQueryRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.runAggregateResourceQuery, hcClient);
    }

    /**
     * 查询指定聚合合规规则的评估结果详情
     *
     * 返回指定聚合合规规则的评估结果详情。包含评估了哪些资源，以及每个资源是否符合规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregateComplianceDetailsByPolicyAssignmentRequest 请求对象
     * @return CompletableFuture<ShowAggregateComplianceDetailsByPolicyAssignmentResponse>
     */
    public CompletableFuture<ShowAggregateComplianceDetailsByPolicyAssignmentResponse> showAggregateComplianceDetailsByPolicyAssignmentAsync(
        ShowAggregateComplianceDetailsByPolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showAggregateComplianceDetailsByPolicyAssignment);
    }

    /**
     * 查询指定聚合合规规则的评估结果详情
     *
     * 返回指定聚合合规规则的评估结果详情。包含评估了哪些资源，以及每个资源是否符合规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregateComplianceDetailsByPolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<ShowAggregateComplianceDetailsByPolicyAssignmentRequest, ShowAggregateComplianceDetailsByPolicyAssignmentResponse>
     */
    public AsyncInvoker<ShowAggregateComplianceDetailsByPolicyAssignmentRequest, ShowAggregateComplianceDetailsByPolicyAssignmentResponse> showAggregateComplianceDetailsByPolicyAssignmentAsyncInvoker(
        ShowAggregateComplianceDetailsByPolicyAssignmentRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showAggregateComplianceDetailsByPolicyAssignment, hcClient);
    }

    /**
     * 查询聚合器中帐号资源的计数
     *
     * 查询聚合器中帐号资源的计数，支持通过过滤器和GroupByKey来统计资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregateDiscoveredResourceCountsRequest 请求对象
     * @return CompletableFuture<ShowAggregateDiscoveredResourceCountsResponse>
     */
    public CompletableFuture<ShowAggregateDiscoveredResourceCountsResponse> showAggregateDiscoveredResourceCountsAsync(
        ShowAggregateDiscoveredResourceCountsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showAggregateDiscoveredResourceCounts);
    }

    /**
     * 查询聚合器中帐号资源的计数
     *
     * 查询聚合器中帐号资源的计数，支持通过过滤器和GroupByKey来统计资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregateDiscoveredResourceCountsRequest 请求对象
     * @return AsyncInvoker<ShowAggregateDiscoveredResourceCountsRequest, ShowAggregateDiscoveredResourceCountsResponse>
     */
    public AsyncInvoker<ShowAggregateDiscoveredResourceCountsRequest, ShowAggregateDiscoveredResourceCountsResponse> showAggregateDiscoveredResourceCountsAsyncInvoker(
        ShowAggregateDiscoveredResourceCountsRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showAggregateDiscoveredResourceCounts, hcClient);
    }

    /**
     * 查询指定聚合合规规则详情
     *
     * 返回指定聚合合规规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregatePolicyAssignmentDetailRequest 请求对象
     * @return CompletableFuture<ShowAggregatePolicyAssignmentDetailResponse>
     */
    public CompletableFuture<ShowAggregatePolicyAssignmentDetailResponse> showAggregatePolicyAssignmentDetailAsync(
        ShowAggregatePolicyAssignmentDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showAggregatePolicyAssignmentDetail);
    }

    /**
     * 查询指定聚合合规规则详情
     *
     * 返回指定聚合合规规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregatePolicyAssignmentDetailRequest 请求对象
     * @return AsyncInvoker<ShowAggregatePolicyAssignmentDetailRequest, ShowAggregatePolicyAssignmentDetailResponse>
     */
    public AsyncInvoker<ShowAggregatePolicyAssignmentDetailRequest, ShowAggregatePolicyAssignmentDetailResponse> showAggregatePolicyAssignmentDetailAsyncInvoker(
        ShowAggregatePolicyAssignmentDetailRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showAggregatePolicyAssignmentDetail, hcClient);
    }

    /**
     * 查询聚合器中一个或多个帐户的合规概况
     *
     * 查询聚合器中一个或多个帐户的合规和不合规规则数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregatePolicyStateComplianceSummaryRequest 请求对象
     * @return CompletableFuture<ShowAggregatePolicyStateComplianceSummaryResponse>
     */
    public CompletableFuture<ShowAggregatePolicyStateComplianceSummaryResponse> showAggregatePolicyStateComplianceSummaryAsync(
        ShowAggregatePolicyStateComplianceSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showAggregatePolicyStateComplianceSummary);
    }

    /**
     * 查询聚合器中一个或多个帐户的合规概况
     *
     * 查询聚合器中一个或多个帐户的合规和不合规规则数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregatePolicyStateComplianceSummaryRequest 请求对象
     * @return AsyncInvoker<ShowAggregatePolicyStateComplianceSummaryRequest, ShowAggregatePolicyStateComplianceSummaryResponse>
     */
    public AsyncInvoker<ShowAggregatePolicyStateComplianceSummaryRequest, ShowAggregatePolicyStateComplianceSummaryResponse> showAggregatePolicyStateComplianceSummaryAsyncInvoker(
        ShowAggregatePolicyStateComplianceSummaryRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showAggregatePolicyStateComplianceSummary, hcClient);
    }

    /**
     * 查询源帐号中资源的详情
     *
     * 查询源帐号中特定资源的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregateResourceConfigRequest 请求对象
     * @return CompletableFuture<ShowAggregateResourceConfigResponse>
     */
    public CompletableFuture<ShowAggregateResourceConfigResponse> showAggregateResourceConfigAsync(
        ShowAggregateResourceConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showAggregateResourceConfig);
    }

    /**
     * 查询源帐号中资源的详情
     *
     * 查询源帐号中特定资源的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregateResourceConfigRequest 请求对象
     * @return AsyncInvoker<ShowAggregateResourceConfigRequest, ShowAggregateResourceConfigResponse>
     */
    public AsyncInvoker<ShowAggregateResourceConfigRequest, ShowAggregateResourceConfigResponse> showAggregateResourceConfigAsyncInvoker(
        ShowAggregateResourceConfigRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showAggregateResourceConfig, hcClient);
    }

    /**
     * 查询指定资源聚合器
     *
     * 查询指定资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationAggregatorRequest 请求对象
     * @return CompletableFuture<ShowConfigurationAggregatorResponse>
     */
    public CompletableFuture<ShowConfigurationAggregatorResponse> showConfigurationAggregatorAsync(
        ShowConfigurationAggregatorRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showConfigurationAggregator);
    }

    /**
     * 查询指定资源聚合器
     *
     * 查询指定资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationAggregatorRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationAggregatorRequest, ShowConfigurationAggregatorResponse>
     */
    public AsyncInvoker<ShowConfigurationAggregatorRequest, ShowConfigurationAggregatorResponse> showConfigurationAggregatorAsyncInvoker(
        ShowConfigurationAggregatorRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showConfigurationAggregator, hcClient);
    }

    /**
     * 查询指定资源聚合器聚合帐号的状态信息
     *
     * 查询指定资源聚合器聚合帐号的状态信息，状态包括验证源帐号和聚合器帐号之间授权的信息。如果失败，状态包含相关的错误码或消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationAggregatorSourcesStatusRequest 请求对象
     * @return CompletableFuture<ShowConfigurationAggregatorSourcesStatusResponse>
     */
    public CompletableFuture<ShowConfigurationAggregatorSourcesStatusResponse> showConfigurationAggregatorSourcesStatusAsync(
        ShowConfigurationAggregatorSourcesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showConfigurationAggregatorSourcesStatus);
    }

    /**
     * 查询指定资源聚合器聚合帐号的状态信息
     *
     * 查询指定资源聚合器聚合帐号的状态信息，状态包括验证源帐号和聚合器帐号之间授权的信息。如果失败，状态包含相关的错误码或消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationAggregatorSourcesStatusRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationAggregatorSourcesStatusRequest, ShowConfigurationAggregatorSourcesStatusResponse>
     */
    public AsyncInvoker<ShowConfigurationAggregatorSourcesStatusRequest, ShowConfigurationAggregatorSourcesStatusResponse> showConfigurationAggregatorSourcesStatusAsyncInvoker(
        ShowConfigurationAggregatorSourcesStatusRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showConfigurationAggregatorSourcesStatus, hcClient);
    }

    /**
     * 更新资源聚合器
     *
     * 更新资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationAggregatorRequest 请求对象
     * @return CompletableFuture<UpdateConfigurationAggregatorResponse>
     */
    public CompletableFuture<UpdateConfigurationAggregatorResponse> updateConfigurationAggregatorAsync(
        UpdateConfigurationAggregatorRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.updateConfigurationAggregator);
    }

    /**
     * 更新资源聚合器
     *
     * 更新资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationAggregatorRequest 请求对象
     * @return AsyncInvoker<UpdateConfigurationAggregatorRequest, UpdateConfigurationAggregatorResponse>
     */
    public AsyncInvoker<UpdateConfigurationAggregatorRequest, UpdateConfigurationAggregatorResponse> updateConfigurationAggregatorAsyncInvoker(
        UpdateConfigurationAggregatorRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.updateConfigurationAggregator, hcClient);
    }

    /**
     * 查询资源历史
     *
     * 查询资源与资源关系的变更历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceHistoryRequest 请求对象
     * @return CompletableFuture<ShowResourceHistoryResponse>
     */
    public CompletableFuture<ShowResourceHistoryResponse> showResourceHistoryAsync(ShowResourceHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showResourceHistory);
    }

    /**
     * 查询资源历史
     *
     * 查询资源与资源关系的变更历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceHistoryRequest 请求对象
     * @return AsyncInvoker<ShowResourceHistoryRequest, ShowResourceHistoryResponse>
     */
    public AsyncInvoker<ShowResourceHistoryRequest, ShowResourceHistoryResponse> showResourceHistoryAsyncInvoker(
        ShowResourceHistoryRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showResourceHistory, hcClient);
    }

    /**
     * 创建或更新组织合规规则
     *
     * 创建或更新组织合规规则，如果规则名称已存在，则为更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrganizationPolicyAssignmentRequest 请求对象
     * @return CompletableFuture<CreateOrganizationPolicyAssignmentResponse>
     */
    public CompletableFuture<CreateOrganizationPolicyAssignmentResponse> createOrganizationPolicyAssignmentAsync(
        CreateOrganizationPolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.createOrganizationPolicyAssignment);
    }

    /**
     * 创建或更新组织合规规则
     *
     * 创建或更新组织合规规则，如果规则名称已存在，则为更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrganizationPolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<CreateOrganizationPolicyAssignmentRequest, CreateOrganizationPolicyAssignmentResponse>
     */
    public AsyncInvoker<CreateOrganizationPolicyAssignmentRequest, CreateOrganizationPolicyAssignmentResponse> createOrganizationPolicyAssignmentAsyncInvoker(
        CreateOrganizationPolicyAssignmentRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.createOrganizationPolicyAssignment, hcClient);
    }

    /**
     * 创建合规规则
     *
     * 创建新的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyAssignmentsRequest 请求对象
     * @return CompletableFuture<CreatePolicyAssignmentsResponse>
     */
    public CompletableFuture<CreatePolicyAssignmentsResponse> createPolicyAssignmentsAsync(
        CreatePolicyAssignmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.createPolicyAssignments);
    }

    /**
     * 创建合规规则
     *
     * 创建新的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyAssignmentsRequest 请求对象
     * @return AsyncInvoker<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse>
     */
    public AsyncInvoker<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse> createPolicyAssignmentsAsyncInvoker(
        CreatePolicyAssignmentsRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.createPolicyAssignments, hcClient);
    }

    /**
     * 删除组织合规规则
     *
     * 删除组织合规规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrganizationPolicyAssignmentRequest 请求对象
     * @return CompletableFuture<DeleteOrganizationPolicyAssignmentResponse>
     */
    public CompletableFuture<DeleteOrganizationPolicyAssignmentResponse> deleteOrganizationPolicyAssignmentAsync(
        DeleteOrganizationPolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.deleteOrganizationPolicyAssignment);
    }

    /**
     * 删除组织合规规则
     *
     * 删除组织合规规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrganizationPolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<DeleteOrganizationPolicyAssignmentRequest, DeleteOrganizationPolicyAssignmentResponse>
     */
    public AsyncInvoker<DeleteOrganizationPolicyAssignmentRequest, DeleteOrganizationPolicyAssignmentResponse> deleteOrganizationPolicyAssignmentAsyncInvoker(
        DeleteOrganizationPolicyAssignmentRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.deleteOrganizationPolicyAssignment, hcClient);
    }

    /**
     * 删除合规规则
     *
     * 根据规则ID删除此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyAssignmentRequest 请求对象
     * @return CompletableFuture<DeletePolicyAssignmentResponse>
     */
    public CompletableFuture<DeletePolicyAssignmentResponse> deletePolicyAssignmentAsync(
        DeletePolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.deletePolicyAssignment);
    }

    /**
     * 删除合规规则
     *
     * 根据规则ID删除此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse>
     */
    public AsyncInvoker<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse> deletePolicyAssignmentAsyncInvoker(
        DeletePolicyAssignmentRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.deletePolicyAssignment, hcClient);
    }

    /**
     * 停用合规规则
     *
     * 根据规则ID停用此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisablePolicyAssignmentRequest 请求对象
     * @return CompletableFuture<DisablePolicyAssignmentResponse>
     */
    public CompletableFuture<DisablePolicyAssignmentResponse> disablePolicyAssignmentAsync(
        DisablePolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.disablePolicyAssignment);
    }

    /**
     * 停用合规规则
     *
     * 根据规则ID停用此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisablePolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse>
     */
    public AsyncInvoker<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse> disablePolicyAssignmentAsyncInvoker(
        DisablePolicyAssignmentRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.disablePolicyAssignment, hcClient);
    }

    /**
     * 启用合规规则
     *
     * 根据规则ID启用此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnablePolicyAssignmentRequest 请求对象
     * @return CompletableFuture<EnablePolicyAssignmentResponse>
     */
    public CompletableFuture<EnablePolicyAssignmentResponse> enablePolicyAssignmentAsync(
        EnablePolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.enablePolicyAssignment);
    }

    /**
     * 启用合规规则
     *
     * 根据规则ID启用此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnablePolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse>
     */
    public AsyncInvoker<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse> enablePolicyAssignmentAsyncInvoker(
        EnablePolicyAssignmentRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.enablePolicyAssignment, hcClient);
    }

    /**
     * 列出内置策略
     *
     * 列出用户的内置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuiltInPolicyDefinitionsRequest 请求对象
     * @return CompletableFuture<ListBuiltInPolicyDefinitionsResponse>
     */
    public CompletableFuture<ListBuiltInPolicyDefinitionsResponse> listBuiltInPolicyDefinitionsAsync(
        ListBuiltInPolicyDefinitionsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listBuiltInPolicyDefinitions);
    }

    /**
     * 列出内置策略
     *
     * 列出用户的内置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuiltInPolicyDefinitionsRequest 请求对象
     * @return AsyncInvoker<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse>
     */
    public AsyncInvoker<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse> listBuiltInPolicyDefinitionsAsyncInvoker(
        ListBuiltInPolicyDefinitionsRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listBuiltInPolicyDefinitions, hcClient);
    }

    /**
     * 查询组织合规规则列表
     *
     * 查询组织合规规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationPolicyAssignmentsRequest 请求对象
     * @return CompletableFuture<ListOrganizationPolicyAssignmentsResponse>
     */
    public CompletableFuture<ListOrganizationPolicyAssignmentsResponse> listOrganizationPolicyAssignmentsAsync(
        ListOrganizationPolicyAssignmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listOrganizationPolicyAssignments);
    }

    /**
     * 查询组织合规规则列表
     *
     * 查询组织合规规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationPolicyAssignmentsRequest 请求对象
     * @return AsyncInvoker<ListOrganizationPolicyAssignmentsRequest, ListOrganizationPolicyAssignmentsResponse>
     */
    public AsyncInvoker<ListOrganizationPolicyAssignmentsRequest, ListOrganizationPolicyAssignmentsResponse> listOrganizationPolicyAssignmentsAsyncInvoker(
        ListOrganizationPolicyAssignmentsRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listOrganizationPolicyAssignments, hcClient);
    }

    /**
     * 列出合规规则
     *
     * 列出用户的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyAssignmentsRequest 请求对象
     * @return CompletableFuture<ListPolicyAssignmentsResponse>
     */
    public CompletableFuture<ListPolicyAssignmentsResponse> listPolicyAssignmentsAsync(
        ListPolicyAssignmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listPolicyAssignments);
    }

    /**
     * 列出合规规则
     *
     * 列出用户的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyAssignmentsRequest 请求对象
     * @return AsyncInvoker<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse>
     */
    public AsyncInvoker<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse> listPolicyAssignmentsAsyncInvoker(
        ListPolicyAssignmentsRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listPolicyAssignments, hcClient);
    }

    /**
     * 获取规则的合规结果
     *
     * 根据规则ID查询所有的合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyStatesByAssignmentIdRequest 请求对象
     * @return CompletableFuture<ListPolicyStatesByAssignmentIdResponse>
     */
    public CompletableFuture<ListPolicyStatesByAssignmentIdResponse> listPolicyStatesByAssignmentIdAsync(
        ListPolicyStatesByAssignmentIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listPolicyStatesByAssignmentId);
    }

    /**
     * 获取规则的合规结果
     *
     * 根据规则ID查询所有的合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyStatesByAssignmentIdRequest 请求对象
     * @return AsyncInvoker<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse>
     */
    public AsyncInvoker<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse> listPolicyStatesByAssignmentIdAsyncInvoker(
        ListPolicyStatesByAssignmentIdRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listPolicyStatesByAssignmentId, hcClient);
    }

    /**
     * 获取用户的合规结果
     *
     * 查询用户所有的合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyStatesByDomainIdRequest 请求对象
     * @return CompletableFuture<ListPolicyStatesByDomainIdResponse>
     */
    public CompletableFuture<ListPolicyStatesByDomainIdResponse> listPolicyStatesByDomainIdAsync(
        ListPolicyStatesByDomainIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listPolicyStatesByDomainId);
    }

    /**
     * 获取用户的合规结果
     *
     * 查询用户所有的合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyStatesByDomainIdRequest 请求对象
     * @return AsyncInvoker<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse>
     */
    public AsyncInvoker<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse> listPolicyStatesByDomainIdAsyncInvoker(
        ListPolicyStatesByDomainIdRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listPolicyStatesByDomainId, hcClient);
    }

    /**
     * 获取资源的合规结果
     *
     * 根据资源ID查询所有合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyStatesByResourceIdRequest 请求对象
     * @return CompletableFuture<ListPolicyStatesByResourceIdResponse>
     */
    public CompletableFuture<ListPolicyStatesByResourceIdResponse> listPolicyStatesByResourceIdAsync(
        ListPolicyStatesByResourceIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listPolicyStatesByResourceId);
    }

    /**
     * 获取资源的合规结果
     *
     * 根据资源ID查询所有合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyStatesByResourceIdRequest 请求对象
     * @return AsyncInvoker<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse>
     */
    public AsyncInvoker<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse> listPolicyStatesByResourceIdAsyncInvoker(
        ListPolicyStatesByResourceIdRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listPolicyStatesByResourceId, hcClient);
    }

    /**
     * 运行合规评估
     *
     * 根据规则ID评估此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunEvaluationByPolicyAssignmentIdRequest 请求对象
     * @return CompletableFuture<RunEvaluationByPolicyAssignmentIdResponse>
     */
    public CompletableFuture<RunEvaluationByPolicyAssignmentIdResponse> runEvaluationByPolicyAssignmentIdAsync(
        RunEvaluationByPolicyAssignmentIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.runEvaluationByPolicyAssignmentId);
    }

    /**
     * 运行合规评估
     *
     * 根据规则ID评估此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunEvaluationByPolicyAssignmentIdRequest 请求对象
     * @return AsyncInvoker<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse>
     */
    public AsyncInvoker<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse> runEvaluationByPolicyAssignmentIdAsyncInvoker(
        RunEvaluationByPolicyAssignmentIdRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.runEvaluationByPolicyAssignmentId, hcClient);
    }

    /**
     * 查询单个内置策略
     *
     * 根据策略ID查询单个内置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuiltInPolicyDefinitionRequest 请求对象
     * @return CompletableFuture<ShowBuiltInPolicyDefinitionResponse>
     */
    public CompletableFuture<ShowBuiltInPolicyDefinitionResponse> showBuiltInPolicyDefinitionAsync(
        ShowBuiltInPolicyDefinitionRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showBuiltInPolicyDefinition);
    }

    /**
     * 查询单个内置策略
     *
     * 根据策略ID查询单个内置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuiltInPolicyDefinitionRequest 请求对象
     * @return AsyncInvoker<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse>
     */
    public AsyncInvoker<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse> showBuiltInPolicyDefinitionAsyncInvoker(
        ShowBuiltInPolicyDefinitionRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showBuiltInPolicyDefinition, hcClient);
    }

    /**
     * 获取规则的评估状态
     *
     * 根据规则ID查询此规则的评估状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEvaluationStateByAssignmentIdRequest 请求对象
     * @return CompletableFuture<ShowEvaluationStateByAssignmentIdResponse>
     */
    public CompletableFuture<ShowEvaluationStateByAssignmentIdResponse> showEvaluationStateByAssignmentIdAsync(
        ShowEvaluationStateByAssignmentIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showEvaluationStateByAssignmentId);
    }

    /**
     * 获取规则的评估状态
     *
     * 根据规则ID查询此规则的评估状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEvaluationStateByAssignmentIdRequest 请求对象
     * @return AsyncInvoker<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse>
     */
    public AsyncInvoker<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse> showEvaluationStateByAssignmentIdAsyncInvoker(
        ShowEvaluationStateByAssignmentIdRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showEvaluationStateByAssignmentId, hcClient);
    }

    /**
     * 查询指定组织合规规则
     *
     * 查询指定组织合规规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyAssignmentRequest 请求对象
     * @return CompletableFuture<ShowOrganizationPolicyAssignmentResponse>
     */
    public CompletableFuture<ShowOrganizationPolicyAssignmentResponse> showOrganizationPolicyAssignmentAsync(
        ShowOrganizationPolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showOrganizationPolicyAssignment);
    }

    /**
     * 查询指定组织合规规则
     *
     * 查询指定组织合规规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<ShowOrganizationPolicyAssignmentRequest, ShowOrganizationPolicyAssignmentResponse>
     */
    public AsyncInvoker<ShowOrganizationPolicyAssignmentRequest, ShowOrganizationPolicyAssignmentResponse> showOrganizationPolicyAssignmentAsyncInvoker(
        ShowOrganizationPolicyAssignmentRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showOrganizationPolicyAssignment, hcClient);
    }

    /**
     * 查询组织内每个成员帐号合规规则部署的详细状态
     *
     * 查询组织内每个成员帐号合规规则部署的详细状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyAssignmentDetailedStatusRequest 请求对象
     * @return CompletableFuture<ShowOrganizationPolicyAssignmentDetailedStatusResponse>
     */
    public CompletableFuture<ShowOrganizationPolicyAssignmentDetailedStatusResponse> showOrganizationPolicyAssignmentDetailedStatusAsync(
        ShowOrganizationPolicyAssignmentDetailedStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showOrganizationPolicyAssignmentDetailedStatus);
    }

    /**
     * 查询组织内每个成员帐号合规规则部署的详细状态
     *
     * 查询组织内每个成员帐号合规规则部署的详细状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyAssignmentDetailedStatusRequest 请求对象
     * @return AsyncInvoker<ShowOrganizationPolicyAssignmentDetailedStatusRequest, ShowOrganizationPolicyAssignmentDetailedStatusResponse>
     */
    public AsyncInvoker<ShowOrganizationPolicyAssignmentDetailedStatusRequest, ShowOrganizationPolicyAssignmentDetailedStatusResponse> showOrganizationPolicyAssignmentDetailedStatusAsyncInvoker(
        ShowOrganizationPolicyAssignmentDetailedStatusRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showOrganizationPolicyAssignmentDetailedStatus, hcClient);
    }

    /**
     * 查询组织合规规则部署状态
     *
     * 查询组织合规规则部署状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyAssignmentStatusesRequest 请求对象
     * @return CompletableFuture<ShowOrganizationPolicyAssignmentStatusesResponse>
     */
    public CompletableFuture<ShowOrganizationPolicyAssignmentStatusesResponse> showOrganizationPolicyAssignmentStatusesAsync(
        ShowOrganizationPolicyAssignmentStatusesRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showOrganizationPolicyAssignmentStatuses);
    }

    /**
     * 查询组织合规规则部署状态
     *
     * 查询组织合规规则部署状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyAssignmentStatusesRequest 请求对象
     * @return AsyncInvoker<ShowOrganizationPolicyAssignmentStatusesRequest, ShowOrganizationPolicyAssignmentStatusesResponse>
     */
    public AsyncInvoker<ShowOrganizationPolicyAssignmentStatusesRequest, ShowOrganizationPolicyAssignmentStatusesResponse> showOrganizationPolicyAssignmentStatusesAsyncInvoker(
        ShowOrganizationPolicyAssignmentStatusesRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showOrganizationPolicyAssignmentStatuses, hcClient);
    }

    /**
     * 获取单个合规规则
     *
     * 根据规则ID获取单个规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyAssignmentRequest 请求对象
     * @return CompletableFuture<ShowPolicyAssignmentResponse>
     */
    public CompletableFuture<ShowPolicyAssignmentResponse> showPolicyAssignmentAsync(
        ShowPolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showPolicyAssignment);
    }

    /**
     * 获取单个合规规则
     *
     * 根据规则ID获取单个规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse>
     */
    public AsyncInvoker<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse> showPolicyAssignmentAsyncInvoker(
        ShowPolicyAssignmentRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showPolicyAssignment, hcClient);
    }

    /**
     * 更新合规规则
     *
     * 更新用户的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyAssignmentRequest 请求对象
     * @return CompletableFuture<UpdatePolicyAssignmentResponse>
     */
    public CompletableFuture<UpdatePolicyAssignmentResponse> updatePolicyAssignmentAsync(
        UpdatePolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.updatePolicyAssignment);
    }

    /**
     * 更新合规规则
     *
     * 更新用户的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse>
     */
    public AsyncInvoker<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse> updatePolicyAssignmentAsyncInvoker(
        UpdatePolicyAssignmentRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.updatePolicyAssignment, hcClient);
    }

    /**
     * 更新合规评估结果
     *
     * 更新用户自定义合规规则的合规评估结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyStateRequest 请求对象
     * @return CompletableFuture<UpdatePolicyStateResponse>
     */
    public CompletableFuture<UpdatePolicyStateResponse> updatePolicyStateAsync(UpdatePolicyStateRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.updatePolicyState);
    }

    /**
     * 更新合规评估结果
     *
     * 更新用户自定义合规规则的合规评估结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyStateRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyStateRequest, UpdatePolicyStateResponse>
     */
    public AsyncInvoker<UpdatePolicyStateRequest, UpdatePolicyStateResponse> updatePolicyStateAsyncInvoker(
        UpdatePolicyStateRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.updatePolicyState, hcClient);
    }

    /**
     * 创建高级查询
     *
     * 创建新的高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStoredQueryRequest 请求对象
     * @return CompletableFuture<CreateStoredQueryResponse>
     */
    public CompletableFuture<CreateStoredQueryResponse> createStoredQueryAsync(CreateStoredQueryRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.createStoredQuery);
    }

    /**
     * 创建高级查询
     *
     * 创建新的高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStoredQueryRequest 请求对象
     * @return AsyncInvoker<CreateStoredQueryRequest, CreateStoredQueryResponse>
     */
    public AsyncInvoker<CreateStoredQueryRequest, CreateStoredQueryResponse> createStoredQueryAsyncInvoker(
        CreateStoredQueryRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.createStoredQuery, hcClient);
    }

    /**
     * 删除高级查询
     *
     * 删除单个高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStoredQueryRequest 请求对象
     * @return CompletableFuture<DeleteStoredQueryResponse>
     */
    public CompletableFuture<DeleteStoredQueryResponse> deleteStoredQueryAsync(DeleteStoredQueryRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.deleteStoredQuery);
    }

    /**
     * 删除高级查询
     *
     * 删除单个高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStoredQueryRequest 请求对象
     * @return AsyncInvoker<DeleteStoredQueryRequest, DeleteStoredQueryResponse>
     */
    public AsyncInvoker<DeleteStoredQueryRequest, DeleteStoredQueryResponse> deleteStoredQueryAsyncInvoker(
        DeleteStoredQueryRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.deleteStoredQuery, hcClient);
    }

    /**
     * 列举高级查询Schema
     *
     * List Schemas
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemasRequest 请求对象
     * @return CompletableFuture<ListSchemasResponse>
     */
    public CompletableFuture<ListSchemasResponse> listSchemasAsync(ListSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listSchemas);
    }

    /**
     * 列举高级查询Schema
     *
     * List Schemas
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemasRequest 请求对象
     * @return AsyncInvoker<ListSchemasRequest, ListSchemasResponse>
     */
    public AsyncInvoker<ListSchemasRequest, ListSchemasResponse> listSchemasAsyncInvoker(ListSchemasRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listSchemas, hcClient);
    }

    /**
     * 列出高级查询
     *
     * 列举所有高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoredQueriesRequest 请求对象
     * @return CompletableFuture<ListStoredQueriesResponse>
     */
    public CompletableFuture<ListStoredQueriesResponse> listStoredQueriesAsync(ListStoredQueriesRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listStoredQueries);
    }

    /**
     * 列出高级查询
     *
     * 列举所有高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoredQueriesRequest 请求对象
     * @return AsyncInvoker<ListStoredQueriesRequest, ListStoredQueriesResponse>
     */
    public AsyncInvoker<ListStoredQueriesRequest, ListStoredQueriesResponse> listStoredQueriesAsyncInvoker(
        ListStoredQueriesRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listStoredQueries, hcClient);
    }

    /**
     * 运行高级查询
     *
     * 执行高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunQueryRequest 请求对象
     * @return CompletableFuture<RunQueryResponse>
     */
    public CompletableFuture<RunQueryResponse> runQueryAsync(RunQueryRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.runQuery);
    }

    /**
     * 运行高级查询
     *
     * 执行高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunQueryRequest 请求对象
     * @return AsyncInvoker<RunQueryRequest, RunQueryResponse>
     */
    public AsyncInvoker<RunQueryRequest, RunQueryResponse> runQueryAsyncInvoker(RunQueryRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.runQuery, hcClient);
    }

    /**
     * 查询单个高级查询
     *
     * Show Resource Query Language
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStoredQueryRequest 请求对象
     * @return CompletableFuture<ShowStoredQueryResponse>
     */
    public CompletableFuture<ShowStoredQueryResponse> showStoredQueryAsync(ShowStoredQueryRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showStoredQuery);
    }

    /**
     * 查询单个高级查询
     *
     * Show Resource Query Language
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStoredQueryRequest 请求对象
     * @return AsyncInvoker<ShowStoredQueryRequest, ShowStoredQueryResponse>
     */
    public AsyncInvoker<ShowStoredQueryRequest, ShowStoredQueryResponse> showStoredQueryAsyncInvoker(
        ShowStoredQueryRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showStoredQuery, hcClient);
    }

    /**
     * 更新单个高级查询
     *
     * 更新自定义查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStoredQueryRequest 请求对象
     * @return CompletableFuture<UpdateStoredQueryResponse>
     */
    public CompletableFuture<UpdateStoredQueryResponse> updateStoredQueryAsync(UpdateStoredQueryRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.updateStoredQuery);
    }

    /**
     * 更新单个高级查询
     *
     * 更新自定义查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStoredQueryRequest 请求对象
     * @return AsyncInvoker<UpdateStoredQueryRequest, UpdateStoredQueryResponse>
     */
    public AsyncInvoker<UpdateStoredQueryRequest, UpdateStoredQueryResponse> updateStoredQueryAsyncInvoker(
        UpdateStoredQueryRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.updateStoredQuery, hcClient);
    }

    /**
     * 查询用户可见的区域
     *
     * 查询用户可见的区域
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return CompletableFuture<ListRegionsResponse>
     */
    public CompletableFuture<ListRegionsResponse> listRegionsAsync(ListRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listRegions);
    }

    /**
     * 查询用户可见的区域
     *
     * 查询用户可见的区域
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return AsyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public AsyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsAsyncInvoker(ListRegionsRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listRegions, hcClient);
    }

    /**
     * 列举资源关系
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为\&quot;in\&quot; 或者\&quot;out\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsRequest 请求对象
     * @return CompletableFuture<ShowResourceRelationsResponse>
     */
    public CompletableFuture<ShowResourceRelationsResponse> showResourceRelationsAsync(
        ShowResourceRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showResourceRelations);
    }

    /**
     * 列举资源关系
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为\&quot;in\&quot; 或者\&quot;out\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsRequest 请求对象
     * @return AsyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse>
     */
    public AsyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse> showResourceRelationsAsyncInvoker(
        ShowResourceRelationsRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showResourceRelations, hcClient);
    }

    /**
     * 列举资源关系详情
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为“in”或者“out”，需要当帐号有rms:resources:getRelation权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsDetailRequest 请求对象
     * @return CompletableFuture<ShowResourceRelationsDetailResponse>
     */
    public CompletableFuture<ShowResourceRelationsDetailResponse> showResourceRelationsDetailAsync(
        ShowResourceRelationsDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showResourceRelationsDetail);
    }

    /**
     * 列举资源关系详情
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为“in”或者“out”，需要当帐号有rms:resources:getRelation权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsDetailRequest 请求对象
     * @return AsyncInvoker<ShowResourceRelationsDetailRequest, ShowResourceRelationsDetailResponse>
     */
    public AsyncInvoker<ShowResourceRelationsDetailRequest, ShowResourceRelationsDetailResponse> showResourceRelationsDetailAsyncInvoker(
        ShowResourceRelationsDetailRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showResourceRelationsDetail, hcClient);
    }

    /**
     * 列举资源概要
     *
     * 查询当前帐号的资源概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectAllResourcesSummaryRequest 请求对象
     * @return CompletableFuture<CollectAllResourcesSummaryResponse>
     */
    public CompletableFuture<CollectAllResourcesSummaryResponse> collectAllResourcesSummaryAsync(
        CollectAllResourcesSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.collectAllResourcesSummary);
    }

    /**
     * 列举资源概要
     *
     * 查询当前帐号的资源概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectAllResourcesSummaryRequest 请求对象
     * @return AsyncInvoker<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse>
     */
    public AsyncInvoker<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse> collectAllResourcesSummaryAsyncInvoker(
        CollectAllResourcesSummaryRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.collectAllResourcesSummary, hcClient);
    }

    /**
     * 查询资源数量
     *
     * 查询当前帐号的资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAllResourcesRequest 请求对象
     * @return CompletableFuture<CountAllResourcesResponse>
     */
    public CompletableFuture<CountAllResourcesResponse> countAllResourcesAsync(CountAllResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.countAllResources);
    }

    /**
     * 查询资源数量
     *
     * 查询当前帐号的资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAllResourcesRequest 请求对象
     * @return AsyncInvoker<CountAllResourcesRequest, CountAllResourcesResponse>
     */
    public AsyncInvoker<CountAllResourcesRequest, CountAllResourcesResponse> countAllResourcesAsyncInvoker(
        CountAllResourcesRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.countAllResources, hcClient);
    }

    /**
     * 列举所有资源
     *
     * 返回当前用户下所有资源，需要当前用户有rms:resources:list权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllResourcesRequest 请求对象
     * @return CompletableFuture<ListAllResourcesResponse>
     */
    public CompletableFuture<ListAllResourcesResponse> listAllResourcesAsync(ListAllResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listAllResources);
    }

    /**
     * 列举所有资源
     *
     * 返回当前用户下所有资源，需要当前用户有rms:resources:list权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllResourcesRequest 请求对象
     * @return AsyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse>
     */
    public AsyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse> listAllResourcesAsyncInvoker(
        ListAllResourcesRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listAllResources, hcClient);
    }

    /**
     * 列举资源标签
     *
     * 查询当前帐号下所有资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTagsRequest 请求对象
     * @return CompletableFuture<ListAllTagsResponse>
     */
    public CompletableFuture<ListAllTagsResponse> listAllTagsAsync(ListAllTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listAllTags);
    }

    /**
     * 列举资源标签
     *
     * 查询当前帐号下所有资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTagsRequest 请求对象
     * @return AsyncInvoker<ListAllTagsRequest, ListAllTagsResponse>
     */
    public AsyncInvoker<ListAllTagsRequest, ListAllTagsResponse> listAllTagsAsyncInvoker(ListAllTagsRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listAllTags, hcClient);
    }

    /**
     * 列举云服务
     *
     * 查询RMS支持的云服务、资源、区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvidersRequest 请求对象
     * @return CompletableFuture<ListProvidersResponse>
     */
    public CompletableFuture<ListProvidersResponse> listProvidersAsync(ListProvidersRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listProviders);
    }

    /**
     * 列举云服务
     *
     * 查询RMS支持的云服务、资源、区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvidersRequest 请求对象
     * @return AsyncInvoker<ListProvidersRequest, ListProvidersResponse>
     */
    public AsyncInvoker<ListProvidersRequest, ListProvidersResponse> listProvidersAsyncInvoker(
        ListProvidersRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listProviders, hcClient);
    }

    /**
     * 列举指定类型的资源
     *
     * 返回当前租户下特定资源类型的资源，需要当前用户有rms:resources:list权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。 RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return CompletableFuture<ListResourcesResponse>
     */
    public CompletableFuture<ListResourcesResponse> listResourcesAsync(ListResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listResources);
    }

    /**
     * 列举指定类型的资源
     *
     * 返回当前租户下特定资源类型的资源，需要当前用户有rms:resources:list权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。 RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return AsyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public AsyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesAsyncInvoker(
        ListResourcesRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.listResources, hcClient);
    }

    /**
     * 查询单个资源
     *
     * 指定资源ID，返回该资源的详细信息，需要当前用户有rms:resources:get权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceByIdRequest 请求对象
     * @return CompletableFuture<ShowResourceByIdResponse>
     */
    public CompletableFuture<ShowResourceByIdResponse> showResourceByIdAsync(ShowResourceByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showResourceById);
    }

    /**
     * 查询单个资源
     *
     * 指定资源ID，返回该资源的详细信息，需要当前用户有rms:resources:get权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceByIdRequest 请求对象
     * @return AsyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse>
     */
    public AsyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse> showResourceByIdAsyncInvoker(
        ShowResourceByIdRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showResourceById, hcClient);
    }

    /**
     * 查询帐号下的单个资源
     *
     * 查询当前帐号下的单个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailRequest 请求对象
     * @return CompletableFuture<ShowResourceDetailResponse>
     */
    public CompletableFuture<ShowResourceDetailResponse> showResourceDetailAsync(ShowResourceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showResourceDetail);
    }

    /**
     * 查询帐号下的单个资源
     *
     * 查询当前帐号下的单个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailRequest 请求对象
     * @return AsyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse>
     */
    public AsyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse> showResourceDetailAsyncInvoker(
        ShowResourceDetailRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showResourceDetail, hcClient);
    }

    /**
     * 创建或更新记录器
     *
     * 创建或更新资源记录器，只能存在一个资源记录器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrackerConfigRequest 请求对象
     * @return CompletableFuture<CreateTrackerConfigResponse>
     */
    public CompletableFuture<CreateTrackerConfigResponse> createTrackerConfigAsync(CreateTrackerConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.createTrackerConfig);
    }

    /**
     * 创建或更新记录器
     *
     * 创建或更新资源记录器，只能存在一个资源记录器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrackerConfigRequest 请求对象
     * @return AsyncInvoker<CreateTrackerConfigRequest, CreateTrackerConfigResponse>
     */
    public AsyncInvoker<CreateTrackerConfigRequest, CreateTrackerConfigResponse> createTrackerConfigAsyncInvoker(
        CreateTrackerConfigRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.createTrackerConfig, hcClient);
    }

    /**
     * 删除记录器
     *
     * 删除资源记录器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrackerConfigRequest 请求对象
     * @return CompletableFuture<DeleteTrackerConfigResponse>
     */
    public CompletableFuture<DeleteTrackerConfigResponse> deleteTrackerConfigAsync(DeleteTrackerConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.deleteTrackerConfig);
    }

    /**
     * 删除记录器
     *
     * 删除资源记录器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrackerConfigRequest 请求对象
     * @return AsyncInvoker<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse>
     */
    public AsyncInvoker<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse> deleteTrackerConfigAsyncInvoker(
        DeleteTrackerConfigRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.deleteTrackerConfig, hcClient);
    }

    /**
     * 查询记录器
     *
     * 查询资源记录器的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrackerConfigRequest 请求对象
     * @return CompletableFuture<ShowTrackerConfigResponse>
     */
    public CompletableFuture<ShowTrackerConfigResponse> showTrackerConfigAsync(ShowTrackerConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showTrackerConfig);
    }

    /**
     * 查询记录器
     *
     * 查询资源记录器的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrackerConfigRequest 请求对象
     * @return AsyncInvoker<ShowTrackerConfigRequest, ShowTrackerConfigResponse>
     */
    public AsyncInvoker<ShowTrackerConfigRequest, ShowTrackerConfigResponse> showTrackerConfigAsyncInvoker(
        ShowTrackerConfigRequest request) {
        return new AsyncInvoker<>(request, RmsMeta.showTrackerConfig, hcClient);
    }

}
