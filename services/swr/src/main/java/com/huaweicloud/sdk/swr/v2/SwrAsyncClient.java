package com.huaweicloud.sdk.swr.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.swr.v2.model.AddDomainNameRequest;
import com.huaweicloud.sdk.swr.v2.model.AddDomainNameResponse;
import com.huaweicloud.sdk.swr.v2.model.CheckAgencyRequest;
import com.huaweicloud.sdk.swr.v2.model.CheckAgencyResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateAgencyRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateAgencyResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateAuthorizationTokenRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateAuthorizationTokenResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateImageSyncRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateImageSyncRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateImmutableRuleRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateImmutableRuleResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceEndpointPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceEndpointPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceInternalEndpointRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceInternalEndpointResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceLtCredentialRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceLtCredentialResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceNamespaceRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceNamespaceResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceRegistryRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceRegistryResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceReplicationPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceReplicationPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateInstanceRequest;
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
import com.huaweicloud.sdk.swr.v2.model.CreateManualImageSyncRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateManualImageSyncRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoDomainsRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoTagRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoTagResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateRetentionRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRetentionResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateSecretRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateSecretResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateSubResourceTagsRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateSubResourceTagsResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateTriggerRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateTriggerResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateUserRepositoryAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateUserRepositoryAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteDomainNameRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteDomainNameResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteImageSyncRepoRequest;
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
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceResourceTagsRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceResourceTagsResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceRetentionPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceRetentionPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceSignPolicyRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceSignPolicyResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceTagRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteInstanceTagResponse;
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
import com.huaweicloud.sdk.swr.v2.model.ListInstanceArtifactVulnerabilitiesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListInstanceArtifactVulnerabilitiesResponse;
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
import com.huaweicloud.sdk.swr.v2.model.ListSyncRegionsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListSyncRegionsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListTriggersDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListTriggersDetailsResponse;
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
import com.huaweicloud.sdk.swr.v2.model.ShowRepoTagRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowRepoTagResponse;
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
import com.huaweicloud.sdk.swr.v2.model.StartManualScanningRequest;
import com.huaweicloud.sdk.swr.v2.model.StartManualScanningResponse;
import com.huaweicloud.sdk.swr.v2.model.StopInstanceReplicationPolicyExecutionRequest;
import com.huaweicloud.sdk.swr.v2.model.StopInstanceReplicationPolicyExecutionResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateDomainNameRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateDomainNameResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateImmutableRuleRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateImmutableRuleResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateInstanceConfigurationRequest;
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
import com.huaweicloud.sdk.swr.v2.model.UpdateNamespaceAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateNamespaceAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoDomainsRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateRetentionRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateRetentionResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateTriggerRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateTriggerResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateUserRepositoryAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateUserRepositoryAuthResponse;

import java.util.concurrent.CompletableFuture;

public class SwrAsyncClient {

    protected HcClient hcClient;

    public SwrAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SwrAsyncClient> newBuilder() {
        ClientBuilder<SwrAsyncClient> clientBuilder = new ClientBuilder<>(SwrAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 查询委托是否存在
     *
     * 检查租户是否已委托SWR服务通过触发器功能调用CCE、CCI服务，一般由前端控制台自动调用，用户无需手动调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAgencyRequest 请求对象
     * @return CompletableFuture<CheckAgencyResponse>
     */
    public CompletableFuture<CheckAgencyResponse> checkAgencyAsync(CheckAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.checkAgency);
    }

    /**
     * 查询委托是否存在
     *
     * 检查租户是否已委托SWR服务通过触发器功能调用CCE、CCI服务，一般由前端控制台自动调用，用户无需手动调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAgencyRequest 请求对象
     * @return AsyncInvoker<CheckAgencyRequest, CheckAgencyResponse>
     */
    public AsyncInvoker<CheckAgencyRequest, CheckAgencyResponse> checkAgencyAsyncInvoker(CheckAgencyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.checkAgency, hcClient);
    }

