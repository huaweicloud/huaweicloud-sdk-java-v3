package com.huaweicloud.sdk.roma.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.roma.v2.model.AclApiBindingCreate;
import com.huaweicloud.sdk.roma.v2.model.AclBatchDelete;
import com.huaweicloud.sdk.roma.v2.model.AclBindingBatchDelete;
import com.huaweicloud.sdk.roma.v2.model.AddSubsetsToGatewayRequest;
import com.huaweicloud.sdk.roma.v2.model.AddSubsetsToGatewayRequestBody;
import com.huaweicloud.sdk.roma.v2.model.AddSubsetsToGatewayResponse;
import com.huaweicloud.sdk.roma.v2.model.AddSubsetsToGatewayResponseBody;
import com.huaweicloud.sdk.roma.v2.model.AddUserToApp;
import com.huaweicloud.sdk.roma.v2.model.AddUserToAppRequest;
import com.huaweicloud.sdk.roma.v2.model.AddUserToAppResponse;
import com.huaweicloud.sdk.roma.v2.model.AddingBackendInstancesV2Request;
import com.huaweicloud.sdk.roma.v2.model.AddingBackendInstancesV2Response;
import com.huaweicloud.sdk.roma.v2.model.ApiAclCreate;
import com.huaweicloud.sdk.roma.v2.model.ApiActionInfo;
import com.huaweicloud.sdk.roma.v2.model.ApiAuthCreate;
import com.huaweicloud.sdk.roma.v2.model.ApiBatchPublish;
import com.huaweicloud.sdk.roma.v2.model.ApiCheckInfoV2;
import com.huaweicloud.sdk.roma.v2.model.ApiCreate;
import com.huaweicloud.sdk.roma.v2.model.ApiDebugInfo;
import com.huaweicloud.sdk.roma.v2.model.ApiGroupBase;
import com.huaweicloud.sdk.roma.v2.model.ApiGroupCheck;
import com.huaweicloud.sdk.roma.v2.model.ApiGroupCreate;
import com.huaweicloud.sdk.roma.v2.model.ApiOperPluginInfo;
import com.huaweicloud.sdk.roma.v2.model.ApiVersion;
import com.huaweicloud.sdk.roma.v2.model.AppAclCreate;
import com.huaweicloud.sdk.roma.v2.model.AppCodeCreate;
import com.huaweicloud.sdk.roma.v2.model.AppConfigCreateRequestV2;
import com.huaweicloud.sdk.roma.v2.model.AppConfigModifyRequestV2;
import com.huaweicloud.sdk.roma.v2.model.AppQuotaCreate;
import com.huaweicloud.sdk.roma.v2.model.AssetExportRequest;
import com.huaweicloud.sdk.roma.v2.model.AssetOperateRequest;
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
import com.huaweicloud.sdk.roma.v2.model.AttachOrDetachCertsReqBody;
import com.huaweicloud.sdk.roma.v2.model.AttachOrDetachDomainsReqBody;
import com.huaweicloud.sdk.roma.v2.model.AttachPluginToApiRequest;
import com.huaweicloud.sdk.roma.v2.model.AttachPluginToApiResponse;
import com.huaweicloud.sdk.roma.v2.model.AuthorizerCreate;
import com.huaweicloud.sdk.roma.v2.model.BaseSignature;
import com.huaweicloud.sdk.roma.v2.model.BatchAddDeviceToGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.BatchAddDeviceToGroupRequestBody;
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
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteDevicesRequestBody;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteDevicesResponse;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteMqsInstanceTopicReq;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteMqsInstanceTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteMqsInstanceTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteRulesRequest;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteRulesRequestBody;
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
import com.huaweicloud.sdk.roma.v2.model.BatchFreezeDevicesRequestBody;
import com.huaweicloud.sdk.roma.v2.model.BatchFreezeDevicesResponse;
import com.huaweicloud.sdk.roma.v2.model.BatchPublishOrOfflineApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.BatchPublishOrOfflineApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.BatchStartOrStopTasksRequest;
import com.huaweicloud.sdk.roma.v2.model.BatchStartOrStopTasksResponse;
import com.huaweicloud.sdk.roma.v2.model.CancelingAuthorizationV2Request;
import com.huaweicloud.sdk.roma.v2.model.CancelingAuthorizationV2Response;
import com.huaweicloud.sdk.roma.v2.model.CertForm;
import com.huaweicloud.sdk.roma.v2.model.CertificateForm;
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
import com.huaweicloud.sdk.roma.v2.model.CreateAppQuotaBindingApp;
import com.huaweicloud.sdk.roma.v2.model.CreateAppQuotaRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateAppQuotaResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateAppReq;
import com.huaweicloud.sdk.roma.v2.model.CreateAuthorizingAppsV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateAuthorizingAppsV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateCertificateV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateCertificateV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateCommandRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateCommandRequestBody;
import com.huaweicloud.sdk.roma.v2.model.CreateCommandResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateCommonTaskRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateCommonTaskRequestBody;
import com.huaweicloud.sdk.roma.v2.model.CreateCommonTaskResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateCustomAuthorizerV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateCustomAuthorizerV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateDatasourceInfoRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateDatasourceInfoResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateDestinationRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateDestinationRequestBody;
import com.huaweicloud.sdk.roma.v2.model.CreateDestinationResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateDeviceGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateDeviceGroupRequestBody;
import com.huaweicloud.sdk.roma.v2.model.CreateDeviceGroupResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateDeviceRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateDeviceRequestBody;
import com.huaweicloud.sdk.roma.v2.model.CreateDeviceResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateDictionary;
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
import com.huaweicloud.sdk.roma.v2.model.CreateMqsInstanceTopicReq;
import com.huaweicloud.sdk.roma.v2.model.CreateMqsInstanceTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateMqsInstanceTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateMultiTaskMappingsRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateMultiTaskMappingsResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateMultiTasksRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateMultiTasksResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateNotificationRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateNotificationRequestBody;
import com.huaweicloud.sdk.roma.v2.model.CreateNotificationResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateOrDeletePublishRecordForApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateOrDeletePublishRecordForApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreatePluginRequest;
import com.huaweicloud.sdk.roma.v2.model.CreatePluginResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateProductRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateProductRequestBody;
import com.huaweicloud.sdk.roma.v2.model.CreateProductResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateProductTemplateRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateProductTemplateRequestBody;
import com.huaweicloud.sdk.roma.v2.model.CreateProductTemplateResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateProductTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateProductTopicRequestBody;
import com.huaweicloud.sdk.roma.v2.model.CreateProductTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateProjectVpcChannelRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateProjectVpcChannelResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateProjectVpcChannelSyncsRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateProjectVpcChannelSyncsResponse;
import com.huaweicloud.sdk.roma.v2.model.CreatePropertyRequest;
import com.huaweicloud.sdk.roma.v2.model.CreatePropertyRequestBody;
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
import com.huaweicloud.sdk.roma.v2.model.CreateRuleRequestBody;
import com.huaweicloud.sdk.roma.v2.model.CreateRuleResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateServiceRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateServiceRequestBody;
import com.huaweicloud.sdk.roma.v2.model.CreateServiceResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateSignatureKeyV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateSignatureKeyV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateSourceRequest;
import com.huaweicloud.sdk.roma.v2.model.CreateSourceRequestBody;
import com.huaweicloud.sdk.roma.v2.model.CreateSourceResponse;
import com.huaweicloud.sdk.roma.v2.model.CreateSpecialThrottlingConfigurationV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateSpecialThrottlingConfigurationV2Response;
import com.huaweicloud.sdk.roma.v2.model.CreateVpcChannelV2Request;
import com.huaweicloud.sdk.roma.v2.model.CreateVpcChannelV2Response;
import com.huaweicloud.sdk.roma.v2.model.DatasourceInfo;
import com.huaweicloud.sdk.roma.v2.model.DebugApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.DebugApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.DebugLiveDataApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.DebugLiveDataApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.DebugRuleRequest;
import com.huaweicloud.sdk.roma.v2.model.DebugRuleRequestBody;
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
import com.huaweicloud.sdk.roma.v2.model.EnvCreate;
import com.huaweicloud.sdk.roma.v2.model.EnvVariableBase;
import com.huaweicloud.sdk.roma.v2.model.EnvVariableCreate;
import com.huaweicloud.sdk.roma.v2.model.ExportApiDefinitionsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ExportApiDefinitionsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ExportAssetRequest;
import com.huaweicloud.sdk.roma.v2.model.ExportAssetResponse;
import com.huaweicloud.sdk.roma.v2.model.ExportLiveDataApiDefinitionsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ExportLiveDataApiDefinitionsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ExportMqsInstanceTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.ExportMqsInstanceTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.ExportOpenApiReq;
import com.huaweicloud.sdk.roma.v2.model.FeatureToggleV2;
import com.huaweicloud.sdk.roma.v2.model.ImportApiDefinitionsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ImportApiDefinitionsV2RequestBody;
import com.huaweicloud.sdk.roma.v2.model.ImportApiDefinitionsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ImportAssetRequest;
import com.huaweicloud.sdk.roma.v2.model.ImportAssetRequestBody;
import com.huaweicloud.sdk.roma.v2.model.ImportAssetResponse;
import com.huaweicloud.sdk.roma.v2.model.ImportLiveDataApiDefinitionsV2Request;
import com.huaweicloud.sdk.roma.v2.model.ImportLiveDataApiDefinitionsV2RequestBody;
import com.huaweicloud.sdk.roma.v2.model.ImportLiveDataApiDefinitionsV2Response;
import com.huaweicloud.sdk.roma.v2.model.ImportMqsInstanceTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.ImportMqsInstanceTopicRequestBody;
import com.huaweicloud.sdk.roma.v2.model.ImportMqsInstanceTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.InstallMultiTasksRequest;
import com.huaweicloud.sdk.roma.v2.model.InstallMultiTasksResponse;
import com.huaweicloud.sdk.roma.v2.model.LdApiCheckInfo;
import com.huaweicloud.sdk.roma.v2.model.LdApiCreate;
import com.huaweicloud.sdk.roma.v2.model.LdApiDeploy;
import com.huaweicloud.sdk.roma.v2.model.LdApiScriptCreate;
import com.huaweicloud.sdk.roma.v2.model.LdApiTest;
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
import com.huaweicloud.sdk.roma.v2.model.LiveDataExportReq;
import com.huaweicloud.sdk.roma.v2.model.MemberGroupCreate;
import com.huaweicloud.sdk.roma.v2.model.MemberGroupCreateBatch;
import com.huaweicloud.sdk.roma.v2.model.MembersBatchEnableOrDisable;
import com.huaweicloud.sdk.roma.v2.model.MultiTaskInitBody;
import com.huaweicloud.sdk.roma.v2.model.MultiTaskInitElement;
import com.huaweicloud.sdk.roma.v2.model.MultiTaskMappingCreateBody;
import com.huaweicloud.sdk.roma.v2.model.MultiTaskRequestBody;
import com.huaweicloud.sdk.roma.v2.model.MultiTaskResetBody;
import com.huaweicloud.sdk.roma.v2.model.MultiTaskUpdateBody;
import com.huaweicloud.sdk.roma.v2.model.OperateTasksBean;
import com.huaweicloud.sdk.roma.v2.model.PluginCreate;
import com.huaweicloud.sdk.roma.v2.model.PluginOperApiInfo;
import com.huaweicloud.sdk.roma.v2.model.ProjectVpcCreate;
import com.huaweicloud.sdk.roma.v2.model.ProjectVpcSync;
import com.huaweicloud.sdk.roma.v2.model.PublishLiveDataApiV2Request;
import com.huaweicloud.sdk.roma.v2.model.PublishLiveDataApiV2Response;
import com.huaweicloud.sdk.roma.v2.model.ResetAuthenticationRequest;
import com.huaweicloud.sdk.roma.v2.model.ResetAuthenticationRequestBody;
import com.huaweicloud.sdk.roma.v2.model.ResetAuthenticationResponse;
import com.huaweicloud.sdk.roma.v2.model.ResetMessagesReq;
import com.huaweicloud.sdk.roma.v2.model.ResetMessagesRequest;
import com.huaweicloud.sdk.roma.v2.model.ResetMessagesResponse;
import com.huaweicloud.sdk.roma.v2.model.ResetMultiTaskOffsetRequest;
import com.huaweicloud.sdk.roma.v2.model.ResetMultiTaskOffsetResponse;
import com.huaweicloud.sdk.roma.v2.model.ResetProductAuthenticationRequest;
import com.huaweicloud.sdk.roma.v2.model.ResetProductAuthenticationRequestBody;
import com.huaweicloud.sdk.roma.v2.model.ResetProductAuthenticationResponse;
import com.huaweicloud.sdk.roma.v2.model.ResetRomaAppSecretRequest;
import com.huaweicloud.sdk.roma.v2.model.ResetRomaAppSecretResponse;
import com.huaweicloud.sdk.roma.v2.model.RunTaskRequest;
import com.huaweicloud.sdk.roma.v2.model.RunTaskResponse;
import com.huaweicloud.sdk.roma.v2.model.SendCommandRequest;
import com.huaweicloud.sdk.roma.v2.model.SendCommandRequestBody;
import com.huaweicloud.sdk.roma.v2.model.SendCommandResponse;
import com.huaweicloud.sdk.roma.v2.model.ShadowService;
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
import com.huaweicloud.sdk.roma.v2.model.SignApiBinding;
import com.huaweicloud.sdk.roma.v2.model.StartTestDatasourceRequest;
import com.huaweicloud.sdk.roma.v2.model.StartTestDatasourceResponse;
import com.huaweicloud.sdk.roma.v2.model.StopTaskRequest;
import com.huaweicloud.sdk.roma.v2.model.StopTaskResponse;
import com.huaweicloud.sdk.roma.v2.model.TaskDispatch;
import com.huaweicloud.sdk.roma.v2.model.ThrottleApiBindingCreate;
import com.huaweicloud.sdk.roma.v2.model.ThrottleBaseInfo;
import com.huaweicloud.sdk.roma.v2.model.ThrottleBindingBatchDelete;
import com.huaweicloud.sdk.roma.v2.model.ThrottleSpecialCreate;
import com.huaweicloud.sdk.roma.v2.model.ThrottleSpecialUpdate;
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
import com.huaweicloud.sdk.roma.v2.model.UpdateAppReq;
import com.huaweicloud.sdk.roma.v2.model.UpdateAppSecretReq;
import com.huaweicloud.sdk.roma.v2.model.UpdateBackendInstancesV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateBackendInstancesV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateCertificateV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateCertificateV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateCommandRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateCommandRequestBody;
import com.huaweicloud.sdk.roma.v2.model.UpdateCommandResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateCustomAuthorizerV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateCustomAuthorizerV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateDatasourceInfoRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateDatasourceInfoResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateDeviceGroupRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateDeviceGroupRequestBody;
import com.huaweicloud.sdk.roma.v2.model.UpdateDeviceGroupResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateDeviceRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateDeviceRequestBody;
import com.huaweicloud.sdk.roma.v2.model.UpdateDeviceResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateDictionary;
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
import com.huaweicloud.sdk.roma.v2.model.UpdateMqsInstanceTopicReq;
import com.huaweicloud.sdk.roma.v2.model.UpdateMqsInstanceTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateMqsInstanceTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateMultiTasksRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateMultiTasksResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateNotificationRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateNotificationRequestBody;
import com.huaweicloud.sdk.roma.v2.model.UpdateNotificationResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdatePluginRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdatePluginResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductRequestBody;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductTemplateRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductTemplateRequestBody;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductTemplateResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductTopicRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductTopicRequestBody;
import com.huaweicloud.sdk.roma.v2.model.UpdateProductTopicResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateProjectVpcChannelRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateProjectVpcChannelResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdatePropertyRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdatePropertyRequestBody;
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
import com.huaweicloud.sdk.roma.v2.model.UpdateRuleRequestBody;
import com.huaweicloud.sdk.roma.v2.model.UpdateRuleResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateServiceRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateServiceRequestBody;
import com.huaweicloud.sdk.roma.v2.model.UpdateServiceResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateSignatureKeyV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateSignatureKeyV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateSpecialThrottlingConfigurationV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateSpecialThrottlingConfigurationV2Response;
import com.huaweicloud.sdk.roma.v2.model.UpdateTaskRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateTaskResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateTopicAccessPolicyReq;
import com.huaweicloud.sdk.roma.v2.model.UpdateTopicAccessPolicyRequest;
import com.huaweicloud.sdk.roma.v2.model.UpdateTopicAccessPolicyResponse;
import com.huaweicloud.sdk.roma.v2.model.UpdateVpcChannelV2Request;
import com.huaweicloud.sdk.roma.v2.model.UpdateVpcChannelV2Response;
import com.huaweicloud.sdk.roma.v2.model.UploadProductRequest;
import com.huaweicloud.sdk.roma.v2.model.UploadProductRequestBody;
import com.huaweicloud.sdk.roma.v2.model.UploadProductResponse;
import com.huaweicloud.sdk.roma.v2.model.UrlDomainCreate;
import com.huaweicloud.sdk.roma.v2.model.UrlDomainModify;
import com.huaweicloud.sdk.roma.v2.model.ValidateDictionaryRequest;
import com.huaweicloud.sdk.roma.v2.model.ValidateDictionaryResponse;
import com.huaweicloud.sdk.roma.v2.model.ValidateRomaAppRequest;
import com.huaweicloud.sdk.roma.v2.model.ValidateRomaAppResponse;
import com.huaweicloud.sdk.roma.v2.model.VpcCreate;
import com.huaweicloud.sdk.roma.v2.model.VpcHealthConfig;
import com.huaweicloud.sdk.roma.v2.model.VpcMemberCreate;
import com.huaweicloud.sdk.roma.v2.model.VpcMemberModify;

import java.util.List;

@SuppressWarnings("unchecked")
public class RomaMeta {

    public static final HttpRequestDef<AddSubsetsToGatewayRequest, AddSubsetsToGatewayResponse> addSubsetsToGateway =
        genForAddSubsetsToGateway();

