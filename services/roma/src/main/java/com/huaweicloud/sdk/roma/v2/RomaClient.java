package com.huaweicloud.sdk.roma.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.roma.v2.model.AddSubsetsToGatewayRequest;
import com.huaweicloud.sdk.roma.v2.model.AddSubsetsToGatewayResponse;
import com.huaweicloud.sdk.roma.v2.model.AddUserToAppRequest;
import com.huaweicloud.sdk.roma.v2.model.AddUserToAppResponse;
import com.huaweicloud.sdk.roma.v2.model.AddingBackendInstancesV2Request;
import com.huaweicloud.sdk.roma.v2.model.AddingBackendInstancesV2Response;
import com.huaweicloud.sdk.roma.v2.model.AssociateAppsForAppQuotaRequest;
import com.huaweicloud.sdk.roma.v2.model.AssociateAppsForAppQuotaResponse;
import com.huaweicloud.sdk.roma.v2.model.AssociateCertificateV2Request;
import com.huaweicloud.sdk.roma.v2.model.AssociateCertificateV2Response;
import com.huaweicloud.sdk.roma.v2.model.AssociateDomainV2Request;
import com.huaweicloud.sdk.roma.v2.model.AssociateDomainV2Response;
import com.huaweicloud.sdk.roma.v2.model.AssociateRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.roma.v2.model.AssociateRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.roma.v2.model.AssociateSignatureKeyV2Request;
import com.huaweicloud.sdk.roma.v2.model.AssociateSignatureKeyV2Response;
import com.huaweicloud.sdk.roma.v2.model.AttachApiToPluginRequest;
import com.huaweicloud.sdk.roma.v2.model.AttachApiToPluginResponse;
import com.huaweicloud.sdk.roma.v2.model.AttachPluginToApiRequest;
import com.huaweicloud.sdk.roma.v2.model.AttachPluginToApiResponse;
import com.huaweicloud.sdk.roma.v2.model.BatchAddDeviceToGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.BatchAddDeviceToGroupResponse;
import com.huaweicloud.sdk.roma.v2.model.BatchAssociateCertsV2Request;
import com.huaweicloud.sdk.roma.v2.model.BatchAssociateCertsV2Response;
import com.huaweicloud.sdk.roma.v2.model.BatchAssociateDomainsV2Request;
import com.huaweicloud.sdk.roma.v2.model.BatchAssociateDomainsV2Response;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteAclV2Request;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteAclV2Response;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteApiAclBindingV2Request;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteApiAclBindingV2Response;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteDevicesRequest;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteDevicesResponse;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteMqsInstanceTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteMqsInstanceTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteRulesRequest;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteRulesResponse;
import com.huaweicloud.sdk.roma.v2.model.BatchDisableMembersRequest;
import com.huaweicloud.sdk.roma.v2.model.BatchDisableMembersResponse;
import com.huaweicloud.sdk.roma.v2.model.BatchDisassociateCertsV2Request;
import com.huaweicloud.sdk.roma.v2.model.BatchDisassociateCertsV2Response;
import com.huaweicloud.sdk.roma.v2.model.BatchDisassociateDomainsV2Request;
import com.huaweicloud.sdk.roma.v2.model.BatchDisassociateDomainsV2Response;
import com.huaweicloud.sdk.roma.v2.model.BatchDisassociateThrottlingPolicyV2Request;
import com.huaweicloud.sdk.roma.v2.model.BatchDisassociateThrottlingPolicyV2Response;
import com.huaweicloud.sdk.roma.v2.model.BatchEnableMembersRequest;
import com.huaweicloud.sdk.roma.v2.model.BatchEnableMembersResponse;
import com.huaweicloud.sdk.roma.v2.model.BatchFreezeDevicesRequest;
import com.huaweicloud.sdk.roma.v2.model.BatchFreezeDevicesResponse;
import com.huaweicloud.sdk.roma.v2.model.BatchPublishOrOfflineApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.BatchPublishOrOfflineApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.BatchStartOrStopTasksRequest;
import com.huaweicloud.sdk.roma.v2.model.BatchStartOrStopTasksResponse;
import com.huaweicloud.sdk.roma.v2.model.CancelingAuthorizationV2Request;
import com.huaweicloud.sdk.roma.v2.model.CancelingAuthorizationV2Response;
import com.huaweicloud.sdk.roma.v2.model.ChangeApiVersionV2Request;
import com.huaweicloud.sdk.roma.v2.model.ChangeApiVersionV2Response;
import com.huaweicloud.sdk.roma.v2.model.CheckApiGroupsV2Request;
import com.huaweicloud.sdk.roma.v2.model.CheckApiGroupsV2Response;
import com.huaweicloud.sdk.roma.v2.model.CheckApisV2Request;
import com.huaweicloud.sdk.roma.v2.model.CheckApisV2Response;
import com.huaweicloud.sdk.roma.v2.model.CheckAssetJobStatusRequest;
import com.huaweicloud.sdk.roma.v2.model.CheckAssetJobStatusResponse;
import com.huaweicloud.sdk.roma.v2.model.CheckAuthUsersOfAppRequest;
import com.huaweicloud.sdk.roma.v2.model.CheckAuthUsersOfAppResponse;
import com.huaweicloud.sdk.roma.v2.model.CheckCanAuthUsersOfAppRequest;
import com.huaweicloud.sdk.roma.v2.model.CheckCanAuthUsersOfAppResponse;
import com.huaweicloud.sdk.roma.v2.model.CheckDictionaryRequest;
import com.huaweicloud.sdk.roma.v2.model.CheckDictionaryResponse;
import com.huaweicloud.sdk.roma.v2.model.CheckLivedataApisV2Request;
import com.huaweicloud.sdk.roma.v2.model.CheckLivedataApisV2Response;
import com.huaweicloud.sdk.roma.v2.model.CheckRomaAppDetailsRequest;
import com.huaweicloud.sdk.roma.v2.model.CheckRomaAppDetailsResponse;
import com.huaweicloud.sdk.roma.v2.model.CheckRomaAppSecretRequest;
import com.huaweicloud.sdk.roma.v2.model.CheckRomaAppSecretResponse;
import com.huaweicloud.sdk.roma.v2.model.CheckRomaInstanceListV2Request;
import com.huaweicloud.sdk.roma.v2.model.CheckRomaInstanceListV2Response;
import com.huaweicloud.sdk.roma.v2.model.CountDevicesRequest;
import com.huaweicloud.sdk.roma.v2.model.CountDevicesResponse;
import com.huaweicloud.sdk.roma.v2.model.CountTasksRequest;
import com.huaweicloud.sdk.roma.v2.model.CountTasksResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateAclStrategyV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateAclStrategyV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateApiAclBindingV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateApiAclBindingV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateApiGroupV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateApiGroupV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateAppCodeAutoV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateAppCodeAutoV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateAppCodeV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateAppCodeV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateAppConfigV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateAppConfigV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateAppQuotaRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateAppQuotaResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateAuthorizingAppsV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateAuthorizingAppsV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateCertificateV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateCertificateV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateCommandRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateCommandResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateCommonTaskRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateCommonTaskResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateCustomAuthorizerV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateCustomAuthorizerV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateDatasourceInfoRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateDatasourceInfoResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateDestinationRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateDestinationResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateDeviceGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateDeviceGroupResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateDeviceRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateDeviceResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateDictionaryRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateDictionaryResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateDispatchesRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateDispatchesResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateEnvironmentV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateEnvironmentV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateEnvironmentVariableV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateEnvironmentVariableV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateFeatureV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateFeatureV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateLiveDataApiScriptV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateLiveDataApiScriptV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateLiveDataApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateLiveDataApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateMemberGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateMemberGroupResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateMqsInstanceTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateMqsInstanceTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateMultiTaskMappingsRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateMultiTaskMappingsResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateMultiTasksRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateMultiTasksResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateNotificationRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateNotificationResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateOrDeletePublishRecordForApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateOrDeletePublishRecordForApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreatePluginRequest;
import com.huaweicloud.sdk.roma.v2.model.CreatePluginResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateProductRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateProductResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateProductTemplateRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateProductTemplateResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateProductTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateProductTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateProjectVpcChannelRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateProjectVpcChannelResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateProjectVpcChannelSyncsRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateProjectVpcChannelSyncsResponse;
import com.huaweicloud.sdk.roma.v2.model.CreatePropertyRequest;
import com.huaweicloud.sdk.roma.v2.model.CreatePropertyResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateRequestPropertyRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateRequestPropertyResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateResponsePropertyRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateResponsePropertyResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateRomaAppRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateRomaAppResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateRuleRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateRuleResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateServiceRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateServiceResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateSignatureKeyV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateSignatureKeyV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateSourceRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateSourceResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateSpecialThrottlingConfigurationV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateSpecialThrottlingConfigurationV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateVpcChannelV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateVpcChannelV2Response;
import com.huaweicloud.sdk.roma.v2.model.DebugApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.DebugApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.DebugLiveDataApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.DebugLiveDataApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.DebugRuleRequest;
import com.huaweicloud.sdk.roma.v2.model.DebugRuleResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteAclV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteAclV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteApiAclBindingV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteApiAclBindingV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteApiByVersionIdV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteApiByVersionIdV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteApiGroupV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteApiGroupV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteAppAclRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteAppAclResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteAppCodeV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteAppCodeV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteAppConfigV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteAppConfigV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteAppQuotaRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteAppQuotaResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteAssetRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteAssetResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteBackendInstanceV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteBackendInstanceV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteCertificateV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteCertificateV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteCommandRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteCommandResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteCustomAuthorizerV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteCustomAuthorizerV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteDatasourceInfoByIdRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteDatasourceInfoByIdResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteDestinationRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteDestinationResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteDeviceFromGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteDeviceFromGroupResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteDeviceGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteDeviceGroupResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteDeviceRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteDeviceResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteDictionaryRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteDictionaryResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteEnvironmentV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteEnvironmentV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteEnvironmentVariableV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteEnvironmentVariableV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteLiveDataApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteLiveDataApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteMemberGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteMemberGroupResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteMqsInstanceTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteMqsInstanceTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteMultiTaskMappingRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteMultiTaskMappingResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteNotificationRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteNotificationResponse;
import com.huaweicloud.sdk.roma.v2.model.DeletePluginRequest;
import com.huaweicloud.sdk.roma.v2.model.DeletePluginResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteProductRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteProductResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteProductTemplateRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteProductTemplateResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteProductTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteProductTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.DeletePropertyRequest;
import com.huaweicloud.sdk.roma.v2.model.DeletePropertyResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteRequestPropertyRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteRequestPropertyResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteResponsePropertyRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteResponsePropertyResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteRomaAppRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteRomaAppResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteRuleRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteRuleResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteServiceRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteServiceResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteSignatureKeyV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteSignatureKeyV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteSourceRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteSourceResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteSpecialThrottlingConfigurationV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteSpecialThrottlingConfigurationV2Response;
import com.huaweicloud.sdk.roma.v2.model.DeleteTaskRequest;
import com.huaweicloud.sdk.roma.v2.model.DeleteTaskResponse;
import com.huaweicloud.sdk.roma.v2.model.DeleteVpcChannelV2Request;
import com.huaweicloud.sdk.roma.v2.model.DeleteVpcChannelV2Response;
import com.huaweicloud.sdk.roma.v2.model.DetachApiFromPluginRequest;
import com.huaweicloud.sdk.roma.v2.model.DetachApiFromPluginResponse;
import com.huaweicloud.sdk.roma.v2.model.DetachPluginFromApiRequest;
import com.huaweicloud.sdk.roma.v2.model.DetachPluginFromApiResponse;
import com.huaweicloud.sdk.roma.v2.model.DisassociateAppQuotaWithAppRequest;
import com.huaweicloud.sdk.roma.v2.model.DisassociateAppQuotaWithAppResponse;
import com.huaweicloud.sdk.roma.v2.model.DisassociateCertificateV2Request;
import com.huaweicloud.sdk.roma.v2.model.DisassociateCertificateV2Response;
import com.huaweicloud.sdk.roma.v2.model.DisassociateDomainV2Request;
import com.huaweicloud.sdk.roma.v2.model.DisassociateDomainV2Response;
import com.huaweicloud.sdk.roma.v2.model.DisassociateRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.roma.v2.model.DisassociateRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.roma.v2.model.DisassociateSignatureKeyV2Request;
import com.huaweicloud.sdk.roma.v2.model.DisassociateSignatureKeyV2Response;
import com.huaweicloud.sdk.roma.v2.model.DownloadAssetArchiveRequest;
import com.huaweicloud.sdk.roma.v2.model.DownloadAssetArchiveResponse;
import com.huaweicloud.sdk.roma.v2.model.DownloadProductsRequest;
import com.huaweicloud.sdk.roma.v2.model.DownloadProductsResponse;
import com.huaweicloud.sdk.roma.v2.model.ExportApiDefinitionsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ExportApiDefinitionsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ExportAssetRequest;
import com.huaweicloud.sdk.roma.v2.model.ExportAssetResponse;
import com.huaweicloud.sdk.roma.v2.model.ExportLiveDataApiDefinitionsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ExportLiveDataApiDefinitionsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ExportMqsInstanceTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.ExportMqsInstanceTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.ImportApiDefinitionsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ImportApiDefinitionsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ImportAssetRequest;
import com.huaweicloud.sdk.roma.v2.model.ImportAssetResponse;
import com.huaweicloud.sdk.roma.v2.model.ImportLiveDataApiDefinitionsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ImportLiveDataApiDefinitionsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ImportMqsInstanceTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.ImportMqsInstanceTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.InstallMultiTasksRequest;
import com.huaweicloud.sdk.roma.v2.model.InstallMultiTasksResponse;
import com.huaweicloud.sdk.roma.v2.model.ListAclPolicyBindedToApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListAclPolicyBindedToApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListAclStrategiesV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListAclStrategiesV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListApiAttachablePluginsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListApiAttachablePluginsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListApiAttachedPluginsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListApiAttachedPluginsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListApiGroupsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListApiGroupsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListApiRuntimeDefinitionV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListApiRuntimeDefinitionV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListApiVersionDetailV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListApiVersionDetailV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListApiVersionsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListApiVersionsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListApisBindedToAclPolicyV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListApisBindedToAclPolicyV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListApisBindedToAppV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListApisBindedToAppV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListApisBindedToRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListApisBindedToRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListApisBindedToSignatureKeyV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListApisBindedToSignatureKeyV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListApisNotBoundWithSignatureKeyV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListApisNotBoundWithSignatureKeyV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListApisUnbindedToAclPolicyV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListApisUnbindedToAclPolicyV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListApisUnbindedToAppV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListApisUnbindedToAppV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListApisUnbindedToRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListApisUnbindedToRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListApisV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListApisV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListAppCodesV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListAppCodesV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListAppConfigsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListAppConfigsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListAppQuotaBindableAppsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListAppQuotaBindableAppsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListAppQuotaBoundAppsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListAppQuotaBoundAppsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListAppQuotasRequest;
import com.huaweicloud.sdk.roma.v2.model.ListAppQuotasResponse;
import com.huaweicloud.sdk.roma.v2.model.ListAppsBindedToApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListAppsBindedToApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListAppsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListAppsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListAttachedDomainsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListAttachedDomainsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListBackendInstancesV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListBackendInstancesV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListCertificatesV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListCertificatesV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListCommandsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListCommandsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListCustomAuthorizersV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListCustomAuthorizersV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListDatasourceColumnsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListDatasourceColumnsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListDatasourceTablesRequest;
import com.huaweicloud.sdk.roma.v2.model.ListDatasourceTablesResponse;
import com.huaweicloud.sdk.roma.v2.model.ListDatasourcesRequest;
import com.huaweicloud.sdk.roma.v2.model.ListDatasourcesResponse;
import com.huaweicloud.sdk.roma.v2.model.ListDestinationsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListDestinationsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListDevicesInProductRequest;
import com.huaweicloud.sdk.roma.v2.model.ListDevicesInProductResponse;
import com.huaweicloud.sdk.roma.v2.model.ListDevicesRequest;
import com.huaweicloud.sdk.roma.v2.model.ListDevicesResponse;
import com.huaweicloud.sdk.roma.v2.model.ListDictionaryRequest;
import com.huaweicloud.sdk.roma.v2.model.ListDictionaryResponse;
import com.huaweicloud.sdk.roma.v2.model.ListDuplicateApisForAppV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListDuplicateApisForAppV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListEnvironmentVariablesV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListEnvironmentVariablesV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListEnvironmentsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListEnvironmentsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListFeaturesV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListFeaturesV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListLatelyApiStatisticsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListLatelyApiStatisticsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListLiveDataApiDeploymentHistoryV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListLiveDataApiDeploymentHistoryV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListLiveDataApiTestHistoryV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListLiveDataApiTestHistoryV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListLiveDataApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListLiveDataApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListLiveDataDataSourcesV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListLiveDataDataSourcesV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListLiveDataQuotaV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListLiveDataQuotaV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListMemberGroupsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListMemberGroupsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListMonitorInfosRequest;
import com.huaweicloud.sdk.roma.v2.model.ListMonitorInfosResponse;
import com.huaweicloud.sdk.roma.v2.model.ListMonitorLogRequest;
import com.huaweicloud.sdk.roma.v2.model.ListMonitorLogResponse;
import com.huaweicloud.sdk.roma.v2.model.ListMqsInstanceRequest;
import com.huaweicloud.sdk.roma.v2.model.ListMqsInstanceResponse;
import com.huaweicloud.sdk.roma.v2.model.ListMqsInstanceTopicsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListMqsInstanceTopicsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListNotificationRequest;
import com.huaweicloud.sdk.roma.v2.model.ListNotificationResponse;
import com.huaweicloud.sdk.roma.v2.model.ListPluginAttachableApisRequest;
import com.huaweicloud.sdk.roma.v2.model.ListPluginAttachableApisResponse;
import com.huaweicloud.sdk.roma.v2.model.ListPluginAttachedApisRequest;
import com.huaweicloud.sdk.roma.v2.model.ListPluginAttachedApisResponse;
import com.huaweicloud.sdk.roma.v2.model.ListPluginsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListPluginsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListProductTemplatesRequest;
import com.huaweicloud.sdk.roma.v2.model.ListProductTemplatesResponse;
import com.huaweicloud.sdk.roma.v2.model.ListProductTopicsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListProductTopicsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListProductsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListProductsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListProjectCofigsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListProjectCofigsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListProjectVpcChannelsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListProjectVpcChannelsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListPropertiesRequest;
import com.huaweicloud.sdk.roma.v2.model.ListPropertiesResponse;
import com.huaweicloud.sdk.roma.v2.model.ListRequestPropertiesRequest;
import com.huaweicloud.sdk.roma.v2.model.ListRequestPropertiesResponse;
import com.huaweicloud.sdk.roma.v2.model.ListRequestThrottlingPoliciesBindedToApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListRequestThrottlingPoliciesBindedToApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListResponsePropertiesRequest;
import com.huaweicloud.sdk.roma.v2.model.ListResponsePropertiesResponse;
import com.huaweicloud.sdk.roma.v2.model.ListRomaAppRequest;
import com.huaweicloud.sdk.roma.v2.model.ListRomaAppResponse;
import com.huaweicloud.sdk.roma.v2.model.ListRulesRequest;
import com.huaweicloud.sdk.roma.v2.model.ListRulesResponse;
import com.huaweicloud.sdk.roma.v2.model.ListServicesRequest;
import com.huaweicloud.sdk.roma.v2.model.ListServicesResponse;
import com.huaweicloud.sdk.roma.v2.model.ListShadowsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListShadowsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListSignatureKeysBindedToApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListSignatureKeysBindedToApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListSignatureKeysV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListSignatureKeysV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListSourcesRequest;
import com.huaweicloud.sdk.roma.v2.model.ListSourcesResponse;
import com.huaweicloud.sdk.roma.v2.model.ListSpecialThrottlingConfigurationsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListSpecialThrottlingConfigurationsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListStatisticsApiRequest;
import com.huaweicloud.sdk.roma.v2.model.ListStatisticsApiResponse;
import com.huaweicloud.sdk.roma.v2.model.ListSubsetsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListSubsetsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListTagsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListTagsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ListTasksRequest;
import com.huaweicloud.sdk.roma.v2.model.ListTasksResponse;
import com.huaweicloud.sdk.roma.v2.model.ListTopicsRequest;
import com.huaweicloud.sdk.roma.v2.model.ListTopicsResponse;
import com.huaweicloud.sdk.roma.v2.model.ListVpcChannelsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListVpcChannelsV2Response;
import com.huaweicloud.sdk.roma.v2.model.PublishLiveDataApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.PublishLiveDataApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.ResetAuthenticationRequest;
import com.huaweicloud.sdk.roma.v2.model.ResetAuthenticationResponse;
import com.huaweicloud.sdk.roma.v2.model.ResetMessagesRequest;
import com.huaweicloud.sdk.roma.v2.model.ResetMessagesResponse;
import com.huaweicloud.sdk.roma.v2.model.ResetMultiTaskOffsetRequest;
import com.huaweicloud.sdk.roma.v2.model.ResetMultiTaskOffsetResponse;
import com.huaweicloud.sdk.roma.v2.model.ResetProductAuthenticationRequest;
import com.huaweicloud.sdk.roma.v2.model.ResetProductAuthenticationResponse;
import com.huaweicloud.sdk.roma.v2.model.ResetRomaAppSecretRequest;
import com.huaweicloud.sdk.roma.v2.model.ResetRomaAppSecretResponse;
import com.huaweicloud.sdk.roma.v2.model.RunTaskRequest;
import com.huaweicloud.sdk.roma.v2.model.RunTaskResponse;
import com.huaweicloud.sdk.roma.v2.model.SendCommandRequest;
import com.huaweicloud.sdk.roma.v2.model.SendCommandResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowAppBoundAppQuotaRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowAppBoundAppQuotaResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowAppQuotaRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowAppQuotaResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowAuthenticationRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowAuthenticationResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowCommandRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowCommandResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowDataourceDetailRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowDataourceDetailResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfAclPolicyV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfAclPolicyV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfApiGroupV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfApiGroupV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfAppAclRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfAppAclResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfAppCodeV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfAppCodeV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfAppConfigV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfAppConfigV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfAppV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfAppV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfCertificateV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfCertificateV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfCustomAuthorizersV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfCustomAuthorizersV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfDomainNameCertificateV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfDomainNameCertificateV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfEnvironmentVariableV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfEnvironmentVariableV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfInstanceV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfInstanceV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfMemberGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfMemberGroupResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfVpcChannelV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowDetailsOfVpcChannelV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowDeviceGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowDeviceGroupResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowDeviceGroupTreeRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowDeviceGroupTreeResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowDeviceRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowDeviceResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowDevicesInGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowDevicesInGroupResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowDispatchesRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowDispatchesResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowLiveDataApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowLiveDataApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowMqsInstanceMessagesRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowMqsInstanceMessagesResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowMqsInstanceRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowMqsInstanceResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowMqsInstanceTopicAccessPolicyRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowMqsInstanceTopicAccessPolicyResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowPluginRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowPluginResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowProductAuthenticationRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowProductAuthenticationResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowProductRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowProductResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowProductTemplateRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowProductTemplateResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowPropertyRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowPropertyResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowRequestPropertyRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowRequestPropertyResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowResponsePropertyRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowResponsePropertyResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowRestrictionOfInstanceV2Request;
import com.huaweicloud.sdk.roma.v2.model.ShowRestrictionOfInstanceV2Response;
import com.huaweicloud.sdk.roma.v2.model.ShowRuleRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowRuleResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowServiceRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowServiceResponse;
import com.huaweicloud.sdk.roma.v2.model.ShowTaskRequest;
import com.huaweicloud.sdk.roma.v2.model.ShowTaskResponse;
import com.huaweicloud.sdk.roma.v2.model.StartTestDatasourceRequest;
import com.huaweicloud.sdk.roma.v2.model.StartTestDatasourceResponse;
import com.huaweicloud.sdk.roma.v2.model.StopTaskRequest;
import com.huaweicloud.sdk.roma.v2.model.StopTaskResponse;
import com.huaweicloud.sdk.roma.v2.model.UnpublishLiveDataApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.UnpublishLiveDataApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateAclStrategyV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateAclStrategyV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateApiGroupV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateApiGroupV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateAppAclRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateAppAclResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateAppConfigV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateAppConfigV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateAppQuotaRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateAppQuotaResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateBackendInstancesV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateBackendInstancesV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateCertificateV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateCertificateV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateCommandRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateCommandResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateCustomAuthorizerV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateCustomAuthorizerV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateDatasourceInfoRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateDatasourceInfoResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateDeviceGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateDeviceGroupResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateDeviceRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateDeviceResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateDictionaryRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateDictionaryResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateDispatchesRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateDispatchesResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateDomainV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateDomainV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateEnvironmentV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateEnvironmentV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateEnvironmentVariableV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateEnvironmentVariableV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateHealthCheckRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateHealthCheckResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateLiveDataApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateLiveDataApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateMemberGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateMemberGroupResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateMqsInstanceTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateMqsInstanceTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateMultiTasksRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateMultiTasksResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateNotificationRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateNotificationResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdatePluginRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdatePluginResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductTemplateRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductTemplateResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateProjectVpcChannelRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateProjectVpcChannelResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdatePropertyRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdatePropertyResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateRequestPropertyRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateRequestPropertyResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateResponsePropertyRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateResponsePropertyResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateRomaAppRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateRomaAppResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateRuleRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateRuleResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateServiceRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateServiceResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateSignatureKeyV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateSignatureKeyV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateSpecialThrottlingConfigurationV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateSpecialThrottlingConfigurationV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateTaskRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateTaskResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateTopicAccessPolicyRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateTopicAccessPolicyResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateVpcChannelV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateVpcChannelV2Response;
import com.huaweicloud.sdk.roma.v2.model.UploadProductRequest;
import com.huaweicloud.sdk.roma.v2.model.UploadProductResponse;
import com.huaweicloud.sdk.roma.v2.model.ValidateDictionaryRequest;
import com.huaweicloud.sdk.roma.v2.model.ValidateDictionaryResponse;
import com.huaweicloud.sdk.roma.v2.model.ValidateRomaAppRequest;
import com.huaweicloud.sdk.roma.v2.model.ValidateRomaAppResponse;

public class RomaClient {

    protected HcClient hcClient;

    public RomaClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RomaClient> newBuilder() {
        ClientBuilder<RomaClient> clientBuilder = new ClientBuilder<>(RomaClient::new);
        return clientBuilder;
    }