    /**
     * 创建委托
     *
     * 租户首次使用SWR服务时创建SWR服务内部委托，一般由前端控制台自动调用，用户无需手动调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyRequest 请求对象
     * @return CompletableFuture<CreateAgencyResponse>
     */
    public CompletableFuture<CreateAgencyResponse> createAgencyAsync(CreateAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createAgency);
    }

    /**
     * 创建委托
     *
     * 租户首次使用SWR服务时创建SWR服务内部委托，一般由前端控制台自动调用，用户无需手动调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyRequest 请求对象
     * @return AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyAsyncInvoker(
        CreateAgencyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createAgency, hcClient);
    }

    /**
     * 生成增强型登录指令(新)
     *
     * 调用该接口，通过获取响应消息头的X-Swr-Dockerlogin的值及响应消息体的host值，可生成增强型登录指令,注：此接口只支持IAM新平面的调用方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizationTokenRequest 请求对象
     * @return CompletableFuture<CreateAuthorizationTokenResponse>
     */
    public CompletableFuture<CreateAuthorizationTokenResponse> createAuthorizationTokenAsync(
        CreateAuthorizationTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createAuthorizationToken);
    }

    /**
     * 生成增强型登录指令(新)
     *
     * 调用该接口，通过获取响应消息头的X-Swr-Dockerlogin的值及响应消息体的host值，可生成增强型登录指令,注：此接口只支持IAM新平面的调用方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizationTokenRequest 请求对象
     * @return AsyncInvoker<CreateAuthorizationTokenRequest, CreateAuthorizationTokenResponse>
     */
    public AsyncInvoker<CreateAuthorizationTokenRequest, CreateAuthorizationTokenResponse> createAuthorizationTokenAsyncInvoker(
        CreateAuthorizationTokenRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createAuthorizationToken, hcClient);
    }

    /**
     * 创建镜像自动同步任务
     *
     * 创建镜像自动同步任务，帮助您把最新推送的镜像自动同步到其他区域镜像仓库内。 镜像自动同步帮助您把最新推送的镜像自动同步到其他区域镜像仓库内，后期镜像有更新时，目标仓库的镜像也会自动更新，但已有的镜像不会自动同步。已有镜像的同步需要手动操作，详情请参见手动同步镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageSyncRepoRequest 请求对象
     * @return CompletableFuture<CreateImageSyncRepoResponse>
     */
    public CompletableFuture<CreateImageSyncRepoResponse> createImageSyncRepoAsync(CreateImageSyncRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createImageSyncRepo);
    }

    /**
     * 创建镜像自动同步任务
     *
     * 创建镜像自动同步任务，帮助您把最新推送的镜像自动同步到其他区域镜像仓库内。 镜像自动同步帮助您把最新推送的镜像自动同步到其他区域镜像仓库内，后期镜像有更新时，目标仓库的镜像也会自动更新，但已有的镜像不会自动同步。已有镜像的同步需要手动操作，详情请参见手动同步镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageSyncRepoRequest 请求对象
     * @return AsyncInvoker<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse>
     */
    public AsyncInvoker<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse> createImageSyncRepoAsyncInvoker(
        CreateImageSyncRepoRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createImageSyncRepo, hcClient);
    }

    /**
     * 手动同步镜像
     *
     * 对于镜像仓库已有的镜像，如果想在其他区域使用，需要手动触发镜像同步。 判断是否同步成功的方法如下：响应状态码为200，无报错信息，表示同步成功。通过SWR管理控制台或调用查询镜像仓库概要信息接口，在目标区域的目标组织下，若存在所同步的镜像版本表示同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualImageSyncRepoRequest 请求对象
     * @return CompletableFuture<CreateManualImageSyncRepoResponse>
     */
    public CompletableFuture<CreateManualImageSyncRepoResponse> createManualImageSyncRepoAsync(
        CreateManualImageSyncRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createManualImageSyncRepo);
    }

    /**
     * 手动同步镜像
     *
     * 对于镜像仓库已有的镜像，如果想在其他区域使用，需要手动触发镜像同步。 判断是否同步成功的方法如下：响应状态码为200，无报错信息，表示同步成功。通过SWR管理控制台或调用查询镜像仓库概要信息接口，在目标区域的目标组织下，若存在所同步的镜像版本表示同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualImageSyncRepoRequest 请求对象
     * @return AsyncInvoker<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse>
     */
    public AsyncInvoker<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse> createManualImageSyncRepoAsyncInvoker(
        CreateManualImageSyncRepoRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createManualImageSyncRepo, hcClient);
    }

    /**
     * 创建组织
     *
     * 创建组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNamespaceRequest 请求对象
     * @return CompletableFuture<CreateNamespaceResponse>
     */
    public CompletableFuture<CreateNamespaceResponse> createNamespaceAsync(CreateNamespaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createNamespace);
    }

    /**
     * 创建组织
     *
     * 创建组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNamespaceRequest 请求对象
     * @return AsyncInvoker<CreateNamespaceRequest, CreateNamespaceResponse>
     */
    public AsyncInvoker<CreateNamespaceRequest, CreateNamespaceResponse> createNamespaceAsyncInvoker(
        CreateNamespaceRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createNamespace, hcClient);
    }

    /**
     * 创建组织权限
     *
     * 创建组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNamespaceAuthRequest 请求对象
     * @return CompletableFuture<CreateNamespaceAuthResponse>
     */
    public CompletableFuture<CreateNamespaceAuthResponse> createNamespaceAuthAsync(CreateNamespaceAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createNamespaceAuth);
    }

    /**
     * 创建组织权限
     *
     * 创建组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNamespaceAuthRequest 请求对象
     * @return AsyncInvoker<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse>
     */
    public AsyncInvoker<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse> createNamespaceAuthAsyncInvoker(
        CreateNamespaceAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createNamespaceAuth, hcClient);
    }

    /**
     * 在组织下创建镜像仓库
     *
     * 在组织下创建镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoRequest 请求对象
     * @return CompletableFuture<CreateRepoResponse>
     */
    public CompletableFuture<CreateRepoResponse> createRepoAsync(CreateRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createRepo);
    }

    /**
     * 在组织下创建镜像仓库
     *
     * 在组织下创建镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoRequest 请求对象
     * @return AsyncInvoker<CreateRepoRequest, CreateRepoResponse>
     */
    public AsyncInvoker<CreateRepoRequest, CreateRepoResponse> createRepoAsyncInvoker(CreateRepoRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createRepo, hcClient);
    }

    /**
     * 创建共享帐号
     *
     * 创建共享帐号。镜像上传后，您可以共享私有镜像给其他帐号，并授予下载该镜像的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoDomainsRequest 请求对象
     * @return CompletableFuture<CreateRepoDomainsResponse>
     */
    public CompletableFuture<CreateRepoDomainsResponse> createRepoDomainsAsync(CreateRepoDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createRepoDomains);
    }

    /**
     * 创建共享帐号
     *
     * 创建共享帐号。镜像上传后，您可以共享私有镜像给其他帐号，并授予下载该镜像的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoDomainsRequest 请求对象
     * @return AsyncInvoker<CreateRepoDomainsRequest, CreateRepoDomainsResponse>
     */
    public AsyncInvoker<CreateRepoDomainsRequest, CreateRepoDomainsResponse> createRepoDomainsAsyncInvoker(
        CreateRepoDomainsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createRepoDomains, hcClient);
    }

    /**
     * 创建镜像tag
     *
     * 创建镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoTagRequest 请求对象
     * @return CompletableFuture<CreateRepoTagResponse>
     */
    public CompletableFuture<CreateRepoTagResponse> createRepoTagAsync(CreateRepoTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createRepoTag);
    }

    /**
     * 创建镜像tag
     *
     * 创建镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoTagRequest 请求对象
     * @return AsyncInvoker<CreateRepoTagRequest, CreateRepoTagResponse>
     */
    public AsyncInvoker<CreateRepoTagRequest, CreateRepoTagResponse> createRepoTagAsyncInvoker(
        CreateRepoTagRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createRepoTag, hcClient);
    }

    /**
     * 创建镜像老化规则
     *
     * 创建镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetentionRequest 请求对象
     * @return CompletableFuture<CreateRetentionResponse>
     */
    public CompletableFuture<CreateRetentionResponse> createRetentionAsync(CreateRetentionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createRetention);
    }

    /**
     * 创建镜像老化规则
     *
     * 创建镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetentionRequest 请求对象
     * @return AsyncInvoker<CreateRetentionRequest, CreateRetentionResponse>
     */
    public AsyncInvoker<CreateRetentionRequest, CreateRetentionResponse> createRetentionAsyncInvoker(
        CreateRetentionRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createRetention, hcClient);
    }

    /**
     * 生成临时登录指令
     *
     * 调用该接口，通过获取响应消息头的X-Swr-Dockerlogin的值及响应消息体的host值，可生成临时登录指令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretRequest 请求对象
     * @return CompletableFuture<CreateSecretResponse>
     */
    public CompletableFuture<CreateSecretResponse> createSecretAsync(CreateSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createSecret);
    }

    /**
     * 生成临时登录指令
     *
     * 调用该接口，通过获取响应消息头的X-Swr-Dockerlogin的值及响应消息体的host值，可生成临时登录指令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretRequest 请求对象
     * @return AsyncInvoker<CreateSecretRequest, CreateSecretResponse>
     */
    public AsyncInvoker<CreateSecretRequest, CreateSecretResponse> createSecretAsyncInvoker(
        CreateSecretRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createSecret, hcClient);
    }

    /**
     * 创建触发器
     *
     * 创建触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTriggerRequest 请求对象
     * @return CompletableFuture<CreateTriggerResponse>
     */
    public CompletableFuture<CreateTriggerResponse> createTriggerAsync(CreateTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createTrigger);
    }

    /**
     * 创建触发器
     *
     * 创建触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTriggerRequest 请求对象
     * @return AsyncInvoker<CreateTriggerRequest, CreateTriggerResponse>
     */
    public AsyncInvoker<CreateTriggerRequest, CreateTriggerResponse> createTriggerAsyncInvoker(
        CreateTriggerRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createTrigger, hcClient);
    }

    /**
     * 创建镜像权限
     *
     * 创建镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRepositoryAuthRequest 请求对象
     * @return CompletableFuture<CreateUserRepositoryAuthResponse>
     */
    public CompletableFuture<CreateUserRepositoryAuthResponse> createUserRepositoryAuthAsync(
        CreateUserRepositoryAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createUserRepositoryAuth);
    }

    /**
     * 创建镜像权限
     *
     * 创建镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRepositoryAuthRequest 请求对象
     * @return AsyncInvoker<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse>
     */
    public AsyncInvoker<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse> createUserRepositoryAuthAsyncInvoker(
        CreateUserRepositoryAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createUserRepositoryAuth, hcClient);
    }

    /**
     * 删除镜像自动同步任务
     *
     * 根据目标区域、目标组织删除指定的镜像自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageSyncRepoRequest 请求对象
     * @return CompletableFuture<DeleteImageSyncRepoResponse>
     */
    public CompletableFuture<DeleteImageSyncRepoResponse> deleteImageSyncRepoAsync(DeleteImageSyncRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteImageSyncRepo);
    }

    /**
     * 删除镜像自动同步任务
     *
     * 根据目标区域、目标组织删除指定的镜像自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageSyncRepoRequest 请求对象
     * @return AsyncInvoker<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse>
     */
    public AsyncInvoker<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse> deleteImageSyncRepoAsyncInvoker(
        DeleteImageSyncRepoRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteImageSyncRepo, hcClient);
    }

    /**
     * 删除组织权限
     *
     * 删除组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNamespaceAuthRequest 请求对象
     * @return CompletableFuture<DeleteNamespaceAuthResponse>
     */
    public CompletableFuture<DeleteNamespaceAuthResponse> deleteNamespaceAuthAsync(DeleteNamespaceAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteNamespaceAuth);
    }

    /**
     * 删除组织权限
     *
     * 删除组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNamespaceAuthRequest 请求对象
     * @return AsyncInvoker<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse>
     */
    public AsyncInvoker<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse> deleteNamespaceAuthAsyncInvoker(
        DeleteNamespaceAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteNamespaceAuth, hcClient);
    }

    /**
     * 删除组织
     *
     * 删除组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNamespacesRequest 请求对象
     * @return CompletableFuture<DeleteNamespacesResponse>
     */
    public CompletableFuture<DeleteNamespacesResponse> deleteNamespacesAsync(DeleteNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteNamespaces);
    }

    /**
     * 删除组织
     *
     * 删除组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNamespacesRequest 请求对象
     * @return AsyncInvoker<DeleteNamespacesRequest, DeleteNamespacesResponse>
     */
    public AsyncInvoker<DeleteNamespacesRequest, DeleteNamespacesResponse> deleteNamespacesAsyncInvoker(
        DeleteNamespacesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteNamespaces, hcClient);
    }

    /**
     * 删除组织下的镜像仓库
     *
     * 删除组织下的镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoRequest 请求对象
     * @return CompletableFuture<DeleteRepoResponse>
     */
    public CompletableFuture<DeleteRepoResponse> deleteRepoAsync(DeleteRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteRepo);
    }

    /**
     * 删除组织下的镜像仓库
     *
     * 删除组织下的镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoRequest 请求对象
     * @return AsyncInvoker<DeleteRepoRequest, DeleteRepoResponse>
     */
    public AsyncInvoker<DeleteRepoRequest, DeleteRepoResponse> deleteRepoAsyncInvoker(DeleteRepoRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteRepo, hcClient);
    }

    /**
     * 删除共享帐号
     *
     * 删除共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoDomainsRequest 请求对象
     * @return CompletableFuture<DeleteRepoDomainsResponse>
     */
    public CompletableFuture<DeleteRepoDomainsResponse> deleteRepoDomainsAsync(DeleteRepoDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteRepoDomains);
    }

    /**
     * 删除共享帐号
     *
     * 删除共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoDomainsRequest 请求对象
     * @return AsyncInvoker<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse>
     */
    public AsyncInvoker<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse> deleteRepoDomainsAsyncInvoker(
        DeleteRepoDomainsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteRepoDomains, hcClient);
    }

    /**
     * 删除指定tag的镜像
     *
     * 删除镜像仓库中指定tag的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoTagRequest 请求对象
     * @return CompletableFuture<DeleteRepoTagResponse>
     */
    public CompletableFuture<DeleteRepoTagResponse> deleteRepoTagAsync(DeleteRepoTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteRepoTag);
    }

    /**
     * 删除指定tag的镜像
     *
     * 删除镜像仓库中指定tag的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoTagRequest 请求对象
     * @return AsyncInvoker<DeleteRepoTagRequest, DeleteRepoTagResponse>
     */
    public AsyncInvoker<DeleteRepoTagRequest, DeleteRepoTagResponse> deleteRepoTagAsyncInvoker(
        DeleteRepoTagRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteRepoTag, hcClient);
    }

    /**
     * 删除镜像老化规则
     *
     * 删除镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRetentionRequest 请求对象
     * @return CompletableFuture<DeleteRetentionResponse>
     */
    public CompletableFuture<DeleteRetentionResponse> deleteRetentionAsync(DeleteRetentionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteRetention);
    }

    /**
     * 删除镜像老化规则
     *
     * 删除镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRetentionRequest 请求对象
     * @return AsyncInvoker<DeleteRetentionRequest, DeleteRetentionResponse>
     */
    public AsyncInvoker<DeleteRetentionRequest, DeleteRetentionResponse> deleteRetentionAsyncInvoker(
        DeleteRetentionRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteRetention, hcClient);
    }

    /**
     * 删除触发器
     *
     * 删除触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTriggerRequest 请求对象
     * @return CompletableFuture<DeleteTriggerResponse>
     */
    public CompletableFuture<DeleteTriggerResponse> deleteTriggerAsync(DeleteTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteTrigger);
    }

    /**
     * 删除触发器
     *
     * 删除触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTriggerRequest 请求对象
     * @return AsyncInvoker<DeleteTriggerRequest, DeleteTriggerResponse>
     */
    public AsyncInvoker<DeleteTriggerRequest, DeleteTriggerResponse> deleteTriggerAsyncInvoker(
        DeleteTriggerRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteTrigger, hcClient);
    }

    /**
     * 删除镜像权限
     *
     * 删除镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRepositoryAuthRequest 请求对象
     * @return CompletableFuture<DeleteUserRepositoryAuthResponse>
     */
    public CompletableFuture<DeleteUserRepositoryAuthResponse> deleteUserRepositoryAuthAsync(
        DeleteUserRepositoryAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteUserRepositoryAuth);
    }

    /**
     * 删除镜像权限
     *
     * 删除镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRepositoryAuthRequest 请求对象
     * @return AsyncInvoker<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse>
     */
    public AsyncInvoker<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse> deleteUserRepositoryAuthAsyncInvoker(
        DeleteUserRepositoryAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteUserRepositoryAuth, hcClient);
    }

    /**
     * 获取镜像自动同步任务列表
     *
     * 获取为当前镜像仓库所创建的所有自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageAutoSyncReposDetailsRequest 请求对象
     * @return CompletableFuture<ListImageAutoSyncReposDetailsResponse>
     */
    public CompletableFuture<ListImageAutoSyncReposDetailsResponse> listImageAutoSyncReposDetailsAsync(
        ListImageAutoSyncReposDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listImageAutoSyncReposDetails);
    }

    /**
     * 获取镜像自动同步任务列表
     *
     * 获取为当前镜像仓库所创建的所有自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageAutoSyncReposDetailsRequest 请求对象
     * @return AsyncInvoker<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse>
     */
    public AsyncInvoker<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse> listImageAutoSyncReposDetailsAsyncInvoker(
        ListImageAutoSyncReposDetailsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listImageAutoSyncReposDetails, hcClient);
    }

    /**
     * 查询组织列表
     *
     * 查询组织列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespacesRequest 请求对象
     * @return CompletableFuture<ListNamespacesResponse>
     */
    public CompletableFuture<ListNamespacesResponse> listNamespacesAsync(ListNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listNamespaces);
    }

    /**
     * 查询组织列表
     *
     * 查询组织列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespacesRequest 请求对象
     * @return AsyncInvoker<ListNamespacesRequest, ListNamespacesResponse>
     */
    public AsyncInvoker<ListNamespacesRequest, ListNamespacesResponse> listNamespacesAsyncInvoker(
        ListNamespacesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listNamespaces, hcClient);
    }

    /**
     * 获取配额信息
     *
     * 获取配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listQuotas);
    }

    /**
     * 获取配额信息
     *
     * 获取配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listQuotas, hcClient);
    }

    /**
     * 查询镜像仓库列表详情
     *
     * 查询镜像仓库列表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoDetailsRequest 请求对象
     * @return CompletableFuture<ListRepoDetailsResponse>
     */
    public CompletableFuture<ListRepoDetailsResponse> listRepoDetailsAsync(ListRepoDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listRepoDetails);
    }

    /**
     * 查询镜像仓库列表详情
     *
     * 查询镜像仓库列表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoDetailsRequest 请求对象
     * @return AsyncInvoker<ListRepoDetailsRequest, ListRepoDetailsResponse>
     */
    public AsyncInvoker<ListRepoDetailsRequest, ListRepoDetailsResponse> listRepoDetailsAsyncInvoker(
        ListRepoDetailsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listRepoDetails, hcClient);
    }

    /**
     * 获取共享帐号列表
     *
     * 获取共享帐号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoDomainsRequest 请求对象
     * @return CompletableFuture<ListRepoDomainsResponse>
     */
    public CompletableFuture<ListRepoDomainsResponse> listRepoDomainsAsync(ListRepoDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listRepoDomains);
    }

    /**
     * 获取共享帐号列表
     *
     * 获取共享帐号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoDomainsRequest 请求对象
     * @return AsyncInvoker<ListRepoDomainsRequest, ListRepoDomainsResponse>
     */
    public AsyncInvoker<ListRepoDomainsRequest, ListRepoDomainsResponse> listRepoDomainsAsyncInvoker(
        ListRepoDomainsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listRepoDomains, hcClient);
    }

    /**
     * 查询镜像仓库列表
     *
     * 查询镜像仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReposDetailsRequest 请求对象
     * @return CompletableFuture<ListReposDetailsResponse>
     */
    public CompletableFuture<ListReposDetailsResponse> listReposDetailsAsync(ListReposDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listReposDetails);
    }

    /**
     * 查询镜像仓库列表
     *
     * 查询镜像仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReposDetailsRequest 请求对象
     * @return AsyncInvoker<ListReposDetailsRequest, ListReposDetailsResponse>
     */
    public AsyncInvoker<ListReposDetailsRequest, ListReposDetailsResponse> listReposDetailsAsyncInvoker(
        ListReposDetailsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listReposDetails, hcClient);
    }

    /**
     * 查询镜像tag列表详情
     *
     * 查询镜像tag列表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryTagRequest 请求对象
     * @return CompletableFuture<ListRepositoryTagResponse>
     */
    public CompletableFuture<ListRepositoryTagResponse> listRepositoryTagAsync(ListRepositoryTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listRepositoryTag);
    }

    /**
     * 查询镜像tag列表详情
     *
     * 查询镜像tag列表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryTagRequest 请求对象
     * @return AsyncInvoker<ListRepositoryTagRequest, ListRepositoryTagResponse>
     */
    public AsyncInvoker<ListRepositoryTagRequest, ListRepositoryTagResponse> listRepositoryTagAsyncInvoker(
        ListRepositoryTagRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listRepositoryTag, hcClient);
    }

    /**
     * 查询镜像tag列表
     *
     * 查询镜像tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryTagsRequest 请求对象
     * @return CompletableFuture<ListRepositoryTagsResponse>
     */
    public CompletableFuture<ListRepositoryTagsResponse> listRepositoryTagsAsync(ListRepositoryTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listRepositoryTags);
    }

    /**
     * 查询镜像tag列表
     *
     * 查询镜像tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryTagsRequest 请求对象
     * @return AsyncInvoker<ListRepositoryTagsRequest, ListRepositoryTagsResponse>
     */
    public AsyncInvoker<ListRepositoryTagsRequest, ListRepositoryTagsResponse> listRepositoryTagsAsyncInvoker(
        ListRepositoryTagsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listRepositoryTags, hcClient);
    }

    /**
     * 获取镜像老化记录
     *
     * 获取镜像老化记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetentionHistoriesRequest 请求对象
     * @return CompletableFuture<ListRetentionHistoriesResponse>
     */
    public CompletableFuture<ListRetentionHistoriesResponse> listRetentionHistoriesAsync(
        ListRetentionHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listRetentionHistories);
    }

    /**
     * 获取镜像老化记录
     *
     * 获取镜像老化记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetentionHistoriesRequest 请求对象
     * @return AsyncInvoker<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse>
     */
    public AsyncInvoker<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse> listRetentionHistoriesAsyncInvoker(
        ListRetentionHistoriesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listRetentionHistories, hcClient);
    }

    /**
     * 获取镜像老化规则列表
     *
     * 获取镜像老化规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetentionsRequest 请求对象
     * @return CompletableFuture<ListRetentionsResponse>
     */
    public CompletableFuture<ListRetentionsResponse> listRetentionsAsync(ListRetentionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listRetentions);
    }

    /**
     * 获取镜像老化规则列表
     *
     * 获取镜像老化规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetentionsRequest 请求对象
     * @return AsyncInvoker<ListRetentionsRequest, ListRetentionsResponse>
     */
    public AsyncInvoker<ListRetentionsRequest, ListRetentionsResponse> listRetentionsAsyncInvoker(
        ListRetentionsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listRetentions, hcClient);
    }

    /**
     * 查询共享镜像列表详情
     *
     * 查询共享镜像列表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedRepoDetailsRequest 请求对象
     * @return CompletableFuture<ListSharedRepoDetailsResponse>
     */
    public CompletableFuture<ListSharedRepoDetailsResponse> listSharedRepoDetailsAsync(
        ListSharedRepoDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listSharedRepoDetails);
    }

    /**
     * 查询共享镜像列表详情
     *
     * 查询共享镜像列表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedRepoDetailsRequest 请求对象
     * @return AsyncInvoker<ListSharedRepoDetailsRequest, ListSharedRepoDetailsResponse>
     */
    public AsyncInvoker<ListSharedRepoDetailsRequest, ListSharedRepoDetailsResponse> listSharedRepoDetailsAsyncInvoker(
        ListSharedRepoDetailsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listSharedRepoDetails, hcClient);
    }

    /**
     * 查询共享镜像列表
     *
     * 查询共享镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedReposDetailsRequest 请求对象
     * @return CompletableFuture<ListSharedReposDetailsResponse>
     */
    public CompletableFuture<ListSharedReposDetailsResponse> listSharedReposDetailsAsync(
        ListSharedReposDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listSharedReposDetails);
    }

    /**
     * 查询共享镜像列表
     *
     * 查询共享镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedReposDetailsRequest 请求对象
     * @return AsyncInvoker<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse>
     */
    public AsyncInvoker<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse> listSharedReposDetailsAsyncInvoker(
        ListSharedReposDetailsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listSharedReposDetails, hcClient);
    }

    /**
     * 获取可进行镜像同步的区域列表
     *
     * 获取可进行镜像同步的区域列表，用户可以将镜像手动或自动同步到此接口返回的区域。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSyncRegionsRequest 请求对象
     * @return CompletableFuture<ListSyncRegionsResponse>
     */
    public CompletableFuture<ListSyncRegionsResponse> listSyncRegionsAsync(ListSyncRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listSyncRegions);
    }

    /**
     * 获取可进行镜像同步的区域列表
     *
     * 获取可进行镜像同步的区域列表，用户可以将镜像手动或自动同步到此接口返回的区域。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSyncRegionsRequest 请求对象
     * @return AsyncInvoker<ListSyncRegionsRequest, ListSyncRegionsResponse>
     */
    public AsyncInvoker<ListSyncRegionsRequest, ListSyncRegionsResponse> listSyncRegionsAsyncInvoker(
        ListSyncRegionsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listSyncRegions, hcClient);
    }

    /**
     * 获取镜像仓库下的触发器列表
     *
     * 获取镜像仓库下的触发器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTriggersDetailsRequest 请求对象
     * @return CompletableFuture<ListTriggersDetailsResponse>
     */
    public CompletableFuture<ListTriggersDetailsResponse> listTriggersDetailsAsync(ListTriggersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listTriggersDetails);
    }

    /**
     * 获取镜像仓库下的触发器列表
     *
     * 获取镜像仓库下的触发器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTriggersDetailsRequest 请求对象
     * @return AsyncInvoker<ListTriggersDetailsRequest, ListTriggersDetailsResponse>
     */
    public AsyncInvoker<ListTriggersDetailsRequest, ListTriggersDetailsResponse> listTriggersDetailsAsyncInvoker(
        ListTriggersDetailsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listTriggersDetails, hcClient);
    }

    /**
     * 判断共享帐号是否存在
     *
     * 判断共享租户是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessDomainRequest 请求对象
     * @return CompletableFuture<ShowAccessDomainResponse>
     */
    public CompletableFuture<ShowAccessDomainResponse> showAccessDomainAsync(ShowAccessDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showAccessDomain);
    }

    /**
     * 判断共享帐号是否存在
     *
     * 判断共享租户是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessDomainRequest 请求对象
     * @return AsyncInvoker<ShowAccessDomainRequest, ShowAccessDomainResponse>
     */
    public AsyncInvoker<ShowAccessDomainRequest, ShowAccessDomainResponse> showAccessDomainAsyncInvoker(
        ShowAccessDomainRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showAccessDomain, hcClient);
    }

    /**
     * 获取租户总览信息
     *
     * 获取租户总览信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainOverviewRequest 请求对象
     * @return CompletableFuture<ShowDomainOverviewResponse>
     */
    public CompletableFuture<ShowDomainOverviewResponse> showDomainOverviewAsync(ShowDomainOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showDomainOverview);
    }

    /**
     * 获取租户总览信息
     *
     * 获取租户总览信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainOverviewRequest 请求对象
     * @return AsyncInvoker<ShowDomainOverviewRequest, ShowDomainOverviewResponse>
     */
    public AsyncInvoker<ShowDomainOverviewRequest, ShowDomainOverviewResponse> showDomainOverviewAsyncInvoker(
        ShowDomainOverviewRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showDomainOverview, hcClient);
    }

    /**
     * 获取租户资源统计信息
     *
     * 获取租户资源统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainResourceReportsRequest 请求对象
     * @return CompletableFuture<ShowDomainResourceReportsResponse>
     */
    public CompletableFuture<ShowDomainResourceReportsResponse> showDomainResourceReportsAsync(
        ShowDomainResourceReportsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showDomainResourceReports);
    }

    /**
     * 获取租户资源统计信息
     *
     * 获取租户资源统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainResourceReportsRequest 请求对象
     * @return AsyncInvoker<ShowDomainResourceReportsRequest, ShowDomainResourceReportsResponse>
     */
    public AsyncInvoker<ShowDomainResourceReportsRequest, ShowDomainResourceReportsResponse> showDomainResourceReportsAsyncInvoker(
        ShowDomainResourceReportsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showDomainResourceReports, hcClient);
    }

    /**
     * 获取组织详情
     *
     * 获取组织详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNamespaceRequest 请求对象
     * @return CompletableFuture<ShowNamespaceResponse>
     */
    public CompletableFuture<ShowNamespaceResponse> showNamespaceAsync(ShowNamespaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showNamespace);
    }

    /**
     * 获取组织详情
     *
     * 获取组织详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNamespaceRequest 请求对象
     * @return AsyncInvoker<ShowNamespaceRequest, ShowNamespaceResponse>
     */
    public AsyncInvoker<ShowNamespaceRequest, ShowNamespaceResponse> showNamespaceAsyncInvoker(
        ShowNamespaceRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showNamespace, hcClient);
    }

    /**
     * 查询组织权限
     *
     * 查询组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNamespaceAuthRequest 请求对象
     * @return CompletableFuture<ShowNamespaceAuthResponse>
     */
    public CompletableFuture<ShowNamespaceAuthResponse> showNamespaceAuthAsync(ShowNamespaceAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showNamespaceAuth);
    }

    /**
     * 查询组织权限
     *
     * 查询组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNamespaceAuthRequest 请求对象
     * @return AsyncInvoker<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse>
     */
    public AsyncInvoker<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse> showNamespaceAuthAsyncInvoker(
        ShowNamespaceAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showNamespaceAuth, hcClient);
    }

    /**
     * 查询指定tag的镜像详情
     *
     * 查询镜像仓库中指定tag的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepoTagRequest 请求对象
     * @return CompletableFuture<ShowRepoTagResponse>
     */
    public CompletableFuture<ShowRepoTagResponse> showRepoTagAsync(ShowRepoTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showRepoTag);
    }

    /**
     * 查询指定tag的镜像详情
     *
     * 查询镜像仓库中指定tag的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepoTagRequest 请求对象
     * @return AsyncInvoker<ShowRepoTagRequest, ShowRepoTagResponse>
     */
    public AsyncInvoker<ShowRepoTagRequest, ShowRepoTagResponse> showRepoTagAsyncInvoker(ShowRepoTagRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showRepoTag, hcClient);
    }

    /**
     * 查询镜像仓库概要信息
     *
     * 查询镜像仓库概要信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryRequest 请求对象
     * @return CompletableFuture<ShowRepositoryResponse>
     */
    public CompletableFuture<ShowRepositoryResponse> showRepositoryAsync(ShowRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showRepository);
    }

    /**
     * 查询镜像仓库概要信息
     *
     * 查询镜像仓库概要信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse>
     */
    public AsyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse> showRepositoryAsyncInvoker(
        ShowRepositoryRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showRepository, hcClient);
    }

    /**
     * 获取镜像老化规则记录
     *
     * 获取镜像老化规则记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRetentionRequest 请求对象
     * @return CompletableFuture<ShowRetentionResponse>
     */
    public CompletableFuture<ShowRetentionResponse> showRetentionAsync(ShowRetentionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showRetention);
    }

    /**
     * 获取镜像老化规则记录
     *
     * 获取镜像老化规则记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRetentionRequest 请求对象
     * @return AsyncInvoker<ShowRetentionRequest, ShowRetentionResponse>
     */
    public AsyncInvoker<ShowRetentionRequest, ShowRetentionResponse> showRetentionAsyncInvoker(
        ShowRetentionRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showRetention, hcClient);
    }

    /**
     * 查询服务特性开关信息
     *
     * 查询服务特性开关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShareFeatureGatesRequest 请求对象
     * @return CompletableFuture<ShowShareFeatureGatesResponse>
     */
    public CompletableFuture<ShowShareFeatureGatesResponse> showShareFeatureGatesAsync(
        ShowShareFeatureGatesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showShareFeatureGates);
    }

    /**
     * 查询服务特性开关信息
     *
     * 查询服务特性开关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShareFeatureGatesRequest 请求对象
     * @return AsyncInvoker<ShowShareFeatureGatesRequest, ShowShareFeatureGatesResponse>
     */
    public AsyncInvoker<ShowShareFeatureGatesRequest, ShowShareFeatureGatesResponse> showShareFeatureGatesAsyncInvoker(
        ShowShareFeatureGatesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showShareFeatureGates, hcClient);
    }

    /**
     * 获取镜像自动同步任务信息
     *
     * 创建镜像自动同步任务后，可以通过此接口查询该任务的状态，以判断是否同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSyncJobRequest 请求对象
     * @return CompletableFuture<ShowSyncJobResponse>
     */
    public CompletableFuture<ShowSyncJobResponse> showSyncJobAsync(ShowSyncJobRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showSyncJob);
    }

    /**
     * 获取镜像自动同步任务信息
     *
     * 创建镜像自动同步任务后，可以通过此接口查询该任务的状态，以判断是否同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSyncJobRequest 请求对象
     * @return AsyncInvoker<ShowSyncJobRequest, ShowSyncJobResponse>
     */
    public AsyncInvoker<ShowSyncJobRequest, ShowSyncJobResponse> showSyncJobAsyncInvoker(ShowSyncJobRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showSyncJob, hcClient);
    }

    /**
     * 获取触发器详情
     *
     * 获取触发器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTriggerRequest 请求对象
     * @return CompletableFuture<ShowTriggerResponse>
     */
    public CompletableFuture<ShowTriggerResponse> showTriggerAsync(ShowTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showTrigger);
    }

    /**
     * 获取触发器详情
     *
     * 获取触发器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTriggerRequest 请求对象
     * @return AsyncInvoker<ShowTriggerRequest, ShowTriggerResponse>
     */
    public AsyncInvoker<ShowTriggerRequest, ShowTriggerResponse> showTriggerAsyncInvoker(ShowTriggerRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showTrigger, hcClient);
    }

    /**
     * 查询镜像权限
     *
     * 查询镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRepositoryAuthRequest 请求对象
     * @return CompletableFuture<ShowUserRepositoryAuthResponse>
     */
    public CompletableFuture<ShowUserRepositoryAuthResponse> showUserRepositoryAuthAsync(
        ShowUserRepositoryAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showUserRepositoryAuth);
    }

    /**
     * 查询镜像权限
     *
     * 查询镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRepositoryAuthRequest 请求对象
     * @return AsyncInvoker<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse>
     */
    public AsyncInvoker<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse> showUserRepositoryAuthAsyncInvoker(
        ShowUserRepositoryAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showUserRepositoryAuth, hcClient);
    }

    /**
     * 更新组织权限
     *
     * 更新组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNamespaceAuthRequest 请求对象
     * @return CompletableFuture<UpdateNamespaceAuthResponse>
     */
    public CompletableFuture<UpdateNamespaceAuthResponse> updateNamespaceAuthAsync(UpdateNamespaceAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateNamespaceAuth);
    }

    /**
     * 更新组织权限
     *
     * 更新组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNamespaceAuthRequest 请求对象
     * @return AsyncInvoker<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse>
     */
    public AsyncInvoker<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse> updateNamespaceAuthAsyncInvoker(
        UpdateNamespaceAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateNamespaceAuth, hcClient);
    }

    /**
     * 更新镜像仓库的概要信息
     *
     * 更新租户组织下的镜像概要信息，包括镜像类型、是否公有、描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoRequest 请求对象
     * @return CompletableFuture<UpdateRepoResponse>
     */
    public CompletableFuture<UpdateRepoResponse> updateRepoAsync(UpdateRepoRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateRepo);
    }

    /**
     * 更新镜像仓库的概要信息
     *
     * 更新租户组织下的镜像概要信息，包括镜像类型、是否公有、描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoRequest 请求对象
     * @return AsyncInvoker<UpdateRepoRequest, UpdateRepoResponse>
     */
    public AsyncInvoker<UpdateRepoRequest, UpdateRepoResponse> updateRepoAsyncInvoker(UpdateRepoRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateRepo, hcClient);
    }

    /**
     * 更新共享帐号
     *
     * 更新共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoDomainsRequest 请求对象
     * @return CompletableFuture<UpdateRepoDomainsResponse>
     */
    public CompletableFuture<UpdateRepoDomainsResponse> updateRepoDomainsAsync(UpdateRepoDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateRepoDomains);
    }

    /**
     * 更新共享帐号
     *
     * 更新共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoDomainsRequest 请求对象
     * @return AsyncInvoker<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse>
     */
    public AsyncInvoker<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse> updateRepoDomainsAsyncInvoker(
        UpdateRepoDomainsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateRepoDomains, hcClient);
    }

    /**
     * 修改镜像老化规则
     *
     * 修改镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRetentionRequest 请求对象
     * @return CompletableFuture<UpdateRetentionResponse>
     */
    public CompletableFuture<UpdateRetentionResponse> updateRetentionAsync(UpdateRetentionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateRetention);
    }

    /**
     * 修改镜像老化规则
     *
     * 修改镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRetentionRequest 请求对象
     * @return AsyncInvoker<UpdateRetentionRequest, UpdateRetentionResponse>
     */
    public AsyncInvoker<UpdateRetentionRequest, UpdateRetentionResponse> updateRetentionAsyncInvoker(
        UpdateRetentionRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateRetention, hcClient);
    }

    /**
     * 更新触发器配置
     *
     * 更新触发器配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTriggerRequest 请求对象
     * @return CompletableFuture<UpdateTriggerResponse>
     */
    public CompletableFuture<UpdateTriggerResponse> updateTriggerAsync(UpdateTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateTrigger);
    }

    /**
     * 更新触发器配置
     *
     * 更新触发器配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTriggerRequest 请求对象
     * @return AsyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse>
     */
    public AsyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse> updateTriggerAsyncInvoker(
        UpdateTriggerRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateTrigger, hcClient);
    }

    /**
     * 更新镜像权限
     *
     * 更新镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRepositoryAuthRequest 请求对象
     * @return CompletableFuture<UpdateUserRepositoryAuthResponse>
     */
    public CompletableFuture<UpdateUserRepositoryAuthResponse> updateUserRepositoryAuthAsync(
        UpdateUserRepositoryAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateUserRepositoryAuth);
    }

    /**
     * 更新镜像权限
     *
     * 更新镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRepositoryAuthRequest 请求对象
     * @return AsyncInvoker<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse>
     */
    public AsyncInvoker<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse> updateUserRepositoryAuthAsyncInvoker(
        UpdateUserRepositoryAuthRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateUserRepositoryAuth, hcClient);
    }

    /**
     * 查询所有API版本信息
     *
     * 查询所有API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listApiVersions);
    }

    /**
     * 查询所有API版本信息
     *
     * 查询所有API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showApiVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showApiVersion, hcClient);
    }

    /**
     * 增加域名
     *
     * 增加域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainNameRequest 请求对象
     * @return CompletableFuture<AddDomainNameResponse>
     */
    public CompletableFuture<AddDomainNameResponse> addDomainNameAsync(AddDomainNameRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.addDomainName);
    }

    /**
     * 增加域名
     *
     * 增加域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainNameRequest 请求对象
     * @return AsyncInvoker<AddDomainNameRequest, AddDomainNameResponse>
     */
    public AsyncInvoker<AddDomainNameRequest, AddDomainNameResponse> addDomainNameAsyncInvoker(
        AddDomainNameRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.addDomainName, hcClient);
    }

    /**
     * 创建不可变Tag策略
     *
     * 创建不可变Tag策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImmutableRuleRequest 请求对象
     * @return CompletableFuture<CreateImmutableRuleResponse>
     */
    public CompletableFuture<CreateImmutableRuleResponse> createImmutableRuleAsync(CreateImmutableRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createImmutableRule);
    }

    /**
     * 创建不可变Tag策略
     *
     * 创建不可变Tag策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImmutableRuleRequest 请求对象
     * @return AsyncInvoker<CreateImmutableRuleRequest, CreateImmutableRuleResponse>
     */
    public AsyncInvoker<CreateImmutableRuleRequest, CreateImmutableRuleResponse> createImmutableRuleAsyncInvoker(
        CreateImmutableRuleRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createImmutableRule, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建企业仓库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createInstance);
    }

    /**
     * 创建实例
     *
     * 创建企业仓库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createInstance, hcClient);
    }

    /**
     * 开启或关闭公网访问
     *
     * 开启或关闭公网访问
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceEndpointPolicyRequest 请求对象
     * @return CompletableFuture<CreateInstanceEndpointPolicyResponse>
     */
    public CompletableFuture<CreateInstanceEndpointPolicyResponse> createInstanceEndpointPolicyAsync(
        CreateInstanceEndpointPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createInstanceEndpointPolicy);
    }

    /**
     * 开启或关闭公网访问
     *
     * 开启或关闭公网访问
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceEndpointPolicyRequest 请求对象
     * @return AsyncInvoker<CreateInstanceEndpointPolicyRequest, CreateInstanceEndpointPolicyResponse>
     */
    public AsyncInvoker<CreateInstanceEndpointPolicyRequest, CreateInstanceEndpointPolicyResponse> createInstanceEndpointPolicyAsyncInvoker(
        CreateInstanceEndpointPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createInstanceEndpointPolicy, hcClient);
    }

    /**
     * 新增内网访问
     *
     * 新增内网访问
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceInternalEndpointRequest 请求对象
     * @return CompletableFuture<CreateInstanceInternalEndpointResponse>
     */
    public CompletableFuture<CreateInstanceInternalEndpointResponse> createInstanceInternalEndpointAsync(
        CreateInstanceInternalEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createInstanceInternalEndpoint);
    }

    /**
     * 新增内网访问
     *
     * 新增内网访问
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceInternalEndpointRequest 请求对象
     * @return AsyncInvoker<CreateInstanceInternalEndpointRequest, CreateInstanceInternalEndpointResponse>
     */
    public AsyncInvoker<CreateInstanceInternalEndpointRequest, CreateInstanceInternalEndpointResponse> createInstanceInternalEndpointAsyncInvoker(
        CreateInstanceInternalEndpointRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createInstanceInternalEndpoint, hcClient);
    }

    /**
     * 创建长期访问凭证
     *
     * 创建长期访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceLtCredentialRequest 请求对象
     * @return CompletableFuture<CreateInstanceLtCredentialResponse>
     */
    public CompletableFuture<CreateInstanceLtCredentialResponse> createInstanceLtCredentialAsync(
        CreateInstanceLtCredentialRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createInstanceLtCredential);
    }

    /**
     * 创建长期访问凭证
     *
     * 创建长期访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceLtCredentialRequest 请求对象
     * @return AsyncInvoker<CreateInstanceLtCredentialRequest, CreateInstanceLtCredentialResponse>
     */
    public AsyncInvoker<CreateInstanceLtCredentialRequest, CreateInstanceLtCredentialResponse> createInstanceLtCredentialAsyncInvoker(
        CreateInstanceLtCredentialRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createInstanceLtCredential, hcClient);
    }

    /**
     * 创建命名空间
     *
     * 创建命名空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceNamespaceRequest 请求对象
     * @return CompletableFuture<CreateInstanceNamespaceResponse>
     */
    public CompletableFuture<CreateInstanceNamespaceResponse> createInstanceNamespaceAsync(
        CreateInstanceNamespaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createInstanceNamespace);
    }

    /**
     * 创建命名空间
     *
     * 创建命名空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceNamespaceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceNamespaceRequest, CreateInstanceNamespaceResponse>
     */
    public AsyncInvoker<CreateInstanceNamespaceRequest, CreateInstanceNamespaceResponse> createInstanceNamespaceAsyncInvoker(
        CreateInstanceNamespaceRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createInstanceNamespace, hcClient);
    }

    /**
     * 创建镜像同步的目标仓库
     *
     * 创建镜像同步的目标仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRegistryRequest 请求对象
     * @return CompletableFuture<CreateInstanceRegistryResponse>
     */
    public CompletableFuture<CreateInstanceRegistryResponse> createInstanceRegistryAsync(
        CreateInstanceRegistryRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createInstanceRegistry);
    }

    /**
     * 创建镜像同步的目标仓库
     *
     * 创建镜像同步的目标仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRegistryRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRegistryRequest, CreateInstanceRegistryResponse>
     */
    public AsyncInvoker<CreateInstanceRegistryRequest, CreateInstanceRegistryResponse> createInstanceRegistryAsyncInvoker(
        CreateInstanceRegistryRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createInstanceRegistry, hcClient);
    }

    /**
     * 创建镜像同步策略
     *
     * 创建镜像同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceReplicationPolicyRequest 请求对象
     * @return CompletableFuture<CreateInstanceReplicationPolicyResponse>
     */
    public CompletableFuture<CreateInstanceReplicationPolicyResponse> createInstanceReplicationPolicyAsync(
        CreateInstanceReplicationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createInstanceReplicationPolicy);
    }

    /**
     * 创建镜像同步策略
     *
     * 创建镜像同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceReplicationPolicyRequest 请求对象
     * @return AsyncInvoker<CreateInstanceReplicationPolicyRequest, CreateInstanceReplicationPolicyResponse>
     */
    public AsyncInvoker<CreateInstanceReplicationPolicyRequest, CreateInstanceReplicationPolicyResponse> createInstanceReplicationPolicyAsyncInvoker(
        CreateInstanceReplicationPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createInstanceReplicationPolicy, hcClient);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceResourceTagsRequest 请求对象
     * @return CompletableFuture<CreateInstanceResourceTagsResponse>
     */
    public CompletableFuture<CreateInstanceResourceTagsResponse> createInstanceResourceTagsAsync(
        CreateInstanceResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createInstanceResourceTags);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceResourceTagsRequest 请求对象
     * @return AsyncInvoker<CreateInstanceResourceTagsRequest, CreateInstanceResourceTagsResponse>
     */
    public AsyncInvoker<CreateInstanceResourceTagsRequest, CreateInstanceResourceTagsResponse> createInstanceResourceTagsAsyncInvoker(
        CreateInstanceResourceTagsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createInstanceResourceTags, hcClient);
    }

    /**
     * 创建老化策略
     *
     * 创建老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRetentionPolicyRequest 请求对象
     * @return CompletableFuture<CreateInstanceRetentionPolicyResponse>
     */
    public CompletableFuture<CreateInstanceRetentionPolicyResponse> createInstanceRetentionPolicyAsync(
        CreateInstanceRetentionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createInstanceRetentionPolicy);
    }

    /**
     * 创建老化策略
     *
     * 创建老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRetentionPolicyRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRetentionPolicyRequest, CreateInstanceRetentionPolicyResponse>
     */
    public AsyncInvoker<CreateInstanceRetentionPolicyRequest, CreateInstanceRetentionPolicyResponse> createInstanceRetentionPolicyAsyncInvoker(
        CreateInstanceRetentionPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createInstanceRetentionPolicy, hcClient);
    }

    /**
     * 创建签名策略
     *
     * 创建签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceSignPolicyRequest 请求对象
     * @return CompletableFuture<CreateInstanceSignPolicyResponse>
     */
    public CompletableFuture<CreateInstanceSignPolicyResponse> createInstanceSignPolicyAsync(
        CreateInstanceSignPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createInstanceSignPolicy);
    }

    /**
     * 创建签名策略
     *
     * 创建签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceSignPolicyRequest 请求对象
     * @return AsyncInvoker<CreateInstanceSignPolicyRequest, CreateInstanceSignPolicyResponse>
     */
    public AsyncInvoker<CreateInstanceSignPolicyRequest, CreateInstanceSignPolicyResponse> createInstanceSignPolicyAsyncInvoker(
        CreateInstanceSignPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createInstanceSignPolicy, hcClient);
    }

    /**
     * 获取临时访问凭证
     *
     * 获取临时访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceTempCredentialRequest 请求对象
     * @return CompletableFuture<CreateInstanceTempCredentialResponse>
     */
    public CompletableFuture<CreateInstanceTempCredentialResponse> createInstanceTempCredentialAsync(
        CreateInstanceTempCredentialRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createInstanceTempCredential);
    }

    /**
     * 获取临时访问凭证
     *
     * 获取临时访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceTempCredentialRequest 请求对象
     * @return AsyncInvoker<CreateInstanceTempCredentialRequest, CreateInstanceTempCredentialResponse>
     */
    public AsyncInvoker<CreateInstanceTempCredentialRequest, CreateInstanceTempCredentialResponse> createInstanceTempCredentialAsyncInvoker(
        CreateInstanceTempCredentialRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createInstanceTempCredential, hcClient);
    }

    /**
     * 创建触发器
     *
     * 创建触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceWebhookRequest 请求对象
     * @return CompletableFuture<CreateInstanceWebhookResponse>
     */
    public CompletableFuture<CreateInstanceWebhookResponse> createInstanceWebhookAsync(
        CreateInstanceWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createInstanceWebhook);
    }

    /**
     * 创建触发器
     *
     * 创建触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceWebhookRequest 请求对象
     * @return AsyncInvoker<CreateInstanceWebhookRequest, CreateInstanceWebhookResponse>
     */
    public AsyncInvoker<CreateInstanceWebhookRequest, CreateInstanceWebhookResponse> createInstanceWebhookAsyncInvoker(
        CreateInstanceWebhookRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createInstanceWebhook, hcClient);
    }

    /**
     * 批量添加子资源标签
     *
     * 批量添加子资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubResourceTagsRequest 请求对象
     * @return CompletableFuture<CreateSubResourceTagsResponse>
     */
    public CompletableFuture<CreateSubResourceTagsResponse> createSubResourceTagsAsync(
        CreateSubResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.createSubResourceTags);
    }

    /**
     * 批量添加子资源标签
     *
     * 批量添加子资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubResourceTagsRequest 请求对象
     * @return AsyncInvoker<CreateSubResourceTagsRequest, CreateSubResourceTagsResponse>
     */
    public AsyncInvoker<CreateSubResourceTagsRequest, CreateSubResourceTagsResponse> createSubResourceTagsAsyncInvoker(
        CreateSubResourceTagsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.createSubResourceTags, hcClient);
    }

    /**
     * 删除域名
     *
     * 删除域名，SWR企业仓库的默认域名无法删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainNameRequest 请求对象
     * @return CompletableFuture<DeleteDomainNameResponse>
     */
    public CompletableFuture<DeleteDomainNameResponse> deleteDomainNameAsync(DeleteDomainNameRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteDomainName);
    }

    /**
     * 删除域名
     *
     * 删除域名，SWR企业仓库的默认域名无法删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainNameRequest 请求对象
     * @return AsyncInvoker<DeleteDomainNameRequest, DeleteDomainNameResponse>
     */
    public AsyncInvoker<DeleteDomainNameRequest, DeleteDomainNameResponse> deleteDomainNameAsyncInvoker(
        DeleteDomainNameRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteDomainName, hcClient);
    }

    /**
     * 删除不可变Tag策略
     *
     * 删除不可变Tag策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImmutableRuleRequest 请求对象
     * @return CompletableFuture<DeleteImmutableRuleResponse>
     */
    public CompletableFuture<DeleteImmutableRuleResponse> deleteImmutableRuleAsync(DeleteImmutableRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteImmutableRule);
    }

    /**
     * 删除不可变Tag策略
     *
     * 删除不可变Tag策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImmutableRuleRequest 请求对象
     * @return AsyncInvoker<DeleteImmutableRuleRequest, DeleteImmutableRuleResponse>
     */
    public AsyncInvoker<DeleteImmutableRuleRequest, DeleteImmutableRuleResponse> deleteImmutableRuleAsyncInvoker(
        DeleteImmutableRuleRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteImmutableRule, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteInstance, hcClient);
    }

    /**
     * 删除制品版本
     *
     * 删除制品版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceArtifactRequest 请求对象
     * @return CompletableFuture<DeleteInstanceArtifactResponse>
     */
    public CompletableFuture<DeleteInstanceArtifactResponse> deleteInstanceArtifactAsync(
        DeleteInstanceArtifactRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteInstanceArtifact);
    }

    /**
     * 删除制品版本
     *
     * 删除制品版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceArtifactRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceArtifactRequest, DeleteInstanceArtifactResponse>
     */
    public AsyncInvoker<DeleteInstanceArtifactRequest, DeleteInstanceArtifactResponse> deleteInstanceArtifactAsyncInvoker(
        DeleteInstanceArtifactRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteInstanceArtifact, hcClient);
    }

    /**
     * 删除内网访问
     *
     * 删除内网访问
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceInternalEndpointRequest 请求对象
     * @return CompletableFuture<DeleteInstanceInternalEndpointResponse>
     */
    public CompletableFuture<DeleteInstanceInternalEndpointResponse> deleteInstanceInternalEndpointAsync(
        DeleteInstanceInternalEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteInstanceInternalEndpoint);
    }

    /**
     * 删除内网访问
     *
     * 删除内网访问
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceInternalEndpointRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceInternalEndpointRequest, DeleteInstanceInternalEndpointResponse>
     */
    public AsyncInvoker<DeleteInstanceInternalEndpointRequest, DeleteInstanceInternalEndpointResponse> deleteInstanceInternalEndpointAsyncInvoker(
        DeleteInstanceInternalEndpointRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteInstanceInternalEndpoint, hcClient);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceJobRequest 请求对象
     * @return CompletableFuture<DeleteInstanceJobResponse>
     */
    public CompletableFuture<DeleteInstanceJobResponse> deleteInstanceJobAsync(DeleteInstanceJobRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteInstanceJob);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceJobRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceJobRequest, DeleteInstanceJobResponse>
     */
    public AsyncInvoker<DeleteInstanceJobRequest, DeleteInstanceJobResponse> deleteInstanceJobAsyncInvoker(
        DeleteInstanceJobRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteInstanceJob, hcClient);
    }

    /**
     * 删除长期访问凭证
     *
     * 删除长期访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceLtCredentialRequest 请求对象
     * @return CompletableFuture<DeleteInstanceLtCredentialResponse>
     */
    public CompletableFuture<DeleteInstanceLtCredentialResponse> deleteInstanceLtCredentialAsync(
        DeleteInstanceLtCredentialRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteInstanceLtCredential);
    }

    /**
     * 删除长期访问凭证
     *
     * 删除长期访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceLtCredentialRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceLtCredentialRequest, DeleteInstanceLtCredentialResponse>
     */
    public AsyncInvoker<DeleteInstanceLtCredentialRequest, DeleteInstanceLtCredentialResponse> deleteInstanceLtCredentialAsyncInvoker(
        DeleteInstanceLtCredentialRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteInstanceLtCredential, hcClient);
    }

    /**
     * 删除命名空间
     *
     * 删除命名空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceNamespaceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceNamespaceResponse>
     */
    public CompletableFuture<DeleteInstanceNamespaceResponse> deleteInstanceNamespaceAsync(
        DeleteInstanceNamespaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteInstanceNamespace);
    }

    /**
     * 删除命名空间
     *
     * 删除命名空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceNamespaceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceNamespaceRequest, DeleteInstanceNamespaceResponse>
     */
    public AsyncInvoker<DeleteInstanceNamespaceRequest, DeleteInstanceNamespaceResponse> deleteInstanceNamespaceAsyncInvoker(
        DeleteInstanceNamespaceRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteInstanceNamespace, hcClient);
    }

    /**
     * 删除镜像同步的目标仓库
     *
     * 删除同步仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRegistryRequest 请求对象
     * @return CompletableFuture<DeleteInstanceRegistryResponse>
     */
    public CompletableFuture<DeleteInstanceRegistryResponse> deleteInstanceRegistryAsync(
        DeleteInstanceRegistryRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteInstanceRegistry);
    }

    /**
     * 删除镜像同步的目标仓库
     *
     * 删除同步仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRegistryRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRegistryRequest, DeleteInstanceRegistryResponse>
     */
    public AsyncInvoker<DeleteInstanceRegistryRequest, DeleteInstanceRegistryResponse> deleteInstanceRegistryAsyncInvoker(
        DeleteInstanceRegistryRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteInstanceRegistry, hcClient);
    }

    /**
     * 删除镜像同步策略
     *
     * 删除镜像同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceReplicationPolicyRequest 请求对象
     * @return CompletableFuture<DeleteInstanceReplicationPolicyResponse>
     */
    public CompletableFuture<DeleteInstanceReplicationPolicyResponse> deleteInstanceReplicationPolicyAsync(
        DeleteInstanceReplicationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteInstanceReplicationPolicy);
    }

    /**
     * 删除镜像同步策略
     *
     * 删除镜像同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceReplicationPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceReplicationPolicyRequest, DeleteInstanceReplicationPolicyResponse>
     */
    public AsyncInvoker<DeleteInstanceReplicationPolicyRequest, DeleteInstanceReplicationPolicyResponse> deleteInstanceReplicationPolicyAsyncInvoker(
        DeleteInstanceReplicationPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteInstanceReplicationPolicy, hcClient);
    }

    /**
     * 删除制品仓库
     *
     * 删除仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRepositoryRequest 请求对象
     * @return CompletableFuture<DeleteInstanceRepositoryResponse>
     */
    public CompletableFuture<DeleteInstanceRepositoryResponse> deleteInstanceRepositoryAsync(
        DeleteInstanceRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteInstanceRepository);
    }

    /**
     * 删除制品仓库
     *
     * 删除仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRepositoryRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRepositoryRequest, DeleteInstanceRepositoryResponse>
     */
    public AsyncInvoker<DeleteInstanceRepositoryRequest, DeleteInstanceRepositoryResponse> deleteInstanceRepositoryAsyncInvoker(
        DeleteInstanceRepositoryRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteInstanceRepository, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceResourceTagsRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResourceTagsResponse>
     */
    public CompletableFuture<DeleteInstanceResourceTagsResponse> deleteInstanceResourceTagsAsync(
        DeleteInstanceResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteInstanceResourceTags);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceResourceTagsRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceResourceTagsRequest, DeleteInstanceResourceTagsResponse>
     */
    public AsyncInvoker<DeleteInstanceResourceTagsRequest, DeleteInstanceResourceTagsResponse> deleteInstanceResourceTagsAsyncInvoker(
        DeleteInstanceResourceTagsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteInstanceResourceTags, hcClient);
    }

    /**
     * 删除老化策略
     *
     * 删除老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRetentionPolicyRequest 请求对象
     * @return CompletableFuture<DeleteInstanceRetentionPolicyResponse>
     */
    public CompletableFuture<DeleteInstanceRetentionPolicyResponse> deleteInstanceRetentionPolicyAsync(
        DeleteInstanceRetentionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteInstanceRetentionPolicy);
    }

    /**
     * 删除老化策略
     *
     * 删除老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRetentionPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRetentionPolicyRequest, DeleteInstanceRetentionPolicyResponse>
     */
    public AsyncInvoker<DeleteInstanceRetentionPolicyRequest, DeleteInstanceRetentionPolicyResponse> deleteInstanceRetentionPolicyAsyncInvoker(
        DeleteInstanceRetentionPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteInstanceRetentionPolicy, hcClient);
    }

    /**
     * 删除签名策略
     *
     * 删除签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceSignPolicyRequest 请求对象
     * @return CompletableFuture<DeleteInstanceSignPolicyResponse>
     */
    public CompletableFuture<DeleteInstanceSignPolicyResponse> deleteInstanceSignPolicyAsync(
        DeleteInstanceSignPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteInstanceSignPolicy);
    }

    /**
     * 删除签名策略
     *
     * 删除签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceSignPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceSignPolicyRequest, DeleteInstanceSignPolicyResponse>
     */
    public AsyncInvoker<DeleteInstanceSignPolicyRequest, DeleteInstanceSignPolicyResponse> deleteInstanceSignPolicyAsyncInvoker(
        DeleteInstanceSignPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteInstanceSignPolicy, hcClient);
    }

    /**
     * 删除制品的Tag
     *
     * 删除制品Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceTagRequest 请求对象
     * @return CompletableFuture<DeleteInstanceTagResponse>
     */
    public CompletableFuture<DeleteInstanceTagResponse> deleteInstanceTagAsync(DeleteInstanceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteInstanceTag);
    }

    /**
     * 删除制品的Tag
     *
     * 删除制品Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceTagRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceTagRequest, DeleteInstanceTagResponse>
     */
    public AsyncInvoker<DeleteInstanceTagRequest, DeleteInstanceTagResponse> deleteInstanceTagAsyncInvoker(
        DeleteInstanceTagRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteInstanceTag, hcClient);
    }

    /**
     * 删除触发器
     *
     * 删除触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceWebhookRequest 请求对象
     * @return CompletableFuture<DeleteInstanceWebhookResponse>
     */
    public CompletableFuture<DeleteInstanceWebhookResponse> deleteInstanceWebhookAsync(
        DeleteInstanceWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteInstanceWebhook);
    }

    /**
     * 删除触发器
     *
     * 删除触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceWebhookRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceWebhookRequest, DeleteInstanceWebhookResponse>
     */
    public AsyncInvoker<DeleteInstanceWebhookRequest, DeleteInstanceWebhookResponse> deleteInstanceWebhookAsyncInvoker(
        DeleteInstanceWebhookRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteInstanceWebhook, hcClient);
    }

    /**
     * 批量删除子资源标签
     *
     * 批量删除子资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubResourceTagsRequest 请求对象
     * @return CompletableFuture<DeleteSubResourceTagsResponse>
     */
    public CompletableFuture<DeleteSubResourceTagsResponse> deleteSubResourceTagsAsync(
        DeleteSubResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.deleteSubResourceTags);
    }

    /**
     * 批量删除子资源标签
     *
     * 批量删除子资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubResourceTagsRequest 请求对象
     * @return AsyncInvoker<DeleteSubResourceTagsRequest, DeleteSubResourceTagsResponse>
     */
    public AsyncInvoker<DeleteSubResourceTagsRequest, DeleteSubResourceTagsResponse> deleteSubResourceTagsAsyncInvoker(
        DeleteSubResourceTagsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.deleteSubResourceTags, hcClient);
    }

    /**
     * 手动执行镜像同步策略
     *
     * 手动执行同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceReplicationPolicyRequest 请求对象
     * @return CompletableFuture<ExecuteInstanceReplicationPolicyResponse>
     */
    public CompletableFuture<ExecuteInstanceReplicationPolicyResponse> executeInstanceReplicationPolicyAsync(
        ExecuteInstanceReplicationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.executeInstanceReplicationPolicy);
    }

    /**
     * 手动执行镜像同步策略
     *
     * 手动执行同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceReplicationPolicyRequest 请求对象
     * @return AsyncInvoker<ExecuteInstanceReplicationPolicyRequest, ExecuteInstanceReplicationPolicyResponse>
     */
    public AsyncInvoker<ExecuteInstanceReplicationPolicyRequest, ExecuteInstanceReplicationPolicyResponse> executeInstanceReplicationPolicyAsyncInvoker(
        ExecuteInstanceReplicationPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.executeInstanceReplicationPolicy, hcClient);
    }

    /**
     * 执行老化策略
     *
     * 执行老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceRetentionPolicyRequest 请求对象
     * @return CompletableFuture<ExecuteInstanceRetentionPolicyResponse>
     */
    public CompletableFuture<ExecuteInstanceRetentionPolicyResponse> executeInstanceRetentionPolicyAsync(
        ExecuteInstanceRetentionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.executeInstanceRetentionPolicy);
    }

    /**
     * 执行老化策略
     *
     * 执行老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceRetentionPolicyRequest 请求对象
     * @return AsyncInvoker<ExecuteInstanceRetentionPolicyRequest, ExecuteInstanceRetentionPolicyResponse>
     */
    public AsyncInvoker<ExecuteInstanceRetentionPolicyRequest, ExecuteInstanceRetentionPolicyResponse> executeInstanceRetentionPolicyAsyncInvoker(
        ExecuteInstanceRetentionPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.executeInstanceRetentionPolicy, hcClient);
    }

    /**
     * 手动执行签名策略
     *
     * 手动执行签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceSignPolicyRequest 请求对象
     * @return CompletableFuture<ExecuteInstanceSignPolicyResponse>
     */
    public CompletableFuture<ExecuteInstanceSignPolicyResponse> executeInstanceSignPolicyAsync(
        ExecuteInstanceSignPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.executeInstanceSignPolicy);
    }

    /**
     * 手动执行签名策略
     *
     * 手动执行签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceSignPolicyRequest 请求对象
     * @return AsyncInvoker<ExecuteInstanceSignPolicyRequest, ExecuteInstanceSignPolicyResponse>
     */
    public AsyncInvoker<ExecuteInstanceSignPolicyRequest, ExecuteInstanceSignPolicyResponse> executeInstanceSignPolicyAsyncInvoker(
        ExecuteInstanceSignPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.executeInstanceSignPolicy, hcClient);
    }

    /**
     * 获取上传下载的相关审计日志列表
     *
     * 获取上传下载的相关审计日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditLogsRequest 请求对象
     * @return CompletableFuture<ListAuditLogsResponse>
     */
    public CompletableFuture<ListAuditLogsResponse> listAuditLogsAsync(ListAuditLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listAuditLogs);
    }

    /**
     * 获取上传下载的相关审计日志列表
     *
     * 获取上传下载的相关审计日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditLogsRequest 请求对象
     * @return AsyncInvoker<ListAuditLogsRequest, ListAuditLogsResponse>
     */
    public AsyncInvoker<ListAuditLogsRequest, ListAuditLogsResponse> listAuditLogsAsyncInvoker(
        ListAuditLogsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listAuditLogs, hcClient);
    }

    /**
     * 查询所有域名列表
     *
     * 查询当前实例的所有域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainNamesRequest 请求对象
     * @return CompletableFuture<ListDomainNamesResponse>
     */
    public CompletableFuture<ListDomainNamesResponse> listDomainNamesAsync(ListDomainNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listDomainNames);
    }

    /**
     * 查询所有域名列表
     *
     * 查询当前实例的所有域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainNamesRequest 请求对象
     * @return AsyncInvoker<ListDomainNamesRequest, ListDomainNamesResponse>
     */
    public AsyncInvoker<ListDomainNamesRequest, ListDomainNamesResponse> listDomainNamesAsyncInvoker(
        ListDomainNamesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listDomainNames, hcClient);
    }

    /**
     * 查询特性开关信息
     *
     * 查询特性开关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeatureGatesRequest 请求对象
     * @return CompletableFuture<ListFeatureGatesResponse>
     */
    public CompletableFuture<ListFeatureGatesResponse> listFeatureGatesAsync(ListFeatureGatesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listFeatureGates);
    }

    /**
     * 查询特性开关信息
     *
     * 查询特性开关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeatureGatesRequest 请求对象
     * @return AsyncInvoker<ListFeatureGatesRequest, ListFeatureGatesResponse>
     */
    public AsyncInvoker<ListFeatureGatesRequest, ListFeatureGatesResponse> listFeatureGatesAsyncInvoker(
        ListFeatureGatesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listFeatureGates, hcClient);
    }

    /**
     * 查询全局特性开关信息
     *
     * 查询全局特性开关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalFeatureGatesRequest 请求对象
     * @return CompletableFuture<ListGlobalFeatureGatesResponse>
     */
    public CompletableFuture<ListGlobalFeatureGatesResponse> listGlobalFeatureGatesAsync(
        ListGlobalFeatureGatesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listGlobalFeatureGates);
    }

    /**
     * 查询全局特性开关信息
     *
     * 查询全局特性开关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalFeatureGatesRequest 请求对象
     * @return AsyncInvoker<ListGlobalFeatureGatesRequest, ListGlobalFeatureGatesResponse>
     */
    public AsyncInvoker<ListGlobalFeatureGatesRequest, ListGlobalFeatureGatesResponse> listGlobalFeatureGatesAsyncInvoker(
        ListGlobalFeatureGatesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listGlobalFeatureGates, hcClient);
    }

    /**
     * 获取不可变Tag策略列表
     *
     * 获取不可变Tag策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImmutableRulesRequest 请求对象
     * @return CompletableFuture<ListImmutableRulesResponse>
     */
    public CompletableFuture<ListImmutableRulesResponse> listImmutableRulesAsync(ListImmutableRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listImmutableRules);
    }

    /**
     * 获取不可变Tag策略列表
     *
     * 获取不可变Tag策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImmutableRulesRequest 请求对象
     * @return AsyncInvoker<ListImmutableRulesRequest, ListImmutableRulesResponse>
     */
    public AsyncInvoker<ListImmutableRulesRequest, ListImmutableRulesResponse> listImmutableRulesAsyncInvoker(
        ListImmutableRulesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listImmutableRules, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 查询实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRequest 请求对象
     * @return CompletableFuture<ListInstanceResponse>
     */
    public CompletableFuture<ListInstanceResponse> listInstanceAsync(ListInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstance);
    }

    /**
     * 查询实例列表
     *
     * 查询实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRequest 请求对象
     * @return AsyncInvoker<ListInstanceRequest, ListInstanceResponse>
     */
    public AsyncInvoker<ListInstanceRequest, ListInstanceResponse> listInstanceAsyncInvoker(
        ListInstanceRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstance, hcClient);
    }

    /**
     * 获取制品附件列表
     *
     * 获取制品附件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceAccessoriesRequest 请求对象
     * @return CompletableFuture<ListInstanceAccessoriesResponse>
     */
    public CompletableFuture<ListInstanceAccessoriesResponse> listInstanceAccessoriesAsync(
        ListInstanceAccessoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceAccessories);
    }

    /**
     * 获取制品附件列表
     *
     * 获取制品附件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceAccessoriesRequest 请求对象
     * @return AsyncInvoker<ListInstanceAccessoriesRequest, ListInstanceAccessoriesResponse>
     */
    public AsyncInvoker<ListInstanceAccessoriesRequest, ListInstanceAccessoriesResponse> listInstanceAccessoriesAsyncInvoker(
        ListInstanceAccessoriesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceAccessories, hcClient);
    }

    /**
     * 获取仓库实例的所有制品版本列表
     *
     * 获取仓库实例的所有制品版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceAllArtifactsRequest 请求对象
     * @return CompletableFuture<ListInstanceAllArtifactsResponse>
     */
    public CompletableFuture<ListInstanceAllArtifactsResponse> listInstanceAllArtifactsAsync(
        ListInstanceAllArtifactsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceAllArtifacts);
    }

    /**
     * 获取仓库实例的所有制品版本列表
     *
     * 获取仓库实例的所有制品版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceAllArtifactsRequest 请求对象
     * @return AsyncInvoker<ListInstanceAllArtifactsRequest, ListInstanceAllArtifactsResponse>
     */
    public AsyncInvoker<ListInstanceAllArtifactsRequest, ListInstanceAllArtifactsResponse> listInstanceAllArtifactsAsyncInvoker(
        ListInstanceAllArtifactsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceAllArtifacts, hcClient);
    }

    /**
     * 获取制品扫描的漏洞信息
     *
     * 获取制品扫描的漏洞信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceArtifactVulnerabilitiesRequest 请求对象
     * @return CompletableFuture<ListInstanceArtifactVulnerabilitiesResponse>
     */
    public CompletableFuture<ListInstanceArtifactVulnerabilitiesResponse> listInstanceArtifactVulnerabilitiesAsync(
        ListInstanceArtifactVulnerabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceArtifactVulnerabilities);
    }

    /**
     * 获取制品扫描的漏洞信息
     *
     * 获取制品扫描的漏洞信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceArtifactVulnerabilitiesRequest 请求对象
     * @return AsyncInvoker<ListInstanceArtifactVulnerabilitiesRequest, ListInstanceArtifactVulnerabilitiesResponse>
     */
    public AsyncInvoker<ListInstanceArtifactVulnerabilitiesRequest, ListInstanceArtifactVulnerabilitiesResponse> listInstanceArtifactVulnerabilitiesAsyncInvoker(
        ListInstanceArtifactVulnerabilitiesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceArtifactVulnerabilities, hcClient);
    }

    /**
     * 获取制品版本列表
     *
     * 获取制品版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceArtifactsRequest 请求对象
     * @return CompletableFuture<ListInstanceArtifactsResponse>
     */
    public CompletableFuture<ListInstanceArtifactsResponse> listInstanceArtifactsAsync(
        ListInstanceArtifactsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceArtifacts);
    }

    /**
     * 获取制品版本列表
     *
     * 获取制品版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceArtifactsRequest 请求对象
     * @return AsyncInvoker<ListInstanceArtifactsRequest, ListInstanceArtifactsResponse>
     */
    public AsyncInvoker<ListInstanceArtifactsRequest, ListInstanceArtifactsResponse> listInstanceArtifactsAsyncInvoker(
        ListInstanceArtifactsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceArtifacts, hcClient);
    }

    /**
     * 获取内网访问列表
     *
     * 获取内网访问列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceInternalEndpointsRequest 请求对象
     * @return CompletableFuture<ListInstanceInternalEndpointsResponse>
     */
    public CompletableFuture<ListInstanceInternalEndpointsResponse> listInstanceInternalEndpointsAsync(
        ListInstanceInternalEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceInternalEndpoints);
    }

    /**
     * 获取内网访问列表
     *
     * 获取内网访问列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceInternalEndpointsRequest 请求对象
     * @return AsyncInvoker<ListInstanceInternalEndpointsRequest, ListInstanceInternalEndpointsResponse>
     */
    public AsyncInvoker<ListInstanceInternalEndpointsRequest, ListInstanceInternalEndpointsResponse> listInstanceInternalEndpointsAsyncInvoker(
        ListInstanceInternalEndpointsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceInternalEndpoints, hcClient);
    }

    /**
     * 获取任务列表
     *
     * 获取任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceJobsRequest 请求对象
     * @return CompletableFuture<ListInstanceJobsResponse>
     */
    public CompletableFuture<ListInstanceJobsResponse> listInstanceJobsAsync(ListInstanceJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceJobs);
    }

    /**
     * 获取任务列表
     *
     * 获取任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceJobsRequest 请求对象
     * @return AsyncInvoker<ListInstanceJobsRequest, ListInstanceJobsResponse>
     */
    public AsyncInvoker<ListInstanceJobsRequest, ListInstanceJobsResponse> listInstanceJobsAsyncInvoker(
        ListInstanceJobsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceJobs, hcClient);
    }

    /**
     * 查询长期访问凭证列表
     *
     * 查询长期访问凭证列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceLtCredentialsRequest 请求对象
     * @return CompletableFuture<ListInstanceLtCredentialsResponse>
     */
    public CompletableFuture<ListInstanceLtCredentialsResponse> listInstanceLtCredentialsAsync(
        ListInstanceLtCredentialsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceLtCredentials);
    }

    /**
     * 查询长期访问凭证列表
     *
     * 查询长期访问凭证列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceLtCredentialsRequest 请求对象
     * @return AsyncInvoker<ListInstanceLtCredentialsRequest, ListInstanceLtCredentialsResponse>
     */
    public AsyncInvoker<ListInstanceLtCredentialsRequest, ListInstanceLtCredentialsResponse> listInstanceLtCredentialsAsyncInvoker(
        ListInstanceLtCredentialsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceLtCredentials, hcClient);
    }

    /**
     * 获取命名空间列表
     *
     * 获取命名空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceNamespacesRequest 请求对象
     * @return CompletableFuture<ListInstanceNamespacesResponse>
     */
    public CompletableFuture<ListInstanceNamespacesResponse> listInstanceNamespacesAsync(
        ListInstanceNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceNamespaces);
    }

    /**
     * 获取命名空间列表
     *
     * 获取命名空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceNamespacesRequest 请求对象
     * @return AsyncInvoker<ListInstanceNamespacesRequest, ListInstanceNamespacesResponse>
     */
    public AsyncInvoker<ListInstanceNamespacesRequest, ListInstanceNamespacesResponse> listInstanceNamespacesAsyncInvoker(
        ListInstanceNamespacesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceNamespaces, hcClient);
    }

    /**
     * 查询项目下所有实例标签
     *
     * 查询项目下所有实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceProjectTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceProjectTagsResponse>
     */
    public CompletableFuture<ListInstanceProjectTagsResponse> listInstanceProjectTagsAsync(
        ListInstanceProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceProjectTags);
    }

    /**
     * 查询项目下所有实例标签
     *
     * 查询项目下所有实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceProjectTagsRequest, ListInstanceProjectTagsResponse>
     */
    public AsyncInvoker<ListInstanceProjectTagsRequest, ListInstanceProjectTagsResponse> listInstanceProjectTagsAsyncInvoker(
        ListInstanceProjectTagsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceProjectTags, hcClient);
    }

    /**
     * 获取镜像同步的目标仓库列表
     *
     * 获取镜像同步的目标仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRegistriesRequest 请求对象
     * @return CompletableFuture<ListInstanceRegistriesResponse>
     */
    public CompletableFuture<ListInstanceRegistriesResponse> listInstanceRegistriesAsync(
        ListInstanceRegistriesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceRegistries);
    }

    /**
     * 获取镜像同步的目标仓库列表
     *
     * 获取镜像同步的目标仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRegistriesRequest 请求对象
     * @return AsyncInvoker<ListInstanceRegistriesRequest, ListInstanceRegistriesResponse>
     */
    public AsyncInvoker<ListInstanceRegistriesRequest, ListInstanceRegistriesResponse> listInstanceRegistriesAsyncInvoker(
        ListInstanceRegistriesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceRegistries, hcClient);
    }

    /**
     * 获取镜像同步策略列表
     *
     * 获取镜像同步策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPoliciesRequest 请求对象
     * @return CompletableFuture<ListInstanceReplicationPoliciesResponse>
     */
    public CompletableFuture<ListInstanceReplicationPoliciesResponse> listInstanceReplicationPoliciesAsync(
        ListInstanceReplicationPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceReplicationPolicies);
    }

    /**
     * 获取镜像同步策略列表
     *
     * 获取镜像同步策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPoliciesRequest 请求对象
     * @return AsyncInvoker<ListInstanceReplicationPoliciesRequest, ListInstanceReplicationPoliciesResponse>
     */
    public AsyncInvoker<ListInstanceReplicationPoliciesRequest, ListInstanceReplicationPoliciesResponse> listInstanceReplicationPoliciesAsyncInvoker(
        ListInstanceReplicationPoliciesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceReplicationPolicies, hcClient);
    }

    /**
     * 获取镜像同步策略执行任务的镜像版本列表
     *
     * 获取镜像同步策略执行任务的镜像版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPolicyExecSubTasksRequest 请求对象
     * @return CompletableFuture<ListInstanceReplicationPolicyExecSubTasksResponse>
     */
    public CompletableFuture<ListInstanceReplicationPolicyExecSubTasksResponse> listInstanceReplicationPolicyExecSubTasksAsync(
        ListInstanceReplicationPolicyExecSubTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceReplicationPolicyExecSubTasks);
    }

    /**
     * 获取镜像同步策略执行任务的镜像版本列表
     *
     * 获取镜像同步策略执行任务的镜像版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPolicyExecSubTasksRequest 请求对象
     * @return AsyncInvoker<ListInstanceReplicationPolicyExecSubTasksRequest, ListInstanceReplicationPolicyExecSubTasksResponse>
     */
    public AsyncInvoker<ListInstanceReplicationPolicyExecSubTasksRequest, ListInstanceReplicationPolicyExecSubTasksResponse> listInstanceReplicationPolicyExecSubTasksAsyncInvoker(
        ListInstanceReplicationPolicyExecSubTasksRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceReplicationPolicyExecSubTasks, hcClient);
    }

    /**
     * 获取镜像同步策略执行任务的镜像列表
     *
     * 获取镜像同步策略执行任务的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPolicyExecTasksRequest 请求对象
     * @return CompletableFuture<ListInstanceReplicationPolicyExecTasksResponse>
     */
    public CompletableFuture<ListInstanceReplicationPolicyExecTasksResponse> listInstanceReplicationPolicyExecTasksAsync(
        ListInstanceReplicationPolicyExecTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceReplicationPolicyExecTasks);
    }

    /**
     * 获取镜像同步策略执行任务的镜像列表
     *
     * 获取镜像同步策略执行任务的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPolicyExecTasksRequest 请求对象
     * @return AsyncInvoker<ListInstanceReplicationPolicyExecTasksRequest, ListInstanceReplicationPolicyExecTasksResponse>
     */
    public AsyncInvoker<ListInstanceReplicationPolicyExecTasksRequest, ListInstanceReplicationPolicyExecTasksResponse> listInstanceReplicationPolicyExecTasksAsyncInvoker(
        ListInstanceReplicationPolicyExecTasksRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceReplicationPolicyExecTasks, hcClient);
    }

    /**
     * 获取镜像同步策略执行记录列表
     *
     * 获取镜像同步策略执行记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPolicyExecutionsRequest 请求对象
     * @return CompletableFuture<ListInstanceReplicationPolicyExecutionsResponse>
     */
    public CompletableFuture<ListInstanceReplicationPolicyExecutionsResponse> listInstanceReplicationPolicyExecutionsAsync(
        ListInstanceReplicationPolicyExecutionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceReplicationPolicyExecutions);
    }

    /**
     * 获取镜像同步策略执行记录列表
     *
     * 获取镜像同步策略执行记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPolicyExecutionsRequest 请求对象
     * @return AsyncInvoker<ListInstanceReplicationPolicyExecutionsRequest, ListInstanceReplicationPolicyExecutionsResponse>
     */
    public AsyncInvoker<ListInstanceReplicationPolicyExecutionsRequest, ListInstanceReplicationPolicyExecutionsResponse> listInstanceReplicationPolicyExecutionsAsyncInvoker(
        ListInstanceReplicationPolicyExecutionsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceReplicationPolicyExecutions, hcClient);
    }

    /**
     * 获取制品仓库列表
     *
     * 获取制品仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRepositoriesRequest 请求对象
     * @return CompletableFuture<ListInstanceRepositoriesResponse>
     */
    public CompletableFuture<ListInstanceRepositoriesResponse> listInstanceRepositoriesAsync(
        ListInstanceRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceRepositories);
    }

    /**
     * 获取制品仓库列表
     *
     * 获取制品仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRepositoriesRequest 请求对象
     * @return AsyncInvoker<ListInstanceRepositoriesRequest, ListInstanceRepositoriesResponse>
     */
    public AsyncInvoker<ListInstanceRepositoriesRequest, ListInstanceRepositoriesResponse> listInstanceRepositoriesAsyncInvoker(
        ListInstanceRepositoriesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceRepositories, hcClient);
    }

    /**
     * 按照标签检索资源列表
     *
     * 按照标签检索资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceResourceInstancesRequest 请求对象
     * @return CompletableFuture<ListInstanceResourceInstancesResponse>
     */
    public CompletableFuture<ListInstanceResourceInstancesResponse> listInstanceResourceInstancesAsync(
        ListInstanceResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceResourceInstances);
    }

    /**
     * 按照标签检索资源列表
     *
     * 按照标签检索资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstanceResourceInstancesRequest, ListInstanceResourceInstancesResponse>
     */
    public AsyncInvoker<ListInstanceResourceInstancesRequest, ListInstanceResourceInstancesResponse> listInstanceResourceInstancesAsyncInvoker(
        ListInstanceResourceInstancesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceResourceInstances, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceResourceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceResourceTagsResponse>
     */
    public CompletableFuture<ListInstanceResourceTagsResponse> listInstanceResourceTagsAsync(
        ListInstanceResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceResourceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceResourceTagsRequest, ListInstanceResourceTagsResponse>
     */
    public AsyncInvoker<ListInstanceResourceTagsRequest, ListInstanceResourceTagsResponse> listInstanceResourceTagsAsyncInvoker(
        ListInstanceResourceTagsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceResourceTags, hcClient);
    }

    /**
     * 获取老化策略列表
     *
     * 获取老化策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPoliciesRequest 请求对象
     * @return CompletableFuture<ListInstanceRetentionPoliciesResponse>
     */
    public CompletableFuture<ListInstanceRetentionPoliciesResponse> listInstanceRetentionPoliciesAsync(
        ListInstanceRetentionPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceRetentionPolicies);
    }

    /**
     * 获取老化策略列表
     *
     * 获取老化策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPoliciesRequest 请求对象
     * @return AsyncInvoker<ListInstanceRetentionPoliciesRequest, ListInstanceRetentionPoliciesResponse>
     */
    public AsyncInvoker<ListInstanceRetentionPoliciesRequest, ListInstanceRetentionPoliciesResponse> listInstanceRetentionPoliciesAsyncInvoker(
        ListInstanceRetentionPoliciesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceRetentionPolicies, hcClient);
    }

    /**
     * 获取老化策略执行任务的镜像版本列表
     *
     * 获取老化策略执行任务的镜像版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPolicyExecSubTasksRequest 请求对象
     * @return CompletableFuture<ListInstanceRetentionPolicyExecSubTasksResponse>
     */
    public CompletableFuture<ListInstanceRetentionPolicyExecSubTasksResponse> listInstanceRetentionPolicyExecSubTasksAsync(
        ListInstanceRetentionPolicyExecSubTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceRetentionPolicyExecSubTasks);
    }

    /**
     * 获取老化策略执行任务的镜像版本列表
     *
     * 获取老化策略执行任务的镜像版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPolicyExecSubTasksRequest 请求对象
     * @return AsyncInvoker<ListInstanceRetentionPolicyExecSubTasksRequest, ListInstanceRetentionPolicyExecSubTasksResponse>
     */
    public AsyncInvoker<ListInstanceRetentionPolicyExecSubTasksRequest, ListInstanceRetentionPolicyExecSubTasksResponse> listInstanceRetentionPolicyExecSubTasksAsyncInvoker(
        ListInstanceRetentionPolicyExecSubTasksRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceRetentionPolicyExecSubTasks, hcClient);
    }

    /**
     * 获取老化策略执行任务的镜像列表
     *
     * 获取老化策略执行任务的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPolicyExecTasksRequest 请求对象
     * @return CompletableFuture<ListInstanceRetentionPolicyExecTasksResponse>
     */
    public CompletableFuture<ListInstanceRetentionPolicyExecTasksResponse> listInstanceRetentionPolicyExecTasksAsync(
        ListInstanceRetentionPolicyExecTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceRetentionPolicyExecTasks);
    }

    /**
     * 获取老化策略执行任务的镜像列表
     *
     * 获取老化策略执行任务的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPolicyExecTasksRequest 请求对象
     * @return AsyncInvoker<ListInstanceRetentionPolicyExecTasksRequest, ListInstanceRetentionPolicyExecTasksResponse>
     */
    public AsyncInvoker<ListInstanceRetentionPolicyExecTasksRequest, ListInstanceRetentionPolicyExecTasksResponse> listInstanceRetentionPolicyExecTasksAsyncInvoker(
        ListInstanceRetentionPolicyExecTasksRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceRetentionPolicyExecTasks, hcClient);
    }

    /**
     * 获取老化策略执行记录列表
     *
     * 获取老化策略执行记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPolicyExecutionsRequest 请求对象
     * @return CompletableFuture<ListInstanceRetentionPolicyExecutionsResponse>
     */
    public CompletableFuture<ListInstanceRetentionPolicyExecutionsResponse> listInstanceRetentionPolicyExecutionsAsync(
        ListInstanceRetentionPolicyExecutionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceRetentionPolicyExecutions);
    }

    /**
     * 获取老化策略执行记录列表
     *
     * 获取老化策略执行记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPolicyExecutionsRequest 请求对象
     * @return AsyncInvoker<ListInstanceRetentionPolicyExecutionsRequest, ListInstanceRetentionPolicyExecutionsResponse>
     */
    public AsyncInvoker<ListInstanceRetentionPolicyExecutionsRequest, ListInstanceRetentionPolicyExecutionsResponse> listInstanceRetentionPolicyExecutionsAsyncInvoker(
        ListInstanceRetentionPolicyExecutionsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceRetentionPolicyExecutions, hcClient);
    }

    /**
     * 获取签名策略列表
     *
     * 获取签名策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignPoliciesRequest 请求对象
     * @return CompletableFuture<ListInstanceSignPoliciesResponse>
     */
    public CompletableFuture<ListInstanceSignPoliciesResponse> listInstanceSignPoliciesAsync(
        ListInstanceSignPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceSignPolicies);
    }

    /**
     * 获取签名策略列表
     *
     * 获取签名策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignPoliciesRequest 请求对象
     * @return AsyncInvoker<ListInstanceSignPoliciesRequest, ListInstanceSignPoliciesResponse>
     */
    public AsyncInvoker<ListInstanceSignPoliciesRequest, ListInstanceSignPoliciesResponse> listInstanceSignPoliciesAsyncInvoker(
        ListInstanceSignPoliciesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceSignPolicies, hcClient);
    }

    /**
     * 获取签名执行记录任务的镜像列表
     *
     * 获取签名执行记录任务的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignPolicyExecTasksRequest 请求对象
     * @return CompletableFuture<ListInstanceSignPolicyExecTasksResponse>
     */
    public CompletableFuture<ListInstanceSignPolicyExecTasksResponse> listInstanceSignPolicyExecTasksAsync(
        ListInstanceSignPolicyExecTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceSignPolicyExecTasks);
    }

    /**
     * 获取签名执行记录任务的镜像列表
     *
     * 获取签名执行记录任务的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignPolicyExecTasksRequest 请求对象
     * @return AsyncInvoker<ListInstanceSignPolicyExecTasksRequest, ListInstanceSignPolicyExecTasksResponse>
     */
    public AsyncInvoker<ListInstanceSignPolicyExecTasksRequest, ListInstanceSignPolicyExecTasksResponse> listInstanceSignPolicyExecTasksAsyncInvoker(
        ListInstanceSignPolicyExecTasksRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceSignPolicyExecTasks, hcClient);
    }

    /**
     * 获取签名执行记录列表
     *
     * 获取签名执行记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignPolicyExecutionsRequest 请求对象
     * @return CompletableFuture<ListInstanceSignPolicyExecutionsResponse>
     */
    public CompletableFuture<ListInstanceSignPolicyExecutionsResponse> listInstanceSignPolicyExecutionsAsync(
        ListInstanceSignPolicyExecutionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceSignPolicyExecutions);
    }

    /**
     * 获取签名执行记录列表
     *
     * 获取签名执行记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignPolicyExecutionsRequest 请求对象
     * @return AsyncInvoker<ListInstanceSignPolicyExecutionsRequest, ListInstanceSignPolicyExecutionsResponse>
     */
    public AsyncInvoker<ListInstanceSignPolicyExecutionsRequest, ListInstanceSignPolicyExecutionsResponse> listInstanceSignPolicyExecutionsAsyncInvoker(
        ListInstanceSignPolicyExecutionsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceSignPolicyExecutions, hcClient);
    }

    /**
     * 获取签名策略执行任务的镜像版本列表
     *
     * 获取签名策略执行任务的镜像版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignatureExecutionSubtasksRequest 请求对象
     * @return CompletableFuture<ListInstanceSignatureExecutionSubtasksResponse>
     */
    public CompletableFuture<ListInstanceSignatureExecutionSubtasksResponse> listInstanceSignatureExecutionSubtasksAsync(
        ListInstanceSignatureExecutionSubtasksRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceSignatureExecutionSubtasks);
    }

    /**
     * 获取签名策略执行任务的镜像版本列表
     *
     * 获取签名策略执行任务的镜像版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignatureExecutionSubtasksRequest 请求对象
     * @return AsyncInvoker<ListInstanceSignatureExecutionSubtasksRequest, ListInstanceSignatureExecutionSubtasksResponse>
     */
    public AsyncInvoker<ListInstanceSignatureExecutionSubtasksRequest, ListInstanceSignatureExecutionSubtasksResponse> listInstanceSignatureExecutionSubtasksAsyncInvoker(
        ListInstanceSignatureExecutionSubtasksRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceSignatureExecutionSubtasks, hcClient);
    }

    /**
     * 获取实例统计数据
     *
     * 获取实例统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceStatisticsRequest 请求对象
     * @return CompletableFuture<ListInstanceStatisticsResponse>
     */
    public CompletableFuture<ListInstanceStatisticsResponse> listInstanceStatisticsAsync(
        ListInstanceStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceStatistics);
    }

    /**
     * 获取实例统计数据
     *
     * 获取实例统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceStatisticsRequest 请求对象
     * @return AsyncInvoker<ListInstanceStatisticsRequest, ListInstanceStatisticsResponse>
     */
    public AsyncInvoker<ListInstanceStatisticsRequest, ListInstanceStatisticsResponse> listInstanceStatisticsAsyncInvoker(
        ListInstanceStatisticsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceStatistics, hcClient);
    }

    /**
     * 获取制品仓库的Tag列表
     *
     * 获取制品仓库的Tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceTags);
    }

    /**
     * 获取制品仓库的Tag列表
     *
     * 获取制品仓库的Tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(
        ListInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceTags, hcClient);
    }

    /**
     * 获取触发器执行任务列表
     *
     * 获取触发器执行任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceWebhookJobsRequest 请求对象
     * @return CompletableFuture<ListInstanceWebhookJobsResponse>
     */
    public CompletableFuture<ListInstanceWebhookJobsResponse> listInstanceWebhookJobsAsync(
        ListInstanceWebhookJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceWebhookJobs);
    }

    /**
     * 获取触发器执行任务列表
     *
     * 获取触发器执行任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceWebhookJobsRequest 请求对象
     * @return AsyncInvoker<ListInstanceWebhookJobsRequest, ListInstanceWebhookJobsResponse>
     */
    public AsyncInvoker<ListInstanceWebhookJobsRequest, ListInstanceWebhookJobsResponse> listInstanceWebhookJobsAsyncInvoker(
        ListInstanceWebhookJobsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceWebhookJobs, hcClient);
    }

    /**
     * 获取触发器列表
     *
     * 获取触发器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceWebhooksRequest 请求对象
     * @return CompletableFuture<ListInstanceWebhooksResponse>
     */
    public CompletableFuture<ListInstanceWebhooksResponse> listInstanceWebhooksAsync(
        ListInstanceWebhooksRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listInstanceWebhooks);
    }

    /**
     * 获取触发器列表
     *
     * 获取触发器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceWebhooksRequest 请求对象
     * @return AsyncInvoker<ListInstanceWebhooksRequest, ListInstanceWebhooksResponse>
     */
    public AsyncInvoker<ListInstanceWebhooksRequest, ListInstanceWebhooksResponse> listInstanceWebhooksAsyncInvoker(
        ListInstanceWebhooksRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listInstanceWebhooks, hcClient);
    }

    /**
     * 获取命名空间下所有制品仓库列表
     *
     * 获取命名空间下所有制品仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespaceRepositoriesRequest 请求对象
     * @return CompletableFuture<ListNamespaceRepositoriesResponse>
     */
    public CompletableFuture<ListNamespaceRepositoriesResponse> listNamespaceRepositoriesAsync(
        ListNamespaceRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listNamespaceRepositories);
    }

    /**
     * 获取命名空间下所有制品仓库列表
     *
     * 获取命名空间下所有制品仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespaceRepositoriesRequest 请求对象
     * @return AsyncInvoker<ListNamespaceRepositoriesRequest, ListNamespaceRepositoriesResponse>
     */
    public AsyncInvoker<ListNamespaceRepositoriesRequest, ListNamespaceRepositoriesResponse> listNamespaceRepositoriesAsyncInvoker(
        ListNamespaceRepositoriesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listNamespaceRepositories, hcClient);
    }

    /**
     * 查询实例下所有命名空间标签
     *
     * 查询实例下所有命名空间标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespaceTagsRequest 请求对象
     * @return CompletableFuture<ListNamespaceTagsResponse>
     */
    public CompletableFuture<ListNamespaceTagsResponse> listNamespaceTagsAsync(ListNamespaceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listNamespaceTags);
    }

    /**
     * 查询实例下所有命名空间标签
     *
     * 查询实例下所有命名空间标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespaceTagsRequest 请求对象
     * @return AsyncInvoker<ListNamespaceTagsRequest, ListNamespaceTagsResponse>
     */
    public AsyncInvoker<ListNamespaceTagsRequest, ListNamespaceTagsResponse> listNamespaceTagsAsyncInvoker(
        ListNamespaceTagsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listNamespaceTags, hcClient);
    }

    /**
     * 按照标签检索子资源列表
     *
     * 按照标签检索子资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubResourceInstancesRequest 请求对象
     * @return CompletableFuture<ListSubResourceInstancesResponse>
     */
    public CompletableFuture<ListSubResourceInstancesResponse> listSubResourceInstancesAsync(
        ListSubResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listSubResourceInstances);
    }

    /**
     * 按照标签检索子资源列表
     *
     * 按照标签检索子资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ListSubResourceInstancesRequest, ListSubResourceInstancesResponse>
     */
    public AsyncInvoker<ListSubResourceInstancesRequest, ListSubResourceInstancesResponse> listSubResourceInstancesAsyncInvoker(
        ListSubResourceInstancesRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listSubResourceInstances, hcClient);
    }

    /**
     * 查询子资源标签
     *
     * 查询子资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubResourceTagsRequest 请求对象
     * @return CompletableFuture<ListSubResourceTagsResponse>
     */
    public CompletableFuture<ListSubResourceTagsResponse> listSubResourceTagsAsync(ListSubResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.listSubResourceTags);
    }

    /**
     * 查询子资源标签
     *
     * 查询子资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListSubResourceTagsRequest, ListSubResourceTagsResponse>
     */
    public AsyncInvoker<ListSubResourceTagsRequest, ListSubResourceTagsResponse> listSubResourceTagsAsyncInvoker(
        ListSubResourceTagsRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.listSubResourceTags, hcClient);
    }

    /**
     * 获取实例详情
     *
     * 获取实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstance);
    }

    /**
     * 获取实例详情
     *
     * 获取实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstance, hcClient);
    }

    /**
     * 获取制品版本详情
     *
     * 获取制品版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceArtifactRequest 请求对象
     * @return CompletableFuture<ShowInstanceArtifactResponse>
     */
    public CompletableFuture<ShowInstanceArtifactResponse> showInstanceArtifactAsync(
        ShowInstanceArtifactRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstanceArtifact);
    }

    /**
     * 获取制品版本详情
     *
     * 获取制品版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceArtifactRequest 请求对象
     * @return AsyncInvoker<ShowInstanceArtifactRequest, ShowInstanceArtifactResponse>
     */
    public AsyncInvoker<ShowInstanceArtifactRequest, ShowInstanceArtifactResponse> showInstanceArtifactAsyncInvoker(
        ShowInstanceArtifactRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstanceArtifact, hcClient);
    }

    /**
     * 获取制品附加信息
     *
     * 获取制品附加信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceArtifactAdditionRequest 请求对象
     * @return CompletableFuture<ShowInstanceArtifactAdditionResponse>
     */
    public CompletableFuture<ShowInstanceArtifactAdditionResponse> showInstanceArtifactAdditionAsync(
        ShowInstanceArtifactAdditionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstanceArtifactAddition);
    }

    /**
     * 获取制品附加信息
     *
     * 获取制品附加信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceArtifactAdditionRequest 请求对象
     * @return AsyncInvoker<ShowInstanceArtifactAdditionRequest, ShowInstanceArtifactAdditionResponse>
     */
    public AsyncInvoker<ShowInstanceArtifactAdditionRequest, ShowInstanceArtifactAdditionResponse> showInstanceArtifactAdditionAsyncInvoker(
        ShowInstanceArtifactAdditionRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstanceArtifactAddition, hcClient);
    }

    /**
     * 查看实例配置
     *
     * 查看实例配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<ShowInstanceConfigurationResponse>
     */
    public CompletableFuture<ShowInstanceConfigurationResponse> showInstanceConfigurationAsync(
        ShowInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstanceConfiguration);
    }

    /**
     * 查看实例配置
     *
     * 查看实例配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>
     */
    public AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationAsyncInvoker(
        ShowInstanceConfigurationRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 获取公网访问信息
     *
     * 获取公网访问信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceEndpointPolicyRequest 请求对象
     * @return CompletableFuture<ShowInstanceEndpointPolicyResponse>
     */
    public CompletableFuture<ShowInstanceEndpointPolicyResponse> showInstanceEndpointPolicyAsync(
        ShowInstanceEndpointPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstanceEndpointPolicy);
    }

    /**
     * 获取公网访问信息
     *
     * 获取公网访问信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceEndpointPolicyRequest 请求对象
     * @return AsyncInvoker<ShowInstanceEndpointPolicyRequest, ShowInstanceEndpointPolicyResponse>
     */
    public AsyncInvoker<ShowInstanceEndpointPolicyRequest, ShowInstanceEndpointPolicyResponse> showInstanceEndpointPolicyAsyncInvoker(
        ShowInstanceEndpointPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstanceEndpointPolicy, hcClient);
    }

    /**
     * 查询内网访问详情
     *
     * 查询内网访问详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceInternalEndpointRequest 请求对象
     * @return CompletableFuture<ShowInstanceInternalEndpointResponse>
     */
    public CompletableFuture<ShowInstanceInternalEndpointResponse> showInstanceInternalEndpointAsync(
        ShowInstanceInternalEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstanceInternalEndpoint);
    }

    /**
     * 查询内网访问详情
     *
     * 查询内网访问详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceInternalEndpointRequest 请求对象
     * @return AsyncInvoker<ShowInstanceInternalEndpointRequest, ShowInstanceInternalEndpointResponse>
     */
    public AsyncInvoker<ShowInstanceInternalEndpointRequest, ShowInstanceInternalEndpointResponse> showInstanceInternalEndpointAsyncInvoker(
        ShowInstanceInternalEndpointRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstanceInternalEndpoint, hcClient);
    }

    /**
     * 获取任务详情
     *
     * 获取任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceJobRequest 请求对象
     * @return CompletableFuture<ShowInstanceJobResponse>
     */
    public CompletableFuture<ShowInstanceJobResponse> showInstanceJobAsync(ShowInstanceJobRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstanceJob);
    }

    /**
     * 获取任务详情
     *
     * 获取任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceJobRequest 请求对象
     * @return AsyncInvoker<ShowInstanceJobRequest, ShowInstanceJobResponse>
     */
    public AsyncInvoker<ShowInstanceJobRequest, ShowInstanceJobResponse> showInstanceJobAsyncInvoker(
        ShowInstanceJobRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstanceJob, hcClient);
    }

    /**
     * 获取命名空间详情
     *
     * 获取命名空间详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceNamespaceRequest 请求对象
     * @return CompletableFuture<ShowInstanceNamespaceResponse>
     */
    public CompletableFuture<ShowInstanceNamespaceResponse> showInstanceNamespaceAsync(
        ShowInstanceNamespaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstanceNamespace);
    }

    /**
     * 获取命名空间详情
     *
     * 获取命名空间详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceNamespaceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceNamespaceRequest, ShowInstanceNamespaceResponse>
     */
    public AsyncInvoker<ShowInstanceNamespaceRequest, ShowInstanceNamespaceResponse> showInstanceNamespaceAsyncInvoker(
        ShowInstanceNamespaceRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstanceNamespace, hcClient);
    }

    /**
     * 获取镜像同步的目标仓库详情
     *
     * 获取镜像同步的目标仓库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRegistryRequest 请求对象
     * @return CompletableFuture<ShowInstanceRegistryResponse>
     */
    public CompletableFuture<ShowInstanceRegistryResponse> showInstanceRegistryAsync(
        ShowInstanceRegistryRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstanceRegistry);
    }

    /**
     * 获取镜像同步的目标仓库详情
     *
     * 获取镜像同步的目标仓库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRegistryRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRegistryRequest, ShowInstanceRegistryResponse>
     */
    public AsyncInvoker<ShowInstanceRegistryRequest, ShowInstanceRegistryResponse> showInstanceRegistryAsyncInvoker(
        ShowInstanceRegistryRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstanceRegistry, hcClient);
    }

    /**
     * 获取镜像同步策略详情
     *
     * 获取镜像同步策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceReplicationPolicyRequest 请求对象
     * @return CompletableFuture<ShowInstanceReplicationPolicyResponse>
     */
    public CompletableFuture<ShowInstanceReplicationPolicyResponse> showInstanceReplicationPolicyAsync(
        ShowInstanceReplicationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstanceReplicationPolicy);
    }

    /**
     * 获取镜像同步策略详情
     *
     * 获取镜像同步策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceReplicationPolicyRequest 请求对象
     * @return AsyncInvoker<ShowInstanceReplicationPolicyRequest, ShowInstanceReplicationPolicyResponse>
     */
    public AsyncInvoker<ShowInstanceReplicationPolicyRequest, ShowInstanceReplicationPolicyResponse> showInstanceReplicationPolicyAsyncInvoker(
        ShowInstanceReplicationPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstanceReplicationPolicy, hcClient);
    }

    /**
     * 获取制品仓库详情
     *
     * 获取制品仓库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRepositoryRequest 请求对象
     * @return CompletableFuture<ShowInstanceRepositoryResponse>
     */
    public CompletableFuture<ShowInstanceRepositoryResponse> showInstanceRepositoryAsync(
        ShowInstanceRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstanceRepository);
    }

    /**
     * 获取制品仓库详情
     *
     * 获取制品仓库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRepositoryRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRepositoryRequest, ShowInstanceRepositoryResponse>
     */
    public AsyncInvoker<ShowInstanceRepositoryRequest, ShowInstanceRepositoryResponse> showInstanceRepositoryAsyncInvoker(
        ShowInstanceRepositoryRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstanceRepository, hcClient);
    }

    /**
     * 按照标签检索资源数量
     *
     * 按照标签检索资源数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceResourceInstancesCountRequest 请求对象
     * @return CompletableFuture<ShowInstanceResourceInstancesCountResponse>
     */
    public CompletableFuture<ShowInstanceResourceInstancesCountResponse> showInstanceResourceInstancesCountAsync(
        ShowInstanceResourceInstancesCountRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstanceResourceInstancesCount);
    }

    /**
     * 按照标签检索资源数量
     *
     * 按照标签检索资源数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceResourceInstancesCountRequest 请求对象
     * @return AsyncInvoker<ShowInstanceResourceInstancesCountRequest, ShowInstanceResourceInstancesCountResponse>
     */
    public AsyncInvoker<ShowInstanceResourceInstancesCountRequest, ShowInstanceResourceInstancesCountResponse> showInstanceResourceInstancesCountAsyncInvoker(
        ShowInstanceResourceInstancesCountRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstanceResourceInstancesCount, hcClient);
    }

    /**
     * 获取老化策略详情
     *
     * 获取老化策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRetentionPolicyRequest 请求对象
     * @return CompletableFuture<ShowInstanceRetentionPolicyResponse>
     */
    public CompletableFuture<ShowInstanceRetentionPolicyResponse> showInstanceRetentionPolicyAsync(
        ShowInstanceRetentionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstanceRetentionPolicy);
    }

    /**
     * 获取老化策略详情
     *
     * 获取老化策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRetentionPolicyRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRetentionPolicyRequest, ShowInstanceRetentionPolicyResponse>
     */
    public AsyncInvoker<ShowInstanceRetentionPolicyRequest, ShowInstanceRetentionPolicyResponse> showInstanceRetentionPolicyAsyncInvoker(
        ShowInstanceRetentionPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstanceRetentionPolicy, hcClient);
    }

    /**
     * 获取签名策略详情
     *
     * 获取签名策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSignPolicyRequest 请求对象
     * @return CompletableFuture<ShowInstanceSignPolicyResponse>
     */
    public CompletableFuture<ShowInstanceSignPolicyResponse> showInstanceSignPolicyAsync(
        ShowInstanceSignPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstanceSignPolicy);
    }

    /**
     * 获取签名策略详情
     *
     * 获取签名策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSignPolicyRequest 请求对象
     * @return AsyncInvoker<ShowInstanceSignPolicyRequest, ShowInstanceSignPolicyResponse>
     */
    public AsyncInvoker<ShowInstanceSignPolicyRequest, ShowInstanceSignPolicyResponse> showInstanceSignPolicyAsyncInvoker(
        ShowInstanceSignPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstanceSignPolicy, hcClient);
    }

    /**
     * 获取触发器详情
     *
     * 获取触发器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceWebhookRequest 请求对象
     * @return CompletableFuture<ShowInstanceWebhookResponse>
     */
    public CompletableFuture<ShowInstanceWebhookResponse> showInstanceWebhookAsync(ShowInstanceWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showInstanceWebhook);
    }

    /**
     * 获取触发器详情
     *
     * 获取触发器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceWebhookRequest 请求对象
     * @return AsyncInvoker<ShowInstanceWebhookRequest, ShowInstanceWebhookResponse>
     */
    public AsyncInvoker<ShowInstanceWebhookRequest, ShowInstanceWebhookResponse> showInstanceWebhookAsyncInvoker(
        ShowInstanceWebhookRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showInstanceWebhook, hcClient);
    }

    /**
     * 按照标签检索子资源数量
     *
     * 按照标签检索子资源数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubResourceInstancesCountRequest 请求对象
     * @return CompletableFuture<ShowSubResourceInstancesCountResponse>
     */
    public CompletableFuture<ShowSubResourceInstancesCountResponse> showSubResourceInstancesCountAsync(
        ShowSubResourceInstancesCountRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.showSubResourceInstancesCount);
    }

    /**
     * 按照标签检索子资源数量
     *
     * 按照标签检索子资源数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubResourceInstancesCountRequest 请求对象
     * @return AsyncInvoker<ShowSubResourceInstancesCountRequest, ShowSubResourceInstancesCountResponse>
     */
    public AsyncInvoker<ShowSubResourceInstancesCountRequest, ShowSubResourceInstancesCountResponse> showSubResourceInstancesCountAsyncInvoker(
        ShowSubResourceInstancesCountRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.showSubResourceInstancesCount, hcClient);
    }

    /**
     * 手动启动制品扫描
     *
     * 手动启动制品扫描
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartManualScanningRequest 请求对象
     * @return CompletableFuture<StartManualScanningResponse>
     */
    public CompletableFuture<StartManualScanningResponse> startManualScanningAsync(StartManualScanningRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.startManualScanning);
    }

    /**
     * 手动启动制品扫描
     *
     * 手动启动制品扫描
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartManualScanningRequest 请求对象
     * @return AsyncInvoker<StartManualScanningRequest, StartManualScanningResponse>
     */
    public AsyncInvoker<StartManualScanningRequest, StartManualScanningResponse> startManualScanningAsyncInvoker(
        StartManualScanningRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.startManualScanning, hcClient);
    }

    /**
     * 停止镜像同步任务
     *
     * 停止镜像同步任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInstanceReplicationPolicyExecutionRequest 请求对象
     * @return CompletableFuture<StopInstanceReplicationPolicyExecutionResponse>
     */
    public CompletableFuture<StopInstanceReplicationPolicyExecutionResponse> stopInstanceReplicationPolicyExecutionAsync(
        StopInstanceReplicationPolicyExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.stopInstanceReplicationPolicyExecution);
    }

    /**
     * 停止镜像同步任务
     *
     * 停止镜像同步任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInstanceReplicationPolicyExecutionRequest 请求对象
     * @return AsyncInvoker<StopInstanceReplicationPolicyExecutionRequest, StopInstanceReplicationPolicyExecutionResponse>
     */
    public AsyncInvoker<StopInstanceReplicationPolicyExecutionRequest, StopInstanceReplicationPolicyExecutionResponse> stopInstanceReplicationPolicyExecutionAsyncInvoker(
        StopInstanceReplicationPolicyExecutionRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.stopInstanceReplicationPolicyExecution, hcClient);
    }

    /**
     * 更新域名
     *
     * 更新域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainNameRequest 请求对象
     * @return CompletableFuture<UpdateDomainNameResponse>
     */
    public CompletableFuture<UpdateDomainNameResponse> updateDomainNameAsync(UpdateDomainNameRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateDomainName);
    }

    /**
     * 更新域名
     *
     * 更新域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainNameRequest 请求对象
     * @return AsyncInvoker<UpdateDomainNameRequest, UpdateDomainNameResponse>
     */
    public AsyncInvoker<UpdateDomainNameRequest, UpdateDomainNameResponse> updateDomainNameAsyncInvoker(
        UpdateDomainNameRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateDomainName, hcClient);
    }

    /**
     * 修改不可变Tag策略
     *
     * 修改不可变Tag策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImmutableRuleRequest 请求对象
     * @return CompletableFuture<UpdateImmutableRuleResponse>
     */
    public CompletableFuture<UpdateImmutableRuleResponse> updateImmutableRuleAsync(UpdateImmutableRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateImmutableRule);
    }

    /**
     * 修改不可变Tag策略
     *
     * 修改不可变Tag策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImmutableRuleRequest 请求对象
     * @return AsyncInvoker<UpdateImmutableRuleRequest, UpdateImmutableRuleResponse>
     */
    public AsyncInvoker<UpdateImmutableRuleRequest, UpdateImmutableRuleResponse> updateImmutableRuleAsyncInvoker(
        UpdateImmutableRuleRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateImmutableRule, hcClient);
    }

    /**
     * 修改实例配置
     *
     * 修改实例配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateInstanceConfigurationResponse>
     */
    public CompletableFuture<UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsync(
        UpdateInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateInstanceConfiguration);
    }

    /**
     * 修改实例配置
     *
     * 修改实例配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
     */
    public AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsyncInvoker(
        UpdateInstanceConfigurationRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 更新公网访问白名单
     *
     * 更新公网访问白名单，更新方式为全量更新方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceEndpointPolicyRequest 请求对象
     * @return CompletableFuture<UpdateInstanceEndpointPolicyResponse>
     */
    public CompletableFuture<UpdateInstanceEndpointPolicyResponse> updateInstanceEndpointPolicyAsync(
        UpdateInstanceEndpointPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateInstanceEndpointPolicy);
    }

    /**
     * 更新公网访问白名单
     *
     * 更新公网访问白名单，更新方式为全量更新方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceEndpointPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceEndpointPolicyRequest, UpdateInstanceEndpointPolicyResponse>
     */
    public AsyncInvoker<UpdateInstanceEndpointPolicyRequest, UpdateInstanceEndpointPolicyResponse> updateInstanceEndpointPolicyAsyncInvoker(
        UpdateInstanceEndpointPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateInstanceEndpointPolicy, hcClient);
    }

    /**
     * 启用/停用长期访问凭证
     *
     * 启用/停用长期访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceLtCredentialRequest 请求对象
     * @return CompletableFuture<UpdateInstanceLtCredentialResponse>
     */
    public CompletableFuture<UpdateInstanceLtCredentialResponse> updateInstanceLtCredentialAsync(
        UpdateInstanceLtCredentialRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateInstanceLtCredential);
    }

    /**
     * 启用/停用长期访问凭证
     *
     * 启用/停用长期访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceLtCredentialRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceLtCredentialRequest, UpdateInstanceLtCredentialResponse>
     */
    public AsyncInvoker<UpdateInstanceLtCredentialRequest, UpdateInstanceLtCredentialResponse> updateInstanceLtCredentialAsyncInvoker(
        UpdateInstanceLtCredentialRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateInstanceLtCredential, hcClient);
    }

    /**
     * 修改命名空间
     *
     * 修改命名空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNamespaceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceNamespaceResponse>
     */
    public CompletableFuture<UpdateInstanceNamespaceResponse> updateInstanceNamespaceAsync(
        UpdateInstanceNamespaceRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateInstanceNamespace);
    }

    /**
     * 修改命名空间
     *
     * 修改命名空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNamespaceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceNamespaceRequest, UpdateInstanceNamespaceResponse>
     */
    public AsyncInvoker<UpdateInstanceNamespaceRequest, UpdateInstanceNamespaceResponse> updateInstanceNamespaceAsyncInvoker(
        UpdateInstanceNamespaceRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateInstanceNamespace, hcClient);
    }

    /**
     * 修改镜像同步的目标仓库
     *
     * 修改镜像同步的目标仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRegistryRequest 请求对象
     * @return CompletableFuture<UpdateInstanceRegistryResponse>
     */
    public CompletableFuture<UpdateInstanceRegistryResponse> updateInstanceRegistryAsync(
        UpdateInstanceRegistryRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateInstanceRegistry);
    }

    /**
     * 修改镜像同步的目标仓库
     *
     * 修改镜像同步的目标仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRegistryRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRegistryRequest, UpdateInstanceRegistryResponse>
     */
    public AsyncInvoker<UpdateInstanceRegistryRequest, UpdateInstanceRegistryResponse> updateInstanceRegistryAsyncInvoker(
        UpdateInstanceRegistryRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateInstanceRegistry, hcClient);
    }

    /**
     * 修改镜像同步策略
     *
     * 修改镜像同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceReplicationPolicyRequest 请求对象
     * @return CompletableFuture<UpdateInstanceReplicationPolicyResponse>
     */
    public CompletableFuture<UpdateInstanceReplicationPolicyResponse> updateInstanceReplicationPolicyAsync(
        UpdateInstanceReplicationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateInstanceReplicationPolicy);
    }

    /**
     * 修改镜像同步策略
     *
     * 修改镜像同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceReplicationPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceReplicationPolicyRequest, UpdateInstanceReplicationPolicyResponse>
     */
    public AsyncInvoker<UpdateInstanceReplicationPolicyRequest, UpdateInstanceReplicationPolicyResponse> updateInstanceReplicationPolicyAsyncInvoker(
        UpdateInstanceReplicationPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateInstanceReplicationPolicy, hcClient);
    }

    /**
     * 修改制品仓库
     *
     * 修改制品仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRepositoryRequest 请求对象
     * @return CompletableFuture<UpdateInstanceRepositoryResponse>
     */
    public CompletableFuture<UpdateInstanceRepositoryResponse> updateInstanceRepositoryAsync(
        UpdateInstanceRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateInstanceRepository);
    }

    /**
     * 修改制品仓库
     *
     * 修改制品仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRepositoryRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRepositoryRequest, UpdateInstanceRepositoryResponse>
     */
    public AsyncInvoker<UpdateInstanceRepositoryRequest, UpdateInstanceRepositoryResponse> updateInstanceRepositoryAsyncInvoker(
        UpdateInstanceRepositoryRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateInstanceRepository, hcClient);
    }

    /**
     * 修改老化策略
     *
     * 修改老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRetentionPolicyRequest 请求对象
     * @return CompletableFuture<UpdateInstanceRetentionPolicyResponse>
     */
    public CompletableFuture<UpdateInstanceRetentionPolicyResponse> updateInstanceRetentionPolicyAsync(
        UpdateInstanceRetentionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateInstanceRetentionPolicy);
    }

    /**
     * 修改老化策略
     *
     * 修改老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRetentionPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRetentionPolicyRequest, UpdateInstanceRetentionPolicyResponse>
     */
    public AsyncInvoker<UpdateInstanceRetentionPolicyRequest, UpdateInstanceRetentionPolicyResponse> updateInstanceRetentionPolicyAsyncInvoker(
        UpdateInstanceRetentionPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateInstanceRetentionPolicy, hcClient);
    }

    /**
     * 修改签名策略
     *
     * 修改签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceSignPolicyRequest 请求对象
     * @return CompletableFuture<UpdateInstanceSignPolicyResponse>
     */
    public CompletableFuture<UpdateInstanceSignPolicyResponse> updateInstanceSignPolicyAsync(
        UpdateInstanceSignPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateInstanceSignPolicy);
    }

    /**
     * 修改签名策略
     *
     * 修改签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceSignPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceSignPolicyRequest, UpdateInstanceSignPolicyResponse>
     */
    public AsyncInvoker<UpdateInstanceSignPolicyRequest, UpdateInstanceSignPolicyResponse> updateInstanceSignPolicyAsyncInvoker(
        UpdateInstanceSignPolicyRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateInstanceSignPolicy, hcClient);
    }

    /**
     * 修改触发器
     *
     * 修改触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceWebhookRequest 请求对象
     * @return CompletableFuture<UpdateInstanceWebhookResponse>
     */
    public CompletableFuture<UpdateInstanceWebhookResponse> updateInstanceWebhookAsync(
        UpdateInstanceWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, SwrMeta.updateInstanceWebhook);
    }

    /**
     * 修改触发器
     *
     * 修改触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceWebhookRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceWebhookRequest, UpdateInstanceWebhookResponse>
     */
    public AsyncInvoker<UpdateInstanceWebhookRequest, UpdateInstanceWebhookResponse> updateInstanceWebhookAsyncInvoker(
        UpdateInstanceWebhookRequest request) {
        return new AsyncInvoker<>(request, SwrMeta.updateInstanceWebhook, hcClient);
    }

}
