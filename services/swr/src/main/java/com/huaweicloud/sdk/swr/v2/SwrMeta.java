package com.huaweicloud.sdk.swr.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.swr.v2.model.AddDomainNameRequest;
import com.huaweicloud.sdk.swr.v2.model.AddDomainNameRequestBody;
import com.huaweicloud.sdk.swr.v2.model.AddDomainNameResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateAuthorizationTokenRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateAuthorizationTokenResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateEndpointPolicyRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateImageSyncRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateImageSyncRepoRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateImageSyncRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateImmutableRuleBody;
import com.huaweicloud.sdk.swr.v2.model.CreateImmutableRuleRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateImmutableRuleResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceEndpointPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceEndpointPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceInternalEndpointRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceInternalEndpointResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceLtCredentialRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceLtCredentialResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceNamespaceRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceNamespaceRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceNamespaceResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceRegistryRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceRegistryResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceReplicationPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceReplicationPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceResourceTagsRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceResourceTagsResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceRetentionPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceRetentionPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceSignPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceSignPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceTempCredentialRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceTempCredentialResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceWebhookRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceWebhookResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateIntranetAccessRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateLongTermCredentialRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateManualImageSyncRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateManualImageSyncRepoRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateManualImageSyncRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateRegistryRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateReplicationExecutionRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateReplicationPolicyRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoDomainsRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoDomainsRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoTagRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoTagRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoTagResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateResourceTagsRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateRetentionPolicyRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateRetentionRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRetentionRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateRetentionResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateSecretRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateSecretResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateSignaturePolicyRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateSubResourceTagsRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateSubResourceTagsResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateTriggerRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateTriggerRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateTriggerResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateUserRepositoryAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateUserRepositoryAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateWebhookPolicyRequestBody;
import com.huaweicloud.sdk.swr.v2.model.DeleteDomainNameRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteDomainNameResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteImageSyncRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteImageSyncRepoRequestBody;
import com.huaweicloud.sdk.swr.v2.model.DeleteImageSyncRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteImmutableRuleRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteImmutableRuleResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceArtifactRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceArtifactResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceInternalEndpointRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceInternalEndpointResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceJobRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceJobResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceLtCredentialRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceLtCredentialResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceNamespaceRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceNamespaceResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceRegistryRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceRegistryResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceReplicationPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceReplicationPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceRepositoryRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceRepositoryResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceRequestBody;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceResourceTagsRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceResourceTagsResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceRetentionPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceRetentionPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceSignPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceSignPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceWebhookRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceWebhookResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteNamespaceAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteNamespaceAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteNamespacesRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteNamespacesResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoDomainsRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoTagRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoTagResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteResourceTagsRequestBody;
import com.huaweicloud.sdk.swr.v2.model.DeleteRetentionRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteRetentionResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteSubResourceTagsRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteSubResourceTagsResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteTriggerRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteTriggerResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteUserRepositoryAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteUserRepositoryAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.ExecuteInstanceReplicationPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.ExecuteInstanceReplicationPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.ExecuteInstanceRetentionPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.ExecuteInstanceRetentionPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.ExecuteInstanceSignPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.ExecuteInstanceSignPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.ExecuteRetentionPolicyRequestBody;
import com.huaweicloud.sdk.swr.v2.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListAuditLogsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListAuditLogsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListDomainNamesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListDomainNamesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListFeatureGatesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListFeatureGatesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListGlobalFeatureGatesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListGlobalFeatureGatesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListImageAutoSyncReposDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListImageAutoSyncReposDetailsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListImmutableRulesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListImmutableRulesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceAccessoriesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceAccessoriesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceAllArtifactsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceAllArtifactsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceArtifactsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceArtifactsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceInternalEndpointsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceInternalEndpointsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceJobsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceJobsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceLtCredentialsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceLtCredentialsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceNamespacesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceNamespacesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceProjectTagsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceProjectTagsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceRegistriesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceRegistriesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceReplicationPoliciesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceReplicationPoliciesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceReplicationPolicyExecSubTasksRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceReplicationPolicyExecSubTasksResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceReplicationPolicyExecTasksRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceReplicationPolicyExecTasksResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceReplicationPolicyExecutionsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceReplicationPolicyExecutionsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceRepositoriesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceRepositoriesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceResourceInstancesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceResourceInstancesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceResourceTagsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceResourceTagsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceRetentionPoliciesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceRetentionPoliciesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceRetentionPolicyExecSubTasksRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceRetentionPolicyExecSubTasksResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceRetentionPolicyExecTasksRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceRetentionPolicyExecTasksResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceRetentionPolicyExecutionsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceRetentionPolicyExecutionsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceSignPoliciesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceSignPoliciesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceSignPolicyExecTasksRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceSignPolicyExecTasksResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceSignPolicyExecutionsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceSignPolicyExecutionsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceSignatureExecutionSubtasksRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceSignatureExecutionSubtasksResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceStatisticsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceStatisticsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceWebhookJobsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceWebhookJobsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceWebhooksRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceWebhooksResponse;
import com.huaweicloud.sdk.swr.v2.model.ListNamespaceRepositoriesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListNamespaceRepositoriesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListNamespaceTagsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListNamespaceTagsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListNamespacesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListNamespacesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListQuotasRequest;
import com.huaweicloud.sdk.swr.v2.model.ListQuotasResponse;
import com.huaweicloud.sdk.swr.v2.model.ListRepoDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListRepoDetailsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListRepoDomainsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListReposDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListReposDetailsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListRepositoryTagRequest;
import com.huaweicloud.sdk.swr.v2.model.ListRepositoryTagResponse;
import com.huaweicloud.sdk.swr.v2.model.ListRepositoryTagsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListRepositoryTagsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListResourceInstancesRequestBody;
import com.huaweicloud.sdk.swr.v2.model.ListRetentionHistoriesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListRetentionHistoriesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListRetentionsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListRetentionsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListSharedRepoDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListSharedRepoDetailsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListSharedReposDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListSharedReposDetailsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListSubResourceInstancesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListSubResourceInstancesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListSubResourceTagsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListSubResourceTagsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListTriggersDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListTriggersDetailsResponse;
import com.huaweicloud.sdk.swr.v2.model.ReportData;
import com.huaweicloud.sdk.swr.v2.model.Retention;
import com.huaweicloud.sdk.swr.v2.model.ShowAccessDomainRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowAccessDomainResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowDomainOverviewRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowDomainOverviewResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowDomainResourceReportsRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowDomainResourceReportsResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceArtifactAdditionRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceArtifactAdditionResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceArtifactRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceArtifactResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceConfigurationRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceConfigurationResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceEndpointPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceEndpointPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceInternalEndpointRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceInternalEndpointResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceJobRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceJobResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceNamespaceRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceNamespaceResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceRegistryRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceRegistryResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceReplicationPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceReplicationPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceRepositoryRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceRepositoryResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceResourceInstancesCountRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceResourceInstancesCountResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceRetentionPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceRetentionPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceSignPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceSignPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceWebhookRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowInstanceWebhookResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowNamespaceAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowNamespaceAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowNamespaceRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowNamespaceResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowRepoTagRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowRepoTagResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowReposResp;
import com.huaweicloud.sdk.swr.v2.model.ShowReposTagResp;
import com.huaweicloud.sdk.swr.v2.model.ShowRepositoryRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowRepositoryResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowRetentionRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowRetentionResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowShareFeatureGatesRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowShareFeatureGatesResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowSubResourceInstancesCountRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowSubResourceInstancesCountResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowSyncJobRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowSyncJobResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowTriggerRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowTriggerResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowUserRepositoryAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowUserRepositoryAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.StopInstanceReplicationPolicyExecutionRequest;
import com.huaweicloud.sdk.swr.v2.model.StopInstanceReplicationPolicyExecutionResponse;
import com.huaweicloud.sdk.swr.v2.model.SyncJob;
import com.huaweicloud.sdk.swr.v2.model.SyncRepo;
import com.huaweicloud.sdk.swr.v2.model.Trigger;
import com.huaweicloud.sdk.swr.v2.model.UpdateDomainNameRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateDomainNameRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateDomainNameResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateImmutableRuleBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateImmutableRuleRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateImmutableRuleResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceConfigurationRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceConfigurationRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceConfigurationResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceEndpointPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceEndpointPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceLtCredentialRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceLtCredentialResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceNamespaceRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceNamespaceResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceRegistryRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceRegistryResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceReplicationPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceReplicationPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceRepositoryRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceRepositoryResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceRetentionPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceRetentionPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceSignPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceSignPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceWebhookRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceWebhookResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateLongTermCredentialRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateNamespaceAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateNamespaceAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateNamespaceRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateRegistryRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateReplicationPolicyRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoConfigRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoDomainsRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoDomainsRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateRetentionPolicyRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateRetentionRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateRetentionRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateRetentionResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateSignaturePolicyRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateTriggerRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateTriggerRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateTriggerResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateUserRepositoryAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateUserRepositoryAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateWebhookPolicyRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateWhiteListRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UserAuth;

import java.util.List;

@SuppressWarnings("unchecked")
public class SwrMeta {

    public static final HttpRequestDef<CreateAuthorizationTokenRequest, CreateAuthorizationTokenResponse> createAuthorizationToken =
        genForCreateAuthorizationToken();

