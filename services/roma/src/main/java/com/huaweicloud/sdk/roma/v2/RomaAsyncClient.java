package com.huaweicloud.sdk.roma.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
import com.huaweicloud.sdk.roma.v2.model.BatchAddDeviceToGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.BatchAddDeviceToGroupResponse;
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
import com.huaweicloud.sdk.roma.v2.model.ListBackendInstancesV2Request;
import com.huaweicloud.sdk.roma.v2.model.ListBackendInstancesV2Response;
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

import java.util.concurrent.CompletableFuture;

public class RomaAsyncClient {

    protected HcClient hcClient;

    public RomaAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RomaAsyncClient> newBuilder() {
        ClientBuilder<RomaAsyncClient> clientBuilder = new ClientBuilder<>(RomaAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 添加子设备到网关
     *
     * 添加子设备到网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddSubsetsToGatewayRequest 请求对象
     * @return CompletableFuture<AddSubsetsToGatewayResponse>
     */
    public CompletableFuture<AddSubsetsToGatewayResponse> addSubsetsToGatewayAsync(AddSubsetsToGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.addSubsetsToGateway);
    }

    /**
     * 添加子设备到网关
     *
     * 添加子设备到网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddSubsetsToGatewayRequest 请求对象
     * @return AsyncInvoker<AddSubsetsToGatewayRequest, AddSubsetsToGatewayResponse>
     */
    public AsyncInvoker<AddSubsetsToGatewayRequest, AddSubsetsToGatewayResponse> addSubsetsToGatewayAsyncInvoker(
        AddSubsetsToGatewayRequest request) {
        return new AsyncInvoker<AddSubsetsToGatewayRequest, AddSubsetsToGatewayResponse>(request,
            RomaMeta.addSubsetsToGateway, hcClient);
    }

    /**
     * 客户端配额绑定客户端应用列表
     *
     * 客户端配额绑定客户端应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateAppsForAppQuotaRequest 请求对象
     * @return CompletableFuture<AssociateAppsForAppQuotaResponse>
     */
    public CompletableFuture<AssociateAppsForAppQuotaResponse> associateAppsForAppQuotaAsync(
        AssociateAppsForAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.associateAppsForAppQuota);
    }

    /**
     * 客户端配额绑定客户端应用列表
     *
     * 客户端配额绑定客户端应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateAppsForAppQuotaRequest 请求对象
     * @return AsyncInvoker<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse>
     */
    public AsyncInvoker<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse> associateAppsForAppQuotaAsyncInvoker(
        AssociateAppsForAppQuotaRequest request) {
        return new AsyncInvoker<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse>(request,
            RomaMeta.associateAppsForAppQuota, hcClient);
    }

