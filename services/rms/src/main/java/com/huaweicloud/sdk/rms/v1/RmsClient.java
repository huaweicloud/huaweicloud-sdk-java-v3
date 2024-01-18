package com.huaweicloud.sdk.rms.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class RmsClient {

    protected HcClient hcClient;

    public RmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RmsClient> newBuilder() {
        ClientBuilder<RmsClient> clientBuilder = new ClientBuilder<>(RmsClient::new, "GlobalCredentials");
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
     * @return CreateAggregationAuthorizationResponse
     */
    public CreateAggregationAuthorizationResponse createAggregationAuthorization(
        CreateAggregationAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.createAggregationAuthorization);
    }

    /**
     * 创建资源聚合器授权
     *
     * 给资源聚合器帐号授予从源帐号收集数据的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAggregationAuthorizationRequest 请求对象
     * @return SyncInvoker<CreateAggregationAuthorizationRequest, CreateAggregationAuthorizationResponse>
     */
    public SyncInvoker<CreateAggregationAuthorizationRequest, CreateAggregationAuthorizationResponse> createAggregationAuthorizationInvoker(
        CreateAggregationAuthorizationRequest request) {
        return new SyncInvoker<>(request, RmsMeta.createAggregationAuthorization, hcClient);
    }

    /**
     * 创建资源聚合器
     *
     * 创建资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationAggregatorRequest 请求对象
     * @return CreateConfigurationAggregatorResponse
     */
    public CreateConfigurationAggregatorResponse createConfigurationAggregator(
        CreateConfigurationAggregatorRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.createConfigurationAggregator);
    }

    /**
     * 创建资源聚合器
     *
     * 创建资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationAggregatorRequest 请求对象
     * @return SyncInvoker<CreateConfigurationAggregatorRequest, CreateConfigurationAggregatorResponse>
     */
    public SyncInvoker<CreateConfigurationAggregatorRequest, CreateConfigurationAggregatorResponse> createConfigurationAggregatorInvoker(
        CreateConfigurationAggregatorRequest request) {
        return new SyncInvoker<>(request, RmsMeta.createConfigurationAggregator, hcClient);
    }

    /**
     * 删除资源聚合器授权
     *
     * 删除指定资源聚合器帐号的授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAggregationAuthorizationRequest 请求对象
     * @return DeleteAggregationAuthorizationResponse
     */
    public DeleteAggregationAuthorizationResponse deleteAggregationAuthorization(
        DeleteAggregationAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.deleteAggregationAuthorization);
    }

    /**
     * 删除资源聚合器授权
     *
     * 删除指定资源聚合器帐号的授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAggregationAuthorizationRequest 请求对象
     * @return SyncInvoker<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResponse>
     */
    public SyncInvoker<DeleteAggregationAuthorizationRequest, DeleteAggregationAuthorizationResponse> deleteAggregationAuthorizationInvoker(
        DeleteAggregationAuthorizationRequest request) {
        return new SyncInvoker<>(request, RmsMeta.deleteAggregationAuthorization, hcClient);
    }

    /**
     * 删除资源聚合器
     *
     * 删除资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationAggregatorRequest 请求对象
     * @return DeleteConfigurationAggregatorResponse
     */
    public DeleteConfigurationAggregatorResponse deleteConfigurationAggregator(
        DeleteConfigurationAggregatorRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.deleteConfigurationAggregator);
    }

    /**
     * 删除资源聚合器
     *
     * 删除资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationAggregatorRequest 请求对象
     * @return SyncInvoker<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResponse>
     */
    public SyncInvoker<DeleteConfigurationAggregatorRequest, DeleteConfigurationAggregatorResponse> deleteConfigurationAggregatorInvoker(
        DeleteConfigurationAggregatorRequest request) {
        return new SyncInvoker<>(request, RmsMeta.deleteConfigurationAggregator, hcClient);
    }

    /**
     * 删除聚合器帐号中挂起的授权请求
     *
     * 删除聚合器帐号中挂起的授权请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePendingAggregationRequestRequest 请求对象
     * @return DeletePendingAggregationRequestResponse
     */
    public DeletePendingAggregationRequestResponse deletePendingAggregationRequest(
        DeletePendingAggregationRequestRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.deletePendingAggregationRequest);
    }

    /**
     * 删除聚合器帐号中挂起的授权请求
     *
     * 删除聚合器帐号中挂起的授权请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePendingAggregationRequestRequest 请求对象
     * @return SyncInvoker<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResponse>
     */
    public SyncInvoker<DeletePendingAggregationRequestRequest, DeletePendingAggregationRequestResponse> deletePendingAggregationRequestInvoker(
        DeletePendingAggregationRequestRequest request) {
        return new SyncInvoker<>(request, RmsMeta.deletePendingAggregationRequest, hcClient);
    }

    /**
     * 查询聚合合规规则列表
     *
     * 查询合规和不合规规则的列表，其中包含合规和不合规规则的资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregateComplianceByPolicyAssignmentRequest 请求对象
     * @return ListAggregateComplianceByPolicyAssignmentResponse
     */
    public ListAggregateComplianceByPolicyAssignmentResponse listAggregateComplianceByPolicyAssignment(
        ListAggregateComplianceByPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listAggregateComplianceByPolicyAssignment);
    }

    /**
     * 查询聚合合规规则列表
     *
     * 查询合规和不合规规则的列表，其中包含合规和不合规规则的资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregateComplianceByPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<ListAggregateComplianceByPolicyAssignmentRequest, ListAggregateComplianceByPolicyAssignmentResponse>
     */
    public SyncInvoker<ListAggregateComplianceByPolicyAssignmentRequest, ListAggregateComplianceByPolicyAssignmentResponse> listAggregateComplianceByPolicyAssignmentInvoker(
        ListAggregateComplianceByPolicyAssignmentRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listAggregateComplianceByPolicyAssignment, hcClient);
    }

    /**
     * 查询聚合器中资源的列表
     *
     * 查询资源聚合器中特定资源的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregateDiscoveredResourcesRequest 请求对象
     * @return ListAggregateDiscoveredResourcesResponse
     */
    public ListAggregateDiscoveredResourcesResponse listAggregateDiscoveredResources(
        ListAggregateDiscoveredResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listAggregateDiscoveredResources);
    }

    /**
     * 查询聚合器中资源的列表
     *
     * 查询资源聚合器中特定资源的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregateDiscoveredResourcesRequest 请求对象
     * @return SyncInvoker<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResponse>
     */
    public SyncInvoker<ListAggregateDiscoveredResourcesRequest, ListAggregateDiscoveredResourcesResponse> listAggregateDiscoveredResourcesInvoker(
        ListAggregateDiscoveredResourcesRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listAggregateDiscoveredResources, hcClient);
    }

    /**
     * 查询资源聚合器授权列表
     *
     * 查询授权过的资源聚合器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregationAuthorizationsRequest 请求对象
     * @return ListAggregationAuthorizationsResponse
     */
    public ListAggregationAuthorizationsResponse listAggregationAuthorizations(
        ListAggregationAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listAggregationAuthorizations);
    }

    /**
     * 查询资源聚合器授权列表
     *
     * 查询授权过的资源聚合器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAggregationAuthorizationsRequest 请求对象
     * @return SyncInvoker<ListAggregationAuthorizationsRequest, ListAggregationAuthorizationsResponse>
     */
    public SyncInvoker<ListAggregationAuthorizationsRequest, ListAggregationAuthorizationsResponse> listAggregationAuthorizationsInvoker(
        ListAggregationAuthorizationsRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listAggregationAuthorizations, hcClient);
    }

    /**
     * 查询资源聚合器列表
     *
     * 查询资源聚合器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationAggregatorsRequest 请求对象
     * @return ListConfigurationAggregatorsResponse
     */
    public ListConfigurationAggregatorsResponse listConfigurationAggregators(
        ListConfigurationAggregatorsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listConfigurationAggregators);
    }

    /**
     * 查询资源聚合器列表
     *
     * 查询资源聚合器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationAggregatorsRequest 请求对象
     * @return SyncInvoker<ListConfigurationAggregatorsRequest, ListConfigurationAggregatorsResponse>
     */
    public SyncInvoker<ListConfigurationAggregatorsRequest, ListConfigurationAggregatorsResponse> listConfigurationAggregatorsInvoker(
        ListConfigurationAggregatorsRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listConfigurationAggregators, hcClient);
    }

    /**
     * 查询所有挂起的聚合请求列表
     *
     * 查询所有挂起的聚合请求列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPendingAggregationRequestsRequest 请求对象
     * @return ListPendingAggregationRequestsResponse
     */
    public ListPendingAggregationRequestsResponse listPendingAggregationRequests(
        ListPendingAggregationRequestsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listPendingAggregationRequests);
    }

    /**
     * 查询所有挂起的聚合请求列表
     *
     * 查询所有挂起的聚合请求列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPendingAggregationRequestsRequest 请求对象
     * @return SyncInvoker<ListPendingAggregationRequestsRequest, ListPendingAggregationRequestsResponse>
     */
    public SyncInvoker<ListPendingAggregationRequestsRequest, ListPendingAggregationRequestsResponse> listPendingAggregationRequestsInvoker(
        ListPendingAggregationRequestsRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listPendingAggregationRequests, hcClient);
    }

    /**
     * 对指定聚合器执行高级查询
     *
     * 对指定聚合器执行高级查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunAggregateResourceQueryRequest 请求对象
     * @return RunAggregateResourceQueryResponse
     */
    public RunAggregateResourceQueryResponse runAggregateResourceQuery(RunAggregateResourceQueryRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.runAggregateResourceQuery);
    }

    /**
     * 对指定聚合器执行高级查询
     *
     * 对指定聚合器执行高级查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunAggregateResourceQueryRequest 请求对象
     * @return SyncInvoker<RunAggregateResourceQueryRequest, RunAggregateResourceQueryResponse>
     */
    public SyncInvoker<RunAggregateResourceQueryRequest, RunAggregateResourceQueryResponse> runAggregateResourceQueryInvoker(
        RunAggregateResourceQueryRequest request) {
        return new SyncInvoker<>(request, RmsMeta.runAggregateResourceQuery, hcClient);
    }

    /**
     * 查询指定聚合合规规则的评估结果详情
     *
     * 返回指定聚合合规规则的评估结果详情。包含评估了哪些资源，以及每个资源是否符合规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregateComplianceDetailsByPolicyAssignmentRequest 请求对象
     * @return ShowAggregateComplianceDetailsByPolicyAssignmentResponse
     */
    public ShowAggregateComplianceDetailsByPolicyAssignmentResponse showAggregateComplianceDetailsByPolicyAssignment(
        ShowAggregateComplianceDetailsByPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showAggregateComplianceDetailsByPolicyAssignment);
    }

    /**
     * 查询指定聚合合规规则的评估结果详情
     *
     * 返回指定聚合合规规则的评估结果详情。包含评估了哪些资源，以及每个资源是否符合规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregateComplianceDetailsByPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<ShowAggregateComplianceDetailsByPolicyAssignmentRequest, ShowAggregateComplianceDetailsByPolicyAssignmentResponse>
     */
    public SyncInvoker<ShowAggregateComplianceDetailsByPolicyAssignmentRequest, ShowAggregateComplianceDetailsByPolicyAssignmentResponse> showAggregateComplianceDetailsByPolicyAssignmentInvoker(
        ShowAggregateComplianceDetailsByPolicyAssignmentRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showAggregateComplianceDetailsByPolicyAssignment, hcClient);
    }

    /**
     * 查询聚合器中帐号资源的计数
     *
     * 查询聚合器中帐号资源的计数，支持通过过滤器和GroupByKey来统计资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregateDiscoveredResourceCountsRequest 请求对象
     * @return ShowAggregateDiscoveredResourceCountsResponse
     */
    public ShowAggregateDiscoveredResourceCountsResponse showAggregateDiscoveredResourceCounts(
        ShowAggregateDiscoveredResourceCountsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showAggregateDiscoveredResourceCounts);
    }

    /**
     * 查询聚合器中帐号资源的计数
     *
     * 查询聚合器中帐号资源的计数，支持通过过滤器和GroupByKey来统计资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregateDiscoveredResourceCountsRequest 请求对象
     * @return SyncInvoker<ShowAggregateDiscoveredResourceCountsRequest, ShowAggregateDiscoveredResourceCountsResponse>
     */
    public SyncInvoker<ShowAggregateDiscoveredResourceCountsRequest, ShowAggregateDiscoveredResourceCountsResponse> showAggregateDiscoveredResourceCountsInvoker(
        ShowAggregateDiscoveredResourceCountsRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showAggregateDiscoveredResourceCounts, hcClient);
    }

    /**
     * 查询指定聚合合规规则详情
     *
     * 返回指定聚合合规规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregatePolicyAssignmentDetailRequest 请求对象
     * @return ShowAggregatePolicyAssignmentDetailResponse
     */
    public ShowAggregatePolicyAssignmentDetailResponse showAggregatePolicyAssignmentDetail(
        ShowAggregatePolicyAssignmentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showAggregatePolicyAssignmentDetail);
    }

    /**
     * 查询指定聚合合规规则详情
     *
     * 返回指定聚合合规规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregatePolicyAssignmentDetailRequest 请求对象
     * @return SyncInvoker<ShowAggregatePolicyAssignmentDetailRequest, ShowAggregatePolicyAssignmentDetailResponse>
     */
    public SyncInvoker<ShowAggregatePolicyAssignmentDetailRequest, ShowAggregatePolicyAssignmentDetailResponse> showAggregatePolicyAssignmentDetailInvoker(
        ShowAggregatePolicyAssignmentDetailRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showAggregatePolicyAssignmentDetail, hcClient);
    }

    /**
     * 查询聚合器中一个或多个帐户的合规概况
     *
     * 查询聚合器中一个或多个帐户的合规和不合规规则数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregatePolicyStateComplianceSummaryRequest 请求对象
     * @return ShowAggregatePolicyStateComplianceSummaryResponse
     */
    public ShowAggregatePolicyStateComplianceSummaryResponse showAggregatePolicyStateComplianceSummary(
        ShowAggregatePolicyStateComplianceSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showAggregatePolicyStateComplianceSummary);
    }

    /**
     * 查询聚合器中一个或多个帐户的合规概况
     *
     * 查询聚合器中一个或多个帐户的合规和不合规规则数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregatePolicyStateComplianceSummaryRequest 请求对象
     * @return SyncInvoker<ShowAggregatePolicyStateComplianceSummaryRequest, ShowAggregatePolicyStateComplianceSummaryResponse>
     */
    public SyncInvoker<ShowAggregatePolicyStateComplianceSummaryRequest, ShowAggregatePolicyStateComplianceSummaryResponse> showAggregatePolicyStateComplianceSummaryInvoker(
        ShowAggregatePolicyStateComplianceSummaryRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showAggregatePolicyStateComplianceSummary, hcClient);
    }

    /**
     * 查询源帐号中资源的详情
     *
     * 查询源帐号中特定资源的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregateResourceConfigRequest 请求对象
     * @return ShowAggregateResourceConfigResponse
     */
    public ShowAggregateResourceConfigResponse showAggregateResourceConfig(ShowAggregateResourceConfigRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showAggregateResourceConfig);
    }

    /**
     * 查询源帐号中资源的详情
     *
     * 查询源帐号中特定资源的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAggregateResourceConfigRequest 请求对象
     * @return SyncInvoker<ShowAggregateResourceConfigRequest, ShowAggregateResourceConfigResponse>
     */
    public SyncInvoker<ShowAggregateResourceConfigRequest, ShowAggregateResourceConfigResponse> showAggregateResourceConfigInvoker(
        ShowAggregateResourceConfigRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showAggregateResourceConfig, hcClient);
    }

    /**
     * 查询指定资源聚合器
     *
     * 查询指定资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationAggregatorRequest 请求对象
     * @return ShowConfigurationAggregatorResponse
     */
    public ShowConfigurationAggregatorResponse showConfigurationAggregator(ShowConfigurationAggregatorRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showConfigurationAggregator);
    }

    /**
     * 查询指定资源聚合器
     *
     * 查询指定资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationAggregatorRequest 请求对象
     * @return SyncInvoker<ShowConfigurationAggregatorRequest, ShowConfigurationAggregatorResponse>
     */
    public SyncInvoker<ShowConfigurationAggregatorRequest, ShowConfigurationAggregatorResponse> showConfigurationAggregatorInvoker(
        ShowConfigurationAggregatorRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showConfigurationAggregator, hcClient);
    }

    /**
     * 查询指定资源聚合器聚合帐号的状态信息
     *
     * 查询指定资源聚合器聚合帐号的状态信息，状态包括验证源帐号和聚合器帐号之间授权的信息。如果失败，状态包含相关的错误码或消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationAggregatorSourcesStatusRequest 请求对象
     * @return ShowConfigurationAggregatorSourcesStatusResponse
     */
    public ShowConfigurationAggregatorSourcesStatusResponse showConfigurationAggregatorSourcesStatus(
        ShowConfigurationAggregatorSourcesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showConfigurationAggregatorSourcesStatus);
    }

    /**
     * 查询指定资源聚合器聚合帐号的状态信息
     *
     * 查询指定资源聚合器聚合帐号的状态信息，状态包括验证源帐号和聚合器帐号之间授权的信息。如果失败，状态包含相关的错误码或消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationAggregatorSourcesStatusRequest 请求对象
     * @return SyncInvoker<ShowConfigurationAggregatorSourcesStatusRequest, ShowConfigurationAggregatorSourcesStatusResponse>
     */
    public SyncInvoker<ShowConfigurationAggregatorSourcesStatusRequest, ShowConfigurationAggregatorSourcesStatusResponse> showConfigurationAggregatorSourcesStatusInvoker(
        ShowConfigurationAggregatorSourcesStatusRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showConfigurationAggregatorSourcesStatus, hcClient);
    }

    /**
     * 更新资源聚合器
     *
     * 更新资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationAggregatorRequest 请求对象
     * @return UpdateConfigurationAggregatorResponse
     */
    public UpdateConfigurationAggregatorResponse updateConfigurationAggregator(
        UpdateConfigurationAggregatorRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.updateConfigurationAggregator);
    }

    /**
     * 更新资源聚合器
     *
     * 更新资源聚合器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationAggregatorRequest 请求对象
     * @return SyncInvoker<UpdateConfigurationAggregatorRequest, UpdateConfigurationAggregatorResponse>
     */
    public SyncInvoker<UpdateConfigurationAggregatorRequest, UpdateConfigurationAggregatorResponse> updateConfigurationAggregatorInvoker(
        UpdateConfigurationAggregatorRequest request) {
        return new SyncInvoker<>(request, RmsMeta.updateConfigurationAggregator, hcClient);
    }

    /**
     * 查询资源历史
     *
     * 查询资源与资源关系的变更历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceHistoryRequest 请求对象
     * @return ShowResourceHistoryResponse
     */
    public ShowResourceHistoryResponse showResourceHistory(ShowResourceHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showResourceHistory);
    }

    /**
     * 查询资源历史
     *
     * 查询资源与资源关系的变更历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceHistoryRequest 请求对象
     * @return SyncInvoker<ShowResourceHistoryRequest, ShowResourceHistoryResponse>
     */
    public SyncInvoker<ShowResourceHistoryRequest, ShowResourceHistoryResponse> showResourceHistoryInvoker(
        ShowResourceHistoryRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showResourceHistory, hcClient);
    }

    /**
     * 创建或更新组织合规规则
     *
     * 创建或更新组织合规规则，如果规则名称已存在，则为更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrganizationPolicyAssignmentRequest 请求对象
     * @return CreateOrganizationPolicyAssignmentResponse
     */
    public CreateOrganizationPolicyAssignmentResponse createOrganizationPolicyAssignment(
        CreateOrganizationPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.createOrganizationPolicyAssignment);
    }

    /**
     * 创建或更新组织合规规则
     *
     * 创建或更新组织合规规则，如果规则名称已存在，则为更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrganizationPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<CreateOrganizationPolicyAssignmentRequest, CreateOrganizationPolicyAssignmentResponse>
     */
    public SyncInvoker<CreateOrganizationPolicyAssignmentRequest, CreateOrganizationPolicyAssignmentResponse> createOrganizationPolicyAssignmentInvoker(
        CreateOrganizationPolicyAssignmentRequest request) {
        return new SyncInvoker<>(request, RmsMeta.createOrganizationPolicyAssignment, hcClient);
    }

    /**
     * 创建合规规则
     *
     * 创建新的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyAssignmentsRequest 请求对象
     * @return CreatePolicyAssignmentsResponse
     */
    public CreatePolicyAssignmentsResponse createPolicyAssignments(CreatePolicyAssignmentsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.createPolicyAssignments);
    }

    /**
     * 创建合规规则
     *
     * 创建新的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyAssignmentsRequest 请求对象
     * @return SyncInvoker<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse>
     */
    public SyncInvoker<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse> createPolicyAssignmentsInvoker(
        CreatePolicyAssignmentsRequest request) {
        return new SyncInvoker<>(request, RmsMeta.createPolicyAssignments, hcClient);
    }

    /**
     * 删除组织合规规则
     *
     * 删除组织合规规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrganizationPolicyAssignmentRequest 请求对象
     * @return DeleteOrganizationPolicyAssignmentResponse
     */
    public DeleteOrganizationPolicyAssignmentResponse deleteOrganizationPolicyAssignment(
        DeleteOrganizationPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.deleteOrganizationPolicyAssignment);
    }

    /**
     * 删除组织合规规则
     *
     * 删除组织合规规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrganizationPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<DeleteOrganizationPolicyAssignmentRequest, DeleteOrganizationPolicyAssignmentResponse>
     */
    public SyncInvoker<DeleteOrganizationPolicyAssignmentRequest, DeleteOrganizationPolicyAssignmentResponse> deleteOrganizationPolicyAssignmentInvoker(
        DeleteOrganizationPolicyAssignmentRequest request) {
        return new SyncInvoker<>(request, RmsMeta.deleteOrganizationPolicyAssignment, hcClient);
    }

    /**
     * 删除合规规则
     *
     * 根据规则ID删除此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyAssignmentRequest 请求对象
     * @return DeletePolicyAssignmentResponse
     */
    public DeletePolicyAssignmentResponse deletePolicyAssignment(DeletePolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.deletePolicyAssignment);
    }

    /**
     * 删除合规规则
     *
     * 根据规则ID删除此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyAssignmentRequest 请求对象
     * @return SyncInvoker<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse>
     */
    public SyncInvoker<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse> deletePolicyAssignmentInvoker(
        DeletePolicyAssignmentRequest request) {
        return new SyncInvoker<>(request, RmsMeta.deletePolicyAssignment, hcClient);
    }

    /**
     * 停用合规规则
     *
     * 根据规则ID停用此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisablePolicyAssignmentRequest 请求对象
     * @return DisablePolicyAssignmentResponse
     */
    public DisablePolicyAssignmentResponse disablePolicyAssignment(DisablePolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.disablePolicyAssignment);
    }

    /**
     * 停用合规规则
     *
     * 根据规则ID停用此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisablePolicyAssignmentRequest 请求对象
     * @return SyncInvoker<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse>
     */
    public SyncInvoker<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse> disablePolicyAssignmentInvoker(
        DisablePolicyAssignmentRequest request) {
        return new SyncInvoker<>(request, RmsMeta.disablePolicyAssignment, hcClient);
    }

    /**
     * 启用合规规则
     *
     * 根据规则ID启用此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnablePolicyAssignmentRequest 请求对象
     * @return EnablePolicyAssignmentResponse
     */
    public EnablePolicyAssignmentResponse enablePolicyAssignment(EnablePolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.enablePolicyAssignment);
    }

    /**
     * 启用合规规则
     *
     * 根据规则ID启用此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnablePolicyAssignmentRequest 请求对象
     * @return SyncInvoker<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse>
     */
    public SyncInvoker<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse> enablePolicyAssignmentInvoker(
        EnablePolicyAssignmentRequest request) {
        return new SyncInvoker<>(request, RmsMeta.enablePolicyAssignment, hcClient);
    }

    /**
     * 列出内置策略
     *
     * 列出用户的内置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuiltInPolicyDefinitionsRequest 请求对象
     * @return ListBuiltInPolicyDefinitionsResponse
     */
    public ListBuiltInPolicyDefinitionsResponse listBuiltInPolicyDefinitions(
        ListBuiltInPolicyDefinitionsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listBuiltInPolicyDefinitions);
    }

    /**
     * 列出内置策略
     *
     * 列出用户的内置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuiltInPolicyDefinitionsRequest 请求对象
     * @return SyncInvoker<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse>
     */
    public SyncInvoker<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse> listBuiltInPolicyDefinitionsInvoker(
        ListBuiltInPolicyDefinitionsRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listBuiltInPolicyDefinitions, hcClient);
    }

    /**
     * 查询组织合规规则列表
     *
     * 查询组织合规规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationPolicyAssignmentsRequest 请求对象
     * @return ListOrganizationPolicyAssignmentsResponse
     */
    public ListOrganizationPolicyAssignmentsResponse listOrganizationPolicyAssignments(
        ListOrganizationPolicyAssignmentsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listOrganizationPolicyAssignments);
    }

    /**
     * 查询组织合规规则列表
     *
     * 查询组织合规规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationPolicyAssignmentsRequest 请求对象
     * @return SyncInvoker<ListOrganizationPolicyAssignmentsRequest, ListOrganizationPolicyAssignmentsResponse>
     */
    public SyncInvoker<ListOrganizationPolicyAssignmentsRequest, ListOrganizationPolicyAssignmentsResponse> listOrganizationPolicyAssignmentsInvoker(
        ListOrganizationPolicyAssignmentsRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listOrganizationPolicyAssignments, hcClient);
    }

    /**
     * 列出合规规则
     *
     * 列出用户的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyAssignmentsRequest 请求对象
     * @return ListPolicyAssignmentsResponse
     */
    public ListPolicyAssignmentsResponse listPolicyAssignments(ListPolicyAssignmentsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listPolicyAssignments);
    }

    /**
     * 列出合规规则
     *
     * 列出用户的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyAssignmentsRequest 请求对象
     * @return SyncInvoker<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse>
     */
    public SyncInvoker<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse> listPolicyAssignmentsInvoker(
        ListPolicyAssignmentsRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listPolicyAssignments, hcClient);
    }

    /**
     * 获取规则的合规结果
     *
     * 根据规则ID查询所有的合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyStatesByAssignmentIdRequest 请求对象
     * @return ListPolicyStatesByAssignmentIdResponse
     */
    public ListPolicyStatesByAssignmentIdResponse listPolicyStatesByAssignmentId(
        ListPolicyStatesByAssignmentIdRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listPolicyStatesByAssignmentId);
    }

    /**
     * 获取规则的合规结果
     *
     * 根据规则ID查询所有的合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyStatesByAssignmentIdRequest 请求对象
     * @return SyncInvoker<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse>
     */
    public SyncInvoker<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse> listPolicyStatesByAssignmentIdInvoker(
        ListPolicyStatesByAssignmentIdRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listPolicyStatesByAssignmentId, hcClient);
    }

    /**
     * 获取用户的合规结果
     *
     * 查询用户所有的合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyStatesByDomainIdRequest 请求对象
     * @return ListPolicyStatesByDomainIdResponse
     */
    public ListPolicyStatesByDomainIdResponse listPolicyStatesByDomainId(ListPolicyStatesByDomainIdRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listPolicyStatesByDomainId);
    }

    /**
     * 获取用户的合规结果
     *
     * 查询用户所有的合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyStatesByDomainIdRequest 请求对象
     * @return SyncInvoker<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse>
     */
    public SyncInvoker<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse> listPolicyStatesByDomainIdInvoker(
        ListPolicyStatesByDomainIdRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listPolicyStatesByDomainId, hcClient);
    }

    /**
     * 获取资源的合规结果
     *
     * 根据资源ID查询所有合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyStatesByResourceIdRequest 请求对象
     * @return ListPolicyStatesByResourceIdResponse
     */
    public ListPolicyStatesByResourceIdResponse listPolicyStatesByResourceId(
        ListPolicyStatesByResourceIdRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listPolicyStatesByResourceId);
    }

    /**
     * 获取资源的合规结果
     *
     * 根据资源ID查询所有合规结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyStatesByResourceIdRequest 请求对象
     * @return SyncInvoker<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse>
     */
    public SyncInvoker<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse> listPolicyStatesByResourceIdInvoker(
        ListPolicyStatesByResourceIdRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listPolicyStatesByResourceId, hcClient);
    }

    /**
     * 运行合规评估
     *
     * 根据规则ID评估此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunEvaluationByPolicyAssignmentIdRequest 请求对象
     * @return RunEvaluationByPolicyAssignmentIdResponse
     */
    public RunEvaluationByPolicyAssignmentIdResponse runEvaluationByPolicyAssignmentId(
        RunEvaluationByPolicyAssignmentIdRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.runEvaluationByPolicyAssignmentId);
    }

    /**
     * 运行合规评估
     *
     * 根据规则ID评估此规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunEvaluationByPolicyAssignmentIdRequest 请求对象
     * @return SyncInvoker<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse>
     */
    public SyncInvoker<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse> runEvaluationByPolicyAssignmentIdInvoker(
        RunEvaluationByPolicyAssignmentIdRequest request) {
        return new SyncInvoker<>(request, RmsMeta.runEvaluationByPolicyAssignmentId, hcClient);
    }

    /**
     * 查询单个内置策略
     *
     * 根据策略ID查询单个内置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuiltInPolicyDefinitionRequest 请求对象
     * @return ShowBuiltInPolicyDefinitionResponse
     */
    public ShowBuiltInPolicyDefinitionResponse showBuiltInPolicyDefinition(ShowBuiltInPolicyDefinitionRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showBuiltInPolicyDefinition);
    }

    /**
     * 查询单个内置策略
     *
     * 根据策略ID查询单个内置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuiltInPolicyDefinitionRequest 请求对象
     * @return SyncInvoker<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse>
     */
    public SyncInvoker<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse> showBuiltInPolicyDefinitionInvoker(
        ShowBuiltInPolicyDefinitionRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showBuiltInPolicyDefinition, hcClient);
    }

    /**
     * 获取规则的评估状态
     *
     * 根据规则ID查询此规则的评估状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEvaluationStateByAssignmentIdRequest 请求对象
     * @return ShowEvaluationStateByAssignmentIdResponse
     */
    public ShowEvaluationStateByAssignmentIdResponse showEvaluationStateByAssignmentId(
        ShowEvaluationStateByAssignmentIdRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showEvaluationStateByAssignmentId);
    }

    /**
     * 获取规则的评估状态
     *
     * 根据规则ID查询此规则的评估状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEvaluationStateByAssignmentIdRequest 请求对象
     * @return SyncInvoker<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse>
     */
    public SyncInvoker<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse> showEvaluationStateByAssignmentIdInvoker(
        ShowEvaluationStateByAssignmentIdRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showEvaluationStateByAssignmentId, hcClient);
    }

    /**
     * 查询指定组织合规规则
     *
     * 查询指定组织合规规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyAssignmentRequest 请求对象
     * @return ShowOrganizationPolicyAssignmentResponse
     */
    public ShowOrganizationPolicyAssignmentResponse showOrganizationPolicyAssignment(
        ShowOrganizationPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showOrganizationPolicyAssignment);
    }

    /**
     * 查询指定组织合规规则
     *
     * 查询指定组织合规规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<ShowOrganizationPolicyAssignmentRequest, ShowOrganizationPolicyAssignmentResponse>
     */
    public SyncInvoker<ShowOrganizationPolicyAssignmentRequest, ShowOrganizationPolicyAssignmentResponse> showOrganizationPolicyAssignmentInvoker(
        ShowOrganizationPolicyAssignmentRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showOrganizationPolicyAssignment, hcClient);
    }

    /**
     * 查询组织内每个成员帐号合规规则部署的详细状态
     *
     * 查询组织内每个成员帐号合规规则部署的详细状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyAssignmentDetailedStatusRequest 请求对象
     * @return ShowOrganizationPolicyAssignmentDetailedStatusResponse
     */
    public ShowOrganizationPolicyAssignmentDetailedStatusResponse showOrganizationPolicyAssignmentDetailedStatus(
        ShowOrganizationPolicyAssignmentDetailedStatusRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showOrganizationPolicyAssignmentDetailedStatus);
    }

    /**
     * 查询组织内每个成员帐号合规规则部署的详细状态
     *
     * 查询组织内每个成员帐号合规规则部署的详细状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyAssignmentDetailedStatusRequest 请求对象
     * @return SyncInvoker<ShowOrganizationPolicyAssignmentDetailedStatusRequest, ShowOrganizationPolicyAssignmentDetailedStatusResponse>
     */
    public SyncInvoker<ShowOrganizationPolicyAssignmentDetailedStatusRequest, ShowOrganizationPolicyAssignmentDetailedStatusResponse> showOrganizationPolicyAssignmentDetailedStatusInvoker(
        ShowOrganizationPolicyAssignmentDetailedStatusRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showOrganizationPolicyAssignmentDetailedStatus, hcClient);
    }

    /**
     * 查询组织合规规则部署状态
     *
     * 查询组织合规规则部署状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyAssignmentStatusesRequest 请求对象
     * @return ShowOrganizationPolicyAssignmentStatusesResponse
     */
    public ShowOrganizationPolicyAssignmentStatusesResponse showOrganizationPolicyAssignmentStatuses(
        ShowOrganizationPolicyAssignmentStatusesRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showOrganizationPolicyAssignmentStatuses);
    }

    /**
     * 查询组织合规规则部署状态
     *
     * 查询组织合规规则部署状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyAssignmentStatusesRequest 请求对象
     * @return SyncInvoker<ShowOrganizationPolicyAssignmentStatusesRequest, ShowOrganizationPolicyAssignmentStatusesResponse>
     */
    public SyncInvoker<ShowOrganizationPolicyAssignmentStatusesRequest, ShowOrganizationPolicyAssignmentStatusesResponse> showOrganizationPolicyAssignmentStatusesInvoker(
        ShowOrganizationPolicyAssignmentStatusesRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showOrganizationPolicyAssignmentStatuses, hcClient);
    }

    /**
     * 获取单个合规规则
     *
     * 根据规则ID获取单个规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyAssignmentRequest 请求对象
     * @return ShowPolicyAssignmentResponse
     */
    public ShowPolicyAssignmentResponse showPolicyAssignment(ShowPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showPolicyAssignment);
    }

    /**
     * 获取单个合规规则
     *
     * 根据规则ID获取单个规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse>
     */
    public SyncInvoker<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse> showPolicyAssignmentInvoker(
        ShowPolicyAssignmentRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showPolicyAssignment, hcClient);
    }

    /**
     * 更新合规规则
     *
     * 更新用户的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyAssignmentRequest 请求对象
     * @return UpdatePolicyAssignmentResponse
     */
    public UpdatePolicyAssignmentResponse updatePolicyAssignment(UpdatePolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.updatePolicyAssignment);
    }

    /**
     * 更新合规规则
     *
     * 更新用户的合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyAssignmentRequest 请求对象
     * @return SyncInvoker<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse>
     */
    public SyncInvoker<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse> updatePolicyAssignmentInvoker(
        UpdatePolicyAssignmentRequest request) {
        return new SyncInvoker<>(request, RmsMeta.updatePolicyAssignment, hcClient);
    }

    /**
     * 更新合规评估结果
     *
     * 更新用户自定义合规规则的合规评估结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyStateRequest 请求对象
     * @return UpdatePolicyStateResponse
     */
    public UpdatePolicyStateResponse updatePolicyState(UpdatePolicyStateRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.updatePolicyState);
    }

    /**
     * 更新合规评估结果
     *
     * 更新用户自定义合规规则的合规评估结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyStateRequest 请求对象
     * @return SyncInvoker<UpdatePolicyStateRequest, UpdatePolicyStateResponse>
     */
    public SyncInvoker<UpdatePolicyStateRequest, UpdatePolicyStateResponse> updatePolicyStateInvoker(
        UpdatePolicyStateRequest request) {
        return new SyncInvoker<>(request, RmsMeta.updatePolicyState, hcClient);
    }

    /**
     * 创建高级查询
     *
     * 创建新的高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStoredQueryRequest 请求对象
     * @return CreateStoredQueryResponse
     */
    public CreateStoredQueryResponse createStoredQuery(CreateStoredQueryRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.createStoredQuery);
    }

    /**
     * 创建高级查询
     *
     * 创建新的高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStoredQueryRequest 请求对象
     * @return SyncInvoker<CreateStoredQueryRequest, CreateStoredQueryResponse>
     */
    public SyncInvoker<CreateStoredQueryRequest, CreateStoredQueryResponse> createStoredQueryInvoker(
        CreateStoredQueryRequest request) {
        return new SyncInvoker<>(request, RmsMeta.createStoredQuery, hcClient);
    }

    /**
     * 删除高级查询
     *
     * 删除单个高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStoredQueryRequest 请求对象
     * @return DeleteStoredQueryResponse
     */
    public DeleteStoredQueryResponse deleteStoredQuery(DeleteStoredQueryRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.deleteStoredQuery);
    }

    /**
     * 删除高级查询
     *
     * 删除单个高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStoredQueryRequest 请求对象
     * @return SyncInvoker<DeleteStoredQueryRequest, DeleteStoredQueryResponse>
     */
    public SyncInvoker<DeleteStoredQueryRequest, DeleteStoredQueryResponse> deleteStoredQueryInvoker(
        DeleteStoredQueryRequest request) {
        return new SyncInvoker<>(request, RmsMeta.deleteStoredQuery, hcClient);
    }

    /**
     * 列举高级查询Schema
     *
     * List Schemas
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemasRequest 请求对象
     * @return ListSchemasResponse
     */
    public ListSchemasResponse listSchemas(ListSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listSchemas);
    }

    /**
     * 列举高级查询Schema
     *
     * List Schemas
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemasRequest 请求对象
     * @return SyncInvoker<ListSchemasRequest, ListSchemasResponse>
     */
    public SyncInvoker<ListSchemasRequest, ListSchemasResponse> listSchemasInvoker(ListSchemasRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listSchemas, hcClient);
    }

    /**
     * 列出高级查询
     *
     * 列举所有高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoredQueriesRequest 请求对象
     * @return ListStoredQueriesResponse
     */
    public ListStoredQueriesResponse listStoredQueries(ListStoredQueriesRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listStoredQueries);
    }

    /**
     * 列出高级查询
     *
     * 列举所有高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoredQueriesRequest 请求对象
     * @return SyncInvoker<ListStoredQueriesRequest, ListStoredQueriesResponse>
     */
    public SyncInvoker<ListStoredQueriesRequest, ListStoredQueriesResponse> listStoredQueriesInvoker(
        ListStoredQueriesRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listStoredQueries, hcClient);
    }

    /**
     * 运行高级查询
     *
     * 执行高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunQueryRequest 请求对象
     * @return RunQueryResponse
     */
    public RunQueryResponse runQuery(RunQueryRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.runQuery);
    }

    /**
     * 运行高级查询
     *
     * 执行高级查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunQueryRequest 请求对象
     * @return SyncInvoker<RunQueryRequest, RunQueryResponse>
     */
    public SyncInvoker<RunQueryRequest, RunQueryResponse> runQueryInvoker(RunQueryRequest request) {
        return new SyncInvoker<>(request, RmsMeta.runQuery, hcClient);
    }

    /**
     * 查询单个高级查询
     *
     * Show Resource Query Language
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStoredQueryRequest 请求对象
     * @return ShowStoredQueryResponse
     */
    public ShowStoredQueryResponse showStoredQuery(ShowStoredQueryRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showStoredQuery);
    }

    /**
     * 查询单个高级查询
     *
     * Show Resource Query Language
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStoredQueryRequest 请求对象
     * @return SyncInvoker<ShowStoredQueryRequest, ShowStoredQueryResponse>
     */
    public SyncInvoker<ShowStoredQueryRequest, ShowStoredQueryResponse> showStoredQueryInvoker(
        ShowStoredQueryRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showStoredQuery, hcClient);
    }

    /**
     * 更新单个高级查询
     *
     * 更新自定义查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStoredQueryRequest 请求对象
     * @return UpdateStoredQueryResponse
     */
    public UpdateStoredQueryResponse updateStoredQuery(UpdateStoredQueryRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.updateStoredQuery);
    }

    /**
     * 更新单个高级查询
     *
     * 更新自定义查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStoredQueryRequest 请求对象
     * @return SyncInvoker<UpdateStoredQueryRequest, UpdateStoredQueryResponse>
     */
    public SyncInvoker<UpdateStoredQueryRequest, UpdateStoredQueryResponse> updateStoredQueryInvoker(
        UpdateStoredQueryRequest request) {
        return new SyncInvoker<>(request, RmsMeta.updateStoredQuery, hcClient);
    }

    /**
     * 查询用户可见的区域
     *
     * 查询用户可见的区域
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listRegions);
    }

    /**
     * 查询用户可见的区域
     *
     * 查询用户可见的区域
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return SyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public SyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsInvoker(ListRegionsRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listRegions, hcClient);
    }

    /**
     * 列举资源关系
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为\&quot;in\&quot; 或者\&quot;out\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsRequest 请求对象
     * @return ShowResourceRelationsResponse
     */
    public ShowResourceRelationsResponse showResourceRelations(ShowResourceRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showResourceRelations);
    }

    /**
     * 列举资源关系
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为\&quot;in\&quot; 或者\&quot;out\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsRequest 请求对象
     * @return SyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse>
     */
    public SyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse> showResourceRelationsInvoker(
        ShowResourceRelationsRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showResourceRelations, hcClient);
    }

    /**
     * 列举资源关系详情
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为“in”或者“out”，需要当帐号有rms:resources:getRelation权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsDetailRequest 请求对象
     * @return ShowResourceRelationsDetailResponse
     */
    public ShowResourceRelationsDetailResponse showResourceRelationsDetail(ShowResourceRelationsDetailRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showResourceRelationsDetail);
    }

    /**
     * 列举资源关系详情
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为“in”或者“out”，需要当帐号有rms:resources:getRelation权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsDetailRequest 请求对象
     * @return SyncInvoker<ShowResourceRelationsDetailRequest, ShowResourceRelationsDetailResponse>
     */
    public SyncInvoker<ShowResourceRelationsDetailRequest, ShowResourceRelationsDetailResponse> showResourceRelationsDetailInvoker(
        ShowResourceRelationsDetailRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showResourceRelationsDetail, hcClient);
    }

    /**
     * 列举资源概要
     *
     * 查询当前帐号的资源概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectAllResourcesSummaryRequest 请求对象
     * @return CollectAllResourcesSummaryResponse
     */
    public CollectAllResourcesSummaryResponse collectAllResourcesSummary(CollectAllResourcesSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.collectAllResourcesSummary);
    }

    /**
     * 列举资源概要
     *
     * 查询当前帐号的资源概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectAllResourcesSummaryRequest 请求对象
     * @return SyncInvoker<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse>
     */
    public SyncInvoker<CollectAllResourcesSummaryRequest, CollectAllResourcesSummaryResponse> collectAllResourcesSummaryInvoker(
        CollectAllResourcesSummaryRequest request) {
        return new SyncInvoker<>(request, RmsMeta.collectAllResourcesSummary, hcClient);
    }

    /**
     * 查询资源数量
     *
     * 查询当前帐号的资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAllResourcesRequest 请求对象
     * @return CountAllResourcesResponse
     */
    public CountAllResourcesResponse countAllResources(CountAllResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.countAllResources);
    }

    /**
     * 查询资源数量
     *
     * 查询当前帐号的资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAllResourcesRequest 请求对象
     * @return SyncInvoker<CountAllResourcesRequest, CountAllResourcesResponse>
     */
    public SyncInvoker<CountAllResourcesRequest, CountAllResourcesResponse> countAllResourcesInvoker(
        CountAllResourcesRequest request) {
        return new SyncInvoker<>(request, RmsMeta.countAllResources, hcClient);
    }

    /**
     * 列举所有资源
     *
     * 返回当前用户下所有资源，需要当前用户有rms:resources:list权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllResourcesRequest 请求对象
     * @return ListAllResourcesResponse
     */
    public ListAllResourcesResponse listAllResources(ListAllResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listAllResources);
    }

    /**
     * 列举所有资源
     *
     * 返回当前用户下所有资源，需要当前用户有rms:resources:list权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllResourcesRequest 请求对象
     * @return SyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse>
     */
    public SyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse> listAllResourcesInvoker(
        ListAllResourcesRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listAllResources, hcClient);
    }

    /**
     * 列举资源标签
     *
     * 查询当前帐号下所有资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTagsRequest 请求对象
     * @return ListAllTagsResponse
     */
    public ListAllTagsResponse listAllTags(ListAllTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listAllTags);
    }

    /**
     * 列举资源标签
     *
     * 查询当前帐号下所有资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTagsRequest 请求对象
     * @return SyncInvoker<ListAllTagsRequest, ListAllTagsResponse>
     */
    public SyncInvoker<ListAllTagsRequest, ListAllTagsResponse> listAllTagsInvoker(ListAllTagsRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listAllTags, hcClient);
    }

    /**
     * 列举云服务
     *
     * 查询RMS支持的云服务、资源、区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvidersRequest 请求对象
     * @return ListProvidersResponse
     */
    public ListProvidersResponse listProviders(ListProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listProviders);
    }

    /**
     * 列举云服务
     *
     * 查询RMS支持的云服务、资源、区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvidersRequest 请求对象
     * @return SyncInvoker<ListProvidersRequest, ListProvidersResponse>
     */
    public SyncInvoker<ListProvidersRequest, ListProvidersResponse> listProvidersInvoker(ListProvidersRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listProviders, hcClient);
    }

    /**
     * 列举指定类型的资源
     *
     * 返回当前租户下特定资源类型的资源，需要当前用户有rms:resources:list权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。 RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listResources);
    }

    /**
     * 列举指定类型的资源
     *
     * 返回当前租户下特定资源类型的资源，需要当前用户有rms:resources:list权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。 RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
     * @return SyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public SyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesInvoker(ListResourcesRequest request) {
        return new SyncInvoker<>(request, RmsMeta.listResources, hcClient);
    }

    /**
     * 查询单个资源
     *
     * 指定资源ID，返回该资源的详细信息，需要当前用户有rms:resources:get权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceByIdRequest 请求对象
     * @return ShowResourceByIdResponse
     */
    public ShowResourceByIdResponse showResourceById(ShowResourceByIdRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showResourceById);
    }

    /**
     * 查询单个资源
     *
     * 指定资源ID，返回该资源的详细信息，需要当前用户有rms:resources:get权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceByIdRequest 请求对象
     * @return SyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse>
     */
    public SyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse> showResourceByIdInvoker(
        ShowResourceByIdRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showResourceById, hcClient);
    }

    /**
     * 查询帐号下的单个资源
     *
     * 查询当前帐号下的单个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailRequest 请求对象
     * @return ShowResourceDetailResponse
     */
    public ShowResourceDetailResponse showResourceDetail(ShowResourceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showResourceDetail);
    }

    /**
     * 查询帐号下的单个资源
     *
     * 查询当前帐号下的单个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceDetailRequest 请求对象
     * @return SyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse>
     */
    public SyncInvoker<ShowResourceDetailRequest, ShowResourceDetailResponse> showResourceDetailInvoker(
        ShowResourceDetailRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showResourceDetail, hcClient);
    }

    /**
     * 创建或更新记录器
     *
     * 创建或更新资源记录器，只能存在一个资源记录器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrackerConfigRequest 请求对象
     * @return CreateTrackerConfigResponse
     */
    public CreateTrackerConfigResponse createTrackerConfig(CreateTrackerConfigRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.createTrackerConfig);
    }

    /**
     * 创建或更新记录器
     *
     * 创建或更新资源记录器，只能存在一个资源记录器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrackerConfigRequest 请求对象
     * @return SyncInvoker<CreateTrackerConfigRequest, CreateTrackerConfigResponse>
     */
    public SyncInvoker<CreateTrackerConfigRequest, CreateTrackerConfigResponse> createTrackerConfigInvoker(
        CreateTrackerConfigRequest request) {
        return new SyncInvoker<>(request, RmsMeta.createTrackerConfig, hcClient);
    }

    /**
     * 删除记录器
     *
     * 删除资源记录器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrackerConfigRequest 请求对象
     * @return DeleteTrackerConfigResponse
     */
    public DeleteTrackerConfigResponse deleteTrackerConfig(DeleteTrackerConfigRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.deleteTrackerConfig);
    }

    /**
     * 删除记录器
     *
     * 删除资源记录器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrackerConfigRequest 请求对象
     * @return SyncInvoker<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse>
     */
    public SyncInvoker<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse> deleteTrackerConfigInvoker(
        DeleteTrackerConfigRequest request) {
        return new SyncInvoker<>(request, RmsMeta.deleteTrackerConfig, hcClient);
    }

    /**
     * 查询记录器
     *
     * 查询资源记录器的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrackerConfigRequest 请求对象
     * @return ShowTrackerConfigResponse
     */
    public ShowTrackerConfigResponse showTrackerConfig(ShowTrackerConfigRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showTrackerConfig);
    }

    /**
     * 查询记录器
     *
     * 查询资源记录器的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrackerConfigRequest 请求对象
     * @return SyncInvoker<ShowTrackerConfigRequest, ShowTrackerConfigResponse>
     */
    public SyncInvoker<ShowTrackerConfigRequest, ShowTrackerConfigResponse> showTrackerConfigInvoker(
        ShowTrackerConfigRequest request) {
        return new SyncInvoker<>(request, RmsMeta.showTrackerConfig, hcClient);
    }

}