    private static HttpRequestDef<CreateAuthorizationTokenRequest, CreateAuthorizationTokenResponse> genForCreateAuthorizationToken() {
        // basic
        HttpRequestDef.Builder<CreateAuthorizationTokenRequest, CreateAuthorizationTokenResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateAuthorizationTokenRequest.class, CreateAuthorizationTokenResponse.class)
                .withName("CreateAuthorizationToken")
                .withUri("/v2/manage/utils/authorizationtoken")
                .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("X-Swr-Dockerlogin",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAuthorizationTokenResponse::getXSwrDockerlogin,
                CreateAuthorizationTokenResponse::setXSwrDockerlogin));
        builder.<String>withResponseField("x-swr-expireat",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAuthorizationTokenResponse::getXSwrExpireat,
                CreateAuthorizationTokenResponse::setXSwrExpireat));
        return builder.build();
    }

    public static final HttpRequestDef<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse> createImageSyncRepo =
        genForCreateImageSyncRepo();

    private static HttpRequestDef<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse> genForCreateImageSyncRepo() {
        // basic
        HttpRequestDef.Builder<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateImageSyncRepoRequest.class, CreateImageSyncRepoResponse.class)
                .withName("CreateImageSyncRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_repo")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateImageSyncRepoRequest::getNamespace, CreateImageSyncRepoRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateImageSyncRepoRequest::getRepository,
                CreateImageSyncRepoRequest::setRepository));
        builder.<CreateImageSyncRepoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageSyncRepoRequestBody.class),
            f -> f.withMarshaller(CreateImageSyncRepoRequest::getBody, CreateImageSyncRepoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse> createManualImageSyncRepo =
        genForCreateManualImageSyncRepo();

    private static HttpRequestDef<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse> genForCreateManualImageSyncRepo() {
        // basic
        HttpRequestDef.Builder<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateManualImageSyncRepoRequest.class,
                    CreateManualImageSyncRepoResponse.class)
                .withName("CreateManualImageSyncRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateManualImageSyncRepoRequest::getNamespace,
                CreateManualImageSyncRepoRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateManualImageSyncRepoRequest::getRepository,
                CreateManualImageSyncRepoRequest::setRepository));
        builder.<CreateManualImageSyncRepoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateManualImageSyncRepoRequestBody.class),
            f -> f.withMarshaller(CreateManualImageSyncRepoRequest::getBody,
                CreateManualImageSyncRepoRequest::setBody));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(CreateManualImageSyncRepoResponse::getBody, CreateManualImageSyncRepoResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateNamespaceRequest, CreateNamespaceResponse> createNamespace =
        genForCreateNamespace();

    private static HttpRequestDef<CreateNamespaceRequest, CreateNamespaceResponse> genForCreateNamespace() {
        // basic
        HttpRequestDef.Builder<CreateNamespaceRequest, CreateNamespaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNamespaceRequest.class, CreateNamespaceResponse.class)
                .withName("CreateNamespace")
                .withUri("/v2/manage/namespaces")
                .withContentType("application/json");

        // requests
        builder.<CreateNamespaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNamespaceRequestBody.class),
            f -> f.withMarshaller(CreateNamespaceRequest::getBody, CreateNamespaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse> createNamespaceAuth =
        genForCreateNamespaceAuth();

    private static HttpRequestDef<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse> genForCreateNamespaceAuth() {
        // basic
        HttpRequestDef.Builder<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNamespaceAuthRequest.class, CreateNamespaceAuthResponse.class)
                .withName("CreateNamespaceAuth")
                .withUri("/v2/manage/namespaces/{namespace}/access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNamespaceAuthRequest::getNamespace, CreateNamespaceAuthRequest::setNamespace));
        builder.<List<UserAuth>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateNamespaceAuthRequest::getBody, CreateNamespaceAuthRequest::setBody)
                .withInnerContainerType(UserAuth.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRepoRequest, CreateRepoResponse> createRepo = genForCreateRepo();

    private static HttpRequestDef<CreateRepoRequest, CreateRepoResponse> genForCreateRepo() {
        // basic
        HttpRequestDef.Builder<CreateRepoRequest, CreateRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRepoRequest.class, CreateRepoResponse.class)
                .withName("CreateRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRepoRequest::getNamespace, CreateRepoRequest::setNamespace));
        builder.<CreateRepoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRepoRequestBody.class),
            f -> f.withMarshaller(CreateRepoRequest::getBody, CreateRepoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRepoDomainsRequest, CreateRepoDomainsResponse> createRepoDomains =
        genForCreateRepoDomains();

    private static HttpRequestDef<CreateRepoDomainsRequest, CreateRepoDomainsResponse> genForCreateRepoDomains() {
        // basic
        HttpRequestDef.Builder<CreateRepoDomainsRequest, CreateRepoDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRepoDomainsRequest.class, CreateRepoDomainsResponse.class)
                .withName("CreateRepoDomains")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRepoDomainsRequest::getNamespace, CreateRepoDomainsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRepoDomainsRequest::getRepository, CreateRepoDomainsRequest::setRepository));
        builder.<CreateRepoDomainsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRepoDomainsRequestBody.class),
            f -> f.withMarshaller(CreateRepoDomainsRequest::getBody, CreateRepoDomainsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRepoTagRequest, CreateRepoTagResponse> createRepoTag =
        genForCreateRepoTag();

    private static HttpRequestDef<CreateRepoTagRequest, CreateRepoTagResponse> genForCreateRepoTag() {
        // basic
        HttpRequestDef.Builder<CreateRepoTagRequest, CreateRepoTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRepoTagRequest.class, CreateRepoTagResponse.class)
                .withName("CreateRepoTag")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRepoTagRequest::getNamespace, CreateRepoTagRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRepoTagRequest::getRepository, CreateRepoTagRequest::setRepository));
        builder.<CreateRepoTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRepoTagRequestBody.class),
            f -> f.withMarshaller(CreateRepoTagRequest::getBody, CreateRepoTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRetentionRequest, CreateRetentionResponse> createRetention =
        genForCreateRetention();

    private static HttpRequestDef<CreateRetentionRequest, CreateRetentionResponse> genForCreateRetention() {
        // basic
        HttpRequestDef.Builder<CreateRetentionRequest, CreateRetentionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRetentionRequest.class, CreateRetentionResponse.class)
                .withName("CreateRetention")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRetentionRequest::getNamespace, CreateRetentionRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRetentionRequest::getRepository, CreateRetentionRequest::setRepository));
        builder.<CreateRetentionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRetentionRequestBody.class),
            f -> f.withMarshaller(CreateRetentionRequest::getBody, CreateRetentionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecretRequest, CreateSecretResponse> createSecret = genForCreateSecret();

    private static HttpRequestDef<CreateSecretRequest, CreateSecretResponse> genForCreateSecret() {
        // basic
        HttpRequestDef.Builder<CreateSecretRequest, CreateSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecretRequest.class, CreateSecretResponse.class)
                .withName("CreateSecret")
                .withUri("/v2/manage/utils/secret")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("projectname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecretRequest::getProjectname, CreateSecretRequest::setProjectname));

        // response

        builder.<String>withResponseField("X-Swr-Dockerlogin",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSecretResponse::getXSwrDockerlogin, CreateSecretResponse::setXSwrDockerlogin));
        return builder.build();
    }

    public static final HttpRequestDef<CreateTriggerRequest, CreateTriggerResponse> createTrigger =
        genForCreateTrigger();

    private static HttpRequestDef<CreateTriggerRequest, CreateTriggerResponse> genForCreateTrigger() {
        // basic
        HttpRequestDef.Builder<CreateTriggerRequest, CreateTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTriggerRequest.class, CreateTriggerResponse.class)
                .withName("CreateTrigger")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTriggerRequest::getNamespace, CreateTriggerRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTriggerRequest::getRepository, CreateTriggerRequest::setRepository));
        builder.<CreateTriggerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTriggerRequestBody.class),
            f -> f.withMarshaller(CreateTriggerRequest::getBody, CreateTriggerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse> createUserRepositoryAuth =
        genForCreateUserRepositoryAuth();

    private static HttpRequestDef<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse> genForCreateUserRepositoryAuth() {
        // basic
        HttpRequestDef.Builder<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateUserRepositoryAuthRequest.class, CreateUserRepositoryAuthResponse.class)
                .withName("CreateUserRepositoryAuth")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUserRepositoryAuthRequest::getNamespace,
                CreateUserRepositoryAuthRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUserRepositoryAuthRequest::getRepository,
                CreateUserRepositoryAuthRequest::setRepository));
        builder.<List<UserAuth>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateUserRepositoryAuthRequest::getBody, CreateUserRepositoryAuthRequest::setBody)
                .withInnerContainerType(UserAuth.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse> deleteImageSyncRepo =
        genForDeleteImageSyncRepo();

    private static HttpRequestDef<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse> genForDeleteImageSyncRepo() {
        // basic
        HttpRequestDef.Builder<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteImageSyncRepoRequest.class, DeleteImageSyncRepoResponse.class)
            .withName("DeleteImageSyncRepo")
            .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_repo")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageSyncRepoRequest::getNamespace, DeleteImageSyncRepoRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageSyncRepoRequest::getRepository,
                DeleteImageSyncRepoRequest::setRepository));
        builder.<DeleteImageSyncRepoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteImageSyncRepoRequestBody.class),
            f -> f.withMarshaller(DeleteImageSyncRepoRequest::getBody, DeleteImageSyncRepoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse> deleteNamespaceAuth =
        genForDeleteNamespaceAuth();

    private static HttpRequestDef<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse> genForDeleteNamespaceAuth() {
        // basic
        HttpRequestDef.Builder<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteNamespaceAuthRequest.class, DeleteNamespaceAuthResponse.class)
            .withName("DeleteNamespaceAuth")
            .withUri("/v2/manage/namespaces/{namespace}/access")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNamespaceAuthRequest::getNamespace, DeleteNamespaceAuthRequest::setNamespace));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteNamespaceAuthRequest::getBody, DeleteNamespaceAuthRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNamespacesRequest, DeleteNamespacesResponse> deleteNamespaces =
        genForDeleteNamespaces();

    private static HttpRequestDef<DeleteNamespacesRequest, DeleteNamespacesResponse> genForDeleteNamespaces() {
        // basic
        HttpRequestDef.Builder<DeleteNamespacesRequest, DeleteNamespacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNamespacesRequest.class, DeleteNamespacesResponse.class)
                .withName("DeleteNamespaces")
                .withUri("/v2/manage/namespaces/{namespace}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNamespacesRequest::getNamespace, DeleteNamespacesRequest::setNamespace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepoRequest, DeleteRepoResponse> deleteRepo = genForDeleteRepo();

    private static HttpRequestDef<DeleteRepoRequest, DeleteRepoResponse> genForDeleteRepo() {
        // basic
        HttpRequestDef.Builder<DeleteRepoRequest, DeleteRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRepoRequest.class, DeleteRepoResponse.class)
                .withName("DeleteRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoRequest::getNamespace, DeleteRepoRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoRequest::getRepository, DeleteRepoRequest::setRepository));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse> deleteRepoDomains =
        genForDeleteRepoDomains();

    private static HttpRequestDef<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse> genForDeleteRepoDomains() {
        // basic
        HttpRequestDef.Builder<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRepoDomainsRequest.class, DeleteRepoDomainsResponse.class)
                .withName("DeleteRepoDomains")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains/{access_domain}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoDomainsRequest::getNamespace, DeleteRepoDomainsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoDomainsRequest::getRepository, DeleteRepoDomainsRequest::setRepository));
        builder.<String>withRequestField("access_domain",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoDomainsRequest::getAccessDomain,
                DeleteRepoDomainsRequest::setAccessDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepoTagRequest, DeleteRepoTagResponse> deleteRepoTag =
        genForDeleteRepoTag();

    private static HttpRequestDef<DeleteRepoTagRequest, DeleteRepoTagResponse> genForDeleteRepoTag() {
        // basic
        HttpRequestDef.Builder<DeleteRepoTagRequest, DeleteRepoTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRepoTagRequest.class, DeleteRepoTagResponse.class)
                .withName("DeleteRepoTag")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/tags/{tag}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoTagRequest::getNamespace, DeleteRepoTagRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoTagRequest::getRepository, DeleteRepoTagRequest::setRepository));
        builder.<String>withRequestField("tag",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoTagRequest::getTag, DeleteRepoTagRequest::setTag));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRetentionRequest, DeleteRetentionResponse> deleteRetention =
        genForDeleteRetention();

    private static HttpRequestDef<DeleteRetentionRequest, DeleteRetentionResponse> genForDeleteRetention() {
        // basic
        HttpRequestDef.Builder<DeleteRetentionRequest, DeleteRetentionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRetentionRequest.class, DeleteRetentionResponse.class)
                .withName("DeleteRetention")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions/{retention_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRetentionRequest::getNamespace, DeleteRetentionRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRetentionRequest::getRepository, DeleteRetentionRequest::setRepository));
        builder.<Integer>withRequestField("retention_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteRetentionRequest::getRetentionId, DeleteRetentionRequest::setRetentionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTriggerRequest, DeleteTriggerResponse> deleteTrigger =
        genForDeleteTrigger();

    private static HttpRequestDef<DeleteTriggerRequest, DeleteTriggerResponse> genForDeleteTrigger() {
        // basic
        HttpRequestDef.Builder<DeleteTriggerRequest, DeleteTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTriggerRequest.class, DeleteTriggerResponse.class)
                .withName("DeleteTrigger")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers/{trigger}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTriggerRequest::getNamespace, DeleteTriggerRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTriggerRequest::getRepository, DeleteTriggerRequest::setRepository));
        builder.<String>withRequestField("trigger",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTriggerRequest::getTrigger, DeleteTriggerRequest::setTrigger));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse> deleteUserRepositoryAuth =
        genForDeleteUserRepositoryAuth();

    private static HttpRequestDef<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse> genForDeleteUserRepositoryAuth() {
        // basic
        HttpRequestDef.Builder<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteUserRepositoryAuthRequest.class,
                    DeleteUserRepositoryAuthResponse.class)
                .withName("DeleteUserRepositoryAuth")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRepositoryAuthRequest::getNamespace,
                DeleteUserRepositoryAuthRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRepositoryAuthRequest::getRepository,
                DeleteUserRepositoryAuthRequest::setRepository));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteUserRepositoryAuthRequest::getBody, DeleteUserRepositoryAuthRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse> listImageAutoSyncReposDetails =
        genForListImageAutoSyncReposDetails();

    private static HttpRequestDef<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse> genForListImageAutoSyncReposDetails() {
        // basic
        HttpRequestDef.Builder<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListImageAutoSyncReposDetailsRequest.class,
                    ListImageAutoSyncReposDetailsResponse.class)
                .withName("ListImageAutoSyncReposDetails")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_repo")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageAutoSyncReposDetailsRequest::getNamespace,
                ListImageAutoSyncReposDetailsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageAutoSyncReposDetailsRequest::getRepository,
                ListImageAutoSyncReposDetailsRequest::setRepository));

        // response
        builder.<List<SyncRepo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListImageAutoSyncReposDetailsResponse::getBody,
                    ListImageAutoSyncReposDetailsResponse::setBody)
                .withInnerContainerType(SyncRepo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListNamespacesRequest, ListNamespacesResponse> listNamespaces =
        genForListNamespaces();

    private static HttpRequestDef<ListNamespacesRequest, ListNamespacesResponse> genForListNamespaces() {
        // basic
        HttpRequestDef.Builder<ListNamespacesRequest, ListNamespacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNamespacesRequest.class, ListNamespacesResponse.class)
                .withName("ListNamespaces")
                .withUri("/v2/manage/namespaces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNamespacesRequest::getNamespace, ListNamespacesRequest::setNamespace));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNamespacesRequest::getFilter, ListNamespacesRequest::setFilter));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForListQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForListQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v2/manage/projects/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRepoDetailsRequest, ListRepoDetailsResponse> listRepoDetails =
        genForListRepoDetails();

    private static HttpRequestDef<ListRepoDetailsRequest, ListRepoDetailsResponse> genForListRepoDetails() {
        // basic
        HttpRequestDef.Builder<ListRepoDetailsRequest, ListRepoDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRepoDetailsRequest.class, ListRepoDetailsResponse.class)
                .withName("ListRepoDetails")
                .withUri("/v3/manage/repos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepoDetailsRequest::getNamespace, ListRepoDetailsRequest::setNamespace));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepoDetailsRequest::getName, ListRepoDetailsRequest::setName));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepoDetailsRequest::getCategory, ListRepoDetailsRequest::setCategory));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepoDetailsRequest::getLimit, ListRepoDetailsRequest::setLimit));
        builder.<Integer>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepoDetailsRequest::getMarker, ListRepoDetailsRequest::setMarker));
        builder.<Boolean>withRequestField("is_public",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRepoDetailsRequest::getIsPublic, ListRepoDetailsRequest::setIsPublic));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRepoDomainsRequest, ListRepoDomainsResponse> listRepoDomains =
        genForListRepoDomains();

    private static HttpRequestDef<ListRepoDomainsRequest, ListRepoDomainsResponse> genForListRepoDomains() {
        // basic
        HttpRequestDef.Builder<ListRepoDomainsRequest, ListRepoDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRepoDomainsRequest.class, ListRepoDomainsResponse.class)
                .withName("ListRepoDomains")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepoDomainsRequest::getNamespace, ListRepoDomainsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepoDomainsRequest::getRepository, ListRepoDomainsRequest::setRepository));

        // response
        builder.<List<ShowRepoDomainsResponse>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRepoDomainsResponse::getBody, ListRepoDomainsResponse::setBody)
                .withInnerContainerType(ShowRepoDomainsResponse.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListReposDetailsRequest, ListReposDetailsResponse> listReposDetails =
        genForListReposDetails();

    private static HttpRequestDef<ListReposDetailsRequest, ListReposDetailsResponse> genForListReposDetails() {
        // basic
        HttpRequestDef.Builder<ListReposDetailsRequest, ListReposDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReposDetailsRequest.class, ListReposDetailsResponse.class)
                .withName("ListReposDetails")
                .withUri("/v2/manage/repos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getNamespace, ListReposDetailsRequest::setNamespace));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getName, ListReposDetailsRequest::setName));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getCategory, ListReposDetailsRequest::setCategory));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getLimit, ListReposDetailsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getOffset, ListReposDetailsRequest::setOffset));
        builder.<String>withRequestField("order_column",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getOrderColumn, ListReposDetailsRequest::setOrderColumn));
        builder.<String>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getOrderType, ListReposDetailsRequest::setOrderType));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getFilter, ListReposDetailsRequest::setFilter));

        // response
        builder.<List<ShowReposResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListReposDetailsResponse::getBody, ListReposDetailsResponse::setBody)
                .withInnerContainerType(ShowReposResp.class));

        builder.<String>withResponseField("Content-Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListReposDetailsResponse::getContentRange,
                ListReposDetailsResponse::setContentRange));
        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryTagRequest, ListRepositoryTagResponse> listRepositoryTag =
        genForListRepositoryTag();

    private static HttpRequestDef<ListRepositoryTagRequest, ListRepositoryTagResponse> genForListRepositoryTag() {
        // basic
        HttpRequestDef.Builder<ListRepositoryTagRequest, ListRepositoryTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRepositoryTagRequest.class, ListRepositoryTagResponse.class)
                .withName("ListRepositoryTag")
                .withUri("/v3/manage/namespaces/{namespace}/repos/{repository}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagRequest::getNamespace, ListRepositoryTagRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagRequest::getRepository, ListRepositoryTagRequest::setRepository));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepositoryTagRequest::getLimit, ListRepositoryTagRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagRequest::getMarker, ListRepositoryTagRequest::setMarker));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagRequest::getTag, ListRepositoryTagRequest::setTag));
        builder.<Boolean>withRequestField("with_manifest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRepositoryTagRequest::getWithManifest,
                ListRepositoryTagRequest::setWithManifest));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryTagsRequest, ListRepositoryTagsResponse> listRepositoryTags =
        genForListRepositoryTags();

    private static HttpRequestDef<ListRepositoryTagsRequest, ListRepositoryTagsResponse> genForListRepositoryTags() {
        // basic
        HttpRequestDef.Builder<ListRepositoryTagsRequest, ListRepositoryTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRepositoryTagsRequest.class, ListRepositoryTagsResponse.class)
                .withName("ListRepositoryTags")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getNamespace, ListRepositoryTagsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getRepository, ListRepositoryTagsRequest::setRepository));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getLimit, ListRepositoryTagsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getOffset, ListRepositoryTagsRequest::setOffset));
        builder.<String>withRequestField("order_column",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getOrderColumn,
                ListRepositoryTagsRequest::setOrderColumn));
        builder.<String>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getOrderType, ListRepositoryTagsRequest::setOrderType));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getTag, ListRepositoryTagsRequest::setTag));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getFilter, ListRepositoryTagsRequest::setFilter));

        // response
        builder.<List<ShowReposTagResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRepositoryTagsResponse::getBody, ListRepositoryTagsResponse::setBody)
                .withInnerContainerType(ShowReposTagResp.class));

        builder.<String>withResponseField("Content-Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryTagsResponse::getContentRange,
                ListRepositoryTagsResponse::setContentRange));
        return builder.build();
    }

    public static final HttpRequestDef<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse> listRetentionHistories =
        genForListRetentionHistories();

    private static HttpRequestDef<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse> genForListRetentionHistories() {
        // basic
        HttpRequestDef.Builder<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRetentionHistoriesRequest.class, ListRetentionHistoriesResponse.class)
            .withName("ListRetentionHistories")
            .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions/histories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetentionHistoriesRequest::getNamespace,
                ListRetentionHistoriesRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetentionHistoriesRequest::getRepository,
                ListRetentionHistoriesRequest::setRepository));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetentionHistoriesRequest::getLimit, ListRetentionHistoriesRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetentionHistoriesRequest::getOffset, ListRetentionHistoriesRequest::setOffset));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetentionHistoriesRequest::getFilter, ListRetentionHistoriesRequest::setFilter));

        // response

        builder.<String>withResponseField("Content-Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRetentionHistoriesResponse::getContentRange,
                ListRetentionHistoriesResponse::setContentRange));
        return builder.build();
    }

    public static final HttpRequestDef<ListRetentionsRequest, ListRetentionsResponse> listRetentions =
        genForListRetentions();

    private static HttpRequestDef<ListRetentionsRequest, ListRetentionsResponse> genForListRetentions() {
        // basic
        HttpRequestDef.Builder<ListRetentionsRequest, ListRetentionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRetentionsRequest.class, ListRetentionsResponse.class)
                .withName("ListRetentions")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetentionsRequest::getNamespace, ListRetentionsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetentionsRequest::getRepository, ListRetentionsRequest::setRepository));

        // response
        builder.<List<Retention>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRetentionsResponse::getBody, ListRetentionsResponse::setBody)
                .withInnerContainerType(Retention.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListSharedRepoDetailsRequest, ListSharedRepoDetailsResponse> listSharedRepoDetails =
        genForListSharedRepoDetails();

    private static HttpRequestDef<ListSharedRepoDetailsRequest, ListSharedRepoDetailsResponse> genForListSharedRepoDetails() {
        // basic
        HttpRequestDef.Builder<ListSharedRepoDetailsRequest, ListSharedRepoDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSharedRepoDetailsRequest.class, ListSharedRepoDetailsResponse.class)
            .withName("ListSharedRepoDetails")
            .withUri("/v3/manage/shared-repositories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedRepoDetailsRequest::getNamespace,
                ListSharedRepoDetailsRequest::setNamespace));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedRepoDetailsRequest::getName, ListSharedRepoDetailsRequest::setName));
        builder.<ListSharedRepoDetailsRequest.SharedByEnum>withRequestField("shared_by",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSharedRepoDetailsRequest.SharedByEnum.class),
            f -> f.withMarshaller(ListSharedRepoDetailsRequest::getSharedBy,
                ListSharedRepoDetailsRequest::setSharedBy));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSharedRepoDetailsRequest::getLimit, ListSharedRepoDetailsRequest::setLimit));
        builder.<Long>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSharedRepoDetailsRequest::getMarker, ListSharedRepoDetailsRequest::setMarker));
        builder.<Boolean>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSharedRepoDetailsRequest::getStatus, ListSharedRepoDetailsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse> listSharedReposDetails =
        genForListSharedReposDetails();

    private static HttpRequestDef<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse> genForListSharedReposDetails() {
        // basic
        HttpRequestDef.Builder<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSharedReposDetailsRequest.class, ListSharedReposDetailsResponse.class)
            .withName("ListSharedReposDetails")
            .withUri("/v2/manage/shared-repositories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getNamespace,
                ListSharedReposDetailsRequest::setNamespace));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getName, ListSharedReposDetailsRequest::setName));
        builder.<String>withRequestField("center",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getCenter, ListSharedReposDetailsRequest::setCenter));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getLimit, ListSharedReposDetailsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getOffset, ListSharedReposDetailsRequest::setOffset));
        builder.<String>withRequestField("order_column",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getOrderColumn,
                ListSharedReposDetailsRequest::setOrderColumn));
        builder.<String>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getOrderType,
                ListSharedReposDetailsRequest::setOrderType));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getFilter, ListSharedReposDetailsRequest::setFilter));

        // response
        builder.<List<ShowReposResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSharedReposDetailsResponse::getBody, ListSharedReposDetailsResponse::setBody)
                .withInnerContainerType(ShowReposResp.class));

        builder.<String>withResponseField("Content-Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSharedReposDetailsResponse::getContentRange,
                ListSharedReposDetailsResponse::setContentRange));
        return builder.build();
    }

    public static final HttpRequestDef<ListTriggersDetailsRequest, ListTriggersDetailsResponse> listTriggersDetails =
        genForListTriggersDetails();

    private static HttpRequestDef<ListTriggersDetailsRequest, ListTriggersDetailsResponse> genForListTriggersDetails() {
        // basic
        HttpRequestDef.Builder<ListTriggersDetailsRequest, ListTriggersDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTriggersDetailsRequest.class, ListTriggersDetailsResponse.class)
                .withName("ListTriggersDetails")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTriggersDetailsRequest::getNamespace, ListTriggersDetailsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTriggersDetailsRequest::getRepository,
                ListTriggersDetailsRequest::setRepository));

        // response
        builder.<List<Trigger>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTriggersDetailsResponse::getBody, ListTriggersDetailsResponse::setBody)
                .withInnerContainerType(Trigger.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccessDomainRequest, ShowAccessDomainResponse> showAccessDomain =
        genForShowAccessDomain();

    private static HttpRequestDef<ShowAccessDomainRequest, ShowAccessDomainResponse> genForShowAccessDomain() {
        // basic
        HttpRequestDef.Builder<ShowAccessDomainRequest, ShowAccessDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAccessDomainRequest.class, ShowAccessDomainResponse.class)
                .withName("ShowAccessDomain")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains/{access_domain}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessDomainRequest::getNamespace, ShowAccessDomainRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessDomainRequest::getRepository, ShowAccessDomainRequest::setRepository));
        builder.<String>withRequestField("access_domain",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessDomainRequest::getAccessDomain, ShowAccessDomainRequest::setAccessDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainOverviewRequest, ShowDomainOverviewResponse> showDomainOverview =
        genForShowDomainOverview();

    private static HttpRequestDef<ShowDomainOverviewRequest, ShowDomainOverviewResponse> genForShowDomainOverview() {
        // basic
        HttpRequestDef.Builder<ShowDomainOverviewRequest, ShowDomainOverviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainOverviewRequest.class, ShowDomainOverviewResponse.class)
                .withName("ShowDomainOverview")
                .withUri("/v2/manage/overview")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainResourceReportsRequest, ShowDomainResourceReportsResponse> showDomainResourceReports =
        genForShowDomainResourceReports();

    private static HttpRequestDef<ShowDomainResourceReportsRequest, ShowDomainResourceReportsResponse> genForShowDomainResourceReports() {
        // basic
        HttpRequestDef.Builder<ShowDomainResourceReportsRequest, ShowDomainResourceReportsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDomainResourceReportsRequest.class,
                    ShowDomainResourceReportsResponse.class)
                .withName("ShowDomainResourceReports")
                .withUri("/v2/manage/reports/{resource_type}/{frequency}")
                .withContentType("application/json");

        // requests
        builder.<ShowDomainResourceReportsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDomainResourceReportsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowDomainResourceReportsRequest::getResourceType,
                ShowDomainResourceReportsRequest::setResourceType));
        builder.<ShowDomainResourceReportsRequest.FrequencyEnum>withRequestField("frequency",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDomainResourceReportsRequest.FrequencyEnum.class),
            f -> f.withMarshaller(ShowDomainResourceReportsRequest::getFrequency,
                ShowDomainResourceReportsRequest::setFrequency));

        // response
        builder.<List<ReportData>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowDomainResourceReportsResponse::getBody, ShowDomainResourceReportsResponse::setBody)
                .withInnerContainerType(ReportData.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowNamespaceRequest, ShowNamespaceResponse> showNamespace =
        genForShowNamespace();

    private static HttpRequestDef<ShowNamespaceRequest, ShowNamespaceResponse> genForShowNamespace() {
        // basic
        HttpRequestDef.Builder<ShowNamespaceRequest, ShowNamespaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNamespaceRequest.class, ShowNamespaceResponse.class)
                .withName("ShowNamespace")
                .withUri("/v2/manage/namespaces/{namespace}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNamespaceRequest::getNamespace, ShowNamespaceRequest::setNamespace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse> showNamespaceAuth =
        genForShowNamespaceAuth();

    private static HttpRequestDef<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse> genForShowNamespaceAuth() {
        // basic
        HttpRequestDef.Builder<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNamespaceAuthRequest.class, ShowNamespaceAuthResponse.class)
                .withName("ShowNamespaceAuth")
                .withUri("/v2/manage/namespaces/{namespace}/access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNamespaceAuthRequest::getNamespace, ShowNamespaceAuthRequest::setNamespace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepoTagRequest, ShowRepoTagResponse> showRepoTag = genForShowRepoTag();

    private static HttpRequestDef<ShowRepoTagRequest, ShowRepoTagResponse> genForShowRepoTag() {
        // basic
        HttpRequestDef.Builder<ShowRepoTagRequest, ShowRepoTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRepoTagRequest.class, ShowRepoTagResponse.class)
                .withName("ShowRepoTag")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/tags/{tag}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepoTagRequest::getNamespace, ShowRepoTagRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepoTagRequest::getRepository, ShowRepoTagRequest::setRepository));
        builder.<String>withRequestField("tag",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepoTagRequest::getTag, ShowRepoTagRequest::setTag));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryRequest, ShowRepositoryResponse> showRepository =
        genForShowRepository();

    private static HttpRequestDef<ShowRepositoryRequest, ShowRepositoryResponse> genForShowRepository() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryRequest, ShowRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRepositoryRequest.class, ShowRepositoryResponse.class)
                .withName("ShowRepository")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryRequest::getNamespace, ShowRepositoryRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryRequest::getRepository, ShowRepositoryRequest::setRepository));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRetentionRequest, ShowRetentionResponse> showRetention =
        genForShowRetention();

    private static HttpRequestDef<ShowRetentionRequest, ShowRetentionResponse> genForShowRetention() {
        // basic
        HttpRequestDef.Builder<ShowRetentionRequest, ShowRetentionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRetentionRequest.class, ShowRetentionResponse.class)
                .withName("ShowRetention")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions/{retention_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRetentionRequest::getNamespace, ShowRetentionRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRetentionRequest::getRepository, ShowRetentionRequest::setRepository));
        builder.<Integer>withRequestField("retention_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRetentionRequest::getRetentionId, ShowRetentionRequest::setRetentionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowShareFeatureGatesRequest, ShowShareFeatureGatesResponse> showShareFeatureGates =
        genForShowShareFeatureGates();

    private static HttpRequestDef<ShowShareFeatureGatesRequest, ShowShareFeatureGatesResponse> genForShowShareFeatureGates() {
        // basic
        HttpRequestDef.Builder<ShowShareFeatureGatesRequest, ShowShareFeatureGatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowShareFeatureGatesRequest.class, ShowShareFeatureGatesResponse.class)
            .withName("ShowShareFeatureGates")
            .withUri("/v2/manage/projects/{project_id}/feature-gates")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSyncJobRequest, ShowSyncJobResponse> showSyncJob = genForShowSyncJob();

    private static HttpRequestDef<ShowSyncJobRequest, ShowSyncJobResponse> genForShowSyncJob() {
        // basic
        HttpRequestDef.Builder<ShowSyncJobRequest, ShowSyncJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSyncJobRequest.class, ShowSyncJobResponse.class)
                .withName("ShowSyncJob")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_job")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSyncJobRequest::getNamespace, ShowSyncJobRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSyncJobRequest::getRepository, ShowSyncJobRequest::setRepository));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSyncJobRequest::getFilter, ShowSyncJobRequest::setFilter));

        // response
        builder.<List<SyncJob>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowSyncJobResponse::getBody, ShowSyncJobResponse::setBody)
                .withInnerContainerType(SyncJob.class));

        builder.<String>withResponseField("Content-Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSyncJobResponse::getContentRange, ShowSyncJobResponse::setContentRange));
        return builder.build();
    }

    public static final HttpRequestDef<ShowTriggerRequest, ShowTriggerResponse> showTrigger = genForShowTrigger();

    private static HttpRequestDef<ShowTriggerRequest, ShowTriggerResponse> genForShowTrigger() {
        // basic
        HttpRequestDef.Builder<ShowTriggerRequest, ShowTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTriggerRequest.class, ShowTriggerResponse.class)
                .withName("ShowTrigger")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers/{trigger}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTriggerRequest::getNamespace, ShowTriggerRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTriggerRequest::getRepository, ShowTriggerRequest::setRepository));
        builder.<String>withRequestField("trigger",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTriggerRequest::getTrigger, ShowTriggerRequest::setTrigger));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse> showUserRepositoryAuth =
        genForShowUserRepositoryAuth();

    private static HttpRequestDef<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse> genForShowUserRepositoryAuth() {
        // basic
        HttpRequestDef.Builder<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowUserRepositoryAuthRequest.class, ShowUserRepositoryAuthResponse.class)
            .withName("ShowUserRepositoryAuth")
            .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/access")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserRepositoryAuthRequest::getNamespace,
                ShowUserRepositoryAuthRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserRepositoryAuthRequest::getRepository,
                ShowUserRepositoryAuthRequest::setRepository));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse> updateNamespaceAuth =
        genForUpdateNamespaceAuth();

    private static HttpRequestDef<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse> genForUpdateNamespaceAuth() {
        // basic
        HttpRequestDef.Builder<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, UpdateNamespaceAuthRequest.class, UpdateNamespaceAuthResponse.class)
            .withName("UpdateNamespaceAuth")
            .withUri("/v2/manage/namespaces/{namespace}/access")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNamespaceAuthRequest::getNamespace, UpdateNamespaceAuthRequest::setNamespace));
        builder.<List<UserAuth>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateNamespaceAuthRequest::getBody, UpdateNamespaceAuthRequest::setBody)
                .withInnerContainerType(UserAuth.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepoRequest, UpdateRepoResponse> updateRepo = genForUpdateRepo();

    private static HttpRequestDef<UpdateRepoRequest, UpdateRepoResponse> genForUpdateRepo() {
        // basic
        HttpRequestDef.Builder<UpdateRepoRequest, UpdateRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateRepoRequest.class, UpdateRepoResponse.class)
                .withName("UpdateRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRepoRequest::getNamespace, UpdateRepoRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRepoRequest::getRepository, UpdateRepoRequest::setRepository));
        builder.<UpdateRepoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRepoRequestBody.class),
            f -> f.withMarshaller(UpdateRepoRequest::getBody, UpdateRepoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse> updateRepoDomains =
        genForUpdateRepoDomains();

    private static HttpRequestDef<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse> genForUpdateRepoDomains() {
        // basic
        HttpRequestDef.Builder<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateRepoDomainsRequest.class, UpdateRepoDomainsResponse.class)
                .withName("UpdateRepoDomains")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains/{access_domain}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRepoDomainsRequest::getNamespace, UpdateRepoDomainsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRepoDomainsRequest::getRepository, UpdateRepoDomainsRequest::setRepository));
        builder.<String>withRequestField("access_domain",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRepoDomainsRequest::getAccessDomain,
                UpdateRepoDomainsRequest::setAccessDomain));
        builder.<UpdateRepoDomainsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRepoDomainsRequestBody.class),
            f -> f.withMarshaller(UpdateRepoDomainsRequest::getBody, UpdateRepoDomainsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRetentionRequest, UpdateRetentionResponse> updateRetention =
        genForUpdateRetention();

    private static HttpRequestDef<UpdateRetentionRequest, UpdateRetentionResponse> genForUpdateRetention() {
        // basic
        HttpRequestDef.Builder<UpdateRetentionRequest, UpdateRetentionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateRetentionRequest.class, UpdateRetentionResponse.class)
                .withName("UpdateRetention")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions/{retention_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRetentionRequest::getNamespace, UpdateRetentionRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRetentionRequest::getRepository, UpdateRetentionRequest::setRepository));
        builder.<Integer>withRequestField("retention_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRetentionRequest::getRetentionId, UpdateRetentionRequest::setRetentionId));
        builder.<UpdateRetentionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateRetentionRequestBody.class),
            f -> f.withMarshaller(UpdateRetentionRequest::getBody, UpdateRetentionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTriggerRequest, UpdateTriggerResponse> updateTrigger =
        genForUpdateTrigger();

    private static HttpRequestDef<UpdateTriggerRequest, UpdateTriggerResponse> genForUpdateTrigger() {
        // basic
        HttpRequestDef.Builder<UpdateTriggerRequest, UpdateTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateTriggerRequest.class, UpdateTriggerResponse.class)
                .withName("UpdateTrigger")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers/{trigger}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getNamespace, UpdateTriggerRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getRepository, UpdateTriggerRequest::setRepository));
        builder.<String>withRequestField("trigger",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getTrigger, UpdateTriggerRequest::setTrigger));
        builder.<UpdateTriggerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTriggerRequestBody.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getBody, UpdateTriggerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse> updateUserRepositoryAuth =
        genForUpdateUserRepositoryAuth();

    private static HttpRequestDef<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse> genForUpdateUserRepositoryAuth() {
        // basic
        HttpRequestDef.Builder<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    UpdateUserRepositoryAuthRequest.class,
                    UpdateUserRepositoryAuthResponse.class)
                .withName("UpdateUserRepositoryAuth")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRepositoryAuthRequest::getNamespace,
                UpdateUserRepositoryAuthRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRepositoryAuthRequest::getRepository,
                UpdateUserRepositoryAuthRequest::setRepository));
        builder.<List<UserAuth>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateUserRepositoryAuthRequest::getBody, UpdateUserRepositoryAuthRequest::setBody)
                .withInnerContainerType(UserAuth.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForListApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForListApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withName("ListApiVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion =
        genForShowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForShowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiVersionRequest::getApiVersion, ShowApiVersionRequest::setApiVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDomainNameRequest, AddDomainNameResponse> addDomainName =
        genForAddDomainName();

    private static HttpRequestDef<AddDomainNameRequest, AddDomainNameResponse> genForAddDomainName() {
        // basic
        HttpRequestDef.Builder<AddDomainNameRequest, AddDomainNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDomainNameRequest.class, AddDomainNameResponse.class)
                .withName("AddDomainName")
                .withUri("/v2/{project_id}/instances/{instance_id}/domainname")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDomainNameRequest::getInstanceId, AddDomainNameRequest::setInstanceId));
        builder.<AddDomainNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDomainNameRequestBody.class),
            f -> f.withMarshaller(AddDomainNameRequest::getBody, AddDomainNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateImmutableRuleRequest, CreateImmutableRuleResponse> createImmutableRule =
        genForCreateImmutableRule();

    private static HttpRequestDef<CreateImmutableRuleRequest, CreateImmutableRuleResponse> genForCreateImmutableRule() {
        // basic
        HttpRequestDef.Builder<CreateImmutableRuleRequest, CreateImmutableRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateImmutableRuleRequest.class, CreateImmutableRuleResponse.class)
                .withName("CreateImmutableRule")
                .withUri("/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/immutabletagrules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateImmutableRuleRequest::getInstanceId,
                CreateImmutableRuleRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateImmutableRuleRequest::getNamespaceName,
                CreateImmutableRuleRequest::setNamespaceName));
        builder.<CreateImmutableRuleBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImmutableRuleBody.class),
            f -> f.withMarshaller(CreateImmutableRuleRequest::getBody, CreateImmutableRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v2/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<CreateInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceRequestBody.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceEndpointPolicyRequest, CreateInstanceEndpointPolicyResponse> createInstanceEndpointPolicy =
        genForCreateInstanceEndpointPolicy();

    private static HttpRequestDef<CreateInstanceEndpointPolicyRequest, CreateInstanceEndpointPolicyResponse> genForCreateInstanceEndpointPolicy() {
        // basic
        HttpRequestDef.Builder<CreateInstanceEndpointPolicyRequest, CreateInstanceEndpointPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInstanceEndpointPolicyRequest.class,
                    CreateInstanceEndpointPolicyResponse.class)
                .withName("CreateInstanceEndpointPolicy")
                .withUri("/v2/{project_id}/instances/{instance_id}/endpoint-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceEndpointPolicyRequest::getInstanceId,
                CreateInstanceEndpointPolicyRequest::setInstanceId));
        builder.<CreateEndpointPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEndpointPolicyRequestBody.class),
            f -> f.withMarshaller(CreateInstanceEndpointPolicyRequest::getBody,
                CreateInstanceEndpointPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceInternalEndpointRequest, CreateInstanceInternalEndpointResponse> createInstanceInternalEndpoint =
        genForCreateInstanceInternalEndpoint();

    private static HttpRequestDef<CreateInstanceInternalEndpointRequest, CreateInstanceInternalEndpointResponse> genForCreateInstanceInternalEndpoint() {
        // basic
        HttpRequestDef.Builder<CreateInstanceInternalEndpointRequest, CreateInstanceInternalEndpointResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInstanceInternalEndpointRequest.class,
                    CreateInstanceInternalEndpointResponse.class)
                .withName("CreateInstanceInternalEndpoint")
                .withUri("/v2/{project_id}/instances/{instance_id}/internal-endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceInternalEndpointRequest::getInstanceId,
                CreateInstanceInternalEndpointRequest::setInstanceId));
        builder.<CreateIntranetAccessRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIntranetAccessRequestBody.class),
            f -> f.withMarshaller(CreateInstanceInternalEndpointRequest::getBody,
                CreateInstanceInternalEndpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceLtCredentialRequest, CreateInstanceLtCredentialResponse> createInstanceLtCredential =
        genForCreateInstanceLtCredential();

    private static HttpRequestDef<CreateInstanceLtCredentialRequest, CreateInstanceLtCredentialResponse> genForCreateInstanceLtCredential() {
        // basic
        HttpRequestDef.Builder<CreateInstanceLtCredentialRequest, CreateInstanceLtCredentialResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInstanceLtCredentialRequest.class,
                    CreateInstanceLtCredentialResponse.class)
                .withName("CreateInstanceLtCredential")
                .withUri("/v2/{project_id}/instances/{instance_id}/long-term-credential")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceLtCredentialRequest::getInstanceId,
                CreateInstanceLtCredentialRequest::setInstanceId));
        builder.<CreateLongTermCredentialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLongTermCredentialRequestBody.class),
            f -> f.withMarshaller(CreateInstanceLtCredentialRequest::getBody,
                CreateInstanceLtCredentialRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceNamespaceRequest, CreateInstanceNamespaceResponse> createInstanceNamespace =
        genForCreateInstanceNamespace();

    private static HttpRequestDef<CreateInstanceNamespaceRequest, CreateInstanceNamespaceResponse> genForCreateInstanceNamespace() {
        // basic
        HttpRequestDef.Builder<CreateInstanceNamespaceRequest, CreateInstanceNamespaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateInstanceNamespaceRequest.class, CreateInstanceNamespaceResponse.class)
            .withName("CreateInstanceNamespace")
            .withUri("/v2/{project_id}/instances/{instance_id}/namespaces")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceNamespaceRequest::getInstanceId,
                CreateInstanceNamespaceRequest::setInstanceId));
        builder.<CreateInstanceNamespaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceNamespaceRequestBody.class),
            f -> f.withMarshaller(CreateInstanceNamespaceRequest::getBody, CreateInstanceNamespaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRegistryRequest, CreateInstanceRegistryResponse> createInstanceRegistry =
        genForCreateInstanceRegistry();

    private static HttpRequestDef<CreateInstanceRegistryRequest, CreateInstanceRegistryResponse> genForCreateInstanceRegistry() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRegistryRequest, CreateInstanceRegistryResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateInstanceRegistryRequest.class, CreateInstanceRegistryResponse.class)
            .withName("CreateInstanceRegistry")
            .withUri("/v2/{project_id}/instances/{instance_id}/registries")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRegistryRequest::getInstanceId,
                CreateInstanceRegistryRequest::setInstanceId));
        builder.<CreateRegistryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRegistryRequestBody.class),
            f -> f.withMarshaller(CreateInstanceRegistryRequest::getBody, CreateInstanceRegistryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceReplicationPolicyRequest, CreateInstanceReplicationPolicyResponse> createInstanceReplicationPolicy =
        genForCreateInstanceReplicationPolicy();

    private static HttpRequestDef<CreateInstanceReplicationPolicyRequest, CreateInstanceReplicationPolicyResponse> genForCreateInstanceReplicationPolicy() {
        // basic
        HttpRequestDef.Builder<CreateInstanceReplicationPolicyRequest, CreateInstanceReplicationPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInstanceReplicationPolicyRequest.class,
                    CreateInstanceReplicationPolicyResponse.class)
                .withName("CreateInstanceReplicationPolicy")
                .withUri("/v2/{project_id}/instances/{instance_id}/replication/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceReplicationPolicyRequest::getInstanceId,
                CreateInstanceReplicationPolicyRequest::setInstanceId));
        builder.<CreateReplicationPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateReplicationPolicyRequestBody.class),
            f -> f.withMarshaller(CreateInstanceReplicationPolicyRequest::getBody,
                CreateInstanceReplicationPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceResourceTagsRequest, CreateInstanceResourceTagsResponse> createInstanceResourceTags =
        genForCreateInstanceResourceTags();

    private static HttpRequestDef<CreateInstanceResourceTagsRequest, CreateInstanceResourceTagsResponse> genForCreateInstanceResourceTags() {
        // basic
        HttpRequestDef.Builder<CreateInstanceResourceTagsRequest, CreateInstanceResourceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInstanceResourceTagsRequest.class,
                    CreateInstanceResourceTagsResponse.class)
                .withName("CreateInstanceResourceTags")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<CreateInstanceResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CreateInstanceResourceTagsRequest::getResourceType,
                CreateInstanceResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceResourceTagsRequest::getResourceId,
                CreateInstanceResourceTagsRequest::setResourceId));
        builder.<CreateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagsRequestBody.class),
            f -> f.withMarshaller(CreateInstanceResourceTagsRequest::getBody,
                CreateInstanceResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRetentionPolicyRequest, CreateInstanceRetentionPolicyResponse> createInstanceRetentionPolicy =
        genForCreateInstanceRetentionPolicy();

    private static HttpRequestDef<CreateInstanceRetentionPolicyRequest, CreateInstanceRetentionPolicyResponse> genForCreateInstanceRetentionPolicy() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRetentionPolicyRequest, CreateInstanceRetentionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInstanceRetentionPolicyRequest.class,
                    CreateInstanceRetentionPolicyResponse.class)
                .withName("CreateInstanceRetentionPolicy")
                .withUri("/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/retention/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRetentionPolicyRequest::getInstanceId,
                CreateInstanceRetentionPolicyRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRetentionPolicyRequest::getNamespaceName,
                CreateInstanceRetentionPolicyRequest::setNamespaceName));
        builder.<CreateRetentionPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRetentionPolicyRequestBody.class),
            f -> f.withMarshaller(CreateInstanceRetentionPolicyRequest::getBody,
                CreateInstanceRetentionPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceSignPolicyRequest, CreateInstanceSignPolicyResponse> createInstanceSignPolicy =
        genForCreateInstanceSignPolicy();

    private static HttpRequestDef<CreateInstanceSignPolicyRequest, CreateInstanceSignPolicyResponse> genForCreateInstanceSignPolicy() {
        // basic
        HttpRequestDef.Builder<CreateInstanceSignPolicyRequest, CreateInstanceSignPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateInstanceSignPolicyRequest.class, CreateInstanceSignPolicyResponse.class)
                .withName("CreateInstanceSignPolicy")
                .withUri("/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/signature/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceSignPolicyRequest::getInstanceId,
                CreateInstanceSignPolicyRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceSignPolicyRequest::getNamespaceName,
                CreateInstanceSignPolicyRequest::setNamespaceName));
        builder.<CreateSignaturePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSignaturePolicyRequestBody.class),
            f -> f.withMarshaller(CreateInstanceSignPolicyRequest::getBody, CreateInstanceSignPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceTempCredentialRequest, CreateInstanceTempCredentialResponse> createInstanceTempCredential =
        genForCreateInstanceTempCredential();

    private static HttpRequestDef<CreateInstanceTempCredentialRequest, CreateInstanceTempCredentialResponse> genForCreateInstanceTempCredential() {
        // basic
        HttpRequestDef.Builder<CreateInstanceTempCredentialRequest, CreateInstanceTempCredentialResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInstanceTempCredentialRequest.class,
                    CreateInstanceTempCredentialResponse.class)
                .withName("CreateInstanceTempCredential")
                .withUri("/v2/{project_id}/instances/{instance_id}/temp-credential")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceTempCredentialRequest::getInstanceId,
                CreateInstanceTempCredentialRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceWebhookRequest, CreateInstanceWebhookResponse> createInstanceWebhook =
        genForCreateInstanceWebhook();

    private static HttpRequestDef<CreateInstanceWebhookRequest, CreateInstanceWebhookResponse> genForCreateInstanceWebhook() {
        // basic
        HttpRequestDef.Builder<CreateInstanceWebhookRequest, CreateInstanceWebhookResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateInstanceWebhookRequest.class, CreateInstanceWebhookResponse.class)
            .withName("CreateInstanceWebhook")
            .withUri("/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/webhook/policies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceWebhookRequest::getInstanceId,
                CreateInstanceWebhookRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceWebhookRequest::getNamespaceName,
                CreateInstanceWebhookRequest::setNamespaceName));
        builder.<CreateWebhookPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWebhookPolicyRequestBody.class),
            f -> f.withMarshaller(CreateInstanceWebhookRequest::getBody, CreateInstanceWebhookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubResourceTagsRequest, CreateSubResourceTagsResponse> createSubResourceTags =
        genForCreateSubResourceTags();

    private static HttpRequestDef<CreateSubResourceTagsRequest, CreateSubResourceTagsResponse> genForCreateSubResourceTags() {
        // basic
        HttpRequestDef.Builder<CreateSubResourceTagsRequest, CreateSubResourceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSubResourceTagsRequest.class, CreateSubResourceTagsResponse.class)
            .withName("CreateSubResourceTags")
            .withUri("/v2/{project_id}/{resource_type}/{resource_id}/{sub_resource_type}/{sub_resource_id}/tags/create")
            .withContentType("application/json");

        // requests
        builder.<CreateSubResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSubResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CreateSubResourceTagsRequest::getResourceType,
                CreateSubResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSubResourceTagsRequest::getResourceId,
                CreateSubResourceTagsRequest::setResourceId));
        builder.<CreateSubResourceTagsRequest.SubResourceTypeEnum>withRequestField("sub_resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSubResourceTagsRequest.SubResourceTypeEnum.class),
            f -> f.withMarshaller(CreateSubResourceTagsRequest::getSubResourceType,
                CreateSubResourceTagsRequest::setSubResourceType));
        builder.<String>withRequestField("sub_resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSubResourceTagsRequest::getSubResourceId,
                CreateSubResourceTagsRequest::setSubResourceId));
        builder.<CreateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagsRequestBody.class),
            f -> f.withMarshaller(CreateSubResourceTagsRequest::getBody, CreateSubResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainNameRequest, DeleteDomainNameResponse> deleteDomainName =
        genForDeleteDomainName();

    private static HttpRequestDef<DeleteDomainNameRequest, DeleteDomainNameResponse> genForDeleteDomainName() {
        // basic
        HttpRequestDef.Builder<DeleteDomainNameRequest, DeleteDomainNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainNameRequest.class, DeleteDomainNameResponse.class)
                .withName("DeleteDomainName")
                .withUri("/v2/{project_id}/instances/{instance_id}/domainname/{domainname_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainNameRequest::getInstanceId, DeleteDomainNameRequest::setInstanceId));
        builder.<String>withRequestField("domainname_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainNameRequest::getDomainnameId, DeleteDomainNameRequest::setDomainnameId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImmutableRuleRequest, DeleteImmutableRuleResponse> deleteImmutableRule =
        genForDeleteImmutableRule();

    private static HttpRequestDef<DeleteImmutableRuleRequest, DeleteImmutableRuleResponse> genForDeleteImmutableRule() {
        // basic
        HttpRequestDef.Builder<DeleteImmutableRuleRequest, DeleteImmutableRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteImmutableRuleRequest.class, DeleteImmutableRuleResponse.class)
            .withName("DeleteImmutableRule")
            .withUri(
                "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/immutabletagrules/{immutable_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImmutableRuleRequest::getInstanceId,
                DeleteImmutableRuleRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImmutableRuleRequest::getNamespaceName,
                DeleteImmutableRuleRequest::setNamespaceName));
        builder.<Integer>withRequestField("immutable_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteImmutableRuleRequest::getImmutableRuleId,
                DeleteImmutableRuleRequest::setImmutableRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, DeleteInstanceRequest::setInstanceId));
        builder.<DeleteInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteInstanceRequestBody.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getBody, DeleteInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceArtifactRequest, DeleteInstanceArtifactResponse> deleteInstanceArtifact =
        genForDeleteInstanceArtifact();

    private static HttpRequestDef<DeleteInstanceArtifactRequest, DeleteInstanceArtifactResponse> genForDeleteInstanceArtifact() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceArtifactRequest, DeleteInstanceArtifactResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteInstanceArtifactRequest.class, DeleteInstanceArtifactResponse.class)
            .withName("DeleteInstanceArtifact")
            .withUri(
                "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/repositories/{repository_name}/artifacts/{reference}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceArtifactRequest::getInstanceId,
                DeleteInstanceArtifactRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceArtifactRequest::getNamespaceName,
                DeleteInstanceArtifactRequest::setNamespaceName));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceArtifactRequest::getRepositoryName,
                DeleteInstanceArtifactRequest::setRepositoryName));
        builder.<String>withRequestField("reference",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceArtifactRequest::getReference,
                DeleteInstanceArtifactRequest::setReference));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceInternalEndpointRequest, DeleteInstanceInternalEndpointResponse> deleteInstanceInternalEndpoint =
        genForDeleteInstanceInternalEndpoint();

    private static HttpRequestDef<DeleteInstanceInternalEndpointRequest, DeleteInstanceInternalEndpointResponse> genForDeleteInstanceInternalEndpoint() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceInternalEndpointRequest, DeleteInstanceInternalEndpointResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInstanceInternalEndpointRequest.class,
                    DeleteInstanceInternalEndpointResponse.class)
                .withName("DeleteInstanceInternalEndpoint")
                .withUri("/v2/{project_id}/instances/{instance_id}/internal-endpoints/{internal_endpoints_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceInternalEndpointRequest::getInstanceId,
                DeleteInstanceInternalEndpointRequest::setInstanceId));
        builder.<String>withRequestField("internal_endpoints_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceInternalEndpointRequest::getInternalEndpointsId,
                DeleteInstanceInternalEndpointRequest::setInternalEndpointsId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceJobRequest, DeleteInstanceJobResponse> deleteInstanceJob =
        genForDeleteInstanceJob();

    private static HttpRequestDef<DeleteInstanceJobRequest, DeleteInstanceJobResponse> genForDeleteInstanceJob() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceJobRequest, DeleteInstanceJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceJobRequest.class, DeleteInstanceJobResponse.class)
                .withName("DeleteInstanceJob")
                .withUri("/v2/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceJobRequest::getJobId, DeleteInstanceJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceLtCredentialRequest, DeleteInstanceLtCredentialResponse> deleteInstanceLtCredential =
        genForDeleteInstanceLtCredential();

    private static HttpRequestDef<DeleteInstanceLtCredentialRequest, DeleteInstanceLtCredentialResponse> genForDeleteInstanceLtCredential() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceLtCredentialRequest, DeleteInstanceLtCredentialResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInstanceLtCredentialRequest.class,
                    DeleteInstanceLtCredentialResponse.class)
                .withName("DeleteInstanceLtCredential")
                .withUri("/v2/{project_id}/instances/{instance_id}/long-term-credentials/{credential_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceLtCredentialRequest::getInstanceId,
                DeleteInstanceLtCredentialRequest::setInstanceId));
        builder.<String>withRequestField("credential_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceLtCredentialRequest::getCredentialId,
                DeleteInstanceLtCredentialRequest::setCredentialId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceNamespaceRequest, DeleteInstanceNamespaceResponse> deleteInstanceNamespace =
        genForDeleteInstanceNamespace();

    private static HttpRequestDef<DeleteInstanceNamespaceRequest, DeleteInstanceNamespaceResponse> genForDeleteInstanceNamespace() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceNamespaceRequest, DeleteInstanceNamespaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteInstanceNamespaceRequest.class, DeleteInstanceNamespaceResponse.class)
            .withName("DeleteInstanceNamespace")
            .withUri("/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceNamespaceRequest::getInstanceId,
                DeleteInstanceNamespaceRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceNamespaceRequest::getNamespaceName,
                DeleteInstanceNamespaceRequest::setNamespaceName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRegistryRequest, DeleteInstanceRegistryResponse> deleteInstanceRegistry =
        genForDeleteInstanceRegistry();

    private static HttpRequestDef<DeleteInstanceRegistryRequest, DeleteInstanceRegistryResponse> genForDeleteInstanceRegistry() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRegistryRequest, DeleteInstanceRegistryResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteInstanceRegistryRequest.class, DeleteInstanceRegistryResponse.class)
            .withName("DeleteInstanceRegistry")
            .withUri("/v2/{project_id}/instances/{instance_id}/registries/{registry_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRegistryRequest::getInstanceId,
                DeleteInstanceRegistryRequest::setInstanceId));
        builder.<Integer>withRequestField("registry_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteInstanceRegistryRequest::getRegistryId,
                DeleteInstanceRegistryRequest::setRegistryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceReplicationPolicyRequest, DeleteInstanceReplicationPolicyResponse> deleteInstanceReplicationPolicy =
        genForDeleteInstanceReplicationPolicy();

    private static HttpRequestDef<DeleteInstanceReplicationPolicyRequest, DeleteInstanceReplicationPolicyResponse> genForDeleteInstanceReplicationPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceReplicationPolicyRequest, DeleteInstanceReplicationPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInstanceReplicationPolicyRequest.class,
                    DeleteInstanceReplicationPolicyResponse.class)
                .withName("DeleteInstanceReplicationPolicy")
                .withUri("/v2/{project_id}/instances/{instance_id}/replication/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceReplicationPolicyRequest::getInstanceId,
                DeleteInstanceReplicationPolicyRequest::setInstanceId));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteInstanceReplicationPolicyRequest::getPolicyId,
                DeleteInstanceReplicationPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRepositoryRequest, DeleteInstanceRepositoryResponse> deleteInstanceRepository =
        genForDeleteInstanceRepository();

    private static HttpRequestDef<DeleteInstanceRepositoryRequest, DeleteInstanceRepositoryResponse> genForDeleteInstanceRepository() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRepositoryRequest, DeleteInstanceRepositoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInstanceRepositoryRequest.class,
                    DeleteInstanceRepositoryResponse.class)
                .withName("DeleteInstanceRepository")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/repositories/{repository_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRepositoryRequest::getInstanceId,
                DeleteInstanceRepositoryRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRepositoryRequest::getNamespaceName,
                DeleteInstanceRepositoryRequest::setNamespaceName));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRepositoryRequest::getRepositoryName,
                DeleteInstanceRepositoryRequest::setRepositoryName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceResourceTagsRequest, DeleteInstanceResourceTagsResponse> deleteInstanceResourceTags =
        genForDeleteInstanceResourceTags();

    private static HttpRequestDef<DeleteInstanceResourceTagsRequest, DeleteInstanceResourceTagsResponse> genForDeleteInstanceResourceTags() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceResourceTagsRequest, DeleteInstanceResourceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInstanceResourceTagsRequest.class,
                    DeleteInstanceResourceTagsResponse.class)
                .withName("DeleteInstanceResourceTags")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteInstanceResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteInstanceResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteInstanceResourceTagsRequest::getResourceType,
                DeleteInstanceResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceResourceTagsRequest::getResourceId,
                DeleteInstanceResourceTagsRequest::setResourceId));
        builder.<DeleteResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteResourceTagsRequestBody.class),
            f -> f.withMarshaller(DeleteInstanceResourceTagsRequest::getBody,
                DeleteInstanceResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRetentionPolicyRequest, DeleteInstanceRetentionPolicyResponse> deleteInstanceRetentionPolicy =
        genForDeleteInstanceRetentionPolicy();

    private static HttpRequestDef<DeleteInstanceRetentionPolicyRequest, DeleteInstanceRetentionPolicyResponse> genForDeleteInstanceRetentionPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRetentionPolicyRequest, DeleteInstanceRetentionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInstanceRetentionPolicyRequest.class,
                    DeleteInstanceRetentionPolicyResponse.class)
                .withName("DeleteInstanceRetentionPolicy")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/retention/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRetentionPolicyRequest::getInstanceId,
                DeleteInstanceRetentionPolicyRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRetentionPolicyRequest::getNamespaceName,
                DeleteInstanceRetentionPolicyRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteInstanceRetentionPolicyRequest::getPolicyId,
                DeleteInstanceRetentionPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceSignPolicyRequest, DeleteInstanceSignPolicyResponse> deleteInstanceSignPolicy =
        genForDeleteInstanceSignPolicy();

    private static HttpRequestDef<DeleteInstanceSignPolicyRequest, DeleteInstanceSignPolicyResponse> genForDeleteInstanceSignPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceSignPolicyRequest, DeleteInstanceSignPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInstanceSignPolicyRequest.class,
                    DeleteInstanceSignPolicyResponse.class)
                .withName("DeleteInstanceSignPolicy")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/signature/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceSignPolicyRequest::getInstanceId,
                DeleteInstanceSignPolicyRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceSignPolicyRequest::getNamespaceName,
                DeleteInstanceSignPolicyRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteInstanceSignPolicyRequest::getPolicyId,
                DeleteInstanceSignPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceWebhookRequest, DeleteInstanceWebhookResponse> deleteInstanceWebhook =
        genForDeleteInstanceWebhook();

    private static HttpRequestDef<DeleteInstanceWebhookRequest, DeleteInstanceWebhookResponse> genForDeleteInstanceWebhook() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceWebhookRequest, DeleteInstanceWebhookResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteInstanceWebhookRequest.class, DeleteInstanceWebhookResponse.class)
            .withName("DeleteInstanceWebhook")
            .withUri(
                "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/webhook/policies/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceWebhookRequest::getInstanceId,
                DeleteInstanceWebhookRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceWebhookRequest::getNamespaceName,
                DeleteInstanceWebhookRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteInstanceWebhookRequest::getPolicyId,
                DeleteInstanceWebhookRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubResourceTagsRequest, DeleteSubResourceTagsResponse> deleteSubResourceTags =
        genForDeleteSubResourceTags();

    private static HttpRequestDef<DeleteSubResourceTagsRequest, DeleteSubResourceTagsResponse> genForDeleteSubResourceTags() {
        // basic
        HttpRequestDef.Builder<DeleteSubResourceTagsRequest, DeleteSubResourceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSubResourceTagsRequest.class, DeleteSubResourceTagsResponse.class)
            .withName("DeleteSubResourceTags")
            .withUri("/v2/{project_id}/{resource_type}/{resource_id}/{sub_resource_type}/{sub_resource_id}/tags/delete")
            .withContentType("application/json");

        // requests
        builder.<DeleteSubResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteSubResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteSubResourceTagsRequest::getResourceType,
                DeleteSubResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubResourceTagsRequest::getResourceId,
                DeleteSubResourceTagsRequest::setResourceId));
        builder.<DeleteSubResourceTagsRequest.SubResourceTypeEnum>withRequestField("sub_resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteSubResourceTagsRequest.SubResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteSubResourceTagsRequest::getSubResourceType,
                DeleteSubResourceTagsRequest::setSubResourceType));
        builder.<String>withRequestField("sub_resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubResourceTagsRequest::getSubResourceId,
                DeleteSubResourceTagsRequest::setSubResourceId));
        builder.<DeleteResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteResourceTagsRequestBody.class),
            f -> f.withMarshaller(DeleteSubResourceTagsRequest::getBody, DeleteSubResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteInstanceReplicationPolicyRequest, ExecuteInstanceReplicationPolicyResponse> executeInstanceReplicationPolicy =
        genForExecuteInstanceReplicationPolicy();

    private static HttpRequestDef<ExecuteInstanceReplicationPolicyRequest, ExecuteInstanceReplicationPolicyResponse> genForExecuteInstanceReplicationPolicy() {
        // basic
        HttpRequestDef.Builder<ExecuteInstanceReplicationPolicyRequest, ExecuteInstanceReplicationPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteInstanceReplicationPolicyRequest.class,
                    ExecuteInstanceReplicationPolicyResponse.class)
                .withName("ExecuteInstanceReplicationPolicy")
                .withUri("/v2/{project_id}/instances/{instance_id}/replication/executions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteInstanceReplicationPolicyRequest::getInstanceId,
                ExecuteInstanceReplicationPolicyRequest::setInstanceId));
        builder.<CreateReplicationExecutionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateReplicationExecutionRequestBody.class),
            f -> f.withMarshaller(ExecuteInstanceReplicationPolicyRequest::getBody,
                ExecuteInstanceReplicationPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteInstanceRetentionPolicyRequest, ExecuteInstanceRetentionPolicyResponse> executeInstanceRetentionPolicy =
        genForExecuteInstanceRetentionPolicy();

    private static HttpRequestDef<ExecuteInstanceRetentionPolicyRequest, ExecuteInstanceRetentionPolicyResponse> genForExecuteInstanceRetentionPolicy() {
        // basic
        HttpRequestDef.Builder<ExecuteInstanceRetentionPolicyRequest, ExecuteInstanceRetentionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteInstanceRetentionPolicyRequest.class,
                    ExecuteInstanceRetentionPolicyResponse.class)
                .withName("ExecuteInstanceRetentionPolicy")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/retention/policies/{policy_id}/executions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteInstanceRetentionPolicyRequest::getInstanceId,
                ExecuteInstanceRetentionPolicyRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteInstanceRetentionPolicyRequest::getNamespaceName,
                ExecuteInstanceRetentionPolicyRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteInstanceRetentionPolicyRequest::getPolicyId,
                ExecuteInstanceRetentionPolicyRequest::setPolicyId));
        builder.<ExecuteRetentionPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteRetentionPolicyRequestBody.class),
            f -> f.withMarshaller(ExecuteInstanceRetentionPolicyRequest::getBody,
                ExecuteInstanceRetentionPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteInstanceSignPolicyRequest, ExecuteInstanceSignPolicyResponse> executeInstanceSignPolicy =
        genForExecuteInstanceSignPolicy();

    private static HttpRequestDef<ExecuteInstanceSignPolicyRequest, ExecuteInstanceSignPolicyResponse> genForExecuteInstanceSignPolicy() {
        // basic
        HttpRequestDef.Builder<ExecuteInstanceSignPolicyRequest, ExecuteInstanceSignPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteInstanceSignPolicyRequest.class,
                    ExecuteInstanceSignPolicyResponse.class)
                .withName("ExecuteInstanceSignPolicy")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/signature/policies/{policy_id}/executions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteInstanceSignPolicyRequest::getInstanceId,
                ExecuteInstanceSignPolicyRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteInstanceSignPolicyRequest::getNamespaceName,
                ExecuteInstanceSignPolicyRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExecuteInstanceSignPolicyRequest::getPolicyId,
                ExecuteInstanceSignPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditLogsRequest, ListAuditLogsResponse> listAuditLogs =
        genForListAuditLogs();

    private static HttpRequestDef<ListAuditLogsRequest, ListAuditLogsResponse> genForListAuditLogs() {
        // basic
        HttpRequestDef.Builder<ListAuditLogsRequest, ListAuditLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditLogsRequest.class, ListAuditLogsResponse.class)
                .withName("ListAuditLogs")
                .withUri("/v2/{project_id}/instances/{instance_id}/audit-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogsRequest::getInstanceId, ListAuditLogsRequest::setInstanceId));
        builder.<String>withRequestField("operation",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogsRequest::getOperation, ListAuditLogsRequest::setOperation));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuditLogsRequest::getOffset, ListAuditLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuditLogsRequest::getLimit, ListAuditLogsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainNamesRequest, ListDomainNamesResponse> listDomainNames =
        genForListDomainNames();

    private static HttpRequestDef<ListDomainNamesRequest, ListDomainNamesResponse> genForListDomainNames() {
        // basic
        HttpRequestDef.Builder<ListDomainNamesRequest, ListDomainNamesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainNamesRequest.class, ListDomainNamesResponse.class)
                .withName("ListDomainNames")
                .withUri("/v2/{project_id}/instances/{instance_id}/domainname")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainNamesRequest::getInstanceId, ListDomainNamesRequest::setInstanceId));
        builder.<String>withRequestField("uid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainNamesRequest::getUid, ListDomainNamesRequest::setUid));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainNamesRequest::getDomainName, ListDomainNamesRequest::setDomainName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFeatureGatesRequest, ListFeatureGatesResponse> listFeatureGates =
        genForListFeatureGates();

    private static HttpRequestDef<ListFeatureGatesRequest, ListFeatureGatesResponse> genForListFeatureGates() {
        // basic
        HttpRequestDef.Builder<ListFeatureGatesRequest, ListFeatureGatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFeatureGatesRequest.class, ListFeatureGatesResponse.class)
                .withName("ListFeatureGates")
                .withUri("/v2/{project_id}/instances/{instance_id}/feature-gates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFeatureGatesRequest::getInstanceId, ListFeatureGatesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalFeatureGatesRequest, ListGlobalFeatureGatesResponse> listGlobalFeatureGates =
        genForListGlobalFeatureGates();

    private static HttpRequestDef<ListGlobalFeatureGatesRequest, ListGlobalFeatureGatesResponse> genForListGlobalFeatureGates() {
        // basic
        HttpRequestDef.Builder<ListGlobalFeatureGatesRequest, ListGlobalFeatureGatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGlobalFeatureGatesRequest.class, ListGlobalFeatureGatesResponse.class)
            .withName("ListGlobalFeatureGates")
            .withUri("/v2/{project_id}/feature-gates")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImmutableRulesRequest, ListImmutableRulesResponse> listImmutableRules =
        genForListImmutableRules();

    private static HttpRequestDef<ListImmutableRulesRequest, ListImmutableRulesResponse> genForListImmutableRules() {
        // basic
        HttpRequestDef.Builder<ListImmutableRulesRequest, ListImmutableRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImmutableRulesRequest.class, ListImmutableRulesResponse.class)
                .withName("ListImmutableRules")
                .withUri("/v2/{project_id}/instances/{instance_id}/immutabletagrules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmutableRulesRequest::getInstanceId, ListImmutableRulesRequest::setInstanceId));
        builder.<Integer>withRequestField("namespace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImmutableRulesRequest::getNamespaceId,
                ListImmutableRulesRequest::setNamespaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImmutableRulesRequest::getOffset, ListImmutableRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImmutableRulesRequest::getLimit, ListImmutableRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceRequest, ListInstanceResponse> listInstance = genForListInstance();

    private static HttpRequestDef<ListInstanceRequest, ListInstanceResponse> genForListInstance() {
        // basic
        HttpRequestDef.Builder<ListInstanceRequest, ListInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceRequest.class, ListInstanceResponse.class)
                .withName("ListInstance")
                .withUri("/v2/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRequest::getOffset, ListInstanceRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRequest::getLimit, ListInstanceRequest::setLimit));
        builder.<ListInstanceRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceRequest.StatusEnum.class),
            f -> f.withMarshaller(ListInstanceRequest::getStatus, ListInstanceRequest::setStatus));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRequest::getEnterpriseProjectId,
                ListInstanceRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceAccessoriesRequest, ListInstanceAccessoriesResponse> listInstanceAccessories =
        genForListInstanceAccessories();

    private static HttpRequestDef<ListInstanceAccessoriesRequest, ListInstanceAccessoriesResponse> genForListInstanceAccessories() {
        // basic
        HttpRequestDef.Builder<ListInstanceAccessoriesRequest, ListInstanceAccessoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceAccessoriesRequest.class, ListInstanceAccessoriesResponse.class)
            .withName("ListInstanceAccessories")
            .withUri(
                "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/repositories/{repository_name}/artifacts/{reference}/accessories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceAccessoriesRequest::getInstanceId,
                ListInstanceAccessoriesRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceAccessoriesRequest::getNamespaceName,
                ListInstanceAccessoriesRequest::setNamespaceName));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceAccessoriesRequest::getRepositoryName,
                ListInstanceAccessoriesRequest::setRepositoryName));
        builder.<String>withRequestField("reference",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceAccessoriesRequest::getReference,
                ListInstanceAccessoriesRequest::setReference));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceAccessoriesRequest::getOffset,
                ListInstanceAccessoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceAccessoriesRequest::getLimit, ListInstanceAccessoriesRequest::setLimit));
        builder.<ListInstanceAccessoriesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceAccessoriesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListInstanceAccessoriesRequest::getType, ListInstanceAccessoriesRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceAllArtifactsRequest, ListInstanceAllArtifactsResponse> listInstanceAllArtifacts =
        genForListInstanceAllArtifacts();

    private static HttpRequestDef<ListInstanceAllArtifactsRequest, ListInstanceAllArtifactsResponse> genForListInstanceAllArtifacts() {
        // basic
        HttpRequestDef.Builder<ListInstanceAllArtifactsRequest, ListInstanceAllArtifactsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListInstanceAllArtifactsRequest.class, ListInstanceAllArtifactsResponse.class)
                .withName("ListInstanceAllArtifacts")
                .withUri("/v2/{project_id}/instances/{instance_id}/artifacts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceAllArtifactsRequest::getInstanceId,
                ListInstanceAllArtifactsRequest::setInstanceId));
        builder.<Integer>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceAllArtifactsRequest::getMarker,
                ListInstanceAllArtifactsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceAllArtifactsRequest::getLimit,
                ListInstanceAllArtifactsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceArtifactsRequest, ListInstanceArtifactsResponse> listInstanceArtifacts =
        genForListInstanceArtifacts();

    private static HttpRequestDef<ListInstanceArtifactsRequest, ListInstanceArtifactsResponse> genForListInstanceArtifacts() {
        // basic
        HttpRequestDef.Builder<ListInstanceArtifactsRequest, ListInstanceArtifactsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceArtifactsRequest.class, ListInstanceArtifactsResponse.class)
            .withName("ListInstanceArtifacts")
            .withUri(
                "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/repositories/{repository_name}/artifacts")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceArtifactsRequest::getInstanceId,
                ListInstanceArtifactsRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceArtifactsRequest::getNamespaceName,
                ListInstanceArtifactsRequest::setNamespaceName));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceArtifactsRequest::getRepositoryName,
                ListInstanceArtifactsRequest::setRepositoryName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceArtifactsRequest::getOffset, ListInstanceArtifactsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceArtifactsRequest::getLimit, ListInstanceArtifactsRequest::setLimit));
        builder.<ListInstanceArtifactsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceArtifactsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListInstanceArtifactsRequest::getType, ListInstanceArtifactsRequest::setType));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceArtifactsRequest::getTags, ListInstanceArtifactsRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceInternalEndpointsRequest, ListInstanceInternalEndpointsResponse> listInstanceInternalEndpoints =
        genForListInstanceInternalEndpoints();

    private static HttpRequestDef<ListInstanceInternalEndpointsRequest, ListInstanceInternalEndpointsResponse> genForListInstanceInternalEndpoints() {
        // basic
        HttpRequestDef.Builder<ListInstanceInternalEndpointsRequest, ListInstanceInternalEndpointsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceInternalEndpointsRequest.class,
                    ListInstanceInternalEndpointsResponse.class)
                .withName("ListInstanceInternalEndpoints")
                .withUri("/v2/{project_id}/instances/{instance_id}/internal-endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceInternalEndpointsRequest::getInstanceId,
                ListInstanceInternalEndpointsRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceInternalEndpointsRequest::getOffset,
                ListInstanceInternalEndpointsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceInternalEndpointsRequest::getLimit,
                ListInstanceInternalEndpointsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceJobsRequest, ListInstanceJobsResponse> listInstanceJobs =
        genForListInstanceJobs();

    private static HttpRequestDef<ListInstanceJobsRequest, ListInstanceJobsResponse> genForListInstanceJobs() {
        // basic
        HttpRequestDef.Builder<ListInstanceJobsRequest, ListInstanceJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceJobsRequest.class, ListInstanceJobsResponse.class)
                .withName("ListInstanceJobs")
                .withUri("/v2/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<ListInstanceJobsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceJobsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListInstanceJobsRequest::getStatus, ListInstanceJobsRequest::setStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceJobsRequest::getOffset, ListInstanceJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceJobsRequest::getLimit, ListInstanceJobsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceLtCredentialsRequest, ListInstanceLtCredentialsResponse> listInstanceLtCredentials =
        genForListInstanceLtCredentials();

    private static HttpRequestDef<ListInstanceLtCredentialsRequest, ListInstanceLtCredentialsResponse> genForListInstanceLtCredentials() {
        // basic
        HttpRequestDef.Builder<ListInstanceLtCredentialsRequest, ListInstanceLtCredentialsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceLtCredentialsRequest.class,
                    ListInstanceLtCredentialsResponse.class)
                .withName("ListInstanceLtCredentials")
                .withUri("/v2/{project_id}/instances/{instance_id}/long-term-credentials")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceLtCredentialsRequest::getInstanceId,
                ListInstanceLtCredentialsRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceLtCredentialsRequest::getOffset,
                ListInstanceLtCredentialsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceLtCredentialsRequest::getLimit,
                ListInstanceLtCredentialsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceNamespacesRequest, ListInstanceNamespacesResponse> listInstanceNamespaces =
        genForListInstanceNamespaces();

    private static HttpRequestDef<ListInstanceNamespacesRequest, ListInstanceNamespacesResponse> genForListInstanceNamespaces() {
        // basic
        HttpRequestDef.Builder<ListInstanceNamespacesRequest, ListInstanceNamespacesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceNamespacesRequest.class, ListInstanceNamespacesResponse.class)
            .withName("ListInstanceNamespaces")
            .withUri("/v2/{project_id}/instances/{instance_id}/namespaces")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceNamespacesRequest::getInstanceId,
                ListInstanceNamespacesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceNamespacesRequest::getOffset, ListInstanceNamespacesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceNamespacesRequest::getLimit, ListInstanceNamespacesRequest::setLimit));
        builder.<ListInstanceNamespacesRequest.OrderColumnEnum>withRequestField("order_column",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceNamespacesRequest.OrderColumnEnum.class),
            f -> f.withMarshaller(ListInstanceNamespacesRequest::getOrderColumn,
                ListInstanceNamespacesRequest::setOrderColumn));
        builder.<ListInstanceNamespacesRequest.OrderTypeEnum>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceNamespacesRequest.OrderTypeEnum.class),
            f -> f.withMarshaller(ListInstanceNamespacesRequest::getOrderType,
                ListInstanceNamespacesRequest::setOrderType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceNamespacesRequest::getName, ListInstanceNamespacesRequest::setName));
        builder.<String>withRequestField("public",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceNamespacesRequest::getPublic, ListInstanceNamespacesRequest::setPublic));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceProjectTagsRequest, ListInstanceProjectTagsResponse> listInstanceProjectTags =
        genForListInstanceProjectTags();

    private static HttpRequestDef<ListInstanceProjectTagsRequest, ListInstanceProjectTagsResponse> genForListInstanceProjectTags() {
        // basic
        HttpRequestDef.Builder<ListInstanceProjectTagsRequest, ListInstanceProjectTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceProjectTagsRequest.class, ListInstanceProjectTagsResponse.class)
            .withName("ListInstanceProjectTags")
            .withUri("/v2/{project_id}/instances/tags")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceRegistriesRequest, ListInstanceRegistriesResponse> listInstanceRegistries =
        genForListInstanceRegistries();

    private static HttpRequestDef<ListInstanceRegistriesRequest, ListInstanceRegistriesResponse> genForListInstanceRegistries() {
        // basic
        HttpRequestDef.Builder<ListInstanceRegistriesRequest, ListInstanceRegistriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceRegistriesRequest.class, ListInstanceRegistriesResponse.class)
            .withName("ListInstanceRegistries")
            .withUri("/v2/{project_id}/instances/{instance_id}/registries")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRegistriesRequest::getInstanceId,
                ListInstanceRegistriesRequest::setInstanceId));
        builder.<ListInstanceRegistriesRequest.OrderColumnEnum>withRequestField("order_column",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceRegistriesRequest.OrderColumnEnum.class),
            f -> f.withMarshaller(ListInstanceRegistriesRequest::getOrderColumn,
                ListInstanceRegistriesRequest::setOrderColumn));
        builder.<ListInstanceRegistriesRequest.OrderTypeEnum>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceRegistriesRequest.OrderTypeEnum.class),
            f -> f.withMarshaller(ListInstanceRegistriesRequest::getOrderType,
                ListInstanceRegistriesRequest::setOrderType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRegistriesRequest::getName, ListInstanceRegistriesRequest::setName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRegistriesRequest::getType, ListInstanceRegistriesRequest::setType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRegistriesRequest::getOffset, ListInstanceRegistriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRegistriesRequest::getLimit, ListInstanceRegistriesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceReplicationPoliciesRequest, ListInstanceReplicationPoliciesResponse> listInstanceReplicationPolicies =
        genForListInstanceReplicationPolicies();

    private static HttpRequestDef<ListInstanceReplicationPoliciesRequest, ListInstanceReplicationPoliciesResponse> genForListInstanceReplicationPolicies() {
        // basic
        HttpRequestDef.Builder<ListInstanceReplicationPoliciesRequest, ListInstanceReplicationPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceReplicationPoliciesRequest.class,
                    ListInstanceReplicationPoliciesResponse.class)
                .withName("ListInstanceReplicationPolicies")
                .withUri("/v2/{project_id}/instances/{instance_id}/replication/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceReplicationPoliciesRequest::getInstanceId,
                ListInstanceReplicationPoliciesRequest::setInstanceId));
        builder.<String>withRequestField("order_column",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceReplicationPoliciesRequest::getOrderColumn,
                ListInstanceReplicationPoliciesRequest::setOrderColumn));
        builder.<String>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceReplicationPoliciesRequest::getOrderType,
                ListInstanceReplicationPoliciesRequest::setOrderType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceReplicationPoliciesRequest::getName,
                ListInstanceReplicationPoliciesRequest::setName));
        builder.<Integer>withRequestField("registry_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceReplicationPoliciesRequest::getRegistryId,
                ListInstanceReplicationPoliciesRequest::setRegistryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceReplicationPoliciesRequest::getOffset,
                ListInstanceReplicationPoliciesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceReplicationPoliciesRequest::getLimit,
                ListInstanceReplicationPoliciesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceReplicationPolicyExecSubTasksRequest, ListInstanceReplicationPolicyExecSubTasksResponse> listInstanceReplicationPolicyExecSubTasks =
        genForListInstanceReplicationPolicyExecSubTasks();

    private static HttpRequestDef<ListInstanceReplicationPolicyExecSubTasksRequest, ListInstanceReplicationPolicyExecSubTasksResponse> genForListInstanceReplicationPolicyExecSubTasks() {
        // basic
        HttpRequestDef.Builder<ListInstanceReplicationPolicyExecSubTasksRequest, ListInstanceReplicationPolicyExecSubTasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceReplicationPolicyExecSubTasksRequest.class,
                    ListInstanceReplicationPolicyExecSubTasksResponse.class)
                .withName("ListInstanceReplicationPolicyExecSubTasks")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/replication/executions/{execution_id}/tasks/{task_id}/subtasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceReplicationPolicyExecSubTasksRequest::getInstanceId,
                ListInstanceReplicationPolicyExecSubTasksRequest::setInstanceId));
        builder.<Integer>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceReplicationPolicyExecSubTasksRequest::getExecutionId,
                ListInstanceReplicationPolicyExecSubTasksRequest::setExecutionId));
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceReplicationPolicyExecSubTasksRequest::getTaskId,
                ListInstanceReplicationPolicyExecSubTasksRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceReplicationPolicyExecSubTasksRequest::getOffset,
                ListInstanceReplicationPolicyExecSubTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceReplicationPolicyExecSubTasksRequest::getLimit,
                ListInstanceReplicationPolicyExecSubTasksRequest::setLimit));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceReplicationPolicyExecSubTasksRequest::getStatus,
                ListInstanceReplicationPolicyExecSubTasksRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceReplicationPolicyExecTasksRequest, ListInstanceReplicationPolicyExecTasksResponse> listInstanceReplicationPolicyExecTasks =
        genForListInstanceReplicationPolicyExecTasks();

    private static HttpRequestDef<ListInstanceReplicationPolicyExecTasksRequest, ListInstanceReplicationPolicyExecTasksResponse> genForListInstanceReplicationPolicyExecTasks() {
        // basic
        HttpRequestDef.Builder<ListInstanceReplicationPolicyExecTasksRequest, ListInstanceReplicationPolicyExecTasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceReplicationPolicyExecTasksRequest.class,
                    ListInstanceReplicationPolicyExecTasksResponse.class)
                .withName("ListInstanceReplicationPolicyExecTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/replication/executions/{execution_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceReplicationPolicyExecTasksRequest::getInstanceId,
                ListInstanceReplicationPolicyExecTasksRequest::setInstanceId));
        builder.<Integer>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceReplicationPolicyExecTasksRequest::getExecutionId,
                ListInstanceReplicationPolicyExecTasksRequest::setExecutionId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceReplicationPolicyExecTasksRequest::getOffset,
                ListInstanceReplicationPolicyExecTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceReplicationPolicyExecTasksRequest::getLimit,
                ListInstanceReplicationPolicyExecTasksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceReplicationPolicyExecutionsRequest, ListInstanceReplicationPolicyExecutionsResponse> listInstanceReplicationPolicyExecutions =
        genForListInstanceReplicationPolicyExecutions();

    private static HttpRequestDef<ListInstanceReplicationPolicyExecutionsRequest, ListInstanceReplicationPolicyExecutionsResponse> genForListInstanceReplicationPolicyExecutions() {
        // basic
        HttpRequestDef.Builder<ListInstanceReplicationPolicyExecutionsRequest, ListInstanceReplicationPolicyExecutionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceReplicationPolicyExecutionsRequest.class,
                    ListInstanceReplicationPolicyExecutionsResponse.class)
                .withName("ListInstanceReplicationPolicyExecutions")
                .withUri("/v2/{project_id}/instances/{instance_id}/replication/executions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceReplicationPolicyExecutionsRequest::getInstanceId,
                ListInstanceReplicationPolicyExecutionsRequest::setInstanceId));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceReplicationPolicyExecutionsRequest::getPolicyId,
                ListInstanceReplicationPolicyExecutionsRequest::setPolicyId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceReplicationPolicyExecutionsRequest::getOffset,
                ListInstanceReplicationPolicyExecutionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceReplicationPolicyExecutionsRequest::getLimit,
                ListInstanceReplicationPolicyExecutionsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceRepositoriesRequest, ListInstanceRepositoriesResponse> listInstanceRepositories =
        genForListInstanceRepositories();

    private static HttpRequestDef<ListInstanceRepositoriesRequest, ListInstanceRepositoriesResponse> genForListInstanceRepositories() {
        // basic
        HttpRequestDef.Builder<ListInstanceRepositoriesRequest, ListInstanceRepositoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListInstanceRepositoriesRequest.class, ListInstanceRepositoriesResponse.class)
                .withName("ListInstanceRepositories")
                .withUri("/v2/{project_id}/instances/{instance_id}/repositories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRepositoriesRequest::getInstanceId,
                ListInstanceRepositoriesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRepositoriesRequest::getOffset,
                ListInstanceRepositoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRepositoriesRequest::getLimit,
                ListInstanceRepositoriesRequest::setLimit));
        builder.<ListInstanceRepositoriesRequest.OrderColumnEnum>withRequestField("order_column",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceRepositoriesRequest.OrderColumnEnum.class),
            f -> f.withMarshaller(ListInstanceRepositoriesRequest::getOrderColumn,
                ListInstanceRepositoriesRequest::setOrderColumn));
        builder.<ListInstanceRepositoriesRequest.OrderTypeEnum>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceRepositoriesRequest.OrderTypeEnum.class),
            f -> f.withMarshaller(ListInstanceRepositoriesRequest::getOrderType,
                ListInstanceRepositoriesRequest::setOrderType));
        builder.<Integer>withRequestField("namespace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRepositoriesRequest::getNamespaceId,
                ListInstanceRepositoriesRequest::setNamespaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceResourceInstancesRequest, ListInstanceResourceInstancesResponse> listInstanceResourceInstances =
        genForListInstanceResourceInstances();

    private static HttpRequestDef<ListInstanceResourceInstancesRequest, ListInstanceResourceInstancesResponse> genForListInstanceResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListInstanceResourceInstancesRequest, ListInstanceResourceInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListInstanceResourceInstancesRequest.class,
                    ListInstanceResourceInstancesResponse.class)
                .withName("ListInstanceResourceInstances")
                .withUri("/v2/{project_id}/{resource_type}/resource-instances/filter")
                .withContentType("application/json");

        // requests
        builder.<ListInstanceResourceInstancesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstanceResourceInstancesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListInstanceResourceInstancesRequest::getResourceType,
                ListInstanceResourceInstancesRequest::setResourceType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceResourceInstancesRequest::getOffset,
                ListInstanceResourceInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceResourceInstancesRequest::getLimit,
                ListInstanceResourceInstancesRequest::setLimit));
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ListInstanceResourceInstancesRequest::getBody,
                ListInstanceResourceInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceResourceTagsRequest, ListInstanceResourceTagsResponse> listInstanceResourceTags =
        genForListInstanceResourceTags();

    private static HttpRequestDef<ListInstanceResourceTagsRequest, ListInstanceResourceTagsResponse> genForListInstanceResourceTags() {
        // basic
        HttpRequestDef.Builder<ListInstanceResourceTagsRequest, ListInstanceResourceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListInstanceResourceTagsRequest.class, ListInstanceResourceTagsResponse.class)
                .withName("ListInstanceResourceTags")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListInstanceResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstanceResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListInstanceResourceTagsRequest::getResourceType,
                ListInstanceResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceResourceTagsRequest::getResourceId,
                ListInstanceResourceTagsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceRetentionPoliciesRequest, ListInstanceRetentionPoliciesResponse> listInstanceRetentionPolicies =
        genForListInstanceRetentionPolicies();

    private static HttpRequestDef<ListInstanceRetentionPoliciesRequest, ListInstanceRetentionPoliciesResponse> genForListInstanceRetentionPolicies() {
        // basic
        HttpRequestDef.Builder<ListInstanceRetentionPoliciesRequest, ListInstanceRetentionPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceRetentionPoliciesRequest.class,
                    ListInstanceRetentionPoliciesResponse.class)
                .withName("ListInstanceRetentionPolicies")
                .withUri("/v2/{project_id}/instances/{instance_id}/retention/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRetentionPoliciesRequest::getInstanceId,
                ListInstanceRetentionPoliciesRequest::setInstanceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRetentionPoliciesRequest::getName,
                ListInstanceRetentionPoliciesRequest::setName));
        builder.<Integer>withRequestField("namespace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPoliciesRequest::getNamespaceId,
                ListInstanceRetentionPoliciesRequest::setNamespaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPoliciesRequest::getOffset,
                ListInstanceRetentionPoliciesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPoliciesRequest::getLimit,
                ListInstanceRetentionPoliciesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceRetentionPolicyExecSubTasksRequest, ListInstanceRetentionPolicyExecSubTasksResponse> listInstanceRetentionPolicyExecSubTasks =
        genForListInstanceRetentionPolicyExecSubTasks();

    private static HttpRequestDef<ListInstanceRetentionPolicyExecSubTasksRequest, ListInstanceRetentionPolicyExecSubTasksResponse> genForListInstanceRetentionPolicyExecSubTasks() {
        // basic
        HttpRequestDef.Builder<ListInstanceRetentionPolicyExecSubTasksRequest, ListInstanceRetentionPolicyExecSubTasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceRetentionPolicyExecSubTasksRequest.class,
                    ListInstanceRetentionPolicyExecSubTasksResponse.class)
                .withName("ListInstanceRetentionPolicyExecSubTasks")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/retention/policies/{policy_id}/executions/{execution_id}/tasks/{task_id}/subtasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecSubTasksRequest::getInstanceId,
                ListInstanceRetentionPolicyExecSubTasksRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecSubTasksRequest::getNamespaceName,
                ListInstanceRetentionPolicyExecSubTasksRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecSubTasksRequest::getPolicyId,
                ListInstanceRetentionPolicyExecSubTasksRequest::setPolicyId));
        builder.<Integer>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecSubTasksRequest::getExecutionId,
                ListInstanceRetentionPolicyExecSubTasksRequest::setExecutionId));
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecSubTasksRequest::getTaskId,
                ListInstanceRetentionPolicyExecSubTasksRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecSubTasksRequest::getOffset,
                ListInstanceRetentionPolicyExecSubTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecSubTasksRequest::getLimit,
                ListInstanceRetentionPolicyExecSubTasksRequest::setLimit));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecSubTasksRequest::getStatus,
                ListInstanceRetentionPolicyExecSubTasksRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceRetentionPolicyExecTasksRequest, ListInstanceRetentionPolicyExecTasksResponse> listInstanceRetentionPolicyExecTasks =
        genForListInstanceRetentionPolicyExecTasks();

    private static HttpRequestDef<ListInstanceRetentionPolicyExecTasksRequest, ListInstanceRetentionPolicyExecTasksResponse> genForListInstanceRetentionPolicyExecTasks() {
        // basic
        HttpRequestDef.Builder<ListInstanceRetentionPolicyExecTasksRequest, ListInstanceRetentionPolicyExecTasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceRetentionPolicyExecTasksRequest.class,
                    ListInstanceRetentionPolicyExecTasksResponse.class)
                .withName("ListInstanceRetentionPolicyExecTasks")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/retention/policies/{policy_id}/executions/{execution_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecTasksRequest::getInstanceId,
                ListInstanceRetentionPolicyExecTasksRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecTasksRequest::getNamespaceName,
                ListInstanceRetentionPolicyExecTasksRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecTasksRequest::getPolicyId,
                ListInstanceRetentionPolicyExecTasksRequest::setPolicyId));
        builder.<Integer>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecTasksRequest::getExecutionId,
                ListInstanceRetentionPolicyExecTasksRequest::setExecutionId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecTasksRequest::getOffset,
                ListInstanceRetentionPolicyExecTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecTasksRequest::getLimit,
                ListInstanceRetentionPolicyExecTasksRequest::setLimit));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecTasksRequest::getStatus,
                ListInstanceRetentionPolicyExecTasksRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceRetentionPolicyExecutionsRequest, ListInstanceRetentionPolicyExecutionsResponse> listInstanceRetentionPolicyExecutions =
        genForListInstanceRetentionPolicyExecutions();

    private static HttpRequestDef<ListInstanceRetentionPolicyExecutionsRequest, ListInstanceRetentionPolicyExecutionsResponse> genForListInstanceRetentionPolicyExecutions() {
        // basic
        HttpRequestDef.Builder<ListInstanceRetentionPolicyExecutionsRequest, ListInstanceRetentionPolicyExecutionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceRetentionPolicyExecutionsRequest.class,
                    ListInstanceRetentionPolicyExecutionsResponse.class)
                .withName("ListInstanceRetentionPolicyExecutions")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/retention/policies/{policy_id}/executions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecutionsRequest::getInstanceId,
                ListInstanceRetentionPolicyExecutionsRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecutionsRequest::getNamespaceName,
                ListInstanceRetentionPolicyExecutionsRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecutionsRequest::getPolicyId,
                ListInstanceRetentionPolicyExecutionsRequest::setPolicyId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecutionsRequest::getOffset,
                ListInstanceRetentionPolicyExecutionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRetentionPolicyExecutionsRequest::getLimit,
                ListInstanceRetentionPolicyExecutionsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceSignPoliciesRequest, ListInstanceSignPoliciesResponse> listInstanceSignPolicies =
        genForListInstanceSignPolicies();

    private static HttpRequestDef<ListInstanceSignPoliciesRequest, ListInstanceSignPoliciesResponse> genForListInstanceSignPolicies() {
        // basic
        HttpRequestDef.Builder<ListInstanceSignPoliciesRequest, ListInstanceSignPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListInstanceSignPoliciesRequest.class, ListInstanceSignPoliciesResponse.class)
                .withName("ListInstanceSignPolicies")
                .withUri("/v2/{project_id}/instances/{instance_id}/signature/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSignPoliciesRequest::getInstanceId,
                ListInstanceSignPoliciesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSignPoliciesRequest::getOffset,
                ListInstanceSignPoliciesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSignPoliciesRequest::getLimit,
                ListInstanceSignPoliciesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceSignPolicyExecTasksRequest, ListInstanceSignPolicyExecTasksResponse> listInstanceSignPolicyExecTasks =
        genForListInstanceSignPolicyExecTasks();

    private static HttpRequestDef<ListInstanceSignPolicyExecTasksRequest, ListInstanceSignPolicyExecTasksResponse> genForListInstanceSignPolicyExecTasks() {
        // basic
        HttpRequestDef.Builder<ListInstanceSignPolicyExecTasksRequest, ListInstanceSignPolicyExecTasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceSignPolicyExecTasksRequest.class,
                    ListInstanceSignPolicyExecTasksResponse.class)
                .withName("ListInstanceSignPolicyExecTasks")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/signature/policies/{policy_id}/executions/{execution_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSignPolicyExecTasksRequest::getInstanceId,
                ListInstanceSignPolicyExecTasksRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSignPolicyExecTasksRequest::getNamespaceName,
                ListInstanceSignPolicyExecTasksRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSignPolicyExecTasksRequest::getPolicyId,
                ListInstanceSignPolicyExecTasksRequest::setPolicyId));
        builder.<Integer>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSignPolicyExecTasksRequest::getExecutionId,
                ListInstanceSignPolicyExecTasksRequest::setExecutionId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSignPolicyExecTasksRequest::getOffset,
                ListInstanceSignPolicyExecTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSignPolicyExecTasksRequest::getLimit,
                ListInstanceSignPolicyExecTasksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceSignPolicyExecutionsRequest, ListInstanceSignPolicyExecutionsResponse> listInstanceSignPolicyExecutions =
        genForListInstanceSignPolicyExecutions();

    private static HttpRequestDef<ListInstanceSignPolicyExecutionsRequest, ListInstanceSignPolicyExecutionsResponse> genForListInstanceSignPolicyExecutions() {
        // basic
        HttpRequestDef.Builder<ListInstanceSignPolicyExecutionsRequest, ListInstanceSignPolicyExecutionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceSignPolicyExecutionsRequest.class,
                    ListInstanceSignPolicyExecutionsResponse.class)
                .withName("ListInstanceSignPolicyExecutions")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/signature/policies/{policy_id}/executions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSignPolicyExecutionsRequest::getInstanceId,
                ListInstanceSignPolicyExecutionsRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSignPolicyExecutionsRequest::getNamespaceName,
                ListInstanceSignPolicyExecutionsRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSignPolicyExecutionsRequest::getPolicyId,
                ListInstanceSignPolicyExecutionsRequest::setPolicyId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSignPolicyExecutionsRequest::getOffset,
                ListInstanceSignPolicyExecutionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSignPolicyExecutionsRequest::getLimit,
                ListInstanceSignPolicyExecutionsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceSignatureExecutionSubtasksRequest, ListInstanceSignatureExecutionSubtasksResponse> listInstanceSignatureExecutionSubtasks =
        genForListInstanceSignatureExecutionSubtasks();

    private static HttpRequestDef<ListInstanceSignatureExecutionSubtasksRequest, ListInstanceSignatureExecutionSubtasksResponse> genForListInstanceSignatureExecutionSubtasks() {
        // basic
        HttpRequestDef.Builder<ListInstanceSignatureExecutionSubtasksRequest, ListInstanceSignatureExecutionSubtasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceSignatureExecutionSubtasksRequest.class,
                    ListInstanceSignatureExecutionSubtasksResponse.class)
                .withName("ListInstanceSignatureExecutionSubtasks")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/signature/policies/{policy_id}/executions/{execution_id}/tasks/{task_id}/subtasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSignatureExecutionSubtasksRequest::getInstanceId,
                ListInstanceSignatureExecutionSubtasksRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSignatureExecutionSubtasksRequest::getNamespaceName,
                ListInstanceSignatureExecutionSubtasksRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSignatureExecutionSubtasksRequest::getPolicyId,
                ListInstanceSignatureExecutionSubtasksRequest::setPolicyId));
        builder.<Integer>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSignatureExecutionSubtasksRequest::getExecutionId,
                ListInstanceSignatureExecutionSubtasksRequest::setExecutionId));
        builder.<Integer>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSignatureExecutionSubtasksRequest::getTaskId,
                ListInstanceSignatureExecutionSubtasksRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSignatureExecutionSubtasksRequest::getOffset,
                ListInstanceSignatureExecutionSubtasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSignatureExecutionSubtasksRequest::getLimit,
                ListInstanceSignatureExecutionSubtasksRequest::setLimit));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSignatureExecutionSubtasksRequest::getStatus,
                ListInstanceSignatureExecutionSubtasksRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceStatisticsRequest, ListInstanceStatisticsResponse> listInstanceStatistics =
        genForListInstanceStatistics();

    private static HttpRequestDef<ListInstanceStatisticsRequest, ListInstanceStatisticsResponse> genForListInstanceStatistics() {
        // basic
        HttpRequestDef.Builder<ListInstanceStatisticsRequest, ListInstanceStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceStatisticsRequest.class, ListInstanceStatisticsResponse.class)
            .withName("ListInstanceStatistics")
            .withUri("/v2/{project_id}/instances/{instance_id}/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceStatisticsRequest::getInstanceId,
                ListInstanceStatisticsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTags =
        genForListInstanceTags();

    private static HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> genForListInstanceTags() {
        // basic
        HttpRequestDef.Builder<ListInstanceTagsRequest, ListInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceTagsRequest.class, ListInstanceTagsResponse.class)
                .withName("ListInstanceTags")
                .withUri("/v2/instances/{instance_id}/namespaces/{namespace_name}/repositories/{repository_name}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getInstanceId, ListInstanceTagsRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getNamespaceName,
                ListInstanceTagsRequest::setNamespaceName));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getRepositoryName,
                ListInstanceTagsRequest::setRepositoryName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getOffset, ListInstanceTagsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getLimit, ListInstanceTagsRequest::setLimit));
        builder.<Boolean>withRequestField("is_accessory",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getIsAccessory, ListInstanceTagsRequest::setIsAccessory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceWebhookJobsRequest, ListInstanceWebhookJobsResponse> listInstanceWebhookJobs =
        genForListInstanceWebhookJobs();

    private static HttpRequestDef<ListInstanceWebhookJobsRequest, ListInstanceWebhookJobsResponse> genForListInstanceWebhookJobs() {
        // basic
        HttpRequestDef.Builder<ListInstanceWebhookJobsRequest, ListInstanceWebhookJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceWebhookJobsRequest.class, ListInstanceWebhookJobsResponse.class)
            .withName("ListInstanceWebhookJobs")
            .withUri(
                "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/webhook/policies/{policy_id}/jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceWebhookJobsRequest::getInstanceId,
                ListInstanceWebhookJobsRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceWebhookJobsRequest::getNamespaceName,
                ListInstanceWebhookJobsRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceWebhookJobsRequest::getPolicyId,
                ListInstanceWebhookJobsRequest::setPolicyId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceWebhookJobsRequest::getOffset,
                ListInstanceWebhookJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceWebhookJobsRequest::getLimit, ListInstanceWebhookJobsRequest::setLimit));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceWebhookJobsRequest::getStatus,
                ListInstanceWebhookJobsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceWebhooksRequest, ListInstanceWebhooksResponse> listInstanceWebhooks =
        genForListInstanceWebhooks();

    private static HttpRequestDef<ListInstanceWebhooksRequest, ListInstanceWebhooksResponse> genForListInstanceWebhooks() {
        // basic
        HttpRequestDef.Builder<ListInstanceWebhooksRequest, ListInstanceWebhooksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceWebhooksRequest.class, ListInstanceWebhooksResponse.class)
            .withName("ListInstanceWebhooks")
            .withUri("/v2/{project_id}/instances/{instance_id}/webhook/policies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceWebhooksRequest::getInstanceId,
                ListInstanceWebhooksRequest::setInstanceId));
        builder.<String>withRequestField("order_column",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceWebhooksRequest::getOrderColumn,
                ListInstanceWebhooksRequest::setOrderColumn));
        builder.<ListInstanceWebhooksRequest.OrderTypeEnum>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceWebhooksRequest.OrderTypeEnum.class),
            f -> f.withMarshaller(ListInstanceWebhooksRequest::getOrderType,
                ListInstanceWebhooksRequest::setOrderType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceWebhooksRequest::getName, ListInstanceWebhooksRequest::setName));
        builder.<Integer>withRequestField("namespace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceWebhooksRequest::getNamespaceId,
                ListInstanceWebhooksRequest::setNamespaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceWebhooksRequest::getOffset, ListInstanceWebhooksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceWebhooksRequest::getLimit, ListInstanceWebhooksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNamespaceRepositoriesRequest, ListNamespaceRepositoriesResponse> listNamespaceRepositories =
        genForListNamespaceRepositories();

    private static HttpRequestDef<ListNamespaceRepositoriesRequest, ListNamespaceRepositoriesResponse> genForListNamespaceRepositories() {
        // basic
        HttpRequestDef.Builder<ListNamespaceRepositoriesRequest, ListNamespaceRepositoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListNamespaceRepositoriesRequest.class,
                    ListNamespaceRepositoriesResponse.class)
                .withName("ListNamespaceRepositories")
                .withUri("/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/repositories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNamespaceRepositoriesRequest::getInstanceId,
                ListNamespaceRepositoriesRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNamespaceRepositoriesRequest::getNamespaceName,
                ListNamespaceRepositoriesRequest::setNamespaceName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNamespaceRepositoriesRequest::getOffset,
                ListNamespaceRepositoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNamespaceRepositoriesRequest::getLimit,
                ListNamespaceRepositoriesRequest::setLimit));
        builder.<ListNamespaceRepositoriesRequest.OrderColumnEnum>withRequestField("order_column",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListNamespaceRepositoriesRequest.OrderColumnEnum.class),
            f -> f.withMarshaller(ListNamespaceRepositoriesRequest::getOrderColumn,
                ListNamespaceRepositoriesRequest::setOrderColumn));
        builder.<ListNamespaceRepositoriesRequest.OrderTypeEnum>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListNamespaceRepositoriesRequest.OrderTypeEnum.class),
            f -> f.withMarshaller(ListNamespaceRepositoriesRequest::getOrderType,
                ListNamespaceRepositoriesRequest::setOrderType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNamespaceTagsRequest, ListNamespaceTagsResponse> listNamespaceTags =
        genForListNamespaceTags();

    private static HttpRequestDef<ListNamespaceTagsRequest, ListNamespaceTagsResponse> genForListNamespaceTags() {
        // basic
        HttpRequestDef.Builder<ListNamespaceTagsRequest, ListNamespaceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNamespaceTagsRequest.class, ListNamespaceTagsResponse.class)
                .withName("ListNamespaceTags")
                .withUri("/v2/{project_id}/instances/{instance_id}/namespaces-tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNamespaceTagsRequest::getInstanceId, ListNamespaceTagsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubResourceInstancesRequest, ListSubResourceInstancesResponse> listSubResourceInstances =
        genForListSubResourceInstances();

    private static HttpRequestDef<ListSubResourceInstancesRequest, ListSubResourceInstancesResponse> genForListSubResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListSubResourceInstancesRequest, ListSubResourceInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListSubResourceInstancesRequest.class, ListSubResourceInstancesResponse.class)
                .withName("ListSubResourceInstances")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/{sub_resource_type}/resource-instances/filter")
                .withContentType("application/json");

        // requests
        builder.<ListSubResourceInstancesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSubResourceInstancesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListSubResourceInstancesRequest::getResourceType,
                ListSubResourceInstancesRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubResourceInstancesRequest::getResourceId,
                ListSubResourceInstancesRequest::setResourceId));
        builder.<ListSubResourceInstancesRequest.SubResourceTypeEnum>withRequestField("sub_resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSubResourceInstancesRequest.SubResourceTypeEnum.class),
            f -> f.withMarshaller(ListSubResourceInstancesRequest::getSubResourceType,
                ListSubResourceInstancesRequest::setSubResourceType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubResourceInstancesRequest::getOffset,
                ListSubResourceInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubResourceInstancesRequest::getLimit,
                ListSubResourceInstancesRequest::setLimit));
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ListSubResourceInstancesRequest::getBody, ListSubResourceInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubResourceTagsRequest, ListSubResourceTagsResponse> listSubResourceTags =
        genForListSubResourceTags();

    private static HttpRequestDef<ListSubResourceTagsRequest, ListSubResourceTagsResponse> genForListSubResourceTags() {
        // basic
        HttpRequestDef.Builder<ListSubResourceTagsRequest, ListSubResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubResourceTagsRequest.class, ListSubResourceTagsResponse.class)
                .withName("ListSubResourceTags")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/{sub_resource_type}/{sub_resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListSubResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSubResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListSubResourceTagsRequest::getResourceType,
                ListSubResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubResourceTagsRequest::getResourceId,
                ListSubResourceTagsRequest::setResourceId));
        builder.<ListSubResourceTagsRequest.SubResourceTypeEnum>withRequestField("sub_resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSubResourceTagsRequest.SubResourceTypeEnum.class),
            f -> f.withMarshaller(ListSubResourceTagsRequest::getSubResourceType,
                ListSubResourceTagsRequest::setSubResourceType));
        builder.<String>withRequestField("sub_resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubResourceTagsRequest::getSubResourceId,
                ListSubResourceTagsRequest::setSubResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForShowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForShowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, ShowInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceArtifactRequest, ShowInstanceArtifactResponse> showInstanceArtifact =
        genForShowInstanceArtifact();

    private static HttpRequestDef<ShowInstanceArtifactRequest, ShowInstanceArtifactResponse> genForShowInstanceArtifact() {
        // basic
        HttpRequestDef.Builder<ShowInstanceArtifactRequest, ShowInstanceArtifactResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceArtifactRequest.class, ShowInstanceArtifactResponse.class)
            .withName("ShowInstanceArtifact")
            .withUri(
                "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/repositories/{repository_name}/artifacts/{reference}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceArtifactRequest::getInstanceId,
                ShowInstanceArtifactRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceArtifactRequest::getNamespaceName,
                ShowInstanceArtifactRequest::setNamespaceName));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceArtifactRequest::getRepositoryName,
                ShowInstanceArtifactRequest::setRepositoryName));
        builder.<String>withRequestField("reference",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceArtifactRequest::getReference,
                ShowInstanceArtifactRequest::setReference));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceArtifactAdditionRequest, ShowInstanceArtifactAdditionResponse> showInstanceArtifactAddition =
        genForShowInstanceArtifactAddition();

    private static HttpRequestDef<ShowInstanceArtifactAdditionRequest, ShowInstanceArtifactAdditionResponse> genForShowInstanceArtifactAddition() {
        // basic
        HttpRequestDef.Builder<ShowInstanceArtifactAdditionRequest, ShowInstanceArtifactAdditionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceArtifactAdditionRequest.class,
                    ShowInstanceArtifactAdditionResponse.class)
                .withName("ShowInstanceArtifactAddition")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/repositories/{repository_name}/artifacts/{reference}/additions/{addition}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceArtifactAdditionRequest::getInstanceId,
                ShowInstanceArtifactAdditionRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceArtifactAdditionRequest::getNamespaceName,
                ShowInstanceArtifactAdditionRequest::setNamespaceName));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceArtifactAdditionRequest::getRepositoryName,
                ShowInstanceArtifactAdditionRequest::setRepositoryName));
        builder.<String>withRequestField("reference",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceArtifactAdditionRequest::getReference,
                ShowInstanceArtifactAdditionRequest::setReference));
        builder.<ShowInstanceArtifactAdditionRequest.AdditionEnum>withRequestField("addition",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowInstanceArtifactAdditionRequest.AdditionEnum.class),
            f -> f.withMarshaller(ShowInstanceArtifactAdditionRequest::getAddition,
                ShowInstanceArtifactAdditionRequest::setAddition));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfiguration =
        genForShowInstanceConfiguration();

    private static HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> genForShowInstanceConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceConfigurationRequest.class,
                    ShowInstanceConfigurationResponse.class)
                .withName("ShowInstanceConfiguration")
                .withUri("/v2/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getInstanceId,
                ShowInstanceConfigurationRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceEndpointPolicyRequest, ShowInstanceEndpointPolicyResponse> showInstanceEndpointPolicy =
        genForShowInstanceEndpointPolicy();

    private static HttpRequestDef<ShowInstanceEndpointPolicyRequest, ShowInstanceEndpointPolicyResponse> genForShowInstanceEndpointPolicy() {
        // basic
        HttpRequestDef.Builder<ShowInstanceEndpointPolicyRequest, ShowInstanceEndpointPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceEndpointPolicyRequest.class,
                    ShowInstanceEndpointPolicyResponse.class)
                .withName("ShowInstanceEndpointPolicy")
                .withUri("/v2/{project_id}/instances/{instance_id}/endpoint-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceEndpointPolicyRequest::getInstanceId,
                ShowInstanceEndpointPolicyRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceInternalEndpointRequest, ShowInstanceInternalEndpointResponse> showInstanceInternalEndpoint =
        genForShowInstanceInternalEndpoint();

    private static HttpRequestDef<ShowInstanceInternalEndpointRequest, ShowInstanceInternalEndpointResponse> genForShowInstanceInternalEndpoint() {
        // basic
        HttpRequestDef.Builder<ShowInstanceInternalEndpointRequest, ShowInstanceInternalEndpointResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceInternalEndpointRequest.class,
                    ShowInstanceInternalEndpointResponse.class)
                .withName("ShowInstanceInternalEndpoint")
                .withUri("/v2/{project_id}/instances/{instance_id}/internal-endpoints/{internal_endpoints_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceInternalEndpointRequest::getInstanceId,
                ShowInstanceInternalEndpointRequest::setInstanceId));
        builder.<String>withRequestField("internal_endpoints_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceInternalEndpointRequest::getInternalEndpointsId,
                ShowInstanceInternalEndpointRequest::setInternalEndpointsId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceJobRequest, ShowInstanceJobResponse> showInstanceJob =
        genForShowInstanceJob();

    private static HttpRequestDef<ShowInstanceJobRequest, ShowInstanceJobResponse> genForShowInstanceJob() {
        // basic
        HttpRequestDef.Builder<ShowInstanceJobRequest, ShowInstanceJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceJobRequest.class, ShowInstanceJobResponse.class)
                .withName("ShowInstanceJob")
                .withUri("/v2/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceJobRequest::getJobId, ShowInstanceJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceNamespaceRequest, ShowInstanceNamespaceResponse> showInstanceNamespace =
        genForShowInstanceNamespace();

    private static HttpRequestDef<ShowInstanceNamespaceRequest, ShowInstanceNamespaceResponse> genForShowInstanceNamespace() {
        // basic
        HttpRequestDef.Builder<ShowInstanceNamespaceRequest, ShowInstanceNamespaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceNamespaceRequest.class, ShowInstanceNamespaceResponse.class)
            .withName("ShowInstanceNamespace")
            .withUri("/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceNamespaceRequest::getInstanceId,
                ShowInstanceNamespaceRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceNamespaceRequest::getNamespaceName,
                ShowInstanceNamespaceRequest::setNamespaceName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRegistryRequest, ShowInstanceRegistryResponse> showInstanceRegistry =
        genForShowInstanceRegistry();

    private static HttpRequestDef<ShowInstanceRegistryRequest, ShowInstanceRegistryResponse> genForShowInstanceRegistry() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRegistryRequest, ShowInstanceRegistryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceRegistryRequest.class, ShowInstanceRegistryResponse.class)
            .withName("ShowInstanceRegistry")
            .withUri("/v2/{project_id}/instances/{instance_id}/registries/{registry_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRegistryRequest::getInstanceId,
                ShowInstanceRegistryRequest::setInstanceId));
        builder.<Integer>withRequestField("registry_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstanceRegistryRequest::getRegistryId,
                ShowInstanceRegistryRequest::setRegistryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceReplicationPolicyRequest, ShowInstanceReplicationPolicyResponse> showInstanceReplicationPolicy =
        genForShowInstanceReplicationPolicy();

    private static HttpRequestDef<ShowInstanceReplicationPolicyRequest, ShowInstanceReplicationPolicyResponse> genForShowInstanceReplicationPolicy() {
        // basic
        HttpRequestDef.Builder<ShowInstanceReplicationPolicyRequest, ShowInstanceReplicationPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceReplicationPolicyRequest.class,
                    ShowInstanceReplicationPolicyResponse.class)
                .withName("ShowInstanceReplicationPolicy")
                .withUri("/v2/{project_id}/instances/{instance_id}/replication/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceReplicationPolicyRequest::getInstanceId,
                ShowInstanceReplicationPolicyRequest::setInstanceId));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstanceReplicationPolicyRequest::getPolicyId,
                ShowInstanceReplicationPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRepositoryRequest, ShowInstanceRepositoryResponse> showInstanceRepository =
        genForShowInstanceRepository();

    private static HttpRequestDef<ShowInstanceRepositoryRequest, ShowInstanceRepositoryResponse> genForShowInstanceRepository() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRepositoryRequest, ShowInstanceRepositoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceRepositoryRequest.class, ShowInstanceRepositoryResponse.class)
            .withName("ShowInstanceRepository")
            .withUri(
                "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/repositories/{repository_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRepositoryRequest::getInstanceId,
                ShowInstanceRepositoryRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRepositoryRequest::getNamespaceName,
                ShowInstanceRepositoryRequest::setNamespaceName));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRepositoryRequest::getRepositoryName,
                ShowInstanceRepositoryRequest::setRepositoryName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceResourceInstancesCountRequest, ShowInstanceResourceInstancesCountResponse> showInstanceResourceInstancesCount =
        genForShowInstanceResourceInstancesCount();

    private static HttpRequestDef<ShowInstanceResourceInstancesCountRequest, ShowInstanceResourceInstancesCountResponse> genForShowInstanceResourceInstancesCount() {
        // basic
        HttpRequestDef.Builder<ShowInstanceResourceInstancesCountRequest, ShowInstanceResourceInstancesCountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowInstanceResourceInstancesCountRequest.class,
                    ShowInstanceResourceInstancesCountResponse.class)
                .withName("ShowInstanceResourceInstancesCount")
                .withUri("/v2/{project_id}/{resource_type}/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<ShowInstanceResourceInstancesCountRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowInstanceResourceInstancesCountRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowInstanceResourceInstancesCountRequest::getResourceType,
                ShowInstanceResourceInstancesCountRequest::setResourceType));
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ShowInstanceResourceInstancesCountRequest::getBody,
                ShowInstanceResourceInstancesCountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRetentionPolicyRequest, ShowInstanceRetentionPolicyResponse> showInstanceRetentionPolicy =
        genForShowInstanceRetentionPolicy();

    private static HttpRequestDef<ShowInstanceRetentionPolicyRequest, ShowInstanceRetentionPolicyResponse> genForShowInstanceRetentionPolicy() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRetentionPolicyRequest, ShowInstanceRetentionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceRetentionPolicyRequest.class,
                    ShowInstanceRetentionPolicyResponse.class)
                .withName("ShowInstanceRetentionPolicy")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/retention/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRetentionPolicyRequest::getInstanceId,
                ShowInstanceRetentionPolicyRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRetentionPolicyRequest::getNamespaceName,
                ShowInstanceRetentionPolicyRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstanceRetentionPolicyRequest::getPolicyId,
                ShowInstanceRetentionPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceSignPolicyRequest, ShowInstanceSignPolicyResponse> showInstanceSignPolicy =
        genForShowInstanceSignPolicy();

    private static HttpRequestDef<ShowInstanceSignPolicyRequest, ShowInstanceSignPolicyResponse> genForShowInstanceSignPolicy() {
        // basic
        HttpRequestDef.Builder<ShowInstanceSignPolicyRequest, ShowInstanceSignPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceSignPolicyRequest.class, ShowInstanceSignPolicyResponse.class)
            .withName("ShowInstanceSignPolicy")
            .withUri(
                "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/signature/policies/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceSignPolicyRequest::getInstanceId,
                ShowInstanceSignPolicyRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceSignPolicyRequest::getNamespaceName,
                ShowInstanceSignPolicyRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstanceSignPolicyRequest::getPolicyId,
                ShowInstanceSignPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceWebhookRequest, ShowInstanceWebhookResponse> showInstanceWebhook =
        genForShowInstanceWebhook();

    private static HttpRequestDef<ShowInstanceWebhookRequest, ShowInstanceWebhookResponse> genForShowInstanceWebhook() {
        // basic
        HttpRequestDef.Builder<ShowInstanceWebhookRequest, ShowInstanceWebhookResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceWebhookRequest.class, ShowInstanceWebhookResponse.class)
                .withName("ShowInstanceWebhook")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/webhook/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceWebhookRequest::getInstanceId,
                ShowInstanceWebhookRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceWebhookRequest::getNamespaceName,
                ShowInstanceWebhookRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstanceWebhookRequest::getPolicyId, ShowInstanceWebhookRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubResourceInstancesCountRequest, ShowSubResourceInstancesCountResponse> showSubResourceInstancesCount =
        genForShowSubResourceInstancesCount();

    private static HttpRequestDef<ShowSubResourceInstancesCountRequest, ShowSubResourceInstancesCountResponse> genForShowSubResourceInstancesCount() {
        // basic
        HttpRequestDef.Builder<ShowSubResourceInstancesCountRequest, ShowSubResourceInstancesCountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowSubResourceInstancesCountRequest.class,
                    ShowSubResourceInstancesCountResponse.class)
                .withName("ShowSubResourceInstancesCount")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/{sub_resource_type}/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<ShowSubResourceInstancesCountRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowSubResourceInstancesCountRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowSubResourceInstancesCountRequest::getResourceType,
                ShowSubResourceInstancesCountRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubResourceInstancesCountRequest::getResourceId,
                ShowSubResourceInstancesCountRequest::setResourceId));
        builder.<ShowSubResourceInstancesCountRequest.SubResourceTypeEnum>withRequestField("sub_resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowSubResourceInstancesCountRequest.SubResourceTypeEnum.class),
            f -> f.withMarshaller(ShowSubResourceInstancesCountRequest::getSubResourceType,
                ShowSubResourceInstancesCountRequest::setSubResourceType));
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ShowSubResourceInstancesCountRequest::getBody,
                ShowSubResourceInstancesCountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopInstanceReplicationPolicyExecutionRequest, StopInstanceReplicationPolicyExecutionResponse> stopInstanceReplicationPolicyExecution =
        genForStopInstanceReplicationPolicyExecution();

    private static HttpRequestDef<StopInstanceReplicationPolicyExecutionRequest, StopInstanceReplicationPolicyExecutionResponse> genForStopInstanceReplicationPolicyExecution() {
        // basic
        HttpRequestDef.Builder<StopInstanceReplicationPolicyExecutionRequest, StopInstanceReplicationPolicyExecutionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    StopInstanceReplicationPolicyExecutionRequest.class,
                    StopInstanceReplicationPolicyExecutionResponse.class)
                .withName("StopInstanceReplicationPolicyExecution")
                .withUri("/v2/{project_id}/instances/{instance_id}/replication/executions/{execution_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopInstanceReplicationPolicyExecutionRequest::getInstanceId,
                StopInstanceReplicationPolicyExecutionRequest::setInstanceId));
        builder.<Integer>withRequestField("execution_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StopInstanceReplicationPolicyExecutionRequest::getExecutionId,
                StopInstanceReplicationPolicyExecutionRequest::setExecutionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainNameRequest, UpdateDomainNameResponse> updateDomainName =
        genForUpdateDomainName();

    private static HttpRequestDef<UpdateDomainNameRequest, UpdateDomainNameResponse> genForUpdateDomainName() {
        // basic
        HttpRequestDef.Builder<UpdateDomainNameRequest, UpdateDomainNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainNameRequest.class, UpdateDomainNameResponse.class)
                .withName("UpdateDomainName")
                .withUri("/v2/{project_id}/instances/{instance_id}/domainname/{domainname_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainNameRequest::getInstanceId, UpdateDomainNameRequest::setInstanceId));
        builder.<String>withRequestField("domainname_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainNameRequest::getDomainnameId, UpdateDomainNameRequest::setDomainnameId));
        builder.<UpdateDomainNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDomainNameRequestBody.class),
            f -> f.withMarshaller(UpdateDomainNameRequest::getBody, UpdateDomainNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateImmutableRuleRequest, UpdateImmutableRuleResponse> updateImmutableRule =
        genForUpdateImmutableRule();

    private static HttpRequestDef<UpdateImmutableRuleRequest, UpdateImmutableRuleResponse> genForUpdateImmutableRule() {
        // basic
        HttpRequestDef.Builder<UpdateImmutableRuleRequest, UpdateImmutableRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateImmutableRuleRequest.class, UpdateImmutableRuleResponse.class)
            .withName("UpdateImmutableRule")
            .withUri(
                "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/immutabletagrules/{immutable_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateImmutableRuleRequest::getInstanceId,
                UpdateImmutableRuleRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateImmutableRuleRequest::getNamespaceName,
                UpdateImmutableRuleRequest::setNamespaceName));
        builder.<Integer>withRequestField("immutable_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateImmutableRuleRequest::getImmutableRuleId,
                UpdateImmutableRuleRequest::setImmutableRuleId));
        builder.<UpdateImmutableRuleBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateImmutableRuleBody.class),
            f -> f.withMarshaller(UpdateImmutableRuleRequest::getBody, UpdateImmutableRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfiguration =
        genForUpdateInstanceConfiguration();

    private static HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> genForUpdateInstanceConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceConfigurationRequest.class,
                    UpdateInstanceConfigurationResponse.class)
                .withName("UpdateInstanceConfiguration")
                .withUri("/v2/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getInstanceId,
                UpdateInstanceConfigurationRequest::setInstanceId));
        builder.<UpdateInstanceConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceConfigurationRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getBody,
                UpdateInstanceConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceEndpointPolicyRequest, UpdateInstanceEndpointPolicyResponse> updateInstanceEndpointPolicy =
        genForUpdateInstanceEndpointPolicy();

    private static HttpRequestDef<UpdateInstanceEndpointPolicyRequest, UpdateInstanceEndpointPolicyResponse> genForUpdateInstanceEndpointPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceEndpointPolicyRequest, UpdateInstanceEndpointPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceEndpointPolicyRequest.class,
                    UpdateInstanceEndpointPolicyResponse.class)
                .withName("UpdateInstanceEndpointPolicy")
                .withUri("/v2/{project_id}/instances/{instance_id}/endpoint-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceEndpointPolicyRequest::getInstanceId,
                UpdateInstanceEndpointPolicyRequest::setInstanceId));
        builder.<UpdateWhiteListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWhiteListRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceEndpointPolicyRequest::getBody,
                UpdateInstanceEndpointPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceLtCredentialRequest, UpdateInstanceLtCredentialResponse> updateInstanceLtCredential =
        genForUpdateInstanceLtCredential();

    private static HttpRequestDef<UpdateInstanceLtCredentialRequest, UpdateInstanceLtCredentialResponse> genForUpdateInstanceLtCredential() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceLtCredentialRequest, UpdateInstanceLtCredentialResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceLtCredentialRequest.class,
                    UpdateInstanceLtCredentialResponse.class)
                .withName("UpdateInstanceLtCredential")
                .withUri("/v2/{project_id}/instances/{instance_id}/long-term-credentials/{credential_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceLtCredentialRequest::getInstanceId,
                UpdateInstanceLtCredentialRequest::setInstanceId));
        builder.<String>withRequestField("credential_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceLtCredentialRequest::getCredentialId,
                UpdateInstanceLtCredentialRequest::setCredentialId));
        builder.<UpdateLongTermCredentialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLongTermCredentialRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceLtCredentialRequest::getBody,
                UpdateInstanceLtCredentialRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceNamespaceRequest, UpdateInstanceNamespaceResponse> updateInstanceNamespace =
        genForUpdateInstanceNamespace();

    private static HttpRequestDef<UpdateInstanceNamespaceRequest, UpdateInstanceNamespaceResponse> genForUpdateInstanceNamespace() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceNamespaceRequest, UpdateInstanceNamespaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInstanceNamespaceRequest.class, UpdateInstanceNamespaceResponse.class)
            .withName("UpdateInstanceNamespace")
            .withUri("/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceNamespaceRequest::getInstanceId,
                UpdateInstanceNamespaceRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceNamespaceRequest::getNamespaceName,
                UpdateInstanceNamespaceRequest::setNamespaceName));
        builder.<UpdateNamespaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNamespaceRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceNamespaceRequest::getBody, UpdateInstanceNamespaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRegistryRequest, UpdateInstanceRegistryResponse> updateInstanceRegistry =
        genForUpdateInstanceRegistry();

    private static HttpRequestDef<UpdateInstanceRegistryRequest, UpdateInstanceRegistryResponse> genForUpdateInstanceRegistry() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRegistryRequest, UpdateInstanceRegistryResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInstanceRegistryRequest.class, UpdateInstanceRegistryResponse.class)
            .withName("UpdateInstanceRegistry")
            .withUri("/v2/{project_id}/instances/{instance_id}/registries/{registry_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRegistryRequest::getInstanceId,
                UpdateInstanceRegistryRequest::setInstanceId));
        builder.<Integer>withRequestField("registry_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateInstanceRegistryRequest::getRegistryId,
                UpdateInstanceRegistryRequest::setRegistryId));
        builder.<UpdateRegistryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRegistryRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceRegistryRequest::getBody, UpdateInstanceRegistryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceReplicationPolicyRequest, UpdateInstanceReplicationPolicyResponse> updateInstanceReplicationPolicy =
        genForUpdateInstanceReplicationPolicy();

    private static HttpRequestDef<UpdateInstanceReplicationPolicyRequest, UpdateInstanceReplicationPolicyResponse> genForUpdateInstanceReplicationPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceReplicationPolicyRequest, UpdateInstanceReplicationPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceReplicationPolicyRequest.class,
                    UpdateInstanceReplicationPolicyResponse.class)
                .withName("UpdateInstanceReplicationPolicy")
                .withUri("/v2/{project_id}/instances/{instance_id}/replication/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceReplicationPolicyRequest::getInstanceId,
                UpdateInstanceReplicationPolicyRequest::setInstanceId));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateInstanceReplicationPolicyRequest::getPolicyId,
                UpdateInstanceReplicationPolicyRequest::setPolicyId));
        builder.<UpdateReplicationPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateReplicationPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceReplicationPolicyRequest::getBody,
                UpdateInstanceReplicationPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRepositoryRequest, UpdateInstanceRepositoryResponse> updateInstanceRepository =
        genForUpdateInstanceRepository();

    private static HttpRequestDef<UpdateInstanceRepositoryRequest, UpdateInstanceRepositoryResponse> genForUpdateInstanceRepository() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRepositoryRequest, UpdateInstanceRepositoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateInstanceRepositoryRequest.class, UpdateInstanceRepositoryResponse.class)
                .withName("UpdateInstanceRepository")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/repositories/{repository_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRepositoryRequest::getInstanceId,
                UpdateInstanceRepositoryRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRepositoryRequest::getNamespaceName,
                UpdateInstanceRepositoryRequest::setNamespaceName));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRepositoryRequest::getRepositoryName,
                UpdateInstanceRepositoryRequest::setRepositoryName));
        builder.<UpdateRepoConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRepoConfigRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceRepositoryRequest::getBody, UpdateInstanceRepositoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRetentionPolicyRequest, UpdateInstanceRetentionPolicyResponse> updateInstanceRetentionPolicy =
        genForUpdateInstanceRetentionPolicy();

    private static HttpRequestDef<UpdateInstanceRetentionPolicyRequest, UpdateInstanceRetentionPolicyResponse> genForUpdateInstanceRetentionPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRetentionPolicyRequest, UpdateInstanceRetentionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceRetentionPolicyRequest.class,
                    UpdateInstanceRetentionPolicyResponse.class)
                .withName("UpdateInstanceRetentionPolicy")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/retention/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRetentionPolicyRequest::getInstanceId,
                UpdateInstanceRetentionPolicyRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRetentionPolicyRequest::getNamespaceName,
                UpdateInstanceRetentionPolicyRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateInstanceRetentionPolicyRequest::getPolicyId,
                UpdateInstanceRetentionPolicyRequest::setPolicyId));
        builder.<UpdateRetentionPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRetentionPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceRetentionPolicyRequest::getBody,
                UpdateInstanceRetentionPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceSignPolicyRequest, UpdateInstanceSignPolicyResponse> updateInstanceSignPolicy =
        genForUpdateInstanceSignPolicy();

    private static HttpRequestDef<UpdateInstanceSignPolicyRequest, UpdateInstanceSignPolicyResponse> genForUpdateInstanceSignPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceSignPolicyRequest, UpdateInstanceSignPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateInstanceSignPolicyRequest.class, UpdateInstanceSignPolicyResponse.class)
                .withName("UpdateInstanceSignPolicy")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/signature/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceSignPolicyRequest::getInstanceId,
                UpdateInstanceSignPolicyRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceSignPolicyRequest::getNamespaceName,
                UpdateInstanceSignPolicyRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateInstanceSignPolicyRequest::getPolicyId,
                UpdateInstanceSignPolicyRequest::setPolicyId));
        builder.<UpdateSignaturePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSignaturePolicyRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceSignPolicyRequest::getBody, UpdateInstanceSignPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceWebhookRequest, UpdateInstanceWebhookResponse> updateInstanceWebhook =
        genForUpdateInstanceWebhook();

    private static HttpRequestDef<UpdateInstanceWebhookRequest, UpdateInstanceWebhookResponse> genForUpdateInstanceWebhook() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceWebhookRequest, UpdateInstanceWebhookResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInstanceWebhookRequest.class, UpdateInstanceWebhookResponse.class)
            .withName("UpdateInstanceWebhook")
            .withUri(
                "/v2/{project_id}/instances/{instance_id}/namespaces/{namespace_name}/webhook/policies/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceWebhookRequest::getInstanceId,
                UpdateInstanceWebhookRequest::setInstanceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceWebhookRequest::getNamespaceName,
                UpdateInstanceWebhookRequest::setNamespaceName));
        builder.<Integer>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateInstanceWebhookRequest::getPolicyId,
                UpdateInstanceWebhookRequest::setPolicyId));
        builder.<UpdateWebhookPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWebhookPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceWebhookRequest::getBody, UpdateInstanceWebhookRequest::setBody));

        // response

        return builder.build();
    }

}
