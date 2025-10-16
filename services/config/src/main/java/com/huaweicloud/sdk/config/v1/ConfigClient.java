package com.huaweicloud.sdk.config.v1;

import com.huaweicloud.sdk.config.v1.model.BatchCreateRemediationExceptionsRequest;
import com.huaweicloud.sdk.config.v1.model.BatchCreateRemediationExceptionsResponse;
import com.huaweicloud.sdk.config.v1.model.BatchDeleteRemediationExceptionsRequest;
import com.huaweicloud.sdk.config.v1.model.BatchDeleteRemediationExceptionsResponse;
import com.huaweicloud.sdk.config.v1.model.CollectAllResourcesSummaryRequest;
import com.huaweicloud.sdk.config.v1.model.CollectAllResourcesSummaryResponse;
import com.huaweicloud.sdk.config.v1.model.CollectConformancePackComplianceSummaryRequest;
import com.huaweicloud.sdk.config.v1.model.CollectConformancePackComplianceSummaryResponse;
import com.huaweicloud.sdk.config.v1.model.CollectPolicyAssignmentsStatesSummaryRequest;
import com.huaweicloud.sdk.config.v1.model.CollectPolicyAssignmentsStatesSummaryResponse;
import com.huaweicloud.sdk.config.v1.model.CollectPolicyStatesSummaryRequest;
import com.huaweicloud.sdk.config.v1.model.CollectPolicyStatesSummaryResponse;
import com.huaweicloud.sdk.config.v1.model.CollectRemediationExecutionStatusesSummaryRequest;
import com.huaweicloud.sdk.config.v1.model.CollectRemediationExecutionStatusesSummaryResponse;
import com.huaweicloud.sdk.config.v1.model.CollectResourcesPolicyStatesSummaryRequest;
import com.huaweicloud.sdk.config.v1.model.CollectResourcesPolicyStatesSummaryResponse;
import com.huaweicloud.sdk.config.v1.model.CollectTrackedResourcesSummaryRequest;
import com.huaweicloud.sdk.config.v1.model.CollectTrackedResourcesSummaryResponse;
import com.huaweicloud.sdk.config.v1.model.CountAllResourcesRequest;
import com.huaweicloud.sdk.config.v1.model.CountAllResourcesResponse;
import com.huaweicloud.sdk.config.v1.model.CountResourcesByTagRequest;
import com.huaweicloud.sdk.config.v1.model.CountResourcesByTagResponse;
import com.huaweicloud.sdk.config.v1.model.CountTrackedResourcesRequest;
import com.huaweicloud.sdk.config.v1.model.CountTrackedResourcesResponse;
import com.huaweicloud.sdk.config.v1.model.CreateAggregationAuthorizationRequest;
import com.huaweicloud.sdk.config.v1.model.CreateAggregationAuthorizationResponse;
import com.huaweicloud.sdk.config.v1.model.CreateConfigurationAggregatorRequest;
import com.huaweicloud.sdk.config.v1.model.CreateConfigurationAggregatorResponse;
import com.huaweicloud.sdk.config.v1.model.CreateConformancePackRequest;
import com.huaweicloud.sdk.config.v1.model.CreateConformancePackResponse;
import com.huaweicloud.sdk.config.v1.model.CreateOrUpdateRemediationConfigurationRequest;
import com.huaweicloud.sdk.config.v1.model.CreateOrUpdateRemediationConfigurationResponse;
import com.huaweicloud.sdk.config.v1.model.CreateOrganizationConformancePackRequest;
import com.huaweicloud.sdk.config.v1.model.CreateOrganizationConformancePackResponse;
import com.huaweicloud.sdk.config.v1.model.CreateOrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.CreateOrganizationPolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.CreatePolicyAssignmentsRequest;
import com.huaweicloud.sdk.config.v1.model.CreatePolicyAssignmentsResponse;
import com.huaweicloud.sdk.config.v1.model.CreateStoredQueryRequest;
import com.huaweicloud.sdk.config.v1.model.CreateStoredQueryResponse;
import com.huaweicloud.sdk.config.v1.model.CreateTrackerConfigRequest;
import com.huaweicloud.sdk.config.v1.model.CreateTrackerConfigResponse;
import com.huaweicloud.sdk.config.v1.model.DeleteAggregationAuthorizationRequest;
import com.huaweicloud.sdk.config.v1.model.DeleteAggregationAuthorizationResponse;
import com.huaweicloud.sdk.config.v1.model.DeleteConfigurationAggregatorRequest;
import com.huaweicloud.sdk.config.v1.model.DeleteConfigurationAggregatorResponse;
import com.huaweicloud.sdk.config.v1.model.DeleteConformancePackRequest;
import com.huaweicloud.sdk.config.v1.model.DeleteConformancePackResponse;
import com.huaweicloud.sdk.config.v1.model.DeleteOrganizationConformancePackRequest;
import com.huaweicloud.sdk.config.v1.model.DeleteOrganizationConformancePackResponse;
import com.huaweicloud.sdk.config.v1.model.DeleteOrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.DeleteOrganizationPolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.DeletePendingAggregationRequestRequest;
import com.huaweicloud.sdk.config.v1.model.DeletePendingAggregationRequestResponse;
import com.huaweicloud.sdk.config.v1.model.DeletePolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.DeletePolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.DeleteRemediationConfigurationRequest;
import com.huaweicloud.sdk.config.v1.model.DeleteRemediationConfigurationResponse;
import com.huaweicloud.sdk.config.v1.model.DeleteStoredQueryRequest;
import com.huaweicloud.sdk.config.v1.model.DeleteStoredQueryResponse;
import com.huaweicloud.sdk.config.v1.model.DeleteTrackerConfigRequest;
import com.huaweicloud.sdk.config.v1.model.DeleteTrackerConfigResponse;
import com.huaweicloud.sdk.config.v1.model.DisablePolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.DisablePolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.EnablePolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.EnablePolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.ListAggregateComplianceByPolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.ListAggregateComplianceByPolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.ListAggregateDiscoveredResourcesRequest;
import com.huaweicloud.sdk.config.v1.model.ListAggregateDiscoveredResourcesResponse;
import com.huaweicloud.sdk.config.v1.model.ListAggregationAuthorizationsRequest;
import com.huaweicloud.sdk.config.v1.model.ListAggregationAuthorizationsResponse;
import com.huaweicloud.sdk.config.v1.model.ListAllProvidersRequest;
import com.huaweicloud.sdk.config.v1.model.ListAllProvidersResponse;
import com.huaweicloud.sdk.config.v1.model.ListAllResourcesRequest;
import com.huaweicloud.sdk.config.v1.model.ListAllResourcesResponse;
import com.huaweicloud.sdk.config.v1.model.ListAllTagsRequest;
import com.huaweicloud.sdk.config.v1.model.ListAllTagsResponse;
import com.huaweicloud.sdk.config.v1.model.ListBuiltInConformancePackTemplatesRequest;
import com.huaweicloud.sdk.config.v1.model.ListBuiltInConformancePackTemplatesResponse;
import com.huaweicloud.sdk.config.v1.model.ListBuiltInPolicyDefinitionsRequest;
import com.huaweicloud.sdk.config.v1.model.ListBuiltInPolicyDefinitionsResponse;
import com.huaweicloud.sdk.config.v1.model.ListConfigurationAggregatorsRequest;
import com.huaweicloud.sdk.config.v1.model.ListConfigurationAggregatorsResponse;
import com.huaweicloud.sdk.config.v1.model.ListConformancePackComplianceByPackIdRequest;
import com.huaweicloud.sdk.config.v1.model.ListConformancePackComplianceByPackIdResponse;
import com.huaweicloud.sdk.config.v1.model.ListConformancePackComplianceDetailsByPackIdRequest;
import com.huaweicloud.sdk.config.v1.model.ListConformancePackComplianceDetailsByPackIdResponse;
import com.huaweicloud.sdk.config.v1.model.ListConformancePackComplianceScoresRequest;
import com.huaweicloud.sdk.config.v1.model.ListConformancePackComplianceScoresResponse;
import com.huaweicloud.sdk.config.v1.model.ListConformancePacksRequest;
import com.huaweicloud.sdk.config.v1.model.ListConformancePacksResponse;
import com.huaweicloud.sdk.config.v1.model.ListOrganizationConformancePackStatusesRequest;
import com.huaweicloud.sdk.config.v1.model.ListOrganizationConformancePackStatusesResponse;
import com.huaweicloud.sdk.config.v1.model.ListOrganizationConformancePacksRequest;
import com.huaweicloud.sdk.config.v1.model.ListOrganizationConformancePacksResponse;
import com.huaweicloud.sdk.config.v1.model.ListOrganizationPolicyAssignmentsRequest;
import com.huaweicloud.sdk.config.v1.model.ListOrganizationPolicyAssignmentsResponse;
import com.huaweicloud.sdk.config.v1.model.ListPendingAggregationRequestsRequest;
import com.huaweicloud.sdk.config.v1.model.ListPendingAggregationRequestsResponse;
import com.huaweicloud.sdk.config.v1.model.ListPolicyAssignmentsRequest;
import com.huaweicloud.sdk.config.v1.model.ListPolicyAssignmentsResponse;
import com.huaweicloud.sdk.config.v1.model.ListPolicyStatesByAssignmentIdRequest;
import com.huaweicloud.sdk.config.v1.model.ListPolicyStatesByAssignmentIdResponse;
import com.huaweicloud.sdk.config.v1.model.ListPolicyStatesByDomainIdRequest;
import com.huaweicloud.sdk.config.v1.model.ListPolicyStatesByDomainIdResponse;
import com.huaweicloud.sdk.config.v1.model.ListPolicyStatesByResourceIdRequest;
import com.huaweicloud.sdk.config.v1.model.ListPolicyStatesByResourceIdResponse;
import com.huaweicloud.sdk.config.v1.model.ListPolicyStatesStatisticsRequest;
import com.huaweicloud.sdk.config.v1.model.ListPolicyStatesStatisticsResponse;
import com.huaweicloud.sdk.config.v1.model.ListProvidersRequest;
import com.huaweicloud.sdk.config.v1.model.ListProvidersResponse;
import com.huaweicloud.sdk.config.v1.model.ListRegionsRequest;
import com.huaweicloud.sdk.config.v1.model.ListRegionsResponse;
import com.huaweicloud.sdk.config.v1.model.ListRemediationExceptionsRequest;
import com.huaweicloud.sdk.config.v1.model.ListRemediationExceptionsResponse;
import com.huaweicloud.sdk.config.v1.model.ListRemediationExecutionStatusesRequest;
import com.huaweicloud.sdk.config.v1.model.ListRemediationExecutionStatusesResponse;
import com.huaweicloud.sdk.config.v1.model.ListResourcesByTagRequest;
import com.huaweicloud.sdk.config.v1.model.ListResourcesByTagResponse;
import com.huaweicloud.sdk.config.v1.model.ListResourcesRequest;
import com.huaweicloud.sdk.config.v1.model.ListResourcesResponse;
import com.huaweicloud.sdk.config.v1.model.ListSchemasRequest;
import com.huaweicloud.sdk.config.v1.model.ListSchemasResponse;
import com.huaweicloud.sdk.config.v1.model.ListStoredQueriesRequest;
import com.huaweicloud.sdk.config.v1.model.ListStoredQueriesResponse;
import com.huaweicloud.sdk.config.v1.model.ListTagsForResourceRequest;
import com.huaweicloud.sdk.config.v1.model.ListTagsForResourceResponse;
import com.huaweicloud.sdk.config.v1.model.ListTagsForResourceTypeRequest;
import com.huaweicloud.sdk.config.v1.model.ListTagsForResourceTypeResponse;
import com.huaweicloud.sdk.config.v1.model.ListTrackedResourceTagsRequest;
import com.huaweicloud.sdk.config.v1.model.ListTrackedResourceTagsResponse;
import com.huaweicloud.sdk.config.v1.model.ListTrackedResourcesRequest;
import com.huaweicloud.sdk.config.v1.model.ListTrackedResourcesResponse;
import com.huaweicloud.sdk.config.v1.model.RunAggregateResourceQueryRequest;
import com.huaweicloud.sdk.config.v1.model.RunAggregateResourceQueryResponse;
import com.huaweicloud.sdk.config.v1.model.RunEvaluationByPolicyAssignmentIdRequest;
import com.huaweicloud.sdk.config.v1.model.RunEvaluationByPolicyAssignmentIdResponse;
import com.huaweicloud.sdk.config.v1.model.RunQueryRequest;
import com.huaweicloud.sdk.config.v1.model.RunQueryResponse;
import com.huaweicloud.sdk.config.v1.model.RunRemediationExecutionRequest;
import com.huaweicloud.sdk.config.v1.model.RunRemediationExecutionResponse;
import com.huaweicloud.sdk.config.v1.model.ShowAggregateComplianceDetailsByPolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.ShowAggregateComplianceDetailsByPolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.ShowAggregateDiscoveredResourceCountsRequest;
import com.huaweicloud.sdk.config.v1.model.ShowAggregateDiscoveredResourceCountsResponse;
import com.huaweicloud.sdk.config.v1.model.ShowAggregatePolicyAssignmentDetailRequest;
import com.huaweicloud.sdk.config.v1.model.ShowAggregatePolicyAssignmentDetailResponse;
import com.huaweicloud.sdk.config.v1.model.ShowAggregatePolicyStateComplianceSummaryRequest;
import com.huaweicloud.sdk.config.v1.model.ShowAggregatePolicyStateComplianceSummaryResponse;
import com.huaweicloud.sdk.config.v1.model.ShowAggregateResourceConfigRequest;
import com.huaweicloud.sdk.config.v1.model.ShowAggregateResourceConfigResponse;
import com.huaweicloud.sdk.config.v1.model.ShowBuiltInConformancePackTemplateRequest;
import com.huaweicloud.sdk.config.v1.model.ShowBuiltInConformancePackTemplateResponse;
import com.huaweicloud.sdk.config.v1.model.ShowBuiltInPolicyDefinitionRequest;
import com.huaweicloud.sdk.config.v1.model.ShowBuiltInPolicyDefinitionResponse;
import com.huaweicloud.sdk.config.v1.model.ShowConfigurationAggregatorRequest;
import com.huaweicloud.sdk.config.v1.model.ShowConfigurationAggregatorResponse;
import com.huaweicloud.sdk.config.v1.model.ShowConfigurationAggregatorSourcesStatusRequest;
import com.huaweicloud.sdk.config.v1.model.ShowConfigurationAggregatorSourcesStatusResponse;
import com.huaweicloud.sdk.config.v1.model.ShowConformancePackRequest;
import com.huaweicloud.sdk.config.v1.model.ShowConformancePackResponse;
import com.huaweicloud.sdk.config.v1.model.ShowEvaluationStateByAssignmentIdRequest;
import com.huaweicloud.sdk.config.v1.model.ShowEvaluationStateByAssignmentIdResponse;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationConformancePackDetailedStatusesRequest;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationConformancePackDetailedStatusesResponse;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationConformancePackRequest;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationConformancePackResponse;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationPolicyAssignmentDetailedStatusRequest;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationPolicyAssignmentDetailedStatusResponse;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationPolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationPolicyAssignmentStatusesRequest;
import com.huaweicloud.sdk.config.v1.model.ShowOrganizationPolicyAssignmentStatusesResponse;
import com.huaweicloud.sdk.config.v1.model.ShowPolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.ShowPolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.ShowRemediationConfigurationRequest;
import com.huaweicloud.sdk.config.v1.model.ShowRemediationConfigurationResponse;
import com.huaweicloud.sdk.config.v1.model.ShowResourceByIdRequest;
import com.huaweicloud.sdk.config.v1.model.ShowResourceByIdResponse;
import com.huaweicloud.sdk.config.v1.model.ShowResourceDetailRequest;
import com.huaweicloud.sdk.config.v1.model.ShowResourceDetailResponse;
import com.huaweicloud.sdk.config.v1.model.ShowResourceHistoryRequest;
import com.huaweicloud.sdk.config.v1.model.ShowResourceHistoryResponse;
import com.huaweicloud.sdk.config.v1.model.ShowResourceRelationsDetailRequest;
import com.huaweicloud.sdk.config.v1.model.ShowResourceRelationsDetailResponse;
import com.huaweicloud.sdk.config.v1.model.ShowResourceRelationsRequest;
import com.huaweicloud.sdk.config.v1.model.ShowResourceRelationsResponse;
import com.huaweicloud.sdk.config.v1.model.ShowStoredQueryRequest;
import com.huaweicloud.sdk.config.v1.model.ShowStoredQueryResponse;
import com.huaweicloud.sdk.config.v1.model.ShowTrackedResourceDetailRequest;
import com.huaweicloud.sdk.config.v1.model.ShowTrackedResourceDetailResponse;
import com.huaweicloud.sdk.config.v1.model.ShowTrackerConfigRequest;
import com.huaweicloud.sdk.config.v1.model.ShowTrackerConfigResponse;
import com.huaweicloud.sdk.config.v1.model.TagResourceRequest;
import com.huaweicloud.sdk.config.v1.model.TagResourceResponse;
import com.huaweicloud.sdk.config.v1.model.UnTagResourceRequest;
import com.huaweicloud.sdk.config.v1.model.UnTagResourceResponse;
import com.huaweicloud.sdk.config.v1.model.UpdateConfigurationAggregatorRequest;
import com.huaweicloud.sdk.config.v1.model.UpdateConfigurationAggregatorResponse;
import com.huaweicloud.sdk.config.v1.model.UpdateConformancePackRequest;
import com.huaweicloud.sdk.config.v1.model.UpdateConformancePackResponse;
import com.huaweicloud.sdk.config.v1.model.UpdateOrganizationConformancePackRequest;
import com.huaweicloud.sdk.config.v1.model.UpdateOrganizationConformancePackResponse;
import com.huaweicloud.sdk.config.v1.model.UpdateOrganizationPolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.UpdateOrganizationPolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.UpdatePolicyAssignmentRequest;
import com.huaweicloud.sdk.config.v1.model.UpdatePolicyAssignmentResponse;
import com.huaweicloud.sdk.config.v1.model.UpdatePolicyStateRequest;
import com.huaweicloud.sdk.config.v1.model.UpdatePolicyStateResponse;
import com.huaweicloud.sdk.config.v1.model.UpdateStoredQueryRequest;
import com.huaweicloud.sdk.config.v1.model.UpdateStoredQueryResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class ConfigClient {

    protected HcClient hcClient;

    public ConfigClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ConfigClient> newBuilder() {
        ClientBuilder<ConfigClient> clientBuilder = new ClientBuilder<>(ConfigClient::new, "GlobalCredentials");
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.createAggregationAuthorization);
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
        return new SyncInvoker<>(request, ConfigMeta.createAggregationAuthorization, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.createConfigurationAggregator);
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
        return new SyncInvoker<>(request, ConfigMeta.createConfigurationAggregator, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.deleteAggregationAuthorization);
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
        return new SyncInvoker<>(request, ConfigMeta.deleteAggregationAuthorization, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.deleteConfigurationAggregator);
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
        return new SyncInvoker<>(request, ConfigMeta.deleteConfigurationAggregator, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.deletePendingAggregationRequest);
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
        return new SyncInvoker<>(request, ConfigMeta.deletePendingAggregationRequest, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listAggregateComplianceByPolicyAssignment);
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
        return new SyncInvoker<>(request, ConfigMeta.listAggregateComplianceByPolicyAssignment, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listAggregateDiscoveredResources);
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
        return new SyncInvoker<>(request, ConfigMeta.listAggregateDiscoveredResources, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listAggregationAuthorizations);
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
        return new SyncInvoker<>(request, ConfigMeta.listAggregationAuthorizations, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listConfigurationAggregators);
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
        return new SyncInvoker<>(request, ConfigMeta.listConfigurationAggregators, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listPendingAggregationRequests);
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
        return new SyncInvoker<>(request, ConfigMeta.listPendingAggregationRequests, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.runAggregateResourceQuery);
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
        return new SyncInvoker<>(request, ConfigMeta.runAggregateResourceQuery, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showAggregateComplianceDetailsByPolicyAssignment);
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
        return new SyncInvoker<>(request, ConfigMeta.showAggregateComplianceDetailsByPolicyAssignment, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showAggregateDiscoveredResourceCounts);
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
        return new SyncInvoker<>(request, ConfigMeta.showAggregateDiscoveredResourceCounts, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showAggregatePolicyAssignmentDetail);
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
        return new SyncInvoker<>(request, ConfigMeta.showAggregatePolicyAssignmentDetail, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showAggregatePolicyStateComplianceSummary);
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
        return new SyncInvoker<>(request, ConfigMeta.showAggregatePolicyStateComplianceSummary, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showAggregateResourceConfig);
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
        return new SyncInvoker<>(request, ConfigMeta.showAggregateResourceConfig, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showConfigurationAggregator);
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
        return new SyncInvoker<>(request, ConfigMeta.showConfigurationAggregator, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showConfigurationAggregatorSourcesStatus);
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
        return new SyncInvoker<>(request, ConfigMeta.showConfigurationAggregatorSourcesStatus, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.updateConfigurationAggregator);
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
        return new SyncInvoker<>(request, ConfigMeta.updateConfigurationAggregator, hcClient);
    }

    /**
     * 列举合规规则包的结果概览
     *
     * 列举用户的合规规则包的合规结果概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectConformancePackComplianceSummaryRequest 请求对象
     * @return CollectConformancePackComplianceSummaryResponse
     */
    public CollectConformancePackComplianceSummaryResponse collectConformancePackComplianceSummary(
        CollectConformancePackComplianceSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.collectConformancePackComplianceSummary);
    }

    /**
     * 列举合规规则包的结果概览
     *
     * 列举用户的合规规则包的合规结果概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectConformancePackComplianceSummaryRequest 请求对象
     * @return SyncInvoker<CollectConformancePackComplianceSummaryRequest, CollectConformancePackComplianceSummaryResponse>
     */
    public SyncInvoker<CollectConformancePackComplianceSummaryRequest, CollectConformancePackComplianceSummaryResponse> collectConformancePackComplianceSummaryInvoker(
        CollectConformancePackComplianceSummaryRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.collectConformancePackComplianceSummary, hcClient);
    }

    /**
     * 创建合规规则包
     *
     * 创建新的合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConformancePackRequest 请求对象
     * @return CreateConformancePackResponse
     */
    public CreateConformancePackResponse createConformancePack(CreateConformancePackRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.createConformancePack);
    }

    /**
     * 创建合规规则包
     *
     * 创建新的合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConformancePackRequest 请求对象
     * @return SyncInvoker<CreateConformancePackRequest, CreateConformancePackResponse>
     */
    public SyncInvoker<CreateConformancePackRequest, CreateConformancePackResponse> createConformancePackInvoker(
        CreateConformancePackRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.createConformancePack, hcClient);
    }

    /**
     * 创建组织合规规则包
     *
     * 创建新的组织合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrganizationConformancePackRequest 请求对象
     * @return CreateOrganizationConformancePackResponse
     */
    public CreateOrganizationConformancePackResponse createOrganizationConformancePack(
        CreateOrganizationConformancePackRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.createOrganizationConformancePack);
    }

    /**
     * 创建组织合规规则包
     *
     * 创建新的组织合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrganizationConformancePackRequest 请求对象
     * @return SyncInvoker<CreateOrganizationConformancePackRequest, CreateOrganizationConformancePackResponse>
     */
    public SyncInvoker<CreateOrganizationConformancePackRequest, CreateOrganizationConformancePackResponse> createOrganizationConformancePackInvoker(
        CreateOrganizationConformancePackRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.createOrganizationConformancePack, hcClient);
    }

    /**
     * 删除合规规则包
     *
     * 删除用户的合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConformancePackRequest 请求对象
     * @return DeleteConformancePackResponse
     */
    public DeleteConformancePackResponse deleteConformancePack(DeleteConformancePackRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.deleteConformancePack);
    }

    /**
     * 删除合规规则包
     *
     * 删除用户的合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConformancePackRequest 请求对象
     * @return SyncInvoker<DeleteConformancePackRequest, DeleteConformancePackResponse>
     */
    public SyncInvoker<DeleteConformancePackRequest, DeleteConformancePackResponse> deleteConformancePackInvoker(
        DeleteConformancePackRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.deleteConformancePack, hcClient);
    }

    /**
     * 删除组织合规规则包
     *
     * 删除用户的组织合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrganizationConformancePackRequest 请求对象
     * @return DeleteOrganizationConformancePackResponse
     */
    public DeleteOrganizationConformancePackResponse deleteOrganizationConformancePack(
        DeleteOrganizationConformancePackRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.deleteOrganizationConformancePack);
    }

    /**
     * 删除组织合规规则包
     *
     * 删除用户的组织合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrganizationConformancePackRequest 请求对象
     * @return SyncInvoker<DeleteOrganizationConformancePackRequest, DeleteOrganizationConformancePackResponse>
     */
    public SyncInvoker<DeleteOrganizationConformancePackRequest, DeleteOrganizationConformancePackResponse> deleteOrganizationConformancePackInvoker(
        DeleteOrganizationConformancePackRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.deleteOrganizationConformancePack, hcClient);
    }

    /**
     * 列举预定义合规规则包模板
     *
     * 列举预定义的合规规则包的模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuiltInConformancePackTemplatesRequest 请求对象
     * @return ListBuiltInConformancePackTemplatesResponse
     */
    public ListBuiltInConformancePackTemplatesResponse listBuiltInConformancePackTemplates(
        ListBuiltInConformancePackTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listBuiltInConformancePackTemplates);
    }

    /**
     * 列举预定义合规规则包模板
     *
     * 列举预定义的合规规则包的模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBuiltInConformancePackTemplatesRequest 请求对象
     * @return SyncInvoker<ListBuiltInConformancePackTemplatesRequest, ListBuiltInConformancePackTemplatesResponse>
     */
    public SyncInvoker<ListBuiltInConformancePackTemplatesRequest, ListBuiltInConformancePackTemplatesResponse> listBuiltInConformancePackTemplatesInvoker(
        ListBuiltInConformancePackTemplatesRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listBuiltInConformancePackTemplates, hcClient);
    }

    /**
     * 列举合规规则包的评估结果
     *
     * 列举合规规则包的合规规则评估结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConformancePackComplianceByPackIdRequest 请求对象
     * @return ListConformancePackComplianceByPackIdResponse
     */
    public ListConformancePackComplianceByPackIdResponse listConformancePackComplianceByPackId(
        ListConformancePackComplianceByPackIdRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listConformancePackComplianceByPackId);
    }

    /**
     * 列举合规规则包的评估结果
     *
     * 列举合规规则包的合规规则评估结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConformancePackComplianceByPackIdRequest 请求对象
     * @return SyncInvoker<ListConformancePackComplianceByPackIdRequest, ListConformancePackComplianceByPackIdResponse>
     */
    public SyncInvoker<ListConformancePackComplianceByPackIdRequest, ListConformancePackComplianceByPackIdResponse> listConformancePackComplianceByPackIdInvoker(
        ListConformancePackComplianceByPackIdRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listConformancePackComplianceByPackId, hcClient);
    }

    /**
     * 列举合规规则包的评估结果详情
     *
     * 列举合规规则包的合规规则评估结果详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConformancePackComplianceDetailsByPackIdRequest 请求对象
     * @return ListConformancePackComplianceDetailsByPackIdResponse
     */
    public ListConformancePackComplianceDetailsByPackIdResponse listConformancePackComplianceDetailsByPackId(
        ListConformancePackComplianceDetailsByPackIdRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listConformancePackComplianceDetailsByPackId);
    }

    /**
     * 列举合规规则包的评估结果详情
     *
     * 列举合规规则包的合规规则评估结果详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConformancePackComplianceDetailsByPackIdRequest 请求对象
     * @return SyncInvoker<ListConformancePackComplianceDetailsByPackIdRequest, ListConformancePackComplianceDetailsByPackIdResponse>
     */
    public SyncInvoker<ListConformancePackComplianceDetailsByPackIdRequest, ListConformancePackComplianceDetailsByPackIdResponse> listConformancePackComplianceDetailsByPackIdInvoker(
        ListConformancePackComplianceDetailsByPackIdRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listConformancePackComplianceDetailsByPackId, hcClient);
    }

    /**
     * 列举合规规则包分数
     *
     * 列举用户的合规规则包分数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConformancePackComplianceScoresRequest 请求对象
     * @return ListConformancePackComplianceScoresResponse
     */
    public ListConformancePackComplianceScoresResponse listConformancePackComplianceScores(
        ListConformancePackComplianceScoresRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listConformancePackComplianceScores);
    }

    /**
     * 列举合规规则包分数
     *
     * 列举用户的合规规则包分数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConformancePackComplianceScoresRequest 请求对象
     * @return SyncInvoker<ListConformancePackComplianceScoresRequest, ListConformancePackComplianceScoresResponse>
     */
    public SyncInvoker<ListConformancePackComplianceScoresRequest, ListConformancePackComplianceScoresResponse> listConformancePackComplianceScoresInvoker(
        ListConformancePackComplianceScoresRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listConformancePackComplianceScores, hcClient);
    }

    /**
     * 列举合规规则包
     *
     * 列举用户的合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConformancePacksRequest 请求对象
     * @return ListConformancePacksResponse
     */
    public ListConformancePacksResponse listConformancePacks(ListConformancePacksRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listConformancePacks);
    }

    /**
     * 列举合规规则包
     *
     * 列举用户的合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConformancePacksRequest 请求对象
     * @return SyncInvoker<ListConformancePacksRequest, ListConformancePacksResponse>
     */
    public SyncInvoker<ListConformancePacksRequest, ListConformancePacksResponse> listConformancePacksInvoker(
        ListConformancePacksRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listConformancePacks, hcClient);
    }

    /**
     * 查看组织合规规则包部署状态
     *
     * 列举用户的组织合规规则包部署状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationConformancePackStatusesRequest 请求对象
     * @return ListOrganizationConformancePackStatusesResponse
     */
    public ListOrganizationConformancePackStatusesResponse listOrganizationConformancePackStatuses(
        ListOrganizationConformancePackStatusesRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listOrganizationConformancePackStatuses);
    }

    /**
     * 查看组织合规规则包部署状态
     *
     * 列举用户的组织合规规则包部署状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationConformancePackStatusesRequest 请求对象
     * @return SyncInvoker<ListOrganizationConformancePackStatusesRequest, ListOrganizationConformancePackStatusesResponse>
     */
    public SyncInvoker<ListOrganizationConformancePackStatusesRequest, ListOrganizationConformancePackStatusesResponse> listOrganizationConformancePackStatusesInvoker(
        ListOrganizationConformancePackStatusesRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listOrganizationConformancePackStatuses, hcClient);
    }

    /**
     * 列举组织合规规则包
     *
     * 列举用户的组织合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationConformancePacksRequest 请求对象
     * @return ListOrganizationConformancePacksResponse
     */
    public ListOrganizationConformancePacksResponse listOrganizationConformancePacks(
        ListOrganizationConformancePacksRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listOrganizationConformancePacks);
    }

    /**
     * 列举组织合规规则包
     *
     * 列举用户的组织合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationConformancePacksRequest 请求对象
     * @return SyncInvoker<ListOrganizationConformancePacksRequest, ListOrganizationConformancePacksResponse>
     */
    public SyncInvoker<ListOrganizationConformancePacksRequest, ListOrganizationConformancePacksResponse> listOrganizationConformancePacksInvoker(
        ListOrganizationConformancePacksRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listOrganizationConformancePacks, hcClient);
    }

    /**
     * 查看预定义合规规则包模板
     *
     * 根据ID获取单个预定义合规规则包模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuiltInConformancePackTemplateRequest 请求对象
     * @return ShowBuiltInConformancePackTemplateResponse
     */
    public ShowBuiltInConformancePackTemplateResponse showBuiltInConformancePackTemplate(
        ShowBuiltInConformancePackTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showBuiltInConformancePackTemplate);
    }

    /**
     * 查看预定义合规规则包模板
     *
     * 根据ID获取单个预定义合规规则包模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBuiltInConformancePackTemplateRequest 请求对象
     * @return SyncInvoker<ShowBuiltInConformancePackTemplateRequest, ShowBuiltInConformancePackTemplateResponse>
     */
    public SyncInvoker<ShowBuiltInConformancePackTemplateRequest, ShowBuiltInConformancePackTemplateResponse> showBuiltInConformancePackTemplateInvoker(
        ShowBuiltInConformancePackTemplateRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.showBuiltInConformancePackTemplate, hcClient);
    }

    /**
     * 查看合规规则包
     *
     * 根据ID获取单个合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConformancePackRequest 请求对象
     * @return ShowConformancePackResponse
     */
    public ShowConformancePackResponse showConformancePack(ShowConformancePackRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showConformancePack);
    }

    /**
     * 查看合规规则包
     *
     * 根据ID获取单个合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConformancePackRequest 请求对象
     * @return SyncInvoker<ShowConformancePackRequest, ShowConformancePackResponse>
     */
    public SyncInvoker<ShowConformancePackRequest, ShowConformancePackResponse> showConformancePackInvoker(
        ShowConformancePackRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.showConformancePack, hcClient);
    }

    /**
     * 查看组织合规规则包
     *
     * 根据ID获取单个组织合规规则包详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationConformancePackRequest 请求对象
     * @return ShowOrganizationConformancePackResponse
     */
    public ShowOrganizationConformancePackResponse showOrganizationConformancePack(
        ShowOrganizationConformancePackRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showOrganizationConformancePack);
    }

    /**
     * 查看组织合规规则包
     *
     * 根据ID获取单个组织合规规则包详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationConformancePackRequest 请求对象
     * @return SyncInvoker<ShowOrganizationConformancePackRequest, ShowOrganizationConformancePackResponse>
     */
    public SyncInvoker<ShowOrganizationConformancePackRequest, ShowOrganizationConformancePackResponse> showOrganizationConformancePackInvoker(
        ShowOrganizationConformancePackRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.showOrganizationConformancePack, hcClient);
    }

    /**
     * 查看组织合规规则包部署详细状态
     *
     * 查看指定组织合规规则包在成员帐号中的部署状态详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationConformancePackDetailedStatusesRequest 请求对象
     * @return ShowOrganizationConformancePackDetailedStatusesResponse
     */
    public ShowOrganizationConformancePackDetailedStatusesResponse showOrganizationConformancePackDetailedStatuses(
        ShowOrganizationConformancePackDetailedStatusesRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showOrganizationConformancePackDetailedStatuses);
    }

    /**
     * 查看组织合规规则包部署详细状态
     *
     * 查看指定组织合规规则包在成员帐号中的部署状态详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationConformancePackDetailedStatusesRequest 请求对象
     * @return SyncInvoker<ShowOrganizationConformancePackDetailedStatusesRequest, ShowOrganizationConformancePackDetailedStatusesResponse>
     */
    public SyncInvoker<ShowOrganizationConformancePackDetailedStatusesRequest, ShowOrganizationConformancePackDetailedStatusesResponse> showOrganizationConformancePackDetailedStatusesInvoker(
        ShowOrganizationConformancePackDetailedStatusesRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.showOrganizationConformancePackDetailedStatuses, hcClient);
    }

    /**
     * 更新合规规则包
     *
     * 更新用户的合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConformancePackRequest 请求对象
     * @return UpdateConformancePackResponse
     */
    public UpdateConformancePackResponse updateConformancePack(UpdateConformancePackRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.updateConformancePack);
    }

    /**
     * 更新合规规则包
     *
     * 更新用户的合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConformancePackRequest 请求对象
     * @return SyncInvoker<UpdateConformancePackRequest, UpdateConformancePackResponse>
     */
    public SyncInvoker<UpdateConformancePackRequest, UpdateConformancePackResponse> updateConformancePackInvoker(
        UpdateConformancePackRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.updateConformancePack, hcClient);
    }

    /**
     * 更新组织合规规则包
     *
     * 更新用户的组织合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOrganizationConformancePackRequest 请求对象
     * @return UpdateOrganizationConformancePackResponse
     */
    public UpdateOrganizationConformancePackResponse updateOrganizationConformancePack(
        UpdateOrganizationConformancePackRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.updateOrganizationConformancePack);
    }

    /**
     * 更新组织合规规则包
     *
     * 更新用户的组织合规规则包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOrganizationConformancePackRequest 请求对象
     * @return SyncInvoker<UpdateOrganizationConformancePackRequest, UpdateOrganizationConformancePackResponse>
     */
    public SyncInvoker<UpdateOrganizationConformancePackRequest, UpdateOrganizationConformancePackResponse> updateOrganizationConformancePackInvoker(
        UpdateOrganizationConformancePackRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.updateOrganizationConformancePack, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showResourceHistory);
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
        return new SyncInvoker<>(request, ConfigMeta.showResourceHistory, hcClient);
    }

    /**
     * 批量创建修正例外
     *
     * 批量创建合规规则修正例外。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateRemediationExceptionsRequest 请求对象
     * @return BatchCreateRemediationExceptionsResponse
     */
    public BatchCreateRemediationExceptionsResponse batchCreateRemediationExceptions(
        BatchCreateRemediationExceptionsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.batchCreateRemediationExceptions);
    }

    /**
     * 批量创建修正例外
     *
     * 批量创建合规规则修正例外。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateRemediationExceptionsRequest 请求对象
     * @return SyncInvoker<BatchCreateRemediationExceptionsRequest, BatchCreateRemediationExceptionsResponse>
     */
    public SyncInvoker<BatchCreateRemediationExceptionsRequest, BatchCreateRemediationExceptionsResponse> batchCreateRemediationExceptionsInvoker(
        BatchCreateRemediationExceptionsRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.batchCreateRemediationExceptions, hcClient);
    }

    /**
     * 批量删除修正例外
     *
     * 批量删除合规规则修正例外。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRemediationExceptionsRequest 请求对象
     * @return BatchDeleteRemediationExceptionsResponse
     */
    public BatchDeleteRemediationExceptionsResponse batchDeleteRemediationExceptions(
        BatchDeleteRemediationExceptionsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.batchDeleteRemediationExceptions);
    }

    /**
     * 批量删除修正例外
     *
     * 批量删除合规规则修正例外。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRemediationExceptionsRequest 请求对象
     * @return SyncInvoker<BatchDeleteRemediationExceptionsRequest, BatchDeleteRemediationExceptionsResponse>
     */
    public SyncInvoker<BatchDeleteRemediationExceptionsRequest, BatchDeleteRemediationExceptionsResponse> batchDeleteRemediationExceptionsInvoker(
        BatchDeleteRemediationExceptionsRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.batchDeleteRemediationExceptions, hcClient);
    }

    /**
     * 查询规则的合规总结
     *
     * 根据规则ID查询此规则的合规总结
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectPolicyAssignmentsStatesSummaryRequest 请求对象
     * @return CollectPolicyAssignmentsStatesSummaryResponse
     */
    public CollectPolicyAssignmentsStatesSummaryResponse collectPolicyAssignmentsStatesSummary(
        CollectPolicyAssignmentsStatesSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.collectPolicyAssignmentsStatesSummary);
    }

    /**
     * 查询规则的合规总结
     *
     * 根据规则ID查询此规则的合规总结
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectPolicyAssignmentsStatesSummaryRequest 请求对象
     * @return SyncInvoker<CollectPolicyAssignmentsStatesSummaryRequest, CollectPolicyAssignmentsStatesSummaryResponse>
     */
    public SyncInvoker<CollectPolicyAssignmentsStatesSummaryRequest, CollectPolicyAssignmentsStatesSummaryResponse> collectPolicyAssignmentsStatesSummaryInvoker(
        CollectPolicyAssignmentsStatesSummaryRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.collectPolicyAssignmentsStatesSummary, hcClient);
    }

    /**
     * 查询用户的合规总结
     *
     * 查询用户的合规总结
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectPolicyStatesSummaryRequest 请求对象
     * @return CollectPolicyStatesSummaryResponse
     */
    public CollectPolicyStatesSummaryResponse collectPolicyStatesSummary(CollectPolicyStatesSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.collectPolicyStatesSummary);
    }

    /**
     * 查询用户的合规总结
     *
     * 查询用户的合规总结
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectPolicyStatesSummaryRequest 请求对象
     * @return SyncInvoker<CollectPolicyStatesSummaryRequest, CollectPolicyStatesSummaryResponse>
     */
    public SyncInvoker<CollectPolicyStatesSummaryRequest, CollectPolicyStatesSummaryResponse> collectPolicyStatesSummaryInvoker(
        CollectPolicyStatesSummaryRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.collectPolicyStatesSummary, hcClient);
    }

    /**
     * 列举修正最新记录
     *
     * 列举合规规则修正最新记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectRemediationExecutionStatusesSummaryRequest 请求对象
     * @return CollectRemediationExecutionStatusesSummaryResponse
     */
    public CollectRemediationExecutionStatusesSummaryResponse collectRemediationExecutionStatusesSummary(
        CollectRemediationExecutionStatusesSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.collectRemediationExecutionStatusesSummary);
    }

    /**
     * 列举修正最新记录
     *
     * 列举合规规则修正最新记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectRemediationExecutionStatusesSummaryRequest 请求对象
     * @return SyncInvoker<CollectRemediationExecutionStatusesSummaryRequest, CollectRemediationExecutionStatusesSummaryResponse>
     */
    public SyncInvoker<CollectRemediationExecutionStatusesSummaryRequest, CollectRemediationExecutionStatusesSummaryResponse> collectRemediationExecutionStatusesSummaryInvoker(
        CollectRemediationExecutionStatusesSummaryRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.collectRemediationExecutionStatusesSummary, hcClient);
    }

    /**
     * 查询用户资源的合规总结
     *
     * 查询用户资源的合规总结
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectResourcesPolicyStatesSummaryRequest 请求对象
     * @return CollectResourcesPolicyStatesSummaryResponse
     */
    public CollectResourcesPolicyStatesSummaryResponse collectResourcesPolicyStatesSummary(
        CollectResourcesPolicyStatesSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.collectResourcesPolicyStatesSummary);
    }

    /**
     * 查询用户资源的合规总结
     *
     * 查询用户资源的合规总结
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectResourcesPolicyStatesSummaryRequest 请求对象
     * @return SyncInvoker<CollectResourcesPolicyStatesSummaryRequest, CollectResourcesPolicyStatesSummaryResponse>
     */
    public SyncInvoker<CollectResourcesPolicyStatesSummaryRequest, CollectResourcesPolicyStatesSummaryResponse> collectResourcesPolicyStatesSummaryInvoker(
        CollectResourcesPolicyStatesSummaryRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.collectResourcesPolicyStatesSummary, hcClient);
    }

    /**
     * 创建或更新修正配置
     *
     * 创建或更新合规规则修正配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateRemediationConfigurationRequest 请求对象
     * @return CreateOrUpdateRemediationConfigurationResponse
     */
    public CreateOrUpdateRemediationConfigurationResponse createOrUpdateRemediationConfiguration(
        CreateOrUpdateRemediationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.createOrUpdateRemediationConfiguration);
    }

    /**
     * 创建或更新修正配置
     *
     * 创建或更新合规规则修正配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateRemediationConfigurationRequest 请求对象
     * @return SyncInvoker<CreateOrUpdateRemediationConfigurationRequest, CreateOrUpdateRemediationConfigurationResponse>
     */
    public SyncInvoker<CreateOrUpdateRemediationConfigurationRequest, CreateOrUpdateRemediationConfigurationResponse> createOrUpdateRemediationConfigurationInvoker(
        CreateOrUpdateRemediationConfigurationRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.createOrUpdateRemediationConfiguration, hcClient);
    }

    /**
     * 创建组织合规规则
     *
     * 创建组织合规规则，如果规则名称已存在，则为更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrganizationPolicyAssignmentRequest 请求对象
     * @return CreateOrganizationPolicyAssignmentResponse
     */
    public CreateOrganizationPolicyAssignmentResponse createOrganizationPolicyAssignment(
        CreateOrganizationPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.createOrganizationPolicyAssignment);
    }

    /**
     * 创建组织合规规则
     *
     * 创建组织合规规则，如果规则名称已存在，则为更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrganizationPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<CreateOrganizationPolicyAssignmentRequest, CreateOrganizationPolicyAssignmentResponse>
     */
    public SyncInvoker<CreateOrganizationPolicyAssignmentRequest, CreateOrganizationPolicyAssignmentResponse> createOrganizationPolicyAssignmentInvoker(
        CreateOrganizationPolicyAssignmentRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.createOrganizationPolicyAssignment, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.createPolicyAssignments);
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
        return new SyncInvoker<>(request, ConfigMeta.createPolicyAssignments, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.deleteOrganizationPolicyAssignment);
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
        return new SyncInvoker<>(request, ConfigMeta.deleteOrganizationPolicyAssignment, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.deletePolicyAssignment);
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
        return new SyncInvoker<>(request, ConfigMeta.deletePolicyAssignment, hcClient);
    }

    /**
     * 删除修正配置
     *
     * 删除合规规则修正配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRemediationConfigurationRequest 请求对象
     * @return DeleteRemediationConfigurationResponse
     */
    public DeleteRemediationConfigurationResponse deleteRemediationConfiguration(
        DeleteRemediationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.deleteRemediationConfiguration);
    }

    /**
     * 删除修正配置
     *
     * 删除合规规则修正配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRemediationConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteRemediationConfigurationRequest, DeleteRemediationConfigurationResponse>
     */
    public SyncInvoker<DeleteRemediationConfigurationRequest, DeleteRemediationConfigurationResponse> deleteRemediationConfigurationInvoker(
        DeleteRemediationConfigurationRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.deleteRemediationConfiguration, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.disablePolicyAssignment);
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
        return new SyncInvoker<>(request, ConfigMeta.disablePolicyAssignment, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.enablePolicyAssignment);
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
        return new SyncInvoker<>(request, ConfigMeta.enablePolicyAssignment, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listBuiltInPolicyDefinitions);
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
        return new SyncInvoker<>(request, ConfigMeta.listBuiltInPolicyDefinitions, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listOrganizationPolicyAssignments);
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
        return new SyncInvoker<>(request, ConfigMeta.listOrganizationPolicyAssignments, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listPolicyAssignments);
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
        return new SyncInvoker<>(request, ConfigMeta.listPolicyAssignments, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listPolicyStatesByAssignmentId);
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
        return new SyncInvoker<>(request, ConfigMeta.listPolicyStatesByAssignmentId, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listPolicyStatesByDomainId);
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
        return new SyncInvoker<>(request, ConfigMeta.listPolicyStatesByDomainId, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listPolicyStatesByResourceId);
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
        return new SyncInvoker<>(request, ConfigMeta.listPolicyStatesByResourceId, hcClient);
    }

    /**
     * 查询当前账号合规统计趋势
     *
     * 查询当前账号合规统计趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyStatesStatisticsRequest 请求对象
     * @return ListPolicyStatesStatisticsResponse
     */
    public ListPolicyStatesStatisticsResponse listPolicyStatesStatistics(ListPolicyStatesStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listPolicyStatesStatistics);
    }

    /**
     * 查询当前账号合规统计趋势
     *
     * 查询当前账号合规统计趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyStatesStatisticsRequest 请求对象
     * @return SyncInvoker<ListPolicyStatesStatisticsRequest, ListPolicyStatesStatisticsResponse>
     */
    public SyncInvoker<ListPolicyStatesStatisticsRequest, ListPolicyStatesStatisticsResponse> listPolicyStatesStatisticsInvoker(
        ListPolicyStatesStatisticsRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listPolicyStatesStatistics, hcClient);
    }

    /**
     * 查询修正例外
     *
     * 查询合规规则修正例外。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRemediationExceptionsRequest 请求对象
     * @return ListRemediationExceptionsResponse
     */
    public ListRemediationExceptionsResponse listRemediationExceptions(ListRemediationExceptionsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listRemediationExceptions);
    }

    /**
     * 查询修正例外
     *
     * 查询合规规则修正例外。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRemediationExceptionsRequest 请求对象
     * @return SyncInvoker<ListRemediationExceptionsRequest, ListRemediationExceptionsResponse>
     */
    public SyncInvoker<ListRemediationExceptionsRequest, ListRemediationExceptionsResponse> listRemediationExceptionsInvoker(
        ListRemediationExceptionsRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listRemediationExceptions, hcClient);
    }

    /**
     * 查询修正执行结果
     *
     * 查询合规规则修正执行结果详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRemediationExecutionStatusesRequest 请求对象
     * @return ListRemediationExecutionStatusesResponse
     */
    public ListRemediationExecutionStatusesResponse listRemediationExecutionStatuses(
        ListRemediationExecutionStatusesRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listRemediationExecutionStatuses);
    }

    /**
     * 查询修正执行结果
     *
     * 查询合规规则修正执行结果详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRemediationExecutionStatusesRequest 请求对象
     * @return SyncInvoker<ListRemediationExecutionStatusesRequest, ListRemediationExecutionStatusesResponse>
     */
    public SyncInvoker<ListRemediationExecutionStatusesRequest, ListRemediationExecutionStatusesResponse> listRemediationExecutionStatusesInvoker(
        ListRemediationExecutionStatusesRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listRemediationExecutionStatuses, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.runEvaluationByPolicyAssignmentId);
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
        return new SyncInvoker<>(request, ConfigMeta.runEvaluationByPolicyAssignmentId, hcClient);
    }

    /**
     * 运行修正执行
     *
     * 手动运行合规规则修正执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunRemediationExecutionRequest 请求对象
     * @return RunRemediationExecutionResponse
     */
    public RunRemediationExecutionResponse runRemediationExecution(RunRemediationExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.runRemediationExecution);
    }

    /**
     * 运行修正执行
     *
     * 手动运行合规规则修正执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunRemediationExecutionRequest 请求对象
     * @return SyncInvoker<RunRemediationExecutionRequest, RunRemediationExecutionResponse>
     */
    public SyncInvoker<RunRemediationExecutionRequest, RunRemediationExecutionResponse> runRemediationExecutionInvoker(
        RunRemediationExecutionRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.runRemediationExecution, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showBuiltInPolicyDefinition);
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
        return new SyncInvoker<>(request, ConfigMeta.showBuiltInPolicyDefinition, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showEvaluationStateByAssignmentId);
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
        return new SyncInvoker<>(request, ConfigMeta.showEvaluationStateByAssignmentId, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showOrganizationPolicyAssignment);
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
        return new SyncInvoker<>(request, ConfigMeta.showOrganizationPolicyAssignment, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showOrganizationPolicyAssignmentDetailedStatus);
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
        return new SyncInvoker<>(request, ConfigMeta.showOrganizationPolicyAssignmentDetailedStatus, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showOrganizationPolicyAssignmentStatuses);
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
        return new SyncInvoker<>(request, ConfigMeta.showOrganizationPolicyAssignmentStatuses, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showPolicyAssignment);
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
        return new SyncInvoker<>(request, ConfigMeta.showPolicyAssignment, hcClient);
    }

    /**
     * 查询修正配置
     *
     * 查询合规规则修正配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemediationConfigurationRequest 请求对象
     * @return ShowRemediationConfigurationResponse
     */
    public ShowRemediationConfigurationResponse showRemediationConfiguration(
        ShowRemediationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showRemediationConfiguration);
    }

    /**
     * 查询修正配置
     *
     * 查询合规规则修正配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemediationConfigurationRequest 请求对象
     * @return SyncInvoker<ShowRemediationConfigurationRequest, ShowRemediationConfigurationResponse>
     */
    public SyncInvoker<ShowRemediationConfigurationRequest, ShowRemediationConfigurationResponse> showRemediationConfigurationInvoker(
        ShowRemediationConfigurationRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.showRemediationConfiguration, hcClient);
    }

    /**
     * 更新组织合规规则
     *
     * 更新组织合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOrganizationPolicyAssignmentRequest 请求对象
     * @return UpdateOrganizationPolicyAssignmentResponse
     */
    public UpdateOrganizationPolicyAssignmentResponse updateOrganizationPolicyAssignment(
        UpdateOrganizationPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.updateOrganizationPolicyAssignment);
    }

    /**
     * 更新组织合规规则
     *
     * 更新组织合规规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOrganizationPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<UpdateOrganizationPolicyAssignmentRequest, UpdateOrganizationPolicyAssignmentResponse>
     */
    public SyncInvoker<UpdateOrganizationPolicyAssignmentRequest, UpdateOrganizationPolicyAssignmentResponse> updateOrganizationPolicyAssignmentInvoker(
        UpdateOrganizationPolicyAssignmentRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.updateOrganizationPolicyAssignment, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.updatePolicyAssignment);
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
        return new SyncInvoker<>(request, ConfigMeta.updatePolicyAssignment, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.updatePolicyState);
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
        return new SyncInvoker<>(request, ConfigMeta.updatePolicyState, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.createStoredQuery);
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
        return new SyncInvoker<>(request, ConfigMeta.createStoredQuery, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.deleteStoredQuery);
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
        return new SyncInvoker<>(request, ConfigMeta.deleteStoredQuery, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listSchemas);
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
        return new SyncInvoker<>(request, ConfigMeta.listSchemas, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listStoredQueries);
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
        return new SyncInvoker<>(request, ConfigMeta.listStoredQueries, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.runQuery);
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
        return new SyncInvoker<>(request, ConfigMeta.runQuery, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showStoredQuery);
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
        return new SyncInvoker<>(request, ConfigMeta.showStoredQuery, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.updateStoredQuery);
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
        return new SyncInvoker<>(request, ConfigMeta.updateStoredQuery, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listRegions);
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
        return new SyncInvoker<>(request, ConfigMeta.listRegions, hcClient);
    }

    /**
     * 列举资源关系
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为\&quot;in\&quot; 或者\&quot;out\&quot;。资源关系依赖开启资源记录器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsRequest 请求对象
     * @return ShowResourceRelationsResponse
     */
    public ShowResourceRelationsResponse showResourceRelations(ShowResourceRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showResourceRelations);
    }

    /**
     * 列举资源关系
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为\&quot;in\&quot; 或者\&quot;out\&quot;。资源关系依赖开启资源记录器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsRequest 请求对象
     * @return SyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse>
     */
    public SyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse> showResourceRelationsInvoker(
        ShowResourceRelationsRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.showResourceRelations, hcClient);
    }

    /**
     * 列举资源关系详情
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为“in”或者“out”，需要当帐号有rms:resources:getRelation权限。资源关系依赖开启资源记录器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsDetailRequest 请求对象
     * @return ShowResourceRelationsDetailResponse
     */
    public ShowResourceRelationsDetailResponse showResourceRelationsDetail(ShowResourceRelationsDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showResourceRelationsDetail);
    }

    /**
     * 列举资源关系详情
     *
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为“in”或者“out”，需要当帐号有rms:resources:getRelation权限。资源关系依赖开启资源记录器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceRelationsDetailRequest 请求对象
     * @return SyncInvoker<ShowResourceRelationsDetailRequest, ShowResourceRelationsDetailResponse>
     */
    public SyncInvoker<ShowResourceRelationsDetailRequest, ShowResourceRelationsDetailResponse> showResourceRelationsDetailInvoker(
        ShowResourceRelationsDetailRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.showResourceRelationsDetail, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.collectAllResourcesSummary);
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
        return new SyncInvoker<>(request, ConfigMeta.collectAllResourcesSummary, hcClient);
    }

    /**
     * 列举资源记录器收集的资源概要
     *
     * 查询当前用户资源记录器收集的资源概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectTrackedResourcesSummaryRequest 请求对象
     * @return CollectTrackedResourcesSummaryResponse
     */
    public CollectTrackedResourcesSummaryResponse collectTrackedResourcesSummary(
        CollectTrackedResourcesSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.collectTrackedResourcesSummary);
    }

    /**
     * 列举资源记录器收集的资源概要
     *
     * 查询当前用户资源记录器收集的资源概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectTrackedResourcesSummaryRequest 请求对象
     * @return SyncInvoker<CollectTrackedResourcesSummaryRequest, CollectTrackedResourcesSummaryResponse>
     */
    public SyncInvoker<CollectTrackedResourcesSummaryRequest, CollectTrackedResourcesSummaryResponse> collectTrackedResourcesSummaryInvoker(
        CollectTrackedResourcesSummaryRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.collectTrackedResourcesSummary, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.countAllResources);
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
        return new SyncInvoker<>(request, ConfigMeta.countAllResources, hcClient);
    }

    /**
     * 查询资源记录器收集的资源数量
     *
     * 查询当前用户资源记录器收集的资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountTrackedResourcesRequest 请求对象
     * @return CountTrackedResourcesResponse
     */
    public CountTrackedResourcesResponse countTrackedResources(CountTrackedResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.countTrackedResources);
    }

    /**
     * 查询资源记录器收集的资源数量
     *
     * 查询当前用户资源记录器收集的资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountTrackedResourcesRequest 请求对象
     * @return SyncInvoker<CountTrackedResourcesRequest, CountTrackedResourcesResponse>
     */
    public SyncInvoker<CountTrackedResourcesRequest, CountTrackedResourcesResponse> countTrackedResourcesInvoker(
        CountTrackedResourcesRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.countTrackedResources, hcClient);
    }

    /**
     * 列举所有已对接的云服务
     *
     * 查询所有已对接Config的云服务、资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllProvidersRequest 请求对象
     * @return ListAllProvidersResponse
     */
    public ListAllProvidersResponse listAllProviders(ListAllProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listAllProviders);
    }

    /**
     * 列举所有已对接的云服务
     *
     * 查询所有已对接Config的云服务、资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllProvidersRequest 请求对象
     * @return SyncInvoker<ListAllProvidersRequest, ListAllProvidersResponse>
     */
    public SyncInvoker<ListAllProvidersRequest, ListAllProvidersResponse> listAllProvidersInvoker(
        ListAllProvidersRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listAllProviders, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listAllResources);
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
        return new SyncInvoker<>(request, ConfigMeta.listAllResources, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.listAllTags);
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
        return new SyncInvoker<>(request, ConfigMeta.listAllTags, hcClient);
    }

    /**
     * 列举云服务
     *
     * 查询Config支持的云服务、资源、区域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvidersRequest 请求对象
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
     * @param request ListProvidersRequest 请求对象
     * @return SyncInvoker<ListProvidersRequest, ListProvidersResponse>
     */
    public SyncInvoker<ListProvidersRequest, ListProvidersResponse> listProvidersInvoker(ListProvidersRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listProviders, hcClient);
    }

    /**
     * 列举指定类型的资源
     *
     * 返回当前租户下特定资源类型的资源，需要当前用户有rms:resources:list权限。比如查询云服务器，对应的Config资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。 Config支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesRequest 请求对象
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
     * @param request ListResourcesRequest 请求对象
     * @return SyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public SyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesInvoker(ListResourcesRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listResources, hcClient);
    }

    /**
     * 列举资源记录器收集的资源标签
     *
     * 查询当前用户资源记录器收集的资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrackedResourceTagsRequest 请求对象
     * @return ListTrackedResourceTagsResponse
     */
    public ListTrackedResourceTagsResponse listTrackedResourceTags(ListTrackedResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listTrackedResourceTags);
    }

    /**
     * 列举资源记录器收集的资源标签
     *
     * 查询当前用户资源记录器收集的资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrackedResourceTagsRequest 请求对象
     * @return SyncInvoker<ListTrackedResourceTagsRequest, ListTrackedResourceTagsResponse>
     */
    public SyncInvoker<ListTrackedResourceTagsRequest, ListTrackedResourceTagsResponse> listTrackedResourceTagsInvoker(
        ListTrackedResourceTagsRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listTrackedResourceTags, hcClient);
    }

    /**
     * 列举资源记录器收集的全部资源
     *
     * 查询当前用户资源记录器收集的全部资源，需要当前用户有rms:resources:list权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrackedResourcesRequest 请求对象
     * @return ListTrackedResourcesResponse
     */
    public ListTrackedResourcesResponse listTrackedResources(ListTrackedResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listTrackedResources);
    }

    /**
     * 列举资源记录器收集的全部资源
     *
     * 查询当前用户资源记录器收集的全部资源，需要当前用户有rms:resources:list权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrackedResourcesRequest 请求对象
     * @return SyncInvoker<ListTrackedResourcesRequest, ListTrackedResourcesResponse>
     */
    public SyncInvoker<ListTrackedResourcesRequest, ListTrackedResourcesResponse> listTrackedResourcesInvoker(
        ListTrackedResourcesRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listTrackedResources, hcClient);
    }

    /**
     * 查询单个资源
     *
     * 指定资源ID，返回该资源的详细信息，需要当前用户有rms:resources:get权限。比如查询云服务器，对应的Config资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。Config支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceByIdRequest 请求对象
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
     * @param request ShowResourceByIdRequest 请求对象
     * @return SyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse>
     */
    public SyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse> showResourceByIdInvoker(
        ShowResourceByIdRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.showResourceById, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showResourceDetail);
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
        return new SyncInvoker<>(request, ConfigMeta.showResourceDetail, hcClient);
    }

    /**
     * 查询资源记录器收集的单个资源
     *
     * 查询当前用户资源记录器收集的单个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrackedResourceDetailRequest 请求对象
     * @return ShowTrackedResourceDetailResponse
     */
    public ShowTrackedResourceDetailResponse showTrackedResourceDetail(ShowTrackedResourceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.showTrackedResourceDetail);
    }

    /**
     * 查询资源记录器收集的单个资源
     *
     * 查询当前用户资源记录器收集的单个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrackedResourceDetailRequest 请求对象
     * @return SyncInvoker<ShowTrackedResourceDetailRequest, ShowTrackedResourceDetailResponse>
     */
    public SyncInvoker<ShowTrackedResourceDetailRequest, ShowTrackedResourceDetailResponse> showTrackedResourceDetailInvoker(
        ShowTrackedResourceDetailRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.showTrackedResourceDetail, hcClient);
    }

    /**
     * 查询资源实例数量
     *
     * 使用标签过滤实例，标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力。注意：tags, tags_any, not_tags, not_tags_any等字段支持的tag的数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesByTagRequest 请求对象
     * @return CountResourcesByTagResponse
     */
    public CountResourcesByTagResponse countResourcesByTag(CountResourcesByTagRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.countResourcesByTag);
    }

    /**
     * 查询资源实例数量
     *
     * 使用标签过滤实例，标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力。注意：tags, tags_any, not_tags, not_tags_any等字段支持的tag的数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesByTagRequest 请求对象
     * @return SyncInvoker<CountResourcesByTagRequest, CountResourcesByTagResponse>
     */
    public SyncInvoker<CountResourcesByTagRequest, CountResourcesByTagResponse> countResourcesByTagInvoker(
        CountResourcesByTagRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.countResourcesByTag, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 使用标签过滤实例，标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力。注意：tags, tags_any, not_tags, not_tags_any等字段支持的tag的数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesByTagRequest 请求对象
     * @return ListResourcesByTagResponse
     */
    public ListResourcesByTagResponse listResourcesByTag(ListResourcesByTagRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listResourcesByTag);
    }

    /**
     * 查询资源实例列表
     *
     * 使用标签过滤实例，标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力。注意：tags, tags_any, not_tags, not_tags_any等字段支持的tag的数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesByTagRequest 请求对象
     * @return SyncInvoker<ListResourcesByTagRequest, ListResourcesByTagResponse>
     */
    public SyncInvoker<ListResourcesByTagRequest, ListResourcesByTagResponse> listResourcesByTagInvoker(
        ListResourcesByTagRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listResourcesByTag, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。标签管理服务需要使用该接口查询指定实例的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsForResourceRequest 请求对象
     * @return ListTagsForResourceResponse
     */
    public ListTagsForResourceResponse listTagsForResource(ListTagsForResourceRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listTagsForResource);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。标签管理服务需要使用该接口查询指定实例的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsForResourceRequest 请求对象
     * @return SyncInvoker<ListTagsForResourceRequest, ListTagsForResourceResponse>
     */
    public SyncInvoker<ListTagsForResourceRequest, ListTagsForResourceResponse> listTagsForResourceInvoker(
        ListTagsForResourceRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listTagsForResource, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。标签管理服务需要能够列出当前租户全部已使用的资源标签集合，为各服务Console打资源标签和过滤实例时提供标签联想功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsForResourceTypeRequest 请求对象
     * @return ListTagsForResourceTypeResponse
     */
    public ListTagsForResourceTypeResponse listTagsForResourceType(ListTagsForResourceTypeRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.listTagsForResourceType);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。标签管理服务需要能够列出当前租户全部已使用的资源标签集合，为各服务Console打资源标签和过滤实例时提供标签联想功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsForResourceTypeRequest 请求对象
     * @return SyncInvoker<ListTagsForResourceTypeRequest, ListTagsForResourceTypeResponse>
     */
    public SyncInvoker<ListTagsForResourceTypeRequest, ListTagsForResourceTypeResponse> listTagsForResourceTypeInvoker(
        ListTagsForResourceTypeRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.listTagsForResourceType, hcClient);
    }

    /**
     * 批量添加资源标签
     *
     * 此接口为幂等接口。为指定实例批量添加或删除标签，标签管理服务需要使用该接口批量管理实例的标签。一个资源上最多有20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagResourceRequest 请求对象
     * @return TagResourceResponse
     */
    public TagResourceResponse tagResource(TagResourceRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.tagResource);
    }

    /**
     * 批量添加资源标签
     *
     * 此接口为幂等接口。为指定实例批量添加或删除标签，标签管理服务需要使用该接口批量管理实例的标签。一个资源上最多有20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagResourceRequest 请求对象
     * @return SyncInvoker<TagResourceRequest, TagResourceResponse>
     */
    public SyncInvoker<TagResourceRequest, TagResourceResponse> tagResourceInvoker(TagResourceRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.tagResource, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 此接口为幂等接口。为指定实例批量添加或删除标签，标签管理服务需要使用该接口批量管理实例的标签。一个资源上最多有20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnTagResourceRequest 请求对象
     * @return UnTagResourceResponse
     */
    public UnTagResourceResponse unTagResource(UnTagResourceRequest request) {
        return hcClient.syncInvokeHttp(request, ConfigMeta.unTagResource);
    }

    /**
     * 批量删除资源标签
     *
     * 此接口为幂等接口。为指定实例批量添加或删除标签，标签管理服务需要使用该接口批量管理实例的标签。一个资源上最多有20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnTagResourceRequest 请求对象
     * @return SyncInvoker<UnTagResourceRequest, UnTagResourceResponse>
     */
    public SyncInvoker<UnTagResourceRequest, UnTagResourceResponse> unTagResourceInvoker(UnTagResourceRequest request) {
        return new SyncInvoker<>(request, ConfigMeta.unTagResource, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.createTrackerConfig);
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
        return new SyncInvoker<>(request, ConfigMeta.createTrackerConfig, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.deleteTrackerConfig);
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
        return new SyncInvoker<>(request, ConfigMeta.deleteTrackerConfig, hcClient);
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
        return hcClient.syncInvokeHttp(request, ConfigMeta.showTrackerConfig);
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
        return new SyncInvoker<>(request, ConfigMeta.showTrackerConfig, hcClient);
    }

}
