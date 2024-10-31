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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class ApigClient {

    protected HcClient hcClient;

    public ApigClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ApigClient> newBuilder() {
        ClientBuilder<ApigClient> clientBuilder = new ClientBuilder<>(ApigClient::new);
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
     * @return AcceptOrRejectEndpointConnectionsResponse
     */
    public AcceptOrRejectEndpointConnectionsResponse acceptOrRejectEndpointConnections(
        AcceptOrRejectEndpointConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.acceptOrRejectEndpointConnections);
    }

    /**
     * 接受或拒绝终端节点连接
     *
     * 接受或拒绝实例节点连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptOrRejectEndpointConnectionsRequest 请求对象
     * @return SyncInvoker<AcceptOrRejectEndpointConnectionsRequest, AcceptOrRejectEndpointConnectionsResponse>
     */
    public SyncInvoker<AcceptOrRejectEndpointConnectionsRequest, AcceptOrRejectEndpointConnectionsResponse> acceptOrRejectEndpointConnectionsInvoker(
        AcceptOrRejectEndpointConnectionsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.acceptOrRejectEndpointConnections, hcClient);
    }

    /**
     * 新增实例的自定义入方向端口
     *
     * 新增实例的自定义入方向端口，在同个实例中，一个端口仅能支持一种协议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCustomIngressPortRequest 请求对象
     * @return AddCustomIngressPortResponse
     */
    public AddCustomIngressPortResponse addCustomIngressPort(AddCustomIngressPortRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.addCustomIngressPort);
    }

    /**
     * 新增实例的自定义入方向端口
     *
     * 新增实例的自定义入方向端口，在同个实例中，一个端口仅能支持一种协议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCustomIngressPortRequest 请求对象
     * @return SyncInvoker<AddCustomIngressPortRequest, AddCustomIngressPortResponse>
     */
    public SyncInvoker<AddCustomIngressPortRequest, AddCustomIngressPortResponse> addCustomIngressPortInvoker(
        AddCustomIngressPortRequest request) {
        return new SyncInvoker<>(request, ApigMeta.addCustomIngressPort, hcClient);
    }

    /**
     * 实例更新或绑定EIP
     *
     * 实例更新或绑定EIP(仅当实例为LVS类型时支持)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEipV2Request 请求对象
     * @return AddEipV2Response
     */
    public AddEipV2Response addEipV2(AddEipV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.addEipV2);
    }

    /**
     * 实例更新或绑定EIP
     *
     * 实例更新或绑定EIP(仅当实例为LVS类型时支持)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEipV2Request 请求对象
     * @return SyncInvoker<AddEipV2Request, AddEipV2Response>
     */
    public SyncInvoker<AddEipV2Request, AddEipV2Response> addEipV2Invoker(AddEipV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.addEipV2, hcClient);
    }

    /**
     * 批量添加实例终端节点连接白名单
     *
     * 批量添加实例终端节点连接白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEndpointPermissionsRequest 请求对象
     * @return AddEndpointPermissionsResponse
     */
    public AddEndpointPermissionsResponse addEndpointPermissions(AddEndpointPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.addEndpointPermissions);
    }

    /**
     * 批量添加实例终端节点连接白名单
     *
     * 批量添加实例终端节点连接白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEndpointPermissionsRequest 请求对象
     * @return SyncInvoker<AddEndpointPermissionsRequest, AddEndpointPermissionsResponse>
     */
    public SyncInvoker<AddEndpointPermissionsRequest, AddEndpointPermissionsResponse> addEndpointPermissionsInvoker(
        AddEndpointPermissionsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.addEndpointPermissions, hcClient);
    }

    /**
     * 开启实例公网出口
     *
     * 实例开启公网出口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEngressEipV2Request 请求对象
     * @return AddEngressEipV2Response
     */
    public AddEngressEipV2Response addEngressEipV2(AddEngressEipV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.addEngressEipV2);
    }

    /**
     * 开启实例公网出口
     *
     * 实例开启公网出口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEngressEipV2Request 请求对象
     * @return SyncInvoker<AddEngressEipV2Request, AddEngressEipV2Response>
     */
    public SyncInvoker<AddEngressEipV2Request, AddEngressEipV2Response> addEngressEipV2Invoker(
        AddEngressEipV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.addEngressEipV2, hcClient);
    }

    /**
     * 开启实例公网入口
     *
     * 开启实例开启公网入口，仅当实例为ELB类型时支持
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddIngressEipV2Request 请求对象
     * @return AddIngressEipV2Response
     */
    public AddIngressEipV2Response addIngressEipV2(AddIngressEipV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.addIngressEipV2);
    }

    /**
     * 开启实例公网入口
     *
     * 开启实例开启公网入口，仅当实例为ELB类型时支持
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddIngressEipV2Request 请求对象
     * @return SyncInvoker<AddIngressEipV2Request, AddIngressEipV2Response>
     */
    public SyncInvoker<AddIngressEipV2Request, AddIngressEipV2Response> addIngressEipV2Invoker(
        AddIngressEipV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.addIngressEipV2, hcClient);
    }

    /**
     * 凭据配额绑定凭据列表
     *
     * 凭据配额绑定凭据列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAppsForAppQuotaRequest 请求对象
     * @return AssociateAppsForAppQuotaResponse
     */
    public AssociateAppsForAppQuotaResponse associateAppsForAppQuota(AssociateAppsForAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateAppsForAppQuota);
    }

    /**
     * 凭据配额绑定凭据列表
     *
     * 凭据配额绑定凭据列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAppsForAppQuotaRequest 请求对象
     * @return SyncInvoker<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse>
     */
    public SyncInvoker<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse> associateAppsForAppQuotaInvoker(
        AssociateAppsForAppQuotaRequest request) {
        return new SyncInvoker<>(request, ApigMeta.associateAppsForAppQuota, hcClient);
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
     * @return AssociateCertificateV2Response
     */
    public AssociateCertificateV2Response associateCertificateV2(AssociateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateCertificateV2);
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
     * @return SyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response>
     */
    public SyncInvoker<AssociateCertificateV2Request, AssociateCertificateV2Response> associateCertificateV2Invoker(
        AssociateCertificateV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.associateCertificateV2, hcClient);
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
     * @return AssociateDomainV2Response
     */
    public AssociateDomainV2Response associateDomainV2(AssociateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateDomainV2);
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
     * @return SyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response>
     */
    public SyncInvoker<AssociateDomainV2Request, AssociateDomainV2Response> associateDomainV2Invoker(
        AssociateDomainV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.associateDomainV2, hcClient);
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
     * @return AssociateSignatureKeyV2Response
     */
    public AssociateSignatureKeyV2Response associateSignatureKeyV2(AssociateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateSignatureKeyV2);
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
     * @return SyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response>
     */
    public SyncInvoker<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> associateSignatureKeyV2Invoker(
        AssociateSignatureKeyV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.associateSignatureKeyV2, hcClient);
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
     * @return AttachApiToPluginResponse
     */
    public AttachApiToPluginResponse attachApiToPlugin(AttachApiToPluginRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.attachApiToPlugin);
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
     * @return SyncInvoker<AttachApiToPluginRequest, AttachApiToPluginResponse>
     */
    public SyncInvoker<AttachApiToPluginRequest, AttachApiToPluginResponse> attachApiToPluginInvoker(
        AttachApiToPluginRequest request) {
        return new SyncInvoker<>(request, ApigMeta.attachApiToPlugin, hcClient);
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
     * @return AttachPluginToApiResponse
     */
    public AttachPluginToApiResponse attachPluginToApi(AttachPluginToApiRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.attachPluginToApi);
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
     * @return SyncInvoker<AttachPluginToApiRequest, AttachPluginToApiResponse>
     */
    public SyncInvoker<AttachPluginToApiRequest, AttachPluginToApiResponse> attachPluginToApiInvoker(
        AttachPluginToApiRequest request) {
        return new SyncInvoker<>(request, ApigMeta.attachPluginToApi, hcClient);
    }

    /**
     * 批量添加或删除单个实例的标签
     *
     * 批量添加或删除单个实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteInstanceTagsRequest 请求对象
     * @return BatchCreateOrDeleteInstanceTagsResponse
     */
    public BatchCreateOrDeleteInstanceTagsResponse batchCreateOrDeleteInstanceTags(
        BatchCreateOrDeleteInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.batchCreateOrDeleteInstanceTags);
    }

    /**
     * 批量添加或删除单个实例的标签
     *
     * 批量添加或删除单个实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteInstanceTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateOrDeleteInstanceTagsRequest, BatchCreateOrDeleteInstanceTagsResponse>
     */
    public SyncInvoker<BatchCreateOrDeleteInstanceTagsRequest, BatchCreateOrDeleteInstanceTagsResponse> batchCreateOrDeleteInstanceTagsInvoker(
        BatchCreateOrDeleteInstanceTagsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.batchCreateOrDeleteInstanceTags, hcClient);
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
     * @return CheckAppV2Response
     */
    public CheckAppV2Response checkAppV2(CheckAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.checkAppV2);
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
     * @return SyncInvoker<CheckAppV2Request, CheckAppV2Response>
     */
    public SyncInvoker<CheckAppV2Request, CheckAppV2Response> checkAppV2Invoker(CheckAppV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.checkAppV2, hcClient);
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
     * @return CreateAnAppV2Response
     */
    public CreateAnAppV2Response createAnAppV2(CreateAnAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createAnAppV2);
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
     * @return SyncInvoker<CreateAnAppV2Request, CreateAnAppV2Response>
     */
    public SyncInvoker<CreateAnAppV2Request, CreateAnAppV2Response> createAnAppV2Invoker(CreateAnAppV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.createAnAppV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.createAppCodeAutoV2);
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
        return new SyncInvoker<>(request, ApigMeta.createAppCodeAutoV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.createAppCodeV2);
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
        return new SyncInvoker<>(request, ApigMeta.createAppCodeV2, hcClient);
    }

    /**
     * 创建凭据配额
     *
     * 创建凭据配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppQuotaRequest 请求对象
     * @return CreateAppQuotaResponse
     */
    public CreateAppQuotaResponse createAppQuota(CreateAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createAppQuota);
    }

    /**
     * 创建凭据配额
     *
     * 创建凭据配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppQuotaRequest 请求对象
     * @return SyncInvoker<CreateAppQuotaRequest, CreateAppQuotaResponse>
     */
    public SyncInvoker<CreateAppQuotaRequest, CreateAppQuotaResponse> createAppQuotaInvoker(
        CreateAppQuotaRequest request) {
        return new SyncInvoker<>(request, ApigMeta.createAppQuota, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.createCustomAuthorizerV2);
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
        return new SyncInvoker<>(request, ApigMeta.createCustomAuthorizerV2, hcClient);
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
     * @return CreateEnvironmentV2Response
     */
    public CreateEnvironmentV2Response createEnvironmentV2(CreateEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createEnvironmentV2);
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
     * @return SyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response>
     */
    public SyncInvoker<CreateEnvironmentV2Request, CreateEnvironmentV2Response> createEnvironmentV2Invoker(
        CreateEnvironmentV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.createEnvironmentV2, hcClient);
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
     * @return CreateEnvironmentVariableV2Response
     */
    public CreateEnvironmentVariableV2Response createEnvironmentVariableV2(CreateEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createEnvironmentVariableV2);
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
     * @return SyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response>
     */
    public SyncInvoker<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> createEnvironmentVariableV2Invoker(
        CreateEnvironmentVariableV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.createEnvironmentVariableV2, hcClient);
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
     * @return CreateFeatureV2Response
     */
    public CreateFeatureV2Response createFeatureV2(CreateFeatureV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createFeatureV2);
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
     * @return SyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response>
     */
    public SyncInvoker<CreateFeatureV2Request, CreateFeatureV2Response> createFeatureV2Invoker(
        CreateFeatureV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.createFeatureV2, hcClient);
    }

    /**
     * 创建分组自定义响应
     *
     * 新增分组下自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGatewayResponseV2Request 请求对象
     * @return CreateGatewayResponseV2Response
     */
    public CreateGatewayResponseV2Response createGatewayResponseV2(CreateGatewayResponseV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createGatewayResponseV2);
    }

    /**
     * 创建分组自定义响应
     *
     * 新增分组下自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGatewayResponseV2Request 请求对象
     * @return SyncInvoker<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response>
     */
    public SyncInvoker<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response> createGatewayResponseV2Invoker(
        CreateGatewayResponseV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.createGatewayResponseV2, hcClient);
    }

    /**
     * 创建专享版实例（按需）
     *
     * 创建按需专享版实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceV2Request 请求对象
     * @return CreateInstanceV2Response
     */
    public CreateInstanceV2Response createInstanceV2(CreateInstanceV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createInstanceV2);
    }

    /**
     * 创建专享版实例（按需）
     *
     * 创建按需专享版实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceV2Request 请求对象
     * @return SyncInvoker<CreateInstanceV2Request, CreateInstanceV2Response>
     */
    public SyncInvoker<CreateInstanceV2Request, CreateInstanceV2Response> createInstanceV2Invoker(
        CreateInstanceV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.createInstanceV2, hcClient);
    }

    /**
     * 创建编排规则
     *
     * 创建编排规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrchestrationRequest 请求对象
     * @return CreateOrchestrationResponse
     */
    public CreateOrchestrationResponse createOrchestration(CreateOrchestrationRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createOrchestration);
    }

    /**
     * 创建编排规则
     *
     * 创建编排规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrchestrationRequest 请求对象
     * @return SyncInvoker<CreateOrchestrationRequest, CreateOrchestrationResponse>
     */
    public SyncInvoker<CreateOrchestrationRequest, CreateOrchestrationResponse> createOrchestrationInvoker(
        CreateOrchestrationRequest request) {
        return new SyncInvoker<>(request, ApigMeta.createOrchestration, hcClient);
    }

    /**
     * 创建专享版实例（包周期）
     *
     * 创建包周期专享版实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderRequest 请求对象
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrder(CreateOrderRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createOrder);
    }

    /**
     * 创建专享版实例（包周期）
     *
     * 创建包周期专享版实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderRequest 请求对象
     * @return SyncInvoker<CreateOrderRequest, CreateOrderResponse>
     */
    public SyncInvoker<CreateOrderRequest, CreateOrderResponse> createOrderInvoker(CreateOrderRequest request) {
        return new SyncInvoker<>(request, ApigMeta.createOrder, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.createPlugin);
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
        return new SyncInvoker<>(request, ApigMeta.createPlugin, hcClient);
    }

    /**
     * 按需规格变更
     *
     * 创建按需规格变更订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPayResizeOrderRequest 请求对象
     * @return CreatePostPayResizeOrderResponse
     */
    public CreatePostPayResizeOrderResponse createPostPayResizeOrder(CreatePostPayResizeOrderRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createPostPayResizeOrder);
    }

    /**
     * 按需规格变更
     *
     * 创建按需规格变更订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPayResizeOrderRequest 请求对象
     * @return SyncInvoker<CreatePostPayResizeOrderRequest, CreatePostPayResizeOrderResponse>
     */
    public SyncInvoker<CreatePostPayResizeOrderRequest, CreatePostPayResizeOrderResponse> createPostPayResizeOrderInvoker(
        CreatePostPayResizeOrderRequest request) {
        return new SyncInvoker<>(request, ApigMeta.createPostPayResizeOrder, hcClient);
    }

    /**
     * 创建包周期规格变更订单
     *
     * 创建包周期规格变更订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrepayResizeRequest 请求对象
     * @return CreatePrepayResizeResponse
     */
    public CreatePrepayResizeResponse createPrepayResize(CreatePrepayResizeRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createPrepayResize);
    }

    /**
     * 创建包周期规格变更订单
     *
     * 创建包周期规格变更订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrepayResizeRequest 请求对象
     * @return SyncInvoker<CreatePrepayResizeRequest, CreatePrepayResizeResponse>
     */
    public SyncInvoker<CreatePrepayResizeRequest, CreatePrepayResizeResponse> createPrepayResizeInvoker(
        CreatePrepayResizeRequest request) {
        return new SyncInvoker<>(request, ApigMeta.createPrepayResize, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.createRequestThrottlingPolicyV2);
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
        return new SyncInvoker<>(request, ApigMeta.createRequestThrottlingPolicyV2, hcClient);
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
     * @return CreateSignatureKeyV2Response
     */
    public CreateSignatureKeyV2Response createSignatureKeyV2(CreateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createSignatureKeyV2);
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
     * @return SyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response>
     */
    public SyncInvoker<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> createSignatureKeyV2Invoker(
        CreateSignatureKeyV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.createSignatureKeyV2, hcClient);
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
     * @return CreateSpecialThrottlingConfigurationV2Response
     */
    public CreateSpecialThrottlingConfigurationV2Response createSpecialThrottlingConfigurationV2(
        CreateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createSpecialThrottlingConfigurationV2);
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
     * @return SyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response>
     */
    public SyncInvoker<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2Invoker(
        CreateSpecialThrottlingConfigurationV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.createSpecialThrottlingConfigurationV2, hcClient);
    }

    /**
     * 删除APP的访问控制
     *
     * 删除凭据的访问控制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppAclRequest 请求对象
     * @return DeleteAppAclResponse
     */
    public DeleteAppAclResponse deleteAppAcl(DeleteAppAclRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteAppAcl);
    }

    /**
     * 删除APP的访问控制
     *
     * 删除凭据的访问控制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppAclRequest 请求对象
     * @return SyncInvoker<DeleteAppAclRequest, DeleteAppAclResponse>
     */
    public SyncInvoker<DeleteAppAclRequest, DeleteAppAclResponse> deleteAppAclInvoker(DeleteAppAclRequest request) {
        return new SyncInvoker<>(request, ApigMeta.deleteAppAcl, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteAppCodeV2);
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
        return new SyncInvoker<>(request, ApigMeta.deleteAppCodeV2, hcClient);
    }

    /**
     * 删除凭据配额
     *
     * 删除凭据配额。删除凭据配额时，同时删除凭据配额和凭据的关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppQuotaRequest 请求对象
     * @return DeleteAppQuotaResponse
     */
    public DeleteAppQuotaResponse deleteAppQuota(DeleteAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteAppQuota);
    }

    /**
     * 删除凭据配额
     *
     * 删除凭据配额。删除凭据配额时，同时删除凭据配额和凭据的关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppQuotaRequest 请求对象
     * @return SyncInvoker<DeleteAppQuotaRequest, DeleteAppQuotaResponse>
     */
    public SyncInvoker<DeleteAppQuotaRequest, DeleteAppQuotaResponse> deleteAppQuotaInvoker(
        DeleteAppQuotaRequest request) {
        return new SyncInvoker<>(request, ApigMeta.deleteAppQuota, hcClient);
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
     * @return DeleteAppV2Response
     */
    public DeleteAppV2Response deleteAppV2(DeleteAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteAppV2);
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
     * @return SyncInvoker<DeleteAppV2Request, DeleteAppV2Response>
     */
    public SyncInvoker<DeleteAppV2Request, DeleteAppV2Response> deleteAppV2Invoker(DeleteAppV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.deleteAppV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteCustomAuthorizerV2);
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
        return new SyncInvoker<>(request, ApigMeta.deleteCustomAuthorizerV2, hcClient);
    }

    /**
     * 删除实例指定的自定义入方向端口
     *
     * 删除实例指定的自定义入方向端口，不包含默认端口80和443。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomIngressPortRequest 请求对象
     * @return DeleteCustomIngressPortResponse
     */
    public DeleteCustomIngressPortResponse deleteCustomIngressPort(DeleteCustomIngressPortRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteCustomIngressPort);
    }

    /**
     * 删除实例指定的自定义入方向端口
     *
     * 删除实例指定的自定义入方向端口，不包含默认端口80和443。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomIngressPortRequest 请求对象
     * @return SyncInvoker<DeleteCustomIngressPortRequest, DeleteCustomIngressPortResponse>
     */
    public SyncInvoker<DeleteCustomIngressPortRequest, DeleteCustomIngressPortResponse> deleteCustomIngressPortInvoker(
        DeleteCustomIngressPortRequest request) {
        return new SyncInvoker<>(request, ApigMeta.deleteCustomIngressPort, hcClient);
    }

    /**
     * 批量删除实例终端节点连接白名单
     *
     * 批量删除实例终端节点连接白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointPermissionsRequest 请求对象
     * @return DeleteEndpointPermissionsResponse
     */
    public DeleteEndpointPermissionsResponse deleteEndpointPermissions(DeleteEndpointPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteEndpointPermissions);
    }

    /**
     * 批量删除实例终端节点连接白名单
     *
     * 批量删除实例终端节点连接白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointPermissionsRequest 请求对象
     * @return SyncInvoker<DeleteEndpointPermissionsRequest, DeleteEndpointPermissionsResponse>
     */
    public SyncInvoker<DeleteEndpointPermissionsRequest, DeleteEndpointPermissionsResponse> deleteEndpointPermissionsInvoker(
        DeleteEndpointPermissionsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.deleteEndpointPermissions, hcClient);
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
     * @return DeleteEnvironmentV2Response
     */
    public DeleteEnvironmentV2Response deleteEnvironmentV2(DeleteEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteEnvironmentV2);
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
     * @return SyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response>
     */
    public SyncInvoker<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> deleteEnvironmentV2Invoker(
        DeleteEnvironmentV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.deleteEnvironmentV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteEnvironmentVariableV2);
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
        return new SyncInvoker<>(request, ApigMeta.deleteEnvironmentVariableV2, hcClient);
    }

    /**
     * 删除分组指定错误类型的自定义响应配置
     *
     * 删除分组指定错误类型的自定义响应配置，还原为使用默认值的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGatewayResponseTypeV2Request 请求对象
     * @return DeleteGatewayResponseTypeV2Response
     */
    public DeleteGatewayResponseTypeV2Response deleteGatewayResponseTypeV2(DeleteGatewayResponseTypeV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteGatewayResponseTypeV2);
    }

    /**
     * 删除分组指定错误类型的自定义响应配置
     *
     * 删除分组指定错误类型的自定义响应配置，还原为使用默认值的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGatewayResponseTypeV2Request 请求对象
     * @return SyncInvoker<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response>
     */
    public SyncInvoker<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response> deleteGatewayResponseTypeV2Invoker(
        DeleteGatewayResponseTypeV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.deleteGatewayResponseTypeV2, hcClient);
    }

    /**
     * 删除分组自定义响应
     *
     * 删除分组自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGatewayResponseV2Request 请求对象
     * @return DeleteGatewayResponseV2Response
     */
    public DeleteGatewayResponseV2Response deleteGatewayResponseV2(DeleteGatewayResponseV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteGatewayResponseV2);
    }

    /**
     * 删除分组自定义响应
     *
     * 删除分组自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGatewayResponseV2Request 请求对象
     * @return SyncInvoker<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response>
     */
    public SyncInvoker<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response> deleteGatewayResponseV2Invoker(
        DeleteGatewayResponseV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.deleteGatewayResponseV2, hcClient);
    }

    /**
     * 删除专享版实例
     *
     * 删除专享版实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesV2Request 请求对象
     * @return DeleteInstancesV2Response
     */
    public DeleteInstancesV2Response deleteInstancesV2(DeleteInstancesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteInstancesV2);
    }

    /**
     * 删除专享版实例
     *
     * 删除专享版实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesV2Request 请求对象
     * @return SyncInvoker<DeleteInstancesV2Request, DeleteInstancesV2Response>
     */
    public SyncInvoker<DeleteInstancesV2Request, DeleteInstancesV2Response> deleteInstancesV2Invoker(
        DeleteInstancesV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.deleteInstancesV2, hcClient);
    }

    /**
     * 删除编排规则
     *
     * 删除编排规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrchestrationRequest 请求对象
     * @return DeleteOrchestrationResponse
     */
    public DeleteOrchestrationResponse deleteOrchestration(DeleteOrchestrationRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteOrchestration);
    }

    /**
     * 删除编排规则
     *
     * 删除编排规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrchestrationRequest 请求对象
     * @return SyncInvoker<DeleteOrchestrationRequest, DeleteOrchestrationResponse>
     */
    public SyncInvoker<DeleteOrchestrationRequest, DeleteOrchestrationResponse> deleteOrchestrationInvoker(
        DeleteOrchestrationRequest request) {
        return new SyncInvoker<>(request, ApigMeta.deleteOrchestration, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.deletePlugin);
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
        return new SyncInvoker<>(request, ApigMeta.deletePlugin, hcClient);
    }

    /**
     * 删除流控策略
     *
     * 删除指定的流控策略，以及该流控策略与API的所有绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return DeleteRequestThrottlingPolicyV2Response
     */
    public DeleteRequestThrottlingPolicyV2Response deleteRequestThrottlingPolicyV2(
        DeleteRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteRequestThrottlingPolicyV2);
    }

    /**
     * 删除流控策略
     *
     * 删除指定的流控策略，以及该流控策略与API的所有绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRequestThrottlingPolicyV2Request 请求对象
     * @return SyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response>
     */
    public SyncInvoker<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2Invoker(
        DeleteRequestThrottlingPolicyV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.deleteRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 删除签名密钥
     *
     * 删除指定的签名密钥，删除签名密钥时，其配置的绑定关系会一并删除，相应的签名密钥会失效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSignatureKeyV2Request 请求对象
     * @return DeleteSignatureKeyV2Response
     */
    public DeleteSignatureKeyV2Response deleteSignatureKeyV2(DeleteSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteSignatureKeyV2);
    }

    /**
     * 删除签名密钥
     *
     * 删除指定的签名密钥，删除签名密钥时，其配置的绑定关系会一并删除，相应的签名密钥会失效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSignatureKeyV2Request 请求对象
     * @return SyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response>
     */
    public SyncInvoker<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> deleteSignatureKeyV2Invoker(
        DeleteSignatureKeyV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.deleteSignatureKeyV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteSpecialThrottlingConfigurationV2);
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
        return new SyncInvoker<>(request, ApigMeta.deleteSpecialThrottlingConfigurationV2, hcClient);
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
     * @return DetachApiFromPluginResponse
     */
    public DetachApiFromPluginResponse detachApiFromPlugin(DetachApiFromPluginRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.detachApiFromPlugin);
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
     * @return SyncInvoker<DetachApiFromPluginRequest, DetachApiFromPluginResponse>
     */
    public SyncInvoker<DetachApiFromPluginRequest, DetachApiFromPluginResponse> detachApiFromPluginInvoker(
        DetachApiFromPluginRequest request) {
        return new SyncInvoker<>(request, ApigMeta.detachApiFromPlugin, hcClient);
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
     * @return DetachPluginFromApiResponse
     */
    public DetachPluginFromApiResponse detachPluginFromApi(DetachPluginFromApiRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.detachPluginFromApi);
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
     * @return SyncInvoker<DetachPluginFromApiRequest, DetachPluginFromApiResponse>
     */
    public SyncInvoker<DetachPluginFromApiRequest, DetachPluginFromApiResponse> detachPluginFromApiInvoker(
        DetachPluginFromApiRequest request) {
        return new SyncInvoker<>(request, ApigMeta.detachPluginFromApi, hcClient);
    }

    /**
     * 解除凭据配额和凭据的绑定
     *
     * 解除凭据配额和凭据的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAppQuotaWithAppRequest 请求对象
     * @return DisassociateAppQuotaWithAppResponse
     */
    public DisassociateAppQuotaWithAppResponse disassociateAppQuotaWithApp(DisassociateAppQuotaWithAppRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateAppQuotaWithApp);
    }

    /**
     * 解除凭据配额和凭据的绑定
     *
     * 解除凭据配额和凭据的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAppQuotaWithAppRequest 请求对象
     * @return SyncInvoker<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse>
     */
    public SyncInvoker<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse> disassociateAppQuotaWithAppInvoker(
        DisassociateAppQuotaWithAppRequest request) {
        return new SyncInvoker<>(request, ApigMeta.disassociateAppQuotaWithApp, hcClient);
    }

    /**
     * 删除域名证书
     *
     * 如果域名证书不再需要或者已过期，则可以删除证书内容。在使用自定义入方向端口的特性时，相同的域名会同时解绑证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateCertificateV2Request 请求对象
     * @return DisassociateCertificateV2Response
     */
    public DisassociateCertificateV2Response disassociateCertificateV2(DisassociateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateCertificateV2);
    }

    /**
     * 删除域名证书
     *
     * 如果域名证书不再需要或者已过期，则可以删除证书内容。在使用自定义入方向端口的特性时，相同的域名会同时解绑证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateCertificateV2Request 请求对象
     * @return SyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response>
     */
    public SyncInvoker<DisassociateCertificateV2Request, DisassociateCertificateV2Response> disassociateCertificateV2Invoker(
        DisassociateCertificateV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.disassociateCertificateV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateDomainV2);
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
        return new SyncInvoker<>(request, ApigMeta.disassociateDomainV2, hcClient);
    }

    /**
     * 解除API与签名密钥的绑定关系
     *
     * 解除API与签名密钥的绑定关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateSignatureKeyV2Request 请求对象
     * @return DisassociateSignatureKeyV2Response
     */
    public DisassociateSignatureKeyV2Response disassociateSignatureKeyV2(DisassociateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateSignatureKeyV2);
    }

    /**
     * 解除API与签名密钥的绑定关系
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
        return new SyncInvoker<>(request, ApigMeta.disassociateSignatureKeyV2, hcClient);
    }

    /**
     * 异步导出API
     *
     * 导出分组下API的定义信息。导出文件内容符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportApiDefinitionsAsyncRequest 请求对象
     * @return ExportApiDefinitionsAsyncResponse
     */
    public ExportApiDefinitionsAsyncResponse exportApiDefinitionsAsync(ExportApiDefinitionsAsyncRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.exportApiDefinitionsAsync);
    }

    /**
     * 异步导出API
     *
     * 导出分组下API的定义信息。导出文件内容符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportApiDefinitionsAsyncRequest 请求对象
     * @return SyncInvoker<ExportApiDefinitionsAsyncRequest, ExportApiDefinitionsAsyncResponse>
     */
    public SyncInvoker<ExportApiDefinitionsAsyncRequest, ExportApiDefinitionsAsyncResponse> exportApiDefinitionsAsyncInvoker(
        ExportApiDefinitionsAsyncRequest request) {
        return new SyncInvoker<>(request, ApigMeta.exportApiDefinitionsAsync, hcClient);
    }

    /**
     * 异步导入API
     *
     * 导入API。导入文件内容需要符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportApiDefinitionsAsyncRequest 请求对象
     * @return ImportApiDefinitionsAsyncResponse
     */
    public ImportApiDefinitionsAsyncResponse importApiDefinitionsAsync(ImportApiDefinitionsAsyncRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.importApiDefinitionsAsync);
    }

    /**
     * 异步导入API
     *
     * 导入API。导入文件内容需要符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportApiDefinitionsAsyncRequest 请求对象
     * @return SyncInvoker<ImportApiDefinitionsAsyncRequest, ImportApiDefinitionsAsyncResponse>
     */
    public SyncInvoker<ImportApiDefinitionsAsyncRequest, ImportApiDefinitionsAsyncResponse> importApiDefinitionsAsyncInvoker(
        ImportApiDefinitionsAsyncRequest request) {
        return new SyncInvoker<>(request, ApigMeta.importApiDefinitionsAsync, hcClient);
    }

    /**
     * 导入微服务
     *
     * 导入微服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportMicroserviceRequest 请求对象
     * @return ImportMicroserviceResponse
     */
    public ImportMicroserviceResponse importMicroservice(ImportMicroserviceRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.importMicroservice);
    }

    /**
     * 导入微服务
     *
     * 导入微服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportMicroserviceRequest 请求对象
     * @return SyncInvoker<ImportMicroserviceRequest, ImportMicroserviceResponse>
     */
    public SyncInvoker<ImportMicroserviceRequest, ImportMicroserviceResponse> importMicroserviceInvoker(
        ImportMicroserviceRequest request) {
        return new SyncInvoker<>(request, ApigMeta.importMicroservice, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiAttachablePlugins);
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
        return new SyncInvoker<>(request, ApigMeta.listApiAttachablePlugins, hcClient);
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
     * @return ListApiAttachedPluginsResponse
     */
    public ListApiAttachedPluginsResponse listApiAttachedPlugins(ListApiAttachedPluginsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiAttachedPlugins);
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
     * @return SyncInvoker<ListApiAttachedPluginsRequest, ListApiAttachedPluginsResponse>
     */
    public SyncInvoker<ListApiAttachedPluginsRequest, ListApiAttachedPluginsResponse> listApiAttachedPluginsInvoker(
        ListApiAttachedPluginsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listApiAttachedPlugins, hcClient);
    }

    /**
     * 查询API分组概况
     *
     * 查询租户名下的API分组概况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiGroupsQuantitiesV2Request 请求对象
     * @return ListApiGroupsQuantitiesV2Response
     */
    public ListApiGroupsQuantitiesV2Response listApiGroupsQuantitiesV2(ListApiGroupsQuantitiesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiGroupsQuantitiesV2);
    }

    /**
     * 查询API分组概况
     *
     * 查询租户名下的API分组概况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiGroupsQuantitiesV2Request 请求对象
     * @return SyncInvoker<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response>
     */
    public SyncInvoker<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> listApiGroupsQuantitiesV2Invoker(
        ListApiGroupsQuantitiesV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.listApiGroupsQuantitiesV2, hcClient);
    }

    /**
     * 查询API概况
     *
     * 查询租户名下的API概况：已发布到RELEASE环境的API个数，未发布到RELEASE环境的API个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiQuantitiesV2Request 请求对象
     * @return ListApiQuantitiesV2Response
     */
    public ListApiQuantitiesV2Response listApiQuantitiesV2(ListApiQuantitiesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiQuantitiesV2);
    }

    /**
     * 查询API概况
     *
     * 查询租户名下的API概况：已发布到RELEASE环境的API个数，未发布到RELEASE环境的API个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiQuantitiesV2Request 请求对象
     * @return SyncInvoker<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response>
     */
    public SyncInvoker<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> listApiQuantitiesV2Invoker(
        ListApiQuantitiesV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.listApiQuantitiesV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisBindedToSignatureKeyV2);
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
        return new SyncInvoker<>(request, ApigMeta.listApisBindedToSignatureKeyV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisNotBoundWithSignatureKeyV2);
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
        return new SyncInvoker<>(request, ApigMeta.listApisNotBoundWithSignatureKeyV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppCodesV2);
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
        return new SyncInvoker<>(request, ApigMeta.listAppCodesV2, hcClient);
    }

    /**
     * 查询APP概况
     *
     * 查询租户名下的APP概况：已进行API访问授权的APP个数，未进行API访问授权的APP个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuantitiesV2Request 请求对象
     * @return ListAppQuantitiesV2Response
     */
    public ListAppQuantitiesV2Response listAppQuantitiesV2(ListAppQuantitiesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppQuantitiesV2);
    }

    /**
     * 查询APP概况
     *
     * 查询租户名下的APP概况：已进行API访问授权的APP个数，未进行API访问授权的APP个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuantitiesV2Request 请求对象
     * @return SyncInvoker<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response>
     */
    public SyncInvoker<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> listAppQuantitiesV2Invoker(
        ListAppQuantitiesV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.listAppQuantitiesV2, hcClient);
    }

    /**
     * 查询凭据配额可绑定的凭据列表
     *
     * 查询凭据配额可绑定的凭据列表。支持按凭据名称模糊搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotaBindableAppsRequest 请求对象
     * @return ListAppQuotaBindableAppsResponse
     */
    public ListAppQuotaBindableAppsResponse listAppQuotaBindableApps(ListAppQuotaBindableAppsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppQuotaBindableApps);
    }

    /**
     * 查询凭据配额可绑定的凭据列表
     *
     * 查询凭据配额可绑定的凭据列表。支持按凭据名称模糊搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotaBindableAppsRequest 请求对象
     * @return SyncInvoker<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse>
     */
    public SyncInvoker<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse> listAppQuotaBindableAppsInvoker(
        ListAppQuotaBindableAppsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listAppQuotaBindableApps, hcClient);
    }

    /**
     * 查询凭据配额已绑定的凭据列表
     *
     * 查询凭据配额已绑定的凭据列表。支持按凭据名称模糊匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotaBoundAppsRequest 请求对象
     * @return ListAppQuotaBoundAppsResponse
     */
    public ListAppQuotaBoundAppsResponse listAppQuotaBoundApps(ListAppQuotaBoundAppsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppQuotaBoundApps);
    }

    /**
     * 查询凭据配额已绑定的凭据列表
     *
     * 查询凭据配额已绑定的凭据列表。支持按凭据名称模糊匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotaBoundAppsRequest 请求对象
     * @return SyncInvoker<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse>
     */
    public SyncInvoker<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse> listAppQuotaBoundAppsInvoker(
        ListAppQuotaBoundAppsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listAppQuotaBoundApps, hcClient);
    }

    /**
     * 获取凭据配额列表
     *
     * 获取凭据配额列表。支持根据名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotasRequest 请求对象
     * @return ListAppQuotasResponse
     */
    public ListAppQuotasResponse listAppQuotas(ListAppQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppQuotas);
    }

    /**
     * 获取凭据配额列表
     *
     * 获取凭据配额列表。支持根据名称模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppQuotasRequest 请求对象
     * @return SyncInvoker<ListAppQuotasRequest, ListAppQuotasResponse>
     */
    public SyncInvoker<ListAppQuotasRequest, ListAppQuotasResponse> listAppQuotasInvoker(ListAppQuotasRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listAppQuotas, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppsV2);
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
        return new SyncInvoker<>(request, ApigMeta.listAppsV2, hcClient);
    }

    /**
     * 查看可用区信息
     *
     * 查看可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesV2Request 请求对象
     * @return ListAvailableZonesV2Response
     */
    public ListAvailableZonesV2Response listAvailableZonesV2(ListAvailableZonesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAvailableZonesV2);
    }

    /**
     * 查看可用区信息
     *
     * 查看可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesV2Request 请求对象
     * @return SyncInvoker<ListAvailableZonesV2Request, ListAvailableZonesV2Response>
     */
    public SyncInvoker<ListAvailableZonesV2Request, ListAvailableZonesV2Response> listAvailableZonesV2Invoker(
        ListAvailableZonesV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.listAvailableZonesV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listCustomAuthorizersV2);
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
        return new SyncInvoker<>(request, ApigMeta.listCustomAuthorizersV2, hcClient);
    }

    /**
     * 查询实例指定的自定义入方向端口绑定的域名信息
     *
     * 查询实例指定的自定义入方向端口绑定的域名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomIngressPortDomainsRequest 请求对象
     * @return ListCustomIngressPortDomainsResponse
     */
    public ListCustomIngressPortDomainsResponse listCustomIngressPortDomains(
        ListCustomIngressPortDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listCustomIngressPortDomains);
    }

    /**
     * 查询实例指定的自定义入方向端口绑定的域名信息
     *
     * 查询实例指定的自定义入方向端口绑定的域名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomIngressPortDomainsRequest 请求对象
     * @return SyncInvoker<ListCustomIngressPortDomainsRequest, ListCustomIngressPortDomainsResponse>
     */
    public SyncInvoker<ListCustomIngressPortDomainsRequest, ListCustomIngressPortDomainsResponse> listCustomIngressPortDomainsInvoker(
        ListCustomIngressPortDomainsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listCustomIngressPortDomains, hcClient);
    }

    /**
     * 查询实例的自定义入方向端口列表
     *
     * 查询实例的自定义入方向端口列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomIngressPortsRequest 请求对象
     * @return ListCustomIngressPortsResponse
     */
    public ListCustomIngressPortsResponse listCustomIngressPorts(ListCustomIngressPortsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listCustomIngressPorts);
    }

    /**
     * 查询实例的自定义入方向端口列表
     *
     * 查询实例的自定义入方向端口列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomIngressPortsRequest 请求对象
     * @return SyncInvoker<ListCustomIngressPortsRequest, ListCustomIngressPortsResponse>
     */
    public SyncInvoker<ListCustomIngressPortsRequest, ListCustomIngressPortsResponse> listCustomIngressPortsInvoker(
        ListCustomIngressPortsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listCustomIngressPorts, hcClient);
    }

    /**
     * 查询实例终端节点连接列表
     *
     * 查询实例终端节点连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointConnectionsRequest 请求对象
     * @return ListEndpointConnectionsResponse
     */
    public ListEndpointConnectionsResponse listEndpointConnections(ListEndpointConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listEndpointConnections);
    }

    /**
     * 查询实例终端节点连接列表
     *
     * 查询实例终端节点连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointConnectionsRequest 请求对象
     * @return SyncInvoker<ListEndpointConnectionsRequest, ListEndpointConnectionsResponse>
     */
    public SyncInvoker<ListEndpointConnectionsRequest, ListEndpointConnectionsResponse> listEndpointConnectionsInvoker(
        ListEndpointConnectionsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listEndpointConnections, hcClient);
    }

    /**
     * 查询实例的终端节点服务的白名单列表
     *
     * 查询当前实例终端节点服务的白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointPermissionsRequest 请求对象
     * @return ListEndpointPermissionsResponse
     */
    public ListEndpointPermissionsResponse listEndpointPermissions(ListEndpointPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listEndpointPermissions);
    }

    /**
     * 查询实例的终端节点服务的白名单列表
     *
     * 查询当前实例终端节点服务的白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointPermissionsRequest 请求对象
     * @return SyncInvoker<ListEndpointPermissionsRequest, ListEndpointPermissionsResponse>
     */
    public SyncInvoker<ListEndpointPermissionsRequest, ListEndpointPermissionsResponse> listEndpointPermissionsInvoker(
        ListEndpointPermissionsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listEndpointPermissions, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listEnvironmentVariablesV2);
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
        return new SyncInvoker<>(request, ApigMeta.listEnvironmentVariablesV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listEnvironmentsV2);
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
        return new SyncInvoker<>(request, ApigMeta.listEnvironmentsV2, hcClient);
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
     * @return ListFeaturesV2Response
     */
    public ListFeaturesV2Response listFeaturesV2(ListFeaturesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listFeaturesV2);
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
     * @return SyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response>
     */
    public SyncInvoker<ListFeaturesV2Request, ListFeaturesV2Response> listFeaturesV2Invoker(
        ListFeaturesV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.listFeaturesV2, hcClient);
    }

    /**
     * 查询分组自定义响应列表
     *
     * 查询分组自定义响应列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGatewayResponsesV2Request 请求对象
     * @return ListGatewayResponsesV2Response
     */
    public ListGatewayResponsesV2Response listGatewayResponsesV2(ListGatewayResponsesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listGatewayResponsesV2);
    }

    /**
     * 查询分组自定义响应列表
     *
     * 查询分组自定义响应列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGatewayResponsesV2Request 请求对象
     * @return SyncInvoker<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response>
     */
    public SyncInvoker<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response> listGatewayResponsesV2Invoker(
        ListGatewayResponsesV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.listGatewayResponsesV2, hcClient);
    }

    /**
     * 查询租户实例配置列表
     *
     * 查询租户实例配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConfigsV2Request 请求对象
     * @return ListInstanceConfigsV2Response
     */
    public ListInstanceConfigsV2Response listInstanceConfigsV2(ListInstanceConfigsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listInstanceConfigsV2);
    }

    /**
     * 查询租户实例配置列表
     *
     * 查询租户实例配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConfigsV2Request 请求对象
     * @return SyncInvoker<ListInstanceConfigsV2Request, ListInstanceConfigsV2Response>
     */
    public SyncInvoker<ListInstanceConfigsV2Request, ListInstanceConfigsV2Response> listInstanceConfigsV2Invoker(
        ListInstanceConfigsV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.listInstanceConfigsV2, hcClient);
    }

    /**
     * 查询实例支持的特性列表
     *
     * 查询实例支持的特性列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceFeaturesRequest 请求对象
     * @return ListInstanceFeaturesResponse
     */
    public ListInstanceFeaturesResponse listInstanceFeatures(ListInstanceFeaturesRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listInstanceFeatures);
    }

    /**
     * 查询实例支持的特性列表
     *
     * 查询实例支持的特性列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceFeaturesRequest 请求对象
     * @return SyncInvoker<ListInstanceFeaturesRequest, ListInstanceFeaturesResponse>
     */
    public SyncInvoker<ListInstanceFeaturesRequest, ListInstanceFeaturesResponse> listInstanceFeaturesInvoker(
        ListInstanceFeaturesRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listInstanceFeatures, hcClient);
    }

    /**
     * 查询单个实例标签
     *
     * 查询单个实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return ListInstanceTagsResponse
     */
    public ListInstanceTagsResponse listInstanceTags(ListInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listInstanceTags);
    }

    /**
     * 查询单个实例标签
     *
     * 查询单个实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsInvoker(
        ListInstanceTagsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listInstanceTags, hcClient);
    }

    /**
     * 通过标签查询实例列表
     *
     * 通过标签查询实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByTagsRequest 请求对象
     * @return ListInstancesByTagsResponse
     */
    public ListInstancesByTagsResponse listInstancesByTags(ListInstancesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listInstancesByTags);
    }

    /**
     * 通过标签查询实例列表
     *
     * 通过标签查询实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByTagsRequest 请求对象
     * @return SyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>
     */
    public SyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTagsInvoker(
        ListInstancesByTagsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listInstancesByTags, hcClient);
    }

    /**
     * 查询专享版实例列表
     *
     * 查询专享版实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesV2Request 请求对象
     * @return ListInstancesV2Response
     */
    public ListInstancesV2Response listInstancesV2(ListInstancesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listInstancesV2);
    }

    /**
     * 查询专享版实例列表
     *
     * 查询专享版实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesV2Request 请求对象
     * @return SyncInvoker<ListInstancesV2Request, ListInstancesV2Response>
     */
    public SyncInvoker<ListInstancesV2Request, ListInstancesV2Response> listInstancesV2Invoker(
        ListInstancesV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.listInstancesV2, hcClient);
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
     * @return ListLatelyApiStatisticsV2Response
     */
    public ListLatelyApiStatisticsV2Response listLatelyApiStatisticsV2(ListLatelyApiStatisticsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listLatelyApiStatisticsV2);
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
     * @return SyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response>
     */
    public SyncInvoker<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> listLatelyApiStatisticsV2Invoker(
        ListLatelyApiStatisticsV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.listLatelyApiStatisticsV2, hcClient);
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
     * @return ListLatelyGroupStatisticsV2Response
     */
    public ListLatelyGroupStatisticsV2Response listLatelyGroupStatisticsV2(ListLatelyGroupStatisticsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listLatelyGroupStatisticsV2);
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
     * @return SyncInvoker<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response>
     */
    public SyncInvoker<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response> listLatelyGroupStatisticsV2Invoker(
        ListLatelyGroupStatisticsV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.listLatelyGroupStatisticsV2, hcClient);
    }

    /**
     * 查询监控数据
     *
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricDataRequest 请求对象
     * @return ListMetricDataResponse
     */
    public ListMetricDataResponse listMetricData(ListMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listMetricData);
    }

    /**
     * 查询监控数据
     *
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricDataRequest 请求对象
     * @return SyncInvoker<ListMetricDataRequest, ListMetricDataResponse>
     */
    public SyncInvoker<ListMetricDataRequest, ListMetricDataResponse> listMetricDataInvoker(
        ListMetricDataRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listMetricData, hcClient);
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
     * @return ListOrchestrationAttachedApisResponse
     */
    public ListOrchestrationAttachedApisResponse listOrchestrationAttachedApis(
        ListOrchestrationAttachedApisRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listOrchestrationAttachedApis);
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
     * @return SyncInvoker<ListOrchestrationAttachedApisRequest, ListOrchestrationAttachedApisResponse>
     */
    public SyncInvoker<ListOrchestrationAttachedApisRequest, ListOrchestrationAttachedApisResponse> listOrchestrationAttachedApisInvoker(
        ListOrchestrationAttachedApisRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listOrchestrationAttachedApis, hcClient);
    }

    /**
     * 查看编排规则列表
     *
     * 查看编排规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrchestrationsRequest 请求对象
     * @return ListOrchestrationsResponse
     */
    public ListOrchestrationsResponse listOrchestrations(ListOrchestrationsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listOrchestrations);
    }

    /**
     * 查看编排规则列表
     *
     * 查看编排规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrchestrationsRequest 请求对象
     * @return SyncInvoker<ListOrchestrationsRequest, ListOrchestrationsResponse>
     */
    public SyncInvoker<ListOrchestrationsRequest, ListOrchestrationsResponse> listOrchestrationsInvoker(
        ListOrchestrationsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listOrchestrations, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listPluginAttachableApis);
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
        return new SyncInvoker<>(request, ApigMeta.listPluginAttachableApis, hcClient);
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
     * @return ListPluginAttachedApisResponse
     */
    public ListPluginAttachedApisResponse listPluginAttachedApis(ListPluginAttachedApisRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listPluginAttachedApis);
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
     * @return SyncInvoker<ListPluginAttachedApisRequest, ListPluginAttachedApisResponse>
     */
    public SyncInvoker<ListPluginAttachedApisRequest, ListPluginAttachedApisResponse> listPluginAttachedApisInvoker(
        ListPluginAttachedApisRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listPluginAttachedApis, hcClient);
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
     * @return ListPluginsResponse
     */
    public ListPluginsResponse listPlugins(ListPluginsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listPlugins);
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
     * @return SyncInvoker<ListPluginsRequest, ListPluginsResponse>
     */
    public SyncInvoker<ListPluginsRequest, ListPluginsResponse> listPluginsInvoker(ListPluginsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listPlugins, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listProjectCofigsV2);
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
        return new SyncInvoker<>(request, ApigMeta.listProjectCofigsV2, hcClient);
    }

    /**
     * 查询项目下所有实例标签
     *
     * 查询项目下所有实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectInstanceTagsRequest 请求对象
     * @return ListProjectInstanceTagsResponse
     */
    public ListProjectInstanceTagsResponse listProjectInstanceTags(ListProjectInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listProjectInstanceTags);
    }

    /**
     * 查询项目下所有实例标签
     *
     * 查询项目下所有实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectInstanceTagsRequest 请求对象
     * @return SyncInvoker<ListProjectInstanceTagsRequest, ListProjectInstanceTagsResponse>
     */
    public SyncInvoker<ListProjectInstanceTagsRequest, ListProjectInstanceTagsResponse> listProjectInstanceTagsInvoker(
        ListProjectInstanceTagsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.listProjectInstanceTags, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listRequestThrottlingPolicyV2);
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
        return new SyncInvoker<>(request, ApigMeta.listRequestThrottlingPolicyV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listSignatureKeysBindedToApiV2);
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
        return new SyncInvoker<>(request, ApigMeta.listSignatureKeysBindedToApiV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listSignatureKeysV2);
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
        return new SyncInvoker<>(request, ApigMeta.listSignatureKeysV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listSpecialThrottlingConfigurationsV2);
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
        return new SyncInvoker<>(request, ApigMeta.listSpecialThrottlingConfigurationsV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listTagsV2);
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
        return new SyncInvoker<>(request, ApigMeta.listTagsV2, hcClient);
    }

    /**
     * 实例解绑EIP
     *
     * 实例解绑EIP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveEipV2Request 请求对象
     * @return RemoveEipV2Response
     */
    public RemoveEipV2Response removeEipV2(RemoveEipV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.removeEipV2);
    }

    /**
     * 实例解绑EIP
     *
     * 实例解绑EIP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveEipV2Request 请求对象
     * @return SyncInvoker<RemoveEipV2Request, RemoveEipV2Response>
     */
    public SyncInvoker<RemoveEipV2Request, RemoveEipV2Response> removeEipV2Invoker(RemoveEipV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.removeEipV2, hcClient);
    }

    /**
     * 关闭实例公网出口
     *
     * 关闭实例公网出口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveEngressEipV2Request 请求对象
     * @return RemoveEngressEipV2Response
     */
    public RemoveEngressEipV2Response removeEngressEipV2(RemoveEngressEipV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.removeEngressEipV2);
    }

    /**
     * 关闭实例公网出口
     *
     * 关闭实例公网出口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveEngressEipV2Request 请求对象
     * @return SyncInvoker<RemoveEngressEipV2Request, RemoveEngressEipV2Response>
     */
    public SyncInvoker<RemoveEngressEipV2Request, RemoveEngressEipV2Response> removeEngressEipV2Invoker(
        RemoveEngressEipV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.removeEngressEipV2, hcClient);
    }

    /**
     * 关闭实例公网入口
     *
     * 关闭实例公网入口，仅当实例为ELB类型时支持
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveIngressEipV2Request 请求对象
     * @return RemoveIngressEipV2Response
     */
    public RemoveIngressEipV2Response removeIngressEipV2(RemoveIngressEipV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.removeIngressEipV2);
    }

    /**
     * 关闭实例公网入口
     *
     * 关闭实例公网入口，仅当实例为ELB类型时支持
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveIngressEipV2Request 请求对象
     * @return SyncInvoker<RemoveIngressEipV2Request, RemoveIngressEipV2Response>
     */
    public SyncInvoker<RemoveIngressEipV2Request, RemoveIngressEipV2Response> removeIngressEipV2Invoker(
        RemoveIngressEipV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.removeIngressEipV2, hcClient);
    }

    /**
     * 重置密钥
     *
     * 重置指定APP的密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResettingAppSecretV2Request 请求对象
     * @return ResettingAppSecretV2Response
     */
    public ResettingAppSecretV2Response resettingAppSecretV2(ResettingAppSecretV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.resettingAppSecretV2);
    }

    /**
     * 重置密钥
     *
     * 重置指定APP的密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResettingAppSecretV2Request 请求对象
     * @return SyncInvoker<ResettingAppSecretV2Request, ResettingAppSecretV2Response>
     */
    public SyncInvoker<ResettingAppSecretV2Request, ResettingAppSecretV2Response> resettingAppSecretV2Invoker(
        ResettingAppSecretV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.resettingAppSecretV2, hcClient);
    }

    /**
     * 查询凭据关联的凭据配额
     *
     * 查看指定凭据关联的凭据配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppBoundAppQuotaRequest 请求对象
     * @return ShowAppBoundAppQuotaResponse
     */
    public ShowAppBoundAppQuotaResponse showAppBoundAppQuota(ShowAppBoundAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showAppBoundAppQuota);
    }

    /**
     * 查询凭据关联的凭据配额
     *
     * 查看指定凭据关联的凭据配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppBoundAppQuotaRequest 请求对象
     * @return SyncInvoker<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse>
     */
    public SyncInvoker<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse> showAppBoundAppQuotaInvoker(
        ShowAppBoundAppQuotaRequest request) {
        return new SyncInvoker<>(request, ApigMeta.showAppBoundAppQuota, hcClient);
    }

    /**
     * 获取凭据配额详情
     *
     * 获取凭据配额详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppQuotaRequest 请求对象
     * @return ShowAppQuotaResponse
     */
    public ShowAppQuotaResponse showAppQuota(ShowAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showAppQuota);
    }

    /**
     * 获取凭据配额详情
     *
     * 获取凭据配额详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppQuotaRequest 请求对象
     * @return SyncInvoker<ShowAppQuotaRequest, ShowAppQuotaResponse>
     */
    public SyncInvoker<ShowAppQuotaRequest, ShowAppQuotaResponse> showAppQuotaInvoker(ShowAppQuotaRequest request) {
        return new SyncInvoker<>(request, ApigMeta.showAppQuota, hcClient);
    }

    /**
     * 获取异步任务结果
     *
     * 获取异步任务结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAsyncTaskResultRequest 请求对象
     * @return ShowAsyncTaskResultResponse
     */
    public ShowAsyncTaskResultResponse showAsyncTaskResult(ShowAsyncTaskResultRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showAsyncTaskResult);
    }

    /**
     * 获取异步任务结果
     *
     * 获取异步任务结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAsyncTaskResultRequest 请求对象
     * @return SyncInvoker<ShowAsyncTaskResultRequest, ShowAsyncTaskResultResponse>
     */
    public SyncInvoker<ShowAsyncTaskResultRequest, ShowAsyncTaskResultResponse> showAsyncTaskResultInvoker(
        ShowAsyncTaskResultRequest request) {
        return new SyncInvoker<>(request, ApigMeta.showAsyncTaskResult, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfAppAcl);
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
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfAppAcl, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfAppCodeV2);
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
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfAppCodeV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfAppV2);
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
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfAppV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfCustomAuthorizersV2);
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
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfCustomAuthorizersV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfDomainNameCertificateV2);
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
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfDomainNameCertificateV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfEnvironmentVariableV2);
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
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfEnvironmentVariableV2, hcClient);
    }

    /**
     * 查看分组下指定错误类型的自定义响应
     *
     * 查看分组下指定错误类型的自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfGatewayResponseTypeV2Request 请求对象
     * @return ShowDetailsOfGatewayResponseTypeV2Response
     */
    public ShowDetailsOfGatewayResponseTypeV2Response showDetailsOfGatewayResponseTypeV2(
        ShowDetailsOfGatewayResponseTypeV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfGatewayResponseTypeV2);
    }

    /**
     * 查看分组下指定错误类型的自定义响应
     *
     * 查看分组下指定错误类型的自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfGatewayResponseTypeV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response>
     */
    public SyncInvoker<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response> showDetailsOfGatewayResponseTypeV2Invoker(
        ShowDetailsOfGatewayResponseTypeV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfGatewayResponseTypeV2, hcClient);
    }

    /**
     * 查询分组自定义响应详情
     *
     * 查询分组自定义响应详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfGatewayResponseV2Request 请求对象
     * @return ShowDetailsOfGatewayResponseV2Response
     */
    public ShowDetailsOfGatewayResponseV2Response showDetailsOfGatewayResponseV2(
        ShowDetailsOfGatewayResponseV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfGatewayResponseV2);
    }

    /**
     * 查询分组自定义响应详情
     *
     * 查询分组自定义响应详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfGatewayResponseV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response>
     */
    public SyncInvoker<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response> showDetailsOfGatewayResponseV2Invoker(
        ShowDetailsOfGatewayResponseV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfGatewayResponseV2, hcClient);
    }

    /**
     * 查看专享版实例创建进度
     *
     * 查看专享版实例创建进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfInstanceProgressV2Request 请求对象
     * @return ShowDetailsOfInstanceProgressV2Response
     */
    public ShowDetailsOfInstanceProgressV2Response showDetailsOfInstanceProgressV2(
        ShowDetailsOfInstanceProgressV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfInstanceProgressV2);
    }

    /**
     * 查看专享版实例创建进度
     *
     * 查看专享版实例创建进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfInstanceProgressV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response>
     */
    public SyncInvoker<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response> showDetailsOfInstanceProgressV2Invoker(
        ShowDetailsOfInstanceProgressV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfInstanceProgressV2, hcClient);
    }

    /**
     * 查看专享版实例详情
     *
     * 查看专享版实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfInstanceV2Request 请求对象
     * @return ShowDetailsOfInstanceV2Response
     */
    public ShowDetailsOfInstanceV2Response showDetailsOfInstanceV2(ShowDetailsOfInstanceV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfInstanceV2);
    }

    /**
     * 查看专享版实例详情
     *
     * 查看专享版实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfInstanceV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response>
     */
    public SyncInvoker<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> showDetailsOfInstanceV2Invoker(
        ShowDetailsOfInstanceV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfInstanceV2, hcClient);
    }

    /**
     * 查询编排规则详情
     *
     * 查询编排规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfOrchestrationRequest 请求对象
     * @return ShowDetailsOfOrchestrationResponse
     */
    public ShowDetailsOfOrchestrationResponse showDetailsOfOrchestration(ShowDetailsOfOrchestrationRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfOrchestration);
    }

    /**
     * 查询编排规则详情
     *
     * 查询编排规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfOrchestrationRequest 请求对象
     * @return SyncInvoker<ShowDetailsOfOrchestrationRequest, ShowDetailsOfOrchestrationResponse>
     */
    public SyncInvoker<ShowDetailsOfOrchestrationRequest, ShowDetailsOfOrchestrationResponse> showDetailsOfOrchestrationInvoker(
        ShowDetailsOfOrchestrationRequest request) {
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfOrchestration, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfRequestThrottlingPolicyV2);
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
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查询包含指定标签的实例数量
     *
     * 查询包含指定标签的实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstancesNumByTagsRequest 请求对象
     * @return ShowInstancesNumByTagsResponse
     */
    public ShowInstancesNumByTagsResponse showInstancesNumByTags(ShowInstancesNumByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showInstancesNumByTags);
    }

    /**
     * 查询包含指定标签的实例数量
     *
     * 查询包含指定标签的实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstancesNumByTagsRequest 请求对象
     * @return SyncInvoker<ShowInstancesNumByTagsRequest, ShowInstancesNumByTagsResponse>
     */
    public SyncInvoker<ShowInstancesNumByTagsRequest, ShowInstancesNumByTagsResponse> showInstancesNumByTagsInvoker(
        ShowInstancesNumByTagsRequest request) {
        return new SyncInvoker<>(request, ApigMeta.showInstancesNumByTags, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.showPlugin);
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
        return new SyncInvoker<>(request, ApigMeta.showPlugin, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.showRestrictionOfInstanceV2);
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
        return new SyncInvoker<>(request, ApigMeta.showRestrictionOfInstanceV2, hcClient);
    }

    /**
     * 设置APP的访问控制
     *
     * 设置凭据的访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppAclRequest 请求对象
     * @return UpdateAppAclResponse
     */
    public UpdateAppAclResponse updateAppAcl(UpdateAppAclRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateAppAcl);
    }

    /**
     * 设置APP的访问控制
     *
     * 设置凭据的访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppAclRequest 请求对象
     * @return SyncInvoker<UpdateAppAclRequest, UpdateAppAclResponse>
     */
    public SyncInvoker<UpdateAppAclRequest, UpdateAppAclResponse> updateAppAclInvoker(UpdateAppAclRequest request) {
        return new SyncInvoker<>(request, ApigMeta.updateAppAcl, hcClient);
    }

    /**
     * 修改凭据配额
     *
     * 修改凭据配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppQuotaRequest 请求对象
     * @return UpdateAppQuotaResponse
     */
    public UpdateAppQuotaResponse updateAppQuota(UpdateAppQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateAppQuota);
    }

    /**
     * 修改凭据配额
     *
     * 修改凭据配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppQuotaRequest 请求对象
     * @return SyncInvoker<UpdateAppQuotaRequest, UpdateAppQuotaResponse>
     */
    public SyncInvoker<UpdateAppQuotaRequest, UpdateAppQuotaResponse> updateAppQuotaInvoker(
        UpdateAppQuotaRequest request) {
        return new SyncInvoker<>(request, ApigMeta.updateAppQuota, hcClient);
    }

    /**
     * 修改APP
     *
     * 修改指定APP的信息。其中可修改的属性为：name、remark，当支持用户自定义key和secret的开关开启时，app_key和app_secret也支持修改，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppV2Request 请求对象
     * @return UpdateAppV2Response
     */
    public UpdateAppV2Response updateAppV2(UpdateAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateAppV2);
    }

    /**
     * 修改APP
     *
     * 修改指定APP的信息。其中可修改的属性为：name、remark，当支持用户自定义key和secret的开关开启时，app_key和app_secret也支持修改，其它属性不可修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppV2Request 请求对象
     * @return SyncInvoker<UpdateAppV2Request, UpdateAppV2Response>
     */
    public SyncInvoker<UpdateAppV2Request, UpdateAppV2Response> updateAppV2Invoker(UpdateAppV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.updateAppV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.updateCustomAuthorizerV2);
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
        return new SyncInvoker<>(request, ApigMeta.updateCustomAuthorizerV2, hcClient);
    }

    /**
     * 修改域名
     *
     * 修改绑定的域名所对应的配置信息。使用实例自定义入方向端口的特性时，注意开启/关闭客户端校验会对相同域名的不同端口同时生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainV2Request 请求对象
     * @return UpdateDomainV2Response
     */
    public UpdateDomainV2Response updateDomainV2(UpdateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateDomainV2);
    }

    /**
     * 修改域名
     *
     * 修改绑定的域名所对应的配置信息。使用实例自定义入方向端口的特性时，注意开启/关闭客户端校验会对相同域名的不同端口同时生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainV2Request 请求对象
     * @return SyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response>
     */
    public SyncInvoker<UpdateDomainV2Request, UpdateDomainV2Response> updateDomainV2Invoker(
        UpdateDomainV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.updateDomainV2, hcClient);
    }

    /**
     * 更新实例出公网带宽
     *
     * 更新实例出公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEngressEipV2Request 请求对象
     * @return UpdateEngressEipV2Response
     */
    public UpdateEngressEipV2Response updateEngressEipV2(UpdateEngressEipV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateEngressEipV2);
    }

    /**
     * 更新实例出公网带宽
     *
     * 更新实例出公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEngressEipV2Request 请求对象
     * @return SyncInvoker<UpdateEngressEipV2Request, UpdateEngressEipV2Response>
     */
    public SyncInvoker<UpdateEngressEipV2Request, UpdateEngressEipV2Response> updateEngressEipV2Invoker(
        UpdateEngressEipV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.updateEngressEipV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.updateEnvironmentV2);
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
        return new SyncInvoker<>(request, ApigMeta.updateEnvironmentV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.updateEnvironmentVariableV2);
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
        return new SyncInvoker<>(request, ApigMeta.updateEnvironmentVariableV2, hcClient);
    }

    /**
     * 修改分组下指定错误类型的自定义响应
     *
     * 修改分组下指定错误类型的自定义响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGatewayResponseTypeV2Request 请求对象
     * @return UpdateGatewayResponseTypeV2Response
     */
    public UpdateGatewayResponseTypeV2Response updateGatewayResponseTypeV2(UpdateGatewayResponseTypeV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateGatewayResponseTypeV2);
    }

    /**
     * 修改分组下指定错误类型的自定义响应
     *
     * 修改分组下指定错误类型的自定义响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGatewayResponseTypeV2Request 请求对象
     * @return SyncInvoker<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response>
     */
    public SyncInvoker<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response> updateGatewayResponseTypeV2Invoker(
        UpdateGatewayResponseTypeV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.updateGatewayResponseTypeV2, hcClient);
    }

    /**
     * 修改分组自定义响应
     *
     * 修改分组自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGatewayResponseV2Request 请求对象
     * @return UpdateGatewayResponseV2Response
     */
    public UpdateGatewayResponseV2Response updateGatewayResponseV2(UpdateGatewayResponseV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateGatewayResponseV2);
    }

    /**
     * 修改分组自定义响应
     *
     * 修改分组自定义响应
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGatewayResponseV2Request 请求对象
     * @return SyncInvoker<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response>
     */
    public SyncInvoker<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response> updateGatewayResponseV2Invoker(
        UpdateGatewayResponseV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.updateGatewayResponseV2, hcClient);
    }

    /**
     * 更新实例入公网带宽
     *
     * 更新实例入公网带宽，仅当实例为ELB类型时支持
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIngressEipV2Request 请求对象
     * @return UpdateIngressEipV2Response
     */
    public UpdateIngressEipV2Response updateIngressEipV2(UpdateIngressEipV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateIngressEipV2);
    }

    /**
     * 更新实例入公网带宽
     *
     * 更新实例入公网带宽，仅当实例为ELB类型时支持
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIngressEipV2Request 请求对象
     * @return SyncInvoker<UpdateIngressEipV2Request, UpdateIngressEipV2Response>
     */
    public SyncInvoker<UpdateIngressEipV2Request, UpdateIngressEipV2Response> updateIngressEipV2Invoker(
        UpdateIngressEipV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.updateIngressEipV2, hcClient);
    }

    /**
     * 更新专享版实例
     *
     * 更新专享版实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceV2Request 请求对象
     * @return UpdateInstanceV2Response
     */
    public UpdateInstanceV2Response updateInstanceV2(UpdateInstanceV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateInstanceV2);
    }

    /**
     * 更新专享版实例
     *
     * 更新专享版实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceV2Request 请求对象
     * @return SyncInvoker<UpdateInstanceV2Request, UpdateInstanceV2Response>
     */
    public SyncInvoker<UpdateInstanceV2Request, UpdateInstanceV2Response> updateInstanceV2Invoker(
        UpdateInstanceV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.updateInstanceV2, hcClient);
    }

    /**
     * 更新编排规则
     *
     * 更新编排规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOrchestrationRequest 请求对象
     * @return UpdateOrchestrationResponse
     */
    public UpdateOrchestrationResponse updateOrchestration(UpdateOrchestrationRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateOrchestration);
    }

    /**
     * 更新编排规则
     *
     * 更新编排规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOrchestrationRequest 请求对象
     * @return SyncInvoker<UpdateOrchestrationRequest, UpdateOrchestrationResponse>
     */
    public SyncInvoker<UpdateOrchestrationRequest, UpdateOrchestrationResponse> updateOrchestrationInvoker(
        UpdateOrchestrationRequest request) {
        return new SyncInvoker<>(request, ApigMeta.updateOrchestration, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.updatePlugin);
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
        return new SyncInvoker<>(request, ApigMeta.updatePlugin, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.updateRequestThrottlingPolicyV2);
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
        return new SyncInvoker<>(request, ApigMeta.updateRequestThrottlingPolicyV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.updateSignatureKeyV2);
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
        return new SyncInvoker<>(request, ApigMeta.updateSignatureKeyV2, hcClient);
    }

    /**
     * 设置调试域名是否可以访问
     *
     * 禁用或启用API分组绑定的调试域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSlDomainSettingV2Request 请求对象
     * @return UpdateSlDomainSettingV2Response
     */
    public UpdateSlDomainSettingV2Response updateSlDomainSettingV2(UpdateSlDomainSettingV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateSlDomainSettingV2);
    }

    /**
     * 设置调试域名是否可以访问
     *
     * 禁用或启用API分组绑定的调试域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSlDomainSettingV2Request 请求对象
     * @return SyncInvoker<UpdateSlDomainSettingV2Request, UpdateSlDomainSettingV2Response>
     */
    public SyncInvoker<UpdateSlDomainSettingV2Request, UpdateSlDomainSettingV2Response> updateSlDomainSettingV2Invoker(
        UpdateSlDomainSettingV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.updateSlDomainSettingV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.updateSpecialThrottlingConfigurationV2);
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
        return new SyncInvoker<>(request, ApigMeta.updateSpecialThrottlingConfigurationV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.batchDeleteAclV2);
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
        return new SyncInvoker<>(request, ApigMeta.batchDeleteAclV2, hcClient);
    }

    /**
     * 创建ACL策略
     *
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com”之类的网络域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAclStrategyV2Request 请求对象
     * @return CreateAclStrategyV2Response
     */
    public CreateAclStrategyV2Response createAclStrategyV2(CreateAclStrategyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createAclStrategyV2);
    }

    /**
     * 创建ACL策略
     *
     * 增加一个ACL策略，策略类型通过字段acl_type来确定（permit或者deny），限制的对象的类型可以为IP或者DOMAIN，这里的DOMAIN对应的acl_value的值为租户名称，而非“www.exampleDomain.com”之类的网络域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAclStrategyV2Request 请求对象
     * @return SyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response>
     */
    public SyncInvoker<CreateAclStrategyV2Request, CreateAclStrategyV2Response> createAclStrategyV2Invoker(
        CreateAclStrategyV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.createAclStrategyV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteAclV2);
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
        return new SyncInvoker<>(request, ApigMeta.deleteAclV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listAclStrategiesV2);
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
        return new SyncInvoker<>(request, ApigMeta.listAclStrategiesV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfAclPolicyV2);
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
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfAclPolicyV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.updateAclStrategyV2);
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
        return new SyncInvoker<>(request, ApigMeta.updateAclStrategyV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.associateRequestThrottlingPolicyV2);
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
        return new SyncInvoker<>(request, ApigMeta.associateRequestThrottlingPolicyV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.batchDisassociateThrottlingPolicyV2);
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
        return new SyncInvoker<>(request, ApigMeta.batchDisassociateThrottlingPolicyV2, hcClient);
    }

    /**
     * 批量发布或下线API
     *
     * 将多个API发布到一个指定的环境，或将多个API从指定的环境下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPublishOrOfflineApiV2Request 请求对象
     * @return BatchPublishOrOfflineApiV2Response
     */
    public BatchPublishOrOfflineApiV2Response batchPublishOrOfflineApiV2(BatchPublishOrOfflineApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.batchPublishOrOfflineApiV2);
    }

    /**
     * 批量发布或下线API
     *
     * 将多个API发布到一个指定的环境，或将多个API从指定的环境下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchPublishOrOfflineApiV2Request 请求对象
     * @return SyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response>
     */
    public SyncInvoker<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> batchPublishOrOfflineApiV2Invoker(
        BatchPublishOrOfflineApiV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.batchPublishOrOfflineApiV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.changeApiVersionV2);
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
        return new SyncInvoker<>(request, ApigMeta.changeApiVersionV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.checkApiGroupsV2);
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
        return new SyncInvoker<>(request, ApigMeta.checkApiGroupsV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.checkApisV2);
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
        return new SyncInvoker<>(request, ApigMeta.checkApisV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.createApiGroupV2);
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
        return new SyncInvoker<>(request, ApigMeta.createApiGroupV2, hcClient);
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
     * @return CreateApiV2Response
     */
    public CreateApiV2Response createApiV2(CreateApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createApiV2);
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
     * @return SyncInvoker<CreateApiV2Request, CreateApiV2Response>
     */
    public SyncInvoker<CreateApiV2Request, CreateApiV2Response> createApiV2Invoker(CreateApiV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.createApiV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.createOrDeletePublishRecordForApiV2);
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
        return new SyncInvoker<>(request, ApigMeta.createOrDeletePublishRecordForApiV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.debugApiV2);
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
        return new SyncInvoker<>(request, ApigMeta.debugApiV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteApiByVersionIdV2);
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
        return new SyncInvoker<>(request, ApigMeta.deleteApiByVersionIdV2, hcClient);
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
     * @return DeleteApiGroupV2Response
     */
    public DeleteApiGroupV2Response deleteApiGroupV2(DeleteApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteApiGroupV2);
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
     * @return SyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response>
     */
    public SyncInvoker<DeleteApiGroupV2Request, DeleteApiGroupV2Response> deleteApiGroupV2Invoker(
        DeleteApiGroupV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.deleteApiGroupV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteApiV2);
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
        return new SyncInvoker<>(request, ApigMeta.deleteApiV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateRequestThrottlingPolicyV2);
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
        return new SyncInvoker<>(request, ApigMeta.disassociateRequestThrottlingPolicyV2, hcClient);
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
     * @return ListApiGroupsV2Response
     */
    public ListApiGroupsV2Response listApiGroupsV2(ListApiGroupsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiGroupsV2);
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
     * @return SyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response>
     */
    public SyncInvoker<ListApiGroupsV2Request, ListApiGroupsV2Response> listApiGroupsV2Invoker(
        ListApiGroupsV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.listApiGroupsV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiRuntimeDefinitionV2);
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
        return new SyncInvoker<>(request, ApigMeta.listApiRuntimeDefinitionV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiVersionDetailV2);
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
        return new SyncInvoker<>(request, ApigMeta.listApiVersionDetailV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiVersionsV2);
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
        return new SyncInvoker<>(request, ApigMeta.listApiVersionsV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisBindedToRequestThrottlingPolicyV2);
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
        return new SyncInvoker<>(request, ApigMeta.listApisBindedToRequestThrottlingPolicyV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisUnbindedToRequestThrottlingPolicyV2);
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
        return new SyncInvoker<>(request, ApigMeta.listApisUnbindedToRequestThrottlingPolicyV2, hcClient);
    }

    /**
     * 查询API列表
     *
     * 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息和API请求参数信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisV2Request 请求对象
     * @return ListApisV2Response
     */
    public ListApisV2Response listApisV2(ListApisV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisV2);
    }

    /**
     * 查询API列表
     *
     * 查看API列表，返回API详细信息、发布信息等，但不能查看到后端服务信息和API请求参数信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisV2Request 请求对象
     * @return SyncInvoker<ListApisV2Request, ListApisV2Response>
     */
    public SyncInvoker<ListApisV2Request, ListApisV2Response> listApisV2Invoker(ListApisV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.listApisV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listRequestThrottlingPoliciesBindedToApiV2);
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
        return new SyncInvoker<>(request, ApigMeta.listRequestThrottlingPoliciesBindedToApiV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfApiGroupV2);
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
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfApiGroupV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfApiV2);
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
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfApiV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.updateApiGroupV2);
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
        return new SyncInvoker<>(request, ApigMeta.updateApiGroupV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.updateApiV2);
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
        return new SyncInvoker<>(request, ApigMeta.updateApiV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.batchDeleteApiAclBindingV2);
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
        return new SyncInvoker<>(request, ApigMeta.batchDeleteApiAclBindingV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.createApiAclBindingV2);
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
        return new SyncInvoker<>(request, ApigMeta.createApiAclBindingV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteApiAclBindingV2);
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
        return new SyncInvoker<>(request, ApigMeta.deleteApiAclBindingV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listAclPolicyBindedToApiV2);
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
        return new SyncInvoker<>(request, ApigMeta.listAclPolicyBindedToApiV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisBindedToAclPolicyV2);
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
        return new SyncInvoker<>(request, ApigMeta.listApisBindedToAclPolicyV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisUnbindedToAclPolicyV2);
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
        return new SyncInvoker<>(request, ApigMeta.listApisUnbindedToAclPolicyV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.cancelingAuthorizationV2);
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
        return new SyncInvoker<>(request, ApigMeta.cancelingAuthorizationV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.createAuthorizingAppsV2);
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
        return new SyncInvoker<>(request, ApigMeta.createAuthorizingAppsV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisBindedToAppV2);
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
        return new SyncInvoker<>(request, ApigMeta.listApisBindedToAppV2, hcClient);
    }

    /**
     * 查看APP未绑定的API列表
     *
     * 查询指定环境上某个APP未绑定的API列表[，包括自有API和从云商店购买的API](tag:hws)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisUnbindedToAppV2Request 请求对象
     * @return ListApisUnbindedToAppV2Response
     */
    public ListApisUnbindedToAppV2Response listApisUnbindedToAppV2(ListApisUnbindedToAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisUnbindedToAppV2);
    }

    /**
     * 查看APP未绑定的API列表
     *
     * 查询指定环境上某个APP未绑定的API列表[，包括自有API和从云商店购买的API](tag:hws)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApisUnbindedToAppV2Request 请求对象
     * @return SyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response>
     */
    public SyncInvoker<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2Invoker(
        ListApisUnbindedToAppV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.listApisUnbindedToAppV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppsBindedToApiV2);
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
        return new SyncInvoker<>(request, ApigMeta.listAppsBindedToApiV2, hcClient);
    }

    /**
     * 导出API
     *
     * 导出分组下API的定义信息。导出文件内容符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportApiDefinitionsV2Request 请求对象
     * @return ExportApiDefinitionsV2Response
     */
    public ExportApiDefinitionsV2Response exportApiDefinitionsV2(ExportApiDefinitionsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.exportApiDefinitionsV2);
    }

    /**
     * 导出API
     *
     * 导出分组下API的定义信息。导出文件内容符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportApiDefinitionsV2Request 请求对象
     * @return SyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response>
     */
    public SyncInvoker<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> exportApiDefinitionsV2Invoker(
        ExportApiDefinitionsV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.exportApiDefinitionsV2, hcClient);
    }

    /**
     * 导入API
     *
     * 导入API。导入文件内容需要符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportApiDefinitionsV2Request 请求对象
     * @return ImportApiDefinitionsV2Response
     */
    public ImportApiDefinitionsV2Response importApiDefinitionsV2(ImportApiDefinitionsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.importApiDefinitionsV2);
    }

    /**
     * 导入API
     *
     * 导入API。导入文件内容需要符合swagger标准规范，API网关自定义扩展字段请参考《API网关用户指南》的“导入导出API：扩展定义”章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportApiDefinitionsV2Request 请求对象
     * @return SyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response>
     */
    public SyncInvoker<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> importApiDefinitionsV2Invoker(
        ImportApiDefinitionsV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.importApiDefinitionsV2, hcClient);
    }

    /**
     * 域名绑定SSL证书
     *
     * 域名绑定SSL证书。目前暂时仅支持单个绑定，请求体当中的certificate_ids里面有且只能有一个证书ID。使用实例自定义入方向端口的特性时，相同的域名会同时绑定证书，注意开启/关闭客户端校验会对相同域名的不同端口同时生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateCertsV2Request 请求对象
     * @return BatchAssociateCertsV2Response
     */
    public BatchAssociateCertsV2Response batchAssociateCertsV2(BatchAssociateCertsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.batchAssociateCertsV2);
    }

    /**
     * 域名绑定SSL证书
     *
     * 域名绑定SSL证书。目前暂时仅支持单个绑定，请求体当中的certificate_ids里面有且只能有一个证书ID。使用实例自定义入方向端口的特性时，相同的域名会同时绑定证书，注意开启/关闭客户端校验会对相同域名的不同端口同时生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateCertsV2Request 请求对象
     * @return SyncInvoker<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response>
     */
    public SyncInvoker<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response> batchAssociateCertsV2Invoker(
        BatchAssociateCertsV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.batchAssociateCertsV2, hcClient);
    }

    /**
     * SSL证书绑定域名
     *
     * SSL证书绑定域名。使用实例自定义入方向端口的特性时，相同的域名会同时绑定证书，注意开启/关闭客户端校验会对相同域名的不同端口同时生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateDomainsV2Request 请求对象
     * @return BatchAssociateDomainsV2Response
     */
    public BatchAssociateDomainsV2Response batchAssociateDomainsV2(BatchAssociateDomainsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.batchAssociateDomainsV2);
    }

    /**
     * SSL证书绑定域名
     *
     * SSL证书绑定域名。使用实例自定义入方向端口的特性时，相同的域名会同时绑定证书，注意开启/关闭客户端校验会对相同域名的不同端口同时生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateDomainsV2Request 请求对象
     * @return SyncInvoker<BatchAssociateDomainsV2Request, BatchAssociateDomainsV2Response>
     */
    public SyncInvoker<BatchAssociateDomainsV2Request, BatchAssociateDomainsV2Response> batchAssociateDomainsV2Invoker(
        BatchAssociateDomainsV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.batchAssociateDomainsV2, hcClient);
    }

    /**
     * 域名解绑SSL证书
     *
     * 域名解绑SSL证书。目前暂时仅支持单个解绑，请求体当中的certificate_ids里面有且只能有一个证书ID。在使用自定义入方向端口的特性时，相同的域名会同时解绑证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateCertsV2Request 请求对象
     * @return BatchDisassociateCertsV2Response
     */
    public BatchDisassociateCertsV2Response batchDisassociateCertsV2(BatchDisassociateCertsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.batchDisassociateCertsV2);
    }

    /**
     * 域名解绑SSL证书
     *
     * 域名解绑SSL证书。目前暂时仅支持单个解绑，请求体当中的certificate_ids里面有且只能有一个证书ID。在使用自定义入方向端口的特性时，相同的域名会同时解绑证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateCertsV2Request 请求对象
     * @return SyncInvoker<BatchDisassociateCertsV2Request, BatchDisassociateCertsV2Response>
     */
    public SyncInvoker<BatchDisassociateCertsV2Request, BatchDisassociateCertsV2Response> batchDisassociateCertsV2Invoker(
        BatchDisassociateCertsV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.batchDisassociateCertsV2, hcClient);
    }

    /**
     * SSL证书解绑域名
     *
     * SSL证书解绑域名。在使用自定义入方向端口的特性时，相同的域名会同时解绑证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateDomainsV2Request 请求对象
     * @return BatchDisassociateDomainsV2Response
     */
    public BatchDisassociateDomainsV2Response batchDisassociateDomainsV2(BatchDisassociateDomainsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.batchDisassociateDomainsV2);
    }

    /**
     * SSL证书解绑域名
     *
     * SSL证书解绑域名。在使用自定义入方向端口的特性时，相同的域名会同时解绑证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateDomainsV2Request 请求对象
     * @return SyncInvoker<BatchDisassociateDomainsV2Request, BatchDisassociateDomainsV2Response>
     */
    public SyncInvoker<BatchDisassociateDomainsV2Request, BatchDisassociateDomainsV2Response> batchDisassociateDomainsV2Invoker(
        BatchDisassociateDomainsV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.batchDisassociateDomainsV2, hcClient);
    }

    /**
     * 创建SSL证书
     *
     * 创建SSL证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateV2Request 请求对象
     * @return CreateCertificateV2Response
     */
    public CreateCertificateV2Response createCertificateV2(CreateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createCertificateV2);
    }

    /**
     * 创建SSL证书
     *
     * 创建SSL证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateV2Request 请求对象
     * @return SyncInvoker<CreateCertificateV2Request, CreateCertificateV2Response>
     */
    public SyncInvoker<CreateCertificateV2Request, CreateCertificateV2Response> createCertificateV2Invoker(
        CreateCertificateV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.createCertificateV2, hcClient);
    }

    /**
     * 删除SSL证书
     *
     * 删除ssl证书接口，删除时只有没有关联域名的证书才能被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateV2Request 请求对象
     * @return DeleteCertificateV2Response
     */
    public DeleteCertificateV2Response deleteCertificateV2(DeleteCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteCertificateV2);
    }

    /**
     * 删除SSL证书
     *
     * 删除ssl证书接口，删除时只有没有关联域名的证书才能被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateV2Request 请求对象
     * @return SyncInvoker<DeleteCertificateV2Request, DeleteCertificateV2Response>
     */
    public SyncInvoker<DeleteCertificateV2Request, DeleteCertificateV2Response> deleteCertificateV2Invoker(
        DeleteCertificateV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.deleteCertificateV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listAttachedDomainsV2);
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
        return new SyncInvoker<>(request, ApigMeta.listAttachedDomainsV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listCertificatesV2);
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
        return new SyncInvoker<>(request, ApigMeta.listCertificatesV2, hcClient);
    }

    /**
     * 查看证书详情
     *
     * 查看证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfCertificateV2Request 请求对象
     * @return ShowDetailsOfCertificateV2Response
     */
    public ShowDetailsOfCertificateV2Response showDetailsOfCertificateV2(ShowDetailsOfCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfCertificateV2);
    }

    /**
     * 查看证书详情
     *
     * 查看证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailsOfCertificateV2Request 请求对象
     * @return SyncInvoker<ShowDetailsOfCertificateV2Request, ShowDetailsOfCertificateV2Response>
     */
    public SyncInvoker<ShowDetailsOfCertificateV2Request, ShowDetailsOfCertificateV2Response> showDetailsOfCertificateV2Invoker(
        ShowDetailsOfCertificateV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfCertificateV2, hcClient);
    }

    /**
     * 修改SSL证书
     *
     * 修改SSL证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateV2Request 请求对象
     * @return UpdateCertificateV2Response
     */
    public UpdateCertificateV2Response updateCertificateV2(UpdateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateCertificateV2);
    }

    /**
     * 修改SSL证书
     *
     * 修改SSL证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateV2Request 请求对象
     * @return SyncInvoker<UpdateCertificateV2Request, UpdateCertificateV2Response>
     */
    public SyncInvoker<UpdateCertificateV2Request, UpdateCertificateV2Response> updateCertificateV2Invoker(
        UpdateCertificateV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.updateCertificateV2, hcClient);
    }

    /**
     * 添加或更新后端实例
     *
     * 为指定的VPC通道添加后端实例
     * 
     * 如果指定地址的后端实例已存在，则更新对应后端实例信息。如果请求体中包含多个重复地址的后端实例定义，则使用第一个定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddingBackendInstancesV2Request 请求对象
     * @return AddingBackendInstancesV2Response
     */
    public AddingBackendInstancesV2Response addingBackendInstancesV2(AddingBackendInstancesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.addingBackendInstancesV2);
    }

    /**
     * 添加或更新后端实例
     *
     * 为指定的VPC通道添加后端实例
     * 
     * 如果指定地址的后端实例已存在，则更新对应后端实例信息。如果请求体中包含多个重复地址的后端实例定义，则使用第一个定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddingBackendInstancesV2Request 请求对象
     * @return SyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response>
     */
    public SyncInvoker<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> addingBackendInstancesV2Invoker(
        AddingBackendInstancesV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.addingBackendInstancesV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.batchDisableMembers);
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
        return new SyncInvoker<>(request, ApigMeta.batchDisableMembers, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.batchEnableMembers);
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
        return new SyncInvoker<>(request, ApigMeta.batchEnableMembers, hcClient);
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
     * @return CreateMemberGroupResponse
     */
    public CreateMemberGroupResponse createMemberGroup(CreateMemberGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createMemberGroup);
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
     * @return SyncInvoker<CreateMemberGroupRequest, CreateMemberGroupResponse>
     */
    public SyncInvoker<CreateMemberGroupRequest, CreateMemberGroupResponse> createMemberGroupInvoker(
        CreateMemberGroupRequest request) {
        return new SyncInvoker<>(request, ApigMeta.createMemberGroup, hcClient);
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
     * @return CreateVpcChannelV2Response
     */
    public CreateVpcChannelV2Response createVpcChannelV2(CreateVpcChannelV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createVpcChannelV2);
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
     * @return SyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response>
     */
    public SyncInvoker<CreateVpcChannelV2Request, CreateVpcChannelV2Response> createVpcChannelV2Invoker(
        CreateVpcChannelV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.createVpcChannelV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteBackendInstanceV2);
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
        return new SyncInvoker<>(request, ApigMeta.deleteBackendInstanceV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteMemberGroup);
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
        return new SyncInvoker<>(request, ApigMeta.deleteMemberGroup, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteVpcChannelV2);
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
        return new SyncInvoker<>(request, ApigMeta.deleteVpcChannelV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listBackendInstancesV2);
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
        return new SyncInvoker<>(request, ApigMeta.listBackendInstancesV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listMemberGroups);
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
        return new SyncInvoker<>(request, ApigMeta.listMemberGroups, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.listVpcChannelsV2);
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
        return new SyncInvoker<>(request, ApigMeta.listVpcChannelsV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfMemberGroup);
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
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfMemberGroup, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfVpcChannelV2);
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
        return new SyncInvoker<>(request, ApigMeta.showDetailsOfVpcChannelV2, hcClient);
    }

    /**
     * 更新后端实例
     *
     * 更新指定的VPC通道的后端实例。更新时，使用传入的请求参数对对应云服务组的后端实例进行全量覆盖修改。如果未指定修改的云服务器组，则进行全量覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackendInstancesV2Request 请求对象
     * @return UpdateBackendInstancesV2Response
     */
    public UpdateBackendInstancesV2Response updateBackendInstancesV2(UpdateBackendInstancesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateBackendInstancesV2);
    }

    /**
     * 更新后端实例
     *
     * 更新指定的VPC通道的后端实例。更新时，使用传入的请求参数对对应云服务组的后端实例进行全量覆盖修改。如果未指定修改的云服务器组，则进行全量覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackendInstancesV2Request 请求对象
     * @return SyncInvoker<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response>
     */
    public SyncInvoker<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response> updateBackendInstancesV2Invoker(
        UpdateBackendInstancesV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.updateBackendInstancesV2, hcClient);
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
        return hcClient.syncInvokeHttp(request, ApigMeta.updateHealthCheck);
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
        return new SyncInvoker<>(request, ApigMeta.updateHealthCheck, hcClient);
    }

    /**
     * 更新VPC通道后端服务器组
     *
     * 更新指定VPC通道后端服务器组。当负载通道为nacos微服务类型时，不支持修改服务器组权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberGroupRequest 请求对象
     * @return UpdateMemberGroupResponse
     */
    public UpdateMemberGroupResponse updateMemberGroup(UpdateMemberGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateMemberGroup);
    }

    /**
     * 更新VPC通道后端服务器组
     *
     * 更新指定VPC通道后端服务器组。当负载通道为nacos微服务类型时，不支持修改服务器组权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberGroupRequest 请求对象
     * @return SyncInvoker<UpdateMemberGroupRequest, UpdateMemberGroupResponse>
     */
    public SyncInvoker<UpdateMemberGroupRequest, UpdateMemberGroupResponse> updateMemberGroupInvoker(
        UpdateMemberGroupRequest request) {
        return new SyncInvoker<>(request, ApigMeta.updateMemberGroup, hcClient);
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
     * @return UpdateVpcChannelV2Response
     */
    public UpdateVpcChannelV2Response updateVpcChannelV2(UpdateVpcChannelV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateVpcChannelV2);
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
     * @return SyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response>
     */
    public SyncInvoker<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> updateVpcChannelV2Invoker(
        UpdateVpcChannelV2Request request) {
        return new SyncInvoker<>(request, ApigMeta.updateVpcChannelV2, hcClient);
    }

}
