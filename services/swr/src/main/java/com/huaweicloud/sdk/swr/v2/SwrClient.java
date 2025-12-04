package com.huaweicloud.sdk.swr.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.swr.v2.model.AddDomainNameRequest;
import com.huaweicloud.sdk.swr.v2.model.AddDomainNameResponse;
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

public class SwrClient {

    protected HcClient hcClient;

    public SwrClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SwrClient> newBuilder() {
        ClientBuilder<SwrClient> clientBuilder = new ClientBuilder<>(SwrClient::new);
        return clientBuilder;
    }

    /**
     * 生成增强型登录指令(新)
     *
     * 调用该接口，通过获取响应消息头的X-Swr-Dockerlogin的值及响应消息体的host值，可生成增强型登录指令,注：此接口只支持IAM新平面的调用方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizationTokenRequest 请求对象
     * @return CreateAuthorizationTokenResponse
     */
    public CreateAuthorizationTokenResponse createAuthorizationToken(CreateAuthorizationTokenRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createAuthorizationToken);
    }

    /**
     * 生成增强型登录指令(新)
     *
     * 调用该接口，通过获取响应消息头的X-Swr-Dockerlogin的值及响应消息体的host值，可生成增强型登录指令,注：此接口只支持IAM新平面的调用方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizationTokenRequest 请求对象
     * @return SyncInvoker<CreateAuthorizationTokenRequest, CreateAuthorizationTokenResponse>
     */
    public SyncInvoker<CreateAuthorizationTokenRequest, CreateAuthorizationTokenResponse> createAuthorizationTokenInvoker(
        CreateAuthorizationTokenRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createAuthorizationToken, hcClient);
    }

    /**
     * 创建镜像自动同步任务
     *
     * 创建镜像自动同步任务，帮助您把最新推送的镜像自动同步到其他区域镜像仓库内。 镜像自动同步帮助您把最新推送的镜像自动同步到其他区域镜像仓库内，后期镜像有更新时，目标仓库的镜像也会自动更新，但已有的镜像不会自动同步。已有镜像的同步需要手动操作，详情请参见手动同步镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageSyncRepoRequest 请求对象
     * @return CreateImageSyncRepoResponse
     */
    public CreateImageSyncRepoResponse createImageSyncRepo(CreateImageSyncRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createImageSyncRepo);
    }

    /**
     * 创建镜像自动同步任务
     *
     * 创建镜像自动同步任务，帮助您把最新推送的镜像自动同步到其他区域镜像仓库内。 镜像自动同步帮助您把最新推送的镜像自动同步到其他区域镜像仓库内，后期镜像有更新时，目标仓库的镜像也会自动更新，但已有的镜像不会自动同步。已有镜像的同步需要手动操作，详情请参见手动同步镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageSyncRepoRequest 请求对象
     * @return SyncInvoker<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse>
     */
    public SyncInvoker<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse> createImageSyncRepoInvoker(
        CreateImageSyncRepoRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createImageSyncRepo, hcClient);
    }

    /**
     * 手动同步镜像
     *
     * 对于镜像仓库已有的镜像，如果想在其他区域使用，需要手动触发镜像同步。 判断是否同步成功的方法如下：响应状态码为200，无报错信息，表示同步成功。通过SWR管理控制台或调用查询镜像仓库概要信息接口，在目标区域的目标组织下，若存在所同步的镜像版本表示同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualImageSyncRepoRequest 请求对象
     * @return CreateManualImageSyncRepoResponse
     */
    public CreateManualImageSyncRepoResponse createManualImageSyncRepo(CreateManualImageSyncRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createManualImageSyncRepo);
    }

    /**
     * 手动同步镜像
     *
     * 对于镜像仓库已有的镜像，如果想在其他区域使用，需要手动触发镜像同步。 判断是否同步成功的方法如下：响应状态码为200，无报错信息，表示同步成功。通过SWR管理控制台或调用查询镜像仓库概要信息接口，在目标区域的目标组织下，若存在所同步的镜像版本表示同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualImageSyncRepoRequest 请求对象
     * @return SyncInvoker<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse>
     */
    public SyncInvoker<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse> createManualImageSyncRepoInvoker(
        CreateManualImageSyncRepoRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createManualImageSyncRepo, hcClient);
    }

    /**
     * 创建组织
     *
     * 创建组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNamespaceRequest 请求对象
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createNamespace);
    }

    /**
     * 创建组织
     *
     * 创建组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNamespaceRequest 请求对象
     * @return SyncInvoker<CreateNamespaceRequest, CreateNamespaceResponse>
     */
    public SyncInvoker<CreateNamespaceRequest, CreateNamespaceResponse> createNamespaceInvoker(
        CreateNamespaceRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createNamespace, hcClient);
    }

    /**
     * 创建组织权限
     *
     * 创建组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNamespaceAuthRequest 请求对象
     * @return CreateNamespaceAuthResponse
     */
    public CreateNamespaceAuthResponse createNamespaceAuth(CreateNamespaceAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createNamespaceAuth);
    }

    /**
     * 创建组织权限
     *
     * 创建组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNamespaceAuthRequest 请求对象
     * @return SyncInvoker<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse>
     */
    public SyncInvoker<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse> createNamespaceAuthInvoker(
        CreateNamespaceAuthRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createNamespaceAuth, hcClient);
    }

    /**
     * 在组织下创建镜像仓库
     *
     * 在组织下创建镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoRequest 请求对象
     * @return CreateRepoResponse
     */
    public CreateRepoResponse createRepo(CreateRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createRepo);
    }

    /**
     * 在组织下创建镜像仓库
     *
     * 在组织下创建镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoRequest 请求对象
     * @return SyncInvoker<CreateRepoRequest, CreateRepoResponse>
     */
    public SyncInvoker<CreateRepoRequest, CreateRepoResponse> createRepoInvoker(CreateRepoRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createRepo, hcClient);
    }

    /**
     * 创建共享帐号
     *
     * 创建共享帐号。镜像上传后，您可以共享私有镜像给其他帐号，并授予下载该镜像的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoDomainsRequest 请求对象
     * @return CreateRepoDomainsResponse
     */
    public CreateRepoDomainsResponse createRepoDomains(CreateRepoDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createRepoDomains);
    }

    /**
     * 创建共享帐号
     *
     * 创建共享帐号。镜像上传后，您可以共享私有镜像给其他帐号，并授予下载该镜像的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoDomainsRequest 请求对象
     * @return SyncInvoker<CreateRepoDomainsRequest, CreateRepoDomainsResponse>
     */
    public SyncInvoker<CreateRepoDomainsRequest, CreateRepoDomainsResponse> createRepoDomainsInvoker(
        CreateRepoDomainsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createRepoDomains, hcClient);
    }

    /**
     * 创建镜像tag
     *
     * 创建镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoTagRequest 请求对象
     * @return CreateRepoTagResponse
     */
    public CreateRepoTagResponse createRepoTag(CreateRepoTagRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createRepoTag);
    }

    /**
     * 创建镜像tag
     *
     * 创建镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepoTagRequest 请求对象
     * @return SyncInvoker<CreateRepoTagRequest, CreateRepoTagResponse>
     */
    public SyncInvoker<CreateRepoTagRequest, CreateRepoTagResponse> createRepoTagInvoker(CreateRepoTagRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createRepoTag, hcClient);
    }

    /**
     * 创建镜像老化规则
     *
     * 创建镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetentionRequest 请求对象
     * @return CreateRetentionResponse
     */
    public CreateRetentionResponse createRetention(CreateRetentionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createRetention);
    }

    /**
     * 创建镜像老化规则
     *
     * 创建镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetentionRequest 请求对象
     * @return SyncInvoker<CreateRetentionRequest, CreateRetentionResponse>
     */
    public SyncInvoker<CreateRetentionRequest, CreateRetentionResponse> createRetentionInvoker(
        CreateRetentionRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createRetention, hcClient);
    }

    /**
     * 生成临时登录指令
     *
     * 调用该接口，通过获取响应消息头的X-Swr-Dockerlogin的值及响应消息体的host值，可生成临时登录指令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretRequest 请求对象
     * @return CreateSecretResponse
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createSecret);
    }

    /**
     * 生成临时登录指令
     *
     * 调用该接口，通过获取响应消息头的X-Swr-Dockerlogin的值及响应消息体的host值，可生成临时登录指令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecretRequest 请求对象
     * @return SyncInvoker<CreateSecretRequest, CreateSecretResponse>
     */
    public SyncInvoker<CreateSecretRequest, CreateSecretResponse> createSecretInvoker(CreateSecretRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createSecret, hcClient);
    }

    /**
     * 创建触发器
     *
     * 创建触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTriggerRequest 请求对象
     * @return CreateTriggerResponse
     */
    public CreateTriggerResponse createTrigger(CreateTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createTrigger);
    }

    /**
     * 创建触发器
     *
     * 创建触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTriggerRequest 请求对象
     * @return SyncInvoker<CreateTriggerRequest, CreateTriggerResponse>
     */
    public SyncInvoker<CreateTriggerRequest, CreateTriggerResponse> createTriggerInvoker(CreateTriggerRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createTrigger, hcClient);
    }

    /**
     * 创建镜像权限
     *
     * 创建镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRepositoryAuthRequest 请求对象
     * @return CreateUserRepositoryAuthResponse
     */
    public CreateUserRepositoryAuthResponse createUserRepositoryAuth(CreateUserRepositoryAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createUserRepositoryAuth);
    }

    /**
     * 创建镜像权限
     *
     * 创建镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRepositoryAuthRequest 请求对象
     * @return SyncInvoker<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse>
     */
    public SyncInvoker<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse> createUserRepositoryAuthInvoker(
        CreateUserRepositoryAuthRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createUserRepositoryAuth, hcClient);
    }

    /**
     * 删除镜像自动同步任务
     *
     * 根据目标区域、目标组织删除指定的镜像自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageSyncRepoRequest 请求对象
     * @return DeleteImageSyncRepoResponse
     */
    public DeleteImageSyncRepoResponse deleteImageSyncRepo(DeleteImageSyncRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteImageSyncRepo);
    }

    /**
     * 删除镜像自动同步任务
     *
     * 根据目标区域、目标组织删除指定的镜像自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageSyncRepoRequest 请求对象
     * @return SyncInvoker<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse>
     */
    public SyncInvoker<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse> deleteImageSyncRepoInvoker(
        DeleteImageSyncRepoRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteImageSyncRepo, hcClient);
    }

    /**
     * 删除组织权限
     *
     * 删除组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNamespaceAuthRequest 请求对象
     * @return DeleteNamespaceAuthResponse
     */
    public DeleteNamespaceAuthResponse deleteNamespaceAuth(DeleteNamespaceAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteNamespaceAuth);
    }

    /**
     * 删除组织权限
     *
     * 删除组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNamespaceAuthRequest 请求对象
     * @return SyncInvoker<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse>
     */
    public SyncInvoker<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse> deleteNamespaceAuthInvoker(
        DeleteNamespaceAuthRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteNamespaceAuth, hcClient);
    }

    /**
     * 删除组织
     *
     * 删除组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNamespacesRequest 请求对象
     * @return DeleteNamespacesResponse
     */
    public DeleteNamespacesResponse deleteNamespaces(DeleteNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteNamespaces);
    }

    /**
     * 删除组织
     *
     * 删除组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNamespacesRequest 请求对象
     * @return SyncInvoker<DeleteNamespacesRequest, DeleteNamespacesResponse>
     */
    public SyncInvoker<DeleteNamespacesRequest, DeleteNamespacesResponse> deleteNamespacesInvoker(
        DeleteNamespacesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteNamespaces, hcClient);
    }

    /**
     * 删除组织下的镜像仓库
     *
     * 删除组织下的镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoRequest 请求对象
     * @return DeleteRepoResponse
     */
    public DeleteRepoResponse deleteRepo(DeleteRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteRepo);
    }

    /**
     * 删除组织下的镜像仓库
     *
     * 删除组织下的镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoRequest 请求对象
     * @return SyncInvoker<DeleteRepoRequest, DeleteRepoResponse>
     */
    public SyncInvoker<DeleteRepoRequest, DeleteRepoResponse> deleteRepoInvoker(DeleteRepoRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteRepo, hcClient);
    }

    /**
     * 删除共享帐号
     *
     * 删除共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoDomainsRequest 请求对象
     * @return DeleteRepoDomainsResponse
     */
    public DeleteRepoDomainsResponse deleteRepoDomains(DeleteRepoDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteRepoDomains);
    }

    /**
     * 删除共享帐号
     *
     * 删除共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoDomainsRequest 请求对象
     * @return SyncInvoker<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse>
     */
    public SyncInvoker<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse> deleteRepoDomainsInvoker(
        DeleteRepoDomainsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteRepoDomains, hcClient);
    }

    /**
     * 删除指定tag的镜像
     *
     * 删除镜像仓库中指定tag的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoTagRequest 请求对象
     * @return DeleteRepoTagResponse
     */
    public DeleteRepoTagResponse deleteRepoTag(DeleteRepoTagRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteRepoTag);
    }

    /**
     * 删除指定tag的镜像
     *
     * 删除镜像仓库中指定tag的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoTagRequest 请求对象
     * @return SyncInvoker<DeleteRepoTagRequest, DeleteRepoTagResponse>
     */
    public SyncInvoker<DeleteRepoTagRequest, DeleteRepoTagResponse> deleteRepoTagInvoker(DeleteRepoTagRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteRepoTag, hcClient);
    }

    /**
     * 删除镜像老化规则
     *
     * 删除镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRetentionRequest 请求对象
     * @return DeleteRetentionResponse
     */
    public DeleteRetentionResponse deleteRetention(DeleteRetentionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteRetention);
    }

    /**
     * 删除镜像老化规则
     *
     * 删除镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRetentionRequest 请求对象
     * @return SyncInvoker<DeleteRetentionRequest, DeleteRetentionResponse>
     */
    public SyncInvoker<DeleteRetentionRequest, DeleteRetentionResponse> deleteRetentionInvoker(
        DeleteRetentionRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteRetention, hcClient);
    }

    /**
     * 删除触发器
     *
     * 删除触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTriggerRequest 请求对象
     * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTrigger(DeleteTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteTrigger);
    }

    /**
     * 删除触发器
     *
     * 删除触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTriggerRequest 请求对象
     * @return SyncInvoker<DeleteTriggerRequest, DeleteTriggerResponse>
     */
    public SyncInvoker<DeleteTriggerRequest, DeleteTriggerResponse> deleteTriggerInvoker(DeleteTriggerRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteTrigger, hcClient);
    }

    /**
     * 删除镜像权限
     *
     * 删除镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRepositoryAuthRequest 请求对象
     * @return DeleteUserRepositoryAuthResponse
     */
    public DeleteUserRepositoryAuthResponse deleteUserRepositoryAuth(DeleteUserRepositoryAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteUserRepositoryAuth);
    }

    /**
     * 删除镜像权限
     *
     * 删除镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRepositoryAuthRequest 请求对象
     * @return SyncInvoker<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse>
     */
    public SyncInvoker<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse> deleteUserRepositoryAuthInvoker(
        DeleteUserRepositoryAuthRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteUserRepositoryAuth, hcClient);
    }

    /**
     * 获取镜像自动同步任务列表
     *
     * 获取为当前镜像仓库所创建的所有自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageAutoSyncReposDetailsRequest 请求对象
     * @return ListImageAutoSyncReposDetailsResponse
     */
    public ListImageAutoSyncReposDetailsResponse listImageAutoSyncReposDetails(
        ListImageAutoSyncReposDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listImageAutoSyncReposDetails);
    }

    /**
     * 获取镜像自动同步任务列表
     *
     * 获取为当前镜像仓库所创建的所有自动同步任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageAutoSyncReposDetailsRequest 请求对象
     * @return SyncInvoker<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse>
     */
    public SyncInvoker<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse> listImageAutoSyncReposDetailsInvoker(
        ListImageAutoSyncReposDetailsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listImageAutoSyncReposDetails, hcClient);
    }

    /**
     * 查询组织列表
     *
     * 查询组织列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespacesRequest 请求对象
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listNamespaces);
    }

    /**
     * 查询组织列表
     *
     * 查询组织列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespacesRequest 请求对象
     * @return SyncInvoker<ListNamespacesRequest, ListNamespacesResponse>
     */
    public SyncInvoker<ListNamespacesRequest, ListNamespacesResponse> listNamespacesInvoker(
        ListNamespacesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listNamespaces, hcClient);
    }

    /**
     * 获取配额信息
     *
     * 获取配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listQuotas);
    }

    /**
     * 获取配额信息
     *
     * 获取配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listQuotas, hcClient);
    }

    /**
     * 查询镜像仓库列表详情
     *
     * 查询镜像仓库列表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoDetailsRequest 请求对象
     * @return ListRepoDetailsResponse
     */
    public ListRepoDetailsResponse listRepoDetails(ListRepoDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listRepoDetails);
    }

    /**
     * 查询镜像仓库列表详情
     *
     * 查询镜像仓库列表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoDetailsRequest 请求对象
     * @return SyncInvoker<ListRepoDetailsRequest, ListRepoDetailsResponse>
     */
    public SyncInvoker<ListRepoDetailsRequest, ListRepoDetailsResponse> listRepoDetailsInvoker(
        ListRepoDetailsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listRepoDetails, hcClient);
    }

    /**
     * 获取共享帐号列表
     *
     * 获取共享帐号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoDomainsRequest 请求对象
     * @return ListRepoDomainsResponse
     */
    public ListRepoDomainsResponse listRepoDomains(ListRepoDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listRepoDomains);
    }

    /**
     * 获取共享帐号列表
     *
     * 获取共享帐号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoDomainsRequest 请求对象
     * @return SyncInvoker<ListRepoDomainsRequest, ListRepoDomainsResponse>
     */
    public SyncInvoker<ListRepoDomainsRequest, ListRepoDomainsResponse> listRepoDomainsInvoker(
        ListRepoDomainsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listRepoDomains, hcClient);
    }

    /**
     * 查询镜像仓库列表
     *
     * 查询镜像仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReposDetailsRequest 请求对象
     * @return ListReposDetailsResponse
     */
    public ListReposDetailsResponse listReposDetails(ListReposDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listReposDetails);
    }

    /**
     * 查询镜像仓库列表
     *
     * 查询镜像仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReposDetailsRequest 请求对象
     * @return SyncInvoker<ListReposDetailsRequest, ListReposDetailsResponse>
     */
    public SyncInvoker<ListReposDetailsRequest, ListReposDetailsResponse> listReposDetailsInvoker(
        ListReposDetailsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listReposDetails, hcClient);
    }

    /**
     * 查询镜像tag列表详情
     *
     * 查询镜像tag列表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryTagRequest 请求对象
     * @return ListRepositoryTagResponse
     */
    public ListRepositoryTagResponse listRepositoryTag(ListRepositoryTagRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listRepositoryTag);
    }

    /**
     * 查询镜像tag列表详情
     *
     * 查询镜像tag列表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryTagRequest 请求对象
     * @return SyncInvoker<ListRepositoryTagRequest, ListRepositoryTagResponse>
     */
    public SyncInvoker<ListRepositoryTagRequest, ListRepositoryTagResponse> listRepositoryTagInvoker(
        ListRepositoryTagRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listRepositoryTag, hcClient);
    }

    /**
     * 查询镜像tag列表
     *
     * 查询镜像tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryTagsRequest 请求对象
     * @return ListRepositoryTagsResponse
     */
    public ListRepositoryTagsResponse listRepositoryTags(ListRepositoryTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listRepositoryTags);
    }

    /**
     * 查询镜像tag列表
     *
     * 查询镜像tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryTagsRequest 请求对象
     * @return SyncInvoker<ListRepositoryTagsRequest, ListRepositoryTagsResponse>
     */
    public SyncInvoker<ListRepositoryTagsRequest, ListRepositoryTagsResponse> listRepositoryTagsInvoker(
        ListRepositoryTagsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listRepositoryTags, hcClient);
    }

    /**
     * 获取镜像老化记录
     *
     * 获取镜像老化记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetentionHistoriesRequest 请求对象
     * @return ListRetentionHistoriesResponse
     */
    public ListRetentionHistoriesResponse listRetentionHistories(ListRetentionHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listRetentionHistories);
    }

    /**
     * 获取镜像老化记录
     *
     * 获取镜像老化记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetentionHistoriesRequest 请求对象
     * @return SyncInvoker<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse>
     */
    public SyncInvoker<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse> listRetentionHistoriesInvoker(
        ListRetentionHistoriesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listRetentionHistories, hcClient);
    }

    /**
     * 获取镜像老化规则列表
     *
     * 获取镜像老化规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetentionsRequest 请求对象
     * @return ListRetentionsResponse
     */
    public ListRetentionsResponse listRetentions(ListRetentionsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listRetentions);
    }

    /**
     * 获取镜像老化规则列表
     *
     * 获取镜像老化规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetentionsRequest 请求对象
     * @return SyncInvoker<ListRetentionsRequest, ListRetentionsResponse>
     */
    public SyncInvoker<ListRetentionsRequest, ListRetentionsResponse> listRetentionsInvoker(
        ListRetentionsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listRetentions, hcClient);
    }

    /**
     * 查询共享镜像列表详情
     *
     * 查询共享镜像列表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedRepoDetailsRequest 请求对象
     * @return ListSharedRepoDetailsResponse
     */
    public ListSharedRepoDetailsResponse listSharedRepoDetails(ListSharedRepoDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listSharedRepoDetails);
    }

    /**
     * 查询共享镜像列表详情
     *
     * 查询共享镜像列表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedRepoDetailsRequest 请求对象
     * @return SyncInvoker<ListSharedRepoDetailsRequest, ListSharedRepoDetailsResponse>
     */
    public SyncInvoker<ListSharedRepoDetailsRequest, ListSharedRepoDetailsResponse> listSharedRepoDetailsInvoker(
        ListSharedRepoDetailsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listSharedRepoDetails, hcClient);
    }

    /**
     * 查询共享镜像列表
     *
     * 查询共享镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedReposDetailsRequest 请求对象
     * @return ListSharedReposDetailsResponse
     */
    public ListSharedReposDetailsResponse listSharedReposDetails(ListSharedReposDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listSharedReposDetails);
    }

    /**
     * 查询共享镜像列表
     *
     * 查询共享镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedReposDetailsRequest 请求对象
     * @return SyncInvoker<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse>
     */
    public SyncInvoker<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse> listSharedReposDetailsInvoker(
        ListSharedReposDetailsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listSharedReposDetails, hcClient);
    }

    /**
     * 获取镜像仓库下的触发器列表
     *
     * 获取镜像仓库下的触发器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTriggersDetailsRequest 请求对象
     * @return ListTriggersDetailsResponse
     */
    public ListTriggersDetailsResponse listTriggersDetails(ListTriggersDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listTriggersDetails);
    }

    /**
     * 获取镜像仓库下的触发器列表
     *
     * 获取镜像仓库下的触发器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTriggersDetailsRequest 请求对象
     * @return SyncInvoker<ListTriggersDetailsRequest, ListTriggersDetailsResponse>
     */
    public SyncInvoker<ListTriggersDetailsRequest, ListTriggersDetailsResponse> listTriggersDetailsInvoker(
        ListTriggersDetailsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listTriggersDetails, hcClient);
    }

    /**
     * 判断共享帐号是否存在
     *
     * 判断共享租户是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessDomainRequest 请求对象
     * @return ShowAccessDomainResponse
     */
    public ShowAccessDomainResponse showAccessDomain(ShowAccessDomainRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showAccessDomain);
    }

    /**
     * 判断共享帐号是否存在
     *
     * 判断共享租户是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessDomainRequest 请求对象
     * @return SyncInvoker<ShowAccessDomainRequest, ShowAccessDomainResponse>
     */
    public SyncInvoker<ShowAccessDomainRequest, ShowAccessDomainResponse> showAccessDomainInvoker(
        ShowAccessDomainRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showAccessDomain, hcClient);
    }

    /**
     * 获取租户总览信息
     *
     * 获取租户总览信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainOverviewRequest 请求对象
     * @return ShowDomainOverviewResponse
     */
    public ShowDomainOverviewResponse showDomainOverview(ShowDomainOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showDomainOverview);
    }

    /**
     * 获取租户总览信息
     *
     * 获取租户总览信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainOverviewRequest 请求对象
     * @return SyncInvoker<ShowDomainOverviewRequest, ShowDomainOverviewResponse>
     */
    public SyncInvoker<ShowDomainOverviewRequest, ShowDomainOverviewResponse> showDomainOverviewInvoker(
        ShowDomainOverviewRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showDomainOverview, hcClient);
    }

    /**
     * 获取租户资源统计信息
     *
     * 获取租户资源统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainResourceReportsRequest 请求对象
     * @return ShowDomainResourceReportsResponse
     */
    public ShowDomainResourceReportsResponse showDomainResourceReports(ShowDomainResourceReportsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showDomainResourceReports);
    }

    /**
     * 获取租户资源统计信息
     *
     * 获取租户资源统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainResourceReportsRequest 请求对象
     * @return SyncInvoker<ShowDomainResourceReportsRequest, ShowDomainResourceReportsResponse>
     */
    public SyncInvoker<ShowDomainResourceReportsRequest, ShowDomainResourceReportsResponse> showDomainResourceReportsInvoker(
        ShowDomainResourceReportsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showDomainResourceReports, hcClient);
    }

    /**
     * 获取组织详情
     *
     * 获取组织详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNamespaceRequest 请求对象
     * @return ShowNamespaceResponse
     */
    public ShowNamespaceResponse showNamespace(ShowNamespaceRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showNamespace);
    }

    /**
     * 获取组织详情
     *
     * 获取组织详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNamespaceRequest 请求对象
     * @return SyncInvoker<ShowNamespaceRequest, ShowNamespaceResponse>
     */
    public SyncInvoker<ShowNamespaceRequest, ShowNamespaceResponse> showNamespaceInvoker(ShowNamespaceRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showNamespace, hcClient);
    }

    /**
     * 查询组织权限
     *
     * 查询组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNamespaceAuthRequest 请求对象
     * @return ShowNamespaceAuthResponse
     */
    public ShowNamespaceAuthResponse showNamespaceAuth(ShowNamespaceAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showNamespaceAuth);
    }

    /**
     * 查询组织权限
     *
     * 查询组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNamespaceAuthRequest 请求对象
     * @return SyncInvoker<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse>
     */
    public SyncInvoker<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse> showNamespaceAuthInvoker(
        ShowNamespaceAuthRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showNamespaceAuth, hcClient);
    }

    /**
     * 查询指定tag的镜像详情
     *
     * 查询镜像仓库中指定tag的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepoTagRequest 请求对象
     * @return ShowRepoTagResponse
     */
    public ShowRepoTagResponse showRepoTag(ShowRepoTagRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showRepoTag);
    }

    /**
     * 查询指定tag的镜像详情
     *
     * 查询镜像仓库中指定tag的镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepoTagRequest 请求对象
     * @return SyncInvoker<ShowRepoTagRequest, ShowRepoTagResponse>
     */
    public SyncInvoker<ShowRepoTagRequest, ShowRepoTagResponse> showRepoTagInvoker(ShowRepoTagRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showRepoTag, hcClient);
    }

    /**
     * 查询镜像仓库概要信息
     *
     * 查询镜像仓库概要信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryRequest 请求对象
     * @return ShowRepositoryResponse
     */
    public ShowRepositoryResponse showRepository(ShowRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showRepository);
    }

    /**
     * 查询镜像仓库概要信息
     *
     * 查询镜像仓库概要信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryRequest 请求对象
     * @return SyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse>
     */
    public SyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse> showRepositoryInvoker(
        ShowRepositoryRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showRepository, hcClient);
    }

    /**
     * 获取镜像老化规则记录
     *
     * 获取镜像老化规则记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRetentionRequest 请求对象
     * @return ShowRetentionResponse
     */
    public ShowRetentionResponse showRetention(ShowRetentionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showRetention);
    }

    /**
     * 获取镜像老化规则记录
     *
     * 获取镜像老化规则记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRetentionRequest 请求对象
     * @return SyncInvoker<ShowRetentionRequest, ShowRetentionResponse>
     */
    public SyncInvoker<ShowRetentionRequest, ShowRetentionResponse> showRetentionInvoker(ShowRetentionRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showRetention, hcClient);
    }

    /**
     * 查询服务特性开关信息
     *
     * 查询服务特性开关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShareFeatureGatesRequest 请求对象
     * @return ShowShareFeatureGatesResponse
     */
    public ShowShareFeatureGatesResponse showShareFeatureGates(ShowShareFeatureGatesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showShareFeatureGates);
    }

    /**
     * 查询服务特性开关信息
     *
     * 查询服务特性开关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShareFeatureGatesRequest 请求对象
     * @return SyncInvoker<ShowShareFeatureGatesRequest, ShowShareFeatureGatesResponse>
     */
    public SyncInvoker<ShowShareFeatureGatesRequest, ShowShareFeatureGatesResponse> showShareFeatureGatesInvoker(
        ShowShareFeatureGatesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showShareFeatureGates, hcClient);
    }

    /**
     * 获取镜像自动同步任务信息
     *
     * 创建镜像自动同步任务后，可以通过此接口查询该任务的状态，以判断是否同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSyncJobRequest 请求对象
     * @return ShowSyncJobResponse
     */
    public ShowSyncJobResponse showSyncJob(ShowSyncJobRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showSyncJob);
    }

    /**
     * 获取镜像自动同步任务信息
     *
     * 创建镜像自动同步任务后，可以通过此接口查询该任务的状态，以判断是否同步成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSyncJobRequest 请求对象
     * @return SyncInvoker<ShowSyncJobRequest, ShowSyncJobResponse>
     */
    public SyncInvoker<ShowSyncJobRequest, ShowSyncJobResponse> showSyncJobInvoker(ShowSyncJobRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showSyncJob, hcClient);
    }

    /**
     * 获取触发器详情
     *
     * 获取触发器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTriggerRequest 请求对象
     * @return ShowTriggerResponse
     */
    public ShowTriggerResponse showTrigger(ShowTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showTrigger);
    }

    /**
     * 获取触发器详情
     *
     * 获取触发器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTriggerRequest 请求对象
     * @return SyncInvoker<ShowTriggerRequest, ShowTriggerResponse>
     */
    public SyncInvoker<ShowTriggerRequest, ShowTriggerResponse> showTriggerInvoker(ShowTriggerRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showTrigger, hcClient);
    }

    /**
     * 查询镜像权限
     *
     * 查询镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRepositoryAuthRequest 请求对象
     * @return ShowUserRepositoryAuthResponse
     */
    public ShowUserRepositoryAuthResponse showUserRepositoryAuth(ShowUserRepositoryAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showUserRepositoryAuth);
    }

    /**
     * 查询镜像权限
     *
     * 查询镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRepositoryAuthRequest 请求对象
     * @return SyncInvoker<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse>
     */
    public SyncInvoker<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse> showUserRepositoryAuthInvoker(
        ShowUserRepositoryAuthRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showUserRepositoryAuth, hcClient);
    }

    /**
     * 更新组织权限
     *
     * 更新组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNamespaceAuthRequest 请求对象
     * @return UpdateNamespaceAuthResponse
     */
    public UpdateNamespaceAuthResponse updateNamespaceAuth(UpdateNamespaceAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateNamespaceAuth);
    }

    /**
     * 更新组织权限
     *
     * 更新组织权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNamespaceAuthRequest 请求对象
     * @return SyncInvoker<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse>
     */
    public SyncInvoker<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse> updateNamespaceAuthInvoker(
        UpdateNamespaceAuthRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateNamespaceAuth, hcClient);
    }

    /**
     * 更新镜像仓库的概要信息
     *
     * 更新租户组织下的镜像概要信息，包括镜像类型、是否公有、描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoRequest 请求对象
     * @return UpdateRepoResponse
     */
    public UpdateRepoResponse updateRepo(UpdateRepoRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateRepo);
    }

    /**
     * 更新镜像仓库的概要信息
     *
     * 更新租户组织下的镜像概要信息，包括镜像类型、是否公有、描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoRequest 请求对象
     * @return SyncInvoker<UpdateRepoRequest, UpdateRepoResponse>
     */
    public SyncInvoker<UpdateRepoRequest, UpdateRepoResponse> updateRepoInvoker(UpdateRepoRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateRepo, hcClient);
    }

    /**
     * 更新共享帐号
     *
     * 更新共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoDomainsRequest 请求对象
     * @return UpdateRepoDomainsResponse
     */
    public UpdateRepoDomainsResponse updateRepoDomains(UpdateRepoDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateRepoDomains);
    }

    /**
     * 更新共享帐号
     *
     * 更新共享帐号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepoDomainsRequest 请求对象
     * @return SyncInvoker<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse>
     */
    public SyncInvoker<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse> updateRepoDomainsInvoker(
        UpdateRepoDomainsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateRepoDomains, hcClient);
    }

    /**
     * 修改镜像老化规则
     *
     * 修改镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRetentionRequest 请求对象
     * @return UpdateRetentionResponse
     */
    public UpdateRetentionResponse updateRetention(UpdateRetentionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateRetention);
    }

    /**
     * 修改镜像老化规则
     *
     * 修改镜像老化规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRetentionRequest 请求对象
     * @return SyncInvoker<UpdateRetentionRequest, UpdateRetentionResponse>
     */
    public SyncInvoker<UpdateRetentionRequest, UpdateRetentionResponse> updateRetentionInvoker(
        UpdateRetentionRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateRetention, hcClient);
    }

    /**
     * 更新触发器配置
     *
     * 更新触发器配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTriggerRequest 请求对象
     * @return UpdateTriggerResponse
     */
    public UpdateTriggerResponse updateTrigger(UpdateTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateTrigger);
    }

    /**
     * 更新触发器配置
     *
     * 更新触发器配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTriggerRequest 请求对象
     * @return SyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse>
     */
    public SyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse> updateTriggerInvoker(UpdateTriggerRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateTrigger, hcClient);
    }

    /**
     * 更新镜像权限
     *
     * 更新镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRepositoryAuthRequest 请求对象
     * @return UpdateUserRepositoryAuthResponse
     */
    public UpdateUserRepositoryAuthResponse updateUserRepositoryAuth(UpdateUserRepositoryAuthRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateUserRepositoryAuth);
    }

    /**
     * 更新镜像权限
     *
     * 更新镜像权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRepositoryAuthRequest 请求对象
     * @return SyncInvoker<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse>
     */
    public SyncInvoker<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse> updateUserRepositoryAuthInvoker(
        UpdateUserRepositoryAuthRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateUserRepositoryAuth, hcClient);
    }

    /**
     * 查询所有API版本信息
     *
     * 查询所有API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listApiVersions);
    }

    /**
     * 查询所有API版本信息
     *
     * 查询所有API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showApiVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showApiVersion, hcClient);
    }

    /**
     * 增加域名
     *
     * 增加域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainNameRequest 请求对象
     * @return AddDomainNameResponse
     */
    public AddDomainNameResponse addDomainName(AddDomainNameRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.addDomainName);
    }

    /**
     * 增加域名
     *
     * 增加域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainNameRequest 请求对象
     * @return SyncInvoker<AddDomainNameRequest, AddDomainNameResponse>
     */
    public SyncInvoker<AddDomainNameRequest, AddDomainNameResponse> addDomainNameInvoker(AddDomainNameRequest request) {
        return new SyncInvoker<>(request, SwrMeta.addDomainName, hcClient);
    }

    /**
     * 创建不可变Tag策略
     *
     * 创建不可变Tag策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImmutableRuleRequest 请求对象
     * @return CreateImmutableRuleResponse
     */
    public CreateImmutableRuleResponse createImmutableRule(CreateImmutableRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createImmutableRule);
    }

    /**
     * 创建不可变Tag策略
     *
     * 创建不可变Tag策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImmutableRuleRequest 请求对象
     * @return SyncInvoker<CreateImmutableRuleRequest, CreateImmutableRuleResponse>
     */
    public SyncInvoker<CreateImmutableRuleRequest, CreateImmutableRuleResponse> createImmutableRuleInvoker(
        CreateImmutableRuleRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createImmutableRule, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建企业仓库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createInstance);
    }

    /**
     * 创建实例
     *
     * 创建企业仓库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createInstance, hcClient);
    }

    /**
     * 开启或关闭公网访问
     *
     * 开启或关闭公网访问
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceEndpointPolicyRequest 请求对象
     * @return CreateInstanceEndpointPolicyResponse
     */
    public CreateInstanceEndpointPolicyResponse createInstanceEndpointPolicy(
        CreateInstanceEndpointPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createInstanceEndpointPolicy);
    }

    /**
     * 开启或关闭公网访问
     *
     * 开启或关闭公网访问
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceEndpointPolicyRequest 请求对象
     * @return SyncInvoker<CreateInstanceEndpointPolicyRequest, CreateInstanceEndpointPolicyResponse>
     */
    public SyncInvoker<CreateInstanceEndpointPolicyRequest, CreateInstanceEndpointPolicyResponse> createInstanceEndpointPolicyInvoker(
        CreateInstanceEndpointPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createInstanceEndpointPolicy, hcClient);
    }

    /**
     * 新增内网访问
     *
     * 新增内网访问
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceInternalEndpointRequest 请求对象
     * @return CreateInstanceInternalEndpointResponse
     */
    public CreateInstanceInternalEndpointResponse createInstanceInternalEndpoint(
        CreateInstanceInternalEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createInstanceInternalEndpoint);
    }

    /**
     * 新增内网访问
     *
     * 新增内网访问
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceInternalEndpointRequest 请求对象
     * @return SyncInvoker<CreateInstanceInternalEndpointRequest, CreateInstanceInternalEndpointResponse>
     */
    public SyncInvoker<CreateInstanceInternalEndpointRequest, CreateInstanceInternalEndpointResponse> createInstanceInternalEndpointInvoker(
        CreateInstanceInternalEndpointRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createInstanceInternalEndpoint, hcClient);
    }

    /**
     * 创建长期访问凭证
     *
     * 创建长期访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceLtCredentialRequest 请求对象
     * @return CreateInstanceLtCredentialResponse
     */
    public CreateInstanceLtCredentialResponse createInstanceLtCredential(CreateInstanceLtCredentialRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createInstanceLtCredential);
    }

    /**
     * 创建长期访问凭证
     *
     * 创建长期访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceLtCredentialRequest 请求对象
     * @return SyncInvoker<CreateInstanceLtCredentialRequest, CreateInstanceLtCredentialResponse>
     */
    public SyncInvoker<CreateInstanceLtCredentialRequest, CreateInstanceLtCredentialResponse> createInstanceLtCredentialInvoker(
        CreateInstanceLtCredentialRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createInstanceLtCredential, hcClient);
    }

    /**
     * 创建命名空间
     *
     * 创建命名空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceNamespaceRequest 请求对象
     * @return CreateInstanceNamespaceResponse
     */
    public CreateInstanceNamespaceResponse createInstanceNamespace(CreateInstanceNamespaceRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createInstanceNamespace);
    }

    /**
     * 创建命名空间
     *
     * 创建命名空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceNamespaceRequest 请求对象
     * @return SyncInvoker<CreateInstanceNamespaceRequest, CreateInstanceNamespaceResponse>
     */
    public SyncInvoker<CreateInstanceNamespaceRequest, CreateInstanceNamespaceResponse> createInstanceNamespaceInvoker(
        CreateInstanceNamespaceRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createInstanceNamespace, hcClient);
    }

    /**
     * 创建镜像同步的目标仓库
     *
     * 创建镜像同步的目标仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRegistryRequest 请求对象
     * @return CreateInstanceRegistryResponse
     */
    public CreateInstanceRegistryResponse createInstanceRegistry(CreateInstanceRegistryRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createInstanceRegistry);
    }

    /**
     * 创建镜像同步的目标仓库
     *
     * 创建镜像同步的目标仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRegistryRequest 请求对象
     * @return SyncInvoker<CreateInstanceRegistryRequest, CreateInstanceRegistryResponse>
     */
    public SyncInvoker<CreateInstanceRegistryRequest, CreateInstanceRegistryResponse> createInstanceRegistryInvoker(
        CreateInstanceRegistryRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createInstanceRegistry, hcClient);
    }

    /**
     * 创建镜像同步策略
     *
     * 创建镜像同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceReplicationPolicyRequest 请求对象
     * @return CreateInstanceReplicationPolicyResponse
     */
    public CreateInstanceReplicationPolicyResponse createInstanceReplicationPolicy(
        CreateInstanceReplicationPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createInstanceReplicationPolicy);
    }

    /**
     * 创建镜像同步策略
     *
     * 创建镜像同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceReplicationPolicyRequest 请求对象
     * @return SyncInvoker<CreateInstanceReplicationPolicyRequest, CreateInstanceReplicationPolicyResponse>
     */
    public SyncInvoker<CreateInstanceReplicationPolicyRequest, CreateInstanceReplicationPolicyResponse> createInstanceReplicationPolicyInvoker(
        CreateInstanceReplicationPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createInstanceReplicationPolicy, hcClient);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceResourceTagsRequest 请求对象
     * @return CreateInstanceResourceTagsResponse
     */
    public CreateInstanceResourceTagsResponse createInstanceResourceTags(CreateInstanceResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createInstanceResourceTags);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceResourceTagsRequest 请求对象
     * @return SyncInvoker<CreateInstanceResourceTagsRequest, CreateInstanceResourceTagsResponse>
     */
    public SyncInvoker<CreateInstanceResourceTagsRequest, CreateInstanceResourceTagsResponse> createInstanceResourceTagsInvoker(
        CreateInstanceResourceTagsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createInstanceResourceTags, hcClient);
    }

    /**
     * 创建老化策略
     *
     * 创建老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRetentionPolicyRequest 请求对象
     * @return CreateInstanceRetentionPolicyResponse
     */
    public CreateInstanceRetentionPolicyResponse createInstanceRetentionPolicy(
        CreateInstanceRetentionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createInstanceRetentionPolicy);
    }

    /**
     * 创建老化策略
     *
     * 创建老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRetentionPolicyRequest 请求对象
     * @return SyncInvoker<CreateInstanceRetentionPolicyRequest, CreateInstanceRetentionPolicyResponse>
     */
    public SyncInvoker<CreateInstanceRetentionPolicyRequest, CreateInstanceRetentionPolicyResponse> createInstanceRetentionPolicyInvoker(
        CreateInstanceRetentionPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createInstanceRetentionPolicy, hcClient);
    }

    /**
     * 创建签名策略
     *
     * 创建签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceSignPolicyRequest 请求对象
     * @return CreateInstanceSignPolicyResponse
     */
    public CreateInstanceSignPolicyResponse createInstanceSignPolicy(CreateInstanceSignPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createInstanceSignPolicy);
    }

    /**
     * 创建签名策略
     *
     * 创建签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceSignPolicyRequest 请求对象
     * @return SyncInvoker<CreateInstanceSignPolicyRequest, CreateInstanceSignPolicyResponse>
     */
    public SyncInvoker<CreateInstanceSignPolicyRequest, CreateInstanceSignPolicyResponse> createInstanceSignPolicyInvoker(
        CreateInstanceSignPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createInstanceSignPolicy, hcClient);
    }

    /**
     * 获取临时访问凭证
     *
     * 获取临时访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceTempCredentialRequest 请求对象
     * @return CreateInstanceTempCredentialResponse
     */
    public CreateInstanceTempCredentialResponse createInstanceTempCredential(
        CreateInstanceTempCredentialRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createInstanceTempCredential);
    }

    /**
     * 获取临时访问凭证
     *
     * 获取临时访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceTempCredentialRequest 请求对象
     * @return SyncInvoker<CreateInstanceTempCredentialRequest, CreateInstanceTempCredentialResponse>
     */
    public SyncInvoker<CreateInstanceTempCredentialRequest, CreateInstanceTempCredentialResponse> createInstanceTempCredentialInvoker(
        CreateInstanceTempCredentialRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createInstanceTempCredential, hcClient);
    }

    /**
     * 创建触发器
     *
     * 创建触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceWebhookRequest 请求对象
     * @return CreateInstanceWebhookResponse
     */
    public CreateInstanceWebhookResponse createInstanceWebhook(CreateInstanceWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createInstanceWebhook);
    }

    /**
     * 创建触发器
     *
     * 创建触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceWebhookRequest 请求对象
     * @return SyncInvoker<CreateInstanceWebhookRequest, CreateInstanceWebhookResponse>
     */
    public SyncInvoker<CreateInstanceWebhookRequest, CreateInstanceWebhookResponse> createInstanceWebhookInvoker(
        CreateInstanceWebhookRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createInstanceWebhook, hcClient);
    }

    /**
     * 批量添加子资源标签
     *
     * 批量添加子资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubResourceTagsRequest 请求对象
     * @return CreateSubResourceTagsResponse
     */
    public CreateSubResourceTagsResponse createSubResourceTags(CreateSubResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.createSubResourceTags);
    }

    /**
     * 批量添加子资源标签
     *
     * 批量添加子资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubResourceTagsRequest 请求对象
     * @return SyncInvoker<CreateSubResourceTagsRequest, CreateSubResourceTagsResponse>
     */
    public SyncInvoker<CreateSubResourceTagsRequest, CreateSubResourceTagsResponse> createSubResourceTagsInvoker(
        CreateSubResourceTagsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.createSubResourceTags, hcClient);
    }

    /**
     * 删除域名
     *
     * 删除域名，SWR企业仓库的默认域名无法删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainNameRequest 请求对象
     * @return DeleteDomainNameResponse
     */
    public DeleteDomainNameResponse deleteDomainName(DeleteDomainNameRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteDomainName);
    }

    /**
     * 删除域名
     *
     * 删除域名，SWR企业仓库的默认域名无法删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainNameRequest 请求对象
     * @return SyncInvoker<DeleteDomainNameRequest, DeleteDomainNameResponse>
     */
    public SyncInvoker<DeleteDomainNameRequest, DeleteDomainNameResponse> deleteDomainNameInvoker(
        DeleteDomainNameRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteDomainName, hcClient);
    }

    /**
     * 删除不可变Tag策略
     *
     * 删除不可变Tag策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImmutableRuleRequest 请求对象
     * @return DeleteImmutableRuleResponse
     */
    public DeleteImmutableRuleResponse deleteImmutableRule(DeleteImmutableRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteImmutableRule);
    }

    /**
     * 删除不可变Tag策略
     *
     * 删除不可变Tag策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImmutableRuleRequest 请求对象
     * @return SyncInvoker<DeleteImmutableRuleRequest, DeleteImmutableRuleResponse>
     */
    public SyncInvoker<DeleteImmutableRuleRequest, DeleteImmutableRuleResponse> deleteImmutableRuleInvoker(
        DeleteImmutableRuleRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteImmutableRule, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteInstance, hcClient);
    }

    /**
     * 删除制品版本
     *
     * 删除制品版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceArtifactRequest 请求对象
     * @return DeleteInstanceArtifactResponse
     */
    public DeleteInstanceArtifactResponse deleteInstanceArtifact(DeleteInstanceArtifactRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteInstanceArtifact);
    }

    /**
     * 删除制品版本
     *
     * 删除制品版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceArtifactRequest 请求对象
     * @return SyncInvoker<DeleteInstanceArtifactRequest, DeleteInstanceArtifactResponse>
     */
    public SyncInvoker<DeleteInstanceArtifactRequest, DeleteInstanceArtifactResponse> deleteInstanceArtifactInvoker(
        DeleteInstanceArtifactRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteInstanceArtifact, hcClient);
    }

    /**
     * 删除内网访问
     *
     * 删除内网访问
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceInternalEndpointRequest 请求对象
     * @return DeleteInstanceInternalEndpointResponse
     */
    public DeleteInstanceInternalEndpointResponse deleteInstanceInternalEndpoint(
        DeleteInstanceInternalEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteInstanceInternalEndpoint);
    }

    /**
     * 删除内网访问
     *
     * 删除内网访问
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceInternalEndpointRequest 请求对象
     * @return SyncInvoker<DeleteInstanceInternalEndpointRequest, DeleteInstanceInternalEndpointResponse>
     */
    public SyncInvoker<DeleteInstanceInternalEndpointRequest, DeleteInstanceInternalEndpointResponse> deleteInstanceInternalEndpointInvoker(
        DeleteInstanceInternalEndpointRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteInstanceInternalEndpoint, hcClient);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceJobRequest 请求对象
     * @return DeleteInstanceJobResponse
     */
    public DeleteInstanceJobResponse deleteInstanceJob(DeleteInstanceJobRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteInstanceJob);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceJobRequest 请求对象
     * @return SyncInvoker<DeleteInstanceJobRequest, DeleteInstanceJobResponse>
     */
    public SyncInvoker<DeleteInstanceJobRequest, DeleteInstanceJobResponse> deleteInstanceJobInvoker(
        DeleteInstanceJobRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteInstanceJob, hcClient);
    }

    /**
     * 删除长期访问凭证
     *
     * 删除长期访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceLtCredentialRequest 请求对象
     * @return DeleteInstanceLtCredentialResponse
     */
    public DeleteInstanceLtCredentialResponse deleteInstanceLtCredential(DeleteInstanceLtCredentialRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteInstanceLtCredential);
    }

    /**
     * 删除长期访问凭证
     *
     * 删除长期访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceLtCredentialRequest 请求对象
     * @return SyncInvoker<DeleteInstanceLtCredentialRequest, DeleteInstanceLtCredentialResponse>
     */
    public SyncInvoker<DeleteInstanceLtCredentialRequest, DeleteInstanceLtCredentialResponse> deleteInstanceLtCredentialInvoker(
        DeleteInstanceLtCredentialRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteInstanceLtCredential, hcClient);
    }

    /**
     * 删除命名空间
     *
     * 删除命名空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceNamespaceRequest 请求对象
     * @return DeleteInstanceNamespaceResponse
     */
    public DeleteInstanceNamespaceResponse deleteInstanceNamespace(DeleteInstanceNamespaceRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteInstanceNamespace);
    }

    /**
     * 删除命名空间
     *
     * 删除命名空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceNamespaceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceNamespaceRequest, DeleteInstanceNamespaceResponse>
     */
    public SyncInvoker<DeleteInstanceNamespaceRequest, DeleteInstanceNamespaceResponse> deleteInstanceNamespaceInvoker(
        DeleteInstanceNamespaceRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteInstanceNamespace, hcClient);
    }

    /**
     * 删除镜像同步的目标仓库
     *
     * 删除同步仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRegistryRequest 请求对象
     * @return DeleteInstanceRegistryResponse
     */
    public DeleteInstanceRegistryResponse deleteInstanceRegistry(DeleteInstanceRegistryRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteInstanceRegistry);
    }

    /**
     * 删除镜像同步的目标仓库
     *
     * 删除同步仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRegistryRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRegistryRequest, DeleteInstanceRegistryResponse>
     */
    public SyncInvoker<DeleteInstanceRegistryRequest, DeleteInstanceRegistryResponse> deleteInstanceRegistryInvoker(
        DeleteInstanceRegistryRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteInstanceRegistry, hcClient);
    }

    /**
     * 删除镜像同步策略
     *
     * 删除镜像同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceReplicationPolicyRequest 请求对象
     * @return DeleteInstanceReplicationPolicyResponse
     */
    public DeleteInstanceReplicationPolicyResponse deleteInstanceReplicationPolicy(
        DeleteInstanceReplicationPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteInstanceReplicationPolicy);
    }

    /**
     * 删除镜像同步策略
     *
     * 删除镜像同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceReplicationPolicyRequest 请求对象
     * @return SyncInvoker<DeleteInstanceReplicationPolicyRequest, DeleteInstanceReplicationPolicyResponse>
     */
    public SyncInvoker<DeleteInstanceReplicationPolicyRequest, DeleteInstanceReplicationPolicyResponse> deleteInstanceReplicationPolicyInvoker(
        DeleteInstanceReplicationPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteInstanceReplicationPolicy, hcClient);
    }

    /**
     * 删除制品仓库
     *
     * 删除仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRepositoryRequest 请求对象
     * @return DeleteInstanceRepositoryResponse
     */
    public DeleteInstanceRepositoryResponse deleteInstanceRepository(DeleteInstanceRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteInstanceRepository);
    }

    /**
     * 删除制品仓库
     *
     * 删除仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRepositoryRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRepositoryRequest, DeleteInstanceRepositoryResponse>
     */
    public SyncInvoker<DeleteInstanceRepositoryRequest, DeleteInstanceRepositoryResponse> deleteInstanceRepositoryInvoker(
        DeleteInstanceRepositoryRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteInstanceRepository, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceResourceTagsRequest 请求对象
     * @return DeleteInstanceResourceTagsResponse
     */
    public DeleteInstanceResourceTagsResponse deleteInstanceResourceTags(DeleteInstanceResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteInstanceResourceTags);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceResourceTagsRequest 请求对象
     * @return SyncInvoker<DeleteInstanceResourceTagsRequest, DeleteInstanceResourceTagsResponse>
     */
    public SyncInvoker<DeleteInstanceResourceTagsRequest, DeleteInstanceResourceTagsResponse> deleteInstanceResourceTagsInvoker(
        DeleteInstanceResourceTagsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteInstanceResourceTags, hcClient);
    }

    /**
     * 删除老化策略
     *
     * 删除老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRetentionPolicyRequest 请求对象
     * @return DeleteInstanceRetentionPolicyResponse
     */
    public DeleteInstanceRetentionPolicyResponse deleteInstanceRetentionPolicy(
        DeleteInstanceRetentionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteInstanceRetentionPolicy);
    }

    /**
     * 删除老化策略
     *
     * 删除老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRetentionPolicyRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRetentionPolicyRequest, DeleteInstanceRetentionPolicyResponse>
     */
    public SyncInvoker<DeleteInstanceRetentionPolicyRequest, DeleteInstanceRetentionPolicyResponse> deleteInstanceRetentionPolicyInvoker(
        DeleteInstanceRetentionPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteInstanceRetentionPolicy, hcClient);
    }

    /**
     * 删除签名策略
     *
     * 删除签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceSignPolicyRequest 请求对象
     * @return DeleteInstanceSignPolicyResponse
     */
    public DeleteInstanceSignPolicyResponse deleteInstanceSignPolicy(DeleteInstanceSignPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteInstanceSignPolicy);
    }

    /**
     * 删除签名策略
     *
     * 删除签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceSignPolicyRequest 请求对象
     * @return SyncInvoker<DeleteInstanceSignPolicyRequest, DeleteInstanceSignPolicyResponse>
     */
    public SyncInvoker<DeleteInstanceSignPolicyRequest, DeleteInstanceSignPolicyResponse> deleteInstanceSignPolicyInvoker(
        DeleteInstanceSignPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteInstanceSignPolicy, hcClient);
    }

    /**
     * 删除制品的Tag
     *
     * 删除制品Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceTagRequest 请求对象
     * @return DeleteInstanceTagResponse
     */
    public DeleteInstanceTagResponse deleteInstanceTag(DeleteInstanceTagRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteInstanceTag);
    }

    /**
     * 删除制品的Tag
     *
     * 删除制品Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceTagRequest 请求对象
     * @return SyncInvoker<DeleteInstanceTagRequest, DeleteInstanceTagResponse>
     */
    public SyncInvoker<DeleteInstanceTagRequest, DeleteInstanceTagResponse> deleteInstanceTagInvoker(
        DeleteInstanceTagRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteInstanceTag, hcClient);
    }

    /**
     * 删除触发器
     *
     * 删除触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceWebhookRequest 请求对象
     * @return DeleteInstanceWebhookResponse
     */
    public DeleteInstanceWebhookResponse deleteInstanceWebhook(DeleteInstanceWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteInstanceWebhook);
    }

    /**
     * 删除触发器
     *
     * 删除触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceWebhookRequest 请求对象
     * @return SyncInvoker<DeleteInstanceWebhookRequest, DeleteInstanceWebhookResponse>
     */
    public SyncInvoker<DeleteInstanceWebhookRequest, DeleteInstanceWebhookResponse> deleteInstanceWebhookInvoker(
        DeleteInstanceWebhookRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteInstanceWebhook, hcClient);
    }

    /**
     * 批量删除子资源标签
     *
     * 批量删除子资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubResourceTagsRequest 请求对象
     * @return DeleteSubResourceTagsResponse
     */
    public DeleteSubResourceTagsResponse deleteSubResourceTags(DeleteSubResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.deleteSubResourceTags);
    }

    /**
     * 批量删除子资源标签
     *
     * 批量删除子资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubResourceTagsRequest 请求对象
     * @return SyncInvoker<DeleteSubResourceTagsRequest, DeleteSubResourceTagsResponse>
     */
    public SyncInvoker<DeleteSubResourceTagsRequest, DeleteSubResourceTagsResponse> deleteSubResourceTagsInvoker(
        DeleteSubResourceTagsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.deleteSubResourceTags, hcClient);
    }

    /**
     * 手动执行镜像同步策略
     *
     * 手动执行同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceReplicationPolicyRequest 请求对象
     * @return ExecuteInstanceReplicationPolicyResponse
     */
    public ExecuteInstanceReplicationPolicyResponse executeInstanceReplicationPolicy(
        ExecuteInstanceReplicationPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.executeInstanceReplicationPolicy);
    }

    /**
     * 手动执行镜像同步策略
     *
     * 手动执行同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceReplicationPolicyRequest 请求对象
     * @return SyncInvoker<ExecuteInstanceReplicationPolicyRequest, ExecuteInstanceReplicationPolicyResponse>
     */
    public SyncInvoker<ExecuteInstanceReplicationPolicyRequest, ExecuteInstanceReplicationPolicyResponse> executeInstanceReplicationPolicyInvoker(
        ExecuteInstanceReplicationPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.executeInstanceReplicationPolicy, hcClient);
    }

    /**
     * 执行老化策略
     *
     * 执行老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceRetentionPolicyRequest 请求对象
     * @return ExecuteInstanceRetentionPolicyResponse
     */
    public ExecuteInstanceRetentionPolicyResponse executeInstanceRetentionPolicy(
        ExecuteInstanceRetentionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.executeInstanceRetentionPolicy);
    }

    /**
     * 执行老化策略
     *
     * 执行老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceRetentionPolicyRequest 请求对象
     * @return SyncInvoker<ExecuteInstanceRetentionPolicyRequest, ExecuteInstanceRetentionPolicyResponse>
     */
    public SyncInvoker<ExecuteInstanceRetentionPolicyRequest, ExecuteInstanceRetentionPolicyResponse> executeInstanceRetentionPolicyInvoker(
        ExecuteInstanceRetentionPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.executeInstanceRetentionPolicy, hcClient);
    }

    /**
     * 手动执行签名策略
     *
     * 手动执行签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceSignPolicyRequest 请求对象
     * @return ExecuteInstanceSignPolicyResponse
     */
    public ExecuteInstanceSignPolicyResponse executeInstanceSignPolicy(ExecuteInstanceSignPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.executeInstanceSignPolicy);
    }

    /**
     * 手动执行签名策略
     *
     * 手动执行签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceSignPolicyRequest 请求对象
     * @return SyncInvoker<ExecuteInstanceSignPolicyRequest, ExecuteInstanceSignPolicyResponse>
     */
    public SyncInvoker<ExecuteInstanceSignPolicyRequest, ExecuteInstanceSignPolicyResponse> executeInstanceSignPolicyInvoker(
        ExecuteInstanceSignPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.executeInstanceSignPolicy, hcClient);
    }

    /**
     * 获取上传下载的相关审计日志列表
     *
     * 获取上传下载的相关审计日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditLogsRequest 请求对象
     * @return ListAuditLogsResponse
     */
    public ListAuditLogsResponse listAuditLogs(ListAuditLogsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listAuditLogs);
    }

    /**
     * 获取上传下载的相关审计日志列表
     *
     * 获取上传下载的相关审计日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditLogsRequest 请求对象
     * @return SyncInvoker<ListAuditLogsRequest, ListAuditLogsResponse>
     */
    public SyncInvoker<ListAuditLogsRequest, ListAuditLogsResponse> listAuditLogsInvoker(ListAuditLogsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listAuditLogs, hcClient);
    }

    /**
     * 查询所有域名列表
     *
     * 查询当前实例的所有域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainNamesRequest 请求对象
     * @return ListDomainNamesResponse
     */
    public ListDomainNamesResponse listDomainNames(ListDomainNamesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listDomainNames);
    }

    /**
     * 查询所有域名列表
     *
     * 查询当前实例的所有域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainNamesRequest 请求对象
     * @return SyncInvoker<ListDomainNamesRequest, ListDomainNamesResponse>
     */
    public SyncInvoker<ListDomainNamesRequest, ListDomainNamesResponse> listDomainNamesInvoker(
        ListDomainNamesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listDomainNames, hcClient);
    }

    /**
     * 查询特性开关信息
     *
     * 查询特性开关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeatureGatesRequest 请求对象
     * @return ListFeatureGatesResponse
     */
    public ListFeatureGatesResponse listFeatureGates(ListFeatureGatesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listFeatureGates);
    }

    /**
     * 查询特性开关信息
     *
     * 查询特性开关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeatureGatesRequest 请求对象
     * @return SyncInvoker<ListFeatureGatesRequest, ListFeatureGatesResponse>
     */
    public SyncInvoker<ListFeatureGatesRequest, ListFeatureGatesResponse> listFeatureGatesInvoker(
        ListFeatureGatesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listFeatureGates, hcClient);
    }

    /**
     * 查询全局特性开关信息
     *
     * 查询全局特性开关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalFeatureGatesRequest 请求对象
     * @return ListGlobalFeatureGatesResponse
     */
    public ListGlobalFeatureGatesResponse listGlobalFeatureGates(ListGlobalFeatureGatesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listGlobalFeatureGates);
    }

    /**
     * 查询全局特性开关信息
     *
     * 查询全局特性开关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalFeatureGatesRequest 请求对象
     * @return SyncInvoker<ListGlobalFeatureGatesRequest, ListGlobalFeatureGatesResponse>
     */
    public SyncInvoker<ListGlobalFeatureGatesRequest, ListGlobalFeatureGatesResponse> listGlobalFeatureGatesInvoker(
        ListGlobalFeatureGatesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listGlobalFeatureGates, hcClient);
    }

    /**
     * 获取不可变Tag策略列表
     *
     * 获取不可变Tag策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImmutableRulesRequest 请求对象
     * @return ListImmutableRulesResponse
     */
    public ListImmutableRulesResponse listImmutableRules(ListImmutableRulesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listImmutableRules);
    }

    /**
     * 获取不可变Tag策略列表
     *
     * 获取不可变Tag策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImmutableRulesRequest 请求对象
     * @return SyncInvoker<ListImmutableRulesRequest, ListImmutableRulesResponse>
     */
    public SyncInvoker<ListImmutableRulesRequest, ListImmutableRulesResponse> listImmutableRulesInvoker(
        ListImmutableRulesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listImmutableRules, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 查询实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRequest 请求对象
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstance(ListInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstance);
    }

    /**
     * 查询实例列表
     *
     * 查询实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRequest 请求对象
     * @return SyncInvoker<ListInstanceRequest, ListInstanceResponse>
     */
    public SyncInvoker<ListInstanceRequest, ListInstanceResponse> listInstanceInvoker(ListInstanceRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstance, hcClient);
    }

    /**
     * 获取制品附件列表
     *
     * 获取制品附件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceAccessoriesRequest 请求对象
     * @return ListInstanceAccessoriesResponse
     */
    public ListInstanceAccessoriesResponse listInstanceAccessories(ListInstanceAccessoriesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceAccessories);
    }

    /**
     * 获取制品附件列表
     *
     * 获取制品附件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceAccessoriesRequest 请求对象
     * @return SyncInvoker<ListInstanceAccessoriesRequest, ListInstanceAccessoriesResponse>
     */
    public SyncInvoker<ListInstanceAccessoriesRequest, ListInstanceAccessoriesResponse> listInstanceAccessoriesInvoker(
        ListInstanceAccessoriesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceAccessories, hcClient);
    }

    /**
     * 获取仓库实例的所有制品版本列表
     *
     * 获取仓库实例的所有制品版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceAllArtifactsRequest 请求对象
     * @return ListInstanceAllArtifactsResponse
     */
    public ListInstanceAllArtifactsResponse listInstanceAllArtifacts(ListInstanceAllArtifactsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceAllArtifacts);
    }

    /**
     * 获取仓库实例的所有制品版本列表
     *
     * 获取仓库实例的所有制品版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceAllArtifactsRequest 请求对象
     * @return SyncInvoker<ListInstanceAllArtifactsRequest, ListInstanceAllArtifactsResponse>
     */
    public SyncInvoker<ListInstanceAllArtifactsRequest, ListInstanceAllArtifactsResponse> listInstanceAllArtifactsInvoker(
        ListInstanceAllArtifactsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceAllArtifacts, hcClient);
    }

    /**
     * 获取制品扫描的漏洞信息
     *
     * 获取制品扫描的漏洞信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceArtifactVulnerabilitiesRequest 请求对象
     * @return ListInstanceArtifactVulnerabilitiesResponse
     */
    public ListInstanceArtifactVulnerabilitiesResponse listInstanceArtifactVulnerabilities(
        ListInstanceArtifactVulnerabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceArtifactVulnerabilities);
    }

    /**
     * 获取制品扫描的漏洞信息
     *
     * 获取制品扫描的漏洞信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceArtifactVulnerabilitiesRequest 请求对象
     * @return SyncInvoker<ListInstanceArtifactVulnerabilitiesRequest, ListInstanceArtifactVulnerabilitiesResponse>
     */
    public SyncInvoker<ListInstanceArtifactVulnerabilitiesRequest, ListInstanceArtifactVulnerabilitiesResponse> listInstanceArtifactVulnerabilitiesInvoker(
        ListInstanceArtifactVulnerabilitiesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceArtifactVulnerabilities, hcClient);
    }

    /**
     * 获取制品版本列表
     *
     * 获取制品版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceArtifactsRequest 请求对象
     * @return ListInstanceArtifactsResponse
     */
    public ListInstanceArtifactsResponse listInstanceArtifacts(ListInstanceArtifactsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceArtifacts);
    }

    /**
     * 获取制品版本列表
     *
     * 获取制品版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceArtifactsRequest 请求对象
     * @return SyncInvoker<ListInstanceArtifactsRequest, ListInstanceArtifactsResponse>
     */
    public SyncInvoker<ListInstanceArtifactsRequest, ListInstanceArtifactsResponse> listInstanceArtifactsInvoker(
        ListInstanceArtifactsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceArtifacts, hcClient);
    }

    /**
     * 获取内网访问列表
     *
     * 获取内网访问列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceInternalEndpointsRequest 请求对象
     * @return ListInstanceInternalEndpointsResponse
     */
    public ListInstanceInternalEndpointsResponse listInstanceInternalEndpoints(
        ListInstanceInternalEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceInternalEndpoints);
    }

    /**
     * 获取内网访问列表
     *
     * 获取内网访问列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceInternalEndpointsRequest 请求对象
     * @return SyncInvoker<ListInstanceInternalEndpointsRequest, ListInstanceInternalEndpointsResponse>
     */
    public SyncInvoker<ListInstanceInternalEndpointsRequest, ListInstanceInternalEndpointsResponse> listInstanceInternalEndpointsInvoker(
        ListInstanceInternalEndpointsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceInternalEndpoints, hcClient);
    }

    /**
     * 获取任务列表
     *
     * 获取任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceJobsRequest 请求对象
     * @return ListInstanceJobsResponse
     */
    public ListInstanceJobsResponse listInstanceJobs(ListInstanceJobsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceJobs);
    }

    /**
     * 获取任务列表
     *
     * 获取任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceJobsRequest 请求对象
     * @return SyncInvoker<ListInstanceJobsRequest, ListInstanceJobsResponse>
     */
    public SyncInvoker<ListInstanceJobsRequest, ListInstanceJobsResponse> listInstanceJobsInvoker(
        ListInstanceJobsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceJobs, hcClient);
    }

    /**
     * 查询长期访问凭证列表
     *
     * 查询长期访问凭证列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceLtCredentialsRequest 请求对象
     * @return ListInstanceLtCredentialsResponse
     */
    public ListInstanceLtCredentialsResponse listInstanceLtCredentials(ListInstanceLtCredentialsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceLtCredentials);
    }

    /**
     * 查询长期访问凭证列表
     *
     * 查询长期访问凭证列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceLtCredentialsRequest 请求对象
     * @return SyncInvoker<ListInstanceLtCredentialsRequest, ListInstanceLtCredentialsResponse>
     */
    public SyncInvoker<ListInstanceLtCredentialsRequest, ListInstanceLtCredentialsResponse> listInstanceLtCredentialsInvoker(
        ListInstanceLtCredentialsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceLtCredentials, hcClient);
    }

    /**
     * 获取命名空间列表
     *
     * 获取命名空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceNamespacesRequest 请求对象
     * @return ListInstanceNamespacesResponse
     */
    public ListInstanceNamespacesResponse listInstanceNamespaces(ListInstanceNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceNamespaces);
    }

    /**
     * 获取命名空间列表
     *
     * 获取命名空间列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceNamespacesRequest 请求对象
     * @return SyncInvoker<ListInstanceNamespacesRequest, ListInstanceNamespacesResponse>
     */
    public SyncInvoker<ListInstanceNamespacesRequest, ListInstanceNamespacesResponse> listInstanceNamespacesInvoker(
        ListInstanceNamespacesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceNamespaces, hcClient);
    }

    /**
     * 查询项目下所有实例标签
     *
     * 查询项目下所有实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceProjectTagsRequest 请求对象
     * @return ListInstanceProjectTagsResponse
     */
    public ListInstanceProjectTagsResponse listInstanceProjectTags(ListInstanceProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceProjectTags);
    }

    /**
     * 查询项目下所有实例标签
     *
     * 查询项目下所有实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceProjectTagsRequest 请求对象
     * @return SyncInvoker<ListInstanceProjectTagsRequest, ListInstanceProjectTagsResponse>
     */
    public SyncInvoker<ListInstanceProjectTagsRequest, ListInstanceProjectTagsResponse> listInstanceProjectTagsInvoker(
        ListInstanceProjectTagsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceProjectTags, hcClient);
    }

    /**
     * 获取镜像同步的目标仓库列表
     *
     * 获取镜像同步的目标仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRegistriesRequest 请求对象
     * @return ListInstanceRegistriesResponse
     */
    public ListInstanceRegistriesResponse listInstanceRegistries(ListInstanceRegistriesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceRegistries);
    }

    /**
     * 获取镜像同步的目标仓库列表
     *
     * 获取镜像同步的目标仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRegistriesRequest 请求对象
     * @return SyncInvoker<ListInstanceRegistriesRequest, ListInstanceRegistriesResponse>
     */
    public SyncInvoker<ListInstanceRegistriesRequest, ListInstanceRegistriesResponse> listInstanceRegistriesInvoker(
        ListInstanceRegistriesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceRegistries, hcClient);
    }

    /**
     * 获取镜像同步策略列表
     *
     * 获取镜像同步策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPoliciesRequest 请求对象
     * @return ListInstanceReplicationPoliciesResponse
     */
    public ListInstanceReplicationPoliciesResponse listInstanceReplicationPolicies(
        ListInstanceReplicationPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceReplicationPolicies);
    }

    /**
     * 获取镜像同步策略列表
     *
     * 获取镜像同步策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPoliciesRequest 请求对象
     * @return SyncInvoker<ListInstanceReplicationPoliciesRequest, ListInstanceReplicationPoliciesResponse>
     */
    public SyncInvoker<ListInstanceReplicationPoliciesRequest, ListInstanceReplicationPoliciesResponse> listInstanceReplicationPoliciesInvoker(
        ListInstanceReplicationPoliciesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceReplicationPolicies, hcClient);
    }

    /**
     * 获取镜像同步策略执行任务的镜像版本列表
     *
     * 获取镜像同步策略执行任务的镜像版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPolicyExecSubTasksRequest 请求对象
     * @return ListInstanceReplicationPolicyExecSubTasksResponse
     */
    public ListInstanceReplicationPolicyExecSubTasksResponse listInstanceReplicationPolicyExecSubTasks(
        ListInstanceReplicationPolicyExecSubTasksRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceReplicationPolicyExecSubTasks);
    }

    /**
     * 获取镜像同步策略执行任务的镜像版本列表
     *
     * 获取镜像同步策略执行任务的镜像版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPolicyExecSubTasksRequest 请求对象
     * @return SyncInvoker<ListInstanceReplicationPolicyExecSubTasksRequest, ListInstanceReplicationPolicyExecSubTasksResponse>
     */
    public SyncInvoker<ListInstanceReplicationPolicyExecSubTasksRequest, ListInstanceReplicationPolicyExecSubTasksResponse> listInstanceReplicationPolicyExecSubTasksInvoker(
        ListInstanceReplicationPolicyExecSubTasksRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceReplicationPolicyExecSubTasks, hcClient);
    }

    /**
     * 获取镜像同步策略执行任务的镜像列表
     *
     * 获取镜像同步策略执行任务的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPolicyExecTasksRequest 请求对象
     * @return ListInstanceReplicationPolicyExecTasksResponse
     */
    public ListInstanceReplicationPolicyExecTasksResponse listInstanceReplicationPolicyExecTasks(
        ListInstanceReplicationPolicyExecTasksRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceReplicationPolicyExecTasks);
    }

    /**
     * 获取镜像同步策略执行任务的镜像列表
     *
     * 获取镜像同步策略执行任务的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPolicyExecTasksRequest 请求对象
     * @return SyncInvoker<ListInstanceReplicationPolicyExecTasksRequest, ListInstanceReplicationPolicyExecTasksResponse>
     */
    public SyncInvoker<ListInstanceReplicationPolicyExecTasksRequest, ListInstanceReplicationPolicyExecTasksResponse> listInstanceReplicationPolicyExecTasksInvoker(
        ListInstanceReplicationPolicyExecTasksRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceReplicationPolicyExecTasks, hcClient);
    }

    /**
     * 获取镜像同步策略执行记录列表
     *
     * 获取镜像同步策略执行记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPolicyExecutionsRequest 请求对象
     * @return ListInstanceReplicationPolicyExecutionsResponse
     */
    public ListInstanceReplicationPolicyExecutionsResponse listInstanceReplicationPolicyExecutions(
        ListInstanceReplicationPolicyExecutionsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceReplicationPolicyExecutions);
    }

    /**
     * 获取镜像同步策略执行记录列表
     *
     * 获取镜像同步策略执行记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceReplicationPolicyExecutionsRequest 请求对象
     * @return SyncInvoker<ListInstanceReplicationPolicyExecutionsRequest, ListInstanceReplicationPolicyExecutionsResponse>
     */
    public SyncInvoker<ListInstanceReplicationPolicyExecutionsRequest, ListInstanceReplicationPolicyExecutionsResponse> listInstanceReplicationPolicyExecutionsInvoker(
        ListInstanceReplicationPolicyExecutionsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceReplicationPolicyExecutions, hcClient);
    }

    /**
     * 获取制品仓库列表
     *
     * 获取制品仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRepositoriesRequest 请求对象
     * @return ListInstanceRepositoriesResponse
     */
    public ListInstanceRepositoriesResponse listInstanceRepositories(ListInstanceRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceRepositories);
    }

    /**
     * 获取制品仓库列表
     *
     * 获取制品仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRepositoriesRequest 请求对象
     * @return SyncInvoker<ListInstanceRepositoriesRequest, ListInstanceRepositoriesResponse>
     */
    public SyncInvoker<ListInstanceRepositoriesRequest, ListInstanceRepositoriesResponse> listInstanceRepositoriesInvoker(
        ListInstanceRepositoriesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceRepositories, hcClient);
    }

    /**
     * 按照标签检索资源列表
     *
     * 按照标签检索资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceResourceInstancesRequest 请求对象
     * @return ListInstanceResourceInstancesResponse
     */
    public ListInstanceResourceInstancesResponse listInstanceResourceInstances(
        ListInstanceResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceResourceInstances);
    }

    /**
     * 按照标签检索资源列表
     *
     * 按照标签检索资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListInstanceResourceInstancesRequest, ListInstanceResourceInstancesResponse>
     */
    public SyncInvoker<ListInstanceResourceInstancesRequest, ListInstanceResourceInstancesResponse> listInstanceResourceInstancesInvoker(
        ListInstanceResourceInstancesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceResourceInstances, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceResourceTagsRequest 请求对象
     * @return ListInstanceResourceTagsResponse
     */
    public ListInstanceResourceTagsResponse listInstanceResourceTags(ListInstanceResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceResourceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceResourceTagsRequest 请求对象
     * @return SyncInvoker<ListInstanceResourceTagsRequest, ListInstanceResourceTagsResponse>
     */
    public SyncInvoker<ListInstanceResourceTagsRequest, ListInstanceResourceTagsResponse> listInstanceResourceTagsInvoker(
        ListInstanceResourceTagsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceResourceTags, hcClient);
    }

    /**
     * 获取老化策略列表
     *
     * 获取老化策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPoliciesRequest 请求对象
     * @return ListInstanceRetentionPoliciesResponse
     */
    public ListInstanceRetentionPoliciesResponse listInstanceRetentionPolicies(
        ListInstanceRetentionPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceRetentionPolicies);
    }

    /**
     * 获取老化策略列表
     *
     * 获取老化策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPoliciesRequest 请求对象
     * @return SyncInvoker<ListInstanceRetentionPoliciesRequest, ListInstanceRetentionPoliciesResponse>
     */
    public SyncInvoker<ListInstanceRetentionPoliciesRequest, ListInstanceRetentionPoliciesResponse> listInstanceRetentionPoliciesInvoker(
        ListInstanceRetentionPoliciesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceRetentionPolicies, hcClient);
    }

    /**
     * 获取老化策略执行任务的镜像版本列表
     *
     * 获取老化策略执行任务的镜像版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPolicyExecSubTasksRequest 请求对象
     * @return ListInstanceRetentionPolicyExecSubTasksResponse
     */
    public ListInstanceRetentionPolicyExecSubTasksResponse listInstanceRetentionPolicyExecSubTasks(
        ListInstanceRetentionPolicyExecSubTasksRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceRetentionPolicyExecSubTasks);
    }

    /**
     * 获取老化策略执行任务的镜像版本列表
     *
     * 获取老化策略执行任务的镜像版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPolicyExecSubTasksRequest 请求对象
     * @return SyncInvoker<ListInstanceRetentionPolicyExecSubTasksRequest, ListInstanceRetentionPolicyExecSubTasksResponse>
     */
    public SyncInvoker<ListInstanceRetentionPolicyExecSubTasksRequest, ListInstanceRetentionPolicyExecSubTasksResponse> listInstanceRetentionPolicyExecSubTasksInvoker(
        ListInstanceRetentionPolicyExecSubTasksRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceRetentionPolicyExecSubTasks, hcClient);
    }

    /**
     * 获取老化策略执行任务的镜像列表
     *
     * 获取老化策略执行任务的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPolicyExecTasksRequest 请求对象
     * @return ListInstanceRetentionPolicyExecTasksResponse
     */
    public ListInstanceRetentionPolicyExecTasksResponse listInstanceRetentionPolicyExecTasks(
        ListInstanceRetentionPolicyExecTasksRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceRetentionPolicyExecTasks);
    }

    /**
     * 获取老化策略执行任务的镜像列表
     *
     * 获取老化策略执行任务的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPolicyExecTasksRequest 请求对象
     * @return SyncInvoker<ListInstanceRetentionPolicyExecTasksRequest, ListInstanceRetentionPolicyExecTasksResponse>
     */
    public SyncInvoker<ListInstanceRetentionPolicyExecTasksRequest, ListInstanceRetentionPolicyExecTasksResponse> listInstanceRetentionPolicyExecTasksInvoker(
        ListInstanceRetentionPolicyExecTasksRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceRetentionPolicyExecTasks, hcClient);
    }

    /**
     * 获取老化策略执行记录列表
     *
     * 获取老化策略执行记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPolicyExecutionsRequest 请求对象
     * @return ListInstanceRetentionPolicyExecutionsResponse
     */
    public ListInstanceRetentionPolicyExecutionsResponse listInstanceRetentionPolicyExecutions(
        ListInstanceRetentionPolicyExecutionsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceRetentionPolicyExecutions);
    }

    /**
     * 获取老化策略执行记录列表
     *
     * 获取老化策略执行记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRetentionPolicyExecutionsRequest 请求对象
     * @return SyncInvoker<ListInstanceRetentionPolicyExecutionsRequest, ListInstanceRetentionPolicyExecutionsResponse>
     */
    public SyncInvoker<ListInstanceRetentionPolicyExecutionsRequest, ListInstanceRetentionPolicyExecutionsResponse> listInstanceRetentionPolicyExecutionsInvoker(
        ListInstanceRetentionPolicyExecutionsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceRetentionPolicyExecutions, hcClient);
    }

    /**
     * 获取签名策略列表
     *
     * 获取签名策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignPoliciesRequest 请求对象
     * @return ListInstanceSignPoliciesResponse
     */
    public ListInstanceSignPoliciesResponse listInstanceSignPolicies(ListInstanceSignPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceSignPolicies);
    }

    /**
     * 获取签名策略列表
     *
     * 获取签名策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignPoliciesRequest 请求对象
     * @return SyncInvoker<ListInstanceSignPoliciesRequest, ListInstanceSignPoliciesResponse>
     */
    public SyncInvoker<ListInstanceSignPoliciesRequest, ListInstanceSignPoliciesResponse> listInstanceSignPoliciesInvoker(
        ListInstanceSignPoliciesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceSignPolicies, hcClient);
    }

    /**
     * 获取签名执行记录任务的镜像列表
     *
     * 获取签名执行记录任务的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignPolicyExecTasksRequest 请求对象
     * @return ListInstanceSignPolicyExecTasksResponse
     */
    public ListInstanceSignPolicyExecTasksResponse listInstanceSignPolicyExecTasks(
        ListInstanceSignPolicyExecTasksRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceSignPolicyExecTasks);
    }

    /**
     * 获取签名执行记录任务的镜像列表
     *
     * 获取签名执行记录任务的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignPolicyExecTasksRequest 请求对象
     * @return SyncInvoker<ListInstanceSignPolicyExecTasksRequest, ListInstanceSignPolicyExecTasksResponse>
     */
    public SyncInvoker<ListInstanceSignPolicyExecTasksRequest, ListInstanceSignPolicyExecTasksResponse> listInstanceSignPolicyExecTasksInvoker(
        ListInstanceSignPolicyExecTasksRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceSignPolicyExecTasks, hcClient);
    }

    /**
     * 获取签名执行记录列表
     *
     * 获取签名执行记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignPolicyExecutionsRequest 请求对象
     * @return ListInstanceSignPolicyExecutionsResponse
     */
    public ListInstanceSignPolicyExecutionsResponse listInstanceSignPolicyExecutions(
        ListInstanceSignPolicyExecutionsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceSignPolicyExecutions);
    }

    /**
     * 获取签名执行记录列表
     *
     * 获取签名执行记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignPolicyExecutionsRequest 请求对象
     * @return SyncInvoker<ListInstanceSignPolicyExecutionsRequest, ListInstanceSignPolicyExecutionsResponse>
     */
    public SyncInvoker<ListInstanceSignPolicyExecutionsRequest, ListInstanceSignPolicyExecutionsResponse> listInstanceSignPolicyExecutionsInvoker(
        ListInstanceSignPolicyExecutionsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceSignPolicyExecutions, hcClient);
    }

    /**
     * 获取签名策略执行任务的镜像版本列表
     *
     * 获取签名策略执行任务的镜像版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignatureExecutionSubtasksRequest 请求对象
     * @return ListInstanceSignatureExecutionSubtasksResponse
     */
    public ListInstanceSignatureExecutionSubtasksResponse listInstanceSignatureExecutionSubtasks(
        ListInstanceSignatureExecutionSubtasksRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceSignatureExecutionSubtasks);
    }

    /**
     * 获取签名策略执行任务的镜像版本列表
     *
     * 获取签名策略执行任务的镜像版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSignatureExecutionSubtasksRequest 请求对象
     * @return SyncInvoker<ListInstanceSignatureExecutionSubtasksRequest, ListInstanceSignatureExecutionSubtasksResponse>
     */
    public SyncInvoker<ListInstanceSignatureExecutionSubtasksRequest, ListInstanceSignatureExecutionSubtasksResponse> listInstanceSignatureExecutionSubtasksInvoker(
        ListInstanceSignatureExecutionSubtasksRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceSignatureExecutionSubtasks, hcClient);
    }

    /**
     * 获取实例统计数据
     *
     * 获取实例统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceStatisticsRequest 请求对象
     * @return ListInstanceStatisticsResponse
     */
    public ListInstanceStatisticsResponse listInstanceStatistics(ListInstanceStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceStatistics);
    }

    /**
     * 获取实例统计数据
     *
     * 获取实例统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceStatisticsRequest 请求对象
     * @return SyncInvoker<ListInstanceStatisticsRequest, ListInstanceStatisticsResponse>
     */
    public SyncInvoker<ListInstanceStatisticsRequest, ListInstanceStatisticsResponse> listInstanceStatisticsInvoker(
        ListInstanceStatisticsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceStatistics, hcClient);
    }

    /**
     * 获取制品仓库的Tag列表
     *
     * 获取制品仓库的Tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return ListInstanceTagsResponse
     */
    public ListInstanceTagsResponse listInstanceTags(ListInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceTags);
    }

    /**
     * 获取制品仓库的Tag列表
     *
     * 获取制品仓库的Tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsInvoker(
        ListInstanceTagsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceTags, hcClient);
    }

    /**
     * 获取触发器执行任务列表
     *
     * 获取触发器执行任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceWebhookJobsRequest 请求对象
     * @return ListInstanceWebhookJobsResponse
     */
    public ListInstanceWebhookJobsResponse listInstanceWebhookJobs(ListInstanceWebhookJobsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceWebhookJobs);
    }

    /**
     * 获取触发器执行任务列表
     *
     * 获取触发器执行任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceWebhookJobsRequest 请求对象
     * @return SyncInvoker<ListInstanceWebhookJobsRequest, ListInstanceWebhookJobsResponse>
     */
    public SyncInvoker<ListInstanceWebhookJobsRequest, ListInstanceWebhookJobsResponse> listInstanceWebhookJobsInvoker(
        ListInstanceWebhookJobsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceWebhookJobs, hcClient);
    }

    /**
     * 获取触发器列表
     *
     * 获取触发器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceWebhooksRequest 请求对象
     * @return ListInstanceWebhooksResponse
     */
    public ListInstanceWebhooksResponse listInstanceWebhooks(ListInstanceWebhooksRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listInstanceWebhooks);
    }

    /**
     * 获取触发器列表
     *
     * 获取触发器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceWebhooksRequest 请求对象
     * @return SyncInvoker<ListInstanceWebhooksRequest, ListInstanceWebhooksResponse>
     */
    public SyncInvoker<ListInstanceWebhooksRequest, ListInstanceWebhooksResponse> listInstanceWebhooksInvoker(
        ListInstanceWebhooksRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listInstanceWebhooks, hcClient);
    }

    /**
     * 获取命名空间下所有制品仓库列表
     *
     * 获取命名空间下所有制品仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespaceRepositoriesRequest 请求对象
     * @return ListNamespaceRepositoriesResponse
     */
    public ListNamespaceRepositoriesResponse listNamespaceRepositories(ListNamespaceRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listNamespaceRepositories);
    }

    /**
     * 获取命名空间下所有制品仓库列表
     *
     * 获取命名空间下所有制品仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespaceRepositoriesRequest 请求对象
     * @return SyncInvoker<ListNamespaceRepositoriesRequest, ListNamespaceRepositoriesResponse>
     */
    public SyncInvoker<ListNamespaceRepositoriesRequest, ListNamespaceRepositoriesResponse> listNamespaceRepositoriesInvoker(
        ListNamespaceRepositoriesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listNamespaceRepositories, hcClient);
    }

    /**
     * 查询实例下所有命名空间标签
     *
     * 查询实例下所有命名空间标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespaceTagsRequest 请求对象
     * @return ListNamespaceTagsResponse
     */
    public ListNamespaceTagsResponse listNamespaceTags(ListNamespaceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listNamespaceTags);
    }

    /**
     * 查询实例下所有命名空间标签
     *
     * 查询实例下所有命名空间标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespaceTagsRequest 请求对象
     * @return SyncInvoker<ListNamespaceTagsRequest, ListNamespaceTagsResponse>
     */
    public SyncInvoker<ListNamespaceTagsRequest, ListNamespaceTagsResponse> listNamespaceTagsInvoker(
        ListNamespaceTagsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listNamespaceTags, hcClient);
    }

    /**
     * 按照标签检索子资源列表
     *
     * 按照标签检索子资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubResourceInstancesRequest 请求对象
     * @return ListSubResourceInstancesResponse
     */
    public ListSubResourceInstancesResponse listSubResourceInstances(ListSubResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listSubResourceInstances);
    }

    /**
     * 按照标签检索子资源列表
     *
     * 按照标签检索子资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListSubResourceInstancesRequest, ListSubResourceInstancesResponse>
     */
    public SyncInvoker<ListSubResourceInstancesRequest, ListSubResourceInstancesResponse> listSubResourceInstancesInvoker(
        ListSubResourceInstancesRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listSubResourceInstances, hcClient);
    }

    /**
     * 查询子资源标签
     *
     * 查询子资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubResourceTagsRequest 请求对象
     * @return ListSubResourceTagsResponse
     */
    public ListSubResourceTagsResponse listSubResourceTags(ListSubResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.listSubResourceTags);
    }

    /**
     * 查询子资源标签
     *
     * 查询子资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubResourceTagsRequest 请求对象
     * @return SyncInvoker<ListSubResourceTagsRequest, ListSubResourceTagsResponse>
     */
    public SyncInvoker<ListSubResourceTagsRequest, ListSubResourceTagsResponse> listSubResourceTagsInvoker(
        ListSubResourceTagsRequest request) {
        return new SyncInvoker<>(request, SwrMeta.listSubResourceTags, hcClient);
    }

    /**
     * 获取实例详情
     *
     * 获取实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstance);
    }

    /**
     * 获取实例详情
     *
     * 获取实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstance, hcClient);
    }

    /**
     * 获取制品版本详情
     *
     * 获取制品版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceArtifactRequest 请求对象
     * @return ShowInstanceArtifactResponse
     */
    public ShowInstanceArtifactResponse showInstanceArtifact(ShowInstanceArtifactRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstanceArtifact);
    }

    /**
     * 获取制品版本详情
     *
     * 获取制品版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceArtifactRequest 请求对象
     * @return SyncInvoker<ShowInstanceArtifactRequest, ShowInstanceArtifactResponse>
     */
    public SyncInvoker<ShowInstanceArtifactRequest, ShowInstanceArtifactResponse> showInstanceArtifactInvoker(
        ShowInstanceArtifactRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstanceArtifact, hcClient);
    }

    /**
     * 获取制品附加信息
     *
     * 获取制品附加信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceArtifactAdditionRequest 请求对象
     * @return ShowInstanceArtifactAdditionResponse
     */
    public ShowInstanceArtifactAdditionResponse showInstanceArtifactAddition(
        ShowInstanceArtifactAdditionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstanceArtifactAddition);
    }

    /**
     * 获取制品附加信息
     *
     * 获取制品附加信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceArtifactAdditionRequest 请求对象
     * @return SyncInvoker<ShowInstanceArtifactAdditionRequest, ShowInstanceArtifactAdditionResponse>
     */
    public SyncInvoker<ShowInstanceArtifactAdditionRequest, ShowInstanceArtifactAdditionResponse> showInstanceArtifactAdditionInvoker(
        ShowInstanceArtifactAdditionRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstanceArtifactAddition, hcClient);
    }

    /**
     * 查看实例配置
     *
     * 查看实例配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return ShowInstanceConfigurationResponse
     */
    public ShowInstanceConfigurationResponse showInstanceConfiguration(ShowInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstanceConfiguration);
    }

    /**
     * 查看实例配置
     *
     * 查看实例配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>
     */
    public SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationInvoker(
        ShowInstanceConfigurationRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 获取公网访问信息
     *
     * 获取公网访问信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceEndpointPolicyRequest 请求对象
     * @return ShowInstanceEndpointPolicyResponse
     */
    public ShowInstanceEndpointPolicyResponse showInstanceEndpointPolicy(ShowInstanceEndpointPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstanceEndpointPolicy);
    }

    /**
     * 获取公网访问信息
     *
     * 获取公网访问信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceEndpointPolicyRequest 请求对象
     * @return SyncInvoker<ShowInstanceEndpointPolicyRequest, ShowInstanceEndpointPolicyResponse>
     */
    public SyncInvoker<ShowInstanceEndpointPolicyRequest, ShowInstanceEndpointPolicyResponse> showInstanceEndpointPolicyInvoker(
        ShowInstanceEndpointPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstanceEndpointPolicy, hcClient);
    }

    /**
     * 查询内网访问详情
     *
     * 查询内网访问详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceInternalEndpointRequest 请求对象
     * @return ShowInstanceInternalEndpointResponse
     */
    public ShowInstanceInternalEndpointResponse showInstanceInternalEndpoint(
        ShowInstanceInternalEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstanceInternalEndpoint);
    }

    /**
     * 查询内网访问详情
     *
     * 查询内网访问详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceInternalEndpointRequest 请求对象
     * @return SyncInvoker<ShowInstanceInternalEndpointRequest, ShowInstanceInternalEndpointResponse>
     */
    public SyncInvoker<ShowInstanceInternalEndpointRequest, ShowInstanceInternalEndpointResponse> showInstanceInternalEndpointInvoker(
        ShowInstanceInternalEndpointRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstanceInternalEndpoint, hcClient);
    }

    /**
     * 获取任务详情
     *
     * 获取任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceJobRequest 请求对象
     * @return ShowInstanceJobResponse
     */
    public ShowInstanceJobResponse showInstanceJob(ShowInstanceJobRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstanceJob);
    }

    /**
     * 获取任务详情
     *
     * 获取任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceJobRequest 请求对象
     * @return SyncInvoker<ShowInstanceJobRequest, ShowInstanceJobResponse>
     */
    public SyncInvoker<ShowInstanceJobRequest, ShowInstanceJobResponse> showInstanceJobInvoker(
        ShowInstanceJobRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstanceJob, hcClient);
    }

    /**
     * 获取命名空间详情
     *
     * 获取命名空间详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceNamespaceRequest 请求对象
     * @return ShowInstanceNamespaceResponse
     */
    public ShowInstanceNamespaceResponse showInstanceNamespace(ShowInstanceNamespaceRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstanceNamespace);
    }

    /**
     * 获取命名空间详情
     *
     * 获取命名空间详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceNamespaceRequest 请求对象
     * @return SyncInvoker<ShowInstanceNamespaceRequest, ShowInstanceNamespaceResponse>
     */
    public SyncInvoker<ShowInstanceNamespaceRequest, ShowInstanceNamespaceResponse> showInstanceNamespaceInvoker(
        ShowInstanceNamespaceRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstanceNamespace, hcClient);
    }

    /**
     * 获取镜像同步的目标仓库详情
     *
     * 获取镜像同步的目标仓库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRegistryRequest 请求对象
     * @return ShowInstanceRegistryResponse
     */
    public ShowInstanceRegistryResponse showInstanceRegistry(ShowInstanceRegistryRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstanceRegistry);
    }

    /**
     * 获取镜像同步的目标仓库详情
     *
     * 获取镜像同步的目标仓库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRegistryRequest 请求对象
     * @return SyncInvoker<ShowInstanceRegistryRequest, ShowInstanceRegistryResponse>
     */
    public SyncInvoker<ShowInstanceRegistryRequest, ShowInstanceRegistryResponse> showInstanceRegistryInvoker(
        ShowInstanceRegistryRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstanceRegistry, hcClient);
    }

    /**
     * 获取镜像同步策略详情
     *
     * 获取镜像同步策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceReplicationPolicyRequest 请求对象
     * @return ShowInstanceReplicationPolicyResponse
     */
    public ShowInstanceReplicationPolicyResponse showInstanceReplicationPolicy(
        ShowInstanceReplicationPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstanceReplicationPolicy);
    }

    /**
     * 获取镜像同步策略详情
     *
     * 获取镜像同步策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceReplicationPolicyRequest 请求对象
     * @return SyncInvoker<ShowInstanceReplicationPolicyRequest, ShowInstanceReplicationPolicyResponse>
     */
    public SyncInvoker<ShowInstanceReplicationPolicyRequest, ShowInstanceReplicationPolicyResponse> showInstanceReplicationPolicyInvoker(
        ShowInstanceReplicationPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstanceReplicationPolicy, hcClient);
    }

    /**
     * 获取制品仓库详情
     *
     * 获取制品仓库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRepositoryRequest 请求对象
     * @return ShowInstanceRepositoryResponse
     */
    public ShowInstanceRepositoryResponse showInstanceRepository(ShowInstanceRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstanceRepository);
    }

    /**
     * 获取制品仓库详情
     *
     * 获取制品仓库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRepositoryRequest 请求对象
     * @return SyncInvoker<ShowInstanceRepositoryRequest, ShowInstanceRepositoryResponse>
     */
    public SyncInvoker<ShowInstanceRepositoryRequest, ShowInstanceRepositoryResponse> showInstanceRepositoryInvoker(
        ShowInstanceRepositoryRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstanceRepository, hcClient);
    }

    /**
     * 按照标签检索资源数量
     *
     * 按照标签检索资源数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceResourceInstancesCountRequest 请求对象
     * @return ShowInstanceResourceInstancesCountResponse
     */
    public ShowInstanceResourceInstancesCountResponse showInstanceResourceInstancesCount(
        ShowInstanceResourceInstancesCountRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstanceResourceInstancesCount);
    }

    /**
     * 按照标签检索资源数量
     *
     * 按照标签检索资源数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceResourceInstancesCountRequest 请求对象
     * @return SyncInvoker<ShowInstanceResourceInstancesCountRequest, ShowInstanceResourceInstancesCountResponse>
     */
    public SyncInvoker<ShowInstanceResourceInstancesCountRequest, ShowInstanceResourceInstancesCountResponse> showInstanceResourceInstancesCountInvoker(
        ShowInstanceResourceInstancesCountRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstanceResourceInstancesCount, hcClient);
    }

    /**
     * 获取老化策略详情
     *
     * 获取老化策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRetentionPolicyRequest 请求对象
     * @return ShowInstanceRetentionPolicyResponse
     */
    public ShowInstanceRetentionPolicyResponse showInstanceRetentionPolicy(ShowInstanceRetentionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstanceRetentionPolicy);
    }

    /**
     * 获取老化策略详情
     *
     * 获取老化策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRetentionPolicyRequest 请求对象
     * @return SyncInvoker<ShowInstanceRetentionPolicyRequest, ShowInstanceRetentionPolicyResponse>
     */
    public SyncInvoker<ShowInstanceRetentionPolicyRequest, ShowInstanceRetentionPolicyResponse> showInstanceRetentionPolicyInvoker(
        ShowInstanceRetentionPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstanceRetentionPolicy, hcClient);
    }

    /**
     * 获取签名策略详情
     *
     * 获取签名策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSignPolicyRequest 请求对象
     * @return ShowInstanceSignPolicyResponse
     */
    public ShowInstanceSignPolicyResponse showInstanceSignPolicy(ShowInstanceSignPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstanceSignPolicy);
    }

    /**
     * 获取签名策略详情
     *
     * 获取签名策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSignPolicyRequest 请求对象
     * @return SyncInvoker<ShowInstanceSignPolicyRequest, ShowInstanceSignPolicyResponse>
     */
    public SyncInvoker<ShowInstanceSignPolicyRequest, ShowInstanceSignPolicyResponse> showInstanceSignPolicyInvoker(
        ShowInstanceSignPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstanceSignPolicy, hcClient);
    }

    /**
     * 获取触发器详情
     *
     * 获取触发器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceWebhookRequest 请求对象
     * @return ShowInstanceWebhookResponse
     */
    public ShowInstanceWebhookResponse showInstanceWebhook(ShowInstanceWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showInstanceWebhook);
    }

    /**
     * 获取触发器详情
     *
     * 获取触发器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceWebhookRequest 请求对象
     * @return SyncInvoker<ShowInstanceWebhookRequest, ShowInstanceWebhookResponse>
     */
    public SyncInvoker<ShowInstanceWebhookRequest, ShowInstanceWebhookResponse> showInstanceWebhookInvoker(
        ShowInstanceWebhookRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showInstanceWebhook, hcClient);
    }

    /**
     * 按照标签检索子资源数量
     *
     * 按照标签检索子资源数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubResourceInstancesCountRequest 请求对象
     * @return ShowSubResourceInstancesCountResponse
     */
    public ShowSubResourceInstancesCountResponse showSubResourceInstancesCount(
        ShowSubResourceInstancesCountRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.showSubResourceInstancesCount);
    }

    /**
     * 按照标签检索子资源数量
     *
     * 按照标签检索子资源数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubResourceInstancesCountRequest 请求对象
     * @return SyncInvoker<ShowSubResourceInstancesCountRequest, ShowSubResourceInstancesCountResponse>
     */
    public SyncInvoker<ShowSubResourceInstancesCountRequest, ShowSubResourceInstancesCountResponse> showSubResourceInstancesCountInvoker(
        ShowSubResourceInstancesCountRequest request) {
        return new SyncInvoker<>(request, SwrMeta.showSubResourceInstancesCount, hcClient);
    }

    /**
     * 手动启动制品扫描
     *
     * 手动启动制品扫描
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartManualScanningRequest 请求对象
     * @return StartManualScanningResponse
     */
    public StartManualScanningResponse startManualScanning(StartManualScanningRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.startManualScanning);
    }

    /**
     * 手动启动制品扫描
     *
     * 手动启动制品扫描
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartManualScanningRequest 请求对象
     * @return SyncInvoker<StartManualScanningRequest, StartManualScanningResponse>
     */
    public SyncInvoker<StartManualScanningRequest, StartManualScanningResponse> startManualScanningInvoker(
        StartManualScanningRequest request) {
        return new SyncInvoker<>(request, SwrMeta.startManualScanning, hcClient);
    }

    /**
     * 停止镜像同步任务
     *
     * 停止镜像同步任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInstanceReplicationPolicyExecutionRequest 请求对象
     * @return StopInstanceReplicationPolicyExecutionResponse
     */
    public StopInstanceReplicationPolicyExecutionResponse stopInstanceReplicationPolicyExecution(
        StopInstanceReplicationPolicyExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.stopInstanceReplicationPolicyExecution);
    }

    /**
     * 停止镜像同步任务
     *
     * 停止镜像同步任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInstanceReplicationPolicyExecutionRequest 请求对象
     * @return SyncInvoker<StopInstanceReplicationPolicyExecutionRequest, StopInstanceReplicationPolicyExecutionResponse>
     */
    public SyncInvoker<StopInstanceReplicationPolicyExecutionRequest, StopInstanceReplicationPolicyExecutionResponse> stopInstanceReplicationPolicyExecutionInvoker(
        StopInstanceReplicationPolicyExecutionRequest request) {
        return new SyncInvoker<>(request, SwrMeta.stopInstanceReplicationPolicyExecution, hcClient);
    }

    /**
     * 更新域名
     *
     * 更新域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainNameRequest 请求对象
     * @return UpdateDomainNameResponse
     */
    public UpdateDomainNameResponse updateDomainName(UpdateDomainNameRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateDomainName);
    }

    /**
     * 更新域名
     *
     * 更新域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainNameRequest 请求对象
     * @return SyncInvoker<UpdateDomainNameRequest, UpdateDomainNameResponse>
     */
    public SyncInvoker<UpdateDomainNameRequest, UpdateDomainNameResponse> updateDomainNameInvoker(
        UpdateDomainNameRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateDomainName, hcClient);
    }

    /**
     * 修改不可变Tag策略
     *
     * 修改不可变Tag策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImmutableRuleRequest 请求对象
     * @return UpdateImmutableRuleResponse
     */
    public UpdateImmutableRuleResponse updateImmutableRule(UpdateImmutableRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateImmutableRule);
    }

    /**
     * 修改不可变Tag策略
     *
     * 修改不可变Tag策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImmutableRuleRequest 请求对象
     * @return SyncInvoker<UpdateImmutableRuleRequest, UpdateImmutableRuleResponse>
     */
    public SyncInvoker<UpdateImmutableRuleRequest, UpdateImmutableRuleResponse> updateImmutableRuleInvoker(
        UpdateImmutableRuleRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateImmutableRule, hcClient);
    }

    /**
     * 修改实例配置
     *
     * 修改实例配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationRequest 请求对象
     * @return UpdateInstanceConfigurationResponse
     */
    public UpdateInstanceConfigurationResponse updateInstanceConfiguration(UpdateInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateInstanceConfiguration);
    }

    /**
     * 修改实例配置
     *
     * 修改实例配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
     */
    public SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationInvoker(
        UpdateInstanceConfigurationRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 更新公网访问白名单
     *
     * 更新公网访问白名单，更新方式为全量更新方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceEndpointPolicyRequest 请求对象
     * @return UpdateInstanceEndpointPolicyResponse
     */
    public UpdateInstanceEndpointPolicyResponse updateInstanceEndpointPolicy(
        UpdateInstanceEndpointPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateInstanceEndpointPolicy);
    }

    /**
     * 更新公网访问白名单
     *
     * 更新公网访问白名单，更新方式为全量更新方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceEndpointPolicyRequest 请求对象
     * @return SyncInvoker<UpdateInstanceEndpointPolicyRequest, UpdateInstanceEndpointPolicyResponse>
     */
    public SyncInvoker<UpdateInstanceEndpointPolicyRequest, UpdateInstanceEndpointPolicyResponse> updateInstanceEndpointPolicyInvoker(
        UpdateInstanceEndpointPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateInstanceEndpointPolicy, hcClient);
    }

    /**
     * 启用/停用长期访问凭证
     *
     * 启用/停用长期访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceLtCredentialRequest 请求对象
     * @return UpdateInstanceLtCredentialResponse
     */
    public UpdateInstanceLtCredentialResponse updateInstanceLtCredential(UpdateInstanceLtCredentialRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateInstanceLtCredential);
    }

    /**
     * 启用/停用长期访问凭证
     *
     * 启用/停用长期访问凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceLtCredentialRequest 请求对象
     * @return SyncInvoker<UpdateInstanceLtCredentialRequest, UpdateInstanceLtCredentialResponse>
     */
    public SyncInvoker<UpdateInstanceLtCredentialRequest, UpdateInstanceLtCredentialResponse> updateInstanceLtCredentialInvoker(
        UpdateInstanceLtCredentialRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateInstanceLtCredential, hcClient);
    }

    /**
     * 修改命名空间
     *
     * 修改命名空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNamespaceRequest 请求对象
     * @return UpdateInstanceNamespaceResponse
     */
    public UpdateInstanceNamespaceResponse updateInstanceNamespace(UpdateInstanceNamespaceRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateInstanceNamespace);
    }

    /**
     * 修改命名空间
     *
     * 修改命名空间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNamespaceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceNamespaceRequest, UpdateInstanceNamespaceResponse>
     */
    public SyncInvoker<UpdateInstanceNamespaceRequest, UpdateInstanceNamespaceResponse> updateInstanceNamespaceInvoker(
        UpdateInstanceNamespaceRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateInstanceNamespace, hcClient);
    }

    /**
     * 修改镜像同步的目标仓库
     *
     * 修改镜像同步的目标仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRegistryRequest 请求对象
     * @return UpdateInstanceRegistryResponse
     */
    public UpdateInstanceRegistryResponse updateInstanceRegistry(UpdateInstanceRegistryRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateInstanceRegistry);
    }

    /**
     * 修改镜像同步的目标仓库
     *
     * 修改镜像同步的目标仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRegistryRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRegistryRequest, UpdateInstanceRegistryResponse>
     */
    public SyncInvoker<UpdateInstanceRegistryRequest, UpdateInstanceRegistryResponse> updateInstanceRegistryInvoker(
        UpdateInstanceRegistryRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateInstanceRegistry, hcClient);
    }

    /**
     * 修改镜像同步策略
     *
     * 修改镜像同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceReplicationPolicyRequest 请求对象
     * @return UpdateInstanceReplicationPolicyResponse
     */
    public UpdateInstanceReplicationPolicyResponse updateInstanceReplicationPolicy(
        UpdateInstanceReplicationPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateInstanceReplicationPolicy);
    }

    /**
     * 修改镜像同步策略
     *
     * 修改镜像同步策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceReplicationPolicyRequest 请求对象
     * @return SyncInvoker<UpdateInstanceReplicationPolicyRequest, UpdateInstanceReplicationPolicyResponse>
     */
    public SyncInvoker<UpdateInstanceReplicationPolicyRequest, UpdateInstanceReplicationPolicyResponse> updateInstanceReplicationPolicyInvoker(
        UpdateInstanceReplicationPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateInstanceReplicationPolicy, hcClient);
    }

    /**
     * 修改制品仓库
     *
     * 修改制品仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRepositoryRequest 请求对象
     * @return UpdateInstanceRepositoryResponse
     */
    public UpdateInstanceRepositoryResponse updateInstanceRepository(UpdateInstanceRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateInstanceRepository);
    }

    /**
     * 修改制品仓库
     *
     * 修改制品仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRepositoryRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRepositoryRequest, UpdateInstanceRepositoryResponse>
     */
    public SyncInvoker<UpdateInstanceRepositoryRequest, UpdateInstanceRepositoryResponse> updateInstanceRepositoryInvoker(
        UpdateInstanceRepositoryRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateInstanceRepository, hcClient);
    }

    /**
     * 修改老化策略
     *
     * 修改老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRetentionPolicyRequest 请求对象
     * @return UpdateInstanceRetentionPolicyResponse
     */
    public UpdateInstanceRetentionPolicyResponse updateInstanceRetentionPolicy(
        UpdateInstanceRetentionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateInstanceRetentionPolicy);
    }

    /**
     * 修改老化策略
     *
     * 修改老化策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRetentionPolicyRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRetentionPolicyRequest, UpdateInstanceRetentionPolicyResponse>
     */
    public SyncInvoker<UpdateInstanceRetentionPolicyRequest, UpdateInstanceRetentionPolicyResponse> updateInstanceRetentionPolicyInvoker(
        UpdateInstanceRetentionPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateInstanceRetentionPolicy, hcClient);
    }

    /**
     * 修改签名策略
     *
     * 修改签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceSignPolicyRequest 请求对象
     * @return UpdateInstanceSignPolicyResponse
     */
    public UpdateInstanceSignPolicyResponse updateInstanceSignPolicy(UpdateInstanceSignPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateInstanceSignPolicy);
    }

    /**
     * 修改签名策略
     *
     * 修改签名策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceSignPolicyRequest 请求对象
     * @return SyncInvoker<UpdateInstanceSignPolicyRequest, UpdateInstanceSignPolicyResponse>
     */
    public SyncInvoker<UpdateInstanceSignPolicyRequest, UpdateInstanceSignPolicyResponse> updateInstanceSignPolicyInvoker(
        UpdateInstanceSignPolicyRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateInstanceSignPolicy, hcClient);
    }

    /**
     * 修改触发器
     *
     * 修改触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceWebhookRequest 请求对象
     * @return UpdateInstanceWebhookResponse
     */
    public UpdateInstanceWebhookResponse updateInstanceWebhook(UpdateInstanceWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, SwrMeta.updateInstanceWebhook);
    }

    /**
     * 修改触发器
     *
     * 修改触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceWebhookRequest 请求对象
     * @return SyncInvoker<UpdateInstanceWebhookRequest, UpdateInstanceWebhookResponse>
     */
    public SyncInvoker<UpdateInstanceWebhookRequest, UpdateInstanceWebhookResponse> updateInstanceWebhookInvoker(
        UpdateInstanceWebhookRequest request) {
        return new SyncInvoker<>(request, SwrMeta.updateInstanceWebhook, hcClient);
    }

}
