package com.huaweicloud.sdk.apig.v2;

import com.huaweicloud.sdk.apig.v2.model.AcceptOrRejectEndpointConnectionsRequest;
import com.huaweicloud.sdk.apig.v2.model.AcceptOrRejectEndpointConnectionsResponse;
import com.huaweicloud.sdk.apig.v2.model.AclApiBindingCreate;
import com.huaweicloud.sdk.apig.v2.model.AclBatchDelete;
import com.huaweicloud.sdk.apig.v2.model.AclBindingBatchDelete;
import com.huaweicloud.sdk.apig.v2.model.AddCustomIngressPortRequest;
import com.huaweicloud.sdk.apig.v2.model.AddCustomIngressPortResponse;
import com.huaweicloud.sdk.apig.v2.model.AddEipV2Request;
import com.huaweicloud.sdk.apig.v2.model.AddEipV2Response;
import com.huaweicloud.sdk.apig.v2.model.AddEndpointPermissionsRequest;
import com.huaweicloud.sdk.apig.v2.model.AddEndpointPermissionsResponse;
import com.huaweicloud.sdk.apig.v2.model.AddEngressEipV2Request;
import com.huaweicloud.sdk.apig.v2.model.AddEngressEipV2Response;
import com.huaweicloud.sdk.apig.v2.model.AddIngressEipV2Request;
import com.huaweicloud.sdk.apig.v2.model.AddIngressEipV2Response;
import com.huaweicloud.sdk.apig.v2.model.AddingBackendInstancesV2Request;
import com.huaweicloud.sdk.apig.v2.model.AddingBackendInstancesV2Response;
import com.huaweicloud.sdk.apig.v2.model.ApiAclCreate;
import com.huaweicloud.sdk.apig.v2.model.ApiActionInfo;
import com.huaweicloud.sdk.apig.v2.model.ApiAuthCreate;
import com.huaweicloud.sdk.apig.v2.model.ApiBatchPublish;
import com.huaweicloud.sdk.apig.v2.model.ApiCheckInfoV2;
import com.huaweicloud.sdk.apig.v2.model.ApiCreate;
import com.huaweicloud.sdk.apig.v2.model.ApiDebugInfo;
import com.huaweicloud.sdk.apig.v2.model.ApiGroupBase;
import com.huaweicloud.sdk.apig.v2.model.ApiGroupCheck;
import com.huaweicloud.sdk.apig.v2.model.ApiGroupCreate;
import com.huaweicloud.sdk.apig.v2.model.ApiOperPluginInfo;
import com.huaweicloud.sdk.apig.v2.model.ApiVersion;
import com.huaweicloud.sdk.apig.v2.model.AppAclCreate;
import com.huaweicloud.sdk.apig.v2.model.AppCodeCreate;
import com.huaweicloud.sdk.apig.v2.model.AppCreate;
import com.huaweicloud.sdk.apig.v2.model.AppQuotaCreate;
import com.huaweicloud.sdk.apig.v2.model.AppResetCreate;
import com.huaweicloud.sdk.apig.v2.model.AssociateAppsForAppQuotaRequest;
import com.huaweicloud.sdk.apig.v2.model.AssociateAppsForAppQuotaResponse;
import com.huaweicloud.sdk.apig.v2.model.AssociateCertificateV2Request;
import com.huaweicloud.sdk.apig.v2.model.AssociateCertificateV2Response;
import com.huaweicloud.sdk.apig.v2.model.AssociateDomainV2Request;
import com.huaweicloud.sdk.apig.v2.model.AssociateDomainV2Response;
import com.huaweicloud.sdk.apig.v2.model.AssociateRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.apig.v2.model.AssociateRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.apig.v2.model.AssociateSignatureKeyV2Request;
import com.huaweicloud.sdk.apig.v2.model.AssociateSignatureKeyV2Response;
import com.huaweicloud.sdk.apig.v2.model.AttachApiToPluginRequest;
import com.huaweicloud.sdk.apig.v2.model.AttachApiToPluginResponse;
import com.huaweicloud.sdk.apig.v2.model.AttachOrDetachCertsReqBody;
import com.huaweicloud.sdk.apig.v2.model.AttachOrDetachDomainsReqBody;
import com.huaweicloud.sdk.apig.v2.model.AttachPluginToApiRequest;
import com.huaweicloud.sdk.apig.v2.model.AttachPluginToApiResponse;
import com.huaweicloud.sdk.apig.v2.model.AuthorizerCreate;
import com.huaweicloud.sdk.apig.v2.model.BaseSignature;
import com.huaweicloud.sdk.apig.v2.model.BatchAssociateCertsV2Request;
import com.huaweicloud.sdk.apig.v2.model.BatchAssociateCertsV2Response;
import com.huaweicloud.sdk.apig.v2.model.BatchAssociateDomainsV2Request;
import com.huaweicloud.sdk.apig.v2.model.BatchAssociateDomainsV2Response;
import com.huaweicloud.sdk.apig.v2.model.BatchCreateOrDeleteInstanceTagsRequest;
import com.huaweicloud.sdk.apig.v2.model.BatchCreateOrDeleteInstanceTagsResponse;
import com.huaweicloud.sdk.apig.v2.model.BatchDeleteAclV2Request;
import com.huaweicloud.sdk.apig.v2.model.BatchDeleteAclV2Response;
import com.huaweicloud.sdk.apig.v2.model.BatchDeleteApiAclBindingV2Request;
import com.huaweicloud.sdk.apig.v2.model.BatchDeleteApiAclBindingV2Response;
import com.huaweicloud.sdk.apig.v2.model.BatchDisableMembersRequest;
import com.huaweicloud.sdk.apig.v2.model.BatchDisableMembersResponse;
import com.huaweicloud.sdk.apig.v2.model.BatchDisassociateCertsV2Request;
import com.huaweicloud.sdk.apig.v2.model.BatchDisassociateCertsV2Response;
import com.huaweicloud.sdk.apig.v2.model.BatchDisassociateDomainsV2Request;
import com.huaweicloud.sdk.apig.v2.model.BatchDisassociateDomainsV2Response;
import com.huaweicloud.sdk.apig.v2.model.BatchDisassociateThrottlingPolicyV2Request;
import com.huaweicloud.sdk.apig.v2.model.BatchDisassociateThrottlingPolicyV2Response;
import com.huaweicloud.sdk.apig.v2.model.BatchEnableMembersRequest;
import com.huaweicloud.sdk.apig.v2.model.BatchEnableMembersResponse;
import com.huaweicloud.sdk.apig.v2.model.BatchPublishOrOfflineApiV2Request;
import com.huaweicloud.sdk.apig.v2.model.BatchPublishOrOfflineApiV2Response;
import com.huaweicloud.sdk.apig.v2.model.CancelingAuthorizationV2Request;
import com.huaweicloud.sdk.apig.v2.model.CancelingAuthorizationV2Response;
import com.huaweicloud.sdk.apig.v2.model.CertForm;
import com.huaweicloud.sdk.apig.v2.model.CertificateForm;
import com.huaweicloud.sdk.apig.v2.model.ChangeApiVersionV2Request;
import com.huaweicloud.sdk.apig.v2.model.ChangeApiVersionV2Response;
import com.huaweicloud.sdk.apig.v2.model.CheckApiGroupsV2Request;
import com.huaweicloud.sdk.apig.v2.model.CheckApiGroupsV2Response;
import com.huaweicloud.sdk.apig.v2.model.CheckApisV2Request;
import com.huaweicloud.sdk.apig.v2.model.CheckApisV2Response;
import com.huaweicloud.sdk.apig.v2.model.CheckAppV2Request;
import com.huaweicloud.sdk.apig.v2.model.CheckAppV2Response;
import com.huaweicloud.sdk.apig.v2.model.ConnectionActionReq;
import com.huaweicloud.sdk.apig.v2.model.CreateAclStrategyV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateAclStrategyV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateAnAppV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateAnAppV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateApiAclBindingV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateApiAclBindingV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateApiGroupV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateApiGroupV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateApiV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateApiV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateAppCodeAutoV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateAppCodeAutoV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateAppCodeV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateAppCodeV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateAppQuotaBindingApp;
import com.huaweicloud.sdk.apig.v2.model.CreateAppQuotaRequest;
import com.huaweicloud.sdk.apig.v2.model.CreateAppQuotaResponse;
import com.huaweicloud.sdk.apig.v2.model.CreateAuthorizingAppsV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateAuthorizingAppsV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateCertificateV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateCertificateV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateCustomAuthorizerV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateCustomAuthorizerV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateEnvironmentV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateEnvironmentV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateEnvironmentVariableV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateEnvironmentVariableV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateFeatureV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateFeatureV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateGatewayResponseV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateGatewayResponseV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateInstanceV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateInstanceV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateMemberGroupRequest;
import com.huaweicloud.sdk.apig.v2.model.CreateMemberGroupResponse;
import com.huaweicloud.sdk.apig.v2.model.CreateOrDeletePublishRecordForApiV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateOrDeletePublishRecordForApiV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateOrchestrationRequest;
import com.huaweicloud.sdk.apig.v2.model.CreateOrchestrationResponse;
import com.huaweicloud.sdk.apig.v2.model.CreateOrderRequest;
import com.huaweicloud.sdk.apig.v2.model.CreateOrderResponse;
import com.huaweicloud.sdk.apig.v2.model.CreatePluginRequest;
import com.huaweicloud.sdk.apig.v2.model.CreatePluginResponse;
import com.huaweicloud.sdk.apig.v2.model.CreatePostPayResizeOrderRequest;
import com.huaweicloud.sdk.apig.v2.model.CreatePostPayResizeOrderResponse;
import com.huaweicloud.sdk.apig.v2.model.CreatePrepayResizeRequest;
import com.huaweicloud.sdk.apig.v2.model.CreatePrepayResizeResponse;
import com.huaweicloud.sdk.apig.v2.model.CreateRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateSignatureKeyV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateSignatureKeyV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateSpecialThrottlingConfigurationV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateSpecialThrottlingConfigurationV2Response;
import com.huaweicloud.sdk.apig.v2.model.CreateVpcChannelV2Request;
import com.huaweicloud.sdk.apig.v2.model.CreateVpcChannelV2Response;
import com.huaweicloud.sdk.apig.v2.model.DebugApiV2Request;
import com.huaweicloud.sdk.apig.v2.model.DebugApiV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteAclV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteAclV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteApiAclBindingV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteApiAclBindingV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteApiByVersionIdV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteApiByVersionIdV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteApiGroupV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteApiGroupV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteApiV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteApiV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteAppAclRequest;
import com.huaweicloud.sdk.apig.v2.model.DeleteAppAclResponse;
import com.huaweicloud.sdk.apig.v2.model.DeleteAppCodeV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteAppCodeV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteAppQuotaRequest;
import com.huaweicloud.sdk.apig.v2.model.DeleteAppQuotaResponse;
import com.huaweicloud.sdk.apig.v2.model.DeleteAppV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteAppV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteBackendInstanceV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteBackendInstanceV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteCertificateV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteCertificateV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteCustomAuthorizerV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteCustomAuthorizerV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteCustomIngressPortRequest;
import com.huaweicloud.sdk.apig.v2.model.DeleteCustomIngressPortResponse;
import com.huaweicloud.sdk.apig.v2.model.DeleteEndpointPermissionsRequest;
import com.huaweicloud.sdk.apig.v2.model.DeleteEndpointPermissionsResponse;
import com.huaweicloud.sdk.apig.v2.model.DeleteEnvironmentV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteEnvironmentV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteEnvironmentVariableV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteEnvironmentVariableV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteGatewayResponseTypeV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteGatewayResponseTypeV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteGatewayResponseV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteGatewayResponseV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteInstancesV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteInstancesV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteMemberGroupRequest;
import com.huaweicloud.sdk.apig.v2.model.DeleteMemberGroupResponse;
import com.huaweicloud.sdk.apig.v2.model.DeleteOrchestrationRequest;
import com.huaweicloud.sdk.apig.v2.model.DeleteOrchestrationResponse;
import com.huaweicloud.sdk.apig.v2.model.DeletePluginRequest;
import com.huaweicloud.sdk.apig.v2.model.DeletePluginResponse;
import com.huaweicloud.sdk.apig.v2.model.DeleteRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteSignatureKeyV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteSignatureKeyV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteSpecialThrottlingConfigurationV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteSpecialThrottlingConfigurationV2Response;
import com.huaweicloud.sdk.apig.v2.model.DeleteVpcChannelV2Request;
import com.huaweicloud.sdk.apig.v2.model.DeleteVpcChannelV2Response;
import com.huaweicloud.sdk.apig.v2.model.DetachApiFromPluginRequest;
import com.huaweicloud.sdk.apig.v2.model.DetachApiFromPluginResponse;
import com.huaweicloud.sdk.apig.v2.model.DetachPluginFromApiRequest;
import com.huaweicloud.sdk.apig.v2.model.DetachPluginFromApiResponse;
import com.huaweicloud.sdk.apig.v2.model.DisassociateAppQuotaWithAppRequest;
import com.huaweicloud.sdk.apig.v2.model.DisassociateAppQuotaWithAppResponse;
import com.huaweicloud.sdk.apig.v2.model.DisassociateCertificateV2Request;
import com.huaweicloud.sdk.apig.v2.model.DisassociateCertificateV2Response;
import com.huaweicloud.sdk.apig.v2.model.DisassociateDomainV2Request;
import com.huaweicloud.sdk.apig.v2.model.DisassociateDomainV2Response;
import com.huaweicloud.sdk.apig.v2.model.DisassociateRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.apig.v2.model.DisassociateRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.apig.v2.model.DisassociateSignatureKeyV2Request;
import com.huaweicloud.sdk.apig.v2.model.DisassociateSignatureKeyV2Response;
import com.huaweicloud.sdk.apig.v2.model.EipBindReq;
import com.huaweicloud.sdk.apig.v2.model.EndpointPermissionList;
import com.huaweicloud.sdk.apig.v2.model.EnvCreate;
import com.huaweicloud.sdk.apig.v2.model.EnvVariableBase;
import com.huaweicloud.sdk.apig.v2.model.EnvVariableCreate;
import com.huaweicloud.sdk.apig.v2.model.ExportApiDefinitionsAsyncRequest;
import com.huaweicloud.sdk.apig.v2.model.ExportApiDefinitionsAsyncResponse;
import com.huaweicloud.sdk.apig.v2.model.ExportApiDefinitionsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ExportApiDefinitionsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ExportOpenApiReq;
import com.huaweicloud.sdk.apig.v2.model.FeatureToggle;
import com.huaweicloud.sdk.apig.v2.model.ImportApiDefinitionsAsyncRequest;
import com.huaweicloud.sdk.apig.v2.model.ImportApiDefinitionsAsyncRequestBody;
import com.huaweicloud.sdk.apig.v2.model.ImportApiDefinitionsAsyncResponse;
import com.huaweicloud.sdk.apig.v2.model.ImportApiDefinitionsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ImportApiDefinitionsV2RequestBody;
import com.huaweicloud.sdk.apig.v2.model.ImportApiDefinitionsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ImportMicroserviceRequest;
import com.huaweicloud.sdk.apig.v2.model.ImportMicroserviceResponse;
import com.huaweicloud.sdk.apig.v2.model.IngressPortCreate;
import com.huaweicloud.sdk.apig.v2.model.InstanceChangeOrderReq;
import com.huaweicloud.sdk.apig.v2.model.InstanceCreateReq;
import com.huaweicloud.sdk.apig.v2.model.InstanceModReq;
import com.huaweicloud.sdk.apig.v2.model.InstanceOrderReq;
import com.huaweicloud.sdk.apig.v2.model.ListAclPolicyBindedToApiV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListAclPolicyBindedToApiV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListAclStrategiesV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListAclStrategiesV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApiAttachablePluginsRequest;
import com.huaweicloud.sdk.apig.v2.model.ListApiAttachablePluginsResponse;
import com.huaweicloud.sdk.apig.v2.model.ListApiAttachedPluginsRequest;
import com.huaweicloud.sdk.apig.v2.model.ListApiAttachedPluginsResponse;
import com.huaweicloud.sdk.apig.v2.model.ListApiGroupsQuantitiesV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApiGroupsQuantitiesV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApiGroupsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApiGroupsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApiQuantitiesV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApiQuantitiesV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApiRuntimeDefinitionV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApiRuntimeDefinitionV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApiVersionDetailV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApiVersionDetailV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApiVersionsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApiVersionsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApisBindedToAclPolicyV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApisBindedToAclPolicyV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApisBindedToAppV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApisBindedToAppV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApisBindedToRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApisBindedToRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApisBindedToSignatureKeyV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApisBindedToSignatureKeyV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApisNotBoundWithSignatureKeyV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApisNotBoundWithSignatureKeyV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApisUnbindedToAclPolicyV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApisUnbindedToAclPolicyV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApisUnbindedToAppV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApisUnbindedToAppV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApisUnbindedToRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApisUnbindedToRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListApisV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListApisV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListAppCodesV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListAppCodesV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListAppQuantitiesV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListAppQuantitiesV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListAppQuotaBindableAppsRequest;
import com.huaweicloud.sdk.apig.v2.model.ListAppQuotaBindableAppsResponse;
import com.huaweicloud.sdk.apig.v2.model.ListAppQuotaBoundAppsRequest;
import com.huaweicloud.sdk.apig.v2.model.ListAppQuotaBoundAppsResponse;
import com.huaweicloud.sdk.apig.v2.model.ListAppQuotasRequest;
import com.huaweicloud.sdk.apig.v2.model.ListAppQuotasResponse;
import com.huaweicloud.sdk.apig.v2.model.ListAppsBindedToApiV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListAppsBindedToApiV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListAppsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListAppsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListAttachedDomainsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListAttachedDomainsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListAvailableZonesV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListAvailableZonesV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListBackendInstancesV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListBackendInstancesV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListCertificatesV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListCertificatesV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListCustomAuthorizersV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListCustomAuthorizersV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListCustomIngressPortDomainsRequest;
import com.huaweicloud.sdk.apig.v2.model.ListCustomIngressPortDomainsResponse;
import com.huaweicloud.sdk.apig.v2.model.ListCustomIngressPortsRequest;
import com.huaweicloud.sdk.apig.v2.model.ListCustomIngressPortsResponse;
import com.huaweicloud.sdk.apig.v2.model.ListEndpointConnectionsRequest;
import com.huaweicloud.sdk.apig.v2.model.ListEndpointConnectionsResponse;
import com.huaweicloud.sdk.apig.v2.model.ListEndpointPermissionsRequest;
import com.huaweicloud.sdk.apig.v2.model.ListEndpointPermissionsResponse;
import com.huaweicloud.sdk.apig.v2.model.ListEnvironmentVariablesV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListEnvironmentVariablesV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListEnvironmentsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListEnvironmentsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListFeaturesV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListFeaturesV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListGatewayResponsesV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListGatewayResponsesV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListInstanceConfigsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListInstanceConfigsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListInstanceFeaturesRequest;
import com.huaweicloud.sdk.apig.v2.model.ListInstanceFeaturesResponse;
import com.huaweicloud.sdk.apig.v2.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.apig.v2.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.apig.v2.model.ListInstancesByTagsRequest;
import com.huaweicloud.sdk.apig.v2.model.ListInstancesByTagsResponse;
import com.huaweicloud.sdk.apig.v2.model.ListInstancesV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListInstancesV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListLatelyApiStatisticsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListLatelyApiStatisticsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListLatelyGroupStatisticsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListLatelyGroupStatisticsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListMemberGroupsRequest;
import com.huaweicloud.sdk.apig.v2.model.ListMemberGroupsResponse;
import com.huaweicloud.sdk.apig.v2.model.ListMetricDataRequest;
import com.huaweicloud.sdk.apig.v2.model.ListMetricDataResponse;
import com.huaweicloud.sdk.apig.v2.model.ListOrchestrationAttachedApisRequest;
import com.huaweicloud.sdk.apig.v2.model.ListOrchestrationAttachedApisResponse;
import com.huaweicloud.sdk.apig.v2.model.ListOrchestrationsRequest;
import com.huaweicloud.sdk.apig.v2.model.ListOrchestrationsResponse;
import com.huaweicloud.sdk.apig.v2.model.ListPluginAttachableApisRequest;
import com.huaweicloud.sdk.apig.v2.model.ListPluginAttachableApisResponse;
import com.huaweicloud.sdk.apig.v2.model.ListPluginAttachedApisRequest;
import com.huaweicloud.sdk.apig.v2.model.ListPluginAttachedApisResponse;
import com.huaweicloud.sdk.apig.v2.model.ListPluginsRequest;
import com.huaweicloud.sdk.apig.v2.model.ListPluginsResponse;
import com.huaweicloud.sdk.apig.v2.model.ListProjectCofigsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListProjectCofigsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListProjectInstanceTagsRequest;
import com.huaweicloud.sdk.apig.v2.model.ListProjectInstanceTagsResponse;
import com.huaweicloud.sdk.apig.v2.model.ListRequestThrottlingPoliciesBindedToApiV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListRequestThrottlingPoliciesBindedToApiV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListSignatureKeysBindedToApiV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListSignatureKeysBindedToApiV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListSignatureKeysV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListSignatureKeysV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListSpecialThrottlingConfigurationsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListSpecialThrottlingConfigurationsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListTagsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListTagsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ListVpcChannelsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ListVpcChannelsV2Response;
import com.huaweicloud.sdk.apig.v2.model.MemberGroupCreate;
import com.huaweicloud.sdk.apig.v2.model.MemberGroupCreateBatch;
import com.huaweicloud.sdk.apig.v2.model.MembersBatchEnableOrDisable;
import com.huaweicloud.sdk.apig.v2.model.MicroserviceImportReq;
import com.huaweicloud.sdk.apig.v2.model.OpenEngressEipReq;
import com.huaweicloud.sdk.apig.v2.model.OpenIngressEipReq;
import com.huaweicloud.sdk.apig.v2.model.OrchestrationCreate;
import com.huaweicloud.sdk.apig.v2.model.PluginCreate;
import com.huaweicloud.sdk.apig.v2.model.PluginOperApiInfo;
import com.huaweicloud.sdk.apig.v2.model.RemoveEipV2Request;
import com.huaweicloud.sdk.apig.v2.model.RemoveEipV2Response;
import com.huaweicloud.sdk.apig.v2.model.RemoveEngressEipV2Request;
import com.huaweicloud.sdk.apig.v2.model.RemoveEngressEipV2Response;
import com.huaweicloud.sdk.apig.v2.model.RemoveIngressEipV2Request;
import com.huaweicloud.sdk.apig.v2.model.RemoveIngressEipV2Response;
import com.huaweicloud.sdk.apig.v2.model.ResettingAppSecretV2Request;
import com.huaweicloud.sdk.apig.v2.model.ResettingAppSecretV2Response;
import com.huaweicloud.sdk.apig.v2.model.ResizeInstanceReq;
import com.huaweicloud.sdk.apig.v2.model.ResponseInfo;
import com.huaweicloud.sdk.apig.v2.model.ResponseInfoResp;
import com.huaweicloud.sdk.apig.v2.model.ResponsesCreate;
import com.huaweicloud.sdk.apig.v2.model.ShowAppBoundAppQuotaRequest;
import com.huaweicloud.sdk.apig.v2.model.ShowAppBoundAppQuotaResponse;
import com.huaweicloud.sdk.apig.v2.model.ShowAppQuotaRequest;
import com.huaweicloud.sdk.apig.v2.model.ShowAppQuotaResponse;
import com.huaweicloud.sdk.apig.v2.model.ShowAsyncTaskResultRequest;
import com.huaweicloud.sdk.apig.v2.model.ShowAsyncTaskResultResponse;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfAclPolicyV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfAclPolicyV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfApiGroupV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfApiGroupV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfApiV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfApiV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfAppAclRequest;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfAppAclResponse;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfAppCodeV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfAppCodeV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfAppV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfAppV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfCertificateV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfCertificateV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfCustomAuthorizersV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfCustomAuthorizersV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfDomainNameCertificateV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfDomainNameCertificateV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfEnvironmentVariableV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfEnvironmentVariableV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfGatewayResponseTypeV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfGatewayResponseTypeV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfGatewayResponseV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfGatewayResponseV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfInstanceProgressV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfInstanceProgressV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfInstanceV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfInstanceV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfMemberGroupRequest;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfMemberGroupResponse;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfOrchestrationRequest;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfOrchestrationResponse;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfVpcChannelV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowDetailsOfVpcChannelV2Response;
import com.huaweicloud.sdk.apig.v2.model.ShowInstancesNumByTagsRequest;
import com.huaweicloud.sdk.apig.v2.model.ShowInstancesNumByTagsResponse;
import com.huaweicloud.sdk.apig.v2.model.ShowPluginRequest;
import com.huaweicloud.sdk.apig.v2.model.ShowPluginResponse;
import com.huaweicloud.sdk.apig.v2.model.ShowRestrictionOfInstanceV2Request;
import com.huaweicloud.sdk.apig.v2.model.ShowRestrictionOfInstanceV2Response;
import com.huaweicloud.sdk.apig.v2.model.SignApiBinding;
import com.huaweicloud.sdk.apig.v2.model.SlDomainAccessSetting;
import com.huaweicloud.sdk.apig.v2.model.ThrottleApiBindingCreate;
import com.huaweicloud.sdk.apig.v2.model.ThrottleBaseInfo;
import com.huaweicloud.sdk.apig.v2.model.ThrottleBindingBatchDelete;
import com.huaweicloud.sdk.apig.v2.model.ThrottleSpecialCreate;
import com.huaweicloud.sdk.apig.v2.model.ThrottleSpecialUpdate;
import com.huaweicloud.sdk.apig.v2.model.TmsQueryReq;
import com.huaweicloud.sdk.apig.v2.model.TmsUpdatePublicReq;
import com.huaweicloud.sdk.apig.v2.model.UpdateAclStrategyV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateAclStrategyV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateApiGroupV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateApiGroupV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateApiV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateApiV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateAppAclRequest;
import com.huaweicloud.sdk.apig.v2.model.UpdateAppAclResponse;
import com.huaweicloud.sdk.apig.v2.model.UpdateAppQuotaRequest;
import com.huaweicloud.sdk.apig.v2.model.UpdateAppQuotaResponse;
import com.huaweicloud.sdk.apig.v2.model.UpdateAppV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateAppV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateBackendInstancesV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateBackendInstancesV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateCertificateV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateCertificateV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateCustomAuthorizerV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateCustomAuthorizerV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateDomainV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateDomainV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateEngressEipV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateEngressEipV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateEnvironmentV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateEnvironmentV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateEnvironmentVariableV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateEnvironmentVariableV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateGatewayResponseTypeV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateGatewayResponseTypeV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateGatewayResponseV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateGatewayResponseV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateHealthCheckRequest;
import com.huaweicloud.sdk.apig.v2.model.UpdateHealthCheckResponse;
import com.huaweicloud.sdk.apig.v2.model.UpdateIngressEipV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateIngressEipV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateInstanceV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateInstanceV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateMemberGroupRequest;
import com.huaweicloud.sdk.apig.v2.model.UpdateMemberGroupResponse;
import com.huaweicloud.sdk.apig.v2.model.UpdateOrchestrationRequest;
import com.huaweicloud.sdk.apig.v2.model.UpdateOrchestrationResponse;
import com.huaweicloud.sdk.apig.v2.model.UpdatePluginRequest;
import com.huaweicloud.sdk.apig.v2.model.UpdatePluginResponse;
import com.huaweicloud.sdk.apig.v2.model.UpdateRequestThrottlingPolicyV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateRequestThrottlingPolicyV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateSignatureKeyV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateSignatureKeyV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateSlDomainSettingV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateSlDomainSettingV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateSpecialThrottlingConfigurationV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateSpecialThrottlingConfigurationV2Response;
import com.huaweicloud.sdk.apig.v2.model.UpdateVpcChannelV2Request;
import com.huaweicloud.sdk.apig.v2.model.UpdateVpcChannelV2Response;
import com.huaweicloud.sdk.apig.v2.model.UrlDomainCreate;
import com.huaweicloud.sdk.apig.v2.model.UrlDomainModify;
import com.huaweicloud.sdk.apig.v2.model.VpcCreate;
import com.huaweicloud.sdk.apig.v2.model.VpcHealthConfig;
import com.huaweicloud.sdk.apig.v2.model.VpcMemberCreate;
import com.huaweicloud.sdk.apig.v2.model.VpcMemberModify;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.Map;

