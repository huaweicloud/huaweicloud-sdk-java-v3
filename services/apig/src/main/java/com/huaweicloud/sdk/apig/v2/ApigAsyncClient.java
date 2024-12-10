package com.huaweicloud.sdk.apig.v2;

import com.huaweicloud.sdk.apig.v2.model.AcceptOrRejectEndpointConnectionsRequest;
import com.huaweicloud.sdk.apig.v2.model.AcceptOrRejectEndpointConnectionsResponse;
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
import com.huaweicloud.sdk.apig.v2.model.AttachPluginToApiRequest;
import com.huaweicloud.sdk.apig.v2.model.AttachPluginToApiResponse;
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
import com.huaweicloud.sdk.apig.v2.model.ChangeApiVersionV2Request;
import com.huaweicloud.sdk.apig.v2.model.ChangeApiVersionV2Response;
import com.huaweicloud.sdk.apig.v2.model.CheckApiGroupsV2Request;
import com.huaweicloud.sdk.apig.v2.model.CheckApiGroupsV2Response;
import com.huaweicloud.sdk.apig.v2.model.CheckApisV2Request;
import com.huaweicloud.sdk.apig.v2.model.CheckApisV2Response;
import com.huaweicloud.sdk.apig.v2.model.CheckAppV2Request;
import com.huaweicloud.sdk.apig.v2.model.CheckAppV2Response;
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
import com.huaweicloud.sdk.apig.v2.model.ExportApiDefinitionsAsyncRequest;
import com.huaweicloud.sdk.apig.v2.model.ExportApiDefinitionsAsyncResponse;
import com.huaweicloud.sdk.apig.v2.model.ExportApiDefinitionsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ExportApiDefinitionsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ImportApiDefinitionsAsyncRequest;
import com.huaweicloud.sdk.apig.v2.model.ImportApiDefinitionsAsyncResponse;
import com.huaweicloud.sdk.apig.v2.model.ImportApiDefinitionsV2Request;
import com.huaweicloud.sdk.apig.v2.model.ImportApiDefinitionsV2Response;
import com.huaweicloud.sdk.apig.v2.model.ImportMicroserviceRequest;
import com.huaweicloud.sdk.apig.v2.model.ImportMicroserviceResponse;
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
import com.huaweicloud.sdk.apig.v2.model.RemoveEipV2Request;
import com.huaweicloud.sdk.apig.v2.model.RemoveEipV2Response;
import com.huaweicloud.sdk.apig.v2.model.RemoveEngressEipV2Request;
import com.huaweicloud.sdk.apig.v2.model.RemoveEngressEipV2Response;
import com.huaweicloud.sdk.apig.v2.model.RemoveIngressEipV2Request;
import com.huaweicloud.sdk.apig.v2.model.RemoveIngressEipV2Response;
import com.huaweicloud.sdk.apig.v2.model.ResettingAppSecretV2Request;
import com.huaweicloud.sdk.apig.v2.model.ResettingAppSecretV2Response;
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
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class ApigAsyncClient {

    protected HcClient hcClient;

    public ApigAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ApigAsyncClient> newBuilder() {
        ClientBuilder<ApigAsyncClient> clientBuilder = new ClientBuilder<>(ApigAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 接受或拒绝终端节点连接
     *
     * 接受或拒绝实例节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptOrRejectEndpointConnectionsRequest 请求对象
     * @return CompletableFuture<AcceptOrRejectEndpointConnectionsResponse>
     */
    public CompletableFuture<AcceptOrRejectEndpointConnectionsResponse> acceptOrRejectEndpointConnectionsAsync(
        AcceptOrRejectEndpointConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.acceptOrRejectEndpointConnections);
    }

    /**
     * 接受或拒绝终端节点连接
     *
     * 接受或拒绝实例节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptOrRejectEndpointConnectionsRequest 请求对象
     * @return AsyncInvoker<AcceptOrRejectEndpointConnectionsRequest, AcceptOrRejectEndpointConnectionsResponse>
     */
    public AsyncInvoker<AcceptOrRejectEndpointConnectionsRequest, AcceptOrRejectEndpointConnectionsResponse> acceptOrRejectEndpointConnectionsAsyncInvoker(
        AcceptOrRejectEndpointConnectionsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.acceptOrRejectEndpointConnections, hcClient);
    }

    /**
     * 新增实例的自定义入方向端口
     *
     * 新增实例的自定义入方向端口，在同个实例中，一个端口仅能支持一种协议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCustomIngressPortRequest 请求对象
     * @return CompletableFuture<AddCustomIngressPortResponse>
     */
    public CompletableFuture<AddCustomIngressPortResponse> addCustomIngressPortAsync(
        AddCustomIngressPortRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.addCustomIngressPort);
    }

    /**
     * 新增实例的自定义入方向端口
     *
     * 新增实例的自定义入方向端口，在同个实例中，一个端口仅能支持一种协议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCustomIngressPortRequest 请求对象
     * @return AsyncInvoker<AddCustomIngressPortRequest, AddCustomIngressPortResponse>
     */
    public AsyncInvoker<AddCustomIngressPortRequest, AddCustomIngressPortResponse> addCustomIngressPortAsyncInvoker(
        AddCustomIngressPortRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.addCustomIngressPort, hcClient);
    }

    /**
     * 实例更新或绑定EIP
     *
     * 实例更新或绑定EIP(仅当实例为LVS类型时支持)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEipV2Request 请求对象
     * @return CompletableFuture<AddEipV2Response>
     */
    public CompletableFuture<AddEipV2Response> addEipV2Async(AddEipV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.addEipV2);
    }

    /**
     * 实例更新或绑定EIP
     *
     * 实例更新或绑定EIP(仅当实例为LVS类型时支持)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEipV2Request 请求对象
     * @return AsyncInvoker<AddEipV2Request, AddEipV2Response>
     */
    public AsyncInvoker<AddEipV2Request, AddEipV2Response> addEipV2AsyncInvoker(AddEipV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.addEipV2, hcClient);
    }

    /**
     * 批量添加实例终端节点连接白名单
     *
     * 批量添加实例终端节点连接白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEndpointPermissionsRequest 请求对象
     * @return CompletableFuture<AddEndpointPermissionsResponse>
     */
    public CompletableFuture<AddEndpointPermissionsResponse> addEndpointPermissionsAsync(
        AddEndpointPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.addEndpointPermissions);
    }

    /**
     * 批量添加实例终端节点连接白名单
     *
     * 批量添加实例终端节点连接白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEndpointPermissionsRequest 请求对象
     * @return AsyncInvoker<AddEndpointPermissionsRequest, AddEndpointPermissionsResponse>
     */
    public AsyncInvoker<AddEndpointPermissionsRequest, AddEndpointPermissionsResponse> addEndpointPermissionsAsyncInvoker(
        AddEndpointPermissionsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.addEndpointPermissions, hcClient);
    }

    /**
     * 开启实例公网出口
     *
     * 实例开启公网出口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEngressEipV2Request 请求对象
     * @return CompletableFuture<AddEngressEipV2Response>
     */
    public CompletableFuture<AddEngressEipV2Response> addEngressEipV2Async(AddEngressEipV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.addEngressEipV2);
    }

    /**
     * 开启实例公网出口
     *
     * 实例开启公网出口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEngressEipV2Request 请求对象
     * @return AsyncInvoker<AddEngressEipV2Request, AddEngressEipV2Response>
     */
    public AsyncInvoker<AddEngressEipV2Request, AddEngressEipV2Response> addEngressEipV2AsyncInvoker(
        AddEngressEipV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.addEngressEipV2, hcClient);
    }

    /**
     * 开启实例公网入口
     *
     * 开启实例开启公网入口，仅当实例为ELB类型时支持
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddIngressEipV2Request 请求对象
     * @return CompletableFuture<AddIngressEipV2Response>
     */
    public CompletableFuture<AddIngressEipV2Response> addIngressEipV2Async(AddIngressEipV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.addIngressEipV2);
    }

    /**
     * 开启实例公网入口
     *
     * 开启实例开启公网入口，仅当实例为ELB类型时支持
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddIngressEipV2Request 请求对象
     * @return AsyncInvoker<AddIngressEipV2Request, AddIngressEipV2Response>
     */
    public AsyncInvoker<AddIngressEipV2Request, AddIngressEipV2Response> addIngressEipV2AsyncInvoker(
        AddIngressEipV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.addIngressEipV2, hcClient);
    }

    /**
     * 凭据配额绑定凭据列表
     *
     * 凭据配额绑定凭据列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAppsForAppQuotaRequest 请求对象
     * @return CompletableFuture<AssociateAppsForAppQuotaResponse>
     */
    public CompletableFuture<AssociateAppsForAppQuotaResponse> associateAppsForAppQuotaAsync(
        AssociateAppsForAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.associateAppsForAppQuota);
    }

    /**
     * 凭据配额绑定凭据列表
     *
     * 凭据配额绑定凭据列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAppsForAppQuotaRequest 请求对象
     * @return AsyncInvoker<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse>
     */
    public AsyncInvoker<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse> associateAppsForAppQuotaAsyncInvoker(
        AssociateAppsForAppQuotaRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.associateAppsForAppQuota, hcClient);
    }

    /**
     * 绑定域名证书
     *
     * 如果创建API时，“定义API请求”使用HTTPS请求协议，那么在独立域名中需要添加SSL证书。
     * 使用实例自定义入方向端口的特性时，相同的域名会同时绑定证书，注意开启/关闭客户端校验会对相同域名的不同端口同时生效。
     * 本章节主要介绍为特定域名绑定证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateCertificateV2Request 请求对象
     * @return CompletableFuture<AssociateCertificateV2Response>
     */
    public CompletableFuture<AssociateCertificateV2Response> associateCertificateV2Async(
        AssociateCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.associateCertificateV2);
    }

    /**
     * 绑定域名证书
     *
     * 如果创建API时，“定义API请求”使用HTTPS请求协议，那么在独立域名中需要添加SSL证书。
     * 使用实例自定义入方向端口的特性时，相同的域名会同时绑定证书，注意开启/关闭客户端校验会对相同域名的不同端口同时生效。
     * 本章节主要介绍为特定域名绑定证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateCertificateV2Request 请求对象
     * @return AsyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response>
     */
    public AsyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response> associateCertificateV2AsyncInvoker(
        AssociateCertificateV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.associateCertificateV2, hcClient);
    }

    /**
     * 绑定域名
     *
     * 用户自定义的域名，需要增加A记录才能生效，具体方法请参见《云解析服务用户指南》的“添加A类型记录集”章节。
     * 
     * 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateDomainV2Request 请求对象
     * @return CompletableFuture<AssociateDomainV2Response>
     */
    public CompletableFuture<AssociateDomainV2Response> associateDomainV2Async(AssociateDomainV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.associateDomainV2);
    }

    /**
     * 绑定域名
     *
     * 用户自定义的域名，需要增加A记录才能生效，具体方法请参见《云解析服务用户指南》的“添加A类型记录集”章节。
     * 
     * 每个API分组下最多可绑定5个域名。绑定域名后，用户可通过自定义域名调用API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateDomainV2Request 请求对象
     * @return AsyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response>
     */
    public AsyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response> associateDomainV2AsyncInvoker(
        AssociateDomainV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.associateDomainV2, hcClient);
    }

    /**
     * 绑定签名密钥
     *
     * 签名密钥创建后，需要绑定到API才能生效。
     * 
     * 
     * 将签名密钥绑定到API后，则API网关请求后端服务时就会使用这个签名密钥进行加密签名，后端服务可以校验这个签名来验证请求来源。
     * 
     * 
     * 将指定的签名密钥绑定到一个或多个已发布的API上。同一个API发布到不同的环境可以绑定不同的签名密钥；一个API在发布到特定环境后只能绑定一个签名密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<AssociateSignatureKeyV2Response>
     */
    public CompletableFuture<AssociateSignatureKeyV2Response> associateSignatureKeyV2Async(
        AssociateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.associateSignatureKeyV2);
    }

    /**
     * 绑定签名密钥
     *
     * 签名密钥创建后，需要绑定到API才能生效。
     * 
     * 
     * 将签名密钥绑定到API后，则API网关请求后端服务时就会使用这个签名密钥进行加密签名，后端服务可以校验这个签名来验证请求来源。
     * 
     * 
     * 将指定的签名密钥绑定到一个或多个已发布的API上。同一个API发布到不同的环境可以绑定不同的签名密钥；一个API在发布到特定环境后只能绑定一个签名密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response>
     */
    public AsyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> associateSignatureKeyV2AsyncInvoker(
        AssociateSignatureKeyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.associateSignatureKeyV2, hcClient);
    }

    /**
     * 插件绑定API
     *
     * 绑定插件到API上。
     * - 只能选择发布状态的API
     * - 绑定以后及时生效
     * - 修改插件后及时生效
     * - 相同类型的插件只能绑定一个，如果再次绑定同类型的插件，那么已绑定的同类型插件将直接被覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachApiToPluginRequest 请求对象
     * @return CompletableFuture<AttachApiToPluginResponse>
     */
    public CompletableFuture<AttachApiToPluginResponse> attachApiToPluginAsync(AttachApiToPluginRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.attachApiToPlugin);
    }

    /**
     * 插件绑定API
     *
     * 绑定插件到API上。
     * - 只能选择发布状态的API
     * - 绑定以后及时生效
     * - 修改插件后及时生效
     * - 相同类型的插件只能绑定一个，如果再次绑定同类型的插件，那么已绑定的同类型插件将直接被覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachApiToPluginRequest 请求对象
     * @return AsyncInvoker<AttachApiToPluginRequest, AttachApiToPluginResponse>
     */
    public AsyncInvoker<AttachApiToPluginRequest, AttachApiToPluginResponse> attachApiToPluginAsyncInvoker(
        AttachApiToPluginRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.attachApiToPlugin, hcClient);
    }

    /**
     * API绑定插件
     *
     * 绑定插件到API上。
     * - 只能选择发布状态的API
     * - 绑定以后及时生效
     * - 修改插件后及时生效
     * - 相同类型的插件只能绑定一个，如果再次绑定同类型的插件，那么已绑定的同类型插件将直接被覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachPluginToApiRequest 请求对象
     * @return CompletableFuture<AttachPluginToApiResponse>
     */
    public CompletableFuture<AttachPluginToApiResponse> attachPluginToApiAsync(AttachPluginToApiRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.attachPluginToApi);
    }

    /**
     * API绑定插件
     *
     * 绑定插件到API上。
     * - 只能选择发布状态的API
     * - 绑定以后及时生效
     * - 修改插件后及时生效
     * - 相同类型的插件只能绑定一个，如果再次绑定同类型的插件，那么已绑定的同类型插件将直接被覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachPluginToApiRequest 请求对象
     * @return AsyncInvoker<AttachPluginToApiRequest, AttachPluginToApiResponse>
     */
    public AsyncInvoker<AttachPluginToApiRequest, AttachPluginToApiResponse> attachPluginToApiAsyncInvoker(
        AttachPluginToApiRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.attachPluginToApi, hcClient);
    }

    /**
     * 批量添加或删除单个实例的标签
     *
     * 批量添加或删除单个实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteInstanceTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateOrDeleteInstanceTagsResponse>
     */
    public CompletableFuture<BatchCreateOrDeleteInstanceTagsResponse> batchCreateOrDeleteInstanceTagsAsync(
        BatchCreateOrDeleteInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchCreateOrDeleteInstanceTags);
    }

    /**
     * 批量添加或删除单个实例的标签
     *
     * 批量添加或删除单个实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteInstanceTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateOrDeleteInstanceTagsRequest, BatchCreateOrDeleteInstanceTagsResponse>
     */
    public AsyncInvoker<BatchCreateOrDeleteInstanceTagsRequest, BatchCreateOrDeleteInstanceTagsResponse> batchCreateOrDeleteInstanceTagsAsyncInvoker(
        BatchCreateOrDeleteInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.batchCreateOrDeleteInstanceTags, hcClient);
    }

    /**
     * 校验APP
     *
     * 校验app是否存在，非APP所有者可以调用该接口校验APP是否真实存在。这个接口只展示app的基本信息id 、name、
     * remark，其他信息不显示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAppV2Request 请求对象
     * @return CompletableFuture<CheckAppV2Response>
     */
    public CompletableFuture<CheckAppV2Response> checkAppV2Async(CheckAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.checkAppV2);
    }

    /**
     * 校验APP
     *
     * 校验app是否存在，非APP所有者可以调用该接口校验APP是否真实存在。这个接口只展示app的基本信息id 、name、
     * remark，其他信息不显示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAppV2Request 请求对象
     * @return AsyncInvoker<CheckAppV2Request, CheckAppV2Response>
     */
    public AsyncInvoker<CheckAppV2Request, CheckAppV2Response> checkAppV2AsyncInvoker(CheckAppV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.checkAppV2, hcClient);
    }

    /**
     * 创建APP
     *
     * APP即应用，是一个可以访问API的身份标识。将API授权给APP后，APP即可调用API。
     * 创建一个APP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnAppV2Request 请求对象
     * @return CompletableFuture<CreateAnAppV2Response>
     */
    public CompletableFuture<CreateAnAppV2Response> createAnAppV2Async(CreateAnAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createAnAppV2);
    }

    /**
     * 创建APP
     *
     * APP即应用，是一个可以访问API的身份标识。将API授权给APP后，APP即可调用API。
     * 创建一个APP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnAppV2Request 请求对象
     * @return AsyncInvoker<CreateAnAppV2Request, CreateAnAppV2Response>
     */
    public AsyncInvoker<CreateAnAppV2Request, CreateAnAppV2Response> createAnAppV2AsyncInvoker(
        CreateAnAppV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createAnAppV2, hcClient);
    }

    /**
     * 自动生成APP Code
     *
     * 创建App Code时，可以不指定具体值，由后台自动生成随机字符串填充。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppCodeAutoV2Request 请求对象
     * @return CompletableFuture<CreateAppCodeAutoV2Response>
     */
    public CompletableFuture<CreateAppCodeAutoV2Response> createAppCodeAutoV2Async(CreateAppCodeAutoV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createAppCodeAutoV2);
    }

    /**
     * 自动生成APP Code
     *
     * 创建App Code时，可以不指定具体值，由后台自动生成随机字符串填充。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppCodeAutoV2Request 请求对象
     * @return AsyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response>
     */
    public AsyncInvoker<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> createAppCodeAutoV2AsyncInvoker(
        CreateAppCodeAutoV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createAppCodeAutoV2, hcClient);
    }

    /**
     * 创建APP Code
     *
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppCodeV2Request 请求对象
     * @return CompletableFuture<CreateAppCodeV2Response>
     */
    public CompletableFuture<CreateAppCodeV2Response> createAppCodeV2Async(CreateAppCodeV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createAppCodeV2);
    }

    /**
     * 创建APP Code
     *
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppCodeV2Request 请求对象
     * @return AsyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response>
     */
    public AsyncInvoker<CreateAppCodeV2Request, CreateAppCodeV2Response> createAppCodeV2AsyncInvoker(
        CreateAppCodeV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createAppCodeV2, hcClient);
    }

    /**
     * 创建凭据配额
     *
     * 创建凭据配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppQuotaRequest 请求对象
     * @return CompletableFuture<CreateAppQuotaResponse>
     */
    public CompletableFuture<CreateAppQuotaResponse> createAppQuotaAsync(CreateAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createAppQuota);
    }

    /**
     * 创建凭据配额
     *
     * 创建凭据配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppQuotaRequest 请求对象
     * @return AsyncInvoker<CreateAppQuotaRequest, CreateAppQuotaResponse>
     */
    public AsyncInvoker<CreateAppQuotaRequest, CreateAppQuotaResponse> createAppQuotaAsyncInvoker(
        CreateAppQuotaRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.createAppQuota, hcClient);
    }

    /**
     * 创建自定义认证
     *
     * 创建自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomAuthorizerV2Request 请求对象
     * @return CompletableFuture<CreateCustomAuthorizerV2Response>
     */
    public CompletableFuture<CreateCustomAuthorizerV2Response> createCustomAuthorizerV2Async(
        CreateCustomAuthorizerV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createCustomAuthorizerV2);
    }

    /**
     * 创建自定义认证
     *
     * 创建自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomAuthorizerV2Request 请求对象
     * @return AsyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response>
     */
    public AsyncInvoker<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> createCustomAuthorizerV2AsyncInvoker(
        CreateCustomAuthorizerV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createCustomAuthorizerV2, hcClient);
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
     * 为此，API网关提供多环境管理功能，使租户能够最大化的模拟实际场景，低成本的接入API网关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentV2Request 请求对象
     * @return CompletableFuture<CreateEnvironmentV2Response>
     */
    public CompletableFuture<CreateEnvironmentV2Response> createEnvironmentV2Async(CreateEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createEnvironmentV2);
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
     * 为此，API网关提供多环境管理功能，使租户能够最大化的模拟实际场景，低成本的接入API网关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentV2Request 请求对象
     * @return AsyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response>
     */
    public AsyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response> createEnvironmentV2AsyncInvoker(
        CreateEnvironmentV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createEnvironmentV2, hcClient);
    }

    /**
     * 新建变量
     *
     * 将API发布到不同的环境后，对于不同的环境，可能会有不同的环境变量，比如，API的服务部署地址，请求的版本号等。
     * 
     * 
     * 用户可以定义不同的环境变量，用户在定义API时，在API的定义中使用这些变量，当调用API时，API网关会将这些变量替换成真实的变量值，以达到不同环境的区分效果。
     * 
     * 
     * 环境变量定义在API分组上，该分组下的所有API都可以使用这些变量。
     * 
     * &gt; 1. 环境变量的变量名称必须保持唯一，即一个分组在同一个环境上不能有两个同名的变量。
     * &gt; 2. 环境变量区分大小写，即变量ABC与变量abc是两个不同的变量。
     * &gt; 3. 设置了环境变量后，使用到该变量的API的调试功能将不可使用。
     * &gt; 4. 定义了环境变量后，使用到环境变量的地方应该以对称的#标识环境变量，当API发布到相应的环境后，会对环境变量的值进行替换，如：定义的API的URL为：https://#address#:8080，环境变量address在RELEASE环境上的值为：192.168.1.5，则API发布到RELEASE环境后的真实的URL为：https://192.168.1.5:8080。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<CreateEnvironmentVariableV2Response>
     */
    public CompletableFuture<CreateEnvironmentVariableV2Response> createEnvironmentVariableV2Async(
        CreateEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createEnvironmentVariableV2);
    }

    /**
     * 新建变量
     *
     * 将API发布到不同的环境后，对于不同的环境，可能会有不同的环境变量，比如，API的服务部署地址，请求的版本号等。
     * 
     * 
     * 用户可以定义不同的环境变量，用户在定义API时，在API的定义中使用这些变量，当调用API时，API网关会将这些变量替换成真实的变量值，以达到不同环境的区分效果。
     * 
     * 
     * 环境变量定义在API分组上，该分组下的所有API都可以使用这些变量。
     * 
     * &gt; 1. 环境变量的变量名称必须保持唯一，即一个分组在同一个环境上不能有两个同名的变量。
     * &gt; 2. 环境变量区分大小写，即变量ABC与变量abc是两个不同的变量。
     * &gt; 3. 设置了环境变量后，使用到该变量的API的调试功能将不可使用。
     * &gt; 4. 定义了环境变量后，使用到环境变量的地方应该以对称的#标识环境变量，当API发布到相应的环境后，会对环境变量的值进行替换，如：定义的API的URL为：https://#address#:8080，环境变量address在RELEASE环境上的值为：192.168.1.5，则API发布到RELEASE环境后的真实的URL为：https://192.168.1.5:8080。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentVariableV2Request 请求对象
     * @return AsyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response>
     */
    public AsyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> createEnvironmentVariableV2AsyncInvoker(
        CreateEnvironmentVariableV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createEnvironmentVariableV2, hcClient);
    }

    /**
     * 实例配置特性
     *
     * 为实例配置需要的特性。
     * 
     * 支持配置的特性列表及特性配置示例请参考本手册中的“附录 &gt; 实例支持的APIG特性”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFeatureV2Request 请求对象
     * @return CompletableFuture<CreateFeatureV2Response>
     */
    public CompletableFuture<CreateFeatureV2Response> createFeatureV2Async(CreateFeatureV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createFeatureV2);
    }

    /**
     * 实例配置特性
     *
     * 为实例配置需要的特性。
     * 
     * 支持配置的特性列表及特性配置示例请参考本手册中的“附录 &gt; 实例支持的APIG特性”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFeatureV2Request 请求对象
     * @return AsyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response>
     */
    public AsyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response> createFeatureV2AsyncInvoker(
        CreateFeatureV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createFeatureV2, hcClient);
    }

    /**
     * 创建分组自定义响应
     *
     * 新增分组下自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGatewayResponseV2Request 请求对象
     * @return CompletableFuture<CreateGatewayResponseV2Response>
     */
    public CompletableFuture<CreateGatewayResponseV2Response> createGatewayResponseV2Async(
        CreateGatewayResponseV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createGatewayResponseV2);
    }

    /**
     * 创建分组自定义响应
     *
     * 新增分组下自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGatewayResponseV2Request 请求对象
     * @return AsyncInvoker<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response>
     */
    public AsyncInvoker<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response> createGatewayResponseV2AsyncInvoker(
        CreateGatewayResponseV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createGatewayResponseV2, hcClient);
    }

    /**
     * 创建专享版实例（按需）
     *
     * 创建按需专享版实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceV2Request 请求对象
     * @return CompletableFuture<CreateInstanceV2Response>
     */
    public CompletableFuture<CreateInstanceV2Response> createInstanceV2Async(CreateInstanceV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createInstanceV2);
    }

    /**
     * 创建专享版实例（按需）
     *
     * 创建按需专享版实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceV2Request 请求对象
     * @return AsyncInvoker<CreateInstanceV2Request, CreateInstanceV2Response>
     */
    public AsyncInvoker<CreateInstanceV2Request, CreateInstanceV2Response> createInstanceV2AsyncInvoker(
        CreateInstanceV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createInstanceV2, hcClient);
    }

    /**
     * 创建编排规则
     *
     * 创建编排规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrchestrationRequest 请求对象
     * @return CompletableFuture<CreateOrchestrationResponse>
     */
    public CompletableFuture<CreateOrchestrationResponse> createOrchestrationAsync(CreateOrchestrationRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createOrchestration);
    }

    /**
     * 创建编排规则
     *
     * 创建编排规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrchestrationRequest 请求对象
     * @return AsyncInvoker<CreateOrchestrationRequest, CreateOrchestrationResponse>
     */
    public AsyncInvoker<CreateOrchestrationRequest, CreateOrchestrationResponse> createOrchestrationAsyncInvoker(
        CreateOrchestrationRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.createOrchestration, hcClient);
    }

    /**
     * 创建专享版实例（包周期）
     *
     * 创建包周期专享版实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderRequest 请求对象
     * @return CompletableFuture<CreateOrderResponse>
     */
    public CompletableFuture<CreateOrderResponse> createOrderAsync(CreateOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createOrder);
    }

    /**
     * 创建专享版实例（包周期）
     *
     * 创建包周期专享版实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderRequest 请求对象
     * @return AsyncInvoker<CreateOrderRequest, CreateOrderResponse>
     */
    public AsyncInvoker<CreateOrderRequest, CreateOrderResponse> createOrderAsyncInvoker(CreateOrderRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.createOrder, hcClient);
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
     * @return CompletableFuture<CreatePluginResponse>
     */
    public CompletableFuture<CreatePluginResponse> createPluginAsync(CreatePluginRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createPlugin);
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
     * @return AsyncInvoker<CreatePluginRequest, CreatePluginResponse>
     */
    public AsyncInvoker<CreatePluginRequest, CreatePluginResponse> createPluginAsyncInvoker(
        CreatePluginRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.createPlugin, hcClient);
    }

    /**
     * 按需规格变更
     *
     * 创建按需规格变更订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPayResizeOrderRequest 请求对象
     * @return CompletableFuture<CreatePostPayResizeOrderResponse>
     */
    public CompletableFuture<CreatePostPayResizeOrderResponse> createPostPayResizeOrderAsync(
        CreatePostPayResizeOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createPostPayResizeOrder);
    }

    /**
     * 按需规格变更
     *
     * 创建按需规格变更订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPayResizeOrderRequest 请求对象
     * @return AsyncInvoker<CreatePostPayResizeOrderRequest, CreatePostPayResizeOrderResponse>
     */
    public AsyncInvoker<CreatePostPayResizeOrderRequest, CreatePostPayResizeOrderResponse> createPostPayResizeOrderAsyncInvoker(
        CreatePostPayResizeOrderRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.createPostPayResizeOrder, hcClient);
    }

    /**
     * 创建包周期规格变更订单
     *
     * 创建包周期规格变更订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrepayResizeRequest 请求对象
     * @return CompletableFuture<CreatePrepayResizeResponse>
     */
    public CompletableFuture<CreatePrepayResizeResponse> createPrepayResizeAsync(CreatePrepayResizeRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createPrepayResize);
    }

    /**
     * 创建包周期规格变更订单
     *
     * 创建包周期规格变更订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrepayResizeRequest 请求对象
     * @return AsyncInvoker<CreatePrepayResizeRequest, CreatePrepayResizeResponse>
     */
    public AsyncInvoker<CreatePrepayResizeRequest, CreatePrepayResizeResponse> createPrepayResizeAsyncInvoker(
        CreatePrepayResizeRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.createPrepayResize, hcClient);
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
     * @return CompletableFuture<CreateRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2Async(
        CreateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createRequestThrottlingPolicyV2);
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
     * @return AsyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2AsyncInvoker(
        CreateRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 创建签名密钥
     *
     * 为了保护API的安全性，建议租户为API的访问提供一套保护机制，即租户开放的API，需要对请求来源进行认证，不符合认证的请求直接拒绝访问。
     * 
     * 
     * 其中，签名密钥就是API安全保护机制的一种。
     * 
     * 
     * 租户创建一个签名密钥，并将签名密钥与API进行绑定，则API网关在请求这个API时，就会使用绑定的签名密钥对请求参数进行数据加密，生成签名。当租户的后端服务收到请求时，可以校验这个签名，如果签名校验不通过，则该请求不是API网关发出的请求，租户可以拒绝这个请求，从而保证API的安全性，避免API被未知来源的请求攻击。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<CreateSignatureKeyV2Response>
     */
    public CompletableFuture<CreateSignatureKeyV2Response> createSignatureKeyV2Async(
        CreateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createSignatureKeyV2);
    }

    /**
     * 创建签名密钥
     *
     * 为了保护API的安全性，建议租户为API的访问提供一套保护机制，即租户开放的API，需要对请求来源进行认证，不符合认证的请求直接拒绝访问。
     * 
     * 
     * 其中，签名密钥就是API安全保护机制的一种。
     * 
     * 
     * 租户创建一个签名密钥，并将签名密钥与API进行绑定，则API网关在请求这个API时，就会使用绑定的签名密钥对请求参数进行数据加密，生成签名。当租户的后端服务收到请求时，可以校验这个签名，如果签名校验不通过，则该请求不是API网关发出的请求，租户可以拒绝这个请求，从而保证API的安全性，避免API被未知来源的请求攻击。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response>
     */
    public AsyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> createSignatureKeyV2AsyncInvoker(
        CreateSignatureKeyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createSignatureKeyV2, hcClient);
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
     * @param request CreateSpecialThrottlingConfigurationV2Request 请求对象
     * @return CompletableFuture<CreateSpecialThrottlingConfigurationV2Response>
     */
    public CompletableFuture<CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2Async(
        CreateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createSpecialThrottlingConfigurationV2);
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
     * @param request CreateSpecialThrottlingConfigurationV2Request 请求对象
     * @return AsyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response>
     */
    public AsyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2AsyncInvoker(
        CreateSpecialThrottlingConfigurationV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createSpecialThrottlingConfigurationV2, hcClient);
    }

    /**
     * 删除APP的访问控制
     *
     * 删除凭据的访问控制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppAclRequest 请求对象
     * @return CompletableFuture<DeleteAppAclResponse>
     */
    public CompletableFuture<DeleteAppAclResponse> deleteAppAclAsync(DeleteAppAclRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteAppAcl);
    }

    /**
     * 删除APP的访问控制
     *
     * 删除凭据的访问控制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppAclRequest 请求对象
     * @return AsyncInvoker<DeleteAppAclRequest, DeleteAppAclResponse>
     */
    public AsyncInvoker<DeleteAppAclRequest, DeleteAppAclResponse> deleteAppAclAsyncInvoker(
        DeleteAppAclRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteAppAcl, hcClient);
    }

    /**
     * 删除APP Code
     *
     * 删除App Code，App Code删除后，将无法再通过简易认证访问对应的API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppCodeV2Request 请求对象
     * @return CompletableFuture<DeleteAppCodeV2Response>
     */
    public CompletableFuture<DeleteAppCodeV2Response> deleteAppCodeV2Async(DeleteAppCodeV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteAppCodeV2);
    }

    /**
     * 删除APP Code
     *
     * 删除App Code，App Code删除后，将无法再通过简易认证访问对应的API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppCodeV2Request 请求对象
     * @return AsyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response>
     */
    public AsyncInvoker<DeleteAppCodeV2Request, DeleteAppCodeV2Response> deleteAppCodeV2AsyncInvoker(
        DeleteAppCodeV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteAppCodeV2, hcClient);
    }

    /**
     * 删除凭据配额
     *
     * 删除凭据配额。删除凭据配额时，同时删除凭据配额和凭据的关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppQuotaRequest 请求对象
     * @return CompletableFuture<DeleteAppQuotaResponse>
     */
    public CompletableFuture<DeleteAppQuotaResponse> deleteAppQuotaAsync(DeleteAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteAppQuota);
    }

    /**
     * 删除凭据配额
     *
     * 删除凭据配额。删除凭据配额时，同时删除凭据配额和凭据的关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppQuotaRequest 请求对象
     * @return AsyncInvoker<DeleteAppQuotaRequest, DeleteAppQuotaResponse>
     */
    public AsyncInvoker<DeleteAppQuotaRequest, DeleteAppQuotaResponse> deleteAppQuotaAsyncInvoker(
        DeleteAppQuotaRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteAppQuota, hcClient);
    }

    /**
     * 删除APP
     *
     * 删除指定的APP。
     * APP删除后，将无法再调用任何API[；其中，云商店自动创建的APP无法被删除](tag:hws)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppV2Request 请求对象
     * @return CompletableFuture<DeleteAppV2Response>
     */
    public CompletableFuture<DeleteAppV2Response> deleteAppV2Async(DeleteAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteAppV2);
    }

    /**
     * 删除APP
     *
     * 删除指定的APP。
     * APP删除后，将无法再调用任何API[；其中，云商店自动创建的APP无法被删除](tag:hws)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppV2Request 请求对象
     * @return AsyncInvoker<DeleteAppV2Request, DeleteAppV2Response>
     */
    public AsyncInvoker<DeleteAppV2Request, DeleteAppV2Response> deleteAppV2AsyncInvoker(DeleteAppV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteAppV2, hcClient);
    }

    /**
     * 删除自定义认证
     *
     * 删除自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomAuthorizerV2Request 请求对象
     * @return CompletableFuture<DeleteCustomAuthorizerV2Response>
     */
    public CompletableFuture<DeleteCustomAuthorizerV2Response> deleteCustomAuthorizerV2Async(
        DeleteCustomAuthorizerV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteCustomAuthorizerV2);
    }

    /**
     * 删除自定义认证
     *
     * 删除自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomAuthorizerV2Request 请求对象
     * @return AsyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response>
     */
    public AsyncInvoker<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> deleteCustomAuthorizerV2AsyncInvoker(
        DeleteCustomAuthorizerV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteCustomAuthorizerV2, hcClient);
    }

    /**
     * 删除实例指定的自定义入方向端口
     *
     * 删除实例指定的自定义入方向端口，不包含默认端口80和443。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomIngressPortRequest 请求对象
     * @return CompletableFuture<DeleteCustomIngressPortResponse>
     */
    public CompletableFuture<DeleteCustomIngressPortResponse> deleteCustomIngressPortAsync(
        DeleteCustomIngressPortRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteCustomIngressPort);
    }

    /**
     * 删除实例指定的自定义入方向端口
     *
     * 删除实例指定的自定义入方向端口，不包含默认端口80和443。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomIngressPortRequest 请求对象
     * @return AsyncInvoker<DeleteCustomIngressPortRequest, DeleteCustomIngressPortResponse>
     */
    public AsyncInvoker<DeleteCustomIngressPortRequest, DeleteCustomIngressPortResponse> deleteCustomIngressPortAsyncInvoker(
        DeleteCustomIngressPortRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteCustomIngressPort, hcClient);
    }

    /**
     * 批量删除实例终端节点连接白名单
     *
     * 批量删除实例终端节点连接白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointPermissionsRequest 请求对象
     * @return CompletableFuture<DeleteEndpointPermissionsResponse>
     */
    public CompletableFuture<DeleteEndpointPermissionsResponse> deleteEndpointPermissionsAsync(
        DeleteEndpointPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteEndpointPermissions);
    }

    /**
     * 批量删除实例终端节点连接白名单
     *
     * 批量删除实例终端节点连接白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointPermissionsRequest 请求对象
     * @return AsyncInvoker<DeleteEndpointPermissionsRequest, DeleteEndpointPermissionsResponse>
     */
    public AsyncInvoker<DeleteEndpointPermissionsRequest, DeleteEndpointPermissionsResponse> deleteEndpointPermissionsAsyncInvoker(
        DeleteEndpointPermissionsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteEndpointPermissions, hcClient);
    }

    /**
     * 删除环境
     *
     * 删除指定的环境。
     * 
     * 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。
     * 
     * 环境上存在已发布的API时，该环境不能被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentV2Request 请求对象
     * @return CompletableFuture<DeleteEnvironmentV2Response>
     */
    public CompletableFuture<DeleteEnvironmentV2Response> deleteEnvironmentV2Async(DeleteEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteEnvironmentV2);
    }

    /**
     * 删除环境
     *
     * 删除指定的环境。
     * 
     * 该操作将导致此API在指定的环境无法被访问，可能会影响相当一部分应用和用户。请确保已经告知用户，或者确认需要强制下线。
     * 
     * 环境上存在已发布的API时，该环境不能被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentV2Request 请求对象
     * @return AsyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response>
     */
    public AsyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> deleteEnvironmentV2AsyncInvoker(
        DeleteEnvironmentV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteEnvironmentV2, hcClient);
    }

    /**
     * 删除变量
     *
     * 删除指定的环境变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<DeleteEnvironmentVariableV2Response>
     */
    public CompletableFuture<DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2Async(
        DeleteEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteEnvironmentVariableV2);
    }

    /**
     * 删除变量
     *
     * 删除指定的环境变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentVariableV2Request 请求对象
     * @return AsyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response>
     */
    public AsyncInvoker<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2AsyncInvoker(
        DeleteEnvironmentVariableV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteEnvironmentVariableV2, hcClient);
    }

    /**
     * 删除分组指定错误类型的自定义响应配置
     *
     * 删除分组指定错误类型的自定义响应配置，还原为使用默认值的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGatewayResponseTypeV2Request 请求对象
     * @return CompletableFuture<DeleteGatewayResponseTypeV2Response>
     */
    public CompletableFuture<DeleteGatewayResponseTypeV2Response> deleteGatewayResponseTypeV2Async(
        DeleteGatewayResponseTypeV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteGatewayResponseTypeV2);
    }

    /**
     * 删除分组指定错误类型的自定义响应配置
     *
     * 删除分组指定错误类型的自定义响应配置，还原为使用默认值的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGatewayResponseTypeV2Request 请求对象
     * @return AsyncInvoker<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response>
     */
    public AsyncInvoker<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response> deleteGatewayResponseTypeV2AsyncInvoker(
        DeleteGatewayResponseTypeV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteGatewayResponseTypeV2, hcClient);
    }

    /**
     * 删除分组自定义响应
     *
     * 删除分组自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGatewayResponseV2Request 请求对象
     * @return CompletableFuture<DeleteGatewayResponseV2Response>
     */
    public CompletableFuture<DeleteGatewayResponseV2Response> deleteGatewayResponseV2Async(
        DeleteGatewayResponseV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteGatewayResponseV2);
    }

    /**
     * 删除分组自定义响应
     *
     * 删除分组自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGatewayResponseV2Request 请求对象
     * @return AsyncInvoker<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response>
     */
    public AsyncInvoker<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response> deleteGatewayResponseV2AsyncInvoker(
        DeleteGatewayResponseV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteGatewayResponseV2, hcClient);
    }

    /**
     * 删除专享版实例
     *
     * 删除专享版实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesV2Request 请求对象
     * @return CompletableFuture<DeleteInstancesV2Response>
     */
    public CompletableFuture<DeleteInstancesV2Response> deleteInstancesV2Async(DeleteInstancesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteInstancesV2);
    }

    /**
     * 删除专享版实例
     *
     * 删除专享版实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesV2Request 请求对象
     * @return AsyncInvoker<DeleteInstancesV2Request, DeleteInstancesV2Response>
     */
    public AsyncInvoker<DeleteInstancesV2Request, DeleteInstancesV2Response> deleteInstancesV2AsyncInvoker(
        DeleteInstancesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteInstancesV2, hcClient);
    }

    /**
     * 删除编排规则
     *
     * 删除编排规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrchestrationRequest 请求对象
     * @return CompletableFuture<DeleteOrchestrationResponse>
     */
    public CompletableFuture<DeleteOrchestrationResponse> deleteOrchestrationAsync(DeleteOrchestrationRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteOrchestration);
    }

    /**
     * 删除编排规则
     *
     * 删除编排规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrchestrationRequest 请求对象
     * @return AsyncInvoker<DeleteOrchestrationRequest, DeleteOrchestrationResponse>
     */
    public AsyncInvoker<DeleteOrchestrationRequest, DeleteOrchestrationResponse> deleteOrchestrationAsyncInvoker(
        DeleteOrchestrationRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteOrchestration, hcClient);
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
     * @return CompletableFuture<DeletePluginResponse>
     */
    public CompletableFuture<DeletePluginResponse> deletePluginAsync(DeletePluginRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deletePlugin);
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
     * @return AsyncInvoker<DeletePluginRequest, DeletePluginResponse>
     */
    public AsyncInvoker<DeletePluginRequest, DeletePluginResponse> deletePluginAsyncInvoker(
        DeletePluginRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.deletePlugin, hcClient);
    }

    /**
     * 删除流控策略
     *
     * 删除指定的流控策略，以及该流控策略与API的所有绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<DeleteRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2Async(
        DeleteRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteRequestThrottlingPolicyV2);
    }

    /**
     * 删除流控策略
     *
     * 删除指定的流控策略，以及该流控策略与API的所有绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2AsyncInvoker(
        DeleteRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 删除签名密钥
     *
     * 删除指定的签名密钥，删除签名密钥时，其配置的绑定关系会一并删除，相应的签名密钥会失效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSignatureKeyV2Request 请求对象
     * @return CompletableFuture<DeleteSignatureKeyV2Response>
     */
    public CompletableFuture<DeleteSignatureKeyV2Response> deleteSignatureKeyV2Async(
        DeleteSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteSignatureKeyV2);
    }

    /**
     * 删除签名密钥
     *
     * 删除指定的签名密钥，删除签名密钥时，其配置的绑定关系会一并删除，相应的签名密钥会失效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response>
     */
    public AsyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> deleteSignatureKeyV2AsyncInvoker(
        DeleteSignatureKeyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteSignatureKeyV2, hcClient);
    }

    /**
     * 删除特殊设置
     *
     * 删除某个流控策略的某个特殊配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSpecialThrottlingConfigurationV2Request 请求对象
     * @return CompletableFuture<DeleteSpecialThrottlingConfigurationV2Response>
     */
    public CompletableFuture<DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2Async(
        DeleteSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteSpecialThrottlingConfigurationV2);
    }

    /**
     * 删除特殊设置
     *
     * 删除某个流控策略的某个特殊配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSpecialThrottlingConfigurationV2Request 请求对象
     * @return AsyncInvoker<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response>
     */
    public AsyncInvoker<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2AsyncInvoker(
        DeleteSpecialThrottlingConfigurationV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteSpecialThrottlingConfigurationV2, hcClient);
    }

    /**
     * 解除绑定插件的API
     *
     * 解除绑定在插件上的API。
     * - 解绑及时生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachApiFromPluginRequest 请求对象
     * @return CompletableFuture<DetachApiFromPluginResponse>
     */
    public CompletableFuture<DetachApiFromPluginResponse> detachApiFromPluginAsync(DetachApiFromPluginRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.detachApiFromPlugin);
    }

    /**
     * 解除绑定插件的API
     *
     * 解除绑定在插件上的API。
     * - 解绑及时生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachApiFromPluginRequest 请求对象
     * @return AsyncInvoker<DetachApiFromPluginRequest, DetachApiFromPluginResponse>
     */
    public AsyncInvoker<DetachApiFromPluginRequest, DetachApiFromPluginResponse> detachApiFromPluginAsyncInvoker(
        DetachApiFromPluginRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.detachApiFromPlugin, hcClient);
    }

    /**
     * 解除绑定API的插件
     *
     * 解除绑定在API上的插件。
     * - 解绑及时生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachPluginFromApiRequest 请求对象
     * @return CompletableFuture<DetachPluginFromApiResponse>
     */
    public CompletableFuture<DetachPluginFromApiResponse> detachPluginFromApiAsync(DetachPluginFromApiRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.detachPluginFromApi);
    }

    /**
     * 解除绑定API的插件
     *
     * 解除绑定在API上的插件。
     * - 解绑及时生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachPluginFromApiRequest 请求对象
     * @return AsyncInvoker<DetachPluginFromApiRequest, DetachPluginFromApiResponse>
     */
    public AsyncInvoker<DetachPluginFromApiRequest, DetachPluginFromApiResponse> detachPluginFromApiAsyncInvoker(
        DetachPluginFromApiRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.detachPluginFromApi, hcClient);
    }

    /**
     * 解除凭据配额和凭据的绑定
     *
     * 解除凭据配额和凭据的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAppQuotaWithAppRequest 请求对象
     * @return CompletableFuture<DisassociateAppQuotaWithAppResponse>
     */
    public CompletableFuture<DisassociateAppQuotaWithAppResponse> disassociateAppQuotaWithAppAsync(
        DisassociateAppQuotaWithAppRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.disassociateAppQuotaWithApp);
    }

    /**
     * 解除凭据配额和凭据的绑定
     *
     * 解除凭据配额和凭据的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAppQuotaWithAppRequest 请求对象
     * @return AsyncInvoker<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse>
     */
    public AsyncInvoker<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse> disassociateAppQuotaWithAppAsyncInvoker(
        DisassociateAppQuotaWithAppRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.disassociateAppQuotaWithApp, hcClient);
    }

    /**
     * 删除域名证书
     *
     * 如果域名证书不再需要或者已过期，则可以删除证书内容。在使用自定义入方向端口的特性时，相同的域名会同时解绑证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateCertificateV2Request 请求对象
     * @return CompletableFuture<DisassociateCertificateV2Response>
     */
    public CompletableFuture<DisassociateCertificateV2Response> disassociateCertificateV2Async(
        DisassociateCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.disassociateCertificateV2);
    }

    /**
     * 删除域名证书
     *
     * 如果域名证书不再需要或者已过期，则可以删除证书内容。在使用自定义入方向端口的特性时，相同的域名会同时解绑证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateCertificateV2Request 请求对象
     * @return AsyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response>
     */
    public AsyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response> disassociateCertificateV2AsyncInvoker(
        DisassociateCertificateV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.disassociateCertificateV2, hcClient);
    }

    /**
     * 解绑域名
     *
     * 如果API分组不再需要绑定某个自定义域名，则可以为此API分组解绑此域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateDomainV2Request 请求对象
     * @return CompletableFuture<DisassociateDomainV2Response>
     */
    public CompletableFuture<DisassociateDomainV2Response> disassociateDomainV2Async(
        DisassociateDomainV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.disassociateDomainV2);
    }

    /**
     * 解绑域名
     *
     * 如果API分组不再需要绑定某个自定义域名，则可以为此API分组解绑此域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateDomainV2Request 请求对象
     * @return AsyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response>
     */
    public AsyncInvoker<DisassociateDomainV2Request, DisassociateDomainV2Response> disassociateDomainV2AsyncInvoker(
        DisassociateDomainV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.disassociateDomainV2, hcClient);
    }

    /**
     * 解除API与签名密钥的绑定关系
     *
     * 解除API与签名密钥的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<DisassociateSignatureKeyV2Response>
     */
    public CompletableFuture<DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2Async(
        DisassociateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.disassociateSignatureKeyV2);
    }

    /**
     * 解除API与签名密钥的绑定关系
     *
     * 解除API与签名密钥的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response>
     */
    public AsyncInvoker<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2AsyncInvoker(
        DisassociateSignatureKeyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.disassociateSignatureKeyV2, hcClient);
    }

    /**
     * 异步导出API
     *
     * 导出分组下API的定义信息。导出文件内容符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportApiDefinitionsAsyncRequest 请求对象
     * @return CompletableFuture<ExportApiDefinitionsAsyncResponse>
     */
    public CompletableFuture<ExportApiDefinitionsAsyncResponse> exportApiDefinitionsAsyncAsync(
        ExportApiDefinitionsAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.exportApiDefinitionsAsync);
    }

    /**
     * 异步导出API
     *
     * 导出分组下API的定义信息。导出文件内容符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportApiDefinitionsAsyncRequest 请求对象
     * @return AsyncInvoker<ExportApiDefinitionsAsyncRequest, ExportApiDefinitionsAsyncResponse>
     */
    public AsyncInvoker<ExportApiDefinitionsAsyncRequest, ExportApiDefinitionsAsyncResponse> exportApiDefinitionsAsyncAsyncInvoker(
        ExportApiDefinitionsAsyncRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.exportApiDefinitionsAsync, hcClient);
    }

    /**
     * 异步导入API
     *
     * 导入API。导入文件内容需要符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportApiDefinitionsAsyncRequest 请求对象
     * @return CompletableFuture<ImportApiDefinitionsAsyncResponse>
     */
    public CompletableFuture<ImportApiDefinitionsAsyncResponse> importApiDefinitionsAsyncAsync(
        ImportApiDefinitionsAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.importApiDefinitionsAsync);
    }

    /**
     * 异步导入API
     *
     * 导入API。导入文件内容需要符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportApiDefinitionsAsyncRequest 请求对象
     * @return AsyncInvoker<ImportApiDefinitionsAsyncRequest, ImportApiDefinitionsAsyncResponse>
     */
    public AsyncInvoker<ImportApiDefinitionsAsyncRequest, ImportApiDefinitionsAsyncResponse> importApiDefinitionsAsyncAsyncInvoker(
        ImportApiDefinitionsAsyncRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.importApiDefinitionsAsync, hcClient);
    }

    /**
     * 导入微服务
     *
     * 导入微服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportMicroserviceRequest 请求对象
     * @return CompletableFuture<ImportMicroserviceResponse>
     */
    public CompletableFuture<ImportMicroserviceResponse> importMicroserviceAsync(ImportMicroserviceRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.importMicroservice);
    }

    /**
     * 导入微服务
     *
     * 导入微服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportMicroserviceRequest 请求对象
     * @return AsyncInvoker<ImportMicroserviceRequest, ImportMicroserviceResponse>
     */
    public AsyncInvoker<ImportMicroserviceRequest, ImportMicroserviceResponse> importMicroserviceAsyncInvoker(
        ImportMicroserviceRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.importMicroservice, hcClient);
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
     * @return CompletableFuture<ListApiAttachablePluginsResponse>
     */
    public CompletableFuture<ListApiAttachablePluginsResponse> listApiAttachablePluginsAsync(
        ListApiAttachablePluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiAttachablePlugins);
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
     * @return AsyncInvoker<ListApiAttachablePluginsRequest, ListApiAttachablePluginsResponse>
     */
    public AsyncInvoker<ListApiAttachablePluginsRequest, ListApiAttachablePluginsResponse> listApiAttachablePluginsAsyncInvoker(
        ListApiAttachablePluginsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listApiAttachablePlugins, hcClient);
    }

    /**
     * 查询API下绑定的插件
     *
     * 查询指定API下绑定的插件信息。
     * - 用于查询指定API下已经绑定的插件列表信息
     * - 支持分页返回
     * - 支持插件名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiAttachedPluginsRequest 请求对象
     * @return CompletableFuture<ListApiAttachedPluginsResponse>
     */
    public CompletableFuture<ListApiAttachedPluginsResponse> listApiAttachedPluginsAsync(
        ListApiAttachedPluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiAttachedPlugins);
    }

    /**
     * 查询API下绑定的插件
     *
     * 查询指定API下绑定的插件信息。
     * - 用于查询指定API下已经绑定的插件列表信息
     * - 支持分页返回
     * - 支持插件名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiAttachedPluginsRequest 请求对象
     * @return AsyncInvoker<ListApiAttachedPluginsRequest, ListApiAttachedPluginsResponse>
     */
    public AsyncInvoker<ListApiAttachedPluginsRequest, ListApiAttachedPluginsResponse> listApiAttachedPluginsAsyncInvoker(
        ListApiAttachedPluginsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listApiAttachedPlugins, hcClient);
    }

    /**
     * 查询API分组概况
     *
     * 查询租户名下的API分组概况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiGroupsQuantitiesV2Request 请求对象
     * @return CompletableFuture<ListApiGroupsQuantitiesV2Response>
     */
    public CompletableFuture<ListApiGroupsQuantitiesV2Response> listApiGroupsQuantitiesV2Async(
        ListApiGroupsQuantitiesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiGroupsQuantitiesV2);
    }

    /**
     * 查询API分组概况
     *
     * 查询租户名下的API分组概况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiGroupsQuantitiesV2Request 请求对象
     * @return AsyncInvoker<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response>
     */
    public AsyncInvoker<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> listApiGroupsQuantitiesV2AsyncInvoker(
        ListApiGroupsQuantitiesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApiGroupsQuantitiesV2, hcClient);
    }

    /**
     * 查询API概况
     *
     * 查询租户名下的API概况：已发布到RELEASE环境的API个数，未发布到RELEASE环境的API个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiQuantitiesV2Request 请求对象
     * @return CompletableFuture<ListApiQuantitiesV2Response>
     */
    public CompletableFuture<ListApiQuantitiesV2Response> listApiQuantitiesV2Async(ListApiQuantitiesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiQuantitiesV2);
    }

    /**
     * 查询API概况
     *
     * 查询租户名下的API概况：已发布到RELEASE环境的API个数，未发布到RELEASE环境的API个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiQuantitiesV2Request 请求对象
     * @return AsyncInvoker<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response>
     */
    public AsyncInvoker<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> listApiQuantitiesV2AsyncInvoker(
        ListApiQuantitiesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApiQuantitiesV2, hcClient);
    }

    /**
     * 查看签名密钥绑定的API列表
     *
     * 查询某个签名密钥上已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToSignatureKeyV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToSignatureKeyV2Response>
     */
    public CompletableFuture<ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2Async(
        ListApisBindedToSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisBindedToSignatureKeyV2);
    }

    /**
     * 查看签名密钥绑定的API列表
     *
     * 查询某个签名密钥上已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response>
     */
    public AsyncInvoker<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2AsyncInvoker(
        ListApisBindedToSignatureKeyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApisBindedToSignatureKeyV2, hcClient);
    }

    /**
     * 查看签名密钥未绑定的API列表
     *
     * 查询所有未绑定到该签名密钥上的API列表。需要API已经发布，未发布的API不予展示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisNotBoundWithSignatureKeyV2Request 请求对象
     * @return CompletableFuture<ListApisNotBoundWithSignatureKeyV2Response>
     */
    public CompletableFuture<ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2Async(
        ListApisNotBoundWithSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisNotBoundWithSignatureKeyV2);
    }

    /**
     * 查看签名密钥未绑定的API列表
     *
     * 查询所有未绑定到该签名密钥上的API列表。需要API已经发布，未发布的API不予展示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisNotBoundWithSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response>
     */
    public AsyncInvoker<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2AsyncInvoker(
        ListApisNotBoundWithSignatureKeyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApisNotBoundWithSignatureKeyV2, hcClient);
    }

    /**
     * 查询APP Code列表
     *
     * 查询App Code列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppCodesV2Request 请求对象
     * @return CompletableFuture<ListAppCodesV2Response>
     */
    public CompletableFuture<ListAppCodesV2Response> listAppCodesV2Async(ListAppCodesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAppCodesV2);
    }

    /**
     * 查询APP Code列表
     *
     * 查询App Code列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppCodesV2Request 请求对象
     * @return AsyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response>
     */
    public AsyncInvoker<ListAppCodesV2Request, ListAppCodesV2Response> listAppCodesV2AsyncInvoker(
        ListAppCodesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listAppCodesV2, hcClient);
    }

    /**
     * 查询APP概况
     *
     * 查询租户名下的APP概况：已进行API访问授权的APP个数，未进行API访问授权的APP个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuantitiesV2Request 请求对象
     * @return CompletableFuture<ListAppQuantitiesV2Response>
     */
    public CompletableFuture<ListAppQuantitiesV2Response> listAppQuantitiesV2Async(ListAppQuantitiesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAppQuantitiesV2);
    }

    /**
     * 查询APP概况
     *
     * 查询租户名下的APP概况：已进行API访问授权的APP个数，未进行API访问授权的APP个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuantitiesV2Request 请求对象
     * @return AsyncInvoker<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response>
     */
    public AsyncInvoker<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> listAppQuantitiesV2AsyncInvoker(
        ListAppQuantitiesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listAppQuantitiesV2, hcClient);
    }

    /**
     * 查询凭据配额可绑定的凭据列表
     *
     * 查询凭据配额可绑定的凭据列表。支持按凭据名称模糊搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotaBindableAppsRequest 请求对象
     * @return CompletableFuture<ListAppQuotaBindableAppsResponse>
     */
    public CompletableFuture<ListAppQuotaBindableAppsResponse> listAppQuotaBindableAppsAsync(
        ListAppQuotaBindableAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAppQuotaBindableApps);
    }

    /**
     * 查询凭据配额可绑定的凭据列表
     *
     * 查询凭据配额可绑定的凭据列表。支持按凭据名称模糊搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotaBindableAppsRequest 请求对象
     * @return AsyncInvoker<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse>
     */
    public AsyncInvoker<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse> listAppQuotaBindableAppsAsyncInvoker(
        ListAppQuotaBindableAppsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listAppQuotaBindableApps, hcClient);
    }

    /**
     * 查询凭据配额已绑定的凭据列表
     *
     * 查询凭据配额已绑定的凭据列表。支持按凭据名称模糊匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotaBoundAppsRequest 请求对象
     * @return CompletableFuture<ListAppQuotaBoundAppsResponse>
     */
    public CompletableFuture<ListAppQuotaBoundAppsResponse> listAppQuotaBoundAppsAsync(
        ListAppQuotaBoundAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAppQuotaBoundApps);
    }

    /**
     * 查询凭据配额已绑定的凭据列表
     *
     * 查询凭据配额已绑定的凭据列表。支持按凭据名称模糊匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotaBoundAppsRequest 请求对象
     * @return AsyncInvoker<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse>
     */
    public AsyncInvoker<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse> listAppQuotaBoundAppsAsyncInvoker(
        ListAppQuotaBoundAppsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listAppQuotaBoundApps, hcClient);
    }

    /**
     * 获取凭据配额列表
     *
     * 获取凭据配额列表。支持根据名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotasRequest 请求对象
     * @return CompletableFuture<ListAppQuotasResponse>
     */
    public CompletableFuture<ListAppQuotasResponse> listAppQuotasAsync(ListAppQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAppQuotas);
    }

    /**
     * 获取凭据配额列表
     *
     * 获取凭据配额列表。支持根据名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotasRequest 请求对象
     * @return AsyncInvoker<ListAppQuotasRequest, ListAppQuotasResponse>
     */
    public AsyncInvoker<ListAppQuotasRequest, ListAppQuotasResponse> listAppQuotasAsyncInvoker(
        ListAppQuotasRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listAppQuotas, hcClient);
    }

    /**
     * 查询APP列表
     *
     * 查询APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsV2Request 请求对象
     * @return CompletableFuture<ListAppsV2Response>
     */
    public CompletableFuture<ListAppsV2Response> listAppsV2Async(ListAppsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAppsV2);
    }

    /**
     * 查询APP列表
     *
     * 查询APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsV2Request 请求对象
     * @return AsyncInvoker<ListAppsV2Request, ListAppsV2Response>
     */
    public AsyncInvoker<ListAppsV2Request, ListAppsV2Response> listAppsV2AsyncInvoker(ListAppsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listAppsV2, hcClient);
    }

    /**
     * 查看可用区信息
     *
     * 查看可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesV2Request 请求对象
     * @return CompletableFuture<ListAvailableZonesV2Response>
     */
    public CompletableFuture<ListAvailableZonesV2Response> listAvailableZonesV2Async(
        ListAvailableZonesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAvailableZonesV2);
    }

    /**
     * 查看可用区信息
     *
     * 查看可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesV2Request 请求对象
     * @return AsyncInvoker<ListAvailableZonesV2Request, ListAvailableZonesV2Response>
     */
    public AsyncInvoker<ListAvailableZonesV2Request, ListAvailableZonesV2Response> listAvailableZonesV2AsyncInvoker(
        ListAvailableZonesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listAvailableZonesV2, hcClient);
    }

    /**
     * 查询自定义认证列表
     *
     * 查询自定义认证列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomAuthorizersV2Request 请求对象
     * @return CompletableFuture<ListCustomAuthorizersV2Response>
     */
    public CompletableFuture<ListCustomAuthorizersV2Response> listCustomAuthorizersV2Async(
        ListCustomAuthorizersV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listCustomAuthorizersV2);
    }

    /**
     * 查询自定义认证列表
     *
     * 查询自定义认证列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomAuthorizersV2Request 请求对象
     * @return AsyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response>
     */
    public AsyncInvoker<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> listCustomAuthorizersV2AsyncInvoker(
        ListCustomAuthorizersV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listCustomAuthorizersV2, hcClient);
    }

    /**
     * 查询实例指定的自定义入方向端口绑定的域名信息
     *
     * 查询实例指定的自定义入方向端口绑定的域名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomIngressPortDomainsRequest 请求对象
     * @return CompletableFuture<ListCustomIngressPortDomainsResponse>
     */
    public CompletableFuture<ListCustomIngressPortDomainsResponse> listCustomIngressPortDomainsAsync(
        ListCustomIngressPortDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listCustomIngressPortDomains);
    }

    /**
     * 查询实例指定的自定义入方向端口绑定的域名信息
     *
     * 查询实例指定的自定义入方向端口绑定的域名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomIngressPortDomainsRequest 请求对象
     * @return AsyncInvoker<ListCustomIngressPortDomainsRequest, ListCustomIngressPortDomainsResponse>
     */
    public AsyncInvoker<ListCustomIngressPortDomainsRequest, ListCustomIngressPortDomainsResponse> listCustomIngressPortDomainsAsyncInvoker(
        ListCustomIngressPortDomainsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listCustomIngressPortDomains, hcClient);
    }

    /**
     * 查询实例的自定义入方向端口列表
     *
     * 查询实例的自定义入方向端口列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomIngressPortsRequest 请求对象
     * @return CompletableFuture<ListCustomIngressPortsResponse>
     */
    public CompletableFuture<ListCustomIngressPortsResponse> listCustomIngressPortsAsync(
        ListCustomIngressPortsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listCustomIngressPorts);
    }

    /**
     * 查询实例的自定义入方向端口列表
     *
     * 查询实例的自定义入方向端口列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomIngressPortsRequest 请求对象
     * @return AsyncInvoker<ListCustomIngressPortsRequest, ListCustomIngressPortsResponse>
     */
    public AsyncInvoker<ListCustomIngressPortsRequest, ListCustomIngressPortsResponse> listCustomIngressPortsAsyncInvoker(
        ListCustomIngressPortsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listCustomIngressPorts, hcClient);
    }

    /**
     * 查询实例终端节点连接列表
     *
     * 查询实例终端节点连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointConnectionsRequest 请求对象
     * @return CompletableFuture<ListEndpointConnectionsResponse>
     */
    public CompletableFuture<ListEndpointConnectionsResponse> listEndpointConnectionsAsync(
        ListEndpointConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listEndpointConnections);
    }

    /**
     * 查询实例终端节点连接列表
     *
     * 查询实例终端节点连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointConnectionsRequest 请求对象
     * @return AsyncInvoker<ListEndpointConnectionsRequest, ListEndpointConnectionsResponse>
     */
    public AsyncInvoker<ListEndpointConnectionsRequest, ListEndpointConnectionsResponse> listEndpointConnectionsAsyncInvoker(
        ListEndpointConnectionsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listEndpointConnections, hcClient);
    }

    /**
     * 查询实例的终端节点服务的白名单列表
     *
     * 查询当前实例终端节点服务的白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointPermissionsRequest 请求对象
     * @return CompletableFuture<ListEndpointPermissionsResponse>
     */
    public CompletableFuture<ListEndpointPermissionsResponse> listEndpointPermissionsAsync(
        ListEndpointPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listEndpointPermissions);
    }

    /**
     * 查询实例的终端节点服务的白名单列表
     *
     * 查询当前实例终端节点服务的白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointPermissionsRequest 请求对象
     * @return AsyncInvoker<ListEndpointPermissionsRequest, ListEndpointPermissionsResponse>
     */
    public AsyncInvoker<ListEndpointPermissionsRequest, ListEndpointPermissionsResponse> listEndpointPermissionsAsyncInvoker(
        ListEndpointPermissionsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listEndpointPermissions, hcClient);
    }

    /**
     * 查询变量列表
     *
     * 查询分组下的所有环境变量的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentVariablesV2Request 请求对象
     * @return CompletableFuture<ListEnvironmentVariablesV2Response>
     */
    public CompletableFuture<ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2Async(
        ListEnvironmentVariablesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listEnvironmentVariablesV2);
    }

    /**
     * 查询变量列表
     *
     * 查询分组下的所有环境变量的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentVariablesV2Request 请求对象
     * @return AsyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response>
     */
    public AsyncInvoker<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2AsyncInvoker(
        ListEnvironmentVariablesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listEnvironmentVariablesV2, hcClient);
    }

    /**
     * 查询环境列表
     *
     * 查询符合条件的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsV2Request 请求对象
     * @return CompletableFuture<ListEnvironmentsV2Response>
     */
    public CompletableFuture<ListEnvironmentsV2Response> listEnvironmentsV2Async(ListEnvironmentsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listEnvironmentsV2);
    }

    /**
     * 查询环境列表
     *
     * 查询符合条件的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsV2Request 请求对象
     * @return AsyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response>
     */
    public AsyncInvoker<ListEnvironmentsV2Request, ListEnvironmentsV2Response> listEnvironmentsV2AsyncInvoker(
        ListEnvironmentsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listEnvironmentsV2, hcClient);
    }

    /**
     * 查看实例特性列表
     *
     * 查看实例特性列表。注意：实例不支持以下特性的需要联系技术支持升级实例版本。
     * 
     * 支持配置的特性列表及特性配置示例请参考本手册中的“附录 &gt; 实例支持的APIG特性”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesV2Request 请求对象
     * @return CompletableFuture<ListFeaturesV2Response>
     */
    public CompletableFuture<ListFeaturesV2Response> listFeaturesV2Async(ListFeaturesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listFeaturesV2);
    }

    /**
     * 查看实例特性列表
     *
     * 查看实例特性列表。注意：实例不支持以下特性的需要联系技术支持升级实例版本。
     * 
     * 支持配置的特性列表及特性配置示例请参考本手册中的“附录 &gt; 实例支持的APIG特性”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesV2Request 请求对象
     * @return AsyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response>
     */
    public AsyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response> listFeaturesV2AsyncInvoker(
        ListFeaturesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listFeaturesV2, hcClient);
    }

    /**
     * 查询分组自定义响应列表
     *
     * 查询分组自定义响应列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGatewayResponsesV2Request 请求对象
     * @return CompletableFuture<ListGatewayResponsesV2Response>
     */
    public CompletableFuture<ListGatewayResponsesV2Response> listGatewayResponsesV2Async(
        ListGatewayResponsesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listGatewayResponsesV2);
    }

    /**
     * 查询分组自定义响应列表
     *
     * 查询分组自定义响应列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGatewayResponsesV2Request 请求对象
     * @return AsyncInvoker<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response>
     */
    public AsyncInvoker<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response> listGatewayResponsesV2AsyncInvoker(
        ListGatewayResponsesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listGatewayResponsesV2, hcClient);
    }

    /**
     * 查询租户实例配置列表
     *
     * 查询租户实例配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConfigsV2Request 请求对象
     * @return CompletableFuture<ListInstanceConfigsV2Response>
     */
    public CompletableFuture<ListInstanceConfigsV2Response> listInstanceConfigsV2Async(
        ListInstanceConfigsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listInstanceConfigsV2);
    }

    /**
     * 查询租户实例配置列表
     *
     * 查询租户实例配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConfigsV2Request 请求对象
     * @return AsyncInvoker<ListInstanceConfigsV2Request, ListInstanceConfigsV2Response>
     */
    public AsyncInvoker<ListInstanceConfigsV2Request, ListInstanceConfigsV2Response> listInstanceConfigsV2AsyncInvoker(
        ListInstanceConfigsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listInstanceConfigsV2, hcClient);
    }

    /**
     * 查询实例支持的特性列表
     *
     * 查询实例支持的特性列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceFeaturesRequest 请求对象
     * @return CompletableFuture<ListInstanceFeaturesResponse>
     */
    public CompletableFuture<ListInstanceFeaturesResponse> listInstanceFeaturesAsync(
        ListInstanceFeaturesRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listInstanceFeatures);
    }

    /**
     * 查询实例支持的特性列表
     *
     * 查询实例支持的特性列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceFeaturesRequest 请求对象
     * @return AsyncInvoker<ListInstanceFeaturesRequest, ListInstanceFeaturesResponse>
     */
    public AsyncInvoker<ListInstanceFeaturesRequest, ListInstanceFeaturesResponse> listInstanceFeaturesAsyncInvoker(
        ListInstanceFeaturesRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listInstanceFeatures, hcClient);
    }

    /**
     * 查询单个实例标签
     *
     * 查询单个实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listInstanceTags);
    }

    /**
     * 查询单个实例标签
     *
     * 查询单个实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(
        ListInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listInstanceTags, hcClient);
    }

    /**
     * 通过标签查询实例列表
     *
     * 通过标签查询实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByTagsRequest 请求对象
     * @return CompletableFuture<ListInstancesByTagsResponse>
     */
    public CompletableFuture<ListInstancesByTagsResponse> listInstancesByTagsAsync(ListInstancesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listInstancesByTags);
    }

    /**
     * 通过标签查询实例列表
     *
     * 通过标签查询实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByTagsRequest 请求对象
     * @return AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>
     */
    public AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTagsAsyncInvoker(
        ListInstancesByTagsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listInstancesByTags, hcClient);
    }

    /**
     * 查询专享版实例列表
     *
     * 查询专享版实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesV2Request 请求对象
     * @return CompletableFuture<ListInstancesV2Response>
     */
    public CompletableFuture<ListInstancesV2Response> listInstancesV2Async(ListInstancesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listInstancesV2);
    }

    /**
     * 查询专享版实例列表
     *
     * 查询专享版实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesV2Request 请求对象
     * @return AsyncInvoker<ListInstancesV2Request, ListInstancesV2Response>
     */
    public AsyncInvoker<ListInstancesV2Request, ListInstancesV2Response> listInstancesV2AsyncInvoker(
        ListInstancesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listInstancesV2, hcClient);
    }

    /**
     * API统计信息查询-最近一段时间
     *
     * 根据API的id和最近的一段时间查询API被调用的次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。
     * &gt; 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatelyApiStatisticsV2Request 请求对象
     * @return CompletableFuture<ListLatelyApiStatisticsV2Response>
     */
    public CompletableFuture<ListLatelyApiStatisticsV2Response> listLatelyApiStatisticsV2Async(
        ListLatelyApiStatisticsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listLatelyApiStatisticsV2);
    }

    /**
     * API统计信息查询-最近一段时间
     *
     * 根据API的id和最近的一段时间查询API被调用的次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。
     * &gt; 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatelyApiStatisticsV2Request 请求对象
     * @return AsyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response>
     */
    public AsyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> listLatelyApiStatisticsV2AsyncInvoker(
        ListLatelyApiStatisticsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listLatelyApiStatisticsV2, hcClient);
    }

    /**
     * 分组统计信息查询-最近一小时内
     *
     * 根据API分组的编号查询该分组下所有API被调用的总次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。
     * &gt; 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatelyGroupStatisticsV2Request 请求对象
     * @return CompletableFuture<ListLatelyGroupStatisticsV2Response>
     */
    public CompletableFuture<ListLatelyGroupStatisticsV2Response> listLatelyGroupStatisticsV2Async(
        ListLatelyGroupStatisticsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listLatelyGroupStatisticsV2);
    }

    /**
     * 分组统计信息查询-最近一小时内
     *
     * 根据API分组的编号查询该分组下所有API被调用的总次数，统计周期为1分钟。查询范围一小时以内，一分钟一个样本，其样本值为一分钟内的累计值。
     * &gt; 为了安全起见，在服务器上使用curl命令调用接口查询信息后，需要清理历史操作记录，包括但不限于“~/.bash_history”、“/var/log/messages”（如有）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatelyGroupStatisticsV2Request 请求对象
     * @return AsyncInvoker<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response>
     */
    public AsyncInvoker<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response> listLatelyGroupStatisticsV2AsyncInvoker(
        ListLatelyGroupStatisticsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listLatelyGroupStatisticsV2, hcClient);
    }

    /**
     * 查询监控数据
     *
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricDataRequest 请求对象
     * @return CompletableFuture<ListMetricDataResponse>
     */
    public CompletableFuture<ListMetricDataResponse> listMetricDataAsync(ListMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listMetricData);
    }

    /**
     * 查询监控数据
     *
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricDataRequest 请求对象
     * @return AsyncInvoker<ListMetricDataRequest, ListMetricDataResponse>
     */
    public AsyncInvoker<ListMetricDataRequest, ListMetricDataResponse> listMetricDataAsyncInvoker(
        ListMetricDataRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listMetricData, hcClient);
    }

    /**
     * 查询编排规则绑定的API
     *
     * 查询指定插件下绑定的API信息
     * - 用于查询指定插件下已经绑定的API列表信息
     * - 支持分页返回
     * - 支持API名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrchestrationAttachedApisRequest 请求对象
     * @return CompletableFuture<ListOrchestrationAttachedApisResponse>
     */
    public CompletableFuture<ListOrchestrationAttachedApisResponse> listOrchestrationAttachedApisAsync(
        ListOrchestrationAttachedApisRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listOrchestrationAttachedApis);
    }

    /**
     * 查询编排规则绑定的API
     *
     * 查询指定插件下绑定的API信息
     * - 用于查询指定插件下已经绑定的API列表信息
     * - 支持分页返回
     * - 支持API名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrchestrationAttachedApisRequest 请求对象
     * @return AsyncInvoker<ListOrchestrationAttachedApisRequest, ListOrchestrationAttachedApisResponse>
     */
    public AsyncInvoker<ListOrchestrationAttachedApisRequest, ListOrchestrationAttachedApisResponse> listOrchestrationAttachedApisAsyncInvoker(
        ListOrchestrationAttachedApisRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listOrchestrationAttachedApis, hcClient);
    }

    /**
     * 查看编排规则列表
     *
     * 查看编排规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrchestrationsRequest 请求对象
     * @return CompletableFuture<ListOrchestrationsResponse>
     */
    public CompletableFuture<ListOrchestrationsResponse> listOrchestrationsAsync(ListOrchestrationsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listOrchestrations);
    }

    /**
     * 查看编排规则列表
     *
     * 查看编排规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrchestrationsRequest 请求对象
     * @return AsyncInvoker<ListOrchestrationsRequest, ListOrchestrationsResponse>
     */
    public AsyncInvoker<ListOrchestrationsRequest, ListOrchestrationsResponse> listOrchestrationsAsyncInvoker(
        ListOrchestrationsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listOrchestrations, hcClient);
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
     * @return CompletableFuture<ListPluginAttachableApisResponse>
     */
    public CompletableFuture<ListPluginAttachableApisResponse> listPluginAttachableApisAsync(
        ListPluginAttachableApisRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listPluginAttachableApis);
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
     * @return AsyncInvoker<ListPluginAttachableApisRequest, ListPluginAttachableApisResponse>
     */
    public AsyncInvoker<ListPluginAttachableApisRequest, ListPluginAttachableApisResponse> listPluginAttachableApisAsyncInvoker(
        ListPluginAttachableApisRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listPluginAttachableApis, hcClient);
    }

    /**
     * 查询插件下绑定的API
     *
     * 查询指定插件下绑定的API信息。
     * - 用于查询指定插件下已经绑定的API列表信息
     * - 支持分页返回
     * - 支持API名称模糊查询
     * - 绑定关系列表中返回的API在对应的环境中可能已经下线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginAttachedApisRequest 请求对象
     * @return CompletableFuture<ListPluginAttachedApisResponse>
     */
    public CompletableFuture<ListPluginAttachedApisResponse> listPluginAttachedApisAsync(
        ListPluginAttachedApisRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listPluginAttachedApis);
    }

    /**
     * 查询插件下绑定的API
     *
     * 查询指定插件下绑定的API信息。
     * - 用于查询指定插件下已经绑定的API列表信息
     * - 支持分页返回
     * - 支持API名称模糊查询
     * - 绑定关系列表中返回的API在对应的环境中可能已经下线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginAttachedApisRequest 请求对象
     * @return AsyncInvoker<ListPluginAttachedApisRequest, ListPluginAttachedApisResponse>
     */
    public AsyncInvoker<ListPluginAttachedApisRequest, ListPluginAttachedApisResponse> listPluginAttachedApisAsyncInvoker(
        ListPluginAttachedApisRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listPluginAttachedApis, hcClient);
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
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginsRequest 请求对象
     * @return CompletableFuture<ListPluginsResponse>
     */
    public CompletableFuture<ListPluginsResponse> listPluginsAsync(ListPluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listPlugins);
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
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginsRequest 请求对象
     * @return AsyncInvoker<ListPluginsRequest, ListPluginsResponse>
     */
    public AsyncInvoker<ListPluginsRequest, ListPluginsResponse> listPluginsAsyncInvoker(ListPluginsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listPlugins, hcClient);
    }

    /**
     * 查询某个实例的租户配置列表
     *
     * 查询某个实例的租户配置列表，用户可以通过此接口查看各类型资源配置及使用情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectCofigsV2Request 请求对象
     * @return CompletableFuture<ListProjectCofigsV2Response>
     */
    public CompletableFuture<ListProjectCofigsV2Response> listProjectCofigsV2Async(ListProjectCofigsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listProjectCofigsV2);
    }

    /**
     * 查询某个实例的租户配置列表
     *
     * 查询某个实例的租户配置列表，用户可以通过此接口查看各类型资源配置及使用情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectCofigsV2Request 请求对象
     * @return AsyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response>
     */
    public AsyncInvoker<ListProjectCofigsV2Request, ListProjectCofigsV2Response> listProjectCofigsV2AsyncInvoker(
        ListProjectCofigsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listProjectCofigsV2, hcClient);
    }

    /**
     * 查询项目下所有实例标签
     *
     * 查询项目下所有实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListProjectInstanceTagsResponse>
     */
    public CompletableFuture<ListProjectInstanceTagsResponse> listProjectInstanceTagsAsync(
        ListProjectInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listProjectInstanceTags);
    }

    /**
     * 查询项目下所有实例标签
     *
     * 查询项目下所有实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectInstanceTagsRequest, ListProjectInstanceTagsResponse>
     */
    public AsyncInvoker<ListProjectInstanceTagsRequest, ListProjectInstanceTagsResponse> listProjectInstanceTagsAsyncInvoker(
        ListProjectInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listProjectInstanceTags, hcClient);
    }

    /**
     * 查询流控策略列表
     *
     * 查询所有流控策略的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ListRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2Async(
        ListRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listRequestThrottlingPolicyV2);
    }

    /**
     * 查询流控策略列表
     *
     * 查询所有流控策略的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2AsyncInvoker(
        ListRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查看API绑定的签名密钥列表
     *
     * 查询某个API绑定的签名密钥列表。每个API在每个环境上应该最多只会绑定一个签名密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSignatureKeysBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListSignatureKeysBindedToApiV2Response>
     */
    public CompletableFuture<ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2Async(
        ListSignatureKeysBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listSignatureKeysBindedToApiV2);
    }

    /**
     * 查看API绑定的签名密钥列表
     *
     * 查询某个API绑定的签名密钥列表。每个API在每个环境上应该最多只会绑定一个签名密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSignatureKeysBindedToApiV2Request 请求对象
     * @return AsyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response>
     */
    public AsyncInvoker<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2AsyncInvoker(
        ListSignatureKeysBindedToApiV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listSignatureKeysBindedToApiV2, hcClient);
    }

    /**
     * 查询签名密钥列表
     *
     * 查询所有签名密钥的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSignatureKeysV2Request 请求对象
     * @return CompletableFuture<ListSignatureKeysV2Response>
     */
    public CompletableFuture<ListSignatureKeysV2Response> listSignatureKeysV2Async(ListSignatureKeysV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listSignatureKeysV2);
    }

    /**
     * 查询签名密钥列表
     *
     * 查询所有签名密钥的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSignatureKeysV2Request 请求对象
     * @return AsyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response>
     */
    public AsyncInvoker<ListSignatureKeysV2Request, ListSignatureKeysV2Response> listSignatureKeysV2AsyncInvoker(
        ListSignatureKeysV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listSignatureKeysV2, hcClient);
    }

    /**
     * 查看特殊设置列表
     *
     * 查看给流控策略设置的特殊配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecialThrottlingConfigurationsV2Request 请求对象
     * @return CompletableFuture<ListSpecialThrottlingConfigurationsV2Response>
     */
    public CompletableFuture<ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2Async(
        ListSpecialThrottlingConfigurationsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listSpecialThrottlingConfigurationsV2);
    }

    /**
     * 查看特殊设置列表
     *
     * 查看给流控策略设置的特殊配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecialThrottlingConfigurationsV2Request 请求对象
     * @return AsyncInvoker<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response>
     */
    public AsyncInvoker<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2AsyncInvoker(
        ListSpecialThrottlingConfigurationsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listSpecialThrottlingConfigurationsV2, hcClient);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsV2Request 请求对象
     * @return CompletableFuture<ListTagsV2Response>
     */
    public CompletableFuture<ListTagsV2Response> listTagsV2Async(ListTagsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listTagsV2);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsV2Request 请求对象
     * @return AsyncInvoker<ListTagsV2Request, ListTagsV2Response>
     */
    public AsyncInvoker<ListTagsV2Request, ListTagsV2Response> listTagsV2AsyncInvoker(ListTagsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listTagsV2, hcClient);
    }

    /**
     * 实例解绑EIP
     *
     * 实例解绑EIP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveEipV2Request 请求对象
     * @return CompletableFuture<RemoveEipV2Response>
     */
    public CompletableFuture<RemoveEipV2Response> removeEipV2Async(RemoveEipV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.removeEipV2);
    }

    /**
     * 实例解绑EIP
     *
     * 实例解绑EIP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveEipV2Request 请求对象
     * @return AsyncInvoker<RemoveEipV2Request, RemoveEipV2Response>
     */
    public AsyncInvoker<RemoveEipV2Request, RemoveEipV2Response> removeEipV2AsyncInvoker(RemoveEipV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.removeEipV2, hcClient);
    }

    /**
     * 关闭实例公网出口
     *
     * 关闭实例公网出口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveEngressEipV2Request 请求对象
     * @return CompletableFuture<RemoveEngressEipV2Response>
     */
    public CompletableFuture<RemoveEngressEipV2Response> removeEngressEipV2Async(RemoveEngressEipV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.removeEngressEipV2);
    }

    /**
     * 关闭实例公网出口
     *
     * 关闭实例公网出口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveEngressEipV2Request 请求对象
     * @return AsyncInvoker<RemoveEngressEipV2Request, RemoveEngressEipV2Response>
     */
    public AsyncInvoker<RemoveEngressEipV2Request, RemoveEngressEipV2Response> removeEngressEipV2AsyncInvoker(
        RemoveEngressEipV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.removeEngressEipV2, hcClient);
    }

    /**
     * 关闭实例公网入口
     *
     * 关闭实例公网入口，仅当实例为ELB类型时支持
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveIngressEipV2Request 请求对象
     * @return CompletableFuture<RemoveIngressEipV2Response>
     */
    public CompletableFuture<RemoveIngressEipV2Response> removeIngressEipV2Async(RemoveIngressEipV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.removeIngressEipV2);
    }

    /**
     * 关闭实例公网入口
     *
     * 关闭实例公网入口，仅当实例为ELB类型时支持
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveIngressEipV2Request 请求对象
     * @return AsyncInvoker<RemoveIngressEipV2Request, RemoveIngressEipV2Response>
     */
    public AsyncInvoker<RemoveIngressEipV2Request, RemoveIngressEipV2Response> removeIngressEipV2AsyncInvoker(
        RemoveIngressEipV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.removeIngressEipV2, hcClient);
    }

    /**
     * 重置密钥
     *
     * 重置指定APP的密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResettingAppSecretV2Request 请求对象
     * @return CompletableFuture<ResettingAppSecretV2Response>
     */
    public CompletableFuture<ResettingAppSecretV2Response> resettingAppSecretV2Async(
        ResettingAppSecretV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.resettingAppSecretV2);
    }

    /**
     * 重置密钥
     *
     * 重置指定APP的密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResettingAppSecretV2Request 请求对象
     * @return AsyncInvoker<ResettingAppSecretV2Request, ResettingAppSecretV2Response>
     */
    public AsyncInvoker<ResettingAppSecretV2Request, ResettingAppSecretV2Response> resettingAppSecretV2AsyncInvoker(
        ResettingAppSecretV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.resettingAppSecretV2, hcClient);
    }

    /**
     * 查询凭据关联的凭据配额
     *
     * 查看指定凭据关联的凭据配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppBoundAppQuotaRequest 请求对象
     * @return CompletableFuture<ShowAppBoundAppQuotaResponse>
     */
    public CompletableFuture<ShowAppBoundAppQuotaResponse> showAppBoundAppQuotaAsync(
        ShowAppBoundAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showAppBoundAppQuota);
    }

    /**
     * 查询凭据关联的凭据配额
     *
     * 查看指定凭据关联的凭据配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppBoundAppQuotaRequest 请求对象
     * @return AsyncInvoker<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse>
     */
    public AsyncInvoker<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse> showAppBoundAppQuotaAsyncInvoker(
        ShowAppBoundAppQuotaRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.showAppBoundAppQuota, hcClient);
    }

    /**
     * 获取凭据配额详情
     *
     * 获取凭据配额详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppQuotaRequest 请求对象
     * @return CompletableFuture<ShowAppQuotaResponse>
     */
    public CompletableFuture<ShowAppQuotaResponse> showAppQuotaAsync(ShowAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showAppQuota);
    }

    /**
     * 获取凭据配额详情
     *
     * 获取凭据配额详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppQuotaRequest 请求对象
     * @return AsyncInvoker<ShowAppQuotaRequest, ShowAppQuotaResponse>
     */
    public AsyncInvoker<ShowAppQuotaRequest, ShowAppQuotaResponse> showAppQuotaAsyncInvoker(
        ShowAppQuotaRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.showAppQuota, hcClient);
    }

    /**
     * 获取异步任务结果
     *
     * 获取异步任务结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAsyncTaskResultRequest 请求对象
     * @return CompletableFuture<ShowAsyncTaskResultResponse>
     */
    public CompletableFuture<ShowAsyncTaskResultResponse> showAsyncTaskResultAsync(ShowAsyncTaskResultRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showAsyncTaskResult);
    }

    /**
     * 获取异步任务结果
     *
     * 获取异步任务结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAsyncTaskResultRequest 请求对象
     * @return AsyncInvoker<ShowAsyncTaskResultRequest, ShowAsyncTaskResultResponse>
     */
    public AsyncInvoker<ShowAsyncTaskResultRequest, ShowAsyncTaskResultResponse> showAsyncTaskResultAsyncInvoker(
        ShowAsyncTaskResultRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.showAsyncTaskResult, hcClient);
    }

    /**
     * 查看APP的访问控制详情
     *
     * 查看APP的访问控制详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAppAclRequest 请求对象
     * @return CompletableFuture<ShowDetailsOfAppAclResponse>
     */
    public CompletableFuture<ShowDetailsOfAppAclResponse> showDetailsOfAppAclAsync(ShowDetailsOfAppAclRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfAppAcl);
    }

    /**
     * 查看APP的访问控制详情
     *
     * 查看APP的访问控制详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAppAclRequest 请求对象
     * @return AsyncInvoker<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse>
     */
    public AsyncInvoker<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse> showDetailsOfAppAclAsyncInvoker(
        ShowDetailsOfAppAclRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfAppAcl, hcClient);
    }

    /**
     * 查看APP Code详情
     *
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAppCodeV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfAppCodeV2Response>
     */
    public CompletableFuture<ShowDetailsOfAppCodeV2Response> showDetailsOfAppCodeV2Async(
        ShowDetailsOfAppCodeV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfAppCodeV2);
    }

    /**
     * 查看APP Code详情
     *
     * App Code为APP应用下的子模块，创建App Code之后，可以实现简易的APP认证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAppCodeV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response>
     */
    public AsyncInvoker<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> showDetailsOfAppCodeV2AsyncInvoker(
        ShowDetailsOfAppCodeV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfAppCodeV2, hcClient);
    }

    /**
     * 查看APP详情
     *
     * 查看指定APP的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAppV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfAppV2Response>
     */
    public CompletableFuture<ShowDetailsOfAppV2Response> showDetailsOfAppV2Async(ShowDetailsOfAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfAppV2);
    }

    /**
     * 查看APP详情
     *
     * 查看指定APP的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAppV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response>
     */
    public AsyncInvoker<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> showDetailsOfAppV2AsyncInvoker(
        ShowDetailsOfAppV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfAppV2, hcClient);
    }

    /**
     * 查看自定义认证详情
     *
     * 查看自定义认证详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfCustomAuthorizersV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfCustomAuthorizersV2Response>
     */
    public CompletableFuture<ShowDetailsOfCustomAuthorizersV2Response> showDetailsOfCustomAuthorizersV2Async(
        ShowDetailsOfCustomAuthorizersV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfCustomAuthorizersV2);
    }

    /**
     * 查看自定义认证详情
     *
     * 查看自定义认证详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfCustomAuthorizersV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response>
     */
    public AsyncInvoker<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> showDetailsOfCustomAuthorizersV2AsyncInvoker(
        ShowDetailsOfCustomAuthorizersV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfCustomAuthorizersV2, hcClient);
    }

    /**
     * 查看域名证书
     *
     * 查看域名下绑定的证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfDomainNameCertificateV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfDomainNameCertificateV2Response>
     */
    public CompletableFuture<ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2Async(
        ShowDetailsOfDomainNameCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfDomainNameCertificateV2);
    }

    /**
     * 查看域名证书
     *
     * 查看域名下绑定的证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfDomainNameCertificateV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response>
     */
    public AsyncInvoker<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2AsyncInvoker(
        ShowDetailsOfDomainNameCertificateV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfDomainNameCertificateV2, hcClient);
    }

    /**
     * 查看变量详情
     *
     * 查看指定的环境变量的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfEnvironmentVariableV2Response>
     */
    public CompletableFuture<ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2Async(
        ShowDetailsOfEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfEnvironmentVariableV2);
    }

    /**
     * 查看变量详情
     *
     * 查看指定的环境变量的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfEnvironmentVariableV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response>
     */
    public AsyncInvoker<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2AsyncInvoker(
        ShowDetailsOfEnvironmentVariableV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfEnvironmentVariableV2, hcClient);
    }

    /**
     * 查看分组下指定错误类型的自定义响应
     *
     * 查看分组下指定错误类型的自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfGatewayResponseTypeV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfGatewayResponseTypeV2Response>
     */
    public CompletableFuture<ShowDetailsOfGatewayResponseTypeV2Response> showDetailsOfGatewayResponseTypeV2Async(
        ShowDetailsOfGatewayResponseTypeV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfGatewayResponseTypeV2);
    }

    /**
     * 查看分组下指定错误类型的自定义响应
     *
     * 查看分组下指定错误类型的自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfGatewayResponseTypeV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response>
     */
    public AsyncInvoker<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response> showDetailsOfGatewayResponseTypeV2AsyncInvoker(
        ShowDetailsOfGatewayResponseTypeV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfGatewayResponseTypeV2, hcClient);
    }

    /**
     * 查询分组自定义响应详情
     *
     * 查询分组自定义响应详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfGatewayResponseV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfGatewayResponseV2Response>
     */
    public CompletableFuture<ShowDetailsOfGatewayResponseV2Response> showDetailsOfGatewayResponseV2Async(
        ShowDetailsOfGatewayResponseV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfGatewayResponseV2);
    }

    /**
     * 查询分组自定义响应详情
     *
     * 查询分组自定义响应详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfGatewayResponseV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response>
     */
    public AsyncInvoker<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response> showDetailsOfGatewayResponseV2AsyncInvoker(
        ShowDetailsOfGatewayResponseV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfGatewayResponseV2, hcClient);
    }

    /**
     * 查看专享版实例创建进度
     *
     * 查看专享版实例创建进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfInstanceProgressV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfInstanceProgressV2Response>
     */
    public CompletableFuture<ShowDetailsOfInstanceProgressV2Response> showDetailsOfInstanceProgressV2Async(
        ShowDetailsOfInstanceProgressV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfInstanceProgressV2);
    }

    /**
     * 查看专享版实例创建进度
     *
     * 查看专享版实例创建进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfInstanceProgressV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response>
     */
    public AsyncInvoker<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response> showDetailsOfInstanceProgressV2AsyncInvoker(
        ShowDetailsOfInstanceProgressV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfInstanceProgressV2, hcClient);
    }

    /**
     * 查看专享版实例详情
     *
     * 查看专享版实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfInstanceV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfInstanceV2Response>
     */
    public CompletableFuture<ShowDetailsOfInstanceV2Response> showDetailsOfInstanceV2Async(
        ShowDetailsOfInstanceV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfInstanceV2);
    }

    /**
     * 查看专享版实例详情
     *
     * 查看专享版实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfInstanceV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response>
     */
    public AsyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> showDetailsOfInstanceV2AsyncInvoker(
        ShowDetailsOfInstanceV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfInstanceV2, hcClient);
    }

    /**
     * 查询编排规则详情
     *
     * 查询编排规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfOrchestrationRequest 请求对象
     * @return CompletableFuture<ShowDetailsOfOrchestrationResponse>
     */
    public CompletableFuture<ShowDetailsOfOrchestrationResponse> showDetailsOfOrchestrationAsync(
        ShowDetailsOfOrchestrationRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfOrchestration);
    }

    /**
     * 查询编排规则详情
     *
     * 查询编排规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfOrchestrationRequest 请求对象
     * @return AsyncInvoker<ShowDetailsOfOrchestrationRequest, ShowDetailsOfOrchestrationResponse>
     */
    public AsyncInvoker<ShowDetailsOfOrchestrationRequest, ShowDetailsOfOrchestrationResponse> showDetailsOfOrchestrationAsyncInvoker(
        ShowDetailsOfOrchestrationRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfOrchestration, hcClient);
    }

    /**
     * 查看流控策略详情
     *
     * 查看指定流控策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2Async(
        ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfRequestThrottlingPolicyV2);
    }

    /**
     * 查看流控策略详情
     *
     * 查看指定流控策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2AsyncInvoker(
        ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查询包含指定标签的实例数量
     *
     * 查询包含指定标签的实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstancesNumByTagsRequest 请求对象
     * @return CompletableFuture<ShowInstancesNumByTagsResponse>
     */
    public CompletableFuture<ShowInstancesNumByTagsResponse> showInstancesNumByTagsAsync(
        ShowInstancesNumByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showInstancesNumByTags);
    }

    /**
     * 查询包含指定标签的实例数量
     *
     * 查询包含指定标签的实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstancesNumByTagsRequest 请求对象
     * @return AsyncInvoker<ShowInstancesNumByTagsRequest, ShowInstancesNumByTagsResponse>
     */
    public AsyncInvoker<ShowInstancesNumByTagsRequest, ShowInstancesNumByTagsResponse> showInstancesNumByTagsAsyncInvoker(
        ShowInstancesNumByTagsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.showInstancesNumByTags, hcClient);
    }

    /**
     * 查询插件详情
     *
     * 查询插件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPluginRequest 请求对象
     * @return CompletableFuture<ShowPluginResponse>
     */
    public CompletableFuture<ShowPluginResponse> showPluginAsync(ShowPluginRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showPlugin);
    }

    /**
     * 查询插件详情
     *
     * 查询插件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPluginRequest 请求对象
     * @return AsyncInvoker<ShowPluginRequest, ShowPluginResponse>
     */
    public AsyncInvoker<ShowPluginRequest, ShowPluginResponse> showPluginAsyncInvoker(ShowPluginRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.showPlugin, hcClient);
    }

    /**
     * 查看实例约束信息
     *
     * 查看实例约束信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRestrictionOfInstanceV2Request 请求对象
     * @return CompletableFuture<ShowRestrictionOfInstanceV2Response>
     */
    public CompletableFuture<ShowRestrictionOfInstanceV2Response> showRestrictionOfInstanceV2Async(
        ShowRestrictionOfInstanceV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showRestrictionOfInstanceV2);
    }

    /**
     * 查看实例约束信息
     *
     * 查看实例约束信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRestrictionOfInstanceV2Request 请求对象
     * @return AsyncInvoker<ShowRestrictionOfInstanceV2Request, ShowRestrictionOfInstanceV2Response>
     */
    public AsyncInvoker<ShowRestrictionOfInstanceV2Request, ShowRestrictionOfInstanceV2Response> showRestrictionOfInstanceV2AsyncInvoker(
        ShowRestrictionOfInstanceV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showRestrictionOfInstanceV2, hcClient);
    }

    /**
     * 设置APP的访问控制
     *
     * 设置凭据的访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppAclRequest 请求对象
     * @return CompletableFuture<UpdateAppAclResponse>
     */
    public CompletableFuture<UpdateAppAclResponse> updateAppAclAsync(UpdateAppAclRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateAppAcl);
    }

    /**
     * 设置APP的访问控制
     *
     * 设置凭据的访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppAclRequest 请求对象
     * @return AsyncInvoker<UpdateAppAclRequest, UpdateAppAclResponse>
     */
    public AsyncInvoker<UpdateAppAclRequest, UpdateAppAclResponse> updateAppAclAsyncInvoker(
        UpdateAppAclRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.updateAppAcl, hcClient);
    }

    /**
     * 修改凭据配额
     *
     * 修改凭据配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppQuotaRequest 请求对象
     * @return CompletableFuture<UpdateAppQuotaResponse>
     */
    public CompletableFuture<UpdateAppQuotaResponse> updateAppQuotaAsync(UpdateAppQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateAppQuota);
    }

    /**
     * 修改凭据配额
     *
     * 修改凭据配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppQuotaRequest 请求对象
     * @return AsyncInvoker<UpdateAppQuotaRequest, UpdateAppQuotaResponse>
     */
    public AsyncInvoker<UpdateAppQuotaRequest, UpdateAppQuotaResponse> updateAppQuotaAsyncInvoker(
        UpdateAppQuotaRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.updateAppQuota, hcClient);
    }

    /**
     * 修改APP
     *
     * 修改指定APP的信息。其中可修改的属性为：name、remark，当支持用户自定义key和secret的开关开启时，app_key和app_secret也支持修改，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppV2Request 请求对象
     * @return CompletableFuture<UpdateAppV2Response>
     */
    public CompletableFuture<UpdateAppV2Response> updateAppV2Async(UpdateAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateAppV2);
    }

    /**
     * 修改APP
     *
     * 修改指定APP的信息。其中可修改的属性为：name、remark，当支持用户自定义key和secret的开关开启时，app_key和app_secret也支持修改，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppV2Request 请求对象
     * @return AsyncInvoker<UpdateAppV2Request, UpdateAppV2Response>
     */
    public AsyncInvoker<UpdateAppV2Request, UpdateAppV2Response> updateAppV2AsyncInvoker(UpdateAppV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateAppV2, hcClient);
    }

    /**
     * 修改自定义认证
     *
     * 修改自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomAuthorizerV2Request 请求对象
     * @return CompletableFuture<UpdateCustomAuthorizerV2Response>
     */
    public CompletableFuture<UpdateCustomAuthorizerV2Response> updateCustomAuthorizerV2Async(
        UpdateCustomAuthorizerV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateCustomAuthorizerV2);
    }

    /**
     * 修改自定义认证
     *
     * 修改自定义认证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomAuthorizerV2Request 请求对象
     * @return AsyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response>
     */
    public AsyncInvoker<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> updateCustomAuthorizerV2AsyncInvoker(
        UpdateCustomAuthorizerV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateCustomAuthorizerV2, hcClient);
    }

    /**
     * 修改域名
     *
     * 修改绑定的域名所对应的配置信息。使用实例自定义入方向端口的特性时，注意开启/关闭客户端校验会对相同域名的不同端口同时生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainV2Request 请求对象
     * @return CompletableFuture<UpdateDomainV2Response>
     */
    public CompletableFuture<UpdateDomainV2Response> updateDomainV2Async(UpdateDomainV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateDomainV2);
    }

    /**
     * 修改域名
     *
     * 修改绑定的域名所对应的配置信息。使用实例自定义入方向端口的特性时，注意开启/关闭客户端校验会对相同域名的不同端口同时生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainV2Request 请求对象
     * @return AsyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response>
     */
    public AsyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response> updateDomainV2AsyncInvoker(
        UpdateDomainV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateDomainV2, hcClient);
    }

    /**
     * 更新实例出公网带宽
     *
     * 更新实例出公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEngressEipV2Request 请求对象
     * @return CompletableFuture<UpdateEngressEipV2Response>
     */
    public CompletableFuture<UpdateEngressEipV2Response> updateEngressEipV2Async(UpdateEngressEipV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateEngressEipV2);
    }

    /**
     * 更新实例出公网带宽
     *
     * 更新实例出公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEngressEipV2Request 请求对象
     * @return AsyncInvoker<UpdateEngressEipV2Request, UpdateEngressEipV2Response>
     */
    public AsyncInvoker<UpdateEngressEipV2Request, UpdateEngressEipV2Response> updateEngressEipV2AsyncInvoker(
        UpdateEngressEipV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateEngressEipV2, hcClient);
    }

    /**
     * 修改环境
     *
     * 修改指定环境的信息。其中可修改的属性为：name、remark，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentV2Request 请求对象
     * @return CompletableFuture<UpdateEnvironmentV2Response>
     */
    public CompletableFuture<UpdateEnvironmentV2Response> updateEnvironmentV2Async(UpdateEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateEnvironmentV2);
    }

    /**
     * 修改环境
     *
     * 修改指定环境的信息。其中可修改的属性为：name、remark，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentV2Request 请求对象
     * @return AsyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response>
     */
    public AsyncInvoker<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> updateEnvironmentV2AsyncInvoker(
        UpdateEnvironmentV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateEnvironmentV2, hcClient);
    }

    /**
     * 修改变量
     *
     * 修改环境变量。环境变量引用位置为api的后端服务地址时，修改对应环境变量会将使用该变量的所有api重新发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentVariableV2Request 请求对象
     * @return CompletableFuture<UpdateEnvironmentVariableV2Response>
     */
    public CompletableFuture<UpdateEnvironmentVariableV2Response> updateEnvironmentVariableV2Async(
        UpdateEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateEnvironmentVariableV2);
    }

    /**
     * 修改变量
     *
     * 修改环境变量。环境变量引用位置为api的后端服务地址时，修改对应环境变量会将使用该变量的所有api重新发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentVariableV2Request 请求对象
     * @return AsyncInvoker<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response>
     */
    public AsyncInvoker<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response> updateEnvironmentVariableV2AsyncInvoker(
        UpdateEnvironmentVariableV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateEnvironmentVariableV2, hcClient);
    }

    /**
     * 修改分组下指定错误类型的自定义响应
     *
     * 修改分组下指定错误类型的自定义响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGatewayResponseTypeV2Request 请求对象
     * @return CompletableFuture<UpdateGatewayResponseTypeV2Response>
     */
    public CompletableFuture<UpdateGatewayResponseTypeV2Response> updateGatewayResponseTypeV2Async(
        UpdateGatewayResponseTypeV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateGatewayResponseTypeV2);
    }

    /**
     * 修改分组下指定错误类型的自定义响应
     *
     * 修改分组下指定错误类型的自定义响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGatewayResponseTypeV2Request 请求对象
     * @return AsyncInvoker<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response>
     */
    public AsyncInvoker<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response> updateGatewayResponseTypeV2AsyncInvoker(
        UpdateGatewayResponseTypeV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateGatewayResponseTypeV2, hcClient);
    }

    /**
     * 修改分组自定义响应
     *
     * 修改分组自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGatewayResponseV2Request 请求对象
     * @return CompletableFuture<UpdateGatewayResponseV2Response>
     */
    public CompletableFuture<UpdateGatewayResponseV2Response> updateGatewayResponseV2Async(
        UpdateGatewayResponseV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateGatewayResponseV2);
    }

    /**
     * 修改分组自定义响应
     *
     * 修改分组自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGatewayResponseV2Request 请求对象
     * @return AsyncInvoker<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response>
     */
    public AsyncInvoker<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response> updateGatewayResponseV2AsyncInvoker(
        UpdateGatewayResponseV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateGatewayResponseV2, hcClient);
    }

    /**
     * 更新实例入公网带宽
     *
     * 更新实例入公网带宽，仅当实例为ELB类型时支持
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIngressEipV2Request 请求对象
     * @return CompletableFuture<UpdateIngressEipV2Response>
     */
    public CompletableFuture<UpdateIngressEipV2Response> updateIngressEipV2Async(UpdateIngressEipV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateIngressEipV2);
    }

    /**
     * 更新实例入公网带宽
     *
     * 更新实例入公网带宽，仅当实例为ELB类型时支持
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIngressEipV2Request 请求对象
     * @return AsyncInvoker<UpdateIngressEipV2Request, UpdateIngressEipV2Response>
     */
    public AsyncInvoker<UpdateIngressEipV2Request, UpdateIngressEipV2Response> updateIngressEipV2AsyncInvoker(
        UpdateIngressEipV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateIngressEipV2, hcClient);
    }

    /**
     * 更新专享版实例
     *
     * 更新专享版实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceV2Request 请求对象
     * @return CompletableFuture<UpdateInstanceV2Response>
     */
    public CompletableFuture<UpdateInstanceV2Response> updateInstanceV2Async(UpdateInstanceV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateInstanceV2);
    }

    /**
     * 更新专享版实例
     *
     * 更新专享版实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceV2Request 请求对象
     * @return AsyncInvoker<UpdateInstanceV2Request, UpdateInstanceV2Response>
     */
    public AsyncInvoker<UpdateInstanceV2Request, UpdateInstanceV2Response> updateInstanceV2AsyncInvoker(
        UpdateInstanceV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateInstanceV2, hcClient);
    }

    /**
     * 更新编排规则
     *
     * 更新编排规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOrchestrationRequest 请求对象
     * @return CompletableFuture<UpdateOrchestrationResponse>
     */
    public CompletableFuture<UpdateOrchestrationResponse> updateOrchestrationAsync(UpdateOrchestrationRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateOrchestration);
    }

    /**
     * 更新编排规则
     *
     * 更新编排规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOrchestrationRequest 请求对象
     * @return AsyncInvoker<UpdateOrchestrationRequest, UpdateOrchestrationResponse>
     */
    public AsyncInvoker<UpdateOrchestrationRequest, UpdateOrchestrationResponse> updateOrchestrationAsyncInvoker(
        UpdateOrchestrationRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.updateOrchestration, hcClient);
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
     * @return CompletableFuture<UpdatePluginResponse>
     */
    public CompletableFuture<UpdatePluginResponse> updatePluginAsync(UpdatePluginRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updatePlugin);
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
     * @return AsyncInvoker<UpdatePluginRequest, UpdatePluginResponse>
     */
    public AsyncInvoker<UpdatePluginRequest, UpdatePluginResponse> updatePluginAsyncInvoker(
        UpdatePluginRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.updatePlugin, hcClient);
    }

    /**
     * 修改流控策略
     *
     * 修改指定流控策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<UpdateRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2Async(
        UpdateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateRequestThrottlingPolicyV2);
    }

    /**
     * 修改流控策略
     *
     * 修改指定流控策略的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2AsyncInvoker(
        UpdateRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 修改签名密钥
     *
     * 修改指定签名密钥的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSignatureKeyV2Request 请求对象
     * @return CompletableFuture<UpdateSignatureKeyV2Response>
     */
    public CompletableFuture<UpdateSignatureKeyV2Response> updateSignatureKeyV2Async(
        UpdateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateSignatureKeyV2);
    }

    /**
     * 修改签名密钥
     *
     * 修改指定签名密钥的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSignatureKeyV2Request 请求对象
     * @return AsyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response>
     */
    public AsyncInvoker<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> updateSignatureKeyV2AsyncInvoker(
        UpdateSignatureKeyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateSignatureKeyV2, hcClient);
    }

    /**
     * 设置调试域名是否可以访问
     *
     * 禁用或启用API分组绑定的调试域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSlDomainSettingV2Request 请求对象
     * @return CompletableFuture<UpdateSlDomainSettingV2Response>
     */
    public CompletableFuture<UpdateSlDomainSettingV2Response> updateSlDomainSettingV2Async(
        UpdateSlDomainSettingV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateSlDomainSettingV2);
    }

    /**
     * 设置调试域名是否可以访问
     *
     * 禁用或启用API分组绑定的调试域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSlDomainSettingV2Request 请求对象
     * @return AsyncInvoker<UpdateSlDomainSettingV2Request, UpdateSlDomainSettingV2Response>
     */
    public AsyncInvoker<UpdateSlDomainSettingV2Request, UpdateSlDomainSettingV2Response> updateSlDomainSettingV2AsyncInvoker(
        UpdateSlDomainSettingV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateSlDomainSettingV2, hcClient);
    }

    /**
     * 修改特殊设置
     *
     * 修改某个流控策略下的某个特殊设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSpecialThrottlingConfigurationV2Request 请求对象
     * @return CompletableFuture<UpdateSpecialThrottlingConfigurationV2Response>
     */
    public CompletableFuture<UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2Async(
        UpdateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateSpecialThrottlingConfigurationV2);
    }

    /**
     * 修改特殊设置
     *
     * 修改某个流控策略下的某个特殊设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSpecialThrottlingConfigurationV2Request 请求对象
     * @return AsyncInvoker<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response>
     */
    public AsyncInvoker<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2AsyncInvoker(
        UpdateSpecialThrottlingConfigurationV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateSpecialThrottlingConfigurationV2, hcClient);
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
     * @return CompletableFuture<BatchDeleteAclV2Response>
     */
    public CompletableFuture<BatchDeleteAclV2Response> batchDeleteAclV2Async(BatchDeleteAclV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchDeleteAclV2);
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
     * @return AsyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response>
     */
    public AsyncInvoker<BatchDeleteAclV2Request, BatchDeleteAclV2Response> batchDeleteAclV2AsyncInvoker(
        BatchDeleteAclV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.batchDeleteAclV2, hcClient);
    }

    /**
     * 创建ACL策略
     *
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com”之类的网络域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAclStrategyV2Request 请求对象
     * @return CompletableFuture<CreateAclStrategyV2Response>
     */
    public CompletableFuture<CreateAclStrategyV2Response> createAclStrategyV2Async(CreateAclStrategyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createAclStrategyV2);
    }

    /**
     * 创建ACL策略
     *
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com”之类的网络域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAclStrategyV2Request 请求对象
     * @return AsyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response>
     */
    public AsyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response> createAclStrategyV2AsyncInvoker(
        CreateAclStrategyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createAclStrategyV2, hcClient);
    }

    /**
     * 删除ACL策略
     *
     * 删除指定的ACL策略， 如果存在api与该ACL策略的绑定关系，则无法删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclV2Request 请求对象
     * @return CompletableFuture<DeleteAclV2Response>
     */
    public CompletableFuture<DeleteAclV2Response> deleteAclV2Async(DeleteAclV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteAclV2);
    }

    /**
     * 删除ACL策略
     *
     * 删除指定的ACL策略， 如果存在api与该ACL策略的绑定关系，则无法删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclV2Request 请求对象
     * @return AsyncInvoker<DeleteAclV2Request, DeleteAclV2Response>
     */
    public AsyncInvoker<DeleteAclV2Request, DeleteAclV2Response> deleteAclV2AsyncInvoker(DeleteAclV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteAclV2, hcClient);
    }

    /**
     * 查看ACL策略列表
     *
     * 查询所有的ACL策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclStrategiesV2Request 请求对象
     * @return CompletableFuture<ListAclStrategiesV2Response>
     */
    public CompletableFuture<ListAclStrategiesV2Response> listAclStrategiesV2Async(ListAclStrategiesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAclStrategiesV2);
    }

    /**
     * 查看ACL策略列表
     *
     * 查询所有的ACL策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclStrategiesV2Request 请求对象
     * @return AsyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response>
     */
    public AsyncInvoker<ListAclStrategiesV2Request, ListAclStrategiesV2Response> listAclStrategiesV2AsyncInvoker(
        ListAclStrategiesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listAclStrategiesV2, hcClient);
    }

    /**
     * 查看ACL策略详情
     *
     * 查询指定ACL策略的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAclPolicyV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfAclPolicyV2Response>
     */
    public CompletableFuture<ShowDetailsOfAclPolicyV2Response> showDetailsOfAclPolicyV2Async(
        ShowDetailsOfAclPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfAclPolicyV2);
    }

    /**
     * 查看ACL策略详情
     *
     * 查询指定ACL策略的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfAclPolicyV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response>
     */
    public AsyncInvoker<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> showDetailsOfAclPolicyV2AsyncInvoker(
        ShowDetailsOfAclPolicyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfAclPolicyV2, hcClient);
    }

    /**
     * 修改ACL策略
     *
     * 修改指定的ACL策略，其中可修改的属性为：acl_name、acl_type、acl_value，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclStrategyV2Request 请求对象
     * @return CompletableFuture<UpdateAclStrategyV2Response>
     */
    public CompletableFuture<UpdateAclStrategyV2Response> updateAclStrategyV2Async(UpdateAclStrategyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateAclStrategyV2);
    }

    /**
     * 修改ACL策略
     *
     * 修改指定的ACL策略，其中可修改的属性为：acl_name、acl_type、acl_value，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclStrategyV2Request 请求对象
     * @return AsyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response>
     */
    public AsyncInvoker<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> updateAclStrategyV2AsyncInvoker(
        UpdateAclStrategyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateAclStrategyV2, hcClient);
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
     * @return CompletableFuture<AssociateRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2Async(
        AssociateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.associateRequestThrottlingPolicyV2);
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
     * @return AsyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2AsyncInvoker(
        AssociateRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.associateRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 批量解绑流控策略
     *
     * 批量解除API与流控策略的绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<BatchDisassociateThrottlingPolicyV2Response>
     */
    public CompletableFuture<BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2Async(
        BatchDisassociateThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchDisassociateThrottlingPolicyV2);
    }

    /**
     * 批量解绑流控策略
     *
     * 批量解除API与流控策略的绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response>
     */
    public AsyncInvoker<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2AsyncInvoker(
        BatchDisassociateThrottlingPolicyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.batchDisassociateThrottlingPolicyV2, hcClient);
    }

    /**
     * 批量发布或下线API
     *
     * 将多个API发布到一个指定的环境，或将多个API从指定的环境下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPublishOrOfflineApiV2Request 请求对象
     * @return CompletableFuture<BatchPublishOrOfflineApiV2Response>
     */
    public CompletableFuture<BatchPublishOrOfflineApiV2Response> batchPublishOrOfflineApiV2Async(
        BatchPublishOrOfflineApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchPublishOrOfflineApiV2);
    }

    /**
     * 批量发布或下线API
     *
     * 将多个API发布到一个指定的环境，或将多个API从指定的环境下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPublishOrOfflineApiV2Request 请求对象
     * @return AsyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response>
     */
    public AsyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> batchPublishOrOfflineApiV2AsyncInvoker(
        BatchPublishOrOfflineApiV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.batchPublishOrOfflineApiV2, hcClient);
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
     * @return CompletableFuture<ChangeApiVersionV2Response>
     */
    public CompletableFuture<ChangeApiVersionV2Response> changeApiVersionV2Async(ChangeApiVersionV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.changeApiVersionV2);
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
     * @return AsyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response>
     */
    public AsyncInvoker<ChangeApiVersionV2Request, ChangeApiVersionV2Response> changeApiVersionV2AsyncInvoker(
        ChangeApiVersionV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.changeApiVersionV2, hcClient);
    }

    /**
     * 校验API分组名称是否存在
     *
     * 校验API分组名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckApiGroupsV2Request 请求对象
     * @return CompletableFuture<CheckApiGroupsV2Response>
     */
    public CompletableFuture<CheckApiGroupsV2Response> checkApiGroupsV2Async(CheckApiGroupsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.checkApiGroupsV2);
    }

    /**
     * 校验API分组名称是否存在
     *
     * 校验API分组名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckApiGroupsV2Request 请求对象
     * @return AsyncInvoker<CheckApiGroupsV2Request, CheckApiGroupsV2Response>
     */
    public AsyncInvoker<CheckApiGroupsV2Request, CheckApiGroupsV2Response> checkApiGroupsV2AsyncInvoker(
        CheckApiGroupsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.checkApiGroupsV2, hcClient);
    }

    /**
     * 校验API定义
     *
     * 校验API定义。校验API的路径或名称是否已存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckApisV2Request 请求对象
     * @return CompletableFuture<CheckApisV2Response>
     */
    public CompletableFuture<CheckApisV2Response> checkApisV2Async(CheckApisV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.checkApisV2);
    }

    /**
     * 校验API定义
     *
     * 校验API定义。校验API的路径或名称是否已存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckApisV2Request 请求对象
     * @return AsyncInvoker<CheckApisV2Request, CheckApisV2Response>
     */
    public AsyncInvoker<CheckApisV2Request, CheckApisV2Response> checkApisV2AsyncInvoker(CheckApisV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.checkApisV2, hcClient);
    }

    /**
     * 创建API分组
     *
     * API分组是API的管理单元，一个API分组等同于一个服务入口，创建API分组时，返回一个子域名作为访问入口。建议一个API分组下的API具有一定的相关性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiGroupV2Request 请求对象
     * @return CompletableFuture<CreateApiGroupV2Response>
     */
    public CompletableFuture<CreateApiGroupV2Response> createApiGroupV2Async(CreateApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createApiGroupV2);
    }

    /**
     * 创建API分组
     *
     * API分组是API的管理单元，一个API分组等同于一个服务入口，创建API分组时，返回一个子域名作为访问入口。建议一个API分组下的API具有一定的相关性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiGroupV2Request 请求对象
     * @return AsyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response>
     */
    public AsyncInvoker<CreateApiGroupV2Request, CreateApiGroupV2Response> createApiGroupV2AsyncInvoker(
        CreateApiGroupV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createApiGroupV2, hcClient);
    }

    /**
     * 创建API
     *
     * 添加一个API，API即一个服务接口，具体的服务能力。
     * 
     * 
     * API分为两部分，第一部分为面向API使用者的API接口，定义了使用者如何调用这个API。第二部分面向API提供者，由API提供者定义这个API的真实的后端情况，定义了API网关如何去访问真实的后端服务。API的真实后端服务目前支持四种类型：传统的HTTP/HTTPS形式的web后端、GRPC后端、函数工作流、MOCK。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiV2Request 请求对象
     * @return CompletableFuture<CreateApiV2Response>
     */
    public CompletableFuture<CreateApiV2Response> createApiV2Async(CreateApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createApiV2);
    }

    /**
     * 创建API
     *
     * 添加一个API，API即一个服务接口，具体的服务能力。
     * 
     * 
     * API分为两部分，第一部分为面向API使用者的API接口，定义了使用者如何调用这个API。第二部分面向API提供者，由API提供者定义这个API的真实的后端情况，定义了API网关如何去访问真实的后端服务。API的真实后端服务目前支持四种类型：传统的HTTP/HTTPS形式的web后端、GRPC后端、函数工作流、MOCK。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiV2Request 请求对象
     * @return AsyncInvoker<CreateApiV2Request, CreateApiV2Response>
     */
    public AsyncInvoker<CreateApiV2Request, CreateApiV2Response> createApiV2AsyncInvoker(CreateApiV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createApiV2, hcClient);
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
     * @return CompletableFuture<CreateOrDeletePublishRecordForApiV2Response>
     */
    public CompletableFuture<CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2Async(
        CreateOrDeletePublishRecordForApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createOrDeletePublishRecordForApiV2);
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
     * @return AsyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response>
     */
    public AsyncInvoker<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2AsyncInvoker(
        CreateOrDeletePublishRecordForApiV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createOrDeletePublishRecordForApiV2, hcClient);
    }

    /**
     * 调试API
     *
     * 调试一个API在指定运行环境下的定义，接口调用者需要具有操作该API的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugApiV2Request 请求对象
     * @return CompletableFuture<DebugApiV2Response>
     */
    public CompletableFuture<DebugApiV2Response> debugApiV2Async(DebugApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.debugApiV2);
    }

    /**
     * 调试API
     *
     * 调试一个API在指定运行环境下的定义，接口调用者需要具有操作该API的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugApiV2Request 请求对象
     * @return AsyncInvoker<DebugApiV2Request, DebugApiV2Response>
     */
    public AsyncInvoker<DebugApiV2Request, DebugApiV2Response> debugApiV2AsyncInvoker(DebugApiV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.debugApiV2, hcClient);
    }

    /**
     * 根据版本编号下线API
     *
     * 对某个生效中的API版本进行下线操作，下线后，API在该版本生效的环境中将不再能够被调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiByVersionIdV2Request 请求对象
     * @return CompletableFuture<DeleteApiByVersionIdV2Response>
     */
    public CompletableFuture<DeleteApiByVersionIdV2Response> deleteApiByVersionIdV2Async(
        DeleteApiByVersionIdV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteApiByVersionIdV2);
    }

    /**
     * 根据版本编号下线API
     *
     * 对某个生效中的API版本进行下线操作，下线后，API在该版本生效的环境中将不再能够被调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiByVersionIdV2Request 请求对象
     * @return AsyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response>
     */
    public AsyncInvoker<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> deleteApiByVersionIdV2AsyncInvoker(
        DeleteApiByVersionIdV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteApiByVersionIdV2, hcClient);
    }

    /**
     * 删除API分组
     *
     * 删除指定的API分组。
     * 
     * 删除API分组前，要先下线并删除分组下的所有API。
     * 
     * 删除时，会一并删除直接或间接关联到该分组下的所有资源，包括独立域名、SSL证书信息等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiGroupV2Request 请求对象
     * @return CompletableFuture<DeleteApiGroupV2Response>
     */
    public CompletableFuture<DeleteApiGroupV2Response> deleteApiGroupV2Async(DeleteApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteApiGroupV2);
    }

    /**
     * 删除API分组
     *
     * 删除指定的API分组。
     * 
     * 删除API分组前，要先下线并删除分组下的所有API。
     * 
     * 删除时，会一并删除直接或间接关联到该分组下的所有资源，包括独立域名、SSL证书信息等等。并会将外部域名与子域名的绑定关系进行解除（取决于域名cname方式）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiGroupV2Request 请求对象
     * @return AsyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response>
     */
    public AsyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response> deleteApiGroupV2AsyncInvoker(
        DeleteApiGroupV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteApiGroupV2, hcClient);
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
     * @return CompletableFuture<DeleteApiV2Response>
     */
    public CompletableFuture<DeleteApiV2Response> deleteApiV2Async(DeleteApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteApiV2);
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
     * @return AsyncInvoker<DeleteApiV2Request, DeleteApiV2Response>
     */
    public AsyncInvoker<DeleteApiV2Request, DeleteApiV2Response> deleteApiV2AsyncInvoker(DeleteApiV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteApiV2, hcClient);
    }

    /**
     * 解除API与流控策略的绑定关系
     *
     * 解除API与流控策略的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<DisassociateRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2Async(
        DisassociateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.disassociateRequestThrottlingPolicyV2);
    }

    /**
     * 解除API与流控策略的绑定关系
     *
     * 解除API与流控策略的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2AsyncInvoker(
        DisassociateRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.disassociateRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查询分组列表
     *
     * 查询API分组列表。
     * 
     * 如果是租户操作，则查询该租户下所有的分组；如果是管理员权限账号操作，则查询的是所有租户的分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiGroupsV2Request 请求对象
     * @return CompletableFuture<ListApiGroupsV2Response>
     */
    public CompletableFuture<ListApiGroupsV2Response> listApiGroupsV2Async(ListApiGroupsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiGroupsV2);
    }

    /**
     * 查询分组列表
     *
     * 查询API分组列表。
     * 
     * 如果是租户操作，则查询该租户下所有的分组；如果是管理员权限账号操作，则查询的是所有租户的分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiGroupsV2Request 请求对象
     * @return AsyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response>
     */
    public AsyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response> listApiGroupsV2AsyncInvoker(
        ListApiGroupsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApiGroupsV2, hcClient);
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
     * @return CompletableFuture<ListApiRuntimeDefinitionV2Response>
     */
    public CompletableFuture<ListApiRuntimeDefinitionV2Response> listApiRuntimeDefinitionV2Async(
        ListApiRuntimeDefinitionV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiRuntimeDefinitionV2);
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
     * @return AsyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response>
     */
    public AsyncInvoker<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> listApiRuntimeDefinitionV2AsyncInvoker(
        ListApiRuntimeDefinitionV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApiRuntimeDefinitionV2, hcClient);
    }

    /**
     * 查看版本详情
     *
     * 查询某个指定的版本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionDetailV2Request 请求对象
     * @return CompletableFuture<ListApiVersionDetailV2Response>
     */
    public CompletableFuture<ListApiVersionDetailV2Response> listApiVersionDetailV2Async(
        ListApiVersionDetailV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiVersionDetailV2);
    }

    /**
     * 查看版本详情
     *
     * 查询某个指定的版本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionDetailV2Request 请求对象
     * @return AsyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response>
     */
    public AsyncInvoker<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> listApiVersionDetailV2AsyncInvoker(
        ListApiVersionDetailV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApiVersionDetailV2, hcClient);
    }

    /**
     * 查询API历史版本列表
     *
     * 查询某个API的历史版本。每个API在一个环境上最多存在10个历史版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsV2Request 请求对象
     * @return CompletableFuture<ListApiVersionsV2Response>
     */
    public CompletableFuture<ListApiVersionsV2Response> listApiVersionsV2Async(ListApiVersionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiVersionsV2);
    }

    /**
     * 查询API历史版本列表
     *
     * 查询某个API的历史版本。每个API在一个环境上最多存在10个历史版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsV2Request 请求对象
     * @return AsyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response>
     */
    public AsyncInvoker<ListApiVersionsV2Request, ListApiVersionsV2Response> listApiVersionsV2AsyncInvoker(
        ListApiVersionsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApiVersionsV2, hcClient);
    }

    /**
     * 查看流控策略绑定的API列表
     *
     * 查询某个流控策略上已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2Async(
        ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisBindedToRequestThrottlingPolicyV2);
    }

    /**
     * 查看流控策略绑定的API列表
     *
     * 查询某个流控策略上已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2AsyncInvoker(
        ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApisBindedToRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查看流控策略未绑定的API列表
     *
     * 查询所有未绑定到该流控策略上的自有API列表。需要API已经发布，未发布的API不予展示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisUnbindedToRequestThrottlingPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisUnbindedToRequestThrottlingPolicyV2Response>
     */
    public CompletableFuture<ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2Async(
        ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisUnbindedToRequestThrottlingPolicyV2);
    }

    /**
     * 查看流控策略未绑定的API列表
     *
     * 查询所有未绑定到该流控策略上的自有API列表。需要API已经发布，未发布的API不予展示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisUnbindedToRequestThrottlingPolicyV2Request 请求对象
     * @return AsyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response>
     */
    public AsyncInvoker<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2AsyncInvoker(
        ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApisUnbindedToRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查询API列表
     *
     * 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息和API请求参数信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisV2Request 请求对象
     * @return CompletableFuture<ListApisV2Response>
     */
    public CompletableFuture<ListApisV2Response> listApisV2Async(ListApisV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisV2);
    }

    /**
     * 查询API列表
     *
     * 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息和API请求参数信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisV2Request 请求对象
     * @return AsyncInvoker<ListApisV2Request, ListApisV2Response>
     */
    public AsyncInvoker<ListApisV2Request, ListApisV2Response> listApisV2AsyncInvoker(ListApisV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApisV2, hcClient);
    }

    /**
     * 查看API绑定的流控策略列表
     *
     * 查询某个API绑定的流控策略列表。每个环境上应该最多只有一个流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRequestThrottlingPoliciesBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListRequestThrottlingPoliciesBindedToApiV2Response>
     */
    public CompletableFuture<ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2Async(
        ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listRequestThrottlingPoliciesBindedToApiV2);
    }

    /**
     * 查看API绑定的流控策略列表
     *
     * 查询某个API绑定的流控策略列表。每个环境上应该最多只有一个流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRequestThrottlingPoliciesBindedToApiV2Request 请求对象
     * @return AsyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response>
     */
    public AsyncInvoker<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2AsyncInvoker(
        ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listRequestThrottlingPoliciesBindedToApiV2, hcClient);
    }

    /**
     * 查询分组详情
     *
     * 查询指定分组的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfApiGroupV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfApiGroupV2Response>
     */
    public CompletableFuture<ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2Async(
        ShowDetailsOfApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfApiGroupV2);
    }

    /**
     * 查询分组详情
     *
     * 查询指定分组的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfApiGroupV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response>
     */
    public AsyncInvoker<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2AsyncInvoker(
        ShowDetailsOfApiGroupV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfApiGroupV2, hcClient);
    }

    /**
     * 查询API详情
     *
     * 查看指定的API的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfApiV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfApiV2Response>
     */
    public CompletableFuture<ShowDetailsOfApiV2Response> showDetailsOfApiV2Async(ShowDetailsOfApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfApiV2);
    }

    /**
     * 查询API详情
     *
     * 查看指定的API的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfApiV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response>
     */
    public AsyncInvoker<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> showDetailsOfApiV2AsyncInvoker(
        ShowDetailsOfApiV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfApiV2, hcClient);
    }

    /**
     * 修改API分组
     *
     * 修改API分组属性。其中name和remark可修改，其他属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiGroupV2Request 请求对象
     * @return CompletableFuture<UpdateApiGroupV2Response>
     */
    public CompletableFuture<UpdateApiGroupV2Response> updateApiGroupV2Async(UpdateApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateApiGroupV2);
    }

    /**
     * 修改API分组
     *
     * 修改API分组属性。其中name和remark可修改，其他属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiGroupV2Request 请求对象
     * @return AsyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response>
     */
    public AsyncInvoker<UpdateApiGroupV2Request, UpdateApiGroupV2Response> updateApiGroupV2AsyncInvoker(
        UpdateApiGroupV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateApiGroupV2, hcClient);
    }

    /**
     * 修改API
     *
     * 修改指定API的信息，包括后端服务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiV2Request 请求对象
     * @return CompletableFuture<UpdateApiV2Response>
     */
    public CompletableFuture<UpdateApiV2Response> updateApiV2Async(UpdateApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateApiV2);
    }

    /**
     * 修改API
     *
     * 修改指定API的信息，包括后端服务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiV2Request 请求对象
     * @return AsyncInvoker<UpdateApiV2Request, UpdateApiV2Response>
     */
    public AsyncInvoker<UpdateApiV2Request, UpdateApiV2Response> updateApiV2AsyncInvoker(UpdateApiV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateApiV2, hcClient);
    }

    /**
     * 批量解除API与ACL策略的绑定
     *
     * 批量解除API与ACL策略的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteApiAclBindingV2Request 请求对象
     * @return CompletableFuture<BatchDeleteApiAclBindingV2Response>
     */
    public CompletableFuture<BatchDeleteApiAclBindingV2Response> batchDeleteApiAclBindingV2Async(
        BatchDeleteApiAclBindingV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchDeleteApiAclBindingV2);
    }

    /**
     * 批量解除API与ACL策略的绑定
     *
     * 批量解除API与ACL策略的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteApiAclBindingV2Request 请求对象
     * @return AsyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response>
     */
    public AsyncInvoker<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> batchDeleteApiAclBindingV2AsyncInvoker(
        BatchDeleteApiAclBindingV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.batchDeleteApiAclBindingV2, hcClient);
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
     * @return CompletableFuture<CreateApiAclBindingV2Response>
     */
    public CompletableFuture<CreateApiAclBindingV2Response> createApiAclBindingV2Async(
        CreateApiAclBindingV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createApiAclBindingV2);
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
     * @return AsyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response>
     */
    public AsyncInvoker<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> createApiAclBindingV2AsyncInvoker(
        CreateApiAclBindingV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createApiAclBindingV2, hcClient);
    }

    /**
     * 解除API与ACL策略的绑定
     *
     * 解除某条API与ACL策略的绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiAclBindingV2Request 请求对象
     * @return CompletableFuture<DeleteApiAclBindingV2Response>
     */
    public CompletableFuture<DeleteApiAclBindingV2Response> deleteApiAclBindingV2Async(
        DeleteApiAclBindingV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteApiAclBindingV2);
    }

    /**
     * 解除API与ACL策略的绑定
     *
     * 解除某条API与ACL策略的绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiAclBindingV2Request 请求对象
     * @return AsyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response>
     */
    public AsyncInvoker<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> deleteApiAclBindingV2AsyncInvoker(
        DeleteApiAclBindingV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteApiAclBindingV2, hcClient);
    }

    /**
     * 查看API绑定的ACL策略列表
     *
     * 查看API绑定的ACL策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclPolicyBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListAclPolicyBindedToApiV2Response>
     */
    public CompletableFuture<ListAclPolicyBindedToApiV2Response> listAclPolicyBindedToApiV2Async(
        ListAclPolicyBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAclPolicyBindedToApiV2);
    }

    /**
     * 查看API绑定的ACL策略列表
     *
     * 查看API绑定的ACL策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclPolicyBindedToApiV2Request 请求对象
     * @return AsyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response>
     */
    public AsyncInvoker<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> listAclPolicyBindedToApiV2AsyncInvoker(
        ListAclPolicyBindedToApiV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listAclPolicyBindedToApiV2, hcClient);
    }

    /**
     * 查看ACL策略绑定的API列表
     *
     * 查看ACL策略绑定的API列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToAclPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToAclPolicyV2Response>
     */
    public CompletableFuture<ListApisBindedToAclPolicyV2Response> listApisBindedToAclPolicyV2Async(
        ListApisBindedToAclPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisBindedToAclPolicyV2);
    }

    /**
     * 查看ACL策略绑定的API列表
     *
     * 查看ACL策略绑定的API列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToAclPolicyV2Request 请求对象
     * @return AsyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response>
     */
    public AsyncInvoker<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> listApisBindedToAclPolicyV2AsyncInvoker(
        ListApisBindedToAclPolicyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApisBindedToAclPolicyV2, hcClient);
    }

    /**
     * 查看ACL策略未绑定的API列表
     *
     * 查看ACL策略未绑定的API列表，需要API已发布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisUnbindedToAclPolicyV2Request 请求对象
     * @return CompletableFuture<ListApisUnbindedToAclPolicyV2Response>
     */
    public CompletableFuture<ListApisUnbindedToAclPolicyV2Response> listApisUnbindedToAclPolicyV2Async(
        ListApisUnbindedToAclPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisUnbindedToAclPolicyV2);
    }

    /**
     * 查看ACL策略未绑定的API列表
     *
     * 查看ACL策略未绑定的API列表，需要API已发布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisUnbindedToAclPolicyV2Request 请求对象
     * @return AsyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response>
     */
    public AsyncInvoker<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> listApisUnbindedToAclPolicyV2AsyncInvoker(
        ListApisUnbindedToAclPolicyV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApisUnbindedToAclPolicyV2, hcClient);
    }

    /**
     * 解除授权
     *
     * 解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelingAuthorizationV2Request 请求对象
     * @return CompletableFuture<CancelingAuthorizationV2Response>
     */
    public CompletableFuture<CancelingAuthorizationV2Response> cancelingAuthorizationV2Async(
        CancelingAuthorizationV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.cancelingAuthorizationV2);
    }

    /**
     * 解除授权
     *
     * 解除API对APP的授权关系。解除授权后，APP将不再能够调用该API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelingAuthorizationV2Request 请求对象
     * @return AsyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response>
     */
    public AsyncInvoker<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> cancelingAuthorizationV2AsyncInvoker(
        CancelingAuthorizationV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.cancelingAuthorizationV2, hcClient);
    }

    /**
     * APP授权
     *
     * APP创建成功后，还不能访问API，如果想要访问某个环境上的API，需要将该API在该环境上授权给APP。授权成功后，APP即可访问该环境上的这个API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizingAppsV2Request 请求对象
     * @return CompletableFuture<CreateAuthorizingAppsV2Response>
     */
    public CompletableFuture<CreateAuthorizingAppsV2Response> createAuthorizingAppsV2Async(
        CreateAuthorizingAppsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createAuthorizingAppsV2);
    }

    /**
     * APP授权
     *
     * APP创建成功后，还不能访问API，如果想要访问某个环境上的API，需要将该API在该环境上授权给APP。授权成功后，APP即可访问该环境上的这个API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizingAppsV2Request 请求对象
     * @return AsyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response>
     */
    public AsyncInvoker<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> createAuthorizingAppsV2AsyncInvoker(
        CreateAuthorizingAppsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createAuthorizingAppsV2, hcClient);
    }

    /**
     * 查看APP已绑定的API列表
     *
     * 查询APP已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToAppV2Request 请求对象
     * @return CompletableFuture<ListApisBindedToAppV2Response>
     */
    public CompletableFuture<ListApisBindedToAppV2Response> listApisBindedToAppV2Async(
        ListApisBindedToAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisBindedToAppV2);
    }

    /**
     * 查看APP已绑定的API列表
     *
     * 查询APP已经绑定的API列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisBindedToAppV2Request 请求对象
     * @return AsyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response>
     */
    public AsyncInvoker<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> listApisBindedToAppV2AsyncInvoker(
        ListApisBindedToAppV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApisBindedToAppV2, hcClient);
    }

    /**
     * 查看APP未绑定的API列表
     *
     * 查询指定环境上某个APP未绑定的API列表[，包括自有API和从云商店购买的API](tag:hws)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisUnbindedToAppV2Request 请求对象
     * @return CompletableFuture<ListApisUnbindedToAppV2Response>
     */
    public CompletableFuture<ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2Async(
        ListApisUnbindedToAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisUnbindedToAppV2);
    }

    /**
     * 查看APP未绑定的API列表
     *
     * 查询指定环境上某个APP未绑定的API列表[，包括自有API和从云商店购买的API](tag:hws)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisUnbindedToAppV2Request 请求对象
     * @return AsyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response>
     */
    public AsyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2AsyncInvoker(
        ListApisUnbindedToAppV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listApisUnbindedToAppV2, hcClient);
    }

    /**
     * 查看API已绑定的APP列表
     *
     * 查询API绑定的APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsBindedToApiV2Request 请求对象
     * @return CompletableFuture<ListAppsBindedToApiV2Response>
     */
    public CompletableFuture<ListAppsBindedToApiV2Response> listAppsBindedToApiV2Async(
        ListAppsBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAppsBindedToApiV2);
    }

    /**
     * 查看API已绑定的APP列表
     *
     * 查询API绑定的APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsBindedToApiV2Request 请求对象
     * @return AsyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response>
     */
    public AsyncInvoker<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> listAppsBindedToApiV2AsyncInvoker(
        ListAppsBindedToApiV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listAppsBindedToApiV2, hcClient);
    }

    /**
     * 导出API
     *
     * 导出分组下API的定义信息。导出文件内容符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportApiDefinitionsV2Request 请求对象
     * @return CompletableFuture<ExportApiDefinitionsV2Response>
     */
    public CompletableFuture<ExportApiDefinitionsV2Response> exportApiDefinitionsV2Async(
        ExportApiDefinitionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.exportApiDefinitionsV2);
    }

    /**
     * 导出API
     *
     * 导出分组下API的定义信息。导出文件内容符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportApiDefinitionsV2Request 请求对象
     * @return AsyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response>
     */
    public AsyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> exportApiDefinitionsV2AsyncInvoker(
        ExportApiDefinitionsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.exportApiDefinitionsV2, hcClient);
    }

    /**
     * 导入API
     *
     * 导入API。导入文件内容需要符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportApiDefinitionsV2Request 请求对象
     * @return CompletableFuture<ImportApiDefinitionsV2Response>
     */
    public CompletableFuture<ImportApiDefinitionsV2Response> importApiDefinitionsV2Async(
        ImportApiDefinitionsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.importApiDefinitionsV2);
    }

    /**
     * 导入API
     *
     * 导入API。导入文件内容需要符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportApiDefinitionsV2Request 请求对象
     * @return AsyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response>
     */
    public AsyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> importApiDefinitionsV2AsyncInvoker(
        ImportApiDefinitionsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.importApiDefinitionsV2, hcClient);
    }

    /**
     * 域名绑定SSL证书
     *
     * 域名绑定SSL证书。目前暂时仅支持单个绑定，请求体当中的certificate_ids里面有且只能有一个证书ID。使用实例自定义入方向端口的特性时，相同的域名会同时绑定证书，注意开启/关闭客户端校验会对相同域名的不同端口同时生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateCertsV2Request 请求对象
     * @return CompletableFuture<BatchAssociateCertsV2Response>
     */
    public CompletableFuture<BatchAssociateCertsV2Response> batchAssociateCertsV2Async(
        BatchAssociateCertsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchAssociateCertsV2);
    }

    /**
     * 域名绑定SSL证书
     *
     * 域名绑定SSL证书。目前暂时仅支持单个绑定，请求体当中的certificate_ids里面有且只能有一个证书ID。使用实例自定义入方向端口的特性时，相同的域名会同时绑定证书，注意开启/关闭客户端校验会对相同域名的不同端口同时生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateCertsV2Request 请求对象
     * @return AsyncInvoker<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response>
     */
    public AsyncInvoker<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response> batchAssociateCertsV2AsyncInvoker(
        BatchAssociateCertsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.batchAssociateCertsV2, hcClient);
    }

    /**
     * SSL证书绑定域名
     *
     * SSL证书绑定域名。使用实例自定义入方向端口的特性时，相同的域名会同时绑定证书，注意开启/关闭客户端校验会对相同域名的不同端口同时生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateDomainsV2Request 请求对象
     * @return CompletableFuture<BatchAssociateDomainsV2Response>
     */
    public CompletableFuture<BatchAssociateDomainsV2Response> batchAssociateDomainsV2Async(
        BatchAssociateDomainsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchAssociateDomainsV2);
    }

    /**
     * SSL证书绑定域名
     *
     * SSL证书绑定域名。使用实例自定义入方向端口的特性时，相同的域名会同时绑定证书，注意开启/关闭客户端校验会对相同域名的不同端口同时生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateDomainsV2Request 请求对象
     * @return AsyncInvoker<BatchAssociateDomainsV2Request, BatchAssociateDomainsV2Response>
     */
    public AsyncInvoker<BatchAssociateDomainsV2Request, BatchAssociateDomainsV2Response> batchAssociateDomainsV2AsyncInvoker(
        BatchAssociateDomainsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.batchAssociateDomainsV2, hcClient);
    }

    /**
     * 域名解绑SSL证书
     *
     * 域名解绑SSL证书。目前暂时仅支持单个解绑，请求体当中的certificate_ids里面有且只能有一个证书ID。在使用自定义入方向端口的特性时，相同的域名会同时解绑证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateCertsV2Request 请求对象
     * @return CompletableFuture<BatchDisassociateCertsV2Response>
     */
    public CompletableFuture<BatchDisassociateCertsV2Response> batchDisassociateCertsV2Async(
        BatchDisassociateCertsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchDisassociateCertsV2);
    }

    /**
     * 域名解绑SSL证书
     *
     * 域名解绑SSL证书。目前暂时仅支持单个解绑，请求体当中的certificate_ids里面有且只能有一个证书ID。在使用自定义入方向端口的特性时，相同的域名会同时解绑证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateCertsV2Request 请求对象
     * @return AsyncInvoker<BatchDisassociateCertsV2Request, BatchDisassociateCertsV2Response>
     */
    public AsyncInvoker<BatchDisassociateCertsV2Request, BatchDisassociateCertsV2Response> batchDisassociateCertsV2AsyncInvoker(
        BatchDisassociateCertsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.batchDisassociateCertsV2, hcClient);
    }

    /**
     * SSL证书解绑域名
     *
     * SSL证书解绑域名。在使用自定义入方向端口的特性时，相同的域名会同时解绑证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateDomainsV2Request 请求对象
     * @return CompletableFuture<BatchDisassociateDomainsV2Response>
     */
    public CompletableFuture<BatchDisassociateDomainsV2Response> batchDisassociateDomainsV2Async(
        BatchDisassociateDomainsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchDisassociateDomainsV2);
    }

    /**
     * SSL证书解绑域名
     *
     * SSL证书解绑域名。在使用自定义入方向端口的特性时，相同的域名会同时解绑证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateDomainsV2Request 请求对象
     * @return AsyncInvoker<BatchDisassociateDomainsV2Request, BatchDisassociateDomainsV2Response>
     */
    public AsyncInvoker<BatchDisassociateDomainsV2Request, BatchDisassociateDomainsV2Response> batchDisassociateDomainsV2AsyncInvoker(
        BatchDisassociateDomainsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.batchDisassociateDomainsV2, hcClient);
    }

    /**
     * 创建SSL证书
     *
     * 创建SSL证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateV2Request 请求对象
     * @return CompletableFuture<CreateCertificateV2Response>
     */
    public CompletableFuture<CreateCertificateV2Response> createCertificateV2Async(CreateCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createCertificateV2);
    }

    /**
     * 创建SSL证书
     *
     * 创建SSL证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateV2Request 请求对象
     * @return AsyncInvoker<CreateCertificateV2Request, CreateCertificateV2Response>
     */
    public AsyncInvoker<CreateCertificateV2Request, CreateCertificateV2Response> createCertificateV2AsyncInvoker(
        CreateCertificateV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createCertificateV2, hcClient);
    }

    /**
     * 删除SSL证书
     *
     * 删除ssl证书接口，删除时只有没有关联域名的证书才能被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateV2Request 请求对象
     * @return CompletableFuture<DeleteCertificateV2Response>
     */
    public CompletableFuture<DeleteCertificateV2Response> deleteCertificateV2Async(DeleteCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteCertificateV2);
    }

    /**
     * 删除SSL证书
     *
     * 删除ssl证书接口，删除时只有没有关联域名的证书才能被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateV2Request 请求对象
     * @return AsyncInvoker<DeleteCertificateV2Request, DeleteCertificateV2Response>
     */
    public AsyncInvoker<DeleteCertificateV2Request, DeleteCertificateV2Response> deleteCertificateV2AsyncInvoker(
        DeleteCertificateV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteCertificateV2, hcClient);
    }

    /**
     * 获取SSL证书已绑定域名列表
     *
     * 获取SSL证书已绑定域名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedDomainsV2Request 请求对象
     * @return CompletableFuture<ListAttachedDomainsV2Response>
     */
    public CompletableFuture<ListAttachedDomainsV2Response> listAttachedDomainsV2Async(
        ListAttachedDomainsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAttachedDomainsV2);
    }

    /**
     * 获取SSL证书已绑定域名列表
     *
     * 获取SSL证书已绑定域名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachedDomainsV2Request 请求对象
     * @return AsyncInvoker<ListAttachedDomainsV2Request, ListAttachedDomainsV2Response>
     */
    public AsyncInvoker<ListAttachedDomainsV2Request, ListAttachedDomainsV2Response> listAttachedDomainsV2AsyncInvoker(
        ListAttachedDomainsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listAttachedDomainsV2, hcClient);
    }

    /**
     * 获取SSL证书列表
     *
     * 获取SSL证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesV2Request 请求对象
     * @return CompletableFuture<ListCertificatesV2Response>
     */
    public CompletableFuture<ListCertificatesV2Response> listCertificatesV2Async(ListCertificatesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listCertificatesV2);
    }

    /**
     * 获取SSL证书列表
     *
     * 获取SSL证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesV2Request 请求对象
     * @return AsyncInvoker<ListCertificatesV2Request, ListCertificatesV2Response>
     */
    public AsyncInvoker<ListCertificatesV2Request, ListCertificatesV2Response> listCertificatesV2AsyncInvoker(
        ListCertificatesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listCertificatesV2, hcClient);
    }

    /**
     * 查看证书详情
     *
     * 查看证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfCertificateV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfCertificateV2Response>
     */
    public CompletableFuture<ShowDetailsOfCertificateV2Response> showDetailsOfCertificateV2Async(
        ShowDetailsOfCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfCertificateV2);
    }

    /**
     * 查看证书详情
     *
     * 查看证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfCertificateV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfCertificateV2Request, ShowDetailsOfCertificateV2Response>
     */
    public AsyncInvoker<ShowDetailsOfCertificateV2Request, ShowDetailsOfCertificateV2Response> showDetailsOfCertificateV2AsyncInvoker(
        ShowDetailsOfCertificateV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfCertificateV2, hcClient);
    }

    /**
     * 修改SSL证书
     *
     * 修改SSL证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateV2Request 请求对象
     * @return CompletableFuture<UpdateCertificateV2Response>
     */
    public CompletableFuture<UpdateCertificateV2Response> updateCertificateV2Async(UpdateCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateCertificateV2);
    }

    /**
     * 修改SSL证书
     *
     * 修改SSL证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateV2Request 请求对象
     * @return AsyncInvoker<UpdateCertificateV2Request, UpdateCertificateV2Response>
     */
    public AsyncInvoker<UpdateCertificateV2Request, UpdateCertificateV2Response> updateCertificateV2AsyncInvoker(
        UpdateCertificateV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateCertificateV2, hcClient);
    }

    /**
     * 添加或更新后端实例
     *
     * 为指定的VPC通道添加后端实例
     * 
     * 如果指定地址的后端实例已存在，则更新对应后端实例信息。如果请求体中包含多个重复地址的后端实例定义，则使用第一个定义。
     * 
     * 引用负载通道类型的负载通道不支持添加或更新后端实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddingBackendInstancesV2Request 请求对象
     * @return CompletableFuture<AddingBackendInstancesV2Response>
     */
    public CompletableFuture<AddingBackendInstancesV2Response> addingBackendInstancesV2Async(
        AddingBackendInstancesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.addingBackendInstancesV2);
    }

    /**
     * 添加或更新后端实例
     *
     * 为指定的VPC通道添加后端实例
     * 
     * 如果指定地址的后端实例已存在，则更新对应后端实例信息。如果请求体中包含多个重复地址的后端实例定义，则使用第一个定义。
     * 
     * 引用负载通道类型的负载通道不支持添加或更新后端实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddingBackendInstancesV2Request 请求对象
     * @return AsyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response>
     */
    public AsyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> addingBackendInstancesV2AsyncInvoker(
        AddingBackendInstancesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.addingBackendInstancesV2, hcClient);
    }

    /**
     * 批量修改后端服务器状态不可用
     *
     * 批量修改后端服务器状态不可用。
     * 
     * 引用负载通道类型的负载通道不支持修改后端服务器状态不可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisableMembersRequest 请求对象
     * @return CompletableFuture<BatchDisableMembersResponse>
     */
    public CompletableFuture<BatchDisableMembersResponse> batchDisableMembersAsync(BatchDisableMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchDisableMembers);
    }

    /**
     * 批量修改后端服务器状态不可用
     *
     * 批量修改后端服务器状态不可用。
     * 
     * 引用负载通道类型的负载通道不支持修改后端服务器状态不可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisableMembersRequest 请求对象
     * @return AsyncInvoker<BatchDisableMembersRequest, BatchDisableMembersResponse>
     */
    public AsyncInvoker<BatchDisableMembersRequest, BatchDisableMembersResponse> batchDisableMembersAsyncInvoker(
        BatchDisableMembersRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.batchDisableMembers, hcClient);
    }

    /**
     * 批量修改后端服务器状态可用
     *
     * 批量修改后端服务器状态可用。
     * 
     * 引用负载通道类型的负载通道不支持修改后端服务器状态可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableMembersRequest 请求对象
     * @return CompletableFuture<BatchEnableMembersResponse>
     */
    public CompletableFuture<BatchEnableMembersResponse> batchEnableMembersAsync(BatchEnableMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchEnableMembers);
    }

    /**
     * 批量修改后端服务器状态可用
     *
     * 批量修改后端服务器状态可用。
     * 
     * 引用负载通道类型的负载通道不支持修改后端服务器状态可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableMembersRequest 请求对象
     * @return AsyncInvoker<BatchEnableMembersRequest, BatchEnableMembersResponse>
     */
    public AsyncInvoker<BatchEnableMembersRequest, BatchEnableMembersResponse> batchEnableMembersAsyncInvoker(
        BatchEnableMembersRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.batchEnableMembers, hcClient);
    }

    /**
     * 添加或更新VPC通道后端服务器组
     *
     * 在APIG中创建VPC通道后端服务器组，VPC通道后端实例可以选择是否关联后端实例服务器组，以便管理后端服务器节点。
     * 
     * 如果指定名称的后端服务器组已存在，则更新对应后端服务器组信息。如果请求体中包含多个重复名称的后端服务器定义，则使用第一个定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMemberGroupRequest 请求对象
     * @return CompletableFuture<CreateMemberGroupResponse>
     */
    public CompletableFuture<CreateMemberGroupResponse> createMemberGroupAsync(CreateMemberGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createMemberGroup);
    }

    /**
     * 添加或更新VPC通道后端服务器组
     *
     * 在APIG中创建VPC通道后端服务器组，VPC通道后端实例可以选择是否关联后端实例服务器组，以便管理后端服务器节点。
     * 
     * 如果指定名称的后端服务器组已存在，则更新对应后端服务器组信息。如果请求体中包含多个重复名称的后端服务器定义，则使用第一个定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMemberGroupRequest 请求对象
     * @return AsyncInvoker<CreateMemberGroupRequest, CreateMemberGroupResponse>
     */
    public AsyncInvoker<CreateMemberGroupRequest, CreateMemberGroupResponse> createMemberGroupAsyncInvoker(
        CreateMemberGroupRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.createMemberGroup, hcClient);
    }

    /**
     * 创建VPC通道
     *
     * 在API网关中创建连接私有VPC资源的通道，并在创建API时将后端节点配置为使用这些VPC通道，以便API网关直接访问私有VPC资源。
     * &gt; 每个用户最多创建30个VPC通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcChannelV2Request 请求对象
     * @return CompletableFuture<CreateVpcChannelV2Response>
     */
    public CompletableFuture<CreateVpcChannelV2Response> createVpcChannelV2Async(CreateVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createVpcChannelV2);
    }

    /**
     * 创建VPC通道
     *
     * 在API网关中创建连接私有VPC资源的通道，并在创建API时将后端节点配置为使用这些VPC通道，以便API网关直接访问私有VPC资源。
     * &gt; 每个用户最多创建30个VPC通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcChannelV2Request 请求对象
     * @return AsyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response>
     */
    public AsyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response> createVpcChannelV2AsyncInvoker(
        CreateVpcChannelV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.createVpcChannelV2, hcClient);
    }

    /**
     * 删除后端实例
     *
     * 删除指定VPC通道中的后端实例
     * 
     * 引用负载通道类型的负载通道不支持删除后端实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackendInstanceV2Request 请求对象
     * @return CompletableFuture<DeleteBackendInstanceV2Response>
     */
    public CompletableFuture<DeleteBackendInstanceV2Response> deleteBackendInstanceV2Async(
        DeleteBackendInstanceV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteBackendInstanceV2);
    }

    /**
     * 删除后端实例
     *
     * 删除指定VPC通道中的后端实例
     * 
     * 引用负载通道类型的负载通道不支持删除后端实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackendInstanceV2Request 请求对象
     * @return AsyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response>
     */
    public AsyncInvoker<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> deleteBackendInstanceV2AsyncInvoker(
        DeleteBackendInstanceV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteBackendInstanceV2, hcClient);
    }

    /**
     * 删除VPC通道后端服务器组
     *
     * 删除指定的VPC通道后端服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMemberGroupRequest 请求对象
     * @return CompletableFuture<DeleteMemberGroupResponse>
     */
    public CompletableFuture<DeleteMemberGroupResponse> deleteMemberGroupAsync(DeleteMemberGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteMemberGroup);
    }

    /**
     * 删除VPC通道后端服务器组
     *
     * 删除指定的VPC通道后端服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMemberGroupRequest 请求对象
     * @return AsyncInvoker<DeleteMemberGroupRequest, DeleteMemberGroupResponse>
     */
    public AsyncInvoker<DeleteMemberGroupRequest, DeleteMemberGroupResponse> deleteMemberGroupAsyncInvoker(
        DeleteMemberGroupRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteMemberGroup, hcClient);
    }

    /**
     * 删除VPC通道
     *
     * 删除指定的VPC通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcChannelV2Request 请求对象
     * @return CompletableFuture<DeleteVpcChannelV2Response>
     */
    public CompletableFuture<DeleteVpcChannelV2Response> deleteVpcChannelV2Async(DeleteVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteVpcChannelV2);
    }

    /**
     * 删除VPC通道
     *
     * 删除指定的VPC通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcChannelV2Request 请求对象
     * @return AsyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response>
     */
    public AsyncInvoker<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> deleteVpcChannelV2AsyncInvoker(
        DeleteVpcChannelV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.deleteVpcChannelV2, hcClient);
    }

    /**
     * 查看后端实例列表
     *
     * 查看指定VPC通道的后端实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackendInstancesV2Request 请求对象
     * @return CompletableFuture<ListBackendInstancesV2Response>
     */
    public CompletableFuture<ListBackendInstancesV2Response> listBackendInstancesV2Async(
        ListBackendInstancesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listBackendInstancesV2);
    }

    /**
     * 查看后端实例列表
     *
     * 查看指定VPC通道的后端实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackendInstancesV2Request 请求对象
     * @return AsyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response>
     */
    public AsyncInvoker<ListBackendInstancesV2Request, ListBackendInstancesV2Response> listBackendInstancesV2AsyncInvoker(
        ListBackendInstancesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listBackendInstancesV2, hcClient);
    }

    /**
     * 查询VPC通道后端云服务组列表
     *
     * 查询VPC通道后端云服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMemberGroupsRequest 请求对象
     * @return CompletableFuture<ListMemberGroupsResponse>
     */
    public CompletableFuture<ListMemberGroupsResponse> listMemberGroupsAsync(ListMemberGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listMemberGroups);
    }

    /**
     * 查询VPC通道后端云服务组列表
     *
     * 查询VPC通道后端云服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMemberGroupsRequest 请求对象
     * @return AsyncInvoker<ListMemberGroupsRequest, ListMemberGroupsResponse>
     */
    public AsyncInvoker<ListMemberGroupsRequest, ListMemberGroupsResponse> listMemberGroupsAsyncInvoker(
        ListMemberGroupsRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.listMemberGroups, hcClient);
    }

    /**
     * 查询VPC通道列表
     *
     * 查看VPC通道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcChannelsV2Request 请求对象
     * @return CompletableFuture<ListVpcChannelsV2Response>
     */
    public CompletableFuture<ListVpcChannelsV2Response> listVpcChannelsV2Async(ListVpcChannelsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listVpcChannelsV2);
    }

    /**
     * 查询VPC通道列表
     *
     * 查看VPC通道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcChannelsV2Request 请求对象
     * @return AsyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response>
     */
    public AsyncInvoker<ListVpcChannelsV2Request, ListVpcChannelsV2Response> listVpcChannelsV2AsyncInvoker(
        ListVpcChannelsV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.listVpcChannelsV2, hcClient);
    }

    /**
     * 查看VPC通道后端服务器组详情
     *
     * 查看指定的VPC通道后端服务器组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfMemberGroupRequest 请求对象
     * @return CompletableFuture<ShowDetailsOfMemberGroupResponse>
     */
    public CompletableFuture<ShowDetailsOfMemberGroupResponse> showDetailsOfMemberGroupAsync(
        ShowDetailsOfMemberGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfMemberGroup);
    }

    /**
     * 查看VPC通道后端服务器组详情
     *
     * 查看指定的VPC通道后端服务器组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfMemberGroupRequest 请求对象
     * @return AsyncInvoker<ShowDetailsOfMemberGroupRequest, ShowDetailsOfMemberGroupResponse>
     */
    public AsyncInvoker<ShowDetailsOfMemberGroupRequest, ShowDetailsOfMemberGroupResponse> showDetailsOfMemberGroupAsyncInvoker(
        ShowDetailsOfMemberGroupRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfMemberGroup, hcClient);
    }

    /**
     * 查看VPC通道详情
     *
     * 查看指定的VPC通道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfVpcChannelV2Request 请求对象
     * @return CompletableFuture<ShowDetailsOfVpcChannelV2Response>
     */
    public CompletableFuture<ShowDetailsOfVpcChannelV2Response> showDetailsOfVpcChannelV2Async(
        ShowDetailsOfVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfVpcChannelV2);
    }

    /**
     * 查看VPC通道详情
     *
     * 查看指定的VPC通道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfVpcChannelV2Request 请求对象
     * @return AsyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response>
     */
    public AsyncInvoker<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> showDetailsOfVpcChannelV2AsyncInvoker(
        ShowDetailsOfVpcChannelV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.showDetailsOfVpcChannelV2, hcClient);
    }

    /**
     * 更新后端实例
     *
     * 更新指定的VPC通道的后端实例。更新时，使用传入的请求参数对对应云服务组的后端实例进行全量覆盖修改。如果未指定修改的云服务器组，则进行全量覆盖。
     * 
     * 引用负载通道类型的负载通道不支持更新后端实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackendInstancesV2Request 请求对象
     * @return CompletableFuture<UpdateBackendInstancesV2Response>
     */
    public CompletableFuture<UpdateBackendInstancesV2Response> updateBackendInstancesV2Async(
        UpdateBackendInstancesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateBackendInstancesV2);
    }

    /**
     * 更新后端实例
     *
     * 更新指定的VPC通道的后端实例。更新时，使用传入的请求参数对对应云服务组的后端实例进行全量覆盖修改。如果未指定修改的云服务器组，则进行全量覆盖。
     * 
     * 引用负载通道类型的负载通道不支持更新后端实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackendInstancesV2Request 请求对象
     * @return AsyncInvoker<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response>
     */
    public AsyncInvoker<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response> updateBackendInstancesV2AsyncInvoker(
        UpdateBackendInstancesV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateBackendInstancesV2, hcClient);
    }

    /**
     * 修改VPC通道健康检查
     *
     * 修改VPC通道健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthCheckRequest 请求对象
     * @return CompletableFuture<UpdateHealthCheckResponse>
     */
    public CompletableFuture<UpdateHealthCheckResponse> updateHealthCheckAsync(UpdateHealthCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateHealthCheck);
    }

    /**
     * 修改VPC通道健康检查
     *
     * 修改VPC通道健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthCheckRequest 请求对象
     * @return AsyncInvoker<UpdateHealthCheckRequest, UpdateHealthCheckResponse>
     */
    public AsyncInvoker<UpdateHealthCheckRequest, UpdateHealthCheckResponse> updateHealthCheckAsyncInvoker(
        UpdateHealthCheckRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.updateHealthCheck, hcClient);
    }

    /**
     * 更新VPC通道后端服务器组
     *
     * 更新指定VPC通道后端服务器组。当负载通道为nacos微服务类型时，不支持修改服务器组权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberGroupRequest 请求对象
     * @return CompletableFuture<UpdateMemberGroupResponse>
     */
    public CompletableFuture<UpdateMemberGroupResponse> updateMemberGroupAsync(UpdateMemberGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateMemberGroup);
    }

    /**
     * 更新VPC通道后端服务器组
     *
     * 更新指定VPC通道后端服务器组。当负载通道为nacos微服务类型时，不支持修改服务器组权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberGroupRequest 请求对象
     * @return AsyncInvoker<UpdateMemberGroupRequest, UpdateMemberGroupResponse>
     */
    public AsyncInvoker<UpdateMemberGroupRequest, UpdateMemberGroupResponse> updateMemberGroupAsyncInvoker(
        UpdateMemberGroupRequest request) {
        return new AsyncInvoker<>(request, ApigMeta.updateMemberGroup, hcClient);
    }

    /**
     * 更新VPC通道
     *
     * 更新指定VPC通道的参数
     * 
     * 使用传入的后端实例列表对VPC通道进行全量覆盖，如果后端实例列表为空，则会全量删除已有的后端实例；
     * 
     * 使用传入的后端服务器组列表对VPC通道进行全量覆盖，如果后端服务器组列表为空，则会全量删除已有的服务器组；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcChannelV2Request 请求对象
     * @return CompletableFuture<UpdateVpcChannelV2Response>
     */
    public CompletableFuture<UpdateVpcChannelV2Response> updateVpcChannelV2Async(UpdateVpcChannelV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateVpcChannelV2);
    }

    /**
     * 更新VPC通道
     *
     * 更新指定VPC通道的参数
     * 
     * 使用传入的后端实例列表对VPC通道进行全量覆盖，如果后端实例列表为空，则会全量删除已有的后端实例；
     * 
     * 使用传入的后端服务器组列表对VPC通道进行全量覆盖，如果后端服务器组列表为空，则会全量删除已有的服务器组；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcChannelV2Request 请求对象
     * @return AsyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response>
     */
    public AsyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> updateVpcChannelV2AsyncInvoker(
        UpdateVpcChannelV2Request request) {
        return new AsyncInvoker<>(request, ApigMeta.updateVpcChannelV2, hcClient);
    }

}