    /**
     * 添加子设备到网关
     *
     * 添加子设备到网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSubsetsToGatewayRequest 请求对象
     * @return AddSubsetsToGatewayResponse
     */
    public AddSubsetsToGatewayResponse addSubsetsToGateway(AddSubsetsToGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.addSubsetsToGateway);
    }

    /**
     * 添加子设备到网关
     *
     * 添加子设备到网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSubsetsToGatewayRequest 请求对象
     * @return SyncInvoker<AddSubsetsToGatewayRequest, AddSubsetsToGatewayResponse>
     */
    public SyncInvoker<AddSubsetsToGatewayRequest, AddSubsetsToGatewayResponse> addSubsetsToGatewayInvoker(
        AddSubsetsToGatewayRequest request) {
        return new SyncInvoker<>(request, RomaMeta.addSubsetsToGateway, hcClient);
    }

    /**
     * 客户端配额绑定客户端应用列表
     *
     * 客户端配额绑定客户端应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAppsForAppQuotaRequest 请求对象
     * @return AssociateAppsForAppQuotaResponse
     */
    public AssociateAppsForAppQuotaResponse associateAppsForAppQuota(AssociateAppsForAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.associateAppsForAppQuota);
    }

    /**
     * 客户端配额绑定客户端应用列表
     *
     * 客户端配额绑定客户端应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAppsForAppQuotaRequest 请求对象
     * @return SyncInvoker<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse>
     */
    public SyncInvoker<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse> associateAppsForAppQuotaInvoker(
        AssociateAppsForAppQuotaRequest request) {
        return new SyncInvoker<>(request, RomaMeta.associateAppsForAppQuota, hcClient);
    }

    /**
     * 绑定域名证书
     *
     * 如果创建API时，“定义API请求”使用HTTPS请求协议，那么在独立域名中需要添加SSL证书。
     * 本章节主要介绍为特定域名绑定证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateCertificateV2Request 请求对象
     * @return AssociateCertificateV2Response
     */
    public AssociateCertificateV2Response associateCertificateV2(AssociateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.associateCertificateV2);
    }

    /**
     * 绑定域名证书
     *
     * 如果创建API时，“定义API请求”使用HTTPS请求协议，那么在独立域名中需要添加SSL证书。
     * 本章节主要介绍为特定域名绑定证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateCertificateV2Request 请求对象
     * @return SyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response>
     */
    public SyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response> associateCertificateV2Invoker(
        AssociateCertificateV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.associateCertificateV2, hcClient);
    }

    /**
     * 绑定域名
     *
     * 用户自定义的域名，需要CNAME到API分组的子域名上才能生效。
     * 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateDomainV2Request 请求对象
     * @return AssociateDomainV2Response
     */
    public AssociateDomainV2Response associateDomainV2(AssociateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.associateDomainV2);
    }

    /**
     * 绑定域名
     *
     * 用户自定义的域名，需要CNAME到API分组的子域名上才能生效。
     * 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateDomainV2Request 请求对象
     * @return SyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response>
     */
    public SyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response> associateDomainV2Invoker(
        AssociateDomainV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.associateDomainV2, hcClient);
    }

    /**
     * 绑定签名密钥
     *
     * 签名密钥创建后，需要绑定到API才能生效。
     * 
     * 
     * 将签名密钥绑定到API后，则服务集成请求后端服务时就会使用这个签名密钥进行加密签名，后端服务可以校验这个签名来验证请求来源。
     * 
     * 
     * 将指定的签名密钥绑定到一个或多个已发布的API上。同一个API发布到不同的环境可以绑定不同的签名密钥；一个API在发布到特定环境后只能绑定一个签名密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSignatureKeyV2Request 请求对象
     * @return AssociateSignatureKeyV2Response
     */
    public AssociateSignatureKeyV2Response associateSignatureKeyV2(AssociateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.associateSignatureKeyV2);
    }

    /**
     * 绑定签名密钥
     *
     * 签名密钥创建后，需要绑定到API才能生效。
     * 
     * 
     * 将签名密钥绑定到API后，则服务集成请求后端服务时就会使用这个签名密钥进行加密签名，后端服务可以校验这个签名来验证请求来源。
     * 
     * 
     * 将指定的签名密钥绑定到一个或多个已发布的API上。同一个API发布到不同的环境可以绑定不同的签名密钥；一个API在发布到特定环境后只能绑定一个签名密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSignatureKeyV2Request 请求对象
     * @return SyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response>
     */
    public SyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> associateSignatureKeyV2Invoker(
        AssociateSignatureKeyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.associateSignatureKeyV2, hcClient);
    }

    /**
     * 插件绑定API
     *
     * 绑定插件到API上。
     * - 只能选择发布状态的API
     * - 绑定以后及时生效
     * - 修改插件后及时生效
     * - 相同类型的插件只能绑定一个，原来已经绑定的同类型插件，会直接覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachApiToPluginRequest 请求对象
     * @return AttachApiToPluginResponse
     */
    public AttachApiToPluginResponse attachApiToPlugin(AttachApiToPluginRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.attachApiToPlugin);
    }

    /**
     * 插件绑定API
     *
     * 绑定插件到API上。
     * - 只能选择发布状态的API
     * - 绑定以后及时生效
     * - 修改插件后及时生效
     * - 相同类型的插件只能绑定一个，原来已经绑定的同类型插件，会直接覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachApiToPluginRequest 请求对象
     * @return SyncInvoker<AttachApiToPluginRequest, AttachApiToPluginResponse>
     */
    public SyncInvoker<AttachApiToPluginRequest, AttachApiToPluginResponse> attachApiToPluginInvoker(
        AttachApiToPluginRequest request) {
        return new SyncInvoker<>(request, RomaMeta.attachApiToPlugin, hcClient);
    }

    /**
     * API绑定插件
     *
     * 绑定插件到API上。
     * - 只能选择发布状态的API
     * - 绑定以后及时生效
     * - 修改插件后及时生效
     * - 相同类型的插件只能绑定一个，原来已经绑定的同类型插件，会直接覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachPluginToApiRequest 请求对象
     * @return AttachPluginToApiResponse
     */
    public AttachPluginToApiResponse attachPluginToApi(AttachPluginToApiRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.attachPluginToApi);
    }

    /**
     * API绑定插件
     *
     * 绑定插件到API上。
     * - 只能选择发布状态的API
     * - 绑定以后及时生效
     * - 修改插件后及时生效
     * - 相同类型的插件只能绑定一个，原来已经绑定的同类型插件，会直接覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachPluginToApiRequest 请求对象
     * @return SyncInvoker<AttachPluginToApiRequest, AttachPluginToApiResponse>
     */
    public SyncInvoker<AttachPluginToApiRequest, AttachPluginToApiResponse> attachPluginToApiInvoker(
        AttachPluginToApiRequest request) {
        return new SyncInvoker<>(request, RomaMeta.attachPluginToApi, hcClient);
    }

    /**
     * 批量添加设备到设备分组
     *
     * 批量添加设备到设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddDeviceToGroupRequest 请求对象
     * @return BatchAddDeviceToGroupResponse
     */
    public BatchAddDeviceToGroupResponse batchAddDeviceToGroup(BatchAddDeviceToGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchAddDeviceToGroup);
    }

    /**
     * 批量添加设备到设备分组
     *
     * 批量添加设备到设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddDeviceToGroupRequest 请求对象
     * @return SyncInvoker<BatchAddDeviceToGroupRequest, BatchAddDeviceToGroupResponse>
     */
    public SyncInvoker<BatchAddDeviceToGroupRequest, BatchAddDeviceToGroupResponse> batchAddDeviceToGroupInvoker(
        BatchAddDeviceToGroupRequest request) {
        return new SyncInvoker<>(request, RomaMeta.batchAddDeviceToGroup, hcClient);
    }

    /**
     * 批量删除设备
     *
     * 批量删除设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDevicesRequest 请求对象
     * @return BatchDeleteDevicesResponse
     */
    public BatchDeleteDevicesResponse batchDeleteDevices(BatchDeleteDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDeleteDevices);
    }

    /**
     * 批量删除设备
     *
     * 批量删除设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDevicesRequest 请求对象
     * @return SyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse>
     */
    public SyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> batchDeleteDevicesInvoker(
        BatchDeleteDevicesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.batchDeleteDevices, hcClient);
    }

    /**
     * 批量删除Topic
     *
     * 批量删除Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMqsInstanceTopicRequest 请求对象
     * @return BatchDeleteMqsInstanceTopicResponse
     */
    public BatchDeleteMqsInstanceTopicResponse batchDeleteMqsInstanceTopic(BatchDeleteMqsInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDeleteMqsInstanceTopic);
    }

    /**
     * 批量删除Topic
     *
     * 批量删除Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMqsInstanceTopicRequest 请求对象
     * @return SyncInvoker<BatchDeleteMqsInstanceTopicRequest, BatchDeleteMqsInstanceTopicResponse>
     */
    public SyncInvoker<BatchDeleteMqsInstanceTopicRequest, BatchDeleteMqsInstanceTopicResponse> batchDeleteMqsInstanceTopicInvoker(
        BatchDeleteMqsInstanceTopicRequest request) {
        return new SyncInvoker<>(request, RomaMeta.batchDeleteMqsInstanceTopic, hcClient);
    }

    /**
     * 批量删除规则
     *
     * 批量删除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRulesRequest 请求对象
     * @return BatchDeleteRulesResponse
     */
    public BatchDeleteRulesResponse batchDeleteRules(BatchDeleteRulesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDeleteRules);
    }

    /**
     * 批量删除规则
     *
     * 批量删除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRulesRequest 请求对象
     * @return SyncInvoker<BatchDeleteRulesRequest, BatchDeleteRulesResponse>
     */
    public SyncInvoker<BatchDeleteRulesRequest, BatchDeleteRulesResponse> batchDeleteRulesInvoker(
        BatchDeleteRulesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.batchDeleteRules, hcClient);
    }

    /**
     * 设备批量下线
     *
     * 设备批量下线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchFreezeDevicesRequest 请求对象
     * @return BatchFreezeDevicesResponse
     */
    public BatchFreezeDevicesResponse batchFreezeDevices(BatchFreezeDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchFreezeDevices);
    }

    /**
     * 设备批量下线
     *
     * 设备批量下线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchFreezeDevicesRequest 请求对象
     * @return SyncInvoker<BatchFreezeDevicesRequest, BatchFreezeDevicesResponse>
     */
    public SyncInvoker<BatchFreezeDevicesRequest, BatchFreezeDevicesResponse> batchFreezeDevicesInvoker(
        BatchFreezeDevicesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.batchFreezeDevices, hcClient);
    }

    /**
     * 批量启动\\停止任务
     *
     * 批量启动\\停止任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartOrStopTasksRequest 请求对象
     * @return BatchStartOrStopTasksResponse
     */
    public BatchStartOrStopTasksResponse batchStartOrStopTasks(BatchStartOrStopTasksRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchStartOrStopTasks);
    }

    /**
     * 批量启动\\停止任务
     *
     * 批量启动\\停止任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartOrStopTasksRequest 请求对象
     * @return SyncInvoker<BatchStartOrStopTasksRequest, BatchStartOrStopTasksResponse>
     */
    public SyncInvoker<BatchStartOrStopTasksRequest, BatchStartOrStopTasksResponse> batchStartOrStopTasksInvoker(
        BatchStartOrStopTasksRequest request) {
        return new SyncInvoker<>(request, RomaMeta.batchStartOrStopTasks, hcClient);
    }

    /**
     * 校验自定义后端API定义
     *
     * 校验自定义后端API定义。校验自定义后端API的路径或名称是否已存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckLivedataApisV2Request 请求对象
     * @return CheckLivedataApisV2Response
     */
    public CheckLivedataApisV2Response checkLivedataApisV2(CheckLivedataApisV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkLivedataApisV2);
    }

    /**
     * 校验自定义后端API定义
     *
     * 校验自定义后端API定义。校验自定义后端API的路径或名称是否已存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckLivedataApisV2Request 请求对象
     * @return SyncInvoker<CheckLivedataApisV2Request, CheckLivedataApisV2Response>
     */
    public SyncInvoker<CheckLivedataApisV2Request, CheckLivedataApisV2Response> checkLivedataApisV2Invoker(
        CheckLivedataApisV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.checkLivedataApisV2, hcClient);
    }

    /**
     * 设备数量统计
     *
     * 设备数量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountDevicesRequest 请求对象
     * @return CountDevicesResponse
     */
    public CountDevicesResponse countDevices(CountDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.countDevices);
    }

    /**
     * 设备数量统计
     *
     * 设备数量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountDevicesRequest 请求对象
     * @return SyncInvoker<CountDevicesRequest, CountDevicesResponse>
     */
    public SyncInvoker<CountDevicesRequest, CountDevicesResponse> countDevicesInvoker(CountDevicesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.countDevices, hcClient);
    }

    /**
     * 统计不同类型不同状态任务数量
     *
     * 统计不同类型不同状态任务数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountTasksRequest 请求对象
     * @return CountTasksResponse
     */
    public CountTasksResponse countTasks(CountTasksRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.countTasks);
    }

    /**
     * 统计不同类型不同状态任务数量
     *
     * 统计不同类型不同状态任务数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountTasksRequest 请求对象
     * @return SyncInvoker<CountTasksRequest, CountTasksResponse>
     */
    public SyncInvoker<CountTasksRequest, CountTasksResponse> countTasksInvoker(CountTasksRequest request) {
        return new SyncInvoker<>(request, RomaMeta.countTasks, hcClient);
    }

    /**
     * 自动生成APP Code
     *
     * 创建App Code时，可以不指定具体值，由后台自动生成随机字符串填充。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppCodeAutoV2Request 请求对象
     * @return CreateAppCodeAutoV2Response
     */
    public CreateAppCodeAutoV2Response createAppCodeAutoV2(CreateAppCodeAutoV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createAppCodeAutoV2);
    }

    /**
     * 自动生成APP Code
     *
     * 创建App Code时，可以不指定具体值，由后台自动生成随机字符串填充。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppCodeAutoV2Request 请求对象
     * @return SyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response>
     */
    public SyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> createAppCodeAutoV2Invoker(
        CreateAppCodeAutoV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createAppCodeAutoV2, hcClient);
    }

    /**
     * 创建APP Code
     *
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppCodeV2Request 请求对象
     * @return CreateAppCodeV2Response
     */
    public CreateAppCodeV2Response createAppCodeV2(CreateAppCodeV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createAppCodeV2);
    }

    /**
     * 创建APP Code
     *
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppCodeV2Request 请求对象
     * @return SyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response>
     */
    public SyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response> createAppCodeV2Invoker(
        CreateAppCodeV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createAppCodeV2, hcClient);
    }

    /**
     * 创建应用配置
     *
     * 创建应用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppConfigV2Request 请求对象
     * @return CreateAppConfigV2Response
     */
    public CreateAppConfigV2Response createAppConfigV2(CreateAppConfigV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createAppConfigV2);
    }

    /**
     * 创建应用配置
     *
     * 创建应用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppConfigV2Request 请求对象
     * @return SyncInvoker<CreateAppConfigV2Request, CreateAppConfigV2Response>
     */
    public SyncInvoker<CreateAppConfigV2Request, CreateAppConfigV2Response> createAppConfigV2Invoker(
        CreateAppConfigV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createAppConfigV2, hcClient);
    }

    /**
     * 创建客户端配额
     *
     * 创建客户端配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppQuotaRequest 请求对象
     * @return CreateAppQuotaResponse
     */
    public CreateAppQuotaResponse createAppQuota(CreateAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createAppQuota);
    }

    /**
     * 创建客户端配额
     *
     * 创建客户端配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppQuotaRequest 请求对象
     * @return SyncInvoker<CreateAppQuotaRequest, CreateAppQuotaResponse>
     */
    public SyncInvoker<CreateAppQuotaRequest, CreateAppQuotaResponse> createAppQuotaInvoker(
        CreateAppQuotaRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createAppQuota, hcClient);
    }

    /**
     * 创建命令
     *
     * 创建命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommandRequest 请求对象
     * @return CreateCommandResponse
     */
    public CreateCommandResponse createCommand(CreateCommandRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createCommand);
    }

    /**
     * 创建命令
     *
     * 创建命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommandRequest 请求对象
     * @return SyncInvoker<CreateCommandRequest, CreateCommandResponse>
     */
    public SyncInvoker<CreateCommandRequest, CreateCommandResponse> createCommandInvoker(CreateCommandRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createCommand, hcClient);
    }

    /**
     * 创建普通任务
     *
     * 创建普通任务(区别于组合任务)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommonTaskRequest 请求对象
     * @return CreateCommonTaskResponse
     */
    public CreateCommonTaskResponse createCommonTask(CreateCommonTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createCommonTask);
    }

    /**
     * 创建普通任务
     *
     * 创建普通任务(区别于组合任务)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommonTaskRequest 请求对象
     * @return SyncInvoker<CreateCommonTaskRequest, CreateCommonTaskResponse>
     */
    public SyncInvoker<CreateCommonTaskRequest, CreateCommonTaskResponse> createCommonTaskInvoker(
        CreateCommonTaskRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createCommonTask, hcClient);
    }

    /**
     * 创建自定义认证
     *
     * 创建自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomAuthorizerV2Request 请求对象
     * @return CreateCustomAuthorizerV2Response
     */
    public CreateCustomAuthorizerV2Response createCustomAuthorizerV2(CreateCustomAuthorizerV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createCustomAuthorizerV2);
    }

    /**
     * 创建自定义认证
     *
     * 创建自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomAuthorizerV2Request 请求对象
     * @return SyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response>
     */
    public SyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> createCustomAuthorizerV2Invoker(
        CreateCustomAuthorizerV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createCustomAuthorizerV2, hcClient);
    }

    /**
     * 创建数据源
     *
     * 创建数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatasourceInfoRequest 请求对象
     * @return CreateDatasourceInfoResponse
     */
    public CreateDatasourceInfoResponse createDatasourceInfo(CreateDatasourceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createDatasourceInfo);
    }

    /**
     * 创建数据源
     *
     * 创建数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatasourceInfoRequest 请求对象
     * @return SyncInvoker<CreateDatasourceInfoRequest, CreateDatasourceInfoResponse>
     */
    public SyncInvoker<CreateDatasourceInfoRequest, CreateDatasourceInfoResponse> createDatasourceInfoInvoker(
        CreateDatasourceInfoRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createDatasourceInfo, hcClient);
    }

    /**
     * 添加目标数据源
     *
     * 添加目标数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDestinationRequest 请求对象
     * @return CreateDestinationResponse
     */
    public CreateDestinationResponse createDestination(CreateDestinationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createDestination);
    }

    /**
     * 添加目标数据源
     *
     * 添加目标数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDestinationRequest 请求对象
     * @return SyncInvoker<CreateDestinationRequest, CreateDestinationResponse>
     */
    public SyncInvoker<CreateDestinationRequest, CreateDestinationResponse> createDestinationInvoker(
        CreateDestinationRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createDestination, hcClient);
    }

    /**
     * 创建设备
     *
     * 创建设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeviceRequest 请求对象
     * @return CreateDeviceResponse
     */
    public CreateDeviceResponse createDevice(CreateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createDevice);
    }

    /**
     * 创建设备
     *
     * 创建设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeviceRequest 请求对象
     * @return SyncInvoker<CreateDeviceRequest, CreateDeviceResponse>
     */
    public SyncInvoker<CreateDeviceRequest, CreateDeviceResponse> createDeviceInvoker(CreateDeviceRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createDevice, hcClient);
    }

    /**
     * 创建设备分组
     *
     * 创建设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeviceGroupRequest 请求对象
     * @return CreateDeviceGroupResponse
     */
    public CreateDeviceGroupResponse createDeviceGroup(CreateDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createDeviceGroup);
    }

    /**
     * 创建设备分组
     *
     * 创建设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeviceGroupRequest 请求对象
     * @return SyncInvoker<CreateDeviceGroupRequest, CreateDeviceGroupResponse>
     */
    public SyncInvoker<CreateDeviceGroupRequest, CreateDeviceGroupResponse> createDeviceGroupInvoker(
        CreateDeviceGroupRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createDeviceGroup, hcClient);
    }

    /**
     * 创建调度计划
     *
     * 创建调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDispatchesRequest 请求对象
     * @return CreateDispatchesResponse
     */
    public CreateDispatchesResponse createDispatches(CreateDispatchesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createDispatches);
    }

    /**
     * 创建调度计划
     *
     * 创建调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDispatchesRequest 请求对象
     * @return SyncInvoker<CreateDispatchesRequest, CreateDispatchesResponse>
     */
    public SyncInvoker<CreateDispatchesRequest, CreateDispatchesResponse> createDispatchesInvoker(
        CreateDispatchesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createDispatches, hcClient);
    }

    /**
     * 创建环境
     *
     * 在实际的生产中，API提供者可能有多个环境，如开发环境、测试环境、生产环境等，用户可以自由将API发布到某个环境，供调用者调用。
     * 
     * 
     * 对于不同的环境，API的版本、请求地址甚至于包括请求消息等均有可能不同。如：某个API，v1.0的版本为稳定版本，发布到了生产环境供生产使用，同时，该API正处于迭代中，v1.1的版本是开发人员交付测试人员进行测试的版本，发布在测试环境上，而v1.2的版本目前开发团队正处于开发过程中，可以发布到开发环境进行自测等。
     * 
     * 
     * 为此，服务集成提供多环境管理功能，使租户能够最大化的模拟实际场景，低成本的接服务集成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentV2Request 请求对象
     * @return CreateEnvironmentV2Response
     */
    public CreateEnvironmentV2Response createEnvironmentV2(CreateEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createEnvironmentV2);
    }

    /**
     * 创建环境
     *
     * 在实际的生产中，API提供者可能有多个环境，如开发环境、测试环境、生产环境等，用户可以自由将API发布到某个环境，供调用者调用。
     * 
     * 
     * 对于不同的环境，API的版本、请求地址甚至于包括请求消息等均有可能不同。如：某个API，v1.0的版本为稳定版本，发布到了生产环境供生产使用，同时，该API正处于迭代中，v1.1的版本是开发人员交付测试人员进行测试的版本，发布在测试环境上，而v1.2的版本目前开发团队正处于开发过程中，可以发布到开发环境进行自测等。
     * 
     * 
     * 为此，服务集成提供多环境管理功能，使租户能够最大化的模拟实际场景，低成本的接服务集成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentV2Request 请求对象
     * @return SyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response>
     */
    public SyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response> createEnvironmentV2Invoker(
        CreateEnvironmentV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createEnvironmentV2, hcClient);
    }

    /**
     * 新建变量
     *
     * 将API发布到不同的环境后，对于不同的环境，可能会有不同的环境变量，比如，API的服务部署地址，请求的版本号等。
     * 
     * 
     * 用户可以定义不同的环境变量，用户在定义API时，在API的定义中使用这些变量，当调用API时，服务集成会将这些变量替换成真实的变量值，以达到不同环境的区分效果。
     * 
     * 
     * 环境变量定义在API分组上，该分组下的所有API都可以使用这些变量。
     * 
     * &gt; 1.环境变量的变量名称必须保持唯一，即一个分组在同一个环境上不能有两个同名的变量
     *   2.环境变量区分大小写，即变量ABC与变量abc是两个不同的变量
     *   3.设置了环境变量后，使用到该变量的API的调试功能将不可使用。
     *   4.定义了环境变量后，使用到环境变量的地方应该以对称的#标识环境变量，当API发布到相应的环境后，会对环境变量的值进行替换，如：定义的API的URL为：https://#address#:8080，环境变量address在RELEASE环境上的值为：192.168.1.5，则API发布到RELEASE环境后的真实的URL为：https://192.168.1.5:8080。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentVariableV2Request 请求对象
     * @return CreateEnvironmentVariableV2Response
     */
    public CreateEnvironmentVariableV2Response createEnvironmentVariableV2(CreateEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createEnvironmentVariableV2);
    }

    /**
     * 新建变量
     *
     * 将API发布到不同的环境后，对于不同的环境，可能会有不同的环境变量，比如，API的服务部署地址，请求的版本号等。
     * 
     * 
     * 用户可以定义不同的环境变量，用户在定义API时，在API的定义中使用这些变量，当调用API时，服务集成会将这些变量替换成真实的变量值，以达到不同环境的区分效果。
     * 
     * 
     * 环境变量定义在API分组上，该分组下的所有API都可以使用这些变量。
     * 
     * &gt; 1.环境变量的变量名称必须保持唯一，即一个分组在同一个环境上不能有两个同名的变量
     *   2.环境变量区分大小写，即变量ABC与变量abc是两个不同的变量
     *   3.设置了环境变量后，使用到该变量的API的调试功能将不可使用。
     *   4.定义了环境变量后，使用到环境变量的地方应该以对称的#标识环境变量，当API发布到相应的环境后，会对环境变量的值进行替换，如：定义的API的URL为：https://#address#:8080，环境变量address在RELEASE环境上的值为：192.168.1.5，则API发布到RELEASE环境后的真实的URL为：https://192.168.1.5:8080。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentVariableV2Request 请求对象
     * @return SyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response>
     */
    public SyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> createEnvironmentVariableV2Invoker(
        CreateEnvironmentVariableV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createEnvironmentVariableV2, hcClient);
    }

    /**
     * 实例配置特性
     *
     * 为实例配置需要的特性。
     * 
     * 支持配置的特性列表及特性配置请参考“附录 &gt; 实例支持的APIC特性”
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFeatureV2Request 请求对象
     * @return CreateFeatureV2Response
     */
    public CreateFeatureV2Response createFeatureV2(CreateFeatureV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createFeatureV2);
    }

    /**
     * 实例配置特性
     *
     * 为实例配置需要的特性。
     * 
     * 支持配置的特性列表及特性配置请参考“附录 &gt; 实例支持的APIC特性”
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFeatureV2Request 请求对象
     * @return SyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response>
     */
    public SyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response> createFeatureV2Invoker(
        CreateFeatureV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createFeatureV2, hcClient);
    }

    /**
     * 创建后端API脚本
     *
     * 在某个实例中创建后端API脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLiveDataApiScriptV2Request 请求对象
     * @return CreateLiveDataApiScriptV2Response
     */
    public CreateLiveDataApiScriptV2Response createLiveDataApiScriptV2(CreateLiveDataApiScriptV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createLiveDataApiScriptV2);
    }

    /**
     * 创建后端API脚本
     *
     * 在某个实例中创建后端API脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLiveDataApiScriptV2Request 请求对象
     * @return SyncInvoker<CreateLiveDataApiScriptV2Request, CreateLiveDataApiScriptV2Response>
     */
    public SyncInvoker<CreateLiveDataApiScriptV2Request, CreateLiveDataApiScriptV2Response> createLiveDataApiScriptV2Invoker(
        CreateLiveDataApiScriptV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createLiveDataApiScriptV2, hcClient);
    }

    /**
     * 创建后端API
     *
     * 在某个实例中创建后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLiveDataApiV2Request 请求对象
     * @return CreateLiveDataApiV2Response
     */
    public CreateLiveDataApiV2Response createLiveDataApiV2(CreateLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createLiveDataApiV2);
    }

    /**
     * 创建后端API
     *
     * 在某个实例中创建后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLiveDataApiV2Request 请求对象
     * @return SyncInvoker<CreateLiveDataApiV2Request, CreateLiveDataApiV2Response>
     */
    public SyncInvoker<CreateLiveDataApiV2Request, CreateLiveDataApiV2Response> createLiveDataApiV2Invoker(
        CreateLiveDataApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createLiveDataApiV2, hcClient);
    }

    /**
     * 创建Topic
     *
     * 创建Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMqsInstanceTopicRequest 请求对象
     * @return CreateMqsInstanceTopicResponse
     */
    public CreateMqsInstanceTopicResponse createMqsInstanceTopic(CreateMqsInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createMqsInstanceTopic);
    }

    /**
     * 创建Topic
     *
     * 创建Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMqsInstanceTopicRequest 请求对象
     * @return SyncInvoker<CreateMqsInstanceTopicRequest, CreateMqsInstanceTopicResponse>
     */
    public SyncInvoker<CreateMqsInstanceTopicRequest, CreateMqsInstanceTopicResponse> createMqsInstanceTopicInvoker(
        CreateMqsInstanceTopicRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createMqsInstanceTopic, hcClient);
    }

    /**
     * 创建组合任务映射
     *
     * 创建组合任务映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMultiTaskMappingsRequest 请求对象
     * @return CreateMultiTaskMappingsResponse
     */
    public CreateMultiTaskMappingsResponse createMultiTaskMappings(CreateMultiTaskMappingsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createMultiTaskMappings);
    }

    /**
     * 创建组合任务映射
     *
     * 创建组合任务映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMultiTaskMappingsRequest 请求对象
     * @return SyncInvoker<CreateMultiTaskMappingsRequest, CreateMultiTaskMappingsResponse>
     */
    public SyncInvoker<CreateMultiTaskMappingsRequest, CreateMultiTaskMappingsResponse> createMultiTaskMappingsInvoker(
        CreateMultiTaskMappingsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createMultiTaskMappings, hcClient);
    }

    /**
     * 创建组合任务
     *
     * 创建组合任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMultiTasksRequest 请求对象
     * @return CreateMultiTasksResponse
     */
    public CreateMultiTasksResponse createMultiTasks(CreateMultiTasksRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createMultiTasks);
    }

    /**
     * 创建组合任务
     *
     * 创建组合任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMultiTasksRequest 请求对象
     * @return SyncInvoker<CreateMultiTasksRequest, CreateMultiTasksResponse>
     */
    public SyncInvoker<CreateMultiTasksRequest, CreateMultiTasksResponse> createMultiTasksInvoker(
        CreateMultiTasksRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createMultiTasks, hcClient);
    }

    /**
     * 创建订阅管理
     *
     * 该接口用于创建指定实例下对应的应用下的设备操作，订阅到指定的topic
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotificationRequest 请求对象
     * @return CreateNotificationResponse
     */
    public CreateNotificationResponse createNotification(CreateNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createNotification);
    }

    /**
     * 创建订阅管理
     *
     * 该接口用于创建指定实例下对应的应用下的设备操作，订阅到指定的topic
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotificationRequest 请求对象
     * @return SyncInvoker<CreateNotificationRequest, CreateNotificationResponse>
     */
    public SyncInvoker<CreateNotificationRequest, CreateNotificationResponse> createNotificationInvoker(
        CreateNotificationRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createNotification, hcClient);
    }

    /**
     * 创建插件
     *
     * 创建插件信息。
     * - 插件不允许重名
     * - 插件创建后未绑定API前是无意义的，绑定API后，对绑定的API即时生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePluginRequest 请求对象
     * @return CreatePluginResponse
     */
    public CreatePluginResponse createPlugin(CreatePluginRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createPlugin);
    }

    /**
     * 创建插件
     *
     * 创建插件信息。
     * - 插件不允许重名
     * - 插件创建后未绑定API前是无意义的，绑定API后，对绑定的API即时生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePluginRequest 请求对象
     * @return SyncInvoker<CreatePluginRequest, CreatePluginResponse>
     */
    public SyncInvoker<CreatePluginRequest, CreatePluginResponse> createPluginInvoker(CreatePluginRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createPlugin, hcClient);
    }

    /**
     * 创建产品
     *
     * 创建产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductRequest 请求对象
     * @return CreateProductResponse
     */
    public CreateProductResponse createProduct(CreateProductRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createProduct);
    }

    /**
     * 创建产品
     *
     * 创建产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductRequest 请求对象
     * @return SyncInvoker<CreateProductRequest, CreateProductResponse>
     */
    public SyncInvoker<CreateProductRequest, CreateProductResponse> createProductInvoker(CreateProductRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createProduct, hcClient);
    }

    /**
     * 创建产品模板
     *
     * 创建产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductTemplateRequest 请求对象
     * @return CreateProductTemplateResponse
     */
    public CreateProductTemplateResponse createProductTemplate(CreateProductTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createProductTemplate);
    }

    /**
     * 创建产品模板
     *
     * 创建产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductTemplateRequest 请求对象
     * @return SyncInvoker<CreateProductTemplateRequest, CreateProductTemplateResponse>
     */
    public SyncInvoker<CreateProductTemplateRequest, CreateProductTemplateResponse> createProductTemplateInvoker(
        CreateProductTemplateRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createProductTemplate, hcClient);
    }

    /**
     * 添加产品主题
     *
     * 添加产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductTopicRequest 请求对象
     * @return CreateProductTopicResponse
     */
    public CreateProductTopicResponse createProductTopic(CreateProductTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createProductTopic);
    }

    /**
     * 添加产品主题
     *
     * 添加产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductTopicRequest 请求对象
     * @return SyncInvoker<CreateProductTopicRequest, CreateProductTopicResponse>
     */
    public SyncInvoker<CreateProductTopicRequest, CreateProductTopicResponse> createProductTopicInvoker(
        CreateProductTopicRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createProductTopic, hcClient);
    }

    /**
     * 创建属性
     *
     * 创建属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePropertyRequest 请求对象
     * @return CreatePropertyResponse
     */
    public CreatePropertyResponse createProperty(CreatePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createProperty);
    }

    /**
     * 创建属性
     *
     * 创建属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePropertyRequest 请求对象
     * @return SyncInvoker<CreatePropertyRequest, CreatePropertyResponse>
     */
    public SyncInvoker<CreatePropertyRequest, CreatePropertyResponse> createPropertyInvoker(
        CreatePropertyRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createProperty, hcClient);
    }

    /**
     * 创建请求属性
     *
     * 创建请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRequestPropertyRequest 请求对象
     * @return CreateRequestPropertyResponse
     */
    public CreateRequestPropertyResponse createRequestProperty(CreateRequestPropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createRequestProperty);
    }

    /**
     * 创建请求属性
     *
     * 创建请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRequestPropertyRequest 请求对象
     * @return SyncInvoker<CreateRequestPropertyRequest, CreateRequestPropertyResponse>
     */
    public SyncInvoker<CreateRequestPropertyRequest, CreateRequestPropertyResponse> createRequestPropertyInvoker(
        CreateRequestPropertyRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createRequestProperty, hcClient);
    }

    /**
     * 创建流控策略
     *
     * 当API上线后，系统会默认给每个API提供一个流控策略，API提供者可以根据自身API的服务能力及负载情况变更这个流控策略。
     * 流控策略即限制API在一定长度的时间内，能够允许被访问的最大次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRequestThrottlingPolicyV2Request 请求对象
     * @return CreateRequestThrottlingPolicyV2Response
     */
    public CreateRequestThrottlingPolicyV2Response createRequestThrottlingPolicyV2(
        CreateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createRequestThrottlingPolicyV2);
    }

    /**
     * 创建流控策略
     *
     * 当API上线后，系统会默认给每个API提供一个流控策略，API提供者可以根据自身API的服务能力及负载情况变更这个流控策略。
     * 流控策略即限制API在一定长度的时间内，能够允许被访问的最大次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2Invoker(
        CreateRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 创建响应属性
     *
     * 创建响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResponsePropertyRequest 请求对象
     * @return CreateResponsePropertyResponse
     */
    public CreateResponsePropertyResponse createResponseProperty(CreateResponsePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createResponseProperty);
    }

    /**
     * 创建响应属性
     *
     * 创建响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResponsePropertyRequest 请求对象
     * @return SyncInvoker<CreateResponsePropertyRequest, CreateResponsePropertyResponse>
     */
    public SyncInvoker<CreateResponsePropertyRequest, CreateResponsePropertyResponse> createResponsePropertyInvoker(
        CreateResponsePropertyRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createResponseProperty, hcClient);
    }

    /**
     * 创建规则
     *
     * 创建规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRuleRequest 请求对象
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRule(CreateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createRule);
    }

    /**
     * 创建规则
     *
     * 创建规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRuleRequest 请求对象
     * @return SyncInvoker<CreateRuleRequest, CreateRuleResponse>
     */
    public SyncInvoker<CreateRuleRequest, CreateRuleResponse> createRuleInvoker(CreateRuleRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createRule, hcClient);
    }

    /**
     * 创建服务
     *
     * 创建服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceRequest 请求对象
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(CreateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createService);
    }

    /**
     * 创建服务
     *
     * 创建服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceRequest 请求对象
     * @return SyncInvoker<CreateServiceRequest, CreateServiceResponse>
     */
    public SyncInvoker<CreateServiceRequest, CreateServiceResponse> createServiceInvoker(CreateServiceRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createService, hcClient);
    }

    /**
     * 创建签名密钥
     *
     * 为了保护API的安全性，建议租户为API的访问提供一套保护机制，即租户开放的API，需要对请求来源进行认证，不符合认证的请求直接拒绝访问。
     * 
     * 其中，签名密钥就是API安全保护机制的一种。
     * 
     * 租户创建一个签名密钥，并将签名密钥与API进行绑定，则服务集成在请求这个API时，就会使用绑定的签名密钥对请求参数进行数据加密，生成签名。当租户的后端服务收到请求时，可以校验这个签名，如果签名校验不通过，则该请求不是服务集成发出的请求，租户可以拒绝这个请求，从而保证API的安全性，避免API被未知来源的请求攻击。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSignatureKeyV2Request 请求对象
     * @return CreateSignatureKeyV2Response
     */
    public CreateSignatureKeyV2Response createSignatureKeyV2(CreateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createSignatureKeyV2);
    }

    /**
     * 创建签名密钥
     *
     * 为了保护API的安全性，建议租户为API的访问提供一套保护机制，即租户开放的API，需要对请求来源进行认证，不符合认证的请求直接拒绝访问。
     * 
     * 其中，签名密钥就是API安全保护机制的一种。
     * 
     * 租户创建一个签名密钥，并将签名密钥与API进行绑定，则服务集成在请求这个API时，就会使用绑定的签名密钥对请求参数进行数据加密，生成签名。当租户的后端服务收到请求时，可以校验这个签名，如果签名校验不通过，则该请求不是服务集成发出的请求，租户可以拒绝这个请求，从而保证API的安全性，避免API被未知来源的请求攻击。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSignatureKeyV2Request 请求对象
     * @return SyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response>
     */
    public SyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> createSignatureKeyV2Invoker(
        CreateSignatureKeyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createSignatureKeyV2, hcClient);
    }

    /**
     * 添加源数据源
     *
     * 添加源数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSourceRequest 请求对象
     * @return CreateSourceResponse
     */
    public CreateSourceResponse createSource(CreateSourceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createSource);
    }

    /**
     * 添加源数据源
     *
     * 添加源数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSourceRequest 请求对象
     * @return SyncInvoker<CreateSourceRequest, CreateSourceResponse>
     */
    public SyncInvoker<CreateSourceRequest, CreateSourceResponse> createSourceInvoker(CreateSourceRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createSource, hcClient);
    }

    /**
     * 创建特殊设置
     *
     * 流控策略可以限制一段时间内可以访问API的最大次数，也可以限制一段时间内单个租户和单个APP可以访问API的最大次数。
     * 
     * 如果想要对某个特定的APP进行特殊设置，例如设置所有APP每分钟的访问次数为500次，但想设置APP1每分钟的访问次数为800次，可以通过在流控策略中设置特殊APP来实现该功能。
     * 
     * 为流控策略添加一个特殊设置的对象，[可以是APP，也可以是租户。](tag:hws,hws_hk,hcs,hcs_sm,fcs,g42)[对象为APP。](tag:Site)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSpecialThrottlingConfigurationV2Request 请求对象
     * @return CreateSpecialThrottlingConfigurationV2Response
     */
    public CreateSpecialThrottlingConfigurationV2Response createSpecialThrottlingConfigurationV2(
        CreateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createSpecialThrottlingConfigurationV2);
    }

    /**
     * 创建特殊设置
     *
     * 流控策略可以限制一段时间内可以访问API的最大次数，也可以限制一段时间内单个租户和单个APP可以访问API的最大次数。
     * 
     * 如果想要对某个特定的APP进行特殊设置，例如设置所有APP每分钟的访问次数为500次，但想设置APP1每分钟的访问次数为800次，可以通过在流控策略中设置特殊APP来实现该功能。
     * 
     * 为流控策略添加一个特殊设置的对象，[可以是APP，也可以是租户。](tag:hws,hws_hk,hcs,hcs_sm,fcs,g42)[对象为APP。](tag:Site)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSpecialThrottlingConfigurationV2Request 请求对象
     * @return SyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response>
     */
    public SyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2Invoker(
        CreateSpecialThrottlingConfigurationV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createSpecialThrottlingConfigurationV2, hcClient);
    }

    /**
     * 测试后端API
     *
     * 测试后端API是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugLiveDataApiV2Request 请求对象
     * @return DebugLiveDataApiV2Response
     */
    public DebugLiveDataApiV2Response debugLiveDataApiV2(DebugLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.debugLiveDataApiV2);
    }

    /**
     * 测试后端API
     *
     * 测试后端API是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugLiveDataApiV2Request 请求对象
     * @return SyncInvoker<DebugLiveDataApiV2Request, DebugLiveDataApiV2Response>
     */
    public SyncInvoker<DebugLiveDataApiV2Request, DebugLiveDataApiV2Response> debugLiveDataApiV2Invoker(
        DebugLiveDataApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.debugLiveDataApiV2, hcClient);
    }

    /**
     * 规则调试
     *
     * 规则调试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugRuleRequest 请求对象
     * @return DebugRuleResponse
     */
    public DebugRuleResponse debugRule(DebugRuleRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.debugRule);
    }

    /**
     * 规则调试
     *
     * 规则调试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugRuleRequest 请求对象
     * @return SyncInvoker<DebugRuleRequest, DebugRuleResponse>
     */
    public SyncInvoker<DebugRuleRequest, DebugRuleResponse> debugRuleInvoker(DebugRuleRequest request) {
        return new SyncInvoker<>(request, RomaMeta.debugRule, hcClient);
    }

    /**
     * 删除APP的访问控制
     *
     * 删除客户端配置的访问控制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppAclRequest 请求对象
     * @return DeleteAppAclResponse
     */
    public DeleteAppAclResponse deleteAppAcl(DeleteAppAclRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteAppAcl);
    }

    /**
     * 删除APP的访问控制
     *
     * 删除客户端配置的访问控制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppAclRequest 请求对象
     * @return SyncInvoker<DeleteAppAclRequest, DeleteAppAclResponse>
     */
    public SyncInvoker<DeleteAppAclRequest, DeleteAppAclResponse> deleteAppAclInvoker(DeleteAppAclRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteAppAcl, hcClient);
    }

    /**
     * 删除APP Code
     *
     * 删除App Code，App Code删除后，将无法再通过简易认证访问对应的API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppCodeV2Request 请求对象
     * @return DeleteAppCodeV2Response
     */
    public DeleteAppCodeV2Response deleteAppCodeV2(DeleteAppCodeV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteAppCodeV2);
    }

    /**
     * 删除APP Code
     *
     * 删除App Code，App Code删除后，将无法再通过简易认证访问对应的API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppCodeV2Request 请求对象
     * @return SyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response>
     */
    public SyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response> deleteAppCodeV2Invoker(
        DeleteAppCodeV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteAppCodeV2, hcClient);
    }

    /**
     * 删除应用配置
     *
     * 删除应用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppConfigV2Request 请求对象
     * @return DeleteAppConfigV2Response
     */
    public DeleteAppConfigV2Response deleteAppConfigV2(DeleteAppConfigV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteAppConfigV2);
    }

    /**
     * 删除应用配置
     *
     * 删除应用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppConfigV2Request 请求对象
     * @return SyncInvoker<DeleteAppConfigV2Request, DeleteAppConfigV2Response>
     */
    public SyncInvoker<DeleteAppConfigV2Request, DeleteAppConfigV2Response> deleteAppConfigV2Invoker(
        DeleteAppConfigV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteAppConfigV2, hcClient);
    }

    /**
     * 删除客户端配额
     *
     * 删除客户端配额。删除客户端配额时，同时删除客户端配额和客户端应用的关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppQuotaRequest 请求对象
     * @return DeleteAppQuotaResponse
     */
    public DeleteAppQuotaResponse deleteAppQuota(DeleteAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteAppQuota);
    }

    /**
     * 删除客户端配额
     *
     * 删除客户端配额。删除客户端配额时，同时删除客户端配额和客户端应用的关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppQuotaRequest 请求对象
     * @return SyncInvoker<DeleteAppQuotaRequest, DeleteAppQuotaResponse>
     */
    public SyncInvoker<DeleteAppQuotaRequest, DeleteAppQuotaResponse> deleteAppQuotaInvoker(
        DeleteAppQuotaRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteAppQuota, hcClient);
    }

    /**
     * 删除命令
     *
     * 删除命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCommandRequest 请求对象
     * @return DeleteCommandResponse
     */
    public DeleteCommandResponse deleteCommand(DeleteCommandRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteCommand);
    }

    /**
     * 删除命令
     *
     * 删除命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCommandRequest 请求对象
     * @return SyncInvoker<DeleteCommandRequest, DeleteCommandResponse>
     */
    public SyncInvoker<DeleteCommandRequest, DeleteCommandResponse> deleteCommandInvoker(DeleteCommandRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteCommand, hcClient);
    }

    /**
     * 删除自定义认证
     *
     * 删除自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomAuthorizerV2Request 请求对象
     * @return DeleteCustomAuthorizerV2Response
     */
    public DeleteCustomAuthorizerV2Response deleteCustomAuthorizerV2(DeleteCustomAuthorizerV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteCustomAuthorizerV2);
    }

    /**
     * 删除自定义认证
     *
     * 删除自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomAuthorizerV2Request 请求对象
     * @return SyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response>
     */
    public SyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> deleteCustomAuthorizerV2Invoker(
        DeleteCustomAuthorizerV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteCustomAuthorizerV2, hcClient);
    }

    /**
     * 通过数据源Id删除指定数据源信息
     *
     * 通过数据源Id删除指定数据源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatasourceInfoByIdRequest 请求对象
     * @return DeleteDatasourceInfoByIdResponse
     */
    public DeleteDatasourceInfoByIdResponse deleteDatasourceInfoById(DeleteDatasourceInfoByIdRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteDatasourceInfoById);
    }

    /**
     * 通过数据源Id删除指定数据源信息
     *
     * 通过数据源Id删除指定数据源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatasourceInfoByIdRequest 请求对象
     * @return SyncInvoker<DeleteDatasourceInfoByIdRequest, DeleteDatasourceInfoByIdResponse>
     */
    public SyncInvoker<DeleteDatasourceInfoByIdRequest, DeleteDatasourceInfoByIdResponse> deleteDatasourceInfoByIdInvoker(
        DeleteDatasourceInfoByIdRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteDatasourceInfoById, hcClient);
    }

    /**
     * 删除目标数据源
     *
     * 删除目标数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDestinationRequest 请求对象
     * @return DeleteDestinationResponse
     */
    public DeleteDestinationResponse deleteDestination(DeleteDestinationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteDestination);
    }

    /**
     * 删除目标数据源
     *
     * 删除目标数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDestinationRequest 请求对象
     * @return SyncInvoker<DeleteDestinationRequest, DeleteDestinationResponse>
     */
    public SyncInvoker<DeleteDestinationRequest, DeleteDestinationResponse> deleteDestinationInvoker(
        DeleteDestinationRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteDestination, hcClient);
    }

    /**
     * 删除设备
     *
     * 删除指定设备ID的设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceRequest 请求对象
     * @return DeleteDeviceResponse
     */
    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteDevice);
    }

    /**
     * 删除设备
     *
     * 删除指定设备ID的设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceRequest 请求对象
     * @return SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>
     */
    public SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> deleteDeviceInvoker(DeleteDeviceRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteDevice, hcClient);
    }

    /**
     * 删除设备分组内的设备
     *
     * 删除设备分组内的设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceFromGroupRequest 请求对象
     * @return DeleteDeviceFromGroupResponse
     */
    public DeleteDeviceFromGroupResponse deleteDeviceFromGroup(DeleteDeviceFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteDeviceFromGroup);
    }

    /**
     * 删除设备分组内的设备
     *
     * 删除设备分组内的设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceFromGroupRequest 请求对象
     * @return SyncInvoker<DeleteDeviceFromGroupRequest, DeleteDeviceFromGroupResponse>
     */
    public SyncInvoker<DeleteDeviceFromGroupRequest, DeleteDeviceFromGroupResponse> deleteDeviceFromGroupInvoker(
        DeleteDeviceFromGroupRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteDeviceFromGroup, hcClient);
    }

    /**
     * 删除设备分组
     *
     * 删除分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceGroupRequest 请求对象
     * @return DeleteDeviceGroupResponse
     */
    public DeleteDeviceGroupResponse deleteDeviceGroup(DeleteDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteDeviceGroup);
    }

    /**
     * 删除设备分组
     *
     * 删除分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceGroupRequest 请求对象
     * @return SyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse>
     */
    public SyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> deleteDeviceGroupInvoker(
        DeleteDeviceGroupRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteDeviceGroup, hcClient);
    }

    /**
     * 删除环境
     *
     * 删除指定的环境。
     * 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。环境上存在已发布的API时，该环境不能被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentV2Request 请求对象
     * @return DeleteEnvironmentV2Response
     */
    public DeleteEnvironmentV2Response deleteEnvironmentV2(DeleteEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteEnvironmentV2);
    }

    /**
     * 删除环境
     *
     * 删除指定的环境。
     * 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。环境上存在已发布的API时，该环境不能被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentV2Request 请求对象
     * @return SyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response>
     */
    public SyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> deleteEnvironmentV2Invoker(
        DeleteEnvironmentV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteEnvironmentV2, hcClient);
    }

    /**
     * 删除变量
     *
     * 删除指定的环境变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentVariableV2Request 请求对象
     * @return DeleteEnvironmentVariableV2Response
     */
    public DeleteEnvironmentVariableV2Response deleteEnvironmentVariableV2(DeleteEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteEnvironmentVariableV2);
    }

    /**
     * 删除变量
     *
     * 删除指定的环境变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentVariableV2Request 请求对象
     * @return SyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response>
     */
    public SyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2Invoker(
        DeleteEnvironmentVariableV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteEnvironmentVariableV2, hcClient);
    }

    /**
     * 删除后端API
     *
     * 在某个实例中删除后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLiveDataApiV2Request 请求对象
     * @return DeleteLiveDataApiV2Response
     */
    public DeleteLiveDataApiV2Response deleteLiveDataApiV2(DeleteLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteLiveDataApiV2);
    }

    /**
     * 删除后端API
     *
     * 在某个实例中删除后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLiveDataApiV2Request 请求对象
     * @return SyncInvoker<DeleteLiveDataApiV2Request, DeleteLiveDataApiV2Response>
     */
    public SyncInvoker<DeleteLiveDataApiV2Request, DeleteLiveDataApiV2Response> deleteLiveDataApiV2Invoker(
        DeleteLiveDataApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteLiveDataApiV2, hcClient);
    }

    /**
     * 删除Topic
     *
     * 删除Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMqsInstanceTopicRequest 请求对象
     * @return DeleteMqsInstanceTopicResponse
     */
    public DeleteMqsInstanceTopicResponse deleteMqsInstanceTopic(DeleteMqsInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteMqsInstanceTopic);
    }

    /**
     * 删除Topic
     *
     * 删除Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMqsInstanceTopicRequest 请求对象
     * @return SyncInvoker<DeleteMqsInstanceTopicRequest, DeleteMqsInstanceTopicResponse>
     */
    public SyncInvoker<DeleteMqsInstanceTopicRequest, DeleteMqsInstanceTopicResponse> deleteMqsInstanceTopicInvoker(
        DeleteMqsInstanceTopicRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteMqsInstanceTopic, hcClient);
    }

    /**
     * 删除指定任务映射
     *
     * 通过映射ID删除指定任务映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMultiTaskMappingRequest 请求对象
     * @return DeleteMultiTaskMappingResponse
     */
    public DeleteMultiTaskMappingResponse deleteMultiTaskMapping(DeleteMultiTaskMappingRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteMultiTaskMapping);
    }

    /**
     * 删除指定任务映射
     *
     * 通过映射ID删除指定任务映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMultiTaskMappingRequest 请求对象
     * @return SyncInvoker<DeleteMultiTaskMappingRequest, DeleteMultiTaskMappingResponse>
     */
    public SyncInvoker<DeleteMultiTaskMappingRequest, DeleteMultiTaskMappingResponse> deleteMultiTaskMappingInvoker(
        DeleteMultiTaskMappingRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteMultiTaskMapping, hcClient);
    }

    /**
     * 删除订阅管理
     *
     * 该接口用于删除指定订阅管理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotificationRequest 请求对象
     * @return DeleteNotificationResponse
     */
    public DeleteNotificationResponse deleteNotification(DeleteNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteNotification);
    }

    /**
     * 删除订阅管理
     *
     * 该接口用于删除指定订阅管理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotificationRequest 请求对象
     * @return SyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse>
     */
    public SyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse> deleteNotificationInvoker(
        DeleteNotificationRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteNotification, hcClient);
    }

    /**
     * 删除插件
     *
     * 删除插件。
     * - 必须先解除API和插件的绑定关系，否则删除报错
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePluginRequest 请求对象
     * @return DeletePluginResponse
     */
    public DeletePluginResponse deletePlugin(DeletePluginRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deletePlugin);
    }

    /**
     * 删除插件
     *
     * 删除插件。
     * - 必须先解除API和插件的绑定关系，否则删除报错
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePluginRequest 请求对象
     * @return SyncInvoker<DeletePluginRequest, DeletePluginResponse>
     */
    public SyncInvoker<DeletePluginRequest, DeletePluginResponse> deletePluginInvoker(DeletePluginRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deletePlugin, hcClient);
    }

    /**
     * 删除产品
     *
     * 删除产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProductRequest 请求对象
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteProduct);
    }

    /**
     * 删除产品
     *
     * 删除产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProductRequest 请求对象
     * @return SyncInvoker<DeleteProductRequest, DeleteProductResponse>
     */
    public SyncInvoker<DeleteProductRequest, DeleteProductResponse> deleteProductInvoker(DeleteProductRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteProduct, hcClient);
    }

    /**
     * 删除产品模板
     *
     * 删除产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProductTemplateRequest 请求对象
     * @return DeleteProductTemplateResponse
     */
    public DeleteProductTemplateResponse deleteProductTemplate(DeleteProductTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteProductTemplate);
    }

    /**
     * 删除产品模板
     *
     * 删除产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProductTemplateRequest 请求对象
     * @return SyncInvoker<DeleteProductTemplateRequest, DeleteProductTemplateResponse>
     */
    public SyncInvoker<DeleteProductTemplateRequest, DeleteProductTemplateResponse> deleteProductTemplateInvoker(
        DeleteProductTemplateRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteProductTemplate, hcClient);
    }

    /**
     * 删除产品主题
     *
     * 删除产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProductTopicRequest 请求对象
     * @return DeleteProductTopicResponse
     */
    public DeleteProductTopicResponse deleteProductTopic(DeleteProductTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteProductTopic);
    }

    /**
     * 删除产品主题
     *
     * 删除产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProductTopicRequest 请求对象
     * @return SyncInvoker<DeleteProductTopicRequest, DeleteProductTopicResponse>
     */
    public SyncInvoker<DeleteProductTopicRequest, DeleteProductTopicResponse> deleteProductTopicInvoker(
        DeleteProductTopicRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteProductTopic, hcClient);
    }

    /**
     * 删除服务属性
     *
     * 删除服务属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePropertyRequest 请求对象
     * @return DeletePropertyResponse
     */
    public DeletePropertyResponse deleteProperty(DeletePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteProperty);
    }

    /**
     * 删除服务属性
     *
     * 删除服务属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePropertyRequest 请求对象
     * @return SyncInvoker<DeletePropertyRequest, DeletePropertyResponse>
     */
    public SyncInvoker<DeletePropertyRequest, DeletePropertyResponse> deletePropertyInvoker(
        DeletePropertyRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteProperty, hcClient);
    }

    /**
     * 删除请求属性
     *
     * 删除请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRequestPropertyRequest 请求对象
     * @return DeleteRequestPropertyResponse
     */
    public DeleteRequestPropertyResponse deleteRequestProperty(DeleteRequestPropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteRequestProperty);
    }

    /**
     * 删除请求属性
     *
     * 删除请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRequestPropertyRequest 请求对象
     * @return SyncInvoker<DeleteRequestPropertyRequest, DeleteRequestPropertyResponse>
     */
    public SyncInvoker<DeleteRequestPropertyRequest, DeleteRequestPropertyResponse> deleteRequestPropertyInvoker(
        DeleteRequestPropertyRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteRequestProperty, hcClient);
    }

    /**
     * 删除流控策略
     *
     * 删除指定的流控策略。当该流控策略绑定了API时，需要先解除流控策略与API的所有绑定关系后再删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return DeleteRequestThrottlingPolicyV2Response
     */
    public DeleteRequestThrottlingPolicyV2Response deleteRequestThrottlingPolicyV2(
        DeleteRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteRequestThrottlingPolicyV2);
    }

    /**
     * 删除流控策略
     *
     * 删除指定的流控策略。当该流控策略绑定了API时，需要先解除流控策略与API的所有绑定关系后再删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2Invoker(
        DeleteRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 删除响应属性
     *
     * 删除响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResponsePropertyRequest 请求对象
     * @return DeleteResponsePropertyResponse
     */
    public DeleteResponsePropertyResponse deleteResponseProperty(DeleteResponsePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteResponseProperty);
    }

    /**
     * 删除响应属性
     *
     * 删除响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResponsePropertyRequest 请求对象
     * @return SyncInvoker<DeleteResponsePropertyRequest, DeleteResponsePropertyResponse>
     */
    public SyncInvoker<DeleteResponsePropertyRequest, DeleteResponsePropertyResponse> deleteResponsePropertyInvoker(
        DeleteResponsePropertyRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteResponseProperty, hcClient);
    }

    /**
     * 删除规则
     *
     * 删除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleRequest 请求对象
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteRule);
    }

    /**
     * 删除规则
     *
     * 删除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleRequest 请求对象
     * @return SyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public SyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleInvoker(DeleteRuleRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteRule, hcClient);
    }

    /**
     * 删除服务
     *
     * 删除服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceRequest 请求对象
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteService(DeleteServiceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteService);
    }

    /**
     * 删除服务
     *
     * 删除服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceRequest 请求对象
     * @return SyncInvoker<DeleteServiceRequest, DeleteServiceResponse>
     */
    public SyncInvoker<DeleteServiceRequest, DeleteServiceResponse> deleteServiceInvoker(DeleteServiceRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteService, hcClient);
    }

    /**
     * 删除签名密钥
     *
     * 删除指定的签名密钥。签名密钥绑定了API时无法删除，需要先解除与API的绑定关系后删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSignatureKeyV2Request 请求对象
     * @return DeleteSignatureKeyV2Response
     */
    public DeleteSignatureKeyV2Response deleteSignatureKeyV2(DeleteSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteSignatureKeyV2);
    }

    /**
     * 删除签名密钥
     *
     * 删除指定的签名密钥。签名密钥绑定了API时无法删除，需要先解除与API的绑定关系后删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSignatureKeyV2Request 请求对象
     * @return SyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response>
     */
    public SyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> deleteSignatureKeyV2Invoker(
        DeleteSignatureKeyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteSignatureKeyV2, hcClient);
    }

    /**
     * 删除源数据源
     *
     * 删除源数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSourceRequest 请求对象
     * @return DeleteSourceResponse
     */
    public DeleteSourceResponse deleteSource(DeleteSourceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteSource);
    }

    /**
     * 删除源数据源
     *
     * 删除源数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSourceRequest 请求对象
     * @return SyncInvoker<DeleteSourceRequest, DeleteSourceResponse>
     */
    public SyncInvoker<DeleteSourceRequest, DeleteSourceResponse> deleteSourceInvoker(DeleteSourceRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteSource, hcClient);
    }

    /**
     * 删除特殊设置
     *
     * 删除某个流控策略的某个特殊配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSpecialThrottlingConfigurationV2Request 请求对象
     * @return DeleteSpecialThrottlingConfigurationV2Response
     */
    public DeleteSpecialThrottlingConfigurationV2Response deleteSpecialThrottlingConfigurationV2(
        DeleteSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteSpecialThrottlingConfigurationV2);
    }

    /**
     * 删除特殊设置
     *
     * 删除某个流控策略的某个特殊配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSpecialThrottlingConfigurationV2Request 请求对象
     * @return SyncInvoker<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response>
     */
    public SyncInvoker<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2Invoker(
        DeleteSpecialThrottlingConfigurationV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteSpecialThrottlingConfigurationV2, hcClient);
    }

    /**
     * 通过任务ID删除指定任务
     *
     * 通过任务ID删除指定任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteTask);
    }

    /**
     * 通过任务ID删除指定任务
     *
     * 通过任务ID删除指定任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteTask, hcClient);
    }

    /**
     * 解除绑定插件的API
     *
     * 解除绑定在插件上的API
     * - 解绑及时生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachApiFromPluginRequest 请求对象
     * @return DetachApiFromPluginResponse
     */
    public DetachApiFromPluginResponse detachApiFromPlugin(DetachApiFromPluginRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.detachApiFromPlugin);
    }

    /**
     * 解除绑定插件的API
     *
     * 解除绑定在插件上的API
     * - 解绑及时生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachApiFromPluginRequest 请求对象
     * @return SyncInvoker<DetachApiFromPluginRequest, DetachApiFromPluginResponse>
     */
    public SyncInvoker<DetachApiFromPluginRequest, DetachApiFromPluginResponse> detachApiFromPluginInvoker(
        DetachApiFromPluginRequest request) {
        return new SyncInvoker<>(request, RomaMeta.detachApiFromPlugin, hcClient);
    }

    /**
     * 解除绑定API的插件
     *
     * 解除绑定在API上的插件
     * - 解绑及时生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachPluginFromApiRequest 请求对象
     * @return DetachPluginFromApiResponse
     */
    public DetachPluginFromApiResponse detachPluginFromApi(DetachPluginFromApiRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.detachPluginFromApi);
    }

    /**
     * 解除绑定API的插件
     *
     * 解除绑定在API上的插件
     * - 解绑及时生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachPluginFromApiRequest 请求对象
     * @return SyncInvoker<DetachPluginFromApiRequest, DetachPluginFromApiResponse>
     */
    public SyncInvoker<DetachPluginFromApiRequest, DetachPluginFromApiResponse> detachPluginFromApiInvoker(
        DetachPluginFromApiRequest request) {
        return new SyncInvoker<>(request, RomaMeta.detachPluginFromApi, hcClient);
    }

    /**
     * 解除客户端配额和客户端应用的绑定
     *
     * 解除客户端配额和客户端应用的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAppQuotaWithAppRequest 请求对象
     * @return DisassociateAppQuotaWithAppResponse
     */
    public DisassociateAppQuotaWithAppResponse disassociateAppQuotaWithApp(DisassociateAppQuotaWithAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.disassociateAppQuotaWithApp);
    }

    /**
     * 解除客户端配额和客户端应用的绑定
     *
     * 解除客户端配额和客户端应用的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAppQuotaWithAppRequest 请求对象
     * @return SyncInvoker<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse>
     */
    public SyncInvoker<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse> disassociateAppQuotaWithAppInvoker(
        DisassociateAppQuotaWithAppRequest request) {
        return new SyncInvoker<>(request, RomaMeta.disassociateAppQuotaWithApp, hcClient);
    }

    /**
     * 删除域名证书
     *
     * 如果域名证书不再需要或者已过期，则可以删除证书内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateCertificateV2Request 请求对象
     * @return DisassociateCertificateV2Response
     */
    public DisassociateCertificateV2Response disassociateCertificateV2(DisassociateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.disassociateCertificateV2);
    }

    /**
     * 删除域名证书
     *
     * 如果域名证书不再需要或者已过期，则可以删除证书内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateCertificateV2Request 请求对象
     * @return SyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response>
     */
    public SyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response> disassociateCertificateV2Invoker(
        DisassociateCertificateV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.disassociateCertificateV2, hcClient);
    }

    /**
     * 解绑域名
     *
     * 如果API分组不再需要绑定某个自定义域名，则可以为此API分组解绑此域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateDomainV2Request 请求对象
     * @return DisassociateDomainV2Response
     */
    public DisassociateDomainV2Response disassociateDomainV2(DisassociateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.disassociateDomainV2);
    }

    /**
     * 解绑域名
     *
     * 如果API分组不再需要绑定某个自定义域名，则可以为此API分组解绑此域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateDomainV2Request 请求对象
     * @return SyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response>
     */
    public SyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response> disassociateDomainV2Invoker(
        DisassociateDomainV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.disassociateDomainV2, hcClient);
    }

    /**
     * 解除绑定
     *
     * 解除API与签名密钥的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateSignatureKeyV2Request 请求对象
     * @return DisassociateSignatureKeyV2Response
     */
    public DisassociateSignatureKeyV2Response disassociateSignatureKeyV2(DisassociateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.disassociateSignatureKeyV2);
    }

    /**
     * 解除绑定
     *
     * 解除API与签名密钥的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateSignatureKeyV2Request 请求对象
     * @return SyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response>
     */
    public SyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2Invoker(
        DisassociateSignatureKeyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.disassociateSignatureKeyV2, hcClient);
    }

    /**
     * 导出产品
     *
     * 导出产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadProductsRequest 请求对象
     * @return DownloadProductsResponse
     */
    public DownloadProductsResponse downloadProducts(DownloadProductsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.downloadProducts);
    }

    /**
     * 导出产品
     *
     * 导出产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadProductsRequest 请求对象
     * @return SyncInvoker<DownloadProductsRequest, DownloadProductsResponse>
     */
    public SyncInvoker<DownloadProductsRequest, DownloadProductsResponse> downloadProductsInvoker(
        DownloadProductsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.downloadProducts, hcClient);
    }

    /**
     * 导出Topic
     *
     * 导出Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportMqsInstanceTopicRequest 请求对象
     * @return ExportMqsInstanceTopicResponse
     */
    public ExportMqsInstanceTopicResponse exportMqsInstanceTopic(ExportMqsInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.exportMqsInstanceTopic);
    }

    /**
     * 导出Topic
     *
     * 导出Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportMqsInstanceTopicRequest 请求对象
     * @return SyncInvoker<ExportMqsInstanceTopicRequest, ExportMqsInstanceTopicResponse>
     */
    public SyncInvoker<ExportMqsInstanceTopicRequest, ExportMqsInstanceTopicResponse> exportMqsInstanceTopicInvoker(
        ExportMqsInstanceTopicRequest request) {
        return new SyncInvoker<>(request, RomaMeta.exportMqsInstanceTopic, hcClient);
    }

    /**
     * 导入Topic
     *
     * 导入Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportMqsInstanceTopicRequest 请求对象
     * @return ImportMqsInstanceTopicResponse
     */
    public ImportMqsInstanceTopicResponse importMqsInstanceTopic(ImportMqsInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.importMqsInstanceTopic);
    }

    /**
     * 导入Topic
     *
     * 导入Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportMqsInstanceTopicRequest 请求对象
     * @return SyncInvoker<ImportMqsInstanceTopicRequest, ImportMqsInstanceTopicResponse>
     */
    public SyncInvoker<ImportMqsInstanceTopicRequest, ImportMqsInstanceTopicResponse> importMqsInstanceTopicInvoker(
        ImportMqsInstanceTopicRequest request) {
        return new SyncInvoker<>(request, RomaMeta.importMqsInstanceTopic, hcClient);
    }

    /**
     * 组合任务初始化
     *
     * 初始化组合任务，分配任务ID，初始化映射等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallMultiTasksRequest 请求对象
     * @return InstallMultiTasksResponse
     */
    public InstallMultiTasksResponse installMultiTasks(InstallMultiTasksRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.installMultiTasks);
    }

    /**
     * 组合任务初始化
     *
     * 初始化组合任务，分配任务ID，初始化映射等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallMultiTasksRequest 请求对象
     * @return SyncInvoker<InstallMultiTasksRequest, InstallMultiTasksResponse>
     */
    public SyncInvoker<InstallMultiTasksRequest, InstallMultiTasksResponse> installMultiTasksInvoker(
        InstallMultiTasksRequest request) {
        return new SyncInvoker<>(request, RomaMeta.installMultiTasks, hcClient);
    }

    /**
     * 查询可绑定当前API的插件
     *
     * 查询可绑定当前API的插件信息。
     * - 支持分页返回
     * - 支持插件名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiAttachablePluginsRequest 请求对象
     * @return ListApiAttachablePluginsResponse
     */
    public ListApiAttachablePluginsResponse listApiAttachablePlugins(ListApiAttachablePluginsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApiAttachablePlugins);
    }

    /**
     * 查询可绑定当前API的插件
     *
     * 查询可绑定当前API的插件信息。
     * - 支持分页返回
     * - 支持插件名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiAttachablePluginsRequest 请求对象
     * @return SyncInvoker<ListApiAttachablePluginsRequest, ListApiAttachablePluginsResponse>
     */
    public SyncInvoker<ListApiAttachablePluginsRequest, ListApiAttachablePluginsResponse> listApiAttachablePluginsInvoker(
        ListApiAttachablePluginsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listApiAttachablePlugins, hcClient);
    }

    /**
     * 查询API下绑定的插件
     *
     * 查询指定API下绑定的插件信息
     * - 用于查询指定API下已经绑定的插件列表信息
     * - 支持分页返回
     * - 支持插件名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiAttachedPluginsRequest 请求对象
     * @return ListApiAttachedPluginsResponse
     */
    public ListApiAttachedPluginsResponse listApiAttachedPlugins(ListApiAttachedPluginsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApiAttachedPlugins);
    }

    /**
     * 查询API下绑定的插件
     *
     * 查询指定API下绑定的插件信息
     * - 用于查询指定API下已经绑定的插件列表信息
     * - 支持分页返回
     * - 支持插件名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiAttachedPluginsRequest 请求对象
     * @return SyncInvoker<ListApiAttachedPluginsRequest, ListApiAttachedPluginsResponse>
     */
    public SyncInvoker<ListApiAttachedPluginsRequest, ListApiAttachedPluginsResponse> listApiAttachedPluginsInvoker(
        ListApiAttachedPluginsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listApiAttachedPlugins, hcClient);
    }

    /**
     * 查看签名密钥绑定的API列表
     *
     * 查询某个签名密钥上已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToSignatureKeyV2Request 请求对象
     * @return ListApisBindedToSignatureKeyV2Response
     */
    public ListApisBindedToSignatureKeyV2Response listApisBindedToSignatureKeyV2(
        ListApisBindedToSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisBindedToSignatureKeyV2);
    }

    /**
     * 查看签名密钥绑定的API列表
     *
     * 查询某个签名密钥上已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToSignatureKeyV2Request 请求对象
     * @return SyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response>
     */
    public SyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2Invoker(
        ListApisBindedToSignatureKeyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listApisBindedToSignatureKeyV2, hcClient);
    }

    /**
     * 查看签名密钥未绑定的API列表
     *
     * 查询所有未绑定到该签名密钥上的API列表。需要API已经发布，未发布的API不予展示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisNotBoundWithSignatureKeyV2Request 请求对象
     * @return ListApisNotBoundWithSignatureKeyV2Response
     */
    public ListApisNotBoundWithSignatureKeyV2Response listApisNotBoundWithSignatureKeyV2(
        ListApisNotBoundWithSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisNotBoundWithSignatureKeyV2);
    }

    /**
     * 查看签名密钥未绑定的API列表
     *
     * 查询所有未绑定到该签名密钥上的API列表。需要API已经发布，未发布的API不予展示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisNotBoundWithSignatureKeyV2Request 请求对象
     * @return SyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response>
     */
    public SyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2Invoker(
        ListApisNotBoundWithSignatureKeyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listApisNotBoundWithSignatureKeyV2, hcClient);
    }

    /**
     * 查询APP Code列表
     *
     * 查询App Code列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppCodesV2Request 请求对象
     * @return ListAppCodesV2Response
     */
    public ListAppCodesV2Response listAppCodesV2(ListAppCodesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAppCodesV2);
    }

    /**
     * 查询APP Code列表
     *
     * 查询App Code列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppCodesV2Request 请求对象
     * @return SyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response>
     */
    public SyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response> listAppCodesV2Invoker(
        ListAppCodesV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listAppCodesV2, hcClient);
    }

    /**
     * 查询应用配置列表
     *
     * 查询应用配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppConfigsV2Request 请求对象
     * @return ListAppConfigsV2Response
     */
    public ListAppConfigsV2Response listAppConfigsV2(ListAppConfigsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAppConfigsV2);
    }

    /**
     * 查询应用配置列表
     *
     * 查询应用配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppConfigsV2Request 请求对象
     * @return SyncInvoker<ListAppConfigsV2Request, ListAppConfigsV2Response>
     */
    public SyncInvoker<ListAppConfigsV2Request, ListAppConfigsV2Response> listAppConfigsV2Invoker(
        ListAppConfigsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listAppConfigsV2, hcClient);
    }

    /**
     * 查询客户端配额可绑定的客户端应用列表
     *
     * 查询客户端配额可绑定的客户端应用列表。支持按客户端应用名称模糊搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotaBindableAppsRequest 请求对象
     * @return ListAppQuotaBindableAppsResponse
     */
    public ListAppQuotaBindableAppsResponse listAppQuotaBindableApps(ListAppQuotaBindableAppsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAppQuotaBindableApps);
    }

    /**
     * 查询客户端配额可绑定的客户端应用列表
     *
     * 查询客户端配额可绑定的客户端应用列表。支持按客户端应用名称模糊搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotaBindableAppsRequest 请求对象
     * @return SyncInvoker<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse>
     */
    public SyncInvoker<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse> listAppQuotaBindableAppsInvoker(
        ListAppQuotaBindableAppsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listAppQuotaBindableApps, hcClient);
    }

    /**
     * 查询客户端配额已绑定的客户端应用列表
     *
     * 查询客户端配额已绑定的客户端应用列表。支持按客户端应用名称模糊匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotaBoundAppsRequest 请求对象
     * @return ListAppQuotaBoundAppsResponse
     */
    public ListAppQuotaBoundAppsResponse listAppQuotaBoundApps(ListAppQuotaBoundAppsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAppQuotaBoundApps);
    }

    /**
     * 查询客户端配额已绑定的客户端应用列表
     *
     * 查询客户端配额已绑定的客户端应用列表。支持按客户端应用名称模糊匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotaBoundAppsRequest 请求对象
     * @return SyncInvoker<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse>
     */
    public SyncInvoker<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse> listAppQuotaBoundAppsInvoker(
        ListAppQuotaBoundAppsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listAppQuotaBoundApps, hcClient);
    }

    /**
     * 获取客户端配额列表
     *
     * 获取客户端配额列表。支持根据名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotasRequest 请求对象
     * @return ListAppQuotasResponse
     */
    public ListAppQuotasResponse listAppQuotas(ListAppQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAppQuotas);
    }

    /**
     * 获取客户端配额列表
     *
     * 获取客户端配额列表。支持根据名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotasRequest 请求对象
     * @return SyncInvoker<ListAppQuotasRequest, ListAppQuotasResponse>
     */
    public SyncInvoker<ListAppQuotasRequest, ListAppQuotasResponse> listAppQuotasInvoker(ListAppQuotasRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listAppQuotas, hcClient);
    }

    /**
     * 查询APP列表
     *
     * 查询APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsV2Request 请求对象
     * @return ListAppsV2Response
     */
    public ListAppsV2Response listAppsV2(ListAppsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAppsV2);
    }

    /**
     * 查询APP列表
     *
     * 查询APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsV2Request 请求对象
     * @return SyncInvoker<ListAppsV2Request, ListAppsV2Response>
     */
    public SyncInvoker<ListAppsV2Request, ListAppsV2Response> listAppsV2Invoker(ListAppsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listAppsV2, hcClient);
    }

    /**
     * 查询命令
     *
     * 查询命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommandsRequest 请求对象
     * @return ListCommandsResponse
     */
    public ListCommandsResponse listCommands(ListCommandsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listCommands);
    }

    /**
     * 查询命令
     *
     * 查询命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommandsRequest 请求对象
     * @return SyncInvoker<ListCommandsRequest, ListCommandsResponse>
     */
    public SyncInvoker<ListCommandsRequest, ListCommandsResponse> listCommandsInvoker(ListCommandsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listCommands, hcClient);
    }

    /**
     * 查询自定义认证列表
     *
     * 查询自定义认证列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomAuthorizersV2Request 请求对象
     * @return ListCustomAuthorizersV2Response
     */
    public ListCustomAuthorizersV2Response listCustomAuthorizersV2(ListCustomAuthorizersV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listCustomAuthorizersV2);
    }

    /**
     * 查询自定义认证列表
     *
     * 查询自定义认证列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomAuthorizersV2Request 请求对象
     * @return SyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response>
     */
    public SyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> listCustomAuthorizersV2Invoker(
        ListCustomAuthorizersV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listCustomAuthorizersV2, hcClient);
    }

    /**
     * 获取数据源中某个表中所有字段
     *
     * 获取数据源中中某个表中所有字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatasourceColumnsRequest 请求对象
     * @return ListDatasourceColumnsResponse
     */
    public ListDatasourceColumnsResponse listDatasourceColumns(ListDatasourceColumnsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listDatasourceColumns);
    }

    /**
     * 获取数据源中某个表中所有字段
     *
     * 获取数据源中中某个表中所有字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatasourceColumnsRequest 请求对象
     * @return SyncInvoker<ListDatasourceColumnsRequest, ListDatasourceColumnsResponse>
     */
    public SyncInvoker<ListDatasourceColumnsRequest, ListDatasourceColumnsResponse> listDatasourceColumnsInvoker(
        ListDatasourceColumnsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listDatasourceColumns, hcClient);
    }

    /**
     * 获取数据源中所有的表
     *
     * 获取数据源中所有的表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatasourceTablesRequest 请求对象
     * @return ListDatasourceTablesResponse
     */
    public ListDatasourceTablesResponse listDatasourceTables(ListDatasourceTablesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listDatasourceTables);
    }

    /**
     * 获取数据源中所有的表
     *
     * 获取数据源中所有的表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatasourceTablesRequest 请求对象
     * @return SyncInvoker<ListDatasourceTablesRequest, ListDatasourceTablesResponse>
     */
    public SyncInvoker<ListDatasourceTablesRequest, ListDatasourceTablesResponse> listDatasourceTablesInvoker(
        ListDatasourceTablesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listDatasourceTables, hcClient);
    }

    /**
     * 查询数据源
     *
     * 查询数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatasourcesRequest 请求对象
     * @return ListDatasourcesResponse
     */
    public ListDatasourcesResponse listDatasources(ListDatasourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listDatasources);
    }

    /**
     * 查询数据源
     *
     * 查询数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatasourcesRequest 请求对象
     * @return SyncInvoker<ListDatasourcesRequest, ListDatasourcesResponse>
     */
    public SyncInvoker<ListDatasourcesRequest, ListDatasourcesResponse> listDatasourcesInvoker(
        ListDatasourcesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listDatasources, hcClient);
    }

    /**
     * 查询目标数据源列表
     *
     * 查询目标数据源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDestinationsRequest 请求对象
     * @return ListDestinationsResponse
     */
    public ListDestinationsResponse listDestinations(ListDestinationsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listDestinations);
    }

    /**
     * 查询目标数据源列表
     *
     * 查询目标数据源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDestinationsRequest 请求对象
     * @return SyncInvoker<ListDestinationsRequest, ListDestinationsResponse>
     */
    public SyncInvoker<ListDestinationsRequest, ListDestinationsResponse> listDestinationsInvoker(
        ListDestinationsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listDestinations, hcClient);
    }

    /**
     * 查询设备
     *
     * 查询设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicesRequest 请求对象
     * @return ListDevicesResponse
     */
    public ListDevicesResponse listDevices(ListDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listDevices);
    }

    /**
     * 查询设备
     *
     * 查询设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicesRequest 请求对象
     * @return SyncInvoker<ListDevicesRequest, ListDevicesResponse>
     */
    public SyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesInvoker(ListDevicesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listDevices, hcClient);
    }

    /**
     * 查询产品内设备数量
     *
     * 查询产品内设备数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicesInProductRequest 请求对象
     * @return ListDevicesInProductResponse
     */
    public ListDevicesInProductResponse listDevicesInProduct(ListDevicesInProductRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listDevicesInProduct);
    }

    /**
     * 查询产品内设备数量
     *
     * 查询产品内设备数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicesInProductRequest 请求对象
     * @return SyncInvoker<ListDevicesInProductRequest, ListDevicesInProductResponse>
     */
    public SyncInvoker<ListDevicesInProductRequest, ListDevicesInProductResponse> listDevicesInProductInvoker(
        ListDevicesInProductRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listDevicesInProduct, hcClient);
    }

    /**
     * 查询变量列表
     *
     * 查询分组下的所有环境变量的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentVariablesV2Request 请求对象
     * @return ListEnvironmentVariablesV2Response
     */
    public ListEnvironmentVariablesV2Response listEnvironmentVariablesV2(ListEnvironmentVariablesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listEnvironmentVariablesV2);
    }

    /**
     * 查询变量列表
     *
     * 查询分组下的所有环境变量的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentVariablesV2Request 请求对象
     * @return SyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response>
     */
    public SyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2Invoker(
        ListEnvironmentVariablesV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listEnvironmentVariablesV2, hcClient);
    }

    /**
     * 查询环境列表
     *
     * 查询符合条件的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsV2Request 请求对象
     * @return ListEnvironmentsV2Response
     */
    public ListEnvironmentsV2Response listEnvironmentsV2(ListEnvironmentsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listEnvironmentsV2);
    }

    /**
     * 查询环境列表
     *
     * 查询符合条件的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsV2Request 请求对象
     * @return SyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response>
     */
    public SyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response> listEnvironmentsV2Invoker(
        ListEnvironmentsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listEnvironmentsV2, hcClient);
    }

    /**
     * 查看实例特性列表
     *
     * 查看实例特性列表。注意：实例不支持以下特性的需要联系技术支持升级实例版本。
     * 
     * 支持配置的特性列表及特性配置请参考“附录 &gt; 实例支持的APIC特性”
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesV2Request 请求对象
     * @return ListFeaturesV2Response
     */
    public ListFeaturesV2Response listFeaturesV2(ListFeaturesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listFeaturesV2);
    }

    /**
     * 查看实例特性列表
     *
     * 查看实例特性列表。注意：实例不支持以下特性的需要联系技术支持升级实例版本。
     * 
     * 支持配置的特性列表及特性配置请参考“附录 &gt; 实例支持的APIC特性”
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesV2Request 请求对象
     * @return SyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response>
     */
    public SyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response> listFeaturesV2Invoker(
        ListFeaturesV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listFeaturesV2, hcClient);
    }

    /**
     * API指标统计值查询-最近一段时间
     *
     * 根据API的id和最近的一段时间查询API被调用的次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。
     * &gt; 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatelyApiStatisticsV2Request 请求对象
     * @return ListLatelyApiStatisticsV2Response
     */
    public ListLatelyApiStatisticsV2Response listLatelyApiStatisticsV2(ListLatelyApiStatisticsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listLatelyApiStatisticsV2);
    }

    /**
     * API指标统计值查询-最近一段时间
     *
     * 根据API的id和最近的一段时间查询API被调用的次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。
     * &gt; 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatelyApiStatisticsV2Request 请求对象
     * @return SyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response>
     */
    public SyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> listLatelyApiStatisticsV2Invoker(
        ListLatelyApiStatisticsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listLatelyApiStatisticsV2, hcClient);
    }

    /**
     * 查询后端API部署历史
     *
     * 在某个实例中查询后端API的部署记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveDataApiDeploymentHistoryV2Request 请求对象
     * @return ListLiveDataApiDeploymentHistoryV2Response
     */
    public ListLiveDataApiDeploymentHistoryV2Response listLiveDataApiDeploymentHistoryV2(
        ListLiveDataApiDeploymentHistoryV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listLiveDataApiDeploymentHistoryV2);
    }

    /**
     * 查询后端API部署历史
     *
     * 在某个实例中查询后端API的部署记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveDataApiDeploymentHistoryV2Request 请求对象
     * @return SyncInvoker<ListLiveDataApiDeploymentHistoryV2Request, ListLiveDataApiDeploymentHistoryV2Response>
     */
    public SyncInvoker<ListLiveDataApiDeploymentHistoryV2Request, ListLiveDataApiDeploymentHistoryV2Response> listLiveDataApiDeploymentHistoryV2Invoker(
        ListLiveDataApiDeploymentHistoryV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listLiveDataApiDeploymentHistoryV2, hcClient);
    }

    /**
     * 查询后端API测试结果
     *
     * 在某个实例中查询后端API的测试结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveDataApiTestHistoryV2Request 请求对象
     * @return ListLiveDataApiTestHistoryV2Response
     */
    public ListLiveDataApiTestHistoryV2Response listLiveDataApiTestHistoryV2(
        ListLiveDataApiTestHistoryV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listLiveDataApiTestHistoryV2);
    }

    /**
     * 查询后端API测试结果
     *
     * 在某个实例中查询后端API的测试结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveDataApiTestHistoryV2Request 请求对象
     * @return SyncInvoker<ListLiveDataApiTestHistoryV2Request, ListLiveDataApiTestHistoryV2Response>
     */
    public SyncInvoker<ListLiveDataApiTestHistoryV2Request, ListLiveDataApiTestHistoryV2Response> listLiveDataApiTestHistoryV2Invoker(
        ListLiveDataApiTestHistoryV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listLiveDataApiTestHistoryV2, hcClient);
    }

    /**
     * 查询后端API列表
     *
     * 获取某个实例下的所有后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveDataApiV2Request 请求对象
     * @return ListLiveDataApiV2Response
     */
    public ListLiveDataApiV2Response listLiveDataApiV2(ListLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listLiveDataApiV2);
    }

    /**
     * 查询后端API列表
     *
     * 获取某个实例下的所有后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveDataApiV2Request 请求对象
     * @return SyncInvoker<ListLiveDataApiV2Request, ListLiveDataApiV2Response>
     */
    public SyncInvoker<ListLiveDataApiV2Request, ListLiveDataApiV2Response> listLiveDataApiV2Invoker(
        ListLiveDataApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listLiveDataApiV2, hcClient);
    }

    /**
     * 查询自定义后端服务数据源列表
     *
     * 查询自定义后端服务数据源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveDataDataSourcesV2Request 请求对象
     * @return ListLiveDataDataSourcesV2Response
     */
    public ListLiveDataDataSourcesV2Response listLiveDataDataSourcesV2(ListLiveDataDataSourcesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listLiveDataDataSourcesV2);
    }

    /**
     * 查询自定义后端服务数据源列表
     *
     * 查询自定义后端服务数据源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveDataDataSourcesV2Request 请求对象
     * @return SyncInvoker<ListLiveDataDataSourcesV2Request, ListLiveDataDataSourcesV2Response>
     */
    public SyncInvoker<ListLiveDataDataSourcesV2Request, ListLiveDataDataSourcesV2Response> listLiveDataDataSourcesV2Invoker(
        ListLiveDataDataSourcesV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listLiveDataDataSourcesV2, hcClient);
    }

    /**
     * 查询自定义后端服务配额
     *
     * 查询自定义后端服务配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveDataQuotaV2Request 请求对象
     * @return ListLiveDataQuotaV2Response
     */
    public ListLiveDataQuotaV2Response listLiveDataQuotaV2(ListLiveDataQuotaV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listLiveDataQuotaV2);
    }

    /**
     * 查询自定义后端服务配额
     *
     * 查询自定义后端服务配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveDataQuotaV2Request 请求对象
     * @return SyncInvoker<ListLiveDataQuotaV2Request, ListLiveDataQuotaV2Response>
     */
    public SyncInvoker<ListLiveDataQuotaV2Request, ListLiveDataQuotaV2Response> listLiveDataQuotaV2Invoker(
        ListLiveDataQuotaV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listLiveDataQuotaV2, hcClient);
    }

    /**
     * 任务监控信息列表查询
     *
     * 查询所有任务的监控信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitorInfosRequest 请求对象
     * @return ListMonitorInfosResponse
     */
    public ListMonitorInfosResponse listMonitorInfos(ListMonitorInfosRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listMonitorInfos);
    }

    /**
     * 任务监控信息列表查询
     *
     * 查询所有任务的监控信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitorInfosRequest 请求对象
     * @return SyncInvoker<ListMonitorInfosRequest, ListMonitorInfosResponse>
     */
    public SyncInvoker<ListMonitorInfosRequest, ListMonitorInfosResponse> listMonitorInfosInvoker(
        ListMonitorInfosRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listMonitorInfos, hcClient);
    }

    /**
     * 任务监控日志查询
     *
     * 查询单个任务的所有日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitorLogRequest 请求对象
     * @return ListMonitorLogResponse
     */
    public ListMonitorLogResponse listMonitorLog(ListMonitorLogRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listMonitorLog);
    }

    /**
     * 任务监控日志查询
     *
     * 查询单个任务的所有日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitorLogRequest 请求对象
     * @return SyncInvoker<ListMonitorLogRequest, ListMonitorLogResponse>
     */
    public SyncInvoker<ListMonitorLogRequest, ListMonitorLogResponse> listMonitorLogInvoker(
        ListMonitorLogRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listMonitorLog, hcClient);
    }

    /**
     * 查询Topic列表
     *
     * 查询Topic列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMqsInstanceTopicsRequest 请求对象
     * @return ListMqsInstanceTopicsResponse
     */
    public ListMqsInstanceTopicsResponse listMqsInstanceTopics(ListMqsInstanceTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listMqsInstanceTopics);
    }

    /**
     * 查询Topic列表
     *
     * 查询Topic列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMqsInstanceTopicsRequest 请求对象
     * @return SyncInvoker<ListMqsInstanceTopicsRequest, ListMqsInstanceTopicsResponse>
     */
    public SyncInvoker<ListMqsInstanceTopicsRequest, ListMqsInstanceTopicsResponse> listMqsInstanceTopicsInvoker(
        ListMqsInstanceTopicsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listMqsInstanceTopics, hcClient);
    }

    /**
     * 查询订阅管理信息
     *
     * 该接口用于查询指定应用订阅管理信息的数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationRequest 请求对象
     * @return ListNotificationResponse
     */
    public ListNotificationResponse listNotification(ListNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listNotification);
    }

    /**
     * 查询订阅管理信息
     *
     * 该接口用于查询指定应用订阅管理信息的数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationRequest 请求对象
     * @return SyncInvoker<ListNotificationRequest, ListNotificationResponse>
     */
    public SyncInvoker<ListNotificationRequest, ListNotificationResponse> listNotificationInvoker(
        ListNotificationRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listNotification, hcClient);
    }

    /**
     * 查询可绑定当前插件的API
     *
     * 查询可绑定当前插件的API信息。
     * - 支持分页返回
     * - 支持API名称模糊查询
     * - 支持已绑定其他插件的API查询返回
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginAttachableApisRequest 请求对象
     * @return ListPluginAttachableApisResponse
     */
    public ListPluginAttachableApisResponse listPluginAttachableApis(ListPluginAttachableApisRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listPluginAttachableApis);
    }

    /**
     * 查询可绑定当前插件的API
     *
     * 查询可绑定当前插件的API信息。
     * - 支持分页返回
     * - 支持API名称模糊查询
     * - 支持已绑定其他插件的API查询返回
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginAttachableApisRequest 请求对象
     * @return SyncInvoker<ListPluginAttachableApisRequest, ListPluginAttachableApisResponse>
     */
    public SyncInvoker<ListPluginAttachableApisRequest, ListPluginAttachableApisResponse> listPluginAttachableApisInvoker(
        ListPluginAttachableApisRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listPluginAttachableApis, hcClient);
    }

    /**
     * 查询插件下绑定的API
     *
     * 查询指定插件下绑定的API信息
     * - 用于查询指定插件下已经绑定的API列表信息
     * - 支持分页返回
     * - 支持API名称模糊查询
     * - 绑定关系列表中返回的API在对应的环境中可能已经下线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginAttachedApisRequest 请求对象
     * @return ListPluginAttachedApisResponse
     */
    public ListPluginAttachedApisResponse listPluginAttachedApis(ListPluginAttachedApisRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listPluginAttachedApis);
    }

    /**
     * 查询插件下绑定的API
     *
     * 查询指定插件下绑定的API信息
     * - 用于查询指定插件下已经绑定的API列表信息
     * - 支持分页返回
     * - 支持API名称模糊查询
     * - 绑定关系列表中返回的API在对应的环境中可能已经下线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginAttachedApisRequest 请求对象
     * @return SyncInvoker<ListPluginAttachedApisRequest, ListPluginAttachedApisResponse>
     */
    public SyncInvoker<ListPluginAttachedApisRequest, ListPluginAttachedApisResponse> listPluginAttachedApisInvoker(
        ListPluginAttachedApisRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listPluginAttachedApis, hcClient);
    }

    /**
     * 查询插件列表
     *
     * 查询一组符合条件的API网关插件详情。
     * - 支持分页
     * - 支持根据插件类型查询
     * - 支持根据插件可见范围查询
     * - 支持根据插件编码查询
     * - 支持根据名称模糊查询
     * - 支持根据集成应用编号查询
     * - 支持根据集成应用名称查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginsRequest 请求对象
     * @return ListPluginsResponse
     */
    public ListPluginsResponse listPlugins(ListPluginsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listPlugins);
    }

    /**
     * 查询插件列表
     *
     * 查询一组符合条件的API网关插件详情。
     * - 支持分页
     * - 支持根据插件类型查询
     * - 支持根据插件可见范围查询
     * - 支持根据插件编码查询
     * - 支持根据名称模糊查询
     * - 支持根据集成应用编号查询
     * - 支持根据集成应用名称查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginsRequest 请求对象
     * @return SyncInvoker<ListPluginsRequest, ListPluginsResponse>
     */
    public SyncInvoker<ListPluginsRequest, ListPluginsResponse> listPluginsInvoker(ListPluginsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listPlugins, hcClient);
    }

    /**
     * 查询产品模板
     *
     * 查询产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductTemplatesRequest 请求对象
     * @return ListProductTemplatesResponse
     */
    public ListProductTemplatesResponse listProductTemplates(ListProductTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listProductTemplates);
    }

    /**
     * 查询产品模板
     *
     * 查询产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductTemplatesRequest 请求对象
     * @return SyncInvoker<ListProductTemplatesRequest, ListProductTemplatesResponse>
     */
    public SyncInvoker<ListProductTemplatesRequest, ListProductTemplatesResponse> listProductTemplatesInvoker(
        ListProductTemplatesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listProductTemplates, hcClient);
    }

    /**
     * 查询产品主题
     *
     * 查询产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductTopicsRequest 请求对象
     * @return ListProductTopicsResponse
     */
    public ListProductTopicsResponse listProductTopics(ListProductTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listProductTopics);
    }

    /**
     * 查询产品主题
     *
     * 查询产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductTopicsRequest 请求对象
     * @return SyncInvoker<ListProductTopicsRequest, ListProductTopicsResponse>
     */
    public SyncInvoker<ListProductTopicsRequest, ListProductTopicsResponse> listProductTopicsInvoker(
        ListProductTopicsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listProductTopics, hcClient);
    }

    /**
     * 查询产品
     *
     * 查询产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listProducts);
    }

    /**
     * 查询产品
     *
     * 查询产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return SyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public SyncInvoker<ListProductsRequest, ListProductsResponse> listProductsInvoker(ListProductsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listProducts, hcClient);
    }

    /**
     * 查询某个实例的租户配置列表
     *
     * 查询某个实例的租户配置列表，用户可以通过此接口查看各类型资源配置及使用情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectCofigsV2Request 请求对象
     * @return ListProjectCofigsV2Response
     */
    public ListProjectCofigsV2Response listProjectCofigsV2(ListProjectCofigsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listProjectCofigsV2);
    }

    /**
     * 查询某个实例的租户配置列表
     *
     * 查询某个实例的租户配置列表，用户可以通过此接口查看各类型资源配置及使用情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectCofigsV2Request 请求对象
     * @return SyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response>
     */
    public SyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response> listProjectCofigsV2Invoker(
        ListProjectCofigsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listProjectCofigsV2, hcClient);
    }

    /**
     * 查询属性
     *
     * 查询属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPropertiesRequest 请求对象
     * @return ListPropertiesResponse
     */
    public ListPropertiesResponse listProperties(ListPropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listProperties);
    }

    /**
     * 查询属性
     *
     * 查询属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPropertiesRequest 请求对象
     * @return SyncInvoker<ListPropertiesRequest, ListPropertiesResponse>
     */
    public SyncInvoker<ListPropertiesRequest, ListPropertiesResponse> listPropertiesInvoker(
        ListPropertiesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listProperties, hcClient);
    }

    /**
     * 查询请求属性
     *
     * 查询请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRequestPropertiesRequest 请求对象
     * @return ListRequestPropertiesResponse
     */
    public ListRequestPropertiesResponse listRequestProperties(ListRequestPropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listRequestProperties);
    }

    /**
     * 查询请求属性
     *
     * 查询请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRequestPropertiesRequest 请求对象
     * @return SyncInvoker<ListRequestPropertiesRequest, ListRequestPropertiesResponse>
     */
    public SyncInvoker<ListRequestPropertiesRequest, ListRequestPropertiesResponse> listRequestPropertiesInvoker(
        ListRequestPropertiesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listRequestProperties, hcClient);
    }

    /**
     * 查询流控策略列表
     *
     * 查询所有流控策略的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRequestThrottlingPolicyV2Request 请求对象
     * @return ListRequestThrottlingPolicyV2Response
     */
    public ListRequestThrottlingPolicyV2Response listRequestThrottlingPolicyV2(
        ListRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listRequestThrottlingPolicyV2);
    }

    /**
     * 查询流控策略列表
     *
     * 查询所有流控策略的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2Invoker(
        ListRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查询响应属性
     *
     * 查询响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResponsePropertiesRequest 请求对象
     * @return ListResponsePropertiesResponse
     */
    public ListResponsePropertiesResponse listResponseProperties(ListResponsePropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listResponseProperties);
    }

    /**
     * 查询响应属性
     *
     * 查询响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResponsePropertiesRequest 请求对象
     * @return SyncInvoker<ListResponsePropertiesRequest, ListResponsePropertiesResponse>
     */
    public SyncInvoker<ListResponsePropertiesRequest, ListResponsePropertiesResponse> listResponsePropertiesInvoker(
        ListResponsePropertiesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listResponseProperties, hcClient);
    }

    /**
     * 查询规则
     *
     * 查询规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRulesRequest 请求对象
     * @return ListRulesResponse
     */
    public ListRulesResponse listRules(ListRulesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listRules);
    }

    /**
     * 查询规则
     *
     * 查询规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRulesRequest 请求对象
     * @return SyncInvoker<ListRulesRequest, ListRulesResponse>
     */
    public SyncInvoker<ListRulesRequest, ListRulesResponse> listRulesInvoker(ListRulesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listRules, hcClient);
    }

    /**
     * 查询服务
     *
     * 查询服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicesRequest 请求对象
     * @return ListServicesResponse
     */
    public ListServicesResponse listServices(ListServicesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listServices);
    }

    /**
     * 查询服务
     *
     * 查询服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicesRequest 请求对象
     * @return SyncInvoker<ListServicesRequest, ListServicesResponse>
     */
    public SyncInvoker<ListServicesRequest, ListServicesResponse> listServicesInvoker(ListServicesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listServices, hcClient);
    }

    /**
     * 查询设备影子
     *
     * 查询设备影子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShadowsRequest 请求对象
     * @return ListShadowsResponse
     */
    public ListShadowsResponse listShadows(ListShadowsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listShadows);
    }

    /**
     * 查询设备影子
     *
     * 查询设备影子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShadowsRequest 请求对象
     * @return SyncInvoker<ListShadowsRequest, ListShadowsResponse>
     */
    public SyncInvoker<ListShadowsRequest, ListShadowsResponse> listShadowsInvoker(ListShadowsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listShadows, hcClient);
    }

    /**
     * 查看API绑定的签名密钥列表
     *
     * 查询某个API绑定的签名密钥列表。每个API在每个环境上应该最多只会绑定一个签名密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSignatureKeysBindedToApiV2Request 请求对象
     * @return ListSignatureKeysBindedToApiV2Response
     */
    public ListSignatureKeysBindedToApiV2Response listSignatureKeysBindedToApiV2(
        ListSignatureKeysBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listSignatureKeysBindedToApiV2);
    }

    /**
     * 查看API绑定的签名密钥列表
     *
     * 查询某个API绑定的签名密钥列表。每个API在每个环境上应该最多只会绑定一个签名密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSignatureKeysBindedToApiV2Request 请求对象
     * @return SyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response>
     */
    public SyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2Invoker(
        ListSignatureKeysBindedToApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listSignatureKeysBindedToApiV2, hcClient);
    }

    /**
     * 查询签名密钥列表
     *
     * 查询所有签名密钥的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSignatureKeysV2Request 请求对象
     * @return ListSignatureKeysV2Response
     */
    public ListSignatureKeysV2Response listSignatureKeysV2(ListSignatureKeysV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listSignatureKeysV2);
    }

    /**
     * 查询签名密钥列表
     *
     * 查询所有签名密钥的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSignatureKeysV2Request 请求对象
     * @return SyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response>
     */
    public SyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response> listSignatureKeysV2Invoker(
        ListSignatureKeysV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listSignatureKeysV2, hcClient);
    }

    /**
     * 查询源数据源列表
     *
     * 查询源数据源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSourcesRequest 请求对象
     * @return ListSourcesResponse
     */
    public ListSourcesResponse listSources(ListSourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listSources);
    }

    /**
     * 查询源数据源列表
     *
     * 查询源数据源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSourcesRequest 请求对象
     * @return SyncInvoker<ListSourcesRequest, ListSourcesResponse>
     */
    public SyncInvoker<ListSourcesRequest, ListSourcesResponse> listSourcesInvoker(ListSourcesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listSources, hcClient);
    }

    /**
     * 查看特殊设置列表
     *
     * 查看给流控策略设置的特殊配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecialThrottlingConfigurationsV2Request 请求对象
     * @return ListSpecialThrottlingConfigurationsV2Response
     */
    public ListSpecialThrottlingConfigurationsV2Response listSpecialThrottlingConfigurationsV2(
        ListSpecialThrottlingConfigurationsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listSpecialThrottlingConfigurationsV2);
    }

    /**
     * 查看特殊设置列表
     *
     * 查看给流控策略设置的特殊配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecialThrottlingConfigurationsV2Request 请求对象
     * @return SyncInvoker<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response>
     */
    public SyncInvoker<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2Invoker(
        ListSpecialThrottlingConfigurationsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listSpecialThrottlingConfigurationsV2, hcClient);
    }

    /**
     * 查询API指标统计值
     *
     * 查询某个实例下的API统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatisticsApiRequest 请求对象
     * @return ListStatisticsApiResponse
     */
    public ListStatisticsApiResponse listStatisticsApi(ListStatisticsApiRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listStatisticsApi);
    }

    /**
     * 查询API指标统计值
     *
     * 查询某个实例下的API统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatisticsApiRequest 请求对象
     * @return SyncInvoker<ListStatisticsApiRequest, ListStatisticsApiResponse>
     */
    public SyncInvoker<ListStatisticsApiRequest, ListStatisticsApiResponse> listStatisticsApiInvoker(
        ListStatisticsApiRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listStatisticsApi, hcClient);
    }

    /**
     * 查询子设备
     *
     * 查询子设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubsetsRequest 请求对象
     * @return ListSubsetsResponse
     */
    public ListSubsetsResponse listSubsets(ListSubsetsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listSubsets);
    }

    /**
     * 查询子设备
     *
     * 查询子设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubsetsRequest 请求对象
     * @return SyncInvoker<ListSubsetsRequest, ListSubsetsResponse>
     */
    public SyncInvoker<ListSubsetsRequest, ListSubsetsResponse> listSubsetsInvoker(ListSubsetsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listSubsets, hcClient);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsV2Request 请求对象
     * @return ListTagsV2Response
     */
    public ListTagsV2Response listTagsV2(ListTagsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listTagsV2);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsV2Request 请求对象
     * @return SyncInvoker<ListTagsV2Request, ListTagsV2Response>
     */
    public SyncInvoker<ListTagsV2Request, ListTagsV2Response> listTagsV2Invoker(ListTagsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listTagsV2, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listTasks);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listTasks, hcClient);
    }

    /**
     * 查询设备主题
     *
     * 查询设备主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicsRequest 请求对象
     * @return ListTopicsResponse
     */
    public ListTopicsResponse listTopics(ListTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listTopics);
    }

    /**
     * 查询设备主题
     *
     * 查询设备主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicsRequest 请求对象
     * @return SyncInvoker<ListTopicsRequest, ListTopicsResponse>
     */
    public SyncInvoker<ListTopicsRequest, ListTopicsResponse> listTopicsInvoker(ListTopicsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listTopics, hcClient);
    }

    /**
     * 部署后端API
     *
     * 在某个实例中部署后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishLiveDataApiV2Request 请求对象
     * @return PublishLiveDataApiV2Response
     */
    public PublishLiveDataApiV2Response publishLiveDataApiV2(PublishLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.publishLiveDataApiV2);
    }

    /**
     * 部署后端API
     *
     * 在某个实例中部署后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishLiveDataApiV2Request 请求对象
     * @return SyncInvoker<PublishLiveDataApiV2Request, PublishLiveDataApiV2Response>
     */
    public SyncInvoker<PublishLiveDataApiV2Request, PublishLiveDataApiV2Response> publishLiveDataApiV2Invoker(
        PublishLiveDataApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.publishLiveDataApiV2, hcClient);
    }

    /**
     * 重置设备鉴权信息
     *
     * 重置设备鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetAuthenticationRequest 请求对象
     * @return ResetAuthenticationResponse
     */
    public ResetAuthenticationResponse resetAuthentication(ResetAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.resetAuthentication);
    }

    /**
     * 重置设备鉴权信息
     *
     * 重置设备鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetAuthenticationRequest 请求对象
     * @return SyncInvoker<ResetAuthenticationRequest, ResetAuthenticationResponse>
     */
    public SyncInvoker<ResetAuthenticationRequest, ResetAuthenticationResponse> resetAuthenticationInvoker(
        ResetAuthenticationRequest request) {
        return new SyncInvoker<>(request, RomaMeta.resetAuthentication, hcClient);
    }

    /**
     * 重发消息
     *
     * 重发消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetMessagesRequest 请求对象
     * @return ResetMessagesResponse
     */
    public ResetMessagesResponse resetMessages(ResetMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.resetMessages);
    }

    /**
     * 重发消息
     *
     * 重发消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetMessagesRequest 请求对象
     * @return SyncInvoker<ResetMessagesRequest, ResetMessagesResponse>
     */
    public SyncInvoker<ResetMessagesRequest, ResetMessagesResponse> resetMessagesInvoker(ResetMessagesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.resetMessages, hcClient);
    }

    /**
     * 重置组合任务进度
     *
     * 重置组合任务进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetMultiTaskOffsetRequest 请求对象
     * @return ResetMultiTaskOffsetResponse
     */
    public ResetMultiTaskOffsetResponse resetMultiTaskOffset(ResetMultiTaskOffsetRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.resetMultiTaskOffset);
    }

    /**
     * 重置组合任务进度
     *
     * 重置组合任务进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetMultiTaskOffsetRequest 请求对象
     * @return SyncInvoker<ResetMultiTaskOffsetRequest, ResetMultiTaskOffsetResponse>
     */
    public SyncInvoker<ResetMultiTaskOffsetRequest, ResetMultiTaskOffsetResponse> resetMultiTaskOffsetInvoker(
        ResetMultiTaskOffsetRequest request) {
        return new SyncInvoker<>(request, RomaMeta.resetMultiTaskOffset, hcClient);
    }

    /**
     * 重置产品鉴权信息
     *
     * 重置产品鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetProductAuthenticationRequest 请求对象
     * @return ResetProductAuthenticationResponse
     */
    public ResetProductAuthenticationResponse resetProductAuthentication(ResetProductAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.resetProductAuthentication);
    }

    /**
     * 重置产品鉴权信息
     *
     * 重置产品鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetProductAuthenticationRequest 请求对象
     * @return SyncInvoker<ResetProductAuthenticationRequest, ResetProductAuthenticationResponse>
     */
    public SyncInvoker<ResetProductAuthenticationRequest, ResetProductAuthenticationResponse> resetProductAuthenticationInvoker(
        ResetProductAuthenticationRequest request) {
        return new SyncInvoker<>(request, RomaMeta.resetProductAuthentication, hcClient);
    }

    /**
     * 手工触发单个任务
     *
     * 手工触发一次任务调度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTaskRequest 请求对象
     * @return RunTaskResponse
     */
    public RunTaskResponse runTask(RunTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.runTask);
    }

    /**
     * 手工触发单个任务
     *
     * 手工触发一次任务调度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTaskRequest 请求对象
     * @return SyncInvoker<RunTaskRequest, RunTaskResponse>
     */
    public SyncInvoker<RunTaskRequest, RunTaskResponse> runTaskInvoker(RunTaskRequest request) {
        return new SyncInvoker<>(request, RomaMeta.runTask, hcClient);
    }

    /**
     * 发送命令
     *
     * 发送命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendCommandRequest 请求对象
     * @return SendCommandResponse
     */
    public SendCommandResponse sendCommand(SendCommandRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.sendCommand);
    }

    /**
     * 发送命令
     *
     * 发送命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendCommandRequest 请求对象
     * @return SyncInvoker<SendCommandRequest, SendCommandResponse>
     */
    public SyncInvoker<SendCommandRequest, SendCommandResponse> sendCommandInvoker(SendCommandRequest request) {
        return new SyncInvoker<>(request, RomaMeta.sendCommand, hcClient);
    }

    /**
     * 查询客户端应用关联的应用配额
     *
     * 查看指定客户端应用关联的应用配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppBoundAppQuotaRequest 请求对象
     * @return ShowAppBoundAppQuotaResponse
     */
    public ShowAppBoundAppQuotaResponse showAppBoundAppQuota(ShowAppBoundAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showAppBoundAppQuota);
    }

    /**
     * 查询客户端应用关联的应用配额
     *
     * 查看指定客户端应用关联的应用配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppBoundAppQuotaRequest 请求对象
     * @return SyncInvoker<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse>
     */
    public SyncInvoker<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse> showAppBoundAppQuotaInvoker(
        ShowAppBoundAppQuotaRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showAppBoundAppQuota, hcClient);
    }

    /**
     * 获取客户端配额详情
     *
     * 获取客户端配额详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppQuotaRequest 请求对象
     * @return ShowAppQuotaResponse
     */
    public ShowAppQuotaResponse showAppQuota(ShowAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showAppQuota);
    }

    /**
     * 获取客户端配额详情
     *
     * 获取客户端配额详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppQuotaRequest 请求对象
     * @return SyncInvoker<ShowAppQuotaRequest, ShowAppQuotaResponse>
     */
    public SyncInvoker<ShowAppQuotaRequest, ShowAppQuotaResponse> showAppQuotaInvoker(ShowAppQuotaRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showAppQuota, hcClient);
    }

    /**
     * 查询设备鉴权信息
     *
     * 查询设备鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthenticationRequest 请求对象
     * @return ShowAuthenticationResponse
     */
    public ShowAuthenticationResponse showAuthentication(ShowAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showAuthentication);
    }

    /**
     * 查询设备鉴权信息
     *
     * 查询设备鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthenticationRequest 请求对象
     * @return SyncInvoker<ShowAuthenticationRequest, ShowAuthenticationResponse>
     */
    public SyncInvoker<ShowAuthenticationRequest, ShowAuthenticationResponse> showAuthenticationInvoker(
        ShowAuthenticationRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showAuthentication, hcClient);
    }

    /**
     * 查询命令详情
     *
     * 查询命令详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommandRequest 请求对象
     * @return ShowCommandResponse
     */
    public ShowCommandResponse showCommand(ShowCommandRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showCommand);
    }

    /**
     * 查询命令详情
     *
     * 查询命令详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommandRequest 请求对象
     * @return SyncInvoker<ShowCommandRequest, ShowCommandResponse>
     */
    public SyncInvoker<ShowCommandRequest, ShowCommandResponse> showCommandInvoker(ShowCommandRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showCommand, hcClient);
    }

    /**
     * 查询指定数据源
     *
     * 根据数据源id查询数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataourceDetailRequest 请求对象
     * @return ShowDataourceDetailResponse
     */
    public ShowDataourceDetailResponse showDataourceDetail(ShowDataourceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDataourceDetail);
    }

    /**
     * 查询指定数据源
     *
     * 根据数据源id查询数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataourceDetailRequest 请求对象
     * @return SyncInvoker<ShowDataourceDetailRequest, ShowDataourceDetailResponse>
     */
    public SyncInvoker<ShowDataourceDetailRequest, ShowDataourceDetailResponse> showDataourceDetailInvoker(
        ShowDataourceDetailRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showDataourceDetail, hcClient);
    }

    /**
     * 查看APP的访问控制详情
     *
     * 查看APP的访问控制详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAppAclRequest 请求对象
     * @return ShowDetailsOfAppAclResponse
     */
    public ShowDetailsOfAppAclResponse showDetailsOfAppAcl(ShowDetailsOfAppAclRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfAppAcl);
    }

    /**
     * 查看APP的访问控制详情
     *
     * 查看APP的访问控制详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAppAclRequest 请求对象
     * @return SyncInvoker<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse>
     */
    public SyncInvoker<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse> showDetailsOfAppAclInvoker(
        ShowDetailsOfAppAclRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfAppAcl, hcClient);
    }

    /**
     * 查看APP Code详情
     *
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAppCodeV2Request 请求对象
     * @return ShowDetailsOfAppCodeV2Response
     */
    public ShowDetailsOfAppCodeV2Response showDetailsOfAppCodeV2(ShowDetailsOfAppCodeV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfAppCodeV2);
    }

    /**
     * 查看APP Code详情
     *
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAppCodeV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response>
     */
    public SyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> showDetailsOfAppCodeV2Invoker(
        ShowDetailsOfAppCodeV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfAppCodeV2, hcClient);
    }

    /**
     * 查看应用配置详情
     *
     * 查看应用配置详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAppConfigV2Request 请求对象
     * @return ShowDetailsOfAppConfigV2Response
     */
    public ShowDetailsOfAppConfigV2Response showDetailsOfAppConfigV2(ShowDetailsOfAppConfigV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfAppConfigV2);
    }

    /**
     * 查看应用配置详情
     *
     * 查看应用配置详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAppConfigV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfAppConfigV2Request, ShowDetailsOfAppConfigV2Response>
     */
    public SyncInvoker<ShowDetailsOfAppConfigV2Request, ShowDetailsOfAppConfigV2Response> showDetailsOfAppConfigV2Invoker(
        ShowDetailsOfAppConfigV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfAppConfigV2, hcClient);
    }

    /**
     * 查看APP详情
     *
     * 查看指定APP的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAppV2Request 请求对象
     * @return ShowDetailsOfAppV2Response
     */
    public ShowDetailsOfAppV2Response showDetailsOfAppV2(ShowDetailsOfAppV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfAppV2);
    }

    /**
     * 查看APP详情
     *
     * 查看指定APP的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAppV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response>
     */
    public SyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> showDetailsOfAppV2Invoker(
        ShowDetailsOfAppV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfAppV2, hcClient);
    }

    /**
     * 查看自定义认证详情
     *
     * 查看自定义认证详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfCustomAuthorizersV2Request 请求对象
     * @return ShowDetailsOfCustomAuthorizersV2Response
     */
    public ShowDetailsOfCustomAuthorizersV2Response showDetailsOfCustomAuthorizersV2(
        ShowDetailsOfCustomAuthorizersV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfCustomAuthorizersV2);
    }

    /**
     * 查看自定义认证详情
     *
     * 查看自定义认证详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfCustomAuthorizersV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response>
     */
    public SyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> showDetailsOfCustomAuthorizersV2Invoker(
        ShowDetailsOfCustomAuthorizersV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfCustomAuthorizersV2, hcClient);
    }

    /**
     * 查看域名证书
     *
     * 查看域名下绑定的证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfDomainNameCertificateV2Request 请求对象
     * @return ShowDetailsOfDomainNameCertificateV2Response
     */
    public ShowDetailsOfDomainNameCertificateV2Response showDetailsOfDomainNameCertificateV2(
        ShowDetailsOfDomainNameCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfDomainNameCertificateV2);
    }

    /**
     * 查看域名证书
     *
     * 查看域名下绑定的证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfDomainNameCertificateV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response>
     */
    public SyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2Invoker(
        ShowDetailsOfDomainNameCertificateV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfDomainNameCertificateV2, hcClient);
    }

    /**
     * 查看变量详情
     *
     * 查看指定的环境变量的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfEnvironmentVariableV2Request 请求对象
     * @return ShowDetailsOfEnvironmentVariableV2Response
     */
    public ShowDetailsOfEnvironmentVariableV2Response showDetailsOfEnvironmentVariableV2(
        ShowDetailsOfEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfEnvironmentVariableV2);
    }

    /**
     * 查看变量详情
     *
     * 查看指定的环境变量的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfEnvironmentVariableV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response>
     */
    public SyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2Invoker(
        ShowDetailsOfEnvironmentVariableV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfEnvironmentVariableV2, hcClient);
    }

    /**
     * 查看实例详情
     *
     * 查看实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfInstanceV2Request 请求对象
     * @return ShowDetailsOfInstanceV2Response
     */
    public ShowDetailsOfInstanceV2Response showDetailsOfInstanceV2(ShowDetailsOfInstanceV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfInstanceV2);
    }

    /**
     * 查看实例详情
     *
     * 查看实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfInstanceV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response>
     */
    public SyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> showDetailsOfInstanceV2Invoker(
        ShowDetailsOfInstanceV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfInstanceV2, hcClient);
    }

    /**
     * 查看流控策略详情
     *
     * 查看指定流控策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfRequestThrottlingPolicyV2Request 请求对象
     * @return ShowDetailsOfRequestThrottlingPolicyV2Response
     */
    public ShowDetailsOfRequestThrottlingPolicyV2Response showDetailsOfRequestThrottlingPolicyV2(
        ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfRequestThrottlingPolicyV2);
    }

    /**
     * 查看流控策略详情
     *
     * 查看指定流控策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2Invoker(
        ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查询设备详情
     *
     * 查询设备详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceRequest 请求对象
     * @return ShowDeviceResponse
     */
    public ShowDeviceResponse showDevice(ShowDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDevice);
    }

    /**
     * 查询设备详情
     *
     * 查询设备详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceRequest 请求对象
     * @return SyncInvoker<ShowDeviceRequest, ShowDeviceResponse>
     */
    public SyncInvoker<ShowDeviceRequest, ShowDeviceResponse> showDeviceInvoker(ShowDeviceRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showDevice, hcClient);
    }

    /**
     * 查询设备分组详情
     *
     * 获取设备分组及下一层分组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceGroupRequest 请求对象
     * @return ShowDeviceGroupResponse
     */
    public ShowDeviceGroupResponse showDeviceGroup(ShowDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDeviceGroup);
    }

    /**
     * 查询设备分组详情
     *
     * 获取设备分组及下一层分组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceGroupRequest 请求对象
     * @return SyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse>
     */
    public SyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse> showDeviceGroupInvoker(
        ShowDeviceGroupRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showDeviceGroup, hcClient);
    }

    /**
     * 查询所有设备分组
     *
     * 查询所有设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceGroupTreeRequest 请求对象
     * @return ShowDeviceGroupTreeResponse
     */
    public ShowDeviceGroupTreeResponse showDeviceGroupTree(ShowDeviceGroupTreeRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDeviceGroupTree);
    }

    /**
     * 查询所有设备分组
     *
     * 查询所有设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceGroupTreeRequest 请求对象
     * @return SyncInvoker<ShowDeviceGroupTreeRequest, ShowDeviceGroupTreeResponse>
     */
    public SyncInvoker<ShowDeviceGroupTreeRequest, ShowDeviceGroupTreeResponse> showDeviceGroupTreeInvoker(
        ShowDeviceGroupTreeRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showDeviceGroupTree, hcClient);
    }

    /**
     * 查询设备分组内设备
     *
     * 查询设备分组内设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDevicesInGroupRequest 请求对象
     * @return ShowDevicesInGroupResponse
     */
    public ShowDevicesInGroupResponse showDevicesInGroup(ShowDevicesInGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDevicesInGroup);
    }

    /**
     * 查询设备分组内设备
     *
     * 查询设备分组内设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDevicesInGroupRequest 请求对象
     * @return SyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse>
     */
    public SyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> showDevicesInGroupInvoker(
        ShowDevicesInGroupRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showDevicesInGroup, hcClient);
    }

    /**
     * 查询调度计划
     *
     * 查询调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDispatchesRequest 请求对象
     * @return ShowDispatchesResponse
     */
    public ShowDispatchesResponse showDispatches(ShowDispatchesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDispatches);
    }

    /**
     * 查询调度计划
     *
     * 查询调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDispatchesRequest 请求对象
     * @return SyncInvoker<ShowDispatchesRequest, ShowDispatchesResponse>
     */
    public SyncInvoker<ShowDispatchesRequest, ShowDispatchesResponse> showDispatchesInvoker(
        ShowDispatchesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showDispatches, hcClient);
    }

    /**
     * 查询后端API详情
     *
     * 查询后端API的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLiveDataApiV2Request 请求对象
     * @return ShowLiveDataApiV2Response
     */
    public ShowLiveDataApiV2Response showLiveDataApiV2(ShowLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showLiveDataApiV2);
    }

    /**
     * 查询后端API详情
     *
     * 查询后端API的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLiveDataApiV2Request 请求对象
     * @return SyncInvoker<ShowLiveDataApiV2Request, ShowLiveDataApiV2Response>
     */
    public SyncInvoker<ShowLiveDataApiV2Request, ShowLiveDataApiV2Response> showLiveDataApiV2Invoker(
        ShowLiveDataApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showLiveDataApiV2, hcClient);
    }

    /**
     * 查询消息
     *
     * 查询消息的偏移量和消息内容。
     * 先根据时间戳查询消息的偏移量，再根据偏移量查询消息内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMqsInstanceMessagesRequest 请求对象
     * @return ShowMqsInstanceMessagesResponse
     */
    public ShowMqsInstanceMessagesResponse showMqsInstanceMessages(ShowMqsInstanceMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showMqsInstanceMessages);
    }

    /**
     * 查询消息
     *
     * 查询消息的偏移量和消息内容。
     * 先根据时间戳查询消息的偏移量，再根据偏移量查询消息内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMqsInstanceMessagesRequest 请求对象
     * @return SyncInvoker<ShowMqsInstanceMessagesRequest, ShowMqsInstanceMessagesResponse>
     */
    public SyncInvoker<ShowMqsInstanceMessagesRequest, ShowMqsInstanceMessagesResponse> showMqsInstanceMessagesInvoker(
        ShowMqsInstanceMessagesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showMqsInstanceMessages, hcClient);
    }

    /**
     * 查询Topic权限
     *
     * 查询Topic权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMqsInstanceTopicAccessPolicyRequest 请求对象
     * @return ShowMqsInstanceTopicAccessPolicyResponse
     */
    public ShowMqsInstanceTopicAccessPolicyResponse showMqsInstanceTopicAccessPolicy(
        ShowMqsInstanceTopicAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showMqsInstanceTopicAccessPolicy);
    }

    /**
     * 查询Topic权限
     *
     * 查询Topic权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMqsInstanceTopicAccessPolicyRequest 请求对象
     * @return SyncInvoker<ShowMqsInstanceTopicAccessPolicyRequest, ShowMqsInstanceTopicAccessPolicyResponse>
     */
    public SyncInvoker<ShowMqsInstanceTopicAccessPolicyRequest, ShowMqsInstanceTopicAccessPolicyResponse> showMqsInstanceTopicAccessPolicyInvoker(
        ShowMqsInstanceTopicAccessPolicyRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showMqsInstanceTopicAccessPolicy, hcClient);
    }

    /**
     * 查询插件详情
     *
     * 查询插件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPluginRequest 请求对象
     * @return ShowPluginResponse
     */
    public ShowPluginResponse showPlugin(ShowPluginRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showPlugin);
    }

    /**
     * 查询插件详情
     *
     * 查询插件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPluginRequest 请求对象
     * @return SyncInvoker<ShowPluginRequest, ShowPluginResponse>
     */
    public SyncInvoker<ShowPluginRequest, ShowPluginResponse> showPluginInvoker(ShowPluginRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showPlugin, hcClient);
    }

    /**
     * 查询产品详情
     *
     * 查询产品详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductRequest 请求对象
     * @return ShowProductResponse
     */
    public ShowProductResponse showProduct(ShowProductRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showProduct);
    }

    /**
     * 查询产品详情
     *
     * 查询产品详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductRequest 请求对象
     * @return SyncInvoker<ShowProductRequest, ShowProductResponse>
     */
    public SyncInvoker<ShowProductRequest, ShowProductResponse> showProductInvoker(ShowProductRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showProduct, hcClient);
    }

    /**
     * 查询产品鉴权信息
     *
     * 查询产品鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductAuthenticationRequest 请求对象
     * @return ShowProductAuthenticationResponse
     */
    public ShowProductAuthenticationResponse showProductAuthentication(ShowProductAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showProductAuthentication);
    }

    /**
     * 查询产品鉴权信息
     *
     * 查询产品鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductAuthenticationRequest 请求对象
     * @return SyncInvoker<ShowProductAuthenticationRequest, ShowProductAuthenticationResponse>
     */
    public SyncInvoker<ShowProductAuthenticationRequest, ShowProductAuthenticationResponse> showProductAuthenticationInvoker(
        ShowProductAuthenticationRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showProductAuthentication, hcClient);
    }

    /**
     * 查询产品模板详情
     *
     * 查询产品模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductTemplateRequest 请求对象
     * @return ShowProductTemplateResponse
     */
    public ShowProductTemplateResponse showProductTemplate(ShowProductTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showProductTemplate);
    }

    /**
     * 查询产品模板详情
     *
     * 查询产品模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductTemplateRequest 请求对象
     * @return SyncInvoker<ShowProductTemplateRequest, ShowProductTemplateResponse>
     */
    public SyncInvoker<ShowProductTemplateRequest, ShowProductTemplateResponse> showProductTemplateInvoker(
        ShowProductTemplateRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showProductTemplate, hcClient);
    }

    /**
     * 查询服务属性详情
     *
     * 查询服务属性详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPropertyRequest 请求对象
     * @return ShowPropertyResponse
     */
    public ShowPropertyResponse showProperty(ShowPropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showProperty);
    }

    /**
     * 查询服务属性详情
     *
     * 查询服务属性详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPropertyRequest 请求对象
     * @return SyncInvoker<ShowPropertyRequest, ShowPropertyResponse>
     */
    public SyncInvoker<ShowPropertyRequest, ShowPropertyResponse> showPropertyInvoker(ShowPropertyRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showProperty, hcClient);
    }

    /**
     * 查询请求属性详情
     *
     * 查询请求属性详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRequestPropertyRequest 请求对象
     * @return ShowRequestPropertyResponse
     */
    public ShowRequestPropertyResponse showRequestProperty(ShowRequestPropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showRequestProperty);
    }

    /**
     * 查询请求属性详情
     *
     * 查询请求属性详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRequestPropertyRequest 请求对象
     * @return SyncInvoker<ShowRequestPropertyRequest, ShowRequestPropertyResponse>
     */
    public SyncInvoker<ShowRequestPropertyRequest, ShowRequestPropertyResponse> showRequestPropertyInvoker(
        ShowRequestPropertyRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showRequestProperty, hcClient);
    }

    /**
     * 查询响应属性详情
     *
     * 查询响应属性详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResponsePropertyRequest 请求对象
     * @return ShowResponsePropertyResponse
     */
    public ShowResponsePropertyResponse showResponseProperty(ShowResponsePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showResponseProperty);
    }

    /**
     * 查询响应属性详情
     *
     * 查询响应属性详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResponsePropertyRequest 请求对象
     * @return SyncInvoker<ShowResponsePropertyRequest, ShowResponsePropertyResponse>
     */
    public SyncInvoker<ShowResponsePropertyRequest, ShowResponsePropertyResponse> showResponsePropertyInvoker(
        ShowResponsePropertyRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showResponseProperty, hcClient);
    }

    /**
     * 查看实例约束信息
     *
     * 查看实例约束信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRestrictionOfInstanceV2Request 请求对象
     * @return ShowRestrictionOfInstanceV2Response
     */
    public ShowRestrictionOfInstanceV2Response showRestrictionOfInstanceV2(ShowRestrictionOfInstanceV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showRestrictionOfInstanceV2);
    }

    /**
     * 查看实例约束信息
     *
     * 查看实例约束信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRestrictionOfInstanceV2Request 请求对象
     * @return SyncInvoker<ShowRestrictionOfInstanceV2Request, ShowRestrictionOfInstanceV2Response>
     */
    public SyncInvoker<ShowRestrictionOfInstanceV2Request, ShowRestrictionOfInstanceV2Response> showRestrictionOfInstanceV2Invoker(
        ShowRestrictionOfInstanceV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showRestrictionOfInstanceV2, hcClient);
    }

    /**
     * 查询规则详情
     *
     * 查询规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRuleRequest 请求对象
     * @return ShowRuleResponse
     */
    public ShowRuleResponse showRule(ShowRuleRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showRule);
    }

    /**
     * 查询规则详情
     *
     * 查询规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRuleRequest 请求对象
     * @return SyncInvoker<ShowRuleRequest, ShowRuleResponse>
     */
    public SyncInvoker<ShowRuleRequest, ShowRuleResponse> showRuleInvoker(ShowRuleRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showRule, hcClient);
    }

    /**
     * 查询服务详情
     *
     * 查询服务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServiceRequest 请求对象
     * @return ShowServiceResponse
     */
    public ShowServiceResponse showService(ShowServiceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showService);
    }

    /**
     * 查询服务详情
     *
     * 查询服务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServiceRequest 请求对象
     * @return SyncInvoker<ShowServiceRequest, ShowServiceResponse>
     */
    public SyncInvoker<ShowServiceRequest, ShowServiceResponse> showServiceInvoker(ShowServiceRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showService, hcClient);
    }

    /**
     * 通过任务ID查询指定任务的信息
     *
     * 通过任务ID查询指定任务的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return ShowTaskResponse
     */
    public ShowTaskResponse showTask(ShowTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showTask);
    }

    /**
     * 通过任务ID查询指定任务的信息
     *
     * 通过任务ID查询指定任务的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return SyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public SyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskInvoker(ShowTaskRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showTask, hcClient);
    }

    /**
     * 测试数据源连通性
     *
     * 测试数据源连通性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartTestDatasourceRequest 请求对象
     * @return StartTestDatasourceResponse
     */
    public StartTestDatasourceResponse startTestDatasource(StartTestDatasourceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.startTestDatasource);
    }

    /**
     * 测试数据源连通性
     *
     * 测试数据源连通性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartTestDatasourceRequest 请求对象
     * @return SyncInvoker<StartTestDatasourceRequest, StartTestDatasourceResponse>
     */
    public SyncInvoker<StartTestDatasourceRequest, StartTestDatasourceResponse> startTestDatasourceInvoker(
        StartTestDatasourceRequest request) {
        return new SyncInvoker<>(request, RomaMeta.startTestDatasource, hcClient);
    }

    /**
     * 手工停止当前执行的任务
     *
     * 手工停止当前执行的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTaskRequest 请求对象
     * @return StopTaskResponse
     */
    public StopTaskResponse stopTask(StopTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.stopTask);
    }

    /**
     * 手工停止当前执行的任务
     *
     * 手工停止当前执行的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTaskRequest 请求对象
     * @return SyncInvoker<StopTaskRequest, StopTaskResponse>
     */
    public SyncInvoker<StopTaskRequest, StopTaskResponse> stopTaskInvoker(StopTaskRequest request) {
        return new SyncInvoker<>(request, RomaMeta.stopTask, hcClient);
    }

    /**
     * 撤销后端API
     *
     * 在某个实例中取消部署后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnpublishLiveDataApiV2Request 请求对象
     * @return UnpublishLiveDataApiV2Response
     */
    public UnpublishLiveDataApiV2Response unpublishLiveDataApiV2(UnpublishLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.unpublishLiveDataApiV2);
    }

    /**
     * 撤销后端API
     *
     * 在某个实例中取消部署后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnpublishLiveDataApiV2Request 请求对象
     * @return SyncInvoker<UnpublishLiveDataApiV2Request, UnpublishLiveDataApiV2Response>
     */
    public SyncInvoker<UnpublishLiveDataApiV2Request, UnpublishLiveDataApiV2Response> unpublishLiveDataApiV2Invoker(
        UnpublishLiveDataApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.unpublishLiveDataApiV2, hcClient);
    }

    /**
     * 设置APP的访问控制
     *
     * 设置客户端配置的访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppAclRequest 请求对象
     * @return UpdateAppAclResponse
     */
    public UpdateAppAclResponse updateAppAcl(UpdateAppAclRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateAppAcl);
    }

    /**
     * 设置APP的访问控制
     *
     * 设置客户端配置的访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppAclRequest 请求对象
     * @return SyncInvoker<UpdateAppAclRequest, UpdateAppAclResponse>
     */
    public SyncInvoker<UpdateAppAclRequest, UpdateAppAclResponse> updateAppAclInvoker(UpdateAppAclRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateAppAcl, hcClient);
    }

    /**
     * 修改应用配置
     *
     * 修改应用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppConfigV2Request 请求对象
     * @return UpdateAppConfigV2Response
     */
    public UpdateAppConfigV2Response updateAppConfigV2(UpdateAppConfigV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateAppConfigV2);
    }

    /**
     * 修改应用配置
     *
     * 修改应用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppConfigV2Request 请求对象
     * @return SyncInvoker<UpdateAppConfigV2Request, UpdateAppConfigV2Response>
     */
    public SyncInvoker<UpdateAppConfigV2Request, UpdateAppConfigV2Response> updateAppConfigV2Invoker(
        UpdateAppConfigV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateAppConfigV2, hcClient);
    }

    /**
     * 修改客户端配额
     *
     * 修改客户端配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppQuotaRequest 请求对象
     * @return UpdateAppQuotaResponse
     */
    public UpdateAppQuotaResponse updateAppQuota(UpdateAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateAppQuota);
    }

    /**
     * 修改客户端配额
     *
     * 修改客户端配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppQuotaRequest 请求对象
     * @return SyncInvoker<UpdateAppQuotaRequest, UpdateAppQuotaResponse>
     */
    public SyncInvoker<UpdateAppQuotaRequest, UpdateAppQuotaResponse> updateAppQuotaInvoker(
        UpdateAppQuotaRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateAppQuota, hcClient);
    }

    /**
     * 修改命令
     *
     * 修改命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCommandRequest 请求对象
     * @return UpdateCommandResponse
     */
    public UpdateCommandResponse updateCommand(UpdateCommandRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateCommand);
    }

    /**
     * 修改命令
     *
     * 修改命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCommandRequest 请求对象
     * @return SyncInvoker<UpdateCommandRequest, UpdateCommandResponse>
     */
    public SyncInvoker<UpdateCommandRequest, UpdateCommandResponse> updateCommandInvoker(UpdateCommandRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateCommand, hcClient);
    }

    /**
     * 修改自定义认证
     *
     * 修改自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomAuthorizerV2Request 请求对象
     * @return UpdateCustomAuthorizerV2Response
     */
    public UpdateCustomAuthorizerV2Response updateCustomAuthorizerV2(UpdateCustomAuthorizerV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateCustomAuthorizerV2);
    }

    /**
     * 修改自定义认证
     *
     * 修改自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomAuthorizerV2Request 请求对象
     * @return SyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response>
     */
    public SyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> updateCustomAuthorizerV2Invoker(
        UpdateCustomAuthorizerV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateCustomAuthorizerV2, hcClient);
    }

    /**
     * 修改数据源
     *
     * 修改数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatasourceInfoRequest 请求对象
     * @return UpdateDatasourceInfoResponse
     */
    public UpdateDatasourceInfoResponse updateDatasourceInfo(UpdateDatasourceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateDatasourceInfo);
    }

    /**
     * 修改数据源
     *
     * 修改数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatasourceInfoRequest 请求对象
     * @return SyncInvoker<UpdateDatasourceInfoRequest, UpdateDatasourceInfoResponse>
     */
    public SyncInvoker<UpdateDatasourceInfoRequest, UpdateDatasourceInfoResponse> updateDatasourceInfoInvoker(
        UpdateDatasourceInfoRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateDatasourceInfo, hcClient);
    }

    /**
     * 修改设备
     *
     * 修改设备信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceRequest 请求对象
     * @return UpdateDeviceResponse
     */
    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateDevice);
    }

    /**
     * 修改设备
     *
     * 修改设备信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceRequest 请求对象
     * @return SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>
     */
    public SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceInvoker(UpdateDeviceRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateDevice, hcClient);
    }

    /**
     * 修改设备分组
     *
     * 修改设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceGroupRequest 请求对象
     * @return UpdateDeviceGroupResponse
     */
    public UpdateDeviceGroupResponse updateDeviceGroup(UpdateDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateDeviceGroup);
    }

    /**
     * 修改设备分组
     *
     * 修改设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceGroupRequest 请求对象
     * @return SyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse>
     */
    public SyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> updateDeviceGroupInvoker(
        UpdateDeviceGroupRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateDeviceGroup, hcClient);
    }

    /**
     * 修改调度计划
     *
     * 通过任务ID和调度ID修改调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDispatchesRequest 请求对象
     * @return UpdateDispatchesResponse
     */
    public UpdateDispatchesResponse updateDispatches(UpdateDispatchesRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateDispatches);
    }

    /**
     * 修改调度计划
     *
     * 通过任务ID和调度ID修改调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDispatchesRequest 请求对象
     * @return SyncInvoker<UpdateDispatchesRequest, UpdateDispatchesResponse>
     */
    public SyncInvoker<UpdateDispatchesRequest, UpdateDispatchesResponse> updateDispatchesInvoker(
        UpdateDispatchesRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateDispatches, hcClient);
    }

    /**
     * 修改域名
     *
     * 修改绑定的域名所对应的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainV2Request 请求对象
     * @return UpdateDomainV2Response
     */
    public UpdateDomainV2Response updateDomainV2(UpdateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateDomainV2);
    }

    /**
     * 修改域名
     *
     * 修改绑定的域名所对应的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainV2Request 请求对象
     * @return SyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response>
     */
    public SyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response> updateDomainV2Invoker(
        UpdateDomainV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateDomainV2, hcClient);
    }

    /**
     * 修改环境
     *
     * 修改指定环境的信息。其中可修改的属性为：name、remark，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentV2Request 请求对象
     * @return UpdateEnvironmentV2Response
     */
    public UpdateEnvironmentV2Response updateEnvironmentV2(UpdateEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateEnvironmentV2);
    }

    /**
     * 修改环境
     *
     * 修改指定环境的信息。其中可修改的属性为：name、remark，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentV2Request 请求对象
     * @return SyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response>
     */
    public SyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> updateEnvironmentV2Invoker(
        UpdateEnvironmentV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateEnvironmentV2, hcClient);
    }

    /**
     * 修改变量
     *
     * 修改环境变量。环境变量引用位置为api的后端服务地址时，修改对应环境变量会将使用该变量的所有api重新发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentVariableV2Request 请求对象
     * @return UpdateEnvironmentVariableV2Response
     */
    public UpdateEnvironmentVariableV2Response updateEnvironmentVariableV2(UpdateEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateEnvironmentVariableV2);
    }

    /**
     * 修改变量
     *
     * 修改环境变量。环境变量引用位置为api的后端服务地址时，修改对应环境变量会将使用该变量的所有api重新发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentVariableV2Request 请求对象
     * @return SyncInvoker<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response>
     */
    public SyncInvoker<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response> updateEnvironmentVariableV2Invoker(
        UpdateEnvironmentVariableV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateEnvironmentVariableV2, hcClient);
    }

    /**
     * 修改后端API
     *
     * 在某个实例中更新后端API的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLiveDataApiV2Request 请求对象
     * @return UpdateLiveDataApiV2Response
     */
    public UpdateLiveDataApiV2Response updateLiveDataApiV2(UpdateLiveDataApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateLiveDataApiV2);
    }

    /**
     * 修改后端API
     *
     * 在某个实例中更新后端API的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLiveDataApiV2Request 请求对象
     * @return SyncInvoker<UpdateLiveDataApiV2Request, UpdateLiveDataApiV2Response>
     */
    public SyncInvoker<UpdateLiveDataApiV2Request, UpdateLiveDataApiV2Response> updateLiveDataApiV2Invoker(
        UpdateLiveDataApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateLiveDataApiV2, hcClient);
    }

    /**
     * 修改Topic
     *
     * 修改Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMqsInstanceTopicRequest 请求对象
     * @return UpdateMqsInstanceTopicResponse
     */
    public UpdateMqsInstanceTopicResponse updateMqsInstanceTopic(UpdateMqsInstanceTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateMqsInstanceTopic);
    }

    /**
     * 修改Topic
     *
     * 修改Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMqsInstanceTopicRequest 请求对象
     * @return SyncInvoker<UpdateMqsInstanceTopicRequest, UpdateMqsInstanceTopicResponse>
     */
    public SyncInvoker<UpdateMqsInstanceTopicRequest, UpdateMqsInstanceTopicResponse> updateMqsInstanceTopicInvoker(
        UpdateMqsInstanceTopicRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateMqsInstanceTopic, hcClient);
    }

    /**
     * 修改组合任务
     *
     * 修改组合任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMultiTasksRequest 请求对象
     * @return UpdateMultiTasksResponse
     */
    public UpdateMultiTasksResponse updateMultiTasks(UpdateMultiTasksRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateMultiTasks);
    }

    /**
     * 修改组合任务
     *
     * 修改组合任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMultiTasksRequest 请求对象
     * @return SyncInvoker<UpdateMultiTasksRequest, UpdateMultiTasksResponse>
     */
    public SyncInvoker<UpdateMultiTasksRequest, UpdateMultiTasksResponse> updateMultiTasksInvoker(
        UpdateMultiTasksRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateMultiTasks, hcClient);
    }

    /**
     * 修改订阅管理
     *
     * 该接口用于修改指定的订阅管理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationRequest 请求对象
     * @return UpdateNotificationResponse
     */
    public UpdateNotificationResponse updateNotification(UpdateNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateNotification);
    }

    /**
     * 修改订阅管理
     *
     * 该接口用于修改指定的订阅管理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationRequest 请求对象
     * @return SyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse>
     */
    public SyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse> updateNotificationInvoker(
        UpdateNotificationRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateNotification, hcClient);
    }

    /**
     * 修改插件
     *
     * 修改插件信息。
     * - 插件不允许重名
     * - 插件不支持修改类型和可见范围
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePluginRequest 请求对象
     * @return UpdatePluginResponse
     */
    public UpdatePluginResponse updatePlugin(UpdatePluginRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updatePlugin);
    }

    /**
     * 修改插件
     *
     * 修改插件信息。
     * - 插件不允许重名
     * - 插件不支持修改类型和可见范围
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePluginRequest 请求对象
     * @return SyncInvoker<UpdatePluginRequest, UpdatePluginResponse>
     */
    public SyncInvoker<UpdatePluginRequest, UpdatePluginResponse> updatePluginInvoker(UpdatePluginRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updatePlugin, hcClient);
    }

    /**
     * 修改产品信息
     *
     * 修改产品信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProductRequest 请求对象
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProduct(UpdateProductRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateProduct);
    }

    /**
     * 修改产品信息
     *
     * 修改产品信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProductRequest 请求对象
     * @return SyncInvoker<UpdateProductRequest, UpdateProductResponse>
     */
    public SyncInvoker<UpdateProductRequest, UpdateProductResponse> updateProductInvoker(UpdateProductRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateProduct, hcClient);
    }

    /**
     * 修改产品模板
     *
     * 修改产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProductTemplateRequest 请求对象
     * @return UpdateProductTemplateResponse
     */
    public UpdateProductTemplateResponse updateProductTemplate(UpdateProductTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateProductTemplate);
    }

    /**
     * 修改产品模板
     *
     * 修改产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProductTemplateRequest 请求对象
     * @return SyncInvoker<UpdateProductTemplateRequest, UpdateProductTemplateResponse>
     */
    public SyncInvoker<UpdateProductTemplateRequest, UpdateProductTemplateResponse> updateProductTemplateInvoker(
        UpdateProductTemplateRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateProductTemplate, hcClient);
    }

    /**
     * 更新产品主题
     *
     * 更新产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProductTopicRequest 请求对象
     * @return UpdateProductTopicResponse
     */
    public UpdateProductTopicResponse updateProductTopic(UpdateProductTopicRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateProductTopic);
    }

    /**
     * 更新产品主题
     *
     * 更新产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProductTopicRequest 请求对象
     * @return SyncInvoker<UpdateProductTopicRequest, UpdateProductTopicResponse>
     */
    public SyncInvoker<UpdateProductTopicRequest, UpdateProductTopicResponse> updateProductTopicInvoker(
        UpdateProductTopicRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateProductTopic, hcClient);
    }

    /**
     * 修改服务属性
     *
     * 修改服务属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePropertyRequest 请求对象
     * @return UpdatePropertyResponse
     */
    public UpdatePropertyResponse updateProperty(UpdatePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateProperty);
    }

    /**
     * 修改服务属性
     *
     * 修改服务属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePropertyRequest 请求对象
     * @return SyncInvoker<UpdatePropertyRequest, UpdatePropertyResponse>
     */
    public SyncInvoker<UpdatePropertyRequest, UpdatePropertyResponse> updatePropertyInvoker(
        UpdatePropertyRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateProperty, hcClient);
    }

    /**
     * 修改请求属性
     *
     * 修改请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRequestPropertyRequest 请求对象
     * @return UpdateRequestPropertyResponse
     */
    public UpdateRequestPropertyResponse updateRequestProperty(UpdateRequestPropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateRequestProperty);
    }

    /**
     * 修改请求属性
     *
     * 修改请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRequestPropertyRequest 请求对象
     * @return SyncInvoker<UpdateRequestPropertyRequest, UpdateRequestPropertyResponse>
     */
    public SyncInvoker<UpdateRequestPropertyRequest, UpdateRequestPropertyResponse> updateRequestPropertyInvoker(
        UpdateRequestPropertyRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateRequestProperty, hcClient);
    }

    /**
     * 修改流控策略
     *
     * 修改指定流控策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRequestThrottlingPolicyV2Request 请求对象
     * @return UpdateRequestThrottlingPolicyV2Response
     */
    public UpdateRequestThrottlingPolicyV2Response updateRequestThrottlingPolicyV2(
        UpdateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateRequestThrottlingPolicyV2);
    }

    /**
     * 修改流控策略
     *
     * 修改指定流控策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2Invoker(
        UpdateRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 修改响应属性
     *
     * 修改响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResponsePropertyRequest 请求对象
     * @return UpdateResponsePropertyResponse
     */
    public UpdateResponsePropertyResponse updateResponseProperty(UpdateResponsePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateResponseProperty);
    }

    /**
     * 修改响应属性
     *
     * 修改响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResponsePropertyRequest 请求对象
     * @return SyncInvoker<UpdateResponsePropertyRequest, UpdateResponsePropertyResponse>
     */
    public SyncInvoker<UpdateResponsePropertyRequest, UpdateResponsePropertyResponse> updateResponsePropertyInvoker(
        UpdateResponsePropertyRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateResponseProperty, hcClient);
    }

    /**
     * 修改规则
     *
     * 修改规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRuleRequest 请求对象
     * @return UpdateRuleResponse
     */
    public UpdateRuleResponse updateRule(UpdateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateRule);
    }

    /**
     * 修改规则
     *
     * 修改规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRuleRequest 请求对象
     * @return SyncInvoker<UpdateRuleRequest, UpdateRuleResponse>
     */
    public SyncInvoker<UpdateRuleRequest, UpdateRuleResponse> updateRuleInvoker(UpdateRuleRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateRule, hcClient);
    }

    /**
     * 修改服务
     *
     * 修改服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceRequest 请求对象
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateService(UpdateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateService);
    }

    /**
     * 修改服务
     *
     * 修改服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceRequest 请求对象
     * @return SyncInvoker<UpdateServiceRequest, UpdateServiceResponse>
     */
    public SyncInvoker<UpdateServiceRequest, UpdateServiceResponse> updateServiceInvoker(UpdateServiceRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateService, hcClient);
    }

    /**
     * 修改签名密钥
     *
     * 修改指定签名密钥的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSignatureKeyV2Request 请求对象
     * @return UpdateSignatureKeyV2Response
     */
    public UpdateSignatureKeyV2Response updateSignatureKeyV2(UpdateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateSignatureKeyV2);
    }

    /**
     * 修改签名密钥
     *
     * 修改指定签名密钥的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSignatureKeyV2Request 请求对象
     * @return SyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response>
     */
    public SyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> updateSignatureKeyV2Invoker(
        UpdateSignatureKeyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateSignatureKeyV2, hcClient);
    }

    /**
     * 修改特殊设置
     *
     * 修改某个流控策略下的某个特殊设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSpecialThrottlingConfigurationV2Request 请求对象
     * @return UpdateSpecialThrottlingConfigurationV2Response
     */
    public UpdateSpecialThrottlingConfigurationV2Response updateSpecialThrottlingConfigurationV2(
        UpdateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateSpecialThrottlingConfigurationV2);
    }

    /**
     * 修改特殊设置
     *
     * 修改某个流控策略下的某个特殊设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSpecialThrottlingConfigurationV2Request 请求对象
     * @return SyncInvoker<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response>
     */
    public SyncInvoker<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2Invoker(
        UpdateSpecialThrottlingConfigurationV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateSpecialThrottlingConfigurationV2, hcClient);
    }

    /**
     * 更新普通任务
     *
     * 更新普通任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return UpdateTaskResponse
     */
    public UpdateTaskResponse updateTask(UpdateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateTask);
    }

    /**
     * 更新普通任务
     *
     * 更新普通任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return SyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public SyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskInvoker(UpdateTaskRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateTask, hcClient);
    }

    /**
     * 更新Topic权限
     *
     * 更新Topic权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicAccessPolicyRequest 请求对象
     * @return UpdateTopicAccessPolicyResponse
     */
    public UpdateTopicAccessPolicyResponse updateTopicAccessPolicy(UpdateTopicAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateTopicAccessPolicy);
    }

    /**
     * 更新Topic权限
     *
     * 更新Topic权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicAccessPolicyRequest 请求对象
     * @return SyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse>
     */
    public SyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> updateTopicAccessPolicyInvoker(
        UpdateTopicAccessPolicyRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateTopicAccessPolicy, hcClient);
    }

    /**
     * 导入产品
     *
     * 导入产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadProductRequest 请求对象
     * @return UploadProductResponse
     */
    public UploadProductResponse uploadProduct(UploadProductRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.uploadProduct);
    }

    /**
     * 导入产品
     *
     * 导入产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadProductRequest 请求对象
     * @return SyncInvoker<UploadProductRequest, UploadProductResponse>
     */
    public SyncInvoker<UploadProductRequest, UploadProductResponse> uploadProductInvoker(UploadProductRequest request) {
        return new SyncInvoker<>(request, RomaMeta.uploadProduct, hcClient);
    }

    /**
     * 批量删除ACL策略
     *
     * 批量删除指定的多个ACL策略。
     * 
     * 删除ACL策略时，如果存在ACL策略与API绑定关系，则无法删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAclV2Request 请求对象
     * @return BatchDeleteAclV2Response
     */
    public BatchDeleteAclV2Response batchDeleteAclV2(BatchDeleteAclV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDeleteAclV2);
    }

    /**
     * 批量删除ACL策略
     *
     * 批量删除指定的多个ACL策略。
     * 
     * 删除ACL策略时，如果存在ACL策略与API绑定关系，则无法删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAclV2Request 请求对象
     * @return SyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response>
     */
    public SyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response> batchDeleteAclV2Invoker(
        BatchDeleteAclV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.batchDeleteAclV2, hcClient);
    }

    /**
     * 创建ACL策略
     *
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP[或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com\&quot;之类的网络域名。](tag:hws,hws_hk,hcs,hcs_sm,fcs,g42)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAclStrategyV2Request 请求对象
     * @return CreateAclStrategyV2Response
     */
    public CreateAclStrategyV2Response createAclStrategyV2(CreateAclStrategyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createAclStrategyV2);
    }

    /**
     * 创建ACL策略
     *
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP[或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com\&quot;之类的网络域名。](tag:hws,hws_hk,hcs,hcs_sm,fcs,g42)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAclStrategyV2Request 请求对象
     * @return SyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response>
     */
    public SyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response> createAclStrategyV2Invoker(
        CreateAclStrategyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createAclStrategyV2, hcClient);
    }

    /**
     * 删除ACL策略
     *
     * 删除指定的ACL策略， 如果存在api与该ACL策略的绑定关系，则无法删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclV2Request 请求对象
     * @return DeleteAclV2Response
     */
    public DeleteAclV2Response deleteAclV2(DeleteAclV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteAclV2);
    }

    /**
     * 删除ACL策略
     *
     * 删除指定的ACL策略， 如果存在api与该ACL策略的绑定关系，则无法删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclV2Request 请求对象
     * @return SyncInvoker<DeleteAclV2Request, DeleteAclV2Response>
     */
    public SyncInvoker<DeleteAclV2Request, DeleteAclV2Response> deleteAclV2Invoker(DeleteAclV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteAclV2, hcClient);
    }

    /**
     * 查看ACL策略列表
     *
     * 查询所有的ACL策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclStrategiesV2Request 请求对象
     * @return ListAclStrategiesV2Response
     */
    public ListAclStrategiesV2Response listAclStrategiesV2(ListAclStrategiesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAclStrategiesV2);
    }

    /**
     * 查看ACL策略列表
     *
     * 查询所有的ACL策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclStrategiesV2Request 请求对象
     * @return SyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response>
     */
    public SyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response> listAclStrategiesV2Invoker(
        ListAclStrategiesV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listAclStrategiesV2, hcClient);
    }

    /**
     * 查看ACL策略详情
     *
     * 查询指定ACL策略的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAclPolicyV2Request 请求对象
     * @return ShowDetailsOfAclPolicyV2Response
     */
    public ShowDetailsOfAclPolicyV2Response showDetailsOfAclPolicyV2(ShowDetailsOfAclPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfAclPolicyV2);
    }

    /**
     * 查看ACL策略详情
     *
     * 查询指定ACL策略的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAclPolicyV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response>
     */
    public SyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> showDetailsOfAclPolicyV2Invoker(
        ShowDetailsOfAclPolicyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfAclPolicyV2, hcClient);
    }

    /**
     * 修改ACL策略
     *
     * 修改指定的ACL策略，其中可修改的属性为：acl_name、acl_type、acl_value，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclStrategyV2Request 请求对象
     * @return UpdateAclStrategyV2Response
     */
    public UpdateAclStrategyV2Response updateAclStrategyV2(UpdateAclStrategyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateAclStrategyV2);
    }

    /**
     * 修改ACL策略
     *
     * 修改指定的ACL策略，其中可修改的属性为：acl_name、acl_type、acl_value，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclStrategyV2Request 请求对象
     * @return SyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response>
     */
    public SyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> updateAclStrategyV2Invoker(
        UpdateAclStrategyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateAclStrategyV2, hcClient);
    }

    /**
     * 绑定流控策略
     *
     * 将流控策略应用于API，则所有对该API的访问将会受到该流控策略的限制。
     * 
     * 
     * 当一定时间内的访问次数超过流控策略设置的API最大访问次数限制后，后续的访问将会被拒绝，从而能够较好的保护后端API免受异常流量的冲击，保障服务的稳定运行。
     * 
     * 
     * 为指定的API绑定流控策略，绑定时，需要指定在哪个环境上生效。同一个API发布到不同的环境可以绑定不同的流控策略；一个API在发布到特定环境后只能绑定一个默认的流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRequestThrottlingPolicyV2Request 请求对象
     * @return AssociateRequestThrottlingPolicyV2Response
     */
    public AssociateRequestThrottlingPolicyV2Response associateRequestThrottlingPolicyV2(
        AssociateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.associateRequestThrottlingPolicyV2);
    }

    /**
     * 绑定流控策略
     *
     * 将流控策略应用于API，则所有对该API的访问将会受到该流控策略的限制。
     * 
     * 
     * 当一定时间内的访问次数超过流控策略设置的API最大访问次数限制后，后续的访问将会被拒绝，从而能够较好的保护后端API免受异常流量的冲击，保障服务的稳定运行。
     * 
     * 
     * 为指定的API绑定流控策略，绑定时，需要指定在哪个环境上生效。同一个API发布到不同的环境可以绑定不同的流控策略；一个API在发布到特定环境后只能绑定一个默认的流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2Invoker(
        AssociateRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.associateRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 批量解绑流控策略
     *
     * 批量解除API与流控策略的绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateThrottlingPolicyV2Request 请求对象
     * @return BatchDisassociateThrottlingPolicyV2Response
     */
    public BatchDisassociateThrottlingPolicyV2Response batchDisassociateThrottlingPolicyV2(
        BatchDisassociateThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDisassociateThrottlingPolicyV2);
    }

    /**
     * 批量解绑流控策略
     *
     * 批量解除API与流控策略的绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response>
     */
    public SyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2Invoker(
        BatchDisassociateThrottlingPolicyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.batchDisassociateThrottlingPolicyV2, hcClient);
    }

    /**
     * 批量发布或下线API
     *
     * 将多个API发布到一个指定的环境，或将多个API从指定的环境下线。
     * 
     * 注意：当action &#x3D; online时，接口返回的响应中publish_id，version_id， publish_time字段才有含义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPublishOrOfflineApiV2Request 请求对象
     * @return BatchPublishOrOfflineApiV2Response
     */
    public BatchPublishOrOfflineApiV2Response batchPublishOrOfflineApiV2(BatchPublishOrOfflineApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchPublishOrOfflineApiV2);
    }

    /**
     * 批量发布或下线API
     *
     * 将多个API发布到一个指定的环境，或将多个API从指定的环境下线。
     * 
     * 注意：当action &#x3D; online时，接口返回的响应中publish_id，version_id， publish_time字段才有含义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPublishOrOfflineApiV2Request 请求对象
     * @return SyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response>
     */
    public SyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> batchPublishOrOfflineApiV2Invoker(
        BatchPublishOrOfflineApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.batchPublishOrOfflineApiV2, hcClient);
    }

    /**
     * 切换API版本
     *
     * API每次发布时，会基于当前的API定义生成一个版本。版本记录了API发布时的各种定义及状态。
     * 
     * 多个版本之间可以进行随意切换。但一个API在一个环境上，只能有一个版本生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeApiVersionV2Request 请求对象
     * @return ChangeApiVersionV2Response
     */
    public ChangeApiVersionV2Response changeApiVersionV2(ChangeApiVersionV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.changeApiVersionV2);
    }

    /**
     * 切换API版本
     *
     * API每次发布时，会基于当前的API定义生成一个版本。版本记录了API发布时的各种定义及状态。
     * 
     * 多个版本之间可以进行随意切换。但一个API在一个环境上，只能有一个版本生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeApiVersionV2Request 请求对象
     * @return SyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response>
     */
    public SyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response> changeApiVersionV2Invoker(
        ChangeApiVersionV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.changeApiVersionV2, hcClient);
    }

    /**
     * 校验API分组名称是否存在
     *
     * 校验API分组名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckApiGroupsV2Request 请求对象
     * @return CheckApiGroupsV2Response
     */
    public CheckApiGroupsV2Response checkApiGroupsV2(CheckApiGroupsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkApiGroupsV2);
    }

    /**
     * 校验API分组名称是否存在
     *
     * 校验API分组名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckApiGroupsV2Request 请求对象
     * @return SyncInvoker<CheckApiGroupsV2Request, CheckApiGroupsV2Response>
     */
    public SyncInvoker<CheckApiGroupsV2Request, CheckApiGroupsV2Response> checkApiGroupsV2Invoker(
        CheckApiGroupsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.checkApiGroupsV2, hcClient);
    }

    /**
     * 校验API定义
     *
     * 校验API定义。校验API的路径或名称是否已存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckApisV2Request 请求对象
     * @return CheckApisV2Response
     */
    public CheckApisV2Response checkApisV2(CheckApisV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkApisV2);
    }

    /**
     * 校验API定义
     *
     * 校验API定义。校验API的路径或名称是否已存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckApisV2Request 请求对象
     * @return SyncInvoker<CheckApisV2Request, CheckApisV2Response>
     */
    public SyncInvoker<CheckApisV2Request, CheckApisV2Response> checkApisV2Invoker(CheckApisV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.checkApisV2, hcClient);
    }

    /**
     * 创建API分组
     *
     * API分组是API的管理单元，一个API分组等同于一个服务入口，创建API分组时，返回一个子域名作为访问入口。建议一个API分组下的API具有一定的相关性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiGroupV2Request 请求对象
     * @return CreateApiGroupV2Response
     */
    public CreateApiGroupV2Response createApiGroupV2(CreateApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createApiGroupV2);
    }

    /**
     * 创建API分组
     *
     * API分组是API的管理单元，一个API分组等同于一个服务入口，创建API分组时，返回一个子域名作为访问入口。建议一个API分组下的API具有一定的相关性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiGroupV2Request 请求对象
     * @return SyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response>
     */
    public SyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response> createApiGroupV2Invoker(
        CreateApiGroupV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createApiGroupV2, hcClient);
    }

    /**
     * 创建API
     *
     * 添加一个API，API即一个服务接口，具体的服务能力。
     * API分为两部分，第一部分为面向API使用者的API接口，定义了使用者如何调用这个API。第二部分面向API提供者，由API提供者定义这个API的真实的后端情况，定义了[ROMA Connect](tag:hws,hws_hk,hcs,hcs_sm,fcs,g42)[ROMA Site](tag:Site)如何去访问真实的后端服务。API的真实后端服务目前支持的类型：传统的HTTP/HTTPS形式的web后端、[函数工作流、](tag:hws,hws_hk,hcs,hcs_sm,fcs,g42)MOCK。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiV2Request 请求对象
     * @return CreateApiV2Response
     */
    public CreateApiV2Response createApiV2(CreateApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createApiV2);
    }

    /**
     * 创建API
     *
     * 添加一个API，API即一个服务接口，具体的服务能力。
     * API分为两部分，第一部分为面向API使用者的API接口，定义了使用者如何调用这个API。第二部分面向API提供者，由API提供者定义这个API的真实的后端情况，定义了[ROMA Connect](tag:hws,hws_hk,hcs,hcs_sm,fcs,g42)[ROMA Site](tag:Site)如何去访问真实的后端服务。API的真实后端服务目前支持的类型：传统的HTTP/HTTPS形式的web后端、[函数工作流、](tag:hws,hws_hk,hcs,hcs_sm,fcs,g42)MOCK。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiV2Request 请求对象
     * @return SyncInvoker<CreateApiV2Request, CreateApiV2Response>
     */
    public SyncInvoker<CreateApiV2Request, CreateApiV2Response> createApiV2Invoker(CreateApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createApiV2, hcClient);
    }

    /**
     * 发布或下线API
     *
     * 对API进行发布或下线。
     * 
     * 发布操作是将一个指定的API发布到一个指定的环境，API只有发布后，才能够被调用，且只能在该环境上才能被调用。未发布的API无法被调用。
     * 
     * 下线操作是将API从某个已发布的环境上下线，下线后，API将无法再被调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrDeletePublishRecordForApiV2Request 请求对象
     * @return CreateOrDeletePublishRecordForApiV2Response
     */
    public CreateOrDeletePublishRecordForApiV2Response createOrDeletePublishRecordForApiV2(
        CreateOrDeletePublishRecordForApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createOrDeletePublishRecordForApiV2);
    }

    /**
     * 发布或下线API
     *
     * 对API进行发布或下线。
     * 
     * 发布操作是将一个指定的API发布到一个指定的环境，API只有发布后，才能够被调用，且只能在该环境上才能被调用。未发布的API无法被调用。
     * 
     * 下线操作是将API从某个已发布的环境上下线，下线后，API将无法再被调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrDeletePublishRecordForApiV2Request 请求对象
     * @return SyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response>
     */
    public SyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2Invoker(
        CreateOrDeletePublishRecordForApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createOrDeletePublishRecordForApiV2, hcClient);
    }

    /**
     * 调试API
     *
     * 调试一个API在指定运行环境下的定义，接口调用者需要具有操作该API的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugApiV2Request 请求对象
     * @return DebugApiV2Response
     */
    public DebugApiV2Response debugApiV2(DebugApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.debugApiV2);
    }

    /**
     * 调试API
     *
     * 调试一个API在指定运行环境下的定义，接口调用者需要具有操作该API的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugApiV2Request 请求对象
     * @return SyncInvoker<DebugApiV2Request, DebugApiV2Response>
     */
    public SyncInvoker<DebugApiV2Request, DebugApiV2Response> debugApiV2Invoker(DebugApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.debugApiV2, hcClient);
    }

    /**
     * 根据版本编号下线API
     *
     * 对某个生效中的API版本进行下线操作，下线后，API在该版本生效的环境中将不再能够被调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiByVersionIdV2Request 请求对象
     * @return DeleteApiByVersionIdV2Response
     */
    public DeleteApiByVersionIdV2Response deleteApiByVersionIdV2(DeleteApiByVersionIdV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteApiByVersionIdV2);
    }

    /**
     * 根据版本编号下线API
     *
     * 对某个生效中的API版本进行下线操作，下线后，API在该版本生效的环境中将不再能够被调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiByVersionIdV2Request 请求对象
     * @return SyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response>
     */
    public SyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> deleteApiByVersionIdV2Invoker(
        DeleteApiByVersionIdV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteApiByVersionIdV2, hcClient);
    }

    /**
     * 删除API分组
     *
     * 删除指定的API分组。
     * 
     * 分组下存在API时分组无法删除，需要删除所有分组下的API后，再删除分组。
     * 
     * 删除分组时，会一并删除直接或间接关联到该分组下的所有资源，包括独立域名、SSL证书等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiGroupV2Request 请求对象
     * @return DeleteApiGroupV2Response
     */
    public DeleteApiGroupV2Response deleteApiGroupV2(DeleteApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteApiGroupV2);
    }

    /**
     * 删除API分组
     *
     * 删除指定的API分组。
     * 
     * 分组下存在API时分组无法删除，需要删除所有分组下的API后，再删除分组。
     * 
     * 删除分组时，会一并删除直接或间接关联到该分组下的所有资源，包括独立域名、SSL证书等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiGroupV2Request 请求对象
     * @return SyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response>
     */
    public SyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response> deleteApiGroupV2Invoker(
        DeleteApiGroupV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteApiGroupV2, hcClient);
    }

    /**
     * 删除API
     *
     * 删除指定的API。
     * 
     * 删除API时，会删除该API所有相关的资源信息或绑定关系，如API的发布记录，绑定的后端服务，对APP的授权信息等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiV2Request 请求对象
     * @return DeleteApiV2Response
     */
    public DeleteApiV2Response deleteApiV2(DeleteApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteApiV2);
    }

    /**
     * 删除API
     *
     * 删除指定的API。
     * 
     * 删除API时，会删除该API所有相关的资源信息或绑定关系，如API的发布记录，绑定的后端服务，对APP的授权信息等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiV2Request 请求对象
     * @return SyncInvoker<DeleteApiV2Request, DeleteApiV2Response>
     */
    public SyncInvoker<DeleteApiV2Request, DeleteApiV2Response> deleteApiV2Invoker(DeleteApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteApiV2, hcClient);
    }

    /**
     * 解除API与流控策略的绑定关系
     *
     * 解除API与流控策略的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateRequestThrottlingPolicyV2Request 请求对象
     * @return DisassociateRequestThrottlingPolicyV2Response
     */
    public DisassociateRequestThrottlingPolicyV2Response disassociateRequestThrottlingPolicyV2(
        DisassociateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.disassociateRequestThrottlingPolicyV2);
    }

    /**
     * 解除API与流控策略的绑定关系
     *
     * 解除API与流控策略的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2Invoker(
        DisassociateRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.disassociateRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查询分组列表
     *
     * 查询API分组列表。
     * 
     * 如果是租户操作，则查询该租户下所有的分组；如果是管理员操作，则查询的是所有租户的分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiGroupsV2Request 请求对象
     * @return ListApiGroupsV2Response
     */
    public ListApiGroupsV2Response listApiGroupsV2(ListApiGroupsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApiGroupsV2);
    }

    /**
     * 查询分组列表
     *
     * 查询API分组列表。
     * 
     * 如果是租户操作，则查询该租户下所有的分组；如果是管理员操作，则查询的是所有租户的分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiGroupsV2Request 请求对象
     * @return SyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response>
     */
    public SyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response> listApiGroupsV2Invoker(
        ListApiGroupsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listApiGroupsV2, hcClient);
    }

    /**
     * 查询API运行时定义
     *
     * 查看指定的API在指定的环境上的运行时定义，默认查询RELEASE环境上的运行时定义。
     * 
     * API的定义分为临时定义和运行时定义，分别代表如下含义：
     * - 临时定义：API在编辑中的定义，表示用户最后一次编辑后的API的状态
     * - 运行时定义：API在发布到某个环境时，对发布时的API的临时定义进行快照，固化出来的API的状态。
     * 
     * 访问某个环境上的API，其实访问的就是其运行时的定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiRuntimeDefinitionV2Request 请求对象
     * @return ListApiRuntimeDefinitionV2Response
     */
    public ListApiRuntimeDefinitionV2Response listApiRuntimeDefinitionV2(ListApiRuntimeDefinitionV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApiRuntimeDefinitionV2);
    }

    /**
     * 查询API运行时定义
     *
     * 查看指定的API在指定的环境上的运行时定义，默认查询RELEASE环境上的运行时定义。
     * 
     * API的定义分为临时定义和运行时定义，分别代表如下含义：
     * - 临时定义：API在编辑中的定义，表示用户最后一次编辑后的API的状态
     * - 运行时定义：API在发布到某个环境时，对发布时的API的临时定义进行快照，固化出来的API的状态。
     * 
     * 访问某个环境上的API，其实访问的就是其运行时的定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiRuntimeDefinitionV2Request 请求对象
     * @return SyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response>
     */
    public SyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> listApiRuntimeDefinitionV2Invoker(
        ListApiRuntimeDefinitionV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listApiRuntimeDefinitionV2, hcClient);
    }

    /**
     * 查看版本详情
     *
     * 查询某个指定的版本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionDetailV2Request 请求对象
     * @return ListApiVersionDetailV2Response
     */
    public ListApiVersionDetailV2Response listApiVersionDetailV2(ListApiVersionDetailV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApiVersionDetailV2);
    }

    /**
     * 查看版本详情
     *
     * 查询某个指定的版本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionDetailV2Request 请求对象
     * @return SyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response>
     */
    public SyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> listApiVersionDetailV2Invoker(
        ListApiVersionDetailV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listApiVersionDetailV2, hcClient);
    }

    /**
     * 查询API历史版本列表
     *
     * 查询某个API的历史版本。每个API在一个环境上最多存在10个历史版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsV2Request 请求对象
     * @return ListApiVersionsV2Response
     */
    public ListApiVersionsV2Response listApiVersionsV2(ListApiVersionsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApiVersionsV2);
    }

    /**
     * 查询API历史版本列表
     *
     * 查询某个API的历史版本。每个API在一个环境上最多存在10个历史版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsV2Request 请求对象
     * @return SyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response>
     */
    public SyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response> listApiVersionsV2Invoker(
        ListApiVersionsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listApiVersionsV2, hcClient);
    }

    /**
     * 查看流控策略绑定的API列表
     *
     * 查询某个流控策略上已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToRequestThrottlingPolicyV2Request 请求对象
     * @return ListApisBindedToRequestThrottlingPolicyV2Response
     */
    public ListApisBindedToRequestThrottlingPolicyV2Response listApisBindedToRequestThrottlingPolicyV2(
        ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisBindedToRequestThrottlingPolicyV2);
    }

    /**
     * 查看流控策略绑定的API列表
     *
     * 查询某个流控策略上已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2Invoker(
        ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listApisBindedToRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查看流控策略未绑定的API列表
     *
     * 查询所有未绑定到该流控策略上的自有API列表。需要API已经发布，未发布的API不予展示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisUnbindedToRequestThrottlingPolicyV2Request 请求对象
     * @return ListApisUnbindedToRequestThrottlingPolicyV2Response
     */
    public ListApisUnbindedToRequestThrottlingPolicyV2Response listApisUnbindedToRequestThrottlingPolicyV2(
        ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisUnbindedToRequestThrottlingPolicyV2);
    }

    /**
     * 查看流控策略未绑定的API列表
     *
     * 查询所有未绑定到该流控策略上的自有API列表。需要API已经发布，未发布的API不予展示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisUnbindedToRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2Invoker(
        ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listApisUnbindedToRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查询API列表
     *
     * 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisV2Request 请求对象
     * @return ListApisV2Response
     */
    public ListApisV2Response listApisV2(ListApisV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisV2);
    }

    /**
     * 查询API列表
     *
     * 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisV2Request 请求对象
     * @return SyncInvoker<ListApisV2Request, ListApisV2Response>
     */
    public SyncInvoker<ListApisV2Request, ListApisV2Response> listApisV2Invoker(ListApisV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listApisV2, hcClient);
    }

    /**
     * 查看API绑定的流控策略列表
     *
     * 查询某个API绑定的流控策略列表。每个环境上应该最多只有一个流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRequestThrottlingPoliciesBindedToApiV2Request 请求对象
     * @return ListRequestThrottlingPoliciesBindedToApiV2Response
     */
    public ListRequestThrottlingPoliciesBindedToApiV2Response listRequestThrottlingPoliciesBindedToApiV2(
        ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listRequestThrottlingPoliciesBindedToApiV2);
    }

    /**
     * 查看API绑定的流控策略列表
     *
     * 查询某个API绑定的流控策略列表。每个环境上应该最多只有一个流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRequestThrottlingPoliciesBindedToApiV2Request 请求对象
     * @return SyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response>
     */
    public SyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2Invoker(
        ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listRequestThrottlingPoliciesBindedToApiV2, hcClient);
    }

    /**
     * 查询分组详情
     *
     * 查询指定分组的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfApiGroupV2Request 请求对象
     * @return ShowDetailsOfApiGroupV2Response
     */
    public ShowDetailsOfApiGroupV2Response showDetailsOfApiGroupV2(ShowDetailsOfApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfApiGroupV2);
    }

    /**
     * 查询分组详情
     *
     * 查询指定分组的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfApiGroupV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response>
     */
    public SyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2Invoker(
        ShowDetailsOfApiGroupV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfApiGroupV2, hcClient);
    }

    /**
     * 查询API详情
     *
     * 查看指定的API的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfApiV2Request 请求对象
     * @return ShowDetailsOfApiV2Response
     */
    public ShowDetailsOfApiV2Response showDetailsOfApiV2(ShowDetailsOfApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfApiV2);
    }

    /**
     * 查询API详情
     *
     * 查看指定的API的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfApiV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response>
     */
    public SyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> showDetailsOfApiV2Invoker(
        ShowDetailsOfApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfApiV2, hcClient);
    }

    /**
     * 修改API分组
     *
     * 修改API分组属性。其中name和remark可修改，其他属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiGroupV2Request 请求对象
     * @return UpdateApiGroupV2Response
     */
    public UpdateApiGroupV2Response updateApiGroupV2(UpdateApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateApiGroupV2);
    }

    /**
     * 修改API分组
     *
     * 修改API分组属性。其中name和remark可修改，其他属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiGroupV2Request 请求对象
     * @return SyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response>
     */
    public SyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response> updateApiGroupV2Invoker(
        UpdateApiGroupV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateApiGroupV2, hcClient);
    }

    /**
     * 修改API
     *
     * 修改指定API的信息，包括后端服务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiV2Request 请求对象
     * @return UpdateApiV2Response
     */
    public UpdateApiV2Response updateApiV2(UpdateApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateApiV2);
    }

    /**
     * 修改API
     *
     * 修改指定API的信息，包括后端服务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiV2Request 请求对象
     * @return SyncInvoker<UpdateApiV2Request, UpdateApiV2Response>
     */
    public SyncInvoker<UpdateApiV2Request, UpdateApiV2Response> updateApiV2Invoker(UpdateApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateApiV2, hcClient);
    }

    /**
     * 批量解除API与ACL策略的绑定
     *
     * 批量解除API与ACL策略的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteApiAclBindingV2Request 请求对象
     * @return BatchDeleteApiAclBindingV2Response
     */
    public BatchDeleteApiAclBindingV2Response batchDeleteApiAclBindingV2(BatchDeleteApiAclBindingV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDeleteApiAclBindingV2);
    }

    /**
     * 批量解除API与ACL策略的绑定
     *
     * 批量解除API与ACL策略的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteApiAclBindingV2Request 请求对象
     * @return SyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response>
     */
    public SyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> batchDeleteApiAclBindingV2Invoker(
        BatchDeleteApiAclBindingV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.batchDeleteApiAclBindingV2, hcClient);
    }

    /**
     * 将API与ACL策略进行绑定
     *
     * 将API与ACL策略进行绑定。
     * 
     * 同一个API发布到不同的环境可以绑定不同的ACL策略；一个API在发布到特定环境后只能绑定一个同一种类型的ACL策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiAclBindingV2Request 请求对象
     * @return CreateApiAclBindingV2Response
     */
    public CreateApiAclBindingV2Response createApiAclBindingV2(CreateApiAclBindingV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createApiAclBindingV2);
    }

    /**
     * 将API与ACL策略进行绑定
     *
     * 将API与ACL策略进行绑定。
     * 
     * 同一个API发布到不同的环境可以绑定不同的ACL策略；一个API在发布到特定环境后只能绑定一个同一种类型的ACL策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiAclBindingV2Request 请求对象
     * @return SyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response>
     */
    public SyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> createApiAclBindingV2Invoker(
        CreateApiAclBindingV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createApiAclBindingV2, hcClient);
    }

    /**
     * 解除API与ACL策略的绑定
     *
     * 解除某条API与ACL策略的绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiAclBindingV2Request 请求对象
     * @return DeleteApiAclBindingV2Response
     */
    public DeleteApiAclBindingV2Response deleteApiAclBindingV2(DeleteApiAclBindingV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteApiAclBindingV2);
    }

    /**
     * 解除API与ACL策略的绑定
     *
     * 解除某条API与ACL策略的绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiAclBindingV2Request 请求对象
     * @return SyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response>
     */
    public SyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> deleteApiAclBindingV2Invoker(
        DeleteApiAclBindingV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteApiAclBindingV2, hcClient);
    }

    /**
     * 查看API绑定的ACL策略列表
     *
     * 查看API绑定的ACL策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclPolicyBindedToApiV2Request 请求对象
     * @return ListAclPolicyBindedToApiV2Response
     */
    public ListAclPolicyBindedToApiV2Response listAclPolicyBindedToApiV2(ListAclPolicyBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAclPolicyBindedToApiV2);
    }

    /**
     * 查看API绑定的ACL策略列表
     *
     * 查看API绑定的ACL策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclPolicyBindedToApiV2Request 请求对象
     * @return SyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response>
     */
    public SyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> listAclPolicyBindedToApiV2Invoker(
        ListAclPolicyBindedToApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listAclPolicyBindedToApiV2, hcClient);
    }

    /**
     * 查看ACL策略绑定的API列表
     *
     * 查看ACL策略绑定的API列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToAclPolicyV2Request 请求对象
     * @return ListApisBindedToAclPolicyV2Response
     */
    public ListApisBindedToAclPolicyV2Response listApisBindedToAclPolicyV2(ListApisBindedToAclPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisBindedToAclPolicyV2);
    }

    /**
     * 查看ACL策略绑定的API列表
     *
     * 查看ACL策略绑定的API列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToAclPolicyV2Request 请求对象
     * @return SyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response>
     */
    public SyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> listApisBindedToAclPolicyV2Invoker(
        ListApisBindedToAclPolicyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listApisBindedToAclPolicyV2, hcClient);
    }

    /**
     * 查看ACL策略未绑定的API列表
     *
     * 查看ACL策略未绑定的API列表，需要API已发布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisUnbindedToAclPolicyV2Request 请求对象
     * @return ListApisUnbindedToAclPolicyV2Response
     */
    public ListApisUnbindedToAclPolicyV2Response listApisUnbindedToAclPolicyV2(
        ListApisUnbindedToAclPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisUnbindedToAclPolicyV2);
    }

    /**
     * 查看ACL策略未绑定的API列表
     *
     * 查看ACL策略未绑定的API列表，需要API已发布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisUnbindedToAclPolicyV2Request 请求对象
     * @return SyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response>
     */
    public SyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> listApisUnbindedToAclPolicyV2Invoker(
        ListApisUnbindedToAclPolicyV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listApisUnbindedToAclPolicyV2, hcClient);
    }

    /**
     * 解除授权
     *
     * 解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelingAuthorizationV2Request 请求对象
     * @return CancelingAuthorizationV2Response
     */
    public CancelingAuthorizationV2Response cancelingAuthorizationV2(CancelingAuthorizationV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.cancelingAuthorizationV2);
    }

    /**
     * 解除授权
     *
     * 解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelingAuthorizationV2Request 请求对象
     * @return SyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response>
     */
    public SyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> cancelingAuthorizationV2Invoker(
        CancelingAuthorizationV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.cancelingAuthorizationV2, hcClient);
    }

    /**
     * APP授权
     *
     * APP创建成功后，还不能访问API，如果想要访问某个环境上的API，需要将该API在该环境上授权给APP。授权成功后，APP即可访问该环境上的这个API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizingAppsV2Request 请求对象
     * @return CreateAuthorizingAppsV2Response
     */
    public CreateAuthorizingAppsV2Response createAuthorizingAppsV2(CreateAuthorizingAppsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createAuthorizingAppsV2);
    }

    /**
     * APP授权
     *
     * APP创建成功后，还不能访问API，如果想要访问某个环境上的API，需要将该API在该环境上授权给APP。授权成功后，APP即可访问该环境上的这个API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizingAppsV2Request 请求对象
     * @return SyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response>
     */
    public SyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> createAuthorizingAppsV2Invoker(
        CreateAuthorizingAppsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createAuthorizingAppsV2, hcClient);
    }

    /**
     * 查看APP已绑定的API列表
     *
     * 查询APP已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToAppV2Request 请求对象
     * @return ListApisBindedToAppV2Response
     */
    public ListApisBindedToAppV2Response listApisBindedToAppV2(ListApisBindedToAppV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisBindedToAppV2);
    }

    /**
     * 查看APP已绑定的API列表
     *
     * 查询APP已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToAppV2Request 请求对象
     * @return SyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response>
     */
    public SyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> listApisBindedToAppV2Invoker(
        ListApisBindedToAppV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listApisBindedToAppV2, hcClient);
    }

    /**
     * 查看APP未绑定的API列表
     *
     * 查询指定环境上某个APP未绑定的API列表，包括自有API和从云市场购买的API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisUnbindedToAppV2Request 请求对象
     * @return ListApisUnbindedToAppV2Response
     */
    public ListApisUnbindedToAppV2Response listApisUnbindedToAppV2(ListApisUnbindedToAppV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listApisUnbindedToAppV2);
    }

    /**
     * 查看APP未绑定的API列表
     *
     * 查询指定环境上某个APP未绑定的API列表，包括自有API和从云市场购买的API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisUnbindedToAppV2Request 请求对象
     * @return SyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response>
     */
    public SyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2Invoker(
        ListApisUnbindedToAppV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listApisUnbindedToAppV2, hcClient);
    }

    /**
     * 查看API已绑定的APP列表
     *
     * 查询API绑定的APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsBindedToApiV2Request 请求对象
     * @return ListAppsBindedToApiV2Response
     */
    public ListAppsBindedToApiV2Response listAppsBindedToApiV2(ListAppsBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAppsBindedToApiV2);
    }

    /**
     * 查看API已绑定的APP列表
     *
     * 查询API绑定的APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsBindedToApiV2Request 请求对象
     * @return SyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response>
     */
    public SyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> listAppsBindedToApiV2Invoker(
        ListAppsBindedToApiV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listAppsBindedToApiV2, hcClient);
    }

    /**
     * 查看APP下路径冲突的api列表
     *
     * 查询指定APP下路径冲突的api列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDuplicateApisForAppV2Request 请求对象
     * @return ListDuplicateApisForAppV2Response
     */
    public ListDuplicateApisForAppV2Response listDuplicateApisForAppV2(ListDuplicateApisForAppV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listDuplicateApisForAppV2);
    }

    /**
     * 查看APP下路径冲突的api列表
     *
     * 查询指定APP下路径冲突的api列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDuplicateApisForAppV2Request 请求对象
     * @return SyncInvoker<ListDuplicateApisForAppV2Request, ListDuplicateApisForAppV2Response>
     */
    public SyncInvoker<ListDuplicateApisForAppV2Request, ListDuplicateApisForAppV2Response> listDuplicateApisForAppV2Invoker(
        ListDuplicateApisForAppV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listDuplicateApisForAppV2, hcClient);
    }

    /**
     * 设置用户成员
     *
     * - 设置应用的用户成员，为空数组时会清空已有应用成员列表
     * - 设置动作为全量更新非增量更新，应用的成员列表都会替换为当次请求的应用成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddUserToAppRequest 请求对象
     * @return AddUserToAppResponse
     */
    public AddUserToAppResponse addUserToApp(AddUserToAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.addUserToApp);
    }

    /**
     * 设置用户成员
     *
     * - 设置应用的用户成员，为空数组时会清空已有应用成员列表
     * - 设置动作为全量更新非增量更新，应用的成员列表都会替换为当次请求的应用成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddUserToAppRequest 请求对象
     * @return SyncInvoker<AddUserToAppRequest, AddUserToAppResponse>
     */
    public SyncInvoker<AddUserToAppRequest, AddUserToAppResponse> addUserToAppInvoker(AddUserToAppRequest request) {
        return new SyncInvoker<>(request, RomaMeta.addUserToApp, hcClient);
    }

    /**
     * 查询用户成员列表
     *
     * 查询用户成列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAuthUsersOfAppRequest 请求对象
     * @return CheckAuthUsersOfAppResponse
     */
    public CheckAuthUsersOfAppResponse checkAuthUsersOfApp(CheckAuthUsersOfAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkAuthUsersOfApp);
    }

    /**
     * 查询用户成员列表
     *
     * 查询用户成列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAuthUsersOfAppRequest 请求对象
     * @return SyncInvoker<CheckAuthUsersOfAppRequest, CheckAuthUsersOfAppResponse>
     */
    public SyncInvoker<CheckAuthUsersOfAppRequest, CheckAuthUsersOfAppResponse> checkAuthUsersOfAppInvoker(
        CheckAuthUsersOfAppRequest request) {
        return new SyncInvoker<>(request, RomaMeta.checkAuthUsersOfApp, hcClient);
    }

    /**
     * 查询候选用户成员
     *
     * 查询应用的候选用户成员列表,会过滤掉异常状态用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCanAuthUsersOfAppRequest 请求对象
     * @return CheckCanAuthUsersOfAppResponse
     */
    public CheckCanAuthUsersOfAppResponse checkCanAuthUsersOfApp(CheckCanAuthUsersOfAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkCanAuthUsersOfApp);
    }

    /**
     * 查询候选用户成员
     *
     * 查询应用的候选用户成员列表,会过滤掉异常状态用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCanAuthUsersOfAppRequest 请求对象
     * @return SyncInvoker<CheckCanAuthUsersOfAppRequest, CheckCanAuthUsersOfAppResponse>
     */
    public SyncInvoker<CheckCanAuthUsersOfAppRequest, CheckCanAuthUsersOfAppResponse> checkCanAuthUsersOfAppInvoker(
        CheckCanAuthUsersOfAppRequest request) {
        return new SyncInvoker<>(request, RomaMeta.checkCanAuthUsersOfApp, hcClient);
    }

    /**
     * 查询应用详情
     *
     * 查询应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckRomaAppDetailsRequest 请求对象
     * @return CheckRomaAppDetailsResponse
     */
    public CheckRomaAppDetailsResponse checkRomaAppDetails(CheckRomaAppDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkRomaAppDetails);
    }

    /**
     * 查询应用详情
     *
     * 查询应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckRomaAppDetailsRequest 请求对象
     * @return SyncInvoker<CheckRomaAppDetailsRequest, CheckRomaAppDetailsResponse>
     */
    public SyncInvoker<CheckRomaAppDetailsRequest, CheckRomaAppDetailsResponse> checkRomaAppDetailsInvoker(
        CheckRomaAppDetailsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.checkRomaAppDetails, hcClient);
    }

    /**
     * 查询应用密钥
     *
     * 查询应用密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckRomaAppSecretRequest 请求对象
     * @return CheckRomaAppSecretResponse
     */
    public CheckRomaAppSecretResponse checkRomaAppSecret(CheckRomaAppSecretRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkRomaAppSecret);
    }

    /**
     * 查询应用密钥
     *
     * 查询应用密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckRomaAppSecretRequest 请求对象
     * @return SyncInvoker<CheckRomaAppSecretRequest, CheckRomaAppSecretResponse>
     */
    public SyncInvoker<CheckRomaAppSecretRequest, CheckRomaAppSecretResponse> checkRomaAppSecretInvoker(
        CheckRomaAppSecretRequest request) {
        return new SyncInvoker<>(request, RomaMeta.checkRomaAppSecret, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRomaAppRequest 请求对象
     * @return CreateRomaAppResponse
     */
    public CreateRomaAppResponse createRomaApp(CreateRomaAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createRomaApp);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRomaAppRequest 请求对象
     * @return SyncInvoker<CreateRomaAppRequest, CreateRomaAppResponse>
     */
    public SyncInvoker<CreateRomaAppRequest, CreateRomaAppResponse> createRomaAppInvoker(CreateRomaAppRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createRomaApp, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除单个应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRomaAppRequest 请求对象
     * @return DeleteRomaAppResponse
     */
    public DeleteRomaAppResponse deleteRomaApp(DeleteRomaAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteRomaApp);
    }

    /**
     * 删除应用
     *
     * 删除单个应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRomaAppRequest 请求对象
     * @return SyncInvoker<DeleteRomaAppRequest, DeleteRomaAppResponse>
     */
    public SyncInvoker<DeleteRomaAppRequest, DeleteRomaAppResponse> deleteRomaAppInvoker(DeleteRomaAppRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteRomaApp, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表，支持条件查询，所有条件是并且的关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRomaAppRequest 请求对象
     * @return ListRomaAppResponse
     */
    public ListRomaAppResponse listRomaApp(ListRomaAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listRomaApp);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表，支持条件查询，所有条件是并且的关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRomaAppRequest 请求对象
     * @return SyncInvoker<ListRomaAppRequest, ListRomaAppResponse>
     */
    public SyncInvoker<ListRomaAppRequest, ListRomaAppResponse> listRomaAppInvoker(ListRomaAppRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listRomaApp, hcClient);
    }

    /**
     * 重置应用密钥
     *
     * 重置应用密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetRomaAppSecretRequest 请求对象
     * @return ResetRomaAppSecretResponse
     */
    public ResetRomaAppSecretResponse resetRomaAppSecret(ResetRomaAppSecretRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.resetRomaAppSecret);
    }

    /**
     * 重置应用密钥
     *
     * 重置应用密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetRomaAppSecretRequest 请求对象
     * @return SyncInvoker<ResetRomaAppSecretRequest, ResetRomaAppSecretResponse>
     */
    public SyncInvoker<ResetRomaAppSecretRequest, ResetRomaAppSecretResponse> resetRomaAppSecretInvoker(
        ResetRomaAppSecretRequest request) {
        return new SyncInvoker<>(request, RomaMeta.resetRomaAppSecret, hcClient);
    }

    /**
     * 更新应用
     *
     * 更新应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRomaAppRequest 请求对象
     * @return UpdateRomaAppResponse
     */
    public UpdateRomaAppResponse updateRomaApp(UpdateRomaAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateRomaApp);
    }

    /**
     * 更新应用
     *
     * 更新应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRomaAppRequest 请求对象
     * @return SyncInvoker<UpdateRomaAppRequest, UpdateRomaAppResponse>
     */
    public SyncInvoker<UpdateRomaAppRequest, UpdateRomaAppResponse> updateRomaAppInvoker(UpdateRomaAppRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateRomaApp, hcClient);
    }

    /**
     * 校验应用是否存在
     *
     * 校验指定条件的应用是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateRomaAppRequest 请求对象
     * @return ValidateRomaAppResponse
     */
    public ValidateRomaAppResponse validateRomaApp(ValidateRomaAppRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.validateRomaApp);
    }

    /**
     * 校验应用是否存在
     *
     * 校验指定条件的应用是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateRomaAppRequest 请求对象
     * @return SyncInvoker<ValidateRomaAppRequest, ValidateRomaAppResponse>
     */
    public SyncInvoker<ValidateRomaAppRequest, ValidateRomaAppResponse> validateRomaAppInvoker(
        ValidateRomaAppRequest request) {
        return new SyncInvoker<>(request, RomaMeta.validateRomaApp, hcClient);
    }

    /**
     * 查询作业进度
     *
     * 查询作业进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAssetJobStatusRequest 请求对象
     * @return CheckAssetJobStatusResponse
     */
    public CheckAssetJobStatusResponse checkAssetJobStatus(CheckAssetJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkAssetJobStatus);
    }

    /**
     * 查询作业进度
     *
     * 查询作业进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAssetJobStatusRequest 请求对象
     * @return SyncInvoker<CheckAssetJobStatusRequest, CheckAssetJobStatusResponse>
     */
    public SyncInvoker<CheckAssetJobStatusRequest, CheckAssetJobStatusResponse> checkAssetJobStatusInvoker(
        CheckAssetJobStatusRequest request) {
        return new SyncInvoker<>(request, RomaMeta.checkAssetJobStatus, hcClient);
    }

    /**
     * 批量删除资产
     *
     * 批量删除资产
     * - 创建批量删除指定条件的资产的作业任务
     * - 最大支持100个应用和任务
     * - 一个用户同一时刻只能创建一个资产删除作业任务，没有Running状态的作业任务存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetRequest 请求对象
     * @return DeleteAssetResponse
     */
    public DeleteAssetResponse deleteAsset(DeleteAssetRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteAsset);
    }

    /**
     * 批量删除资产
     *
     * 批量删除资产
     * - 创建批量删除指定条件的资产的作业任务
     * - 最大支持100个应用和任务
     * - 一个用户同一时刻只能创建一个资产删除作业任务，没有Running状态的作业任务存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetRequest 请求对象
     * @return SyncInvoker<DeleteAssetRequest, DeleteAssetResponse>
     */
    public SyncInvoker<DeleteAssetRequest, DeleteAssetResponse> deleteAssetInvoker(DeleteAssetRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteAsset, hcClient);
    }

    /**
     * 下载资产包
     *
     * - 导出作业执行成功后，通过该接口获取导出作业产生的资产包，仅能下载一次
     * - 可先压缩后存在数据库，下载后删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAssetArchiveRequest 请求对象
     * @return DownloadAssetArchiveResponse
     */
    public DownloadAssetArchiveResponse downloadAssetArchive(DownloadAssetArchiveRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.downloadAssetArchive);
    }

    /**
     * 下载资产包
     *
     * - 导出作业执行成功后，通过该接口获取导出作业产生的资产包，仅能下载一次
     * - 可先压缩后存在数据库，下载后删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAssetArchiveRequest 请求对象
     * @return SyncInvoker<DownloadAssetArchiveRequest, DownloadAssetArchiveResponse>
     */
    public SyncInvoker<DownloadAssetArchiveRequest, DownloadAssetArchiveResponse> downloadAssetArchiveInvoker(
        DownloadAssetArchiveRequest request) {
        return new SyncInvoker<>(request, RomaMeta.downloadAssetArchive, hcClient);
    }

    /**
     * 批量导出资产
     *
     * 批量导出资产
     * - 创建批量导出指定条件的资产的作业任务
     * - 最大支持100个应用和任务
     * - 一个用户同一时刻只能创建一个资产导出作业任务，没有Running状态的作业任务存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAssetRequest 请求对象
     * @return ExportAssetResponse
     */
    public ExportAssetResponse exportAsset(ExportAssetRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.exportAsset);
    }

    /**
     * 批量导出资产
     *
     * 批量导出资产
     * - 创建批量导出指定条件的资产的作业任务
     * - 最大支持100个应用和任务
     * - 一个用户同一时刻只能创建一个资产导出作业任务，没有Running状态的作业任务存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAssetRequest 请求对象
     * @return SyncInvoker<ExportAssetRequest, ExportAssetResponse>
     */
    public SyncInvoker<ExportAssetRequest, ExportAssetResponse> exportAssetInvoker(ExportAssetRequest request) {
        return new SyncInvoker<>(request, RomaMeta.exportAsset, hcClient);
    }

    /**
     * 导入资产
     *
     * - 创建导入资产作业任务，资产版本和具体哪些资产从资产内容里读取
     * - 最大支持100个应用和任务
     * - 一个用户同一时刻只能创建一个资产导入作业任务，没有Running状态的作业任务存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAssetRequest 请求对象
     * @return ImportAssetResponse
     */
    public ImportAssetResponse importAsset(ImportAssetRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.importAsset);
    }

    /**
     * 导入资产
     *
     * - 创建导入资产作业任务，资产版本和具体哪些资产从资产内容里读取
     * - 最大支持100个应用和任务
     * - 一个用户同一时刻只能创建一个资产导入作业任务，没有Running状态的作业任务存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAssetRequest 请求对象
     * @return SyncInvoker<ImportAssetRequest, ImportAssetResponse>
     */
    public SyncInvoker<ImportAssetRequest, ImportAssetResponse> importAssetInvoker(ImportAssetRequest request) {
        return new SyncInvoker<>(request, RomaMeta.importAsset, hcClient);
    }

    /**
     * 查询字典详情
     *
     * 查询字典详情,
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDictionaryRequest 请求对象
     * @return CheckDictionaryResponse
     */
    public CheckDictionaryResponse checkDictionary(CheckDictionaryRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkDictionary);
    }

    /**
     * 查询字典详情
     *
     * 查询字典详情,
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDictionaryRequest 请求对象
     * @return SyncInvoker<CheckDictionaryRequest, CheckDictionaryResponse>
     */
    public SyncInvoker<CheckDictionaryRequest, CheckDictionaryResponse> checkDictionaryInvoker(
        CheckDictionaryRequest request) {
        return new SyncInvoker<>(request, RomaMeta.checkDictionary, hcClient);
    }

    /**
     * 创建字典
     *
     * 创建字典
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDictionaryRequest 请求对象
     * @return CreateDictionaryResponse
     */
    public CreateDictionaryResponse createDictionary(CreateDictionaryRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createDictionary);
    }

    /**
     * 创建字典
     *
     * 创建字典
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDictionaryRequest 请求对象
     * @return SyncInvoker<CreateDictionaryRequest, CreateDictionaryResponse>
     */
    public SyncInvoker<CreateDictionaryRequest, CreateDictionaryResponse> createDictionaryInvoker(
        CreateDictionaryRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createDictionary, hcClient);
    }

    /**
     * 删除字典
     *
     * 删除单个字典，会同时删除该字典的所有子字典
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDictionaryRequest 请求对象
     * @return DeleteDictionaryResponse
     */
    public DeleteDictionaryResponse deleteDictionary(DeleteDictionaryRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteDictionary);
    }

    /**
     * 删除字典
     *
     * 删除单个字典，会同时删除该字典的所有子字典
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDictionaryRequest 请求对象
     * @return SyncInvoker<DeleteDictionaryRequest, DeleteDictionaryResponse>
     */
    public SyncInvoker<DeleteDictionaryRequest, DeleteDictionaryResponse> deleteDictionaryInvoker(
        DeleteDictionaryRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteDictionary, hcClient);
    }

    /**
     * 查询字典列表
     *
     * 查询字典列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDictionaryRequest 请求对象
     * @return ListDictionaryResponse
     */
    public ListDictionaryResponse listDictionary(ListDictionaryRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listDictionary);
    }

    /**
     * 查询字典列表
     *
     * 查询字典列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDictionaryRequest 请求对象
     * @return SyncInvoker<ListDictionaryRequest, ListDictionaryResponse>
     */
    public SyncInvoker<ListDictionaryRequest, ListDictionaryResponse> listDictionaryInvoker(
        ListDictionaryRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listDictionary, hcClient);
    }

    /**
     * 更新字典
     *
     * 更新字典
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDictionaryRequest 请求对象
     * @return UpdateDictionaryResponse
     */
    public UpdateDictionaryResponse updateDictionary(UpdateDictionaryRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateDictionary);
    }

    /**
     * 更新字典
     *
     * 更新字典
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDictionaryRequest 请求对象
     * @return SyncInvoker<UpdateDictionaryRequest, UpdateDictionaryResponse>
     */
    public SyncInvoker<UpdateDictionaryRequest, UpdateDictionaryResponse> updateDictionaryInvoker(
        UpdateDictionaryRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateDictionary, hcClient);
    }

    /**
     * 校验字典是否存在
     *
     * 校验指定条件的字典是否存在，支持字典名称和字典编码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateDictionaryRequest 请求对象
     * @return ValidateDictionaryResponse
     */
    public ValidateDictionaryResponse validateDictionary(ValidateDictionaryRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.validateDictionary);
    }

    /**
     * 校验字典是否存在
     *
     * 校验指定条件的字典是否存在，支持字典名称和字典编码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateDictionaryRequest 请求对象
     * @return SyncInvoker<ValidateDictionaryRequest, ValidateDictionaryResponse>
     */
    public SyncInvoker<ValidateDictionaryRequest, ValidateDictionaryResponse> validateDictionaryInvoker(
        ValidateDictionaryRequest request) {
        return new SyncInvoker<>(request, RomaMeta.validateDictionary, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 获取符合条件的服务实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckRomaInstanceListV2Request 请求对象
     * @return CheckRomaInstanceListV2Response
     */
    public CheckRomaInstanceListV2Response checkRomaInstanceListV2(CheckRomaInstanceListV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.checkRomaInstanceListV2);
    }

    /**
     * 查询实例列表
     *
     * 获取符合条件的服务实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckRomaInstanceListV2Request 请求对象
     * @return SyncInvoker<CheckRomaInstanceListV2Request, CheckRomaInstanceListV2Response>
     */
    public SyncInvoker<CheckRomaInstanceListV2Request, CheckRomaInstanceListV2Response> checkRomaInstanceListV2Invoker(
        CheckRomaInstanceListV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.checkRomaInstanceListV2, hcClient);
    }

    /**
     * 查询MQS实例列表
     *
     * 查询MQS实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMqsInstanceRequest 请求对象
     * @return ListMqsInstanceResponse
     */
    public ListMqsInstanceResponse listMqsInstance(ListMqsInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listMqsInstance);
    }

    /**
     * 查询MQS实例列表
     *
     * 查询MQS实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMqsInstanceRequest 请求对象
     * @return SyncInvoker<ListMqsInstanceRequest, ListMqsInstanceResponse>
     */
    public SyncInvoker<ListMqsInstanceRequest, ListMqsInstanceResponse> listMqsInstanceInvoker(
        ListMqsInstanceRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listMqsInstance, hcClient);
    }

    /**
     * 查询MQS实例详情
     *
     * 查询指定MQS实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMqsInstanceRequest 请求对象
     * @return ShowMqsInstanceResponse
     */
    public ShowMqsInstanceResponse showMqsInstance(ShowMqsInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showMqsInstance);
    }

    /**
     * 查询MQS实例详情
     *
     * 查询指定MQS实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMqsInstanceRequest 请求对象
     * @return SyncInvoker<ShowMqsInstanceRequest, ShowMqsInstanceResponse>
     */
    public SyncInvoker<ShowMqsInstanceRequest, ShowMqsInstanceResponse> showMqsInstanceInvoker(
        ShowMqsInstanceRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showMqsInstance, hcClient);
    }

    /**
     * 导出API
     *
     * 导出分组下API的定义信息，导出文件内容符合swagger标准规范。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportApiDefinitionsV2Request 请求对象
     * @return ExportApiDefinitionsV2Response
     */
    public ExportApiDefinitionsV2Response exportApiDefinitionsV2(ExportApiDefinitionsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.exportApiDefinitionsV2);
    }

    /**
     * 导出API
     *
     * 导出分组下API的定义信息，导出文件内容符合swagger标准规范。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportApiDefinitionsV2Request 请求对象
     * @return SyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response>
     */
    public SyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> exportApiDefinitionsV2Invoker(
        ExportApiDefinitionsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.exportApiDefinitionsV2, hcClient);
    }

    /**
     * 导出自定义后端API
     *
     * 导出自定义后端API，导出文件内容符合swagger标准规范。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportLiveDataApiDefinitionsV2Request 请求对象
     * @return ExportLiveDataApiDefinitionsV2Response
     */
    public ExportLiveDataApiDefinitionsV2Response exportLiveDataApiDefinitionsV2(
        ExportLiveDataApiDefinitionsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.exportLiveDataApiDefinitionsV2);
    }

    /**
     * 导出自定义后端API
     *
     * 导出自定义后端API，导出文件内容符合swagger标准规范。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportLiveDataApiDefinitionsV2Request 请求对象
     * @return SyncInvoker<ExportLiveDataApiDefinitionsV2Request, ExportLiveDataApiDefinitionsV2Response>
     */
    public SyncInvoker<ExportLiveDataApiDefinitionsV2Request, ExportLiveDataApiDefinitionsV2Response> exportLiveDataApiDefinitionsV2Invoker(
        ExportLiveDataApiDefinitionsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.exportLiveDataApiDefinitionsV2, hcClient);
    }

    /**
     * 导入API
     *
     * 导入API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考用户指南的“附录：前端API的Swagger扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportApiDefinitionsV2Request 请求对象
     * @return ImportApiDefinitionsV2Response
     */
    public ImportApiDefinitionsV2Response importApiDefinitionsV2(ImportApiDefinitionsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.importApiDefinitionsV2);
    }

    /**
     * 导入API
     *
     * 导入API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考用户指南的“附录：前端API的Swagger扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportApiDefinitionsV2Request 请求对象
     * @return SyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response>
     */
    public SyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> importApiDefinitionsV2Invoker(
        ImportApiDefinitionsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.importApiDefinitionsV2, hcClient);
    }

    /**
     * 导入自定义后端API
     *
     * 导入自定义后端API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考用户指南的“附录：后端API的Swagger扩展定义”章节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportLiveDataApiDefinitionsV2Request 请求对象
     * @return ImportLiveDataApiDefinitionsV2Response
     */
    public ImportLiveDataApiDefinitionsV2Response importLiveDataApiDefinitionsV2(
        ImportLiveDataApiDefinitionsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.importLiveDataApiDefinitionsV2);
    }

    /**
     * 导入自定义后端API
     *
     * 导入自定义后端API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考用户指南的“附录：后端API的Swagger扩展定义”章节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportLiveDataApiDefinitionsV2Request 请求对象
     * @return SyncInvoker<ImportLiveDataApiDefinitionsV2Request, ImportLiveDataApiDefinitionsV2Response>
     */
    public SyncInvoker<ImportLiveDataApiDefinitionsV2Request, ImportLiveDataApiDefinitionsV2Response> importLiveDataApiDefinitionsV2Invoker(
        ImportLiveDataApiDefinitionsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.importLiveDataApiDefinitionsV2, hcClient);
    }

    /**
     * 域名绑定SSL证书
     *
     * 域名绑定SSL证书。[目前暂时仅支持单个绑定,请求体当中的certificate_ids里面有且只能有一个证书ID](tag:hws,hws_hk,fcs,g42,Site)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateCertsV2Request 请求对象
     * @return BatchAssociateCertsV2Response
     */
    public BatchAssociateCertsV2Response batchAssociateCertsV2(BatchAssociateCertsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchAssociateCertsV2);
    }

    /**
     * 域名绑定SSL证书
     *
     * 域名绑定SSL证书。[目前暂时仅支持单个绑定,请求体当中的certificate_ids里面有且只能有一个证书ID](tag:hws,hws_hk,fcs,g42,Site)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateCertsV2Request 请求对象
     * @return SyncInvoker<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response>
     */
    public SyncInvoker<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response> batchAssociateCertsV2Invoker(
        BatchAssociateCertsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.batchAssociateCertsV2, hcClient);
    }

    /**
     * SSL证书绑定域名
     *
     * SSL证书绑定域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateDomainsV2Request 请求对象
     * @return BatchAssociateDomainsV2Response
     */
    public BatchAssociateDomainsV2Response batchAssociateDomainsV2(BatchAssociateDomainsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchAssociateDomainsV2);
    }

    /**
     * SSL证书绑定域名
     *
     * SSL证书绑定域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateDomainsV2Request 请求对象
     * @return SyncInvoker<BatchAssociateDomainsV2Request, BatchAssociateDomainsV2Response>
     */
    public SyncInvoker<BatchAssociateDomainsV2Request, BatchAssociateDomainsV2Response> batchAssociateDomainsV2Invoker(
        BatchAssociateDomainsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.batchAssociateDomainsV2, hcClient);
    }

    /**
     * 域名解绑SSL证书
     *
     * 域名解绑SSL证书。目前暂时仅支持单个解绑,请求体当中的certificate_ids里面有且只能有一个证书ID
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateCertsV2Request 请求对象
     * @return BatchDisassociateCertsV2Response
     */
    public BatchDisassociateCertsV2Response batchDisassociateCertsV2(BatchDisassociateCertsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDisassociateCertsV2);
    }

    /**
     * 域名解绑SSL证书
     *
     * 域名解绑SSL证书。目前暂时仅支持单个解绑,请求体当中的certificate_ids里面有且只能有一个证书ID
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateCertsV2Request 请求对象
     * @return SyncInvoker<BatchDisassociateCertsV2Request, BatchDisassociateCertsV2Response>
     */
    public SyncInvoker<BatchDisassociateCertsV2Request, BatchDisassociateCertsV2Response> batchDisassociateCertsV2Invoker(
        BatchDisassociateCertsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.batchDisassociateCertsV2, hcClient);
    }

    /**
     * SSL证书解绑域名
     *
     * SSL证书解绑域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateDomainsV2Request 请求对象
     * @return BatchDisassociateDomainsV2Response
     */
    public BatchDisassociateDomainsV2Response batchDisassociateDomainsV2(BatchDisassociateDomainsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDisassociateDomainsV2);
    }

    /**
     * SSL证书解绑域名
     *
     * SSL证书解绑域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateDomainsV2Request 请求对象
     * @return SyncInvoker<BatchDisassociateDomainsV2Request, BatchDisassociateDomainsV2Response>
     */
    public SyncInvoker<BatchDisassociateDomainsV2Request, BatchDisassociateDomainsV2Response> batchDisassociateDomainsV2Invoker(
        BatchDisassociateDomainsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.batchDisassociateDomainsV2, hcClient);
    }

    /**
     * 创建SSL证书
     *
     * 创建SSL证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateV2Request 请求对象
     * @return CreateCertificateV2Response
     */
    public CreateCertificateV2Response createCertificateV2(CreateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createCertificateV2);
    }

    /**
     * 创建SSL证书
     *
     * 创建SSL证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateV2Request 请求对象
     * @return SyncInvoker<CreateCertificateV2Request, CreateCertificateV2Response>
     */
    public SyncInvoker<CreateCertificateV2Request, CreateCertificateV2Response> createCertificateV2Invoker(
        CreateCertificateV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createCertificateV2, hcClient);
    }

    /**
     * 删除SSL证书
     *
     * 删除ssl证书接口,删除时只有没有关联域名的证书才能被删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateV2Request 请求对象
     * @return DeleteCertificateV2Response
     */
    public DeleteCertificateV2Response deleteCertificateV2(DeleteCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteCertificateV2);
    }

    /**
     * 删除SSL证书
     *
     * 删除ssl证书接口,删除时只有没有关联域名的证书才能被删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateV2Request 请求对象
     * @return SyncInvoker<DeleteCertificateV2Request, DeleteCertificateV2Response>
     */
    public SyncInvoker<DeleteCertificateV2Request, DeleteCertificateV2Response> deleteCertificateV2Invoker(
        DeleteCertificateV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteCertificateV2, hcClient);
    }

    /**
     * 获取SSL证书已绑定域名列表
     *
     * 获取SSL证书已绑定域名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedDomainsV2Request 请求对象
     * @return ListAttachedDomainsV2Response
     */
    public ListAttachedDomainsV2Response listAttachedDomainsV2(ListAttachedDomainsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listAttachedDomainsV2);
    }

    /**
     * 获取SSL证书已绑定域名列表
     *
     * 获取SSL证书已绑定域名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedDomainsV2Request 请求对象
     * @return SyncInvoker<ListAttachedDomainsV2Request, ListAttachedDomainsV2Response>
     */
    public SyncInvoker<ListAttachedDomainsV2Request, ListAttachedDomainsV2Response> listAttachedDomainsV2Invoker(
        ListAttachedDomainsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listAttachedDomainsV2, hcClient);
    }

    /**
     * 获取SSL证书列表
     *
     * 获取SSL证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesV2Request 请求对象
     * @return ListCertificatesV2Response
     */
    public ListCertificatesV2Response listCertificatesV2(ListCertificatesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listCertificatesV2);
    }

    /**
     * 获取SSL证书列表
     *
     * 获取SSL证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesV2Request 请求对象
     * @return SyncInvoker<ListCertificatesV2Request, ListCertificatesV2Response>
     */
    public SyncInvoker<ListCertificatesV2Request, ListCertificatesV2Response> listCertificatesV2Invoker(
        ListCertificatesV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listCertificatesV2, hcClient);
    }

    /**
     * 查看证书详情
     *
     * 查看证书详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfCertificateV2Request 请求对象
     * @return ShowDetailsOfCertificateV2Response
     */
    public ShowDetailsOfCertificateV2Response showDetailsOfCertificateV2(ShowDetailsOfCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfCertificateV2);
    }

    /**
     * 查看证书详情
     *
     * 查看证书详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfCertificateV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfCertificateV2Request, ShowDetailsOfCertificateV2Response>
     */
    public SyncInvoker<ShowDetailsOfCertificateV2Request, ShowDetailsOfCertificateV2Response> showDetailsOfCertificateV2Invoker(
        ShowDetailsOfCertificateV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfCertificateV2, hcClient);
    }

    /**
     * 修改SSL证书
     *
     * 修改SSL证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateV2Request 请求对象
     * @return UpdateCertificateV2Response
     */
    public UpdateCertificateV2Response updateCertificateV2(UpdateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateCertificateV2);
    }

    /**
     * 修改SSL证书
     *
     * 修改SSL证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateV2Request 请求对象
     * @return SyncInvoker<UpdateCertificateV2Request, UpdateCertificateV2Response>
     */
    public SyncInvoker<UpdateCertificateV2Request, UpdateCertificateV2Response> updateCertificateV2Invoker(
        UpdateCertificateV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateCertificateV2, hcClient);
    }

    /**
     * 添加后端实例
     *
     * 为指定的VPC通道添加后端实例
     * 
     * 若指定地址的后端实例已存在，则更新对应后端实例信息。若请求体中包含多个重复地址的后端实例定义，则使用第一个定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddingBackendInstancesV2Request 请求对象
     * @return AddingBackendInstancesV2Response
     */
    public AddingBackendInstancesV2Response addingBackendInstancesV2(AddingBackendInstancesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.addingBackendInstancesV2);
    }

    /**
     * 添加后端实例
     *
     * 为指定的VPC通道添加后端实例
     * 
     * 若指定地址的后端实例已存在，则更新对应后端实例信息。若请求体中包含多个重复地址的后端实例定义，则使用第一个定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddingBackendInstancesV2Request 请求对象
     * @return SyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response>
     */
    public SyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> addingBackendInstancesV2Invoker(
        AddingBackendInstancesV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.addingBackendInstancesV2, hcClient);
    }

    /**
     * 批量修改后端服务器状态不可用
     *
     * 批量修改后端服务器状态不可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisableMembersRequest 请求对象
     * @return BatchDisableMembersResponse
     */
    public BatchDisableMembersResponse batchDisableMembers(BatchDisableMembersRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchDisableMembers);
    }

    /**
     * 批量修改后端服务器状态不可用
     *
     * 批量修改后端服务器状态不可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisableMembersRequest 请求对象
     * @return SyncInvoker<BatchDisableMembersRequest, BatchDisableMembersResponse>
     */
    public SyncInvoker<BatchDisableMembersRequest, BatchDisableMembersResponse> batchDisableMembersInvoker(
        BatchDisableMembersRequest request) {
        return new SyncInvoker<>(request, RomaMeta.batchDisableMembers, hcClient);
    }

    /**
     * 批量修改后端服务器状态可用
     *
     * 批量修改后端服务器状态可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableMembersRequest 请求对象
     * @return BatchEnableMembersResponse
     */
    public BatchEnableMembersResponse batchEnableMembers(BatchEnableMembersRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.batchEnableMembers);
    }

    /**
     * 批量修改后端服务器状态可用
     *
     * 批量修改后端服务器状态可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableMembersRequest 请求对象
     * @return SyncInvoker<BatchEnableMembersRequest, BatchEnableMembersResponse>
     */
    public SyncInvoker<BatchEnableMembersRequest, BatchEnableMembersResponse> batchEnableMembersInvoker(
        BatchEnableMembersRequest request) {
        return new SyncInvoker<>(request, RomaMeta.batchEnableMembers, hcClient);
    }

    /**
     * 添加VPC通道后端服务器组
     *
     * 在服务集成中创建VPC通道后端服务器组，VPC通道后端实例可以选择是否关联后端实例服务器组，以便管理后端服务器节点。
     * 
     * 若指定名称的后端服务器组已存在，则更新对应后端服务器组信息。若请求体中包含多个重复名称的后端服务器定义，则使用第一个定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMemberGroupRequest 请求对象
     * @return CreateMemberGroupResponse
     */
    public CreateMemberGroupResponse createMemberGroup(CreateMemberGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createMemberGroup);
    }

    /**
     * 添加VPC通道后端服务器组
     *
     * 在服务集成中创建VPC通道后端服务器组，VPC通道后端实例可以选择是否关联后端实例服务器组，以便管理后端服务器节点。
     * 
     * 若指定名称的后端服务器组已存在，则更新对应后端服务器组信息。若请求体中包含多个重复名称的后端服务器定义，则使用第一个定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMemberGroupRequest 请求对象
     * @return SyncInvoker<CreateMemberGroupRequest, CreateMemberGroupResponse>
     */
    public SyncInvoker<CreateMemberGroupRequest, CreateMemberGroupResponse> createMemberGroupInvoker(
        CreateMemberGroupRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createMemberGroup, hcClient);
    }

    /**
     * 项目下创建VPC通道
     *
     * 创建相同的VPC通道关联到多个实例。同一个项目下VPC通道名称不可重复。注意：实例特性vpc_name_modifiable配置为off时才可使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectVpcChannelRequest 请求对象
     * @return CreateProjectVpcChannelResponse
     */
    public CreateProjectVpcChannelResponse createProjectVpcChannel(CreateProjectVpcChannelRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createProjectVpcChannel);
    }

    /**
     * 项目下创建VPC通道
     *
     * 创建相同的VPC通道关联到多个实例。同一个项目下VPC通道名称不可重复。注意：实例特性vpc_name_modifiable配置为off时才可使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectVpcChannelRequest 请求对象
     * @return SyncInvoker<CreateProjectVpcChannelRequest, CreateProjectVpcChannelResponse>
     */
    public SyncInvoker<CreateProjectVpcChannelRequest, CreateProjectVpcChannelResponse> createProjectVpcChannelInvoker(
        CreateProjectVpcChannelRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createProjectVpcChannel, hcClient);
    }

    /**
     * 项目下同步VPC通道
     *
     * 同步VPC通道到多个实例。注意：实例特性vpc_name_modifiable配置为off时才可使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectVpcChannelSyncsRequest 请求对象
     * @return CreateProjectVpcChannelSyncsResponse
     */
    public CreateProjectVpcChannelSyncsResponse createProjectVpcChannelSyncs(
        CreateProjectVpcChannelSyncsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createProjectVpcChannelSyncs);
    }

    /**
     * 项目下同步VPC通道
     *
     * 同步VPC通道到多个实例。注意：实例特性vpc_name_modifiable配置为off时才可使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectVpcChannelSyncsRequest 请求对象
     * @return SyncInvoker<CreateProjectVpcChannelSyncsRequest, CreateProjectVpcChannelSyncsResponse>
     */
    public SyncInvoker<CreateProjectVpcChannelSyncsRequest, CreateProjectVpcChannelSyncsResponse> createProjectVpcChannelSyncsInvoker(
        CreateProjectVpcChannelSyncsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.createProjectVpcChannelSyncs, hcClient);
    }

    /**
     * 创建VPC通道
     *
     * 在服务集成中创建连接私有VPC资源的通道，并在创建API时将后端节点配置为使用这些VPC通道，以便服务集成直接访问私有VPC资源。
     * &gt; 每个用户默认最多创建200个VPC通道，如需支持更多请联系技术支持调整配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcChannelV2Request 请求对象
     * @return CreateVpcChannelV2Response
     */
    public CreateVpcChannelV2Response createVpcChannelV2(CreateVpcChannelV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.createVpcChannelV2);
    }

    /**
     * 创建VPC通道
     *
     * 在服务集成中创建连接私有VPC资源的通道，并在创建API时将后端节点配置为使用这些VPC通道，以便服务集成直接访问私有VPC资源。
     * &gt; 每个用户默认最多创建200个VPC通道，如需支持更多请联系技术支持调整配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcChannelV2Request 请求对象
     * @return SyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response>
     */
    public SyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response> createVpcChannelV2Invoker(
        CreateVpcChannelV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.createVpcChannelV2, hcClient);
    }

    /**
     * 删除后端实例
     *
     * 删除指定VPC通道中的后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackendInstanceV2Request 请求对象
     * @return DeleteBackendInstanceV2Response
     */
    public DeleteBackendInstanceV2Response deleteBackendInstanceV2(DeleteBackendInstanceV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteBackendInstanceV2);
    }

    /**
     * 删除后端实例
     *
     * 删除指定VPC通道中的后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackendInstanceV2Request 请求对象
     * @return SyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response>
     */
    public SyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> deleteBackendInstanceV2Invoker(
        DeleteBackendInstanceV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteBackendInstanceV2, hcClient);
    }

    /**
     * 删除VPC通道后端服务器组
     *
     * 删除指定的VPC通道后端服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMemberGroupRequest 请求对象
     * @return DeleteMemberGroupResponse
     */
    public DeleteMemberGroupResponse deleteMemberGroup(DeleteMemberGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteMemberGroup);
    }

    /**
     * 删除VPC通道后端服务器组
     *
     * 删除指定的VPC通道后端服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMemberGroupRequest 请求对象
     * @return SyncInvoker<DeleteMemberGroupRequest, DeleteMemberGroupResponse>
     */
    public SyncInvoker<DeleteMemberGroupRequest, DeleteMemberGroupResponse> deleteMemberGroupInvoker(
        DeleteMemberGroupRequest request) {
        return new SyncInvoker<>(request, RomaMeta.deleteMemberGroup, hcClient);
    }

    /**
     * 删除VPC通道
     *
     * 删除指定的VPC通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcChannelV2Request 请求对象
     * @return DeleteVpcChannelV2Response
     */
    public DeleteVpcChannelV2Response deleteVpcChannelV2(DeleteVpcChannelV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.deleteVpcChannelV2);
    }

    /**
     * 删除VPC通道
     *
     * 删除指定的VPC通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcChannelV2Request 请求对象
     * @return SyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response>
     */
    public SyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> deleteVpcChannelV2Invoker(
        DeleteVpcChannelV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.deleteVpcChannelV2, hcClient);
    }

    /**
     * 查看后端实例列表
     *
     * 查看指定VPC通道的后端实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackendInstancesV2Request 请求对象
     * @return ListBackendInstancesV2Response
     */
    public ListBackendInstancesV2Response listBackendInstancesV2(ListBackendInstancesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listBackendInstancesV2);
    }

    /**
     * 查看后端实例列表
     *
     * 查看指定VPC通道的后端实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackendInstancesV2Request 请求对象
     * @return SyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response>
     */
    public SyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response> listBackendInstancesV2Invoker(
        ListBackendInstancesV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listBackendInstancesV2, hcClient);
    }

    /**
     * 查询VPC通道后端云服务组列表
     *
     * 查询VPC通道后端云服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMemberGroupsRequest 请求对象
     * @return ListMemberGroupsResponse
     */
    public ListMemberGroupsResponse listMemberGroups(ListMemberGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listMemberGroups);
    }

    /**
     * 查询VPC通道后端云服务组列表
     *
     * 查询VPC通道后端云服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMemberGroupsRequest 请求对象
     * @return SyncInvoker<ListMemberGroupsRequest, ListMemberGroupsResponse>
     */
    public SyncInvoker<ListMemberGroupsRequest, ListMemberGroupsResponse> listMemberGroupsInvoker(
        ListMemberGroupsRequest request) {
        return new SyncInvoker<>(request, RomaMeta.listMemberGroups, hcClient);
    }

    /**
     * 查询项目下所有实例的VPC通道列表
     *
     * 查询项目下所有实例的VPC通道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectVpcChannelsV2Request 请求对象
     * @return ListProjectVpcChannelsV2Response
     */
    public ListProjectVpcChannelsV2Response listProjectVpcChannelsV2(ListProjectVpcChannelsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listProjectVpcChannelsV2);
    }

    /**
     * 查询项目下所有实例的VPC通道列表
     *
     * 查询项目下所有实例的VPC通道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectVpcChannelsV2Request 请求对象
     * @return SyncInvoker<ListProjectVpcChannelsV2Request, ListProjectVpcChannelsV2Response>
     */
    public SyncInvoker<ListProjectVpcChannelsV2Request, ListProjectVpcChannelsV2Response> listProjectVpcChannelsV2Invoker(
        ListProjectVpcChannelsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listProjectVpcChannelsV2, hcClient);
    }

    /**
     * 查询VPC通道列表
     *
     * 查看VPC通道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcChannelsV2Request 请求对象
     * @return ListVpcChannelsV2Response
     */
    public ListVpcChannelsV2Response listVpcChannelsV2(ListVpcChannelsV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.listVpcChannelsV2);
    }

    /**
     * 查询VPC通道列表
     *
     * 查看VPC通道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcChannelsV2Request 请求对象
     * @return SyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response>
     */
    public SyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response> listVpcChannelsV2Invoker(
        ListVpcChannelsV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.listVpcChannelsV2, hcClient);
    }

    /**
     * 查看VPC通道后端服务器组详情
     *
     * 查看指定的VPC通道后端服务器组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfMemberGroupRequest 请求对象
     * @return ShowDetailsOfMemberGroupResponse
     */
    public ShowDetailsOfMemberGroupResponse showDetailsOfMemberGroup(ShowDetailsOfMemberGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfMemberGroup);
    }

    /**
     * 查看VPC通道后端服务器组详情
     *
     * 查看指定的VPC通道后端服务器组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfMemberGroupRequest 请求对象
     * @return SyncInvoker<ShowDetailsOfMemberGroupRequest, ShowDetailsOfMemberGroupResponse>
     */
    public SyncInvoker<ShowDetailsOfMemberGroupRequest, ShowDetailsOfMemberGroupResponse> showDetailsOfMemberGroupInvoker(
        ShowDetailsOfMemberGroupRequest request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfMemberGroup, hcClient);
    }

    /**
     * 查看VPC通道详情
     *
     * 查看指定的VPC通道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfVpcChannelV2Request 请求对象
     * @return ShowDetailsOfVpcChannelV2Response
     */
    public ShowDetailsOfVpcChannelV2Response showDetailsOfVpcChannelV2(ShowDetailsOfVpcChannelV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.showDetailsOfVpcChannelV2);
    }

    /**
     * 查看VPC通道详情
     *
     * 查看指定的VPC通道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfVpcChannelV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response>
     */
    public SyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> showDetailsOfVpcChannelV2Invoker(
        ShowDetailsOfVpcChannelV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.showDetailsOfVpcChannelV2, hcClient);
    }

    /**
     * 修改后端实例
     *
     * 更新指定的VPC通道的后端实例。更新时，使用传入的请求参数对对应云服务组的后端实例进行全量覆盖修改。若未指定修改的云服务器组，则进行全量覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackendInstancesV2Request 请求对象
     * @return UpdateBackendInstancesV2Response
     */
    public UpdateBackendInstancesV2Response updateBackendInstancesV2(UpdateBackendInstancesV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateBackendInstancesV2);
    }

    /**
     * 修改后端实例
     *
     * 更新指定的VPC通道的后端实例。更新时，使用传入的请求参数对对应云服务组的后端实例进行全量覆盖修改。若未指定修改的云服务器组，则进行全量覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackendInstancesV2Request 请求对象
     * @return SyncInvoker<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response>
     */
    public SyncInvoker<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response> updateBackendInstancesV2Invoker(
        UpdateBackendInstancesV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateBackendInstancesV2, hcClient);
    }

    /**
     * 修改VPC通道健康检查
     *
     * 修改VPC通道健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthCheckRequest 请求对象
     * @return UpdateHealthCheckResponse
     */
    public UpdateHealthCheckResponse updateHealthCheck(UpdateHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateHealthCheck);
    }

    /**
     * 修改VPC通道健康检查
     *
     * 修改VPC通道健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthCheckRequest 请求对象
     * @return SyncInvoker<UpdateHealthCheckRequest, UpdateHealthCheckResponse>
     */
    public SyncInvoker<UpdateHealthCheckRequest, UpdateHealthCheckResponse> updateHealthCheckInvoker(
        UpdateHealthCheckRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateHealthCheck, hcClient);
    }

    /**
     * 修改VPC通道后端服务器组
     *
     * 更新指定VPC通道后端服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberGroupRequest 请求对象
     * @return UpdateMemberGroupResponse
     */
    public UpdateMemberGroupResponse updateMemberGroup(UpdateMemberGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateMemberGroup);
    }

    /**
     * 修改VPC通道后端服务器组
     *
     * 更新指定VPC通道后端服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberGroupRequest 请求对象
     * @return SyncInvoker<UpdateMemberGroupRequest, UpdateMemberGroupResponse>
     */
    public SyncInvoker<UpdateMemberGroupRequest, UpdateMemberGroupResponse> updateMemberGroupInvoker(
        UpdateMemberGroupRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateMemberGroup, hcClient);
    }

    /**
     * 项目下批量修改VPC通道
     *
     * 项目下根据VPC通道名称批量修改多个多个实例下的VPC通道。若实例下不存在该VPC通道则创建。注意：实例特性vpc_name_modifiable配置为off时才可使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectVpcChannelRequest 请求对象
     * @return UpdateProjectVpcChannelResponse
     */
    public UpdateProjectVpcChannelResponse updateProjectVpcChannel(UpdateProjectVpcChannelRequest request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateProjectVpcChannel);
    }

    /**
     * 项目下批量修改VPC通道
     *
     * 项目下根据VPC通道名称批量修改多个多个实例下的VPC通道。若实例下不存在该VPC通道则创建。注意：实例特性vpc_name_modifiable配置为off时才可使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectVpcChannelRequest 请求对象
     * @return SyncInvoker<UpdateProjectVpcChannelRequest, UpdateProjectVpcChannelResponse>
     */
    public SyncInvoker<UpdateProjectVpcChannelRequest, UpdateProjectVpcChannelResponse> updateProjectVpcChannelInvoker(
        UpdateProjectVpcChannelRequest request) {
        return new SyncInvoker<>(request, RomaMeta.updateProjectVpcChannel, hcClient);
    }

    /**
     * 修改VPC通道
     *
     * 更新指定VPC通道的参数
     * 
     * 使用传入的后端服务器组列表对VPC通道进行全量覆盖，若后端服务器组列表为空，则会全量删除已有的服务器组；
     * 
     * 为保持兼容，传入的后端服务器列表为空时，不会删除已有的后端服务器，需要使用删除后端服务器接口进行删除；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcChannelV2Request 请求对象
     * @return UpdateVpcChannelV2Response
     */
    public UpdateVpcChannelV2Response updateVpcChannelV2(UpdateVpcChannelV2Request request) {
        return hcClient.syncInvokeHttp(request, RomaMeta.updateVpcChannelV2);
    }

    /**
     * 修改VPC通道
     *
     * 更新指定VPC通道的参数
     * 
     * 使用传入的后端服务器组列表对VPC通道进行全量覆盖，若后端服务器组列表为空，则会全量删除已有的服务器组；
     * 
     * 为保持兼容，传入的后端服务器列表为空时，不会删除已有的后端服务器，需要使用删除后端服务器接口进行删除；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcChannelV2Request 请求对象
     * @return SyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response>
     */
    public SyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> updateVpcChannelV2Invoker(
        UpdateVpcChannelV2Request request) {
        return new SyncInvoker<>(request, RomaMeta.updateVpcChannelV2, hcClient);
    }

}