@SuppressWarnings("unchecked")
public class ApigMeta {

    public static final HttpRequestDef<AcceptOrRejectEndpointConnectionsRequest, AcceptOrRejectEndpointConnectionsResponse> acceptOrRejectEndpointConnections =
        genForAcceptOrRejectEndpointConnections();

    private static HttpRequestDef<AcceptOrRejectEndpointConnectionsRequest, AcceptOrRejectEndpointConnectionsResponse> genForAcceptOrRejectEndpointConnections() {
        // basic
        HttpRequestDef.Builder<AcceptOrRejectEndpointConnectionsRequest, AcceptOrRejectEndpointConnectionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AcceptOrRejectEndpointConnectionsRequest.class,
                    AcceptOrRejectEndpointConnectionsResponse.class)
                .withName("AcceptOrRejectEndpointConnections")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-endpoint/connections/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptOrRejectEndpointConnectionsRequest::getInstanceId,
                AcceptOrRejectEndpointConnectionsRequest::setInstanceId));
        builder.<ConnectionActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConnectionActionReq.class),
            f -> f.withMarshaller(AcceptOrRejectEndpointConnectionsRequest::getBody,
                AcceptOrRejectEndpointConnectionsRequest::setBody));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AcceptOrRejectEndpointConnectionsResponse::getXRequestId,
                AcceptOrRejectEndpointConnectionsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<AddCustomIngressPortRequest, AddCustomIngressPortResponse> addCustomIngressPort =
        genForAddCustomIngressPort();

    private static HttpRequestDef<AddCustomIngressPortRequest, AddCustomIngressPortResponse> genForAddCustomIngressPort() {
        // basic
        HttpRequestDef.Builder<AddCustomIngressPortRequest, AddCustomIngressPortResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddCustomIngressPortRequest.class, AddCustomIngressPortResponse.class)
            .withName("AddCustomIngressPort")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/custom-ingress-ports")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCustomIngressPortRequest::getInstanceId,
                AddCustomIngressPortRequest::setInstanceId));
        builder.<IngressPortCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IngressPortCreate.class),
            f -> f.withMarshaller(AddCustomIngressPortRequest::getBody, AddCustomIngressPortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddEipV2Request, AddEipV2Response> addEipV2 = genForAddEipV2();

    private static HttpRequestDef<AddEipV2Request, AddEipV2Response> genForAddEipV2() {
        // basic
        HttpRequestDef.Builder<AddEipV2Request, AddEipV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AddEipV2Request.class, AddEipV2Response.class)
                .withName("AddEipV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/eip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddEipV2Request::getInstanceId, AddEipV2Request::setInstanceId));
        builder.<EipBindReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EipBindReq.class),
            f -> f.withMarshaller(AddEipV2Request::getBody, AddEipV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddEndpointPermissionsRequest, AddEndpointPermissionsResponse> addEndpointPermissions =
        genForAddEndpointPermissions();

    private static HttpRequestDef<AddEndpointPermissionsRequest, AddEndpointPermissionsResponse> genForAddEndpointPermissions() {
        // basic
        HttpRequestDef.Builder<AddEndpointPermissionsRequest, AddEndpointPermissionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddEndpointPermissionsRequest.class, AddEndpointPermissionsResponse.class)
            .withName("AddEndpointPermissions")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-endpoint/permissions/batch-add")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddEndpointPermissionsRequest::getInstanceId,
                AddEndpointPermissionsRequest::setInstanceId));
        builder.<EndpointPermissionList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EndpointPermissionList.class),
            f -> f.withMarshaller(AddEndpointPermissionsRequest::getBody, AddEndpointPermissionsRequest::setBody));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddEndpointPermissionsResponse::getXRequestId,
                AddEndpointPermissionsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<AddEngressEipV2Request, AddEngressEipV2Response> addEngressEipV2 =
        genForAddEngressEipV2();

    private static HttpRequestDef<AddEngressEipV2Request, AddEngressEipV2Response> genForAddEngressEipV2() {
        // basic
        HttpRequestDef.Builder<AddEngressEipV2Request, AddEngressEipV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddEngressEipV2Request.class, AddEngressEipV2Response.class)
                .withName("AddEngressEipV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/nat-eip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddEngressEipV2Request::getInstanceId, AddEngressEipV2Request::setInstanceId));
        builder.<OpenEngressEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenEngressEipReq.class),
            f -> f.withMarshaller(AddEngressEipV2Request::getBody, AddEngressEipV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddIngressEipV2Request, AddIngressEipV2Response> addIngressEipV2 =
        genForAddIngressEipV2();

    private static HttpRequestDef<AddIngressEipV2Request, AddIngressEipV2Response> genForAddIngressEipV2() {
        // basic
        HttpRequestDef.Builder<AddIngressEipV2Request, AddIngressEipV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddIngressEipV2Request.class, AddIngressEipV2Response.class)
                .withName("AddIngressEipV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/ingress-eip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddIngressEipV2Request::getInstanceId, AddIngressEipV2Request::setInstanceId));
        builder.<OpenIngressEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenIngressEipReq.class),
            f -> f.withMarshaller(AddIngressEipV2Request::getBody, AddIngressEipV2Request::setBody));

        // response

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-quotas/{app_quota_id}/binding-apps")
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
                "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains")
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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/plugins/{plugin_id}/attach")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/{api_id}/plugins/attach")
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

    public static final HttpRequestDef<BatchCreateOrDeleteInstanceTagsRequest, BatchCreateOrDeleteInstanceTagsResponse> batchCreateOrDeleteInstanceTags =
        genForBatchCreateOrDeleteInstanceTags();

    private static HttpRequestDef<BatchCreateOrDeleteInstanceTagsRequest, BatchCreateOrDeleteInstanceTagsResponse> genForBatchCreateOrDeleteInstanceTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateOrDeleteInstanceTagsRequest, BatchCreateOrDeleteInstanceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateOrDeleteInstanceTagsRequest.class,
                    BatchCreateOrDeleteInstanceTagsResponse.class)
                .withName("BatchCreateOrDeleteInstanceTags")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/instance-tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateOrDeleteInstanceTagsRequest::getInstanceId,
                BatchCreateOrDeleteInstanceTagsRequest::setInstanceId));
        builder.<TmsUpdatePublicReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TmsUpdatePublicReq.class),
            f -> f.withMarshaller(BatchCreateOrDeleteInstanceTagsRequest::getBody,
                BatchCreateOrDeleteInstanceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckAppV2Request, CheckAppV2Response> checkAppV2 = genForCheckAppV2();

    private static HttpRequestDef<CheckAppV2Request, CheckAppV2Response> genForCheckAppV2() {
        // basic
        HttpRequestDef.Builder<CheckAppV2Request, CheckAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckAppV2Request.class, CheckAppV2Response.class)
                .withName("CheckAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/validation/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAppV2Request::getInstanceId, CheckAppV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAppV2Request::getAppId, CheckAppV2Request::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAnAppV2Request, CreateAnAppV2Response> createAnAppV2 =
        genForCreateAnAppV2();

    private static HttpRequestDef<CreateAnAppV2Request, CreateAnAppV2Response> genForCreateAnAppV2() {
        // basic
        HttpRequestDef.Builder<CreateAnAppV2Request, CreateAnAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAnAppV2Request.class, CreateAnAppV2Response.class)
                .withName("CreateAnAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAnAppV2Request::getInstanceId, CreateAnAppV2Request::setInstanceId));
        builder.<AppCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppCreate.class),
            f -> f.withMarshaller(CreateAnAppV2Request::getBody, CreateAnAppV2Request::setBody));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}/app-codes")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}/app-codes")
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

    public static final HttpRequestDef<CreateAppQuotaRequest, CreateAppQuotaResponse> createAppQuota =
        genForCreateAppQuota();

    private static HttpRequestDef<CreateAppQuotaRequest, CreateAppQuotaResponse> genForCreateAppQuota() {
        // basic
        HttpRequestDef.Builder<CreateAppQuotaRequest, CreateAppQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppQuotaRequest.class, CreateAppQuotaResponse.class)
                .withName("CreateAppQuota")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-quotas")
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

    public static final HttpRequestDef<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> createCustomAuthorizerV2 =
        genForCreateCustomAuthorizerV2();

    private static HttpRequestDef<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> genForCreateCustomAuthorizerV2() {
        // basic
        HttpRequestDef.Builder<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateCustomAuthorizerV2Request.class, CreateCustomAuthorizerV2Response.class)
                .withName("CreateCustomAuthorizerV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/authorizers")
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

    public static final HttpRequestDef<CreateEnvironmentV2Request, CreateEnvironmentV2Response> createEnvironmentV2 =
        genForCreateEnvironmentV2();

    private static HttpRequestDef<CreateEnvironmentV2Request, CreateEnvironmentV2Response> genForCreateEnvironmentV2() {
        // basic
        HttpRequestDef.Builder<CreateEnvironmentV2Request, CreateEnvironmentV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnvironmentV2Request.class, CreateEnvironmentV2Response.class)
                .withName("CreateEnvironmentV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/envs")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/env-variables")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/features")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFeatureV2Request::getInstanceId, CreateFeatureV2Request::setInstanceId));
        builder.<FeatureToggle>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FeatureToggle.class),
            f -> f.withMarshaller(CreateFeatureV2Request::getBody, CreateFeatureV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response> createGatewayResponseV2 =
        genForCreateGatewayResponseV2();

    private static HttpRequestDef<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response> genForCreateGatewayResponseV2() {
        // basic
        HttpRequestDef.Builder<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGatewayResponseV2Request.class, CreateGatewayResponseV2Response.class)
            .withName("CreateGatewayResponseV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGatewayResponseV2Request::getInstanceId,
                CreateGatewayResponseV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGatewayResponseV2Request::getGroupId,
                CreateGatewayResponseV2Request::setGroupId));
        builder.<ResponsesCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResponsesCreate.class),
            f -> f.withMarshaller(CreateGatewayResponseV2Request::getBody, CreateGatewayResponseV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceV2Request, CreateInstanceV2Response> createInstanceV2 =
        genForCreateInstanceV2();

    private static HttpRequestDef<CreateInstanceV2Request, CreateInstanceV2Response> genForCreateInstanceV2() {
        // basic
        HttpRequestDef.Builder<CreateInstanceV2Request, CreateInstanceV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceV2Request.class, CreateInstanceV2Response.class)
                .withName("CreateInstanceV2")
                .withUri("/v2/{project_id}/apigw/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<InstanceCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceCreateReq.class),
            f -> f.withMarshaller(CreateInstanceV2Request::getBody, CreateInstanceV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrchestrationRequest, CreateOrchestrationResponse> createOrchestration =
        genForCreateOrchestration();

    private static HttpRequestDef<CreateOrchestrationRequest, CreateOrchestrationResponse> genForCreateOrchestration() {
        // basic
        HttpRequestDef.Builder<CreateOrchestrationRequest, CreateOrchestrationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOrchestrationRequest.class, CreateOrchestrationResponse.class)
                .withName("CreateOrchestration")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/orchestrations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrchestrationRequest::getInstanceId,
                CreateOrchestrationRequest::setInstanceId));
        builder.<OrchestrationCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OrchestrationCreate.class),
            f -> f.withMarshaller(CreateOrchestrationRequest::getBody, CreateOrchestrationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrderRequest, CreateOrderResponse> createOrder = genForCreateOrder();

    private static HttpRequestDef<CreateOrderRequest, CreateOrderResponse> genForCreateOrder() {
        // basic
        HttpRequestDef.Builder<CreateOrderRequest, CreateOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOrderRequest.class, CreateOrderResponse.class)
                .withName("CreateOrder")
                .withUri("/v2/{project_id}/apigw/prepay-instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<InstanceOrderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceOrderReq.class),
            f -> f.withMarshaller(CreateOrderRequest::getBody, CreateOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePluginRequest, CreatePluginResponse> createPlugin = genForCreatePlugin();

    private static HttpRequestDef<CreatePluginRequest, CreatePluginResponse> genForCreatePlugin() {
        // basic
        HttpRequestDef.Builder<CreatePluginRequest, CreatePluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePluginRequest.class, CreatePluginResponse.class)
                .withName("CreatePlugin")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/plugins")
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

    public static final HttpRequestDef<CreatePostPayResizeOrderRequest, CreatePostPayResizeOrderResponse> createPostPayResizeOrder =
        genForCreatePostPayResizeOrder();

    private static HttpRequestDef<CreatePostPayResizeOrderRequest, CreatePostPayResizeOrderResponse> genForCreatePostPayResizeOrder() {
        // basic
        HttpRequestDef.Builder<CreatePostPayResizeOrderRequest, CreatePostPayResizeOrderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreatePostPayResizeOrderRequest.class, CreatePostPayResizeOrderResponse.class)
                .withName("CreatePostPayResizeOrder")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/postpaid-resize")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostPayResizeOrderRequest::getInstanceId,
                CreatePostPayResizeOrderRequest::setInstanceId));
        builder.<ResizeInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeInstanceReq.class),
            f -> f.withMarshaller(CreatePostPayResizeOrderRequest::getBody, CreatePostPayResizeOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrepayResizeRequest, CreatePrepayResizeResponse> createPrepayResize =
        genForCreatePrepayResize();

    private static HttpRequestDef<CreatePrepayResizeRequest, CreatePrepayResizeResponse> genForCreatePrepayResize() {
        // basic
        HttpRequestDef.Builder<CreatePrepayResizeRequest, CreatePrepayResizeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrepayResizeRequest.class, CreatePrepayResizeResponse.class)
                .withName("CreatePrepayResize")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/prepay-resize")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrepayResizeRequest::getInstanceId, CreatePrepayResizeRequest::setInstanceId));
        builder.<InstanceChangeOrderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceChangeOrderReq.class),
            f -> f.withMarshaller(CreatePrepayResizeRequest::getBody, CreatePrepayResizeRequest::setBody));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles")
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

    public static final HttpRequestDef<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> createSignatureKeyV2 =
        genForCreateSignatureKeyV2();

    private static HttpRequestDef<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> genForCreateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSignatureKeyV2Request.class, CreateSignatureKeyV2Response.class)
            .withName("CreateSignatureKeyV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/signs")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}/throttle-specials")
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

    public static final HttpRequestDef<DeleteAppAclRequest, DeleteAppAclResponse> deleteAppAcl = genForDeleteAppAcl();

    private static HttpRequestDef<DeleteAppAclRequest, DeleteAppAclResponse> genForDeleteAppAcl() {
        // basic
        HttpRequestDef.Builder<DeleteAppAclRequest, DeleteAppAclResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppAclRequest.class, DeleteAppAclResponse.class)
                .withName("DeleteAppAcl")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}/app-acl")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}/app-codes/{app_code_id}")
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

    public static final HttpRequestDef<DeleteAppQuotaRequest, DeleteAppQuotaResponse> deleteAppQuota =
        genForDeleteAppQuota();

    private static HttpRequestDef<DeleteAppQuotaRequest, DeleteAppQuotaResponse> genForDeleteAppQuota() {
        // basic
        HttpRequestDef.Builder<DeleteAppQuotaRequest, DeleteAppQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppQuotaRequest.class, DeleteAppQuotaResponse.class)
                .withName("DeleteAppQuota")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-quotas/{app_quota_id}")
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

    public static final HttpRequestDef<DeleteAppV2Request, DeleteAppV2Response> deleteAppV2 = genForDeleteAppV2();

    private static HttpRequestDef<DeleteAppV2Request, DeleteAppV2Response> genForDeleteAppV2() {
        // basic
        HttpRequestDef.Builder<DeleteAppV2Request, DeleteAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppV2Request.class, DeleteAppV2Response.class)
                .withName("DeleteAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppV2Request::getInstanceId, DeleteAppV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppV2Request::getAppId, DeleteAppV2Request::setAppId));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/authorizers/{authorizer_id}")
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

    public static final HttpRequestDef<DeleteCustomIngressPortRequest, DeleteCustomIngressPortResponse> deleteCustomIngressPort =
        genForDeleteCustomIngressPort();

    private static HttpRequestDef<DeleteCustomIngressPortRequest, DeleteCustomIngressPortResponse> genForDeleteCustomIngressPort() {
        // basic
        HttpRequestDef.Builder<DeleteCustomIngressPortRequest, DeleteCustomIngressPortResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteCustomIngressPortRequest.class, DeleteCustomIngressPortResponse.class)
            .withName("DeleteCustomIngressPort")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/custom-ingress-ports/{ingress_port_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomIngressPortRequest::getInstanceId,
                DeleteCustomIngressPortRequest::setInstanceId));
        builder.<String>withRequestField("ingress_port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomIngressPortRequest::getIngressPortId,
                DeleteCustomIngressPortRequest::setIngressPortId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEndpointPermissionsRequest, DeleteEndpointPermissionsResponse> deleteEndpointPermissions =
        genForDeleteEndpointPermissions();

    private static HttpRequestDef<DeleteEndpointPermissionsRequest, DeleteEndpointPermissionsResponse> genForDeleteEndpointPermissions() {
        // basic
        HttpRequestDef.Builder<DeleteEndpointPermissionsRequest, DeleteEndpointPermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteEndpointPermissionsRequest.class,
                    DeleteEndpointPermissionsResponse.class)
                .withName("DeleteEndpointPermissions")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-endpoint/permissions/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndpointPermissionsRequest::getInstanceId,
                DeleteEndpointPermissionsRequest::setInstanceId));
        builder.<EndpointPermissionList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EndpointPermissionList.class),
            f -> f.withMarshaller(DeleteEndpointPermissionsRequest::getBody,
                DeleteEndpointPermissionsRequest::setBody));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEndpointPermissionsResponse::getXRequestId,
                DeleteEndpointPermissionsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> deleteEnvironmentV2 =
        genForDeleteEnvironmentV2();

    private static HttpRequestDef<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> genForDeleteEnvironmentV2() {
        // basic
        HttpRequestDef.Builder<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEnvironmentV2Request.class, DeleteEnvironmentV2Response.class)
            .withName("DeleteEnvironmentV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/envs/{env_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/env-variables/{env_variable_id}")
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

    public static final HttpRequestDef<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response> deleteGatewayResponseTypeV2 =
        genForDeleteGatewayResponseTypeV2();

    private static HttpRequestDef<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response> genForDeleteGatewayResponseTypeV2() {
        // basic
        HttpRequestDef.Builder<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGatewayResponseTypeV2Request.class,
                    DeleteGatewayResponseTypeV2Response.class)
                .withName("DeleteGatewayResponseTypeV2")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses/{response_id}/{response_type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGatewayResponseTypeV2Request::getInstanceId,
                DeleteGatewayResponseTypeV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGatewayResponseTypeV2Request::getGroupId,
                DeleteGatewayResponseTypeV2Request::setGroupId));
        builder.<String>withRequestField("response_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGatewayResponseTypeV2Request::getResponseId,
                DeleteGatewayResponseTypeV2Request::setResponseId));
        builder.<DeleteGatewayResponseTypeV2Request.ResponseTypeEnum>withRequestField("response_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteGatewayResponseTypeV2Request.ResponseTypeEnum.class),
            f -> f.withMarshaller(DeleteGatewayResponseTypeV2Request::getResponseType,
                DeleteGatewayResponseTypeV2Request::setResponseType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response> deleteGatewayResponseV2 =
        genForDeleteGatewayResponseV2();

    private static HttpRequestDef<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response> genForDeleteGatewayResponseV2() {
        // basic
        HttpRequestDef.Builder<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGatewayResponseV2Request.class, DeleteGatewayResponseV2Response.class)
            .withName("DeleteGatewayResponseV2")
            .withUri(
                "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses/{response_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGatewayResponseV2Request::getInstanceId,
                DeleteGatewayResponseV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGatewayResponseV2Request::getGroupId,
                DeleteGatewayResponseV2Request::setGroupId));
        builder.<String>withRequestField("response_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGatewayResponseV2Request::getResponseId,
                DeleteGatewayResponseV2Request::setResponseId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstancesV2Request, DeleteInstancesV2Response> deleteInstancesV2 =
        genForDeleteInstancesV2();

    private static HttpRequestDef<DeleteInstancesV2Request, DeleteInstancesV2Response> genForDeleteInstancesV2() {
        // basic
        HttpRequestDef.Builder<DeleteInstancesV2Request, DeleteInstancesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstancesV2Request.class, DeleteInstancesV2Response.class)
                .withName("DeleteInstancesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstancesV2Request::getInstanceId, DeleteInstancesV2Request::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOrchestrationRequest, DeleteOrchestrationResponse> deleteOrchestration =
        genForDeleteOrchestration();

    private static HttpRequestDef<DeleteOrchestrationRequest, DeleteOrchestrationResponse> genForDeleteOrchestration() {
        // basic
        HttpRequestDef.Builder<DeleteOrchestrationRequest, DeleteOrchestrationResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteOrchestrationRequest.class, DeleteOrchestrationResponse.class)
            .withName("DeleteOrchestration")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/orchestrations/{orchestration_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOrchestrationRequest::getInstanceId,
                DeleteOrchestrationRequest::setInstanceId));
        builder.<String>withRequestField("orchestration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOrchestrationRequest::getOrchestrationId,
                DeleteOrchestrationRequest::setOrchestrationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePluginRequest, DeletePluginResponse> deletePlugin = genForDeletePlugin();

    private static HttpRequestDef<DeletePluginRequest, DeletePluginResponse> genForDeletePlugin() {
        // basic
        HttpRequestDef.Builder<DeletePluginRequest, DeletePluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePluginRequest.class, DeletePluginResponse.class)
                .withName("DeletePlugin")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/plugins/{plugin_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}")
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

    public static final HttpRequestDef<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> deleteSignatureKeyV2 =
        genForDeleteSignatureKeyV2();

    private static HttpRequestDef<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> genForDeleteSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSignatureKeyV2Request.class, DeleteSignatureKeyV2Response.class)
            .withName("DeleteSignatureKeyV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/signs/{sign_id}")
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
                    "/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}/throttle-specials/{strategy_id}")
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

    public static final HttpRequestDef<DetachApiFromPluginRequest, DetachApiFromPluginResponse> detachApiFromPlugin =
        genForDetachApiFromPlugin();

    private static HttpRequestDef<DetachApiFromPluginRequest, DetachApiFromPluginResponse> genForDetachApiFromPlugin() {
        // basic
        HttpRequestDef.Builder<DetachApiFromPluginRequest, DetachApiFromPluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, DetachApiFromPluginRequest.class, DetachApiFromPluginResponse.class)
                .withName("DetachApiFromPlugin")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/plugins/{plugin_id}/detach")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/{api_id}/plugins/detach")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-quotas/{app_quota_id}/bound-apps/{app_id}")
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
                    "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate/{certificate_id}")
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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings/{sign_bindings_id}")
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

    public static final HttpRequestDef<ExportApiDefinitionsAsyncRequest, ExportApiDefinitionsAsyncResponse> exportApiDefinitionsAsync =
        genForExportApiDefinitionsAsync();

    private static HttpRequestDef<ExportApiDefinitionsAsyncRequest, ExportApiDefinitionsAsyncResponse> genForExportApiDefinitionsAsync() {
        // basic
        HttpRequestDef.Builder<ExportApiDefinitionsAsyncRequest, ExportApiDefinitionsAsyncResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExportApiDefinitionsAsyncRequest.class,
                    ExportApiDefinitionsAsyncResponse.class)
                .withName("ExportApiDefinitionsAsync")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/openapi/async-export")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportApiDefinitionsAsyncRequest::getInstanceId,
                ExportApiDefinitionsAsyncRequest::setInstanceId));
        builder.<ExportApiDefinitionsAsyncRequest.OasVersionEnum>withRequestField("oas_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportApiDefinitionsAsyncRequest.OasVersionEnum.class),
            f -> f.withMarshaller(ExportApiDefinitionsAsyncRequest::getOasVersion,
                ExportApiDefinitionsAsyncRequest::setOasVersion));
        builder.<ExportOpenApiReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportOpenApiReq.class),
            f -> f.withMarshaller(ExportApiDefinitionsAsyncRequest::getBody,
                ExportApiDefinitionsAsyncRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportApiDefinitionsAsyncRequest, ImportApiDefinitionsAsyncResponse> importApiDefinitionsAsync =
        genForImportApiDefinitionsAsync();

    private static HttpRequestDef<ImportApiDefinitionsAsyncRequest, ImportApiDefinitionsAsyncResponse> genForImportApiDefinitionsAsync() {
        // basic
        HttpRequestDef.Builder<ImportApiDefinitionsAsyncRequest, ImportApiDefinitionsAsyncResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ImportApiDefinitionsAsyncRequest.class,
                    ImportApiDefinitionsAsyncResponse.class)
                .withName("ImportApiDefinitionsAsync")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/openapi/async-import")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportApiDefinitionsAsyncRequest::getInstanceId,
                ImportApiDefinitionsAsyncRequest::setInstanceId));
        builder.<ImportApiDefinitionsAsyncRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportApiDefinitionsAsyncRequestBody.class),
            f -> f.withMarshaller(ImportApiDefinitionsAsyncRequest::getBody,
                ImportApiDefinitionsAsyncRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportMicroserviceRequest, ImportMicroserviceResponse> importMicroservice =
        genForImportMicroservice();

    private static HttpRequestDef<ImportMicroserviceRequest, ImportMicroserviceResponse> genForImportMicroservice() {
        // basic
        HttpRequestDef.Builder<ImportMicroserviceRequest, ImportMicroserviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportMicroserviceRequest.class, ImportMicroserviceResponse.class)
                .withName("ImportMicroservice")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/microservice/import")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportMicroserviceRequest::getInstanceId, ImportMicroserviceRequest::setInstanceId));
        builder.<MicroserviceImportReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MicroserviceImportReq.class),
            f -> f.withMarshaller(ImportMicroserviceRequest::getBody, ImportMicroserviceRequest::setBody));

        // response

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/{api_id}/attachable-plugins")
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
            FieldExistence.NULL_IGNORE,
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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/{api_id}/attached-plugins")
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

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> listApiGroupsQuantitiesV2 =
        genForListApiGroupsQuantitiesV2();

    private static HttpRequestDef<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> genForListApiGroupsQuantitiesV2() {
        // basic
        HttpRequestDef.Builder<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApiGroupsQuantitiesV2Request.class,
                    ListApiGroupsQuantitiesV2Response.class)
                .withName("ListApiGroupsQuantitiesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/resources/outline/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiGroupsQuantitiesV2Request::getInstanceId,
                ListApiGroupsQuantitiesV2Request::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> listApiQuantitiesV2 =
        genForListApiQuantitiesV2();

    private static HttpRequestDef<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> genForListApiQuantitiesV2() {
        // basic
        HttpRequestDef.Builder<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiQuantitiesV2Request.class, ListApiQuantitiesV2Response.class)
                .withName("ListApiQuantitiesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/resources/outline/apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiQuantitiesV2Request::getInstanceId,
                ListApiQuantitiesV2Request::setInstanceId));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings/binded-apis")
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
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getTags,
                ListApisBindedToSignatureKeyV2Request::setTags));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings/unbinded-apis")
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
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getTags,
                ListApisNotBoundWithSignatureKeyV2Request::setTags));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}/app-codes")
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

    public static final HttpRequestDef<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> listAppQuantitiesV2 =
        genForListAppQuantitiesV2();

    private static HttpRequestDef<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> genForListAppQuantitiesV2() {
        // basic
        HttpRequestDef.Builder<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppQuantitiesV2Request.class, ListAppQuantitiesV2Response.class)
                .withName("ListAppQuantitiesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/resources/outline/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppQuantitiesV2Request::getInstanceId,
                ListAppQuantitiesV2Request::setInstanceId));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-quotas/{app_quota_id}/bindable-apps")
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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-quotas/{app_quota_id}/bound-apps")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-quotas")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps")
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
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsV2Request::getCreator, ListAppsV2Request::setCreator));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsV2Request::getPreciseSearch, ListAppsV2Request::setPreciseSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableZonesV2Request, ListAvailableZonesV2Response> listAvailableZonesV2 =
        genForListAvailableZonesV2();

    private static HttpRequestDef<ListAvailableZonesV2Request, ListAvailableZonesV2Response> genForListAvailableZonesV2() {
        // basic
        HttpRequestDef.Builder<ListAvailableZonesV2Request, ListAvailableZonesV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailableZonesV2Request.class, ListAvailableZonesV2Response.class)
            .withName("ListAvailableZonesV2")
            .withUri("/v2/{project_id}/apigw/available-zones")
            .withContentType("application/json");

        // requests

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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/authorizers")
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

    public static final HttpRequestDef<ListCustomIngressPortDomainsRequest, ListCustomIngressPortDomainsResponse> listCustomIngressPortDomains =
        genForListCustomIngressPortDomains();

    private static HttpRequestDef<ListCustomIngressPortDomainsRequest, ListCustomIngressPortDomainsResponse> genForListCustomIngressPortDomains() {
        // basic
        HttpRequestDef.Builder<ListCustomIngressPortDomainsRequest, ListCustomIngressPortDomainsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCustomIngressPortDomainsRequest.class,
                    ListCustomIngressPortDomainsResponse.class)
                .withName("ListCustomIngressPortDomains")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/custom-ingress-ports/{ingress_port_id}/domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomIngressPortDomainsRequest::getInstanceId,
                ListCustomIngressPortDomainsRequest::setInstanceId));
        builder.<String>withRequestField("ingress_port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomIngressPortDomainsRequest::getIngressPortId,
                ListCustomIngressPortDomainsRequest::setIngressPortId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCustomIngressPortDomainsRequest::getOffset,
                ListCustomIngressPortDomainsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomIngressPortDomainsRequest::getLimit,
                ListCustomIngressPortDomainsRequest::setLimit));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomIngressPortDomainsRequest::getDomainName,
                ListCustomIngressPortDomainsRequest::setDomainName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomIngressPortsRequest, ListCustomIngressPortsResponse> listCustomIngressPorts =
        genForListCustomIngressPorts();

    private static HttpRequestDef<ListCustomIngressPortsRequest, ListCustomIngressPortsResponse> genForListCustomIngressPorts() {
        // basic
        HttpRequestDef.Builder<ListCustomIngressPortsRequest, ListCustomIngressPortsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCustomIngressPortsRequest.class, ListCustomIngressPortsResponse.class)
            .withName("ListCustomIngressPorts")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/custom-ingress-ports")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomIngressPortsRequest::getInstanceId,
                ListCustomIngressPortsRequest::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCustomIngressPortsRequest::getOffset, ListCustomIngressPortsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomIngressPortsRequest::getLimit, ListCustomIngressPortsRequest::setLimit));
        builder.<ListCustomIngressPortsRequest.ProtocolEnum>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCustomIngressPortsRequest.ProtocolEnum.class),
            f -> f.withMarshaller(ListCustomIngressPortsRequest::getProtocol,
                ListCustomIngressPortsRequest::setProtocol));
        builder.<Integer>withRequestField("ingress_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomIngressPortsRequest::getIngressPort,
                ListCustomIngressPortsRequest::setIngressPort));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointConnectionsRequest, ListEndpointConnectionsResponse> listEndpointConnections =
        genForListEndpointConnections();

    private static HttpRequestDef<ListEndpointConnectionsRequest, ListEndpointConnectionsResponse> genForListEndpointConnections() {
        // basic
        HttpRequestDef.Builder<ListEndpointConnectionsRequest, ListEndpointConnectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEndpointConnectionsRequest.class, ListEndpointConnectionsResponse.class)
            .withName("ListEndpointConnections")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-endpoint/connections")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointConnectionsRequest::getInstanceId,
                ListEndpointConnectionsRequest::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEndpointConnectionsRequest::getOffset,
                ListEndpointConnectionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointConnectionsRequest::getLimit, ListEndpointConnectionsRequest::setLimit));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointConnectionsRequest::getId, ListEndpointConnectionsRequest::setId));
        builder.<Integer>withRequestField("marker_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointConnectionsRequest::getMarkerId,
                ListEndpointConnectionsRequest::setMarkerId));
        builder.<ListEndpointConnectionsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointConnectionsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListEndpointConnectionsRequest::getStatus,
                ListEndpointConnectionsRequest::setStatus));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEndpointConnectionsResponse::getXRequestId,
                ListEndpointConnectionsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointPermissionsRequest, ListEndpointPermissionsResponse> listEndpointPermissions =
        genForListEndpointPermissions();

    private static HttpRequestDef<ListEndpointPermissionsRequest, ListEndpointPermissionsResponse> genForListEndpointPermissions() {
        // basic
        HttpRequestDef.Builder<ListEndpointPermissionsRequest, ListEndpointPermissionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEndpointPermissionsRequest.class, ListEndpointPermissionsResponse.class)
            .withName("ListEndpointPermissions")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-endpoint/permissions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointPermissionsRequest::getInstanceId,
                ListEndpointPermissionsRequest::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEndpointPermissionsRequest::getOffset,
                ListEndpointPermissionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointPermissionsRequest::getLimit, ListEndpointPermissionsRequest::setLimit));
        builder.<String>withRequestField("permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointPermissionsRequest::getPermission,
                ListEndpointPermissionsRequest::setPermission));

        // response

        builder.<String>withResponseField("x-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEndpointPermissionsResponse::getXRequestId,
                ListEndpointPermissionsResponse::setXRequestId));
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/env-variables")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/envs")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/features")
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

    public static final HttpRequestDef<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response> listGatewayResponsesV2 =
        genForListGatewayResponsesV2();

    private static HttpRequestDef<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response> genForListGatewayResponsesV2() {
        // basic
        HttpRequestDef.Builder<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGatewayResponsesV2Request.class, ListGatewayResponsesV2Response.class)
            .withName("ListGatewayResponsesV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGatewayResponsesV2Request::getInstanceId,
                ListGatewayResponsesV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGatewayResponsesV2Request::getGroupId,
                ListGatewayResponsesV2Request::setGroupId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListGatewayResponsesV2Request::getOffset, ListGatewayResponsesV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGatewayResponsesV2Request::getLimit, ListGatewayResponsesV2Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceConfigsV2Request, ListInstanceConfigsV2Response> listInstanceConfigsV2 =
        genForListInstanceConfigsV2();

    private static HttpRequestDef<ListInstanceConfigsV2Request, ListInstanceConfigsV2Response> genForListInstanceConfigsV2() {
        // basic
        HttpRequestDef.Builder<ListInstanceConfigsV2Request, ListInstanceConfigsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceConfigsV2Request.class, ListInstanceConfigsV2Response.class)
            .withName("ListInstanceConfigsV2")
            .withUri("/v2/{project_id}/apigw/instance/configs")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstanceConfigsV2Request::getOffset, ListInstanceConfigsV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceConfigsV2Request::getLimit, ListInstanceConfigsV2Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceFeaturesRequest, ListInstanceFeaturesResponse> listInstanceFeatures =
        genForListInstanceFeatures();

    private static HttpRequestDef<ListInstanceFeaturesRequest, ListInstanceFeaturesResponse> genForListInstanceFeatures() {
        // basic
        HttpRequestDef.Builder<ListInstanceFeaturesRequest, ListInstanceFeaturesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceFeaturesRequest.class, ListInstanceFeaturesResponse.class)
            .withName("ListInstanceFeatures")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/instance-features")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceFeaturesRequest::getInstanceId,
                ListInstanceFeaturesRequest::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstanceFeaturesRequest::getOffset, ListInstanceFeaturesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceFeaturesRequest::getLimit, ListInstanceFeaturesRequest::setLimit));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/instance-tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getInstanceId, ListInstanceTagsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTags =
        genForListInstancesByTags();

    private static HttpRequestDef<ListInstancesByTagsRequest, ListInstancesByTagsResponse> genForListInstancesByTags() {
        // basic
        HttpRequestDef.Builder<ListInstancesByTagsRequest, ListInstancesByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListInstancesByTagsRequest.class, ListInstancesByTagsResponse.class)
                .withName("ListInstancesByTags")
                .withUri("/v2/{project_id}/apigw/resource-instances/filter")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstancesByTagsRequest::getOffset, ListInstancesByTagsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesByTagsRequest::getLimit, ListInstancesByTagsRequest::setLimit));
        builder.<TmsQueryReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TmsQueryReq.class),
            f -> f.withMarshaller(ListInstancesByTagsRequest::getBody, ListInstancesByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesV2Request, ListInstancesV2Response> listInstancesV2 =
        genForListInstancesV2();

    private static HttpRequestDef<ListInstancesV2Request, ListInstancesV2Response> genForListInstancesV2() {
        // basic
        HttpRequestDef.Builder<ListInstancesV2Request, ListInstancesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesV2Request.class, ListInstancesV2Response.class)
                .withName("ListInstancesV2")
                .withUri("/v2/{project_id}/apigw/instances")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstancesV2Request::getOffset, ListInstancesV2Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesV2Request::getLimit, ListInstancesV2Request::setLimit));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesV2Request::getInstanceId, ListInstancesV2Request::setInstanceId));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesV2Request::getInstanceName, ListInstancesV2Request::setInstanceName));
        builder.<ListInstancesV2Request.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesV2Request.StatusEnum.class),
            f -> f.withMarshaller(ListInstancesV2Request::getStatus, ListInstancesV2Request::setStatus));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/statistics/api/latest")
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

    public static final HttpRequestDef<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response> listLatelyGroupStatisticsV2 =
        genForListLatelyGroupStatisticsV2();

    private static HttpRequestDef<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response> genForListLatelyGroupStatisticsV2() {
        // basic
        HttpRequestDef.Builder<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListLatelyGroupStatisticsV2Request.class,
                    ListLatelyGroupStatisticsV2Response.class)
                .withName("ListLatelyGroupStatisticsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/statistics/group/latest")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatelyGroupStatisticsV2Request::getInstanceId,
                ListLatelyGroupStatisticsV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatelyGroupStatisticsV2Request::getGroupId,
                ListLatelyGroupStatisticsV2Request::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricDataRequest, ListMetricDataResponse> listMetricData =
        genForListMetricData();

    private static HttpRequestDef<ListMetricDataRequest, ListMetricDataResponse> genForListMetricData() {
        // basic
        HttpRequestDef.Builder<ListMetricDataRequest, ListMetricDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetricDataRequest.class, ListMetricDataResponse.class)
                .withName("ListMetricData")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/metric-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricDataRequest::getInstanceId, ListMetricDataRequest::setInstanceId));
        builder.<ListMetricDataRequest.DimEnum>withRequestField("dim",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMetricDataRequest.DimEnum.class),
            f -> f.withMarshaller(ListMetricDataRequest::getDim, ListMetricDataRequest::setDim));
        builder.<ListMetricDataRequest.MetricNameEnum>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMetricDataRequest.MetricNameEnum.class),
            f -> f.withMarshaller(ListMetricDataRequest::getMetricName, ListMetricDataRequest::setMetricName));
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricDataRequest::getFrom, ListMetricDataRequest::setFrom));
        builder.<String>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricDataRequest::getTo, ListMetricDataRequest::setTo));
        builder.<ListMetricDataRequest.PeriodEnum>withRequestField("period",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMetricDataRequest.PeriodEnum.class),
            f -> f.withMarshaller(ListMetricDataRequest::getPeriod, ListMetricDataRequest::setPeriod));
        builder.<ListMetricDataRequest.FilterEnum>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMetricDataRequest.FilterEnum.class),
            f -> f.withMarshaller(ListMetricDataRequest::getFilter, ListMetricDataRequest::setFilter));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrchestrationAttachedApisRequest, ListOrchestrationAttachedApisResponse> listOrchestrationAttachedApis =
        genForListOrchestrationAttachedApis();

    private static HttpRequestDef<ListOrchestrationAttachedApisRequest, ListOrchestrationAttachedApisResponse> genForListOrchestrationAttachedApis() {
        // basic
        HttpRequestDef.Builder<ListOrchestrationAttachedApisRequest, ListOrchestrationAttachedApisResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListOrchestrationAttachedApisRequest.class,
                    ListOrchestrationAttachedApisResponse.class)
                .withName("ListOrchestrationAttachedApis")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/orchestrations/{orchestration_id}/attached-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrchestrationAttachedApisRequest::getInstanceId,
                ListOrchestrationAttachedApisRequest::setInstanceId));
        builder.<String>withRequestField("orchestration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrchestrationAttachedApisRequest::getOrchestrationId,
                ListOrchestrationAttachedApisRequest::setOrchestrationId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOrchestrationAttachedApisRequest::getOffset,
                ListOrchestrationAttachedApisRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrchestrationAttachedApisRequest::getLimit,
                ListOrchestrationAttachedApisRequest::setLimit));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrchestrationAttachedApisRequest::getApiName,
                ListOrchestrationAttachedApisRequest::setApiName));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrchestrationAttachedApisRequest::getApiId,
                ListOrchestrationAttachedApisRequest::setApiId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrchestrationsRequest, ListOrchestrationsResponse> listOrchestrations =
        genForListOrchestrations();

    private static HttpRequestDef<ListOrchestrationsRequest, ListOrchestrationsResponse> genForListOrchestrations() {
        // basic
        HttpRequestDef.Builder<ListOrchestrationsRequest, ListOrchestrationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOrchestrationsRequest.class, ListOrchestrationsResponse.class)
                .withName("ListOrchestrations")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/orchestrations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrchestrationsRequest::getInstanceId, ListOrchestrationsRequest::setInstanceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOrchestrationsRequest::getOffset, ListOrchestrationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrchestrationsRequest::getLimit, ListOrchestrationsRequest::setLimit));
        builder.<String>withRequestField("orchestration_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrchestrationsRequest::getOrchestrationName,
                ListOrchestrationsRequest::setOrchestrationName));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrchestrationsRequest::getPreciseSearch,
                ListOrchestrationsRequest::setPreciseSearch));
        builder.<String>withRequestField("orchestration_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrchestrationsRequest::getOrchestrationId,
                ListOrchestrationsRequest::setOrchestrationId));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/plugins/{plugin_id}/attachable-apis")
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
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachableApisRequest::getTags, ListPluginAttachableApisRequest::setTags));

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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/plugins/{plugin_id}/attached-apis")
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
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginAttachedApisRequest::getTags, ListPluginAttachedApisRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPluginsRequest, ListPluginsResponse> listPlugins = genForListPlugins();

    private static HttpRequestDef<ListPluginsRequest, ListPluginsResponse> genForListPlugins() {
        // basic
        HttpRequestDef.Builder<ListPluginsRequest, ListPluginsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPluginsRequest.class, ListPluginsResponse.class)
                .withName("ListPlugins")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/plugins")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/project/configs")
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

    public static final HttpRequestDef<ListProjectInstanceTagsRequest, ListProjectInstanceTagsResponse> listProjectInstanceTags =
        genForListProjectInstanceTags();

    private static HttpRequestDef<ListProjectInstanceTagsRequest, ListProjectInstanceTagsResponse> genForListProjectInstanceTags() {
        // basic
        HttpRequestDef.Builder<ListProjectInstanceTagsRequest, ListProjectInstanceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectInstanceTagsRequest.class, ListProjectInstanceTagsResponse.class)
            .withName("ListProjectInstanceTags")
            .withUri("/v2/{project_id}/apigw/instance-tags")
            .withContentType("application/json");

        // requests

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings/binded-signs")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/signs")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}/throttle-specials")
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
        builder.<String>withRequestField("user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getUser,
                ListSpecialThrottlingConfigurationsV2Request::setUser));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsV2Request, ListTagsV2Response> listTagsV2 = genForListTagsV2();

    private static HttpRequestDef<ListTagsV2Request, ListTagsV2Response> genForListTagsV2() {
        // basic
        HttpRequestDef.Builder<ListTagsV2Request, ListTagsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsV2Request.class, ListTagsV2Response.class)
                .withName("ListTagsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/tags")
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

    public static final HttpRequestDef<RemoveEipV2Request, RemoveEipV2Response> removeEipV2 = genForRemoveEipV2();

    private static HttpRequestDef<RemoveEipV2Request, RemoveEipV2Response> genForRemoveEipV2() {
        // basic
        HttpRequestDef.Builder<RemoveEipV2Request, RemoveEipV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemoveEipV2Request.class, RemoveEipV2Response.class)
                .withName("RemoveEipV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/eip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveEipV2Request::getInstanceId, RemoveEipV2Request::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveEngressEipV2Request, RemoveEngressEipV2Response> removeEngressEipV2 =
        genForRemoveEngressEipV2();

    private static HttpRequestDef<RemoveEngressEipV2Request, RemoveEngressEipV2Response> genForRemoveEngressEipV2() {
        // basic
        HttpRequestDef.Builder<RemoveEngressEipV2Request, RemoveEngressEipV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemoveEngressEipV2Request.class, RemoveEngressEipV2Response.class)
                .withName("RemoveEngressEipV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/nat-eip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveEngressEipV2Request::getInstanceId, RemoveEngressEipV2Request::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveIngressEipV2Request, RemoveIngressEipV2Response> removeIngressEipV2 =
        genForRemoveIngressEipV2();

    private static HttpRequestDef<RemoveIngressEipV2Request, RemoveIngressEipV2Response> genForRemoveIngressEipV2() {
        // basic
        HttpRequestDef.Builder<RemoveIngressEipV2Request, RemoveIngressEipV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemoveIngressEipV2Request.class, RemoveIngressEipV2Response.class)
                .withName("RemoveIngressEipV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/ingress-eip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveIngressEipV2Request::getInstanceId, RemoveIngressEipV2Request::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResettingAppSecretV2Request, ResettingAppSecretV2Response> resettingAppSecretV2 =
        genForResettingAppSecretV2();

    private static HttpRequestDef<ResettingAppSecretV2Request, ResettingAppSecretV2Response> genForResettingAppSecretV2() {
        // basic
        HttpRequestDef.Builder<ResettingAppSecretV2Request, ResettingAppSecretV2Response> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ResettingAppSecretV2Request.class, ResettingAppSecretV2Response.class)
            .withName("ResettingAppSecretV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/secret/{app_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResettingAppSecretV2Request::getInstanceId,
                ResettingAppSecretV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResettingAppSecretV2Request::getAppId, ResettingAppSecretV2Request::setAppId));
        builder.<AppResetCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppResetCreate.class),
            f -> f.withMarshaller(ResettingAppSecretV2Request::getBody, ResettingAppSecretV2Request::setBody));

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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}/bound-quota")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-quotas/{app_quota_id}")
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

    public static final HttpRequestDef<ShowAsyncTaskResultRequest, ShowAsyncTaskResultResponse> showAsyncTaskResult =
        genForShowAsyncTaskResult();

    private static HttpRequestDef<ShowAsyncTaskResultRequest, ShowAsyncTaskResultResponse> genForShowAsyncTaskResult() {
        // basic
        HttpRequestDef.Builder<ShowAsyncTaskResultRequest, ShowAsyncTaskResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAsyncTaskResultRequest.class, ShowAsyncTaskResultResponse.class)
                .withName("ShowAsyncTaskResult")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/async-tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAsyncTaskResultRequest::getInstanceId,
                ShowAsyncTaskResultRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAsyncTaskResultRequest::getTaskId, ShowAsyncTaskResultRequest::setTaskId));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}/app-acl")
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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}/app-codes/{app_code_id}")
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

    public static final HttpRequestDef<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> showDetailsOfAppV2 =
        genForShowDetailsOfAppV2();

    private static HttpRequestDef<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> genForShowDetailsOfAppV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfAppV2Request.class, ShowDetailsOfAppV2Response.class)
                .withName("ShowDetailsOfAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/authorizers/{authorizer_id}")
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
                    "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate/{certificate_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/env-variables/{env_variable_id}")
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

    public static final HttpRequestDef<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response> showDetailsOfGatewayResponseTypeV2 =
        genForShowDetailsOfGatewayResponseTypeV2();

    private static HttpRequestDef<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response> genForShowDetailsOfGatewayResponseTypeV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfGatewayResponseTypeV2Request.class,
                    ShowDetailsOfGatewayResponseTypeV2Response.class)
                .withName("ShowDetailsOfGatewayResponseTypeV2")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses/{response_id}/{response_type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseTypeV2Request::getInstanceId,
                ShowDetailsOfGatewayResponseTypeV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseTypeV2Request::getGroupId,
                ShowDetailsOfGatewayResponseTypeV2Request::setGroupId));
        builder.<String>withRequestField("response_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseTypeV2Request::getResponseId,
                ShowDetailsOfGatewayResponseTypeV2Request::setResponseId));
        builder.<ShowDetailsOfGatewayResponseTypeV2Request.ResponseTypeEnum>withRequestField("response_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDetailsOfGatewayResponseTypeV2Request.ResponseTypeEnum.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseTypeV2Request::getResponseType,
                ShowDetailsOfGatewayResponseTypeV2Request::setResponseType));

        // response
        builder.<Map<String, ResponseInfoResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f
                .withMarshaller(ShowDetailsOfGatewayResponseTypeV2Response::getBody,
                    ShowDetailsOfGatewayResponseTypeV2Response::setBody)
                .withInnerContainerType(ResponseInfoResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response> showDetailsOfGatewayResponseV2 =
        genForShowDetailsOfGatewayResponseV2();

    private static HttpRequestDef<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response> genForShowDetailsOfGatewayResponseV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfGatewayResponseV2Request.class,
                    ShowDetailsOfGatewayResponseV2Response.class)
                .withName("ShowDetailsOfGatewayResponseV2")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses/{response_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseV2Request::getInstanceId,
                ShowDetailsOfGatewayResponseV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseV2Request::getGroupId,
                ShowDetailsOfGatewayResponseV2Request::setGroupId));
        builder.<String>withRequestField("response_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseV2Request::getResponseId,
                ShowDetailsOfGatewayResponseV2Request::setResponseId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response> showDetailsOfInstanceProgressV2 =
        genForShowDetailsOfInstanceProgressV2();

    private static HttpRequestDef<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response> genForShowDetailsOfInstanceProgressV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfInstanceProgressV2Request.class,
                    ShowDetailsOfInstanceProgressV2Response.class)
                .withName("ShowDetailsOfInstanceProgressV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/progress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfInstanceProgressV2Request::getInstanceId,
                ShowDetailsOfInstanceProgressV2Request::setInstanceId));

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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}")
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

    public static final HttpRequestDef<ShowDetailsOfOrchestrationRequest, ShowDetailsOfOrchestrationResponse> showDetailsOfOrchestration =
        genForShowDetailsOfOrchestration();

    private static HttpRequestDef<ShowDetailsOfOrchestrationRequest, ShowDetailsOfOrchestrationResponse> genForShowDetailsOfOrchestration() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfOrchestrationRequest, ShowDetailsOfOrchestrationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfOrchestrationRequest.class,
                    ShowDetailsOfOrchestrationResponse.class)
                .withName("ShowDetailsOfOrchestration")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/orchestrations/{orchestration_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfOrchestrationRequest::getInstanceId,
                ShowDetailsOfOrchestrationRequest::setInstanceId));
        builder.<String>withRequestField("orchestration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfOrchestrationRequest::getOrchestrationId,
                ShowDetailsOfOrchestrationRequest::setOrchestrationId));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}")
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

    public static final HttpRequestDef<ShowInstancesNumByTagsRequest, ShowInstancesNumByTagsResponse> showInstancesNumByTags =
        genForShowInstancesNumByTags();

    private static HttpRequestDef<ShowInstancesNumByTagsRequest, ShowInstancesNumByTagsResponse> genForShowInstancesNumByTags() {
        // basic
        HttpRequestDef.Builder<ShowInstancesNumByTagsRequest, ShowInstancesNumByTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowInstancesNumByTagsRequest.class, ShowInstancesNumByTagsResponse.class)
            .withName("ShowInstancesNumByTags")
            .withUri("/v2/{project_id}/apigw/resource-instances/count")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<TmsQueryReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TmsQueryReq.class),
            f -> f.withMarshaller(ShowInstancesNumByTagsRequest::getBody, ShowInstancesNumByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPluginRequest, ShowPluginResponse> showPlugin = genForShowPlugin();

    private static HttpRequestDef<ShowPluginRequest, ShowPluginResponse> genForShowPlugin() {
        // basic
        HttpRequestDef.Builder<ShowPluginRequest, ShowPluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPluginRequest.class, ShowPluginResponse.class)
                .withName("ShowPlugin")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/plugins/{plugin_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/restriction")
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

    public static final HttpRequestDef<UpdateAppAclRequest, UpdateAppAclResponse> updateAppAcl = genForUpdateAppAcl();

    private static HttpRequestDef<UpdateAppAclRequest, UpdateAppAclResponse> genForUpdateAppAcl() {
        // basic
        HttpRequestDef.Builder<UpdateAppAclRequest, UpdateAppAclResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppAclRequest.class, UpdateAppAclResponse.class)
                .withName("UpdateAppAcl")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}/app-acl")
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

    public static final HttpRequestDef<UpdateAppQuotaRequest, UpdateAppQuotaResponse> updateAppQuota =
        genForUpdateAppQuota();

    private static HttpRequestDef<UpdateAppQuotaRequest, UpdateAppQuotaResponse> genForUpdateAppQuota() {
        // basic
        HttpRequestDef.Builder<UpdateAppQuotaRequest, UpdateAppQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppQuotaRequest.class, UpdateAppQuotaResponse.class)
                .withName("UpdateAppQuota")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-quotas/{app_quota_id}")
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

    public static final HttpRequestDef<UpdateAppV2Request, UpdateAppV2Response> updateAppV2 = genForUpdateAppV2();

    private static HttpRequestDef<UpdateAppV2Request, UpdateAppV2Response> genForUpdateAppV2() {
        // basic
        HttpRequestDef.Builder<UpdateAppV2Request, UpdateAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppV2Request.class, UpdateAppV2Response.class)
                .withName("UpdateAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppV2Request::getInstanceId, UpdateAppV2Request::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppV2Request::getAppId, UpdateAppV2Request::setAppId));
        builder.<AppCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppCreate.class),
            f -> f.withMarshaller(UpdateAppV2Request::getBody, UpdateAppV2Request::setBody));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/authorizers/{authorizer_id}")
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

    public static final HttpRequestDef<UpdateDomainV2Request, UpdateDomainV2Response> updateDomainV2 =
        genForUpdateDomainV2();

    private static HttpRequestDef<UpdateDomainV2Request, UpdateDomainV2Response> genForUpdateDomainV2() {
        // basic
        HttpRequestDef.Builder<UpdateDomainV2Request, UpdateDomainV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainV2Request.class, UpdateDomainV2Response.class)
                .withName("UpdateDomainV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}")
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

    public static final HttpRequestDef<UpdateEngressEipV2Request, UpdateEngressEipV2Response> updateEngressEipV2 =
        genForUpdateEngressEipV2();

    private static HttpRequestDef<UpdateEngressEipV2Request, UpdateEngressEipV2Response> genForUpdateEngressEipV2() {
        // basic
        HttpRequestDef.Builder<UpdateEngressEipV2Request, UpdateEngressEipV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEngressEipV2Request.class, UpdateEngressEipV2Response.class)
                .withName("UpdateEngressEipV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/nat-eip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEngressEipV2Request::getInstanceId, UpdateEngressEipV2Request::setInstanceId));
        builder.<OpenEngressEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenEngressEipReq.class),
            f -> f.withMarshaller(UpdateEngressEipV2Request::getBody, UpdateEngressEipV2Request::setBody));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/envs/{env_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/env-variables/{env_variable_id}")
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

    public static final HttpRequestDef<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response> updateGatewayResponseTypeV2 =
        genForUpdateGatewayResponseTypeV2();

    private static HttpRequestDef<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response> genForUpdateGatewayResponseTypeV2() {
        // basic
        HttpRequestDef.Builder<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGatewayResponseTypeV2Request.class,
                    UpdateGatewayResponseTypeV2Response.class)
                .withName("UpdateGatewayResponseTypeV2")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses/{response_id}/{response_type}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGatewayResponseTypeV2Request::getInstanceId,
                UpdateGatewayResponseTypeV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGatewayResponseTypeV2Request::getGroupId,
                UpdateGatewayResponseTypeV2Request::setGroupId));
        builder.<String>withRequestField("response_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGatewayResponseTypeV2Request::getResponseId,
                UpdateGatewayResponseTypeV2Request::setResponseId));
        builder.<UpdateGatewayResponseTypeV2Request.ResponseTypeEnum>withRequestField("response_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGatewayResponseTypeV2Request.ResponseTypeEnum.class),
            f -> f.withMarshaller(UpdateGatewayResponseTypeV2Request::getResponseType,
                UpdateGatewayResponseTypeV2Request::setResponseType));
        builder.<ResponseInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResponseInfo.class),
            f -> f.withMarshaller(UpdateGatewayResponseTypeV2Request::getBody,
                UpdateGatewayResponseTypeV2Request::setBody));

        // response
        builder.<Map<String, ResponseInfoResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f
                .withMarshaller(UpdateGatewayResponseTypeV2Response::getBody,
                    UpdateGatewayResponseTypeV2Response::setBody)
                .withInnerContainerType(ResponseInfoResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response> updateGatewayResponseV2 =
        genForUpdateGatewayResponseV2();

    private static HttpRequestDef<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response> genForUpdateGatewayResponseV2() {
        // basic
        HttpRequestDef.Builder<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateGatewayResponseV2Request.class, UpdateGatewayResponseV2Response.class)
            .withName("UpdateGatewayResponseV2")
            .withUri(
                "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses/{response_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGatewayResponseV2Request::getInstanceId,
                UpdateGatewayResponseV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGatewayResponseV2Request::getGroupId,
                UpdateGatewayResponseV2Request::setGroupId));
        builder.<String>withRequestField("response_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGatewayResponseV2Request::getResponseId,
                UpdateGatewayResponseV2Request::setResponseId));
        builder.<ResponsesCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResponsesCreate.class),
            f -> f.withMarshaller(UpdateGatewayResponseV2Request::getBody, UpdateGatewayResponseV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIngressEipV2Request, UpdateIngressEipV2Response> updateIngressEipV2 =
        genForUpdateIngressEipV2();

    private static HttpRequestDef<UpdateIngressEipV2Request, UpdateIngressEipV2Response> genForUpdateIngressEipV2() {
        // basic
        HttpRequestDef.Builder<UpdateIngressEipV2Request, UpdateIngressEipV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIngressEipV2Request.class, UpdateIngressEipV2Response.class)
                .withName("UpdateIngressEipV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/ingress-eip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIngressEipV2Request::getInstanceId, UpdateIngressEipV2Request::setInstanceId));
        builder.<OpenIngressEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenIngressEipReq.class),
            f -> f.withMarshaller(UpdateIngressEipV2Request::getBody, UpdateIngressEipV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceV2Request, UpdateInstanceV2Response> updateInstanceV2 =
        genForUpdateInstanceV2();

    private static HttpRequestDef<UpdateInstanceV2Request, UpdateInstanceV2Response> genForUpdateInstanceV2() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceV2Request, UpdateInstanceV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceV2Request.class, UpdateInstanceV2Response.class)
                .withName("UpdateInstanceV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceV2Request::getInstanceId, UpdateInstanceV2Request::setInstanceId));
        builder.<InstanceModReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceModReq.class),
            f -> f.withMarshaller(UpdateInstanceV2Request::getBody, UpdateInstanceV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOrchestrationRequest, UpdateOrchestrationResponse> updateOrchestration =
        genForUpdateOrchestration();

    private static HttpRequestDef<UpdateOrchestrationRequest, UpdateOrchestrationResponse> genForUpdateOrchestration() {
        // basic
        HttpRequestDef.Builder<UpdateOrchestrationRequest, UpdateOrchestrationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateOrchestrationRequest.class, UpdateOrchestrationResponse.class)
                .withName("UpdateOrchestration")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/orchestrations/{orchestration_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOrchestrationRequest::getInstanceId,
                UpdateOrchestrationRequest::setInstanceId));
        builder.<String>withRequestField("orchestration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOrchestrationRequest::getOrchestrationId,
                UpdateOrchestrationRequest::setOrchestrationId));
        builder.<OrchestrationCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OrchestrationCreate.class),
            f -> f.withMarshaller(UpdateOrchestrationRequest::getBody, UpdateOrchestrationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePluginRequest, UpdatePluginResponse> updatePlugin = genForUpdatePlugin();

    private static HttpRequestDef<UpdatePluginRequest, UpdatePluginResponse> genForUpdatePlugin() {
        // basic
        HttpRequestDef.Builder<UpdatePluginRequest, UpdatePluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePluginRequest.class, UpdatePluginResponse.class)
                .withName("UpdatePlugin")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/plugins/{plugin_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}")
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

    public static final HttpRequestDef<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> updateSignatureKeyV2 =
        genForUpdateSignatureKeyV2();

    private static HttpRequestDef<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> genForUpdateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateSignatureKeyV2Request.class, UpdateSignatureKeyV2Response.class)
            .withName("UpdateSignatureKeyV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/signs/{sign_id}")
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

    public static final HttpRequestDef<UpdateSlDomainSettingV2Request, UpdateSlDomainSettingV2Response> updateSlDomainSettingV2 =
        genForUpdateSlDomainSettingV2();

    private static HttpRequestDef<UpdateSlDomainSettingV2Request, UpdateSlDomainSettingV2Response> genForUpdateSlDomainSettingV2() {
        // basic
        HttpRequestDef.Builder<UpdateSlDomainSettingV2Request, UpdateSlDomainSettingV2Response> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateSlDomainSettingV2Request.class, UpdateSlDomainSettingV2Response.class)
            .withName("UpdateSlDomainSettingV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/sl-domain-access-settings")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSlDomainSettingV2Request::getInstanceId,
                UpdateSlDomainSettingV2Request::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSlDomainSettingV2Request::getGroupId,
                UpdateSlDomainSettingV2Request::setGroupId));
        builder.<SlDomainAccessSetting>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SlDomainAccessSetting.class),
            f -> f.withMarshaller(UpdateSlDomainSettingV2Request::getBody, UpdateSlDomainSettingV2Request::setBody));

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
                    "/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}/throttle-specials/{strategy_id}")
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

    public static final HttpRequestDef<BatchDeleteAclV2Request, BatchDeleteAclV2Response> batchDeleteAclV2 =
        genForBatchDeleteAclV2();

    private static HttpRequestDef<BatchDeleteAclV2Request, BatchDeleteAclV2Response> genForBatchDeleteAclV2() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAclV2Request, BatchDeleteAclV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchDeleteAclV2Request.class, BatchDeleteAclV2Response.class)
                .withName("BatchDeleteAclV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acls")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acls")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acls/{acl_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acls")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acls/{acl_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acls/{acl_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/publish")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/publish/{api_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/check")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/check")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/action")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/debug/{api_id}")
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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/versions/{version_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/{api_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings/{throttle_binding_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups")
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
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getPreciseSearch, ListApiGroupsV2Request::setPreciseSearch));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/runtime/{api_id}")
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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/versions/{version_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/publish/{api_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings/binded-apis")
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
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getTags,
                ListApisBindedToRequestThrottlingPolicyV2Request::setTags));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings/unbinded-apis")
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
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getTags,
                ListApisUnbindedToRequestThrottlingPolicyV2Request::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisV2Request, ListApisV2Response> listApisV2 = genForListApisV2();

    private static HttpRequestDef<ListApisV2Request, ListApisV2Response> genForListApisV2() {
        // basic
        HttpRequestDef.Builder<ListApisV2Request, ListApisV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisV2Request.class, ListApisV2Response.class)
                .withName("ListApisV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis")
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
        builder.<String>withRequestField("vpc_channel_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getVpcChannelName, ListApisV2Request::setVpcChannelName));
        builder.<String>withRequestField("return_data_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getReturnDataMode, ListApisV2Request::setReturnDataMode));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getTags, ListApisV2Request::setTags));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings/binded-throttles")
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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/{api_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/{api_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acl-bindings")
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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acl-bindings")
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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acl-bindings/{acl_bindings_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acl-bindings/binded-acls")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acl-bindings/binded-apis")
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
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getApiId,
                ListApisBindedToAclPolicyV2Request::setApiId));
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
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getTags,
                ListApisBindedToAclPolicyV2Request::setTags));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acl-bindings/unbinded-apis")
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
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getTags,
                ListApisUnbindedToAclPolicyV2Request::setTags));

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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths/{app_auth_id}")
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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths")
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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths/binded-apis")
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
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getTags, ListApisBindedToAppV2Request::setTags));

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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths/unbinded-apis")
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
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getTags, ListApisUnbindedToAppV2Request::setTags));

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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths/binded-apps")
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

    public static final HttpRequestDef<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> exportApiDefinitionsV2 =
        genForExportApiDefinitionsV2();

    private static HttpRequestDef<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> genForExportApiDefinitionsV2() {
        // basic
        HttpRequestDef.Builder<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExportApiDefinitionsV2Request.class, ExportApiDefinitionsV2Response.class)
            .withName("ExportApiDefinitionsV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/openapi/export")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportApiDefinitionsV2Request::getInstanceId,
                ExportApiDefinitionsV2Request::setInstanceId));
        builder.<ExportApiDefinitionsV2Request.OasVersionEnum>withRequestField("oas_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportApiDefinitionsV2Request.OasVersionEnum.class),
            f -> f.withMarshaller(ExportApiDefinitionsV2Request::getOasVersion,
                ExportApiDefinitionsV2Request::setOasVersion));
        builder.<ExportOpenApiReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportOpenApiReq.class),
            f -> f.withMarshaller(ExportApiDefinitionsV2Request::getBody, ExportApiDefinitionsV2Request::setBody));

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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/openapi/import")
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

    public static final HttpRequestDef<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response> batchAssociateCertsV2 =
        genForBatchAssociateCertsV2();

    private static HttpRequestDef<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response> genForBatchAssociateCertsV2() {
        // basic
        HttpRequestDef.Builder<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAssociateCertsV2Request.class, BatchAssociateCertsV2Response.class)
            .withName("BatchAssociateCertsV2")
            .withUri(
                "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificates/attach")
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
            .withUri("/v2/{project_id}/apigw/certificates/{certificate_id}/domains/attach")
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
                    "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificates/detach")
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
                .withUri("/v2/{project_id}/apigw/certificates/{certificate_id}/domains/detach")
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
                .withUri("/v2/{project_id}/apigw/certificates")
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
            .withUri("/v2/{project_id}/apigw/certificates/{certificate_id}")
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
            .withUri("/v2/{project_id}/apigw/certificates/{certificate_id}/attached-domains")
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
                .withUri("/v2/{project_id}/apigw/certificates")
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
                .withUri("/v2/{project_id}/apigw/certificates/{certificate_id}")
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
                .withUri("/v2/{project_id}/apigw/certificates/{certificate_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members")
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
        HttpRequestDef.Builder<BatchDisableMembersRequest, BatchDisableMembersResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDisableMembersRequest.class, BatchDisableMembersResponse.class)
            .withName("BatchDisableMembers")
            .withUri(
                "/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members/batch-disable")
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
                    "/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members/batch-enable")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups")
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

    public static final HttpRequestDef<CreateVpcChannelV2Request, CreateVpcChannelV2Response> createVpcChannelV2 =
        genForCreateVpcChannelV2();

    private static HttpRequestDef<CreateVpcChannelV2Request, CreateVpcChannelV2Response> genForCreateVpcChannelV2() {
        // basic
        HttpRequestDef.Builder<CreateVpcChannelV2Request, CreateVpcChannelV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcChannelV2Request.class, CreateVpcChannelV2Response.class)
                .withName("CreateVpcChannelV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels")
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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members/{member_id}")
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
                "/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups/{member_group_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}")
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
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups")
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

    public static final HttpRequestDef<ListVpcChannelsV2Request, ListVpcChannelsV2Response> listVpcChannelsV2 =
        genForListVpcChannelsV2();

    private static HttpRequestDef<ListVpcChannelsV2Request, ListVpcChannelsV2Response> genForListVpcChannelsV2() {
        // basic
        HttpRequestDef.Builder<ListVpcChannelsV2Request, ListVpcChannelsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcChannelsV2Request.class, ListVpcChannelsV2Response.class)
                .withName("ListVpcChannelsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels")
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
                    "/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups/{member_group_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members")
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
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/health-config")
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
                "/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups/{member_group_id}")
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

    public static final HttpRequestDef<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> updateVpcChannelV2 =
        genForUpdateVpcChannelV2();

    private static HttpRequestDef<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> genForUpdateVpcChannelV2() {
        // basic
        HttpRequestDef.Builder<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpcChannelV2Request.class, UpdateVpcChannelV2Response.class)
                .withName("UpdateVpcChannelV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}")
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