    /**
     * 绑定域名证书
     *
     * 如果创建API时，“定义API请求”使用HTTPS请求协议，那么在独立域名中需要添加SSL证书。
     * 本章节主要介绍为特定域名绑定证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateCertificateV2Request 请求对象
     * @return CompletableFuture<AssociateCertificateV2Response>
     */
    public CompletableFuture<AssociateCertificateV2Response> associateCertificateV2Async(
        AssociateCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.associateCertificateV2);
    }

    /**
     * 绑定域名证书
     *
     * 如果创建API时，“定义API请求”使用HTTPS请求协议，那么在独立域名中需要添加SSL证书。
     * 本章节主要介绍为特定域名绑定证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateCertificateV2Request 请求对象
     * @return AsyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response>
     */
    public AsyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response> associateCertificateV2AsyncInvoker(
        AssociateCertificateV2Request request) {
        return new AsyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response>(request,
            RomaMeta.associateCertificateV2, hcClient);
    }

    /**
     * 绑定域名
     *
     * 用户自定义的域名，需要CNAME到API分组的子域名上才能生效。 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateDomainV2Request 请求对象
     * @return CompletableFuture<AssociateDomainV2Response>
     */
    public CompletableFuture<AssociateDomainV2Response> associateDomainV2Async(AssociateDomainV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.associateDomainV2);
    }

    /**
     * 绑定域名
     *
     * 用户自定义的域名，需要CNAME到API分组的子域名上才能生效。 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateDomainV2Request 请求对象
     * @return AsyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response>
     */
    public AsyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response> associateDomainV2AsyncInvoker(
        AssociateDomainV2Request request) {
        return new AsyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response>(request,
            RomaMeta.associateDomainV2, hcClient);
    }

    /**
     * 绑定签名密钥
     *
     * 签名密钥创建后，需要绑定到API才能生效。
     * 
     * 将签名密钥绑定到API后，则ROMA Connect APIC请求后端服务时就会使用这个签名密钥进行加密签名，后端服务可以校验这个签名来验证请求来源。
     * 
     * 将指定的签名密钥绑定到一个或多个已发布的API上。同一个API发布到不同的环境可以绑定不同的签名密钥；一个API在发布到特定环境后只能绑定一个签名密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<AssociateSignatureKeyV2Response>
     */
    public CompletableFuture<AssociateSignatureKeyV2Response> associateSignatureKeyV2Async(
        AssociateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.associateSignatureKeyV2);
    }

    /**
     * 绑定签名密钥
     *
     * 签名密钥创建后，需要绑定到API才能生效。
     * 
     * 将签名密钥绑定到API后，则ROMA Connect APIC请求后端服务时就会使用这个签名密钥进行加密签名，后端服务可以校验这个签名来验证请求来源。
     * 
     * 将指定的签名密钥绑定到一个或多个已发布的API上。同一个API发布到不同的环境可以绑定不同的签名密钥；一个API在发布到特定环境后只能绑定一个签名密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response>
     */
    public AsyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> associateSignatureKeyV2AsyncInvoker(
        AssociateSignatureKeyV2Request request) {
        return new AsyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response>(request,
            RomaMeta.associateSignatureKeyV2, hcClient);
    }

    /**
     * 批量添加设备到设备分组
     *
     * 批量添加设备到设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddDeviceToGroupRequest 请求对象
     * @return CompletableFuture<BatchAddDeviceToGroupResponse>
     */
    public CompletableFuture<BatchAddDeviceToGroupResponse> batchAddDeviceToGroupAsync(
        BatchAddDeviceToGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchAddDeviceToGroup);
    }

    /**
     * 批量添加设备到设备分组
     *
     * 批量添加设备到设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddDeviceToGroupRequest 请求对象
     * @return AsyncInvoker<BatchAddDeviceToGroupRequest, BatchAddDeviceToGroupResponse>
     */
    public AsyncInvoker<BatchAddDeviceToGroupRequest, BatchAddDeviceToGroupResponse> batchAddDeviceToGroupAsyncInvoker(
        BatchAddDeviceToGroupRequest request) {
        return new AsyncInvoker<BatchAddDeviceToGroupRequest, BatchAddDeviceToGroupResponse>(request,
            RomaMeta.batchAddDeviceToGroup, hcClient);
    }

    /**
     * 批量删除设备
     *
     * 批量删除设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteDevicesRequest 请求对象
     * @return CompletableFuture<BatchDeleteDevicesResponse>
     */
    public CompletableFuture<BatchDeleteDevicesResponse> batchDeleteDevicesAsync(BatchDeleteDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchDeleteDevices);
    }

    /**
     * 批量删除设备
     *
     * 批量删除设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteDevicesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse>
     */
    public AsyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> batchDeleteDevicesAsyncInvoker(
        BatchDeleteDevicesRequest request) {
        return new AsyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse>(request,
            RomaMeta.batchDeleteDevices, hcClient);
    }

    /**
     * 批量删除Topic
     *
     * 批量删除Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteMqsInstanceTopicRequest 请求对象
     * @return CompletableFuture<BatchDeleteMqsInstanceTopicResponse>
     */
    public CompletableFuture<BatchDeleteMqsInstanceTopicResponse> batchDeleteMqsInstanceTopicAsync(
        BatchDeleteMqsInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchDeleteMqsInstanceTopic);
    }

    /**
     * 批量删除Topic
     *
     * 批量删除Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteMqsInstanceTopicRequest 请求对象
     * @return AsyncInvoker<BatchDeleteMqsInstanceTopicRequest, BatchDeleteMqsInstanceTopicResponse>
     */
    public AsyncInvoker<BatchDeleteMqsInstanceTopicRequest, BatchDeleteMqsInstanceTopicResponse> batchDeleteMqsInstanceTopicAsyncInvoker(
        BatchDeleteMqsInstanceTopicRequest request) {
        return new AsyncInvoker<BatchDeleteMqsInstanceTopicRequest, BatchDeleteMqsInstanceTopicResponse>(request,
            RomaMeta.batchDeleteMqsInstanceTopic, hcClient);
    }

    /**
     * 批量删除规则
     *
     * 批量删除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteRulesRequest 请求对象
     * @return CompletableFuture<BatchDeleteRulesResponse>
     */
    public CompletableFuture<BatchDeleteRulesResponse> batchDeleteRulesAsync(BatchDeleteRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchDeleteRules);
    }

    /**
     * 批量删除规则
     *
     * 批量删除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteRulesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteRulesRequest, BatchDeleteRulesResponse>
     */
    public AsyncInvoker<BatchDeleteRulesRequest, BatchDeleteRulesResponse> batchDeleteRulesAsyncInvoker(
        BatchDeleteRulesRequest request) {
        return new AsyncInvoker<BatchDeleteRulesRequest, BatchDeleteRulesResponse>(request, RomaMeta.batchDeleteRules,
            hcClient);
    }

    /**
     * 设备批量下线
     *
     * 设备批量下线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchFreezeDevicesRequest 请求对象
     * @return CompletableFuture<BatchFreezeDevicesResponse>
     */
    public CompletableFuture<BatchFreezeDevicesResponse> batchFreezeDevicesAsync(BatchFreezeDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchFreezeDevices);
    }

    /**
     * 设备批量下线
     *
     * 设备批量下线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchFreezeDevicesRequest 请求对象
     * @return AsyncInvoker<BatchFreezeDevicesRequest, BatchFreezeDevicesResponse>
     */
    public AsyncInvoker<BatchFreezeDevicesRequest, BatchFreezeDevicesResponse> batchFreezeDevicesAsyncInvoker(
        BatchFreezeDevicesRequest request) {
        return new AsyncInvoker<BatchFreezeDevicesRequest, BatchFreezeDevicesResponse>(request,
            RomaMeta.batchFreezeDevices, hcClient);
    }

    /**
     * 批量启动\\停止任务
     *
     * 批量启动\\停止任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStartOrStopTasksRequest 请求对象
     * @return CompletableFuture<BatchStartOrStopTasksResponse>
     */
    public CompletableFuture<BatchStartOrStopTasksResponse> batchStartOrStopTasksAsync(
        BatchStartOrStopTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchStartOrStopTasks);
    }

    /**
     * 批量启动\\停止任务
     *
     * 批量启动\\停止任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStartOrStopTasksRequest 请求对象
     * @return AsyncInvoker<BatchStartOrStopTasksRequest, BatchStartOrStopTasksResponse>
     */
    public AsyncInvoker<BatchStartOrStopTasksRequest, BatchStartOrStopTasksResponse> batchStartOrStopTasksAsyncInvoker(
        BatchStartOrStopTasksRequest request) {
        return new AsyncInvoker<BatchStartOrStopTasksRequest, BatchStartOrStopTasksResponse>(request,
            RomaMeta.batchStartOrStopTasks, hcClient);
    }

    /**
     * 校验自定义后端API定义
     *
     * 校验自定义后端API定义。校验自定义后端API的路径或名称是否已存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckLivedataApisV2Request 请求对象
     * @return CompletableFuture<CheckLivedataApisV2Response>
     */
    public CompletableFuture<CheckLivedataApisV2Response> checkLivedataApisV2Async(CheckLivedataApisV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.checkLivedataApisV2);
    }

    /**
     * 校验自定义后端API定义
     *
     * 校验自定义后端API定义。校验自定义后端API的路径或名称是否已存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckLivedataApisV2Request 请求对象
     * @return AsyncInvoker<CheckLivedataApisV2Request, CheckLivedataApisV2Response>
     */
    public AsyncInvoker<CheckLivedataApisV2Request, CheckLivedataApisV2Response> checkLivedataApisV2AsyncInvoker(
        CheckLivedataApisV2Request request) {
        return new AsyncInvoker<CheckLivedataApisV2Request, CheckLivedataApisV2Response>(request,
            RomaMeta.checkLivedataApisV2, hcClient);
    }

    /**
     * 设备数量统计
     *
     * 设备数量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountDevicesRequest 请求对象
     * @return CompletableFuture<CountDevicesResponse>
     */
    public CompletableFuture<CountDevicesResponse> countDevicesAsync(CountDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.countDevices);
    }

    /**
     * 设备数量统计
     *
     * 设备数量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountDevicesRequest 请求对象
     * @return AsyncInvoker<CountDevicesRequest, CountDevicesResponse>
     */
    public AsyncInvoker<CountDevicesRequest, CountDevicesResponse> countDevicesAsyncInvoker(
        CountDevicesRequest request) {
        return new AsyncInvoker<CountDevicesRequest, CountDevicesResponse>(request, RomaMeta.countDevices, hcClient);
    }

    /**
     * 统计不同类型不同状态任务数量
     *
     * 统计不同类型不同状态任务数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountTasksRequest 请求对象
     * @return CompletableFuture<CountTasksResponse>
     */
    public CompletableFuture<CountTasksResponse> countTasksAsync(CountTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.countTasks);
    }

    /**
     * 统计不同类型不同状态任务数量
     *
     * 统计不同类型不同状态任务数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountTasksRequest 请求对象
     * @return AsyncInvoker<CountTasksRequest, CountTasksResponse>
     */
    public AsyncInvoker<CountTasksRequest, CountTasksResponse> countTasksAsyncInvoker(CountTasksRequest request) {
        return new AsyncInvoker<CountTasksRequest, CountTasksResponse>(request, RomaMeta.countTasks, hcClient);
    }

    /**
     * 自动生成APP Code
     *
     * 创建App Code时，可以不指定具体值，由后台自动生成随机字符串填充。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppCodeAutoV2Request 请求对象
     * @return CompletableFuture<CreateAppCodeAutoV2Response>
     */
    public CompletableFuture<CreateAppCodeAutoV2Response> createAppCodeAutoV2Async(CreateAppCodeAutoV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createAppCodeAutoV2);
    }

    /**
     * 自动生成APP Code
     *
     * 创建App Code时，可以不指定具体值，由后台自动生成随机字符串填充。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppCodeAutoV2Request 请求对象
     * @return AsyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response>
     */
    public AsyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> createAppCodeAutoV2AsyncInvoker(
        CreateAppCodeAutoV2Request request) {
        return new AsyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response>(request,
            RomaMeta.createAppCodeAutoV2, hcClient);
    }

    /**
     * 创建APP Code
     *
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppCodeV2Request 请求对象
     * @return CompletableFuture<CreateAppCodeV2Response>
     */
    public CompletableFuture<CreateAppCodeV2Response> createAppCodeV2Async(CreateAppCodeV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createAppCodeV2);
    }

    /**
     * 创建APP Code
     *
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppCodeV2Request 请求对象
     * @return AsyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response>
     */
    public AsyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response> createAppCodeV2AsyncInvoker(
        CreateAppCodeV2Request request) {
        return new AsyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response>(request, RomaMeta.createAppCodeV2,
            hcClient);
    }

    /**
     * 创建应用配置
     *
     * 创建应用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppConfigV2Request 请求对象
     * @return CompletableFuture<CreateAppConfigV2Response>
     */
    public CompletableFuture<CreateAppConfigV2Response> createAppConfigV2Async(CreateAppConfigV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createAppConfigV2);
    }

    /**
     * 创建应用配置
     *
     * 创建应用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppConfigV2Request 请求对象
     * @return AsyncInvoker<CreateAppConfigV2Request, CreateAppConfigV2Response>
     */
    public AsyncInvoker<CreateAppConfigV2Request, CreateAppConfigV2Response> createAppConfigV2AsyncInvoker(
        CreateAppConfigV2Request request) {
        return new AsyncInvoker<CreateAppConfigV2Request, CreateAppConfigV2Response>(request,
            RomaMeta.createAppConfigV2, hcClient);
    }

    /**
     * 创建客户端配额
     *
     * 创建客户端配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppQuotaRequest 请求对象
     * @return CompletableFuture<CreateAppQuotaResponse>
     */
    public CompletableFuture<CreateAppQuotaResponse> createAppQuotaAsync(CreateAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createAppQuota);
    }

    /**
     * 创建客户端配额
     *
     * 创建客户端配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppQuotaRequest 请求对象
     * @return AsyncInvoker<CreateAppQuotaRequest, CreateAppQuotaResponse>
     */
    public AsyncInvoker<CreateAppQuotaRequest, CreateAppQuotaResponse> createAppQuotaAsyncInvoker(
        CreateAppQuotaRequest request) {
        return new AsyncInvoker<CreateAppQuotaRequest, CreateAppQuotaResponse>(request, RomaMeta.createAppQuota,
            hcClient);
    }

    /**
     * 创建命令
     *
     * 创建命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCommandRequest 请求对象
     * @return CompletableFuture<CreateCommandResponse>
     */
    public CompletableFuture<CreateCommandResponse> createCommandAsync(CreateCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createCommand);
    }

    /**
     * 创建命令
     *
     * 创建命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCommandRequest 请求对象
     * @return AsyncInvoker<CreateCommandRequest, CreateCommandResponse>
     */
    public AsyncInvoker<CreateCommandRequest, CreateCommandResponse> createCommandAsyncInvoker(
        CreateCommandRequest request) {
        return new AsyncInvoker<CreateCommandRequest, CreateCommandResponse>(request, RomaMeta.createCommand, hcClient);
    }

    /**
     * 创建普通任务
     *
     * 创建普通任务(区别于组合任务)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCommonTaskRequest 请求对象
     * @return CompletableFuture<CreateCommonTaskResponse>
     */
    public CompletableFuture<CreateCommonTaskResponse> createCommonTaskAsync(CreateCommonTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createCommonTask);
    }

    /**
     * 创建普通任务
     *
     * 创建普通任务(区别于组合任务)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCommonTaskRequest 请求对象
     * @return AsyncInvoker<CreateCommonTaskRequest, CreateCommonTaskResponse>
     */
    public AsyncInvoker<CreateCommonTaskRequest, CreateCommonTaskResponse> createCommonTaskAsyncInvoker(
        CreateCommonTaskRequest request) {
        return new AsyncInvoker<CreateCommonTaskRequest, CreateCommonTaskResponse>(request, RomaMeta.createCommonTask,
            hcClient);
    }

    /**
     * 创建自定义认证
     *
     * 创建自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCustomAuthorizerV2Request 请求对象
     * @return CompletableFuture<CreateCustomAuthorizerV2Response>
     */
    public CompletableFuture<CreateCustomAuthorizerV2Response> createCustomAuthorizerV2Async(
        CreateCustomAuthorizerV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createCustomAuthorizerV2);
    }

    /**
     * 创建自定义认证
     *
     * 创建自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCustomAuthorizerV2Request 请求对象
     * @return AsyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response>
     */
    public AsyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> createCustomAuthorizerV2AsyncInvoker(
        CreateCustomAuthorizerV2Request request) {
        return new AsyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response>(request,
            RomaMeta.createCustomAuthorizerV2, hcClient);
    }

    /**
     * 创建数据源
     *
     * 创建数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatasourceInfoRequest 请求对象
     * @return CompletableFuture<CreateDatasourceInfoResponse>
     */
    public CompletableFuture<CreateDatasourceInfoResponse> createDatasourceInfoAsync(
        CreateDatasourceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createDatasourceInfo);
    }

    /**
     * 创建数据源
     *
     * 创建数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatasourceInfoRequest 请求对象
     * @return AsyncInvoker<CreateDatasourceInfoRequest, CreateDatasourceInfoResponse>
     */
    public AsyncInvoker<CreateDatasourceInfoRequest, CreateDatasourceInfoResponse> createDatasourceInfoAsyncInvoker(
        CreateDatasourceInfoRequest request) {
        return new AsyncInvoker<CreateDatasourceInfoRequest, CreateDatasourceInfoResponse>(request,
            RomaMeta.createDatasourceInfo, hcClient);
    }

    /**
     * 添加目标数据源
     *
     * 添加目标数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDestinationRequest 请求对象
     * @return CompletableFuture<CreateDestinationResponse>
     */
    public CompletableFuture<CreateDestinationResponse> createDestinationAsync(CreateDestinationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createDestination);
    }

    /**
     * 添加目标数据源
     *
     * 添加目标数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDestinationRequest 请求对象
     * @return AsyncInvoker<CreateDestinationRequest, CreateDestinationResponse>
     */
    public AsyncInvoker<CreateDestinationRequest, CreateDestinationResponse> createDestinationAsyncInvoker(
        CreateDestinationRequest request) {
        return new AsyncInvoker<CreateDestinationRequest, CreateDestinationResponse>(request,
            RomaMeta.createDestination, hcClient);
    }

    /**
     * 创建设备
     *
     * 创建设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeviceRequest 请求对象
     * @return CompletableFuture<CreateDeviceResponse>
     */
    public CompletableFuture<CreateDeviceResponse> createDeviceAsync(CreateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createDevice);
    }

    /**
     * 创建设备
     *
     * 创建设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeviceRequest 请求对象
     * @return AsyncInvoker<CreateDeviceRequest, CreateDeviceResponse>
     */
    public AsyncInvoker<CreateDeviceRequest, CreateDeviceResponse> createDeviceAsyncInvoker(
        CreateDeviceRequest request) {
        return new AsyncInvoker<CreateDeviceRequest, CreateDeviceResponse>(request, RomaMeta.createDevice, hcClient);
    }

    /**
     * 创建设备分组
     *
     * 创建设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeviceGroupRequest 请求对象
     * @return CompletableFuture<CreateDeviceGroupResponse>
     */
    public CompletableFuture<CreateDeviceGroupResponse> createDeviceGroupAsync(CreateDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createDeviceGroup);
    }

    /**
     * 创建设备分组
     *
     * 创建设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeviceGroupRequest 请求对象
     * @return AsyncInvoker<CreateDeviceGroupRequest, CreateDeviceGroupResponse>
     */
    public AsyncInvoker<CreateDeviceGroupRequest, CreateDeviceGroupResponse> createDeviceGroupAsyncInvoker(
        CreateDeviceGroupRequest request) {
        return new AsyncInvoker<CreateDeviceGroupRequest, CreateDeviceGroupResponse>(request,
            RomaMeta.createDeviceGroup, hcClient);
    }

    /**
     * 创建调度计划
     *
     * 创建调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDispatchesRequest 请求对象
     * @return CompletableFuture<CreateDispatchesResponse>
     */
    public CompletableFuture<CreateDispatchesResponse> createDispatchesAsync(CreateDispatchesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createDispatches);
    }

    /**
     * 创建调度计划
     *
     * 创建调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDispatchesRequest 请求对象
     * @return AsyncInvoker<CreateDispatchesRequest, CreateDispatchesResponse>
     */
    public AsyncInvoker<CreateDispatchesRequest, CreateDispatchesResponse> createDispatchesAsyncInvoker(
        CreateDispatchesRequest request) {
        return new AsyncInvoker<CreateDispatchesRequest, CreateDispatchesResponse>(request, RomaMeta.createDispatches,
            hcClient);
    }

    /**
     * 创建环境
     *
     * 在实际的生产中，API提供者可能有多个环境，如开发环境、测试环境、生产环境等，用户可以自由将API发布到某个环境，供调用者调用。
     * 
     * 对于不同的环境，API的版本、请求地址甚至于包括请求消息等均有可能不同。如：某个API，v1.0的版本为稳定版本，发布到了生产环境供生产使用，同时，该API正处于迭代中，v1.1的版本是开发人员交付测试人员进行测试的版本，发布在测试环境上，而v1.2的版本目前开发团队正处于开发过程中，可以发布到开发环境进行自测等。
     * 
     * 为此，ROMA Connect APIC提供多环境管理功能，使租户能够最大化的模拟实际场景，低成本的接入ROMA Connect APIC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvironmentV2Request 请求对象
     * @return CompletableFuture<CreateEnvironmentV2Response>
     */
    public CompletableFuture<CreateEnvironmentV2Response> createEnvironmentV2Async(CreateEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createEnvironmentV2);
    }

    /**
     * 创建环境
     *
     * 在实际的生产中，API提供者可能有多个环境，如开发环境、测试环境、生产环境等，用户可以自由将API发布到某个环境，供调用者调用。
     * 
     * 对于不同的环境，API的版本、请求地址甚至于包括请求消息等均有可能不同。如：某个API，v1.0的版本为稳定版本，发布到了生产环境供生产使用，同时，该API正处于迭代中，v1.1的版本是开发人员交付测试人员进行测试的版本，发布在测试环境上，而v1.2的版本目前开发团队正处于开发过程中，可以发布到开发环境进行自测等。
     * 
     * 为此，ROMA Connect APIC提供多环境管理功能，使租户能够最大化的模拟实际场景，低成本的接入ROMA Connect APIC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvironmentV2Request 请求对象
     * @return AsyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response>
     */
    public AsyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response> createEnvironmentV2AsyncInvoker(
        CreateEnvironmentV2Request request) {
        return new AsyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response>(request,
            RomaMeta.createEnvironmentV2, hcClient);
    }

    /**
     * 新建变量
     *
     * 将API发布到不同的环境后，对于不同的环境，可能会有不同的环境变量，比如，API的服务部署地址，请求的版本号等。
     * 
     * 用户可以定义不同的环境变量，用户在定义API时，在API的定义中使用这些变量，当调用API时，ROMA Connect APIC会将这些变量替换成真实的变量值，以达到不同环境的区分效果。
     * 
     * 环境变量定义在API分组上，该分组下的所有API都可以使用这些变量。
     * &gt; 1.环境变量的变量名称必须保持唯一，即一个分组在同一个环境上不能有两个同名的变量
     *   2.环境变量区分大小写，即变量ABC与变量abc是两个不同的变量
     *   3.设置了环境变量后，使用到该变量的API的调试功能将不可使用。
     *   4.定义了环境变量后，使用到环境变量的地方应该以对称的#标识环境变量，当API发布到相应的环境后，会对环境变量的值进行替换，如：定义的API的URL为：https://#address#:8080，环境变量address在RELEASE环境上的值为：192.168.1.5，则API发布到RELEASE环境后的真实的URL为：https://192.168.1.5:8080。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<CreateEnvironmentVariableV2Response>
     */
    public CompletableFuture<CreateEnvironmentVariableV2Response> createEnvironmentVariableV2Async(
        CreateEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createEnvironmentVariableV2);
    }

    /**
     * 新建变量
     *
     * 将API发布到不同的环境后，对于不同的环境，可能会有不同的环境变量，比如，API的服务部署地址，请求的版本号等。
     * 
     * 用户可以定义不同的环境变量，用户在定义API时，在API的定义中使用这些变量，当调用API时，ROMA Connect APIC会将这些变量替换成真实的变量值，以达到不同环境的区分效果。
     * 
     * 环境变量定义在API分组上，该分组下的所有API都可以使用这些变量。
     * &gt; 1.环境变量的变量名称必须保持唯一，即一个分组在同一个环境上不能有两个同名的变量
     *   2.环境变量区分大小写，即变量ABC与变量abc是两个不同的变量
     *   3.设置了环境变量后，使用到该变量的API的调试功能将不可使用。
     *   4.定义了环境变量后，使用到环境变量的地方应该以对称的#标识环境变量，当API发布到相应的环境后，会对环境变量的值进行替换，如：定义的API的URL为：https://#address#:8080，环境变量address在RELEASE环境上的值为：192.168.1.5，则API发布到RELEASE环境后的真实的URL为：https://192.168.1.5:8080。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvironmentVariableV2Request 请求对象
     * @return AsyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response>
     */
    public AsyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> createEnvironmentVariableV2AsyncInvoker(
        CreateEnvironmentVariableV2Request request) {
        return new AsyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response>(request,
            RomaMeta.createEnvironmentVariableV2, hcClient);
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
     * @param CreateFeatureV2Request 请求对象
     * @return CompletableFuture<CreateFeatureV2Response>
     */
    public CompletableFuture<CreateFeatureV2Response> createFeatureV2Async(CreateFeatureV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createFeatureV2);
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
     * @param CreateFeatureV2Request 请求对象
     * @return AsyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response>
     */
    public AsyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response> createFeatureV2AsyncInvoker(
        CreateFeatureV2Request request) {
        return new AsyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response>(request, RomaMeta.createFeatureV2,
            hcClient);
    }

    /**
     * 创建后端API脚本
     *
     * 在某个实例中创建后端API脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLiveDataApiScriptV2Request 请求对象
     * @return CompletableFuture<CreateLiveDataApiScriptV2Response>
     */
    public CompletableFuture<CreateLiveDataApiScriptV2Response> createLiveDataApiScriptV2Async(
        CreateLiveDataApiScriptV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createLiveDataApiScriptV2);
    }

    /**
     * 创建后端API脚本
     *
     * 在某个实例中创建后端API脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLiveDataApiScriptV2Request 请求对象
     * @return AsyncInvoker<CreateLiveDataApiScriptV2Request, CreateLiveDataApiScriptV2Response>
     */
    public AsyncInvoker<CreateLiveDataApiScriptV2Request, CreateLiveDataApiScriptV2Response> createLiveDataApiScriptV2AsyncInvoker(
        CreateLiveDataApiScriptV2Request request) {
        return new AsyncInvoker<CreateLiveDataApiScriptV2Request, CreateLiveDataApiScriptV2Response>(request,
            RomaMeta.createLiveDataApiScriptV2, hcClient);
    }

    /**
     * 创建后端API
     *
     * 在某个实例中创建后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLiveDataApiV2Request 请求对象
     * @return CompletableFuture<CreateLiveDataApiV2Response>
     */
    public CompletableFuture<CreateLiveDataApiV2Response> createLiveDataApiV2Async(CreateLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createLiveDataApiV2);
    }

    /**
     * 创建后端API
     *
     * 在某个实例中创建后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLiveDataApiV2Request 请求对象
     * @return AsyncInvoker<CreateLiveDataApiV2Request, CreateLiveDataApiV2Response>
     */
    public AsyncInvoker<CreateLiveDataApiV2Request, CreateLiveDataApiV2Response> createLiveDataApiV2AsyncInvoker(
        CreateLiveDataApiV2Request request) {
        return new AsyncInvoker<CreateLiveDataApiV2Request, CreateLiveDataApiV2Response>(request,
            RomaMeta.createLiveDataApiV2, hcClient);
    }

    /**
     * 创建Topic
     *
     * 创建Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMqsInstanceTopicRequest 请求对象
     * @return CompletableFuture<CreateMqsInstanceTopicResponse>
     */
    public CompletableFuture<CreateMqsInstanceTopicResponse> createMqsInstanceTopicAsync(
        CreateMqsInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createMqsInstanceTopic);
    }

    /**
     * 创建Topic
     *
     * 创建Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMqsInstanceTopicRequest 请求对象
     * @return AsyncInvoker<CreateMqsInstanceTopicRequest, CreateMqsInstanceTopicResponse>
     */
    public AsyncInvoker<CreateMqsInstanceTopicRequest, CreateMqsInstanceTopicResponse> createMqsInstanceTopicAsyncInvoker(
        CreateMqsInstanceTopicRequest request) {
        return new AsyncInvoker<CreateMqsInstanceTopicRequest, CreateMqsInstanceTopicResponse>(request,
            RomaMeta.createMqsInstanceTopic, hcClient);
    }

    /**
     * 创建组合任务映射
     *
     * 创建组合任务映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMultiTaskMappingsRequest 请求对象
     * @return CompletableFuture<CreateMultiTaskMappingsResponse>
     */
    public CompletableFuture<CreateMultiTaskMappingsResponse> createMultiTaskMappingsAsync(
        CreateMultiTaskMappingsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createMultiTaskMappings);
    }

    /**
     * 创建组合任务映射
     *
     * 创建组合任务映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMultiTaskMappingsRequest 请求对象
     * @return AsyncInvoker<CreateMultiTaskMappingsRequest, CreateMultiTaskMappingsResponse>
     */
    public AsyncInvoker<CreateMultiTaskMappingsRequest, CreateMultiTaskMappingsResponse> createMultiTaskMappingsAsyncInvoker(
        CreateMultiTaskMappingsRequest request) {
        return new AsyncInvoker<CreateMultiTaskMappingsRequest, CreateMultiTaskMappingsResponse>(request,
            RomaMeta.createMultiTaskMappings, hcClient);
    }

    /**
     * 创建组合任务
     *
     * 创建组合任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMultiTasksRequest 请求对象
     * @return CompletableFuture<CreateMultiTasksResponse>
     */
    public CompletableFuture<CreateMultiTasksResponse> createMultiTasksAsync(CreateMultiTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createMultiTasks);
    }

    /**
     * 创建组合任务
     *
     * 创建组合任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMultiTasksRequest 请求对象
     * @return AsyncInvoker<CreateMultiTasksRequest, CreateMultiTasksResponse>
     */
    public AsyncInvoker<CreateMultiTasksRequest, CreateMultiTasksResponse> createMultiTasksAsyncInvoker(
        CreateMultiTasksRequest request) {
        return new AsyncInvoker<CreateMultiTasksRequest, CreateMultiTasksResponse>(request, RomaMeta.createMultiTasks,
            hcClient);
    }

    /**
     * 创建订阅管理
     *
     * 该接口用于创建指定实例下对应的应用下的设备操作，订阅到指定的topic
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNotificationRequest 请求对象
     * @return CompletableFuture<CreateNotificationResponse>
     */
    public CompletableFuture<CreateNotificationResponse> createNotificationAsync(CreateNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createNotification);
    }

    /**
     * 创建订阅管理
     *
     * 该接口用于创建指定实例下对应的应用下的设备操作，订阅到指定的topic
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNotificationRequest 请求对象
     * @return AsyncInvoker<CreateNotificationRequest, CreateNotificationResponse>
     */
    public AsyncInvoker<CreateNotificationRequest, CreateNotificationResponse> createNotificationAsyncInvoker(
        CreateNotificationRequest request) {
        return new AsyncInvoker<CreateNotificationRequest, CreateNotificationResponse>(request,
            RomaMeta.createNotification, hcClient);
    }

    /**
     * 创建产品
     *
     * 创建产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProductRequest 请求对象
     * @return CompletableFuture<CreateProductResponse>
     */
    public CompletableFuture<CreateProductResponse> createProductAsync(CreateProductRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createProduct);
    }

    /**
     * 创建产品
     *
     * 创建产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProductRequest 请求对象
     * @return AsyncInvoker<CreateProductRequest, CreateProductResponse>
     */
    public AsyncInvoker<CreateProductRequest, CreateProductResponse> createProductAsyncInvoker(
        CreateProductRequest request) {
        return new AsyncInvoker<CreateProductRequest, CreateProductResponse>(request, RomaMeta.createProduct, hcClient);
    }

    /**
     * 创建产品模板
     *
     * 创建产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProductTemplateRequest 请求对象
     * @return CompletableFuture<CreateProductTemplateResponse>
     */
    public CompletableFuture<CreateProductTemplateResponse> createProductTemplateAsync(
        CreateProductTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createProductTemplate);
    }

    /**
     * 创建产品模板
     *
     * 创建产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProductTemplateRequest 请求对象
     * @return AsyncInvoker<CreateProductTemplateRequest, CreateProductTemplateResponse>
     */
    public AsyncInvoker<CreateProductTemplateRequest, CreateProductTemplateResponse> createProductTemplateAsyncInvoker(
        CreateProductTemplateRequest request) {
        return new AsyncInvoker<CreateProductTemplateRequest, CreateProductTemplateResponse>(request,
            RomaMeta.createProductTemplate, hcClient);
    }

    /**
     * 添加产品主题
     *
     * 添加产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProductTopicRequest 请求对象
     * @return CompletableFuture<CreateProductTopicResponse>
     */
    public CompletableFuture<CreateProductTopicResponse> createProductTopicAsync(CreateProductTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createProductTopic);
    }

    /**
     * 添加产品主题
     *
     * 添加产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProductTopicRequest 请求对象
     * @return AsyncInvoker<CreateProductTopicRequest, CreateProductTopicResponse>
     */
    public AsyncInvoker<CreateProductTopicRequest, CreateProductTopicResponse> createProductTopicAsyncInvoker(
        CreateProductTopicRequest request) {
        return new AsyncInvoker<CreateProductTopicRequest, CreateProductTopicResponse>(request,
            RomaMeta.createProductTopic, hcClient);
    }

    /**
     * 创建属性
     *
     * 创建属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePropertyRequest 请求对象
     * @return CompletableFuture<CreatePropertyResponse>
     */
    public CompletableFuture<CreatePropertyResponse> createPropertyAsync(CreatePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createProperty);
    }

    /**
     * 创建属性
     *
     * 创建属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePropertyRequest 请求对象
     * @return AsyncInvoker<CreatePropertyRequest, CreatePropertyResponse>
     */
    public AsyncInvoker<CreatePropertyRequest, CreatePropertyResponse> createPropertyAsyncInvoker(
        CreatePropertyRequest request) {
        return new AsyncInvoker<CreatePropertyRequest, CreatePropertyResponse>(request, RomaMeta.createProperty,
            hcClient);
    }

    /**
     * 创建请求属性
     *
     * 创建请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRequestPropertyRequest 请求对象
     * @return CompletableFuture<CreateRequestPropertyResponse>
     */
    public CompletableFuture<CreateRequestPropertyResponse> createRequestPropertyAsync(
        CreateRequestPropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createRequestProperty);
    }

    /**
     * 创建请求属性
     *
     * 创建请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRequestPropertyRequest 请求对象
     * @return AsyncInvoker<CreateRequestPropertyRequest, CreateRequestPropertyResponse>
     */
    public AsyncInvoker<CreateRequestPropertyRequest, CreateRequestPropertyResponse> createRequestPropertyAsyncInvoker(
        CreateRequestPropertyRequest request) {
        return new AsyncInvoker<CreateRequestPropertyRequest, CreateRequestPropertyResponse>(request,
            RomaMeta.createRequestProperty, hcClient);
    }

    /**
     * 创建流控策略
     *
     * 当API上线后，系统会默认给每个API提供一个流控策略，API提供者可以根据自身API的服务能力及负载情况变更这个流控策略。 流控策略即限制API在一定长度的时间内，能够允许被访问的最大次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<CreateRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2Async(
        CreateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createRequestThrottlingPolicyV2);
    }

    /**
     * 创建流控策略
     *
     * 当API上线后，系统会默认给每个API提供一个流控策略，API提供者可以根据自身API的服务能力及负载情况变更这个流控策略。 流控策略即限制API在一定长度的时间内，能够允许被访问的最大次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2AsyncInvoker(
        CreateRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response>(
            request, RomaMeta.createRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 创建响应属性
     *
     * 创建响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResponsePropertyRequest 请求对象
     * @return CompletableFuture<CreateResponsePropertyResponse>
     */
    public CompletableFuture<CreateResponsePropertyResponse> createResponsePropertyAsync(
        CreateResponsePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createResponseProperty);
    }

    /**
     * 创建响应属性
     *
     * 创建响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResponsePropertyRequest 请求对象
     * @return AsyncInvoker<CreateResponsePropertyRequest, CreateResponsePropertyResponse>
     */
    public AsyncInvoker<CreateResponsePropertyRequest, CreateResponsePropertyResponse> createResponsePropertyAsyncInvoker(
        CreateResponsePropertyRequest request) {
        return new AsyncInvoker<CreateResponsePropertyRequest, CreateResponsePropertyResponse>(request,
            RomaMeta.createResponseProperty, hcClient);
    }

    /**
     * 创建规则
     *
     * 创建规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRuleRequest 请求对象
     * @return CompletableFuture<CreateRuleResponse>
     */
    public CompletableFuture<CreateRuleResponse> createRuleAsync(CreateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createRule);
    }

    /**
     * 创建规则
     *
     * 创建规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRuleRequest 请求对象
     * @return AsyncInvoker<CreateRuleRequest, CreateRuleResponse>
     */
    public AsyncInvoker<CreateRuleRequest, CreateRuleResponse> createRuleAsyncInvoker(CreateRuleRequest request) {
        return new AsyncInvoker<CreateRuleRequest, CreateRuleResponse>(request, RomaMeta.createRule, hcClient);
    }

    /**
     * 创建服务
     *
     * 创建服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServiceRequest 请求对象
     * @return CompletableFuture<CreateServiceResponse>
     */
    public CompletableFuture<CreateServiceResponse> createServiceAsync(CreateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createService);
    }

    /**
     * 创建服务
     *
     * 创建服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServiceRequest 请求对象
     * @return AsyncInvoker<CreateServiceRequest, CreateServiceResponse>
     */
    public AsyncInvoker<CreateServiceRequest, CreateServiceResponse> createServiceAsyncInvoker(
        CreateServiceRequest request) {
        return new AsyncInvoker<CreateServiceRequest, CreateServiceResponse>(request, RomaMeta.createService, hcClient);
    }

    /**
     * 创建签名密钥
     *
     * 为了保护API的安全性，建议租户为API的访问提供一套保护机制，即租户开放的API，需要对请求来源进行认证，不符合认证的请求直接拒绝访问。
     * 
     * 其中，签名密钥就是API安全保护机制的一种。
     * 
     * 租户创建一个签名密钥，并将签名密钥与API进行绑定，则ROMA Connect APIC在请求这个API时，就会使用绑定的签名密钥对请求参数进行数据加密，生成签名。当租户的后端服务收到请求时，可以校验这个签名，如果签名校验不通过，则该请求不是ROMA Connect APIC发出的请求，租户可以拒绝这个请求，从而保证API的安全性，避免API被未知来源的请求攻击。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<CreateSignatureKeyV2Response>
     */
    public CompletableFuture<CreateSignatureKeyV2Response> createSignatureKeyV2Async(
        CreateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createSignatureKeyV2);
    }

    /**
     * 创建签名密钥
     *
     * 为了保护API的安全性，建议租户为API的访问提供一套保护机制，即租户开放的API，需要对请求来源进行认证，不符合认证的请求直接拒绝访问。
     * 
     * 其中，签名密钥就是API安全保护机制的一种。
     * 
     * 租户创建一个签名密钥，并将签名密钥与API进行绑定，则ROMA Connect APIC在请求这个API时，就会使用绑定的签名密钥对请求参数进行数据加密，生成签名。当租户的后端服务收到请求时，可以校验这个签名，如果签名校验不通过，则该请求不是ROMA Connect APIC发出的请求，租户可以拒绝这个请求，从而保证API的安全性，避免API被未知来源的请求攻击。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response>
     */
    public AsyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> createSignatureKeyV2AsyncInvoker(
        CreateSignatureKeyV2Request request) {
        return new AsyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response>(request,
            RomaMeta.createSignatureKeyV2, hcClient);
    }

    /**
     * 添加源数据源
     *
     * 添加源数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSourceRequest 请求对象
     * @return CompletableFuture<CreateSourceResponse>
     */
    public CompletableFuture<CreateSourceResponse> createSourceAsync(CreateSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createSource);
    }

    /**
     * 添加源数据源
     *
     * 添加源数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSourceRequest 请求对象
     * @return AsyncInvoker<CreateSourceRequest, CreateSourceResponse>
     */
    public AsyncInvoker<CreateSourceRequest, CreateSourceResponse> createSourceAsyncInvoker(
        CreateSourceRequest request) {
        return new AsyncInvoker<CreateSourceRequest, CreateSourceResponse>(request, RomaMeta.createSource, hcClient);
    }

    /**
     * 创建特殊设置
     *
     * 流控策略可以限制一段时间内可以访问API的最大次数，也可以限制一段时间内单个租户和单个APP可以访问API的最大次数。
     * 
     * 如果想要对某个特定的APP进行特殊设置，例如设置所有APP每分钟的访问次数为500次，但想设置APP1每分钟的访问次数为800次，可以通过在流控策略中设置特殊APP来实现该功能。
     * 
     * 为流控策略添加一个特殊设置的对象，可以是APP，也可以是租户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSpecialThrottlingConfigurationV2Request 请求对象
     * @return CompletableFuture<CreateSpecialThrottlingConfigurationV2Response>
     */
    public CompletableFuture<CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2Async(
        CreateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createSpecialThrottlingConfigurationV2);
    }

    /**
     * 创建特殊设置
     *
     * 流控策略可以限制一段时间内可以访问API的最大次数，也可以限制一段时间内单个租户和单个APP可以访问API的最大次数。
     * 
     * 如果想要对某个特定的APP进行特殊设置，例如设置所有APP每分钟的访问次数为500次，但想设置APP1每分钟的访问次数为800次，可以通过在流控策略中设置特殊APP来实现该功能。
     * 
     * 为流控策略添加一个特殊设置的对象，可以是APP，也可以是租户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSpecialThrottlingConfigurationV2Request 请求对象
     * @return AsyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response>
     */
    public AsyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2AsyncInvoker(
        CreateSpecialThrottlingConfigurationV2Request request) {
        return new AsyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response>(
            request, RomaMeta.createSpecialThrottlingConfigurationV2, hcClient);
    }

    /**
     * 测试后端API
     *
     * 测试后端API是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DebugLiveDataApiV2Request 请求对象
     * @return CompletableFuture<DebugLiveDataApiV2Response>
     */
    public CompletableFuture<DebugLiveDataApiV2Response> debugLiveDataApiV2Async(DebugLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.debugLiveDataApiV2);
    }

    /**
     * 测试后端API
     *
     * 测试后端API是否可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DebugLiveDataApiV2Request 请求对象
     * @return AsyncInvoker<DebugLiveDataApiV2Request, DebugLiveDataApiV2Response>
     */
    public AsyncInvoker<DebugLiveDataApiV2Request, DebugLiveDataApiV2Response> debugLiveDataApiV2AsyncInvoker(
        DebugLiveDataApiV2Request request) {
        return new AsyncInvoker<DebugLiveDataApiV2Request, DebugLiveDataApiV2Response>(request,
            RomaMeta.debugLiveDataApiV2, hcClient);
    }

    /**
     * 规则调试
     *
     * 规则调试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DebugRuleRequest 请求对象
     * @return CompletableFuture<DebugRuleResponse>
     */
    public CompletableFuture<DebugRuleResponse> debugRuleAsync(DebugRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.debugRule);
    }

    /**
     * 规则调试
     *
     * 规则调试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DebugRuleRequest 请求对象
     * @return AsyncInvoker<DebugRuleRequest, DebugRuleResponse>
     */
    public AsyncInvoker<DebugRuleRequest, DebugRuleResponse> debugRuleAsyncInvoker(DebugRuleRequest request) {
        return new AsyncInvoker<DebugRuleRequest, DebugRuleResponse>(request, RomaMeta.debugRule, hcClient);
    }

    /**
     * 删除APP的访问控制
     *
     * 删除客户端配置的访问控制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppAclRequest 请求对象
     * @return CompletableFuture<DeleteAppAclResponse>
     */
    public CompletableFuture<DeleteAppAclResponse> deleteAppAclAsync(DeleteAppAclRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteAppAcl);
    }

    /**
     * 删除APP的访问控制
     *
     * 删除客户端配置的访问控制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppAclRequest 请求对象
     * @return AsyncInvoker<DeleteAppAclRequest, DeleteAppAclResponse>
     */
    public AsyncInvoker<DeleteAppAclRequest, DeleteAppAclResponse> deleteAppAclAsyncInvoker(
        DeleteAppAclRequest request) {
        return new AsyncInvoker<DeleteAppAclRequest, DeleteAppAclResponse>(request, RomaMeta.deleteAppAcl, hcClient);
    }

    /**
     * 删除APP Code
     *
     * 删除App Code，App Code删除后，将无法再通过简易认证访问对应的API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppCodeV2Request 请求对象
     * @return CompletableFuture<DeleteAppCodeV2Response>
     */
    public CompletableFuture<DeleteAppCodeV2Response> deleteAppCodeV2Async(DeleteAppCodeV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteAppCodeV2);
    }

    /**
     * 删除APP Code
     *
     * 删除App Code，App Code删除后，将无法再通过简易认证访问对应的API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppCodeV2Request 请求对象
     * @return AsyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response>
     */
    public AsyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response> deleteAppCodeV2AsyncInvoker(
        DeleteAppCodeV2Request request) {
        return new AsyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response>(request, RomaMeta.deleteAppCodeV2,
            hcClient);
    }

    /**
     * 删除应用配置
     *
     * 删除应用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppConfigV2Request 请求对象
     * @return CompletableFuture<DeleteAppConfigV2Response>
     */
    public CompletableFuture<DeleteAppConfigV2Response> deleteAppConfigV2Async(DeleteAppConfigV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteAppConfigV2);
    }

    /**
     * 删除应用配置
     *
     * 删除应用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppConfigV2Request 请求对象
     * @return AsyncInvoker<DeleteAppConfigV2Request, DeleteAppConfigV2Response>
     */
    public AsyncInvoker<DeleteAppConfigV2Request, DeleteAppConfigV2Response> deleteAppConfigV2AsyncInvoker(
        DeleteAppConfigV2Request request) {
        return new AsyncInvoker<DeleteAppConfigV2Request, DeleteAppConfigV2Response>(request,
            RomaMeta.deleteAppConfigV2, hcClient);
    }

    /**
     * 删除客户端配额
     *
     * 删除客户端配额。删除客户端配额时，同时删除客户端配额和客户端应用的关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppQuotaRequest 请求对象
     * @return CompletableFuture<DeleteAppQuotaResponse>
     */
    public CompletableFuture<DeleteAppQuotaResponse> deleteAppQuotaAsync(DeleteAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteAppQuota);
    }

    /**
     * 删除客户端配额
     *
     * 删除客户端配额。删除客户端配额时，同时删除客户端配额和客户端应用的关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppQuotaRequest 请求对象
     * @return AsyncInvoker<DeleteAppQuotaRequest, DeleteAppQuotaResponse>
     */
    public AsyncInvoker<DeleteAppQuotaRequest, DeleteAppQuotaResponse> deleteAppQuotaAsyncInvoker(
        DeleteAppQuotaRequest request) {
        return new AsyncInvoker<DeleteAppQuotaRequest, DeleteAppQuotaResponse>(request, RomaMeta.deleteAppQuota,
            hcClient);
    }

    /**
     * 删除命令
     *
     * 删除命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCommandRequest 请求对象
     * @return CompletableFuture<DeleteCommandResponse>
     */
    public CompletableFuture<DeleteCommandResponse> deleteCommandAsync(DeleteCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteCommand);
    }

    /**
     * 删除命令
     *
     * 删除命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCommandRequest 请求对象
     * @return AsyncInvoker<DeleteCommandRequest, DeleteCommandResponse>
     */
    public AsyncInvoker<DeleteCommandRequest, DeleteCommandResponse> deleteCommandAsyncInvoker(
        DeleteCommandRequest request) {
        return new AsyncInvoker<DeleteCommandRequest, DeleteCommandResponse>(request, RomaMeta.deleteCommand, hcClient);
    }

    /**
     * 删除自定义认证
     *
     * 删除自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCustomAuthorizerV2Request 请求对象
     * @return CompletableFuture<DeleteCustomAuthorizerV2Response>
     */
    public CompletableFuture<DeleteCustomAuthorizerV2Response> deleteCustomAuthorizerV2Async(
        DeleteCustomAuthorizerV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteCustomAuthorizerV2);
    }

    /**
     * 删除自定义认证
     *
     * 删除自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCustomAuthorizerV2Request 请求对象
     * @return AsyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response>
     */
    public AsyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> deleteCustomAuthorizerV2AsyncInvoker(
        DeleteCustomAuthorizerV2Request request) {
        return new AsyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response>(request,
            RomaMeta.deleteCustomAuthorizerV2, hcClient);
    }

    /**
     * 通过数据源Id删除指定数据源信息
     *
     * 通过数据源Id删除指定数据源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatasourceInfoByIdRequest 请求对象
     * @return CompletableFuture<DeleteDatasourceInfoByIdResponse>
     */
    public CompletableFuture<DeleteDatasourceInfoByIdResponse> deleteDatasourceInfoByIdAsync(
        DeleteDatasourceInfoByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteDatasourceInfoById);
    }

    /**
     * 通过数据源Id删除指定数据源信息
     *
     * 通过数据源Id删除指定数据源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatasourceInfoByIdRequest 请求对象
     * @return AsyncInvoker<DeleteDatasourceInfoByIdRequest, DeleteDatasourceInfoByIdResponse>
     */
    public AsyncInvoker<DeleteDatasourceInfoByIdRequest, DeleteDatasourceInfoByIdResponse> deleteDatasourceInfoByIdAsyncInvoker(
        DeleteDatasourceInfoByIdRequest request) {
        return new AsyncInvoker<DeleteDatasourceInfoByIdRequest, DeleteDatasourceInfoByIdResponse>(request,
            RomaMeta.deleteDatasourceInfoById, hcClient);
    }

    /**
     * 删除目标数据源
     *
     * 删除目标数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDestinationRequest 请求对象
     * @return CompletableFuture<DeleteDestinationResponse>
     */
    public CompletableFuture<DeleteDestinationResponse> deleteDestinationAsync(DeleteDestinationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteDestination);
    }

    /**
     * 删除目标数据源
     *
     * 删除目标数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDestinationRequest 请求对象
     * @return AsyncInvoker<DeleteDestinationRequest, DeleteDestinationResponse>
     */
    public AsyncInvoker<DeleteDestinationRequest, DeleteDestinationResponse> deleteDestinationAsyncInvoker(
        DeleteDestinationRequest request) {
        return new AsyncInvoker<DeleteDestinationRequest, DeleteDestinationResponse>(request,
            RomaMeta.deleteDestination, hcClient);
    }

    /**
     * 删除设备
     *
     * 删除指定设备ID的设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceRequest 请求对象
     * @return CompletableFuture<DeleteDeviceResponse>
     */
    public CompletableFuture<DeleteDeviceResponse> deleteDeviceAsync(DeleteDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteDevice);
    }

    /**
     * 删除设备
     *
     * 删除指定设备ID的设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>
     */
    public AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> deleteDeviceAsyncInvoker(
        DeleteDeviceRequest request) {
        return new AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>(request, RomaMeta.deleteDevice, hcClient);
    }

    /**
     * 删除设备分组内的设备
     *
     * 删除设备分组内的设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceFromGroupRequest 请求对象
     * @return CompletableFuture<DeleteDeviceFromGroupResponse>
     */
    public CompletableFuture<DeleteDeviceFromGroupResponse> deleteDeviceFromGroupAsync(
        DeleteDeviceFromGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteDeviceFromGroup);
    }

    /**
     * 删除设备分组内的设备
     *
     * 删除设备分组内的设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceFromGroupRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceFromGroupRequest, DeleteDeviceFromGroupResponse>
     */
    public AsyncInvoker<DeleteDeviceFromGroupRequest, DeleteDeviceFromGroupResponse> deleteDeviceFromGroupAsyncInvoker(
        DeleteDeviceFromGroupRequest request) {
        return new AsyncInvoker<DeleteDeviceFromGroupRequest, DeleteDeviceFromGroupResponse>(request,
            RomaMeta.deleteDeviceFromGroup, hcClient);
    }

    /**
     * 删除设备分组
     *
     * 删除分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceGroupRequest 请求对象
     * @return CompletableFuture<DeleteDeviceGroupResponse>
     */
    public CompletableFuture<DeleteDeviceGroupResponse> deleteDeviceGroupAsync(DeleteDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteDeviceGroup);
    }

    /**
     * 删除设备分组
     *
     * 删除分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeviceGroupRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse>
     */
    public AsyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> deleteDeviceGroupAsyncInvoker(
        DeleteDeviceGroupRequest request) {
        return new AsyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse>(request,
            RomaMeta.deleteDeviceGroup, hcClient);
    }

    /**
     * 删除环境
     *
     * 删除指定的环境。
     * 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。环境上存在已发布的API时，该环境不能被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvironmentV2Request 请求对象
     * @return CompletableFuture<DeleteEnvironmentV2Response>
     */
    public CompletableFuture<DeleteEnvironmentV2Response> deleteEnvironmentV2Async(DeleteEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteEnvironmentV2);
    }

    /**
     * 删除环境
     *
     * 删除指定的环境。
     * 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。环境上存在已发布的API时，该环境不能被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvironmentV2Request 请求对象
     * @return AsyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response>
     */
    public AsyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> deleteEnvironmentV2AsyncInvoker(
        DeleteEnvironmentV2Request request) {
        return new AsyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response>(request,
            RomaMeta.deleteEnvironmentV2, hcClient);
    }

    /**
     * 删除变量
     *
     * 删除指定的环境变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<DeleteEnvironmentVariableV2Response>
     */
    public CompletableFuture<DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2Async(
        DeleteEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteEnvironmentVariableV2);
    }

    /**
     * 删除变量
     *
     * 删除指定的环境变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvironmentVariableV2Request 请求对象
     * @return AsyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response>
     */
    public AsyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2AsyncInvoker(
        DeleteEnvironmentVariableV2Request request) {
        return new AsyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response>(request,
            RomaMeta.deleteEnvironmentVariableV2, hcClient);
    }

    /**
     * 删除后端API
     *
     * 在某个实例中删除后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLiveDataApiV2Request 请求对象
     * @return CompletableFuture<DeleteLiveDataApiV2Response>
     */
    public CompletableFuture<DeleteLiveDataApiV2Response> deleteLiveDataApiV2Async(DeleteLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteLiveDataApiV2);
    }

    /**
     * 删除后端API
     *
     * 在某个实例中删除后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLiveDataApiV2Request 请求对象
     * @return AsyncInvoker<DeleteLiveDataApiV2Request, DeleteLiveDataApiV2Response>
     */
    public AsyncInvoker<DeleteLiveDataApiV2Request, DeleteLiveDataApiV2Response> deleteLiveDataApiV2AsyncInvoker(
        DeleteLiveDataApiV2Request request) {
        return new AsyncInvoker<DeleteLiveDataApiV2Request, DeleteLiveDataApiV2Response>(request,
            RomaMeta.deleteLiveDataApiV2, hcClient);
    }

    /**
     * 删除Topic
     *
     * 删除Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMqsInstanceTopicRequest 请求对象
     * @return CompletableFuture<DeleteMqsInstanceTopicResponse>
     */
    public CompletableFuture<DeleteMqsInstanceTopicResponse> deleteMqsInstanceTopicAsync(
        DeleteMqsInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteMqsInstanceTopic);
    }

    /**
     * 删除Topic
     *
     * 删除Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMqsInstanceTopicRequest 请求对象
     * @return AsyncInvoker<DeleteMqsInstanceTopicRequest, DeleteMqsInstanceTopicResponse>
     */
    public AsyncInvoker<DeleteMqsInstanceTopicRequest, DeleteMqsInstanceTopicResponse> deleteMqsInstanceTopicAsyncInvoker(
        DeleteMqsInstanceTopicRequest request) {
        return new AsyncInvoker<DeleteMqsInstanceTopicRequest, DeleteMqsInstanceTopicResponse>(request,
            RomaMeta.deleteMqsInstanceTopic, hcClient);
    }

    /**
     * 删除指定任务映射
     *
     * 通过映射ID删除指定任务映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMultiTaskMappingRequest 请求对象
     * @return CompletableFuture<DeleteMultiTaskMappingResponse>
     */
    public CompletableFuture<DeleteMultiTaskMappingResponse> deleteMultiTaskMappingAsync(
        DeleteMultiTaskMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteMultiTaskMapping);
    }

    /**
     * 删除指定任务映射
     *
     * 通过映射ID删除指定任务映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMultiTaskMappingRequest 请求对象
     * @return AsyncInvoker<DeleteMultiTaskMappingRequest, DeleteMultiTaskMappingResponse>
     */
    public AsyncInvoker<DeleteMultiTaskMappingRequest, DeleteMultiTaskMappingResponse> deleteMultiTaskMappingAsyncInvoker(
        DeleteMultiTaskMappingRequest request) {
        return new AsyncInvoker<DeleteMultiTaskMappingRequest, DeleteMultiTaskMappingResponse>(request,
            RomaMeta.deleteMultiTaskMapping, hcClient);
    }

    /**
     * 删除订阅管理
     *
     * 该接口用于删除指定订阅管理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNotificationRequest 请求对象
     * @return CompletableFuture<DeleteNotificationResponse>
     */
    public CompletableFuture<DeleteNotificationResponse> deleteNotificationAsync(DeleteNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteNotification);
    }

    /**
     * 删除订阅管理
     *
     * 该接口用于删除指定订阅管理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNotificationRequest 请求对象
     * @return AsyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse>
     */
    public AsyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse> deleteNotificationAsyncInvoker(
        DeleteNotificationRequest request) {
        return new AsyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse>(request,
            RomaMeta.deleteNotification, hcClient);
    }

    /**
     * 删除产品
     *
     * 删除产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProductRequest 请求对象
     * @return CompletableFuture<DeleteProductResponse>
     */
    public CompletableFuture<DeleteProductResponse> deleteProductAsync(DeleteProductRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteProduct);
    }

    /**
     * 删除产品
     *
     * 删除产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProductRequest 请求对象
     * @return AsyncInvoker<DeleteProductRequest, DeleteProductResponse>
     */
    public AsyncInvoker<DeleteProductRequest, DeleteProductResponse> deleteProductAsyncInvoker(
        DeleteProductRequest request) {
        return new AsyncInvoker<DeleteProductRequest, DeleteProductResponse>(request, RomaMeta.deleteProduct, hcClient);
    }

    /**
     * 删除产品模板
     *
     * 删除产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProductTemplateRequest 请求对象
     * @return CompletableFuture<DeleteProductTemplateResponse>
     */
    public CompletableFuture<DeleteProductTemplateResponse> deleteProductTemplateAsync(
        DeleteProductTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteProductTemplate);
    }

    /**
     * 删除产品模板
     *
     * 删除产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProductTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteProductTemplateRequest, DeleteProductTemplateResponse>
     */
    public AsyncInvoker<DeleteProductTemplateRequest, DeleteProductTemplateResponse> deleteProductTemplateAsyncInvoker(
        DeleteProductTemplateRequest request) {
        return new AsyncInvoker<DeleteProductTemplateRequest, DeleteProductTemplateResponse>(request,
            RomaMeta.deleteProductTemplate, hcClient);
    }

    /**
     * 删除产品主题
     *
     * 删除产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProductTopicRequest 请求对象
     * @return CompletableFuture<DeleteProductTopicResponse>
     */
    public CompletableFuture<DeleteProductTopicResponse> deleteProductTopicAsync(DeleteProductTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteProductTopic);
    }

    /**
     * 删除产品主题
     *
     * 删除产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProductTopicRequest 请求对象
     * @return AsyncInvoker<DeleteProductTopicRequest, DeleteProductTopicResponse>
     */
    public AsyncInvoker<DeleteProductTopicRequest, DeleteProductTopicResponse> deleteProductTopicAsyncInvoker(
        DeleteProductTopicRequest request) {
        return new AsyncInvoker<DeleteProductTopicRequest, DeleteProductTopicResponse>(request,
            RomaMeta.deleteProductTopic, hcClient);
    }

    /**
     * 删除服务属性
     *
     * 删除服务属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePropertyRequest 请求对象
     * @return CompletableFuture<DeletePropertyResponse>
     */
    public CompletableFuture<DeletePropertyResponse> deletePropertyAsync(DeletePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteProperty);
    }

    /**
     * 删除服务属性
     *
     * 删除服务属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePropertyRequest 请求对象
     * @return AsyncInvoker<DeletePropertyRequest, DeletePropertyResponse>
     */
    public AsyncInvoker<DeletePropertyRequest, DeletePropertyResponse> deletePropertyAsyncInvoker(
        DeletePropertyRequest request) {
        return new AsyncInvoker<DeletePropertyRequest, DeletePropertyResponse>(request, RomaMeta.deleteProperty,
            hcClient);
    }

    /**
     * 删除请求属性
     *
     * 删除请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRequestPropertyRequest 请求对象
     * @return CompletableFuture<DeleteRequestPropertyResponse>
     */
    public CompletableFuture<DeleteRequestPropertyResponse> deleteRequestPropertyAsync(
        DeleteRequestPropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteRequestProperty);
    }

    /**
     * 删除请求属性
     *
     * 删除请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRequestPropertyRequest 请求对象
     * @return AsyncInvoker<DeleteRequestPropertyRequest, DeleteRequestPropertyResponse>
     */
    public AsyncInvoker<DeleteRequestPropertyRequest, DeleteRequestPropertyResponse> deleteRequestPropertyAsyncInvoker(
        DeleteRequestPropertyRequest request) {
        return new AsyncInvoker<DeleteRequestPropertyRequest, DeleteRequestPropertyResponse>(request,
            RomaMeta.deleteRequestProperty, hcClient);
    }

    /**
     * 删除流控策略
     *
     * 删除指定的流控策略。当该流控策略绑定了API时，需要先解除流控策略与API的所有绑定关系后再删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<DeleteRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2Async(
        DeleteRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteRequestThrottlingPolicyV2);
    }

    /**
     * 删除流控策略
     *
     * 删除指定的流控策略。当该流控策略绑定了API时，需要先解除流控策略与API的所有绑定关系后再删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2AsyncInvoker(
        DeleteRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response>(
            request, RomaMeta.deleteRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 删除响应属性
     *
     * 删除响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResponsePropertyRequest 请求对象
     * @return CompletableFuture<DeleteResponsePropertyResponse>
     */
    public CompletableFuture<DeleteResponsePropertyResponse> deleteResponsePropertyAsync(
        DeleteResponsePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteResponseProperty);
    }

    /**
     * 删除响应属性
     *
     * 删除响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResponsePropertyRequest 请求对象
     * @return AsyncInvoker<DeleteResponsePropertyRequest, DeleteResponsePropertyResponse>
     */
    public AsyncInvoker<DeleteResponsePropertyRequest, DeleteResponsePropertyResponse> deleteResponsePropertyAsyncInvoker(
        DeleteResponsePropertyRequest request) {
        return new AsyncInvoker<DeleteResponsePropertyRequest, DeleteResponsePropertyResponse>(request,
            RomaMeta.deleteResponseProperty, hcClient);
    }

    /**
     * 删除规则
     *
     * 删除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleRequest 请求对象
     * @return CompletableFuture<DeleteRuleResponse>
     */
    public CompletableFuture<DeleteRuleResponse> deleteRuleAsync(DeleteRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteRule);
    }

    /**
     * 删除规则
     *
     * 删除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleRequest 请求对象
     * @return AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleAsyncInvoker(DeleteRuleRequest request) {
        return new AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse>(request, RomaMeta.deleteRule, hcClient);
    }

    /**
     * 删除服务
     *
     * 删除服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceRequest 请求对象
     * @return CompletableFuture<DeleteServiceResponse>
     */
    public CompletableFuture<DeleteServiceResponse> deleteServiceAsync(DeleteServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteService);
    }

    /**
     * 删除服务
     *
     * 删除服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceRequest 请求对象
     * @return AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse>
     */
    public AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse> deleteServiceAsyncInvoker(
        DeleteServiceRequest request) {
        return new AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse>(request, RomaMeta.deleteService, hcClient);
    }

    /**
     * 删除签名密钥
     *
     * 删除指定的签名密钥。签名密钥绑定了API时无法删除，需要先解除与API的绑定关系后删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSignatureKeyV2Request 请求对象
     * @return CompletableFuture<DeleteSignatureKeyV2Response>
     */
    public CompletableFuture<DeleteSignatureKeyV2Response> deleteSignatureKeyV2Async(
        DeleteSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteSignatureKeyV2);
    }

    /**
     * 删除签名密钥
     *
     * 删除指定的签名密钥。签名密钥绑定了API时无法删除，需要先解除与API的绑定关系后删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response>
     */
    public AsyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> deleteSignatureKeyV2AsyncInvoker(
        DeleteSignatureKeyV2Request request) {
        return new AsyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response>(request,
            RomaMeta.deleteSignatureKeyV2, hcClient);
    }

    /**
     * 删除源数据源
     *
     * 删除源数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSourceRequest 请求对象
     * @return CompletableFuture<DeleteSourceResponse>
     */
    public CompletableFuture<DeleteSourceResponse> deleteSourceAsync(DeleteSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteSource);
    }

    /**
     * 删除源数据源
     *
     * 删除源数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSourceRequest 请求对象
     * @return AsyncInvoker<DeleteSourceRequest, DeleteSourceResponse>
     */
    public AsyncInvoker<DeleteSourceRequest, DeleteSourceResponse> deleteSourceAsyncInvoker(
        DeleteSourceRequest request) {
        return new AsyncInvoker<DeleteSourceRequest, DeleteSourceResponse>(request, RomaMeta.deleteSource, hcClient);
    }

    /**
     * 删除特殊设置
     *
     * 删除某个流控策略的某个特殊配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSpecialThrottlingConfigurationV2Request 请求对象
     * @return CompletableFuture<DeleteSpecialThrottlingConfigurationV2Response>
     */
    public CompletableFuture<DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2Async(
        DeleteSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteSpecialThrottlingConfigurationV2);
    }

    /**
     * 删除特殊设置
     *
     * 删除某个流控策略的某个特殊配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSpecialThrottlingConfigurationV2Request 请求对象
     * @return AsyncInvoker<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response>
     */
    public AsyncInvoker<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2AsyncInvoker(
        DeleteSpecialThrottlingConfigurationV2Request request) {
        return new AsyncInvoker<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response>(
            request, RomaMeta.deleteSpecialThrottlingConfigurationV2, hcClient);
    }

    /**
     * 通过任务ID删除指定任务
     *
     * 通过任务ID删除指定任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return CompletableFuture<DeleteTaskResponse>
     */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteTask);
    }

    /**
     * 通过任务ID删除指定任务
     *
     * 通过任务ID删除指定任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, RomaMeta.deleteTask, hcClient);
    }

    /**
     * 解除客户端配额和客户端应用的绑定
     *
     * 解除客户端配额和客户端应用的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateAppQuotaWithAppRequest 请求对象
     * @return CompletableFuture<DisassociateAppQuotaWithAppResponse>
     */
    public CompletableFuture<DisassociateAppQuotaWithAppResponse> disassociateAppQuotaWithAppAsync(
        DisassociateAppQuotaWithAppRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.disassociateAppQuotaWithApp);
    }

    /**
     * 解除客户端配额和客户端应用的绑定
     *
     * 解除客户端配额和客户端应用的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateAppQuotaWithAppRequest 请求对象
     * @return AsyncInvoker<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse>
     */
    public AsyncInvoker<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse> disassociateAppQuotaWithAppAsyncInvoker(
        DisassociateAppQuotaWithAppRequest request) {
        return new AsyncInvoker<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse>(request,
            RomaMeta.disassociateAppQuotaWithApp, hcClient);
    }

    /**
     * 删除域名证书
     *
     * 如果域名证书不再需要或者已过期，则可以删除证书内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateCertificateV2Request 请求对象
     * @return CompletableFuture<DisassociateCertificateV2Response>
     */
    public CompletableFuture<DisassociateCertificateV2Response> disassociateCertificateV2Async(
        DisassociateCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.disassociateCertificateV2);
    }

    /**
     * 删除域名证书
     *
     * 如果域名证书不再需要或者已过期，则可以删除证书内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateCertificateV2Request 请求对象
     * @return AsyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response>
     */
    public AsyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response> disassociateCertificateV2AsyncInvoker(
        DisassociateCertificateV2Request request) {
        return new AsyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response>(request,
            RomaMeta.disassociateCertificateV2, hcClient);
    }

    /**
     * 解绑域名
     *
     * 如果API分组不再需要绑定某个自定义域名，则可以为此API分组解绑此域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateDomainV2Request 请求对象
     * @return CompletableFuture<DisassociateDomainV2Response>
     */
    public CompletableFuture<DisassociateDomainV2Response> disassociateDomainV2Async(
        DisassociateDomainV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.disassociateDomainV2);
    }

    /**
     * 解绑域名
     *
     * 如果API分组不再需要绑定某个自定义域名，则可以为此API分组解绑此域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateDomainV2Request 请求对象
     * @return AsyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response>
     */
    public AsyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response> disassociateDomainV2AsyncInvoker(
        DisassociateDomainV2Request request) {
        return new AsyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response>(request,
            RomaMeta.disassociateDomainV2, hcClient);
    }

    /**
     * 解除绑定
     *
     * 解除API与签名密钥的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<DisassociateSignatureKeyV2Response>
     */
    public CompletableFuture<DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2Async(
        DisassociateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.disassociateSignatureKeyV2);
    }

    /**
     * 解除绑定
     *
     * 解除API与签名密钥的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response>
     */
    public AsyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2AsyncInvoker(
        DisassociateSignatureKeyV2Request request) {
        return new AsyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response>(request,
            RomaMeta.disassociateSignatureKeyV2, hcClient);
    }

    /**
     * 导出产品
     *
     * 导出产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadProductsRequest 请求对象
     * @return CompletableFuture<DownloadProductsResponse>
     */
    public CompletableFuture<DownloadProductsResponse> downloadProductsAsync(DownloadProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.downloadProducts);
    }

    /**
     * 导出产品
     *
     * 导出产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadProductsRequest 请求对象
     * @return AsyncInvoker<DownloadProductsRequest, DownloadProductsResponse>
     */
    public AsyncInvoker<DownloadProductsRequest, DownloadProductsResponse> downloadProductsAsyncInvoker(
        DownloadProductsRequest request) {
        return new AsyncInvoker<DownloadProductsRequest, DownloadProductsResponse>(request, RomaMeta.downloadProducts,
            hcClient);
    }

    /**
     * 导出Topic
     *
     * 导出Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportMqsInstanceTopicRequest 请求对象
     * @return CompletableFuture<ExportMqsInstanceTopicResponse>
     */
    public CompletableFuture<ExportMqsInstanceTopicResponse> exportMqsInstanceTopicAsync(
        ExportMqsInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.exportMqsInstanceTopic);
    }

    /**
     * 导出Topic
     *
     * 导出Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportMqsInstanceTopicRequest 请求对象
     * @return AsyncInvoker<ExportMqsInstanceTopicRequest, ExportMqsInstanceTopicResponse>
     */
    public AsyncInvoker<ExportMqsInstanceTopicRequest, ExportMqsInstanceTopicResponse> exportMqsInstanceTopicAsyncInvoker(
        ExportMqsInstanceTopicRequest request) {
        return new AsyncInvoker<ExportMqsInstanceTopicRequest, ExportMqsInstanceTopicResponse>(request,
            RomaMeta.exportMqsInstanceTopic, hcClient);
    }

    /**
     * 导入Topic
     *
     * 导入Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportMqsInstanceTopicRequest 请求对象
     * @return CompletableFuture<ImportMqsInstanceTopicResponse>
     */
    public CompletableFuture<ImportMqsInstanceTopicResponse> importMqsInstanceTopicAsync(
        ImportMqsInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.importMqsInstanceTopic);
    }

    /**
     * 导入Topic
     *
     * 导入Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportMqsInstanceTopicRequest 请求对象
     * @return AsyncInvoker<ImportMqsInstanceTopicRequest, ImportMqsInstanceTopicResponse>
     */
    public AsyncInvoker<ImportMqsInstanceTopicRequest, ImportMqsInstanceTopicResponse> importMqsInstanceTopicAsyncInvoker(
        ImportMqsInstanceTopicRequest request) {
        return new AsyncInvoker<ImportMqsInstanceTopicRequest, ImportMqsInstanceTopicResponse>(request,
            RomaMeta.importMqsInstanceTopic, hcClient);
    }

    /**
     * 组合任务初始化
     *
     * 初始化组合任务，分配任务ID，初始化映射等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InstallMultiTasksRequest 请求对象
     * @return CompletableFuture<InstallMultiTasksResponse>
     */
    public CompletableFuture<InstallMultiTasksResponse> installMultiTasksAsync(InstallMultiTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.installMultiTasks);
    }

    /**
     * 组合任务初始化
     *
     * 初始化组合任务，分配任务ID，初始化映射等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InstallMultiTasksRequest 请求对象
     * @return AsyncInvoker<InstallMultiTasksRequest, InstallMultiTasksResponse>
     */
    public AsyncInvoker<InstallMultiTasksRequest, InstallMultiTasksResponse> installMultiTasksAsyncInvoker(
        InstallMultiTasksRequest request) {
        return new AsyncInvoker<InstallMultiTasksRequest, InstallMultiTasksResponse>(request,
            RomaMeta.installMultiTasks, hcClient);
    }

    /**
     * 查看签名密钥绑定的API列表
     *
     * 查询某个签名密钥上已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisBindedToSignatureKeyV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToSignatureKeyV2Response>
     */
    public CompletableFuture<ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2Async(
        ListApisBindedToSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisBindedToSignatureKeyV2);
    }

    /**
     * 查看签名密钥绑定的API列表
     *
     * 查询某个签名密钥上已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisBindedToSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response>
     */
    public AsyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2AsyncInvoker(
        ListApisBindedToSignatureKeyV2Request request) {
        return new AsyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response>(request,
            RomaMeta.listApisBindedToSignatureKeyV2, hcClient);
    }

    /**
     * 查看签名密钥未绑定的API列表
     *
     * 查询所有未绑定到该签名密钥上的API列表。需要API已经发布，未发布的API不予展示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisNotBoundWithSignatureKeyV2Request 请求对象
     * @return CompletableFuture<ListApisNotBoundWithSignatureKeyV2Response>
     */
    public CompletableFuture<ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2Async(
        ListApisNotBoundWithSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisNotBoundWithSignatureKeyV2);
    }

    /**
     * 查看签名密钥未绑定的API列表
     *
     * 查询所有未绑定到该签名密钥上的API列表。需要API已经发布，未发布的API不予展示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisNotBoundWithSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response>
     */
    public AsyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2AsyncInvoker(
        ListApisNotBoundWithSignatureKeyV2Request request) {
        return new AsyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response>(
            request, RomaMeta.listApisNotBoundWithSignatureKeyV2, hcClient);
    }

    /**
     * 查询APP Code列表
     *
     * 查询App Code列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppCodesV2Request 请求对象
     * @return CompletableFuture<ListAppCodesV2Response>
     */
    public CompletableFuture<ListAppCodesV2Response> listAppCodesV2Async(ListAppCodesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAppCodesV2);
    }

    /**
     * 查询APP Code列表
     *
     * 查询App Code列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppCodesV2Request 请求对象
     * @return AsyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response>
     */
    public AsyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response> listAppCodesV2AsyncInvoker(
        ListAppCodesV2Request request) {
        return new AsyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response>(request, RomaMeta.listAppCodesV2,
            hcClient);
    }

    /**
     * 查询应用配置列表
     *
     * 查询应用配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppConfigsV2Request 请求对象
     * @return CompletableFuture<ListAppConfigsV2Response>
     */
    public CompletableFuture<ListAppConfigsV2Response> listAppConfigsV2Async(ListAppConfigsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAppConfigsV2);
    }

    /**
     * 查询应用配置列表
     *
     * 查询应用配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppConfigsV2Request 请求对象
     * @return AsyncInvoker<ListAppConfigsV2Request, ListAppConfigsV2Response>
     */
    public AsyncInvoker<ListAppConfigsV2Request, ListAppConfigsV2Response> listAppConfigsV2AsyncInvoker(
        ListAppConfigsV2Request request) {
        return new AsyncInvoker<ListAppConfigsV2Request, ListAppConfigsV2Response>(request, RomaMeta.listAppConfigsV2,
            hcClient);
    }

    /**
     * 查询客户端配额可绑定的客户端应用列表
     *
     * 查询客户端配额可绑定的客户端应用列表。支持按客户端应用名称模糊搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppQuotaBindableAppsRequest 请求对象
     * @return CompletableFuture<ListAppQuotaBindableAppsResponse>
     */
    public CompletableFuture<ListAppQuotaBindableAppsResponse> listAppQuotaBindableAppsAsync(
        ListAppQuotaBindableAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAppQuotaBindableApps);
    }

    /**
     * 查询客户端配额可绑定的客户端应用列表
     *
     * 查询客户端配额可绑定的客户端应用列表。支持按客户端应用名称模糊搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppQuotaBindableAppsRequest 请求对象
     * @return AsyncInvoker<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse>
     */
    public AsyncInvoker<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse> listAppQuotaBindableAppsAsyncInvoker(
        ListAppQuotaBindableAppsRequest request) {
        return new AsyncInvoker<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse>(request,
            RomaMeta.listAppQuotaBindableApps, hcClient);
    }

    /**
     * 查询客户端配额已绑定的客户端应用列表
     *
     * 查询客户端配额已绑定的客户端应用列表。支持按客户端应用名称模糊匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppQuotaBoundAppsRequest 请求对象
     * @return CompletableFuture<ListAppQuotaBoundAppsResponse>
     */
    public CompletableFuture<ListAppQuotaBoundAppsResponse> listAppQuotaBoundAppsAsync(
        ListAppQuotaBoundAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAppQuotaBoundApps);
    }

    /**
     * 查询客户端配额已绑定的客户端应用列表
     *
     * 查询客户端配额已绑定的客户端应用列表。支持按客户端应用名称模糊匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppQuotaBoundAppsRequest 请求对象
     * @return AsyncInvoker<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse>
     */
    public AsyncInvoker<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse> listAppQuotaBoundAppsAsyncInvoker(
        ListAppQuotaBoundAppsRequest request) {
        return new AsyncInvoker<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse>(request,
            RomaMeta.listAppQuotaBoundApps, hcClient);
    }

    /**
     * 获取客户端配额列表
     *
     * 获取客户端配额列表。支持根据名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppQuotasRequest 请求对象
     * @return CompletableFuture<ListAppQuotasResponse>
     */
    public CompletableFuture<ListAppQuotasResponse> listAppQuotasAsync(ListAppQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAppQuotas);
    }

    /**
     * 获取客户端配额列表
     *
     * 获取客户端配额列表。支持根据名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppQuotasRequest 请求对象
     * @return AsyncInvoker<ListAppQuotasRequest, ListAppQuotasResponse>
     */
    public AsyncInvoker<ListAppQuotasRequest, ListAppQuotasResponse> listAppQuotasAsyncInvoker(
        ListAppQuotasRequest request) {
        return new AsyncInvoker<ListAppQuotasRequest, ListAppQuotasResponse>(request, RomaMeta.listAppQuotas, hcClient);
    }

    /**
     * 查询APP列表
     *
     * 查询APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsV2Request 请求对象
     * @return CompletableFuture<ListAppsV2Response>
     */
    public CompletableFuture<ListAppsV2Response> listAppsV2Async(ListAppsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAppsV2);
    }

    /**
     * 查询APP列表
     *
     * 查询APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsV2Request 请求对象
     * @return AsyncInvoker<ListAppsV2Request, ListAppsV2Response>
     */
    public AsyncInvoker<ListAppsV2Request, ListAppsV2Response> listAppsV2AsyncInvoker(ListAppsV2Request request) {
        return new AsyncInvoker<ListAppsV2Request, ListAppsV2Response>(request, RomaMeta.listAppsV2, hcClient);
    }

    /**
     * 查询命令
     *
     * 查询命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCommandsRequest 请求对象
     * @return CompletableFuture<ListCommandsResponse>
     */
    public CompletableFuture<ListCommandsResponse> listCommandsAsync(ListCommandsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listCommands);
    }

    /**
     * 查询命令
     *
     * 查询命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCommandsRequest 请求对象
     * @return AsyncInvoker<ListCommandsRequest, ListCommandsResponse>
     */
    public AsyncInvoker<ListCommandsRequest, ListCommandsResponse> listCommandsAsyncInvoker(
        ListCommandsRequest request) {
        return new AsyncInvoker<ListCommandsRequest, ListCommandsResponse>(request, RomaMeta.listCommands, hcClient);
    }

    /**
     * 查询自定义认证列表
     *
     * 查询自定义认证列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomAuthorizersV2Request 请求对象
     * @return CompletableFuture<ListCustomAuthorizersV2Response>
     */
    public CompletableFuture<ListCustomAuthorizersV2Response> listCustomAuthorizersV2Async(
        ListCustomAuthorizersV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listCustomAuthorizersV2);
    }

    /**
     * 查询自定义认证列表
     *
     * 查询自定义认证列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomAuthorizersV2Request 请求对象
     * @return AsyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response>
     */
    public AsyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> listCustomAuthorizersV2AsyncInvoker(
        ListCustomAuthorizersV2Request request) {
        return new AsyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response>(request,
            RomaMeta.listCustomAuthorizersV2, hcClient);
    }

    /**
     * 获取数据源中某个表中所有字段
     *
     * 获取数据源中中某个表中所有字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatasourceColumnsRequest 请求对象
     * @return CompletableFuture<ListDatasourceColumnsResponse>
     */
    public CompletableFuture<ListDatasourceColumnsResponse> listDatasourceColumnsAsync(
        ListDatasourceColumnsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listDatasourceColumns);
    }

    /**
     * 获取数据源中某个表中所有字段
     *
     * 获取数据源中中某个表中所有字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatasourceColumnsRequest 请求对象
     * @return AsyncInvoker<ListDatasourceColumnsRequest, ListDatasourceColumnsResponse>
     */
    public AsyncInvoker<ListDatasourceColumnsRequest, ListDatasourceColumnsResponse> listDatasourceColumnsAsyncInvoker(
        ListDatasourceColumnsRequest request) {
        return new AsyncInvoker<ListDatasourceColumnsRequest, ListDatasourceColumnsResponse>(request,
            RomaMeta.listDatasourceColumns, hcClient);
    }

    /**
     * 获取数据源中所有的表
     *
     * 获取数据源中所有的表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatasourceTablesRequest 请求对象
     * @return CompletableFuture<ListDatasourceTablesResponse>
     */
    public CompletableFuture<ListDatasourceTablesResponse> listDatasourceTablesAsync(
        ListDatasourceTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listDatasourceTables);
    }

    /**
     * 获取数据源中所有的表
     *
     * 获取数据源中所有的表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatasourceTablesRequest 请求对象
     * @return AsyncInvoker<ListDatasourceTablesRequest, ListDatasourceTablesResponse>
     */
    public AsyncInvoker<ListDatasourceTablesRequest, ListDatasourceTablesResponse> listDatasourceTablesAsyncInvoker(
        ListDatasourceTablesRequest request) {
        return new AsyncInvoker<ListDatasourceTablesRequest, ListDatasourceTablesResponse>(request,
            RomaMeta.listDatasourceTables, hcClient);
    }

    /**
     * 查询数据源
     *
     * 查询数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatasourcesRequest 请求对象
     * @return CompletableFuture<ListDatasourcesResponse>
     */
    public CompletableFuture<ListDatasourcesResponse> listDatasourcesAsync(ListDatasourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listDatasources);
    }

    /**
     * 查询数据源
     *
     * 查询数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatasourcesRequest 请求对象
     * @return AsyncInvoker<ListDatasourcesRequest, ListDatasourcesResponse>
     */
    public AsyncInvoker<ListDatasourcesRequest, ListDatasourcesResponse> listDatasourcesAsyncInvoker(
        ListDatasourcesRequest request) {
        return new AsyncInvoker<ListDatasourcesRequest, ListDatasourcesResponse>(request, RomaMeta.listDatasources,
            hcClient);
    }

    /**
     * 查询目标数据源列表
     *
     * 查询目标数据源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDestinationsRequest 请求对象
     * @return CompletableFuture<ListDestinationsResponse>
     */
    public CompletableFuture<ListDestinationsResponse> listDestinationsAsync(ListDestinationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listDestinations);
    }

    /**
     * 查询目标数据源列表
     *
     * 查询目标数据源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDestinationsRequest 请求对象
     * @return AsyncInvoker<ListDestinationsRequest, ListDestinationsResponse>
     */
    public AsyncInvoker<ListDestinationsRequest, ListDestinationsResponse> listDestinationsAsyncInvoker(
        ListDestinationsRequest request) {
        return new AsyncInvoker<ListDestinationsRequest, ListDestinationsResponse>(request, RomaMeta.listDestinations,
            hcClient);
    }

    /**
     * 查询设备
     *
     * 查询设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDevicesRequest 请求对象
     * @return CompletableFuture<ListDevicesResponse>
     */
    public CompletableFuture<ListDevicesResponse> listDevicesAsync(ListDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listDevices);
    }

    /**
     * 查询设备
     *
     * 查询设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDevicesRequest 请求对象
     * @return AsyncInvoker<ListDevicesRequest, ListDevicesResponse>
     */
    public AsyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesAsyncInvoker(ListDevicesRequest request) {
        return new AsyncInvoker<ListDevicesRequest, ListDevicesResponse>(request, RomaMeta.listDevices, hcClient);
    }

    /**
     * 查询产品内设备数量
     *
     * 查询产品内设备数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDevicesInProductRequest 请求对象
     * @return CompletableFuture<ListDevicesInProductResponse>
     */
    public CompletableFuture<ListDevicesInProductResponse> listDevicesInProductAsync(
        ListDevicesInProductRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listDevicesInProduct);
    }

    /**
     * 查询产品内设备数量
     *
     * 查询产品内设备数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDevicesInProductRequest 请求对象
     * @return AsyncInvoker<ListDevicesInProductRequest, ListDevicesInProductResponse>
     */
    public AsyncInvoker<ListDevicesInProductRequest, ListDevicesInProductResponse> listDevicesInProductAsyncInvoker(
        ListDevicesInProductRequest request) {
        return new AsyncInvoker<ListDevicesInProductRequest, ListDevicesInProductResponse>(request,
            RomaMeta.listDevicesInProduct, hcClient);
    }

    /**
     * 查询变量列表
     *
     * 查询分组下的所有环境变量的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentVariablesV2Request 请求对象
     * @return CompletableFuture<ListEnvironmentVariablesV2Response>
     */
    public CompletableFuture<ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2Async(
        ListEnvironmentVariablesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listEnvironmentVariablesV2);
    }

    /**
     * 查询变量列表
     *
     * 查询分组下的所有环境变量的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentVariablesV2Request 请求对象
     * @return AsyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response>
     */
    public AsyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2AsyncInvoker(
        ListEnvironmentVariablesV2Request request) {
        return new AsyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response>(request,
            RomaMeta.listEnvironmentVariablesV2, hcClient);
    }

    /**
     * 查询环境列表
     *
     * 查询符合条件的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentsV2Request 请求对象
     * @return CompletableFuture<ListEnvironmentsV2Response>
     */
    public CompletableFuture<ListEnvironmentsV2Response> listEnvironmentsV2Async(ListEnvironmentsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listEnvironmentsV2);
    }

    /**
     * 查询环境列表
     *
     * 查询符合条件的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentsV2Request 请求对象
     * @return AsyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response>
     */
    public AsyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response> listEnvironmentsV2AsyncInvoker(
        ListEnvironmentsV2Request request) {
        return new AsyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response>(request,
            RomaMeta.listEnvironmentsV2, hcClient);
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
     * @param ListFeaturesV2Request 请求对象
     * @return CompletableFuture<ListFeaturesV2Response>
     */
    public CompletableFuture<ListFeaturesV2Response> listFeaturesV2Async(ListFeaturesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listFeaturesV2);
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
     * @param ListFeaturesV2Request 请求对象
     * @return AsyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response>
     */
    public AsyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response> listFeaturesV2AsyncInvoker(
        ListFeaturesV2Request request) {
        return new AsyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response>(request, RomaMeta.listFeaturesV2,
            hcClient);
    }

    /**
     * API指标统计值查询-最近一段时间
     *
     * 根据API的id和最近的一段时间查询API被调用的次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。
     * &gt; 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLatelyApiStatisticsV2Request 请求对象
     * @return CompletableFuture<ListLatelyApiStatisticsV2Response>
     */
    public CompletableFuture<ListLatelyApiStatisticsV2Response> listLatelyApiStatisticsV2Async(
        ListLatelyApiStatisticsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listLatelyApiStatisticsV2);
    }

    /**
     * API指标统计值查询-最近一段时间
     *
     * 根据API的id和最近的一段时间查询API被调用的次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。
     * &gt; 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLatelyApiStatisticsV2Request 请求对象
     * @return AsyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response>
     */
    public AsyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> listLatelyApiStatisticsV2AsyncInvoker(
        ListLatelyApiStatisticsV2Request request) {
        return new AsyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response>(request,
            RomaMeta.listLatelyApiStatisticsV2, hcClient);
    }

    /**
     * 查询后端API部署历史
     *
     * 在某个实例中查询后端API的部署记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLiveDataApiDeploymentHistoryV2Request 请求对象
     * @return CompletableFuture<ListLiveDataApiDeploymentHistoryV2Response>
     */
    public CompletableFuture<ListLiveDataApiDeploymentHistoryV2Response> listLiveDataApiDeploymentHistoryV2Async(
        ListLiveDataApiDeploymentHistoryV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listLiveDataApiDeploymentHistoryV2);
    }

    /**
     * 查询后端API部署历史
     *
     * 在某个实例中查询后端API的部署记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLiveDataApiDeploymentHistoryV2Request 请求对象
     * @return AsyncInvoker<ListLiveDataApiDeploymentHistoryV2Request, ListLiveDataApiDeploymentHistoryV2Response>
     */
    public AsyncInvoker<ListLiveDataApiDeploymentHistoryV2Request, ListLiveDataApiDeploymentHistoryV2Response> listLiveDataApiDeploymentHistoryV2AsyncInvoker(
        ListLiveDataApiDeploymentHistoryV2Request request) {
        return new AsyncInvoker<ListLiveDataApiDeploymentHistoryV2Request, ListLiveDataApiDeploymentHistoryV2Response>(
            request, RomaMeta.listLiveDataApiDeploymentHistoryV2, hcClient);
    }

    /**
     * 查询后端API测试结果
     *
     * 在某个实例中查询后端API的测试结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLiveDataApiTestHistoryV2Request 请求对象
     * @return CompletableFuture<ListLiveDataApiTestHistoryV2Response>
     */
    public CompletableFuture<ListLiveDataApiTestHistoryV2Response> listLiveDataApiTestHistoryV2Async(
        ListLiveDataApiTestHistoryV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listLiveDataApiTestHistoryV2);
    }

    /**
     * 查询后端API测试结果
     *
     * 在某个实例中查询后端API的测试结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLiveDataApiTestHistoryV2Request 请求对象
     * @return AsyncInvoker<ListLiveDataApiTestHistoryV2Request, ListLiveDataApiTestHistoryV2Response>
     */
    public AsyncInvoker<ListLiveDataApiTestHistoryV2Request, ListLiveDataApiTestHistoryV2Response> listLiveDataApiTestHistoryV2AsyncInvoker(
        ListLiveDataApiTestHistoryV2Request request) {
        return new AsyncInvoker<ListLiveDataApiTestHistoryV2Request, ListLiveDataApiTestHistoryV2Response>(request,
            RomaMeta.listLiveDataApiTestHistoryV2, hcClient);
    }

    /**
     * 查询后端API列表
     *
     * 获取某个实例下的所有后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLiveDataApiV2Request 请求对象
     * @return CompletableFuture<ListLiveDataApiV2Response>
     */
    public CompletableFuture<ListLiveDataApiV2Response> listLiveDataApiV2Async(ListLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listLiveDataApiV2);
    }

    /**
     * 查询后端API列表
     *
     * 获取某个实例下的所有后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLiveDataApiV2Request 请求对象
     * @return AsyncInvoker<ListLiveDataApiV2Request, ListLiveDataApiV2Response>
     */
    public AsyncInvoker<ListLiveDataApiV2Request, ListLiveDataApiV2Response> listLiveDataApiV2AsyncInvoker(
        ListLiveDataApiV2Request request) {
        return new AsyncInvoker<ListLiveDataApiV2Request, ListLiveDataApiV2Response>(request,
            RomaMeta.listLiveDataApiV2, hcClient);
    }

    /**
     * 查询自定义后端服务数据源列表
     *
     * 查询自定义后端服务数据源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLiveDataDataSourcesV2Request 请求对象
     * @return CompletableFuture<ListLiveDataDataSourcesV2Response>
     */
    public CompletableFuture<ListLiveDataDataSourcesV2Response> listLiveDataDataSourcesV2Async(
        ListLiveDataDataSourcesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listLiveDataDataSourcesV2);
    }

    /**
     * 查询自定义后端服务数据源列表
     *
     * 查询自定义后端服务数据源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLiveDataDataSourcesV2Request 请求对象
     * @return AsyncInvoker<ListLiveDataDataSourcesV2Request, ListLiveDataDataSourcesV2Response>
     */
    public AsyncInvoker<ListLiveDataDataSourcesV2Request, ListLiveDataDataSourcesV2Response> listLiveDataDataSourcesV2AsyncInvoker(
        ListLiveDataDataSourcesV2Request request) {
        return new AsyncInvoker<ListLiveDataDataSourcesV2Request, ListLiveDataDataSourcesV2Response>(request,
            RomaMeta.listLiveDataDataSourcesV2, hcClient);
    }

    /**
     * 查询自定义后端服务配额
     *
     * 查询自定义后端服务配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLiveDataQuotaV2Request 请求对象
     * @return CompletableFuture<ListLiveDataQuotaV2Response>
     */
    public CompletableFuture<ListLiveDataQuotaV2Response> listLiveDataQuotaV2Async(ListLiveDataQuotaV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listLiveDataQuotaV2);
    }

    /**
     * 查询自定义后端服务配额
     *
     * 查询自定义后端服务配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLiveDataQuotaV2Request 请求对象
     * @return AsyncInvoker<ListLiveDataQuotaV2Request, ListLiveDataQuotaV2Response>
     */
    public AsyncInvoker<ListLiveDataQuotaV2Request, ListLiveDataQuotaV2Response> listLiveDataQuotaV2AsyncInvoker(
        ListLiveDataQuotaV2Request request) {
        return new AsyncInvoker<ListLiveDataQuotaV2Request, ListLiveDataQuotaV2Response>(request,
            RomaMeta.listLiveDataQuotaV2, hcClient);
    }

    /**
     * 任务监控信息列表查询
     *
     * 查询所有任务的监控信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMonitorInfosRequest 请求对象
     * @return CompletableFuture<ListMonitorInfosResponse>
     */
    public CompletableFuture<ListMonitorInfosResponse> listMonitorInfosAsync(ListMonitorInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listMonitorInfos);
    }

    /**
     * 任务监控信息列表查询
     *
     * 查询所有任务的监控信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMonitorInfosRequest 请求对象
     * @return AsyncInvoker<ListMonitorInfosRequest, ListMonitorInfosResponse>
     */
    public AsyncInvoker<ListMonitorInfosRequest, ListMonitorInfosResponse> listMonitorInfosAsyncInvoker(
        ListMonitorInfosRequest request) {
        return new AsyncInvoker<ListMonitorInfosRequest, ListMonitorInfosResponse>(request, RomaMeta.listMonitorInfos,
            hcClient);
    }

    /**
     * 任务监控日志查询
     *
     * 查询单个任务的所有日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMonitorLogRequest 请求对象
     * @return CompletableFuture<ListMonitorLogResponse>
     */
    public CompletableFuture<ListMonitorLogResponse> listMonitorLogAsync(ListMonitorLogRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listMonitorLog);
    }

    /**
     * 任务监控日志查询
     *
     * 查询单个任务的所有日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMonitorLogRequest 请求对象
     * @return AsyncInvoker<ListMonitorLogRequest, ListMonitorLogResponse>
     */
    public AsyncInvoker<ListMonitorLogRequest, ListMonitorLogResponse> listMonitorLogAsyncInvoker(
        ListMonitorLogRequest request) {
        return new AsyncInvoker<ListMonitorLogRequest, ListMonitorLogResponse>(request, RomaMeta.listMonitorLog,
            hcClient);
    }

    /**
     * 查询Topic列表
     *
     * 查询Topic列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMqsInstanceTopicsRequest 请求对象
     * @return CompletableFuture<ListMqsInstanceTopicsResponse>
     */
    public CompletableFuture<ListMqsInstanceTopicsResponse> listMqsInstanceTopicsAsync(
        ListMqsInstanceTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listMqsInstanceTopics);
    }

    /**
     * 查询Topic列表
     *
     * 查询Topic列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMqsInstanceTopicsRequest 请求对象
     * @return AsyncInvoker<ListMqsInstanceTopicsRequest, ListMqsInstanceTopicsResponse>
     */
    public AsyncInvoker<ListMqsInstanceTopicsRequest, ListMqsInstanceTopicsResponse> listMqsInstanceTopicsAsyncInvoker(
        ListMqsInstanceTopicsRequest request) {
        return new AsyncInvoker<ListMqsInstanceTopicsRequest, ListMqsInstanceTopicsResponse>(request,
            RomaMeta.listMqsInstanceTopics, hcClient);
    }

    /**
     * 查询订阅管理信息
     *
     * 该接口用于查询指定应用订阅管理信息的数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotificationRequest 请求对象
     * @return CompletableFuture<ListNotificationResponse>
     */
    public CompletableFuture<ListNotificationResponse> listNotificationAsync(ListNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listNotification);
    }

    /**
     * 查询订阅管理信息
     *
     * 该接口用于查询指定应用订阅管理信息的数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotificationRequest 请求对象
     * @return AsyncInvoker<ListNotificationRequest, ListNotificationResponse>
     */
    public AsyncInvoker<ListNotificationRequest, ListNotificationResponse> listNotificationAsyncInvoker(
        ListNotificationRequest request) {
        return new AsyncInvoker<ListNotificationRequest, ListNotificationResponse>(request, RomaMeta.listNotification,
            hcClient);
    }

    /**
     * 查询产品模板
     *
     * 查询产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductTemplatesRequest 请求对象
     * @return CompletableFuture<ListProductTemplatesResponse>
     */
    public CompletableFuture<ListProductTemplatesResponse> listProductTemplatesAsync(
        ListProductTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listProductTemplates);
    }

    /**
     * 查询产品模板
     *
     * 查询产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductTemplatesRequest 请求对象
     * @return AsyncInvoker<ListProductTemplatesRequest, ListProductTemplatesResponse>
     */
    public AsyncInvoker<ListProductTemplatesRequest, ListProductTemplatesResponse> listProductTemplatesAsyncInvoker(
        ListProductTemplatesRequest request) {
        return new AsyncInvoker<ListProductTemplatesRequest, ListProductTemplatesResponse>(request,
            RomaMeta.listProductTemplates, hcClient);
    }

    /**
     * 查询产品主题
     *
     * 查询产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductTopicsRequest 请求对象
     * @return CompletableFuture<ListProductTopicsResponse>
     */
    public CompletableFuture<ListProductTopicsResponse> listProductTopicsAsync(ListProductTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listProductTopics);
    }

    /**
     * 查询产品主题
     *
     * 查询产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductTopicsRequest 请求对象
     * @return AsyncInvoker<ListProductTopicsRequest, ListProductTopicsResponse>
     */
    public AsyncInvoker<ListProductTopicsRequest, ListProductTopicsResponse> listProductTopicsAsyncInvoker(
        ListProductTopicsRequest request) {
        return new AsyncInvoker<ListProductTopicsRequest, ListProductTopicsResponse>(request,
            RomaMeta.listProductTopics, hcClient);
    }

    /**
     * 查询产品
     *
     * 查询产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return CompletableFuture<ListProductsResponse>
     */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listProducts);
    }

    /**
     * 查询产品
     *
     * 查询产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return AsyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public AsyncInvoker<ListProductsRequest, ListProductsResponse> listProductsAsyncInvoker(
        ListProductsRequest request) {
        return new AsyncInvoker<ListProductsRequest, ListProductsResponse>(request, RomaMeta.listProducts, hcClient);
    }

    /**
     * 查询某个实例的租户配置列表
     *
     * 查询某个实例的租户配置列表，用户可以通过此接口查看各类型资源配置及使用情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectCofigsV2Request 请求对象
     * @return CompletableFuture<ListProjectCofigsV2Response>
     */
    public CompletableFuture<ListProjectCofigsV2Response> listProjectCofigsV2Async(ListProjectCofigsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listProjectCofigsV2);
    }

    /**
     * 查询某个实例的租户配置列表
     *
     * 查询某个实例的租户配置列表，用户可以通过此接口查看各类型资源配置及使用情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectCofigsV2Request 请求对象
     * @return AsyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response>
     */
    public AsyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response> listProjectCofigsV2AsyncInvoker(
        ListProjectCofigsV2Request request) {
        return new AsyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response>(request,
            RomaMeta.listProjectCofigsV2, hcClient);
    }

    /**
     * 查询属性
     *
     * 查询属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPropertiesRequest 请求对象
     * @return CompletableFuture<ListPropertiesResponse>
     */
    public CompletableFuture<ListPropertiesResponse> listPropertiesAsync(ListPropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listProperties);
    }

    /**
     * 查询属性
     *
     * 查询属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPropertiesRequest 请求对象
     * @return AsyncInvoker<ListPropertiesRequest, ListPropertiesResponse>
     */
    public AsyncInvoker<ListPropertiesRequest, ListPropertiesResponse> listPropertiesAsyncInvoker(
        ListPropertiesRequest request) {
        return new AsyncInvoker<ListPropertiesRequest, ListPropertiesResponse>(request, RomaMeta.listProperties,
            hcClient);
    }

    /**
     * 查询请求属性
     *
     * 查询请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRequestPropertiesRequest 请求对象
     * @return CompletableFuture<ListRequestPropertiesResponse>
     */
    public CompletableFuture<ListRequestPropertiesResponse> listRequestPropertiesAsync(
        ListRequestPropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listRequestProperties);
    }

    /**
     * 查询请求属性
     *
     * 查询请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRequestPropertiesRequest 请求对象
     * @return AsyncInvoker<ListRequestPropertiesRequest, ListRequestPropertiesResponse>
     */
    public AsyncInvoker<ListRequestPropertiesRequest, ListRequestPropertiesResponse> listRequestPropertiesAsyncInvoker(
        ListRequestPropertiesRequest request) {
        return new AsyncInvoker<ListRequestPropertiesRequest, ListRequestPropertiesResponse>(request,
            RomaMeta.listRequestProperties, hcClient);
    }

    /**
     * 查询流控策略列表
     *
     * 查询所有流控策略的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ListRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2Async(
        ListRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listRequestThrottlingPolicyV2);
    }

    /**
     * 查询流控策略列表
     *
     * 查询所有流控策略的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2AsyncInvoker(
        ListRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response>(request,
            RomaMeta.listRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查询响应属性
     *
     * 查询响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResponsePropertiesRequest 请求对象
     * @return CompletableFuture<ListResponsePropertiesResponse>
     */
    public CompletableFuture<ListResponsePropertiesResponse> listResponsePropertiesAsync(
        ListResponsePropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listResponseProperties);
    }

    /**
     * 查询响应属性
     *
     * 查询响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResponsePropertiesRequest 请求对象
     * @return AsyncInvoker<ListResponsePropertiesRequest, ListResponsePropertiesResponse>
     */
    public AsyncInvoker<ListResponsePropertiesRequest, ListResponsePropertiesResponse> listResponsePropertiesAsyncInvoker(
        ListResponsePropertiesRequest request) {
        return new AsyncInvoker<ListResponsePropertiesRequest, ListResponsePropertiesResponse>(request,
            RomaMeta.listResponseProperties, hcClient);
    }

    /**
     * 查询规则
     *
     * 查询规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRulesRequest 请求对象
     * @return CompletableFuture<ListRulesResponse>
     */
    public CompletableFuture<ListRulesResponse> listRulesAsync(ListRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listRules);
    }

    /**
     * 查询规则
     *
     * 查询规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRulesRequest 请求对象
     * @return AsyncInvoker<ListRulesRequest, ListRulesResponse>
     */
    public AsyncInvoker<ListRulesRequest, ListRulesResponse> listRulesAsyncInvoker(ListRulesRequest request) {
        return new AsyncInvoker<ListRulesRequest, ListRulesResponse>(request, RomaMeta.listRules, hcClient);
    }

    /**
     * 查询服务
     *
     * 查询服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServicesRequest 请求对象
     * @return CompletableFuture<ListServicesResponse>
     */
    public CompletableFuture<ListServicesResponse> listServicesAsync(ListServicesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listServices);
    }

    /**
     * 查询服务
     *
     * 查询服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServicesRequest 请求对象
     * @return AsyncInvoker<ListServicesRequest, ListServicesResponse>
     */
    public AsyncInvoker<ListServicesRequest, ListServicesResponse> listServicesAsyncInvoker(
        ListServicesRequest request) {
        return new AsyncInvoker<ListServicesRequest, ListServicesResponse>(request, RomaMeta.listServices, hcClient);
    }

    /**
     * 查询设备影子
     *
     * 查询设备影子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListShadowsRequest 请求对象
     * @return CompletableFuture<ListShadowsResponse>
     */
    public CompletableFuture<ListShadowsResponse> listShadowsAsync(ListShadowsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listShadows);
    }

    /**
     * 查询设备影子
     *
     * 查询设备影子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListShadowsRequest 请求对象
     * @return AsyncInvoker<ListShadowsRequest, ListShadowsResponse>
     */
    public AsyncInvoker<ListShadowsRequest, ListShadowsResponse> listShadowsAsyncInvoker(ListShadowsRequest request) {
        return new AsyncInvoker<ListShadowsRequest, ListShadowsResponse>(request, RomaMeta.listShadows, hcClient);
    }

    /**
     * 查看API绑定的签名密钥列表
     *
     * 查询某个API绑定的签名密钥列表。每个API在每个环境上应该最多只会绑定一个签名密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSignatureKeysBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListSignatureKeysBindedToApiV2Response>
     */
    public CompletableFuture<ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2Async(
        ListSignatureKeysBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listSignatureKeysBindedToApiV2);
    }

    /**
     * 查看API绑定的签名密钥列表
     *
     * 查询某个API绑定的签名密钥列表。每个API在每个环境上应该最多只会绑定一个签名密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSignatureKeysBindedToApiV2Request 请求对象
     * @return AsyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response>
     */
    public AsyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2AsyncInvoker(
        ListSignatureKeysBindedToApiV2Request request) {
        return new AsyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response>(request,
            RomaMeta.listSignatureKeysBindedToApiV2, hcClient);
    }

    /**
     * 查询签名密钥列表
     *
     * 查询所有签名密钥的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSignatureKeysV2Request 请求对象
     * @return CompletableFuture<ListSignatureKeysV2Response>
     */
    public CompletableFuture<ListSignatureKeysV2Response> listSignatureKeysV2Async(ListSignatureKeysV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listSignatureKeysV2);
    }

    /**
     * 查询签名密钥列表
     *
     * 查询所有签名密钥的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSignatureKeysV2Request 请求对象
     * @return AsyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response>
     */
    public AsyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response> listSignatureKeysV2AsyncInvoker(
        ListSignatureKeysV2Request request) {
        return new AsyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response>(request,
            RomaMeta.listSignatureKeysV2, hcClient);
    }

    /**
     * 查询源数据源列表
     *
     * 查询源数据源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSourcesRequest 请求对象
     * @return CompletableFuture<ListSourcesResponse>
     */
    public CompletableFuture<ListSourcesResponse> listSourcesAsync(ListSourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listSources);
    }

    /**
     * 查询源数据源列表
     *
     * 查询源数据源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSourcesRequest 请求对象
     * @return AsyncInvoker<ListSourcesRequest, ListSourcesResponse>
     */
    public AsyncInvoker<ListSourcesRequest, ListSourcesResponse> listSourcesAsyncInvoker(ListSourcesRequest request) {
        return new AsyncInvoker<ListSourcesRequest, ListSourcesResponse>(request, RomaMeta.listSources, hcClient);
    }

    /**
     * 查看特殊设置列表
     *
     * 查看给流控策略设置的特殊配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpecialThrottlingConfigurationsV2Request 请求对象
     * @return CompletableFuture<ListSpecialThrottlingConfigurationsV2Response>
     */
    public CompletableFuture<ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2Async(
        ListSpecialThrottlingConfigurationsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listSpecialThrottlingConfigurationsV2);
    }

    /**
     * 查看特殊设置列表
     *
     * 查看给流控策略设置的特殊配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpecialThrottlingConfigurationsV2Request 请求对象
     * @return AsyncInvoker<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response>
     */
    public AsyncInvoker<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2AsyncInvoker(
        ListSpecialThrottlingConfigurationsV2Request request) {
        return new AsyncInvoker<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response>(
            request, RomaMeta.listSpecialThrottlingConfigurationsV2, hcClient);
    }

    /**
     * 查询API指标统计值
     *
     * 查询某个实例下的API统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStatisticsApiRequest 请求对象
     * @return CompletableFuture<ListStatisticsApiResponse>
     */
    public CompletableFuture<ListStatisticsApiResponse> listStatisticsApiAsync(ListStatisticsApiRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listStatisticsApi);
    }

    /**
     * 查询API指标统计值
     *
     * 查询某个实例下的API统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStatisticsApiRequest 请求对象
     * @return AsyncInvoker<ListStatisticsApiRequest, ListStatisticsApiResponse>
     */
    public AsyncInvoker<ListStatisticsApiRequest, ListStatisticsApiResponse> listStatisticsApiAsyncInvoker(
        ListStatisticsApiRequest request) {
        return new AsyncInvoker<ListStatisticsApiRequest, ListStatisticsApiResponse>(request,
            RomaMeta.listStatisticsApi, hcClient);
    }

    /**
     * 查询子设备
     *
     * 查询子设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubsetsRequest 请求对象
     * @return CompletableFuture<ListSubsetsResponse>
     */
    public CompletableFuture<ListSubsetsResponse> listSubsetsAsync(ListSubsetsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listSubsets);
    }

    /**
     * 查询子设备
     *
     * 查询子设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubsetsRequest 请求对象
     * @return AsyncInvoker<ListSubsetsRequest, ListSubsetsResponse>
     */
    public AsyncInvoker<ListSubsetsRequest, ListSubsetsResponse> listSubsetsAsyncInvoker(ListSubsetsRequest request) {
        return new AsyncInvoker<ListSubsetsRequest, ListSubsetsResponse>(request, RomaMeta.listSubsets, hcClient);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsV2Request 请求对象
     * @return CompletableFuture<ListTagsV2Response>
     */
    public CompletableFuture<ListTagsV2Response> listTagsV2Async(ListTagsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listTagsV2);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsV2Request 请求对象
     * @return AsyncInvoker<ListTagsV2Request, ListTagsV2Response>
     */
    public AsyncInvoker<ListTagsV2Request, ListTagsV2Response> listTagsV2AsyncInvoker(ListTagsV2Request request) {
        return new AsyncInvoker<ListTagsV2Request, ListTagsV2Response>(request, RomaMeta.listTagsV2, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return CompletableFuture<ListTasksResponse>
     */
    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listTasks);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return AsyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<ListTasksRequest, ListTasksResponse>(request, RomaMeta.listTasks, hcClient);
    }

    /**
     * 查询设备主题
     *
     * 查询设备主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTopicsRequest 请求对象
     * @return CompletableFuture<ListTopicsResponse>
     */
    public CompletableFuture<ListTopicsResponse> listTopicsAsync(ListTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listTopics);
    }

    /**
     * 查询设备主题
     *
     * 查询设备主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTopicsRequest 请求对象
     * @return AsyncInvoker<ListTopicsRequest, ListTopicsResponse>
     */
    public AsyncInvoker<ListTopicsRequest, ListTopicsResponse> listTopicsAsyncInvoker(ListTopicsRequest request) {
        return new AsyncInvoker<ListTopicsRequest, ListTopicsResponse>(request, RomaMeta.listTopics, hcClient);
    }

    /**
     * 部署后端API
     *
     * 在某个实例中部署后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishLiveDataApiV2Request 请求对象
     * @return CompletableFuture<PublishLiveDataApiV2Response>
     */
    public CompletableFuture<PublishLiveDataApiV2Response> publishLiveDataApiV2Async(
        PublishLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.publishLiveDataApiV2);
    }

    /**
     * 部署后端API
     *
     * 在某个实例中部署后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishLiveDataApiV2Request 请求对象
     * @return AsyncInvoker<PublishLiveDataApiV2Request, PublishLiveDataApiV2Response>
     */
    public AsyncInvoker<PublishLiveDataApiV2Request, PublishLiveDataApiV2Response> publishLiveDataApiV2AsyncInvoker(
        PublishLiveDataApiV2Request request) {
        return new AsyncInvoker<PublishLiveDataApiV2Request, PublishLiveDataApiV2Response>(request,
            RomaMeta.publishLiveDataApiV2, hcClient);
    }

    /**
     * 重置设备鉴权信息
     *
     * 重置设备鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetAuthenticationRequest 请求对象
     * @return CompletableFuture<ResetAuthenticationResponse>
     */
    public CompletableFuture<ResetAuthenticationResponse> resetAuthenticationAsync(ResetAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.resetAuthentication);
    }

    /**
     * 重置设备鉴权信息
     *
     * 重置设备鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetAuthenticationRequest 请求对象
     * @return AsyncInvoker<ResetAuthenticationRequest, ResetAuthenticationResponse>
     */
    public AsyncInvoker<ResetAuthenticationRequest, ResetAuthenticationResponse> resetAuthenticationAsyncInvoker(
        ResetAuthenticationRequest request) {
        return new AsyncInvoker<ResetAuthenticationRequest, ResetAuthenticationResponse>(request,
            RomaMeta.resetAuthentication, hcClient);
    }

    /**
     * 重发消息
     *
     * 重发消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetMessagesRequest 请求对象
     * @return CompletableFuture<ResetMessagesResponse>
     */
    public CompletableFuture<ResetMessagesResponse> resetMessagesAsync(ResetMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.resetMessages);
    }

    /**
     * 重发消息
     *
     * 重发消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetMessagesRequest 请求对象
     * @return AsyncInvoker<ResetMessagesRequest, ResetMessagesResponse>
     */
    public AsyncInvoker<ResetMessagesRequest, ResetMessagesResponse> resetMessagesAsyncInvoker(
        ResetMessagesRequest request) {
        return new AsyncInvoker<ResetMessagesRequest, ResetMessagesResponse>(request, RomaMeta.resetMessages, hcClient);
    }

    /**
     * 重置组合任务进度
     *
     * 重置组合任务进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetMultiTaskOffsetRequest 请求对象
     * @return CompletableFuture<ResetMultiTaskOffsetResponse>
     */
    public CompletableFuture<ResetMultiTaskOffsetResponse> resetMultiTaskOffsetAsync(
        ResetMultiTaskOffsetRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.resetMultiTaskOffset);
    }

    /**
     * 重置组合任务进度
     *
     * 重置组合任务进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetMultiTaskOffsetRequest 请求对象
     * @return AsyncInvoker<ResetMultiTaskOffsetRequest, ResetMultiTaskOffsetResponse>
     */
    public AsyncInvoker<ResetMultiTaskOffsetRequest, ResetMultiTaskOffsetResponse> resetMultiTaskOffsetAsyncInvoker(
        ResetMultiTaskOffsetRequest request) {
        return new AsyncInvoker<ResetMultiTaskOffsetRequest, ResetMultiTaskOffsetResponse>(request,
            RomaMeta.resetMultiTaskOffset, hcClient);
    }

    /**
     * 重置产品鉴权信息
     *
     * 重置产品鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetProductAuthenticationRequest 请求对象
     * @return CompletableFuture<ResetProductAuthenticationResponse>
     */
    public CompletableFuture<ResetProductAuthenticationResponse> resetProductAuthenticationAsync(
        ResetProductAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.resetProductAuthentication);
    }

    /**
     * 重置产品鉴权信息
     *
     * 重置产品鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetProductAuthenticationRequest 请求对象
     * @return AsyncInvoker<ResetProductAuthenticationRequest, ResetProductAuthenticationResponse>
     */
    public AsyncInvoker<ResetProductAuthenticationRequest, ResetProductAuthenticationResponse> resetProductAuthenticationAsyncInvoker(
        ResetProductAuthenticationRequest request) {
        return new AsyncInvoker<ResetProductAuthenticationRequest, ResetProductAuthenticationResponse>(request,
            RomaMeta.resetProductAuthentication, hcClient);
    }

    /**
     * 手工触发单个任务
     *
     * 手工触发一次任务调度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTaskRequest 请求对象
     * @return CompletableFuture<RunTaskResponse>
     */
    public CompletableFuture<RunTaskResponse> runTaskAsync(RunTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.runTask);
    }

    /**
     * 手工触发单个任务
     *
     * 手工触发一次任务调度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTaskRequest 请求对象
     * @return AsyncInvoker<RunTaskRequest, RunTaskResponse>
     */
    public AsyncInvoker<RunTaskRequest, RunTaskResponse> runTaskAsyncInvoker(RunTaskRequest request) {
        return new AsyncInvoker<RunTaskRequest, RunTaskResponse>(request, RomaMeta.runTask, hcClient);
    }

    /**
     * 发送命令
     *
     * 发送命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendCommandRequest 请求对象
     * @return CompletableFuture<SendCommandResponse>
     */
    public CompletableFuture<SendCommandResponse> sendCommandAsync(SendCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.sendCommand);
    }

    /**
     * 发送命令
     *
     * 发送命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendCommandRequest 请求对象
     * @return AsyncInvoker<SendCommandRequest, SendCommandResponse>
     */
    public AsyncInvoker<SendCommandRequest, SendCommandResponse> sendCommandAsyncInvoker(SendCommandRequest request) {
        return new AsyncInvoker<SendCommandRequest, SendCommandResponse>(request, RomaMeta.sendCommand, hcClient);
    }

    /**
     * 查询客户端应用关联的应用配额
     *
     * 查看指定客户端应用关联的应用配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppBoundAppQuotaRequest 请求对象
     * @return CompletableFuture<ShowAppBoundAppQuotaResponse>
     */
    public CompletableFuture<ShowAppBoundAppQuotaResponse> showAppBoundAppQuotaAsync(
        ShowAppBoundAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showAppBoundAppQuota);
    }

    /**
     * 查询客户端应用关联的应用配额
     *
     * 查看指定客户端应用关联的应用配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppBoundAppQuotaRequest 请求对象
     * @return AsyncInvoker<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse>
     */
    public AsyncInvoker<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse> showAppBoundAppQuotaAsyncInvoker(
        ShowAppBoundAppQuotaRequest request) {
        return new AsyncInvoker<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse>(request,
            RomaMeta.showAppBoundAppQuota, hcClient);
    }

    /**
     * 获取客户端配额详情
     *
     * 获取客户端配额详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppQuotaRequest 请求对象
     * @return CompletableFuture<ShowAppQuotaResponse>
     */
    public CompletableFuture<ShowAppQuotaResponse> showAppQuotaAsync(ShowAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showAppQuota);
    }

    /**
     * 获取客户端配额详情
     *
     * 获取客户端配额详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppQuotaRequest 请求对象
     * @return AsyncInvoker<ShowAppQuotaRequest, ShowAppQuotaResponse>
     */
    public AsyncInvoker<ShowAppQuotaRequest, ShowAppQuotaResponse> showAppQuotaAsyncInvoker(
        ShowAppQuotaRequest request) {
        return new AsyncInvoker<ShowAppQuotaRequest, ShowAppQuotaResponse>(request, RomaMeta.showAppQuota, hcClient);
    }

    /**
     * 查询设备鉴权信息
     *
     * 查询设备鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuthenticationRequest 请求对象
     * @return CompletableFuture<ShowAuthenticationResponse>
     */
    public CompletableFuture<ShowAuthenticationResponse> showAuthenticationAsync(ShowAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showAuthentication);
    }

    /**
     * 查询设备鉴权信息
     *
     * 查询设备鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuthenticationRequest 请求对象
     * @return AsyncInvoker<ShowAuthenticationRequest, ShowAuthenticationResponse>
     */
    public AsyncInvoker<ShowAuthenticationRequest, ShowAuthenticationResponse> showAuthenticationAsyncInvoker(
        ShowAuthenticationRequest request) {
        return new AsyncInvoker<ShowAuthenticationRequest, ShowAuthenticationResponse>(request,
            RomaMeta.showAuthentication, hcClient);
    }

    /**
     * 查询命令详情
     *
     * 查询命令详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCommandRequest 请求对象
     * @return CompletableFuture<ShowCommandResponse>
     */
    public CompletableFuture<ShowCommandResponse> showCommandAsync(ShowCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showCommand);
    }

    /**
     * 查询命令详情
     *
     * 查询命令详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCommandRequest 请求对象
     * @return AsyncInvoker<ShowCommandRequest, ShowCommandResponse>
     */
    public AsyncInvoker<ShowCommandRequest, ShowCommandResponse> showCommandAsyncInvoker(ShowCommandRequest request) {
        return new AsyncInvoker<ShowCommandRequest, ShowCommandResponse>(request, RomaMeta.showCommand, hcClient);
    }

    /**
     * 查询指定数据源
     *
     * 根据数据源id查询数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataourceDetailRequest 请求对象
     * @return CompletableFuture<ShowDataourceDetailResponse>
     */
    public CompletableFuture<ShowDataourceDetailResponse> showDataourceDetailAsync(ShowDataourceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDataourceDetail);
    }

    /**
     * 查询指定数据源
     *
     * 根据数据源id查询数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataourceDetailRequest 请求对象
     * @return AsyncInvoker<ShowDataourceDetailRequest, ShowDataourceDetailResponse>
     */
    public AsyncInvoker<ShowDataourceDetailRequest, ShowDataourceDetailResponse> showDataourceDetailAsyncInvoker(
        ShowDataourceDetailRequest request) {
        return new AsyncInvoker<ShowDataourceDetailRequest, ShowDataourceDetailResponse>(request,
            RomaMeta.showDataourceDetail, hcClient);
    }

    /**
     * 查看APP的访问控制详情
     *
     * 查看APP的访问控制详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfAppAclRequest 请求对象
     * @return CompletableFuture<ShowDetailsOfAppAclResponse>
     */
    public CompletableFuture<ShowDetailsOfAppAclResponse> showDetailsOfAppAclAsync(ShowDetailsOfAppAclRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfAppAcl);
    }

    /**
     * 查看APP的访问控制详情
     *
     * 查看APP的访问控制详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfAppAclRequest 请求对象
     * @return AsyncInvoker<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse>
     */
    public AsyncInvoker<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse> showDetailsOfAppAclAsyncInvoker(
        ShowDetailsOfAppAclRequest request) {
        return new AsyncInvoker<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse>(request,
            RomaMeta.showDetailsOfAppAcl, hcClient);
    }

    /**
     * 查看APP Code详情
     *
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfAppCodeV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfAppCodeV2Response>
     */
    public CompletableFuture<ShowDetailsOfAppCodeV2Response> showDetailsOfAppCodeV2Async(
        ShowDetailsOfAppCodeV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfAppCodeV2);
    }

    /**
     * 查看APP Code详情
     *
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfAppCodeV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response>
     */
    public AsyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> showDetailsOfAppCodeV2AsyncInvoker(
        ShowDetailsOfAppCodeV2Request request) {
        return new AsyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response>(request,
            RomaMeta.showDetailsOfAppCodeV2, hcClient);
    }

    /**
     * 查看应用配置详情
     *
     * 查看应用配置详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfAppConfigV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfAppConfigV2Response>
     */
    public CompletableFuture<ShowDetailsOfAppConfigV2Response> showDetailsOfAppConfigV2Async(
        ShowDetailsOfAppConfigV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfAppConfigV2);
    }

    /**
     * 查看应用配置详情
     *
     * 查看应用配置详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfAppConfigV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfAppConfigV2Request, ShowDetailsOfAppConfigV2Response>
     */
    public AsyncInvoker<ShowDetailsOfAppConfigV2Request, ShowDetailsOfAppConfigV2Response> showDetailsOfAppConfigV2AsyncInvoker(
        ShowDetailsOfAppConfigV2Request request) {
        return new AsyncInvoker<ShowDetailsOfAppConfigV2Request, ShowDetailsOfAppConfigV2Response>(request,
            RomaMeta.showDetailsOfAppConfigV2, hcClient);
    }

    /**
     * 查看APP详情
     *
     * 查看指定APP的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfAppV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfAppV2Response>
     */
    public CompletableFuture<ShowDetailsOfAppV2Response> showDetailsOfAppV2Async(ShowDetailsOfAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfAppV2);
    }

    /**
     * 查看APP详情
     *
     * 查看指定APP的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfAppV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response>
     */
    public AsyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> showDetailsOfAppV2AsyncInvoker(
        ShowDetailsOfAppV2Request request) {
        return new AsyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response>(request,
            RomaMeta.showDetailsOfAppV2, hcClient);
    }

    /**
     * 查看自定义认证详情
     *
     * 查看自定义认证详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfCustomAuthorizersV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfCustomAuthorizersV2Response>
     */
    public CompletableFuture<ShowDetailsOfCustomAuthorizersV2Response> showDetailsOfCustomAuthorizersV2Async(
        ShowDetailsOfCustomAuthorizersV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfCustomAuthorizersV2);
    }

    /**
     * 查看自定义认证详情
     *
     * 查看自定义认证详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfCustomAuthorizersV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response>
     */
    public AsyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> showDetailsOfCustomAuthorizersV2AsyncInvoker(
        ShowDetailsOfCustomAuthorizersV2Request request) {
        return new AsyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response>(
            request, RomaMeta.showDetailsOfCustomAuthorizersV2, hcClient);
    }

    /**
     * 查看域名证书
     *
     * 查看域名下绑定的证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfDomainNameCertificateV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfDomainNameCertificateV2Response>
     */
    public CompletableFuture<ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2Async(
        ShowDetailsOfDomainNameCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfDomainNameCertificateV2);
    }

    /**
     * 查看域名证书
     *
     * 查看域名下绑定的证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfDomainNameCertificateV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response>
     */
    public AsyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2AsyncInvoker(
        ShowDetailsOfDomainNameCertificateV2Request request) {
        return new AsyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response>(
            request, RomaMeta.showDetailsOfDomainNameCertificateV2, hcClient);
    }

    /**
     * 查看变量详情
     *
     * 查看指定的环境变量的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfEnvironmentVariableV2Response>
     */
    public CompletableFuture<ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2Async(
        ShowDetailsOfEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfEnvironmentVariableV2);
    }

    /**
     * 查看变量详情
     *
     * 查看指定的环境变量的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfEnvironmentVariableV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response>
     */
    public AsyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2AsyncInvoker(
        ShowDetailsOfEnvironmentVariableV2Request request) {
        return new AsyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response>(
            request, RomaMeta.showDetailsOfEnvironmentVariableV2, hcClient);
    }

    /**
     * 查看ROMA Connect实例详情
     *
     * 查看ROMA Connect实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfInstanceV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfInstanceV2Response>
     */
    public CompletableFuture<ShowDetailsOfInstanceV2Response> showDetailsOfInstanceV2Async(
        ShowDetailsOfInstanceV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfInstanceV2);
    }

    /**
     * 查看ROMA Connect实例详情
     *
     * 查看ROMA Connect实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfInstanceV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response>
     */
    public AsyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> showDetailsOfInstanceV2AsyncInvoker(
        ShowDetailsOfInstanceV2Request request) {
        return new AsyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response>(request,
            RomaMeta.showDetailsOfInstanceV2, hcClient);
    }

    /**
     * 查看流控策略详情
     *
     * 查看指定流控策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2Async(
        ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfRequestThrottlingPolicyV2);
    }

    /**
     * 查看流控策略详情
     *
     * 查看指定流控策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2AsyncInvoker(
        ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response>(
            request, RomaMeta.showDetailsOfRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查询设备详情
     *
     * 查询设备详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceRequest 请求对象
     * @return CompletableFuture<ShowDeviceResponse>
     */
    public CompletableFuture<ShowDeviceResponse> showDeviceAsync(ShowDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDevice);
    }

    /**
     * 查询设备详情
     *
     * 查询设备详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceRequest 请求对象
     * @return AsyncInvoker<ShowDeviceRequest, ShowDeviceResponse>
     */
    public AsyncInvoker<ShowDeviceRequest, ShowDeviceResponse> showDeviceAsyncInvoker(ShowDeviceRequest request) {
        return new AsyncInvoker<ShowDeviceRequest, ShowDeviceResponse>(request, RomaMeta.showDevice, hcClient);
    }

    /**
     * 查询设备分组详情
     *
     * 获取设备分组及下一层分组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceGroupRequest 请求对象
     * @return CompletableFuture<ShowDeviceGroupResponse>
     */
    public CompletableFuture<ShowDeviceGroupResponse> showDeviceGroupAsync(ShowDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDeviceGroup);
    }

    /**
     * 查询设备分组详情
     *
     * 获取设备分组及下一层分组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceGroupRequest 请求对象
     * @return AsyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse>
     */
    public AsyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse> showDeviceGroupAsyncInvoker(
        ShowDeviceGroupRequest request) {
        return new AsyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse>(request, RomaMeta.showDeviceGroup,
            hcClient);
    }

    /**
     * 查询所有设备分组
     *
     * 查询所有设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceGroupTreeRequest 请求对象
     * @return CompletableFuture<ShowDeviceGroupTreeResponse>
     */
    public CompletableFuture<ShowDeviceGroupTreeResponse> showDeviceGroupTreeAsync(ShowDeviceGroupTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDeviceGroupTree);
    }

    /**
     * 查询所有设备分组
     *
     * 查询所有设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeviceGroupTreeRequest 请求对象
     * @return AsyncInvoker<ShowDeviceGroupTreeRequest, ShowDeviceGroupTreeResponse>
     */
    public AsyncInvoker<ShowDeviceGroupTreeRequest, ShowDeviceGroupTreeResponse> showDeviceGroupTreeAsyncInvoker(
        ShowDeviceGroupTreeRequest request) {
        return new AsyncInvoker<ShowDeviceGroupTreeRequest, ShowDeviceGroupTreeResponse>(request,
            RomaMeta.showDeviceGroupTree, hcClient);
    }

    /**
     * 查询设备分组内设备
     *
     * 查询设备分组内设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDevicesInGroupRequest 请求对象
     * @return CompletableFuture<ShowDevicesInGroupResponse>
     */
    public CompletableFuture<ShowDevicesInGroupResponse> showDevicesInGroupAsync(ShowDevicesInGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDevicesInGroup);
    }

    /**
     * 查询设备分组内设备
     *
     * 查询设备分组内设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDevicesInGroupRequest 请求对象
     * @return AsyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse>
     */
    public AsyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> showDevicesInGroupAsyncInvoker(
        ShowDevicesInGroupRequest request) {
        return new AsyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse>(request,
            RomaMeta.showDevicesInGroup, hcClient);
    }

    /**
     * 查询调度计划
     *
     * 查询调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDispatchesRequest 请求对象
     * @return CompletableFuture<ShowDispatchesResponse>
     */
    public CompletableFuture<ShowDispatchesResponse> showDispatchesAsync(ShowDispatchesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDispatches);
    }

    /**
     * 查询调度计划
     *
     * 查询调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDispatchesRequest 请求对象
     * @return AsyncInvoker<ShowDispatchesRequest, ShowDispatchesResponse>
     */
    public AsyncInvoker<ShowDispatchesRequest, ShowDispatchesResponse> showDispatchesAsyncInvoker(
        ShowDispatchesRequest request) {
        return new AsyncInvoker<ShowDispatchesRequest, ShowDispatchesResponse>(request, RomaMeta.showDispatches,
            hcClient);
    }

    /**
     * 查询后端API详情
     *
     * 查询后端API的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLiveDataApiV2Request 请求对象
     * @return CompletableFuture<ShowLiveDataApiV2Response>
     */
    public CompletableFuture<ShowLiveDataApiV2Response> showLiveDataApiV2Async(ShowLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showLiveDataApiV2);
    }

    /**
     * 查询后端API详情
     *
     * 查询后端API的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLiveDataApiV2Request 请求对象
     * @return AsyncInvoker<ShowLiveDataApiV2Request, ShowLiveDataApiV2Response>
     */
    public AsyncInvoker<ShowLiveDataApiV2Request, ShowLiveDataApiV2Response> showLiveDataApiV2AsyncInvoker(
        ShowLiveDataApiV2Request request) {
        return new AsyncInvoker<ShowLiveDataApiV2Request, ShowLiveDataApiV2Response>(request,
            RomaMeta.showLiveDataApiV2, hcClient);
    }

    /**
     * 查询消息
     *
     * 查询消息的偏移量和消息内容。
     * 先根据时间戳查询消息的偏移量，再根据偏移量查询消息内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMqsInstanceMessagesRequest 请求对象
     * @return CompletableFuture<ShowMqsInstanceMessagesResponse>
     */
    public CompletableFuture<ShowMqsInstanceMessagesResponse> showMqsInstanceMessagesAsync(
        ShowMqsInstanceMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showMqsInstanceMessages);
    }

    /**
     * 查询消息
     *
     * 查询消息的偏移量和消息内容。
     * 先根据时间戳查询消息的偏移量，再根据偏移量查询消息内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMqsInstanceMessagesRequest 请求对象
     * @return AsyncInvoker<ShowMqsInstanceMessagesRequest, ShowMqsInstanceMessagesResponse>
     */
    public AsyncInvoker<ShowMqsInstanceMessagesRequest, ShowMqsInstanceMessagesResponse> showMqsInstanceMessagesAsyncInvoker(
        ShowMqsInstanceMessagesRequest request) {
        return new AsyncInvoker<ShowMqsInstanceMessagesRequest, ShowMqsInstanceMessagesResponse>(request,
            RomaMeta.showMqsInstanceMessages, hcClient);
    }

    /**
     * 查询Topic权限
     *
     * 查询Topic权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMqsInstanceTopicAccessPolicyRequest 请求对象
     * @return CompletableFuture<ShowMqsInstanceTopicAccessPolicyResponse>
     */
    public CompletableFuture<ShowMqsInstanceTopicAccessPolicyResponse> showMqsInstanceTopicAccessPolicyAsync(
        ShowMqsInstanceTopicAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showMqsInstanceTopicAccessPolicy);
    }

    /**
     * 查询Topic权限
     *
     * 查询Topic权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMqsInstanceTopicAccessPolicyRequest 请求对象
     * @return AsyncInvoker<ShowMqsInstanceTopicAccessPolicyRequest, ShowMqsInstanceTopicAccessPolicyResponse>
     */
    public AsyncInvoker<ShowMqsInstanceTopicAccessPolicyRequest, ShowMqsInstanceTopicAccessPolicyResponse> showMqsInstanceTopicAccessPolicyAsyncInvoker(
        ShowMqsInstanceTopicAccessPolicyRequest request) {
        return new AsyncInvoker<ShowMqsInstanceTopicAccessPolicyRequest, ShowMqsInstanceTopicAccessPolicyResponse>(
            request, RomaMeta.showMqsInstanceTopicAccessPolicy, hcClient);
    }

    /**
     * 查询产品详情
     *
     * 查询产品详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProductRequest 请求对象
     * @return CompletableFuture<ShowProductResponse>
     */
    public CompletableFuture<ShowProductResponse> showProductAsync(ShowProductRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showProduct);
    }

    /**
     * 查询产品详情
     *
     * 查询产品详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProductRequest 请求对象
     * @return AsyncInvoker<ShowProductRequest, ShowProductResponse>
     */
    public AsyncInvoker<ShowProductRequest, ShowProductResponse> showProductAsyncInvoker(ShowProductRequest request) {
        return new AsyncInvoker<ShowProductRequest, ShowProductResponse>(request, RomaMeta.showProduct, hcClient);
    }

    /**
     * 查询产品鉴权信息
     *
     * 查询产品鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProductAuthenticationRequest 请求对象
     * @return CompletableFuture<ShowProductAuthenticationResponse>
     */
    public CompletableFuture<ShowProductAuthenticationResponse> showProductAuthenticationAsync(
        ShowProductAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showProductAuthentication);
    }

    /**
     * 查询产品鉴权信息
     *
     * 查询产品鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProductAuthenticationRequest 请求对象
     * @return AsyncInvoker<ShowProductAuthenticationRequest, ShowProductAuthenticationResponse>
     */
    public AsyncInvoker<ShowProductAuthenticationRequest, ShowProductAuthenticationResponse> showProductAuthenticationAsyncInvoker(
        ShowProductAuthenticationRequest request) {
        return new AsyncInvoker<ShowProductAuthenticationRequest, ShowProductAuthenticationResponse>(request,
            RomaMeta.showProductAuthentication, hcClient);
    }

    /**
     * 查询产品模板详情
     *
     * 查询产品模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProductTemplateRequest 请求对象
     * @return CompletableFuture<ShowProductTemplateResponse>
     */
    public CompletableFuture<ShowProductTemplateResponse> showProductTemplateAsync(ShowProductTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showProductTemplate);
    }

    /**
     * 查询产品模板详情
     *
     * 查询产品模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProductTemplateRequest 请求对象
     * @return AsyncInvoker<ShowProductTemplateRequest, ShowProductTemplateResponse>
     */
    public AsyncInvoker<ShowProductTemplateRequest, ShowProductTemplateResponse> showProductTemplateAsyncInvoker(
        ShowProductTemplateRequest request) {
        return new AsyncInvoker<ShowProductTemplateRequest, ShowProductTemplateResponse>(request,
            RomaMeta.showProductTemplate, hcClient);
    }

    /**
     * 查询服务属性详情
     *
     * 查询服务属性详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPropertyRequest 请求对象
     * @return CompletableFuture<ShowPropertyResponse>
     */
    public CompletableFuture<ShowPropertyResponse> showPropertyAsync(ShowPropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showProperty);
    }

    /**
     * 查询服务属性详情
     *
     * 查询服务属性详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPropertyRequest 请求对象
     * @return AsyncInvoker<ShowPropertyRequest, ShowPropertyResponse>
     */
    public AsyncInvoker<ShowPropertyRequest, ShowPropertyResponse> showPropertyAsyncInvoker(
        ShowPropertyRequest request) {
        return new AsyncInvoker<ShowPropertyRequest, ShowPropertyResponse>(request, RomaMeta.showProperty, hcClient);
    }

    /**
     * 查询请求属性详情
     *
     * 查询请求属性详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRequestPropertyRequest 请求对象
     * @return CompletableFuture<ShowRequestPropertyResponse>
     */
    public CompletableFuture<ShowRequestPropertyResponse> showRequestPropertyAsync(ShowRequestPropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showRequestProperty);
    }

    /**
     * 查询请求属性详情
     *
     * 查询请求属性详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRequestPropertyRequest 请求对象
     * @return AsyncInvoker<ShowRequestPropertyRequest, ShowRequestPropertyResponse>
     */
    public AsyncInvoker<ShowRequestPropertyRequest, ShowRequestPropertyResponse> showRequestPropertyAsyncInvoker(
        ShowRequestPropertyRequest request) {
        return new AsyncInvoker<ShowRequestPropertyRequest, ShowRequestPropertyResponse>(request,
            RomaMeta.showRequestProperty, hcClient);
    }

    /**
     * 查询响应属性详情
     *
     * 查询响应属性详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResponsePropertyRequest 请求对象
     * @return CompletableFuture<ShowResponsePropertyResponse>
     */
    public CompletableFuture<ShowResponsePropertyResponse> showResponsePropertyAsync(
        ShowResponsePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showResponseProperty);
    }

    /**
     * 查询响应属性详情
     *
     * 查询响应属性详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResponsePropertyRequest 请求对象
     * @return AsyncInvoker<ShowResponsePropertyRequest, ShowResponsePropertyResponse>
     */
    public AsyncInvoker<ShowResponsePropertyRequest, ShowResponsePropertyResponse> showResponsePropertyAsyncInvoker(
        ShowResponsePropertyRequest request) {
        return new AsyncInvoker<ShowResponsePropertyRequest, ShowResponsePropertyResponse>(request,
            RomaMeta.showResponseProperty, hcClient);
    }

    /**
     * 查看ROMA Connect实例约束信息
     *
     * 查看ROMA Connect实例约束信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRestrictionOfInstanceV2Request 请求对象
     * @return CompletableFuture<ShowRestrictionOfInstanceV2Response>
     */
    public CompletableFuture<ShowRestrictionOfInstanceV2Response> showRestrictionOfInstanceV2Async(
        ShowRestrictionOfInstanceV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showRestrictionOfInstanceV2);
    }

    /**
     * 查看ROMA Connect实例约束信息
     *
     * 查看ROMA Connect实例约束信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRestrictionOfInstanceV2Request 请求对象
     * @return AsyncInvoker<ShowRestrictionOfInstanceV2Request, ShowRestrictionOfInstanceV2Response>
     */
    public AsyncInvoker<ShowRestrictionOfInstanceV2Request, ShowRestrictionOfInstanceV2Response> showRestrictionOfInstanceV2AsyncInvoker(
        ShowRestrictionOfInstanceV2Request request) {
        return new AsyncInvoker<ShowRestrictionOfInstanceV2Request, ShowRestrictionOfInstanceV2Response>(request,
            RomaMeta.showRestrictionOfInstanceV2, hcClient);
    }

    /**
     * 查询规则详情
     *
     * 查询规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRuleRequest 请求对象
     * @return CompletableFuture<ShowRuleResponse>
     */
    public CompletableFuture<ShowRuleResponse> showRuleAsync(ShowRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showRule);
    }

    /**
     * 查询规则详情
     *
     * 查询规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRuleRequest 请求对象
     * @return AsyncInvoker<ShowRuleRequest, ShowRuleResponse>
     */
    public AsyncInvoker<ShowRuleRequest, ShowRuleResponse> showRuleAsyncInvoker(ShowRuleRequest request) {
        return new AsyncInvoker<ShowRuleRequest, ShowRuleResponse>(request, RomaMeta.showRule, hcClient);
    }

    /**
     * 查询服务详情
     *
     * 查询服务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServiceRequest 请求对象
     * @return CompletableFuture<ShowServiceResponse>
     */
    public CompletableFuture<ShowServiceResponse> showServiceAsync(ShowServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showService);
    }

    /**
     * 查询服务详情
     *
     * 查询服务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServiceRequest 请求对象
     * @return AsyncInvoker<ShowServiceRequest, ShowServiceResponse>
     */
    public AsyncInvoker<ShowServiceRequest, ShowServiceResponse> showServiceAsyncInvoker(ShowServiceRequest request) {
        return new AsyncInvoker<ShowServiceRequest, ShowServiceResponse>(request, RomaMeta.showService, hcClient);
    }

    /**
     * 通过任务ID查询指定任务的信息
     *
     * 通过任务ID查询指定任务的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return CompletableFuture<ShowTaskResponse>
     */
    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showTask);
    }

    /**
     * 通过任务ID查询指定任务的信息
     *
     * 通过任务ID查询指定任务的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return AsyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public AsyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskAsyncInvoker(ShowTaskRequest request) {
        return new AsyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, RomaMeta.showTask, hcClient);
    }

    /**
     * 测试数据源连通性
     *
     * 测试数据源连通性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTestDatasourceRequest 请求对象
     * @return CompletableFuture<StartTestDatasourceResponse>
     */
    public CompletableFuture<StartTestDatasourceResponse> startTestDatasourceAsync(StartTestDatasourceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.startTestDatasource);
    }

    /**
     * 测试数据源连通性
     *
     * 测试数据源连通性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTestDatasourceRequest 请求对象
     * @return AsyncInvoker<StartTestDatasourceRequest, StartTestDatasourceResponse>
     */
    public AsyncInvoker<StartTestDatasourceRequest, StartTestDatasourceResponse> startTestDatasourceAsyncInvoker(
        StartTestDatasourceRequest request) {
        return new AsyncInvoker<StartTestDatasourceRequest, StartTestDatasourceResponse>(request,
            RomaMeta.startTestDatasource, hcClient);
    }

    /**
     * 手工停止当前执行的任务
     *
     * 手工停止当前执行的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
     * @return CompletableFuture<StopTaskResponse>
     */
    public CompletableFuture<StopTaskResponse> stopTaskAsync(StopTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.stopTask);
    }

    /**
     * 手工停止当前执行的任务
     *
     * 手工停止当前执行的任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
     * @return AsyncInvoker<StopTaskRequest, StopTaskResponse>
     */
    public AsyncInvoker<StopTaskRequest, StopTaskResponse> stopTaskAsyncInvoker(StopTaskRequest request) {
        return new AsyncInvoker<StopTaskRequest, StopTaskResponse>(request, RomaMeta.stopTask, hcClient);
    }

    /**
     * 撤销后端API
     *
     * 在某个实例中取消部署后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnpublishLiveDataApiV2Request 请求对象
     * @return CompletableFuture<UnpublishLiveDataApiV2Response>
     */
    public CompletableFuture<UnpublishLiveDataApiV2Response> unpublishLiveDataApiV2Async(
        UnpublishLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.unpublishLiveDataApiV2);
    }

    /**
     * 撤销后端API
     *
     * 在某个实例中取消部署后端API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnpublishLiveDataApiV2Request 请求对象
     * @return AsyncInvoker<UnpublishLiveDataApiV2Request, UnpublishLiveDataApiV2Response>
     */
    public AsyncInvoker<UnpublishLiveDataApiV2Request, UnpublishLiveDataApiV2Response> unpublishLiveDataApiV2AsyncInvoker(
        UnpublishLiveDataApiV2Request request) {
        return new AsyncInvoker<UnpublishLiveDataApiV2Request, UnpublishLiveDataApiV2Response>(request,
            RomaMeta.unpublishLiveDataApiV2, hcClient);
    }

    /**
     * 设置APP的访问控制
     *
     * 设置客户端配置的访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppAclRequest 请求对象
     * @return CompletableFuture<UpdateAppAclResponse>
     */
    public CompletableFuture<UpdateAppAclResponse> updateAppAclAsync(UpdateAppAclRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateAppAcl);
    }

    /**
     * 设置APP的访问控制
     *
     * 设置客户端配置的访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppAclRequest 请求对象
     * @return AsyncInvoker<UpdateAppAclRequest, UpdateAppAclResponse>
     */
    public AsyncInvoker<UpdateAppAclRequest, UpdateAppAclResponse> updateAppAclAsyncInvoker(
        UpdateAppAclRequest request) {
        return new AsyncInvoker<UpdateAppAclRequest, UpdateAppAclResponse>(request, RomaMeta.updateAppAcl, hcClient);
    }

    /**
     * 修改应用配置
     *
     * 修改应用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppConfigV2Request 请求对象
     * @return CompletableFuture<UpdateAppConfigV2Response>
     */
    public CompletableFuture<UpdateAppConfigV2Response> updateAppConfigV2Async(UpdateAppConfigV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateAppConfigV2);
    }

    /**
     * 修改应用配置
     *
     * 修改应用配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppConfigV2Request 请求对象
     * @return AsyncInvoker<UpdateAppConfigV2Request, UpdateAppConfigV2Response>
     */
    public AsyncInvoker<UpdateAppConfigV2Request, UpdateAppConfigV2Response> updateAppConfigV2AsyncInvoker(
        UpdateAppConfigV2Request request) {
        return new AsyncInvoker<UpdateAppConfigV2Request, UpdateAppConfigV2Response>(request,
            RomaMeta.updateAppConfigV2, hcClient);
    }

    /**
     * 修改客户端配额
     *
     * 修改客户端配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppQuotaRequest 请求对象
     * @return CompletableFuture<UpdateAppQuotaResponse>
     */
    public CompletableFuture<UpdateAppQuotaResponse> updateAppQuotaAsync(UpdateAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateAppQuota);
    }

    /**
     * 修改客户端配额
     *
     * 修改客户端配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppQuotaRequest 请求对象
     * @return AsyncInvoker<UpdateAppQuotaRequest, UpdateAppQuotaResponse>
     */
    public AsyncInvoker<UpdateAppQuotaRequest, UpdateAppQuotaResponse> updateAppQuotaAsyncInvoker(
        UpdateAppQuotaRequest request) {
        return new AsyncInvoker<UpdateAppQuotaRequest, UpdateAppQuotaResponse>(request, RomaMeta.updateAppQuota,
            hcClient);
    }

    /**
     * 修改命令
     *
     * 修改命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCommandRequest 请求对象
     * @return CompletableFuture<UpdateCommandResponse>
     */
    public CompletableFuture<UpdateCommandResponse> updateCommandAsync(UpdateCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateCommand);
    }

    /**
     * 修改命令
     *
     * 修改命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCommandRequest 请求对象
     * @return AsyncInvoker<UpdateCommandRequest, UpdateCommandResponse>
     */
    public AsyncInvoker<UpdateCommandRequest, UpdateCommandResponse> updateCommandAsyncInvoker(
        UpdateCommandRequest request) {
        return new AsyncInvoker<UpdateCommandRequest, UpdateCommandResponse>(request, RomaMeta.updateCommand, hcClient);
    }

    /**
     * 修改自定义认证
     *
     * 修改自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCustomAuthorizerV2Request 请求对象
     * @return CompletableFuture<UpdateCustomAuthorizerV2Response>
     */
    public CompletableFuture<UpdateCustomAuthorizerV2Response> updateCustomAuthorizerV2Async(
        UpdateCustomAuthorizerV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateCustomAuthorizerV2);
    }

    /**
     * 修改自定义认证
     *
     * 修改自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCustomAuthorizerV2Request 请求对象
     * @return AsyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response>
     */
    public AsyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> updateCustomAuthorizerV2AsyncInvoker(
        UpdateCustomAuthorizerV2Request request) {
        return new AsyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response>(request,
            RomaMeta.updateCustomAuthorizerV2, hcClient);
    }

    /**
     * 修改数据源
     *
     * 修改数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatasourceInfoRequest 请求对象
     * @return CompletableFuture<UpdateDatasourceInfoResponse>
     */
    public CompletableFuture<UpdateDatasourceInfoResponse> updateDatasourceInfoAsync(
        UpdateDatasourceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateDatasourceInfo);
    }

    /**
     * 修改数据源
     *
     * 修改数据源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatasourceInfoRequest 请求对象
     * @return AsyncInvoker<UpdateDatasourceInfoRequest, UpdateDatasourceInfoResponse>
     */
    public AsyncInvoker<UpdateDatasourceInfoRequest, UpdateDatasourceInfoResponse> updateDatasourceInfoAsyncInvoker(
        UpdateDatasourceInfoRequest request) {
        return new AsyncInvoker<UpdateDatasourceInfoRequest, UpdateDatasourceInfoResponse>(request,
            RomaMeta.updateDatasourceInfo, hcClient);
    }

    /**
     * 修改设备
     *
     * 修改设备信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceRequest 请求对象
     * @return CompletableFuture<UpdateDeviceResponse>
     */
    public CompletableFuture<UpdateDeviceResponse> updateDeviceAsync(UpdateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateDevice);
    }

    /**
     * 修改设备
     *
     * 修改设备信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>
     */
    public AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceAsyncInvoker(
        UpdateDeviceRequest request) {
        return new AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>(request, RomaMeta.updateDevice, hcClient);
    }

    /**
     * 修改设备分组
     *
     * 修改设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceGroupRequest 请求对象
     * @return CompletableFuture<UpdateDeviceGroupResponse>
     */
    public CompletableFuture<UpdateDeviceGroupResponse> updateDeviceGroupAsync(UpdateDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateDeviceGroup);
    }

    /**
     * 修改设备分组
     *
     * 修改设备分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeviceGroupRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse>
     */
    public AsyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> updateDeviceGroupAsyncInvoker(
        UpdateDeviceGroupRequest request) {
        return new AsyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse>(request,
            RomaMeta.updateDeviceGroup, hcClient);
    }

    /**
     * 修改调度计划
     *
     * 通过任务ID和调度ID修改调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDispatchesRequest 请求对象
     * @return CompletableFuture<UpdateDispatchesResponse>
     */
    public CompletableFuture<UpdateDispatchesResponse> updateDispatchesAsync(UpdateDispatchesRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateDispatches);
    }

    /**
     * 修改调度计划
     *
     * 通过任务ID和调度ID修改调度计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDispatchesRequest 请求对象
     * @return AsyncInvoker<UpdateDispatchesRequest, UpdateDispatchesResponse>
     */
    public AsyncInvoker<UpdateDispatchesRequest, UpdateDispatchesResponse> updateDispatchesAsyncInvoker(
        UpdateDispatchesRequest request) {
        return new AsyncInvoker<UpdateDispatchesRequest, UpdateDispatchesResponse>(request, RomaMeta.updateDispatches,
            hcClient);
    }

    /**
     * 修改域名
     *
     * 修改绑定的域名所对应的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainV2Request 请求对象
     * @return CompletableFuture<UpdateDomainV2Response>
     */
    public CompletableFuture<UpdateDomainV2Response> updateDomainV2Async(UpdateDomainV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateDomainV2);
    }

    /**
     * 修改域名
     *
     * 修改绑定的域名所对应的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainV2Request 请求对象
     * @return AsyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response>
     */
    public AsyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response> updateDomainV2AsyncInvoker(
        UpdateDomainV2Request request) {
        return new AsyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response>(request, RomaMeta.updateDomainV2,
            hcClient);
    }

    /**
     * 修改环境
     *
     * 修改指定环境的信息。其中可修改的属性为：name、remark，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEnvironmentV2Request 请求对象
     * @return CompletableFuture<UpdateEnvironmentV2Response>
     */
    public CompletableFuture<UpdateEnvironmentV2Response> updateEnvironmentV2Async(UpdateEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateEnvironmentV2);
    }

    /**
     * 修改环境
     *
     * 修改指定环境的信息。其中可修改的属性为：name、remark，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEnvironmentV2Request 请求对象
     * @return AsyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response>
     */
    public AsyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> updateEnvironmentV2AsyncInvoker(
        UpdateEnvironmentV2Request request) {
        return new AsyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response>(request,
            RomaMeta.updateEnvironmentV2, hcClient);
    }

    /**
     * 修改变量
     *
     * 修改环境变量。环境变量引用位置为api的后端服务地址时，修改对应环境变量会将使用该变量的所有api重新发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<UpdateEnvironmentVariableV2Response>
     */
    public CompletableFuture<UpdateEnvironmentVariableV2Response> updateEnvironmentVariableV2Async(
        UpdateEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateEnvironmentVariableV2);
    }

    /**
     * 修改变量
     *
     * 修改环境变量。环境变量引用位置为api的后端服务地址时，修改对应环境变量会将使用该变量的所有api重新发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEnvironmentVariableV2Request 请求对象
     * @return AsyncInvoker<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response>
     */
    public AsyncInvoker<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response> updateEnvironmentVariableV2AsyncInvoker(
        UpdateEnvironmentVariableV2Request request) {
        return new AsyncInvoker<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response>(request,
            RomaMeta.updateEnvironmentVariableV2, hcClient);
    }

    /**
     * 修改后端API
     *
     * 在某个实例中更新后端API的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLiveDataApiV2Request 请求对象
     * @return CompletableFuture<UpdateLiveDataApiV2Response>
     */
    public CompletableFuture<UpdateLiveDataApiV2Response> updateLiveDataApiV2Async(UpdateLiveDataApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateLiveDataApiV2);
    }

    /**
     * 修改后端API
     *
     * 在某个实例中更新后端API的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLiveDataApiV2Request 请求对象
     * @return AsyncInvoker<UpdateLiveDataApiV2Request, UpdateLiveDataApiV2Response>
     */
    public AsyncInvoker<UpdateLiveDataApiV2Request, UpdateLiveDataApiV2Response> updateLiveDataApiV2AsyncInvoker(
        UpdateLiveDataApiV2Request request) {
        return new AsyncInvoker<UpdateLiveDataApiV2Request, UpdateLiveDataApiV2Response>(request,
            RomaMeta.updateLiveDataApiV2, hcClient);
    }

    /**
     * 修改Topic
     *
     * 修改Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMqsInstanceTopicRequest 请求对象
     * @return CompletableFuture<UpdateMqsInstanceTopicResponse>
     */
    public CompletableFuture<UpdateMqsInstanceTopicResponse> updateMqsInstanceTopicAsync(
        UpdateMqsInstanceTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateMqsInstanceTopic);
    }

    /**
     * 修改Topic
     *
     * 修改Topic。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMqsInstanceTopicRequest 请求对象
     * @return AsyncInvoker<UpdateMqsInstanceTopicRequest, UpdateMqsInstanceTopicResponse>
     */
    public AsyncInvoker<UpdateMqsInstanceTopicRequest, UpdateMqsInstanceTopicResponse> updateMqsInstanceTopicAsyncInvoker(
        UpdateMqsInstanceTopicRequest request) {
        return new AsyncInvoker<UpdateMqsInstanceTopicRequest, UpdateMqsInstanceTopicResponse>(request,
            RomaMeta.updateMqsInstanceTopic, hcClient);
    }

    /**
     * 修改组合任务
     *
     * 修改组合任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMultiTasksRequest 请求对象
     * @return CompletableFuture<UpdateMultiTasksResponse>
     */
    public CompletableFuture<UpdateMultiTasksResponse> updateMultiTasksAsync(UpdateMultiTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateMultiTasks);
    }

    /**
     * 修改组合任务
     *
     * 修改组合任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMultiTasksRequest 请求对象
     * @return AsyncInvoker<UpdateMultiTasksRequest, UpdateMultiTasksResponse>
     */
    public AsyncInvoker<UpdateMultiTasksRequest, UpdateMultiTasksResponse> updateMultiTasksAsyncInvoker(
        UpdateMultiTasksRequest request) {
        return new AsyncInvoker<UpdateMultiTasksRequest, UpdateMultiTasksResponse>(request, RomaMeta.updateMultiTasks,
            hcClient);
    }

    /**
     * 修改订阅管理
     *
     * 该接口用于修改指定的订阅管理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNotificationRequest 请求对象
     * @return CompletableFuture<UpdateNotificationResponse>
     */
    public CompletableFuture<UpdateNotificationResponse> updateNotificationAsync(UpdateNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateNotification);
    }

    /**
     * 修改订阅管理
     *
     * 该接口用于修改指定的订阅管理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNotificationRequest 请求对象
     * @return AsyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse>
     */
    public AsyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse> updateNotificationAsyncInvoker(
        UpdateNotificationRequest request) {
        return new AsyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse>(request,
            RomaMeta.updateNotification, hcClient);
    }

    /**
     * 修改产品信息
     *
     * 修改产品信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProductRequest 请求对象
     * @return CompletableFuture<UpdateProductResponse>
     */
    public CompletableFuture<UpdateProductResponse> updateProductAsync(UpdateProductRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateProduct);
    }

    /**
     * 修改产品信息
     *
     * 修改产品信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProductRequest 请求对象
     * @return AsyncInvoker<UpdateProductRequest, UpdateProductResponse>
     */
    public AsyncInvoker<UpdateProductRequest, UpdateProductResponse> updateProductAsyncInvoker(
        UpdateProductRequest request) {
        return new AsyncInvoker<UpdateProductRequest, UpdateProductResponse>(request, RomaMeta.updateProduct, hcClient);
    }

    /**
     * 修改产品模板
     *
     * 修改产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProductTemplateRequest 请求对象
     * @return CompletableFuture<UpdateProductTemplateResponse>
     */
    public CompletableFuture<UpdateProductTemplateResponse> updateProductTemplateAsync(
        UpdateProductTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateProductTemplate);
    }

    /**
     * 修改产品模板
     *
     * 修改产品模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProductTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateProductTemplateRequest, UpdateProductTemplateResponse>
     */
    public AsyncInvoker<UpdateProductTemplateRequest, UpdateProductTemplateResponse> updateProductTemplateAsyncInvoker(
        UpdateProductTemplateRequest request) {
        return new AsyncInvoker<UpdateProductTemplateRequest, UpdateProductTemplateResponse>(request,
            RomaMeta.updateProductTemplate, hcClient);
    }

    /**
     * 更新产品主题
     *
     * 更新产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProductTopicRequest 请求对象
     * @return CompletableFuture<UpdateProductTopicResponse>
     */
    public CompletableFuture<UpdateProductTopicResponse> updateProductTopicAsync(UpdateProductTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateProductTopic);
    }

    /**
     * 更新产品主题
     *
     * 更新产品主题
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProductTopicRequest 请求对象
     * @return AsyncInvoker<UpdateProductTopicRequest, UpdateProductTopicResponse>
     */
    public AsyncInvoker<UpdateProductTopicRequest, UpdateProductTopicResponse> updateProductTopicAsyncInvoker(
        UpdateProductTopicRequest request) {
        return new AsyncInvoker<UpdateProductTopicRequest, UpdateProductTopicResponse>(request,
            RomaMeta.updateProductTopic, hcClient);
    }

    /**
     * 修改服务属性
     *
     * 修改服务属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePropertyRequest 请求对象
     * @return CompletableFuture<UpdatePropertyResponse>
     */
    public CompletableFuture<UpdatePropertyResponse> updatePropertyAsync(UpdatePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateProperty);
    }

    /**
     * 修改服务属性
     *
     * 修改服务属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePropertyRequest 请求对象
     * @return AsyncInvoker<UpdatePropertyRequest, UpdatePropertyResponse>
     */
    public AsyncInvoker<UpdatePropertyRequest, UpdatePropertyResponse> updatePropertyAsyncInvoker(
        UpdatePropertyRequest request) {
        return new AsyncInvoker<UpdatePropertyRequest, UpdatePropertyResponse>(request, RomaMeta.updateProperty,
            hcClient);
    }

    /**
     * 修改请求属性
     *
     * 修改请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRequestPropertyRequest 请求对象
     * @return CompletableFuture<UpdateRequestPropertyResponse>
     */
    public CompletableFuture<UpdateRequestPropertyResponse> updateRequestPropertyAsync(
        UpdateRequestPropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateRequestProperty);
    }

    /**
     * 修改请求属性
     *
     * 修改请求属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRequestPropertyRequest 请求对象
     * @return AsyncInvoker<UpdateRequestPropertyRequest, UpdateRequestPropertyResponse>
     */
    public AsyncInvoker<UpdateRequestPropertyRequest, UpdateRequestPropertyResponse> updateRequestPropertyAsyncInvoker(
        UpdateRequestPropertyRequest request) {
        return new AsyncInvoker<UpdateRequestPropertyRequest, UpdateRequestPropertyResponse>(request,
            RomaMeta.updateRequestProperty, hcClient);
    }

    /**
     * 修改流控策略
     *
     * 修改指定流控策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<UpdateRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2Async(
        UpdateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateRequestThrottlingPolicyV2);
    }

    /**
     * 修改流控策略
     *
     * 修改指定流控策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2AsyncInvoker(
        UpdateRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response>(
            request, RomaMeta.updateRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 修改响应属性
     *
     * 修改响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResponsePropertyRequest 请求对象
     * @return CompletableFuture<UpdateResponsePropertyResponse>
     */
    public CompletableFuture<UpdateResponsePropertyResponse> updateResponsePropertyAsync(
        UpdateResponsePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateResponseProperty);
    }

    /**
     * 修改响应属性
     *
     * 修改响应属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResponsePropertyRequest 请求对象
     * @return AsyncInvoker<UpdateResponsePropertyRequest, UpdateResponsePropertyResponse>
     */
    public AsyncInvoker<UpdateResponsePropertyRequest, UpdateResponsePropertyResponse> updateResponsePropertyAsyncInvoker(
        UpdateResponsePropertyRequest request) {
        return new AsyncInvoker<UpdateResponsePropertyRequest, UpdateResponsePropertyResponse>(request,
            RomaMeta.updateResponseProperty, hcClient);
    }

    /**
     * 修改规则
     *
     * 修改规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRuleRequest 请求对象
     * @return CompletableFuture<UpdateRuleResponse>
     */
    public CompletableFuture<UpdateRuleResponse> updateRuleAsync(UpdateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateRule);
    }

    /**
     * 修改规则
     *
     * 修改规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRuleRequest 请求对象
     * @return AsyncInvoker<UpdateRuleRequest, UpdateRuleResponse>
     */
    public AsyncInvoker<UpdateRuleRequest, UpdateRuleResponse> updateRuleAsyncInvoker(UpdateRuleRequest request) {
        return new AsyncInvoker<UpdateRuleRequest, UpdateRuleResponse>(request, RomaMeta.updateRule, hcClient);
    }

    /**
     * 修改服务
     *
     * 修改服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServiceRequest 请求对象
     * @return CompletableFuture<UpdateServiceResponse>
     */
    public CompletableFuture<UpdateServiceResponse> updateServiceAsync(UpdateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateService);
    }

    /**
     * 修改服务
     *
     * 修改服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServiceRequest 请求对象
     * @return AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse>
     */
    public AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse> updateServiceAsyncInvoker(
        UpdateServiceRequest request) {
        return new AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse>(request, RomaMeta.updateService, hcClient);
    }

    /**
     * 修改签名密钥
     *
     * 修改指定签名密钥的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<UpdateSignatureKeyV2Response>
     */
    public CompletableFuture<UpdateSignatureKeyV2Response> updateSignatureKeyV2Async(
        UpdateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateSignatureKeyV2);
    }

    /**
     * 修改签名密钥
     *
     * 修改指定签名密钥的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response>
     */
    public AsyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> updateSignatureKeyV2AsyncInvoker(
        UpdateSignatureKeyV2Request request) {
        return new AsyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response>(request,
            RomaMeta.updateSignatureKeyV2, hcClient);
    }

    /**
     * 修改特殊设置
     *
     * 修改某个流控策略下的某个特殊设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSpecialThrottlingConfigurationV2Request 请求对象
     * @return CompletableFuture<UpdateSpecialThrottlingConfigurationV2Response>
     */
    public CompletableFuture<UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2Async(
        UpdateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateSpecialThrottlingConfigurationV2);
    }

    /**
     * 修改特殊设置
     *
     * 修改某个流控策略下的某个特殊设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSpecialThrottlingConfigurationV2Request 请求对象
     * @return AsyncInvoker<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response>
     */
    public AsyncInvoker<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2AsyncInvoker(
        UpdateSpecialThrottlingConfigurationV2Request request) {
        return new AsyncInvoker<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response>(
            request, RomaMeta.updateSpecialThrottlingConfigurationV2, hcClient);
    }

    /**
     * 更新普通任务
     *
     * 更新普通任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRequest 请求对象
     * @return CompletableFuture<UpdateTaskResponse>
     */
    public CompletableFuture<UpdateTaskResponse> updateTaskAsync(UpdateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateTask);
    }

    /**
     * 更新普通任务
     *
     * 更新普通任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRequest 请求对象
     * @return AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskAsyncInvoker(UpdateTaskRequest request) {
        return new AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>(request, RomaMeta.updateTask, hcClient);
    }

    /**
     * 更新Topic权限
     *
     * 更新Topic权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTopicAccessPolicyRequest 请求对象
     * @return CompletableFuture<UpdateTopicAccessPolicyResponse>
     */
    public CompletableFuture<UpdateTopicAccessPolicyResponse> updateTopicAccessPolicyAsync(
        UpdateTopicAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateTopicAccessPolicy);
    }

    /**
     * 更新Topic权限
     *
     * 更新Topic权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTopicAccessPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse>
     */
    public AsyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> updateTopicAccessPolicyAsyncInvoker(
        UpdateTopicAccessPolicyRequest request) {
        return new AsyncInvoker<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse>(request,
            RomaMeta.updateTopicAccessPolicy, hcClient);
    }

    /**
     * 导入产品
     *
     * 导入产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadProductRequest 请求对象
     * @return CompletableFuture<UploadProductResponse>
     */
    public CompletableFuture<UploadProductResponse> uploadProductAsync(UploadProductRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.uploadProduct);
    }

    /**
     * 导入产品
     *
     * 导入产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadProductRequest 请求对象
     * @return AsyncInvoker<UploadProductRequest, UploadProductResponse>
     */
    public AsyncInvoker<UploadProductRequest, UploadProductResponse> uploadProductAsyncInvoker(
        UploadProductRequest request) {
        return new AsyncInvoker<UploadProductRequest, UploadProductResponse>(request, RomaMeta.uploadProduct, hcClient);
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
     * @param BatchDeleteAclV2Request 请求对象
     * @return CompletableFuture<BatchDeleteAclV2Response>
     */
    public CompletableFuture<BatchDeleteAclV2Response> batchDeleteAclV2Async(BatchDeleteAclV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchDeleteAclV2);
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
     * @param BatchDeleteAclV2Request 请求对象
     * @return AsyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response>
     */
    public AsyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response> batchDeleteAclV2AsyncInvoker(
        BatchDeleteAclV2Request request) {
        return new AsyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response>(request, RomaMeta.batchDeleteAclV2,
            hcClient);
    }

    /**
     * 创建ACL策略
     *
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP[或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com\&quot;之类的网络域名。](tag:hws;hws_hk;hcs;fcs;g42;)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAclStrategyV2Request 请求对象
     * @return CompletableFuture<CreateAclStrategyV2Response>
     */
    public CompletableFuture<CreateAclStrategyV2Response> createAclStrategyV2Async(CreateAclStrategyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createAclStrategyV2);
    }

    /**
     * 创建ACL策略
     *
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP[或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com\&quot;之类的网络域名。](tag:hws;hws_hk;hcs;fcs;g42;)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAclStrategyV2Request 请求对象
     * @return AsyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response>
     */
    public AsyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response> createAclStrategyV2AsyncInvoker(
        CreateAclStrategyV2Request request) {
        return new AsyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response>(request,
            RomaMeta.createAclStrategyV2, hcClient);
    }

    /**
     * 删除ACL策略
     *
     * 删除指定的ACL策略， 如果存在api与该ACL策略的绑定关系，则无法删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAclV2Request 请求对象
     * @return CompletableFuture<DeleteAclV2Response>
     */
    public CompletableFuture<DeleteAclV2Response> deleteAclV2Async(DeleteAclV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteAclV2);
    }

    /**
     * 删除ACL策略
     *
     * 删除指定的ACL策略， 如果存在api与该ACL策略的绑定关系，则无法删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAclV2Request 请求对象
     * @return AsyncInvoker<DeleteAclV2Request, DeleteAclV2Response>
     */
    public AsyncInvoker<DeleteAclV2Request, DeleteAclV2Response> deleteAclV2AsyncInvoker(DeleteAclV2Request request) {
        return new AsyncInvoker<DeleteAclV2Request, DeleteAclV2Response>(request, RomaMeta.deleteAclV2, hcClient);
    }

    /**
     * 查看ACL策略列表
     *
     * 查询所有的ACL策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAclStrategiesV2Request 请求对象
     * @return CompletableFuture<ListAclStrategiesV2Response>
     */
    public CompletableFuture<ListAclStrategiesV2Response> listAclStrategiesV2Async(ListAclStrategiesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAclStrategiesV2);
    }

    /**
     * 查看ACL策略列表
     *
     * 查询所有的ACL策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAclStrategiesV2Request 请求对象
     * @return AsyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response>
     */
    public AsyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response> listAclStrategiesV2AsyncInvoker(
        ListAclStrategiesV2Request request) {
        return new AsyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response>(request,
            RomaMeta.listAclStrategiesV2, hcClient);
    }

    /**
     * 查看ACL策略详情
     *
     * 查询指定ACL策略的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfAclPolicyV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfAclPolicyV2Response>
     */
    public CompletableFuture<ShowDetailsOfAclPolicyV2Response> showDetailsOfAclPolicyV2Async(
        ShowDetailsOfAclPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfAclPolicyV2);
    }

    /**
     * 查看ACL策略详情
     *
     * 查询指定ACL策略的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfAclPolicyV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response>
     */
    public AsyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> showDetailsOfAclPolicyV2AsyncInvoker(
        ShowDetailsOfAclPolicyV2Request request) {
        return new AsyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response>(request,
            RomaMeta.showDetailsOfAclPolicyV2, hcClient);
    }

    /**
     * 修改ACL策略
     *
     * 修改指定的ACL策略，其中可修改的属性为：acl_name、acl_type、acl_value，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAclStrategyV2Request 请求对象
     * @return CompletableFuture<UpdateAclStrategyV2Response>
     */
    public CompletableFuture<UpdateAclStrategyV2Response> updateAclStrategyV2Async(UpdateAclStrategyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateAclStrategyV2);
    }

    /**
     * 修改ACL策略
     *
     * 修改指定的ACL策略，其中可修改的属性为：acl_name、acl_type、acl_value，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAclStrategyV2Request 请求对象
     * @return AsyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response>
     */
    public AsyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> updateAclStrategyV2AsyncInvoker(
        UpdateAclStrategyV2Request request) {
        return new AsyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response>(request,
            RomaMeta.updateAclStrategyV2, hcClient);
    }

    /**
     * 绑定流控策略
     *
     * 将流控策略应用于API，则所有对该API的访问将会受到该流控策略的限制。
     * 
     * 当一定时间内的访问次数超过流控策略设置的API最大访问次数限制后，后续的访问将会被拒绝，从而能够较好的保护后端API免受异常流量的冲击，保障服务的稳定运行。
     * 
     * 为指定的API绑定流控策略，绑定时，需要指定在哪个环境上生效。同一个API发布到不同的环境可以绑定不同的流控策略；一个API在发布到特定环境后只能绑定一个默认的流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<AssociateRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2Async(
        AssociateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.associateRequestThrottlingPolicyV2);
    }

    /**
     * 绑定流控策略
     *
     * 将流控策略应用于API，则所有对该API的访问将会受到该流控策略的限制。
     * 
     * 当一定时间内的访问次数超过流控策略设置的API最大访问次数限制后，后续的访问将会被拒绝，从而能够较好的保护后端API免受异常流量的冲击，保障服务的稳定运行。
     * 
     * 为指定的API绑定流控策略，绑定时，需要指定在哪个环境上生效。同一个API发布到不同的环境可以绑定不同的流控策略；一个API在发布到特定环境后只能绑定一个默认的流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2AsyncInvoker(
        AssociateRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response>(
            request, RomaMeta.associateRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 批量解绑流控策略
     *
     * 批量解除API与流控策略的绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDisassociateThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<BatchDisassociateThrottlingPolicyV2Response>
     */
    public CompletableFuture<BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2Async(
        BatchDisassociateThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchDisassociateThrottlingPolicyV2);
    }

    /**
     * 批量解绑流控策略
     *
     * 批量解除API与流控策略的绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDisassociateThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response>
     */
    public AsyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2AsyncInvoker(
        BatchDisassociateThrottlingPolicyV2Request request) {
        return new AsyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response>(
            request, RomaMeta.batchDisassociateThrottlingPolicyV2, hcClient);
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
     * @param BatchPublishOrOfflineApiV2Request 请求对象
     * @return CompletableFuture<BatchPublishOrOfflineApiV2Response>
     */
    public CompletableFuture<BatchPublishOrOfflineApiV2Response> batchPublishOrOfflineApiV2Async(
        BatchPublishOrOfflineApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchPublishOrOfflineApiV2);
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
     * @param BatchPublishOrOfflineApiV2Request 请求对象
     * @return AsyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response>
     */
    public AsyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> batchPublishOrOfflineApiV2AsyncInvoker(
        BatchPublishOrOfflineApiV2Request request) {
        return new AsyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response>(request,
            RomaMeta.batchPublishOrOfflineApiV2, hcClient);
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
     * @param ChangeApiVersionV2Request 请求对象
     * @return CompletableFuture<ChangeApiVersionV2Response>
     */
    public CompletableFuture<ChangeApiVersionV2Response> changeApiVersionV2Async(ChangeApiVersionV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.changeApiVersionV2);
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
     * @param ChangeApiVersionV2Request 请求对象
     * @return AsyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response>
     */
    public AsyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response> changeApiVersionV2AsyncInvoker(
        ChangeApiVersionV2Request request) {
        return new AsyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response>(request,
            RomaMeta.changeApiVersionV2, hcClient);
    }

    /**
     * 校验API分组名称是否存在
     *
     * 校验API分组名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckApiGroupsV2Request 请求对象
     * @return CompletableFuture<CheckApiGroupsV2Response>
     */
    public CompletableFuture<CheckApiGroupsV2Response> checkApiGroupsV2Async(CheckApiGroupsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.checkApiGroupsV2);
    }

    /**
     * 校验API分组名称是否存在
     *
     * 校验API分组名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckApiGroupsV2Request 请求对象
     * @return AsyncInvoker<CheckApiGroupsV2Request, CheckApiGroupsV2Response>
     */
    public AsyncInvoker<CheckApiGroupsV2Request, CheckApiGroupsV2Response> checkApiGroupsV2AsyncInvoker(
        CheckApiGroupsV2Request request) {
        return new AsyncInvoker<CheckApiGroupsV2Request, CheckApiGroupsV2Response>(request, RomaMeta.checkApiGroupsV2,
            hcClient);
    }

    /**
     * 校验API定义
     *
     * 校验API定义。校验API的路径或名称是否已存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckApisV2Request 请求对象
     * @return CompletableFuture<CheckApisV2Response>
     */
    public CompletableFuture<CheckApisV2Response> checkApisV2Async(CheckApisV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.checkApisV2);
    }

    /**
     * 校验API定义
     *
     * 校验API定义。校验API的路径或名称是否已存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckApisV2Request 请求对象
     * @return AsyncInvoker<CheckApisV2Request, CheckApisV2Response>
     */
    public AsyncInvoker<CheckApisV2Request, CheckApisV2Response> checkApisV2AsyncInvoker(CheckApisV2Request request) {
        return new AsyncInvoker<CheckApisV2Request, CheckApisV2Response>(request, RomaMeta.checkApisV2, hcClient);
    }

    /**
     * 创建API分组
     *
     * API分组是API的管理单元，一个API分组等同于一个服务入口，创建API分组时，返回一个子域名作为访问入口。建议一个API分组下的API具有一定的相关性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApiGroupV2Request 请求对象
     * @return CompletableFuture<CreateApiGroupV2Response>
     */
    public CompletableFuture<CreateApiGroupV2Response> createApiGroupV2Async(CreateApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createApiGroupV2);
    }

    /**
     * 创建API分组
     *
     * API分组是API的管理单元，一个API分组等同于一个服务入口，创建API分组时，返回一个子域名作为访问入口。建议一个API分组下的API具有一定的相关性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApiGroupV2Request 请求对象
     * @return AsyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response>
     */
    public AsyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response> createApiGroupV2AsyncInvoker(
        CreateApiGroupV2Request request) {
        return new AsyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response>(request, RomaMeta.createApiGroupV2,
            hcClient);
    }

    /**
     * 创建API
     *
     * 添加一个API，API即一个服务接口，具体的服务能力。
     * 
     * API分为两部分，第一部分为面向API使用者的API接口，定义了使用者如何调用这个API。第二部分面向API提供者，由API提供者定义这个API的真实的后端情况，定义了ROMA Connect如何去访问真实的后端服务。API的真实后端服务目前支持三种类型：传统的HTTP/HTTPS形式的web后端、[函数工作流、](tag:hws;hws_hk;hcs;fcs;g42;)MOCK。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApiV2Request 请求对象
     * @return CompletableFuture<CreateApiV2Response>
     */
    public CompletableFuture<CreateApiV2Response> createApiV2Async(CreateApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createApiV2);
    }

    /**
     * 创建API
     *
     * 添加一个API，API即一个服务接口，具体的服务能力。
     * 
     * API分为两部分，第一部分为面向API使用者的API接口，定义了使用者如何调用这个API。第二部分面向API提供者，由API提供者定义这个API的真实的后端情况，定义了ROMA Connect如何去访问真实的后端服务。API的真实后端服务目前支持三种类型：传统的HTTP/HTTPS形式的web后端、[函数工作流、](tag:hws;hws_hk;hcs;fcs;g42;)MOCK。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApiV2Request 请求对象
     * @return AsyncInvoker<CreateApiV2Request, CreateApiV2Response>
     */
    public AsyncInvoker<CreateApiV2Request, CreateApiV2Response> createApiV2AsyncInvoker(CreateApiV2Request request) {
        return new AsyncInvoker<CreateApiV2Request, CreateApiV2Response>(request, RomaMeta.createApiV2, hcClient);
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
     * @param CreateOrDeletePublishRecordForApiV2Request 请求对象
     * @return CompletableFuture<CreateOrDeletePublishRecordForApiV2Response>
     */
    public CompletableFuture<CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2Async(
        CreateOrDeletePublishRecordForApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createOrDeletePublishRecordForApiV2);
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
     * @param CreateOrDeletePublishRecordForApiV2Request 请求对象
     * @return AsyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response>
     */
    public AsyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2AsyncInvoker(
        CreateOrDeletePublishRecordForApiV2Request request) {
        return new AsyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response>(
            request, RomaMeta.createOrDeletePublishRecordForApiV2, hcClient);
    }

    /**
     * 调试API
     *
     * 调试一个API在指定运行环境下的定义，接口调用者需要具有操作该API的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DebugApiV2Request 请求对象
     * @return CompletableFuture<DebugApiV2Response>
     */
    public CompletableFuture<DebugApiV2Response> debugApiV2Async(DebugApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.debugApiV2);
    }

    /**
     * 调试API
     *
     * 调试一个API在指定运行环境下的定义，接口调用者需要具有操作该API的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DebugApiV2Request 请求对象
     * @return AsyncInvoker<DebugApiV2Request, DebugApiV2Response>
     */
    public AsyncInvoker<DebugApiV2Request, DebugApiV2Response> debugApiV2AsyncInvoker(DebugApiV2Request request) {
        return new AsyncInvoker<DebugApiV2Request, DebugApiV2Response>(request, RomaMeta.debugApiV2, hcClient);
    }

    /**
     * 根据版本编号下线API
     *
     * 对某个生效中的API版本进行下线操作，下线后，API在该版本生效的环境中将不再能够被调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApiByVersionIdV2Request 请求对象
     * @return CompletableFuture<DeleteApiByVersionIdV2Response>
     */
    public CompletableFuture<DeleteApiByVersionIdV2Response> deleteApiByVersionIdV2Async(
        DeleteApiByVersionIdV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteApiByVersionIdV2);
    }

    /**
     * 根据版本编号下线API
     *
     * 对某个生效中的API版本进行下线操作，下线后，API在该版本生效的环境中将不再能够被调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApiByVersionIdV2Request 请求对象
     * @return AsyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response>
     */
    public AsyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> deleteApiByVersionIdV2AsyncInvoker(
        DeleteApiByVersionIdV2Request request) {
        return new AsyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response>(request,
            RomaMeta.deleteApiByVersionIdV2, hcClient);
    }

    /**
     * 删除API分组
     *
     * 删除指定的API分组。
     * 分组下存在API时分组无法删除，需要删除所有分组下的API后，再删除分组。
     * 删除分组时，会一并删除直接或间接关联到该分组下的所有资源，包括独立域名、SSL证书等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApiGroupV2Request 请求对象
     * @return CompletableFuture<DeleteApiGroupV2Response>
     */
    public CompletableFuture<DeleteApiGroupV2Response> deleteApiGroupV2Async(DeleteApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteApiGroupV2);
    }

    /**
     * 删除API分组
     *
     * 删除指定的API分组。
     * 分组下存在API时分组无法删除，需要删除所有分组下的API后，再删除分组。
     * 删除分组时，会一并删除直接或间接关联到该分组下的所有资源，包括独立域名、SSL证书等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApiGroupV2Request 请求对象
     * @return AsyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response>
     */
    public AsyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response> deleteApiGroupV2AsyncInvoker(
        DeleteApiGroupV2Request request) {
        return new AsyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response>(request, RomaMeta.deleteApiGroupV2,
            hcClient);
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
     * @param DeleteApiV2Request 请求对象
     * @return CompletableFuture<DeleteApiV2Response>
     */
    public CompletableFuture<DeleteApiV2Response> deleteApiV2Async(DeleteApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteApiV2);
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
     * @param DeleteApiV2Request 请求对象
     * @return AsyncInvoker<DeleteApiV2Request, DeleteApiV2Response>
     */
    public AsyncInvoker<DeleteApiV2Request, DeleteApiV2Response> deleteApiV2AsyncInvoker(DeleteApiV2Request request) {
        return new AsyncInvoker<DeleteApiV2Request, DeleteApiV2Response>(request, RomaMeta.deleteApiV2, hcClient);
    }

    /**
     * 解除API与流控策略的绑定关系
     *
     * 解除API与流控策略的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<DisassociateRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2Async(
        DisassociateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.disassociateRequestThrottlingPolicyV2);
    }

    /**
     * 解除API与流控策略的绑定关系
     *
     * 解除API与流控策略的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2AsyncInvoker(
        DisassociateRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response>(
            request, RomaMeta.disassociateRequestThrottlingPolicyV2, hcClient);
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
     * @param ListApiGroupsV2Request 请求对象
     * @return CompletableFuture<ListApiGroupsV2Response>
     */
    public CompletableFuture<ListApiGroupsV2Response> listApiGroupsV2Async(ListApiGroupsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApiGroupsV2);
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
     * @param ListApiGroupsV2Request 请求对象
     * @return AsyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response>
     */
    public AsyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response> listApiGroupsV2AsyncInvoker(
        ListApiGroupsV2Request request) {
        return new AsyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response>(request, RomaMeta.listApiGroupsV2,
            hcClient);
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
     * @param ListApiRuntimeDefinitionV2Request 请求对象
     * @return CompletableFuture<ListApiRuntimeDefinitionV2Response>
     */
    public CompletableFuture<ListApiRuntimeDefinitionV2Response> listApiRuntimeDefinitionV2Async(
        ListApiRuntimeDefinitionV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApiRuntimeDefinitionV2);
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
     * @param ListApiRuntimeDefinitionV2Request 请求对象
     * @return AsyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response>
     */
    public AsyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> listApiRuntimeDefinitionV2AsyncInvoker(
        ListApiRuntimeDefinitionV2Request request) {
        return new AsyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response>(request,
            RomaMeta.listApiRuntimeDefinitionV2, hcClient);
    }

    /**
     * 查看版本详情
     *
     * 查询某个指定的版本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionDetailV2Request 请求对象
     * @return CompletableFuture<ListApiVersionDetailV2Response>
     */
    public CompletableFuture<ListApiVersionDetailV2Response> listApiVersionDetailV2Async(
        ListApiVersionDetailV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApiVersionDetailV2);
    }

    /**
     * 查看版本详情
     *
     * 查询某个指定的版本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionDetailV2Request 请求对象
     * @return AsyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response>
     */
    public AsyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> listApiVersionDetailV2AsyncInvoker(
        ListApiVersionDetailV2Request request) {
        return new AsyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response>(request,
            RomaMeta.listApiVersionDetailV2, hcClient);
    }

    /**
     * 查询API历史版本列表
     *
     * 查询某个API的历史版本。每个API在一个环境上最多存在10个历史版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsV2Request 请求对象
     * @return CompletableFuture<ListApiVersionsV2Response>
     */
    public CompletableFuture<ListApiVersionsV2Response> listApiVersionsV2Async(ListApiVersionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApiVersionsV2);
    }

    /**
     * 查询API历史版本列表
     *
     * 查询某个API的历史版本。每个API在一个环境上最多存在10个历史版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsV2Request 请求对象
     * @return AsyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response>
     */
    public AsyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response> listApiVersionsV2AsyncInvoker(
        ListApiVersionsV2Request request) {
        return new AsyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response>(request,
            RomaMeta.listApiVersionsV2, hcClient);
    }

    /**
     * 查看流控策略绑定的API列表
     *
     * 查询某个流控策略上已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisBindedToRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2Async(
        ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisBindedToRequestThrottlingPolicyV2);
    }

    /**
     * 查看流控策略绑定的API列表
     *
     * 查询某个流控策略上已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisBindedToRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2AsyncInvoker(
        ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response>(
            request, RomaMeta.listApisBindedToRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查看流控策略未绑定的API列表
     *
     * 查询所有未绑定到该流控策略上的自有API列表。需要API已经发布，未发布的API不予展示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisUnbindedToRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisUnbindedToRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2Async(
        ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisUnbindedToRequestThrottlingPolicyV2);
    }

    /**
     * 查看流控策略未绑定的API列表
     *
     * 查询所有未绑定到该流控策略上的自有API列表。需要API已经发布，未发布的API不予展示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisUnbindedToRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2AsyncInvoker(
        ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response>(
            request, RomaMeta.listApisUnbindedToRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查询API列表
     *
     * 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisV2Request 请求对象
     * @return CompletableFuture<ListApisV2Response>
     */
    public CompletableFuture<ListApisV2Response> listApisV2Async(ListApisV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisV2);
    }

    /**
     * 查询API列表
     *
     * 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisV2Request 请求对象
     * @return AsyncInvoker<ListApisV2Request, ListApisV2Response>
     */
    public AsyncInvoker<ListApisV2Request, ListApisV2Response> listApisV2AsyncInvoker(ListApisV2Request request) {
        return new AsyncInvoker<ListApisV2Request, ListApisV2Response>(request, RomaMeta.listApisV2, hcClient);
    }

    /**
     * 查看API绑定的流控策略列表
     *
     * 查询某个API绑定的流控策略列表。每个环境上应该最多只有一个流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRequestThrottlingPoliciesBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListRequestThrottlingPoliciesBindedToApiV2Response>
     */
    public CompletableFuture<ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2Async(
        ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listRequestThrottlingPoliciesBindedToApiV2);
    }

    /**
     * 查看API绑定的流控策略列表
     *
     * 查询某个API绑定的流控策略列表。每个环境上应该最多只有一个流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRequestThrottlingPoliciesBindedToApiV2Request 请求对象
     * @return AsyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response>
     */
    public AsyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2AsyncInvoker(
        ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return new AsyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response>(
            request, RomaMeta.listRequestThrottlingPoliciesBindedToApiV2, hcClient);
    }

    /**
     * 查询分组详情
     *
     * 查询指定分组的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfApiGroupV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfApiGroupV2Response>
     */
    public CompletableFuture<ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2Async(
        ShowDetailsOfApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfApiGroupV2);
    }

    /**
     * 查询分组详情
     *
     * 查询指定分组的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfApiGroupV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response>
     */
    public AsyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2AsyncInvoker(
        ShowDetailsOfApiGroupV2Request request) {
        return new AsyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response>(request,
            RomaMeta.showDetailsOfApiGroupV2, hcClient);
    }

    /**
     * 查询API详情
     *
     * 查看指定的API的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfApiV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfApiV2Response>
     */
    public CompletableFuture<ShowDetailsOfApiV2Response> showDetailsOfApiV2Async(ShowDetailsOfApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfApiV2);
    }

    /**
     * 查询API详情
     *
     * 查看指定的API的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfApiV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response>
     */
    public AsyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> showDetailsOfApiV2AsyncInvoker(
        ShowDetailsOfApiV2Request request) {
        return new AsyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response>(request,
            RomaMeta.showDetailsOfApiV2, hcClient);
    }

    /**
     * 修改API分组
     *
     * 修改API分组属性。其中name和remark可修改，其他属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateApiGroupV2Request 请求对象
     * @return CompletableFuture<UpdateApiGroupV2Response>
     */
    public CompletableFuture<UpdateApiGroupV2Response> updateApiGroupV2Async(UpdateApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateApiGroupV2);
    }

    /**
     * 修改API分组
     *
     * 修改API分组属性。其中name和remark可修改，其他属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateApiGroupV2Request 请求对象
     * @return AsyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response>
     */
    public AsyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response> updateApiGroupV2AsyncInvoker(
        UpdateApiGroupV2Request request) {
        return new AsyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response>(request, RomaMeta.updateApiGroupV2,
            hcClient);
    }

    /**
     * 修改API
     *
     * 修改指定API的信息，包括后端服务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateApiV2Request 请求对象
     * @return CompletableFuture<UpdateApiV2Response>
     */
    public CompletableFuture<UpdateApiV2Response> updateApiV2Async(UpdateApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateApiV2);
    }

    /**
     * 修改API
     *
     * 修改指定API的信息，包括后端服务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateApiV2Request 请求对象
     * @return AsyncInvoker<UpdateApiV2Request, UpdateApiV2Response>
     */
    public AsyncInvoker<UpdateApiV2Request, UpdateApiV2Response> updateApiV2AsyncInvoker(UpdateApiV2Request request) {
        return new AsyncInvoker<UpdateApiV2Request, UpdateApiV2Response>(request, RomaMeta.updateApiV2, hcClient);
    }

    /**
     * 批量解除API与ACL策略的绑定
     *
     * 批量解除API与ACL策略的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteApiAclBindingV2Request 请求对象
     * @return CompletableFuture<BatchDeleteApiAclBindingV2Response>
     */
    public CompletableFuture<BatchDeleteApiAclBindingV2Response> batchDeleteApiAclBindingV2Async(
        BatchDeleteApiAclBindingV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchDeleteApiAclBindingV2);
    }

    /**
     * 批量解除API与ACL策略的绑定
     *
     * 批量解除API与ACL策略的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteApiAclBindingV2Request 请求对象
     * @return AsyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response>
     */
    public AsyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> batchDeleteApiAclBindingV2AsyncInvoker(
        BatchDeleteApiAclBindingV2Request request) {
        return new AsyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response>(request,
            RomaMeta.batchDeleteApiAclBindingV2, hcClient);
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
     * @param CreateApiAclBindingV2Request 请求对象
     * @return CompletableFuture<CreateApiAclBindingV2Response>
     */
    public CompletableFuture<CreateApiAclBindingV2Response> createApiAclBindingV2Async(
        CreateApiAclBindingV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createApiAclBindingV2);
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
     * @param CreateApiAclBindingV2Request 请求对象
     * @return AsyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response>
     */
    public AsyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> createApiAclBindingV2AsyncInvoker(
        CreateApiAclBindingV2Request request) {
        return new AsyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response>(request,
            RomaMeta.createApiAclBindingV2, hcClient);
    }

    /**
     * 解除API与ACL策略的绑定
     *
     * 解除某条API与ACL策略的绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApiAclBindingV2Request 请求对象
     * @return CompletableFuture<DeleteApiAclBindingV2Response>
     */
    public CompletableFuture<DeleteApiAclBindingV2Response> deleteApiAclBindingV2Async(
        DeleteApiAclBindingV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteApiAclBindingV2);
    }

    /**
     * 解除API与ACL策略的绑定
     *
     * 解除某条API与ACL策略的绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApiAclBindingV2Request 请求对象
     * @return AsyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response>
     */
    public AsyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> deleteApiAclBindingV2AsyncInvoker(
        DeleteApiAclBindingV2Request request) {
        return new AsyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response>(request,
            RomaMeta.deleteApiAclBindingV2, hcClient);
    }

    /**
     * 查看API绑定的ACL策略列表
     *
     * 查看API绑定的ACL策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAclPolicyBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListAclPolicyBindedToApiV2Response>
     */
    public CompletableFuture<ListAclPolicyBindedToApiV2Response> listAclPolicyBindedToApiV2Async(
        ListAclPolicyBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAclPolicyBindedToApiV2);
    }

    /**
     * 查看API绑定的ACL策略列表
     *
     * 查看API绑定的ACL策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAclPolicyBindedToApiV2Request 请求对象
     * @return AsyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response>
     */
    public AsyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> listAclPolicyBindedToApiV2AsyncInvoker(
        ListAclPolicyBindedToApiV2Request request) {
        return new AsyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response>(request,
            RomaMeta.listAclPolicyBindedToApiV2, hcClient);
    }

    /**
     * 查看ACL策略绑定的API列表
     *
     * 查看ACL策略绑定的API列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisBindedToAclPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToAclPolicyV2Response>
     */
    public CompletableFuture<ListApisBindedToAclPolicyV2Response> listApisBindedToAclPolicyV2Async(
        ListApisBindedToAclPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisBindedToAclPolicyV2);
    }

    /**
     * 查看ACL策略绑定的API列表
     *
     * 查看ACL策略绑定的API列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisBindedToAclPolicyV2Request 请求对象
     * @return AsyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response>
     */
    public AsyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> listApisBindedToAclPolicyV2AsyncInvoker(
        ListApisBindedToAclPolicyV2Request request) {
        return new AsyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response>(request,
            RomaMeta.listApisBindedToAclPolicyV2, hcClient);
    }

    /**
     * 查看ACL策略未绑定的API列表
     *
     * 查看ACL策略未绑定的API列表，需要API已发布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisUnbindedToAclPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisUnbindedToAclPolicyV2Response>
     */
    public CompletableFuture<ListApisUnbindedToAclPolicyV2Response> listApisUnbindedToAclPolicyV2Async(
        ListApisUnbindedToAclPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisUnbindedToAclPolicyV2);
    }

    /**
     * 查看ACL策略未绑定的API列表
     *
     * 查看ACL策略未绑定的API列表，需要API已发布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisUnbindedToAclPolicyV2Request 请求对象
     * @return AsyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response>
     */
    public AsyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> listApisUnbindedToAclPolicyV2AsyncInvoker(
        ListApisUnbindedToAclPolicyV2Request request) {
        return new AsyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response>(request,
            RomaMeta.listApisUnbindedToAclPolicyV2, hcClient);
    }

    /**
     * 解除授权
     *
     * 解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelingAuthorizationV2Request 请求对象
     * @return CompletableFuture<CancelingAuthorizationV2Response>
     */
    public CompletableFuture<CancelingAuthorizationV2Response> cancelingAuthorizationV2Async(
        CancelingAuthorizationV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.cancelingAuthorizationV2);
    }

    /**
     * 解除授权
     *
     * 解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelingAuthorizationV2Request 请求对象
     * @return AsyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response>
     */
    public AsyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> cancelingAuthorizationV2AsyncInvoker(
        CancelingAuthorizationV2Request request) {
        return new AsyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response>(request,
            RomaMeta.cancelingAuthorizationV2, hcClient);
    }

    /**
     * APP授权
     *
     * APP创建成功后，还不能访问API，如果想要访问某个环境上的API，需要将该API在该环境上授权给APP。授权成功后，APP即可访问该环境上的这个API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAuthorizingAppsV2Request 请求对象
     * @return CompletableFuture<CreateAuthorizingAppsV2Response>
     */
    public CompletableFuture<CreateAuthorizingAppsV2Response> createAuthorizingAppsV2Async(
        CreateAuthorizingAppsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createAuthorizingAppsV2);
    }

    /**
     * APP授权
     *
     * APP创建成功后，还不能访问API，如果想要访问某个环境上的API，需要将该API在该环境上授权给APP。授权成功后，APP即可访问该环境上的这个API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAuthorizingAppsV2Request 请求对象
     * @return AsyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response>
     */
    public AsyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> createAuthorizingAppsV2AsyncInvoker(
        CreateAuthorizingAppsV2Request request) {
        return new AsyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response>(request,
            RomaMeta.createAuthorizingAppsV2, hcClient);
    }

    /**
     * 查看APP已绑定的API列表
     *
     * 查询APP已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisBindedToAppV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToAppV2Response>
     */
    public CompletableFuture<ListApisBindedToAppV2Response> listApisBindedToAppV2Async(
        ListApisBindedToAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisBindedToAppV2);
    }

    /**
     * 查看APP已绑定的API列表
     *
     * 查询APP已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisBindedToAppV2Request 请求对象
     * @return AsyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response>
     */
    public AsyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> listApisBindedToAppV2AsyncInvoker(
        ListApisBindedToAppV2Request request) {
        return new AsyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response>(request,
            RomaMeta.listApisBindedToAppV2, hcClient);
    }

    /**
     * 查看APP未绑定的API列表
     *
     * 查询指定环境上某个APP未绑定的API列表，包括自有API和从云市场购买的API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisUnbindedToAppV2Request 请求对象
     * @return CompletableFuture<ListApisUnbindedToAppV2Response>
     */
    public CompletableFuture<ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2Async(
        ListApisUnbindedToAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listApisUnbindedToAppV2);
    }

    /**
     * 查看APP未绑定的API列表
     *
     * 查询指定环境上某个APP未绑定的API列表，包括自有API和从云市场购买的API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApisUnbindedToAppV2Request 请求对象
     * @return AsyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response>
     */
    public AsyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2AsyncInvoker(
        ListApisUnbindedToAppV2Request request) {
        return new AsyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response>(request,
            RomaMeta.listApisUnbindedToAppV2, hcClient);
    }

    /**
     * 查看API已绑定的APP列表
     *
     * 查询API绑定的APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListAppsBindedToApiV2Response>
     */
    public CompletableFuture<ListAppsBindedToApiV2Response> listAppsBindedToApiV2Async(
        ListAppsBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listAppsBindedToApiV2);
    }

    /**
     * 查看API已绑定的APP列表
     *
     * 查询API绑定的APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsBindedToApiV2Request 请求对象
     * @return AsyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response>
     */
    public AsyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> listAppsBindedToApiV2AsyncInvoker(
        ListAppsBindedToApiV2Request request) {
        return new AsyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response>(request,
            RomaMeta.listAppsBindedToApiV2, hcClient);
    }

    /**
     * 查看APP下路径冲突的api列表
     *
     * 查询指定APP下路径冲突的api列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDuplicateApisForAppV2Request 请求对象
     * @return CompletableFuture<ListDuplicateApisForAppV2Response>
     */
    public CompletableFuture<ListDuplicateApisForAppV2Response> listDuplicateApisForAppV2Async(
        ListDuplicateApisForAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listDuplicateApisForAppV2);
    }

    /**
     * 查看APP下路径冲突的api列表
     *
     * 查询指定APP下路径冲突的api列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDuplicateApisForAppV2Request 请求对象
     * @return AsyncInvoker<ListDuplicateApisForAppV2Request, ListDuplicateApisForAppV2Response>
     */
    public AsyncInvoker<ListDuplicateApisForAppV2Request, ListDuplicateApisForAppV2Response> listDuplicateApisForAppV2AsyncInvoker(
        ListDuplicateApisForAppV2Request request) {
        return new AsyncInvoker<ListDuplicateApisForAppV2Request, ListDuplicateApisForAppV2Response>(request,
            RomaMeta.listDuplicateApisForAppV2, hcClient);
    }

    /**
     * 设置用户成员
     *
     * - 设置应用的用户成员，为空数组时会清空已有应用成员列表
     * - 设置动作为全量更新非增量更新，应用的成员列表都会替换为当次请求的应用成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddUserToAppRequest 请求对象
     * @return CompletableFuture<AddUserToAppResponse>
     */
    public CompletableFuture<AddUserToAppResponse> addUserToAppAsync(AddUserToAppRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.addUserToApp);
    }

    /**
     * 设置用户成员
     *
     * - 设置应用的用户成员，为空数组时会清空已有应用成员列表
     * - 设置动作为全量更新非增量更新，应用的成员列表都会替换为当次请求的应用成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddUserToAppRequest 请求对象
     * @return AsyncInvoker<AddUserToAppRequest, AddUserToAppResponse>
     */
    public AsyncInvoker<AddUserToAppRequest, AddUserToAppResponse> addUserToAppAsyncInvoker(
        AddUserToAppRequest request) {
        return new AsyncInvoker<AddUserToAppRequest, AddUserToAppResponse>(request, RomaMeta.addUserToApp, hcClient);
    }

    /**
     * 查询用户成员列表
     *
     * 查询用户成列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckAuthUsersOfAppRequest 请求对象
     * @return CompletableFuture<CheckAuthUsersOfAppResponse>
     */
    public CompletableFuture<CheckAuthUsersOfAppResponse> checkAuthUsersOfAppAsync(CheckAuthUsersOfAppRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.checkAuthUsersOfApp);
    }

    /**
     * 查询用户成员列表
     *
     * 查询用户成列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckAuthUsersOfAppRequest 请求对象
     * @return AsyncInvoker<CheckAuthUsersOfAppRequest, CheckAuthUsersOfAppResponse>
     */
    public AsyncInvoker<CheckAuthUsersOfAppRequest, CheckAuthUsersOfAppResponse> checkAuthUsersOfAppAsyncInvoker(
        CheckAuthUsersOfAppRequest request) {
        return new AsyncInvoker<CheckAuthUsersOfAppRequest, CheckAuthUsersOfAppResponse>(request,
            RomaMeta.checkAuthUsersOfApp, hcClient);
    }

    /**
     * 查询候选用户成员
     *
     * 查询应用的候选用户成员列表,会过滤掉异常状态用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckCanAuthUsersOfAppRequest 请求对象
     * @return CompletableFuture<CheckCanAuthUsersOfAppResponse>
     */
    public CompletableFuture<CheckCanAuthUsersOfAppResponse> checkCanAuthUsersOfAppAsync(
        CheckCanAuthUsersOfAppRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.checkCanAuthUsersOfApp);
    }

    /**
     * 查询候选用户成员
     *
     * 查询应用的候选用户成员列表,会过滤掉异常状态用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckCanAuthUsersOfAppRequest 请求对象
     * @return AsyncInvoker<CheckCanAuthUsersOfAppRequest, CheckCanAuthUsersOfAppResponse>
     */
    public AsyncInvoker<CheckCanAuthUsersOfAppRequest, CheckCanAuthUsersOfAppResponse> checkCanAuthUsersOfAppAsyncInvoker(
        CheckCanAuthUsersOfAppRequest request) {
        return new AsyncInvoker<CheckCanAuthUsersOfAppRequest, CheckCanAuthUsersOfAppResponse>(request,
            RomaMeta.checkCanAuthUsersOfApp, hcClient);
    }

    /**
     * 查询应用详情
     *
     * 查询应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckRomaAppDetailsRequest 请求对象
     * @return CompletableFuture<CheckRomaAppDetailsResponse>
     */
    public CompletableFuture<CheckRomaAppDetailsResponse> checkRomaAppDetailsAsync(CheckRomaAppDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.checkRomaAppDetails);
    }

    /**
     * 查询应用详情
     *
     * 查询应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckRomaAppDetailsRequest 请求对象
     * @return AsyncInvoker<CheckRomaAppDetailsRequest, CheckRomaAppDetailsResponse>
     */
    public AsyncInvoker<CheckRomaAppDetailsRequest, CheckRomaAppDetailsResponse> checkRomaAppDetailsAsyncInvoker(
        CheckRomaAppDetailsRequest request) {
        return new AsyncInvoker<CheckRomaAppDetailsRequest, CheckRomaAppDetailsResponse>(request,
            RomaMeta.checkRomaAppDetails, hcClient);
    }

    /**
     * 查询应用密钥
     *
     * 查询应用密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckRomaAppSecretRequest 请求对象
     * @return CompletableFuture<CheckRomaAppSecretResponse>
     */
    public CompletableFuture<CheckRomaAppSecretResponse> checkRomaAppSecretAsync(CheckRomaAppSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.checkRomaAppSecret);
    }

    /**
     * 查询应用密钥
     *
     * 查询应用密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckRomaAppSecretRequest 请求对象
     * @return AsyncInvoker<CheckRomaAppSecretRequest, CheckRomaAppSecretResponse>
     */
    public AsyncInvoker<CheckRomaAppSecretRequest, CheckRomaAppSecretResponse> checkRomaAppSecretAsyncInvoker(
        CheckRomaAppSecretRequest request) {
        return new AsyncInvoker<CheckRomaAppSecretRequest, CheckRomaAppSecretResponse>(request,
            RomaMeta.checkRomaAppSecret, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRomaAppRequest 请求对象
     * @return CompletableFuture<CreateRomaAppResponse>
     */
    public CompletableFuture<CreateRomaAppResponse> createRomaAppAsync(CreateRomaAppRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createRomaApp);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRomaAppRequest 请求对象
     * @return AsyncInvoker<CreateRomaAppRequest, CreateRomaAppResponse>
     */
    public AsyncInvoker<CreateRomaAppRequest, CreateRomaAppResponse> createRomaAppAsyncInvoker(
        CreateRomaAppRequest request) {
        return new AsyncInvoker<CreateRomaAppRequest, CreateRomaAppResponse>(request, RomaMeta.createRomaApp, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除单个应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRomaAppRequest 请求对象
     * @return CompletableFuture<DeleteRomaAppResponse>
     */
    public CompletableFuture<DeleteRomaAppResponse> deleteRomaAppAsync(DeleteRomaAppRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteRomaApp);
    }

    /**
     * 删除应用
     *
     * 删除单个应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRomaAppRequest 请求对象
     * @return AsyncInvoker<DeleteRomaAppRequest, DeleteRomaAppResponse>
     */
    public AsyncInvoker<DeleteRomaAppRequest, DeleteRomaAppResponse> deleteRomaAppAsyncInvoker(
        DeleteRomaAppRequest request) {
        return new AsyncInvoker<DeleteRomaAppRequest, DeleteRomaAppResponse>(request, RomaMeta.deleteRomaApp, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表，支持条件查询，所有条件是并且的关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRomaAppRequest 请求对象
     * @return CompletableFuture<ListRomaAppResponse>
     */
    public CompletableFuture<ListRomaAppResponse> listRomaAppAsync(ListRomaAppRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listRomaApp);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表，支持条件查询，所有条件是并且的关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRomaAppRequest 请求对象
     * @return AsyncInvoker<ListRomaAppRequest, ListRomaAppResponse>
     */
    public AsyncInvoker<ListRomaAppRequest, ListRomaAppResponse> listRomaAppAsyncInvoker(ListRomaAppRequest request) {
        return new AsyncInvoker<ListRomaAppRequest, ListRomaAppResponse>(request, RomaMeta.listRomaApp, hcClient);
    }

    /**
     * 重置应用密钥
     *
     * 重置应用密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetRomaAppSecretRequest 请求对象
     * @return CompletableFuture<ResetRomaAppSecretResponse>
     */
    public CompletableFuture<ResetRomaAppSecretResponse> resetRomaAppSecretAsync(ResetRomaAppSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.resetRomaAppSecret);
    }

    /**
     * 重置应用密钥
     *
     * 重置应用密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetRomaAppSecretRequest 请求对象
     * @return AsyncInvoker<ResetRomaAppSecretRequest, ResetRomaAppSecretResponse>
     */
    public AsyncInvoker<ResetRomaAppSecretRequest, ResetRomaAppSecretResponse> resetRomaAppSecretAsyncInvoker(
        ResetRomaAppSecretRequest request) {
        return new AsyncInvoker<ResetRomaAppSecretRequest, ResetRomaAppSecretResponse>(request,
            RomaMeta.resetRomaAppSecret, hcClient);
    }

    /**
     * 更新应用
     *
     * 更新应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRomaAppRequest 请求对象
     * @return CompletableFuture<UpdateRomaAppResponse>
     */
    public CompletableFuture<UpdateRomaAppResponse> updateRomaAppAsync(UpdateRomaAppRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateRomaApp);
    }

    /**
     * 更新应用
     *
     * 更新应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRomaAppRequest 请求对象
     * @return AsyncInvoker<UpdateRomaAppRequest, UpdateRomaAppResponse>
     */
    public AsyncInvoker<UpdateRomaAppRequest, UpdateRomaAppResponse> updateRomaAppAsyncInvoker(
        UpdateRomaAppRequest request) {
        return new AsyncInvoker<UpdateRomaAppRequest, UpdateRomaAppResponse>(request, RomaMeta.updateRomaApp, hcClient);
    }

    /**
     * 校验应用是否存在
     *
     * 校验指定条件的应用是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateRomaAppRequest 请求对象
     * @return CompletableFuture<ValidateRomaAppResponse>
     */
    public CompletableFuture<ValidateRomaAppResponse> validateRomaAppAsync(ValidateRomaAppRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.validateRomaApp);
    }

    /**
     * 校验应用是否存在
     *
     * 校验指定条件的应用是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateRomaAppRequest 请求对象
     * @return AsyncInvoker<ValidateRomaAppRequest, ValidateRomaAppResponse>
     */
    public AsyncInvoker<ValidateRomaAppRequest, ValidateRomaAppResponse> validateRomaAppAsyncInvoker(
        ValidateRomaAppRequest request) {
        return new AsyncInvoker<ValidateRomaAppRequest, ValidateRomaAppResponse>(request, RomaMeta.validateRomaApp,
            hcClient);
    }

    /**
     * 查询作业进度
     *
     * 查询作业进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckAssetJobStatusRequest 请求对象
     * @return CompletableFuture<CheckAssetJobStatusResponse>
     */
    public CompletableFuture<CheckAssetJobStatusResponse> checkAssetJobStatusAsync(CheckAssetJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.checkAssetJobStatus);
    }

    /**
     * 查询作业进度
     *
     * 查询作业进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckAssetJobStatusRequest 请求对象
     * @return AsyncInvoker<CheckAssetJobStatusRequest, CheckAssetJobStatusResponse>
     */
    public AsyncInvoker<CheckAssetJobStatusRequest, CheckAssetJobStatusResponse> checkAssetJobStatusAsyncInvoker(
        CheckAssetJobStatusRequest request) {
        return new AsyncInvoker<CheckAssetJobStatusRequest, CheckAssetJobStatusResponse>(request,
            RomaMeta.checkAssetJobStatus, hcClient);
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
     * @param DeleteAssetRequest 请求对象
     * @return CompletableFuture<DeleteAssetResponse>
     */
    public CompletableFuture<DeleteAssetResponse> deleteAssetAsync(DeleteAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteAsset);
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
     * @param DeleteAssetRequest 请求对象
     * @return AsyncInvoker<DeleteAssetRequest, DeleteAssetResponse>
     */
    public AsyncInvoker<DeleteAssetRequest, DeleteAssetResponse> deleteAssetAsyncInvoker(DeleteAssetRequest request) {
        return new AsyncInvoker<DeleteAssetRequest, DeleteAssetResponse>(request, RomaMeta.deleteAsset, hcClient);
    }

    /**
     * 下载资产包
     *
     * - 导出作业执行成功后，通过该接口获取导出作业产生的资产包，仅能下载一次
     * - 可先压缩后存在数据库，下载后删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadAssetArchiveRequest 请求对象
     * @return CompletableFuture<DownloadAssetArchiveResponse>
     */
    public CompletableFuture<DownloadAssetArchiveResponse> downloadAssetArchiveAsync(
        DownloadAssetArchiveRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.downloadAssetArchive);
    }

    /**
     * 下载资产包
     *
     * - 导出作业执行成功后，通过该接口获取导出作业产生的资产包，仅能下载一次
     * - 可先压缩后存在数据库，下载后删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadAssetArchiveRequest 请求对象
     * @return AsyncInvoker<DownloadAssetArchiveRequest, DownloadAssetArchiveResponse>
     */
    public AsyncInvoker<DownloadAssetArchiveRequest, DownloadAssetArchiveResponse> downloadAssetArchiveAsyncInvoker(
        DownloadAssetArchiveRequest request) {
        return new AsyncInvoker<DownloadAssetArchiveRequest, DownloadAssetArchiveResponse>(request,
            RomaMeta.downloadAssetArchive, hcClient);
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
     * @param ExportAssetRequest 请求对象
     * @return CompletableFuture<ExportAssetResponse>
     */
    public CompletableFuture<ExportAssetResponse> exportAssetAsync(ExportAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.exportAsset);
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
     * @param ExportAssetRequest 请求对象
     * @return AsyncInvoker<ExportAssetRequest, ExportAssetResponse>
     */
    public AsyncInvoker<ExportAssetRequest, ExportAssetResponse> exportAssetAsyncInvoker(ExportAssetRequest request) {
        return new AsyncInvoker<ExportAssetRequest, ExportAssetResponse>(request, RomaMeta.exportAsset, hcClient);
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
     * @param ImportAssetRequest 请求对象
     * @return CompletableFuture<ImportAssetResponse>
     */
    public CompletableFuture<ImportAssetResponse> importAssetAsync(ImportAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.importAsset);
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
     * @param ImportAssetRequest 请求对象
     * @return AsyncInvoker<ImportAssetRequest, ImportAssetResponse>
     */
    public AsyncInvoker<ImportAssetRequest, ImportAssetResponse> importAssetAsyncInvoker(ImportAssetRequest request) {
        return new AsyncInvoker<ImportAssetRequest, ImportAssetResponse>(request, RomaMeta.importAsset, hcClient);
    }

    /**
     * 查询字典详情
     *
     * 查询字典详情,
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckDictionaryRequest 请求对象
     * @return CompletableFuture<CheckDictionaryResponse>
     */
    public CompletableFuture<CheckDictionaryResponse> checkDictionaryAsync(CheckDictionaryRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.checkDictionary);
    }

    /**
     * 查询字典详情
     *
     * 查询字典详情,
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckDictionaryRequest 请求对象
     * @return AsyncInvoker<CheckDictionaryRequest, CheckDictionaryResponse>
     */
    public AsyncInvoker<CheckDictionaryRequest, CheckDictionaryResponse> checkDictionaryAsyncInvoker(
        CheckDictionaryRequest request) {
        return new AsyncInvoker<CheckDictionaryRequest, CheckDictionaryResponse>(request, RomaMeta.checkDictionary,
            hcClient);
    }

    /**
     * 创建字典
     *
     * 创建字典
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDictionaryRequest 请求对象
     * @return CompletableFuture<CreateDictionaryResponse>
     */
    public CompletableFuture<CreateDictionaryResponse> createDictionaryAsync(CreateDictionaryRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createDictionary);
    }

    /**
     * 创建字典
     *
     * 创建字典
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDictionaryRequest 请求对象
     * @return AsyncInvoker<CreateDictionaryRequest, CreateDictionaryResponse>
     */
    public AsyncInvoker<CreateDictionaryRequest, CreateDictionaryResponse> createDictionaryAsyncInvoker(
        CreateDictionaryRequest request) {
        return new AsyncInvoker<CreateDictionaryRequest, CreateDictionaryResponse>(request, RomaMeta.createDictionary,
            hcClient);
    }

    /**
     * 删除字典
     *
     * 删除单个字典，会同时删除该字典的所有子字典
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDictionaryRequest 请求对象
     * @return CompletableFuture<DeleteDictionaryResponse>
     */
    public CompletableFuture<DeleteDictionaryResponse> deleteDictionaryAsync(DeleteDictionaryRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteDictionary);
    }

    /**
     * 删除字典
     *
     * 删除单个字典，会同时删除该字典的所有子字典
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDictionaryRequest 请求对象
     * @return AsyncInvoker<DeleteDictionaryRequest, DeleteDictionaryResponse>
     */
    public AsyncInvoker<DeleteDictionaryRequest, DeleteDictionaryResponse> deleteDictionaryAsyncInvoker(
        DeleteDictionaryRequest request) {
        return new AsyncInvoker<DeleteDictionaryRequest, DeleteDictionaryResponse>(request, RomaMeta.deleteDictionary,
            hcClient);
    }

    /**
     * 查询字典列表
     *
     * 查询字典列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDictionaryRequest 请求对象
     * @return CompletableFuture<ListDictionaryResponse>
     */
    public CompletableFuture<ListDictionaryResponse> listDictionaryAsync(ListDictionaryRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listDictionary);
    }

    /**
     * 查询字典列表
     *
     * 查询字典列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDictionaryRequest 请求对象
     * @return AsyncInvoker<ListDictionaryRequest, ListDictionaryResponse>
     */
    public AsyncInvoker<ListDictionaryRequest, ListDictionaryResponse> listDictionaryAsyncInvoker(
        ListDictionaryRequest request) {
        return new AsyncInvoker<ListDictionaryRequest, ListDictionaryResponse>(request, RomaMeta.listDictionary,
            hcClient);
    }

    /**
     * 更新字典
     *
     * 更新字典
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDictionaryRequest 请求对象
     * @return CompletableFuture<UpdateDictionaryResponse>
     */
    public CompletableFuture<UpdateDictionaryResponse> updateDictionaryAsync(UpdateDictionaryRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateDictionary);
    }

    /**
     * 更新字典
     *
     * 更新字典
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDictionaryRequest 请求对象
     * @return AsyncInvoker<UpdateDictionaryRequest, UpdateDictionaryResponse>
     */
    public AsyncInvoker<UpdateDictionaryRequest, UpdateDictionaryResponse> updateDictionaryAsyncInvoker(
        UpdateDictionaryRequest request) {
        return new AsyncInvoker<UpdateDictionaryRequest, UpdateDictionaryResponse>(request, RomaMeta.updateDictionary,
            hcClient);
    }

    /**
     * 校验字典是否存在
     *
     * 校验指定条件的字典是否存在，支持字典名称和字典编码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateDictionaryRequest 请求对象
     * @return CompletableFuture<ValidateDictionaryResponse>
     */
    public CompletableFuture<ValidateDictionaryResponse> validateDictionaryAsync(ValidateDictionaryRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.validateDictionary);
    }

    /**
     * 校验字典是否存在
     *
     * 校验指定条件的字典是否存在，支持字典名称和字典编码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateDictionaryRequest 请求对象
     * @return AsyncInvoker<ValidateDictionaryRequest, ValidateDictionaryResponse>
     */
    public AsyncInvoker<ValidateDictionaryRequest, ValidateDictionaryResponse> validateDictionaryAsyncInvoker(
        ValidateDictionaryRequest request) {
        return new AsyncInvoker<ValidateDictionaryRequest, ValidateDictionaryResponse>(request,
            RomaMeta.validateDictionary, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 获取符合条件的服务实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckRomaInstanceListV2Request 请求对象
     * @return CompletableFuture<CheckRomaInstanceListV2Response>
     */
    public CompletableFuture<CheckRomaInstanceListV2Response> checkRomaInstanceListV2Async(
        CheckRomaInstanceListV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.checkRomaInstanceListV2);
    }

    /**
     * 查询实例列表
     *
     * 获取符合条件的服务实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckRomaInstanceListV2Request 请求对象
     * @return AsyncInvoker<CheckRomaInstanceListV2Request, CheckRomaInstanceListV2Response>
     */
    public AsyncInvoker<CheckRomaInstanceListV2Request, CheckRomaInstanceListV2Response> checkRomaInstanceListV2AsyncInvoker(
        CheckRomaInstanceListV2Request request) {
        return new AsyncInvoker<CheckRomaInstanceListV2Request, CheckRomaInstanceListV2Response>(request,
            RomaMeta.checkRomaInstanceListV2, hcClient);
    }

    /**
     * 查询MQS实例列表
     *
     * 查询MQS实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMqsInstanceRequest 请求对象
     * @return CompletableFuture<ListMqsInstanceResponse>
     */
    public CompletableFuture<ListMqsInstanceResponse> listMqsInstanceAsync(ListMqsInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listMqsInstance);
    }

    /**
     * 查询MQS实例列表
     *
     * 查询MQS实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMqsInstanceRequest 请求对象
     * @return AsyncInvoker<ListMqsInstanceRequest, ListMqsInstanceResponse>
     */
    public AsyncInvoker<ListMqsInstanceRequest, ListMqsInstanceResponse> listMqsInstanceAsyncInvoker(
        ListMqsInstanceRequest request) {
        return new AsyncInvoker<ListMqsInstanceRequest, ListMqsInstanceResponse>(request, RomaMeta.listMqsInstance,
            hcClient);
    }

    /**
     * 查询MQS实例详情
     *
     * 查询指定MQS实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMqsInstanceRequest 请求对象
     * @return CompletableFuture<ShowMqsInstanceResponse>
     */
    public CompletableFuture<ShowMqsInstanceResponse> showMqsInstanceAsync(ShowMqsInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showMqsInstance);
    }

    /**
     * 查询MQS实例详情
     *
     * 查询指定MQS实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMqsInstanceRequest 请求对象
     * @return AsyncInvoker<ShowMqsInstanceRequest, ShowMqsInstanceResponse>
     */
    public AsyncInvoker<ShowMqsInstanceRequest, ShowMqsInstanceResponse> showMqsInstanceAsyncInvoker(
        ShowMqsInstanceRequest request) {
        return new AsyncInvoker<ShowMqsInstanceRequest, ShowMqsInstanceResponse>(request, RomaMeta.showMqsInstance,
            hcClient);
    }

    /**
     * 导出API
     *
     * 导出分组下API的定义信息，导出文件内容符合swagger标准规范。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportApiDefinitionsV2Request 请求对象
     * @return CompletableFuture<ExportApiDefinitionsV2Response>
     */
    public CompletableFuture<ExportApiDefinitionsV2Response> exportApiDefinitionsV2Async(
        ExportApiDefinitionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.exportApiDefinitionsV2);
    }

    /**
     * 导出API
     *
     * 导出分组下API的定义信息，导出文件内容符合swagger标准规范。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportApiDefinitionsV2Request 请求对象
     * @return AsyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response>
     */
    public AsyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> exportApiDefinitionsV2AsyncInvoker(
        ExportApiDefinitionsV2Request request) {
        return new AsyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response>(request,
            RomaMeta.exportApiDefinitionsV2, hcClient);
    }

    /**
     * 导出自定义后端API
     *
     * 导出自定义后端API，导出文件内容符合swagger标准规范。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportLiveDataApiDefinitionsV2Request 请求对象
     * @return CompletableFuture<ExportLiveDataApiDefinitionsV2Response>
     */
    public CompletableFuture<ExportLiveDataApiDefinitionsV2Response> exportLiveDataApiDefinitionsV2Async(
        ExportLiveDataApiDefinitionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.exportLiveDataApiDefinitionsV2);
    }

    /**
     * 导出自定义后端API
     *
     * 导出自定义后端API，导出文件内容符合swagger标准规范。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportLiveDataApiDefinitionsV2Request 请求对象
     * @return AsyncInvoker<ExportLiveDataApiDefinitionsV2Request, ExportLiveDataApiDefinitionsV2Response>
     */
    public AsyncInvoker<ExportLiveDataApiDefinitionsV2Request, ExportLiveDataApiDefinitionsV2Response> exportLiveDataApiDefinitionsV2AsyncInvoker(
        ExportLiveDataApiDefinitionsV2Request request) {
        return new AsyncInvoker<ExportLiveDataApiDefinitionsV2Request, ExportLiveDataApiDefinitionsV2Response>(request,
            RomaMeta.exportLiveDataApiDefinitionsV2, hcClient);
    }

    /**
     * 导入API
     *
     * 导入API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考用户指南的“附录：前端API的Swagger扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportApiDefinitionsV2Request 请求对象
     * @return CompletableFuture<ImportApiDefinitionsV2Response>
     */
    public CompletableFuture<ImportApiDefinitionsV2Response> importApiDefinitionsV2Async(
        ImportApiDefinitionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.importApiDefinitionsV2);
    }

    /**
     * 导入API
     *
     * 导入API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考用户指南的“附录：前端API的Swagger扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportApiDefinitionsV2Request 请求对象
     * @return AsyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response>
     */
    public AsyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> importApiDefinitionsV2AsyncInvoker(
        ImportApiDefinitionsV2Request request) {
        return new AsyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response>(request,
            RomaMeta.importApiDefinitionsV2, hcClient);
    }

    /**
     * 导入自定义后端API
     *
     * 导入自定义后端API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考用户指南的“附录：后端API的Swagger扩展定义”章节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportLiveDataApiDefinitionsV2Request 请求对象
     * @return CompletableFuture<ImportLiveDataApiDefinitionsV2Response>
     */
    public CompletableFuture<ImportLiveDataApiDefinitionsV2Response> importLiveDataApiDefinitionsV2Async(
        ImportLiveDataApiDefinitionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.importLiveDataApiDefinitionsV2);
    }

    /**
     * 导入自定义后端API
     *
     * 导入自定义后端API。导入文件内容需要符合swagger标准规范，自定义扩展字段请参考用户指南的“附录：后端API的Swagger扩展定义”章节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportLiveDataApiDefinitionsV2Request 请求对象
     * @return AsyncInvoker<ImportLiveDataApiDefinitionsV2Request, ImportLiveDataApiDefinitionsV2Response>
     */
    public AsyncInvoker<ImportLiveDataApiDefinitionsV2Request, ImportLiveDataApiDefinitionsV2Response> importLiveDataApiDefinitionsV2AsyncInvoker(
        ImportLiveDataApiDefinitionsV2Request request) {
        return new AsyncInvoker<ImportLiveDataApiDefinitionsV2Request, ImportLiveDataApiDefinitionsV2Response>(request,
            RomaMeta.importLiveDataApiDefinitionsV2, hcClient);
    }

    /**
     * 添加或更新后端实例
     *
     * 为指定的VPC通道添加后端实例
     * 
     * 若指定地址的后端实例已存在，则更新对应后端实例信息。若请求体中包含多个重复地址的后端实例定义，则使用第一个定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddingBackendInstancesV2Request 请求对象
     * @return CompletableFuture<AddingBackendInstancesV2Response>
     */
    public CompletableFuture<AddingBackendInstancesV2Response> addingBackendInstancesV2Async(
        AddingBackendInstancesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.addingBackendInstancesV2);
    }

    /**
     * 添加或更新后端实例
     *
     * 为指定的VPC通道添加后端实例
     * 
     * 若指定地址的后端实例已存在，则更新对应后端实例信息。若请求体中包含多个重复地址的后端实例定义，则使用第一个定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddingBackendInstancesV2Request 请求对象
     * @return AsyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response>
     */
    public AsyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> addingBackendInstancesV2AsyncInvoker(
        AddingBackendInstancesV2Request request) {
        return new AsyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response>(request,
            RomaMeta.addingBackendInstancesV2, hcClient);
    }

    /**
     * 批量修改后端服务器状态不可用
     *
     * 批量修改后端服务器状态不可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDisableMembersRequest 请求对象
     * @return CompletableFuture<BatchDisableMembersResponse>
     */
    public CompletableFuture<BatchDisableMembersResponse> batchDisableMembersAsync(BatchDisableMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchDisableMembers);
    }

    /**
     * 批量修改后端服务器状态不可用
     *
     * 批量修改后端服务器状态不可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDisableMembersRequest 请求对象
     * @return AsyncInvoker<BatchDisableMembersRequest, BatchDisableMembersResponse>
     */
    public AsyncInvoker<BatchDisableMembersRequest, BatchDisableMembersResponse> batchDisableMembersAsyncInvoker(
        BatchDisableMembersRequest request) {
        return new AsyncInvoker<BatchDisableMembersRequest, BatchDisableMembersResponse>(request,
            RomaMeta.batchDisableMembers, hcClient);
    }

    /**
     * 批量修改后端服务器状态可用
     *
     * 批量修改后端服务器状态可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchEnableMembersRequest 请求对象
     * @return CompletableFuture<BatchEnableMembersResponse>
     */
    public CompletableFuture<BatchEnableMembersResponse> batchEnableMembersAsync(BatchEnableMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.batchEnableMembers);
    }

    /**
     * 批量修改后端服务器状态可用
     *
     * 批量修改后端服务器状态可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchEnableMembersRequest 请求对象
     * @return AsyncInvoker<BatchEnableMembersRequest, BatchEnableMembersResponse>
     */
    public AsyncInvoker<BatchEnableMembersRequest, BatchEnableMembersResponse> batchEnableMembersAsyncInvoker(
        BatchEnableMembersRequest request) {
        return new AsyncInvoker<BatchEnableMembersRequest, BatchEnableMembersResponse>(request,
            RomaMeta.batchEnableMembers, hcClient);
    }

    /**
     * 添加或更新VPC通道后端服务器组
     *
     * 在ROMA Connect APIC中创建VPC通道后端服务器组，VPC通道后端实例可以选择是否关联后端实例服务器组，以便管理后端服务器节点。
     * 
     * 若指定名称的后端服务器组已存在，则更新对应后端服务器组信息。若请求体中包含多个重复名称的后端服务器定义，则使用第一个定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMemberGroupRequest 请求对象
     * @return CompletableFuture<CreateMemberGroupResponse>
     */
    public CompletableFuture<CreateMemberGroupResponse> createMemberGroupAsync(CreateMemberGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createMemberGroup);
    }

    /**
     * 添加或更新VPC通道后端服务器组
     *
     * 在ROMA Connect APIC中创建VPC通道后端服务器组，VPC通道后端实例可以选择是否关联后端实例服务器组，以便管理后端服务器节点。
     * 
     * 若指定名称的后端服务器组已存在，则更新对应后端服务器组信息。若请求体中包含多个重复名称的后端服务器定义，则使用第一个定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMemberGroupRequest 请求对象
     * @return AsyncInvoker<CreateMemberGroupRequest, CreateMemberGroupResponse>
     */
    public AsyncInvoker<CreateMemberGroupRequest, CreateMemberGroupResponse> createMemberGroupAsyncInvoker(
        CreateMemberGroupRequest request) {
        return new AsyncInvoker<CreateMemberGroupRequest, CreateMemberGroupResponse>(request,
            RomaMeta.createMemberGroup, hcClient);
    }

    /**
     * 项目下创建VPC通道
     *
     * 创建相同的VPC通道关联到多个实例。同一个项目下VPC通道名称不可重复。注意：实例特性vpc_name_modifiable配置为off时才可使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectVpcChannelRequest 请求对象
     * @return CompletableFuture<CreateProjectVpcChannelResponse>
     */
    public CompletableFuture<CreateProjectVpcChannelResponse> createProjectVpcChannelAsync(
        CreateProjectVpcChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createProjectVpcChannel);
    }

    /**
     * 项目下创建VPC通道
     *
     * 创建相同的VPC通道关联到多个实例。同一个项目下VPC通道名称不可重复。注意：实例特性vpc_name_modifiable配置为off时才可使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectVpcChannelRequest 请求对象
     * @return AsyncInvoker<CreateProjectVpcChannelRequest, CreateProjectVpcChannelResponse>
     */
    public AsyncInvoker<CreateProjectVpcChannelRequest, CreateProjectVpcChannelResponse> createProjectVpcChannelAsyncInvoker(
        CreateProjectVpcChannelRequest request) {
        return new AsyncInvoker<CreateProjectVpcChannelRequest, CreateProjectVpcChannelResponse>(request,
            RomaMeta.createProjectVpcChannel, hcClient);
    }

    /**
     * 项目下同步VPC通道
     *
     * 同步VPC通道到多个实例。注意：实例特性vpc_name_modifiable配置为off时才可使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectVpcChannelSyncsRequest 请求对象
     * @return CompletableFuture<CreateProjectVpcChannelSyncsResponse>
     */
    public CompletableFuture<CreateProjectVpcChannelSyncsResponse> createProjectVpcChannelSyncsAsync(
        CreateProjectVpcChannelSyncsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createProjectVpcChannelSyncs);
    }

    /**
     * 项目下同步VPC通道
     *
     * 同步VPC通道到多个实例。注意：实例特性vpc_name_modifiable配置为off时才可使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectVpcChannelSyncsRequest 请求对象
     * @return AsyncInvoker<CreateProjectVpcChannelSyncsRequest, CreateProjectVpcChannelSyncsResponse>
     */
    public AsyncInvoker<CreateProjectVpcChannelSyncsRequest, CreateProjectVpcChannelSyncsResponse> createProjectVpcChannelSyncsAsyncInvoker(
        CreateProjectVpcChannelSyncsRequest request) {
        return new AsyncInvoker<CreateProjectVpcChannelSyncsRequest, CreateProjectVpcChannelSyncsResponse>(request,
            RomaMeta.createProjectVpcChannelSyncs, hcClient);
    }

    /**
     * 创建VPC通道
     *
     * 在ROMA Connect APIC中创建连接私有VPC资源的通道，并在创建API时将后端节点配置为使用这些VPC通道，以便ROMA Connect APIC直接访问私有VPC资源。
     * &gt; 每个用户默认最多创建200个VPC通道，如需支持更多请联系技术支持调整配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcChannelV2Request 请求对象
     * @return CompletableFuture<CreateVpcChannelV2Response>
     */
    public CompletableFuture<CreateVpcChannelV2Response> createVpcChannelV2Async(CreateVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.createVpcChannelV2);
    }

    /**
     * 创建VPC通道
     *
     * 在ROMA Connect APIC中创建连接私有VPC资源的通道，并在创建API时将后端节点配置为使用这些VPC通道，以便ROMA Connect APIC直接访问私有VPC资源。
     * &gt; 每个用户默认最多创建200个VPC通道，如需支持更多请联系技术支持调整配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcChannelV2Request 请求对象
     * @return AsyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response>
     */
    public AsyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response> createVpcChannelV2AsyncInvoker(
        CreateVpcChannelV2Request request) {
        return new AsyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response>(request,
            RomaMeta.createVpcChannelV2, hcClient);
    }

    /**
     * 删除后端实例
     *
     * 删除指定VPC通道中的后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackendInstanceV2Request 请求对象
     * @return CompletableFuture<DeleteBackendInstanceV2Response>
     */
    public CompletableFuture<DeleteBackendInstanceV2Response> deleteBackendInstanceV2Async(
        DeleteBackendInstanceV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteBackendInstanceV2);
    }

    /**
     * 删除后端实例
     *
     * 删除指定VPC通道中的后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackendInstanceV2Request 请求对象
     * @return AsyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response>
     */
    public AsyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> deleteBackendInstanceV2AsyncInvoker(
        DeleteBackendInstanceV2Request request) {
        return new AsyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response>(request,
            RomaMeta.deleteBackendInstanceV2, hcClient);
    }

    /**
     * 删除VPC通道后端服务器组
     *
     * 删除指定的VPC通道后端服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberGroupRequest 请求对象
     * @return CompletableFuture<DeleteMemberGroupResponse>
     */
    public CompletableFuture<DeleteMemberGroupResponse> deleteMemberGroupAsync(DeleteMemberGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteMemberGroup);
    }

    /**
     * 删除VPC通道后端服务器组
     *
     * 删除指定的VPC通道后端服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberGroupRequest 请求对象
     * @return AsyncInvoker<DeleteMemberGroupRequest, DeleteMemberGroupResponse>
     */
    public AsyncInvoker<DeleteMemberGroupRequest, DeleteMemberGroupResponse> deleteMemberGroupAsyncInvoker(
        DeleteMemberGroupRequest request) {
        return new AsyncInvoker<DeleteMemberGroupRequest, DeleteMemberGroupResponse>(request,
            RomaMeta.deleteMemberGroup, hcClient);
    }

    /**
     * 删除VPC通道
     *
     * 删除指定的VPC通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcChannelV2Request 请求对象
     * @return CompletableFuture<DeleteVpcChannelV2Response>
     */
    public CompletableFuture<DeleteVpcChannelV2Response> deleteVpcChannelV2Async(DeleteVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.deleteVpcChannelV2);
    }

    /**
     * 删除VPC通道
     *
     * 删除指定的VPC通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcChannelV2Request 请求对象
     * @return AsyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response>
     */
    public AsyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> deleteVpcChannelV2AsyncInvoker(
        DeleteVpcChannelV2Request request) {
        return new AsyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response>(request,
            RomaMeta.deleteVpcChannelV2, hcClient);
    }

    /**
     * 查看后端实例列表
     *
     * 查看指定VPC通道的后端实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackendInstancesV2Request 请求对象
     * @return CompletableFuture<ListBackendInstancesV2Response>
     */
    public CompletableFuture<ListBackendInstancesV2Response> listBackendInstancesV2Async(
        ListBackendInstancesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listBackendInstancesV2);
    }

    /**
     * 查看后端实例列表
     *
     * 查看指定VPC通道的后端实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackendInstancesV2Request 请求对象
     * @return AsyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response>
     */
    public AsyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response> listBackendInstancesV2AsyncInvoker(
        ListBackendInstancesV2Request request) {
        return new AsyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response>(request,
            RomaMeta.listBackendInstancesV2, hcClient);
    }

    /**
     * 查询VPC通道后端云服务组列表
     *
     * 查询VPC通道后端云服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMemberGroupsRequest 请求对象
     * @return CompletableFuture<ListMemberGroupsResponse>
     */
    public CompletableFuture<ListMemberGroupsResponse> listMemberGroupsAsync(ListMemberGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listMemberGroups);
    }

    /**
     * 查询VPC通道后端云服务组列表
     *
     * 查询VPC通道后端云服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMemberGroupsRequest 请求对象
     * @return AsyncInvoker<ListMemberGroupsRequest, ListMemberGroupsResponse>
     */
    public AsyncInvoker<ListMemberGroupsRequest, ListMemberGroupsResponse> listMemberGroupsAsyncInvoker(
        ListMemberGroupsRequest request) {
        return new AsyncInvoker<ListMemberGroupsRequest, ListMemberGroupsResponse>(request, RomaMeta.listMemberGroups,
            hcClient);
    }

    /**
     * 查询项目下所有实例的VPC通道列表
     *
     * 查询项目下所有实例的VPC通道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectVpcChannelsV2Request 请求对象
     * @return CompletableFuture<ListProjectVpcChannelsV2Response>
     */
    public CompletableFuture<ListProjectVpcChannelsV2Response> listProjectVpcChannelsV2Async(
        ListProjectVpcChannelsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listProjectVpcChannelsV2);
    }

    /**
     * 查询项目下所有实例的VPC通道列表
     *
     * 查询项目下所有实例的VPC通道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectVpcChannelsV2Request 请求对象
     * @return AsyncInvoker<ListProjectVpcChannelsV2Request, ListProjectVpcChannelsV2Response>
     */
    public AsyncInvoker<ListProjectVpcChannelsV2Request, ListProjectVpcChannelsV2Response> listProjectVpcChannelsV2AsyncInvoker(
        ListProjectVpcChannelsV2Request request) {
        return new AsyncInvoker<ListProjectVpcChannelsV2Request, ListProjectVpcChannelsV2Response>(request,
            RomaMeta.listProjectVpcChannelsV2, hcClient);
    }

    /**
     * 查询VPC通道列表
     *
     * 查看VPC通道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcChannelsV2Request 请求对象
     * @return CompletableFuture<ListVpcChannelsV2Response>
     */
    public CompletableFuture<ListVpcChannelsV2Response> listVpcChannelsV2Async(ListVpcChannelsV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.listVpcChannelsV2);
    }

    /**
     * 查询VPC通道列表
     *
     * 查看VPC通道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcChannelsV2Request 请求对象
     * @return AsyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response>
     */
    public AsyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response> listVpcChannelsV2AsyncInvoker(
        ListVpcChannelsV2Request request) {
        return new AsyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response>(request,
            RomaMeta.listVpcChannelsV2, hcClient);
    }

    /**
     * 查看VPC通道后端服务器组详情
     *
     * 查看指定的VPC通道后端服务器组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfMemberGroupRequest 请求对象
     * @return CompletableFuture<ShowDetailsOfMemberGroupResponse>
     */
    public CompletableFuture<ShowDetailsOfMemberGroupResponse> showDetailsOfMemberGroupAsync(
        ShowDetailsOfMemberGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfMemberGroup);
    }

    /**
     * 查看VPC通道后端服务器组详情
     *
     * 查看指定的VPC通道后端服务器组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfMemberGroupRequest 请求对象
     * @return AsyncInvoker<ShowDetailsOfMemberGroupRequest, ShowDetailsOfMemberGroupResponse>
     */
    public AsyncInvoker<ShowDetailsOfMemberGroupRequest, ShowDetailsOfMemberGroupResponse> showDetailsOfMemberGroupAsyncInvoker(
        ShowDetailsOfMemberGroupRequest request) {
        return new AsyncInvoker<ShowDetailsOfMemberGroupRequest, ShowDetailsOfMemberGroupResponse>(request,
            RomaMeta.showDetailsOfMemberGroup, hcClient);
    }

    /**
     * 查看VPC通道详情
     *
     * 查看指定的VPC通道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfVpcChannelV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfVpcChannelV2Response>
     */
    public CompletableFuture<ShowDetailsOfVpcChannelV2Response> showDetailsOfVpcChannelV2Async(
        ShowDetailsOfVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.showDetailsOfVpcChannelV2);
    }

    /**
     * 查看VPC通道详情
     *
     * 查看指定的VPC通道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailsOfVpcChannelV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response>
     */
    public AsyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> showDetailsOfVpcChannelV2AsyncInvoker(
        ShowDetailsOfVpcChannelV2Request request) {
        return new AsyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response>(request,
            RomaMeta.showDetailsOfVpcChannelV2, hcClient);
    }

    /**
     * 更新后端实例
     *
     * 更新指定的VPC通道的后端实例。更新时，使用传入的请求参数对对应云服务组的后端实例进行全量覆盖修改。若未指定修改的云服务器组，则进行全量覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBackendInstancesV2Request 请求对象
     * @return CompletableFuture<UpdateBackendInstancesV2Response>
     */
    public CompletableFuture<UpdateBackendInstancesV2Response> updateBackendInstancesV2Async(
        UpdateBackendInstancesV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateBackendInstancesV2);
    }

    /**
     * 更新后端实例
     *
     * 更新指定的VPC通道的后端实例。更新时，使用传入的请求参数对对应云服务组的后端实例进行全量覆盖修改。若未指定修改的云服务器组，则进行全量覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBackendInstancesV2Request 请求对象
     * @return AsyncInvoker<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response>
     */
    public AsyncInvoker<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response> updateBackendInstancesV2AsyncInvoker(
        UpdateBackendInstancesV2Request request) {
        return new AsyncInvoker<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response>(request,
            RomaMeta.updateBackendInstancesV2, hcClient);
    }

    /**
     * 修改VPC通道健康检查
     *
     * 修改VPC通道健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHealthCheckRequest 请求对象
     * @return CompletableFuture<UpdateHealthCheckResponse>
     */
    public CompletableFuture<UpdateHealthCheckResponse> updateHealthCheckAsync(UpdateHealthCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateHealthCheck);
    }

    /**
     * 修改VPC通道健康检查
     *
     * 修改VPC通道健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHealthCheckRequest 请求对象
     * @return AsyncInvoker<UpdateHealthCheckRequest, UpdateHealthCheckResponse>
     */
    public AsyncInvoker<UpdateHealthCheckRequest, UpdateHealthCheckResponse> updateHealthCheckAsyncInvoker(
        UpdateHealthCheckRequest request) {
        return new AsyncInvoker<UpdateHealthCheckRequest, UpdateHealthCheckResponse>(request,
            RomaMeta.updateHealthCheck, hcClient);
    }

    /**
     * 更新VPC通道后端服务器组
     *
     * 更新指定VPC通道后端服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMemberGroupRequest 请求对象
     * @return CompletableFuture<UpdateMemberGroupResponse>
     */
    public CompletableFuture<UpdateMemberGroupResponse> updateMemberGroupAsync(UpdateMemberGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateMemberGroup);
    }

    /**
     * 更新VPC通道后端服务器组
     *
     * 更新指定VPC通道后端服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMemberGroupRequest 请求对象
     * @return AsyncInvoker<UpdateMemberGroupRequest, UpdateMemberGroupResponse>
     */
    public AsyncInvoker<UpdateMemberGroupRequest, UpdateMemberGroupResponse> updateMemberGroupAsyncInvoker(
        UpdateMemberGroupRequest request) {
        return new AsyncInvoker<UpdateMemberGroupRequest, UpdateMemberGroupResponse>(request,
            RomaMeta.updateMemberGroup, hcClient);
    }

    /**
     * 项目下批量修改VPC通道
     *
     * 项目下根据VPC通道名称批量修改多个多个实例下的VPC通道。若实例下不存在该VPC通道则创建。注意：实例特性vpc_name_modifiable配置为off时才可使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectVpcChannelRequest 请求对象
     * @return CompletableFuture<UpdateProjectVpcChannelResponse>
     */
    public CompletableFuture<UpdateProjectVpcChannelResponse> updateProjectVpcChannelAsync(
        UpdateProjectVpcChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateProjectVpcChannel);
    }

    /**
     * 项目下批量修改VPC通道
     *
     * 项目下根据VPC通道名称批量修改多个多个实例下的VPC通道。若实例下不存在该VPC通道则创建。注意：实例特性vpc_name_modifiable配置为off时才可使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectVpcChannelRequest 请求对象
     * @return AsyncInvoker<UpdateProjectVpcChannelRequest, UpdateProjectVpcChannelResponse>
     */
    public AsyncInvoker<UpdateProjectVpcChannelRequest, UpdateProjectVpcChannelResponse> updateProjectVpcChannelAsyncInvoker(
        UpdateProjectVpcChannelRequest request) {
        return new AsyncInvoker<UpdateProjectVpcChannelRequest, UpdateProjectVpcChannelResponse>(request,
            RomaMeta.updateProjectVpcChannel, hcClient);
    }

    /**
     * 更新VPC通道
     *
     * 更新指定VPC通道的参数
     * 
     * 使用传入的后端实例列表对VPC通道进行全量覆盖，若后端实例列表为空，则会全量删除已有的后端实例；
     * 
     * 使用传入的后端服务器组列表对VPC通道进行全量覆盖，若后端服务器组列表为空，则会全量删除已有的服务器组；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcChannelV2Request 请求对象
     * @return CompletableFuture<UpdateVpcChannelV2Response>
     */
    public CompletableFuture<UpdateVpcChannelV2Response> updateVpcChannelV2Async(UpdateVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, RomaMeta.updateVpcChannelV2);
    }

    /**
     * 更新VPC通道
     *
     * 更新指定VPC通道的参数
     * 
     * 使用传入的后端实例列表对VPC通道进行全量覆盖，若后端实例列表为空，则会全量删除已有的后端实例；
     * 
     * 使用传入的后端服务器组列表对VPC通道进行全量覆盖，若后端服务器组列表为空，则会全量删除已有的服务器组；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcChannelV2Request 请求对象
     * @return AsyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response>
     */
    public AsyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> updateVpcChannelV2AsyncInvoker(
        UpdateVpcChannelV2Request request) {
        return new AsyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response>(request,
            RomaMeta.updateVpcChannelV2, hcClient);
    }

}