    private static HttpRequestDef<AddSubsetsToGatewayRequest, AddSubsetsToGatewayResponse> genForAddSubsetsToGateway() {
        // basic
        HttpRequestDef.Builder<AddSubsetsToGatewayRequest, AddSubsetsToGatewayResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddSubsetsToGatewayRequest.class, AddSubsetsToGatewayResponse.class)
                .withName("AddSubsetsToGateway")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}/subsets")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddSubsetsToGatewayRequest::getInstanceId,
                AddSubsetsToGatewayRequest::setInstanceId));
        builder.<Integer>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AddSubsetsToGatewayRequest::getDeviceId, AddSubsetsToGatewayRequest::setDeviceId));
        builder.<AddSubsetsToGatewayRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddSubsetsToGatewayRequestBody.class),
            f -> f.withMarshaller(AddSubsetsToGatewayRequest::getBody, AddSubsetsToGatewayRequest::setBody));

        // response
        builder.<List<AddSubsetsToGatewayResponseBody>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(AddSubsetsToGatewayResponse::getBody, AddSubsetsToGatewayResponse::setBody)
                .withInnerContainerType(AddSubsetsToGatewayResponseBody.class));

        return builder.build();
    }

    public static final HttpRequestDef<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse> associateAppsForAppQuota =
        genForAssociateAppsForAppQuota();

    private static HttpRequestDef<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse> genForAssociateAppsForAppQuota() {
        // basic
        HttpRequestDef.Builder<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, AssociateAppsForAppQuotaRequest.class, AssociateAppsForAppQuotaResponse.class)
                .withName("AssociateAppsForAppQuota")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas/{app_quota_id}/binding-apps")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAppsForAppQuotaRequest::getInstanceId,
                AssociateAppsForAppQuotaRequest::setInstanceId));
        builder.<String>withRequestField("app_quota_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAppsForAppQuotaRequest::getAppQuotaId,
                AssociateAppsForAppQuotaRequest::setAppQuotaId));
        builder.<CreateAppQuotaBindingApp>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppQuotaBindingApp.class),
            f -> f.withMarshaller(AssociateAppsForAppQuotaRequest::getBody, AssociateAppsForAppQuotaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateCertificateV2Request, AssociateCertificateV2Response> associateCertificateV2 =
        genForAssociateCertificateV2();

    private static HttpRequestDef<AssociateCertificateV2Request, AssociateCertificateV2Response> genForAssociateCertificateV2() {
        // basic
        HttpRequestDef.Builder<AssociateCertificateV2Request, AssociateCertificateV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssociateCertificateV2Request.class, AssociateCertificateV2Response.class)
            .withName("AssociateCertificateV2")
            .withUri(
                "/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateCertificateV2Request::getInstanceId,
                AssociateCertificateV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateCertificateV2Request::getGroupId,
                AssociateCertificateV2Request::setGroupId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateCertificateV2Request::getDomainId,
                AssociateCertificateV2Request::setDomainId));
        builder.<CertForm>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CertForm.class),
            f -> f.withMarshaller(AssociateCertificateV2Request::getBody, AssociateCertificateV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateDomainV2Request, AssociateDomainV2Response> associateDomainV2 =
        genForAssociateDomainV2();

    private static HttpRequestDef<AssociateDomainV2Request, AssociateDomainV2Response> genForAssociateDomainV2() {
        // basic
        HttpRequestDef.Builder<AssociateDomainV2Request, AssociateDomainV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateDomainV2Request.class, AssociateDomainV2Response.class)
                .withName("AssociateDomainV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}/domains")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateDomainV2Request::getInstanceId, AssociateDomainV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateDomainV2Request::getGroupId, AssociateDomainV2Request::setGroupId));
        builder.<UrlDomainCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UrlDomainCreate.class),
            f -> f.withMarshaller(AssociateDomainV2Request::getBody, AssociateDomainV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> associateSignatureKeyV2 =
        genForAssociateSignatureKeyV2();

    private static HttpRequestDef<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> genForAssociateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssociateSignatureKeyV2Request.class, AssociateSignatureKeyV2Response.class)
            .withName("AssociateSignatureKeyV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/sign-bindings")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateSignatureKeyV2Request::getInstanceId,
                AssociateSignatureKeyV2Request::setInstanceId));
        builder.<SignApiBinding>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SignApiBinding.class),
            f -> f.withMarshaller(AssociateSignatureKeyV2Request::getBody, AssociateSignatureKeyV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachApiToPluginRequest, AttachApiToPluginResponse> attachApiToPlugin =
        genForAttachApiToPlugin();

    private static HttpRequestDef<AttachApiToPluginRequest, AttachApiToPluginResponse> genForAttachApiToPlugin() {
        // basic
        HttpRequestDef.Builder<AttachApiToPluginRequest, AttachApiToPluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachApiToPluginRequest.class, AttachApiToPluginResponse.class)
                .withName("AttachApiToPlugin")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/plugins/{plugin_id}/attach")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachApiToPluginRequest::getInstanceId, AttachApiToPluginRequest::setInstanceId));
        builder.<String>withRequestField("plugin_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachApiToPluginRequest::getPluginId, AttachApiToPluginRequest::setPluginId));
        builder.<PluginOperApiInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PluginOperApiInfo.class),
            f -> f.withMarshaller(AttachApiToPluginRequest::getBody, AttachApiToPluginRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachPluginToApiRequest, AttachPluginToApiResponse> attachPluginToApi =
        genForAttachPluginToApi();

    private static HttpRequestDef<AttachPluginToApiRequest, AttachPluginToApiResponse> genForAttachPluginToApi() {
        // basic
        HttpRequestDef.Builder<AttachPluginToApiRequest, AttachPluginToApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachPluginToApiRequest.class, AttachPluginToApiResponse.class)
                .withName("AttachPluginToApi")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/{api_id}/plugins/attach")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachPluginToApiRequest::getInstanceId, AttachPluginToApiRequest::setInstanceId));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachPluginToApiRequest::getApiId, AttachPluginToApiRequest::setApiId));
        builder.<ApiOperPluginInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiOperPluginInfo.class),
            f -> f.withMarshaller(AttachPluginToApiRequest::getBody, AttachPluginToApiRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddDeviceToGroupRequest, BatchAddDeviceToGroupResponse> batchAddDeviceToGroup =
        genForBatchAddDeviceToGroup();

    private static HttpRequestDef<BatchAddDeviceToGroupRequest, BatchAddDeviceToGroupResponse> genForBatchAddDeviceToGroup() {
        // basic
        HttpRequestDef.Builder<BatchAddDeviceToGroupRequest, BatchAddDeviceToGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAddDeviceToGroupRequest.class, BatchAddDeviceToGroupResponse.class)
            .withName("BatchAddDeviceToGroup")
            .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups/{group_id}/devices/batch-add")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddDeviceToGroupRequest::getInstanceId,
                BatchAddDeviceToGroupRequest::setInstanceId));
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchAddDeviceToGroupRequest::getGroupId, BatchAddDeviceToGroupRequest::setGroupId));
        builder.<BatchAddDeviceToGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchAddDeviceToGroupRequestBody.class),
            f -> f.withMarshaller(BatchAddDeviceToGroupRequest::getBody, BatchAddDeviceToGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> batchDeleteDevices =
        genForBatchDeleteDevices();

    private static HttpRequestDef<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> genForBatchDeleteDevices() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteDevicesRequest.class, BatchDeleteDevicesResponse.class)
                .withName("BatchDeleteDevices")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteDevicesRequest::getInstanceId, BatchDeleteDevicesRequest::setInstanceId));
        builder.<BatchDeleteDevicesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteDevicesRequestBody.class),
            f -> f.withMarshaller(BatchDeleteDevicesRequest::getBody, BatchDeleteDevicesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteMqsInstanceTopicRequest, BatchDeleteMqsInstanceTopicResponse> batchDeleteMqsInstanceTopic =
        genForBatchDeleteMqsInstanceTopic();

    private static HttpRequestDef<BatchDeleteMqsInstanceTopicRequest, BatchDeleteMqsInstanceTopicResponse> genForBatchDeleteMqsInstanceTopic() {
        // basic
        HttpRequestDef.Builder<BatchDeleteMqsInstanceTopicRequest, BatchDeleteMqsInstanceTopicResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteMqsInstanceTopicRequest.class,
                    BatchDeleteMqsInstanceTopicResponse.class)
                .withName("BatchDeleteMqsInstanceTopic")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteMqsInstanceTopicRequest::getInstanceId,
                BatchDeleteMqsInstanceTopicRequest::setInstanceId));
        builder.<BatchDeleteMqsInstanceTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteMqsInstanceTopicReq.class),
            f -> f.withMarshaller(BatchDeleteMqsInstanceTopicRequest::getBody,
                BatchDeleteMqsInstanceTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteRulesRequest, BatchDeleteRulesResponse> batchDeleteRules =
        genForBatchDeleteRules();

    private static HttpRequestDef<BatchDeleteRulesRequest, BatchDeleteRulesResponse> genForBatchDeleteRules() {
        // basic
        HttpRequestDef.Builder<BatchDeleteRulesRequest, BatchDeleteRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteRulesRequest.class, BatchDeleteRulesResponse.class)
                .withName("BatchDeleteRules")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteRulesRequest::getInstanceId, BatchDeleteRulesRequest::setInstanceId));
        builder.<BatchDeleteRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteRulesRequestBody.class),
            f -> f.withMarshaller(BatchDeleteRulesRequest::getBody, BatchDeleteRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchFreezeDevicesRequest, BatchFreezeDevicesResponse> batchFreezeDevices =
        genForBatchFreezeDevices();

    private static HttpRequestDef<BatchFreezeDevicesRequest, BatchFreezeDevicesResponse> genForBatchFreezeDevices() {
        // basic
        HttpRequestDef.Builder<BatchFreezeDevicesRequest, BatchFreezeDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchFreezeDevicesRequest.class, BatchFreezeDevicesResponse.class)
                .withName("BatchFreezeDevices")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/force-offline")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchFreezeDevicesRequest::getInstanceId, BatchFreezeDevicesRequest::setInstanceId));
        builder.<BatchFreezeDevicesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchFreezeDevicesRequestBody.class),
            f -> f.withMarshaller(BatchFreezeDevicesRequest::getBody, BatchFreezeDevicesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartOrStopTasksRequest, BatchStartOrStopTasksResponse> batchStartOrStopTasks =
        genForBatchStartOrStopTasks();

    private static HttpRequestDef<BatchStartOrStopTasksRequest, BatchStartOrStopTasksResponse> genForBatchStartOrStopTasks() {
        // basic
        HttpRequestDef.Builder<BatchStartOrStopTasksRequest, BatchStartOrStopTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchStartOrStopTasksRequest.class, BatchStartOrStopTasksResponse.class)
            .withName("BatchStartOrStopTasks")
            .withUri("/v2/{project_id}/fdi/instances/{instance_id}/batch-operation/tasks")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchStartOrStopTasksRequest::getInstanceId,
                BatchStartOrStopTasksRequest::setInstanceId));
        builder.<OperateTasksBean>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateTasksBean.class),
            f -> f.withMarshaller(BatchStartOrStopTasksRequest::getBody, BatchStartOrStopTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckLivedataApisV2Request, CheckLivedataApisV2Response> checkLivedataApisV2 =
        genForCheckLivedataApisV2();

    private static HttpRequestDef<CheckLivedataApisV2Request, CheckLivedataApisV2Response> genForCheckLivedataApisV2() {
        // basic
        HttpRequestDef.Builder<CheckLivedataApisV2Request, CheckLivedataApisV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckLivedataApisV2Request.class, CheckLivedataApisV2Response.class)
                .withName("CheckLivedataApisV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckLivedataApisV2Request::getInstanceId,
                CheckLivedataApisV2Request::setInstanceId));
        builder.<LdApiCheckInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LdApiCheckInfo.class),
            f -> f.withMarshaller(CheckLivedataApisV2Request::getBody, CheckLivedataApisV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountDevicesRequest, CountDevicesResponse> countDevices = genForCountDevices();

    private static HttpRequestDef<CountDevicesRequest, CountDevicesResponse> genForCountDevices() {
        // basic
        HttpRequestDef.Builder<CountDevicesRequest, CountDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountDevicesRequest.class, CountDevicesResponse.class)
                .withName("CountDevices")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/statistics/devices-count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountDevicesRequest::getInstanceId, CountDevicesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountTasksRequest, CountTasksResponse> countTasks = genForCountTasks();

    private static HttpRequestDef<CountTasksRequest, CountTasksResponse> genForCountTasks() {
        // basic
        HttpRequestDef.Builder<CountTasksRequest, CountTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountTasksRequest.class, CountTasksResponse.class)
                .withName("CountTasks")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/statistics/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountTasksRequest::getInstanceId, CountTasksRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> createAppCodeAutoV2 =
        genForCreateAppCodeAutoV2();

    private static HttpRequestDef<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> genForCreateAppCodeAutoV2() {
        // basic
        HttpRequestDef.Builder<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateAppCodeAutoV2Request.class, CreateAppCodeAutoV2Response.class)
                .withName("CreateAppCodeAutoV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-codes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppCodeAutoV2Request::getInstanceId,
                CreateAppCodeAutoV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppCodeAutoV2Request::getAppId, CreateAppCodeAutoV2Request::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppCodeV2Request, CreateAppCodeV2Response> createAppCodeV2 =
        genForCreateAppCodeV2();

    private static HttpRequestDef<CreateAppCodeV2Request, CreateAppCodeV2Response> genForCreateAppCodeV2() {
        // basic
        HttpRequestDef.Builder<CreateAppCodeV2Request, CreateAppCodeV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppCodeV2Request.class, CreateAppCodeV2Response.class)
                .withName("CreateAppCodeV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-codes")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppCodeV2Request::getInstanceId, CreateAppCodeV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppCodeV2Request::getAppId, CreateAppCodeV2Request::setAppId));
        builder.<AppCodeCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppCodeCreate.class),
            f -> f.withMarshaller(CreateAppCodeV2Request::getBody, CreateAppCodeV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppConfigV2Request, CreateAppConfigV2Response> createAppConfigV2 =
        genForCreateAppConfigV2();

    private static HttpRequestDef<CreateAppConfigV2Request, CreateAppConfigV2Response> genForCreateAppConfigV2() {
        // basic
        HttpRequestDef.Builder<CreateAppConfigV2Request, CreateAppConfigV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppConfigV2Request.class, CreateAppConfigV2Response.class)
                .withName("CreateAppConfigV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/configs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppConfigV2Request::getInstanceId, CreateAppConfigV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppConfigV2Request::getAppId, CreateAppConfigV2Request::setAppId));
        builder.<AppConfigCreateRequestV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppConfigCreateRequestV2.class),
            f -> f.withMarshaller(CreateAppConfigV2Request::getBody, CreateAppConfigV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppQuotaRequest, CreateAppQuotaResponse> createAppQuota =
        genForCreateAppQuota();

    private static HttpRequestDef<CreateAppQuotaRequest, CreateAppQuotaResponse> genForCreateAppQuota() {
        // basic
        HttpRequestDef.Builder<CreateAppQuotaRequest, CreateAppQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppQuotaRequest.class, CreateAppQuotaResponse.class)
                .withName("CreateAppQuota")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppQuotaRequest::getInstanceId, CreateAppQuotaRequest::setInstanceId));
        builder.<AppQuotaCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppQuotaCreate.class),
            f -> f.withMarshaller(CreateAppQuotaRequest::getBody, CreateAppQuotaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCommandRequest, CreateCommandResponse> createCommand =
        genForCreateCommand();

    private static HttpRequestDef<CreateCommandRequest, CreateCommandResponse> genForCreateCommand() {
        // basic
        HttpRequestDef.Builder<CreateCommandRequest, CreateCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCommandRequest.class, CreateCommandResponse.class)
                .withName("CreateCommand")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCommandRequest::getInstanceId, CreateCommandRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCommandRequest::getServiceId, CreateCommandRequest::setServiceId));
        builder.<CreateCommandRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCommandRequestBody.class),
            f -> f.withMarshaller(CreateCommandRequest::getBody, CreateCommandRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCommonTaskRequest, CreateCommonTaskResponse> createCommonTask =
        genForCreateCommonTask();

    private static HttpRequestDef<CreateCommonTaskRequest, CreateCommonTaskResponse> genForCreateCommonTask() {
        // basic
        HttpRequestDef.Builder<CreateCommonTaskRequest, CreateCommonTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCommonTaskRequest.class, CreateCommonTaskResponse.class)
                .withName("CreateCommonTask")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCommonTaskRequest::getInstanceId, CreateCommonTaskRequest::setInstanceId));
        builder.<CreateCommonTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCommonTaskRequestBody.class),
            f -> f.withMarshaller(CreateCommonTaskRequest::getBody, CreateCommonTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> createCustomAuthorizerV2 =
        genForCreateCustomAuthorizerV2();

    private static HttpRequestDef<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> genForCreateCustomAuthorizerV2() {
        // basic
        HttpRequestDef.Builder<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateCustomAuthorizerV2Request.class, CreateCustomAuthorizerV2Response.class)
                .withName("CreateCustomAuthorizerV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/authorizers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCustomAuthorizerV2Request::getInstanceId,
                CreateCustomAuthorizerV2Request::setInstanceId));
        builder.<AuthorizerCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizerCreate.class),
            f -> f.withMarshaller(CreateCustomAuthorizerV2Request::getBody, CreateCustomAuthorizerV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatasourceInfoRequest, CreateDatasourceInfoResponse> createDatasourceInfo =
        genForCreateDatasourceInfo();

    private static HttpRequestDef<CreateDatasourceInfoRequest, CreateDatasourceInfoResponse> genForCreateDatasourceInfo() {
        // basic
        HttpRequestDef.Builder<CreateDatasourceInfoRequest, CreateDatasourceInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDatasourceInfoRequest.class, CreateDatasourceInfoResponse.class)
            .withName("CreateDatasourceInfo")
            .withUri("/v2/{project_id}/fdi/instances/{instance_id}/datasources")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatasourceInfoRequest::getInstanceId,
                CreateDatasourceInfoRequest::setInstanceId));
        builder.<DatasourceInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatasourceInfo.class),
            f -> f.withMarshaller(CreateDatasourceInfoRequest::getBody, CreateDatasourceInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDestinationRequest, CreateDestinationResponse> createDestination =
        genForCreateDestination();

    private static HttpRequestDef<CreateDestinationRequest, CreateDestinationResponse> genForCreateDestination() {
        // basic
        HttpRequestDef.Builder<CreateDestinationRequest, CreateDestinationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDestinationRequest.class, CreateDestinationResponse.class)
                .withName("CreateDestination")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}/destinations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDestinationRequest::getInstanceId, CreateDestinationRequest::setInstanceId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDestinationRequest::getRuleId, CreateDestinationRequest::setRuleId));
        builder.<CreateDestinationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDestinationRequestBody.class),
            f -> f.withMarshaller(CreateDestinationRequest::getBody, CreateDestinationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeviceRequest, CreateDeviceResponse> createDevice = genForCreateDevice();

    private static HttpRequestDef<CreateDeviceRequest, CreateDeviceResponse> genForCreateDevice() {
        // basic
        HttpRequestDef.Builder<CreateDeviceRequest, CreateDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDeviceRequest.class, CreateDeviceResponse.class)
                .withName("CreateDevice")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDeviceRequest::getInstanceId, CreateDeviceRequest::setInstanceId));
        builder.<CreateDeviceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDeviceRequestBody.class),
            f -> f.withMarshaller(CreateDeviceRequest::getBody, CreateDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeviceGroupRequest, CreateDeviceGroupResponse> createDeviceGroup =
        genForCreateDeviceGroup();

    private static HttpRequestDef<CreateDeviceGroupRequest, CreateDeviceGroupResponse> genForCreateDeviceGroup() {
        // basic
        HttpRequestDef.Builder<CreateDeviceGroupRequest, CreateDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDeviceGroupRequest.class, CreateDeviceGroupResponse.class)
                .withName("CreateDeviceGroup")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDeviceGroupRequest::getInstanceId, CreateDeviceGroupRequest::setInstanceId));
        builder.<CreateDeviceGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDeviceGroupRequestBody.class),
            f -> f.withMarshaller(CreateDeviceGroupRequest::getBody, CreateDeviceGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDispatchesRequest, CreateDispatchesResponse> createDispatches =
        genForCreateDispatches();

    private static HttpRequestDef<CreateDispatchesRequest, CreateDispatchesResponse> genForCreateDispatches() {
        // basic
        HttpRequestDef.Builder<CreateDispatchesRequest, CreateDispatchesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDispatchesRequest.class, CreateDispatchesResponse.class)
                .withName("CreateDispatches")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/tasks/{task_id}/dispatches")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDispatchesRequest::getInstanceId, CreateDispatchesRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDispatchesRequest::getTaskId, CreateDispatchesRequest::setTaskId));
        builder.<TaskDispatch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaskDispatch.class),
            f -> f.withMarshaller(CreateDispatchesRequest::getBody, CreateDispatchesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvironmentV2Request, CreateEnvironmentV2Response> createEnvironmentV2 =
        genForCreateEnvironmentV2();

    private static HttpRequestDef<CreateEnvironmentV2Request, CreateEnvironmentV2Response> genForCreateEnvironmentV2() {
        // basic
        HttpRequestDef.Builder<CreateEnvironmentV2Request, CreateEnvironmentV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnvironmentV2Request.class, CreateEnvironmentV2Response.class)
                .withName("CreateEnvironmentV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/envs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEnvironmentV2Request::getInstanceId,
                CreateEnvironmentV2Request::setInstanceId));
        builder.<EnvCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvCreate.class),
            f -> f.withMarshaller(CreateEnvironmentV2Request::getBody, CreateEnvironmentV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> createEnvironmentVariableV2 =
        genForCreateEnvironmentVariableV2();

    private static HttpRequestDef<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> genForCreateEnvironmentVariableV2() {
        // basic
        HttpRequestDef.Builder<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateEnvironmentVariableV2Request.class,
                    CreateEnvironmentVariableV2Response.class)
                .withName("CreateEnvironmentVariableV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/env-variables")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEnvironmentVariableV2Request::getInstanceId,
                CreateEnvironmentVariableV2Request::setInstanceId));
        builder.<EnvVariableCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvVariableCreate.class),
            f -> f.withMarshaller(CreateEnvironmentVariableV2Request::getBody,
                CreateEnvironmentVariableV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFeatureV2Request, CreateFeatureV2Response> createFeatureV2 =
        genForCreateFeatureV2();

    private static HttpRequestDef<CreateFeatureV2Request, CreateFeatureV2Response> genForCreateFeatureV2() {
        // basic
        HttpRequestDef.Builder<CreateFeatureV2Request, CreateFeatureV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFeatureV2Request.class, CreateFeatureV2Response.class)
                .withName("CreateFeatureV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/features")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFeatureV2Request::getInstanceId, CreateFeatureV2Request::setInstanceId));
        builder.<FeatureToggleV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FeatureToggleV2.class),
            f -> f.withMarshaller(CreateFeatureV2Request::getBody, CreateFeatureV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLiveDataApiScriptV2Request, CreateLiveDataApiScriptV2Response> createLiveDataApiScriptV2 =
        genForCreateLiveDataApiScriptV2();

    private static HttpRequestDef<CreateLiveDataApiScriptV2Request, CreateLiveDataApiScriptV2Response> genForCreateLiveDataApiScriptV2() {
        // basic
        HttpRequestDef.Builder<CreateLiveDataApiScriptV2Request, CreateLiveDataApiScriptV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateLiveDataApiScriptV2Request.class,
                    CreateLiveDataApiScriptV2Response.class)
                .withName("CreateLiveDataApiScriptV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}/scripts")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLiveDataApiScriptV2Request::getInstanceId,
                CreateLiveDataApiScriptV2Request::setInstanceId));
        builder.<String>withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLiveDataApiScriptV2Request::getLdApiId,
                CreateLiveDataApiScriptV2Request::setLdApiId));
        builder.<LdApiScriptCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LdApiScriptCreate.class),
            f -> f.withMarshaller(CreateLiveDataApiScriptV2Request::getBody,
                CreateLiveDataApiScriptV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLiveDataApiV2Request, CreateLiveDataApiV2Response> createLiveDataApiV2 =
        genForCreateLiveDataApiV2();

    private static HttpRequestDef<CreateLiveDataApiV2Request, CreateLiveDataApiV2Response> genForCreateLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<CreateLiveDataApiV2Request, CreateLiveDataApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLiveDataApiV2Request.class, CreateLiveDataApiV2Response.class)
                .withName("CreateLiveDataApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLiveDataApiV2Request::getInstanceId,
                CreateLiveDataApiV2Request::setInstanceId));
        builder.<LdApiCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LdApiCreate.class),
            f -> f.withMarshaller(CreateLiveDataApiV2Request::getBody, CreateLiveDataApiV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMqsInstanceTopicRequest, CreateMqsInstanceTopicResponse> createMqsInstanceTopic =
        genForCreateMqsInstanceTopic();

    private static HttpRequestDef<CreateMqsInstanceTopicRequest, CreateMqsInstanceTopicResponse> genForCreateMqsInstanceTopic() {
        // basic
        HttpRequestDef.Builder<CreateMqsInstanceTopicRequest, CreateMqsInstanceTopicResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateMqsInstanceTopicRequest.class, CreateMqsInstanceTopicResponse.class)
            .withName("CreateMqsInstanceTopic")
            .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMqsInstanceTopicRequest::getInstanceId,
                CreateMqsInstanceTopicRequest::setInstanceId));
        builder.<CreateMqsInstanceTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMqsInstanceTopicReq.class),
            f -> f.withMarshaller(CreateMqsInstanceTopicRequest::getBody, CreateMqsInstanceTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMultiTaskMappingsRequest, CreateMultiTaskMappingsResponse> createMultiTaskMappings =
        genForCreateMultiTaskMappings();

    private static HttpRequestDef<CreateMultiTaskMappingsRequest, CreateMultiTaskMappingsResponse> genForCreateMultiTaskMappings() {
        // basic
        HttpRequestDef.Builder<CreateMultiTaskMappingsRequest, CreateMultiTaskMappingsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateMultiTaskMappingsRequest.class, CreateMultiTaskMappingsResponse.class)
            .withName("CreateMultiTaskMappings")
            .withUri("/v2/{project_id}/fdi/instances/{instance_id}/multi-tasks/{task_id}/mappings")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMultiTaskMappingsRequest::getInstanceId,
                CreateMultiTaskMappingsRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMultiTaskMappingsRequest::getTaskId,
                CreateMultiTaskMappingsRequest::setTaskId));
        builder.<MultiTaskMappingCreateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MultiTaskMappingCreateBody.class),
            f -> f.withMarshaller(CreateMultiTaskMappingsRequest::getBody, CreateMultiTaskMappingsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMultiTasksRequest, CreateMultiTasksResponse> createMultiTasks =
        genForCreateMultiTasks();

    private static HttpRequestDef<CreateMultiTasksRequest, CreateMultiTasksResponse> genForCreateMultiTasks() {
        // basic
        HttpRequestDef.Builder<CreateMultiTasksRequest, CreateMultiTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMultiTasksRequest.class, CreateMultiTasksResponse.class)
                .withName("CreateMultiTasks")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/multi-tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMultiTasksRequest::getInstanceId, CreateMultiTasksRequest::setInstanceId));
        builder.<MultiTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MultiTaskRequestBody.class),
            f -> f.withMarshaller(CreateMultiTasksRequest::getBody, CreateMultiTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNotificationRequest, CreateNotificationResponse> createNotification =
        genForCreateNotification();

    private static HttpRequestDef<CreateNotificationRequest, CreateNotificationResponse> genForCreateNotification() {
        // basic
        HttpRequestDef.Builder<CreateNotificationRequest, CreateNotificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNotificationRequest.class, CreateNotificationResponse.class)
                .withName("CreateNotification")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/notifications")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNotificationRequest::getInstanceId, CreateNotificationRequest::setInstanceId));
        builder.<CreateNotificationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNotificationRequestBody.class),
            f -> f.withMarshaller(CreateNotificationRequest::getBody, CreateNotificationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePluginRequest, CreatePluginResponse> createPlugin = genForCreatePlugin();

    private static HttpRequestDef<CreatePluginRequest, CreatePluginResponse> genForCreatePlugin() {
        // basic
        HttpRequestDef.Builder<CreatePluginRequest, CreatePluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePluginRequest.class, CreatePluginResponse.class)
                .withName("CreatePlugin")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/plugins")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePluginRequest::getInstanceId, CreatePluginRequest::setInstanceId));
        builder.<PluginCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PluginCreate.class),
            f -> f.withMarshaller(CreatePluginRequest::getBody, CreatePluginRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProductRequest, CreateProductResponse> createProduct =
        genForCreateProduct();

    private static HttpRequestDef<CreateProductRequest, CreateProductResponse> genForCreateProduct() {
        // basic
        HttpRequestDef.Builder<CreateProductRequest, CreateProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProductRequest.class, CreateProductResponse.class)
                .withName("CreateProduct")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProductRequest::getInstanceId, CreateProductRequest::setInstanceId));
        builder.<CreateProductRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProductRequestBody.class),
            f -> f.withMarshaller(CreateProductRequest::getBody, CreateProductRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProductTemplateRequest, CreateProductTemplateResponse> createProductTemplate =
        genForCreateProductTemplate();

    private static HttpRequestDef<CreateProductTemplateRequest, CreateProductTemplateResponse> genForCreateProductTemplate() {
        // basic
        HttpRequestDef.Builder<CreateProductTemplateRequest, CreateProductTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateProductTemplateRequest.class, CreateProductTemplateResponse.class)
            .withName("CreateProductTemplate")
            .withUri("/v2/{project_id}/link/instances/{instance_id}/product-templates")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProductTemplateRequest::getInstanceId,
                CreateProductTemplateRequest::setInstanceId));
        builder.<CreateProductTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProductTemplateRequestBody.class),
            f -> f.withMarshaller(CreateProductTemplateRequest::getBody, CreateProductTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProductTopicRequest, CreateProductTopicResponse> createProductTopic =
        genForCreateProductTopic();

    private static HttpRequestDef<CreateProductTopicRequest, CreateProductTopicResponse> genForCreateProductTopic() {
        // basic
        HttpRequestDef.Builder<CreateProductTopicRequest, CreateProductTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProductTopicRequest.class, CreateProductTopicResponse.class)
                .withName("CreateProductTopic")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}/topics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProductTopicRequest::getInstanceId, CreateProductTopicRequest::setInstanceId));
        builder.<Integer>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateProductTopicRequest::getProductId, CreateProductTopicRequest::setProductId));
        builder.<CreateProductTopicRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProductTopicRequestBody.class),
            f -> f.withMarshaller(CreateProductTopicRequest::getBody, CreateProductTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePropertyRequest, CreatePropertyResponse> createProperty =
        genForCreateProperty();

    private static HttpRequestDef<CreatePropertyRequest, CreatePropertyResponse> genForCreateProperty() {
        // basic
        HttpRequestDef.Builder<CreatePropertyRequest, CreatePropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePropertyRequest.class, CreatePropertyResponse.class)
                .withName("CreateProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/properties")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePropertyRequest::getInstanceId, CreatePropertyRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePropertyRequest::getServiceId, CreatePropertyRequest::setServiceId));
        builder.<CreatePropertyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePropertyRequestBody.class),
            f -> f.withMarshaller(CreatePropertyRequest::getBody, CreatePropertyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRequestPropertyRequest, CreateRequestPropertyResponse> createRequestProperty =
        genForCreateRequestProperty();

    private static HttpRequestDef<CreateRequestPropertyRequest, CreateRequestPropertyResponse> genForCreateRequestProperty() {
        // basic
        HttpRequestDef.Builder<CreateRequestPropertyRequest, CreateRequestPropertyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateRequestPropertyRequest.class, CreateRequestPropertyResponse.class)
            .withName("CreateRequestProperty")
            .withUri(
                "/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/requests")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRequestPropertyRequest::getInstanceId,
                CreateRequestPropertyRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRequestPropertyRequest::getServiceId,
                CreateRequestPropertyRequest::setServiceId));
        builder.<Integer>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateRequestPropertyRequest::getCommandId,
                CreateRequestPropertyRequest::setCommandId));
        builder.<CreatePropertyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePropertyRequestBody.class),
            f -> f.withMarshaller(CreateRequestPropertyRequest::getBody, CreateRequestPropertyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2 =
        genForCreateRequestThrottlingPolicyV2();

    private static HttpRequestDef<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> genForCreateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRequestThrottlingPolicyV2Request.class,
                    CreateRequestThrottlingPolicyV2Response.class)
                .withName("CreateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRequestThrottlingPolicyV2Request::getInstanceId,
                CreateRequestThrottlingPolicyV2Request::setInstanceId));
        builder.<ThrottleBaseInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThrottleBaseInfo.class),
            f -> f.withMarshaller(CreateRequestThrottlingPolicyV2Request::getBody,
                CreateRequestThrottlingPolicyV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResponsePropertyRequest, CreateResponsePropertyResponse> createResponseProperty =
        genForCreateResponseProperty();

    private static HttpRequestDef<CreateResponsePropertyRequest, CreateResponsePropertyResponse> genForCreateResponseProperty() {
        // basic
        HttpRequestDef.Builder<CreateResponsePropertyRequest, CreateResponsePropertyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateResponsePropertyRequest.class, CreateResponsePropertyResponse.class)
            .withName("CreateResponseProperty")
            .withUri(
                "/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/responses")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResponsePropertyRequest::getInstanceId,
                CreateResponsePropertyRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResponsePropertyRequest::getServiceId,
                CreateResponsePropertyRequest::setServiceId));
        builder.<Integer>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateResponsePropertyRequest::getCommandId,
                CreateResponsePropertyRequest::setCommandId));
        builder.<CreatePropertyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePropertyRequestBody.class),
            f -> f.withMarshaller(CreateResponsePropertyRequest::getBody, CreateResponsePropertyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRuleRequest, CreateRuleResponse> createRule = genForCreateRule();

    private static HttpRequestDef<CreateRuleRequest, CreateRuleResponse> genForCreateRule() {
        // basic
        HttpRequestDef.Builder<CreateRuleRequest, CreateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRuleRequest.class, CreateRuleResponse.class)
                .withName("CreateRule")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRuleRequest::getInstanceId, CreateRuleRequest::setInstanceId));
        builder.<CreateRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRuleRequestBody.class),
            f -> f.withMarshaller(CreateRuleRequest::getBody, CreateRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServiceRequest, CreateServiceResponse> createService =
        genForCreateService();

    private static HttpRequestDef<CreateServiceRequest, CreateServiceResponse> genForCreateService() {
        // basic
        HttpRequestDef.Builder<CreateServiceRequest, CreateServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateServiceRequest.class, CreateServiceResponse.class)
                .withName("CreateService")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateServiceRequest::getInstanceId, CreateServiceRequest::setInstanceId));
        builder.<CreateServiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateServiceRequestBody.class),
            f -> f.withMarshaller(CreateServiceRequest::getBody, CreateServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> createSignatureKeyV2 =
        genForCreateSignatureKeyV2();

    private static HttpRequestDef<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> genForCreateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSignatureKeyV2Request.class, CreateSignatureKeyV2Response.class)
            .withName("CreateSignatureKeyV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/signs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSignatureKeyV2Request::getInstanceId,
                CreateSignatureKeyV2Request::setInstanceId));
        builder.<BaseSignature>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BaseSignature.class),
            f -> f.withMarshaller(CreateSignatureKeyV2Request::getBody, CreateSignatureKeyV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSourceRequest, CreateSourceResponse> createSource = genForCreateSource();

    private static HttpRequestDef<CreateSourceRequest, CreateSourceResponse> genForCreateSource() {
        // basic
        HttpRequestDef.Builder<CreateSourceRequest, CreateSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSourceRequest.class, CreateSourceResponse.class)
                .withName("CreateSource")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}/sources")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSourceRequest::getInstanceId, CreateSourceRequest::setInstanceId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSourceRequest::getRuleId, CreateSourceRequest::setRuleId));
        builder.<CreateSourceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSourceRequestBody.class),
            f -> f.withMarshaller(CreateSourceRequest::getBody, CreateSourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2 =
        genForCreateSpecialThrottlingConfigurationV2();

    private static HttpRequestDef<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> genForCreateSpecialThrottlingConfigurationV2() {
        // basic
        HttpRequestDef.Builder<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateSpecialThrottlingConfigurationV2Request.class,
                    CreateSpecialThrottlingConfigurationV2Response.class)
                .withName("CreateSpecialThrottlingConfigurationV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles/{throttle_id}/throttle-specials")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSpecialThrottlingConfigurationV2Request::getInstanceId,
                CreateSpecialThrottlingConfigurationV2Request::setInstanceId));
        builder.<String>withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSpecialThrottlingConfigurationV2Request::getThrottleId,
                CreateSpecialThrottlingConfigurationV2Request::setThrottleId));
        builder.<ThrottleSpecialCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThrottleSpecialCreate.class),
            f -> f.withMarshaller(CreateSpecialThrottlingConfigurationV2Request::getBody,
                CreateSpecialThrottlingConfigurationV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DebugLiveDataApiV2Request, DebugLiveDataApiV2Response> debugLiveDataApiV2 =
        genForDebugLiveDataApiV2();

    private static HttpRequestDef<DebugLiveDataApiV2Request, DebugLiveDataApiV2Response> genForDebugLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<DebugLiveDataApiV2Request, DebugLiveDataApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, DebugLiveDataApiV2Request.class, DebugLiveDataApiV2Response.class)
                .withName("DebugLiveDataApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}/test")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DebugLiveDataApiV2Request::getInstanceId, DebugLiveDataApiV2Request::setInstanceId));
        builder.<String>withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DebugLiveDataApiV2Request::getLdApiId, DebugLiveDataApiV2Request::setLdApiId));
        builder.<LdApiTest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(LdApiTest.class),
            f -> f.withMarshaller(DebugLiveDataApiV2Request::getBody, DebugLiveDataApiV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DebugRuleRequest, DebugRuleResponse> debugRule = genForDebugRule();

    private static HttpRequestDef<DebugRuleRequest, DebugRuleResponse> genForDebugRule() {
        // basic
        HttpRequestDef.Builder<DebugRuleRequest, DebugRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DebugRuleRequest.class, DebugRuleResponse.class)
                .withName("DebugRule")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rule-test")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DebugRuleRequest::getInstanceId, DebugRuleRequest::setInstanceId));
        builder.<DebugRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DebugRuleRequestBody.class),
            f -> f.withMarshaller(DebugRuleRequest::getBody, DebugRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppAclRequest, DeleteAppAclResponse> deleteAppAcl = genForDeleteAppAcl();

    private static HttpRequestDef<DeleteAppAclRequest, DeleteAppAclResponse> genForDeleteAppAcl() {
        // basic
        HttpRequestDef.Builder<DeleteAppAclRequest, DeleteAppAclResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppAclRequest.class, DeleteAppAclResponse.class)
                .withName("DeleteAppAcl")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-acl")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppAclRequest::getInstanceId, DeleteAppAclRequest::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppAclRequest::getAppId, DeleteAppAclRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppCodeV2Request, DeleteAppCodeV2Response> deleteAppCodeV2 =
        genForDeleteAppCodeV2();

    private static HttpRequestDef<DeleteAppCodeV2Request, DeleteAppCodeV2Response> genForDeleteAppCodeV2() {
        // basic
        HttpRequestDef.Builder<DeleteAppCodeV2Request, DeleteAppCodeV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppCodeV2Request.class, DeleteAppCodeV2Response.class)
                .withName("DeleteAppCodeV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-codes/{app_code_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppCodeV2Request::getInstanceId, DeleteAppCodeV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppCodeV2Request::getAppId, DeleteAppCodeV2Request::setAppId));
        builder.<String>withRequestField("app_code_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppCodeV2Request::getAppCodeId, DeleteAppCodeV2Request::setAppCodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppConfigV2Request, DeleteAppConfigV2Response> deleteAppConfigV2 =
        genForDeleteAppConfigV2();

    private static HttpRequestDef<DeleteAppConfigV2Request, DeleteAppConfigV2Response> genForDeleteAppConfigV2() {
        // basic
        HttpRequestDef.Builder<DeleteAppConfigV2Request, DeleteAppConfigV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppConfigV2Request.class, DeleteAppConfigV2Response.class)
                .withName("DeleteAppConfigV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/configs/{app_config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppConfigV2Request::getInstanceId, DeleteAppConfigV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppConfigV2Request::getAppId, DeleteAppConfigV2Request::setAppId));
        builder.<String>withRequestField("app_config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppConfigV2Request::getAppConfigId, DeleteAppConfigV2Request::setAppConfigId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppQuotaRequest, DeleteAppQuotaResponse> deleteAppQuota =
        genForDeleteAppQuota();

    private static HttpRequestDef<DeleteAppQuotaRequest, DeleteAppQuotaResponse> genForDeleteAppQuota() {
        // basic
        HttpRequestDef.Builder<DeleteAppQuotaRequest, DeleteAppQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppQuotaRequest.class, DeleteAppQuotaResponse.class)
                .withName("DeleteAppQuota")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas/{app_quota_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppQuotaRequest::getInstanceId, DeleteAppQuotaRequest::setInstanceId));
        builder.<String>withRequestField("app_quota_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppQuotaRequest::getAppQuotaId, DeleteAppQuotaRequest::setAppQuotaId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCommandRequest, DeleteCommandResponse> deleteCommand =
        genForDeleteCommand();

    private static HttpRequestDef<DeleteCommandRequest, DeleteCommandResponse> genForDeleteCommand() {
        // basic
        HttpRequestDef.Builder<DeleteCommandRequest, DeleteCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCommandRequest.class, DeleteCommandResponse.class)
                .withName("DeleteCommand")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCommandRequest::getInstanceId, DeleteCommandRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCommandRequest::getServiceId, DeleteCommandRequest::setServiceId));
        builder.<Integer>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteCommandRequest::getCommandId, DeleteCommandRequest::setCommandId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> deleteCustomAuthorizerV2 =
        genForDeleteCustomAuthorizerV2();

    private static HttpRequestDef<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> genForDeleteCustomAuthorizerV2() {
        // basic
        HttpRequestDef.Builder<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCustomAuthorizerV2Request.class,
                    DeleteCustomAuthorizerV2Response.class)
                .withName("DeleteCustomAuthorizerV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/authorizers/{authorizer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomAuthorizerV2Request::getInstanceId,
                DeleteCustomAuthorizerV2Request::setInstanceId));
        builder.<String>withRequestField("authorizer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomAuthorizerV2Request::getAuthorizerId,
                DeleteCustomAuthorizerV2Request::setAuthorizerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatasourceInfoByIdRequest, DeleteDatasourceInfoByIdResponse> deleteDatasourceInfoById =
        genForDeleteDatasourceInfoById();

    private static HttpRequestDef<DeleteDatasourceInfoByIdRequest, DeleteDatasourceInfoByIdResponse> genForDeleteDatasourceInfoById() {
        // basic
        HttpRequestDef.Builder<DeleteDatasourceInfoByIdRequest, DeleteDatasourceInfoByIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDatasourceInfoByIdRequest.class,
                    DeleteDatasourceInfoByIdResponse.class)
                .withName("DeleteDatasourceInfoById")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/datasources/{datasource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatasourceInfoByIdRequest::getInstanceId,
                DeleteDatasourceInfoByIdRequest::setInstanceId));
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatasourceInfoByIdRequest::getDatasourceId,
                DeleteDatasourceInfoByIdRequest::setDatasourceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDatasourceInfoByIdResponse::getBody,
                DeleteDatasourceInfoByIdResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDestinationRequest, DeleteDestinationResponse> deleteDestination =
        genForDeleteDestination();

    private static HttpRequestDef<DeleteDestinationRequest, DeleteDestinationResponse> genForDeleteDestination() {
        // basic
        HttpRequestDef.Builder<DeleteDestinationRequest, DeleteDestinationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDestinationRequest.class, DeleteDestinationResponse.class)
                .withName("DeleteDestination")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}/destinations/{destination_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDestinationRequest::getInstanceId, DeleteDestinationRequest::setInstanceId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDestinationRequest::getRuleId, DeleteDestinationRequest::setRuleId));
        builder.<Integer>withRequestField("destination_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDestinationRequest::getDestinationId,
                DeleteDestinationRequest::setDestinationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> deleteDevice = genForDeleteDevice();

    private static HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> genForDeleteDevice() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceRequest, DeleteDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeviceRequest.class, DeleteDeviceResponse.class)
                .withName("DeleteDevice")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceRequest::getInstanceId, DeleteDeviceRequest::setInstanceId));
        builder.<Integer>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDeviceRequest::getDeviceId, DeleteDeviceRequest::setDeviceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceFromGroupRequest, DeleteDeviceFromGroupResponse> deleteDeviceFromGroup =
        genForDeleteDeviceFromGroup();

    private static HttpRequestDef<DeleteDeviceFromGroupRequest, DeleteDeviceFromGroupResponse> genForDeleteDeviceFromGroup() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceFromGroupRequest, DeleteDeviceFromGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDeviceFromGroupRequest.class, DeleteDeviceFromGroupResponse.class)
            .withName("DeleteDeviceFromGroup")
            .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups/{group_id}/devices/{device_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceFromGroupRequest::getInstanceId,
                DeleteDeviceFromGroupRequest::setInstanceId));
        builder.<Integer>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDeviceFromGroupRequest::getDeviceId,
                DeleteDeviceFromGroupRequest::setDeviceId));
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDeviceFromGroupRequest::getGroupId, DeleteDeviceFromGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> deleteDeviceGroup =
        genForDeleteDeviceGroup();

    private static HttpRequestDef<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> genForDeleteDeviceGroup() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeviceGroupRequest.class, DeleteDeviceGroupResponse.class)
                .withName("DeleteDeviceGroup")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceGroupRequest::getInstanceId, DeleteDeviceGroupRequest::setInstanceId));
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDeviceGroupRequest::getGroupId, DeleteDeviceGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> deleteEnvironmentV2 =
        genForDeleteEnvironmentV2();

    private static HttpRequestDef<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> genForDeleteEnvironmentV2() {
        // basic
        HttpRequestDef.Builder<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEnvironmentV2Request.class, DeleteEnvironmentV2Response.class)
            .withName("DeleteEnvironmentV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/envs/{env_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentV2Request::getInstanceId,
                DeleteEnvironmentV2Request::setInstanceId));
        builder.<String>withRequestField("env_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentV2Request::getEnvId, DeleteEnvironmentV2Request::setEnvId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2 =
        genForDeleteEnvironmentVariableV2();

    private static HttpRequestDef<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> genForDeleteEnvironmentVariableV2() {
        // basic
        HttpRequestDef.Builder<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteEnvironmentVariableV2Request.class,
                    DeleteEnvironmentVariableV2Response.class)
                .withName("DeleteEnvironmentVariableV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/env-variables/{env_variable_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentVariableV2Request::getInstanceId,
                DeleteEnvironmentVariableV2Request::setInstanceId));
        builder.<String>withRequestField("env_variable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentVariableV2Request::getEnvVariableId,
                DeleteEnvironmentVariableV2Request::setEnvVariableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLiveDataApiV2Request, DeleteLiveDataApiV2Response> deleteLiveDataApiV2 =
        genForDeleteLiveDataApiV2();

    private static HttpRequestDef<DeleteLiveDataApiV2Request, DeleteLiveDataApiV2Response> genForDeleteLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<DeleteLiveDataApiV2Request, DeleteLiveDataApiV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteLiveDataApiV2Request.class, DeleteLiveDataApiV2Response.class)
            .withName("DeleteLiveDataApiV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLiveDataApiV2Request::getInstanceId,
                DeleteLiveDataApiV2Request::setInstanceId));
        builder.<String>withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLiveDataApiV2Request::getLdApiId, DeleteLiveDataApiV2Request::setLdApiId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMqsInstanceTopicRequest, DeleteMqsInstanceTopicResponse> deleteMqsInstanceTopic =
        genForDeleteMqsInstanceTopic();

    private static HttpRequestDef<DeleteMqsInstanceTopicRequest, DeleteMqsInstanceTopicResponse> genForDeleteMqsInstanceTopic() {
        // basic
        HttpRequestDef.Builder<DeleteMqsInstanceTopicRequest, DeleteMqsInstanceTopicResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMqsInstanceTopicRequest.class, DeleteMqsInstanceTopicResponse.class)
            .withName("DeleteMqsInstanceTopic")
            .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMqsInstanceTopicRequest::getInstanceId,
                DeleteMqsInstanceTopicRequest::setInstanceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMqsInstanceTopicRequest::getName, DeleteMqsInstanceTopicRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMultiTaskMappingRequest, DeleteMultiTaskMappingResponse> deleteMultiTaskMapping =
        genForDeleteMultiTaskMapping();

    private static HttpRequestDef<DeleteMultiTaskMappingRequest, DeleteMultiTaskMappingResponse> genForDeleteMultiTaskMapping() {
        // basic
        HttpRequestDef.Builder<DeleteMultiTaskMappingRequest, DeleteMultiTaskMappingResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMultiTaskMappingRequest.class, DeleteMultiTaskMappingResponse.class)
            .withName("DeleteMultiTaskMapping")
            .withUri("/v2/{project_id}/fdi/instances/{instance_id}/multi-tasks/{task_id}/mappings/{mapping_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMultiTaskMappingRequest::getInstanceId,
                DeleteMultiTaskMappingRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMultiTaskMappingRequest::getTaskId, DeleteMultiTaskMappingRequest::setTaskId));
        builder.<String>withRequestField("mapping_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMultiTaskMappingRequest::getMappingId,
                DeleteMultiTaskMappingRequest::setMappingId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNotificationRequest, DeleteNotificationResponse> deleteNotification =
        genForDeleteNotification();

    private static HttpRequestDef<DeleteNotificationRequest, DeleteNotificationResponse> genForDeleteNotification() {
        // basic
        HttpRequestDef.Builder<DeleteNotificationRequest, DeleteNotificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNotificationRequest.class, DeleteNotificationResponse.class)
                .withName("DeleteNotification")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/notifications/{notification_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotificationRequest::getInstanceId, DeleteNotificationRequest::setInstanceId));
        builder.<Long>withRequestField("notification_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteNotificationRequest::getNotificationId,
                DeleteNotificationRequest::setNotificationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePluginRequest, DeletePluginResponse> deletePlugin = genForDeletePlugin();

    private static HttpRequestDef<DeletePluginRequest, DeletePluginResponse> genForDeletePlugin() {
        // basic
        HttpRequestDef.Builder<DeletePluginRequest, DeletePluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePluginRequest.class, DeletePluginResponse.class)
                .withName("DeletePlugin")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/plugins/{plugin_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePluginRequest::getInstanceId, DeletePluginRequest::setInstanceId));
        builder.<String>withRequestField("plugin_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePluginRequest::getPluginId, DeletePluginRequest::setPluginId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProductRequest, DeleteProductResponse> deleteProduct =
        genForDeleteProduct();

    private static HttpRequestDef<DeleteProductRequest, DeleteProductResponse> genForDeleteProduct() {
        // basic
        HttpRequestDef.Builder<DeleteProductRequest, DeleteProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProductRequest.class, DeleteProductResponse.class)
                .withName("DeleteProduct")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getInstanceId, DeleteProductRequest::setInstanceId));
        builder.<Integer>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteProductRequest::getProductId, DeleteProductRequest::setProductId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProductTemplateRequest, DeleteProductTemplateResponse> deleteProductTemplate =
        genForDeleteProductTemplate();

    private static HttpRequestDef<DeleteProductTemplateRequest, DeleteProductTemplateResponse> genForDeleteProductTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteProductTemplateRequest, DeleteProductTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteProductTemplateRequest.class, DeleteProductTemplateResponse.class)
            .withName("DeleteProductTemplate")
            .withUri("/v2/{project_id}/link/instances/{instance_id}/product-templates/{product_template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductTemplateRequest::getInstanceId,
                DeleteProductTemplateRequest::setInstanceId));
        builder.<Integer>withRequestField("product_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteProductTemplateRequest::getProductTemplateId,
                DeleteProductTemplateRequest::setProductTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProductTopicRequest, DeleteProductTopicResponse> deleteProductTopic =
        genForDeleteProductTopic();

    private static HttpRequestDef<DeleteProductTopicRequest, DeleteProductTopicResponse> genForDeleteProductTopic() {
        // basic
        HttpRequestDef.Builder<DeleteProductTopicRequest, DeleteProductTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProductTopicRequest.class, DeleteProductTopicResponse.class)
                .withName("DeleteProductTopic")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}/topics/{topic_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductTopicRequest::getInstanceId, DeleteProductTopicRequest::setInstanceId));
        builder.<Integer>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteProductTopicRequest::getProductId, DeleteProductTopicRequest::setProductId));
        builder.<Integer>withRequestField("topic_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteProductTopicRequest::getTopicId, DeleteProductTopicRequest::setTopicId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePropertyRequest, DeletePropertyResponse> deleteProperty =
        genForDeleteProperty();

    private static HttpRequestDef<DeletePropertyRequest, DeletePropertyResponse> genForDeleteProperty() {
        // basic
        HttpRequestDef.Builder<DeletePropertyRequest, DeletePropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePropertyRequest.class, DeletePropertyResponse.class)
                .withName("DeleteProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/properties/{property_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePropertyRequest::getInstanceId, DeletePropertyRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePropertyRequest::getServiceId, DeletePropertyRequest::setServiceId));
        builder.<Integer>withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeletePropertyRequest::getPropertyId, DeletePropertyRequest::setPropertyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRequestPropertyRequest, DeleteRequestPropertyResponse> deleteRequestProperty =
        genForDeleteRequestProperty();

    private static HttpRequestDef<DeleteRequestPropertyRequest, DeleteRequestPropertyResponse> genForDeleteRequestProperty() {
        // basic
        HttpRequestDef.Builder<DeleteRequestPropertyRequest, DeleteRequestPropertyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteRequestPropertyRequest.class, DeleteRequestPropertyResponse.class)
            .withName("DeleteRequestProperty")
            .withUri(
                "/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/requests/{property_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRequestPropertyRequest::getInstanceId,
                DeleteRequestPropertyRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRequestPropertyRequest::getServiceId,
                DeleteRequestPropertyRequest::setServiceId));
        builder.<Integer>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteRequestPropertyRequest::getCommandId,
                DeleteRequestPropertyRequest::setCommandId));
        builder.<Integer>withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteRequestPropertyRequest::getPropertyId,
                DeleteRequestPropertyRequest::setPropertyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2 =
        genForDeleteRequestThrottlingPolicyV2();

    private static HttpRequestDef<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> genForDeleteRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteRequestThrottlingPolicyV2Request.class,
                    DeleteRequestThrottlingPolicyV2Response.class)
                .withName("DeleteRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles/{throttle_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRequestThrottlingPolicyV2Request::getInstanceId,
                DeleteRequestThrottlingPolicyV2Request::setInstanceId));
        builder.<String>withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRequestThrottlingPolicyV2Request::getThrottleId,
                DeleteRequestThrottlingPolicyV2Request::setThrottleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResponsePropertyRequest, DeleteResponsePropertyResponse> deleteResponseProperty =
        genForDeleteResponseProperty();

    private static HttpRequestDef<DeleteResponsePropertyRequest, DeleteResponsePropertyResponse> genForDeleteResponseProperty() {
        // basic
        HttpRequestDef.Builder<DeleteResponsePropertyRequest, DeleteResponsePropertyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteResponsePropertyRequest.class, DeleteResponsePropertyResponse.class)
            .withName("DeleteResponseProperty")
            .withUri(
                "/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/responses/{property_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResponsePropertyRequest::getInstanceId,
                DeleteResponsePropertyRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResponsePropertyRequest::getServiceId,
                DeleteResponsePropertyRequest::setServiceId));
        builder.<Integer>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteResponsePropertyRequest::getCommandId,
                DeleteResponsePropertyRequest::setCommandId));
        builder.<Integer>withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteResponsePropertyRequest::getPropertyId,
                DeleteResponsePropertyRequest::setPropertyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> deleteRule = genForDeleteRule();

    private static HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> genForDeleteRule() {
        // basic
        HttpRequestDef.Builder<DeleteRuleRequest, DeleteRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRuleRequest.class, DeleteRuleResponse.class)
                .withName("DeleteRule")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleRequest::getInstanceId, DeleteRuleRequest::setInstanceId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleRequest::getRuleId, DeleteRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceRequest, DeleteServiceResponse> deleteService =
        genForDeleteService();

    private static HttpRequestDef<DeleteServiceRequest, DeleteServiceResponse> genForDeleteService() {
        // basic
        HttpRequestDef.Builder<DeleteServiceRequest, DeleteServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServiceRequest.class, DeleteServiceResponse.class)
                .withName("DeleteService")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceRequest::getInstanceId, DeleteServiceRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceRequest::getServiceId, DeleteServiceRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> deleteSignatureKeyV2 =
        genForDeleteSignatureKeyV2();

    private static HttpRequestDef<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> genForDeleteSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSignatureKeyV2Request.class, DeleteSignatureKeyV2Response.class)
            .withName("DeleteSignatureKeyV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/signs/{sign_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSignatureKeyV2Request::getInstanceId,
                DeleteSignatureKeyV2Request::setInstanceId));
        builder.<String>withRequestField("sign_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSignatureKeyV2Request::getSignId, DeleteSignatureKeyV2Request::setSignId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSourceRequest, DeleteSourceResponse> deleteSource = genForDeleteSource();

    private static HttpRequestDef<DeleteSourceRequest, DeleteSourceResponse> genForDeleteSource() {
        // basic
        HttpRequestDef.Builder<DeleteSourceRequest, DeleteSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSourceRequest.class, DeleteSourceResponse.class)
                .withName("DeleteSource")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}/sources/{source_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSourceRequest::getInstanceId, DeleteSourceRequest::setInstanceId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSourceRequest::getRuleId, DeleteSourceRequest::setRuleId));
        builder.<Integer>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteSourceRequest::getSourceId, DeleteSourceRequest::setSourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2 =
        genForDeleteSpecialThrottlingConfigurationV2();

    private static HttpRequestDef<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> genForDeleteSpecialThrottlingConfigurationV2() {
        // basic
        HttpRequestDef.Builder<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteSpecialThrottlingConfigurationV2Request.class,
                    DeleteSpecialThrottlingConfigurationV2Response.class)
                .withName("DeleteSpecialThrottlingConfigurationV2")
                .withUri(
                    "/v2/{project_id}/apic/instances/{instance_id}/throttles/{throttle_id}/throttle-specials/{strategy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSpecialThrottlingConfigurationV2Request::getInstanceId,
                DeleteSpecialThrottlingConfigurationV2Request::setInstanceId));
        builder.<String>withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSpecialThrottlingConfigurationV2Request::getThrottleId,
                DeleteSpecialThrottlingConfigurationV2Request::setThrottleId));
        builder.<String>withRequestField("strategy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSpecialThrottlingConfigurationV2Request::getStrategyId,
                DeleteSpecialThrottlingConfigurationV2Request::setStrategyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genForDeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genForDeleteTask() {
        // basic
        HttpRequestDef.Builder<DeleteTaskRequest, DeleteTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskRequest.class, DeleteTaskResponse.class)
                .withName("DeleteTask")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getInstanceId, DeleteTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, DeleteTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachApiFromPluginRequest, DetachApiFromPluginResponse> detachApiFromPlugin =
        genForDetachApiFromPlugin();

    private static HttpRequestDef<DetachApiFromPluginRequest, DetachApiFromPluginResponse> genForDetachApiFromPlugin() {
        // basic
        HttpRequestDef.Builder<DetachApiFromPluginRequest, DetachApiFromPluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, DetachApiFromPluginRequest.class, DetachApiFromPluginResponse.class)
                .withName("DetachApiFromPlugin")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/plugins/{plugin_id}/detach")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachApiFromPluginRequest::getInstanceId,
                DetachApiFromPluginRequest::setInstanceId));
        builder.<String>withRequestField("plugin_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachApiFromPluginRequest::getPluginId, DetachApiFromPluginRequest::setPluginId));
        builder.<PluginOperApiInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PluginOperApiInfo.class),
            f -> f.withMarshaller(DetachApiFromPluginRequest::getBody, DetachApiFromPluginRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachPluginFromApiRequest, DetachPluginFromApiResponse> detachPluginFromApi =
        genForDetachPluginFromApi();

    private static HttpRequestDef<DetachPluginFromApiRequest, DetachPluginFromApiResponse> genForDetachPluginFromApi() {
        // basic
        HttpRequestDef.Builder<DetachPluginFromApiRequest, DetachPluginFromApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, DetachPluginFromApiRequest.class, DetachPluginFromApiResponse.class)
                .withName("DetachPluginFromApi")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/{api_id}/plugins/detach")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachPluginFromApiRequest::getInstanceId,
                DetachPluginFromApiRequest::setInstanceId));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachPluginFromApiRequest::getApiId, DetachPluginFromApiRequest::setApiId));
        builder.<ApiOperPluginInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiOperPluginInfo.class),
            f -> f.withMarshaller(DetachPluginFromApiRequest::getBody, DetachPluginFromApiRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse> disassociateAppQuotaWithApp =
        genForDisassociateAppQuotaWithApp();

    private static HttpRequestDef<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse> genForDisassociateAppQuotaWithApp() {
        // basic
        HttpRequestDef.Builder<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DisassociateAppQuotaWithAppRequest.class,
                    DisassociateAppQuotaWithAppResponse.class)
                .withName("DisassociateAppQuotaWithApp")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas/{app_quota_id}/bound-apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateAppQuotaWithAppRequest::getInstanceId,
                DisassociateAppQuotaWithAppRequest::setInstanceId));
        builder.<String>withRequestField("app_quota_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateAppQuotaWithAppRequest::getAppQuotaId,
                DisassociateAppQuotaWithAppRequest::setAppQuotaId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateAppQuotaWithAppRequest::getAppId,
                DisassociateAppQuotaWithAppRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateCertificateV2Request, DisassociateCertificateV2Response> disassociateCertificateV2 =
        genForDisassociateCertificateV2();

    private static HttpRequestDef<DisassociateCertificateV2Request, DisassociateCertificateV2Response> genForDisassociateCertificateV2() {
        // basic
        HttpRequestDef.Builder<DisassociateCertificateV2Request, DisassociateCertificateV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DisassociateCertificateV2Request.class,
                    DisassociateCertificateV2Response.class)
                .withName("DisassociateCertificateV2")
                .withUri(
                    "/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateCertificateV2Request::getInstanceId,
                DisassociateCertificateV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateCertificateV2Request::getGroupId,
                DisassociateCertificateV2Request::setGroupId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateCertificateV2Request::getDomainId,
                DisassociateCertificateV2Request::setDomainId));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateCertificateV2Request::getCertificateId,
                DisassociateCertificateV2Request::setCertificateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateDomainV2Request, DisassociateDomainV2Response> disassociateDomainV2 =
        genForDisassociateDomainV2();

    private static HttpRequestDef<DisassociateDomainV2Request, DisassociateDomainV2Response> genForDisassociateDomainV2() {
        // basic
        HttpRequestDef.Builder<DisassociateDomainV2Request, DisassociateDomainV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DisassociateDomainV2Request.class, DisassociateDomainV2Response.class)
            .withName("DisassociateDomainV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateDomainV2Request::getInstanceId,
                DisassociateDomainV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateDomainV2Request::getGroupId, DisassociateDomainV2Request::setGroupId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateDomainV2Request::getDomainId, DisassociateDomainV2Request::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2 =
        genForDisassociateSignatureKeyV2();

    private static HttpRequestDef<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> genForDisassociateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DisassociateSignatureKeyV2Request.class,
                    DisassociateSignatureKeyV2Response.class)
                .withName("DisassociateSignatureKeyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/sign-bindings/{sign_bindings_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateSignatureKeyV2Request::getInstanceId,
                DisassociateSignatureKeyV2Request::setInstanceId));
        builder.<String>withRequestField("sign_bindings_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateSignatureKeyV2Request::getSignBindingsId,
                DisassociateSignatureKeyV2Request::setSignBindingsId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadProductsRequest, DownloadProductsResponse> downloadProducts =
        genForDownloadProducts();

    private static HttpRequestDef<DownloadProductsRequest, DownloadProductsResponse> genForDownloadProducts() {
        // basic
        HttpRequestDef.Builder<DownloadProductsRequest, DownloadProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadProductsRequest.class, DownloadProductsResponse.class)
                .withName("DownloadProducts")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadProductsRequest::getInstanceId, DownloadProductsRequest::setInstanceId));
        builder.<List<Integer>>withRequestField("product_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DownloadProductsRequest::getProductIds, DownloadProductsRequest::setProductIds));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportMqsInstanceTopicRequest, ExportMqsInstanceTopicResponse> exportMqsInstanceTopic =
        genForExportMqsInstanceTopic();

    private static HttpRequestDef<ExportMqsInstanceTopicRequest, ExportMqsInstanceTopicResponse> genForExportMqsInstanceTopic() {
        // basic
        HttpRequestDef.Builder<ExportMqsInstanceTopicRequest, ExportMqsInstanceTopicResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExportMqsInstanceTopicRequest.class, ExportMqsInstanceTopicResponse.class)
            .withName("ExportMqsInstanceTopic")
            .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics/export")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportMqsInstanceTopicRequest::getInstanceId,
                ExportMqsInstanceTopicRequest::setInstanceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportMqsInstanceTopicRequest::getName, ExportMqsInstanceTopicRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportMqsInstanceTopicRequest, ImportMqsInstanceTopicResponse> importMqsInstanceTopic =
        genForImportMqsInstanceTopic();

    private static HttpRequestDef<ImportMqsInstanceTopicRequest, ImportMqsInstanceTopicResponse> genForImportMqsInstanceTopic() {
        // basic
        HttpRequestDef.Builder<ImportMqsInstanceTopicRequest, ImportMqsInstanceTopicResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ImportMqsInstanceTopicRequest.class, ImportMqsInstanceTopicResponse.class)
            .withName("ImportMqsInstanceTopic")
            .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics/import")
            .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportMqsInstanceTopicRequest::getInstanceId,
                ImportMqsInstanceTopicRequest::setInstanceId));
        builder.<ImportMqsInstanceTopicRequest.ModeEnum>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ImportMqsInstanceTopicRequest.ModeEnum.class),
            f -> f.withMarshaller(ImportMqsInstanceTopicRequest::getMode, ImportMqsInstanceTopicRequest::setMode));
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportMqsInstanceTopicRequest::getPrefix, ImportMqsInstanceTopicRequest::setPrefix));
        builder.<ImportMqsInstanceTopicRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportMqsInstanceTopicRequestBody.class),
            f -> f.withMarshaller(ImportMqsInstanceTopicRequest::getBody, ImportMqsInstanceTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InstallMultiTasksRequest, InstallMultiTasksResponse> installMultiTasks =
        genForInstallMultiTasks();

    private static HttpRequestDef<InstallMultiTasksRequest, InstallMultiTasksResponse> genForInstallMultiTasks() {
        // basic
        HttpRequestDef.Builder<InstallMultiTasksRequest, InstallMultiTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InstallMultiTasksRequest.class, InstallMultiTasksResponse.class)
                .withName("InstallMultiTasks")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/multi-tasks/init")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InstallMultiTasksRequest::getInstanceId, InstallMultiTasksRequest::setInstanceId));
        builder.<MultiTaskInitBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MultiTaskInitBody.class),
            f -> f.withMarshaller(InstallMultiTasksRequest::getBody, InstallMultiTasksRequest::setBody));

        // response
        builder.<List<MultiTaskInitElement>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(InstallMultiTasksResponse::getBody, InstallMultiTasksResponse::setBody)
                .withInnerContainerType(MultiTaskInitElement.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListApiAttachablePluginsRequest, ListApiAttachablePluginsResponse> listApiAttachablePlugins =
        genForListApiAttachablePlugins();

    private static HttpRequestDef<ListApiAttachablePluginsRequest, ListApiAttachablePluginsResponse> genForListApiAttachablePlugins() {
        // basic
        HttpRequestDef.Builder<ListApiAttachablePluginsRequest, ListApiAttachablePluginsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListApiAttachablePluginsRequest.class, ListApiAttachablePluginsResponse.class)
                .withName("ListApiAttachablePlugins")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/{api_id}/attachable-plugins")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachablePluginsRequest::getInstanceId,
                ListApiAttachablePluginsRequest::setInstanceId));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachablePluginsRequest::getApiId,
                ListApiAttachablePluginsRequest::setApiId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApiAttachablePluginsRequest::getOffset,
                ListApiAttachablePluginsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApiAttachablePluginsRequest::getLimit,
                ListApiAttachablePluginsRequest::setLimit));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachablePluginsRequest::getEnvId,
                ListApiAttachablePluginsRequest::setEnvId));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachablePluginsRequest::getPluginName,
                ListApiAttachablePluginsRequest::setPluginName));
        builder.<String>withRequestField("plugin_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachablePluginsRequest::getPluginType,
                ListApiAttachablePluginsRequest::setPluginType));
        builder.<String>withRequestField("plugin_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachablePluginsRequest::getPluginId,
                ListApiAttachablePluginsRequest::setPluginId));
        builder.<String>withRequestField("roma_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachablePluginsRequest::getRomaAppId,
                ListApiAttachablePluginsRequest::setRomaAppId));
        builder.<String>withRequestField("roma_app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachablePluginsRequest::getRomaAppName,
                ListApiAttachablePluginsRequest::setRomaAppName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiAttachedPluginsRequest, ListApiAttachedPluginsResponse> listApiAttachedPlugins =
        genForListApiAttachedPlugins();

    private static HttpRequestDef<ListApiAttachedPluginsRequest, ListApiAttachedPluginsResponse> genForListApiAttachedPlugins() {
        // basic
        HttpRequestDef.Builder<ListApiAttachedPluginsRequest, ListApiAttachedPluginsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListApiAttachedPluginsRequest.class, ListApiAttachedPluginsResponse.class)
            .withName("ListApiAttachedPlugins")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/{api_id}/attached-plugins")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachedPluginsRequest::getInstanceId,
                ListApiAttachedPluginsRequest::setInstanceId));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachedPluginsRequest::getApiId, ListApiAttachedPluginsRequest::setApiId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApiAttachedPluginsRequest::getOffset, ListApiAttachedPluginsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApiAttachedPluginsRequest::getLimit, ListApiAttachedPluginsRequest::setLimit));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachedPluginsRequest::getEnvId, ListApiAttachedPluginsRequest::setEnvId));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachedPluginsRequest::getPluginName,
                ListApiAttachedPluginsRequest::setPluginName));
        builder.<String>withRequestField("plugin_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachedPluginsRequest::getPluginId,
                ListApiAttachedPluginsRequest::setPluginId));
        builder.<String>withRequestField("env_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachedPluginsRequest::getEnvName,
                ListApiAttachedPluginsRequest::setEnvName));
        builder.<String>withRequestField("plugin_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachedPluginsRequest::getPluginType,
                ListApiAttachedPluginsRequest::setPluginType));
        builder.<String>withRequestField("roma_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachedPluginsRequest::getRomaAppId,
                ListApiAttachedPluginsRequest::setRomaAppId));
        builder.<String>withRequestField("roma_app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiAttachedPluginsRequest::getRomaAppName,
                ListApiAttachedPluginsRequest::setRomaAppName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2 =
        genForListApisBindedToSignatureKeyV2();

    private static HttpRequestDef<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> genForListApisBindedToSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApisBindedToSignatureKeyV2Request.class,
                    ListApisBindedToSignatureKeyV2Response.class)
                .withName("ListApisBindedToSignatureKeyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/sign-bindings/binded-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getInstanceId,
                ListApisBindedToSignatureKeyV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getOffset,
                ListApisBindedToSignatureKeyV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getLimit,
                ListApisBindedToSignatureKeyV2Request::setLimit));
        builder.<String>withRequestField("sign_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getSignId,
                ListApisBindedToSignatureKeyV2Request::setSignId));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getEnvId,
                ListApisBindedToSignatureKeyV2Request::setEnvId));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getApiId,
                ListApisBindedToSignatureKeyV2Request::setApiId));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getApiName,
                ListApisBindedToSignatureKeyV2Request::setApiName));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getGroupId,
                ListApisBindedToSignatureKeyV2Request::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2 =
        genForListApisNotBoundWithSignatureKeyV2();

    private static HttpRequestDef<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> genForListApisNotBoundWithSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApisNotBoundWithSignatureKeyV2Request.class,
                    ListApisNotBoundWithSignatureKeyV2Response.class)
                .withName("ListApisNotBoundWithSignatureKeyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/sign-bindings/unbinded-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getInstanceId,
                ListApisNotBoundWithSignatureKeyV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getOffset,
                ListApisNotBoundWithSignatureKeyV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getLimit,
                ListApisNotBoundWithSignatureKeyV2Request::setLimit));
        builder.<String>withRequestField("sign_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getSignId,
                ListApisNotBoundWithSignatureKeyV2Request::setSignId));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getEnvId,
                ListApisNotBoundWithSignatureKeyV2Request::setEnvId));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getApiId,
                ListApisNotBoundWithSignatureKeyV2Request::setApiId));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getApiName,
                ListApisNotBoundWithSignatureKeyV2Request::setApiName));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getGroupId,
                ListApisNotBoundWithSignatureKeyV2Request::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppCodesV2Request, ListAppCodesV2Response> listAppCodesV2 =
        genForListAppCodesV2();

    private static HttpRequestDef<ListAppCodesV2Request, ListAppCodesV2Response> genForListAppCodesV2() {
        // basic
        HttpRequestDef.Builder<ListAppCodesV2Request, ListAppCodesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppCodesV2Request.class, ListAppCodesV2Response.class)
                .withName("ListAppCodesV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-codes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppCodesV2Request::getInstanceId, ListAppCodesV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppCodesV2Request::getAppId, ListAppCodesV2Request::setAppId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppCodesV2Request::getOffset, ListAppCodesV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppCodesV2Request::getLimit, ListAppCodesV2Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppConfigsV2Request, ListAppConfigsV2Response> listAppConfigsV2 =
        genForListAppConfigsV2();

    private static HttpRequestDef<ListAppConfigsV2Request, ListAppConfigsV2Response> genForListAppConfigsV2() {
        // basic
        HttpRequestDef.Builder<ListAppConfigsV2Request, ListAppConfigsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppConfigsV2Request.class, ListAppConfigsV2Response.class)
                .withName("ListAppConfigsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppConfigsV2Request::getInstanceId, ListAppConfigsV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppConfigsV2Request::getOffset, ListAppConfigsV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppConfigsV2Request::getLimit, ListAppConfigsV2Request::setLimit));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppConfigsV2Request::getAppId, ListAppConfigsV2Request::setAppId));
        builder.<String>withRequestField("config_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppConfigsV2Request::getConfigName, ListAppConfigsV2Request::setConfigName));
        builder.<String>withRequestField("roma_app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppConfigsV2Request::getRomaAppName, ListAppConfigsV2Request::setRomaAppName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse> listAppQuotaBindableApps =
        genForListAppQuotaBindableApps();

    private static HttpRequestDef<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse> genForListAppQuotaBindableApps() {
        // basic
        HttpRequestDef.Builder<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAppQuotaBindableAppsRequest.class, ListAppQuotaBindableAppsResponse.class)
                .withName("ListAppQuotaBindableApps")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas/{app_quota_id}/bindable-apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppQuotaBindableAppsRequest::getInstanceId,
                ListAppQuotaBindableAppsRequest::setInstanceId));
        builder.<String>withRequestField("app_quota_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppQuotaBindableAppsRequest::getAppQuotaId,
                ListAppQuotaBindableAppsRequest::setAppQuotaId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppQuotaBindableAppsRequest::getOffset,
                ListAppQuotaBindableAppsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppQuotaBindableAppsRequest::getLimit,
                ListAppQuotaBindableAppsRequest::setLimit));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppQuotaBindableAppsRequest::getAppName,
                ListAppQuotaBindableAppsRequest::setAppName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse> listAppQuotaBoundApps =
        genForListAppQuotaBoundApps();

    private static HttpRequestDef<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse> genForListAppQuotaBoundApps() {
        // basic
        HttpRequestDef.Builder<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAppQuotaBoundAppsRequest.class, ListAppQuotaBoundAppsResponse.class)
            .withName("ListAppQuotaBoundApps")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas/{app_quota_id}/bound-apps")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppQuotaBoundAppsRequest::getInstanceId,
                ListAppQuotaBoundAppsRequest::setInstanceId));
        builder.<String>withRequestField("app_quota_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppQuotaBoundAppsRequest::getAppQuotaId,
                ListAppQuotaBoundAppsRequest::setAppQuotaId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppQuotaBoundAppsRequest::getOffset, ListAppQuotaBoundAppsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppQuotaBoundAppsRequest::getLimit, ListAppQuotaBoundAppsRequest::setLimit));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppQuotaBoundAppsRequest::getAppName, ListAppQuotaBoundAppsRequest::setAppName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppQuotasRequest, ListAppQuotasResponse> listAppQuotas =
        genForListAppQuotas();

    private static HttpRequestDef<ListAppQuotasRequest, ListAppQuotasResponse> genForListAppQuotas() {
        // basic
        HttpRequestDef.Builder<ListAppQuotasRequest, ListAppQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppQuotasRequest.class, ListAppQuotasResponse.class)
                .withName("ListAppQuotas")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppQuotasRequest::getInstanceId, ListAppQuotasRequest::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppQuotasRequest::getOffset, ListAppQuotasRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppQuotasRequest::getLimit, ListAppQuotasRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppQuotasRequest::getName, ListAppQuotasRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsV2Request, ListAppsV2Response> listAppsV2 = genForListAppsV2();

    private static HttpRequestDef<ListAppsV2Request, ListAppsV2Response> genForListAppsV2() {
        // basic
        HttpRequestDef.Builder<ListAppsV2Request, ListAppsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsV2Request.class, ListAppsV2Response.class)
                .withName("ListAppsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsV2Request::getInstanceId, ListAppsV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppsV2Request::getOffset, ListAppsV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsV2Request::getLimit, ListAppsV2Request::setLimit));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsV2Request::getId, ListAppsV2Request::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsV2Request::getName, ListAppsV2Request::setName));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsV2Request::getStatus, ListAppsV2Request::setStatus));
        builder.<String>withRequestField("app_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsV2Request::getAppKey, ListAppsV2Request::setAppKey));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsV2Request::getPreciseSearch, ListAppsV2Request::setPreciseSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCommandsRequest, ListCommandsResponse> listCommands = genForListCommands();

    private static HttpRequestDef<ListCommandsRequest, ListCommandsResponse> genForListCommands() {
        // basic
        HttpRequestDef.Builder<ListCommandsRequest, ListCommandsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCommandsRequest.class, ListCommandsResponse.class)
                .withName("ListCommands")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommandsRequest::getInstanceId, ListCommandsRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommandsRequest::getServiceId, ListCommandsRequest::setServiceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommandsRequest::getLimit, ListCommandsRequest::setLimit));
        builder.<Integer>withRequestField("command_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommandsRequest::getCommandId, ListCommandsRequest::setCommandId));
        builder.<String>withRequestField("command_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommandsRequest::getCommandName, ListCommandsRequest::setCommandName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommandsRequest::getOffset, ListCommandsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> listCustomAuthorizersV2 =
        genForListCustomAuthorizersV2();

    private static HttpRequestDef<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> genForListCustomAuthorizersV2() {
        // basic
        HttpRequestDef.Builder<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCustomAuthorizersV2Request.class, ListCustomAuthorizersV2Response.class)
            .withName("ListCustomAuthorizersV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/authorizers")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getInstanceId,
                ListCustomAuthorizersV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getOffset,
                ListCustomAuthorizersV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getLimit, ListCustomAuthorizersV2Request::setLimit));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getId, ListCustomAuthorizersV2Request::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getName, ListCustomAuthorizersV2Request::setName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getType, ListCustomAuthorizersV2Request::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatasourceColumnsRequest, ListDatasourceColumnsResponse> listDatasourceColumns =
        genForListDatasourceColumns();

    private static HttpRequestDef<ListDatasourceColumnsRequest, ListDatasourceColumnsResponse> genForListDatasourceColumns() {
        // basic
        HttpRequestDef.Builder<ListDatasourceColumnsRequest, ListDatasourceColumnsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDatasourceColumnsRequest.class, ListDatasourceColumnsResponse.class)
            .withName("ListDatasourceColumns")
            .withUri("/v2/{project_id}/fdi/instances/{instance_id}/datasources/{datasource_id}/columns")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourceColumnsRequest::getInstanceId,
                ListDatasourceColumnsRequest::setInstanceId));
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourceColumnsRequest::getDatasourceId,
                ListDatasourceColumnsRequest::setDatasourceId));
        builder.<ListDatasourceColumnsRequest.PositionEnum>withRequestField("position",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListDatasourceColumnsRequest.PositionEnum.class),
            f -> f.withMarshaller(ListDatasourceColumnsRequest::getPosition,
                ListDatasourceColumnsRequest::setPosition));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourceColumnsRequest::getDbName, ListDatasourceColumnsRequest::setDbName));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourceColumnsRequest::getTableName,
                ListDatasourceColumnsRequest::setTableName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatasourceTablesRequest, ListDatasourceTablesResponse> listDatasourceTables =
        genForListDatasourceTables();

    private static HttpRequestDef<ListDatasourceTablesRequest, ListDatasourceTablesResponse> genForListDatasourceTables() {
        // basic
        HttpRequestDef.Builder<ListDatasourceTablesRequest, ListDatasourceTablesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDatasourceTablesRequest.class, ListDatasourceTablesResponse.class)
            .withName("ListDatasourceTables")
            .withUri("/v2/{project_id}/fdi/instances/{instance_id}/datasources/{datasource_id}/tables")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourceTablesRequest::getInstanceId,
                ListDatasourceTablesRequest::setInstanceId));
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourceTablesRequest::getDatasourceId,
                ListDatasourceTablesRequest::setDatasourceId));
        builder.<ListDatasourceTablesRequest.PositionEnum>withRequestField("position",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListDatasourceTablesRequest.PositionEnum.class),
            f -> f.withMarshaller(ListDatasourceTablesRequest::getPosition, ListDatasourceTablesRequest::setPosition));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourceTablesRequest::getDbName, ListDatasourceTablesRequest::setDbName));
        builder.<String>withRequestField("db_schema",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourceTablesRequest::getDbSchema, ListDatasourceTablesRequest::setDbSchema));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourceTablesRequest::getFilter, ListDatasourceTablesRequest::setFilter));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatasourcesRequest, ListDatasourcesResponse> listDatasources =
        genForListDatasources();

    private static HttpRequestDef<ListDatasourcesRequest, ListDatasourcesResponse> genForListDatasources() {
        // basic
        HttpRequestDef.Builder<ListDatasourcesRequest, ListDatasourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatasourcesRequest.class, ListDatasourcesResponse.class)
                .withName("ListDatasources")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/datasources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourcesRequest::getInstanceId, ListDatasourcesRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatasourcesRequest::getLimit, ListDatasourcesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatasourcesRequest::getOffset, ListDatasourcesRequest::setOffset));
        builder.<ListDatasourcesRequest.DatasourceTypeEnum>withRequestField("datasource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDatasourcesRequest.DatasourceTypeEnum.class),
            f -> f.withMarshaller(ListDatasourcesRequest::getDatasourceType,
                ListDatasourcesRequest::setDatasourceType));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourcesRequest::getSortField, ListDatasourcesRequest::setSortField));
        builder.<ListDatasourcesRequest.SortTypeEnum>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDatasourcesRequest.SortTypeEnum.class),
            f -> f.withMarshaller(ListDatasourcesRequest::getSortType, ListDatasourcesRequest::setSortType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourcesRequest::getName, ListDatasourcesRequest::setName));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourcesRequest::getAppId, ListDatasourcesRequest::setAppId));
        builder.<String>withRequestField("custom_plugin_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatasourcesRequest::getCustomPluginId,
                ListDatasourcesRequest::setCustomPluginId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDestinationsRequest, ListDestinationsResponse> listDestinations =
        genForListDestinations();

    private static HttpRequestDef<ListDestinationsRequest, ListDestinationsResponse> genForListDestinations() {
        // basic
        HttpRequestDef.Builder<ListDestinationsRequest, ListDestinationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDestinationsRequest.class, ListDestinationsResponse.class)
                .withName("ListDestinations")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}/destinations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDestinationsRequest::getInstanceId, ListDestinationsRequest::setInstanceId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDestinationsRequest::getRuleId, ListDestinationsRequest::setRuleId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDestinationsRequest::getLimit, ListDestinationsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDestinationsRequest::getOffset, ListDestinationsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDevicesRequest, ListDevicesResponse> listDevices = genForListDevices();

    private static HttpRequestDef<ListDevicesRequest, ListDevicesResponse> genForListDevices() {
        // basic
        HttpRequestDef.Builder<ListDevicesRequest, ListDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDevicesRequest.class, ListDevicesResponse.class)
                .withName("ListDevices")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getInstanceId, ListDevicesRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesRequest::getLimit, ListDevicesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesRequest::getOffset, ListDevicesRequest::setOffset));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getAppId, ListDevicesRequest::setAppId));
        builder.<Integer>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesRequest::getProductId, ListDevicesRequest::setProductId));
        builder.<String>withRequestField("product_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getProductName, ListDevicesRequest::setProductName));
        builder.<String>withRequestField("device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getDeviceName, ListDevicesRequest::setDeviceName));
        builder.<String>withRequestField("client_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getClientId, ListDevicesRequest::setClientId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getNodeId, ListDevicesRequest::setNodeId));
        builder.<Integer>withRequestField("node_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesRequest::getNodeType, ListDevicesRequest::setNodeType));
        builder.<String>withRequestField("online_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getOnlineStatus, ListDevicesRequest::setOnlineStatus));
        builder.<Long>withRequestField("created_date_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDevicesRequest::getCreatedDateStart, ListDevicesRequest::setCreatedDateStart));
        builder.<Long>withRequestField("created_date_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDevicesRequest::getCreatedDateEnd, ListDevicesRequest::setCreatedDateEnd));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getTag, ListDevicesRequest::setTag));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDevicesInProductRequest, ListDevicesInProductResponse> listDevicesInProduct =
        genForListDevicesInProduct();

    private static HttpRequestDef<ListDevicesInProductRequest, ListDevicesInProductResponse> genForListDevicesInProduct() {
        // basic
        HttpRequestDef.Builder<ListDevicesInProductRequest, ListDevicesInProductResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDevicesInProductRequest.class, ListDevicesInProductResponse.class)
            .withName("ListDevicesInProduct")
            .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}/devices-summary")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesInProductRequest::getInstanceId,
                ListDevicesInProductRequest::setInstanceId));
        builder.<Integer>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesInProductRequest::getProductId,
                ListDevicesInProductRequest::setProductId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2 =
        genForListEnvironmentVariablesV2();

    private static HttpRequestDef<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> genForListEnvironmentVariablesV2() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListEnvironmentVariablesV2Request.class,
                    ListEnvironmentVariablesV2Response.class)
                .withName("ListEnvironmentVariablesV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/env-variables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getInstanceId,
                ListEnvironmentVariablesV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getOffset,
                ListEnvironmentVariablesV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getLimit,
                ListEnvironmentVariablesV2Request::setLimit));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getGroupId,
                ListEnvironmentVariablesV2Request::setGroupId));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getEnvId,
                ListEnvironmentVariablesV2Request::setEnvId));
        builder.<String>withRequestField("variable_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getVariableName,
                ListEnvironmentVariablesV2Request::setVariableName));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getPreciseSearch,
                ListEnvironmentVariablesV2Request::setPreciseSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentsV2Request, ListEnvironmentsV2Response> listEnvironmentsV2 =
        genForListEnvironmentsV2();

    private static HttpRequestDef<ListEnvironmentsV2Request, ListEnvironmentsV2Response> genForListEnvironmentsV2() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentsV2Request, ListEnvironmentsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnvironmentsV2Request.class, ListEnvironmentsV2Response.class)
                .withName("ListEnvironmentsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/envs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentsV2Request::getInstanceId, ListEnvironmentsV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvironmentsV2Request::getOffset, ListEnvironmentsV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnvironmentsV2Request::getLimit, ListEnvironmentsV2Request::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentsV2Request::getName, ListEnvironmentsV2Request::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFeaturesV2Request, ListFeaturesV2Response> listFeaturesV2 =
        genForListFeaturesV2();

    private static HttpRequestDef<ListFeaturesV2Request, ListFeaturesV2Response> genForListFeaturesV2() {
        // basic
        HttpRequestDef.Builder<ListFeaturesV2Request, ListFeaturesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFeaturesV2Request.class, ListFeaturesV2Response.class)
                .withName("ListFeaturesV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/features")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFeaturesV2Request::getInstanceId, ListFeaturesV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFeaturesV2Request::getOffset, ListFeaturesV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFeaturesV2Request::getLimit, ListFeaturesV2Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> listLatelyApiStatisticsV2 =
        genForListLatelyApiStatisticsV2();

    private static HttpRequestDef<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> genForListLatelyApiStatisticsV2() {
        // basic
        HttpRequestDef.Builder<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListLatelyApiStatisticsV2Request.class,
                    ListLatelyApiStatisticsV2Response.class)
                .withName("ListLatelyApiStatisticsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/statistics/api/latest")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatelyApiStatisticsV2Request::getInstanceId,
                ListLatelyApiStatisticsV2Request::setInstanceId));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatelyApiStatisticsV2Request::getApiId,
                ListLatelyApiStatisticsV2Request::setApiId));
        builder.<String>withRequestField("duration",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatelyApiStatisticsV2Request::getDuration,
                ListLatelyApiStatisticsV2Request::setDuration));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLiveDataApiDeploymentHistoryV2Request, ListLiveDataApiDeploymentHistoryV2Response> listLiveDataApiDeploymentHistoryV2 =
        genForListLiveDataApiDeploymentHistoryV2();

    private static HttpRequestDef<ListLiveDataApiDeploymentHistoryV2Request, ListLiveDataApiDeploymentHistoryV2Response> genForListLiveDataApiDeploymentHistoryV2() {
        // basic
        HttpRequestDef.Builder<ListLiveDataApiDeploymentHistoryV2Request, ListLiveDataApiDeploymentHistoryV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListLiveDataApiDeploymentHistoryV2Request.class,
                    ListLiveDataApiDeploymentHistoryV2Response.class)
                .withName("ListLiveDataApiDeploymentHistoryV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}/deploy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataApiDeploymentHistoryV2Request::getInstanceId,
                ListLiveDataApiDeploymentHistoryV2Request::setInstanceId));
        builder.<String>withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataApiDeploymentHistoryV2Request::getLdApiId,
                ListLiveDataApiDeploymentHistoryV2Request::setLdApiId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLiveDataApiTestHistoryV2Request, ListLiveDataApiTestHistoryV2Response> listLiveDataApiTestHistoryV2 =
        genForListLiveDataApiTestHistoryV2();

    private static HttpRequestDef<ListLiveDataApiTestHistoryV2Request, ListLiveDataApiTestHistoryV2Response> genForListLiveDataApiTestHistoryV2() {
        // basic
        HttpRequestDef.Builder<ListLiveDataApiTestHistoryV2Request, ListLiveDataApiTestHistoryV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListLiveDataApiTestHistoryV2Request.class,
                    ListLiveDataApiTestHistoryV2Response.class)
                .withName("ListLiveDataApiTestHistoryV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}/test")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataApiTestHistoryV2Request::getInstanceId,
                ListLiveDataApiTestHistoryV2Request::setInstanceId));
        builder.<String>withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataApiTestHistoryV2Request::getLdApiId,
                ListLiveDataApiTestHistoryV2Request::setLdApiId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListLiveDataApiTestHistoryV2Request::getOffset,
                ListLiveDataApiTestHistoryV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLiveDataApiTestHistoryV2Request::getLimit,
                ListLiveDataApiTestHistoryV2Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLiveDataApiV2Request, ListLiveDataApiV2Response> listLiveDataApiV2 =
        genForListLiveDataApiV2();

    private static HttpRequestDef<ListLiveDataApiV2Request, ListLiveDataApiV2Response> genForListLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<ListLiveDataApiV2Request, ListLiveDataApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLiveDataApiV2Request.class, ListLiveDataApiV2Response.class)
                .withName("ListLiveDataApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataApiV2Request::getInstanceId, ListLiveDataApiV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListLiveDataApiV2Request::getOffset, ListLiveDataApiV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLiveDataApiV2Request::getLimit, ListLiveDataApiV2Request::setLimit));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataApiV2Request::getAppId, ListLiveDataApiV2Request::setAppId));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataApiV2Request::getAppName, ListLiveDataApiV2Request::setAppName));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataApiV2Request::getName, ListLiveDataApiV2Request::setName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataApiV2Request::getStatus, ListLiveDataApiV2Request::setStatus));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataApiV2Request::getPath, ListLiveDataApiV2Request::setPath));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataApiV2Request::getPreciseSearch,
                ListLiveDataApiV2Request::setPreciseSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLiveDataDataSourcesV2Request, ListLiveDataDataSourcesV2Response> listLiveDataDataSourcesV2 =
        genForListLiveDataDataSourcesV2();

    private static HttpRequestDef<ListLiveDataDataSourcesV2Request, ListLiveDataDataSourcesV2Response> genForListLiveDataDataSourcesV2() {
        // basic
        HttpRequestDef.Builder<ListLiveDataDataSourcesV2Request, ListLiveDataDataSourcesV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListLiveDataDataSourcesV2Request.class,
                    ListLiveDataDataSourcesV2Response.class)
                .withName("ListLiveDataDataSourcesV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/data-sources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataDataSourcesV2Request::getInstanceId,
                ListLiveDataDataSourcesV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListLiveDataDataSourcesV2Request::getOffset,
                ListLiveDataDataSourcesV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLiveDataDataSourcesV2Request::getLimit,
                ListLiveDataDataSourcesV2Request::setLimit));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataDataSourcesV2Request::getAppId,
                ListLiveDataDataSourcesV2Request::setAppId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataDataSourcesV2Request::getName,
                ListLiveDataDataSourcesV2Request::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLiveDataQuotaV2Request, ListLiveDataQuotaV2Response> listLiveDataQuotaV2 =
        genForListLiveDataQuotaV2();

    private static HttpRequestDef<ListLiveDataQuotaV2Request, ListLiveDataQuotaV2Response> genForListLiveDataQuotaV2() {
        // basic
        HttpRequestDef.Builder<ListLiveDataQuotaV2Request, ListLiveDataQuotaV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLiveDataQuotaV2Request.class, ListLiveDataQuotaV2Response.class)
                .withName("ListLiveDataQuotaV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-quota")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLiveDataQuotaV2Request::getInstanceId,
                ListLiveDataQuotaV2Request::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMonitorInfosRequest, ListMonitorInfosResponse> listMonitorInfos =
        genForListMonitorInfos();

    private static HttpRequestDef<ListMonitorInfosRequest, ListMonitorInfosResponse> genForListMonitorInfos() {
        // basic
        HttpRequestDef.Builder<ListMonitorInfosRequest, ListMonitorInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMonitorInfosRequest.class, ListMonitorInfosResponse.class)
                .withName("ListMonitorInfos")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/task-monitors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorInfosRequest::getInstanceId, ListMonitorInfosRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMonitorInfosRequest::getOffset, ListMonitorInfosRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMonitorInfosRequest::getLimit, ListMonitorInfosRequest::setLimit));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorInfosRequest::getTaskName, ListMonitorInfosRequest::setTaskName));
        builder.<ListMonitorInfosRequest.ExecuteStatusEnum>withRequestField("execute_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMonitorInfosRequest.ExecuteStatusEnum.class),
            f -> f.withMarshaller(ListMonitorInfosRequest::getExecuteStatus,
                ListMonitorInfosRequest::setExecuteStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMonitorLogRequest, ListMonitorLogResponse> listMonitorLog =
        genForListMonitorLog();

    private static HttpRequestDef<ListMonitorLogRequest, ListMonitorLogResponse> genForListMonitorLog() {
        // basic
        HttpRequestDef.Builder<ListMonitorLogRequest, ListMonitorLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMonitorLogRequest.class, ListMonitorLogResponse.class)
                .withName("ListMonitorLog")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/tasks/{task_id}/monitor-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorLogRequest::getInstanceId, ListMonitorLogRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorLogRequest::getTaskId, ListMonitorLogRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMonitorLogRequest::getOffset, ListMonitorLogRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMonitorLogRequest::getLimit, ListMonitorLogRequest::setLimit));
        builder.<Long>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListMonitorLogRequest::getBeginTime, ListMonitorLogRequest::setBeginTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListMonitorLogRequest::getEndTime, ListMonitorLogRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMqsInstanceTopicsRequest, ListMqsInstanceTopicsResponse> listMqsInstanceTopics =
        genForListMqsInstanceTopics();

    private static HttpRequestDef<ListMqsInstanceTopicsRequest, ListMqsInstanceTopicsResponse> genForListMqsInstanceTopics() {
        // basic
        HttpRequestDef.Builder<ListMqsInstanceTopicsRequest, ListMqsInstanceTopicsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMqsInstanceTopicsRequest.class, ListMqsInstanceTopicsResponse.class)
            .withName("ListMqsInstanceTopics")
            .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMqsInstanceTopicsRequest::getInstanceId,
                ListMqsInstanceTopicsRequest::setInstanceId));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMqsInstanceTopicsRequest::getAppName, ListMqsInstanceTopicsRequest::setAppName));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMqsInstanceTopicsRequest::getName, ListMqsInstanceTopicsRequest::setName));
        builder.<ListMqsInstanceTopicsRequest.AccessPolicyEnum>withRequestField("access_policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMqsInstanceTopicsRequest.AccessPolicyEnum.class),
            f -> f.withMarshaller(ListMqsInstanceTopicsRequest::getAccessPolicy,
                ListMqsInstanceTopicsRequest::setAccessPolicy));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMqsInstanceTopicsRequest::getLimit, ListMqsInstanceTopicsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMqsInstanceTopicsRequest::getOffset, ListMqsInstanceTopicsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationRequest, ListNotificationResponse> listNotification =
        genForListNotification();

    private static HttpRequestDef<ListNotificationRequest, ListNotificationResponse> genForListNotification() {
        // basic
        HttpRequestDef.Builder<ListNotificationRequest, ListNotificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNotificationRequest.class, ListNotificationResponse.class)
                .withName("ListNotification")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/notifications")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotificationRequest::getInstanceId, ListNotificationRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationRequest::getLimit, ListNotificationRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationRequest::getOffset, ListNotificationRequest::setOffset));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotificationRequest::getAppId, ListNotificationRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPluginAttachableApisRequest, ListPluginAttachableApisResponse> listPluginAttachableApis =
        genForListPluginAttachableApis();

    private static HttpRequestDef<ListPluginAttachableApisRequest, ListPluginAttachableApisResponse> genForListPluginAttachableApis() {
        // basic
        HttpRequestDef.Builder<ListPluginAttachableApisRequest, ListPluginAttachableApisResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListPluginAttachableApisRequest.class, ListPluginAttachableApisResponse.class)
                .withName("ListPluginAttachableApis")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/plugins/{plugin_id}/attachable-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachableApisRequest::getInstanceId,
                ListPluginAttachableApisRequest::setInstanceId));
        builder.<String>withRequestField("plugin_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachableApisRequest::getPluginId,
                ListPluginAttachableApisRequest::setPluginId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPluginAttachableApisRequest::getOffset,
                ListPluginAttachableApisRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPluginAttachableApisRequest::getLimit,
                ListPluginAttachableApisRequest::setLimit));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachableApisRequest::getEnvId,
                ListPluginAttachableApisRequest::setEnvId));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachableApisRequest::getApiName,
                ListPluginAttachableApisRequest::setApiName));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachableApisRequest::getApiId,
                ListPluginAttachableApisRequest::setApiId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachableApisRequest::getGroupId,
                ListPluginAttachableApisRequest::setGroupId));
        builder.<String>withRequestField("req_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachableApisRequest::getReqMethod,
                ListPluginAttachableApisRequest::setReqMethod));
        builder.<String>withRequestField("req_uri",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachableApisRequest::getReqUri,
                ListPluginAttachableApisRequest::setReqUri));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPluginAttachedApisRequest, ListPluginAttachedApisResponse> listPluginAttachedApis =
        genForListPluginAttachedApis();

    private static HttpRequestDef<ListPluginAttachedApisRequest, ListPluginAttachedApisResponse> genForListPluginAttachedApis() {
        // basic
        HttpRequestDef.Builder<ListPluginAttachedApisRequest, ListPluginAttachedApisResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPluginAttachedApisRequest.class, ListPluginAttachedApisResponse.class)
            .withName("ListPluginAttachedApis")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/plugins/{plugin_id}/attached-apis")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachedApisRequest::getInstanceId,
                ListPluginAttachedApisRequest::setInstanceId));
        builder.<String>withRequestField("plugin_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachedApisRequest::getPluginId,
                ListPluginAttachedApisRequest::setPluginId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPluginAttachedApisRequest::getOffset, ListPluginAttachedApisRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPluginAttachedApisRequest::getLimit, ListPluginAttachedApisRequest::setLimit));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachedApisRequest::getEnvId, ListPluginAttachedApisRequest::setEnvId));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachedApisRequest::getApiName,
                ListPluginAttachedApisRequest::setApiName));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachedApisRequest::getApiId, ListPluginAttachedApisRequest::setApiId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachedApisRequest::getGroupId,
                ListPluginAttachedApisRequest::setGroupId));
        builder.<String>withRequestField("req_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachedApisRequest::getReqMethod,
                ListPluginAttachedApisRequest::setReqMethod));
        builder.<String>withRequestField("req_uri",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachedApisRequest::getReqUri, ListPluginAttachedApisRequest::setReqUri));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPluginsRequest, ListPluginsResponse> listPlugins = genForListPlugins();

    private static HttpRequestDef<ListPluginsRequest, ListPluginsResponse> genForListPlugins() {
        // basic
        HttpRequestDef.Builder<ListPluginsRequest, ListPluginsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPluginsRequest.class, ListPluginsResponse.class)
                .withName("ListPlugins")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/plugins")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginsRequest::getInstanceId, ListPluginsRequest::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPluginsRequest::getOffset, ListPluginsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPluginsRequest::getLimit, ListPluginsRequest::setLimit));
        builder.<String>withRequestField("plugin_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginsRequest::getPluginType, ListPluginsRequest::setPluginType));
        builder.<String>withRequestField("plugin_scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginsRequest::getPluginScope, ListPluginsRequest::setPluginScope));
        builder.<String>withRequestField("plugin_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginsRequest::getPluginId, ListPluginsRequest::setPluginId));
        builder.<String>withRequestField("plugin_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginsRequest::getPluginName, ListPluginsRequest::setPluginName));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginsRequest::getPreciseSearch, ListPluginsRequest::setPreciseSearch));
        builder.<String>withRequestField("roma_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginsRequest::getRomaAppId, ListPluginsRequest::setRomaAppId));
        builder.<String>withRequestField("roma_app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginsRequest::getRomaAppName, ListPluginsRequest::setRomaAppName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductTemplatesRequest, ListProductTemplatesResponse> listProductTemplates =
        genForListProductTemplates();

    private static HttpRequestDef<ListProductTemplatesRequest, ListProductTemplatesResponse> genForListProductTemplates() {
        // basic
        HttpRequestDef.Builder<ListProductTemplatesRequest, ListProductTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProductTemplatesRequest.class, ListProductTemplatesResponse.class)
            .withName("ListProductTemplates")
            .withUri("/v2/{project_id}/link/instances/{instance_id}/product-templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductTemplatesRequest::getInstanceId,
                ListProductTemplatesRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductTemplatesRequest::getLimit, ListProductTemplatesRequest::setLimit));
        builder.<Integer>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductTemplatesRequest::getId, ListProductTemplatesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductTemplatesRequest::getName, ListProductTemplatesRequest::setName));
        builder.<ListProductTemplatesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProductTemplatesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListProductTemplatesRequest::getStatus, ListProductTemplatesRequest::setStatus));
        builder.<String>withRequestField("created_user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductTemplatesRequest::getCreatedUserName,
                ListProductTemplatesRequest::setCreatedUserName));
        builder.<Long>withRequestField("created_date_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProductTemplatesRequest::getCreatedDateStart,
                ListProductTemplatesRequest::setCreatedDateStart));
        builder.<Long>withRequestField("created_date_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProductTemplatesRequest::getCreatedDateEnd,
                ListProductTemplatesRequest::setCreatedDateEnd));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductTemplatesRequest::getOffset, ListProductTemplatesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductTopicsRequest, ListProductTopicsResponse> listProductTopics =
        genForListProductTopics();

    private static HttpRequestDef<ListProductTopicsRequest, ListProductTopicsResponse> genForListProductTopics() {
        // basic
        HttpRequestDef.Builder<ListProductTopicsRequest, ListProductTopicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductTopicsRequest.class, ListProductTopicsResponse.class)
                .withName("ListProductTopics")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}/topics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductTopicsRequest::getInstanceId, ListProductTopicsRequest::setInstanceId));
        builder.<Integer>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductTopicsRequest::getProductId, ListProductTopicsRequest::setProductId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductTopicsRequest::getLimit, ListProductTopicsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductTopicsRequest::getOffset, ListProductTopicsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForListProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForListProducts() {
        // basic
        HttpRequestDef.Builder<ListProductsRequest, ListProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductsRequest.class, ListProductsResponse.class)
                .withName("ListProducts")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getInstanceId, ListProductsRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getLimit, ListProductsRequest::setLimit));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getAppId, ListProductsRequest::setAppId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getId, ListProductsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getName, ListProductsRequest::setName));
        builder.<String>withRequestField("manufacturer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getManufacturerId, ListProductsRequest::setManufacturerId));
        builder.<String>withRequestField("manufacturer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getManufacturerName, ListProductsRequest::setManufacturerName));
        builder.<String>withRequestField("model",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getModel, ListProductsRequest::setModel));
        builder.<String>withRequestField("device_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getDeviceType, ListProductsRequest::setDeviceType));
        builder.<ListProductsRequest.ProductTypeEnum>withRequestField("product_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProductsRequest.ProductTypeEnum.class),
            f -> f.withMarshaller(ListProductsRequest::getProductType, ListProductsRequest::setProductType));
        builder.<ListProductsRequest.ProtocolTypeEnum>withRequestField("protocol_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProductsRequest.ProtocolTypeEnum.class),
            f -> f.withMarshaller(ListProductsRequest::getProtocolType, ListProductsRequest::setProtocolType));
        builder.<String>withRequestField("created_user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getCreatedUserName, ListProductsRequest::setCreatedUserName));
        builder.<Long>withRequestField("created_date_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProductsRequest::getCreatedDateStart, ListProductsRequest::setCreatedDateStart));
        builder.<Long>withRequestField("created_date_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProductsRequest::getCreatedDateEnd, ListProductsRequest::setCreatedDateEnd));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getOffset, ListProductsRequest::setOffset));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getAppName, ListProductsRequest::setAppName));
        builder.<String>withRequestField("product_serial",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getProductSerial, ListProductsRequest::setProductSerial));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectCofigsV2Request, ListProjectCofigsV2Response> listProjectCofigsV2 =
        genForListProjectCofigsV2();

    private static HttpRequestDef<ListProjectCofigsV2Request, ListProjectCofigsV2Response> genForListProjectCofigsV2() {
        // basic
        HttpRequestDef.Builder<ListProjectCofigsV2Request, ListProjectCofigsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectCofigsV2Request.class, ListProjectCofigsV2Response.class)
                .withName("ListProjectCofigsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/project/configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectCofigsV2Request::getInstanceId,
                ListProjectCofigsV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProjectCofigsV2Request::getOffset, ListProjectCofigsV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectCofigsV2Request::getLimit, ListProjectCofigsV2Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPropertiesRequest, ListPropertiesResponse> listProperties =
        genForListProperties();

    private static HttpRequestDef<ListPropertiesRequest, ListPropertiesResponse> genForListProperties() {
        // basic
        HttpRequestDef.Builder<ListPropertiesRequest, ListPropertiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPropertiesRequest.class, ListPropertiesResponse.class)
                .withName("ListProperties")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/properties")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropertiesRequest::getInstanceId, ListPropertiesRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropertiesRequest::getServiceId, ListPropertiesRequest::setServiceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPropertiesRequest::getLimit, ListPropertiesRequest::setLimit));
        builder.<Integer>withRequestField("property_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPropertiesRequest::getPropertyId, ListPropertiesRequest::setPropertyId));
        builder.<String>withRequestField("property_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropertiesRequest::getPropertyName, ListPropertiesRequest::setPropertyName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPropertiesRequest::getOffset, ListPropertiesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRequestPropertiesRequest, ListRequestPropertiesResponse> listRequestProperties =
        genForListRequestProperties();

    private static HttpRequestDef<ListRequestPropertiesRequest, ListRequestPropertiesResponse> genForListRequestProperties() {
        // basic
        HttpRequestDef.Builder<ListRequestPropertiesRequest, ListRequestPropertiesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRequestPropertiesRequest.class, ListRequestPropertiesResponse.class)
            .withName("ListRequestProperties")
            .withUri(
                "/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/requests")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestPropertiesRequest::getInstanceId,
                ListRequestPropertiesRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestPropertiesRequest::getServiceId,
                ListRequestPropertiesRequest::setServiceId));
        builder.<Integer>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRequestPropertiesRequest::getCommandId,
                ListRequestPropertiesRequest::setCommandId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRequestPropertiesRequest::getLimit, ListRequestPropertiesRequest::setLimit));
        builder.<Integer>withRequestField("request_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRequestPropertiesRequest::getRequestId,
                ListRequestPropertiesRequest::setRequestId));
        builder.<String>withRequestField("request_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestPropertiesRequest::getRequestName,
                ListRequestPropertiesRequest::setRequestName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRequestPropertiesRequest::getOffset, ListRequestPropertiesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2 =
        genForListRequestThrottlingPolicyV2();

    private static HttpRequestDef<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> genForListRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRequestThrottlingPolicyV2Request.class,
                    ListRequestThrottlingPolicyV2Response.class)
                .withName("ListRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getInstanceId,
                ListRequestThrottlingPolicyV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getOffset,
                ListRequestThrottlingPolicyV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getLimit,
                ListRequestThrottlingPolicyV2Request::setLimit));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getId,
                ListRequestThrottlingPolicyV2Request::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getName,
                ListRequestThrottlingPolicyV2Request::setName));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getPreciseSearch,
                ListRequestThrottlingPolicyV2Request::setPreciseSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResponsePropertiesRequest, ListResponsePropertiesResponse> listResponseProperties =
        genForListResponseProperties();

    private static HttpRequestDef<ListResponsePropertiesRequest, ListResponsePropertiesResponse> genForListResponseProperties() {
        // basic
        HttpRequestDef.Builder<ListResponsePropertiesRequest, ListResponsePropertiesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListResponsePropertiesRequest.class, ListResponsePropertiesResponse.class)
            .withName("ListResponseProperties")
            .withUri(
                "/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/responses")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResponsePropertiesRequest::getInstanceId,
                ListResponsePropertiesRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResponsePropertiesRequest::getServiceId,
                ListResponsePropertiesRequest::setServiceId));
        builder.<Integer>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResponsePropertiesRequest::getCommandId,
                ListResponsePropertiesRequest::setCommandId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResponsePropertiesRequest::getLimit, ListResponsePropertiesRequest::setLimit));
        builder.<Integer>withRequestField("response_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResponsePropertiesRequest::getResponseId,
                ListResponsePropertiesRequest::setResponseId));
        builder.<String>withRequestField("response_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResponsePropertiesRequest::getResponseName,
                ListResponsePropertiesRequest::setResponseName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResponsePropertiesRequest::getOffset, ListResponsePropertiesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRulesRequest, ListRulesResponse> listRules = genForListRules();

    private static HttpRequestDef<ListRulesRequest, ListRulesResponse> genForListRules() {
        // basic
        HttpRequestDef.Builder<ListRulesRequest, ListRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRulesRequest.class, ListRulesResponse.class)
                .withName("ListRules")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getInstanceId, ListRulesRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesRequest::getLimit, ListRulesRequest::setLimit));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getAppId, ListRulesRequest::setAppId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getName, ListRulesRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesRequest::getOffset, ListRulesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServicesRequest, ListServicesResponse> listServices = genForListServices();

    private static HttpRequestDef<ListServicesRequest, ListServicesResponse> genForListServices() {
        // basic
        HttpRequestDef.Builder<ListServicesRequest, ListServicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServicesRequest.class, ListServicesResponse.class)
                .withName("ListServices")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesRequest::getInstanceId, ListServicesRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicesRequest::getLimit, ListServicesRequest::setLimit));
        builder.<Integer>withRequestField("service_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicesRequest::getServiceId, ListServicesRequest::setServiceId));
        builder.<String>withRequestField("service_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesRequest::getServiceName, ListServicesRequest::setServiceName));
        builder.<Integer>withRequestField("product_template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicesRequest::getProductTemplateId,
                ListServicesRequest::setProductTemplateId));
        builder.<Integer>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicesRequest::getProductId, ListServicesRequest::setProductId));
        builder.<String>withRequestField("created_user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesRequest::getCreatedUserName, ListServicesRequest::setCreatedUserName));
        builder.<Long>withRequestField("created_date_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListServicesRequest::getCreatedDateStart, ListServicesRequest::setCreatedDateStart));
        builder.<Long>withRequestField("created_date_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListServicesRequest::getCreatedDateEnd, ListServicesRequest::setCreatedDateEnd));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicesRequest::getOffset, ListServicesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListShadowsRequest, ListShadowsResponse> listShadows = genForListShadows();

    private static HttpRequestDef<ListShadowsRequest, ListShadowsResponse> genForListShadows() {
        // basic
        HttpRequestDef.Builder<ListShadowsRequest, ListShadowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListShadowsRequest.class, ListShadowsResponse.class)
                .withName("ListShadows")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}/shadow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShadowsRequest::getInstanceId, ListShadowsRequest::setInstanceId));
        builder.<Integer>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShadowsRequest::getDeviceId, ListShadowsRequest::setDeviceId));

        // response
        builder.<List<ShadowService>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListShadowsResponse::getBody, ListShadowsResponse::setBody)
                .withInnerContainerType(ShadowService.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2 =
        genForListSignatureKeysBindedToApiV2();

    private static HttpRequestDef<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> genForListSignatureKeysBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSignatureKeysBindedToApiV2Request.class,
                    ListSignatureKeysBindedToApiV2Response.class)
                .withName("ListSignatureKeysBindedToApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/sign-bindings/binded-signs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getInstanceId,
                ListSignatureKeysBindedToApiV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getOffset,
                ListSignatureKeysBindedToApiV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getLimit,
                ListSignatureKeysBindedToApiV2Request::setLimit));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getApiId,
                ListSignatureKeysBindedToApiV2Request::setApiId));
        builder.<String>withRequestField("sign_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getSignId,
                ListSignatureKeysBindedToApiV2Request::setSignId));
        builder.<String>withRequestField("sign_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getSignName,
                ListSignatureKeysBindedToApiV2Request::setSignName));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getEnvId,
                ListSignatureKeysBindedToApiV2Request::setEnvId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSignatureKeysV2Request, ListSignatureKeysV2Response> listSignatureKeysV2 =
        genForListSignatureKeysV2();

    private static HttpRequestDef<ListSignatureKeysV2Request, ListSignatureKeysV2Response> genForListSignatureKeysV2() {
        // basic
        HttpRequestDef.Builder<ListSignatureKeysV2Request, ListSignatureKeysV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSignatureKeysV2Request.class, ListSignatureKeysV2Response.class)
                .withName("ListSignatureKeysV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/signs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysV2Request::getInstanceId,
                ListSignatureKeysV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSignatureKeysV2Request::getOffset, ListSignatureKeysV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSignatureKeysV2Request::getLimit, ListSignatureKeysV2Request::setLimit));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysV2Request::getId, ListSignatureKeysV2Request::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysV2Request::getName, ListSignatureKeysV2Request::setName));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysV2Request::getPreciseSearch,
                ListSignatureKeysV2Request::setPreciseSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSourcesRequest, ListSourcesResponse> listSources = genForListSources();

    private static HttpRequestDef<ListSourcesRequest, ListSourcesResponse> genForListSources() {
        // basic
        HttpRequestDef.Builder<ListSourcesRequest, ListSourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSourcesRequest.class, ListSourcesResponse.class)
                .withName("ListSources")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}/sources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSourcesRequest::getInstanceId, ListSourcesRequest::setInstanceId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSourcesRequest::getRuleId, ListSourcesRequest::setRuleId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSourcesRequest::getLimit, ListSourcesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSourcesRequest::getOffset, ListSourcesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2 =
        genForListSpecialThrottlingConfigurationsV2();

    private static HttpRequestDef<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> genForListSpecialThrottlingConfigurationsV2() {
        // basic
        HttpRequestDef.Builder<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSpecialThrottlingConfigurationsV2Request.class,
                    ListSpecialThrottlingConfigurationsV2Response.class)
                .withName("ListSpecialThrottlingConfigurationsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles/{throttle_id}/throttle-specials")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getInstanceId,
                ListSpecialThrottlingConfigurationsV2Request::setInstanceId));
        builder.<String>withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getThrottleId,
                ListSpecialThrottlingConfigurationsV2Request::setThrottleId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getOffset,
                ListSpecialThrottlingConfigurationsV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getLimit,
                ListSpecialThrottlingConfigurationsV2Request::setLimit));
        builder.<String>withRequestField("object_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getObjectType,
                ListSpecialThrottlingConfigurationsV2Request::setObjectType));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getAppName,
                ListSpecialThrottlingConfigurationsV2Request::setAppName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStatisticsApiRequest, ListStatisticsApiResponse> listStatisticsApi =
        genForListStatisticsApi();

    private static HttpRequestDef<ListStatisticsApiRequest, ListStatisticsApiResponse> genForListStatisticsApi() {
        // basic
        HttpRequestDef.Builder<ListStatisticsApiRequest, ListStatisticsApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStatisticsApiRequest.class, ListStatisticsApiResponse.class)
                .withName("ListStatisticsApi")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/statistics/api")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsApiRequest::getInstanceId, ListStatisticsApiRequest::setInstanceId));
        builder.<ListStatisticsApiRequest.ModeEnum>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListStatisticsApiRequest.ModeEnum.class),
            f -> f.withMarshaller(ListStatisticsApiRequest::getMode, ListStatisticsApiRequest::setMode));
        builder.<String>withRequestField("roma_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsApiRequest::getRomaAppId, ListStatisticsApiRequest::setRomaAppId));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsApiRequest::getApiId, ListStatisticsApiRequest::setApiId));
        builder.<ListStatisticsApiRequest.CycleEnum>withRequestField("cycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListStatisticsApiRequest.CycleEnum.class),
            f -> f.withMarshaller(ListStatisticsApiRequest::getCycle, ListStatisticsApiRequest::setCycle));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsApiRequest::getStartTime, ListStatisticsApiRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsApiRequest::getEndTime, ListStatisticsApiRequest::setEndTime));
        builder.<String>withRequestField("duration",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsApiRequest::getDuration, ListStatisticsApiRequest::setDuration));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubsetsRequest, ListSubsetsResponse> listSubsets = genForListSubsets();

    private static HttpRequestDef<ListSubsetsRequest, ListSubsetsResponse> genForListSubsets() {
        // basic
        HttpRequestDef.Builder<ListSubsetsRequest, ListSubsetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubsetsRequest.class, ListSubsetsResponse.class)
                .withName("ListSubsets")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}/subsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubsetsRequest::getInstanceId, ListSubsetsRequest::setInstanceId));
        builder.<Integer>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubsetsRequest::getDeviceId, ListSubsetsRequest::setDeviceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubsetsRequest::getLimit, ListSubsetsRequest::setLimit));
        builder.<String>withRequestField("device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubsetsRequest::getDeviceName, ListSubsetsRequest::setDeviceName));
        builder.<ListSubsetsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSubsetsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListSubsetsRequest::getStatus, ListSubsetsRequest::setStatus));
        builder.<ListSubsetsRequest.OnlineStatusEnum>withRequestField("online_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSubsetsRequest.OnlineStatusEnum.class),
            f -> f.withMarshaller(ListSubsetsRequest::getOnlineStatus, ListSubsetsRequest::setOnlineStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubsetsRequest::getOffset, ListSubsetsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsV2Request, ListTagsV2Response> listTagsV2 = genForListTagsV2();

    private static HttpRequestDef<ListTagsV2Request, ListTagsV2Response> genForListTagsV2() {
        // basic
        HttpRequestDef.Builder<ListTagsV2Request, ListTagsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsV2Request.class, ListTagsV2Response.class)
                .withName("ListTagsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsV2Request::getInstanceId, ListTagsV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTagsV2Request::getOffset, ListTagsV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsV2Request::getLimit, ListTagsV2Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForListTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForListTasks() {
        // basic
        HttpRequestDef.Builder<ListTasksRequest, ListTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksRequest.class, ListTasksResponse.class)
                .withName("ListTasks")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getInstanceId, ListTasksRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getLimit, ListTasksRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getOffset, ListTasksRequest::setOffset));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getTaskId, ListTasksRequest::setTaskId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getName, ListTasksRequest::setName));
        builder.<ListTasksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.StatusEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getStatus, ListTasksRequest::setStatus));
        builder.<ListTasksRequest.TaskTypeEnum>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.TaskTypeEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getTaskType, ListTasksRequest::setTaskType));
        builder.<String>withRequestField("source_datasource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getSourceDatasourceId, ListTasksRequest::setSourceDatasourceId));
        builder.<String>withRequestField("target_datasource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getTargetDatasourceId, ListTasksRequest::setTargetDatasourceId));
        builder.<ListTasksRequest.SortFieldEnum>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.SortFieldEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getSortField, ListTasksRequest::setSortField));
        builder.<ListTasksRequest.SortTypeEnum>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksRequest.SortTypeEnum.class),
            f -> f.withMarshaller(ListTasksRequest::getSortType, ListTasksRequest::setSortType));
        builder.<String>withRequestField("execute_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getExecuteStatus, ListTasksRequest::setExecuteStatus));
        builder.<String>withRequestField("source_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getSourceAppId, ListTasksRequest::setSourceAppId));
        builder.<String>withRequestField("target_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getTargetAppId, ListTasksRequest::setTargetAppId));
        builder.<String>withRequestField("task_tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getTaskTag, ListTasksRequest::setTaskTag));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicsRequest, ListTopicsResponse> listTopics = genForListTopics();

    private static HttpRequestDef<ListTopicsRequest, ListTopicsResponse> genForListTopics() {
        // basic
        HttpRequestDef.Builder<ListTopicsRequest, ListTopicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopicsRequest.class, ListTopicsResponse.class)
                .withName("ListTopics")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}/topics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicsRequest::getInstanceId, ListTopicsRequest::setInstanceId));
        builder.<Integer>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicsRequest::getDeviceId, ListTopicsRequest::setDeviceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicsRequest::getLimit, ListTopicsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicsRequest::getOffset, ListTopicsRequest::setOffset));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicsRequest::getName, ListTopicsRequest::setName));
        builder.<Integer>withRequestField("topic_permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicsRequest::getTopicPermission, ListTopicsRequest::setTopicPermission));
        builder.<Integer>withRequestField("topic_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicsRequest::getTopicType, ListTopicsRequest::setTopicType));
        builder.<Integer>withRequestField("is_private",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicsRequest::getIsPrivate, ListTopicsRequest::setIsPrivate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishLiveDataApiV2Request, PublishLiveDataApiV2Response> publishLiveDataApiV2 =
        genForPublishLiveDataApiV2();

    private static HttpRequestDef<PublishLiveDataApiV2Request, PublishLiveDataApiV2Response> genForPublishLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<PublishLiveDataApiV2Request, PublishLiveDataApiV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, PublishLiveDataApiV2Request.class, PublishLiveDataApiV2Response.class)
            .withName("PublishLiveDataApiV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}/deploy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishLiveDataApiV2Request::getInstanceId,
                PublishLiveDataApiV2Request::setInstanceId));
        builder.<String>withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishLiveDataApiV2Request::getLdApiId, PublishLiveDataApiV2Request::setLdApiId));
        builder.<LdApiDeploy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LdApiDeploy.class),
            f -> f.withMarshaller(PublishLiveDataApiV2Request::getBody, PublishLiveDataApiV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetAuthenticationRequest, ResetAuthenticationResponse> resetAuthentication =
        genForResetAuthentication();

    private static HttpRequestDef<ResetAuthenticationRequest, ResetAuthenticationResponse> genForResetAuthentication() {
        // basic
        HttpRequestDef.Builder<ResetAuthenticationRequest, ResetAuthenticationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetAuthenticationRequest.class, ResetAuthenticationResponse.class)
                .withName("ResetAuthentication")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}/authentication")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetAuthenticationRequest::getInstanceId,
                ResetAuthenticationRequest::setInstanceId));
        builder.<Integer>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ResetAuthenticationRequest::getDeviceId, ResetAuthenticationRequest::setDeviceId));
        builder.<ResetAuthenticationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResetAuthenticationRequestBody.class),
            f -> f.withMarshaller(ResetAuthenticationRequest::getBody, ResetAuthenticationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetMessagesRequest, ResetMessagesResponse> resetMessages =
        genForResetMessages();

    private static HttpRequestDef<ResetMessagesRequest, ResetMessagesResponse> genForResetMessages() {
        // basic
        HttpRequestDef.Builder<ResetMessagesRequest, ResetMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetMessagesRequest.class, ResetMessagesResponse.class)
                .withName("ResetMessages")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}/messages/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetMessagesRequest::getInstanceId, ResetMessagesRequest::setInstanceId));
        builder.<ResetMessagesRequest.ActionIdEnum>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetMessagesRequest.ActionIdEnum.class),
            f -> f.withMarshaller(ResetMessagesRequest::getActionId, ResetMessagesRequest::setActionId));
        builder.<ResetMessagesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetMessagesReq.class),
            f -> f.withMarshaller(ResetMessagesRequest::getBody, ResetMessagesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetMultiTaskOffsetRequest, ResetMultiTaskOffsetResponse> resetMultiTaskOffset =
        genForResetMultiTaskOffset();

    private static HttpRequestDef<ResetMultiTaskOffsetRequest, ResetMultiTaskOffsetResponse> genForResetMultiTaskOffset() {
        // basic
        HttpRequestDef.Builder<ResetMultiTaskOffsetRequest, ResetMultiTaskOffsetResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResetMultiTaskOffsetRequest.class, ResetMultiTaskOffsetResponse.class)
            .withName("ResetMultiTaskOffset")
            .withUri("/v2/{project_id}/fdi/instances/{instance_id}/multi-tasks/{task_id}/reset")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetMultiTaskOffsetRequest::getInstanceId,
                ResetMultiTaskOffsetRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetMultiTaskOffsetRequest::getTaskId, ResetMultiTaskOffsetRequest::setTaskId));
        builder.<MultiTaskResetBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(MultiTaskResetBody.class),
            f -> f.withMarshaller(ResetMultiTaskOffsetRequest::getBody, ResetMultiTaskOffsetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetProductAuthenticationRequest, ResetProductAuthenticationResponse> resetProductAuthentication =
        genForResetProductAuthentication();

    private static HttpRequestDef<ResetProductAuthenticationRequest, ResetProductAuthenticationResponse> genForResetProductAuthentication() {
        // basic
        HttpRequestDef.Builder<ResetProductAuthenticationRequest, ResetProductAuthenticationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ResetProductAuthenticationRequest.class,
                    ResetProductAuthenticationResponse.class)
                .withName("ResetProductAuthentication")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}/authentication")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetProductAuthenticationRequest::getInstanceId,
                ResetProductAuthenticationRequest::setInstanceId));
        builder.<Integer>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ResetProductAuthenticationRequest::getProductId,
                ResetProductAuthenticationRequest::setProductId));
        builder.<ResetProductAuthenticationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResetProductAuthenticationRequestBody.class),
            f -> f.withMarshaller(ResetProductAuthenticationRequest::getBody,
                ResetProductAuthenticationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTaskRequest, RunTaskResponse> runTask = genForRunTask();

    private static HttpRequestDef<RunTaskRequest, RunTaskResponse> genForRunTask() {
        // basic
        HttpRequestDef.Builder<RunTaskRequest, RunTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTaskRequest.class, RunTaskResponse.class)
                .withName("RunTask")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/tasks/{task_id}/run")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunTaskRequest::getInstanceId, RunTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunTaskRequest::getTaskId, RunTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendCommandRequest, SendCommandResponse> sendCommand = genForSendCommand();

    private static HttpRequestDef<SendCommandRequest, SendCommandResponse> genForSendCommand() {
        // basic
        HttpRequestDef.Builder<SendCommandRequest, SendCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendCommandRequest.class, SendCommandResponse.class)
                .withName("SendCommand")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}/send-command")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendCommandRequest::getInstanceId, SendCommandRequest::setInstanceId));
        builder.<Integer>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SendCommandRequest::getDeviceId, SendCommandRequest::setDeviceId));
        builder.<SendCommandRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SendCommandRequestBody.class),
            f -> f.withMarshaller(SendCommandRequest::getBody, SendCommandRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse> showAppBoundAppQuota =
        genForShowAppBoundAppQuota();

    private static HttpRequestDef<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse> genForShowAppBoundAppQuota() {
        // basic
        HttpRequestDef.Builder<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAppBoundAppQuotaRequest.class, ShowAppBoundAppQuotaResponse.class)
            .withName("ShowAppBoundAppQuota")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/bound-quota")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppBoundAppQuotaRequest::getInstanceId,
                ShowAppBoundAppQuotaRequest::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppBoundAppQuotaRequest::getAppId, ShowAppBoundAppQuotaRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppQuotaRequest, ShowAppQuotaResponse> showAppQuota = genForShowAppQuota();

    private static HttpRequestDef<ShowAppQuotaRequest, ShowAppQuotaResponse> genForShowAppQuota() {
        // basic
        HttpRequestDef.Builder<ShowAppQuotaRequest, ShowAppQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppQuotaRequest.class, ShowAppQuotaResponse.class)
                .withName("ShowAppQuota")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas/{app_quota_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppQuotaRequest::getInstanceId, ShowAppQuotaRequest::setInstanceId));
        builder.<String>withRequestField("app_quota_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppQuotaRequest::getAppQuotaId, ShowAppQuotaRequest::setAppQuotaId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuthenticationRequest, ShowAuthenticationResponse> showAuthentication =
        genForShowAuthentication();

    private static HttpRequestDef<ShowAuthenticationRequest, ShowAuthenticationResponse> genForShowAuthentication() {
        // basic
        HttpRequestDef.Builder<ShowAuthenticationRequest, ShowAuthenticationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuthenticationRequest.class, ShowAuthenticationResponse.class)
                .withName("ShowAuthentication")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}/authentication")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuthenticationRequest::getInstanceId, ShowAuthenticationRequest::setInstanceId));
        builder.<Integer>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAuthenticationRequest::getDeviceId, ShowAuthenticationRequest::setDeviceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommandRequest, ShowCommandResponse> showCommand = genForShowCommand();

    private static HttpRequestDef<ShowCommandRequest, ShowCommandResponse> genForShowCommand() {
        // basic
        HttpRequestDef.Builder<ShowCommandRequest, ShowCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCommandRequest.class, ShowCommandResponse.class)
                .withName("ShowCommand")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommandRequest::getInstanceId, ShowCommandRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommandRequest::getServiceId, ShowCommandRequest::setServiceId));
        builder.<Integer>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommandRequest::getCommandId, ShowCommandRequest::setCommandId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataourceDetailRequest, ShowDataourceDetailResponse> showDataourceDetail =
        genForShowDataourceDetail();

    private static HttpRequestDef<ShowDataourceDetailRequest, ShowDataourceDetailResponse> genForShowDataourceDetail() {
        // basic
        HttpRequestDef.Builder<ShowDataourceDetailRequest, ShowDataourceDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataourceDetailRequest.class, ShowDataourceDetailResponse.class)
                .withName("ShowDataourceDetail")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/datasources/{datasource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataourceDetailRequest::getInstanceId,
                ShowDataourceDetailRequest::setInstanceId));
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataourceDetailRequest::getDatasourceId,
                ShowDataourceDetailRequest::setDatasourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse> showDetailsOfAppAcl =
        genForShowDetailsOfAppAcl();

    private static HttpRequestDef<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse> genForShowDetailsOfAppAcl() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfAppAclRequest.class, ShowDetailsOfAppAclResponse.class)
                .withName("ShowDetailsOfAppAcl")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-acl")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppAclRequest::getInstanceId,
                ShowDetailsOfAppAclRequest::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppAclRequest::getAppId, ShowDetailsOfAppAclRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> showDetailsOfAppCodeV2 =
        genForShowDetailsOfAppCodeV2();

    private static HttpRequestDef<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> genForShowDetailsOfAppCodeV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDetailsOfAppCodeV2Request.class, ShowDetailsOfAppCodeV2Response.class)
            .withName("ShowDetailsOfAppCodeV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-codes/{app_code_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppCodeV2Request::getInstanceId,
                ShowDetailsOfAppCodeV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppCodeV2Request::getAppId, ShowDetailsOfAppCodeV2Request::setAppId));
        builder.<String>withRequestField("app_code_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppCodeV2Request::getAppCodeId,
                ShowDetailsOfAppCodeV2Request::setAppCodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfAppConfigV2Request, ShowDetailsOfAppConfigV2Response> showDetailsOfAppConfigV2 =
        genForShowDetailsOfAppConfigV2();

    private static HttpRequestDef<ShowDetailsOfAppConfigV2Request, ShowDetailsOfAppConfigV2Response> genForShowDetailsOfAppConfigV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAppConfigV2Request, ShowDetailsOfAppConfigV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDetailsOfAppConfigV2Request.class, ShowDetailsOfAppConfigV2Response.class)
                .withName("ShowDetailsOfAppConfigV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/configs/{app_config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppConfigV2Request::getInstanceId,
                ShowDetailsOfAppConfigV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppConfigV2Request::getAppId,
                ShowDetailsOfAppConfigV2Request::setAppId));
        builder.<String>withRequestField("app_config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppConfigV2Request::getAppConfigId,
                ShowDetailsOfAppConfigV2Request::setAppConfigId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> showDetailsOfAppV2 =
        genForShowDetailsOfAppV2();

    private static HttpRequestDef<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> genForShowDetailsOfAppV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfAppV2Request.class, ShowDetailsOfAppV2Response.class)
                .withName("ShowDetailsOfAppV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppV2Request::getInstanceId, ShowDetailsOfAppV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppV2Request::getAppId, ShowDetailsOfAppV2Request::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> showDetailsOfCustomAuthorizersV2 =
        genForShowDetailsOfCustomAuthorizersV2();

    private static HttpRequestDef<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> genForShowDetailsOfCustomAuthorizersV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfCustomAuthorizersV2Request.class,
                    ShowDetailsOfCustomAuthorizersV2Response.class)
                .withName("ShowDetailsOfCustomAuthorizersV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/authorizers/{authorizer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfCustomAuthorizersV2Request::getInstanceId,
                ShowDetailsOfCustomAuthorizersV2Request::setInstanceId));
        builder.<String>withRequestField("authorizer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfCustomAuthorizersV2Request::getAuthorizerId,
                ShowDetailsOfCustomAuthorizersV2Request::setAuthorizerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2 =
        genForShowDetailsOfDomainNameCertificateV2();

    private static HttpRequestDef<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> genForShowDetailsOfDomainNameCertificateV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfDomainNameCertificateV2Request.class,
                    ShowDetailsOfDomainNameCertificateV2Response.class)
                .withName("ShowDetailsOfDomainNameCertificateV2")
                .withUri(
                    "/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getInstanceId,
                ShowDetailsOfDomainNameCertificateV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getGroupId,
                ShowDetailsOfDomainNameCertificateV2Request::setGroupId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getDomainId,
                ShowDetailsOfDomainNameCertificateV2Request::setDomainId));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getCertificateId,
                ShowDetailsOfDomainNameCertificateV2Request::setCertificateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2 =
        genForShowDetailsOfEnvironmentVariableV2();

    private static HttpRequestDef<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> genForShowDetailsOfEnvironmentVariableV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfEnvironmentVariableV2Request.class,
                    ShowDetailsOfEnvironmentVariableV2Response.class)
                .withName("ShowDetailsOfEnvironmentVariableV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/env-variables/{env_variable_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfEnvironmentVariableV2Request::getInstanceId,
                ShowDetailsOfEnvironmentVariableV2Request::setInstanceId));
        builder.<String>withRequestField("env_variable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfEnvironmentVariableV2Request::getEnvVariableId,
                ShowDetailsOfEnvironmentVariableV2Request::setEnvVariableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> showDetailsOfInstanceV2 =
        genForShowDetailsOfInstanceV2();

    private static HttpRequestDef<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> genForShowDetailsOfInstanceV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDetailsOfInstanceV2Request.class, ShowDetailsOfInstanceV2Response.class)
            .withName("ShowDetailsOfInstanceV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfInstanceV2Request::getInstanceId,
                ShowDetailsOfInstanceV2Request::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2 =
        genForShowDetailsOfRequestThrottlingPolicyV2();

    private static HttpRequestDef<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> genForShowDetailsOfRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfRequestThrottlingPolicyV2Request.class,
                    ShowDetailsOfRequestThrottlingPolicyV2Response.class)
                .withName("ShowDetailsOfRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles/{throttle_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfRequestThrottlingPolicyV2Request::getInstanceId,
                ShowDetailsOfRequestThrottlingPolicyV2Request::setInstanceId));
        builder.<String>withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfRequestThrottlingPolicyV2Request::getThrottleId,
                ShowDetailsOfRequestThrottlingPolicyV2Request::setThrottleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceRequest, ShowDeviceResponse> showDevice = genForShowDevice();

    private static HttpRequestDef<ShowDeviceRequest, ShowDeviceResponse> genForShowDevice() {
        // basic
        HttpRequestDef.Builder<ShowDeviceRequest, ShowDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceRequest.class, ShowDeviceResponse.class)
                .withName("ShowDevice")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceRequest::getInstanceId, ShowDeviceRequest::setInstanceId));
        builder.<Integer>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDeviceRequest::getDeviceId, ShowDeviceRequest::setDeviceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceGroupRequest, ShowDeviceGroupResponse> showDeviceGroup =
        genForShowDeviceGroup();

    private static HttpRequestDef<ShowDeviceGroupRequest, ShowDeviceGroupResponse> genForShowDeviceGroup() {
        // basic
        HttpRequestDef.Builder<ShowDeviceGroupRequest, ShowDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceGroupRequest.class, ShowDeviceGroupResponse.class)
                .withName("ShowDeviceGroup")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceGroupRequest::getInstanceId, ShowDeviceGroupRequest::setInstanceId));
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDeviceGroupRequest::getGroupId, ShowDeviceGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceGroupTreeRequest, ShowDeviceGroupTreeResponse> showDeviceGroupTree =
        genForShowDeviceGroupTree();

    private static HttpRequestDef<ShowDeviceGroupTreeRequest, ShowDeviceGroupTreeResponse> genForShowDeviceGroupTree() {
        // basic
        HttpRequestDef.Builder<ShowDeviceGroupTreeRequest, ShowDeviceGroupTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceGroupTreeRequest.class, ShowDeviceGroupTreeResponse.class)
                .withName("ShowDeviceGroupTree")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceGroupTreeRequest::getInstanceId,
                ShowDeviceGroupTreeRequest::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceGroupTreeRequest::getAppId, ShowDeviceGroupTreeRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> showDevicesInGroup =
        genForShowDevicesInGroup();

    private static HttpRequestDef<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> genForShowDevicesInGroup() {
        // basic
        HttpRequestDef.Builder<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDevicesInGroupRequest.class, ShowDevicesInGroupResponse.class)
                .withName("ShowDevicesInGroup")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups/{group_id}/devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getInstanceId, ShowDevicesInGroupRequest::setInstanceId));
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getGroupId, ShowDevicesInGroupRequest::setGroupId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getLimit, ShowDevicesInGroupRequest::setLimit));
        builder.<String>withRequestField("product_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getProductName,
                ShowDevicesInGroupRequest::setProductName));
        builder.<String>withRequestField("device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getDeviceName, ShowDevicesInGroupRequest::setDeviceName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getOffset, ShowDevicesInGroupRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDispatchesRequest, ShowDispatchesResponse> showDispatches =
        genForShowDispatches();

    private static HttpRequestDef<ShowDispatchesRequest, ShowDispatchesResponse> genForShowDispatches() {
        // basic
        HttpRequestDef.Builder<ShowDispatchesRequest, ShowDispatchesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDispatchesRequest.class, ShowDispatchesResponse.class)
                .withName("ShowDispatches")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/tasks/{task_id}/dispatches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDispatchesRequest::getInstanceId, ShowDispatchesRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDispatchesRequest::getTaskId, ShowDispatchesRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLiveDataApiV2Request, ShowLiveDataApiV2Response> showLiveDataApiV2 =
        genForShowLiveDataApiV2();

    private static HttpRequestDef<ShowLiveDataApiV2Request, ShowLiveDataApiV2Response> genForShowLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<ShowLiveDataApiV2Request, ShowLiveDataApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLiveDataApiV2Request.class, ShowLiveDataApiV2Response.class)
                .withName("ShowLiveDataApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLiveDataApiV2Request::getInstanceId, ShowLiveDataApiV2Request::setInstanceId));
        builder.<String>withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLiveDataApiV2Request::getLdApiId, ShowLiveDataApiV2Request::setLdApiId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMqsInstanceMessagesRequest, ShowMqsInstanceMessagesResponse> showMqsInstanceMessages =
        genForShowMqsInstanceMessages();

    private static HttpRequestDef<ShowMqsInstanceMessagesRequest, ShowMqsInstanceMessagesResponse> genForShowMqsInstanceMessages() {
        // basic
        HttpRequestDef.Builder<ShowMqsInstanceMessagesRequest, ShowMqsInstanceMessagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMqsInstanceMessagesRequest.class, ShowMqsInstanceMessagesResponse.class)
            .withName("ShowMqsInstanceMessages")
            .withUri("/v2/{project_id}/mqs/instances/{instance_id}/messages")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getInstanceId,
                ShowMqsInstanceMessagesRequest::setInstanceId));
        builder.<String>withRequestField("topic",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getTopic, ShowMqsInstanceMessagesRequest::setTopic));
        builder.<Boolean>withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getAsc, ShowMqsInstanceMessagesRequest::setAsc));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getStartTime,
                ShowMqsInstanceMessagesRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getEndTime,
                ShowMqsInstanceMessagesRequest::setEndTime));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getLimit, ShowMqsInstanceMessagesRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getOffset,
                ShowMqsInstanceMessagesRequest::setOffset));
        builder.<Boolean>withRequestField("download",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getDownload,
                ShowMqsInstanceMessagesRequest::setDownload));
        builder.<String>withRequestField("message_offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getMessageOffset,
                ShowMqsInstanceMessagesRequest::setMessageOffset));
        builder.<String>withRequestField("partition",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getPartition,
                ShowMqsInstanceMessagesRequest::setPartition));
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getKey, ShowMqsInstanceMessagesRequest::setKey));
        builder.<String>withRequestField("message_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getMessageId,
                ShowMqsInstanceMessagesRequest::setMessageId));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getTag, ShowMqsInstanceMessagesRequest::setTag));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMqsInstanceTopicAccessPolicyRequest, ShowMqsInstanceTopicAccessPolicyResponse> showMqsInstanceTopicAccessPolicy =
        genForShowMqsInstanceTopicAccessPolicy();

    private static HttpRequestDef<ShowMqsInstanceTopicAccessPolicyRequest, ShowMqsInstanceTopicAccessPolicyResponse> genForShowMqsInstanceTopicAccessPolicy() {
        // basic
        HttpRequestDef.Builder<ShowMqsInstanceTopicAccessPolicyRequest, ShowMqsInstanceTopicAccessPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowMqsInstanceTopicAccessPolicyRequest.class,
                    ShowMqsInstanceTopicAccessPolicyResponse.class)
                .withName("ShowMqsInstanceTopicAccessPolicy")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics/{topic_name}/accesspolicy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceTopicAccessPolicyRequest::getInstanceId,
                ShowMqsInstanceTopicAccessPolicyRequest::setInstanceId));
        builder.<String>withRequestField("topic_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceTopicAccessPolicyRequest::getTopicName,
                ShowMqsInstanceTopicAccessPolicyRequest::setTopicName));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceTopicAccessPolicyRequest::getOffset,
                ShowMqsInstanceTopicAccessPolicyRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceTopicAccessPolicyRequest::getLimit,
                ShowMqsInstanceTopicAccessPolicyRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPluginRequest, ShowPluginResponse> showPlugin = genForShowPlugin();

    private static HttpRequestDef<ShowPluginRequest, ShowPluginResponse> genForShowPlugin() {
        // basic
        HttpRequestDef.Builder<ShowPluginRequest, ShowPluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPluginRequest.class, ShowPluginResponse.class)
                .withName("ShowPlugin")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/plugins/{plugin_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPluginRequest::getInstanceId, ShowPluginRequest::setInstanceId));
        builder.<String>withRequestField("plugin_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPluginRequest::getPluginId, ShowPluginRequest::setPluginId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProductRequest, ShowProductResponse> showProduct = genForShowProduct();

    private static HttpRequestDef<ShowProductRequest, ShowProductResponse> genForShowProduct() {
        // basic
        HttpRequestDef.Builder<ShowProductRequest, ShowProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProductRequest.class, ShowProductResponse.class)
                .withName("ShowProduct")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductRequest::getInstanceId, ShowProductRequest::setInstanceId));
        builder.<Integer>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProductRequest::getProductId, ShowProductRequest::setProductId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProductAuthenticationRequest, ShowProductAuthenticationResponse> showProductAuthentication =
        genForShowProductAuthentication();

    private static HttpRequestDef<ShowProductAuthenticationRequest, ShowProductAuthenticationResponse> genForShowProductAuthentication() {
        // basic
        HttpRequestDef.Builder<ShowProductAuthenticationRequest, ShowProductAuthenticationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowProductAuthenticationRequest.class,
                    ShowProductAuthenticationResponse.class)
                .withName("ShowProductAuthentication")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}/authentication")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductAuthenticationRequest::getInstanceId,
                ShowProductAuthenticationRequest::setInstanceId));
        builder.<Integer>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProductAuthenticationRequest::getProductId,
                ShowProductAuthenticationRequest::setProductId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProductTemplateRequest, ShowProductTemplateResponse> showProductTemplate =
        genForShowProductTemplate();

    private static HttpRequestDef<ShowProductTemplateRequest, ShowProductTemplateResponse> genForShowProductTemplate() {
        // basic
        HttpRequestDef.Builder<ShowProductTemplateRequest, ShowProductTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProductTemplateRequest.class, ShowProductTemplateResponse.class)
                .withName("ShowProductTemplate")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/product-templates/{product_template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductTemplateRequest::getInstanceId,
                ShowProductTemplateRequest::setInstanceId));
        builder.<Integer>withRequestField("product_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProductTemplateRequest::getProductTemplateId,
                ShowProductTemplateRequest::setProductTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPropertyRequest, ShowPropertyResponse> showProperty = genForShowProperty();

    private static HttpRequestDef<ShowPropertyRequest, ShowPropertyResponse> genForShowProperty() {
        // basic
        HttpRequestDef.Builder<ShowPropertyRequest, ShowPropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPropertyRequest.class, ShowPropertyResponse.class)
                .withName("ShowProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/properties/{property_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPropertyRequest::getInstanceId, ShowPropertyRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPropertyRequest::getServiceId, ShowPropertyRequest::setServiceId));
        builder.<Integer>withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPropertyRequest::getPropertyId, ShowPropertyRequest::setPropertyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRequestPropertyRequest, ShowRequestPropertyResponse> showRequestProperty =
        genForShowRequestProperty();

    private static HttpRequestDef<ShowRequestPropertyRequest, ShowRequestPropertyResponse> genForShowRequestProperty() {
        // basic
        HttpRequestDef.Builder<ShowRequestPropertyRequest, ShowRequestPropertyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRequestPropertyRequest.class, ShowRequestPropertyResponse.class)
            .withName("ShowRequestProperty")
            .withUri(
                "/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/requests/{property_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRequestPropertyRequest::getInstanceId,
                ShowRequestPropertyRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRequestPropertyRequest::getServiceId, ShowRequestPropertyRequest::setServiceId));
        builder.<Integer>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRequestPropertyRequest::getCommandId, ShowRequestPropertyRequest::setCommandId));
        builder.<Integer>withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRequestPropertyRequest::getPropertyId,
                ShowRequestPropertyRequest::setPropertyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResponsePropertyRequest, ShowResponsePropertyResponse> showResponseProperty =
        genForShowResponseProperty();

    private static HttpRequestDef<ShowResponsePropertyRequest, ShowResponsePropertyResponse> genForShowResponseProperty() {
        // basic
        HttpRequestDef.Builder<ShowResponsePropertyRequest, ShowResponsePropertyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowResponsePropertyRequest.class, ShowResponsePropertyResponse.class)
            .withName("ShowResponseProperty")
            .withUri(
                "/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/responses/{property_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResponsePropertyRequest::getInstanceId,
                ShowResponsePropertyRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResponsePropertyRequest::getServiceId,
                ShowResponsePropertyRequest::setServiceId));
        builder.<Integer>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResponsePropertyRequest::getCommandId,
                ShowResponsePropertyRequest::setCommandId));
        builder.<Integer>withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowResponsePropertyRequest::getPropertyId,
                ShowResponsePropertyRequest::setPropertyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRestrictionOfInstanceV2Request, ShowRestrictionOfInstanceV2Response> showRestrictionOfInstanceV2 =
        genForShowRestrictionOfInstanceV2();

    private static HttpRequestDef<ShowRestrictionOfInstanceV2Request, ShowRestrictionOfInstanceV2Response> genForShowRestrictionOfInstanceV2() {
        // basic
        HttpRequestDef.Builder<ShowRestrictionOfInstanceV2Request, ShowRestrictionOfInstanceV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRestrictionOfInstanceV2Request.class,
                    ShowRestrictionOfInstanceV2Response.class)
                .withName("ShowRestrictionOfInstanceV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/restriction")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRestrictionOfInstanceV2Request::getInstanceId,
                ShowRestrictionOfInstanceV2Request::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuleRequest, ShowRuleResponse> showRule = genForShowRule();

    private static HttpRequestDef<ShowRuleRequest, ShowRuleResponse> genForShowRule() {
        // basic
        HttpRequestDef.Builder<ShowRuleRequest, ShowRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRuleRequest.class, ShowRuleResponse.class)
                .withName("ShowRule")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleRequest::getInstanceId, ShowRuleRequest::setInstanceId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleRequest::getRuleId, ShowRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServiceRequest, ShowServiceResponse> showService = genForShowService();

    private static HttpRequestDef<ShowServiceRequest, ShowServiceResponse> genForShowService() {
        // basic
        HttpRequestDef.Builder<ShowServiceRequest, ShowServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServiceRequest.class, ShowServiceResponse.class)
                .withName("ShowService")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServiceRequest::getInstanceId, ShowServiceRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServiceRequest::getServiceId, ShowServiceRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRequest, ShowTaskResponse> showTask = genForShowTask();

    private static HttpRequestDef<ShowTaskRequest, ShowTaskResponse> genForShowTask() {
        // basic
        HttpRequestDef.Builder<ShowTaskRequest, ShowTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskRequest.class, ShowTaskResponse.class)
                .withName("ShowTask")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getInstanceId, ShowTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, ShowTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartTestDatasourceRequest, StartTestDatasourceResponse> startTestDatasource =
        genForStartTestDatasource();

    private static HttpRequestDef<StartTestDatasourceRequest, StartTestDatasourceResponse> genForStartTestDatasource() {
        // basic
        HttpRequestDef.Builder<StartTestDatasourceRequest, StartTestDatasourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartTestDatasourceRequest.class, StartTestDatasourceResponse.class)
                .withName("StartTestDatasource")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/datasources/{datasource_id}/test-connect")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartTestDatasourceRequest::getInstanceId,
                StartTestDatasourceRequest::setInstanceId));
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartTestDatasourceRequest::getDatasourceId,
                StartTestDatasourceRequest::setDatasourceId));
        builder.<DatasourceInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatasourceInfo.class),
            f -> f.withMarshaller(StartTestDatasourceRequest::getBody, StartTestDatasourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopTaskRequest, StopTaskResponse> stopTask = genForStopTask();

    private static HttpRequestDef<StopTaskRequest, StopTaskResponse> genForStopTask() {
        // basic
        HttpRequestDef.Builder<StopTaskRequest, StopTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopTaskRequest.class, StopTaskResponse.class)
                .withName("StopTask")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/tasks/{task_id}/terminate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopTaskRequest::getInstanceId, StopTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopTaskRequest::getTaskId, StopTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnpublishLiveDataApiV2Request, UnpublishLiveDataApiV2Response> unpublishLiveDataApiV2 =
        genForUnpublishLiveDataApiV2();

    private static HttpRequestDef<UnpublishLiveDataApiV2Request, UnpublishLiveDataApiV2Response> genForUnpublishLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<UnpublishLiveDataApiV2Request, UnpublishLiveDataApiV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, UnpublishLiveDataApiV2Request.class, UnpublishLiveDataApiV2Response.class)
            .withName("UnpublishLiveDataApiV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}/undeploy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnpublishLiveDataApiV2Request::getInstanceId,
                UnpublishLiveDataApiV2Request::setInstanceId));
        builder.<String>withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnpublishLiveDataApiV2Request::getLdApiId,
                UnpublishLiveDataApiV2Request::setLdApiId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppAclRequest, UpdateAppAclResponse> updateAppAcl = genForUpdateAppAcl();

    private static HttpRequestDef<UpdateAppAclRequest, UpdateAppAclResponse> genForUpdateAppAcl() {
        // basic
        HttpRequestDef.Builder<UpdateAppAclRequest, UpdateAppAclResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppAclRequest.class, UpdateAppAclResponse.class)
                .withName("UpdateAppAcl")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-acl")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppAclRequest::getInstanceId, UpdateAppAclRequest::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppAclRequest::getAppId, UpdateAppAclRequest::setAppId));
        builder.<AppAclCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppAclCreate.class),
            f -> f.withMarshaller(UpdateAppAclRequest::getBody, UpdateAppAclRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppConfigV2Request, UpdateAppConfigV2Response> updateAppConfigV2 =
        genForUpdateAppConfigV2();

    private static HttpRequestDef<UpdateAppConfigV2Request, UpdateAppConfigV2Response> genForUpdateAppConfigV2() {
        // basic
        HttpRequestDef.Builder<UpdateAppConfigV2Request, UpdateAppConfigV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppConfigV2Request.class, UpdateAppConfigV2Response.class)
                .withName("UpdateAppConfigV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/configs/{app_config_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppConfigV2Request::getInstanceId, UpdateAppConfigV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppConfigV2Request::getAppId, UpdateAppConfigV2Request::setAppId));
        builder.<String>withRequestField("app_config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppConfigV2Request::getAppConfigId, UpdateAppConfigV2Request::setAppConfigId));
        builder.<AppConfigModifyRequestV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppConfigModifyRequestV2.class),
            f -> f.withMarshaller(UpdateAppConfigV2Request::getBody, UpdateAppConfigV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppQuotaRequest, UpdateAppQuotaResponse> updateAppQuota =
        genForUpdateAppQuota();

    private static HttpRequestDef<UpdateAppQuotaRequest, UpdateAppQuotaResponse> genForUpdateAppQuota() {
        // basic
        HttpRequestDef.Builder<UpdateAppQuotaRequest, UpdateAppQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppQuotaRequest.class, UpdateAppQuotaResponse.class)
                .withName("UpdateAppQuota")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas/{app_quota_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppQuotaRequest::getInstanceId, UpdateAppQuotaRequest::setInstanceId));
        builder.<String>withRequestField("app_quota_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppQuotaRequest::getAppQuotaId, UpdateAppQuotaRequest::setAppQuotaId));
        builder.<AppQuotaCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppQuotaCreate.class),
            f -> f.withMarshaller(UpdateAppQuotaRequest::getBody, UpdateAppQuotaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCommandRequest, UpdateCommandResponse> updateCommand =
        genForUpdateCommand();

    private static HttpRequestDef<UpdateCommandRequest, UpdateCommandResponse> genForUpdateCommand() {
        // basic
        HttpRequestDef.Builder<UpdateCommandRequest, UpdateCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCommandRequest.class, UpdateCommandResponse.class)
                .withName("UpdateCommand")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCommandRequest::getInstanceId, UpdateCommandRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCommandRequest::getServiceId, UpdateCommandRequest::setServiceId));
        builder.<Integer>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateCommandRequest::getCommandId, UpdateCommandRequest::setCommandId));
        builder.<UpdateCommandRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCommandRequestBody.class),
            f -> f.withMarshaller(UpdateCommandRequest::getBody, UpdateCommandRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> updateCustomAuthorizerV2 =
        genForUpdateCustomAuthorizerV2();

    private static HttpRequestDef<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> genForUpdateCustomAuthorizerV2() {
        // basic
        HttpRequestDef.Builder<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateCustomAuthorizerV2Request.class, UpdateCustomAuthorizerV2Response.class)
                .withName("UpdateCustomAuthorizerV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/authorizers/{authorizer_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomAuthorizerV2Request::getInstanceId,
                UpdateCustomAuthorizerV2Request::setInstanceId));
        builder.<String>withRequestField("authorizer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomAuthorizerV2Request::getAuthorizerId,
                UpdateCustomAuthorizerV2Request::setAuthorizerId));
        builder.<AuthorizerCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizerCreate.class),
            f -> f.withMarshaller(UpdateCustomAuthorizerV2Request::getBody, UpdateCustomAuthorizerV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatasourceInfoRequest, UpdateDatasourceInfoResponse> updateDatasourceInfo =
        genForUpdateDatasourceInfo();

    private static HttpRequestDef<UpdateDatasourceInfoRequest, UpdateDatasourceInfoResponse> genForUpdateDatasourceInfo() {
        // basic
        HttpRequestDef.Builder<UpdateDatasourceInfoRequest, UpdateDatasourceInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDatasourceInfoRequest.class, UpdateDatasourceInfoResponse.class)
            .withName("UpdateDatasourceInfo")
            .withUri("/v2/{project_id}/fdi/instances/{instance_id}/datasources/{datasource_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatasourceInfoRequest::getInstanceId,
                UpdateDatasourceInfoRequest::setInstanceId));
        builder.<String>withRequestField("datasource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatasourceInfoRequest::getDatasourceId,
                UpdateDatasourceInfoRequest::setDatasourceId));
        builder.<DatasourceInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatasourceInfo.class),
            f -> f.withMarshaller(UpdateDatasourceInfoRequest::getBody, UpdateDatasourceInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> updateDevice = genForUpdateDevice();

    private static HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> genForUpdateDevice() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceRequest, UpdateDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceRequest.class, UpdateDeviceResponse.class)
                .withName("UpdateDevice")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getInstanceId, UpdateDeviceRequest::setInstanceId));
        builder.<Integer>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getDeviceId, UpdateDeviceRequest::setDeviceId));
        builder.<UpdateDeviceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDeviceRequestBody.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getBody, UpdateDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> updateDeviceGroup =
        genForUpdateDeviceGroup();

    private static HttpRequestDef<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> genForUpdateDeviceGroup() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceGroupRequest.class, UpdateDeviceGroupResponse.class)
                .withName("UpdateDeviceGroup")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups/{group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getInstanceId, UpdateDeviceGroupRequest::setInstanceId));
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getGroupId, UpdateDeviceGroupRequest::setGroupId));
        builder.<UpdateDeviceGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDeviceGroupRequestBody.class),
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getBody, UpdateDeviceGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDispatchesRequest, UpdateDispatchesResponse> updateDispatches =
        genForUpdateDispatches();

    private static HttpRequestDef<UpdateDispatchesRequest, UpdateDispatchesResponse> genForUpdateDispatches() {
        // basic
        HttpRequestDef.Builder<UpdateDispatchesRequest, UpdateDispatchesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDispatchesRequest.class, UpdateDispatchesResponse.class)
                .withName("UpdateDispatches")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/tasks/{task_id}/dispatches/{dispatch_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDispatchesRequest::getInstanceId, UpdateDispatchesRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDispatchesRequest::getTaskId, UpdateDispatchesRequest::setTaskId));
        builder.<String>withRequestField("dispatch_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDispatchesRequest::getDispatchId, UpdateDispatchesRequest::setDispatchId));
        builder.<TaskDispatch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaskDispatch.class),
            f -> f.withMarshaller(UpdateDispatchesRequest::getBody, UpdateDispatchesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainV2Request, UpdateDomainV2Response> updateDomainV2 =
        genForUpdateDomainV2();

    private static HttpRequestDef<UpdateDomainV2Request, UpdateDomainV2Response> genForUpdateDomainV2() {
        // basic
        HttpRequestDef.Builder<UpdateDomainV2Request, UpdateDomainV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainV2Request.class, UpdateDomainV2Response.class)
                .withName("UpdateDomainV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainV2Request::getInstanceId, UpdateDomainV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainV2Request::getGroupId, UpdateDomainV2Request::setGroupId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainV2Request::getDomainId, UpdateDomainV2Request::setDomainId));
        builder.<UrlDomainModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UrlDomainModify.class),
            f -> f.withMarshaller(UpdateDomainV2Request::getBody, UpdateDomainV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> updateEnvironmentV2 =
        genForUpdateEnvironmentV2();

    private static HttpRequestDef<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> genForUpdateEnvironmentV2() {
        // basic
        HttpRequestDef.Builder<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEnvironmentV2Request.class, UpdateEnvironmentV2Response.class)
                .withName("UpdateEnvironmentV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/envs/{env_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEnvironmentV2Request::getInstanceId,
                UpdateEnvironmentV2Request::setInstanceId));
        builder.<String>withRequestField("env_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEnvironmentV2Request::getEnvId, UpdateEnvironmentV2Request::setEnvId));
        builder.<EnvCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvCreate.class),
            f -> f.withMarshaller(UpdateEnvironmentV2Request::getBody, UpdateEnvironmentV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response> updateEnvironmentVariableV2 =
        genForUpdateEnvironmentVariableV2();

    private static HttpRequestDef<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response> genForUpdateEnvironmentVariableV2() {
        // basic
        HttpRequestDef.Builder<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateEnvironmentVariableV2Request.class,
                    UpdateEnvironmentVariableV2Response.class)
                .withName("UpdateEnvironmentVariableV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/env-variables/{env_variable_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEnvironmentVariableV2Request::getInstanceId,
                UpdateEnvironmentVariableV2Request::setInstanceId));
        builder.<String>withRequestField("env_variable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEnvironmentVariableV2Request::getEnvVariableId,
                UpdateEnvironmentVariableV2Request::setEnvVariableId));
        builder.<EnvVariableBase>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvVariableBase.class),
            f -> f.withMarshaller(UpdateEnvironmentVariableV2Request::getBody,
                UpdateEnvironmentVariableV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLiveDataApiV2Request, UpdateLiveDataApiV2Response> updateLiveDataApiV2 =
        genForUpdateLiveDataApiV2();

    private static HttpRequestDef<UpdateLiveDataApiV2Request, UpdateLiveDataApiV2Response> genForUpdateLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<UpdateLiveDataApiV2Request, UpdateLiveDataApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLiveDataApiV2Request.class, UpdateLiveDataApiV2Response.class)
                .withName("UpdateLiveDataApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLiveDataApiV2Request::getInstanceId,
                UpdateLiveDataApiV2Request::setInstanceId));
        builder.<String>withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLiveDataApiV2Request::getLdApiId, UpdateLiveDataApiV2Request::setLdApiId));
        builder.<LdApiCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LdApiCreate.class),
            f -> f.withMarshaller(UpdateLiveDataApiV2Request::getBody, UpdateLiveDataApiV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMqsInstanceTopicRequest, UpdateMqsInstanceTopicResponse> updateMqsInstanceTopic =
        genForUpdateMqsInstanceTopic();

    private static HttpRequestDef<UpdateMqsInstanceTopicRequest, UpdateMqsInstanceTopicResponse> genForUpdateMqsInstanceTopic() {
        // basic
        HttpRequestDef.Builder<UpdateMqsInstanceTopicRequest, UpdateMqsInstanceTopicResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateMqsInstanceTopicRequest.class, UpdateMqsInstanceTopicResponse.class)
            .withName("UpdateMqsInstanceTopic")
            .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMqsInstanceTopicRequest::getInstanceId,
                UpdateMqsInstanceTopicRequest::setInstanceId));
        builder.<UpdateMqsInstanceTopicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMqsInstanceTopicReq.class),
            f -> f.withMarshaller(UpdateMqsInstanceTopicRequest::getBody, UpdateMqsInstanceTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMultiTasksRequest, UpdateMultiTasksResponse> updateMultiTasks =
        genForUpdateMultiTasks();

    private static HttpRequestDef<UpdateMultiTasksRequest, UpdateMultiTasksResponse> genForUpdateMultiTasks() {
        // basic
        HttpRequestDef.Builder<UpdateMultiTasksRequest, UpdateMultiTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMultiTasksRequest.class, UpdateMultiTasksResponse.class)
                .withName("UpdateMultiTasks")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/multi-tasks/{task_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMultiTasksRequest::getInstanceId, UpdateMultiTasksRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMultiTasksRequest::getTaskId, UpdateMultiTasksRequest::setTaskId));
        builder.<MultiTaskUpdateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MultiTaskUpdateBody.class),
            f -> f.withMarshaller(UpdateMultiTasksRequest::getBody, UpdateMultiTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNotificationRequest, UpdateNotificationResponse> updateNotification =
        genForUpdateNotification();

    private static HttpRequestDef<UpdateNotificationRequest, UpdateNotificationResponse> genForUpdateNotification() {
        // basic
        HttpRequestDef.Builder<UpdateNotificationRequest, UpdateNotificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNotificationRequest.class, UpdateNotificationResponse.class)
                .withName("UpdateNotification")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/notifications/{notification_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNotificationRequest::getInstanceId, UpdateNotificationRequest::setInstanceId));
        builder.<Long>withRequestField("notification_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(UpdateNotificationRequest::getNotificationId,
                UpdateNotificationRequest::setNotificationId));
        builder.<UpdateNotificationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNotificationRequestBody.class),
            f -> f.withMarshaller(UpdateNotificationRequest::getBody, UpdateNotificationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePluginRequest, UpdatePluginResponse> updatePlugin = genForUpdatePlugin();

    private static HttpRequestDef<UpdatePluginRequest, UpdatePluginResponse> genForUpdatePlugin() {
        // basic
        HttpRequestDef.Builder<UpdatePluginRequest, UpdatePluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePluginRequest.class, UpdatePluginResponse.class)
                .withName("UpdatePlugin")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/plugins/{plugin_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePluginRequest::getInstanceId, UpdatePluginRequest::setInstanceId));
        builder.<String>withRequestField("plugin_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePluginRequest::getPluginId, UpdatePluginRequest::setPluginId));
        builder.<PluginCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PluginCreate.class),
            f -> f.withMarshaller(UpdatePluginRequest::getBody, UpdatePluginRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProductRequest, UpdateProductResponse> updateProduct =
        genForUpdateProduct();

    private static HttpRequestDef<UpdateProductRequest, UpdateProductResponse> genForUpdateProduct() {
        // basic
        HttpRequestDef.Builder<UpdateProductRequest, UpdateProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProductRequest.class, UpdateProductResponse.class)
                .withName("UpdateProduct")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProductRequest::getInstanceId, UpdateProductRequest::setInstanceId));
        builder.<Integer>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateProductRequest::getProductId, UpdateProductRequest::setProductId));
        builder.<UpdateProductRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProductRequestBody.class),
            f -> f.withMarshaller(UpdateProductRequest::getBody, UpdateProductRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProductTemplateRequest, UpdateProductTemplateResponse> updateProductTemplate =
        genForUpdateProductTemplate();

    private static HttpRequestDef<UpdateProductTemplateRequest, UpdateProductTemplateResponse> genForUpdateProductTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateProductTemplateRequest, UpdateProductTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateProductTemplateRequest.class, UpdateProductTemplateResponse.class)
            .withName("UpdateProductTemplate")
            .withUri("/v2/{project_id}/link/instances/{instance_id}/product-templates/{product_template_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProductTemplateRequest::getInstanceId,
                UpdateProductTemplateRequest::setInstanceId));
        builder.<Integer>withRequestField("product_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateProductTemplateRequest::getProductTemplateId,
                UpdateProductTemplateRequest::setProductTemplateId));
        builder.<UpdateProductTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProductTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateProductTemplateRequest::getBody, UpdateProductTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProductTopicRequest, UpdateProductTopicResponse> updateProductTopic =
        genForUpdateProductTopic();

    private static HttpRequestDef<UpdateProductTopicRequest, UpdateProductTopicResponse> genForUpdateProductTopic() {
        // basic
        HttpRequestDef.Builder<UpdateProductTopicRequest, UpdateProductTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProductTopicRequest.class, UpdateProductTopicResponse.class)
                .withName("UpdateProductTopic")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}/topics/{topic_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProductTopicRequest::getInstanceId, UpdateProductTopicRequest::setInstanceId));
        builder.<Integer>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateProductTopicRequest::getProductId, UpdateProductTopicRequest::setProductId));
        builder.<Integer>withRequestField("topic_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateProductTopicRequest::getTopicId, UpdateProductTopicRequest::setTopicId));
        builder.<UpdateProductTopicRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProductTopicRequestBody.class),
            f -> f.withMarshaller(UpdateProductTopicRequest::getBody, UpdateProductTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePropertyRequest, UpdatePropertyResponse> updateProperty =
        genForUpdateProperty();

    private static HttpRequestDef<UpdatePropertyRequest, UpdatePropertyResponse> genForUpdateProperty() {
        // basic
        HttpRequestDef.Builder<UpdatePropertyRequest, UpdatePropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePropertyRequest.class, UpdatePropertyResponse.class)
                .withName("UpdateProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/properties/{property_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePropertyRequest::getInstanceId, UpdatePropertyRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePropertyRequest::getServiceId, UpdatePropertyRequest::setServiceId));
        builder.<Integer>withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdatePropertyRequest::getPropertyId, UpdatePropertyRequest::setPropertyId));
        builder.<UpdatePropertyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePropertyRequestBody.class),
            f -> f.withMarshaller(UpdatePropertyRequest::getBody, UpdatePropertyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRequestPropertyRequest, UpdateRequestPropertyResponse> updateRequestProperty =
        genForUpdateRequestProperty();

    private static HttpRequestDef<UpdateRequestPropertyRequest, UpdateRequestPropertyResponse> genForUpdateRequestProperty() {
        // basic
        HttpRequestDef.Builder<UpdateRequestPropertyRequest, UpdateRequestPropertyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateRequestPropertyRequest.class, UpdateRequestPropertyResponse.class)
            .withName("UpdateRequestProperty")
            .withUri(
                "/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/requests/{property_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRequestPropertyRequest::getInstanceId,
                UpdateRequestPropertyRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRequestPropertyRequest::getServiceId,
                UpdateRequestPropertyRequest::setServiceId));
        builder.<Integer>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRequestPropertyRequest::getCommandId,
                UpdateRequestPropertyRequest::setCommandId));
        builder.<Integer>withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRequestPropertyRequest::getPropertyId,
                UpdateRequestPropertyRequest::setPropertyId));
        builder.<UpdatePropertyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePropertyRequestBody.class),
            f -> f.withMarshaller(UpdateRequestPropertyRequest::getBody, UpdateRequestPropertyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2 =
        genForUpdateRequestThrottlingPolicyV2();

    private static HttpRequestDef<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> genForUpdateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRequestThrottlingPolicyV2Request.class,
                    UpdateRequestThrottlingPolicyV2Response.class)
                .withName("UpdateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles/{throttle_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRequestThrottlingPolicyV2Request::getInstanceId,
                UpdateRequestThrottlingPolicyV2Request::setInstanceId));
        builder.<String>withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRequestThrottlingPolicyV2Request::getThrottleId,
                UpdateRequestThrottlingPolicyV2Request::setThrottleId));
        builder.<ThrottleBaseInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThrottleBaseInfo.class),
            f -> f.withMarshaller(UpdateRequestThrottlingPolicyV2Request::getBody,
                UpdateRequestThrottlingPolicyV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResponsePropertyRequest, UpdateResponsePropertyResponse> updateResponseProperty =
        genForUpdateResponseProperty();

    private static HttpRequestDef<UpdateResponsePropertyRequest, UpdateResponsePropertyResponse> genForUpdateResponseProperty() {
        // basic
        HttpRequestDef.Builder<UpdateResponsePropertyRequest, UpdateResponsePropertyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateResponsePropertyRequest.class, UpdateResponsePropertyResponse.class)
            .withName("UpdateResponseProperty")
            .withUri(
                "/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/responses/{property_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResponsePropertyRequest::getInstanceId,
                UpdateResponsePropertyRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResponsePropertyRequest::getServiceId,
                UpdateResponsePropertyRequest::setServiceId));
        builder.<Integer>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateResponsePropertyRequest::getCommandId,
                UpdateResponsePropertyRequest::setCommandId));
        builder.<Integer>withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateResponsePropertyRequest::getPropertyId,
                UpdateResponsePropertyRequest::setPropertyId));
        builder.<UpdatePropertyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePropertyRequestBody.class),
            f -> f.withMarshaller(UpdateResponsePropertyRequest::getBody, UpdateResponsePropertyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> updateRule = genForUpdateRule();

    private static HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> genForUpdateRule() {
        // basic
        HttpRequestDef.Builder<UpdateRuleRequest, UpdateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRuleRequest.class, UpdateRuleResponse.class)
                .withName("UpdateRule")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleRequest::getInstanceId, UpdateRuleRequest::setInstanceId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleRequest::getRuleId, UpdateRuleRequest::setRuleId));
        builder.<UpdateRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleRequestBody.class),
            f -> f.withMarshaller(UpdateRuleRequest::getBody, UpdateRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServiceRequest, UpdateServiceResponse> updateService =
        genForUpdateService();

    private static HttpRequestDef<UpdateServiceRequest, UpdateServiceResponse> genForUpdateService() {
        // basic
        HttpRequestDef.Builder<UpdateServiceRequest, UpdateServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateServiceRequest.class, UpdateServiceResponse.class)
                .withName("UpdateService")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServiceRequest::getInstanceId, UpdateServiceRequest::setInstanceId));
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServiceRequest::getServiceId, UpdateServiceRequest::setServiceId));
        builder.<UpdateServiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServiceRequestBody.class),
            f -> f.withMarshaller(UpdateServiceRequest::getBody, UpdateServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> updateSignatureKeyV2 =
        genForUpdateSignatureKeyV2();

    private static HttpRequestDef<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> genForUpdateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateSignatureKeyV2Request.class, UpdateSignatureKeyV2Response.class)
            .withName("UpdateSignatureKeyV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/signs/{sign_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSignatureKeyV2Request::getInstanceId,
                UpdateSignatureKeyV2Request::setInstanceId));
        builder.<String>withRequestField("sign_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSignatureKeyV2Request::getSignId, UpdateSignatureKeyV2Request::setSignId));
        builder.<BaseSignature>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BaseSignature.class),
            f -> f.withMarshaller(UpdateSignatureKeyV2Request::getBody, UpdateSignatureKeyV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2 =
        genForUpdateSpecialThrottlingConfigurationV2();

    private static HttpRequestDef<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> genForUpdateSpecialThrottlingConfigurationV2() {
        // basic
        HttpRequestDef.Builder<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateSpecialThrottlingConfigurationV2Request.class,
                    UpdateSpecialThrottlingConfigurationV2Response.class)
                .withName("UpdateSpecialThrottlingConfigurationV2")
                .withUri(
                    "/v2/{project_id}/apic/instances/{instance_id}/throttles/{throttle_id}/throttle-specials/{strategy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getInstanceId,
                UpdateSpecialThrottlingConfigurationV2Request::setInstanceId));
        builder.<String>withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getThrottleId,
                UpdateSpecialThrottlingConfigurationV2Request::setThrottleId));
        builder.<String>withRequestField("strategy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getStrategyId,
                UpdateSpecialThrottlingConfigurationV2Request::setStrategyId));
        builder.<ThrottleSpecialUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThrottleSpecialUpdate.class),
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getBody,
                UpdateSpecialThrottlingConfigurationV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> updateTask = genForUpdateTask();

    private static HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> genForUpdateTask() {
        // basic
        HttpRequestDef.Builder<UpdateTaskRequest, UpdateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTaskRequest.class, UpdateTaskResponse.class)
                .withName("UpdateTask")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/tasks/{task_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskRequest::getInstanceId, UpdateTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskRequest::getTaskId, UpdateTaskRequest::setTaskId));
        builder.<CreateCommonTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCommonTaskRequestBody.class),
            f -> f.withMarshaller(UpdateTaskRequest::getBody, UpdateTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> updateTopicAccessPolicy =
        genForUpdateTopicAccessPolicy();

    private static HttpRequestDef<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> genForUpdateTopicAccessPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateTopicAccessPolicyRequest.class, UpdateTopicAccessPolicyResponse.class)
            .withName("UpdateTopicAccessPolicy")
            .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics/accesspolicy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopicAccessPolicyRequest::getInstanceId,
                UpdateTopicAccessPolicyRequest::setInstanceId));
        builder.<UpdateTopicAccessPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTopicAccessPolicyReq.class),
            f -> f.withMarshaller(UpdateTopicAccessPolicyRequest::getBody, UpdateTopicAccessPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadProductRequest, UploadProductResponse> uploadProduct =
        genForUploadProduct();

    private static HttpRequestDef<UploadProductRequest, UploadProductResponse> genForUploadProduct() {
        // basic
        HttpRequestDef.Builder<UploadProductRequest, UploadProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadProductRequest.class, UploadProductResponse.class)
                .withName("UploadProduct")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadProductRequest::getInstanceId, UploadProductRequest::setInstanceId));
        builder.<UploadProductRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UploadProductRequestBody.class),
            f -> f.withMarshaller(UploadProductRequest::getBody, UploadProductRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAclV2Request, BatchDeleteAclV2Response> batchDeleteAclV2 =
        genForBatchDeleteAclV2();

    private static HttpRequestDef<BatchDeleteAclV2Request, BatchDeleteAclV2Response> genForBatchDeleteAclV2() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAclV2Request, BatchDeleteAclV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchDeleteAclV2Request.class, BatchDeleteAclV2Response.class)
                .withName("BatchDeleteAclV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acls")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteAclV2Request::getInstanceId, BatchDeleteAclV2Request::setInstanceId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteAclV2Request::getAction, BatchDeleteAclV2Request::setAction));
        builder.<AclBatchDelete>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AclBatchDelete.class),
            f -> f.withMarshaller(BatchDeleteAclV2Request::getBody, BatchDeleteAclV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAclStrategyV2Request, CreateAclStrategyV2Response> createAclStrategyV2 =
        genForCreateAclStrategyV2();

    private static HttpRequestDef<CreateAclStrategyV2Request, CreateAclStrategyV2Response> genForCreateAclStrategyV2() {
        // basic
        HttpRequestDef.Builder<CreateAclStrategyV2Request, CreateAclStrategyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAclStrategyV2Request.class, CreateAclStrategyV2Response.class)
                .withName("CreateAclStrategyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acls")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAclStrategyV2Request::getInstanceId,
                CreateAclStrategyV2Request::setInstanceId));
        builder.<ApiAclCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiAclCreate.class),
            f -> f.withMarshaller(CreateAclStrategyV2Request::getBody, CreateAclStrategyV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAclV2Request, DeleteAclV2Response> deleteAclV2 = genForDeleteAclV2();

    private static HttpRequestDef<DeleteAclV2Request, DeleteAclV2Response> genForDeleteAclV2() {
        // basic
        HttpRequestDef.Builder<DeleteAclV2Request, DeleteAclV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAclV2Request.class, DeleteAclV2Response.class)
                .withName("DeleteAclV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acls/{acl_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclV2Request::getInstanceId, DeleteAclV2Request::setInstanceId));
        builder.<String>withRequestField("acl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclV2Request::getAclId, DeleteAclV2Request::setAclId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAclStrategiesV2Request, ListAclStrategiesV2Response> listAclStrategiesV2 =
        genForListAclStrategiesV2();

    private static HttpRequestDef<ListAclStrategiesV2Request, ListAclStrategiesV2Response> genForListAclStrategiesV2() {
        // basic
        HttpRequestDef.Builder<ListAclStrategiesV2Request, ListAclStrategiesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAclStrategiesV2Request.class, ListAclStrategiesV2Response.class)
                .withName("ListAclStrategiesV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getInstanceId,
                ListAclStrategiesV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getOffset, ListAclStrategiesV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getLimit, ListAclStrategiesV2Request::setLimit));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getId, ListAclStrategiesV2Request::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getName, ListAclStrategiesV2Request::setName));
        builder.<String>withRequestField("acl_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getAclType, ListAclStrategiesV2Request::setAclType));
        builder.<String>withRequestField("entity_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getEntityType,
                ListAclStrategiesV2Request::setEntityType));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getPreciseSearch,
                ListAclStrategiesV2Request::setPreciseSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> showDetailsOfAclPolicyV2 =
        genForShowDetailsOfAclPolicyV2();

    private static HttpRequestDef<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> genForShowDetailsOfAclPolicyV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDetailsOfAclPolicyV2Request.class, ShowDetailsOfAclPolicyV2Response.class)
                .withName("ShowDetailsOfAclPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acls/{acl_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAclPolicyV2Request::getInstanceId,
                ShowDetailsOfAclPolicyV2Request::setInstanceId));
        builder.<String>withRequestField("acl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAclPolicyV2Request::getAclId,
                ShowDetailsOfAclPolicyV2Request::setAclId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> updateAclStrategyV2 =
        genForUpdateAclStrategyV2();

    private static HttpRequestDef<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> genForUpdateAclStrategyV2() {
        // basic
        HttpRequestDef.Builder<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAclStrategyV2Request.class, UpdateAclStrategyV2Response.class)
                .withName("UpdateAclStrategyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acls/{acl_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclStrategyV2Request::getInstanceId,
                UpdateAclStrategyV2Request::setInstanceId));
        builder.<String>withRequestField("acl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclStrategyV2Request::getAclId, UpdateAclStrategyV2Request::setAclId));
        builder.<ApiAclCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiAclCreate.class),
            f -> f.withMarshaller(UpdateAclStrategyV2Request::getBody, UpdateAclStrategyV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2 =
        genForAssociateRequestThrottlingPolicyV2();

    private static HttpRequestDef<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> genForAssociateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateRequestThrottlingPolicyV2Request.class,
                    AssociateRequestThrottlingPolicyV2Response.class)
                .withName("AssociateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttle-bindings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRequestThrottlingPolicyV2Request::getInstanceId,
                AssociateRequestThrottlingPolicyV2Request::setInstanceId));
        builder.<ThrottleApiBindingCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThrottleApiBindingCreate.class),
            f -> f.withMarshaller(AssociateRequestThrottlingPolicyV2Request::getBody,
                AssociateRequestThrottlingPolicyV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2 =
        genForBatchDisassociateThrottlingPolicyV2();

    private static HttpRequestDef<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> genForBatchDisassociateThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchDisassociateThrottlingPolicyV2Request.class,
                    BatchDisassociateThrottlingPolicyV2Response.class)
                .withName("BatchDisassociateThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttle-bindings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisassociateThrottlingPolicyV2Request::getInstanceId,
                BatchDisassociateThrottlingPolicyV2Request::setInstanceId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisassociateThrottlingPolicyV2Request::getAction,
                BatchDisassociateThrottlingPolicyV2Request::setAction));
        builder.<ThrottleBindingBatchDelete>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThrottleBindingBatchDelete.class),
            f -> f.withMarshaller(BatchDisassociateThrottlingPolicyV2Request::getBody,
                BatchDisassociateThrottlingPolicyV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> batchPublishOrOfflineApiV2 =
        genForBatchPublishOrOfflineApiV2();

    private static HttpRequestDef<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> genForBatchPublishOrOfflineApiV2() {
        // basic
        HttpRequestDef.Builder<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchPublishOrOfflineApiV2Request.class,
                    BatchPublishOrOfflineApiV2Response.class)
                .withName("BatchPublishOrOfflineApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/publish")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchPublishOrOfflineApiV2Request::getInstanceId,
                BatchPublishOrOfflineApiV2Request::setInstanceId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchPublishOrOfflineApiV2Request::getAction,
                BatchPublishOrOfflineApiV2Request::setAction));
        builder.<ApiBatchPublish>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiBatchPublish.class),
            f -> f.withMarshaller(BatchPublishOrOfflineApiV2Request::getBody,
                BatchPublishOrOfflineApiV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeApiVersionV2Request, ChangeApiVersionV2Response> changeApiVersionV2 =
        genForChangeApiVersionV2();

    private static HttpRequestDef<ChangeApiVersionV2Request, ChangeApiVersionV2Response> genForChangeApiVersionV2() {
        // basic
        HttpRequestDef.Builder<ChangeApiVersionV2Request, ChangeApiVersionV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeApiVersionV2Request.class, ChangeApiVersionV2Response.class)
                .withName("ChangeApiVersionV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/publish/{api_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeApiVersionV2Request::getInstanceId, ChangeApiVersionV2Request::setInstanceId));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeApiVersionV2Request::getApiId, ChangeApiVersionV2Request::setApiId));
        builder.<ApiVersion>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiVersion.class),
            f -> f.withMarshaller(ChangeApiVersionV2Request::getBody, ChangeApiVersionV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckApiGroupsV2Request, CheckApiGroupsV2Response> checkApiGroupsV2 =
        genForCheckApiGroupsV2();

    private static HttpRequestDef<CheckApiGroupsV2Request, CheckApiGroupsV2Response> genForCheckApiGroupsV2() {
        // basic
        HttpRequestDef.Builder<CheckApiGroupsV2Request, CheckApiGroupsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckApiGroupsV2Request.class, CheckApiGroupsV2Response.class)
                .withName("CheckApiGroupsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckApiGroupsV2Request::getInstanceId, CheckApiGroupsV2Request::setInstanceId));
        builder.<ApiGroupCheck>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiGroupCheck.class),
            f -> f.withMarshaller(CheckApiGroupsV2Request::getBody, CheckApiGroupsV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckApisV2Request, CheckApisV2Response> checkApisV2 = genForCheckApisV2();

    private static HttpRequestDef<CheckApisV2Request, CheckApisV2Response> genForCheckApisV2() {
        // basic
        HttpRequestDef.Builder<CheckApisV2Request, CheckApisV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckApisV2Request.class, CheckApisV2Response.class)
                .withName("CheckApisV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckApisV2Request::getInstanceId, CheckApisV2Request::setInstanceId));
        builder.<ApiCheckInfoV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiCheckInfoV2.class),
            f -> f.withMarshaller(CheckApisV2Request::getBody, CheckApisV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApiGroupV2Request, CreateApiGroupV2Response> createApiGroupV2 =
        genForCreateApiGroupV2();

    private static HttpRequestDef<CreateApiGroupV2Request, CreateApiGroupV2Response> genForCreateApiGroupV2() {
        // basic
        HttpRequestDef.Builder<CreateApiGroupV2Request, CreateApiGroupV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApiGroupV2Request.class, CreateApiGroupV2Response.class)
                .withName("CreateApiGroupV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApiGroupV2Request::getInstanceId, CreateApiGroupV2Request::setInstanceId));
        builder.<ApiGroupCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiGroupCreate.class),
            f -> f.withMarshaller(CreateApiGroupV2Request::getBody, CreateApiGroupV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApiV2Request, CreateApiV2Response> createApiV2 = genForCreateApiV2();

    private static HttpRequestDef<CreateApiV2Request, CreateApiV2Response> genForCreateApiV2() {
        // basic
        HttpRequestDef.Builder<CreateApiV2Request, CreateApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApiV2Request.class, CreateApiV2Response.class)
                .withName("CreateApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApiV2Request::getInstanceId, CreateApiV2Request::setInstanceId));
        builder.<ApiCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiCreate.class),
            f -> f.withMarshaller(CreateApiV2Request::getBody, CreateApiV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2 =
        genForCreateOrDeletePublishRecordForApiV2();

    private static HttpRequestDef<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> genForCreateOrDeletePublishRecordForApiV2() {
        // basic
        HttpRequestDef.Builder<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateOrDeletePublishRecordForApiV2Request.class,
                    CreateOrDeletePublishRecordForApiV2Response.class)
                .withName("CreateOrDeletePublishRecordForApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrDeletePublishRecordForApiV2Request::getInstanceId,
                CreateOrDeletePublishRecordForApiV2Request::setInstanceId));
        builder.<ApiActionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiActionInfo.class),
            f -> f.withMarshaller(CreateOrDeletePublishRecordForApiV2Request::getBody,
                CreateOrDeletePublishRecordForApiV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DebugApiV2Request, DebugApiV2Response> debugApiV2 = genForDebugApiV2();

    private static HttpRequestDef<DebugApiV2Request, DebugApiV2Response> genForDebugApiV2() {
        // basic
        HttpRequestDef.Builder<DebugApiV2Request, DebugApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, DebugApiV2Request.class, DebugApiV2Response.class)
                .withName("DebugApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/debug/{api_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DebugApiV2Request::getInstanceId, DebugApiV2Request::setInstanceId));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DebugApiV2Request::getApiId, DebugApiV2Request::setApiId));
        builder.<ApiDebugInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiDebugInfo.class),
            f -> f.withMarshaller(DebugApiV2Request::getBody, DebugApiV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> deleteApiByVersionIdV2 =
        genForDeleteApiByVersionIdV2();

    private static HttpRequestDef<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> genForDeleteApiByVersionIdV2() {
        // basic
        HttpRequestDef.Builder<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteApiByVersionIdV2Request.class, DeleteApiByVersionIdV2Response.class)
            .withName("DeleteApiByVersionIdV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/versions/{version_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiByVersionIdV2Request::getInstanceId,
                DeleteApiByVersionIdV2Request::setInstanceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiByVersionIdV2Request::getVersionId,
                DeleteApiByVersionIdV2Request::setVersionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiGroupV2Request, DeleteApiGroupV2Response> deleteApiGroupV2 =
        genForDeleteApiGroupV2();

    private static HttpRequestDef<DeleteApiGroupV2Request, DeleteApiGroupV2Response> genForDeleteApiGroupV2() {
        // basic
        HttpRequestDef.Builder<DeleteApiGroupV2Request, DeleteApiGroupV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApiGroupV2Request.class, DeleteApiGroupV2Response.class)
                .withName("DeleteApiGroupV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiGroupV2Request::getInstanceId, DeleteApiGroupV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiGroupV2Request::getGroupId, DeleteApiGroupV2Request::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiV2Request, DeleteApiV2Response> deleteApiV2 = genForDeleteApiV2();

    private static HttpRequestDef<DeleteApiV2Request, DeleteApiV2Response> genForDeleteApiV2() {
        // basic
        HttpRequestDef.Builder<DeleteApiV2Request, DeleteApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApiV2Request.class, DeleteApiV2Response.class)
                .withName("DeleteApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/{api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiV2Request::getInstanceId, DeleteApiV2Request::setInstanceId));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiV2Request::getApiId, DeleteApiV2Request::setApiId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2 =
        genForDisassociateRequestThrottlingPolicyV2();

    private static HttpRequestDef<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> genForDisassociateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DisassociateRequestThrottlingPolicyV2Request.class,
                    DisassociateRequestThrottlingPolicyV2Response.class)
                .withName("DisassociateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttle-bindings/{throttle_binding_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateRequestThrottlingPolicyV2Request::getInstanceId,
                DisassociateRequestThrottlingPolicyV2Request::setInstanceId));
        builder.<String>withRequestField("throttle_binding_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateRequestThrottlingPolicyV2Request::getThrottleBindingId,
                DisassociateRequestThrottlingPolicyV2Request::setThrottleBindingId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiGroupsV2Request, ListApiGroupsV2Response> listApiGroupsV2 =
        genForListApiGroupsV2();

    private static HttpRequestDef<ListApiGroupsV2Request, ListApiGroupsV2Response> genForListApiGroupsV2() {
        // basic
        HttpRequestDef.Builder<ListApiGroupsV2Request, ListApiGroupsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiGroupsV2Request.class, ListApiGroupsV2Response.class)
                .withName("ListApiGroupsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getInstanceId, ListApiGroupsV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getOffset, ListApiGroupsV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getLimit, ListApiGroupsV2Request::setLimit));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getId, ListApiGroupsV2Request::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getName, ListApiGroupsV2Request::setName));
        builder.<String>withRequestField("roma_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getRomaAppId, ListApiGroupsV2Request::setRomaAppId));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getPreciseSearch, ListApiGroupsV2Request::setPreciseSearch));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getDomainName, ListApiGroupsV2Request::setDomainName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> listApiRuntimeDefinitionV2 =
        genForListApiRuntimeDefinitionV2();

    private static HttpRequestDef<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> genForListApiRuntimeDefinitionV2() {
        // basic
        HttpRequestDef.Builder<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApiRuntimeDefinitionV2Request.class,
                    ListApiRuntimeDefinitionV2Response.class)
                .withName("ListApiRuntimeDefinitionV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/runtime/{api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiRuntimeDefinitionV2Request::getInstanceId,
                ListApiRuntimeDefinitionV2Request::setInstanceId));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiRuntimeDefinitionV2Request::getApiId,
                ListApiRuntimeDefinitionV2Request::setApiId));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiRuntimeDefinitionV2Request::getEnvId,
                ListApiRuntimeDefinitionV2Request::setEnvId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> listApiVersionDetailV2 =
        genForListApiVersionDetailV2();

    private static HttpRequestDef<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> genForListApiVersionDetailV2() {
        // basic
        HttpRequestDef.Builder<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListApiVersionDetailV2Request.class, ListApiVersionDetailV2Response.class)
            .withName("ListApiVersionDetailV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/versions/{version_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiVersionDetailV2Request::getInstanceId,
                ListApiVersionDetailV2Request::setInstanceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiVersionDetailV2Request::getVersionId,
                ListApiVersionDetailV2Request::setVersionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsV2Request, ListApiVersionsV2Response> listApiVersionsV2 =
        genForListApiVersionsV2();

    private static HttpRequestDef<ListApiVersionsV2Request, ListApiVersionsV2Response> genForListApiVersionsV2() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsV2Request, ListApiVersionsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsV2Request.class, ListApiVersionsV2Response.class)
                .withName("ListApiVersionsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/publish/{api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiVersionsV2Request::getInstanceId, ListApiVersionsV2Request::setInstanceId));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiVersionsV2Request::getApiId, ListApiVersionsV2Request::setApiId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApiVersionsV2Request::getOffset, ListApiVersionsV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApiVersionsV2Request::getLimit, ListApiVersionsV2Request::setLimit));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiVersionsV2Request::getEnvId, ListApiVersionsV2Request::setEnvId));
        builder.<String>withRequestField("env_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiVersionsV2Request::getEnvName, ListApiVersionsV2Request::setEnvName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2 =
        genForListApisBindedToRequestThrottlingPolicyV2();

    private static HttpRequestDef<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> genForListApisBindedToRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApisBindedToRequestThrottlingPolicyV2Request.class,
                    ListApisBindedToRequestThrottlingPolicyV2Response.class)
                .withName("ListApisBindedToRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttle-bindings/binded-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getInstanceId,
                ListApisBindedToRequestThrottlingPolicyV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getOffset,
                ListApisBindedToRequestThrottlingPolicyV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getLimit,
                ListApisBindedToRequestThrottlingPolicyV2Request::setLimit));
        builder.<String>withRequestField("throttle_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getThrottleId,
                ListApisBindedToRequestThrottlingPolicyV2Request::setThrottleId));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getEnvId,
                ListApisBindedToRequestThrottlingPolicyV2Request::setEnvId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getGroupId,
                ListApisBindedToRequestThrottlingPolicyV2Request::setGroupId));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getApiId,
                ListApisBindedToRequestThrottlingPolicyV2Request::setApiId));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getApiName,
                ListApisBindedToRequestThrottlingPolicyV2Request::setApiName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2 =
        genForListApisUnbindedToRequestThrottlingPolicyV2();

    private static HttpRequestDef<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> genForListApisUnbindedToRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApisUnbindedToRequestThrottlingPolicyV2Request.class,
                    ListApisUnbindedToRequestThrottlingPolicyV2Response.class)
                .withName("ListApisUnbindedToRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttle-bindings/unbinded-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getInstanceId,
                ListApisUnbindedToRequestThrottlingPolicyV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getOffset,
                ListApisUnbindedToRequestThrottlingPolicyV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getLimit,
                ListApisUnbindedToRequestThrottlingPolicyV2Request::setLimit));
        builder.<String>withRequestField("throttle_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getThrottleId,
                ListApisUnbindedToRequestThrottlingPolicyV2Request::setThrottleId));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getEnvId,
                ListApisUnbindedToRequestThrottlingPolicyV2Request::setEnvId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getGroupId,
                ListApisUnbindedToRequestThrottlingPolicyV2Request::setGroupId));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getApiId,
                ListApisUnbindedToRequestThrottlingPolicyV2Request::setApiId));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getApiName,
                ListApisUnbindedToRequestThrottlingPolicyV2Request::setApiName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisV2Request, ListApisV2Response> listApisV2 = genForListApisV2();

    private static HttpRequestDef<ListApisV2Request, ListApisV2Response> genForListApisV2() {
        // basic
        HttpRequestDef.Builder<ListApisV2Request, ListApisV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisV2Request.class, ListApisV2Response.class)
                .withName("ListApisV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getInstanceId, ListApisV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisV2Request::getOffset, ListApisV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisV2Request::getLimit, ListApisV2Request::setLimit));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getId, ListApisV2Request::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getName, ListApisV2Request::setName));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getGroupId, ListApisV2Request::setGroupId));
        builder.<String>withRequestField("req_protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getReqProtocol, ListApisV2Request::setReqProtocol));
        builder.<String>withRequestField("req_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getReqMethod, ListApisV2Request::setReqMethod));
        builder.<String>withRequestField("req_uri",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getReqUri, ListApisV2Request::setReqUri));
        builder.<String>withRequestField("auth_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getAuthType, ListApisV2Request::setAuthType));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getEnvId, ListApisV2Request::setEnvId));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisV2Request::getType, ListApisV2Request::setType));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getPreciseSearch, ListApisV2Request::setPreciseSearch));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getVpcChannelId, ListApisV2Request::setVpcChannelId));
        builder.<String>withRequestField("vpc_channel_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getVpcChannelName, ListApisV2Request::setVpcChannelName));
        builder.<String>withRequestField("roma_app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getRomaAppName, ListApisV2Request::setRomaAppName));
        builder.<String>withRequestField("roma_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getRomaAppId, ListApisV2Request::setRomaAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2 =
        genForListRequestThrottlingPoliciesBindedToApiV2();

    private static HttpRequestDef<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> genForListRequestThrottlingPoliciesBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRequestThrottlingPoliciesBindedToApiV2Request.class,
                    ListRequestThrottlingPoliciesBindedToApiV2Response.class)
                .withName("ListRequestThrottlingPoliciesBindedToApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttle-bindings/binded-throttles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getInstanceId,
                ListRequestThrottlingPoliciesBindedToApiV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getOffset,
                ListRequestThrottlingPoliciesBindedToApiV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getLimit,
                ListRequestThrottlingPoliciesBindedToApiV2Request::setLimit));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getApiId,
                ListRequestThrottlingPoliciesBindedToApiV2Request::setApiId));
        builder.<String>withRequestField("throttle_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getThrottleId,
                ListRequestThrottlingPoliciesBindedToApiV2Request::setThrottleId));
        builder.<String>withRequestField("throttle_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getThrottleName,
                ListRequestThrottlingPoliciesBindedToApiV2Request::setThrottleName));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getEnvId,
                ListRequestThrottlingPoliciesBindedToApiV2Request::setEnvId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2 =
        genForShowDetailsOfApiGroupV2();

    private static HttpRequestDef<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> genForShowDetailsOfApiGroupV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDetailsOfApiGroupV2Request.class, ShowDetailsOfApiGroupV2Response.class)
            .withName("ShowDetailsOfApiGroupV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfApiGroupV2Request::getInstanceId,
                ShowDetailsOfApiGroupV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfApiGroupV2Request::getGroupId,
                ShowDetailsOfApiGroupV2Request::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> showDetailsOfApiV2 =
        genForShowDetailsOfApiV2();

    private static HttpRequestDef<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> genForShowDetailsOfApiV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfApiV2Request.class, ShowDetailsOfApiV2Response.class)
                .withName("ShowDetailsOfApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/{api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfApiV2Request::getInstanceId, ShowDetailsOfApiV2Request::setInstanceId));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfApiV2Request::getApiId, ShowDetailsOfApiV2Request::setApiId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApiGroupV2Request, UpdateApiGroupV2Response> updateApiGroupV2 =
        genForUpdateApiGroupV2();

    private static HttpRequestDef<UpdateApiGroupV2Request, UpdateApiGroupV2Response> genForUpdateApiGroupV2() {
        // basic
        HttpRequestDef.Builder<UpdateApiGroupV2Request, UpdateApiGroupV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateApiGroupV2Request.class, UpdateApiGroupV2Response.class)
                .withName("UpdateApiGroupV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApiGroupV2Request::getInstanceId, UpdateApiGroupV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApiGroupV2Request::getGroupId, UpdateApiGroupV2Request::setGroupId));
        builder.<ApiGroupBase>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiGroupBase.class),
            f -> f.withMarshaller(UpdateApiGroupV2Request::getBody, UpdateApiGroupV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApiV2Request, UpdateApiV2Response> updateApiV2 = genForUpdateApiV2();

    private static HttpRequestDef<UpdateApiV2Request, UpdateApiV2Response> genForUpdateApiV2() {
        // basic
        HttpRequestDef.Builder<UpdateApiV2Request, UpdateApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateApiV2Request.class, UpdateApiV2Response.class)
                .withName("UpdateApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/{api_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApiV2Request::getInstanceId, UpdateApiV2Request::setInstanceId));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApiV2Request::getApiId, UpdateApiV2Request::setApiId));
        builder.<ApiCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiCreate.class),
            f -> f.withMarshaller(UpdateApiV2Request::getBody, UpdateApiV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> batchDeleteApiAclBindingV2 =
        genForBatchDeleteApiAclBindingV2();

    private static HttpRequestDef<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> genForBatchDeleteApiAclBindingV2() {
        // basic
        HttpRequestDef.Builder<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchDeleteApiAclBindingV2Request.class,
                    BatchDeleteApiAclBindingV2Response.class)
                .withName("BatchDeleteApiAclBindingV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acl-bindings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteApiAclBindingV2Request::getInstanceId,
                BatchDeleteApiAclBindingV2Request::setInstanceId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteApiAclBindingV2Request::getAction,
                BatchDeleteApiAclBindingV2Request::setAction));
        builder.<AclBindingBatchDelete>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AclBindingBatchDelete.class),
            f -> f.withMarshaller(BatchDeleteApiAclBindingV2Request::getBody,
                BatchDeleteApiAclBindingV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> createApiAclBindingV2 =
        genForCreateApiAclBindingV2();

    private static HttpRequestDef<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> genForCreateApiAclBindingV2() {
        // basic
        HttpRequestDef.Builder<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateApiAclBindingV2Request.class, CreateApiAclBindingV2Response.class)
            .withName("CreateApiAclBindingV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/acl-bindings")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApiAclBindingV2Request::getInstanceId,
                CreateApiAclBindingV2Request::setInstanceId));
        builder.<AclApiBindingCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AclApiBindingCreate.class),
            f -> f.withMarshaller(CreateApiAclBindingV2Request::getBody, CreateApiAclBindingV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> deleteApiAclBindingV2 =
        genForDeleteApiAclBindingV2();

    private static HttpRequestDef<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> genForDeleteApiAclBindingV2() {
        // basic
        HttpRequestDef.Builder<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteApiAclBindingV2Request.class, DeleteApiAclBindingV2Response.class)
            .withName("DeleteApiAclBindingV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/acl-bindings/{acl_bindings_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiAclBindingV2Request::getInstanceId,
                DeleteApiAclBindingV2Request::setInstanceId));
        builder.<String>withRequestField("acl_bindings_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiAclBindingV2Request::getAclBindingsId,
                DeleteApiAclBindingV2Request::setAclBindingsId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> listAclPolicyBindedToApiV2 =
        genForListAclPolicyBindedToApiV2();

    private static HttpRequestDef<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> genForListAclPolicyBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAclPolicyBindedToApiV2Request.class,
                    ListAclPolicyBindedToApiV2Response.class)
                .withName("ListAclPolicyBindedToApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acl-bindings/binded-acls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getInstanceId,
                ListAclPolicyBindedToApiV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getOffset,
                ListAclPolicyBindedToApiV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getLimit,
                ListAclPolicyBindedToApiV2Request::setLimit));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getApiId,
                ListAclPolicyBindedToApiV2Request::setApiId));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getEnvId,
                ListAclPolicyBindedToApiV2Request::setEnvId));
        builder.<String>withRequestField("env_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getEnvName,
                ListAclPolicyBindedToApiV2Request::setEnvName));
        builder.<String>withRequestField("acl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getAclId,
                ListAclPolicyBindedToApiV2Request::setAclId));
        builder.<String>withRequestField("acl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getAclName,
                ListAclPolicyBindedToApiV2Request::setAclName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> listApisBindedToAclPolicyV2 =
        genForListApisBindedToAclPolicyV2();

    private static HttpRequestDef<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> genForListApisBindedToAclPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApisBindedToAclPolicyV2Request.class,
                    ListApisBindedToAclPolicyV2Response.class)
                .withName("ListApisBindedToAclPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acl-bindings/binded-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getInstanceId,
                ListApisBindedToAclPolicyV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getOffset,
                ListApisBindedToAclPolicyV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getLimit,
                ListApisBindedToAclPolicyV2Request::setLimit));
        builder.<String>withRequestField("acl_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getAclId,
                ListApisBindedToAclPolicyV2Request::setAclId));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getApiName,
                ListApisBindedToAclPolicyV2Request::setApiName));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getEnvId,
                ListApisBindedToAclPolicyV2Request::setEnvId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getGroupId,
                ListApisBindedToAclPolicyV2Request::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> listApisUnbindedToAclPolicyV2 =
        genForListApisUnbindedToAclPolicyV2();

    private static HttpRequestDef<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> genForListApisUnbindedToAclPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApisUnbindedToAclPolicyV2Request.class,
                    ListApisUnbindedToAclPolicyV2Response.class)
                .withName("ListApisUnbindedToAclPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acl-bindings/unbinded-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getInstanceId,
                ListApisUnbindedToAclPolicyV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getOffset,
                ListApisUnbindedToAclPolicyV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getLimit,
                ListApisUnbindedToAclPolicyV2Request::setLimit));
        builder.<String>withRequestField("acl_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getAclId,
                ListApisUnbindedToAclPolicyV2Request::setAclId));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getApiId,
                ListApisUnbindedToAclPolicyV2Request::setApiId));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getApiName,
                ListApisUnbindedToAclPolicyV2Request::setApiName));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getEnvId,
                ListApisUnbindedToAclPolicyV2Request::setEnvId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getGroupId,
                ListApisUnbindedToAclPolicyV2Request::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> cancelingAuthorizationV2 =
        genForCancelingAuthorizationV2();

    private static HttpRequestDef<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> genForCancelingAuthorizationV2() {
        // basic
        HttpRequestDef.Builder<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    CancelingAuthorizationV2Request.class,
                    CancelingAuthorizationV2Response.class)
                .withName("CancelingAuthorizationV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-auths/{app_auth_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelingAuthorizationV2Request::getInstanceId,
                CancelingAuthorizationV2Request::setInstanceId));
        builder.<String>withRequestField("app_auth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelingAuthorizationV2Request::getAppAuthId,
                CancelingAuthorizationV2Request::setAppAuthId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> createAuthorizingAppsV2 =
        genForCreateAuthorizingAppsV2();

    private static HttpRequestDef<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> genForCreateAuthorizingAppsV2() {
        // basic
        HttpRequestDef.Builder<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAuthorizingAppsV2Request.class, CreateAuthorizingAppsV2Response.class)
            .withName("CreateAuthorizingAppsV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-auths")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAuthorizingAppsV2Request::getInstanceId,
                CreateAuthorizingAppsV2Request::setInstanceId));
        builder.<ApiAuthCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiAuthCreate.class),
            f -> f.withMarshaller(CreateAuthorizingAppsV2Request::getBody, CreateAuthorizingAppsV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> listApisBindedToAppV2 =
        genForListApisBindedToAppV2();

    private static HttpRequestDef<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> genForListApisBindedToAppV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListApisBindedToAppV2Request.class, ListApisBindedToAppV2Response.class)
            .withName("ListApisBindedToAppV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-auths/binded-apis")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getInstanceId,
                ListApisBindedToAppV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getOffset, ListApisBindedToAppV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getLimit, ListApisBindedToAppV2Request::setLimit));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getAppId, ListApisBindedToAppV2Request::setAppId));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getApiId, ListApisBindedToAppV2Request::setApiId));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getApiName, ListApisBindedToAppV2Request::setApiName));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getGroupId, ListApisBindedToAppV2Request::setGroupId));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getGroupName,
                ListApisBindedToAppV2Request::setGroupName));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getEnvId, ListApisBindedToAppV2Request::setEnvId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2 =
        genForListApisUnbindedToAppV2();

    private static HttpRequestDef<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> genForListApisUnbindedToAppV2() {
        // basic
        HttpRequestDef.Builder<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListApisUnbindedToAppV2Request.class, ListApisUnbindedToAppV2Response.class)
            .withName("ListApisUnbindedToAppV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-auths/unbinded-apis")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getInstanceId,
                ListApisUnbindedToAppV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getOffset,
                ListApisUnbindedToAppV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getLimit, ListApisUnbindedToAppV2Request::setLimit));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getAppId, ListApisUnbindedToAppV2Request::setAppId));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getEnvId, ListApisUnbindedToAppV2Request::setEnvId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getGroupId,
                ListApisUnbindedToAppV2Request::setGroupId));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getApiId, ListApisUnbindedToAppV2Request::setApiId));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getApiName,
                ListApisUnbindedToAppV2Request::setApiName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> listAppsBindedToApiV2 =
        genForListAppsBindedToApiV2();

    private static HttpRequestDef<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> genForListAppsBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAppsBindedToApiV2Request.class, ListAppsBindedToApiV2Response.class)
            .withName("ListAppsBindedToApiV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-auths/binded-apps")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getInstanceId,
                ListAppsBindedToApiV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getOffset, ListAppsBindedToApiV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getLimit, ListAppsBindedToApiV2Request::setLimit));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getApiId, ListAppsBindedToApiV2Request::setApiId));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getAppName, ListAppsBindedToApiV2Request::setAppName));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getAppId, ListAppsBindedToApiV2Request::setAppId));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getEnvId, ListAppsBindedToApiV2Request::setEnvId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDuplicateApisForAppV2Request, ListDuplicateApisForAppV2Response> listDuplicateApisForAppV2 =
        genForListDuplicateApisForAppV2();

    private static HttpRequestDef<ListDuplicateApisForAppV2Request, ListDuplicateApisForAppV2Response> genForListDuplicateApisForAppV2() {
        // basic
        HttpRequestDef.Builder<ListDuplicateApisForAppV2Request, ListDuplicateApisForAppV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDuplicateApisForAppV2Request.class,
                    ListDuplicateApisForAppV2Response.class)
                .withName("ListDuplicateApisForAppV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-auths/duplicate-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDuplicateApisForAppV2Request::getInstanceId,
                ListDuplicateApisForAppV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDuplicateApisForAppV2Request::getAppId,
                ListDuplicateApisForAppV2Request::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddUserToAppRequest, AddUserToAppResponse> addUserToApp = genForAddUserToApp();

    private static HttpRequestDef<AddUserToAppRequest, AddUserToAppResponse> genForAddUserToApp() {
        // basic
        HttpRequestDef.Builder<AddUserToAppRequest, AddUserToAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AddUserToAppRequest.class, AddUserToAppResponse.class)
                .withName("AddUserToApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}/users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddUserToAppRequest::getAppId, AddUserToAppRequest::setAppId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddUserToAppRequest::getInstanceId, AddUserToAppRequest::setInstanceId));
        builder.<AddUserToApp>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddUserToApp.class),
            f -> f.withMarshaller(AddUserToAppRequest::getBody, AddUserToAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckAuthUsersOfAppRequest, CheckAuthUsersOfAppResponse> checkAuthUsersOfApp =
        genForCheckAuthUsersOfApp();

    private static HttpRequestDef<CheckAuthUsersOfAppRequest, CheckAuthUsersOfAppResponse> genForCheckAuthUsersOfApp() {
        // basic
        HttpRequestDef.Builder<CheckAuthUsersOfAppRequest, CheckAuthUsersOfAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckAuthUsersOfAppRequest.class, CheckAuthUsersOfAppResponse.class)
                .withName("CheckAuthUsersOfApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAuthUsersOfAppRequest::getAppId, CheckAuthUsersOfAppRequest::setAppId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAuthUsersOfAppRequest::getInstanceId,
                CheckAuthUsersOfAppRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAuthUsersOfAppRequest::getUserName, CheckAuthUsersOfAppRequest::setUserName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckCanAuthUsersOfAppRequest, CheckCanAuthUsersOfAppResponse> checkCanAuthUsersOfApp =
        genForCheckCanAuthUsersOfApp();

    private static HttpRequestDef<CheckCanAuthUsersOfAppRequest, CheckCanAuthUsersOfAppResponse> genForCheckCanAuthUsersOfApp() {
        // basic
        HttpRequestDef.Builder<CheckCanAuthUsersOfAppRequest, CheckCanAuthUsersOfAppResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CheckCanAuthUsersOfAppRequest.class, CheckCanAuthUsersOfAppResponse.class)
            .withName("CheckCanAuthUsersOfApp")
            .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}/candidates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCanAuthUsersOfAppRequest::getAppId, CheckCanAuthUsersOfAppRequest::setAppId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCanAuthUsersOfAppRequest::getInstanceId,
                CheckCanAuthUsersOfAppRequest::setInstanceId));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCanAuthUsersOfAppRequest::getFilter, CheckCanAuthUsersOfAppRequest::setFilter));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckRomaAppDetailsRequest, CheckRomaAppDetailsResponse> checkRomaAppDetails =
        genForCheckRomaAppDetails();

    private static HttpRequestDef<CheckRomaAppDetailsRequest, CheckRomaAppDetailsResponse> genForCheckRomaAppDetails() {
        // basic
        HttpRequestDef.Builder<CheckRomaAppDetailsRequest, CheckRomaAppDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckRomaAppDetailsRequest.class, CheckRomaAppDetailsResponse.class)
                .withName("CheckRomaAppDetails")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRomaAppDetailsRequest::getAppId, CheckRomaAppDetailsRequest::setAppId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRomaAppDetailsRequest::getInstanceId,
                CheckRomaAppDetailsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckRomaAppSecretRequest, CheckRomaAppSecretResponse> checkRomaAppSecret =
        genForCheckRomaAppSecret();

    private static HttpRequestDef<CheckRomaAppSecretRequest, CheckRomaAppSecretResponse> genForCheckRomaAppSecret() {
        // basic
        HttpRequestDef.Builder<CheckRomaAppSecretRequest, CheckRomaAppSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckRomaAppSecretRequest.class, CheckRomaAppSecretResponse.class)
                .withName("CheckRomaAppSecret")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}/secret")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRomaAppSecretRequest::getAppId, CheckRomaAppSecretRequest::setAppId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRomaAppSecretRequest::getInstanceId, CheckRomaAppSecretRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRomaAppRequest, CreateRomaAppResponse> createRomaApp =
        genForCreateRomaApp();

    private static HttpRequestDef<CreateRomaAppRequest, CreateRomaAppResponse> genForCreateRomaApp() {
        // basic
        HttpRequestDef.Builder<CreateRomaAppRequest, CreateRomaAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRomaAppRequest.class, CreateRomaAppResponse.class)
                .withName("CreateRomaApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRomaAppRequest::getInstanceId, CreateRomaAppRequest::setInstanceId));
        builder.<CreateAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppReq.class),
            f -> f.withMarshaller(CreateRomaAppRequest::getBody, CreateRomaAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRomaAppRequest, DeleteRomaAppResponse> deleteRomaApp =
        genForDeleteRomaApp();

    private static HttpRequestDef<DeleteRomaAppRequest, DeleteRomaAppResponse> genForDeleteRomaApp() {
        // basic
        HttpRequestDef.Builder<DeleteRomaAppRequest, DeleteRomaAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRomaAppRequest.class, DeleteRomaAppResponse.class)
                .withName("DeleteRomaApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRomaAppRequest::getAppId, DeleteRomaAppRequest::setAppId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRomaAppRequest::getInstanceId, DeleteRomaAppRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRomaAppRequest, ListRomaAppResponse> listRomaApp = genForListRomaApp();

    private static HttpRequestDef<ListRomaAppRequest, ListRomaAppResponse> genForListRomaApp() {
        // basic
        HttpRequestDef.Builder<ListRomaAppRequest, ListRomaAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRomaAppRequest.class, ListRomaAppResponse.class)
                .withName("ListRomaApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRomaAppRequest::getInstanceId, ListRomaAppRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRomaAppRequest::getOffset, ListRomaAppRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRomaAppRequest::getLimit, ListRomaAppRequest::setLimit));
        builder.<Boolean>withRequestField("favorite",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRomaAppRequest::getFavorite, ListRomaAppRequest::setFavorite));
        builder.<String>withRequestField("auth_role",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRomaAppRequest::getAuthRole, ListRomaAppRequest::setAuthRole));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRomaAppRequest::getName, ListRomaAppRequest::setName));
        builder.<Boolean>withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRomaAppRequest::getOwner, ListRomaAppRequest::setOwner));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRomaAppRequest::getUserName, ListRomaAppRequest::setUserName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetRomaAppSecretRequest, ResetRomaAppSecretResponse> resetRomaAppSecret =
        genForResetRomaAppSecret();

    private static HttpRequestDef<ResetRomaAppSecretRequest, ResetRomaAppSecretResponse> genForResetRomaAppSecret() {
        // basic
        HttpRequestDef.Builder<ResetRomaAppSecretRequest, ResetRomaAppSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetRomaAppSecretRequest.class, ResetRomaAppSecretResponse.class)
                .withName("ResetRomaAppSecret")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}/secret")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetRomaAppSecretRequest::getAppId, ResetRomaAppSecretRequest::setAppId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetRomaAppSecretRequest::getInstanceId, ResetRomaAppSecretRequest::setInstanceId));
        builder.<UpdateAppSecretReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppSecretReq.class),
            f -> f.withMarshaller(ResetRomaAppSecretRequest::getBody, ResetRomaAppSecretRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRomaAppRequest, UpdateRomaAppResponse> updateRomaApp =
        genForUpdateRomaApp();

    private static HttpRequestDef<UpdateRomaAppRequest, UpdateRomaAppResponse> genForUpdateRomaApp() {
        // basic
        HttpRequestDef.Builder<UpdateRomaAppRequest, UpdateRomaAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRomaAppRequest.class, UpdateRomaAppResponse.class)
                .withName("UpdateRomaApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRomaAppRequest::getAppId, UpdateRomaAppRequest::setAppId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRomaAppRequest::getInstanceId, UpdateRomaAppRequest::setInstanceId));
        builder.<UpdateAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppReq.class),
            f -> f.withMarshaller(UpdateRomaAppRequest::getBody, UpdateRomaAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateRomaAppRequest, ValidateRomaAppResponse> validateRomaApp =
        genForValidateRomaApp();

    private static HttpRequestDef<ValidateRomaAppRequest, ValidateRomaAppResponse> genForValidateRomaApp() {
        // basic
        HttpRequestDef.Builder<ValidateRomaAppRequest, ValidateRomaAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ValidateRomaAppRequest.class, ValidateRomaAppResponse.class)
                .withName("ValidateRomaApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/validate-apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateRomaAppRequest::getInstanceId, ValidateRomaAppRequest::setInstanceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateRomaAppRequest::getName, ValidateRomaAppRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateRomaAppRequest::getId, ValidateRomaAppRequest::setId));
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateRomaAppRequest::getKey, ValidateRomaAppRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckAssetJobStatusRequest, CheckAssetJobStatusResponse> checkAssetJobStatus =
        genForCheckAssetJobStatus();

    private static HttpRequestDef<CheckAssetJobStatusRequest, CheckAssetJobStatusResponse> genForCheckAssetJobStatus() {
        // basic
        HttpRequestDef.Builder<CheckAssetJobStatusRequest, CheckAssetJobStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckAssetJobStatusRequest.class, CheckAssetJobStatusResponse.class)
                .withName("CheckAssetJobStatus")
                .withUri("/v2/{project_id}/instances/{instance_id}/assets/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAssetJobStatusRequest::getInstanceId,
                CheckAssetJobStatusRequest::setInstanceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAssetJobStatusRequest::getJobId, CheckAssetJobStatusRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetRequest, DeleteAssetResponse> deleteAsset = genForDeleteAsset();

    private static HttpRequestDef<DeleteAssetRequest, DeleteAssetResponse> genForDeleteAsset() {
        // basic
        HttpRequestDef.Builder<DeleteAssetRequest, DeleteAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteAssetRequest.class, DeleteAssetResponse.class)
                .withName("DeleteAsset")
                .withUri("/v2/{project_id}/instances/{instance_id}/assets/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getInstanceId, DeleteAssetRequest::setInstanceId));
        builder.<AssetOperateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssetOperateRequest.class),
            f -> f.withMarshaller(DeleteAssetRequest::getBody, DeleteAssetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadAssetArchiveRequest, DownloadAssetArchiveResponse> downloadAssetArchive =
        genForDownloadAssetArchive();

    private static HttpRequestDef<DownloadAssetArchiveRequest, DownloadAssetArchiveResponse> genForDownloadAssetArchive() {
        // basic
        HttpRequestDef.Builder<DownloadAssetArchiveRequest, DownloadAssetArchiveResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadAssetArchiveRequest.class, DownloadAssetArchiveResponse.class)
            .withName("DownloadAssetArchive")
            .withUri("/v2/{project_id}/instances/{instance_id}/assets/archives/{archive_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAssetArchiveRequest::getInstanceId,
                DownloadAssetArchiveRequest::setInstanceId));
        builder.<String>withRequestField("archive_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAssetArchiveRequest::getArchiveId,
                DownloadAssetArchiveRequest::setArchiveId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportAssetRequest, ExportAssetResponse> exportAsset = genForExportAsset();

    private static HttpRequestDef<ExportAssetRequest, ExportAssetResponse> genForExportAsset() {
        // basic
        HttpRequestDef.Builder<ExportAssetRequest, ExportAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportAssetRequest.class, ExportAssetResponse.class)
                .withName("ExportAsset")
                .withUri("/v2/{project_id}/instances/{instance_id}/assets/export")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportAssetRequest::getInstanceId, ExportAssetRequest::setInstanceId));
        builder.<AssetExportRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssetExportRequest.class),
            f -> f.withMarshaller(ExportAssetRequest::getBody, ExportAssetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportAssetRequest, ImportAssetResponse> importAsset = genForImportAsset();

    private static HttpRequestDef<ImportAssetRequest, ImportAssetResponse> genForImportAsset() {
        // basic
        HttpRequestDef.Builder<ImportAssetRequest, ImportAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportAssetRequest.class, ImportAssetResponse.class)
                .withName("ImportAsset")
                .withUri("/v2/{project_id}/instances/{instance_id}/assets/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportAssetRequest::getInstanceId, ImportAssetRequest::setInstanceId));
        builder.<ImportAssetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportAssetRequestBody.class),
            f -> f.withMarshaller(ImportAssetRequest::getBody, ImportAssetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDictionaryRequest, CheckDictionaryResponse> checkDictionary =
        genForCheckDictionary();

    private static HttpRequestDef<CheckDictionaryRequest, CheckDictionaryResponse> genForCheckDictionary() {
        // basic
        HttpRequestDef.Builder<CheckDictionaryRequest, CheckDictionaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckDictionaryRequest.class, CheckDictionaryResponse.class)
                .withName("CheckDictionary")
                .withUri("/v2/{project_id}/instances/{instance_id}/dictionaries/{dict_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dict_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDictionaryRequest::getDictId, CheckDictionaryRequest::setDictId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDictionaryRequest::getInstanceId, CheckDictionaryRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDictionaryRequest, CreateDictionaryResponse> createDictionary =
        genForCreateDictionary();

    private static HttpRequestDef<CreateDictionaryRequest, CreateDictionaryResponse> genForCreateDictionary() {
        // basic
        HttpRequestDef.Builder<CreateDictionaryRequest, CreateDictionaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDictionaryRequest.class, CreateDictionaryResponse.class)
                .withName("CreateDictionary")
                .withUri("/v2/{project_id}/instances/{instance_id}/dictionaries")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDictionaryRequest::getInstanceId, CreateDictionaryRequest::setInstanceId));
        builder.<CreateDictionary>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDictionary.class),
            f -> f.withMarshaller(CreateDictionaryRequest::getBody, CreateDictionaryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDictionaryRequest, DeleteDictionaryResponse> deleteDictionary =
        genForDeleteDictionary();

    private static HttpRequestDef<DeleteDictionaryRequest, DeleteDictionaryResponse> genForDeleteDictionary() {
        // basic
        HttpRequestDef.Builder<DeleteDictionaryRequest, DeleteDictionaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDictionaryRequest.class, DeleteDictionaryResponse.class)
                .withName("DeleteDictionary")
                .withUri("/v2/{project_id}/instances/{instance_id}/dictionaries/{dict_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dict_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDictionaryRequest::getDictId, DeleteDictionaryRequest::setDictId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDictionaryRequest::getInstanceId, DeleteDictionaryRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDictionaryRequest, ListDictionaryResponse> listDictionary =
        genForListDictionary();

    private static HttpRequestDef<ListDictionaryRequest, ListDictionaryResponse> genForListDictionary() {
        // basic
        HttpRequestDef.Builder<ListDictionaryRequest, ListDictionaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDictionaryRequest.class, ListDictionaryResponse.class)
                .withName("ListDictionary")
                .withUri("/v2/{project_id}/instances/{instance_id}/dictionaries")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDictionaryRequest::getInstanceId, ListDictionaryRequest::setInstanceId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDictionaryRequest::getOffset, ListDictionaryRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDictionaryRequest::getLimit, ListDictionaryRequest::setLimit));
        builder.<String>withRequestField("parent_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDictionaryRequest::getParentCode, ListDictionaryRequest::setParentCode));
        builder.<String>withRequestField("code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDictionaryRequest::getCode, ListDictionaryRequest::setCode));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDictionaryRequest::getName, ListDictionaryRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDictionaryRequest, UpdateDictionaryResponse> updateDictionary =
        genForUpdateDictionary();

    private static HttpRequestDef<UpdateDictionaryRequest, UpdateDictionaryResponse> genForUpdateDictionary() {
        // basic
        HttpRequestDef.Builder<UpdateDictionaryRequest, UpdateDictionaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDictionaryRequest.class, UpdateDictionaryResponse.class)
                .withName("UpdateDictionary")
                .withUri("/v2/{project_id}/instances/{instance_id}/dictionaries/{dict_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("dict_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDictionaryRequest::getDictId, UpdateDictionaryRequest::setDictId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDictionaryRequest::getInstanceId, UpdateDictionaryRequest::setInstanceId));
        builder.<UpdateDictionary>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDictionary.class),
            f -> f.withMarshaller(UpdateDictionaryRequest::getBody, UpdateDictionaryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateDictionaryRequest, ValidateDictionaryResponse> validateDictionary =
        genForValidateDictionary();

    private static HttpRequestDef<ValidateDictionaryRequest, ValidateDictionaryResponse> genForValidateDictionary() {
        // basic
        HttpRequestDef.Builder<ValidateDictionaryRequest, ValidateDictionaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ValidateDictionaryRequest.class, ValidateDictionaryResponse.class)
                .withName("ValidateDictionary")
                .withUri("/v2/{project_id}/instances/{instance_id}/validate-dictionaries")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateDictionaryRequest::getInstanceId, ValidateDictionaryRequest::setInstanceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateDictionaryRequest::getName, ValidateDictionaryRequest::setName));
        builder.<String>withRequestField("code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateDictionaryRequest::getCode, ValidateDictionaryRequest::setCode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckRomaInstanceListV2Request, CheckRomaInstanceListV2Response> checkRomaInstanceListV2 =
        genForCheckRomaInstanceListV2();

    private static HttpRequestDef<CheckRomaInstanceListV2Request, CheckRomaInstanceListV2Response> genForCheckRomaInstanceListV2() {
        // basic
        HttpRequestDef.Builder<CheckRomaInstanceListV2Request, CheckRomaInstanceListV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, CheckRomaInstanceListV2Request.class, CheckRomaInstanceListV2Response.class)
            .withName("CheckRomaInstanceListV2")
            .withUri("/v2/{project_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckRomaInstanceListV2Request::getStatus,
                CheckRomaInstanceListV2Request::setStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckRomaInstanceListV2Request::getOffset,
                CheckRomaInstanceListV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckRomaInstanceListV2Request::getLimit, CheckRomaInstanceListV2Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMqsInstanceRequest, ListMqsInstanceResponse> listMqsInstance =
        genForListMqsInstance();

    private static HttpRequestDef<ListMqsInstanceRequest, ListMqsInstanceResponse> genForListMqsInstance() {
        // basic
        HttpRequestDef.Builder<ListMqsInstanceRequest, ListMqsInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMqsInstanceRequest.class, ListMqsInstanceResponse.class)
                .withName("ListMqsInstance")
                .withUri("/v2/{project_id}/mqs/instances")
                .withContentType("application/json");

        // requests
        builder.<ListMqsInstanceRequest.IncludeInternalEnum>withRequestField("include_internal",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMqsInstanceRequest.IncludeInternalEnum.class),
            f -> f.withMarshaller(ListMqsInstanceRequest::getIncludeInternal,
                ListMqsInstanceRequest::setIncludeInternal));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMqsInstanceRequest, ShowMqsInstanceResponse> showMqsInstance =
        genForShowMqsInstance();

    private static HttpRequestDef<ShowMqsInstanceRequest, ShowMqsInstanceResponse> genForShowMqsInstance() {
        // basic
        HttpRequestDef.Builder<ShowMqsInstanceRequest, ShowMqsInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMqsInstanceRequest.class, ShowMqsInstanceResponse.class)
                .withName("ShowMqsInstance")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMqsInstanceRequest::getInstanceId, ShowMqsInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> exportApiDefinitionsV2 =
        genForExportApiDefinitionsV2();

    private static HttpRequestDef<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> genForExportApiDefinitionsV2() {
        // basic
        HttpRequestDef.Builder<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExportApiDefinitionsV2Request.class, ExportApiDefinitionsV2Response.class)
            .withName("ExportApiDefinitionsV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/openapi/export")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportApiDefinitionsV2Request::getInstanceId,
                ExportApiDefinitionsV2Request::setInstanceId));
        builder.<ExportOpenApiReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportOpenApiReq.class),
            f -> f.withMarshaller(ExportApiDefinitionsV2Request::getBody, ExportApiDefinitionsV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportLiveDataApiDefinitionsV2Request, ExportLiveDataApiDefinitionsV2Response> exportLiveDataApiDefinitionsV2 =
        genForExportLiveDataApiDefinitionsV2();

    private static HttpRequestDef<ExportLiveDataApiDefinitionsV2Request, ExportLiveDataApiDefinitionsV2Response> genForExportLiveDataApiDefinitionsV2() {
        // basic
        HttpRequestDef.Builder<ExportLiveDataApiDefinitionsV2Request, ExportLiveDataApiDefinitionsV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExportLiveDataApiDefinitionsV2Request.class,
                    ExportLiveDataApiDefinitionsV2Response.class)
                .withName("ExportLiveDataApiDefinitionsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/openapi/livedata-apis/export")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportLiveDataApiDefinitionsV2Request::getInstanceId,
                ExportLiveDataApiDefinitionsV2Request::setInstanceId));
        builder.<LiveDataExportReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LiveDataExportReq.class),
            f -> f.withMarshaller(ExportLiveDataApiDefinitionsV2Request::getBody,
                ExportLiveDataApiDefinitionsV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> importApiDefinitionsV2 =
        genForImportApiDefinitionsV2();

    private static HttpRequestDef<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> genForImportApiDefinitionsV2() {
        // basic
        HttpRequestDef.Builder<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, ImportApiDefinitionsV2Request.class, ImportApiDefinitionsV2Response.class)
            .withName("ImportApiDefinitionsV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/openapi/import")
            .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportApiDefinitionsV2Request::getInstanceId,
                ImportApiDefinitionsV2Request::setInstanceId));
        builder.<ImportApiDefinitionsV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportApiDefinitionsV2RequestBody.class),
            f -> f.withMarshaller(ImportApiDefinitionsV2Request::getBody, ImportApiDefinitionsV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportLiveDataApiDefinitionsV2Request, ImportLiveDataApiDefinitionsV2Response> importLiveDataApiDefinitionsV2 =
        genForImportLiveDataApiDefinitionsV2();

    private static HttpRequestDef<ImportLiveDataApiDefinitionsV2Request, ImportLiveDataApiDefinitionsV2Response> genForImportLiveDataApiDefinitionsV2() {
        // basic
        HttpRequestDef.Builder<ImportLiveDataApiDefinitionsV2Request, ImportLiveDataApiDefinitionsV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ImportLiveDataApiDefinitionsV2Request.class,
                    ImportLiveDataApiDefinitionsV2Response.class)
                .withName("ImportLiveDataApiDefinitionsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/openapi/livedata-apis/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportLiveDataApiDefinitionsV2Request::getInstanceId,
                ImportLiveDataApiDefinitionsV2Request::setInstanceId));
        builder.<ImportLiveDataApiDefinitionsV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportLiveDataApiDefinitionsV2RequestBody.class),
            f -> f.withMarshaller(ImportLiveDataApiDefinitionsV2Request::getBody,
                ImportLiveDataApiDefinitionsV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response> batchAssociateCertsV2 =
        genForBatchAssociateCertsV2();

    private static HttpRequestDef<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response> genForBatchAssociateCertsV2() {
        // basic
        HttpRequestDef.Builder<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAssociateCertsV2Request.class, BatchAssociateCertsV2Response.class)
            .withName("BatchAssociateCertsV2")
            .withUri(
                "/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificates/attach")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAssociateCertsV2Request::getInstanceId,
                BatchAssociateCertsV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAssociateCertsV2Request::getGroupId, BatchAssociateCertsV2Request::setGroupId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAssociateCertsV2Request::getDomainId,
                BatchAssociateCertsV2Request::setDomainId));
        builder.<AttachOrDetachCertsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachOrDetachCertsReqBody.class),
            f -> f.withMarshaller(BatchAssociateCertsV2Request::getBody, BatchAssociateCertsV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAssociateDomainsV2Request, BatchAssociateDomainsV2Response> batchAssociateDomainsV2 =
        genForBatchAssociateDomainsV2();

    private static HttpRequestDef<BatchAssociateDomainsV2Request, BatchAssociateDomainsV2Response> genForBatchAssociateDomainsV2() {
        // basic
        HttpRequestDef.Builder<BatchAssociateDomainsV2Request, BatchAssociateDomainsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAssociateDomainsV2Request.class, BatchAssociateDomainsV2Response.class)
            .withName("BatchAssociateDomainsV2")
            .withUri("/v2/{project_id}/apic/certificates/{certificate_id}/domains/attach")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAssociateDomainsV2Request::getCertificateId,
                BatchAssociateDomainsV2Request::setCertificateId));
        builder.<AttachOrDetachDomainsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachOrDetachDomainsReqBody.class),
            f -> f.withMarshaller(BatchAssociateDomainsV2Request::getBody, BatchAssociateDomainsV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisassociateCertsV2Request, BatchDisassociateCertsV2Response> batchDisassociateCertsV2 =
        genForBatchDisassociateCertsV2();

    private static HttpRequestDef<BatchDisassociateCertsV2Request, BatchDisassociateCertsV2Response> genForBatchDisassociateCertsV2() {
        // basic
        HttpRequestDef.Builder<BatchDisassociateCertsV2Request, BatchDisassociateCertsV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchDisassociateCertsV2Request.class, BatchDisassociateCertsV2Response.class)
                .withName("BatchDisassociateCertsV2")
                .withUri(
                    "/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificates/detach")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisassociateCertsV2Request::getInstanceId,
                BatchDisassociateCertsV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisassociateCertsV2Request::getGroupId,
                BatchDisassociateCertsV2Request::setGroupId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisassociateCertsV2Request::getDomainId,
                BatchDisassociateCertsV2Request::setDomainId));
        builder.<AttachOrDetachCertsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachOrDetachCertsReqBody.class),
            f -> f.withMarshaller(BatchDisassociateCertsV2Request::getBody, BatchDisassociateCertsV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisassociateDomainsV2Request, BatchDisassociateDomainsV2Response> batchDisassociateDomainsV2 =
        genForBatchDisassociateDomainsV2();

    private static HttpRequestDef<BatchDisassociateDomainsV2Request, BatchDisassociateDomainsV2Response> genForBatchDisassociateDomainsV2() {
        // basic
        HttpRequestDef.Builder<BatchDisassociateDomainsV2Request, BatchDisassociateDomainsV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDisassociateDomainsV2Request.class,
                    BatchDisassociateDomainsV2Response.class)
                .withName("BatchDisassociateDomainsV2")
                .withUri("/v2/{project_id}/apic/certificates/{certificate_id}/domains/detach")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisassociateDomainsV2Request::getCertificateId,
                BatchDisassociateDomainsV2Request::setCertificateId));
        builder.<AttachOrDetachDomainsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachOrDetachDomainsReqBody.class),
            f -> f.withMarshaller(BatchDisassociateDomainsV2Request::getBody,
                BatchDisassociateDomainsV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateV2Request, CreateCertificateV2Response> createCertificateV2 =
        genForCreateCertificateV2();

    private static HttpRequestDef<CreateCertificateV2Request, CreateCertificateV2Response> genForCreateCertificateV2() {
        // basic
        HttpRequestDef.Builder<CreateCertificateV2Request, CreateCertificateV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertificateV2Request.class, CreateCertificateV2Response.class)
                .withName("CreateCertificateV2")
                .withUri("/v2/{project_id}/apic/certificates")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CertificateForm>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CertificateForm.class),
            f -> f.withMarshaller(CreateCertificateV2Request::getBody, CreateCertificateV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateV2Request, DeleteCertificateV2Response> deleteCertificateV2 =
        genForDeleteCertificateV2();

    private static HttpRequestDef<DeleteCertificateV2Request, DeleteCertificateV2Response> genForDeleteCertificateV2() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateV2Request, DeleteCertificateV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteCertificateV2Request.class, DeleteCertificateV2Response.class)
            .withName("DeleteCertificateV2")
            .withUri("/v2/{project_id}/apic/certificates/{certificate_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateV2Request::getCertificateId,
                DeleteCertificateV2Request::setCertificateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttachedDomainsV2Request, ListAttachedDomainsV2Response> listAttachedDomainsV2 =
        genForListAttachedDomainsV2();

    private static HttpRequestDef<ListAttachedDomainsV2Request, ListAttachedDomainsV2Response> genForListAttachedDomainsV2() {
        // basic
        HttpRequestDef.Builder<ListAttachedDomainsV2Request, ListAttachedDomainsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAttachedDomainsV2Request.class, ListAttachedDomainsV2Response.class)
            .withName("ListAttachedDomainsV2")
            .withUri("/v2/{project_id}/apic/certificates/{certificate_id}/attached-domains")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachedDomainsV2Request::getCertificateId,
                ListAttachedDomainsV2Request::setCertificateId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttachedDomainsV2Request::getOffset, ListAttachedDomainsV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttachedDomainsV2Request::getLimit, ListAttachedDomainsV2Request::setLimit));
        builder.<String>withRequestField("url_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachedDomainsV2Request::getUrlDomain,
                ListAttachedDomainsV2Request::setUrlDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesV2Request, ListCertificatesV2Response> listCertificatesV2 =
        genForListCertificatesV2();

    private static HttpRequestDef<ListCertificatesV2Request, ListCertificatesV2Response> genForListCertificatesV2() {
        // basic
        HttpRequestDef.Builder<ListCertificatesV2Request, ListCertificatesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesV2Request.class, ListCertificatesV2Response.class)
                .withName("ListCertificatesV2")
                .withUri("/v2/{project_id}/apic/certificates")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getOffset, ListCertificatesV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getLimit, ListCertificatesV2Request::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getName, ListCertificatesV2Request::setName));
        builder.<String>withRequestField("common_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getCommonName, ListCertificatesV2Request::setCommonName));
        builder.<String>withRequestField("signature_algorithm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getSignatureAlgorithm,
                ListCertificatesV2Request::setSignatureAlgorithm));
        builder.<ListCertificatesV2Request.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCertificatesV2Request.TypeEnum.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getType, ListCertificatesV2Request::setType));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getInstanceId, ListCertificatesV2Request::setInstanceId));
        builder.<ListCertificatesV2Request.AlgorithmTypeEnum>withRequestField("algorithm_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCertificatesV2Request.AlgorithmTypeEnum.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getAlgorithmType,
                ListCertificatesV2Request::setAlgorithmType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfCertificateV2Request, ShowDetailsOfCertificateV2Response> showDetailsOfCertificateV2 =
        genForShowDetailsOfCertificateV2();

    private static HttpRequestDef<ShowDetailsOfCertificateV2Request, ShowDetailsOfCertificateV2Response> genForShowDetailsOfCertificateV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfCertificateV2Request, ShowDetailsOfCertificateV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfCertificateV2Request.class,
                    ShowDetailsOfCertificateV2Response.class)
                .withName("ShowDetailsOfCertificateV2")
                .withUri("/v2/{project_id}/apic/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfCertificateV2Request::getCertificateId,
                ShowDetailsOfCertificateV2Request::setCertificateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateV2Request, UpdateCertificateV2Response> updateCertificateV2 =
        genForUpdateCertificateV2();

    private static HttpRequestDef<UpdateCertificateV2Request, UpdateCertificateV2Response> genForUpdateCertificateV2() {
        // basic
        HttpRequestDef.Builder<UpdateCertificateV2Request, UpdateCertificateV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCertificateV2Request.class, UpdateCertificateV2Response.class)
                .withName("UpdateCertificateV2")
                .withUri("/v2/{project_id}/apic/certificates/{certificate_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateV2Request::getCertificateId,
                UpdateCertificateV2Request::setCertificateId));
        builder.<CertificateForm>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CertificateForm.class),
            f -> f.withMarshaller(UpdateCertificateV2Request::getBody, UpdateCertificateV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> addingBackendInstancesV2 =
        genForAddingBackendInstancesV2();

    private static HttpRequestDef<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> genForAddingBackendInstancesV2() {
        // basic
        HttpRequestDef.Builder<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, AddingBackendInstancesV2Request.class, AddingBackendInstancesV2Response.class)
                .withName("AddingBackendInstancesV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddingBackendInstancesV2Request::getInstanceId,
                AddingBackendInstancesV2Request::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddingBackendInstancesV2Request::getVpcChannelId,
                AddingBackendInstancesV2Request::setVpcChannelId));
        builder.<VpcMemberCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpcMemberCreate.class),
            f -> f.withMarshaller(AddingBackendInstancesV2Request::getBody, AddingBackendInstancesV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisableMembersRequest, BatchDisableMembersResponse> batchDisableMembers =
        genForBatchDisableMembers();

    private static HttpRequestDef<BatchDisableMembersRequest, BatchDisableMembersResponse> genForBatchDisableMembers() {
        // basic
        HttpRequestDef.Builder<BatchDisableMembersRequest, BatchDisableMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDisableMembersRequest.class, BatchDisableMembersResponse.class)
                .withName("BatchDisableMembers")
                .withUri(
                    "/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members/batch-disable")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisableMembersRequest::getInstanceId,
                BatchDisableMembersRequest::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisableMembersRequest::getVpcChannelId,
                BatchDisableMembersRequest::setVpcChannelId));
        builder.<MembersBatchEnableOrDisable>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MembersBatchEnableOrDisable.class),
            f -> f.withMarshaller(BatchDisableMembersRequest::getBody, BatchDisableMembersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchEnableMembersRequest, BatchEnableMembersResponse> batchEnableMembers =
        genForBatchEnableMembers();

    private static HttpRequestDef<BatchEnableMembersRequest, BatchEnableMembersResponse> genForBatchEnableMembers() {
        // basic
        HttpRequestDef.Builder<BatchEnableMembersRequest, BatchEnableMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchEnableMembersRequest.class, BatchEnableMembersResponse.class)
                .withName("BatchEnableMembers")
                .withUri(
                    "/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members/batch-enable")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchEnableMembersRequest::getInstanceId, BatchEnableMembersRequest::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchEnableMembersRequest::getVpcChannelId,
                BatchEnableMembersRequest::setVpcChannelId));
        builder.<MembersBatchEnableOrDisable>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MembersBatchEnableOrDisable.class),
            f -> f.withMarshaller(BatchEnableMembersRequest::getBody, BatchEnableMembersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMemberGroupRequest, CreateMemberGroupResponse> createMemberGroup =
        genForCreateMemberGroup();

    private static HttpRequestDef<CreateMemberGroupRequest, CreateMemberGroupResponse> genForCreateMemberGroup() {
        // basic
        HttpRequestDef.Builder<CreateMemberGroupRequest, CreateMemberGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMemberGroupRequest.class, CreateMemberGroupResponse.class)
                .withName("CreateMemberGroup")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMemberGroupRequest::getInstanceId, CreateMemberGroupRequest::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMemberGroupRequest::getVpcChannelId,
                CreateMemberGroupRequest::setVpcChannelId));
        builder.<MemberGroupCreateBatch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MemberGroupCreateBatch.class),
            f -> f.withMarshaller(CreateMemberGroupRequest::getBody, CreateMemberGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectVpcChannelRequest, CreateProjectVpcChannelResponse> createProjectVpcChannel =
        genForCreateProjectVpcChannel();

    private static HttpRequestDef<CreateProjectVpcChannelRequest, CreateProjectVpcChannelResponse> genForCreateProjectVpcChannel() {
        // basic
        HttpRequestDef.Builder<CreateProjectVpcChannelRequest, CreateProjectVpcChannelResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateProjectVpcChannelRequest.class, CreateProjectVpcChannelResponse.class)
            .withName("CreateProjectVpcChannel")
            .withUri("/v2/{project_id}/apic/vpc-channels")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ProjectVpcCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProjectVpcCreate.class),
            f -> f.withMarshaller(CreateProjectVpcChannelRequest::getBody, CreateProjectVpcChannelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectVpcChannelSyncsRequest, CreateProjectVpcChannelSyncsResponse> createProjectVpcChannelSyncs =
        genForCreateProjectVpcChannelSyncs();

    private static HttpRequestDef<CreateProjectVpcChannelSyncsRequest, CreateProjectVpcChannelSyncsResponse> genForCreateProjectVpcChannelSyncs() {
        // basic
        HttpRequestDef.Builder<CreateProjectVpcChannelSyncsRequest, CreateProjectVpcChannelSyncsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateProjectVpcChannelSyncsRequest.class,
                    CreateProjectVpcChannelSyncsResponse.class)
                .withName("CreateProjectVpcChannelSyncs")
                .withUri("/v2/{project_id}/apic/vpc-channels/syncs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ProjectVpcSync>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProjectVpcSync.class),
            f -> f.withMarshaller(CreateProjectVpcChannelSyncsRequest::getBody,
                CreateProjectVpcChannelSyncsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcChannelV2Request, CreateVpcChannelV2Response> createVpcChannelV2 =
        genForCreateVpcChannelV2();

    private static HttpRequestDef<CreateVpcChannelV2Request, CreateVpcChannelV2Response> genForCreateVpcChannelV2() {
        // basic
        HttpRequestDef.Builder<CreateVpcChannelV2Request, CreateVpcChannelV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcChannelV2Request.class, CreateVpcChannelV2Response.class)
                .withName("CreateVpcChannelV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpcChannelV2Request::getInstanceId, CreateVpcChannelV2Request::setInstanceId));
        builder.<VpcCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpcCreate.class),
            f -> f.withMarshaller(CreateVpcChannelV2Request::getBody, CreateVpcChannelV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> deleteBackendInstanceV2 =
        genForDeleteBackendInstanceV2();

    private static HttpRequestDef<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> genForDeleteBackendInstanceV2() {
        // basic
        HttpRequestDef.Builder<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBackendInstanceV2Request.class, DeleteBackendInstanceV2Response.class)
            .withName("DeleteBackendInstanceV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members/{member_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackendInstanceV2Request::getInstanceId,
                DeleteBackendInstanceV2Request::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackendInstanceV2Request::getVpcChannelId,
                DeleteBackendInstanceV2Request::setVpcChannelId));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackendInstanceV2Request::getMemberId,
                DeleteBackendInstanceV2Request::setMemberId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberGroupRequest, DeleteMemberGroupResponse> deleteMemberGroup =
        genForDeleteMemberGroup();

    private static HttpRequestDef<DeleteMemberGroupRequest, DeleteMemberGroupResponse> genForDeleteMemberGroup() {
        // basic
        HttpRequestDef.Builder<DeleteMemberGroupRequest, DeleteMemberGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMemberGroupRequest.class, DeleteMemberGroupResponse.class)
            .withName("DeleteMemberGroup")
            .withUri(
                "/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups/{member_group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberGroupRequest::getInstanceId, DeleteMemberGroupRequest::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberGroupRequest::getVpcChannelId,
                DeleteMemberGroupRequest::setVpcChannelId));
        builder.<String>withRequestField("member_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberGroupRequest::getMemberGroupId,
                DeleteMemberGroupRequest::setMemberGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> deleteVpcChannelV2 =
        genForDeleteVpcChannelV2();

    private static HttpRequestDef<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> genForDeleteVpcChannelV2() {
        // basic
        HttpRequestDef.Builder<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcChannelV2Request.class, DeleteVpcChannelV2Response.class)
                .withName("DeleteVpcChannelV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcChannelV2Request::getInstanceId, DeleteVpcChannelV2Request::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcChannelV2Request::getVpcChannelId,
                DeleteVpcChannelV2Request::setVpcChannelId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackendInstancesV2Request, ListBackendInstancesV2Response> listBackendInstancesV2 =
        genForListBackendInstancesV2();

    private static HttpRequestDef<ListBackendInstancesV2Request, ListBackendInstancesV2Response> genForListBackendInstancesV2() {
        // basic
        HttpRequestDef.Builder<ListBackendInstancesV2Request, ListBackendInstancesV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListBackendInstancesV2Request.class, ListBackendInstancesV2Response.class)
            .withName("ListBackendInstancesV2")
            .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getInstanceId,
                ListBackendInstancesV2Request::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getVpcChannelId,
                ListBackendInstancesV2Request::setVpcChannelId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getOffset, ListBackendInstancesV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getLimit, ListBackendInstancesV2Request::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getName, ListBackendInstancesV2Request::setName));
        builder.<String>withRequestField("member_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getMemberGroupName,
                ListBackendInstancesV2Request::setMemberGroupName));
        builder.<String>withRequestField("member_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getMemberGroupId,
                ListBackendInstancesV2Request::setMemberGroupId));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getPreciseSearch,
                ListBackendInstancesV2Request::setPreciseSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMemberGroupsRequest, ListMemberGroupsResponse> listMemberGroups =
        genForListMemberGroups();

    private static HttpRequestDef<ListMemberGroupsRequest, ListMemberGroupsResponse> genForListMemberGroups() {
        // basic
        HttpRequestDef.Builder<ListMemberGroupsRequest, ListMemberGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMemberGroupsRequest.class, ListMemberGroupsResponse.class)
                .withName("ListMemberGroups")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberGroupsRequest::getInstanceId, ListMemberGroupsRequest::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberGroupsRequest::getVpcChannelId, ListMemberGroupsRequest::setVpcChannelId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListMemberGroupsRequest::getOffset, ListMemberGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMemberGroupsRequest::getLimit, ListMemberGroupsRequest::setLimit));
        builder.<String>withRequestField("dict_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberGroupsRequest::getDictCode, ListMemberGroupsRequest::setDictCode));
        builder.<String>withRequestField("member_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberGroupsRequest::getMemberGroupName,
                ListMemberGroupsRequest::setMemberGroupName));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberGroupsRequest::getPreciseSearch,
                ListMemberGroupsRequest::setPreciseSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectVpcChannelsV2Request, ListProjectVpcChannelsV2Response> listProjectVpcChannelsV2 =
        genForListProjectVpcChannelsV2();

    private static HttpRequestDef<ListProjectVpcChannelsV2Request, ListProjectVpcChannelsV2Response> genForListProjectVpcChannelsV2() {
        // basic
        HttpRequestDef.Builder<ListProjectVpcChannelsV2Request, ListProjectVpcChannelsV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListProjectVpcChannelsV2Request.class, ListProjectVpcChannelsV2Response.class)
                .withName("ListProjectVpcChannelsV2")
                .withUri("/v2/{project_id}/apic/vpc-channels")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProjectVpcChannelsV2Request::getOffset,
                ListProjectVpcChannelsV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectVpcChannelsV2Request::getLimit,
                ListProjectVpcChannelsV2Request::setLimit));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectVpcChannelsV2Request::getId, ListProjectVpcChannelsV2Request::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectVpcChannelsV2Request::getName, ListProjectVpcChannelsV2Request::setName));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectVpcChannelsV2Request::getPreciseSearch,
                ListProjectVpcChannelsV2Request::setPreciseSearch));
        builder.<String>withRequestField("member_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectVpcChannelsV2Request::getMemberHost,
                ListProjectVpcChannelsV2Request::setMemberHost));
        builder.<Integer>withRequestField("member_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectVpcChannelsV2Request::getMemberPort,
                ListProjectVpcChannelsV2Request::setMemberPort));
        builder.<String>withRequestField("member_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectVpcChannelsV2Request::getMemberGroupName,
                ListProjectVpcChannelsV2Request::setMemberGroupName));
        builder.<String>withRequestField("member_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectVpcChannelsV2Request::getMemberGroupId,
                ListProjectVpcChannelsV2Request::setMemberGroupId));
        builder.<Boolean>withRequestField("members_return",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListProjectVpcChannelsV2Request::getMembersReturn,
                ListProjectVpcChannelsV2Request::setMembersReturn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcChannelsV2Request, ListVpcChannelsV2Response> listVpcChannelsV2 =
        genForListVpcChannelsV2();

    private static HttpRequestDef<ListVpcChannelsV2Request, ListVpcChannelsV2Response> genForListVpcChannelsV2() {
        // basic
        HttpRequestDef.Builder<ListVpcChannelsV2Request, ListVpcChannelsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcChannelsV2Request.class, ListVpcChannelsV2Response.class)
                .withName("ListVpcChannelsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getInstanceId, ListVpcChannelsV2Request::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getOffset, ListVpcChannelsV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getLimit, ListVpcChannelsV2Request::setLimit));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getId, ListVpcChannelsV2Request::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getName, ListVpcChannelsV2Request::setName));
        builder.<String>withRequestField("dict_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getDictCode, ListVpcChannelsV2Request::setDictCode));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getPreciseSearch,
                ListVpcChannelsV2Request::setPreciseSearch));
        builder.<String>withRequestField("member_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getMemberHost, ListVpcChannelsV2Request::setMemberHost));
        builder.<Integer>withRequestField("member_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getMemberPort, ListVpcChannelsV2Request::setMemberPort));
        builder.<String>withRequestField("member_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getMemberGroupName,
                ListVpcChannelsV2Request::setMemberGroupName));
        builder.<String>withRequestField("member_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getMemberGroupId,
                ListVpcChannelsV2Request::setMemberGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfMemberGroupRequest, ShowDetailsOfMemberGroupResponse> showDetailsOfMemberGroup =
        genForShowDetailsOfMemberGroup();

    private static HttpRequestDef<ShowDetailsOfMemberGroupRequest, ShowDetailsOfMemberGroupResponse> genForShowDetailsOfMemberGroup() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfMemberGroupRequest, ShowDetailsOfMemberGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDetailsOfMemberGroupRequest.class, ShowDetailsOfMemberGroupResponse.class)
                .withName("ShowDetailsOfMemberGroup")
                .withUri(
                    "/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups/{member_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfMemberGroupRequest::getInstanceId,
                ShowDetailsOfMemberGroupRequest::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfMemberGroupRequest::getVpcChannelId,
                ShowDetailsOfMemberGroupRequest::setVpcChannelId));
        builder.<String>withRequestField("member_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfMemberGroupRequest::getMemberGroupId,
                ShowDetailsOfMemberGroupRequest::setMemberGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> showDetailsOfVpcChannelV2 =
        genForShowDetailsOfVpcChannelV2();

    private static HttpRequestDef<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> genForShowDetailsOfVpcChannelV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfVpcChannelV2Request.class,
                    ShowDetailsOfVpcChannelV2Response.class)
                .withName("ShowDetailsOfVpcChannelV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfVpcChannelV2Request::getInstanceId,
                ShowDetailsOfVpcChannelV2Request::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfVpcChannelV2Request::getVpcChannelId,
                ShowDetailsOfVpcChannelV2Request::setVpcChannelId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response> updateBackendInstancesV2 =
        genForUpdateBackendInstancesV2();

    private static HttpRequestDef<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response> genForUpdateBackendInstancesV2() {
        // basic
        HttpRequestDef.Builder<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateBackendInstancesV2Request.class, UpdateBackendInstancesV2Response.class)
                .withName("UpdateBackendInstancesV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBackendInstancesV2Request::getInstanceId,
                UpdateBackendInstancesV2Request::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBackendInstancesV2Request::getVpcChannelId,
                UpdateBackendInstancesV2Request::setVpcChannelId));
        builder.<VpcMemberModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpcMemberModify.class),
            f -> f.withMarshaller(UpdateBackendInstancesV2Request::getBody, UpdateBackendInstancesV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHealthCheckRequest, UpdateHealthCheckResponse> updateHealthCheck =
        genForUpdateHealthCheck();

    private static HttpRequestDef<UpdateHealthCheckRequest, UpdateHealthCheckResponse> genForUpdateHealthCheck() {
        // basic
        HttpRequestDef.Builder<UpdateHealthCheckRequest, UpdateHealthCheckResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHealthCheckRequest.class, UpdateHealthCheckResponse.class)
                .withName("UpdateHealthCheck")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/health-config")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHealthCheckRequest::getInstanceId, UpdateHealthCheckRequest::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHealthCheckRequest::getVpcChannelId,
                UpdateHealthCheckRequest::setVpcChannelId));
        builder.<VpcHealthConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpcHealthConfig.class),
            f -> f.withMarshaller(UpdateHealthCheckRequest::getBody, UpdateHealthCheckRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberGroupRequest, UpdateMemberGroupResponse> updateMemberGroup =
        genForUpdateMemberGroup();

    private static HttpRequestDef<UpdateMemberGroupRequest, UpdateMemberGroupResponse> genForUpdateMemberGroup() {
        // basic
        HttpRequestDef.Builder<UpdateMemberGroupRequest, UpdateMemberGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateMemberGroupRequest.class, UpdateMemberGroupResponse.class)
            .withName("UpdateMemberGroup")
            .withUri(
                "/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups/{member_group_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberGroupRequest::getInstanceId, UpdateMemberGroupRequest::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberGroupRequest::getVpcChannelId,
                UpdateMemberGroupRequest::setVpcChannelId));
        builder.<String>withRequestField("member_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberGroupRequest::getMemberGroupId,
                UpdateMemberGroupRequest::setMemberGroupId));
        builder.<MemberGroupCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MemberGroupCreate.class),
            f -> f.withMarshaller(UpdateMemberGroupRequest::getBody, UpdateMemberGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectVpcChannelRequest, UpdateProjectVpcChannelResponse> updateProjectVpcChannel =
        genForUpdateProjectVpcChannel();

    private static HttpRequestDef<UpdateProjectVpcChannelRequest, UpdateProjectVpcChannelResponse> genForUpdateProjectVpcChannel() {
        // basic
        HttpRequestDef.Builder<UpdateProjectVpcChannelRequest, UpdateProjectVpcChannelResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateProjectVpcChannelRequest.class, UpdateProjectVpcChannelResponse.class)
            .withName("UpdateProjectVpcChannel")
            .withUri("/v2/{project_id}/apic/vpc-channels")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ProjectVpcCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProjectVpcCreate.class),
            f -> f.withMarshaller(UpdateProjectVpcChannelRequest::getBody, UpdateProjectVpcChannelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> updateVpcChannelV2 =
        genForUpdateVpcChannelV2();

    private static HttpRequestDef<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> genForUpdateVpcChannelV2() {
        // basic
        HttpRequestDef.Builder<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpcChannelV2Request.class, UpdateVpcChannelV2Response.class)
                .withName("UpdateVpcChannelV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcChannelV2Request::getInstanceId, UpdateVpcChannelV2Request::setInstanceId));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcChannelV2Request::getVpcChannelId,
                UpdateVpcChannelV2Request::setVpcChannelId));
        builder.<VpcCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpcCreate.class),
            f -> f.withMarshaller(UpdateVpcChannelV2Request::getBody, UpdateVpcChannelV2Request::setBody));

        // response

        return builder.build();
    }

}
